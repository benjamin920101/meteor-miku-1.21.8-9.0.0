/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcseed.rand;

import com.seedfinding.mcmath.util.Mth;
import com.seedfinding.mcseed.rand.IRand;
import java.util.concurrent.atomic.AtomicLong;

public class Xoroshiro128PlusPlus
implements IRand {
    public Seed128 seed;
    public static final long GOLDEN_RATIO_64 = -7046029254386353131L;
    public static final long SILVER_RATIO_64 = 7640891576956012809L;
    private static final AtomicLong SEED_UNIQUIFIER = new AtomicLong(8682522807148012L);
    private double nextNextGaussian;
    private boolean haveNextNextGaussian;

    public static long mixStafford13(long l) {
        l = (l ^ l >>> 30) * -4658895280553007687L;
        l = (l ^ l >>> 27) * -7723592293110705685L;
        return l ^ l >>> 31;
    }

    public static Seed128 upgradeSeedTo128bit(long seed) {
        long silverSeed = seed ^ 0x6A09E667F3BCC909L;
        long goldenSeed = silverSeed + -7046029254386353131L;
        return new Seed128(Xoroshiro128PlusPlus.mixStafford13(silverSeed), Xoroshiro128PlusPlus.mixStafford13(goldenSeed));
    }

    public static long seedUniquifier() {
        return SEED_UNIQUIFIER.updateAndGet(l -> l * 1181783497276652981L) ^ System.nanoTime();
    }

    public Xoroshiro128PlusPlus(long loSeed, long hiSeed) {
        this.seed = new Seed128(loSeed, hiSeed);
        if ((loSeed | hiSeed) == 0L) {
            this.seed = new Seed128(-7046029254386353131L, 7640891576956012809L);
        }
    }

    public Xoroshiro128PlusPlus(long seed) {
        this.seed = Xoroshiro128PlusPlus.upgradeSeedTo128bit(seed);
    }

    @Override
    public int nextInt() {
        return (int)this.nextLong();
    }

    @Override
    public int nextInt(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Bound must be positive");
        }
        long r = this.nextLong() & Mth.MASK_32;
        long lowerBits = (r *= (long)n) & Mth.MASK_32;
        if (lowerBits < (long)n) {
            int bound = Integer.remainderUnsigned(~n + 1, n);
            while (lowerBits < (long)bound) {
                r = this.nextLong() & Mth.MASK_32;
                lowerBits = (r *= (long)n) & Mth.MASK_32;
            }
        }
        return (int)(r >> 32);
    }

    @Override
    public boolean nextBoolean() {
        return (this.nextLong() & 1L) != 0L;
    }

    @Override
    public float nextFloat() {
        return (float)this.nextBits(24) * 5.9604645E-8f;
    }

    @Override
    public double nextDouble() {
        return (double)this.nextBits(53) * (double)1.110223E-16f;
    }

    public void consumeCount(int n) {
        for (int i = 0; i < n; ++i) {
            this.nextLong();
        }
    }

    @Override
    public double nextGaussian() {
        double v2;
        double v1;
        double s;
        if (this.haveNextNextGaussian) {
            this.haveNextNextGaussian = false;
            return this.nextNextGaussian;
        }
        while ((s = (v1 = 2.0 * this.nextDouble() - 1.0) * v1 + (v2 = 2.0 * this.nextDouble() - 1.0) * v2) >= 1.0 || s == 0.0) {
        }
        double multiplier = StrictMath.sqrt(-2.0 * StrictMath.log(s) / s);
        this.nextNextGaussian = v2 * multiplier;
        this.haveNextNextGaussian = true;
        return v1 * multiplier;
    }

    private long nextBits(int n) {
        return this.nextLong() >>> 64 - n;
    }

    @Override
    public long nextLong() {
        long lowSeed = this.seed.loSeed;
        long hiSeed = this.seed.hiSeed;
        long res = Long.rotateLeft(lowSeed + hiSeed, 17) + lowSeed;
        this.seed.loSeed = Long.rotateLeft(lowSeed, 49) ^ (hiSeed ^= lowSeed) ^ hiSeed << 21;
        this.seed.hiSeed = Long.rotateLeft(hiSeed, 28);
        return res;
    }

    public static class Seed128 {
        public long hiSeed;
        public long loSeed;

        public Seed128(long lo, long hi) {
            this.loSeed = lo;
            this.hiSeed = hi;
        }

        public String toString() {
            return "Seed128{hiSeed=" + this.hiSeed + ", loSeed=" + this.loSeed + '}';
        }
    }
}

