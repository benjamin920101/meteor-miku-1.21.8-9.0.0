/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator;

import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.entry.ItemEntry;
import com.seedfinding.mcfeature.loot.item.Item;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Generator {
    protected final MCVersion version;
    public static final ConcurrentHashMap<String, LootTable> LOOT_TABLE_CACHE = new ConcurrentHashMap();

    public Generator(MCVersion version) {
        this.version = version;
    }

    public MCVersion getVersion() {
        return this.version;
    }

    public boolean generate(long worldSeed, Dimension dimension, int chunkX, int chunkZ) {
        BiomeSource biomeSource = BiomeSource.of(dimension, this.getVersion(), worldSeed);
        TerrainGenerator generator = TerrainGenerator.of(dimension, biomeSource);
        return this.generate(generator, chunkX, chunkZ);
    }

    public boolean generate(TerrainGenerator generator, CPos cPos) {
        return this.generate(generator, cPos, new ChunkRand());
    }

    public boolean generate(TerrainGenerator generator, int chunkX, int chunkZ) {
        return this.generate(generator, chunkX, chunkZ, new ChunkRand());
    }

    public boolean generate(TerrainGenerator generator, CPos cPos, ChunkRand rand) {
        return this.generate(generator, cPos.getX(), cPos.getZ(), rand);
    }

    public abstract boolean generate(TerrainGenerator var1, int var2, int var3, ChunkRand var4);

    public abstract List<Pair<ILootType, BPos>> getChestsPos();

    public abstract List<Pair<ILootType, BPos>> getLootPos();

    public List<Pair<ILootType, CPos>> getChestsChunkPos() {
        return this.getChestsPos().stream().map(e -> new Pair<ILootType, CPos>((ILootType)e.getFirst(), ((BPos)e.getSecond()).toChunkPos())).collect(Collectors.toList());
    }

    public abstract ILootType[] getLootTypes();

    public Set<Item> getPossibleLootItems() {
        ILootType[] lootTypes;
        HashSet<Item> items = new HashSet<Item>();
        for (ILootType lootType : lootTypes = this.getLootTypes()) {
            LootTable lootTable = lootType.getLootTable(this.getVersion());
            if (lootTable == null) continue;
            items.addAll(Arrays.stream(lootTable.lootPools).map(e -> e.lootEntries).flatMap(Stream::of).filter(e -> e instanceof ItemEntry).map(e -> ((ItemEntry)e).item).collect(Collectors.toList()));
        }
        return items;
    }

    public static interface ILootType {
        default public LootTable getLootTable(MCVersion version) {
            String className = this.getClass().getCanonicalName();
            String enumName = ((Enum)((Object)this)).name();
            return LOOT_TABLE_CACHE.computeIfAbsent(className + enumName + version.name(), ignored -> this.getLootTableUncached(version));
        }

        public LootTable getLootTableUncached(MCVersion var1);

        public ChestContent.ChestType getChestType();

        default public boolean belongSameStructure(ILootType other) {
            return this == other;
        }
    }

    @FunctionalInterface
    public static interface GeneratorFactory<T extends Generator> {
        public T create(MCVersion var1);
    }
}

