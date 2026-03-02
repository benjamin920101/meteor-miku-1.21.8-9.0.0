/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator.structure;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.MCLootTables;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DesertPyramidGenerator
extends Generator {
    private BlockBox piece;
    private CPos temp;

    public DesertPyramidGenerator(MCVersion version) {
        super(version);
    }

    @Override
    public boolean generate(TerrainGenerator generator, int chunkX, int chunkZ, ChunkRand rand) {
        this.temp = new CPos(chunkX, chunkZ);
        this.piece = new BlockBox(this.temp, this.temp.add(1, 1));
        return true;
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getLootPos() {
        return this.getChestsPos();
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getChestsPos() {
        ArrayList<Pair<Generator.ILootType, BPos>> res = new ArrayList<Pair<Generator.ILootType, BPos>>();
        if (this.temp == null) {
            return res;
        }
        res.add(new Pair<LootType, BPos>(LootType.CHEST_1, this.temp.toBlockPos()));
        res.add(new Pair<LootType, BPos>(LootType.CHEST_2, this.temp.toBlockPos()));
        res.add(new Pair<LootType, BPos>(LootType.CHEST_3, this.temp.toBlockPos()));
        res.add(new Pair<LootType, BPos>(LootType.CHEST_4, this.temp.toBlockPos()));
        return res;
    }

    @Override
    public Generator.ILootType[] getLootTypes() {
        return LootType.values();
    }

    public static enum LootType implements Generator.ILootType
    {
        CHEST_1(MCLootTables.DESERT_PYRAMID_CHEST, ChestContent.ChestType.SINGLE_CHEST),
        CHEST_2(MCLootTables.DESERT_PYRAMID_CHEST, ChestContent.ChestType.SINGLE_CHEST),
        CHEST_3(MCLootTables.DESERT_PYRAMID_CHEST, ChestContent.ChestType.SINGLE_CHEST),
        CHEST_4(MCLootTables.DESERT_PYRAMID_CHEST, ChestContent.ChestType.SINGLE_CHEST);

        public final Supplier<LootTable> lootTable;
        public final ChestContent.ChestType chestType;

        private LootType(Supplier<LootTable> lootTable, ChestContent.ChestType chestType) {
            this.lootTable = lootTable;
            this.chestType = chestType;
        }

        @Override
        public LootTable getLootTableUncached(MCVersion version) {
            return this.lootTable.get().apply(version);
        }

        @Override
        public ChestContent.ChestType getChestType() {
            return this.chestType;
        }

        @Override
        public boolean belongSameStructure(Generator.ILootType other) {
            return true;
        }
    }
}

