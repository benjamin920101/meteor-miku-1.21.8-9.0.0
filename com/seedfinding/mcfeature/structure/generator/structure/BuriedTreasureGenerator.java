/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator.structure;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.MCLootTables;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class BuriedTreasureGenerator
extends Generator {
    private CPos cPos;

    public BuriedTreasureGenerator(MCVersion version) {
        super(version);
    }

    @Override
    public boolean generate(TerrainGenerator generator, int chunkX, int chunkZ, ChunkRand rand) {
        this.cPos = new CPos(chunkX, chunkZ);
        return true;
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getLootPos() {
        return this.getChestsPos();
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getChestsPos() {
        return Collections.singletonList(new Pair<LootType, BPos>(LootType.BURIED_CHEST, this.cPos.toBlockPos().add(9, 90, 9)));
    }

    @Override
    public Generator.ILootType[] getLootTypes() {
        return LootType.values();
    }

    public static enum LootType implements Generator.ILootType
    {
        BURIED_CHEST(MCLootTables.BURIED_TREASURE_CHEST, ChestContent.ChestType.SINGLE_CHEST);

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
    }
}

