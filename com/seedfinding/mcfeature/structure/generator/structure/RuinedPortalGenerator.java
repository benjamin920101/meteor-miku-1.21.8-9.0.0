/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator.structure;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockMirror;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.math.Vec3i;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.MCLootTables;
import com.seedfinding.mcfeature.structure.RuinedPortal;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class RuinedPortalGenerator
extends Generator {
    private BlockRotation rotation = null;
    private BlockMirror mirror = null;
    private BPos pivot = null;
    private BPos pos = null;
    private String type = null;
    private BlockBox piece = null;
    private Location location = null;
    private Boolean airpocket = null;
    private BlockBox chunkBB = null;
    private TerrainGenerator generator = null;
    private boolean overgrown = false;
    private boolean cold = false;
    private boolean buried = false;
    private int height;
    private CPos cPos;
    private static final Predicate<Location> isLand = l -> l != Location.ON_OCEAN_FLOOR;
    private final HashSet<Biome> DESERT_BIOME = new HashSet<Biome>(){
        {
            this.add(Biomes.DESERT);
            this.add(Biomes.DESERT_HILLS);
            this.add(Biomes.DESERT_LAKES);
        }
    };
    private final HashSet<Biome> JUNGLE_BIOME = new HashSet<Biome>(){
        {
            this.add(Biomes.JUNGLE);
            this.add(Biomes.JUNGLE_EDGE);
            this.add(Biomes.MODIFIED_JUNGLE_EDGE);
            this.add(Biomes.MODIFIED_JUNGLE);
            this.add(Biomes.JUNGLE_HILLS);
            this.add(Biomes.BAMBOO_JUNGLE);
            this.add(Biomes.BAMBOO_JUNGLE_HILLS);
        }
    };
    private final HashSet<Biome> SWAMP_BIOME = new HashSet<Biome>(){
        {
            this.add(Biomes.SWAMP);
            this.add(Biomes.SWAMP_HILLS);
        }
    };
    private final HashSet<Biome> MOUNTAINS_BIOME = new HashSet<Biome>(){
        {
            this.add(Biomes.MOUNTAINS);
            this.add(Biomes.MOUNTAIN_EDGE);
            this.add(Biomes.WOODED_MOUNTAINS);
            this.add(Biomes.GRAVELLY_MOUNTAINS);
            this.add(Biomes.MODIFIED_GRAVELLY_MOUNTAINS);
            this.add(Biomes.SAVANNA_PLATEAU);
            this.add(Biomes.SHATTERED_SAVANNA);
            this.add(Biomes.SHATTERED_SAVANNA_PLATEAU);
            this.add(Biomes.BADLANDS_PLATEAU);
            this.add(Biomes.MODIFIED_BADLANDS_PLATEAU);
            this.add(Biomes.WOODED_BADLANDS_PLATEAU);
            this.add(Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU);
            this.add(Biomes.ERODED_BADLANDS);
            this.add(Biomes.SNOWY_TAIGA_MOUNTAINS);
            this.add(Biomes.TAIGA_MOUNTAINS);
            this.add(Biomes.STONE_SHORE);
        }
    };
    private final HashSet<Biome> OCEAN_BIOME = new HashSet<Biome>(){
        {
            this.add(Biomes.OCEAN);
            this.add(Biomes.DEEP_OCEAN);
            this.add(Biomes.COLD_OCEAN);
            this.add(Biomes.DEEP_COLD_OCEAN);
            this.add(Biomes.LUKEWARM_OCEAN);
            this.add(Biomes.DEEP_LUKEWARM_OCEAN);
            this.add(Biomes.WARM_OCEAN);
            this.add(Biomes.DEEP_WARM_OCEAN);
            this.add(Biomes.FROZEN_OCEAN);
            this.add(Biomes.DEEP_FROZEN_OCEAN);
        }
    };
    private final HashSet<Biome> NETHER_BIOME = new HashSet<Biome>(){
        {
            this.add(Biomes.NETHER_WASTES);
            this.add(Biomes.SOUL_SAND_VALLEY);
            this.add(Biomes.CRIMSON_FOREST);
            this.add(Biomes.BASALT_DELTAS);
            this.add(Biomes.WARPED_FOREST);
        }
    };
    public static final String[] STRUCTURE_LOCATION_PORTALS = new String[]{"portal_1", "portal_2", "portal_3", "portal_4", "portal_5", "portal_6", "portal_7", "portal_8", "portal_9", "portal_10"};
    public static final String[] STRUCTURE_LOCATION_GIANT_PORTALS = new String[]{"giant_portal_1", "giant_portal_2", "giant_portal_3"};
    public static final HashMap<String, LinkedHashMap<LootType, BPos>> STRUCTURE_TO_LOOT = new HashMap();
    public static final HashMap<String, LinkedHashMap<Block, List<BPos>>> STRUCTURE_TO_BLOCKS = new HashMap();
    public static final HashMap<String, BPos> STRUCTURE_SIZE = new HashMap();
    public static final Block MINIMAL_OBSIDIAN_FRAME = new Block(Blocks.OBSIDIAN.getVersion(), Blocks.OBSIDIAN.getId(), "minimal_obsidian_frame", Blocks.OBSIDIAN.getImplementedVersion());
    public static final Block OBSIDIAN_FRAME = new Block(Blocks.OBSIDIAN.getVersion(), Blocks.OBSIDIAN.getId(), "obsidian_frame", Blocks.OBSIDIAN.getImplementedVersion());

    public RuinedPortalGenerator(MCVersion version) {
        super(version);
    }

    public void reset() {
        this.piece = null;
        this.rotation = null;
        this.mirror = null;
        this.pivot = null;
        this.pos = null;
        this.type = null;
        this.location = null;
        this.airpocket = null;
        this.chunkBB = null;
        this.generator = null;
        this.overgrown = false;
        this.cold = false;
        this.cPos = null;
    }

    @Override
    public boolean generate(TerrainGenerator generator, int chunkX, int chunkZ, ChunkRand rand) {
        return this.generateStructure(generator, chunkX, chunkZ, rand);
    }

    public boolean generateStructure(TerrainGenerator generator, int chunkX, int chunkZ, ChunkRand rand) {
        boolean isInside;
        RuinedPortal ruinedPortal = new RuinedPortal(generator.getBiomeSource().getDimension(), this.getVersion());
        if (!ruinedPortal.canStart(ruinedPortal.at(chunkX, chunkZ), generator.getWorldSeed(), rand)) {
            return false;
        }
        if (!ruinedPortal.canSpawn(chunkX, chunkZ, generator.getBiomeSource())) {
            return false;
        }
        Biome biome = ruinedPortal.getBiome();
        rand.setCarverSeed(generator.getWorldSeed(), chunkX, chunkZ, this.getVersion());
        if (this.DESERT_BIOME.contains(biome)) {
            this.location = Location.PARTLY_BURIED;
            this.airpocket = false;
        } else if (this.JUNGLE_BIOME.contains(biome)) {
            this.location = Location.ON_LAND_SURFACE;
            this.airpocket = rand.nextFloat() < 0.5f;
            this.overgrown = true;
        } else if (this.SWAMP_BIOME.contains(biome)) {
            this.location = Location.ON_OCEAN_FLOOR;
            this.airpocket = false;
        } else if (this.MOUNTAINS_BIOME.contains(biome)) {
            isInside = rand.nextFloat() < 0.5f;
            this.location = isInside ? Location.IN_MOUNTAIN : Location.ON_LAND_SURFACE;
            this.airpocket = isInside || rand.nextFloat() < 0.5f;
        } else if (this.OCEAN_BIOME.contains(biome)) {
            this.location = Location.ON_OCEAN_FLOOR;
            this.airpocket = false;
        } else if (this.NETHER_BIOME.contains(biome)) {
            this.location = Location.IN_NETHER;
            this.airpocket = rand.nextFloat() < 0.5f;
        } else {
            isInside = rand.nextFloat() < 0.5f;
            this.location = isInside ? Location.UNDERGROUND : Location.ON_LAND_SURFACE;
            this.airpocket = isInside || rand.nextFloat() < 0.5f;
        }
        this.type = rand.nextFloat() < 0.05f ? rand.getRandom(STRUCTURE_LOCATION_GIANT_PORTALS) : rand.getRandom(STRUCTURE_LOCATION_PORTALS);
        this.rotation = BlockRotation.getRandom(rand);
        this.mirror = rand.nextFloat() < 0.5f ? BlockMirror.NONE : BlockMirror.FRONT_BACK;
        BPos size = Objects.requireNonNull(STRUCTURE_SIZE.get(this.type));
        BPos anchor = new CPos(chunkX, chunkZ).toBlockPos(0);
        this.pivot = new BPos(size.getX() / 2, 0, size.getZ() / 2);
        this.piece = BlockBox.getBoundingBox(anchor, this.rotation, this.pivot, this.mirror, size);
        Vec3i center = this.piece.getCenter();
        Predicate<Block> blockTest = isLand.test(this.location) ? TerrainGenerator.WORLD_SURFACE_WG : TerrainGenerator.OCEAN_FLOOR_WG;
        this.height = generator.getFirstHeightInColumn(center.getX(), center.getZ(), blockTest);
        --this.height;
        int y = RuinedPortalGenerator.findSuitableY(generator, this.location, blockTest, this.airpocket, this.height, this.piece, rand);
        if (y < this.height - 5) {
            if (this.location == Location.IN_NETHER) {
                Block[] blocks = generator.getColumnAt(center.getX(), center.getZ());
                this.buried = true;
                for (int i = 0; i < 5; ++i) {
                    if (blocks[y + i] != Blocks.AIR) continue;
                    this.buried = false;
                    break;
                }
            } else {
                this.buried = true;
            }
        }
        this.pos = new BPos(anchor.getX(), y, anchor.getZ());
        this.piece.minY = y;
        this.piece.maxY = y + size.getY() - 1;
        this.chunkBB = new BlockBox(chunkX << 4, chunkZ << 4, (chunkX << 4) + 15, (chunkZ << 4) + 15);
        if (!this.piece.intersects(this.chunkBB)) {
            return false;
        }
        this.chunkBB.encompass(this.piece);
        this.generator = generator;
        this.cPos = new CPos(chunkX, chunkZ);
        return true;
    }

    public BlockBox getChunkBB() {
        return this.chunkBB;
    }

    public Location getLocation() {
        return this.location;
    }

    public Boolean getAirpocket() {
        return this.airpocket;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isBuried() {
        return this.buried;
    }

    private static int findSuitableY(TerrainGenerator generator, Location location, Predicate<Block> blockPredicate, boolean airPocket, int height, BlockBox blockBox, ChunkRand rand) {
        int dig;
        int y;
        if (location == Location.IN_NETHER) {
            y = airPocket ? rand.getInt(32, 100) : (rand.nextFloat() < 0.5f ? rand.getInt(27, 29) : rand.getInt(29, 100));
        } else if (location == Location.IN_MOUNTAIN) {
            int j = height - blockBox.getYSpan();
            y = rand.getInt(70, j);
        } else if (location == Location.UNDERGROUND) {
            int i1 = height - blockBox.getYSpan();
            y = rand.getInt(15, i1);
        } else {
            y = location == Location.PARTLY_BURIED ? height - blockBox.getYSpan() + rand.getInt(2, 8) : height;
        }
        List<BPos> corners = Arrays.asList(new BPos(blockBox.minX, 0, blockBox.minZ), new BPos(blockBox.maxX, 0, blockBox.minZ), new BPos(blockBox.minX, 0, blockBox.maxZ), new BPos(blockBox.maxX, 0, blockBox.maxZ));
        List columns = corners.stream().map(e -> generator.getColumnAt(e.getX(), e.getZ())).collect(Collectors.toList());
        for (dig = y; dig > 15; --dig) {
            int cornerMatch = 0;
            for (Block[] column : columns) {
                Block block;
                boolean match;
                if (y > generator.getMaxWorldHeight() || y < generator.getMinWorldHeight() || !(match = blockPredicate.test(block = column[dig])) || ++cornerMatch != 3) continue;
                return dig;
            }
        }
        return dig;
    }

    public String getType() {
        return this.type;
    }

    public BlockBox getPiece() {
        return this.piece;
    }

    public BlockRotation getRotation() {
        return this.rotation;
    }

    public BlockMirror getMirror() {
        return this.mirror;
    }

    public BPos getPivot() {
        return this.pivot;
    }

    public BPos getPos() {
        return this.pos;
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getChestsPos() {
        HashMap lootPos = STRUCTURE_TO_LOOT.get(this.type);
        ArrayList<Pair<Generator.ILootType, BPos>> res = new ArrayList<Pair<Generator.ILootType, BPos>>();
        for (LootType lootType : lootPos.keySet()) {
            BPos offset = (BPos)lootPos.get(lootType);
            offset = offset.transform(this.getMirror(), this.getRotation(), this.getPivot());
            BPos chestPos = offset.add(this.getPos());
            if (this.generator != null) {
                Optional<Block> block = this.generator.getBlockAt(chestPos.getX(), chestPos.getY(), chestPos.getZ());
                if (block.isPresent() && block.get().getId() != Blocks.LAVA.getId()) {
                    res.add(new Pair<LootType, BPos>(lootType, chestPos));
                }
            } else {
                res.add(new Pair<LootType, BPos>(lootType, chestPos));
            }
            if (!this.version.isOlderOrEqualTo(MCVersion.v1_16_1)) continue;
        }
        return res;
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getLootPos() {
        HashMap lootPos = STRUCTURE_TO_LOOT.get(this.type);
        ArrayList<Pair<Generator.ILootType, BPos>> res = new ArrayList<Pair<Generator.ILootType, BPos>>();
        for (LootType lootType : lootPos.keySet()) {
            res.add(new Pair<LootType, BPos>(lootType, this.cPos.toBlockPos()));
        }
        return res;
    }

    private List<Pair<Block, BPos>> processBlocks(List<BPos> obsidianPos) {
        ArrayList<Pair<Block, BPos>> res = new ArrayList<Pair<Block, BPos>>();
        ChunkRand rand = new ChunkRand();
        for (BPos pos : obsidianPos) {
            pos = pos.transform(this.getMirror(), this.getRotation(), this.getPivot()).add(this.getPos());
            rand.setPositionSeed(pos, this.getVersion());
            if (rand.nextFloat() < 0.15f) {
                res.add(new Pair<Block, BPos>(Blocks.CRYING_OBSIDIAN, pos));
                continue;
            }
            res.add(new Pair<Block, BPos>(Blocks.OBSIDIAN, pos));
        }
        return res;
    }

    public List<Pair<Block, BPos>> getObsidian() {
        HashMap blocks = STRUCTURE_TO_BLOCKS.get(this.type);
        List<BPos> obsidianPos = blocks.entrySet().stream().filter(e -> ((Block)e.getKey()).getId() == Blocks.OBSIDIAN.getId()).map(Map.Entry::getValue).flatMap(Collection::stream).collect(Collectors.toList());
        return this.processBlocks(obsidianPos);
    }

    public List<Pair<Block, BPos>> getPortal() {
        HashMap blocks = STRUCTURE_TO_BLOCKS.get(this.type);
        List<BPos> obsidianPos = blocks.entrySet().stream().filter(e -> ((Block)e.getKey()).getName().contains("obsidian_frame")).map(Map.Entry::getValue).flatMap(Collection::stream).collect(Collectors.toList());
        return this.processBlocks(obsidianPos);
    }

    public List<Pair<Block, BPos>> getMinimalPortal() {
        HashMap blocks = STRUCTURE_TO_BLOCKS.get(this.type);
        List obsidianPos = (List)blocks.get(MINIMAL_OBSIDIAN_FRAME);
        if (obsidianPos == null) {
            return new ArrayList<Pair<Block, BPos>>();
        }
        return this.processBlocks(obsidianPos);
    }

    @Override
    public Generator.ILootType[] getLootTypes() {
        return LootType.values();
    }

    static {
        STRUCTURE_TO_LOOT.put("giant_portal_1", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(4, 3, 3));
            }
        });
        STRUCTURE_SIZE.put("giant_portal_1", new BPos(11, 17, 16));
        STRUCTURE_TO_LOOT.put("giant_portal_2", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(9, 1, 9));
            }
        });
        STRUCTURE_SIZE.put("giant_portal_2", new BPos(11, 16, 16));
        STRUCTURE_TO_LOOT.put("giant_portal_3", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(9, 2, 3));
            }
        });
        STRUCTURE_SIZE.put("giant_portal_3", new BPos(16, 16, 16));
        STRUCTURE_TO_LOOT.put("portal_1", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(2, 2, 0));
            }
        });
        STRUCTURE_SIZE.put("portal_1", new BPos(6, 10, 6));
        STRUCTURE_TO_LOOT.put("portal_10", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(2, 1, 7));
            }
        });
        STRUCTURE_SIZE.put("portal_10", new BPos(12, 8, 10));
        STRUCTURE_TO_LOOT.put("portal_2", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(8, 2, 6));
            }
        });
        STRUCTURE_SIZE.put("portal_2", new BPos(9, 12, 9));
        STRUCTURE_TO_LOOT.put("portal_3", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(3, 3, 6));
            }
        });
        STRUCTURE_SIZE.put("portal_3", new BPos(8, 9, 9));
        STRUCTURE_TO_LOOT.put("portal_4", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(3, 3, 2));
            }
        });
        STRUCTURE_SIZE.put("portal_4", new BPos(8, 9, 9));
        STRUCTURE_TO_LOOT.put("portal_5", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(4, 3, 2));
            }
        });
        STRUCTURE_SIZE.put("portal_5", new BPos(10, 10, 7));
        STRUCTURE_TO_LOOT.put("portal_6", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(1, 1, 4));
            }
        });
        STRUCTURE_SIZE.put("portal_6", new BPos(5, 7, 7));
        STRUCTURE_TO_LOOT.put("portal_7", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(0, 1, 2));
            }
        });
        STRUCTURE_SIZE.put("portal_7", new BPos(9, 7, 9));
        STRUCTURE_TO_LOOT.put("portal_8", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(4, 4, 2));
            }
        });
        STRUCTURE_SIZE.put("portal_8", new BPos(14, 9, 9));
        STRUCTURE_TO_LOOT.put("portal_9", new LinkedHashMap<LootType, BPos>(){
            {
                this.put(LootType.RUINED_PORTAL, new BPos(4, 1, 0));
            }
        });
        STRUCTURE_SIZE.put("portal_9", new BPos(10, 8, 9));
        STRUCTURE_TO_BLOCKS.put("giant_portal_1", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 3, 4));
                        this.add(new BPos(5, 3, 5));
                        this.add(new BPos(5, 3, 6));
                        this.add(new BPos(5, 3, 7));
                        this.add(new BPos(5, 3, 8));
                        this.add(new BPos(5, 3, 11));
                        this.add(new BPos(5, 4, 4));
                        this.add(new BPos(5, 7, 11));
                        this.add(new BPos(5, 8, 4));
                        this.add(new BPos(5, 8, 11));
                        this.add(new BPos(5, 9, 4));
                        this.add(new BPos(5, 9, 11));
                        this.add(new BPos(5, 10, 4));
                        this.add(new BPos(5, 11, 4));
                        this.add(new BPos(5, 12, 4));
                        this.add(new BPos(5, 12, 5));
                        this.add(new BPos(5, 12, 6));
                        this.add(new BPos(5, 12, 7));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 3, 9));
                        this.add(new BPos(5, 3, 10));
                        this.add(new BPos(5, 4, 11));
                        this.add(new BPos(5, 5, 11));
                        this.add(new BPos(5, 6, 11));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(8, 1, 12));
                        this.add(new BPos(9, 1, 9));
                        this.add(new BPos(9, 1, 12));
                        this.add(new BPos(10, 1, 8));
                        this.add(new BPos(7, 2, 1));
                        this.add(new BPos(8, 2, 1));
                        this.add(new BPos(9, 2, 9));
                        this.add(new BPos(9, 2, 12));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("giant_portal_2", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 3, 4));
                        this.add(new BPos(5, 3, 5));
                        this.add(new BPos(5, 3, 6));
                        this.add(new BPos(5, 3, 7));
                        this.add(new BPos(5, 3, 8));
                        this.add(new BPos(5, 3, 11));
                        this.add(new BPos(5, 4, 4));
                        this.add(new BPos(5, 7, 11));
                        this.add(new BPos(5, 8, 11));
                        this.add(new BPos(5, 9, 11));
                        this.add(new BPos(5, 10, 4));
                        this.add(new BPos(5, 10, 11));
                        this.add(new BPos(5, 11, 4));
                        this.add(new BPos(5, 11, 11));
                        this.add(new BPos(5, 12, 4));
                        this.add(new BPos(5, 12, 7));
                        this.add(new BPos(5, 12, 8));
                        this.add(new BPos(5, 12, 11));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 3, 9));
                        this.add(new BPos(5, 3, 10));
                        this.add(new BPos(5, 4, 11));
                        this.add(new BPos(5, 5, 11));
                        this.add(new BPos(5, 6, 11));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(3, 2, 5));
                        this.add(new BPos(4, 2, 2));
                        this.add(new BPos(7, 2, 1));
                        this.add(new BPos(8, 2, 1));
                        this.add(new BPos(3, 3, 5));
                        this.add(new BPos(3, 4, 5));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("giant_portal_3", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 3, 4));
                        this.add(new BPos(5, 3, 5));
                        this.add(new BPos(5, 3, 6));
                        this.add(new BPos(5, 3, 7));
                        this.add(new BPos(5, 3, 8));
                        this.add(new BPos(5, 3, 11));
                        this.add(new BPos(5, 4, 4));
                        this.add(new BPos(5, 7, 11));
                        this.add(new BPos(5, 8, 11));
                        this.add(new BPos(5, 9, 11));
                        this.add(new BPos(5, 12, 9));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 3, 9));
                        this.add(new BPos(5, 3, 10));
                        this.add(new BPos(5, 4, 11));
                        this.add(new BPos(5, 5, 11));
                        this.add(new BPos(5, 6, 11));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(3, 1, 1));
                        this.add(new BPos(9, 1, 9));
                        this.add(new BPos(3, 2, 1));
                        this.add(new BPos(9, 2, 9));
                        this.add(new BPos(10, 2, 4));
                        this.add(new BPos(10, 2, 5));
                        this.add(new BPos(3, 3, 1));
                        this.add(new BPos(9, 3, 9));
                        this.add(new BPos(9, 4, 9));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_1", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(3, 2, 1));
                        this.add(new BPos(3, 2, 4));
                        this.add(new BPos(3, 6, 1));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(3, 2, 2));
                        this.add(new BPos(3, 2, 3));
                        this.add(new BPos(3, 3, 1));
                        this.add(new BPos(3, 3, 4));
                        this.add(new BPos(3, 4, 1));
                        this.add(new BPos(3, 5, 1));
                        this.add(new BPos(3, 6, 2));
                        this.add(new BPos(3, 6, 3));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_10", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(3, 1, 3));
                        this.add(new BPos(3, 1, 6));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(3, 1, 4));
                        this.add(new BPos(3, 1, 5));
                        this.add(new BPos(3, 2, 3));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 1, 6));
                        this.add(new BPos(6, 1, 3));
                        this.add(new BPos(7, 1, 3));
                        this.add(new BPos(7, 1, 6));
                        this.add(new BPos(8, 1, 3));
                        this.add(new BPos(8, 1, 4));
                        this.add(new BPos(8, 1, 5));
                        this.add(new BPos(8, 1, 6));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_2", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(3, 1, 6));
                        this.add(new BPos(3, 2, 6));
                    }
                });
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 4, 2));
                        this.add(new BPos(5, 8, 2));
                        this.add(new BPos(5, 8, 5));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 5, 2));
                        this.add(new BPos(5, 6, 2));
                        this.add(new BPos(5, 7, 2));
                        this.add(new BPos(5, 7, 5));
                        this.add(new BPos(5, 8, 3));
                        this.add(new BPos(5, 8, 4));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_3", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(6, 2, 2));
                        this.add(new BPos(6, 3, 3));
                    }
                });
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(4, 3, 2));
                        this.add(new BPos(4, 3, 5));
                        this.add(new BPos(4, 7, 5));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(4, 3, 3));
                        this.add(new BPos(4, 3, 4));
                        this.add(new BPos(4, 4, 5));
                        this.add(new BPos(4, 5, 5));
                        this.add(new BPos(4, 6, 5));
                        this.add(new BPos(4, 7, 4));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_4", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(4, 3, 2));
                        this.add(new BPos(4, 3, 5));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(4, 3, 3));
                        this.add(new BPos(4, 3, 4));
                        this.add(new BPos(4, 4, 2));
                        this.add(new BPos(4, 4, 5));
                        this.add(new BPos(4, 5, 2));
                        this.add(new BPos(4, 5, 5));
                        this.add(new BPos(4, 6, 2));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(7, 1, 6));
                        this.add(new BPos(6, 2, 4));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_5", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(2, 3, 1));
                        this.add(new BPos(2, 3, 4));
                        this.add(new BPos(2, 7, 4));
                        this.add(new BPos(2, 8, 4));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(2, 3, 2));
                        this.add(new BPos(2, 3, 3));
                        this.add(new BPos(2, 4, 4));
                        this.add(new BPos(2, 5, 4));
                        this.add(new BPos(2, 6, 4));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 3, 1));
                        this.add(new BPos(6, 3, 1));
                        this.add(new BPos(7, 3, 1));
                        this.add(new BPos(8, 3, 1));
                        this.add(new BPos(8, 3, 2));
                        this.add(new BPos(8, 3, 3));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_6", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(2, 1, 0));
                        this.add(new BPos(2, 1, 4));
                        this.add(new BPos(2, 5, 0));
                        this.add(new BPos(2, 5, 4));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(2, 1, 1));
                        this.add(new BPos(2, 1, 2));
                        this.add(new BPos(2, 1, 3));
                        this.add(new BPos(2, 2, 0));
                        this.add(new BPos(2, 2, 4));
                        this.add(new BPos(2, 3, 0));
                        this.add(new BPos(2, 3, 4));
                        this.add(new BPos(2, 4, 0));
                        this.add(new BPos(2, 4, 4));
                        this.add(new BPos(2, 5, 1));
                        this.add(new BPos(2, 5, 3));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(4, 1, 3));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_7", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(3, 0, 2));
                        this.add(new BPos(3, 4, 2));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(3, 0, 3));
                        this.add(new BPos(3, 0, 4));
                        this.add(new BPos(3, 1, 2));
                        this.add(new BPos(3, 1, 5));
                        this.add(new BPos(3, 2, 2));
                        this.add(new BPos(3, 2, 5));
                        this.add(new BPos(3, 3, 2));
                        this.add(new BPos(3, 4, 3));
                        this.add(new BPos(3, 4, 4));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 1, 6));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_8", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 3, 2));
                        this.add(new BPos(5, 3, 6));
                        this.add(new BPos(5, 7, 2));
                        this.add(new BPos(5, 7, 6));
                        this.add(new BPos(5, 8, 6));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(5, 3, 3));
                        this.add(new BPos(5, 3, 4));
                        this.add(new BPos(5, 3, 5));
                        this.add(new BPos(5, 4, 2));
                        this.add(new BPos(5, 4, 6));
                        this.add(new BPos(5, 5, 2));
                        this.add(new BPos(5, 5, 6));
                        this.add(new BPos(5, 6, 2));
                        this.add(new BPos(5, 6, 6));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(9, 1, 3));
                        this.add(new BPos(9, 1, 4));
                        this.add(new BPos(9, 1, 5));
                    }
                });
            }
        });
        STRUCTURE_TO_BLOCKS.put("portal_9", new LinkedHashMap<Block, List<BPos>>(){
            {
                this.put(OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(4, 1, 3));
                        this.add(new BPos(4, 1, 6));
                        this.add(new BPos(4, 5, 6));
                    }
                });
                this.put(MINIMAL_OBSIDIAN_FRAME, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(4, 1, 4));
                        this.add(new BPos(4, 1, 5));
                        this.add(new BPos(4, 2, 3));
                        this.add(new BPos(4, 2, 6));
                        this.add(new BPos(4, 3, 6));
                        this.add(new BPos(4, 4, 6));
                        this.add(new BPos(4, 5, 4));
                        this.add(new BPos(4, 5, 5));
                    }
                });
                this.put(Blocks.OBSIDIAN, new ArrayList<BPos>(){
                    {
                        this.add(new BPos(7, 1, 3));
                    }
                });
            }
        });
    }

    public static enum Location {
        ON_LAND_SURFACE("on_land_surface"),
        PARTLY_BURIED("partly_buried"),
        ON_OCEAN_FLOOR("on_ocean_floor"),
        IN_MOUNTAIN("in_mountain"),
        UNDERGROUND("underground"),
        IN_NETHER("in_nether");

        private static final Map<String, Location> BY_NAME;
        private final String name;

        private Location(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public static Location byName(String name) {
            return BY_NAME.get(name);
        }

        static {
            BY_NAME = Arrays.stream(Location.values()).collect(Collectors.toMap(Location::getName, location -> location));
        }
    }

    public static enum LootType implements Generator.ILootType
    {
        RUINED_PORTAL(MCLootTables.RUINED_PORTAL_CHEST, ChestContent.ChestType.SINGLE_CHEST);

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
    }
}

