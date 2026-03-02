/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.rand.seed;

import com.seedfinding.mcmath.util.Mth;
import com.seedfinding.mcseed.lcg.LCG;

public class SeedMixer {
    public static final long A = LCG.MMIX.multiplier;
    public static final long B = LCG.MMIX.addend;
    public static final long MAGIC = -B * Mth.modInverse(A);
    public final long salt;
    public final int steps;

    public SeedMixer(long salt) {
        this(salt, 1);
    }

    protected SeedMixer(long salt, int steps) {
        this.salt = salt;
        this.steps = steps;
    }

    public static long getOtherSolution(long seed) {
        return MAGIC - seed;
    }

    public static long mixSeed(long seed, long salt) {
        seed *= seed * A + B;
        return seed += salt;
    }

    public static long unmixSeed(long seed, long salt, Solution solution) {
        if ((seed - salt & 1L) == 1L) {
            throw new UnsupportedOperationException("Seed " + seed + " is unreachable with salt " + salt);
        }
        long r = solution.ordinal();
        for (int j = 1; j < 64; j <<= 1) {
            r -= (A * r * r + B * r + salt - seed) * Mth.modInverse(2L * A * r + B, 64);
        }
        return r;
    }

    public long nextSeed(long seed) {
        if (this.steps >= 0) {
            for (int i = 0; i < this.steps; ++i) {
                seed = SeedMixer.mixSeed(seed, this.salt);
            }
        } else {
            for (int i = 0; i < -this.steps; ++i) {
                seed = SeedMixer.unmixSeed(seed, this.salt, Solution.EVEN);
            }
        }
        return seed;
    }

    public SeedMixer combine(int steps) {
        return new SeedMixer(this.salt, steps);
    }

    public static enum Solution {
        EVEN,
        ODD;


        public static Solution of(long n) {
            return Solution.values()[(int)(n & 1L)];
        }
    }
}

