/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.VersionMap;
import com.seedfinding.mcfeature.structure.OldStructure;
import com.seedfinding.mcfeature.structure.RegionStructure;

public class Igloo
extends OldStructure<Igloo> {
    public static final VersionMap<OldStructure.Config> CONFIGS = new VersionMap<OldStructure.Config>().add(MCVersion.v1_9, new OldStructure.Config(14357617)).add(MCVersion.v1_13, new OldStructure.Config(14357618));

    public Igloo(MCVersion version) {
        this(CONFIGS.getAsOf(version), version);
    }

    public Igloo(RegionStructure.Config config, MCVersion version) {
        super(config, version);
    }

    public static String name() {
        return "igloo";
    }

    public boolean hasBasement(long structureSeed, CPos cPos, ChunkRand rand) {
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_9) && this.getVersion().isOlderThan(MCVersion.v1_14)) {
            rand.setPopulationSeed(structureSeed, cPos.getX(), cPos.getZ(), this.getVersion());
            BlockRotation rotation = BlockRotation.getRandom(rand);
            return rand.nextDouble() < 0.5;
        }
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_14)) {
            rand.setCarverSeed(structureSeed, cPos.getX(), cPos.getZ(), this.getVersion());
            BlockRotation rotation = BlockRotation.getRandom(rand);
            return rand.nextDouble() < 0.5;
        }
        return false;
    }

    @Override
    public Dimension getValidDimension() {
        return Dimension.OVERWORLD;
    }

    @Override
    public boolean isValidBiome(Biome biome) {
        return biome == Biomes.SNOWY_TAIGA || biome == Biomes.SNOWY_TUNDRA;
    }
}

