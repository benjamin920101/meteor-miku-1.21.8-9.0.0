/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.decorator;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.Feature;
import java.util.HashMap;
import java.util.Map;

public abstract class Decorator<C extends Config, D extends Data<?>>
extends Feature<C, D> {
    public Decorator(C config, MCVersion version) {
        super(config, version);
    }

    public int getIndex() {
        return ((Config)this.getConfig()).index;
    }

    public int getStep() {
        return ((Config)this.getConfig()).step;
    }

    public int getDefaultSalt() {
        return ((Config)this.getConfig()).salt;
    }

    public int getSalt(Biome biome) {
        return ((Config)this.getConfig()).getSalt(biome);
    }

    protected void setDecoratorSeed(long structureSeed, int chunkX, int chunkZ, Biome biome, ChunkRand rand) {
        rand.setDecoratorSeed(structureSeed, chunkX << 4, chunkZ << 4, this.getSalt(biome), this.getVersion());
    }

    @Override
    public boolean canStart(D data, long structureSeed, ChunkRand rand) {
        this.setDecoratorSeed(structureSeed, ((Data)data).chunkX, ((Data)data).chunkZ, ((Data)data).biome, rand);
        return true;
    }

    @Override
    public boolean canSpawn(D data, BiomeSource source) {
        Biome biome;
        Biome biome2 = biome = this.getVersion().isOlderThan(MCVersion.v1_16) ? source.getBiome((((Data)data).chunkX << 4) + 8, 0, (((Data)data).chunkZ << 4) + 8) : source.getBiomeForNoiseGen((((Data)data).chunkX << 2) + 2, 0, (((Data)data).chunkZ << 2) + 2);
        if (!this.isValidBiome(biome)) {
            return false;
        }
        if (((Data)data).biome == null) {
            return true;
        }
        return this.getSalt(biome) == this.getSalt(biome);
    }

    public boolean canSpawn(int chunkX, int chunkZ, BiomeSource source) {
        if (this.getVersion().isOlderThan(MCVersion.v1_16)) {
            return this.isValidBiome(source.getBiome((chunkX << 4) + 8, 0, (chunkZ << 4) + 8));
        }
        return this.isValidBiome(source.getBiomeForNoiseGen((chunkX << 2) + 2, 0, (chunkZ << 2) + 2));
    }

    public abstract boolean isValidBiome(Biome var1);

    public abstract D getData(long var1, int var3, int var4, Biome var5, ChunkRand var6);

    public static class Config
    extends Feature.Config {
        public final int index;
        public final int step;
        public final int salt;
        private final Map<Biome, Config> overrides = new HashMap<Biome, Config>();

        public Config(int index, int step) {
            this.index = index;
            this.step = step;
            this.salt = this.step * 10000 + this.index;
        }

        public int getSalt(Biome biome) {
            return this.overrides.getOrDefault((Object)biome, (Config)this).salt;
        }

        public Config add(int index, int step, Biome ... biomes) {
            for (Biome biome : biomes) {
                this.overrides.put(biome, new Config(index, step));
            }
            return this;
        }
    }

    public static class Data<T extends Decorator<?, ?>>
    extends Feature.Data<T> {
        public final Biome biome;

        public Data(T feature, int chunkX, int chunkZ, Biome biome) {
            super(feature, chunkX, chunkZ);
            this.biome = biome;
        }
    }
}

