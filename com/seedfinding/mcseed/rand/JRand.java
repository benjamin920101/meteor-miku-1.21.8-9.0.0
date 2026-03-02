/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcseed.rand;

import com.seedfinding.mcseed.lcg.LCG;
import com.seedfinding.mcseed.rand.CombinedJRand;
import com.seedfinding.mcseed.rand.IRand;
import com.seedfinding.mcseed.rand.Rand;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.RandomAccess;

public class JRand
extends Rand
implements IRand {
    private static final double DOUBLE_UNIT = (double)1.110223E-16f;
    private double nextNextGaussian;
    private boolean haveNextNextGaussian;

    protected JRand(LCG lcg, long seed) {
        super(lcg, seed);
    }

    protected JRand(LCG lcg, long seed, boolean scramble) {
        super(lcg);
        this.setSeed(seed, scramble);
    }

    public JRand(long seed) {
        this(LCG.JAVA, seed, true);
    }

    public JRand(long seed, boolean scramble) {
        super(LCG.JAVA);
        this.setSeed(seed, scramble);
    }

    public static JRand ofInternalSeed(long seed) {
        return new JRand(seed, false);
    }

    public static JRand ofScrambledSeed(long seed) {
        return new JRand(seed, true);
    }

    public static boolean nextBoolean(long seed) {
        return (seed >>> 47 & 1L) == 1L;
    }

    public static int nextInt(long seed) {
        return (int)(seed >>> 16);
    }

    public static int nextInt(long seed, int bound) {
        int value;
        int bits;
        if (bound <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        if ((bound & -bound) == bound) {
            return (int)((long)bound * seed >> 31);
        }
        do {
            bits = (int)(seed >>> 17);
            value = bits % bound;
            seed = LCG.JAVA.nextSeed(seed);
        } while (bits - value + (bound - 1) < 0);
        return value;
    }

    public static float nextFloat(long seed) {
        return (float)((int)(seed >>> 24)) / 1.6777216E7f;
    }

    public static long nextLong(long seed) {
        return (seed >>> 16 << 32) + (long)((int)(LCG.JAVA.nextSeed(seed) >>> 16));
    }

    public static double nextDouble(long seed) {
        return (double)(((long)((int)(seed >>> 22)) << 27) + (long)((int)(LCG.JAVA.nextSeed(seed) >>> 21))) * (double)1.110223E-16f;
    }

    public static void shuffle(List<?> list, JRand rand) {
        rand.shuffle(list);
    }

    public static void swap(Object[] arr, int i, int j) {
        Object tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(List<?> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    @Override
    public void setSeed(long seed) {
        this.setSeed(seed, true);
    }

    public void setSeed(long seed, boolean scramble) {
        if (scramble) {
            super.setSeed(seed ^ LCG.JAVA.multiplier);
        } else {
            super.setSeed(seed);
        }
    }

    public int next(int bits) {
        return (int)this.nextBits(bits);
    }

    @Override
    public boolean nextBoolean() {
        return this.next(1) == 1;
    }

    @Override
    public int nextInt() {
        return this.next(32);
    }

    @Override
    public int nextInt(int bound) {
        int value;
        int bits;
        if (bound <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        if ((bound & -bound) == bound) {
            return (int)((long)bound * (long)this.next(31) >> 31);
        }
        while ((bits = this.next(31)) - (value = bits % bound) + (bound - 1) < 0) {
        }
        return value;
    }

    @Override
    public float nextFloat() {
        return (float)this.next(24) / 1.6777216E7f;
    }

    @Override
    public long nextLong() {
        return ((long)this.next(32) << 32) + (long)this.next(32);
    }

    @Override
    public double nextDouble() {
        return (double)(((long)this.next(26) << 27) + (long)this.next(27)) * (double)1.110223E-16f;
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

    public void shuffle(List<?> list) {
        int size = list.size();
        if (size < 5 || list instanceof RandomAccess) {
            for (int i = size; i > 1; --i) {
                JRand.swap(list, i - 1, this.nextInt(i));
            }
        } else {
            Object[] arr = list.toArray();
            for (int i = size; i > 1; --i) {
                JRand.swap(arr, i - 1, this.nextInt(i));
            }
            ListIterator<?> it = list.listIterator();
            for (Object e : arr) {
                it.next();
                it.set(e);
            }
        }
    }

    public CombinedJRand combine(long steps) {
        return new CombinedJRand(steps, this.getSeed(), false);
    }

    public JRand copy() {
        return new JRand(this.getSeed(), false);
    }

    public Random asRandomView() {
        return new RandomWrapper(this);
    }

    public Debugger asDebugger() {
        return new Debugger(this);
    }

    public Random copyToRandom() {
        return this.copy().asRandomView();
    }

    public Random toRandom() {
        return new Random(this.getSeed() ^ LCG.JAVA.multiplier);
    }

    public static final class Debugger
    extends JRand {
        private final JRand delegate;
        private long globalCounter;
        private long nextIntSkip;
        private boolean hasCalledAdvance;

        public Debugger(JRand delegate) {
            super(delegate.getLcg(), delegate.getSeed());
            this.delegate = delegate;
            this.globalCounter = 0L;
            this.nextIntSkip = 0L;
        }

        @Override
        public long nextSeed() {
            if (this.delegate != null) {
                ++this.globalCounter;
                return this.delegate.nextSeed();
            }
            return super.nextSeed();
        }

        @Override
        public void advance(long calls) {
            if (this.delegate != null) {
                this.globalCounter += calls;
                this.hasCalledAdvance = true;
                this.delegate.advance(calls);
            } else {
                super.advance(calls);
            }
        }

        @Override
        public int nextInt(int bound) {
            if (this.delegate != null) {
                int value;
                int bits;
                if (bound <= 0) {
                    throw new IllegalArgumentException("bound must be positive");
                }
                if ((bound & -bound) == bound) {
                    ++this.globalCounter;
                    return (int)((long)bound * (long)this.delegate.next(31) >> 31);
                }
                long oldCounter = this.globalCounter;
                do {
                    ++this.globalCounter;
                } while ((bits = this.delegate.next(31)) - (value = bits % bound) + (bound - 1) < 0);
                this.nextIntSkip += this.globalCounter - oldCounter - 1L;
                return value;
            }
            return super.nextInt(bound);
        }

        @Override
        public int next(int bits) {
            if (this.delegate != null) {
                ++this.globalCounter;
                return this.delegate.next(bits);
            }
            return super.next(bits);
        }

        @Override
        public void advance(LCG lcg) {
            if (this.delegate != null) {
                long old = this.getSeed();
                this.delegate.advance(lcg);
                if (this.hasCalledAdvance) {
                    this.hasCalledAdvance = false;
                } else {
                    this.globalCounter += LCG.JAVA.distance(old, this.getSeed()) - 1L;
                }
            } else {
                super.advance(lcg);
            }
        }

        @Override
        public long getSeed() {
            if (this.delegate != null) {
                return this.delegate.getSeed();
            }
            return super.getSeed();
        }

        @Override
        public void setSeed(long seed) {
            if (this.delegate != null) {
                this.globalCounter = 0L;
                this.delegate.setSeed(seed);
            } else {
                super.setSeed(seed, false);
            }
        }

        public long getGlobalCounter() {
            return this.globalCounter;
        }

        public long getNextIntSkip() {
            return this.nextIntSkip;
        }
    }

    private static final class RandomWrapper
    extends Random {
        private final JRand delegate;

        private RandomWrapper(JRand delegate) {
            this.delegate = delegate;
        }

        @Override
        protected int next(int bits) {
            return this.delegate.next(bits);
        }

        @Override
        public void setSeed(long seed) {
            this.delegate.setSeed(seed);
        }
    }
}

