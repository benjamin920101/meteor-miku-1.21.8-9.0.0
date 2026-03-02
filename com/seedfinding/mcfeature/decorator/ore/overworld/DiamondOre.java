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

public class DiamondOre
extends RegularOreDecorator<OreDecorator.Config, OreDecorator.Data<DiamondOre>> {
    public static final VersionMap<OreDecorator.Config> CONFIGS = new VersionMap<OreDecorator.Config>().add(MCVersion.v1_13, new OreDecorator.Config(9, 4, 8, 1, HeightProvider.range(0, 0, 16), Blocks.DIAMOND_ORE, BASE_STONE_OVERWORLD)).add(MCVersion.v1_16, new OreDecorator.Config(9, 6, 8, 1, HeightProvider.range(0, 0, 16), Blocks.DIAMOND_ORE, BASE_STONE_OVERWORLD)).add(MCVersion.v1_17, new OreDecorator.Config(11, 6, 8, 1, HeightProvider.uniformRange(0, 16), Blocks.DIAMOND_ORE, BASE_STONE_OVERWORLD)).add(MCVersion.v1_17_1, new OreDecorator.Config(11, 6, 8, 1, HeightProvider.uniformRange(0, 15), Blocks.DIAMOND_ORE, BASE_STONE_OVERWORLD));

    public DiamondOre(MCVersion version) {
        super(CONFIGS.getAsOf(version), version);
    }

    @Override
    public String getName() {
        return DiamondOre.name();
    }

    public static String name() {
        return "diamond_ore";
    }
}

