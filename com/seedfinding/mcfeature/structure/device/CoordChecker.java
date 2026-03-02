/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.device;

import com.seedfinding.mcfeature.structure.device.ParentInfo;

@FunctionalInterface
public interface CoordChecker {
    public boolean test(int var1, int var2, long var3, ParentInfo var5);

    @FunctionalInterface
    public static interface Head
    extends CoordChecker {
        public boolean test(int var1, int var2, long var3);

        @Override
        default public boolean test(int x, int z, long mask, ParentInfo parent) {
            return this.test(x, z, mask);
        }
    }
}

