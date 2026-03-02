/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcterrain.terrain;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Triplet;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcnoise.noise.NoiseSampler;
import com.seedfinding.mcnoise.perlin.OctavePerlinNoiseSampler;
import com.seedfinding.mcnoise.perlin.PerlinNoiseSampler;
import com.seedfinding.mcnoise.simplex.OctaveSimplexNoiseSampler;
import com.seedfinding.mcseed.lcg.LCG;
import com.seedfinding.mcseed.rand.JRand;
import com.seedfinding.mcterrain.TerrainGenerator;
import com.seedfinding.mcterrain.utils.MathHelper;
import com.seedfinding.mcterrain.utils.NoiseSettings;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public abstract class SurfaceGenerator
extends TerrainGenerator {
    protected static final float[] BIOME_WEIGHT_TABLE = new float[25];
    protected static final float[] BEARD_KERNEL = new float[13824];
    protected final OctavePerlinNoiseSampler depthNoise;
    protected final ChunkRand random;
    private final int chunkHeight;
    private final int chunkWidth;
    private final int noiseSizeX;
    private final int noiseSizeY;
    private final int noiseSizeZ;
    private final NoiseSettings noiseSettings;
    private final OctavePerlinNoiseSampler minLimitPerlinNoise;
    private final OctavePerlinNoiseSampler maxLimitPerlinNoise;
    private final OctavePerlinNoiseSampler mainPerlinNoise;
    private final NoiseSampler surfaceDepthNoise;
    private final OctavePerlinNoiseSampler scaleNoise;
    private final double densityFactor;
    private final double densityOffset;
    private final Map<Long, double[]> noiseColumnCache = new HashMap<Long, double[]>();
    private final Map<Long, Block[]> columnCache = new HashMap<Long, Block[]>();
    private final Map<Long, Block[]> jigsawColumnCache = new HashMap<Long, Block[]>();
    private final Map<Long, Block[]> biomeColumnCache = new HashMap<Long, Block[]>();
    private final Map<Long, Block[]> biomeJigsawColumnCache = new HashMap<Long, Block[]>();
    private final Map<Long, Long> chunkSeeds = new HashMap<Long, Long>();
    private final Map<Long, Long> jigsawChunkSeeds = new HashMap<Long, Long>();
    private final int worldHeight;
    private static final LCG SCALE_ADVANCE;
    private static final LCG SURFACE_ADVANCE;

    public SurfaceGenerator(BiomeSource biomeSource, int worldHeight, int horizontalNoiseResolution, int verticalNoiseResolution, NoiseSettings noiseSettings, double densityFactor, double densityOffset, boolean useSimplexNoise) {
        super(biomeSource);
        this.worldHeight = worldHeight;
        this.chunkHeight = verticalNoiseResolution * 4;
        this.chunkWidth = horizontalNoiseResolution * 4;
        this.noiseSettings = noiseSettings;
        this.noiseSizeX = 16 / this.chunkWidth;
        this.noiseSizeY = worldHeight / this.chunkHeight;
        this.noiseSizeZ = 16 / this.chunkWidth;
        this.densityFactor = densityFactor;
        this.densityOffset = densityOffset;
        this.random = new ChunkRand(biomeSource.getWorldSeed());
        if (this.version.isOlderThan(MCVersion.v1_15)) {
            this.minLimitPerlinNoise = new OctavePerlinNoiseSampler((JRand)this.random, 16);
            this.maxLimitPerlinNoise = new OctavePerlinNoiseSampler((JRand)this.random, 16);
            this.mainPerlinNoise = new OctavePerlinNoiseSampler((JRand)this.random, 8);
        } else {
            this.minLimitPerlinNoise = new OctavePerlinNoiseSampler((JRand)this.random, IntStream.rangeClosed(-15, 0));
            this.maxLimitPerlinNoise = new OctavePerlinNoiseSampler((JRand)this.random, IntStream.rangeClosed(-15, 0));
            this.mainPerlinNoise = new OctavePerlinNoiseSampler((JRand)this.random, IntStream.rangeClosed(-7, 0));
        }
        if (this.version.isOlderOrEqualTo(MCVersion.v1_13_2) && this.getDimension() == Dimension.END) {
            this.surfaceDepthNoise = null;
        } else {
            if (this.version.isOlderOrEqualTo(MCVersion.v1_13_2) && this.getDimension() == Dimension.NETHER) {
                this.random.advance(SURFACE_ADVANCE);
            }
            if (this.version.isOlderThan(MCVersion.v1_15)) {
                this.surfaceDepthNoise = useSimplexNoise ? new OctaveSimplexNoiseSampler((JRand)this.random, 4) : new OctavePerlinNoiseSampler((JRand)this.random, 4);
            } else {
                NoiseSampler noiseSampler = this.surfaceDepthNoise = useSimplexNoise ? new OctaveSimplexNoiseSampler((JRand)this.random, IntStream.rangeClosed(-3, 0)) : new OctavePerlinNoiseSampler((JRand)this.random, IntStream.rangeClosed(-3, 0));
            }
        }
        if (this.version.isOlderOrEqualTo(MCVersion.v1_13_2)) {
            this.scaleNoise = new OctavePerlinNoiseSampler((JRand)this.random, 10);
        } else {
            this.scaleNoise = null;
            this.random.advance(SCALE_ADVANCE);
        }
        this.depthNoise = this.version.isOlderThan(MCVersion.v1_15) ? new OctavePerlinNoiseSampler((JRand)this.random, 16) : new OctavePerlinNoiseSampler((JRand)this.random, IntStream.rangeClosed(-15, 0));
    }

    @Override
    public int getMinWorldHeight() {
        return 0;
    }

    @Override
    public int getMaxWorldHeight() {
        return this.getWorldHeight() - this.getMinWorldHeight();
    }

    @Override
    public int getWorldHeight() {
        return this.worldHeight;
    }

    @Override
    public abstract Block getDefaultBlock();

    @Override
    public abstract Block getDefaultFluid();

    public abstract int getBedrockRoofPosition();

    public abstract int getBedrockFloorPosition();

    public int noiseSizeY() {
        return this.noiseSizeY + 1;
    }

    public double getMaxNoiseY() {
        return (double)this.noiseSizeY() - 4.0;
    }

    public double getMinNoiseY() {
        return 0.0;
    }

    private double sampleNoise(int x, int y, int z) {
        double xzScale = 684.412 * this.noiseSettings.samplingSettings.xzScale;
        double yScale = 684.412 * this.noiseSettings.samplingSettings.yScale;
        double xzStep = xzScale / this.noiseSettings.samplingSettings.xzFactor;
        double yStep = yScale / this.noiseSettings.samplingSettings.yFactor;
        double minNoise = 0.0;
        double maxNoise = 0.0;
        double mainNoise = 0.0;
        double persistence = 1.0;
        for (int octave = 0; octave < 16; ++octave) {
            double cellX = com.seedfinding.mcnoise.utils.MathHelper.maintainPrecision((double)x * xzScale * persistence);
            double cellY = com.seedfinding.mcnoise.utils.MathHelper.maintainPrecision((double)y * yScale * persistence);
            double cellZ = com.seedfinding.mcnoise.utils.MathHelper.maintainPrecision((double)z * xzScale * persistence);
            double sy = yScale * persistence;
            minNoise += this.minLimitPerlinNoise.getOctave(octave).sample(cellX, cellY, cellZ, sy, (double)y * sy) / persistence;
            maxNoise += this.maxLimitPerlinNoise.getOctave(octave).sample(cellX, cellY, cellZ, sy, (double)y * sy) / persistence;
            if (octave < 8) {
                mainNoise += this.mainPerlinNoise.getOctave(octave).sample(com.seedfinding.mcnoise.utils.MathHelper.maintainPrecision((double)x * xzStep * persistence), com.seedfinding.mcnoise.utils.MathHelper.maintainPrecision((double)y * yStep * persistence), com.seedfinding.mcnoise.utils.MathHelper.maintainPrecision((double)z * xzStep * persistence), yStep * persistence, (double)y * yStep * persistence) / persistence;
            }
            persistence /= 2.0;
        }
        return MathHelper.clampedLerp(minNoise / 512.0, maxNoise / 512.0, (mainNoise / 10.0 + 1.0) / 2.0);
    }

    private static double[] sampleNoiseOnYLevel(OctavePerlinNoiseSampler sampler, int ySize, int x, int z, double noiseScaleX, double noiseScaleY, double noiseScaleZ) {
        double[] yArray = new double[ySize];
        double persistence = 1.0;
        for (int octave = 0; octave < sampler.getCount(); ++octave) {
            double xScale = noiseScaleX * persistence;
            double yScale = noiseScaleY * persistence;
            double zScale = noiseScaleZ * persistence;
            int cx = x >> 4;
            int cz = z >> 4;
            int fx = x & 0xF;
            int fz = z & 0xF;
            double X = (double)(cx << 4) * xScale;
            double Z = (double)(cz << 4) * zScale;
            long intX = com.seedfinding.mcnoise.utils.MathHelper.lfloor(X);
            long intZ = com.seedfinding.mcnoise.utils.MathHelper.lfloor(Z);
            X -= (double)intX;
            Z -= (double)intZ;
            X += (double)(intX %= 0x1000000L);
            Z += (double)(intZ %= 0x1000000L);
            PerlinNoiseSampler noiseSampler = sampler.getOctave(octave);
            int oldOffset = -1;
            double x1x2 = 0.0;
            double x3x4 = 0.0;
            double x5x6 = 0.0;
            double x7x8 = 0.0;
            int currentY = 0;
            while (currentY < ySize) {
                double fy = (double)currentY * yScale;
                int currentOffset = (int)(noiseSampler.originY + fy) & 0xFF;
                Triplet<int[], double[], double[]> args = noiseSampler.getArgs(X + (double)fx * xScale, fy, Z + (double)fz * zScale, 0.0, 0.0);
                if (currentY == 0 || currentOffset != oldOffset) {
                    oldOffset = currentOffset;
                    double[] perms = noiseSampler.samplePermutations(args.getFirst(), args.getSecond());
                    double fadeLocalX = args.getThird()[0];
                    x1x2 = com.seedfinding.mcnoise.utils.MathHelper.lerp(fadeLocalX, perms[0], perms[1]);
                    x3x4 = com.seedfinding.mcnoise.utils.MathHelper.lerp(fadeLocalX, perms[2], perms[3]);
                    x5x6 = com.seedfinding.mcnoise.utils.MathHelper.lerp(fadeLocalX, perms[4], perms[5]);
                    x7x8 = com.seedfinding.mcnoise.utils.MathHelper.lerp(fadeLocalX, perms[6], perms[7]);
                }
                double fadeLocalY = args.getThird()[1];
                double fadeLocalZ = args.getThird()[2];
                double noise = com.seedfinding.mcnoise.utils.MathHelper.lerp2(fadeLocalY, fadeLocalZ, x1x2, x3x4, x5x6, x7x8);
                int n = currentY++;
                yArray[n] = yArray[n] + noise / persistence;
            }
            persistence /= 2.0;
        }
        return yArray;
    }

    @Override
    protected void sampleNoiseColumnOld(double[] buffer, int x, int z, double depth, double scale) {
        double xzScale = 684.412 * this.noiseSettings.samplingSettings.xzScale;
        double yScale = 684.412 * this.noiseSettings.samplingSettings.yScale;
        double xzStep = xzScale / this.noiseSettings.samplingSettings.xzFactor;
        double yStep = yScale / this.noiseSettings.samplingSettings.yFactor;
        if (this.getDimension() == Dimension.OVERWORLD) {
            xzStep = (float)xzStep;
            yStep = (float)yStep;
        }
        double[] minNoiseYLevels = SurfaceGenerator.sampleNoiseOnYLevel(this.minLimitPerlinNoise, this.noiseSizeY(), x, z, xzScale, yScale, xzScale);
        double[] maxNoiseYLevels = SurfaceGenerator.sampleNoiseOnYLevel(this.maxLimitPerlinNoise, this.noiseSizeY(), x, z, xzScale, yScale, xzScale);
        double[] mainNoiseYLevels = SurfaceGenerator.sampleNoiseOnYLevel(this.mainPerlinNoise, this.noiseSizeY(), x, z, xzStep, yStep, xzStep);
        int sizeY = (int)this.getMaxNoiseY();
        for (int y = 0; y < this.noiseSizeY(); ++y) {
            double offset;
            double fallOff = this.computeNoiseFalloff(depth, scale, y);
            double minNoise = minNoiseYLevels[y] / 512.0;
            double maxNoise = maxNoiseYLevels[y] / 512.0;
            double mainNoise = mainNoiseYLevels[y];
            mainNoise = (mainNoise / 10.0 + 1.0) / 2.0;
            double noise = MathHelper.clampedLerp(minNoise, maxNoise, mainNoise) - fallOff;
            if (y > sizeY) {
                offset = (float)(y - sizeY) / (float)this.noiseSettings.topSlideSettings.size;
                if (this.getDimension() == Dimension.END) {
                    offset = MathHelper.clamp(offset, 0.0, 1.0);
                }
                noise = noise * (1.0 - offset) + (double)this.noiseSettings.topSlideSettings.target * offset;
            }
            if ((double)y < this.getMinNoiseY()) {
                if (this.getDimension() == Dimension.NETHER) {
                    offset = (this.getMinNoiseY() - (double)y) / 4.0;
                    offset = MathHelper.clamp(offset, 0.0, 1.0);
                    noise = noise * (1.0 - offset) - 10.0 * offset;
                } else if (this.getDimension() == Dimension.END) {
                    offset = (float)((int)this.getMinNoiseY() - y) / ((float)this.getMinNoiseY() - 1.0f);
                    noise = noise * (1.0 - offset) - 30.0 * offset;
                }
            }
            buffer[y] = noise;
        }
    }

    protected void sampleNoiseColumn(double[] buffer, int x, int z) {
        double[] ds = this.getDepthAndScale(x, z);
        double depth = ds[0];
        double scale = ds[1];
        if (this.version.isOlderOrEqualTo(MCVersion.v1_13_2)) {
            this.sampleNoiseColumnOld(buffer, x, z, depth, scale);
            return;
        }
        double sizeY = this.getMaxNoiseY();
        double minY = this.getMinNoiseY();
        double randomOffset = this.biomeSource.getDimension() == Dimension.OVERWORLD ? this.sampleNoise(x, z) : 0.0;
        for (int y = 0; y < this.noiseSizeY(); ++y) {
            double noise = this.sampleNoise(x, y, z);
            if (this.version.isNewerOrEqualTo(MCVersion.v1_16)) {
                double fallOff = 1.0 - (double)y * 2.0 / (double)this.noiseSizeY + randomOffset;
                fallOff = fallOff * this.densityFactor + this.densityOffset;
                double d = noise = (fallOff = (fallOff + depth) * scale) > 0.0 ? noise + fallOff * 4.0 : noise + fallOff;
                if ((double)this.noiseSettings.topSlideSettings.size > 0.0) {
                    noise = MathHelper.clampedLerp(this.noiseSettings.topSlideSettings.target, noise, ((double)(this.noiseSizeY - y) - (double)this.noiseSettings.topSlideSettings.offset) / (double)this.noiseSettings.topSlideSettings.size);
                }
                if ((double)this.noiseSettings.bottomSlideSettings.size > 0.0) {
                    noise = MathHelper.clampedLerp(this.noiseSettings.bottomSlideSettings.target, noise, ((double)y - (double)this.noiseSettings.bottomSlideSettings.offset) / (double)this.noiseSettings.bottomSlideSettings.size);
                }
            } else {
                noise -= this.computeNoiseFalloff(depth, scale, y);
                if ((double)y > sizeY) {
                    noise = MathHelper.clampedLerp(noise, this.noiseSettings.topSlideSettings.target, ((double)y - sizeY - (double)this.noiseSettings.topSlideSettings.offset) / (double)this.noiseSettings.topSlideSettings.size);
                } else if ((double)y < minY) {
                    noise = MathHelper.clampedLerp(noise, this.noiseSettings.bottomSlideSettings.target, (minY - (double)y) / (minY - 1.0));
                }
            }
            buffer[y] = noise;
        }
    }

    protected double[] sampleNoiseColumn(int x, int z) {
        long key = ((long)x & 0xFFFFFFFFL) << 32 | (long)z & 0xFFFFFFFFL;
        if (this.noiseColumnCache.containsKey(key)) {
            return this.noiseColumnCache.get(key);
        }
        double[] ds = new double[this.noiseSizeY + 1];
        this.sampleNoiseColumn(ds, x, z);
        this.noiseColumnCache.put(key, ds);
        return ds;
    }

    @Override
    public Block[] getColumnAt(int x, int z) {
        return this.columnCache.computeIfAbsent(this.getKey(x, z), k -> {
            assert (this.getWorldHeight() == this.noiseSizeY * this.chunkHeight);
            Block[] buffer = new Block[this.getWorldHeight()];
            int y = this.generateColumn(buffer, x, z, null, null, null);
            assert (y == 0);
            return buffer;
        });
    }

    @Override
    public Block[] getColumnAt(int x, int z, List<Pair<Supplier<Integer>, BlockBox>> jigsawBoxes, List<BPos> jigsawJunction) {
        if (jigsawBoxes == null || jigsawJunction == null) {
            return null;
        }
        return this.jigsawColumnCache.computeIfAbsent(this.getKey(x, z), k -> {
            assert (this.getWorldHeight() == this.noiseSizeY * this.chunkHeight);
            Block[] buffer = new Block[this.getWorldHeight()];
            int y = this.generateColumn(buffer, x, z, null, jigsawBoxes, jigsawJunction);
            assert (y == 0);
            return buffer;
        });
    }

    @Override
    public Block[] getBiomeColumnAt(int x, int z) {
        long key = this.getKey(x, z);
        if (this.biomeColumnCache.containsKey(key)) {
            return this.biomeColumnCache.get(key);
        }
        Block[] blocks = this.generateBiomeColumnBefore(x, z, this::getColumnAt, this.biomeColumnCache, this.chunkSeeds);
        this.biomeColumnCache.put(key, blocks);
        return blocks;
    }

    @Override
    public Block[] getBiomeColumnAt(int x, int z, List<Pair<Supplier<Integer>, BlockBox>> jigsawBoxes, List<BPos> jigsawJunction) {
        if (jigsawBoxes == null || jigsawJunction == null) {
            return null;
        }
        long key = this.getKey(x, z);
        if (this.biomeJigsawColumnCache.containsKey(key)) {
            return this.biomeJigsawColumnCache.get(key);
        }
        Block[] blocks = this.generateBiomeColumnBefore(x, z, (posX, posZ) -> this.getColumnAt((int)posX, (int)posZ, jigsawBoxes, jigsawJunction), this.biomeJigsawColumnCache, this.jigsawChunkSeeds);
        this.biomeJigsawColumnCache.put(key, blocks);
        return blocks;
    }

    @Override
    public Block[] getBedrockColumnAt(int x, int z) {
        this.applyBedrock(x, z, this::getBiomeColumnAt, this.biomeColumnCache, this.chunkSeeds);
        return this.biomeColumnCache.get(this.getKey(x, z));
    }

    @Override
    public Block[] getBedrockColumnAt(int x, int z, List<Pair<Supplier<Integer>, BlockBox>> jigsawBoxes, List<BPos> jigsawJunction) {
        this.applyBedrock(x, z, this::getBiomeColumnAt, this.jigsawColumnCache, this.jigsawChunkSeeds);
        return this.jigsawColumnCache.get(this.getKey(x, z));
    }

    public void applyBedrock(int x, int z, BiFunction<Integer, Integer, Block[]> columnProvider, Map<Long, Block[]> cacheProvider, Map<Long, Long> seedProvider) {
        boolean floorOk;
        int chunkX = x >> 4;
        int chunkZ = z >> 4;
        int maxChunkX = (chunkX << 4) + 15;
        int maxChunkZ = (chunkZ << 4) + 15;
        this.getBiomeColumnAt(maxChunkX, maxChunkZ);
        Long seed = seedProvider.get(this.getKey(maxChunkX, maxChunkZ));
        if (seed == null) {
            return;
        }
        ChunkRand rand = new ChunkRand(seed, false);
        int maxFloorBedrock = this.getBedrockFloorPosition();
        int maxRoofBedrock = this.worldHeight - 1 - this.getBedrockRoofPosition();
        boolean roofOk = maxRoofBedrock + 4 >= 0 && maxRoofBedrock < this.worldHeight;
        boolean bl = floorOk = maxFloorBedrock + 4 >= 0 && maxFloorBedrock < this.worldHeight;
        if (roofOk || floorOk) {
            for (int X = 0; X < 16; ++X) {
                for (int Z = 0; Z < 16; ++Z) {
                    int y;
                    Block[] buffer = columnProvider.apply(chunkX + X, chunkZ + Z);
                    if (roofOk) {
                        for (y = 0; y < 5; ++y) {
                            if (y > rand.nextInt(5)) continue;
                            buffer[maxRoofBedrock - y] = Blocks.BEDROCK;
                        }
                    }
                    if (floorOk) {
                        for (y = 4; y >= 0; --y) {
                            if (y > rand.nextInt(5)) continue;
                            buffer[maxFloorBedrock + y] = Blocks.BEDROCK;
                        }
                    }
                    cacheProvider.put(this.getKey(chunkX + X, chunkZ + Z), buffer);
                }
            }
        }
    }

    private long getKey(int x, int z) {
        return ((long)x & 0xFFFFFFFFL) << 32 | (long)z & 0xFFFFFFFFL;
    }

    @Override
    public Optional<Block> getBlockAt(int x, int y, int z) {
        if (y < this.getMinWorldHeight() || y > this.getMaxWorldHeight() - 1) {
            return Optional.empty();
        }
        return Optional.of(this.getColumnAt(x, z)[y]);
    }

    private void replaceBiomeBlocks(Block[] buffer, int x, int z, ChunkRand rand) {
        int y = (int)MathHelper.clamp(this.getHeightOnGround(x, z), this.getMinWorldHeight(), this.getMaxWorldHeight() - 1);
        double noise = this.surfaceDepthNoise.sample((double)x * 0.0625, (double)z * 0.0625, 0.0625, (double)(x & 0xF) * 0.0625) * 15.0;
        Biome biome = this.biomeSource.getBiome(x, y, z);
        biome.getSurfaceBuilder().applyToColumn(this.getBiomeSource(), rand, buffer, biome, x, z, y, 0, noise, this.getSeaLevel(), this.getDefaultBlock(), this.getDefaultFluid());
    }

    public Block[] generateBiomeColumnBefore(int x, int z, BiFunction<Integer, Integer, Block[]> columnProvider, Map<Long, Block[]> cacheProvider, Map<Long, Long> seedProvider) {
        int chunkX = x >> 4;
        int chunkZ = z >> 4;
        ChunkRand rand = new ChunkRand();
        rand.setTerrainSeed(chunkX, chunkZ, this.getVersion());
        int minChunkX = chunkX << 4;
        int minChunkZ = chunkZ << 4;
        for (int X = 0; X < 16; ++X) {
            for (int Z = 0; Z < 16; ++Z) {
                int posX = minChunkX + X;
                int posZ = minChunkZ + Z;
                long key = this.getKey(posX, posZ);
                Long seed = seedProvider.get(key);
                if (seed == null) {
                    assert (!cacheProvider.containsKey(key));
                    Block[] buffer = columnProvider.apply(x, z);
                    this.replaceBiomeBlocks(buffer, x, z, rand);
                    cacheProvider.put(key, buffer);
                    seedProvider.put(key, rand.getSeed());
                } else {
                    rand.setSeed(seed, false);
                }
                if (posX != x || posZ != z) continue;
                return cacheProvider.get(key);
            }
        }
        return cacheProvider.get(this.getKey(x, z));
    }

    public double applyJigsawToNoise(double noise, BPos bPos, List<Pair<Supplier<Integer>, BlockBox>> jigsawBoxes, List<BPos> jigsawJunction) {
        noise = MathHelper.clamp(noise / 200.0, -1.0, 1.0);
        noise = noise / 2.0 - noise * noise * noise / 24.0;
        for (Pair<Supplier<Integer>, BlockBox> jigsawBox : jigsawBoxes) {
            BlockBox box = jigsawBox.getSecond();
            int localX = Math.max(0, Math.max(box.minX - bPos.getX(), bPos.getX() - box.maxX));
            int localY = bPos.getY() - (box.minY + (jigsawBox.getFirst() != null ? jigsawBox.getFirst().get() : 0));
            int localZ = Math.max(0, Math.max(box.minZ - bPos.getZ(), bPos.getZ() - box.maxZ));
            noise += SurfaceGenerator.getContribution(localX, localY, localZ) * 0.8;
        }
        for (BPos junction : jigsawJunction) {
            int localX = bPos.getX() - junction.getX();
            int localY = bPos.getY() - junction.getY();
            int localZ = bPos.getZ() - junction.getZ();
            noise += SurfaceGenerator.getContribution(localX, localY, localZ) * 0.4;
        }
        return noise;
    }

    public int generateColumn(Block[] buffer, int x, int z, Predicate<Block> blockPredicate, List<Pair<Supplier<Integer>, BlockBox>> jigsawBoxes, List<BPos> jigsawJunction) {
        int cellX = Math.floorDiv(x, this.chunkWidth);
        int cellZ = Math.floorDiv(z, this.chunkWidth);
        int posX = Math.floorMod(x, this.chunkWidth);
        int posZ = Math.floorMod(z, this.chunkWidth);
        double percentX = (double)posX / (double)this.chunkWidth;
        double percentZ = (double)posZ / (double)this.chunkWidth;
        double[][] ds = new double[][]{this.sampleNoiseColumn(cellX, cellZ), this.sampleNoiseColumn(cellX, cellZ + 1), this.sampleNoiseColumn(cellX + 1, cellZ), this.sampleNoiseColumn(cellX + 1, cellZ + 1)};
        for (int cellY = this.noiseSizeY - 1; cellY >= 0; --cellY) {
            double xyz = ds[0][cellY];
            double xyz1 = ds[1][cellY];
            double x1yz = ds[2][cellY];
            double x1yz1 = ds[3][cellY];
            double xy1z = ds[0][cellY + 1];
            double xy1z1 = ds[1][cellY + 1];
            double x1y1z = ds[2][cellY + 1];
            double x1y1z1 = ds[3][cellY + 1];
            for (int posY = this.chunkHeight - 1; posY >= 0; --posY) {
                double percentY = (double)posY / (double)this.chunkHeight;
                double noise = com.seedfinding.mcnoise.utils.MathHelper.lerp3(percentY, percentX, percentZ, xyz, xy1z, x1yz, x1y1z, xyz1, xy1z1, x1yz1, x1y1z1);
                int y = cellY * this.chunkHeight + posY;
                if (jigsawBoxes != null && jigsawJunction != null) {
                    noise = this.applyJigsawToNoise(noise, new BPos(x, y, z), jigsawBoxes, jigsawJunction);
                }
                Block block = this.getBlockFromNoise(noise, y);
                if (buffer != null) {
                    buffer[y] = block;
                }
                if (blockPredicate == null || !blockPredicate.test(block)) continue;
                return y + 1;
            }
        }
        return 0;
    }

    @Override
    public int getHeightOnGround(int x, int z) {
        return this.generateColumn(null, x, z, block -> block == this.getDefaultBlock(), null, null);
    }

    @Override
    public int getFirstHeightInColumn(int x, int z, Predicate<Block> predicate) {
        return this.generateColumn(null, x, z, predicate, null, null);
    }

    protected double[] getDepthAndScale(int x, int z) {
        double[] depthAndScale = new double[2];
        int sampleRange = 2;
        float weightedScale = 0.0f;
        float weightedDepth = 0.0f;
        float totalWeight = 0.0f;
        Biome biome = this.biomeSource.getBiomeForNoiseGen(x, this.getSeaLevel(), z);
        float depthAtCenter = biome.getDepth();
        for (int rx = -sampleRange; rx <= sampleRange; ++rx) {
            for (int rz = -sampleRange; rz <= sampleRange; ++rz) {
                biome = this.biomeSource.getBiomeForNoiseGen(x + rx, this.getSeaLevel(), z + rz);
                float depth = biome.getDepth();
                float scale = biome.getScale();
                if (this.amplified && depth > 0.0f) {
                    depth = 1.0f + depth * 2.0f;
                    scale = 1.0f + scale * 4.0f;
                }
                float weight = BIOME_WEIGHT_TABLE[rx + 2 + (rz + 2) * 5] / (depth + 2.0f);
                if (biome.getDepth() > depthAtCenter) {
                    weight /= 2.0f;
                }
                weightedScale += scale * weight;
                weightedDepth += depth * weight;
                totalWeight += weight;
            }
        }
        weightedScale /= totalWeight;
        weightedDepth /= totalWeight;
        weightedScale = weightedScale * 0.9f + 0.1f;
        weightedDepth = (weightedDepth * 4.0f - 1.0f) / 8.0f;
        if (this.biomeSource.getVersion().isNewerOrEqualTo(MCVersion.v1_16)) {
            depthAndScale[0] = (double)weightedDepth * 17.0 / 64.0;
            depthAndScale[1] = 96.0 / (double)weightedScale;
        } else {
            double noise = this.sampleNoise(x, z);
            depthAndScale[0] = (double)weightedDepth + noise;
            if (this.version.isOlderOrEqualTo(MCVersion.v1_13_2)) {
                depthAndScale[0] = (double)weightedDepth + noise * 0.2;
            }
            depthAndScale[1] = weightedScale;
        }
        return depthAndScale;
    }

    private double sampleNoise(int x, int z) {
        double noise = this.depthNoise.sample(x * 200, 10.0, z * 200, 1.0, 0.0, true);
        if (this.version.isOlderThan(MCVersion.v1_16)) {
            if (this.version.isNewerOrEqualTo(MCVersion.v1_15)) {
                noise *= 65535.0;
            }
            noise /= 8000.0;
        }
        double d = noise = noise < 0.0 ? -noise * 0.3 : noise;
        if (this.version.isNewerOrEqualTo(MCVersion.v1_16)) {
            if ((noise = noise * 3.0 * 65535.0 / 8000.0 - 2.0) < 0.0) {
                return 17.0 * noise / 28.0 / 64.0;
            }
            return Math.min(noise, 1.0) * 17.0 / 40.0 / 64.0;
        }
        noise = noise * 3.0 - 2.0;
        if (this.version.isOlderOrEqualTo(MCVersion.v1_13_2)) {
            if (noise < 0.0) {
                if ((noise /= 2.0) < -1.0) {
                    noise = -1.0;
                }
                noise /= 1.4;
                noise /= 2.0;
            } else {
                if (noise > 1.0) {
                    noise = 1.0;
                }
                noise /= 8.0;
            }
            return noise;
        }
        if (noise < 0.0) {
            return noise / 28.0;
        }
        return Math.min(noise, 1.0) / 40.0;
    }

    protected double computeNoiseFalloff(double depth, double scale, int y) {
        double fallOff = ((double)y - (8.5 + depth * 8.5 / 8.0 * 4.0)) * 12.0 * 128.0 / 256.0 / scale;
        if (fallOff < 0.0) {
            fallOff *= 4.0;
        }
        return fallOff;
    }

    public Block getBlockFromNoise(double noise, int y) {
        Block block = noise > 0.0 ? this.getDefaultBlock() : (y < this.getSeaLevel() ? this.getDefaultFluid() : Blocks.AIR);
        return block;
    }

    private static double getContribution(int x, int y, int z) {
        int offX = x + 12;
        int offY = y + 12;
        int offZ = z + 12;
        if (offX >= 0 && offX < 24) {
            if (offY >= 0 && offY < 24) {
                return offZ >= 0 && offZ < 24 ? (double)BEARD_KERNEL[offZ * 24 * 24 + offX * 24 + offY] : 0.0;
            }
            return 0.0;
        }
        return 0.0;
    }

    private static double computeContribution(int x, int y, int z) {
        double d0 = x * x + z * z;
        double d1 = (double)y + 0.5;
        double d2 = d1 * d1;
        double d3 = Math.pow(Math.E, -(d2 / 16.0 + d0 / 16.0));
        double d4 = -d1 * MathHelper.fastInvSqrt(d2 / 2.0 + d0 / 2.0) / 2.0;
        return d4 * d3;
    }

    static {
        for (int rx = -2; rx <= 2; ++rx) {
            for (int rz = -2; rz <= 2; ++rz) {
                float f;
                SurfaceGenerator.BIOME_WEIGHT_TABLE[rx + 2 + (rz + 2) * 5] = f = 10.0f / MathHelper.sqrt((float)(rx * rx + rz * rz) + 0.2f);
            }
        }
        for (int i = 0; i < 24; ++i) {
            for (int j = 0; j < 24; ++j) {
                for (int k = 0; k < 24; ++k) {
                    SurfaceGenerator.BEARD_KERNEL[i * 24 * 24 + j * 24 + k] = (float)SurfaceGenerator.computeContribution(j - 12, k - 12, i - 12);
                }
            }
        }
        SCALE_ADVANCE = LCG.JAVA.combine(2620L);
        SURFACE_ADVANCE = LCG.JAVA.combine(1048L);
    }
}

