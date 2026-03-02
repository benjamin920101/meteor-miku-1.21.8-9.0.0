/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.Feature;
import com.seedfinding.mcfeature.structure.BastionRemnant;
import com.seedfinding.mcfeature.structure.BuriedTreasure;
import com.seedfinding.mcfeature.structure.DesertPyramid;
import com.seedfinding.mcfeature.structure.EndCity;
import com.seedfinding.mcfeature.structure.Fortress;
import com.seedfinding.mcfeature.structure.Igloo;
import com.seedfinding.mcfeature.structure.JunglePyramid;
import com.seedfinding.mcfeature.structure.Mansion;
import com.seedfinding.mcfeature.structure.Mineshaft;
import com.seedfinding.mcfeature.structure.Monument;
import com.seedfinding.mcfeature.structure.NetherFossil;
import com.seedfinding.mcfeature.structure.OceanRuin;
import com.seedfinding.mcfeature.structure.PillagerOutpost;
import com.seedfinding.mcfeature.structure.RuinedPortal;
import com.seedfinding.mcfeature.structure.Shipwreck;
import com.seedfinding.mcfeature.structure.Stronghold;
import com.seedfinding.mcfeature.structure.SwampHut;
import com.seedfinding.mcfeature.structure.Village;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.HashMap;
import java.util.Map;

public abstract class Structure<C extends Feature.Config, D extends Feature.Data<?>>
extends Feature<C, D> {
    protected Biome biome;
    public static Map<Class<? extends Structure>, String> CLASS_TO_NAME = new HashMap<Class<? extends Structure>, String>();

    public Structure(C config, MCVersion version) {
        super(config, version);
    }

    public static String getName(Class<? extends Structure> structure) {
        return CLASS_TO_NAME.get(structure);
    }

    public static String name() {
        return "structure";
    }

    @Override
    public String getName() {
        return Structure.getName(this.getClass());
    }

    public Biome getBiome() {
        return this.biome;
    }

    @Override
    public final boolean canSpawn(D data, BiomeSource source) {
        return this.canSpawn(((Feature.Data)data).chunkX, ((Feature.Data)data).chunkZ, source);
    }

    @Override
    public boolean canSpawn(CPos cPos, BiomeSource source) {
        return this.canSpawn(cPos.getX(), cPos.getZ(), source);
    }

    public boolean canSpawn(int chunkX, int chunkZ, BiomeSource source) {
        this.biome = this.getVersion().isOlderThan(MCVersion.v1_16) ? source.getBiome((chunkX << 4) + 9, 0, (chunkZ << 4) + 9) : source.getBiomeForNoiseGen((chunkX << 2) + 2, 0, (chunkZ << 2) + 2);
        return this.isValidBiome(this.biome);
    }

    public abstract boolean isValidBiome(Biome var1);

    @Override
    public final boolean canGenerate(D data, TerrainGenerator generator) {
        return this.canGenerate(((Feature.Data)data).chunkX, ((Feature.Data)data).chunkZ, generator);
    }

    @Override
    public boolean canGenerate(CPos cPos, TerrainGenerator generator) {
        return this.canGenerate(cPos.getX(), cPos.getZ(), generator);
    }

    public boolean canGenerate(int chunkX, int chunkZ, TerrainGenerator generator) {
        return this.isValidTerrain(generator, chunkX, chunkZ);
    }

    public boolean isValidTerrain(TerrainGenerator generator, int chunkX, int chunkZ) {
        return true;
    }

    static {
        CLASS_TO_NAME.put(BastionRemnant.class, "bastion_remnant");
        CLASS_TO_NAME.put(BuriedTreasure.class, "buried_treasure");
        CLASS_TO_NAME.put(DesertPyramid.class, "desert_pyramid");
        CLASS_TO_NAME.put(EndCity.class, "end_city");
        CLASS_TO_NAME.put(Fortress.class, "fortress");
        CLASS_TO_NAME.put(Igloo.class, "igloo");
        CLASS_TO_NAME.put(JunglePyramid.class, "jungle_pyramid");
        CLASS_TO_NAME.put(Mansion.class, "mansion");
        CLASS_TO_NAME.put(Mineshaft.class, "mineshaft");
        CLASS_TO_NAME.put(Monument.class, "monument");
        CLASS_TO_NAME.put(NetherFossil.class, "nether_fossil");
        CLASS_TO_NAME.put(OceanRuin.class, "ocean_ruin");
        CLASS_TO_NAME.put(PillagerOutpost.class, "pillager_outpost");
        CLASS_TO_NAME.put(RuinedPortal.class, "ruined_portal");
        CLASS_TO_NAME.put(Shipwreck.class, "shipwreck");
        CLASS_TO_NAME.put(Stronghold.class, "stronghold");
        CLASS_TO_NAME.put(SwampHut.class, "swamp_hut");
        CLASS_TO_NAME.put(Village.class, "village");
    }
}

