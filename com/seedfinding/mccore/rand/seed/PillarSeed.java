/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.rand.seed;

import com.seedfinding.mccore.util.data.SeedIterator;
import com.seedfinding.mcmath.util.Mth;
import com.seedfinding.mcseed.lcg.LCG;
import com.seedfinding.mcseed.rand.JRand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PillarSeed {
    private static final LCG SKIP_2 = LCG.JAVA.combine(2L);
    private static final LCG BACK_2 = LCG.JAVA.combine(-2L);

    public static long fromStructureSeed(long structureSeed) {
        return SKIP_2.nextSeed(structureSeed ^ LCG.JAVA.multiplier) >>> 16 & (long)Mth.MASK_16;
    }

    public static SeedIterator getStructureSeeds(long pillarSeed) {
        return new SeedIterator(0L, 0x100000000L, partialStructureSeed -> {
            long currentSeed = (partialStructureSeed & Mth.MASK_32 - (long)Mth.MASK_16) << 16;
            currentSeed |= partialStructureSeed & (long)Mth.MASK_16;
            currentSeed |= pillarSeed << 16;
            currentSeed = BACK_2.nextSeed(currentSeed);
            return currentSeed ^ LCG.JAVA.multiplier;
        });
    }

    public static int[] getPillarHeights(long pillarSeed) {
        int[] heights = new int[10];
        for (int i = 0; i < 10; ++i) {
            heights[i] = 76 + i * 3;
        }
        JRand rand = new JRand(pillarSeed);
        for (int i = heights.length; i > 1; --i) {
            int a = i - 1;
            int b = rand.nextInt(i);
            int temp = heights[a];
            heights[a] = heights[b];
            heights[b] = temp;
        }
        return heights;
    }

    public static List<Long> fromPillarHeights(int[] heights) {
        ArrayList<Long> seeds = new ArrayList<Long>();
        PillarSeed.iterator().forEachRemaining(pillarSeed -> {
            if (Arrays.equals(PillarSeed.getPillarHeights(pillarSeed), heights)) {
                seeds.add(pillarSeed);
            }
        });
        return seeds;
    }

    public static SeedIterator iterator() {
        return new SeedIterator(0L, 65536L);
    }
}

