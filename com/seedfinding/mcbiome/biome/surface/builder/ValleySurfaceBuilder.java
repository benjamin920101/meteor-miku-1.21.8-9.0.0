/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.biome.surface.builder;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.biome.surface.builder.SurfaceBuilder;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Triplet;
import com.seedfinding.mcnoise.perlin.OctavePerlinNoiseSampler;
import java.util.List;

public abstract class ValleySurfaceBuilder
extends SurfaceBuilder {
    public ValleySurfaceBuilder(SurfaceConfig surfaceConfig) {
        super(surfaceConfig);
    }

    @Override
    public Block[] applyToColumn(BiomeSource source, ChunkRand rand, Block[] column, Biome biome, int x, int z, int maxY, int minY, double noise, int seaLevel, Block defaultBlock, Block defaultFluid) {
        int upwardElevation = (int)(noise / 3.0 + 3.0 + rand.nextDouble() * 0.25);
        int downwardElevation = (int)(noise / 3.0 + 3.0 + rand.nextDouble() * 0.25);
        Triplet<List<OctavePerlinNoiseSampler>, List<OctavePerlinNoiseSampler>, OctavePerlinNoiseSampler> noises = this.getNoises(source);
        boolean flag = noises.getThird().sample((double)x * 0.03125, 109.0, (double)z * 0.03125) * 75.0 + rand.nextDouble() > 0.0;
        double max = Double.MIN_VALUE;
        Block ceilingBlock = null;
        for (int idx = 0; idx < noises.getFirst().size(); ++idx) {
            if (!(noises.getFirst().get(idx).sample(x, seaLevel, z) > max)) continue;
            ceilingBlock = this.getCeilingBlockStates().get(idx);
        }
        assert (ceilingBlock != null);
        max = Double.MIN_VALUE;
        Block floorBlock = null;
        for (int idx = 0; idx < noises.getSecond().size(); ++idx) {
            if (!(noises.getSecond().get(idx).sample(x, seaLevel, z) > max)) continue;
            floorBlock = this.getFloorBlockStates().get(idx);
        }
        assert (floorBlock != null);
        Block previousBlock = Blocks.AIR;
        for (int j1 = 127; j1 >= minY; --j1) {
            Block block;
            Block staticBlock = block = column[j1];
            if (previousBlock == defaultBlock && (Block.IS_AIR.test(source.getVersion(), staticBlock) || staticBlock == defaultFluid)) {
                for (int up = 0; up < upwardElevation && column[Math.max(column.length, j1 + up + 1)] == defaultBlock; ++up) {
                    block = ceilingBlock;
                }
            }
            if ((Block.IS_AIR.test(source.getVersion(), previousBlock) || previousBlock == defaultFluid) && staticBlock == defaultBlock) {
                for (int down = 0; down < downwardElevation && column[Math.min(0, j1 - down)] == defaultBlock; ++down) {
                    block = flag && j1 >= seaLevel - 3 && j1 <= seaLevel + 2 ? this.getPatchBlock() : floorBlock;
                }
            }
            previousBlock = staticBlock;
            column[j1] = block;
        }
        return column;
    }

    public abstract Triplet<List<OctavePerlinNoiseSampler>, List<OctavePerlinNoiseSampler>, OctavePerlinNoiseSampler> getNoises(BiomeSource var1);

    protected abstract List<Block> getFloorBlockStates();

    protected abstract List<Block> getCeilingBlockStates();

    protected abstract Block getPatchBlock();
}

