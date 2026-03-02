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

public class DirtOre
extends RegularOreDecorator<OreDecorator.Config, OreDecorator.Data<DirtOre>> {
    public static final VersionMap<OreDecorator.Config> CONFIGS = new VersionMap<OreDecorator.Config>().add(MCVersion.v1_13, new OreDecorator.Config(0, 4, 33, 10, HeightProvider.range(0, 0, 256), Blocks.DIRT, BASE_STONE_OVERWORLD)).add(MCVersion.v1_16, new OreDecorator.Config(0, 6, 33, 10, HeightProvider.range(0, 0, 256), Blocks.DIRT, BASE_STONE_OVERWORLD)).add(MCVersion.v1_17, new OreDecorator.Config(0, 6, 33, 10, HeightProvider.uniformRange(0, 255), Blocks.DIRT, BASE_STONE_OVERWORLD));

    public DirtOre(MCVersion version) {
        super(CONFIGS.getAsOf(version), version);
    }

    @Override
    public String getName() {
        return DirtOre.name();
    }

    public static String name() {
        return "dirt_ore";
    }
}

