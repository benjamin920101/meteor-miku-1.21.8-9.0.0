/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature;

import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.GenerationContext;
import com.seedfinding.mcterrain.TerrainGenerator;

public abstract class Feature<C extends Config, D extends Data<?>>
implements GenerationContext {
    private GenerationContext.Context context = null;
    private final C config;
    private final MCVersion version;

    public Feature(C config, MCVersion version) {
        this.config = config;
        this.version = version;
    }

    public C getConfig() {
        return this.config;
    }

    public MCVersion getVersion() {
        return this.version;
    }

    public abstract String getName();

    public static String name() {
        return "unknown";
    }

    public abstract boolean canStart(D var1, long var2, ChunkRand var4);

    public abstract boolean canSpawn(D var1, BiomeSource var2);

    public abstract boolean canGenerate(D var1, TerrainGenerator var2);

    public boolean isValidDimension(Dimension dimension) {
        return this.getValidDimension() == dimension;
    }

    public abstract Dimension getValidDimension();

    @Override
    public GenerationContext.Context getContext(long worldSeed) {
        if (this.getContext() == null || this.getContext().getWorldSeed() != worldSeed) {
            this.setContext(GenerationContext.super.getContext(worldSeed));
        }
        return this.getContext();
    }

    public void setContext(GenerationContext.Context context) {
        this.context = context;
    }

    public GenerationContext.Context getContext() {
        return this.context;
    }

    public static class Config {
    }

    public static class Data<T extends Feature> {
        public final T feature;
        public final int chunkX;
        public final int chunkZ;

        public Data(T feature, int chunkX, int chunkZ) {
            this.feature = feature;
            this.chunkX = chunkX;
            this.chunkZ = chunkZ;
        }

        public boolean testStart(long structureSeed, ChunkRand rand) {
            return ((Feature)this.feature).canStart((Data)this, structureSeed, rand);
        }

        public boolean testBiome(BiomeSource source) {
            return ((Feature)this.feature).canSpawn((Data)this, source);
        }

        public boolean testGenerate(TerrainGenerator generator) {
            return ((Feature)this.feature).canGenerate((Data)this, generator);
        }
    }
}

