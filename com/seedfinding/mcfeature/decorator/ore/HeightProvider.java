/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.decorator.ore;

import com.seedfinding.mcseed.rand.JRand;
import java.util.function.Function;

public interface HeightProvider {
    public static HeightProvider range(int bottomOffset, int topOffset, int maximumY) {
        return rand -> rand.nextInt(maximumY - topOffset) + bottomOffset;
    }

    public static HeightProvider depthAverage(int baseline, int spread) {
        return rand -> rand.nextInt(spread) + rand.nextInt(spread) - spread + baseline;
    }

    public static HeightProvider uniformRange(int minOffset, int maxOffset) {
        return rand -> {
            if (minOffset > maxOffset) {
                return minOffset;
            }
            return MathHelper.nextBetween(rand, minOffset, maxOffset);
        };
    }

    public static HeightProvider triangleRange(int minOffset, int maxOffset) {
        return rand -> {
            if (minOffset > maxOffset) {
                return minOffset;
            }
            int range = maxOffset - minOffset;
            if (range <= 0) {
                return MathHelper.nextBetween(rand, minOffset, maxOffset);
            }
            int midPoint = range / 2;
            int midPoint2 = range - midPoint;
            return minOffset + MathHelper.nextBetween(rand, 0, midPoint2) + MathHelper.nextBetween(rand, 0, midPoint);
        };
    }

    public static HeightProvider spreadRange(int baseValue, int spread) {
        return rand -> spread == 0 ? baseValue : baseValue + rand.nextInt(spread + 1);
    }

    public static HeightProvider custom(Function<JRand, Integer> func) {
        return func::apply;
    }

    public int getY(JRand var1);

    public static class MathHelper {
        static int nextBetween(JRand rand, int min, int max) {
            return rand.nextInt(max - min + 1) + min;
        }
    }
}

