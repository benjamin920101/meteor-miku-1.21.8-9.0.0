/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcmath.util;

import java.math.BigInteger;

public final class Mth {
    public static final int MASK_8 = (int)Mth.getMask(8);
    public static final int MASK_16 = (int)Mth.getMask(16);
    public static final long MASK_32 = Mth.getMask(32);
    public static final long MASK_48 = Mth.getMask(48);

    public static boolean isPowerOf2(long value) {
        return (value & -value) == value;
    }

    public static boolean isPowerOf2(BigInteger value) {
        return value.and(value.subtract(BigInteger.ONE)).equals(BigInteger.ZERO);
    }

    public static long getPow2(int bits) {
        return 1L << bits;
    }

    public static BigInteger getBigPow2(int bits) {
        return BigInteger.ONE.shiftLeft(bits);
    }

    public static long getMask(int bits) {
        return bits >= 64 ? -1L : Mth.getPow2(bits) - 1L;
    }

    public static BigInteger getBigMask(int bits) {
        return Mth.getBigPow2(bits).subtract(BigInteger.ONE);
    }

    public static long mask(long value, int bits) {
        return value & Mth.getMask(bits);
    }

    public static BigInteger bigMask(BigInteger value, int bits) {
        return value.and(Mth.getBigMask(bits));
    }

    public static long maskSigned(long value, int bits) {
        return value << 64 - bits >> 64 - bits;
    }

    public static long modInverse(long value) {
        return Mth.modInverse(value, 64);
    }

    @Deprecated
    public static long modInverseOld(long value, int bits) {
        long x = ((value << 1 ^ value) & 4L) << 1 ^ value;
        x += x - value * x * x;
        x += x - value * x * x;
        x += x - value * x * x;
        x += x - value * x * x;
        return Mth.mask(x, bits);
    }

    public static long modInverse(long value, int bits) {
        long x = ((value << 1 ^ value) & 4L) << 1 ^ value;
        x *= 2L - value * x;
        x *= 2L - value * x;
        x *= 2L - value * x;
        x *= 2L - value * x;
        return Mth.mask(x, bits);
    }

    public static int min(int ... values) {
        int min = values[0];
        for (int i = 1; i < values.length; ++i) {
            min = Math.min(min, values[i]);
        }
        return min;
    }

    public static float min(float ... values) {
        float min = values[0];
        for (int i = 1; i < values.length; ++i) {
            min = Math.min(min, values[i]);
        }
        return min;
    }

    public static long min(long ... values) {
        long min = values[0];
        for (int i = 1; i < values.length; ++i) {
            min = Math.min(min, values[i]);
        }
        return min;
    }

    public static double min(double ... values) {
        double min = values[0];
        for (int i = 1; i < values.length; ++i) {
            min = Math.min(min, values[i]);
        }
        return min;
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T getMin(T ... values) {
        T min = values[0];
        for (int i = 1; i < values.length; ++i) {
            min = min.compareTo(values[i]) <= 0 ? min : values[i];
        }
        return min;
    }

    public static int max(int ... values) {
        int max = values[0];
        for (int i = 1; i < values.length; ++i) {
            max = Math.max(max, values[i]);
        }
        return max;
    }

    public static float max(float ... values) {
        float max = values[0];
        for (int i = 1; i < values.length; ++i) {
            max = Math.max(max, values[i]);
        }
        return max;
    }

    public static long max(long ... values) {
        long max = values[0];
        for (int i = 1; i < values.length; ++i) {
            max = Math.max(max, values[i]);
        }
        return max;
    }

    public static double max(double ... values) {
        double max = values[0];
        for (int i = 1; i < values.length; ++i) {
            max = Math.max(max, values[i]);
        }
        return max;
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T getMax(T ... values) {
        T max = values[0];
        for (int i = 1; i < values.length; ++i) {
            max = max.compareTo(values[i]) >= 0 ? max : values[i];
        }
        return max;
    }

    public static int clamp(int value, int min, int max) {
        if (value < min) {
            return min;
        }
        return Math.min(value, max);
    }

    public static float clamp(float value, float min, float max) {
        if (value < min) {
            return min;
        }
        return Math.min(value, max);
    }

    public static long clamp(long value, long min, long max) {
        if (value < min) {
            return min;
        }
        return Math.min(value, max);
    }

    public static double clamp(double value, double min, double max) {
        if (value < min) {
            return min;
        }
        return Math.min(value, max);
    }

    public static <T extends Comparable<T>> T clamp(T value, T min, T max) {
        if (value.compareTo(min) < 0) {
            return min;
        }
        return value.compareTo(max) <= 0 ? value : max;
    }
}

