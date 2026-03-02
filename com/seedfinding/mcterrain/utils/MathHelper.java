/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcterrain.utils;

public class MathHelper {
    public static double clampedLerp(double first, double second, double delta) {
        if (delta < 0.0) {
            return first;
        }
        return delta > 1.0 ? second : com.seedfinding.mcnoise.utils.MathHelper.lerp(delta, first, second);
    }

    public static float sqrt(float f) {
        return (float)Math.sqrt(f);
    }

    public static double clamp(double value, double min, double max) {
        if (value < min) {
            return min;
        }
        return Math.min(value, max);
    }

    public static double fastInvSqrt(double d) {
        double half = 0.5 * d;
        long bits = Double.doubleToRawLongBits(d);
        bits = 6910469410427058090L - (bits >> 1);
        d = Double.longBitsToDouble(bits);
        return d * (1.5 - half * d * d);
    }
}

