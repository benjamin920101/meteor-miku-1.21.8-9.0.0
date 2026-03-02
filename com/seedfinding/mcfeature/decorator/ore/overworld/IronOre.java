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

public class IronOre
extends RegularOreDecorator<OreDecorator.Config, OreDecorator.Data<IronOre>> {
    public static final VersionMap<OreDecorator.Config> CONFIGS = new VersionMap<OreDecorator.Config>().add(MCVersion.v1_13, new OreDecorator.Config(6, 4, 9, 20, HeightProvider.range(0, 0, 64), Blocks.IRON_ORE, BASE_STONE_OVERWORLD)).add(MCVersion.v1_16, new OreDecorator.Config(6, 6, 9, 20, HeightProvider.range(0, 0, 64), Blocks.IRON_ORE, BASE_STONE_OVERWORLD)).add(MCVersion.v1_17, new OreDecorator.Config(8, 6, 9, 20, HeightProvider.uniformRange(0, 63), Blocks.IRON_ORE, BASE_STONE_OVERWORLD));

    public IronOre(MCVersion version) {
        super(CONFIGS.getAsOf(version), version);
    }

    @Override
    public String getName() {
        return IronOre.name();
    }

    public static String name() {
        return "iron_ore";
    }
}

