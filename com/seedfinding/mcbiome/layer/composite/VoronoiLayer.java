/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.layer.composite;

import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.rand.seed.SeedMixer;
import com.seedfinding.mccore.rand.seed.WorldSeed;
import com.seedfinding.mccore.version.MCVersion;

public class VoronoiLayer
extends IntBiomeLayer {
    private final long seed;
    private final boolean is3D;

    public VoronoiLayer(MCVersion version, long worldSeed, boolean is3D, IntBiomeLayer parent) {
        super(version, worldSeed, version.isOlderThan(MCVersion.v1_15) ? 10L : 0L, parent);
        this.seed = version.isOlderThan(MCVersion.v1_15) ? worldSeed : WorldSeed.toHash(worldSeed);
        this.is3D = is3D;
    }

    private static double calcContribution(double[] d, int x, int z) {
        return ((double)x - d[1]) * ((double)x - d[1]) + ((double)z - d[0]) * ((double)z - d[0]);
    }

    private static double[] calcOffset(long layerSeed, int x, int z, int offX, int offZ) {
        long mixedSeed = SeedMixer.mixSeed(layerSeed, x + offX);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, z + offZ);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, x + offX);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, z + offZ);
        double d1 = ((double)((int)Math.floorMod(mixedSeed >> 24, 1024L)) / 1024.0 - 0.5) * 3.6 + (double)offX;
        mixedSeed = SeedMixer.mixSeed(mixedSeed, layerSeed);
        double d2 = ((double)((int)Math.floorMod(mixedSeed >> 24, 1024L)) / 1024.0 - 0.5) * 3.6 + (double)offZ;
        return new double[]{d1, d2};
    }

    private static double calcSquaredDistance(long seed, int x, int y, int z, double xFraction, double yFraction, double zFraction) {
        long mixedSeed = SeedMixer.mixSeed(seed, x);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, y);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, z);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, x);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, y);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, z);
        double d = VoronoiLayer.distribute(mixedSeed);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, seed);
        double e = VoronoiLayer.distribute(mixedSeed);
        mixedSeed = SeedMixer.mixSeed(mixedSeed, seed);
        double f = VoronoiLayer.distribute(mixedSeed);
        return VoronoiLayer.square(zFraction + f) + VoronoiLayer.square(yFraction + e) + VoronoiLayer.square(xFraction + d);
    }

    private static double distribute(long seed) {
        double d = (double)((int)Math.floorMod(seed >> 24, 1024L)) / 1024.0;
        return (d - 0.5) * 0.9;
    }

    private static double square(double d) {
        return d * d;
    }

    public long getSeed() {
        return this.seed;
    }

    public boolean is3D() {
        return this.is3D;
    }

    @Override
    public int sample(int x, int y, int z) {
        return this.getVersion().isOlderThan(MCVersion.v1_15) ? this.sample14minus(x, z) : this.sample15plus(x, y, z);
    }

    private int sample14minus(int x, int z) {
        int pX = (x -= 2) >> 2;
        int pZ = (z -= 2) >> 2;
        int sX = pX << 2;
        int sZ = pZ << 2;
        double[] off_0_0 = VoronoiLayer.calcOffset(this.layerSeed, sX, sZ, 0, 0);
        double[] off_1_0 = VoronoiLayer.calcOffset(this.layerSeed, sX, sZ, 4, 0);
        double[] off_0_1 = VoronoiLayer.calcOffset(this.layerSeed, sX, sZ, 0, 4);
        double[] off_1_1 = VoronoiLayer.calcOffset(this.layerSeed, sX, sZ, 4, 4);
        int cell = (z & 3) * 4 + (x & 3);
        double corner0 = VoronoiLayer.calcContribution(off_0_0, cell >> 2, cell & 3);
        double corner1 = VoronoiLayer.calcContribution(off_1_0, cell >> 2, cell & 3);
        double corner2 = VoronoiLayer.calcContribution(off_0_1, cell >> 2, cell & 3);
        double corner3 = VoronoiLayer.calcContribution(off_1_1, cell >> 2, cell & 3);
        int offset = corner0 < corner1 && corner0 < corner2 && corner0 < corner3 ? 0 : (corner1 < corner0 && corner1 < corner2 && corner1 < corner3 ? 1 : (corner2 < corner0 && corner2 < corner1 && corner2 < corner3 ? 2 : 3));
        return this.getParent(IntBiomeLayer.class).get(pX + (offset & 1), 0, pZ + (offset >> 1));
    }

    private int sample15plus(int x, int y, int z) {
        int i = x - 2;
        int j = y - 2;
        int k = z - 2;
        int l = i >> 2;
        int m = j >> 2;
        int n = k >> 2;
        double d = (double)(i & 3) / 4.0;
        double e = (double)(j & 3) / 4.0;
        double f = (double)(k & 3) / 4.0;
        double[] ds = new double[8];
        for (int cell = 0; cell < 8; ++cell) {
            boolean bl = (cell & 4) == 0;
            boolean bl2 = (cell & 2) == 0;
            boolean bl3 = (cell & 1) == 0;
            int aa = bl ? l : l + 1;
            int ab = bl2 ? m : m + 1;
            int ac = bl3 ? n : n + 1;
            double g = bl ? d : d - 1.0;
            double h = bl2 ? e : e - 1.0;
            double s = bl3 ? f : f - 1.0;
            ds[cell] = VoronoiLayer.calcSquaredDistance(this.seed, aa, ab, ac, g, h, s);
        }
        int index = 0;
        double min = ds[0];
        for (int cell = 1; cell < 8; ++cell) {
            if (ds[cell] >= min) continue;
            index = cell;
            min = ds[cell];
        }
        int xFinal = (index & 4) == 0 ? l : l + 1;
        int yFinal = (index & 2) == 0 ? m : m + 1;
        int zFinal = (index & 1) == 0 ? n : n + 1;
        return this.getParent(IntBiomeLayer.class).get(xFinal, this.is3D ? yFinal : 0, zFinal);
    }
}

