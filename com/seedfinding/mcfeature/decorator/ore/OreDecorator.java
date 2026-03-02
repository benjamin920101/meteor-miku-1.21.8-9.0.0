/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.decorator.ore;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.decorator.Decorator;
import com.seedfinding.mcfeature.decorator.ore.HeightProvider;
import com.seedfinding.mcseed.rand.JRand;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class OreDecorator<C extends Config, D extends Data<?>>
extends Decorator<C, D> {
    protected static final Set<Block> BASE_STONE_OVERWORLD = new HashSet<Block>();
    protected static final Set<Block> BASE_STONE_NETHER = new HashSet<Block>();
    protected static final Set<Block> STONE = new HashSet<Block>();
    protected static final Set<Block> NETHERRACK = new HashSet<Block>();
    protected static final Set<Block> DIRT_CLAY = new HashSet<Block>();
    protected static final Set<Block> DIRT_GRASS = new HashSet<Block>();

    public OreDecorator(C config, MCVersion version) {
        super(config, version);
    }

    public int getDefaultSize() {
        return ((Config)this.getConfig()).size;
    }

    public int getSize(Biome biome) {
        return ((Config)this.getConfig()).getSize(biome);
    }

    public int getDefaultRepeatCount() {
        return ((Config)this.getConfig()).repeatCount;
    }

    public int getRepeatCount(Biome biome) {
        return ((Config)this.getConfig()).getRepeatCount(biome);
    }

    public HeightProvider getDefaultHeightProvider() {
        return ((Config)this.getConfig()).heightProvider;
    }

    public HeightProvider getHeightProvider(Biome biome) {
        return ((Config)this.getConfig()).getHeightProvider(biome);
    }

    public Block getDefaultOreBlock() {
        return ((Config)this.getConfig()).oreBlock;
    }

    public Block getOreBlock(Biome biome) {
        return ((Config)this.getConfig()).getOreBlock(biome);
    }

    public Set<Block> getDefaultReplaceBlocks() {
        return ((Config)this.getConfig()).replaceBlocks;
    }

    public Set<Block> getReplaceBlocks(Biome biome) {
        return ((Config)this.getConfig()).getReplaceBlocks(biome);
    }

    @Override
    public boolean canGenerate(D data, TerrainGenerator generator) {
        return true;
    }

    public D generate(long structureSeed, int chunkX, int chunkZ, Biome biome, ChunkRand rand, TerrainGenerator generator) {
        this.setDecoratorSeed(structureSeed, chunkX, chunkZ, biome, rand);
        HashSet<BPos> positions = new HashSet<BPos>();
        for (int i = 0; i < this.getRepeatCount(biome); ++i) {
            positions.addAll(this.generateOrePositions(this.generateBasePosition(chunkX, chunkZ, biome, rand), biome, generator, rand));
        }
        return (D)new Data<OreDecorator>(this, new BPos(chunkX << 4, 0, chunkZ << 4), positions, biome);
    }

    @Override
    public D getData(long structureSeed, int chunkX, int chunkZ, Biome biome, ChunkRand rand) {
        this.setDecoratorSeed(structureSeed, chunkX, chunkZ, biome, rand);
        return (D)new Data<OreDecorator>(this, new BPos(chunkX << 4, 0, chunkZ << 4), Collections.emptySet(), biome);
    }

    protected BPos generateBasePosition(int chunkX, int chunkZ, Biome biome, JRand rand) {
        if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_15)) {
            int blockX = (chunkX << 4) + rand.nextInt(16);
            int blockZ = (chunkZ << 4) + rand.nextInt(16);
            int blockY = this.getHeightProvider(biome).getY(rand);
            return new BPos(blockX, blockY, blockZ);
        }
        int blockX = (chunkX << 4) + rand.nextInt(16);
        int blockY = this.getHeightProvider(biome).getY(rand);
        int blockZ = (chunkZ << 4) + rand.nextInt(16);
        return new BPos(blockX, blockY, blockZ);
    }

    protected abstract List<BPos> generateOrePositions(BPos var1, Biome var2, TerrainGenerator var3, JRand var4);

    @Override
    public boolean isValidBiome(Biome biome) {
        return this.getValidDimension().equals((Object)biome.getDimension());
    }

    static {
        BASE_STONE_OVERWORLD.addAll(Arrays.asList(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.DEEPSLATE, Blocks.TUFF));
        BASE_STONE_NETHER.addAll(Arrays.asList(Blocks.NETHERRACK, Blocks.BASALT, Blocks.BLACKSTONE));
        STONE.addAll(Collections.singletonList(Blocks.STONE));
        NETHERRACK.addAll(Collections.singletonList(Blocks.NETHERRACK));
        DIRT_CLAY.addAll(Arrays.asList(Blocks.DIRT, Blocks.CLAY));
        DIRT_GRASS.addAll(Arrays.asList(Blocks.DIRT, Blocks.GRASS_BLOCK));
    }

    public static class Config
    extends Decorator.Config {
        public final int size;
        public final int repeatCount;
        public final HeightProvider heightProvider;
        public final Block oreBlock;
        public final Set<Block> replaceBlocks;
        private final Map<Biome, Config> overrides = new HashMap<Biome, Config>();

        public Config(int index, int step, int size, int repeatCount, HeightProvider heightProvider, Block oreBlock, Set<Block> replaceBlocks) {
            super(index, step);
            this.size = size;
            this.repeatCount = repeatCount;
            this.heightProvider = heightProvider;
            this.oreBlock = oreBlock;
            this.replaceBlocks = replaceBlocks;
        }

        public int getSize(Biome biome) {
            return this.overrides.getOrDefault((Object)biome, (Config)this).size;
        }

        public int getRepeatCount(Biome biome) {
            return this.overrides.getOrDefault((Object)biome, (Config)this).repeatCount;
        }

        public HeightProvider getHeightProvider(Biome biome) {
            return this.overrides.getOrDefault((Object)biome, (Config)this).heightProvider;
        }

        public Block getOreBlock(Biome biome) {
            return this.overrides.getOrDefault((Object)biome, (Config)this).oreBlock;
        }

        public Set<Block> getReplaceBlocks(Biome biome) {
            return this.overrides.getOrDefault((Object)biome, (Config)this).replaceBlocks;
        }

        @Override
        public Config add(int index, int step, Biome ... biomes) {
            super.add(index, step, biomes);
            return this;
        }

        public Config add(int index, int step, int size, int repeatCount, Biome ... biomes) {
            return this.add(index, step, size, repeatCount, this.heightProvider, biomes);
        }

        public Config add(int index, int step, int size, int repeatCount, HeightProvider heightProvider, Biome ... biomes) {
            return this.add(index, step, size, repeatCount, heightProvider, this.oreBlock, this.replaceBlocks, biomes);
        }

        public Config add(int index, int step, int size, int repeatCount, HeightProvider heightProvider, Block oreBlock, Set<Block> replaceBlocks, Biome ... biomes) {
            super.add(index, step, biomes);
            for (Biome biome : biomes) {
                this.overrides.put(biome, new Config(index, step, size, repeatCount, heightProvider, oreBlock, replaceBlocks));
            }
            return this;
        }
    }

    public static class Data<T extends Decorator<?, ?>>
    extends Decorator.Data<T> {
        public BPos basePos;
        public Set<BPos> positions;

        public Data(T feature, BPos basePos, Set<BPos> positions, Biome biome) {
            super(feature, basePos.getX() >> 4, basePos.getZ() >> 4, biome);
            this.basePos = basePos;
            this.positions = positions;
        }
    }
}

