/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.structure.RegionStructure;

public abstract class TriangularStructure<T extends TriangularStructure<T>>
extends RegionStructure<RegionStructure.Config, RegionStructure.Data<T>> {
    private final int peak = this.getSpacing() - this.getSeparation();

    public TriangularStructure(RegionStructure.Config config, MCVersion version) {
        super(config, version);
    }

    public static String name() {
        return "triangular_structure";
    }

    public int getPeak() {
        return this.peak;
    }

    @Override
    public boolean canStart(RegionStructure.Data<T> data, long structureSeed, ChunkRand rand) {
        rand.setSeed(data.baseRegionSeed + structureSeed);
        return (rand.nextInt(this.peak) + rand.nextInt(this.peak)) / 2 == data.offsetX && (rand.nextInt(this.peak) + rand.nextInt(this.peak)) / 2 == data.offsetZ;
    }

    @Override
    public CPos getInRegion(long structureSeed, int regionX, int regionZ, ChunkRand rand) {
        rand.setRegionSeed(structureSeed, regionX, regionZ, this.getSalt(), this.getVersion());
        return new CPos(regionX * this.getSpacing() + (rand.nextInt(this.peak) + rand.nextInt(this.peak)) / 2, regionZ * this.getSpacing() + (rand.nextInt(this.peak) + rand.nextInt(this.peak)) / 2);
    }
}

