/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.source;

import com.seedfinding.mcbiome.biome.surface.builder.BadlandsSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.BasaltDeltasSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.SoulSandValleySurfaceBuilder;
import com.seedfinding.mcbiome.layer.cache.FloatLayerCache;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mccore.util.data.Triplet;
import com.seedfinding.mcnoise.perlin.OctavePerlinNoiseSampler;
import com.seedfinding.mcnoise.simplex.OctaveSimplexNoiseSampler;
import com.seedfinding.mcseed.rand.JRand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StaticNoiseSource {
    public static final OctaveSimplexNoiseSampler TEMPERATURE_NOISE = new OctaveSimplexNoiseSampler(new JRand(1234L), IntStream.of(0));
    public static final OctaveSimplexNoiseSampler FROZEN_TEMPERATURE_NOISE = new OctaveSimplexNoiseSampler(new JRand(3456L), IntStream.of(-2, -1, 0));
    public static final OctaveSimplexNoiseSampler BIOME_INFO_NOISE = new OctaveSimplexNoiseSampler(new JRand(2345L), IntStream.of(0));
    public static final FloatLayerCache TEMPERATURE_CACHE = new FloatLayerCache(1024);
    private static final int THRESHOLD_VALLEY = Runtime.getRuntime().availableProcessors() * 4 * 2;
    private static final HashMap<Long, OctavePerlinNoiseSampler> CACHED_VALLEY_NOISE = new HashMap(THRESHOLD_VALLEY);
    private static final int THRESHOLD_PATCH = Runtime.getRuntime().availableProcessors() * 2 * 2;
    private static final HashMap<Long, OctavePerlinNoiseSampler> CACHED_PATCH_NOISE = new HashMap(THRESHOLD_PATCH);
    private final long worldSeed;
    private Quad<Block[], OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler> badlandsSurface = null;
    private Pair<OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler> noises = null;
    private OctavePerlinNoiseSampler netherForestsNoise = null;
    private OctavePerlinNoiseSampler netherNoise = null;
    private List<OctavePerlinNoiseSampler> valleyNoise = null;
    private List<OctavePerlinNoiseSampler> patchNoise = null;

    public StaticNoiseSource(long worldSeed) {
        this.worldSeed = worldSeed;
    }

    public long getWorldSeed() {
        return this.worldSeed;
    }

    public Pair<OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler> getNoises() {
        if (this.noises == null) {
            JRand rand = new JRand(this.getWorldSeed());
            OctaveSimplexNoiseSampler noise = new OctaveSimplexNoiseSampler(rand, IntStream.rangeClosed(-3, 0));
            OctaveSimplexNoiseSampler roofNoise = new OctaveSimplexNoiseSampler(rand, Collections.singletonList(0));
            this.noises = new Pair<OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler>(noise, roofNoise);
        }
        return this.noises;
    }

    public List<OctavePerlinNoiseSampler> getValleyNoise() {
        if (this.valleyNoise == null) {
            int maxBlocksFloor = Math.max(BasaltDeltasSurfaceBuilder.FLOOR_BLOCK_STATES.size(), SoulSandValleySurfaceBuilder.FLOOR_BLOCK_STATES.size());
            int maxBlocksCeiling = Math.max(BasaltDeltasSurfaceBuilder.CEILING_BLOCK_STATES.size(), SoulSandValleySurfaceBuilder.CEILING_BLOCK_STATES.size());
            this.valleyNoise = new ArrayList<OctavePerlinNoiseSampler>();
            for (int i = 0; i < maxBlocksFloor + maxBlocksCeiling; ++i) {
                OctavePerlinNoiseSampler sampler = CACHED_VALLEY_NOISE.computeIfAbsent(this.getWorldSeed() + (long)i, key -> new OctavePerlinNoiseSampler(new JRand((long)key), Collections.singletonList(-4)));
                this.valleyNoise.add(sampler);
            }
            this.purgeCache(THRESHOLD_VALLEY);
        }
        return this.valleyNoise;
    }

    public List<OctavePerlinNoiseSampler> getPatchNoise() {
        if (this.patchNoise == null) {
            int souldSandSize = SoulSandValleySurfaceBuilder.FLOOR_BLOCK_STATES.size() + SoulSandValleySurfaceBuilder.CEILING_BLOCK_STATES.size();
            int basaltSize = BasaltDeltasSurfaceBuilder.FLOOR_BLOCK_STATES.size() + BasaltDeltasSurfaceBuilder.CEILING_BLOCK_STATES.size();
            this.patchNoise = new ArrayList<OctavePerlinNoiseSampler>();
            this.patchNoise.add(CACHED_PATCH_NOISE.computeIfAbsent(this.getWorldSeed() + (long)souldSandSize, key -> new OctavePerlinNoiseSampler(new JRand((long)key), Collections.singletonList(0))));
            this.patchNoise.add(CACHED_PATCH_NOISE.computeIfAbsent(this.getWorldSeed() + (long)basaltSize, key -> new OctavePerlinNoiseSampler(new JRand((long)key), Collections.singletonList(0))));
            this.purgeCache(THRESHOLD_PATCH);
        }
        return this.patchNoise;
    }

    private void purgeCache(int treshold) {
        if (CACHED_VALLEY_NOISE.size() > treshold) {
            List<Long> worldSeeds = CACHED_VALLEY_NOISE.keySet().stream().filter(e -> e < this.getWorldSeed()).collect(Collectors.toList());
            worldSeeds.forEach(CACHED_VALLEY_NOISE::remove);
            if (CACHED_VALLEY_NOISE.size() > treshold) {
                worldSeeds = CACHED_VALLEY_NOISE.keySet().stream().filter(e -> e > this.getWorldSeed() + (long)treshold).collect(Collectors.toList());
                worldSeeds.forEach(CACHED_VALLEY_NOISE::remove);
            }
        }
    }

    public Quad<Block[], OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler> getBadlandsSurface() {
        if (this.badlandsSurface == null) {
            Pair<Block[], OctaveSimplexNoiseSampler> bands = BadlandsSurfaceBuilder.generateBands(this.getWorldSeed());
            Pair<OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler> noises = this.getNoises();
            this.badlandsSurface = new Quad<Block[], OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler>(bands.getFirst(), noises.getFirst(), noises.getSecond(), bands.getSecond());
        }
        return this.badlandsSurface;
    }

    public Pair<OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler> getFrozenOceanSurface() {
        return this.getNoises();
    }

    public OctavePerlinNoiseSampler getNetherForestsNoise() {
        if (this.netherForestsNoise == null) {
            JRand rand = new JRand(this.getWorldSeed());
            this.netherForestsNoise = new OctavePerlinNoiseSampler(rand, Collections.singletonList(0));
        }
        return this.netherForestsNoise;
    }

    public OctavePerlinNoiseSampler getNetherNoise() {
        if (this.netherNoise == null) {
            JRand rand = new JRand(this.getWorldSeed());
            this.netherNoise = new OctavePerlinNoiseSampler(rand, IntStream.rangeClosed(-3, 0));
        }
        return this.netherNoise;
    }

    public Triplet<List<OctavePerlinNoiseSampler>, List<OctavePerlinNoiseSampler>, OctavePerlinNoiseSampler> getBasaltDeltasNoise() {
        List<OctavePerlinNoiseSampler> valleyNoise = this.getValleyNoise();
        List<OctavePerlinNoiseSampler> patchNoise = this.getPatchNoise();
        return new Triplet<List<OctavePerlinNoiseSampler>, List<OctavePerlinNoiseSampler>, OctavePerlinNoiseSampler>(Arrays.asList(valleyNoise.get(0), valleyNoise.get(1)), Collections.singletonList(valleyNoise.get(2)), patchNoise.get(1));
    }

    public Triplet<List<OctavePerlinNoiseSampler>, List<OctavePerlinNoiseSampler>, OctavePerlinNoiseSampler> getSoulSandValleyNoise() {
        List<OctavePerlinNoiseSampler> valleyNoise = this.getValleyNoise();
        List<OctavePerlinNoiseSampler> patchNoise = this.getPatchNoise();
        return new Triplet<List<OctavePerlinNoiseSampler>, List<OctavePerlinNoiseSampler>, OctavePerlinNoiseSampler>(Arrays.asList(valleyNoise.get(0), valleyNoise.get(1)), Arrays.asList(valleyNoise.get(2), valleyNoise.get(3)), patchNoise.get(0));
    }
}

