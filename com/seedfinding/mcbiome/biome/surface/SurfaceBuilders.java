/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.biome.surface;

import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.biome.surface.builder.BadlandsSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.BasaltDeltasSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.DefaultSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.ErodedBadlandsSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.FrozenOceanSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.GiantTreeTaigaSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.GravellyMountainSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.MountainSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.NetherForestsSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.NetherSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.NoopSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.ShatteredSavannaSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.SoulSandValleySurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.SurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.SwampSurfaceBuilder;
import com.seedfinding.mcbiome.biome.surface.builder.WoodedBadlandsSurfaceBuilder;
import java.util.HashMap;
import java.util.function.Function;

public class SurfaceBuilders {
    public static final HashMap<String, Function<SurfaceConfig, SurfaceBuilder>> SURFACE_BUILDERS = new HashMap();
    public static final Function<SurfaceConfig, SurfaceBuilder> DEFAULT = SurfaceBuilders.register("default", DefaultSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> MOUNTAIN = SurfaceBuilders.register("mountain", MountainSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> SHATTERED_SAVANNA = SurfaceBuilders.register("shattered_savanna", ShatteredSavannaSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> GRAVELLY_MOUNTAIN = SurfaceBuilders.register("gravelly_mountain", GravellyMountainSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> GIANT_TREE_TAIGA = SurfaceBuilders.register("giant_tree_taiga", GiantTreeTaigaSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> SWAMP = SurfaceBuilders.register("swamp", SwampSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> BADLANDS = SurfaceBuilders.register("badlands", BadlandsSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> WOODED_BADLANDS = SurfaceBuilders.register("wooded_badlands", WoodedBadlandsSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> ERODED_BADLANDS = SurfaceBuilders.register("eroded_badlands", ErodedBadlandsSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> FROZEN_OCEAN = SurfaceBuilders.register("frozen_ocean", FrozenOceanSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> NETHER = SurfaceBuilders.register("nether", NetherSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> NETHER_FOREST = SurfaceBuilders.register("nether_forest", NetherForestsSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> SOUL_SAND_VALLEY = SurfaceBuilders.register("soul_sand_valley", SoulSandValleySurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> BASALT_DELTAS = SurfaceBuilders.register("basalt_deltas", BasaltDeltasSurfaceBuilder::new);
    public static final Function<SurfaceConfig, SurfaceBuilder> NOPE = SurfaceBuilders.register("nope", NoopSurfaceBuilder::new);

    public static Function<SurfaceConfig, SurfaceBuilder> register(String name, Function<SurfaceConfig, SurfaceBuilder> surfaceBuilder) {
        SURFACE_BUILDERS.put(name, surfaceBuilder);
        return surfaceBuilder;
    }
}

