/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.biome;

import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.biome.surface.SurfaceConfig;
import com.seedfinding.mcbiome.biome.surface.builder.SurfaceBuilder;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mcbiome.source.StaticNoiseSource;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Biome {
    private final MCVersion version;
    private final Dimension dimension;
    private final int id;
    private final String name;
    private final Category category;
    private final Precipitation precipitation;
    private final float temperature;
    private final float scale;
    private final float depth;
    private final Biome parent;
    private final SurfaceBuilder surfaceBuilder;
    private Biome child;

    public Biome(MCVersion version, Dimension dimension, int id, String name, Category category, Precipitation precipitation, float temperature, float scale, float depth, Biome parent, SurfaceBuilder surfaceBuilder) {
        this.version = version;
        this.dimension = dimension;
        this.id = id;
        this.name = name;
        this.category = category;
        this.precipitation = precipitation;
        this.temperature = temperature;
        this.scale = scale;
        this.depth = depth;
        this.parent = parent;
        this.surfaceBuilder = surfaceBuilder;
        if (this.parent != null) {
            this.parent.child = this;
        }
    }

    public MCVersion getVersion() {
        return this.version;
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Category getCategory() {
        return this.category;
    }

    public Precipitation getPrecipitation() {
        return this.precipitation;
    }

    public float getTemperature() {
        return this.temperature;
    }

    public Temperature getTemperatureGroup() {
        if (this.category == Category.OCEAN) {
            return Temperature.OCEAN;
        }
        if (this.getTemperature() < 0.2f) {
            return Temperature.COLD;
        }
        if (this.getTemperature() < 1.0f) {
            return Temperature.MEDIUM;
        }
        return Temperature.WARM;
    }

    public float getScale() {
        return this.scale;
    }

    public float getDepth() {
        return this.depth;
    }

    public boolean hasParent() {
        return this.parent != null;
    }

    public Biome getParent() {
        return this.parent;
    }

    public boolean hasChild() {
        return this.child != null;
    }

    public Biome getChild() {
        return this.child;
    }

    public SurfaceConfig getSurfaceConfig() {
        return this.surfaceBuilder.getSurfaceConfig();
    }

    public SurfaceBuilder getSurfaceBuilder() {
        return this.surfaceBuilder;
    }

    public static boolean isShallowOcean(int id, MCVersion version) {
        if (version.isOlderThan(MCVersion.v1_13)) {
            return id == Biomes.OCEAN.getId();
        }
        return id == Biomes.OCEAN.getId() || id == Biomes.WARM_OCEAN.getId() || id == Biomes.LUKEWARM_OCEAN.getId() || id == Biomes.COLD_OCEAN.getId() || id == Biomes.FROZEN_OCEAN.getId();
    }

    public static boolean isOcean(int id) {
        return id == Biomes.WARM_OCEAN.getId() || id == Biomes.LUKEWARM_OCEAN.getId() || id == Biomes.OCEAN.getId() || id == Biomes.COLD_OCEAN.getId() || id == Biomes.FROZEN_OCEAN.getId() || id == Biomes.DEEP_WARM_OCEAN.getId() || id == Biomes.DEEP_LUKEWARM_OCEAN.getId() || id == Biomes.DEEP_OCEAN.getId() || id == Biomes.DEEP_COLD_OCEAN.getId() || id == Biomes.DEEP_FROZEN_OCEAN.getId();
    }

    public static boolean isRiver(int id) {
        return id == Biomes.RIVER.getId() || id == Biomes.FROZEN_RIVER.getId();
    }

    public static boolean areSimilar(int id, Biome b2, MCVersion version) {
        if (b2 == null) {
            return false;
        }
        if (id == b2.getId()) {
            return true;
        }
        Biome b = Biomes.REGISTRY.get(id);
        if (b == null) {
            return false;
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_16_2)) {
            if (b == Biomes.WOODED_BADLANDS_PLATEAU || b == Biomes.BADLANDS_PLATEAU) {
                return b2 == Biomes.WOODED_BADLANDS_PLATEAU || b2 == Biomes.BADLANDS_PLATEAU;
            }
            if (b2 == Biomes.WOODED_BADLANDS_PLATEAU || b2 == Biomes.BADLANDS_PLATEAU) {
                return false;
            }
            return b.getCategory() == b2.getCategory();
        }
        if (id != Biomes.WOODED_BADLANDS_PLATEAU.getId() && id != Biomes.BADLANDS_PLATEAU.getId()) {
            if (b.getCategory() != Category.NONE && b2.getCategory() != Category.NONE && b.getCategory() == b2.getCategory()) {
                return true;
            }
            return b == b2;
        }
        return b2 == Biomes.WOODED_BADLANDS_PLATEAU || b2 == Biomes.BADLANDS_PLATEAU;
    }

    public static boolean applyAll(Function<Integer, Boolean> function, int ... ints) {
        for (int i : ints) {
            if (function.apply(i).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public static int equalsOrDefault(int comparator, int comparable, int fallback) {
        return comparator == comparable ? comparable : fallback;
    }

    public Data at(int x, int z) {
        return new Data(this, x, z);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Biome)) {
            return false;
        }
        Biome biome = (Biome)o;
        return this.id == biome.id;
    }

    public int hashCode() {
        return Objects.hash(this.id);
    }

    public String toString() {
        return "Biome{id=" + this.id + ", name='" + this.name + '\'' + ", category=" + (Object)((Object)this.category) + ", precipitation=" + (Object)((Object)this.precipitation) + ", temperature=" + this.temperature + ", scale=" + this.scale + ", depth=" + this.depth + ", parent=" + (this.parent == null ? null : this.parent.name) + ", dimension=" + (Object)((Object)this.dimension) + ", child=" + (this.child == null ? null : this.child.name) + '}';
    }

    public float getTemperatureAt(int x, int y, int z) {
        return StaticNoiseSource.TEMPERATURE_CACHE.get(x, y, z, this::getTemperature);
    }

    public float getTemperatureAt(BPos pos) {
        return StaticNoiseSource.TEMPERATURE_CACHE.get(pos.getX(), pos.getY(), pos.getZ(), this::getTemperature);
    }

    private float getTemperature(int x, int y, int z) {
        double d3;
        double d1;
        double d0;
        double d2;
        float temperature = this.temperature;
        if ((this.equals(Biomes.FROZEN_OCEAN) || this.equals(Biomes.DEEP_FROZEN_OCEAN)) && (d2 = (d0 = StaticNoiseSource.FROZEN_TEMPERATURE_NOISE.sample((double)x * 0.05, (double)z * 0.05, false) * 7.0) + (d1 = StaticNoiseSource.BIOME_INFO_NOISE.sample((double)x * 0.2, (double)z * 0.2, false))) < 0.3 && (d3 = StaticNoiseSource.BIOME_INFO_NOISE.sample((double)x * 0.09, (double)z * 0.09, false)) < 0.8) {
            temperature = 0.2f;
        }
        if (y > 64) {
            float f1 = (float)(StaticNoiseSource.TEMPERATURE_NOISE.sample((float)x / 8.0f, (float)z / 8.0f, false) * 4.0);
            return temperature - (f1 + (float)y - 64.0f) * 0.05f / 30.0f;
        }
        return temperature;
    }

    @FunctionalInterface
    public static interface TemperatureSampler {
        public float sample(int var1, int var2, int var3);
    }

    public static class Data {
        public final Predicate<Biome> predicate;
        public final Biome biome;
        public final int x;
        public final int z;

        public Data(Biome biome, int x, int z) {
            this(b -> b == biome, biome, x, z);
        }

        public Data(Predicate<Biome> predicate, int x, int z) {
            this(predicate, null, x, z);
        }

        protected Data(Predicate<Biome> predicate, Biome biome, int x, int z) {
            this.predicate = predicate;
            this.biome = biome;
            this.x = x;
            this.z = z;
        }

        public boolean test(OverworldBiomeSource source) {
            return this.predicate.test(source.getBiome(this.x, 0, this.z));
        }
    }

    public static enum Precipitation {
        NONE("none"),
        RAIN("rain"),
        SNOW("snow");

        private final String name;

        private Precipitation(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static enum Temperature {
        OCEAN("ocean"),
        COLD("cold"),
        MEDIUM("medium"),
        WARM("warm");

        private final String name;

        private Temperature(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static enum Category {
        NONE("none"),
        TAIGA("taiga"),
        EXTREME_HILLS("extreme_hills"),
        JUNGLE("jungle"),
        MESA("mesa"),
        BADLANDS_PLATEAU("badlands_plateau"),
        PLAINS("plains"),
        SAVANNA("savanna"),
        ICY("icy"),
        THE_END("the_end"),
        BEACH("beach"),
        FOREST("forest"),
        OCEAN("ocean"),
        DESERT("desert"),
        RIVER("river"),
        SWAMP("swamp"),
        MUSHROOM("mushroom"),
        NETHER("nether");

        private final String name;

        private Category(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}

