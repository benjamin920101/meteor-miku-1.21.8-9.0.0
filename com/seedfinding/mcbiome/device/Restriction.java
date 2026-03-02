/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.device;

import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mcbiome.source.LayeredBiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.version.MCVersion;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Restriction {
    private final String name;
    private final int x;
    private final int z;

    public Restriction(String name, int x, int z) {
        this.name = name;
        this.x = x;
        this.z = z;
    }

    public String getName() {
        return this.name;
    }

    public int getX() {
        return this.x;
    }

    public int getZ() {
        return this.z;
    }

    public List<Integer> getBitPoints() {
        return Collections.singletonList(64);
    }

    public abstract boolean testSeed(long var1, long var3);

    public abstract boolean testSource(LayeredBiomeSource<IntBiomeLayer> var1);

    protected static IntBiomeLayer getLayer(MCVersion version, Class<? extends IntBiomeLayer> layerClass) {
        OverworldBiomeSource source = new OverworldBiomeSource(version, 0L);
        for (int i = 0; i < source.getLayers().size(); ++i) {
            if (!((IntBiomeLayer)source.getLayer(i)).getClass().equals(layerClass)) continue;
            return (IntBiomeLayer)source.getLayer(i);
        }
        return null;
    }

    protected static int getLayerId(MCVersion version, Class<? extends IntBiomeLayer> layerClass) {
        return Objects.requireNonNull(Restriction.getLayer(version, layerClass)).getLayerId();
    }

    protected static long getSalt(MCVersion version, Class<? extends IntBiomeLayer> layerClass) {
        return Objects.requireNonNull(Restriction.getLayer((MCVersion)version, layerClass)).salt;
    }

    public String toString() {
        return this.getName() + " at (" + this.getX() + ", " + this.getZ() + ")";
    }

    @FunctionalInterface
    public static interface Factory<T extends Restriction> {
        public T create(MCVersion var1, int var2, int var3);
    }
}

