/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator.structure;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockMirror;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.MCLootTables;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Supplier;

public class ShipwreckGenerator
extends Generator {
    private Boolean isBeached = null;
    private BlockRotation rotation = null;
    private String type = null;
    private BlockBox piece = null;
    private static final String[] STRUCTURE_LOCATION_BEACHED = new String[]{"with_mast", "sideways_full", "sideways_fronthalf", "sideways_backhalf", "rightsideup_full", "rightsideup_fronthalf", "rightsideup_backhalf", "with_mast_degraded", "rightsideup_full_degraded", "rightsideup_fronthalf_degraded", "rightsideup_backhalf_degraded"};
    private static final String[] STRUCTURE_LOCATION_OCEAN = new String[]{"with_mast", "upsidedown_full", "upsidedown_fronthalf", "upsidedown_backhalf", "sideways_full", "sideways_fronthalf", "sideways_backhalf", "rightsideup_full", "rightsideup_fronthalf", "rightsideup_backhalf", "with_mast_degraded", "upsidedown_full_degraded", "upsidedown_fronthalf_degraded", "upsidedown_backhalf_degraded", "sideways_full_degraded", "sideways_fronthalf_degraded", "sideways_backhalf_degraded", "rightsideup_full_degraded", "rightsideup_fronthalf_degraded", "rightsideup_backhalf_degraded"};
    private static final HashMap<String, LinkedHashMap<LootType, BPos>> STRUCTURE_TO_LOOT = new HashMap();
    private static final HashMap<String, BPos> STRUCTURE_SIZE = new HashMap();

    public ShipwreckGenerator(MCVersion version) {
        super(version);
    }

    public void reset() {
        this.isBeached = null;
        this.rotation = null;
        this.type = null;
        this.piece = null;
    }

    @Override
    public boolean generate(TerrainGenerator generator, int chunkX, int chunkZ, ChunkRand rand) {
        if (generator == null) {
            return false;
        }
        BiomeSource source = generator.getBiomeSource();
        Biome biome = this.getVersion().isOlderThan(MCVersion.v1_16) ? source.getBiome((chunkX << 4) + 9, 0, (chunkZ << 4) + 9) : source.getBiomeForNoiseGen((chunkX << 2) + 2, 0, (chunkZ << 2) + 2);
        this.isBeached = biome == Biomes.BEACH || biome == Biomes.SNOWY_BEACH;
        rand.setCarverSeed(generator.getWorldSeed(), chunkX, chunkZ, this.getVersion());
        this.rotation = BlockRotation.getRandom(rand);
        String[] arr = this.isBeached != false ? STRUCTURE_LOCATION_BEACHED : STRUCTURE_LOCATION_OCEAN;
        this.type = arr[rand.nextInt(arr.length)];
        if (!STRUCTURE_SIZE.containsKey(this.type) || !STRUCTURE_TO_LOOT.containsKey(this.type)) {
            System.err.println("We don't support this type yet " + this.type);
            return false;
        }
        BPos size = STRUCTURE_SIZE.get(this.type);
        BPos anchor = new CPos(chunkX, chunkZ).toBlockPos(90);
        BPos pivot = new BPos(4, 0, 15);
        BlockMirror mirror = BlockMirror.NONE;
        BlockBox blockBox = BlockBox.getBoundingBox(anchor, this.rotation, pivot, mirror, size);
        this.piece = blockBox.getRotated(this.rotation);
        return true;
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getLootPos() {
        return this.getChestsPos();
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getChestsPos() {
        HashMap lootPos = STRUCTURE_TO_LOOT.get(this.type);
        ArrayList<Pair<Generator.ILootType, BPos>> res = new ArrayList<Pair<Generator.ILootType, BPos>>();
        for (LootType lootType : lootPos.keySet()) {
            BPos offset = (BPos)lootPos.get(lootType);
            BPos chestPos = this.piece.getInside(offset, this.rotation);
            res.add(new Pair<LootType, BPos>(lootType, chestPos));
        }
        return res;
    }

    public Boolean isBeached() {
        return this.isBeached;
    }

    public String getType() {
        return this.type;
    }

    public BlockRotation getRotation() {
        return this.rotation;
    }

    @Override
    public Generator.ILootType[] getLootTypes() {
        return LootType.values();
    }

    static {
        STRUCTURE_TO_LOOT.put("rightsideup_backhalf", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.MAP_CHEST, new BPos(5, 3, 6));
                this.put(LootType.TREASURE_CHEST, new BPos(6, 5, 12));
            }
        });
        STRUCTURE_SIZE.put("rightsideup_backhalf", new BPos(9, 9, 16));
        STRUCTURE_TO_LOOT.put("rightsideup_backhalf_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.MAP_CHEST, new BPos(5, 3, 6));
                this.put(LootType.TREASURE_CHEST, new BPos(6, 5, 12));
            }
        });
        STRUCTURE_SIZE.put("rightsideup_backhalf_degraded", new BPos(9, 9, 16));
        STRUCTURE_TO_LOOT.put("rightsideup_fronthalf", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 3, 8));
            }
        });
        STRUCTURE_SIZE.put("rightsideup_fronthalf", new BPos(9, 9, 24));
        STRUCTURE_TO_LOOT.put("rightsideup_fronthalf_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 3, 8));
            }
        });
        STRUCTURE_SIZE.put("rightsideup_fronthalf_degraded", new BPos(9, 9, 24));
        STRUCTURE_TO_LOOT.put("rightsideup_full", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 3, 8));
                this.put(LootType.MAP_CHEST, new BPos(5, 3, 18));
                this.put(LootType.TREASURE_CHEST, new BPos(6, 5, 24));
            }
        });
        STRUCTURE_SIZE.put("rightsideup_full", new BPos(9, 9, 28));
        STRUCTURE_TO_LOOT.put("rightsideup_full_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 3, 8));
                this.put(LootType.MAP_CHEST, new BPos(5, 3, 18));
                this.put(LootType.TREASURE_CHEST, new BPos(6, 5, 24));
            }
        });
        STRUCTURE_SIZE.put("rightsideup_full_degraded", new BPos(9, 9, 28));
        STRUCTURE_TO_LOOT.put("sideways_backhalf", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.TREASURE_CHEST, new BPos(3, 3, 13));
                this.put(LootType.MAP_CHEST, new BPos(6, 4, 8));
            }
        });
        STRUCTURE_SIZE.put("sideways_backhalf", new BPos(9, 9, 17));
        STRUCTURE_TO_LOOT.put("sideways_backhalf_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.TREASURE_CHEST, new BPos(3, 3, 13));
                this.put(LootType.MAP_CHEST, new BPos(6, 4, 8));
            }
        });
        STRUCTURE_SIZE.put("sideways_backhalf_degraded", new BPos(9, 9, 17));
        STRUCTURE_TO_LOOT.put("sideways_fronthalf", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.SUPPLY_CHEST, new BPos(5, 4, 8));
            }
        });
        STRUCTURE_SIZE.put("sideways_fronthalf", new BPos(9, 9, 24));
        STRUCTURE_TO_LOOT.put("sideways_fronthalf_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.SUPPLY_CHEST, new BPos(5, 4, 8));
            }
        });
        STRUCTURE_SIZE.put("sideways_fronthalf_degraded", new BPos(9, 9, 24));
        STRUCTURE_TO_LOOT.put("sideways_full", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.TREASURE_CHEST, new BPos(3, 3, 24));
                this.put(LootType.SUPPLY_CHEST, new BPos(5, 4, 8));
                this.put(LootType.MAP_CHEST, new BPos(6, 4, 19));
            }
        });
        STRUCTURE_SIZE.put("sideways_full", new BPos(9, 9, 28));
        STRUCTURE_TO_LOOT.put("sideways_full_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.TREASURE_CHEST, new BPos(3, 3, 24));
                this.put(LootType.SUPPLY_CHEST, new BPos(5, 4, 8));
                this.put(LootType.MAP_CHEST, new BPos(6, 4, 19));
            }
        });
        STRUCTURE_SIZE.put("sideways_full_degraded", new BPos(9, 9, 28));
        STRUCTURE_TO_LOOT.put("upsidedown_backhalf", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.TREASURE_CHEST, new BPos(2, 3, 12));
                this.put(LootType.MAP_CHEST, new BPos(3, 6, 5));
            }
        });
        STRUCTURE_SIZE.put("upsidedown_backhalf", new BPos(9, 9, 16));
        STRUCTURE_TO_LOOT.put("upsidedown_backhalf_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.TREASURE_CHEST, new BPos(2, 3, 12));
                this.put(LootType.MAP_CHEST, new BPos(3, 6, 5));
            }
        });
        STRUCTURE_SIZE.put("upsidedown_backhalf_degraded", new BPos(9, 9, 16));
        STRUCTURE_TO_LOOT.put("upsidedown_fronthalf", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.MAP_CHEST, new BPos(3, 6, 17));
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 6, 8));
            }
        });
        STRUCTURE_SIZE.put("upsidedown_fronthalf", new BPos(9, 9, 22));
        STRUCTURE_TO_LOOT.put("upsidedown_fronthalf_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.MAP_CHEST, new BPos(3, 6, 17));
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 6, 8));
            }
        });
        STRUCTURE_SIZE.put("upsidedown_fronthalf_degraded", new BPos(9, 9, 22));
        STRUCTURE_TO_LOOT.put("upsidedown_full", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.TREASURE_CHEST, new BPos(2, 3, 24));
                this.put(LootType.MAP_CHEST, new BPos(3, 6, 17));
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 6, 8));
            }
        });
        STRUCTURE_SIZE.put("upsidedown_full", new BPos(9, 9, 28));
        STRUCTURE_TO_LOOT.put("upsidedown_full_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.TREASURE_CHEST, new BPos(2, 3, 24));
                this.put(LootType.MAP_CHEST, new BPos(3, 6, 17));
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 6, 8));
            }
        });
        STRUCTURE_SIZE.put("upsidedown_full_degraded", new BPos(9, 9, 28));
        STRUCTURE_TO_LOOT.put("with_mast", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 3, 9));
                this.put(LootType.MAP_CHEST, new BPos(5, 3, 18));
                this.put(LootType.TREASURE_CHEST, new BPos(6, 5, 24));
            }
        });
        STRUCTURE_SIZE.put("with_mast", new BPos(9, 21, 28));
        STRUCTURE_TO_LOOT.put("with_mast_degraded", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.SUPPLY_CHEST, new BPos(4, 3, 9));
                this.put(LootType.MAP_CHEST, new BPos(5, 3, 18));
                this.put(LootType.TREASURE_CHEST, new BPos(6, 5, 24));
            }
        });
        STRUCTURE_SIZE.put("with_mast_degraded", new BPos(9, 21, 28));
    }

    public static enum LootType implements Generator.ILootType
    {
        SUPPLY_CHEST(MCLootTables.SHIPWRECK_SUPPLY_CHEST, ChestContent.ChestType.SINGLE_CHEST),
        TREASURE_CHEST(MCLootTables.SHIPWRECK_TREASURE_CHEST, ChestContent.ChestType.SINGLE_CHEST),
        MAP_CHEST(MCLootTables.SHIPWRECK_MAP_CHEST, ChestContent.ChestType.SINGLE_CHEST);

        public final Supplier<LootTable> lootTable;
        public final ChestContent.ChestType chestType;

        private LootType(Supplier<LootTable> lootTable, ChestContent.ChestType chestType) {
            this.lootTable = lootTable;
            this.chestType = chestType;
        }

        @Override
        public LootTable getLootTableUncached(MCVersion version) {
            return this.lootTable.get().apply(version);
        }

        @Override
        public ChestContent.ChestType getChestType() {
            return this.chestType;
        }

        @Override
        public boolean belongSameStructure(Generator.ILootType other) {
            return true;
        }
    }
}

