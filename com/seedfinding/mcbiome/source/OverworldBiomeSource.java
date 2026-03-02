/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.source;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mcbiome.layer.composite.VoronoiLayer;
import com.seedfinding.mcbiome.layer.land.BambooJungleLayer;
import com.seedfinding.mcbiome.layer.land.BaseBiomesLayer;
import com.seedfinding.mcbiome.layer.land.ContinentLayer;
import com.seedfinding.mcbiome.layer.land.HillsLayer;
import com.seedfinding.mcbiome.layer.land.IslandLayer;
import com.seedfinding.mcbiome.layer.land.LandLayer;
import com.seedfinding.mcbiome.layer.land.MushroomLayer;
import com.seedfinding.mcbiome.layer.land.SunflowerPlainsLayer;
import com.seedfinding.mcbiome.layer.noise.NoiseLayer;
import com.seedfinding.mcbiome.layer.scale.ScaleLayer;
import com.seedfinding.mcbiome.layer.scale.SmoothScaleLayer;
import com.seedfinding.mcbiome.layer.shore.EaseEdgeLayer;
import com.seedfinding.mcbiome.layer.shore.EdgeBiomesLayer;
import com.seedfinding.mcbiome.layer.temperature.ClimateLayer;
import com.seedfinding.mcbiome.layer.water.DeepOceanLayer;
import com.seedfinding.mcbiome.layer.water.NoiseToRiverLayer;
import com.seedfinding.mcbiome.layer.water.OceanTemperatureLayer;
import com.seedfinding.mcbiome.layer.water.OldRiverInBiomes;
import com.seedfinding.mcbiome.layer.water.RiverLayer;
import com.seedfinding.mcbiome.source.LayeredBiomeSource;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.UnsupportedVersion;
import java.util.function.BiFunction;

public class OverworldBiomeSource
extends LayeredBiomeSource<IntBiomeLayer> {
    public int biomeSize;
    public int riverSize;
    public boolean useDefault1_1;
    public static final int DEFAULT_BIOME_SIZE = 4;
    public static final int LARGE_BIOME_SIZE = 6;
    public static final int DEFAULT_RIVER_SIZE = 4;
    public IntBiomeLayer base;
    public IntBiomeLayer ocean;
    public IntBiomeLayer noise;
    public IntBiomeLayer variants;
    public IntBiomeLayer biomes;
    public IntBiomeLayer river;
    public IntBiomeLayer full;
    public VoronoiLayer voronoi;
    public IntBiomeLayer debug;

    public OverworldBiomeSource(MCVersion version, long worldSeed) {
        this(version, worldSeed, 4, 4);
    }

    public OverworldBiomeSource(MCVersion version, long worldSeed, int biomeSize, int riverSize) {
        this(version, worldSeed, biomeSize, riverSize, false);
    }

    public OverworldBiomeSource(MCVersion version, long worldSeed, int biomeSize, int riverSize, boolean useDefault1_1) {
        super(version, worldSeed);
        if (this.getVersion().isOlderThan(MCVersion.vb1_8_1)) {
            throw new UnsupportedVersion(this.getVersion(), "overworld biomes");
        }
        if (this.getVersion().isOlderThan(MCVersion.vb1_8_1)) {
            System.out.println("WARNING USING TEMPORARY BIOME STACK (NOT VERIFIED)");
        }
        this.biomeSize = biomeSize;
        this.riverSize = riverSize;
        this.useDefault1_1 = useDefault1_1;
        this.build();
    }

    public void setBiomeSize(int biomeSize) {
        this.biomeSize = biomeSize;
        this.build();
    }

    public void setRiverSize(int riverSize) {
        this.riverSize = riverSize;
        this.build();
    }

    public void setUseDefault1_1(boolean useDefault1_1) {
        this.useDefault1_1 = useDefault1_1;
        this.build();
    }

    public void setLargeBiomeSize() {
        this.biomeSize = 6;
        this.build();
    }

    @Override
    public Dimension getDimension() {
        return Dimension.OVERWORLD;
    }

    protected void build() {
        this.layers.clear();
        BiFunction<Long, IntBiomeLayer, IntBiomeLayer> NORMAL_SCALE = (salt, parent) -> new ScaleLayer(this.getVersion(), this.getWorldSeed(), (long)salt, ScaleLayer.Type.NORMAL, (IntBiomeLayer)parent);
        this.base = new ContinentLayer(this.getVersion(), this.getWorldSeed(), 1L);
        this.layers.add(this.base);
        this.base = new ScaleLayer(this.getVersion(), this.getWorldSeed(), 2000L, ScaleLayer.Type.FUZZY, this.base);
        this.layers.add(this.base);
        this.base = new LandLayer(this.getVersion(), this.getWorldSeed(), 1L, this.base);
        this.layers.add(this.base);
        this.base = new ScaleLayer(this.getVersion(), this.getWorldSeed(), 2001L, ScaleLayer.Type.NORMAL, this.base);
        this.layers.add(this.base);
        this.base = new LandLayer(this.getVersion(), this.getWorldSeed(), 2L, this.base);
        this.layers.add(this.base);
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_7_2)) {
            this.base = new LandLayer(this.getVersion(), this.getWorldSeed(), 50L, this.base);
            this.layers.add(this.base);
            this.base = new LandLayer(this.getVersion(), this.getWorldSeed(), 70L, this.base);
            this.layers.add(this.base);
            this.base = new IslandLayer(this.getVersion(), this.getWorldSeed(), 2L, this.base);
            this.layers.add(this.base);
        }
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_0)) {
            this.base = new ClimateLayer.Cold(this.getVersion(), this.getWorldSeed(), 2L, this.base);
            this.layers.add(this.base);
        }
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_7_2)) {
            this.base = new LandLayer(this.getVersion(), this.getWorldSeed(), 3L, this.base);
            this.layers.add(this.base);
            this.base = new ClimateLayer.Temperate(this.getVersion(), this.getWorldSeed(), 2L, this.base);
            this.layers.add(this.base);
            this.base = new ClimateLayer.Cool(this.getVersion(), this.getWorldSeed(), 2L, this.base);
            this.layers.add(this.base);
            this.base = new ClimateLayer.Special(this.getVersion(), this.getWorldSeed(), 3L, this.base);
            this.layers.add(this.base);
        }
        this.base = new ScaleLayer(this.getVersion(), this.getWorldSeed(), 2002L, ScaleLayer.Type.NORMAL, this.base);
        this.layers.add(this.base);
        if (this.getVersion().isOlderOrEqualTo(MCVersion.v1_6_4)) {
            this.base = new LandLayer(this.getVersion(), this.getWorldSeed(), 3L, this.base);
            this.layers.add(this.base);
        }
        this.base = new ScaleLayer(this.getVersion(), this.getWorldSeed(), 2003L, ScaleLayer.Type.NORMAL, this.base);
        this.layers.add(this.base);
        this.base = new LandLayer(this.getVersion(), this.getWorldSeed(), this.getVersion().isNewerOrEqualTo(MCVersion.v1_0) ? 4L : 3L, this.base);
        this.layers.add(this.base);
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_0)) {
            this.base = new MushroomLayer(this.getVersion(), this.getWorldSeed(), 5L, this.base);
            this.layers.add(this.base);
        } else {
            this.base = new ScaleLayer(this.getVersion(), this.getWorldSeed(), 2004L, ScaleLayer.Type.NORMAL, this.base);
            this.layers.add(this.base);
            this.base = new LandLayer(this.getVersion(), this.getWorldSeed(), 3L, this.base);
            this.layers.add(this.base);
        }
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_7_2)) {
            this.base = new DeepOceanLayer(this.getVersion(), this.getWorldSeed(), 4L, this.base);
            this.layers.add(this.base);
        }
        this.biomes = new BaseBiomesLayer(this.getVersion(), this.getWorldSeed(), 200L, this.base).setDefault1_1(this.useDefault1_1);
        this.layers.add(this.biomes);
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_14)) {
            this.biomes = new BambooJungleLayer(this.getVersion(), this.getWorldSeed(), 1001L, this.biomes);
            this.layers.add(this.biomes);
        }
        this.biomes = this.stack(1000L, NORMAL_SCALE, this.biomes, 2);
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_7_2)) {
            this.biomes = new EaseEdgeLayer(this.getVersion(), this.getWorldSeed(), 1000L, this.biomes);
            this.layers.add(this.biomes);
        }
        this.noise = new NoiseLayer(this.getVersion(), this.getWorldSeed(), 100L, this.base);
        this.layers.add(this.noise);
        if (this.getVersion().isOlderThan(MCVersion.v1_13)) {
            this.river = this.stack(1000L, NORMAL_SCALE, this.noise, 2);
            this.noise = new ScaleLayer(this.getVersion(), 0L, 0L, ScaleLayer.Type.NORMAL, this.noise);
            this.layers.add(this.noise);
            this.noise = new ScaleLayer(this.getVersion(), 0L, 0L, ScaleLayer.Type.NORMAL, this.noise);
            this.layers.add(this.noise);
        } else {
            this.noise = new ScaleLayer(this.getVersion(), this.getWorldSeed(), 1000L, ScaleLayer.Type.NORMAL, this.noise);
            this.layers.add(this.noise);
            this.noise = new ScaleLayer(this.getVersion(), this.getWorldSeed(), 1001L, ScaleLayer.Type.NORMAL, this.noise);
            this.layers.add(this.noise);
        }
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_1)) {
            this.variants = new HillsLayer(this.getVersion(), this.getWorldSeed(), 1000L, this.biomes, this.noise);
            this.layers.add(this.variants);
        } else {
            this.variants = this.biomes;
        }
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_7_2)) {
            this.variants = new SunflowerPlainsLayer(this.getVersion(), this.getWorldSeed(), 1001L, this.variants);
            this.layers.add(this.variants);
        }
        for (int i = 0; i < this.biomeSize; ++i) {
            this.variants = new ScaleLayer(this.getVersion(), this.getWorldSeed(), 1000L + (long)i, ScaleLayer.Type.NORMAL, this.variants);
            this.layers.add(this.variants);
            if (i == 0) {
                this.variants = new LandLayer(this.getVersion(), this.getWorldSeed(), 3L, this.variants);
                this.layers.add(this.variants);
            }
            if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_1) && (i == 1 || this.biomeSize == 1 && this.getVersion().isNewerOrEqualTo(MCVersion.v1_8)) || this.getVersion().isOlderOrEqualTo(MCVersion.v1_0) && i == 0 && this.getVersion().isNewerOrEqualTo(MCVersion.v1_0)) {
                this.variants = new EdgeBiomesLayer(this.getVersion(), this.getWorldSeed(), 1000L, this.variants);
                this.layers.add(this.variants);
            }
            if (i != 1 || !this.getVersion().isBetween(MCVersion.v1_1, MCVersion.v1_6_4)) continue;
            this.variants = new OldRiverInBiomes(this.getVersion(), this.getWorldSeed(), 1000L, this.variants);
            this.layers.add(this.variants);
        }
        this.variants = new SmoothScaleLayer(this.getVersion(), this.getWorldSeed(), 1000L, this.variants);
        this.layers.add(this.variants);
        this.river = this.stack(this.getVersion().isNewerOrEqualTo(MCVersion.v1_7_2) ? 1000L : 1002L, NORMAL_SCALE, this.getVersion().isOlderThan(MCVersion.v1_13) ? this.river : this.noise, this.getVersion().isNewerOrEqualTo(MCVersion.v1_8) ? this.riverSize : this.biomeSize);
        this.river = new NoiseToRiverLayer(this.getVersion(), this.getWorldSeed(), 1L, this.river);
        this.layers.add(this.river);
        this.river = new SmoothScaleLayer(this.getVersion(), this.getWorldSeed(), 1000L, this.river);
        this.layers.add(this.river);
        this.full = new RiverLayer(this.getVersion(), this.getWorldSeed(), 100L, this.variants, this.river);
        this.layers.add(this.full);
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_13)) {
            this.ocean = new OceanTemperatureLayer(this.getVersion(), this.getWorldSeed(), 2L);
            this.layers.add(this.ocean);
            this.ocean = this.stack(2001L, NORMAL_SCALE, this.ocean, 6);
            this.full = new OceanTemperatureLayer.Apply(this.getVersion(), this.getWorldSeed(), 100L, this.full, this.ocean);
            this.layers.add(this.full);
        }
        this.voronoi = new VoronoiLayer(this.getVersion(), this.getWorldSeed(), false, this.full);
        this.layers.add(this.voronoi);
        this.layers.setScales();
    }

    public IntBiomeLayer stack(long salt, BiFunction<Long, IntBiomeLayer, IntBiomeLayer> layer, IntBiomeLayer parent, int count) {
        for (int i = 0; i < count; ++i) {
            parent = layer.apply(salt + (long)i, parent);
            this.layers.add(parent);
        }
        return parent;
    }

    @Override
    public Biome getBiome(BPos bpos) {
        return Biomes.REGISTRY.get(this.voronoi.get(bpos.getX(), 0, bpos.getZ()));
    }

    @Override
    public Biome getBiome(int x, int y, int z) {
        return Biomes.REGISTRY.get(this.voronoi.get(x, 0, z));
    }

    @Override
    public Biome getBiomeForNoiseGen(int x, int y, int z) {
        return Biomes.REGISTRY.get(this.full.get(x, 0, z));
    }
}

