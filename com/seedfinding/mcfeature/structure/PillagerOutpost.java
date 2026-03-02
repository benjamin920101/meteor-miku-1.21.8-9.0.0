/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.VersionMap;
import com.seedfinding.mcfeature.structure.OldStructure;
import com.seedfinding.mcfeature.structure.RegionStructure;
import com.seedfinding.mcfeature.structure.Village;
import java.util.ArrayList;
import java.util.List;

public class PillagerOutpost
extends OldStructure<PillagerOutpost> {
    public static final VersionMap<OldStructure.Config> CONFIGS = new VersionMap<OldStructure.Config>().add(MCVersion.v1_14, new OldStructure.Config(165745296));
    private final Village village;

    public PillagerOutpost(MCVersion version) {
        this(version, new Village(version));
    }

    public PillagerOutpost(MCVersion version, Village village) {
        this(CONFIGS.getAsOf(version), version, village);
    }

    public PillagerOutpost(RegionStructure.Config config, MCVersion version, Village village) {
        super(config, version);
        this.village = village;
    }

    public static String name() {
        return "pillager_outpost";
    }

    public Village getVillage() {
        return this.village;
    }

    @Override
    public boolean canStart(RegionStructure.Data<PillagerOutpost> data, long structureSeed, ChunkRand rand) {
        if (!super.canStart(data, structureSeed, rand)) {
            return false;
        }
        rand.setWeakSeed(structureSeed, data.chunkX, data.chunkZ, this.getVersion());
        rand.nextInt();
        if (rand.nextInt(5) != 0) {
            return false;
        }
        if (this.getVersion().isOlderThan(MCVersion.v1_16)) {
            return true;
        }
        return !this.hasNearbyVillage(structureSeed, data.chunkX, data.chunkZ, rand);
    }

    @Override
    public CPos getInRegion(long structureSeed, int regionX, int regionZ, ChunkRand rand) {
        CPos chunkPos = super.getInRegion(structureSeed, regionX, regionZ, rand);
        rand.setWeakSeed(structureSeed, chunkPos.getX(), chunkPos.getZ(), this.getVersion());
        rand.nextInt();
        if (rand.nextInt(5) != 0) {
            return null;
        }
        if (this.getVersion().isOlderThan(MCVersion.v1_16)) {
            return chunkPos;
        }
        return this.hasNearbyVillage(structureSeed, chunkPos.getX(), chunkPos.getZ(), rand) ? null : chunkPos;
    }

    @Override
    public boolean canSpawn(int chunkX, int chunkZ, BiomeSource source) {
        if (!super.canSpawn(chunkX, chunkZ, source)) {
            return false;
        }
        if (this.getVersion().isOlderThan(MCVersion.v1_16)) {
            for (CPos nearbyVillage : this.getNearbyVillages(source.getWorldSeed(), chunkX, chunkZ, new ChunkRand())) {
                if (!this.village.canSpawn(nearbyVillage.getX(), nearbyVillage.getZ(), source)) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public Dimension getValidDimension() {
        return Dimension.OVERWORLD;
    }

    @Override
    public boolean isValidBiome(Biome biome) {
        return biome == Biomes.PLAINS || biome == Biomes.DESERT || biome == Biomes.SAVANNA || biome == Biomes.TAIGA || biome == Biomes.SNOWY_TUNDRA;
    }

    public boolean hasNearbyVillage(long structureSeed, int chunkX, int chunkZ, ChunkRand rand) {
        CPos outpostPos = new CPos(chunkX, chunkZ);
        RegionStructure.Data<?> nw = this.village.at(chunkX - 10, chunkZ - 10);
        RegionStructure.Data<?> se = this.village.at(chunkX + 10, chunkZ + 10);
        CPos villagePos = this.village.getInRegion(structureSeed, nw.regionX, nw.regionZ, rand);
        if (villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0) {
            return true;
        }
        if (nw.regionX == se.regionX && nw.regionZ == se.regionZ) {
            return false;
        }
        if (nw.regionX != se.regionX && nw.regionZ != se.regionZ) {
            villagePos = this.village.getInRegion(structureSeed, se.regionX, se.regionZ, rand);
            if (villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0) {
                return true;
            }
            RegionStructure.Data<?> sw = this.village.at(chunkX - 10, chunkZ + 10);
            villagePos = this.village.getInRegion(structureSeed, sw.regionX, sw.regionZ, rand);
            if (villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0) {
                return true;
            }
            RegionStructure.Data<?> ne = this.village.at(chunkX + 10, chunkZ - 10);
            villagePos = this.village.getInRegion(structureSeed, ne.regionX, ne.regionZ, rand);
            return villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0;
        }
        villagePos = this.village.getInRegion(structureSeed, se.regionX, se.regionZ, rand);
        return villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0;
    }

    public List<CPos> getNearbyVillages(long structureSeed, int chunkX, int chunkZ, ChunkRand rand) {
        ArrayList<CPos> villages = new ArrayList<CPos>();
        CPos outpostPos = new CPos(chunkX, chunkZ);
        RegionStructure.Data<?> nw = this.village.at(chunkX - 10, chunkZ - 10);
        RegionStructure.Data<?> se = this.village.at(chunkX + 10, chunkZ + 10);
        CPos villagePos = this.village.getInRegion(structureSeed, nw.regionX, nw.regionZ, rand);
        if (villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0) {
            villages.add(villagePos);
        }
        if (nw.regionX == se.regionX && nw.regionZ == se.regionZ) {
            return villages;
        }
        if (nw.regionX != se.regionX && nw.regionZ != se.regionZ) {
            villagePos = this.village.getInRegion(structureSeed, se.regionX, se.regionZ, rand);
            if (villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0) {
                villages.add(villagePos);
            }
            RegionStructure.Data<?> sw = this.village.at(chunkX - 10, chunkZ + 10);
            villagePos = this.village.getInRegion(structureSeed, sw.regionX, sw.regionZ, rand);
            if (villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0) {
                villages.add(villagePos);
            }
            RegionStructure.Data<?> ne = this.village.at(chunkX + 10, chunkZ - 10);
            villagePos = this.village.getInRegion(structureSeed, ne.regionX, ne.regionZ, rand);
            if (villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0) {
                villages.add(villagePos);
            }
            return villages;
        }
        villagePos = this.village.getInRegion(structureSeed, se.regionX, se.regionZ, rand);
        if (villagePos != null && villagePos.distanceTo(outpostPos, DistanceMetric.CHEBYSHEV) <= 10.0) {
            villages.add(villagePos);
        }
        return villages;
    }

    public boolean hasNearbyVillageNaive(long structureSeed, int chunkX, int chunkZ, ChunkRand rand) {
        for (int z = chunkZ - 10; z <= chunkZ + 10; ++z) {
            for (int x = chunkX - 10; x <= chunkX + 10; ++x) {
                if (!this.village.at(x, z).testStart(structureSeed, rand)) continue;
                return true;
            }
        }
        return false;
    }
}

