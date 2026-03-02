/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.util.math;

import com.seedfinding.mcmath.util.Mth;

@FunctionalInterface
public interface DistanceMetric {
    public static final DistanceMetric EUCLIDEAN_SQ = (x, y, z) -> x * x + y * y + z * z;
    public static final DistanceMetric EUCLIDEAN = (x, y, z) -> Math.sqrt(EUCLIDEAN_SQ.getDistance(x, y, z));
    public static final DistanceMetric MANHATTAN = (x, y, z) -> Math.abs(x) + Math.abs(y) + Math.abs(z);
    public static final DistanceMetric CHEBYSHEV = (x, y, z) -> Mth.max(Math.abs(x), Math.abs(y), Math.abs(z));

    public double getDistance(int var1, int var2, int var3);
}

