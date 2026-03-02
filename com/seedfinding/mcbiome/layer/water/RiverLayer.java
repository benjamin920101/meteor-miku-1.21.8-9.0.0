/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.layer.water;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.BiomeLayer;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public class RiverLayer
extends IntBiomeLayer {
    public RiverLayer(MCVersion version, long worldSeed, long salt, IntBiomeLayer ... parents) {
        super(version, worldSeed, salt, (BiomeLayer[])parents);
    }

    @Override
    public int sample(int x, int y, int z) {
        int landStackCenter = this.getParent(0, IntBiomeLayer.class).get(x, y, z);
        int riverStackCenter = this.getParent(1, IntBiomeLayer.class).get(x, y, z);
        if (this.getVersion().isOlderOrEqualTo(MCVersion.v1_6_4) ? landStackCenter == Biomes.OCEAN.getId() : Biome.isOcean(landStackCenter)) {
            return landStackCenter;
        }
        if (riverStackCenter == Biomes.RIVER.getId()) {
            if (this.getVersion().isOlderOrEqualTo(MCVersion.vb1_8_1)) {
                return riverStackCenter;
            }
            if (landStackCenter == Biomes.SNOWY_TUNDRA.getId()) {
                return Biomes.FROZEN_RIVER.getId();
            }
            return landStackCenter != Biomes.MUSHROOM_FIELDS.getId() && landStackCenter != Biomes.MUSHROOM_FIELD_SHORE.getId() ? riverStackCenter & 0xFF : Biomes.MUSHROOM_FIELD_SHORE.getId();
        }
        return landStackCenter;
    }
}

