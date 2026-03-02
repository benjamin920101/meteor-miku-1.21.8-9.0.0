/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.biome.surface.builder;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.biome.surface.builder.BadlandsSurfaceBuilder;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mcnoise.simplex.OctaveSimplexNoiseSampler;

public class ErodedBadlandsSurfaceBuilder
extends BadlandsSurfaceBuilder {
    private double yPikes = 0.0;

    public ErodedBadlandsSurfaceBuilder(SurfaceConfig surfaceConfig) {
        super(surfaceConfig);
    }

    @Override
    public Block[] applyToColumn(BiomeSource source, ChunkRand rand, Block[] column, Biome biome, int x, int z, int maxY, int minY, double noise, int seaLevel, Block defaultBlock, Block defaultFluid) {
        Quad<Block[], OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler> badlandsSurface = source.getStaticNoiseSource().getBadlandsSurface();
        double yElevation = Math.min(Math.abs(noise), badlandsSurface.getSecond().sample((double)x * 0.25, (double)z * 0.25, false) * 15.0);
        if (yElevation > 0.0) {
            double d3 = Math.abs(badlandsSurface.getThird().sample((double)x * 0.001953125, (double)z * 0.001953125, false));
            this.yPikes = yElevation * yElevation * 2.5;
            double d4 = Math.ceil(d3 * 50.0) + 14.0;
            if (this.yPikes > d4) {
                this.yPikes = d4;
            }
            this.yPikes += 64.0;
        }
        return super.applyToColumn(source, rand, column, biome, x, z, Math.max(maxY, (int)this.yPikes + 1), minY, noise, seaLevel, defaultBlock, defaultFluid);
    }

    @Override
    protected Block getBaseBlock(int y, Block[] column, BiomeSource source, Block defaultBlock) {
        Block block = column[y];
        if (Block.IS_AIR.test(source.getVersion(), block) && y < (int)this.yPikes) {
            block = defaultBlock;
        }
        return block;
    }

    @Override
    protected boolean shouldBypass() {
        return true;
    }
}

