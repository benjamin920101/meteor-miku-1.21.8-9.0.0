/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.layer.end;

import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.FloatBiomeLayer;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public class EndBiomeLayer
extends IntBiomeLayer {
    public EndBiomeLayer(MCVersion version, FloatBiomeLayer parent) {
        super(version, parent);
    }

    @Override
    public int sample(int x, int y, int z) {
        if ((long)(x >>= 2) * (long)x + (long)(z >>= 2) * (long)z <= 4096L) {
            return Biomes.THE_END.getId();
        }
        float height = this.getParent(FloatBiomeLayer.class).get(x * 2 + 1, 0, z * 2 + 1);
        if (height > 40.0f) {
            return Biomes.END_HIGHLANDS.getId();
        }
        if (height >= 0.0f) {
            return Biomes.END_MIDLANDS.getId();
        }
        if (height >= -20.0f) {
            return Biomes.END_BARRENS.getId();
        }
        return Biomes.SMALL_END_ISLANDS.getId();
    }
}

