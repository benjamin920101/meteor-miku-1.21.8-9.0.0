/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature;

import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.UnsupportedVersion;
import com.seedfinding.mcfeature.Feature;
import com.seedfinding.mcterrain.TerrainGenerator;

public interface GenerationContext {
    default public Context getContext(long worldSeed) {
        if (!(this instanceof Feature)) {
            return null;
        }
        Feature feature = (Feature)this;
        return GenerationContext.getContext(worldSeed, feature.getValidDimension(), feature.getVersion());
    }

    public static Context getContext(long worldSeed, Dimension dimension, MCVersion version) {
        BiomeSource biomeSource = BiomeSource.of(dimension, version, worldSeed);
        TerrainGenerator generator = null;
        if (biomeSource != null) {
            try {
                generator = TerrainGenerator.of(biomeSource);
            }
            catch (UnsupportedVersion unsupportedVersion) {
                // empty catch block
            }
        }
        return new Context(biomeSource, generator);
    }

    public static class Context {
        private final BiomeSource biomeSource;
        private final TerrainGenerator generator;
        private final Long worldSeed;
        private final Dimension dimension;

        public Context(BiomeSource biomeSource, TerrainGenerator generator) {
            this.biomeSource = biomeSource;
            this.generator = generator;
            if (biomeSource != null) {
                this.worldSeed = biomeSource.getWorldSeed();
                this.dimension = biomeSource.getDimension();
            } else {
                this.worldSeed = null;
                this.dimension = null;
            }
        }

        public Dimension getDimension() {
            return this.dimension;
        }

        public BiomeSource getBiomeSource() {
            return this.biomeSource;
        }

        public TerrainGenerator getGenerator() {
            return this.generator;
        }

        public Long getWorldSeed() {
            return this.worldSeed;
        }
    }
}

