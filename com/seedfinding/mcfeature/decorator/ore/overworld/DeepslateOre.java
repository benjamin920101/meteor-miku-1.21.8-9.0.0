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

public class DeepslateOre
extends RegularOreDecorator<OreDecorator.Config, OreDecorator.Data<DeepslateOre>> {
    public static final VersionMap<OreDecorator.Config> CONFIGS = new VersionMap<OreDecorator.Config>().add(MCVersion.v1_17, new OreDecorator.Config(6, 6, 64, 2, HeightProvider.uniformRange(0, 16), Blocks.DEEPSLATE, BASE_STONE_OVERWORLD));

    public DeepslateOre(MCVersion version) {
        super(CONFIGS.getAsOf(version), version);
    }

    @Override
    public String getName() {
        return DeepslateOre.name();
    }

    public static String name() {
        return "deepslate_ore";
    }
}

