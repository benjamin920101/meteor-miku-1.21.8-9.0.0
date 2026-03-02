/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.Feature;
import com.seedfinding.mcfeature.structure.Structure;

public abstract class RegionStructure<C extends Config, D extends Data<?>>
extends Structure<C, D> {
    public RegionStructure(C config, MCVersion version) {
        super(config, version);
    }

    public static String name() {
        return "region_structure";
    }

    public int getSpacing() {
        return ((Config)this.getConfig()).spacing;
    }

    public int getSeparation() {
        return ((Config)this.getConfig()).separation;
    }

    public int getSalt() {
        return ((Config)this.getConfig()).salt;
    }

    public Data<?> at(int chunkX, int chunkZ) {
        return new Data<RegionStructure>(this, chunkX, chunkZ);
    }

    public abstract CPos getInRegion(long var1, int var3, int var4, ChunkRand var5);

    public static class Config
    extends Feature.Config {
        public final int spacing;
        public final int separation;
        public final int salt;

        public Config(int spacing, int separation, int salt) {
            this.spacing = spacing;
            this.separation = separation;
            this.salt = salt;
        }
    }

    public static class Data<T extends RegionStructure<?, ?>>
    extends Feature.Data<T> {
        public final int regionX;
        public final int regionZ;
        public final int offsetX;
        public final int offsetZ;
        public final long baseRegionSeed;

        public Data(T structure, int chunkX, int chunkZ) {
            super(structure, chunkX, chunkZ);
            int x = this.chunkX < 0 ? this.chunkX - ((RegionStructure)this.feature).getSpacing() + 1 : this.chunkX;
            int z = this.chunkZ < 0 ? this.chunkZ - ((RegionStructure)this.feature).getSpacing() + 1 : this.chunkZ;
            this.regionX = x / ((RegionStructure)this.feature).getSpacing();
            this.regionZ = z / ((RegionStructure)this.feature).getSpacing();
            this.offsetX = this.chunkX - this.regionX * ((RegionStructure)this.feature).getSpacing();
            this.offsetZ = this.chunkZ - this.regionZ * ((RegionStructure)this.feature).getSpacing();
            this.baseRegionSeed = new ChunkRand().setRegionSeed(0L, this.regionX, this.regionZ, ((RegionStructure)this.feature).getSalt(), ((RegionStructure)this.feature).getVersion());
        }

        public String toString() {
            return "Data{regionX=" + this.regionX + ", regionZ=" + this.regionZ + ", offsetX=" + this.offsetX + ", offsetZ=" + this.offsetZ + ", baseRegionSeed=" + this.baseRegionSeed + '}';
        }
    }
}

