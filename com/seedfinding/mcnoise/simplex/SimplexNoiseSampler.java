/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcnoise.simplex;

import com.seedfinding.mcnoise.noise.Noise;
import com.seedfinding.mcnoise.utils.MathHelper;
import com.seedfinding.mcseed.rand.JRand;

public class SimplexNoiseSampler
extends Noise {
    private static final double SQRT_3 = Math.sqrt(3.0);
    private static final double SKEW_FACTOR_2D = 0.5 * (SQRT_3 - 1.0);
    private static final double UNSKEW_FACTOR_2D = (3.0 - SQRT_3) / 6.0;
    private static final double F3 = 0.3333333333333333;
    private static final double G3 = 0.16666666666666666;

    public SimplexNoiseSampler(JRand rand) {
        super(rand);
    }

    public double sample2D(double x, double y) {
        int offsetSecondCornerZ;
        int offsetSecondCornerX;
        double diffZToXz;
        double y0;
        int hairyZ;
        double mixedHairyXz;
        double hairyFactor = (x + y) * SKEW_FACTOR_2D;
        int hairyX = MathHelper.floor(x + hairyFactor);
        double diffXToXz = (double)hairyX - (mixedHairyXz = (double)(hairyX + (hairyZ = MathHelper.floor(y + hairyFactor))) * UNSKEW_FACTOR_2D);
        double x0 = x - diffXToXz;
        if (x0 > (y0 = y - (diffZToXz = (double)hairyZ - mixedHairyXz))) {
            offsetSecondCornerX = 1;
            offsetSecondCornerZ = 0;
        } else {
            offsetSecondCornerX = 0;
            offsetSecondCornerZ = 1;
        }
        double x1 = x0 - (double)offsetSecondCornerX + UNSKEW_FACTOR_2D;
        double y1 = y0 - (double)offsetSecondCornerZ + UNSKEW_FACTOR_2D;
        double x3 = x0 - 1.0 + 2.0 * UNSKEW_FACTOR_2D;
        double y3 = y0 - 1.0 + 2.0 * UNSKEW_FACTOR_2D;
        int ii = hairyX & 0xFF;
        int jj = hairyZ & 0xFF;
        int gi0 = this.lookup(ii + this.lookup(jj)) % 12;
        int gi1 = this.lookup(ii + offsetSecondCornerX + this.lookup(jj + offsetSecondCornerZ)) % 12;
        int gi2 = this.lookup(ii + 1 + this.lookup(jj + 1)) % 12;
        double t0 = this.cornerNoise3d(gi0, x0, y0, 0.0, 0.5);
        double t1 = this.cornerNoise3d(gi1, x1, y1, 0.0, 0.5);
        double t2 = this.cornerNoise3d(gi2, x3, y3, 0.0, 0.5);
        return 70.0 * (t0 + t1 + t2);
    }

    public double sample3D(double x, double y, double z) {
        int k2;
        int j2;
        int i2;
        int k1;
        int j1;
        int i1;
        double skewFactor = (x + y + z) * 0.3333333333333333;
        int i = MathHelper.floor(x + skewFactor);
        int j = MathHelper.floor(y + skewFactor);
        int k = MathHelper.floor(z + skewFactor);
        double unskewFactor = (double)(i + j + k) * 0.16666666666666666;
        double x0 = (double)i - unskewFactor;
        double y0 = (double)j - unskewFactor;
        double z0 = (double)k - unskewFactor;
        x0 = x - x0;
        y0 = y - y0;
        z0 = z - z0;
        if (x0 >= y0) {
            if (y0 >= z0) {
                i1 = 1;
                j1 = 0;
                k1 = 0;
                i2 = 1;
                j2 = 1;
                k2 = 0;
            } else if (x0 >= z0) {
                i1 = 1;
                j1 = 0;
                k1 = 0;
                i2 = 1;
                j2 = 0;
                k2 = 1;
            } else {
                i1 = 0;
                j1 = 0;
                k1 = 1;
                i2 = 1;
                j2 = 0;
                k2 = 1;
            }
        } else if (y0 < z0) {
            i1 = 0;
            j1 = 0;
            k1 = 1;
            i2 = 0;
            j2 = 1;
            k2 = 1;
        } else if (x0 < z0) {
            i1 = 0;
            j1 = 1;
            k1 = 0;
            i2 = 0;
            j2 = 1;
            k2 = 1;
        } else {
            i1 = 0;
            j1 = 1;
            k1 = 0;
            i2 = 1;
            j2 = 1;
            k2 = 0;
        }
        double x1 = x0 - (double)i1 + 0.16666666666666666;
        double y1 = y0 - (double)j1 + 0.16666666666666666;
        double z1 = z0 - (double)k1 + 0.16666666666666666;
        double x2 = x0 - (double)i2 + 0.3333333333333333;
        double y2 = y0 - (double)j2 + 0.3333333333333333;
        double z2 = z0 - (double)k2 + 0.3333333333333333;
        double x3 = x0 - 1.0 + 0.5;
        double y3 = y0 - 1.0 + 0.5;
        double z3 = z0 - 1.0 + 0.5;
        int ii = i & 0xFF;
        int jj = j & 0xFF;
        int kk = k & 0xFF;
        int gi0 = this.lookup(ii + this.lookup(jj + this.lookup(kk))) % 12;
        int gi1 = this.lookup(ii + i1 + this.lookup(jj + j1 + this.lookup(kk + k1))) % 12;
        int gi2 = this.lookup(ii + i2 + this.lookup(jj + j2 + this.lookup(kk + k2))) % 12;
        int gi3 = this.lookup(ii + 1 + this.lookup(jj + 1 + this.lookup(kk + 1))) % 12;
        double t0 = this.cornerNoise3d(gi0, x0, y0, z0, 0.6);
        double t1 = this.cornerNoise3d(gi1, x1, y1, z1, 0.6);
        double t2 = this.cornerNoise3d(gi2, x2, y2, z2, 0.6);
        double t3 = this.cornerNoise3d(gi3, x3, y3, z3, 0.6);
        return 32.0 * (t0 + t1 + t2 + t3);
    }

    private double cornerNoise3d(int hash, double x, double y, double z, double max) {
        double result;
        double contribution = max - x * x - y * y - z * z;
        if (contribution < 0.0) {
            result = 0.0;
        } else {
            contribution *= contribution;
            result = contribution * contribution * MathHelper.grad(hash, x, y, z);
        }
        return result;
    }
}

