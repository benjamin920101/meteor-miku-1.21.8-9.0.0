/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcnoise.noise;

import com.seedfinding.mcseed.lcg.LCG;

public interface NoiseSampler {
    public static final LCG SKIP_262 = LCG.JAVA.combine(262L);

    public double sample(double var1, double var3, double var5, double var7);
}

