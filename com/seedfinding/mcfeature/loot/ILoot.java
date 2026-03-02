/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.Feature;
import com.seedfinding.mcfeature.GenerationContext;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcfeature.structure.generator.Generators;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public interface ILoot {
    default public List<ChestContent> getLoot(long structureSeed, Generator generator, boolean indexed) {
        return this.getLoot(structureSeed, generator, new ChunkRand(), indexed);
    }

    default public List<ChestContent> getLoot(long structureSeed, Generator generator, ChunkRand rand, boolean indexed) {
        rand = rand.asChunkRandDebugger();
        if (!this.isCorrectGenerator(generator)) {
            return null;
        }
        List<Pair<Generator.ILootType, BPos>> lootPositions = generator.getLootPos();
        HashMap<CPos, LinkedList> posLinkedListHashMap = new HashMap<CPos, LinkedList>();
        for (Pair<Generator.ILootType, BPos> lootPos : lootPositions) {
            if (lootPos.getFirst().getLootTable(this.getVersion()) == null) continue;
            BPos pos = (BPos)lootPos.getSecond();
            CPos cPos = pos.toChunkPos();
            posLinkedListHashMap.computeIfAbsent(cPos, k -> new LinkedList()).add(lootPos);
        }
        HashMap<Generator.ILootType, List> chestDataHashMap = new HashMap<Generator.ILootType, List>();
        for (CPos cPos : posLinkedListHashMap.keySet()) {
            LinkedList lootTypes = (LinkedList)posLinkedListHashMap.get(cPos);
            Generator.ILootType lastLoot = null;
            LinkedList loots = new LinkedList();
            for (Pair lootType : lootTypes) {
                if (lastLoot == null || !((Generator.ILootType)lootType.getFirst()).belongSameStructure(lastLoot)) {
                    lastLoot = (Generator.ILootType)lootType.getFirst();
                    loots.addLast(new LinkedList());
                }
                ((LinkedList)loots.getLast()).addLast(lootType);
            }
            int currentIndex = 0;
            int currentNumberInChunks = 0;
            for (LinkedList linkedList : loots) {
                currentNumberInChunks += linkedList.size();
                for (Pair chest : linkedList) {
                    ChestData chestData = new ChestData(currentIndex, cPos, (BPos)chest.getSecond(), currentNumberInChunks);
                    chestDataHashMap.computeIfAbsent((Generator.ILootType)chest.getFirst(), k -> new LinkedList()).add(chestData);
                    ++currentIndex;
                }
            }
        }
        ArrayList<ChestContent> result = new ArrayList<ChestContent>();
        for (Generator.ILootType lootType : chestDataHashMap.keySet()) {
            List chests = (List)chestDataHashMap.get(lootType);
            for (ChestData chestData : chests) {
                long l;
                CPos chunkChestPos = chestData.getChunkPos();
                rand.setDecoratorSeed(structureSeed, chunkChestPos.getX() * 16, chunkChestPos.getZ() * 16, this.getDecorationSalt(), this.getVersion());
                SpecificCalls calls = this.getSpecificCalls();
                if (calls != null) {
                    calls.run(generator, rand);
                }
                if (this.shouldAdvanceInChunks()) {
                    l = 2L;
                    rand.advance((long)chestData.getNumberInChunk() * l);
                }
                rand.advance((long)chestData.getIndex() * 2L);
                l = rand.nextLong();
                LootContext context = new LootContext(l, this.getVersion());
                LootTable lootTable = lootType.getLootTable(this.getVersion());
                List<ItemStack> loot = indexed ? lootTable.generateIndexed(context) : lootTable.generate(context);
                result.add(new ChestContent(lootType, loot, chestData.getPos(), indexed));
            }
        }
        return result;
    }

    default public List<ChestContent> getLootAtPos(long worldSeed, CPos pos, ChunkRand rand, boolean indexed) {
        if (!(this instanceof Feature)) {
            return null;
        }
        Feature feature = (Feature)((Object)this);
        Generator.GeneratorFactory<?> factory = Generators.get(feature.getClass());
        if (factory == null) {
            return null;
        }
        Object generator = factory.create(this.getVersion());
        if (generator == null) {
            return null;
        }
        GenerationContext.Context context = feature.getContext(worldSeed);
        if (context == null) {
            return null;
        }
        if (!((Generator)generator).generate(context.getGenerator(), pos)) {
            return null;
        }
        return this.getLoot(worldSeed, (Generator)generator, rand, indexed);
    }

    @Deprecated
    default public HashMap<Generator.ILootType, List<List<ItemStack>>> getLootEx(long structureSeed, Generator generator, ChunkRand rand, boolean indexed) {
        HashMap<Generator.ILootType, List<List<ItemStack>>> res = new HashMap<Generator.ILootType, List<List<ItemStack>>>();
        for (ChestContent chestContent : this.getLoot(structureSeed, generator, rand, indexed)) {
            res.computeIfAbsent(chestContent.getLootType(), e -> new ArrayList()).add(chestContent.getItems());
        }
        return res;
    }

    default public boolean shouldAdvanceInChunks() {
        return true;
    }

    public int getDecorationSalt();

    public boolean isCorrectGenerator(Generator var1);

    public MCVersion getVersion();

    public SpecificCalls getSpecificCalls();

    public static class ChestData {
        private final int index;
        private final CPos chunkPos;
        private final BPos pos;
        private final int numberInChunk;

        public ChestData(int index, CPos chunkPos, BPos pos, int numberInChunk) {
            this.index = index;
            this.chunkPos = chunkPos;
            this.pos = pos;
            this.numberInChunk = numberInChunk;
        }

        public BPos getPos() {
            return this.pos;
        }

        public CPos getChunkPos() {
            return this.chunkPos;
        }

        public int getIndex() {
            return this.index;
        }

        public int getNumberInChunk() {
            return this.numberInChunk;
        }

        public String toString() {
            return "ChestData{index=" + this.index + ", cPos=" + this.chunkPos + ", bpos=" + this.pos + ", numberInChunk=" + this.numberInChunk + '}';
        }
    }

    @FunctionalInterface
    public static interface SpecificCalls {
        public void run(Generator var1, ChunkRand var2);
    }
}

