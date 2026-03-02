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
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mcnoise.simplex.OctaveSimplexNoiseSampler;
import com.seedfinding.mcseed.rand.JRand;
import java.util.Arrays;
import java.util.Collections;

public class BadlandsSurfaceBuilder
extends SurfaceBuilder {
    public BadlandsSurfaceBuilder(SurfaceConfig surfaceConfig) {
        super(surfaceConfig);
    }

    @Override
    public Block[] applyToColumn(BiomeSource source, ChunkRand rand, Block[] column, Biome biome, int x, int z, int maxY, int minY, double noise, int seaLevel, Block defaultBlock, Block defaultFluid) {
        Quad<Block[], OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler, OctaveSimplexNoiseSampler> badlandsSurface = source.getStaticNoiseSource().getBadlandsSurface();
        Block trackedTopBlock = Blocks.WHITE_TERRACOTTA;
        SurfaceConfig config = this.getSurfaceConfig();
        Block underBlock = config.getUnderBlock();
        Block topBlock = config.getTopBlock();
        Block trackedUnderBlock = underBlock;
        int elevation = (int)(noise / 3.0 + 3.0 + rand.nextDouble() * 0.25);
        boolean shouldBeSimple = Math.cos(noise / 3.0 * Math.PI) > 0.0;
        int trackedY = -1;
        boolean isOrangeTerracotta = false;
        int topLayers = 0;
        for (int y = maxY; y >= minY; --y) {
            Block block = this.getBaseBlock(y, column, source, defaultBlock);
            if (topLayers < 15 || this.shouldBypass()) {
                if (Block.IS_AIR.test(source.getVersion(), block)) {
                    trackedY = -1;
                } else if (block == defaultBlock) {
                    if (trackedY == -1) {
                        isOrangeTerracotta = false;
                        if (elevation <= 0) {
                            trackedTopBlock = Blocks.AIR;
                            trackedUnderBlock = defaultBlock;
                        } else if (y >= seaLevel - 4 && y <= seaLevel + 1) {
                            trackedTopBlock = Blocks.WHITE_TERRACOTTA;
                            trackedUnderBlock = underBlock;
                        }
                        if (y < seaLevel && (trackedTopBlock == null || Block.IS_AIR.test(source.getVersion(), trackedTopBlock))) {
                            trackedTopBlock = defaultFluid;
                        }
                        trackedY = elevation + Math.max(0, y - seaLevel);
                        if (y >= seaLevel - 1) {
                            if (this.highContion(y, elevation)) {
                                block = shouldBeSimple ? Blocks.COARSE_DIRT : Blocks.GRASS_BLOCK;
                            } else if (y <= seaLevel + 3 + elevation) {
                                block = topBlock;
                                isOrangeTerracotta = true;
                            } else {
                                block = y >= 64 && y <= 127 ? (shouldBeSimple ? Blocks.TERRACOTTA : badlandsSurface.getFirst()[this.getBandY(x, y, z, badlandsSurface.getFourth())]) : Blocks.ORANGE_TERRACOTTA;
                            }
                        } else {
                            block = trackedUnderBlock;
                            if (this.orangeTerracottaCondition(block)) {
                                block = Blocks.ORANGE_TERRACOTTA;
                            }
                        }
                    } else if (trackedY > 0) {
                        --trackedY;
                        block = isOrangeTerracotta ? Blocks.ORANGE_TERRACOTTA : badlandsSurface.getFirst()[this.getBandY(x, y, z, badlandsSurface.getFourth())];
                    }
                    ++topLayers;
                }
            }
            column[y] = block;
        }
        return column;
    }

    protected Block getBaseBlock(int y, Block[] column, BiomeSource source, Block defaultBlock) {
        return column[y];
    }

    protected boolean highContion(int y, int elevation) {
        return false;
    }

    protected boolean shouldBypass() {
        return false;
    }

    protected boolean orangeTerracottaCondition(Block block) {
        return block == Blocks.WHITE_TERRACOTTA || block == Blocks.ORANGE_TERRACOTTA || block == Blocks.MAGENTA_TERRACOTTA || block == Blocks.LIGHT_BLUE_TERRACOTTA || block == Blocks.YELLOW_TERRACOTTA || block == Blocks.LIME_TERRACOTTA || block == Blocks.PINK_TERRACOTTA || block == Blocks.GRAY_TERRACOTTA || block == Blocks.LIGHT_GRAY_TERRACOTTA || block == Blocks.CYAN_TERRACOTTA || block == Blocks.PURPLE_TERRACOTTA || block == Blocks.BLUE_TERRACOTTA || block == Blocks.BROWN_TERRACOTTA || block == Blocks.GREEN_TERRACOTTA || block == Blocks.RED_TERRACOTTA || block == Blocks.BLACK_TERRACOTTA;
    }

    protected int getBandY(int x, int y, int z, OctaveSimplexNoiseSampler clayBandsOffsetNoise) {
        int offset = (int)Math.round(clayBandsOffsetNoise.sample((double)x / 512.0, (double)z / 512.0, false) * 2.0);
        return (y + offset + 64) % 64;
    }

    public static Pair<Block[], OctaveSimplexNoiseSampler> generateBands(long worldSeed) {
        int y;
        int offset;
        int bound;
        int attempt;
        JRand rand = new JRand(worldSeed);
        Object[] clayBands = new Block[64];
        Arrays.fill(clayBands, Blocks.TERRACOTTA);
        OctaveSimplexNoiseSampler clayBandsOffsetNoise = new OctaveSimplexNoiseSampler(rand, Collections.singletonList(0));
        for (int y2 = 0; y2 < 64; ++y2) {
            if ((y2 += rand.nextInt(5) + 1) >= 64) continue;
            clayBands[y2] = Blocks.ORANGE_TERRACOTTA;
        }
        int attempts = rand.nextInt(4) + 2;
        for (attempt = 0; attempt < attempts; ++attempt) {
            bound = rand.nextInt(3) + 1;
            offset = rand.nextInt(64);
            for (y = 0; offset + y < 64 && y < bound; ++y) {
                clayBands[offset + y] = Blocks.YELLOW_TERRACOTTA;
            }
        }
        attempts = rand.nextInt(4) + 2;
        for (attempt = 0; attempt < attempts; ++attempt) {
            bound = rand.nextInt(3) + 2;
            offset = rand.nextInt(64);
            for (y = 0; offset + y < 64 && y < bound; ++y) {
                clayBands[offset + y] = Blocks.BROWN_TERRACOTTA;
            }
        }
        attempts = rand.nextInt(4) + 2;
        for (attempt = 0; attempt < attempts; ++attempt) {
            bound = rand.nextInt(3) + 1;
            offset = rand.nextInt(64);
            for (y = 0; offset + y < 64 && y < bound; ++y) {
                clayBands[offset + y] = Blocks.RED_TERRACOTTA;
            }
        }
        attempts = rand.nextInt(3) + 3;
        int offset2 = 0;
        for (int attempt2 = 0; attempt2 < attempts; ++attempt2) {
            int bound2 = 1;
            offset2 += rand.nextInt(16) + 4;
            for (y = 0; offset2 + y < 64 && y < bound2; ++y) {
                clayBands[offset2 + y] = Blocks.WHITE_TERRACOTTA;
                if (offset2 + y > 1 && rand.nextBoolean()) {
                    clayBands[offset2 + y - 1] = Blocks.LIGHT_GRAY_TERRACOTTA;
                }
                if (offset2 + y >= 63 || !rand.nextBoolean()) continue;
                clayBands[offset2 + y + 1] = Blocks.LIGHT_GRAY_TERRACOTTA;
            }
        }
        return new Pair<Object[], OctaveSimplexNoiseSampler>(clayBands, clayBandsOffsetNoise);
    }
}

