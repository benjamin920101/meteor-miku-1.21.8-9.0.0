/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.util.math;

import com.seedfinding.mcseed.rand.JRand;
import java.util.ArrayList;
import java.util.List;

public class NextLongReverser {
    public static void addSeedsToList(long structureSeed, List<Long> seedList) {
        long lowerBits = structureSeed & 0xFFFFFFFFL;
        long upperBits = structureSeed >>> 32;
        if ((lowerBits & 0x80000000L) != 0L) {
            ++upperBits;
        }
        int bitsOfDanger = 1;
        long lowMin = lowerBits << 16 - bitsOfDanger;
        long lowMax = (lowerBits + 1L << 16 - bitsOfDanger) - 1L;
        long upperMin = (upperBits << 16) - 107048004364969L >> bitsOfDanger;
        long m1lv = Math.floorDiv(lowMax * -33441L + upperMin * 17549L, 1L << 31 - bitsOfDanger) + 1L;
        long m2lv = Math.floorDiv(lowMin * 46603L + upperMin * 39761L, 1L << 32 - bitsOfDanger) + 1L;
        long seed = -39761L * m1lv + 35098L * m2lv;
        if (46603L * m1lv + 66882L * m2lv + 107048004364969L >>> 16 == upperBits && seed >>> 16 == lowerBits) {
            seedList.add(254681119335897L * seed + 120305458776662L & 0xFFFFFFFFFFFFL);
        }
        seed = -39761L * (m1lv + 1L) + 35098L * m2lv;
        if (46603L * (m1lv + 1L) + 66882L * m2lv + 107048004364969L >>> 16 == upperBits && seed >>> 16 == lowerBits) {
            seedList.add(254681119335897L * seed + 120305458776662L & 0xFFFFFFFFFFFFL);
        }
        seed = -39761L * m1lv + 35098L * (m2lv + 1L);
        if (46603L * m1lv + 66882L * (m2lv + 1L) + 107048004364969L >>> 16 == upperBits && seed >>> 16 == lowerBits) {
            seedList.add(254681119335897L * seed + 120305458776662L & 0xFFFFFFFFFFFFL);
        }
    }

    public static ArrayList<Long> getSeeds(long structureSeed) {
        ArrayList<Long> seeds = new ArrayList<Long>(2);
        NextLongReverser.addSeedsToList(structureSeed, seeds);
        return seeds;
    }

    public static void addNextLongEquivalents(long structureSeed, List<Long> nextLongs) {
        for (long seed : NextLongReverser.getSeeds(structureSeed)) {
            nextLongs.add(new JRand(seed, false).nextLong());
        }
    }

    public static ArrayList<Long> getNextLongEquivalents(long structureSeed) {
        ArrayList<Long> nextLongs = new ArrayList<Long>(2);
        NextLongReverser.addNextLongEquivalents(structureSeed, nextLongs);
        return nextLongs;
    }
}

