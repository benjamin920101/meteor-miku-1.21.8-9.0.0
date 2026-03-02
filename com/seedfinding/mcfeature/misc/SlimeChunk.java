/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.misc;

import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.VersionMap;
import com.seedfinding.mcfeature.Feature;
import com.seedfinding.mcterrain.TerrainGenerator;

public class SlimeChunk
extends Feature<Config, Data> {
    public static final VersionMap<Config> CONFIGS = new VersionMap<Config>().add(MCVersion.v1_8, new Config(10));

    public SlimeChunk(MCVersion version) {
        this(CONFIGS.getAsOf(version), version);
    }

    public SlimeChunk(Config config, MCVersion version) {
        super(config, version);
    }

    @Override
    public String getName() {
        return SlimeChunk.name();
    }

    public static String name() {
        return "slime_chunk";
    }

    public int getRarity() {
        return ((Config)this.getConfig()).rarity;
    }

    @Override
    public boolean canStart(Data data, long structureSeed, ChunkRand rand) {
        rand.setSlimeSeed(structureSeed, data.chunkX, data.chunkZ, this.getVersion());
        return rand.nextInt(this.getRarity()) == 0 == data.isSlime;
    }

    @Override
    public boolean canSpawn(Data data, BiomeSource source) {
        return true;
    }

    @Override
    public boolean canGenerate(Data data, TerrainGenerator generator) {
        return true;
    }

    @Override
    public Dimension getValidDimension() {
        return Dimension.OVERWORLD;
    }

    public Data at(int chunkX, int chunkZ, boolean isSlime) {
        return new Data(this, chunkX, chunkZ, isSlime);
    }

    public static class Config
    extends Feature.Config {
        public final int rarity;

        public Config(int rarity) {
            this.rarity = rarity;
        }
    }

    public static class Data
    extends Feature.Data<SlimeChunk> {
        public final boolean isSlime;

        public Data(SlimeChunk feature, int chunkX, int chunkZ, boolean isSlime) {
            super(feature, chunkX, chunkZ);
            this.isSlime = isSlime;
        }
    }
}

