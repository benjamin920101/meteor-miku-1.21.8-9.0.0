/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.biome.surface.builder;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.biome.surface.builder.DefaultSurfaceBuilder;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mcnoise.simplex.OctaveSimplexNoiseSampler;

public class FrozenOceanSurfaceBuilder
extends DefaultSurfaceBuilder {
    private double d0;
    private double d1;

    public FrozenOceanSurfaceBuilder(SurfaceConfig surfaceConfig) {
        super(surfaceConfig);
    }

    @Override
    public Block[] applyToColumn(BiomeSource source, ChunkRand rand, Block[] column, Biome biome, int x, int z, int maxY, int minY, double noise, int seaLevel, Block defaultBlock, Block defaultFluid) {
        this.d0 = 0.0;
        this.d1 = 0.0;
        float f = biome.getTemperatureAt(x, 63, z);
        Pair<OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler> noises = source.getStaticNoiseSource().getFrozenOceanSurface();
        double icebergHeight = Math.min(Math.abs(noise), noises.getFirst().sample((double)x * 0.1, (double)z * 0.1, false) * 15.0);
        if (icebergHeight > 1.8) {
            double icebergCeiling = Math.abs(noises.getSecond().sample((double)x * 0.09765625, (double)z * 0.09765625, false));
            this.d0 = icebergHeight * icebergHeight * 1.2;
            double d5 = Math.ceil(icebergCeiling * 40.0) + 14.0;
            if (this.d0 > d5) {
                this.d0 = d5;
            }
            if (f > 0.1f) {
                this.d0 -= 2.0;
            }
            if (this.d0 > 2.0) {
                this.d1 = (double)seaLevel - this.d0 - 7.0;
                this.d0 += (double)seaLevel;
            } else {
                this.d0 = 0.0;
            }
        }
        maxY = Math.max(maxY, (int)this.d0 + 1);
        return super.applyToColumn(source, rand, column, biome, x, z, maxY, minY, noise, seaLevel, defaultBlock, defaultFluid);
    }

    @Override
    public Block applyExtraConditions(int y, Block block, Object[] extras) {
        if (block == Blocks.PACKED_ICE && (Integer)extras[0] <= (Integer)extras[1] && y > (Integer)extras[2]) {
            block = Blocks.SNOW_BLOCK;
            extras[0] = (Integer)extras[0] + 1;
        }
        return block;
    }

    @Override
    public Object[] generateExtras(ChunkRand rand, int seaLevel) {
        int snowLayerCount = 0;
        int snowLayerMax = 2 + rand.nextInt(4);
        int minHeightSnow = seaLevel + 18 + rand.nextInt(10);
        return new Object[]{snowLayerCount, snowLayerMax, minHeightSnow};
    }

    @Override
    public Block getBaseBlock(BiomeSource source, int y, Block[] column, ChunkRand rand, int seaLevel) {
        Block block = column[y];
        if (Block.IS_AIR.test(source.getVersion(), block) && y < (int)this.d0 && rand.nextDouble() > 0.01) {
            block = Blocks.PACKED_ICE;
        } else if (block == Blocks.WATER && y > (int)this.d1 && y < seaLevel && this.d1 != 0.0 && rand.nextDouble() > 0.15) {
            block = Blocks.PACKED_ICE;
        }
        return block;
    }
}

