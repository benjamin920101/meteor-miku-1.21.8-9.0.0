/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.condition;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.condition.LootCondition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiomeCondition
implements LootCondition {
    public final List<Biome> biomes = new ArrayList<Biome>();

    public BiomeCondition(Biome ... biomes) {
        Collections.addAll(this.biomes, biomes);
    }

    @Override
    public boolean is_valid(LootContext context) {
        Biome biome = context.getBiome();
        return biome != null && this.biomes.contains(biome);
    }
}

