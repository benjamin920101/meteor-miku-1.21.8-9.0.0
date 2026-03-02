/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcseed.lcg;

import com.seedfinding.mcmath.util.Mth;
import com.seedfinding.mcseed.lcg.LCG;
import java.math.BigInteger;

public class DiscreteLog {
    public static boolean supports(LCG lcg) {
        if (!lcg.isModPowerOf2() || lcg.getModTrailingZeroes() > 61) {
            return false;
        }
        return lcg.multiplier % 2L != 0L && lcg.addend % 2L != 0L;
    }

    public static long distanceFromZero(LCG lcg, long seed) {
        int exp = lcg.getModTrailingZeroes();
        long a = lcg.multiplier;
        long b = Mth.mask(seed * (lcg.multiplier - 1L) * Mth.modInverse(lcg.addend, exp) + 1L, exp + 2);
        long aBar = DiscreteLog.theta(a, exp);
        long bBar = DiscreteLog.theta(b, exp);
        return bBar * Mth.mask(Mth.modInverse(aBar, exp), exp);
    }

    private static long theta(long number, int exp) {
        if (number % 4L == 3L) {
            number = Mth.getPow2(exp + 2) - number;
        }
        BigInteger xHat = BigInteger.valueOf(number);
        xHat = xHat.modPow(BigInteger.ONE.shiftLeft(exp + 1), BigInteger.ONE.shiftLeft(2 * exp + 3));
        xHat = xHat.subtract(BigInteger.ONE);
        xHat = xHat.divide(BigInteger.ONE.shiftLeft(exp + 3));
        xHat = xHat.mod(BigInteger.ONE.shiftLeft(exp));
        return xHat.longValue();
    }
}

