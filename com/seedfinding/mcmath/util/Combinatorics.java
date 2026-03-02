/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcmath.util;

import java.math.BigInteger;
import java.util.function.Predicate;

public final class Combinatorics {
    public static final int MAX_LONG_FACTORIAL = 20;
    private static final long[] FACTORIAL = new long[21];

    public static long getFactorial(int n) {
        return FACTORIAL[n];
    }

    public static BigInteger getBigFactorial(int n) {
        if (n <= 20) {
            return BigInteger.valueOf(Combinatorics.getFactorial(n));
        }
        BigInteger result = BigInteger.valueOf(Combinatorics.getFactorial(20));
        for (int i = 20; i < n; ++i) {
            result = result.multiply(BigInteger.valueOf(i + 1));
        }
        return result;
    }

    public static long getPermutations(int n, int r) {
        return Combinatorics.getFactorial(n) / Combinatorics.getFactorial(n - r);
    }

    public static BigInteger getBigPermutations(int n, int r) {
        return Combinatorics.getBigFactorial(n).divide(Combinatorics.getBigFactorial(n - r));
    }

    public static long getCombinations(int n, int r) {
        return Combinatorics.getPermutations(n, r) / Combinatorics.getFactorial(r);
    }

    public static BigInteger getBigCombinations(int n, int r) {
        return Combinatorics.getBigPermutations(n, r).divide(Combinatorics.getBigFactorial(r));
    }

    public static void permute(int n, int r, Predicate<int[]> shouldContinue) {
        if (n > 20) {
            Combinatorics.bigPermute(n, r, shouldContinue);
        } else {
            Combinatorics.smallPermute(n, r, shouldContinue);
        }
    }

    private static void smallPermute(int n, int r, Predicate<int[]> shouldContinue) {
        long max = Combinatorics.getFactorial(n);
        long increment = Combinatorics.getFactorial(n - r);
        for (long perm = 0L; perm < max; perm += increment) {
            long permCopy = perm;
            int[] indices = new int[n];
            for (int i = 0; i < n; ++i) {
                indices[i] = (int)(permCopy / Combinatorics.getFactorial(n - 1 - i));
                permCopy -= (long)indices[i] * Combinatorics.getFactorial(n - 1 - i);
            }
            if (Combinatorics.acceptPermutation(n, r, indices, shouldContinue)) continue;
            return;
        }
    }

    private static void bigPermute(int n, int r, Predicate<int[]> shouldContinue) {
        BigInteger max = Combinatorics.getBigFactorial(n);
        BigInteger increment = Combinatorics.getBigFactorial(n - r);
        BigInteger perm = BigInteger.ZERO;
        while (perm.compareTo(max) < 0) {
            BigInteger permCopy = perm;
            int[] indices = new int[n];
            for (int i = 0; i < n; ++i) {
                BigInteger f = Combinatorics.getBigFactorial(n - 1 - i);
                indices[i] = permCopy.divide(f).intValue();
                permCopy = permCopy.subtract(f.multiply(BigInteger.valueOf(indices[i])));
            }
            if (!Combinatorics.acceptPermutation(n, r, indices, shouldContinue)) {
                return;
            }
            perm = perm.add(increment);
        }
    }

    private static boolean acceptPermutation(int n, int r, int[] indices, Predicate<int[]> shouldContinue) {
        int[] permutation = new int[n];
        for (int i = 0; i < r; ++i) {
            int wantedIndex = indices[i];
            int currentIndex = 0;
            for (int j = 0; j < permutation.length; ++j) {
                if (permutation[j] != 0 || currentIndex++ != wantedIndex) continue;
                currentIndex = j;
                break;
            }
            permutation[currentIndex] = i + 1;
        }
        return shouldContinue.test(permutation);
    }

    public static void combine(int n, int r, Predicate<int[]> shouldContinue) {
        int[] combination = new int[r];
        for (int i = 0; i < r; ++i) {
            combination[i] = i;
        }
        while (combination[r - 1] < n) {
            int t;
            if (!shouldContinue.test(combination)) {
                return;
            }
            for (t = r - 1; t != 0 && combination[t] == n - r + t; --t) {
            }
            int n2 = t;
            combination[n2] = combination[n2] + 1;
            for (int i = t + 1; i < r; ++i) {
                combination[i] = combination[i - 1] + 1;
            }
        }
    }

    static {
        Combinatorics.FACTORIAL[0] = 1L;
        for (int i = 1; i < FACTORIAL.length; ++i) {
            Combinatorics.FACTORIAL[i] = FACTORIAL[i - 1] * (long)i;
        }
    }
}

