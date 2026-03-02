/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.biome.surface;

import com.seedfinding.mcbiome.biome.surface.SurfaceBuilders;
import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.biome.surface.builder.SurfaceBuilder;
import java.util.HashMap;

public class ConfiguredSurfaceBuilders {
    public static final HashMap<String, SurfaceBuilder> CONFIGURED_SURFACE_BUILDERS = new HashMap();
    public static final SurfaceBuilder BADLANDS = ConfiguredSurfaceBuilders.register("badlands", SurfaceBuilders.BADLANDS.apply(SurfaceConfig.CONFIG_BADLANDS));
    public static final SurfaceBuilder BASALT_DELTAS = ConfiguredSurfaceBuilders.register("basalt_deltas", SurfaceBuilders.BASALT_DELTAS.apply(SurfaceConfig.CONFIG_BASALT_DELTAS));
    public static final SurfaceBuilder CRIMSON_FOREST = ConfiguredSurfaceBuilders.register("crimson_forest", SurfaceBuilders.NETHER_FOREST.apply(SurfaceConfig.CONFIG_CRIMSON_FOREST));
    public static final SurfaceBuilder DESERT = ConfiguredSurfaceBuilders.register("desert", SurfaceBuilders.DEFAULT.apply(SurfaceConfig.CONFIG_DESERT));
    public static final SurfaceBuilder END = ConfiguredSurfaceBuilders.register("end", SurfaceBuilders.DEFAULT.apply(SurfaceConfig.CONFIG_THE_END));
    public static final SurfaceBuilder ERODED_BADLANDS = ConfiguredSurfaceBuilders.register("eroded_badlands", SurfaceBuilders.ERODED_BADLANDS.apply(SurfaceConfig.CONFIG_BADLANDS));
    public static final SurfaceBuilder FROZEN_OCEAN = ConfiguredSurfaceBuilders.register("frozen_ocean", SurfaceBuilders.FROZEN_OCEAN.apply(SurfaceConfig.CONFIG_GRASS));
    public static final SurfaceBuilder FULL_SAND = ConfiguredSurfaceBuilders.register("full_sand", SurfaceBuilders.DEFAULT.apply(SurfaceConfig.CONFIG_FULL_SAND));
    public static final SurfaceBuilder GIANT_TREE_TAIGA = ConfiguredSurfaceBuilders.register("giant_tree_taiga", SurfaceBuilders.GIANT_TREE_TAIGA.apply(SurfaceConfig.CONFIG_GRASS));
    public static final SurfaceBuilder GRASS = ConfiguredSurfaceBuilders.register("grass", SurfaceBuilders.DEFAULT.apply(SurfaceConfig.CONFIG_GRASS));
    public static final SurfaceBuilder GRAVELLY_MOUNTAIN = ConfiguredSurfaceBuilders.register("gravelly_mountain", SurfaceBuilders.GRAVELLY_MOUNTAIN.apply(SurfaceConfig.CONFIG_GRASS));
    public static final SurfaceBuilder ICE_SPIKES = ConfiguredSurfaceBuilders.register("ice_spikes", SurfaceBuilders.DEFAULT.apply(SurfaceConfig.CONFIG_ICE_SPIKES));
    public static final SurfaceBuilder MOUNTAIN = ConfiguredSurfaceBuilders.register("mountain", SurfaceBuilders.MOUNTAIN.apply(SurfaceConfig.CONFIG_GRASS));
    public static final SurfaceBuilder MYCELIUM = ConfiguredSurfaceBuilders.register("mycelium", SurfaceBuilders.DEFAULT.apply(SurfaceConfig.CONFIG_MYCELIUM));
    public static final SurfaceBuilder NETHER = ConfiguredSurfaceBuilders.register("nether", SurfaceBuilders.NETHER.apply(SurfaceConfig.CONFIG_HELL));
    public static final SurfaceBuilder NOPE = ConfiguredSurfaceBuilders.register("nope", SurfaceBuilders.NOPE.apply(SurfaceConfig.CONFIG_STONE));
    public static final SurfaceBuilder OCEAN_SAND = ConfiguredSurfaceBuilders.register("ocean_sand", SurfaceBuilders.DEFAULT.apply(SurfaceConfig.CONFIG_OCEAN_SAND));
    public static final SurfaceBuilder SHATTERED_SAVANNA = ConfiguredSurfaceBuilders.register("shattered_savanna", SurfaceBuilders.SHATTERED_SAVANNA.apply(SurfaceConfig.CONFIG_GRASS));
    public static final SurfaceBuilder SOUL_SAND_VALLEY = ConfiguredSurfaceBuilders.register("soul_sand_valley", SurfaceBuilders.SOUL_SAND_VALLEY.apply(SurfaceConfig.CONFIG_SOUL_SAND_VALLEY));
    public static final SurfaceBuilder STONE = ConfiguredSurfaceBuilders.register("stone", SurfaceBuilders.DEFAULT.apply(SurfaceConfig.CONFIG_STONE));
    public static final SurfaceBuilder SWAMP = ConfiguredSurfaceBuilders.register("swamp", SurfaceBuilders.SWAMP.apply(SurfaceConfig.CONFIG_GRASS));
    public static final SurfaceBuilder WARPED_FOREST = ConfiguredSurfaceBuilders.register("warped_forest", SurfaceBuilders.NETHER_FOREST.apply(SurfaceConfig.CONFIG_WARPED_FOREST));
    public static final SurfaceBuilder WOODED_BADLANDS = ConfiguredSurfaceBuilders.register("wooded_badlands", SurfaceBuilders.WOODED_BADLANDS.apply(SurfaceConfig.CONFIG_BADLANDS));

    public static SurfaceBuilder register(String name, SurfaceBuilder surfaceBuilder) {
        CONFIGURED_SURFACE_BUILDERS.put(name, surfaceBuilder);
        return surfaceBuilder;
    }
}

