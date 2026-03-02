/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.decorator.ore.nether;

import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.VersionMap;
import com.seedfinding.mcfeature.decorator.ore.HeightProvider;
import com.seedfinding.mcfeature.decorator.ore.OreDecorator;
import com.seedfinding.mcfeature.decorator.ore.RegularOreDecorator;

public class MagmaOre
extends RegularOreDecorator<OreDecorator.Config, OreDecorator.Data<MagmaOre>> {
    public static final VersionMap<OreDecorator.Config> CONFIGS = new VersionMap<OreDecorator.Config>().add(MCVersion.v1_13, new OreDecorator.Config(8, 5, 33, 4, HeightProvider.custom(r -> 27 + r.nextInt(10)), Blocks.MAGMA_BLOCK, NETHERRACK)).add(MCVersion.v1_16, new OreDecorator.Config(9, 7, 33, 4, HeightProvider.custom(r -> 27 + r.nextInt(10)), Blocks.MAGMA_BLOCK, NETHERRACK).add(8, 7, Biomes.SOUL_SAND_VALLEY).add(6, 7, Biomes.CRIMSON_FOREST).add(7, 7, Biomes.WARPED_FOREST).add(11, 7, Biomes.BASALT_DELTAS)).add(MCVersion.v1_17, new OreDecorator.Config(9, 7, 33, 4, HeightProvider.uniformRange(27, 36), Blocks.MAGMA_BLOCK, NETHERRACK).add(8, 7, Biomes.SOUL_SAND_VALLEY).add(6, 7, Biomes.CRIMSON_FOREST).add(7, 7, Biomes.WARPED_FOREST).add(11, 7, Biomes.BASALT_DELTAS));

    public MagmaOre(MCVersion version) {
        super(CONFIGS.getAsOf(version), version);
    }

    @Override
    public String getName() {
        return MagmaOre.name();
    }

    public static String name() {
        return "magma_ore";
    }

    @Override
    public Dimension getValidDimension() {
        return Dimension.NETHER;
    }
}

