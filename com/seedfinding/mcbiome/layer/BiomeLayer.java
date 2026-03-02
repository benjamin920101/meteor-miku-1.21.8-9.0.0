/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.layer;

import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.BoolBiomeLayer;
import com.seedfinding.mcbiome.layer.FloatBiomeLayer;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mcbiome.layer.composite.VoronoiLayer;
import com.seedfinding.mcbiome.layer.land.BaseBiomesLayer;
import com.seedfinding.mcbiome.layer.land.ContinentLayer;
import com.seedfinding.mcbiome.layer.noise.NoiseLayer;
import com.seedfinding.mcbiome.layer.scale.ScaleLayer;
import com.seedfinding.mcbiome.layer.water.RiverLayer;
import com.seedfinding.mccore.rand.seed.SeedMixer;
import com.seedfinding.mccore.version.MCVersion;

public abstract class BiomeLayer {
    private final MCVersion version;
    private final BiomeLayer[] parents;
    public long salt;
    public long layerSeed;
    public long localSeed;
    protected int hintSize = 1;
    protected int scale = -1;
    protected int layerId = -1;

    public BiomeLayer(MCVersion version, BiomeLayer ... parents) {
        this.version = version;
        this.parents = parents;
    }

    public BiomeLayer(MCVersion version) {
        this(version, new BiomeLayer[]{null});
    }

    public BiomeLayer(MCVersion version, long worldSeed, long salt, BiomeLayer ... parents) {
        this(version, parents);
        this.salt = salt;
        this.layerSeed = BiomeLayer.getLayerSeed(worldSeed, this.salt);
    }

    public BiomeLayer(MCVersion version, long worldSeed, long salt) {
        this(version, worldSeed, salt, new BiomeLayer[]{null});
    }

    public MCVersion getVersion() {
        return this.version;
    }

    public int getScale() {
        return this.scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public boolean hasParent() {
        return this.parents.length > 0;
    }

    public int getLayerId() {
        return this.layerId;
    }

    public void setLayerId(int layerId) {
        this.layerId = layerId;
    }

    public BiomeLayer getParent() {
        return this.getParent(0);
    }

    public int getHintSize() {
        return this.hintSize;
    }

    public void setHintSize(int size) {
        this.setHintSize(size, true);
    }

    public void setHintSize(int size, boolean recursive) {
        if (recursive) {
            this.setRecursiveHintSize(this, size);
        } else {
            this.hintSize = size;
        }
    }

    public void setRecursiveHintSize(BiomeLayer last, int hintSize) {
        if (last == null) {
            return;
        }
        int max = 0;
        for (BiomeLayer biomeLayer : last.getParents()) {
            int offset;
            int shift = 0;
            int n = offset = last instanceof BaseBiomesLayer || last instanceof NoiseLayer || last instanceof ContinentLayer || last instanceof RiverLayer ? 0 : 2;
            if (last instanceof ScaleLayer) {
                shift = 1;
                offset = 3;
            } else if (last instanceof VoronoiLayer) {
                shift = 2;
                offset = 3;
            }
            this.setRecursiveHintSize(biomeLayer, (hintSize >> shift) + offset);
            max = Math.max(max, hintSize);
        }
        last.setHintSize(max, false);
    }

    public <T extends BiomeLayer> T getParent(Class<T> type) {
        return (T)this.getParent(0);
    }

    public BiomeLayer getParent(int id) {
        return this.parents[id];
    }

    public <T extends BiomeLayer> T getParent(int id, Class<T> type) {
        return (T)this.getParent(id);
    }

    public boolean isMergingLayer() {
        return this.parents.length > 1;
    }

    public BiomeLayer[] getParents() {
        return this.parents;
    }

    public static long getMidSalt(long salt) {
        long midSalt = SeedMixer.mixSeed(salt, salt);
        midSalt = SeedMixer.mixSeed(midSalt, salt);
        midSalt = SeedMixer.mixSeed(midSalt, salt);
        return midSalt;
    }

    public static long getLayerSeed(long worldSeed, long salt) {
        long midSalt = BiomeLayer.getMidSalt(salt);
        long layerSeed = SeedMixer.mixSeed(worldSeed, midSalt);
        layerSeed = SeedMixer.mixSeed(layerSeed, midSalt);
        layerSeed = SeedMixer.mixSeed(layerSeed, midSalt);
        return layerSeed;
    }

    public static long getLocalSeed(long layerSeed, int x, int z) {
        layerSeed = SeedMixer.mixSeed(layerSeed, x);
        layerSeed = SeedMixer.mixSeed(layerSeed, z);
        layerSeed = SeedMixer.mixSeed(layerSeed, x);
        layerSeed = SeedMixer.mixSeed(layerSeed, z);
        return layerSeed;
    }

    public static long getLocalSeed(long worldSeed, long salt, int x, int z) {
        return BiomeLayer.getLocalSeed(BiomeLayer.getLayerSeed(worldSeed, salt), x, z);
    }

    public void setSeed(int x, int z) {
        this.localSeed = BiomeLayer.getLocalSeed(this.layerSeed, x, z);
    }

    public int nextInt(int bound) {
        int i = (int)Math.floorMod(this.localSeed >> 24, (long)bound);
        this.localSeed = SeedMixer.mixSeed(this.localSeed, this.layerSeed);
        return i;
    }

    public int choose(int a, int b) {
        return this.nextInt(2) == 0 ? a : b;
    }

    public int choose(int a, int b, int c, int d) {
        int i = this.nextInt(4);
        return i == 0 ? a : (i == 1 ? b : (i == 2 ? c : d));
    }

    public int getBiome(int x, int y, int z) {
        if (this instanceof FloatBiomeLayer) {
            return Float.floatToIntBits(((FloatBiomeLayer)this).get(x, y, z));
        }
        if (this instanceof BoolBiomeLayer) {
            return ((BoolBiomeLayer)this).get(x, y, z) ? 1 : 0;
        }
        if (this instanceof IntBiomeLayer) {
            return ((IntBiomeLayer)this).get(x, y, z);
        }
        return Biomes.THE_VOID.getId();
    }
}

