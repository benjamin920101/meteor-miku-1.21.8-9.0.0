/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.source;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.source.EndBiomeSource;
import com.seedfinding.mcbiome.source.NetherBiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mcbiome.source.StaticNoiseSource;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcseed.rand.JRand;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public abstract class BiomeSource {
    private final StaticNoiseSource staticNoiseSource;
    private final MCVersion version;
    private final long worldSeed;

    public BiomeSource(MCVersion version, long worldSeed) {
        this.version = version;
        this.worldSeed = worldSeed;
        this.staticNoiseSource = new StaticNoiseSource(worldSeed);
    }

    public StaticNoiseSource getStaticNoiseSource() {
        return this.staticNoiseSource;
    }

    public static Factory factory(Dimension dimension) {
        if (dimension == Dimension.OVERWORLD) {
            return OverworldBiomeSource::new;
        }
        if (dimension == Dimension.NETHER) {
            return NetherBiomeSource::new;
        }
        if (dimension == Dimension.END) {
            return EndBiomeSource::new;
        }
        return null;
    }

    public static BiomeSource of(Dimension dimension, MCVersion version, long worldSeed) {
        Factory factory = BiomeSource.factory(dimension);
        return factory == null ? null : factory.create(version, worldSeed);
    }

    public MCVersion getVersion() {
        return this.version;
    }

    public long getWorldSeed() {
        return this.worldSeed;
    }

    public abstract Dimension getDimension();

    public abstract Biome getBiome(BPos var1);

    public abstract Biome getBiome(int var1, int var2, int var3);

    public abstract Biome getBiomeForNoiseGen(int var1, int var2, int var3);

    public boolean iterateUniqueBiomes(int x, int y, int z, int radius, Predicate<Biome> shouldContinue) {
        int i = x - radius >> 2;
        int j = y - radius >> 2;
        int k = z - radius >> 2;
        int l = x + radius >> 2;
        int m = y + radius >> 2;
        int n = z + radius >> 2;
        int o = l - i + 1;
        int p = m - j + 1;
        int q = n - k + 1;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int r = 0; r < q; ++r) {
            for (int s = 0; s < o; ++s) {
                for (int t = 0; t < p; ++t) {
                    int u = i + s;
                    int v = j + t;
                    int w = k + r;
                    Biome b = this.getBiomeForNoiseGen(u, v, w);
                    if (!set.contains(b.getId()) && !shouldContinue.test(b)) {
                        return false;
                    }
                    set.add(b.getId());
                }
            }
        }
        return true;
    }

    public boolean iterateUniqueBiomes(int x, int z, int radius, Predicate<Biome> shouldContinue) {
        int i = x - radius >> 2;
        int k = z - radius >> 2;
        int l = x + radius >> 2;
        int n = z + radius >> 2;
        int o = l - i + 1;
        int q = n - k + 1;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int r = 0; r < q; ++r) {
            for (int s = 0; s < o; ++s) {
                int u = i + s;
                int w = k + r;
                Biome b = this.getBiomeForNoiseGen(u, 0, w);
                if (!set.contains(b.getId()) && !shouldContinue.test(b)) {
                    return false;
                }
                set.add(b.getId());
            }
        }
        return true;
    }

    public BPos locateNearestBiome(int centerX, int centerY, int centerZ, int radius, Collection<Biome> biomes, JRand rand) {
        return this.locateBiome(centerX, centerY, centerZ, radius, 1, biomes, rand, true);
    }

    public BPos locateBiome(int centerX, int centerY, int centerZ, int radius, Collection<Biome> biomes, JRand rand) {
        return this.locateBiome(centerX, centerY, centerZ, radius, 1, biomes, rand, false);
    }

    public BPos locateBiome(int centerX, int centerY, int centerZ, int radius, int increment, Collection<Biome> biomes, JRand rand, boolean checkByLayer) {
        centerX >>= 2;
        centerZ >>= 2;
        centerY >>= 2;
        BPos pos = null;
        int s = checkByLayer ? 0 : (radius >>= 2);
        int bound = 0;
        for (int depth = s; depth <= radius; depth += increment) {
            for (int oz = -depth; oz <= depth; oz += increment) {
                boolean isZEdge = Math.abs(oz) == depth;
                for (int ox = -depth; ox <= depth; ox += increment) {
                    int z;
                    int x;
                    if (checkByLayer) {
                        boolean isXEdge;
                        boolean bl = isXEdge = Math.abs(ox) == depth;
                        if (!isXEdge && !isZEdge) continue;
                    }
                    if (!biomes.contains(this.getBiomeForNoiseGen(x = centerX + ox, centerY, z = centerZ + oz))) continue;
                    if (pos == null || rand.nextInt(bound + 1) == 0) {
                        pos = new BPos(x << 2, centerY, z << 2);
                        if (checkByLayer) {
                            return pos;
                        }
                        if (this.getVersion().isOlderOrEqualTo(MCVersion.v1_12_2)) {
                            ++bound;
                        }
                    }
                    if (!this.getVersion().isNewerOrEqualTo(MCVersion.v1_13)) continue;
                    ++bound;
                }
            }
        }
        return pos;
    }

    public BPos locateBiome12(int posX, int posZ, int radius, Collection<Biome> biomes, JRand rand) {
        int lowerX = posX - radius >> 2;
        int lowerZ = posZ - radius >> 2;
        int upperX = posX + radius >> 2;
        int upperZ = posZ + radius >> 2;
        int counter = 0;
        BPos pos = null;
        for (int z = lowerZ; z <= upperZ; ++z) {
            for (int x = lowerX; x <= upperX; ++x) {
                Biome biome = this.getBiomeForNoiseGen(x, 0, z);
                if (!biomes.contains(biome) || pos != null && rand.nextInt(counter + 1) != 0) continue;
                pos = new BPos(x << 2, 0, z << 2);
                ++counter;
            }
        }
        return pos;
    }

    @FunctionalInterface
    public static interface Factory {
        public BiomeSource create(MCVersion var1, long var2);
    }
}

