/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.device;

import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.device.BoundRestriction;
import com.seedfinding.mcbiome.device.ModRestriction;
import com.seedfinding.mcbiome.device.Restriction;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mcbiome.layer.land.BambooJungleLayer;
import com.seedfinding.mcbiome.layer.land.BaseBiomesLayer;
import com.seedfinding.mcbiome.layer.land.ContinentLayer;
import com.seedfinding.mcbiome.layer.land.HillsLayer;
import com.seedfinding.mcbiome.layer.land.IslandLayer;
import com.seedfinding.mcbiome.layer.land.MushroomLayer;
import com.seedfinding.mcbiome.layer.land.SunflowerPlainsLayer;
import com.seedfinding.mcbiome.layer.noise.NoiseLayer;
import com.seedfinding.mcbiome.layer.temperature.ClimateLayer;
import com.seedfinding.mcbiome.source.LayeredBiomeSource;

public class Restrictions {
    public static final Restriction.Factory<BoundRestriction> CONTINENT = (version, x, z) -> new BoundRestriction("CONTINENT", x, z, Restriction.getSalt(version, ContinentLayer.class), 10L, 0L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value);
            this.ID = 1.getLayerId(version, ContinentLayer.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) == Biomes.PLAINS.getId();
        }
    };
    public static final Restriction.Factory<BoundRestriction> ISLAND = (version, x, z) -> new BoundRestriction("ISLAND", x, z, Restriction.getSalt(version, IslandLayer.class), 2L, 0L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value);
            this.ID = 2.getLayerId(version, IslandLayer.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) == Biomes.PLAINS.getId();
        }
    };
    public static final Restriction.Factory<BoundRestriction> COLD_FOREST = (version, x, z) -> new BoundRestriction("COLD_FOREST", x, z, Restriction.getSalt(version, ClimateLayer.Cold.class), 6L, 0L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value);
            this.ID = 3.getLayerId(version, ClimateLayer.Cold.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) == Biomes.FOREST.getId();
        }
    };
    public static final Restriction.Factory<BoundRestriction> HILLS_PLATEAU = (version, x, z) -> new BoundRestriction("PLATEAU", x, z, Restriction.getSalt(version, HillsLayer.class), 3L, 0L){

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return true;
        }
    };
    public static final Restriction.Factory<BoundRestriction> COLD_MOUNTAIN = (version, x, z) -> new BoundRestriction("COLD_MOUNTAIN", x, z, Restriction.getSalt(version, ClimateLayer.Cold.class), 6L, 1L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value);
            this.ID = 5.getLayerId(version, ClimateLayer.Cold.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) == Biomes.MOUNTAINS.getId();
        }
    };
    public static final Restriction.Factory<ModRestriction> MUTATED = (version, x, z) -> new ModRestriction("NOISE LAYER", x, z, Restriction.getSalt(version, NoiseLayer.class), 299999L, 1L, 29L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value, modulo);
            this.ID = 6.getLayerId(version, NoiseLayer.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            int id = source.getLayer(this.ID).get(this.getX(), 0, this.getZ());
            return id >> 7 == 1;
        }
    };
    public static final Restriction.Factory<ModRestriction> MUTATED_SECOND = (version, x, z) -> new ModRestriction("NOISE LAYER", x, z, Restriction.getSalt(version, NoiseLayer.class), 299999L, 0L, 29L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value, modulo);
            this.ID = 7.getLayerId(version, NoiseLayer.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            int id = source.getLayer(this.ID).get(this.getX(), 0, this.getZ());
            return id >> 7 == 1;
        }
    };
    public static final Restriction.Factory<BoundRestriction> SAVANNAH_BIOME = (version, x, z) -> new BoundRestriction("SAVANNAH_BIOME", x, z, Restriction.getSalt(version, BaseBiomesLayer.class), 6L, 3L, 4L){
        private final int ID;
        {
            super(name, x, z, salt, bound, min, max);
            this.ID = 8.getLayerId(version, BaseBiomesLayer.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            int id = source.getLayer(this.ID).get(this.getX(), 0, this.getZ());
            return id == Biomes.SAVANNA.getId();
        }
    };
    public static final Restriction.Factory<BoundRestriction> COLD_PLAINS = (version, x, z) -> new BoundRestriction("COLD_PLAINS", x, z, Restriction.getSalt(version, ClimateLayer.Cold.class), 6L, 2L, 5L){
        private final int ID;
        {
            super(name, x, z, salt, bound, min, max);
            this.ID = 9.getLayerId(version, ClimateLayer.Cold.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) == Biomes.PLAINS.getId();
        }
    };
    public static final Restriction.Factory<BoundRestriction> SPECIAL = (version, x, z) -> new BoundRestriction("SPECIAL", x, z, Restriction.getSalt(version, ClimateLayer.Special.class), 13L, 0L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value);
            this.ID = 10.getLayerId(version, ClimateLayer.Special.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) >> 8 != 0;
        }
    };
    public static final Restriction.Factory<BoundRestriction> MUSHROOM = (version, x, z) -> new BoundRestriction("MUSHROOM", x, z, Restriction.getSalt(version, MushroomLayer.class), 100L, 0L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value);
            this.ID = 11.getLayerId(version, MushroomLayer.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) == Biomes.MUSHROOM_FIELDS.getId();
        }
    };
    public static final Restriction.Factory<BoundRestriction> SUNFLOWER_PLAINS = (version, x, z) -> new BoundRestriction("SUNFLOWER_PLAINS", x, z, Restriction.getSalt(version, SunflowerPlainsLayer.class), 57L, 0L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value);
            this.ID = 12.getLayerId(version, SunflowerPlainsLayer.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) == Biomes.SUNFLOWER_PLAINS.getId();
        }
    };
    public static final Restriction.Factory<BoundRestriction> BAMBOO_JUNGLE = (version, x, z) -> new BoundRestriction("BAMBOO_JUNGLE", x, z, Restriction.getSalt(version, BambooJungleLayer.class), 10L, 0L){
        private final int ID;
        {
            super(name, x, z, salt, bound, value);
            this.ID = 13.getLayerId(version, BambooJungleLayer.class);
        }

        @Override
        public boolean testSource(LayeredBiomeSource<IntBiomeLayer> source) {
            return source.getLayer(this.ID).get(this.getX(), 0, this.getZ()) == Biomes.BAMBOO_JUNGLE.getId();
        }
    };
}

