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

public class CopperOre
extends RegularOreDecorator<OreDecorator.Config, OreDecorator.Data<CopperOre>> {
    public static final VersionMap<OreDecorator.Config> CONFIGS = new VersionMap<OreDecorator.Config>().add(MCVersion.v1_17, new OreDecorator.Config(13, 6, 10, 6, HeightProvider.triangleRange(0, 96), Blocks.COPPER_ORE, BASE_STONE_OVERWORLD));

    public CopperOre(MCVersion version) {
        super(CONFIGS.getAsOf(version), version);
    }

    @Override
    public String getName() {
        return CopperOre.name();
    }

    public static String name() {
        return "copper_ore";
    }
}

