/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcnoise.utils;

public class MathHelper {
    public static final int[][] GRADIENTS = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}, {1, 1, 0}, {0, -1, 1}, {-1, 1, 0}, {0, -1, -1}};

    public static double grad(int hash, double x, double y, double z) {
        switch (hash & 0xF) {
            case 0: {
                return x + y;
            }
            case 1: {
                return -x + y;
            }
            case 2: {
                return x - y;
            }
            case 3: {
                return -x - y;
            }
            case 4: {
                return x + z;
            }
            case 5: {
                return -x + z;
            }
            case 6: {
                return x - z;
            }
            case 7: {
                return -x - z;
            }
            case 8: {
                return y + z;
            }
            case 9: 
            case 13: {
                return -y + z;
            }
            case 10: {
                return y - z;
            }
            case 11: 
            case 15: {
                return -y - z;
            }
            case 12: {
                return y + x;
            }
            case 14: {
                return y - x;
            }
        }
        return 0.0;
    }

    public static long lfloor(double d) {
        long l = (long)d;
        return d < (double)l ? l - 1L : l;
    }

    public static double dot(int[] g, double x, double y, double z) {
        return (double)g[0] * x + (double)g[1] * y + (double)g[2] * z;
    }

    public static double lerp3(double deltaX, double deltaY, double deltaZ, double val000, double val100, double val010, double val110, double val001, double val101, double val011, double val111) {
        return MathHelper.lerp(deltaZ, MathHelper.lerp2(deltaX, deltaY, val000, val100, val010, val110), MathHelper.lerp2(deltaX, deltaY, val001, val101, val011, val111));
    }

    public static double lerp2(double deltaX, double deltaY, double val00, double val10, double val01, double val11) {
        return MathHelper.lerp(deltaY, MathHelper.lerp(deltaX, val00, val10), MathHelper.lerp(deltaX, val01, val11));
    }

    public static double lerp(double delta, double start, double end) {
        return start + delta * (end - start);
    }

    public static double smoothStep(double d) {
        return d * d * d * (d * (d * 6.0 - 15.0) + 10.0);
    }

    public static int floor(double d) {
        int i = (int)d;
        return d < (double)i ? i - 1 : i;
    }

    public static double maintainPrecision(double d) {
        return d - (double)MathHelper.lfloor(d / 3.3554432E7 + 0.5) * 3.3554432E7;
    }
}

