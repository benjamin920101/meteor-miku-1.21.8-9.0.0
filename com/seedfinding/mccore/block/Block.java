/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.block;

import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.util.data.Identifier;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.VersionMap;
import java.util.function.BiPredicate;

public class Block {
    private final int id;
    private final Identifier name;
    private final int meta;
    private final MCVersion version;
    private final MCVersion implementedVersion;
    public static final BiPredicate<MCVersion, Block> IS_AIR = (version, block) -> version.isNewerOrEqualTo(MCVersion.oldest()) && (block == Blocks.AIR || block == Blocks.CAVE_AIR || block == Blocks.VOID_AIR);
    public static final VersionMap<Block> RANDOM_TICKING = new VersionMap<Block>(){
        {
            this.add(MCVersion.v1_16, Blocks.GRASS_BLOCK);
            this.add(MCVersion.v1_16, Blocks.OAK_SAPLING);
            this.add(MCVersion.v1_16, Blocks.SPRUCE_SAPLING);
            this.add(MCVersion.v1_16, Blocks.BIRCH_SAPLING);
            this.add(MCVersion.v1_16, Blocks.JUNGLE_SAPLING);
            this.add(MCVersion.v1_16, Blocks.ACACIA_SAPLING);
            this.add(MCVersion.v1_16, Blocks.DARK_OAK_SAPLING);
            this.add(MCVersion.v1_16, Blocks.LAVA);
            this.add(MCVersion.v1_16, Blocks.BROWN_MUSHROOM);
            this.add(MCVersion.v1_16, Blocks.RED_MUSHROOM);
            this.add(MCVersion.v1_16, Blocks.WHEAT);
            this.add(MCVersion.v1_16, Blocks.FARMLAND);
            this.add(MCVersion.v1_16, Blocks.REDSTONE_ORE);
            this.add(MCVersion.v1_16, Blocks.SNOW);
            this.add(MCVersion.v1_16, Blocks.ICE);
            this.add(MCVersion.v1_16, Blocks.CACTUS);
            this.add(MCVersion.v1_16, Blocks.SUGAR_CANE);
            this.add(MCVersion.v1_16, Blocks.NETHER_PORTAL);
            this.add(MCVersion.v1_16, Blocks.PUMPKIN_STEM);
            this.add(MCVersion.v1_16, Blocks.MELON_STEM);
            this.add(MCVersion.v1_16, Blocks.VINE);
            this.add(MCVersion.v1_16, Blocks.MYCELIUM);
            this.add(MCVersion.v1_16, Blocks.NETHER_WART);
            this.add(MCVersion.v1_16, Blocks.COCOA);
            this.add(MCVersion.v1_16, Blocks.CARROTS);
            this.add(MCVersion.v1_16, Blocks.POTATOES);
            this.add(MCVersion.v1_16, Blocks.CHORUS_FLOWER);
            this.add(MCVersion.v1_16, Blocks.BEETROOTS);
            this.add(MCVersion.v1_16, Blocks.FROSTED_ICE);
            this.add(MCVersion.v1_16, Blocks.KELP);
            this.add(MCVersion.v1_16, Blocks.TURTLE_EGG);
            this.add(MCVersion.v1_16, Blocks.BAMBOO_SAPLING);
            this.add(MCVersion.v1_16, Blocks.BAMBOO);
            this.add(MCVersion.v1_16, Blocks.SWEET_BERRY_BUSH);
            this.add(MCVersion.v1_16, Blocks.WARPED_NYLIUM);
            this.add(MCVersion.v1_16, Blocks.CRIMSON_NYLIUM);
            this.add(MCVersion.v1_16, Blocks.WEEPING_VINES);
            this.add(MCVersion.v1_16, Blocks.TWISTING_VINES);
            this.add(MCVersion.v1_16, Blocks.MAGMA_BLOCK);
            this.add(MCVersion.v1_16, Blocks.OAK_LEAVES);
            this.add(MCVersion.v1_16, Blocks.SPRUCE_LEAVES);
            this.add(MCVersion.v1_16, Blocks.BIRCH_LEAVES);
            this.add(MCVersion.v1_16, Blocks.JUNGLE_LEAVES);
            this.add(MCVersion.v1_16, Blocks.ACACIA_LEAVES);
            this.add(MCVersion.v1_16, Blocks.DARK_OAK_LEAVES);
        }
    };
    public static final BiPredicate<MCVersion, Block> IS_RANDOM_TICKING = (version, block) -> RANDOM_TICKING.getMapUntil((MCVersion)((Object)version)).containsKey(block);

    public Block(MCVersion version, int id, String name, MCVersion historic) {
        this(version, id, name, historic, 0);
    }

    public Block(MCVersion version, int id, String name, MCVersion historic, int meta) {
        this.version = version;
        this.id = id;
        this.name = new Identifier(name);
        this.implementedVersion = historic;
        this.meta = meta;
    }

    public MCVersion getImplementedVersion() {
        return this.implementedVersion;
    }

    public MCVersion getVersion() {
        return this.version;
    }

    public int getId() {
        return this.id;
    }

    public Identifier getIdentifier() {
        return this.name;
    }

    public String getRegistryName() {
        return this.name.toString();
    }

    public String getName() {
        return this.name.getPath();
    }

    public int getMeta() {
        return this.meta;
    }

    public int hashCode() {
        return this.getRegistryName().hashCode() * 31 + this.meta;
    }

    public String toString() {
        return this.getRegistryName();
    }
}

