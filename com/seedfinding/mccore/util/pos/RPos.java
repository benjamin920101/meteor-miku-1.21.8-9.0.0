/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.util.pos;

import com.seedfinding.mccore.util.data.SpiralIterator;
import com.seedfinding.mccore.util.math.Vec3i;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;

public class RPos
extends Vec3i {
    private final int regionSize;

    public RPos(int x, int z, int regionSize) {
        super(x, 0, z);
        this.regionSize = regionSize;
    }

    public RPos add(CPos pos) {
        return this.add(pos.getX(), pos.getZ());
    }

    public RPos subtract(CPos pos) {
        return this.subtract(pos.getX(), pos.getZ());
    }

    public RPos shl(int amount) {
        return this.shl(amount, amount);
    }

    public RPos shr(int amount) {
        return this.shr(amount, amount);
    }

    public RPos add(int x, int z) {
        return new RPos(this.getX() + x, this.getZ() + z, this.regionSize);
    }

    public RPos subtract(int x, int z) {
        return new RPos(this.getX() - x, this.getZ() - z, this.regionSize);
    }

    public RPos shl(int bx, int bz) {
        return new RPos(this.getX() << bx, this.getZ() << bz, this.regionSize);
    }

    public RPos shr(int bx, int bz) {
        return new RPos(this.getX() >> bx, this.getZ() >> bz, this.regionSize);
    }

    public RPos changeRegionSize(int regionSize) {
        int x = this.getX() * this.regionSize;
        x = x < 0 ? x - regionSize + 1 : x;
        int z = this.getZ() * this.regionSize;
        z = z < 0 ? z - regionSize + 1 : z;
        return new RPos(x / regionSize, z / regionSize, regionSize);
    }

    public int getRegionSize() {
        return this.regionSize;
    }

    public BPos toBlockPos() {
        return new BPos(this.getX() * this.getRegionSize(), 0, this.getZ() * this.getRegionSize());
    }

    public CPos toChunkPos() {
        return new CPos(this.getX() * this.getRegionSize(), this.getZ() * this.getRegionSize());
    }

    @FunctionalInterface
    public static interface Builder {
        public RPos create(int var1, int var2);

        public static SpiralIterator.Builder<RPos> create(int regionSize) {
            return (x, y, z) -> new RPos(x, z, regionSize);
        }
    }
}

