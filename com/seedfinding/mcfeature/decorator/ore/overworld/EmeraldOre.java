/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.decorator.ore.overworld;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.VersionMap;
import com.seedfinding.mcfeature.decorator.ore.HeightProvider;
import com.seedfinding.mcfeature.decorator.ore.OreDecorator;
import com.seedfinding.mcseed.rand.JRand;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.ArrayList;
import java.util.List;

public class EmeraldOre
extends OreDecorator<OreDecorator.Config, OreDecorator.Data<EmeraldOre>> {
    public static final VersionMap<OreDecorator.Config> CONFIGS = new VersionMap<OreDecorator.Config>().add(MCVersion.v1_13, new OreDecorator.Config(14, 4, 1, 1, HeightProvider.custom(r -> r.nextInt(28) + 4), Blocks.EMERALD_ORE, STONE)).add(MCVersion.v1_16, new OreDecorator.Config(14, 6, 1, 1, HeightProvider.custom(r -> r.nextInt(28) + 4), Blocks.EMERALD_ORE, STONE)).add(MCVersion.v1_17, new OreDecorator.Config(17, 6, 1, 1, HeightProvider.uniformRange(4, 31), Blocks.EMERALD_ORE, BASE_STONE_OVERWORLD));

    public EmeraldOre(MCVersion version) {
        super(CONFIGS.getAsOf(version), version);
    }

    @Override
    public String getName() {
        return EmeraldOre.name();
    }

    public static String name() {
        return "emerald_ore";
    }

    @Override
    protected BPos generateBasePosition(int chunkX, int chunkZ, Biome biome, JRand rand) {
        return new BPos(chunkX << 4, 0, chunkZ << 4);
    }

    @Override
    public Dimension getValidDimension() {
        return Dimension.OVERWORLD;
    }

    @Override
    public boolean isValidBiome(Biome biome) {
        return biome == Biomes.MOUNTAINS || biome == Biomes.MOUNTAIN_EDGE || biome == Biomes.WOODED_MOUNTAINS || biome == Biomes.GRAVELLY_MOUNTAINS || biome == Biomes.MODIFIED_GRAVELLY_MOUNTAINS;
    }

    @Override
    protected List<BPos> generateOrePositions(BPos bPos, Biome biome, TerrainGenerator generator, JRand rand) {
        ArrayList<BPos> poses = new ArrayList<BPos>();
        int count = this.getVersion().isNewerOrEqualTo(MCVersion.v1_17_1) ? EmeraldOre.nextBetween(rand, 3, 8) : (this.getVersion().isNewerOrEqualTo(MCVersion.v1_17) ? EmeraldOre.nextBetween(rand, 6, 24) : 3 + rand.nextInt(6));
        for (int i = 0; i < count; ++i) {
            int x;
            if (this.getVersion().isNewerOrEqualTo(MCVersion.v1_15)) {
                x = bPos.getX() + rand.nextInt(16);
                int z = bPos.getZ() + rand.nextInt(16);
                int y = this.getHeightProvider(biome).getY(rand);
                poses.add(new BPos(x, y, z));
                continue;
            }
            x = bPos.getX() + rand.nextInt(16);
            int y = this.getHeightProvider(biome).getY(rand);
            int z = bPos.getZ() + rand.nextInt(16);
            poses.add(new BPos(x, y, z));
        }
        return poses;
    }

    private static int nextBetween(JRand rand, int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }
}

