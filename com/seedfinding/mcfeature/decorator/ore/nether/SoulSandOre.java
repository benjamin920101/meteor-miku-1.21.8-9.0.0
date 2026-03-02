/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.decorator.ore.nether;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.VersionMap;
import com.seedfinding.mcfeature.decorator.ore.HeightProvider;
import com.seedfinding.mcfeature.decorator.ore.OreDecorator;
import com.seedfinding.mcfeature.decorator.ore.RegularOreDecorator;

public class SoulSandOre
extends RegularOreDecorator<OreDecorator.Config, OreDecorator.Data<SoulSandOre>> {
    public static final VersionMap<OreDecorator.Config> CONFIGS = new VersionMap<OreDecorator.Config>().add(MCVersion.v1_16, new OreDecorator.Config(10, 7, 12, 12, HeightProvider.range(0, 0, 32), Blocks.SOUL_SAND, NETHERRACK)).add(MCVersion.v1_17, new OreDecorator.Config(10, 7, 12, 12, HeightProvider.uniformRange(0, 31), Blocks.SOUL_SAND, NETHERRACK));

    public SoulSandOre(MCVersion version) {
        super(CONFIGS.getAsOf(version), version);
    }

    @Override
    public String getName() {
        return SoulSandOre.name();
    }

    public static String name() {
        return "soulsand_ore";
    }

    @Override
    public Dimension getValidDimension() {
        return Dimension.NETHER;
    }

    @Override
    public boolean isValidBiome(Biome biome) {
        return biome == Biomes.SOUL_SAND_VALLEY;
    }
}

