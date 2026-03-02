/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.device;

import com.seedfinding.mcbiome.device.Restriction;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import java.util.List;

public abstract class ModRestriction
extends Restriction {
    private final long salt;
    private final long bound;
    private final long value;
    private final long modulo;

    public ModRestriction(String name, int x, int z, long salt, long bound, long value, long modulo) {
        super(name, x, z);
        if (modulo >= bound || modulo < 1L) {
            System.err.println("Using " + modulo + " as modulo for bound " + bound + "? Go Fix.");
            modulo = bound - 1L;
        }
        if (value < 0L || value > modulo) {
            System.err.println("Using " + value + " as value for modulo " + modulo + "? Go Fix.");
            value = 0L;
        }
        this.salt = salt;
        this.bound = bound;
        this.value = value;
        this.modulo = modulo;
    }

    @Override
    public List<Integer> getBitPoints() {
        return super.getBitPoints();
    }

    @Override
    public boolean testSeed(long seed, long bits) {
        long localSeed = IntBiomeLayer.getLocalSeed(seed, this.salt, this.getX(), this.getZ());
        int val = (int)Math.floorMod(localSeed >> 24, this.bound);
        return (long)val % this.modulo == this.value;
    }
}

