/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.decorator.ore.overworld;

import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.VersionMap;
import com.seedfinding.mcfeature.decorator.ore.HeightProvider;
import com.seedfinding.mcfeature.decorator.ore.OreDecorator;
import com.seedfinding.mcfeature.decorator.ore.RegularOreDecorator;

public class GoldOre
extends RegularOreDecorator<OreDecorator.Config, OreDecorator.Data<GoldOre>> {
    public static final VersionMap<OreDecorator.Config> CONFIGS = new VersionMap<OreDecorator.Config>().add(MCVersion.v1_13, new OreDecorator.Config(7, 4, 9, 2, HeightProvider.range(0, 0, 32), Blocks.GOLD_ORE, BASE_STONE_OVERWORLD)).add(MCVersion.v1_16, new OreDecorator.Config(7, 6, 9, 2, HeightProvider.range(0, 0, 32), Blocks.GOLD_ORE, BASE_STONE_OVERWORLD)).add(MCVersion.v1_17, new OreDecorator.Config(9, 6, 9, 2, HeightProvider.uniformRange(0, 31), Blocks.GOLD_ORE, BASE_STONE_OVERWORLD));

    public GoldOre(MCVersion version) {
        super(CONFIGS.getAsOf(version), version);
    }

    @Override
    public String getName() {
        return GoldOre.name();
    }

    public static String name() {
        return "gold_ore";
    }
}

