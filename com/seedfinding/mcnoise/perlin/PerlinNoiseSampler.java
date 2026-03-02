/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcnoise.perlin;

import com.seedfinding.mccore.util.data.Triplet;
import com.seedfinding.mcnoise.noise.Noise;
import com.seedfinding.mcnoise.utils.MathHelper;
import com.seedfinding.mcseed.rand.JRand;

public class PerlinNoiseSampler
extends Noise {
    public PerlinNoiseSampler(JRand rand) {
        super(rand);
    }

    public double sample(double x, double y, double z, double yAmplification, double minY) {
        Triplet<int[], double[], double[]> args = this.getArgs(x, y, z, yAmplification, minY);
        int[] section = args.getFirst();
        double[] local = args.getSecond();
        double[] fading = args.getThird();
        double[] perms = this.samplePermutations(section, local);
        return MathHelper.lerp3(fading[0], fading[1], fading[2], perms[0], perms[1], perms[2], perms[3], perms[4], perms[5], perms[6], perms[7]);
    }

    public Triplet<int[], double[], double[]> getArgs(double x, double y, double z, double yAmplification, double minY) {
        double offsetX = x + this.originX;
        double offsetY = y + this.originY;
        double offsetZ = z + this.originZ;
        int sectionX = MathHelper.floor(offsetX);
        int sectionY = MathHelper.floor(offsetY);
        int sectionZ = MathHelper.floor(offsetZ);
        double localX = offsetX - (double)sectionX;
        double localY = offsetY - (double)sectionY;
        double localZ = offsetZ - (double)sectionZ;
        double fadeLocalX = MathHelper.smoothStep(localX);
        double fadeLocalY = MathHelper.smoothStep(localY);
        double fadeLocalZ = MathHelper.smoothStep(localZ);
        if (yAmplification != 0.0) {
            double yFloor = Math.min(minY, localY);
            localY -= (double)MathHelper.floor(yFloor / yAmplification) * yAmplification;
        }
        return new Triplet<int[], double[], double[]>(new int[]{sectionX, sectionY, sectionZ}, new double[]{localX, localY, localZ}, new double[]{fadeLocalX, fadeLocalY, fadeLocalZ});
    }

    public double[] samplePermutations(int[] section, double[] local) {
        int pXY = this.lookup(section[0]) + section[1];
        int pX1Y = this.lookup(section[0] + 1) + section[1];
        int ppXYZ = this.lookup(pXY) + section[2];
        int ppX1YZ = this.lookup(pX1Y) + section[2];
        int ppXY1Z = this.lookup(pXY + 1) + section[2];
        int ppX1Y1Z = this.lookup(pX1Y + 1) + section[2];
        double x1 = MathHelper.grad(this.lookup(ppXYZ), local[0], local[1], local[2]);
        double x2 = MathHelper.grad(this.lookup(ppX1YZ), local[0] - 1.0, local[1], local[2]);
        double x3 = MathHelper.grad(this.lookup(ppXY1Z), local[0], local[1] - 1.0, local[2]);
        double x4 = MathHelper.grad(this.lookup(ppX1Y1Z), local[0] - 1.0, local[1] - 1.0, local[2]);
        double x5 = MathHelper.grad(this.lookup(ppXYZ + 1), local[0], local[1], local[2] - 1.0);
        double x6 = MathHelper.grad(this.lookup(ppX1YZ + 1), local[0] - 1.0, local[1], local[2] - 1.0);
        double x7 = MathHelper.grad(this.lookup(ppXY1Z + 1), local[0], local[1] - 1.0, local[2] - 1.0);
        double x8 = MathHelper.grad(this.lookup(ppX1Y1Z + 1), local[0] - 1.0, local[1] - 1.0, local[2] - 1.0);
        return new double[]{x1, x2, x3, x4, x5, x6, x7, x8};
    }
}

