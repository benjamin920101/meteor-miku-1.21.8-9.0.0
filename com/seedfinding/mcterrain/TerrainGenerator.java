/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcterrain;

import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.UnsupportedVersion;
import com.seedfinding.mcterrain.terrain.EndTerrainGenerator;
import com.seedfinding.mcterrain.terrain.NetherTerrainGenerator;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class TerrainGenerator {
    protected boolean amplified;
    protected final BiomeSource biomeSource;
    protected final MCVersion version;
    public static Predicate<Block> WORLD_SURFACE_WG = b -> b.getId() != Blocks.AIR.getId();
    public static Predicate<Block> OCEAN_FLOOR_WG = b -> b.getId() != Blocks.AIR.getId() && b.getId() != Blocks.WATER.getId() && b.getId() != Blocks.LAVA.getId();

    public TerrainGenerator(BiomeSource biomeSource) {
        this.biomeSource = biomeSource;
        this.version = biomeSource.getVersion();
        this.amplified = false;
        if (this.version.isOlderThan(MCVersion.v1_8)) {
            throw new UnsupportedVersion(this.version, "chunk generator");
        }
        if (this.version.isOlderThan(MCVersion.v1_11)) {
            System.err.println("WARNING THIS VERSION IS UNTESTED YET");
        }
    }

    public TerrainGenerator setAmplified(boolean amplified) {
        this.amplified = amplified;
        return this;
    }

    public static Factory factory(Dimension dimension) {
        if (dimension == Dimension.OVERWORLD) {
            return OverworldTerrainGenerator::new;
        }
        if (dimension == Dimension.NETHER) {
            return NetherTerrainGenerator::new;
        }
        if (dimension == Dimension.END) {
            return EndTerrainGenerator::new;
        }
        return null;
    }

    public static TerrainGenerator of(Dimension dimension, BiomeSource biomeSource) {
        Factory factory = TerrainGenerator.factory(dimension);
        return factory == null ? null : factory.create(biomeSource);
    }

    public static TerrainGenerator of(BiomeSource biomeSource) {
        Factory factory = TerrainGenerator.factory(biomeSource.getDimension());
        return factory == null ? null : factory.create(biomeSource);
    }

    public abstract Dimension getDimension();

    public BiomeSource getBiomeSource() {
        return this.biomeSource;
    }

    public MCVersion getVersion() {
        return this.version;
    }

    public long getWorldSeed() {
        return this.biomeSource.getWorldSeed();
    }

    public int getSeaLevel() {
        return 63;
    }

    public int getMinWorldHeight() {
        return 0;
    }

    public int getMaxWorldHeight() {
        return this.getWorldHeight() - this.getMinWorldHeight();
    }

    public abstract int getWorldHeight();

    public abstract Block getDefaultBlock();

    public abstract Block getDefaultFluid();

    protected abstract void sampleNoiseColumnOld(double[] var1, int var2, int var3, double var4, double var6);

    public int getHeightInGround(int x, int z) {
        return this.getHeightOnGround(x, z) - 1;
    }

    public abstract int getHeightOnGround(int var1, int var2);

    public abstract int getFirstHeightInColumn(int var1, int var2, Predicate<Block> var3);

    public abstract Block[] getColumnAt(int var1, int var2);

    public abstract Block[] getColumnAt(int var1, int var2, List<Pair<Supplier<Integer>, BlockBox>> var3, List<BPos> var4);

    public abstract Block[] getBiomeColumnAt(int var1, int var2);

    public abstract Block[] getBiomeColumnAt(int var1, int var2, List<Pair<Supplier<Integer>, BlockBox>> var3, List<BPos> var4);

    public abstract Block[] getBedrockColumnAt(int var1, int var2);

    public abstract Block[] getBedrockColumnAt(int var1, int var2, List<Pair<Supplier<Integer>, BlockBox>> var3, List<BPos> var4);

    public abstract Optional<Block> getBlockAt(int var1, int var2, int var3);

    public Optional<Block> getBlockAt(BPos pos) {
        return this.getBlockAt(pos.getX(), pos.getY(), pos.getZ());
    }

    @FunctionalInterface
    public static interface Factory {
        public TerrainGenerator create(BiomeSource var1);
    }
}

