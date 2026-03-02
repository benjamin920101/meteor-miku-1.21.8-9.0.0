/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator.structure;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockMirror;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mccore.util.data.Triplet;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.structure.Village;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcfeature.structure.generator.piece.village.DesertVillageJigsawBlocks;
import com.seedfinding.mcfeature.structure.generator.piece.village.PlainsVillageJigsawBlocks;
import com.seedfinding.mcfeature.structure.generator.piece.village.SavannaVillageJigsawBlocks;
import com.seedfinding.mcfeature.structure.generator.piece.village.SnowyVillageJigsawBlocks;
import com.seedfinding.mcfeature.structure.generator.piece.village.TaigaVillageJigsawBlocks;
import com.seedfinding.mcseed.rand.JRand;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VillageGenerator
extends Generator {
    public static final Map<String, Triplet<String, List<Pair<String, Integer>>, PlacementBehaviour>> VILLAGE_POOLS = new HashMap<String, Triplet<String, List<Pair<String, Integer>>, PlacementBehaviour>>(){
        {
            this.put("desert/town_centers", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("desert/town_centers/desert_meeting_point_1", 98), new Pair<String, Integer>("desert/town_centers/desert_meeting_point_2", 98), new Pair<String, Integer>("desert/town_centers/desert_meeting_point_3", 49), new Pair<String, Integer>("desert/zombie/town_centers/desert_meeting_point_1", 2), new Pair<String, Integer>("desert/zombie/town_centers/desert_meeting_point_2", 2), new Pair<String, Integer>("desert/zombie/town_centers/desert_meeting_point_3", 1)), PlacementBehaviour.RIGID));
            this.put("desert/streets", new Triplet<String, List<Pair>, PlacementBehaviour>("desert/terminators", Arrays.asList(new Pair<String, Integer>("desert/streets/corner_01", 3), new Pair<String, Integer>("desert/streets/corner_02", 3), new Pair<String, Integer>("desert/streets/straight_01", 4), new Pair<String, Integer>("desert/streets/straight_02", 4), new Pair<String, Integer>("desert/streets/straight_03", 3), new Pair<String, Integer>("desert/streets/crossroad_01", 3), new Pair<String, Integer>("desert/streets/crossroad_02", 3), new Pair<String, Integer>("desert/streets/crossroad_03", 3), new Pair<String, Integer>("desert/streets/square_01", 3), new Pair<String, Integer>("desert/streets/square_02", 3), new Pair<String, Integer>("desert/streets/turn_01", 3)), PlacementBehaviour.TERRAIN_MATCHING));
            this.put("desert/zombie/streets", new Triplet<String, List<Pair>, PlacementBehaviour>("desert/zombie/terminators", Arrays.asList(new Pair<String, Integer>("desert/zombie/streets/corner_01", 3), new Pair<String, Integer>("desert/zombie/streets/corner_02", 3), new Pair<String, Integer>("desert/zombie/streets/straight_01", 4), new Pair<String, Integer>("desert/zombie/streets/straight_02", 4), new Pair<String, Integer>("desert/zombie/streets/straight_03", 3), new Pair<String, Integer>("desert/zombie/streets/crossroad_01", 3), new Pair<String, Integer>("desert/zombie/streets/crossroad_02", 3), new Pair<String, Integer>("desert/zombie/streets/crossroad_03", 3), new Pair<String, Integer>("desert/zombie/streets/square_01", 3), new Pair<String, Integer>("desert/zombie/streets/square_02", 3), new Pair<String, Integer>("desert/zombie/streets/turn_01", 3)), PlacementBehaviour.TERRAIN_MATCHING));
            this.put("desert/houses", new Triplet<String, List<Pair>, PlacementBehaviour>("desert/terminators", Arrays.asList(new Pair<String, Integer>("desert/houses/desert_small_house_1", 2), new Pair<String, Integer>("desert/houses/desert_small_house_2", 2), new Pair<String, Integer>("desert/houses/desert_small_house_3", 2), new Pair<String, Integer>("desert/houses/desert_small_house_4", 2), new Pair<String, Integer>("desert/houses/desert_small_house_5", 2), new Pair<String, Integer>("desert/houses/desert_small_house_6", 1), new Pair<String, Integer>("desert/houses/desert_small_house_7", 2), new Pair<String, Integer>("desert/houses/desert_small_house_8", 2), new Pair<String, Integer>("desert/houses/desert_medium_house_1", 2), new Pair<String, Integer>("desert/houses/desert_medium_house_2", 2), new Pair<String, Integer>("desert/houses/desert_butcher_shop_1", 2), new Pair<String, Integer>("desert/houses/desert_tool_smith_1", 2), new Pair<String, Integer>("desert/houses/desert_fletcher_house_1", 2), new Pair<String, Integer>("desert/houses/desert_shepherd_house_1", 2), new Pair<String, Integer>("desert/houses/desert_armorer_1", 1), new Pair<String, Integer>("desert/houses/desert_fisher_1", 2), new Pair<String, Integer>("desert/houses/desert_tannery_1", 2), new Pair<String, Integer>("desert/houses/desert_cartographer_house_1", 2), new Pair<String, Integer>("desert/houses/desert_library_1", 2), new Pair<String, Integer>("desert/houses/desert_mason_1", 2), new Pair<String, Integer>("desert/houses/desert_weaponsmith_1", 2), new Pair<String, Integer>("desert/houses/desert_temple_1", 2), new Pair<String, Integer>("desert/houses/desert_temple_2", 2), new Pair<String, Integer>("desert/houses/desert_large_farm_1", 11), new Pair<String, Integer>("desert/houses/desert_farm_1", 4), new Pair<String, Integer>("desert/houses/desert_farm_2", 4), new Pair<String, Integer>("desert/houses/desert_animal_pen_1", 2), new Pair<String, Integer>("desert/houses/desert_animal_pen_2", 2), new Pair<String, Integer>("empty", 5)), PlacementBehaviour.RIGID));
            this.put("desert/zombie/houses", new Triplet<String, List<Pair>, PlacementBehaviour>("desert/zombie/terminators", Arrays.asList(new Pair<String, Integer>("desert/zombie/houses/desert_small_house_1", 2), new Pair<String, Integer>("desert/zombie/houses/desert_small_house_2", 2), new Pair<String, Integer>("desert/zombie/houses/desert_small_house_3", 2), new Pair<String, Integer>("desert/zombie/houses/desert_small_house_4", 2), new Pair<String, Integer>("desert/zombie/houses/desert_small_house_5", 2), new Pair<String, Integer>("desert/zombie/houses/desert_small_house_6", 1), new Pair<String, Integer>("desert/zombie/houses/desert_small_house_7", 2), new Pair<String, Integer>("desert/zombie/houses/desert_small_house_8", 2), new Pair<String, Integer>("desert/zombie/houses/desert_medium_house_1", 2), new Pair<String, Integer>("desert/zombie/houses/desert_medium_house_2", 2), new Pair<String, Integer>("desert/houses/desert_butcher_shop_1", 2), new Pair<String, Integer>("desert/houses/desert_tool_smith_1", 2), new Pair<String, Integer>("desert/houses/desert_fletcher_house_1", 2), new Pair<String, Integer>("desert/houses/desert_shepherd_house_1", 2), new Pair<String, Integer>("desert/houses/desert_armorer_1", 1), new Pair<String, Integer>("desert/houses/desert_fisher_1", 2), new Pair<String, Integer>("desert/houses/desert_tannery_1", 2), new Pair<String, Integer>("desert/houses/desert_cartographer_house_1", 2), new Pair<String, Integer>("desert/houses/desert_library_1", 2), new Pair<String, Integer>("desert/houses/desert_mason_1", 2), new Pair<String, Integer>("desert/houses/desert_weaponsmith_1", 2), new Pair<String, Integer>("desert/houses/desert_temple_1", 2), new Pair<String, Integer>("desert/houses/desert_temple_2", 2), new Pair<String, Integer>("desert/houses/desert_large_farm_1", 7), new Pair<String, Integer>("desert/houses/desert_farm_1", 4), new Pair<String, Integer>("desert/houses/desert_farm_2", 4), new Pair<String, Integer>("desert/houses/desert_animal_pen_1", 2), new Pair<String, Integer>("desert/houses/desert_animal_pen_2", 2), new Pair<String, Integer>("empty", 5)), PlacementBehaviour.RIGID));
            this.put("desert/terminators", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("desert/terminators/terminator_01", 1), new Pair<String, Integer>("desert/terminators/terminator_02", 1)), PlacementBehaviour.TERRAIN_MATCHING));
            this.put("desert/zombie/terminators", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("desert/terminators/terminator_01", 1), new Pair<String, Integer>("desert/zombie/terminators/terminator_02", 1)), PlacementBehaviour.TERRAIN_MATCHING));
            this.put("desert/decor", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("desert/desert_lamp_1", 10), new Pair<String, Integer>("patch_cactus", 4), new Pair<String, Integer>("pile_hay", 4), new Pair<String, Integer>("empty", 10)), PlacementBehaviour.RIGID));
            this.put("desert/zombie/decor", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("desert/desert_lamp_1", 10), new Pair<String, Integer>("patch_cactus", 4), new Pair<String, Integer>("pile_hay", 4), new Pair<String, Integer>("empty", 10)), PlacementBehaviour.RIGID));
            this.put("desert/villagers", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("desert/villagers/nitwit", 1), new Pair<String, Integer>("desert/villagers/baby", 1), new Pair<String, Integer>("desert/villagers/unemployed", 10)), PlacementBehaviour.RIGID));
            this.put("desert/zombie/villagers", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("desert/zombie/villagers/nitwit", 1), new Pair<String, Integer>("desert/zombie/villagers/unemployed", 10)), PlacementBehaviour.RIGID));
            this.put("plains/streets", new Triplet<String, List<Pair>, PlacementBehaviour>("plains/terminators", Arrays.asList(new Pair<String, Integer>("village/plains/streets/corner_01", 2), new Pair<String, Integer>("village/plains/streets/corner_02", 2), new Pair<String, Integer>("village/plains/streets/corner_03", 2), new Pair<String, Integer>("village/plains/streets/straight_01", 4), new Pair<String, Integer>("village/plains/streets/straight_02", 4), new Pair<String, Integer>("village/plains/streets/straight_03", 7), new Pair<String, Integer>("village/plains/streets/straight_04", 7), new Pair<String, Integer>("village/plains/streets/straight_05", 3), new Pair<String, Integer>("village/plains/streets/straight_06", 4), new Pair<String, Integer>("village/plains/streets/crossroad_01", 2), new Pair<String, Integer>("village/plains/streets/crossroad_02", 1), new Pair<String, Integer>("village/plains/streets/crossroad_03", 2), new Pair<String, Integer>("village/plains/streets/crossroad_04", 2), new Pair<String, Integer>("village/plains/streets/crossroad_05", 2), new Pair<String, Integer>("village/plains/streets/crossroad_06", 2), new Pair<String, Integer>("village/plains/streets/turn_01", 3)), PlacementBehaviour.TERRAIN_MATCHING));
            this.put("plains/zombie/streets", new Triplet<String, List<Pair>, PlacementBehaviour>("plains/terminators", Arrays.asList(new Pair<String, Integer>("village/plains/zombie/streets/corner_01", 2), new Pair<String, Integer>("village/plains/zombie/streets/corner_02", 2), new Pair<String, Integer>("village/plains/zombie/streets/corner_03", 2), new Pair<String, Integer>("village/plains/zombie/streets/straight_01", 4), new Pair<String, Integer>("village/plains/zombie/streets/straight_02", 4), new Pair<String, Integer>("village/plains/zombie/streets/straight_03", 7), new Pair<String, Integer>("village/plains/zombie/streets/straight_04", 7), new Pair<String, Integer>("village/plains/zombie/streets/straight_05", 3), new Pair<String, Integer>("village/plains/zombie/streets/straight_06", 4), new Pair<String, Integer>("village/plains/zombie/streets/crossroad_01", 2), new Pair<String, Integer>("village/plains/zombie/streets/crossroad_02", 1), new Pair<String, Integer>("village/plains/zombie/streets/crossroad_03", 2), new Pair<String, Integer>("village/plains/zombie/streets/crossroad_04", 2), new Pair<String, Integer>("village/plains/zombie/streets/crossroad_05", 2), new Pair<String, Integer>("village/plains/zombie/streets/crossroad_06", 2), new Pair<String, Integer>("village/plains/zombie/streets/turn_01", 3)), PlacementBehaviour.TERRAIN_MATCHING));
            this.put("plains/houses", new Triplet<String, List<Pair>, PlacementBehaviour>("plains/terminators", Arrays.asList(new Pair<String, Integer>("village/plains/houses/plains_small_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_small_house_2", 2), new Pair<String, Integer>("village/plains/houses/plains_small_house_3", 2), new Pair<String, Integer>("village/plains/houses/plains_small_house_4", 2), new Pair<String, Integer>("village/plains/houses/plains_small_house_5", 2), new Pair<String, Integer>("village/plains/houses/plains_small_house_6", 1), new Pair<String, Integer>("village/plains/houses/plains_small_house_7", 2), new Pair<String, Integer>("village/plains/houses/plains_small_house_8", 3), new Pair<String, Integer>("village/plains/houses/plains_medium_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_medium_house_2", 2), new Pair<String, Integer>("village/plains/houses/plains_big_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_butcher_shop_1", 2), new Pair<String, Integer>("village/plains/houses/plains_butcher_shop_2", 2), new Pair<String, Integer>("village/plains/houses/plains_tool_smith_1", 2), new Pair<String, Integer>("village/plains/houses/plains_fletcher_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_shepherds_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_armorer_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_fisher_cottage_1", 2), new Pair<String, Integer>("village/plains/houses/plains_tannery_1", 2), new Pair<String, Integer>("village/plains/houses/plains_cartographer_1", 1), new Pair<String, Integer>("village/plains/houses/plains_library_1", 5), new Pair<String, Integer>("village/plains/houses/plains_library_2", 1), new Pair<String, Integer>("village/plains/houses/plains_masons_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_weaponsmith_1", 2), new Pair<String, Integer>("village/plains/houses/plains_temple_3", 2), new Pair<String, Integer>("village/plains/houses/plains_temple_4", 2), new Pair<String, Integer>("village/plains/houses/plains_stable_1", 2), new Pair<String, Integer>("village/plains/houses/plains_stable_2", 2), new Pair<String, Integer>("village/plains/houses/plains_large_farm_1", 4), new Pair<String, Integer>("village/plains/houses/plains_small_farm_1", 4), new Pair<String, Integer>("village/plains/houses/plains_animal_pen_1", 1), new Pair<String, Integer>("village/plains/houses/plains_animal_pen_2", 1), new Pair<String, Integer>("village/plains/houses/plains_animal_pen_3", 5), new Pair<String, Integer>("village/plains/houses/plains_accessory_1", 1), new Pair<String, Integer>("village/plains/houses/plains_meeting_point_4", 3), new Pair<String, Integer>("village/plains/houses/plains_meeting_point_5", 1), new Pair<String, Integer>("empty", 10)), PlacementBehaviour.RIGID));
            this.put("plains/zombie/houses", new Triplet<String, List<Pair>, PlacementBehaviour>("plains/terminators", Arrays.asList(new Pair<String, Integer>("village/plains/zombie/houses/plains_small_house_1", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_small_house_2", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_small_house_3", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_small_house_4", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_small_house_5", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_small_house_6", 1), new Pair<String, Integer>("village/plains/zombie/houses/plains_small_house_7", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_small_house_8", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_medium_house_1", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_medium_house_2", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_big_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_butcher_shop_1", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_butcher_shop_2", 2), new Pair<String, Integer>("village/plains/houses/plains_tool_smith_1", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_fletcher_house_1", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_shepherds_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_armorer_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_fisher_cottage_1", 2), new Pair<String, Integer>("village/plains/houses/plains_tannery_1", 2), new Pair<String, Integer>("village/plains/houses/plains_cartographer_1", 1), new Pair<String, Integer>("village/plains/houses/plains_library_1", 3), new Pair<String, Integer>("village/plains/houses/plains_library_2", 1), new Pair<String, Integer>("village/plains/houses/plains_masons_house_1", 2), new Pair<String, Integer>("village/plains/houses/plains_weaponsmith_1", 2), new Pair<String, Integer>("village/plains/houses/plains_temple_3", 2), new Pair<String, Integer>("village/plains/houses/plains_temple_4", 2), new Pair<String, Integer>("village/plains/zombie/houses/plains_stable_1", 2), new Pair<String, Integer>("village/plains/houses/plains_stable_2", 2), new Pair<String, Integer>("village/plains/houses/plains_large_farm_1", 4), new Pair<String, Integer>("village/plains/houses/plains_small_farm_1", 4), new Pair<String, Integer>("village/plains/houses/plains_animal_pen_1", 1), new Pair<String, Integer>("village/plains/houses/plains_animal_pen_2", 1), new Pair<String, Integer>("village/plains/zombie/houses/plains_animal_pen_3", 5), new Pair<String, Integer>("village/plains/zombie/houses/plains_meeting_point_4", 3), new Pair<String, Integer>("village/plains/zombie/houses/plains_meeting_point_5", 1), new Pair<String, Integer>("empty", 10)), PlacementBehaviour.RIGID));
            this.put("plains/terminators", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("village/plains/terminators/terminator_01", 1), new Pair<String, Integer>("village/plains/terminators/terminator_02", 1), new Pair<String, Integer>("village/plains/terminators/terminator_03", 1), new Pair<String, Integer>("village/plains/terminators/terminator_04", 1)), PlacementBehaviour.TERRAIN_MATCHING));
            this.put("plains/trees", new Triplet<String, List<Pair<String, Integer>>, PlacementBehaviour>("empty", Collections.singletonList(new Pair<String, Integer>("oak", 1)), PlacementBehaviour.RIGID));
            this.put("plains/decor", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("plains/plains_lamp_1", 2), new Pair<String, Integer>("oak", 1), new Pair<String, Integer>("flower_plain", 1), new Pair<String, Integer>("pile_hay", 1), new Pair<String, Integer>("empty", 2)), PlacementBehaviour.RIGID));
            this.put("plains/zombie/decor", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("plains/plains_lamp_1", 1), new Pair<String, Integer>("oak", 1), new Pair<String, Integer>("flower_plain", 1), new Pair<String, Integer>("pile_hay", 1), new Pair<String, Integer>("empty", 2)), PlacementBehaviour.RIGID));
            this.put("plains/villagers", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("plains/villagers/nitwit", 1), new Pair<String, Integer>("plains/villagers/baby", 1), new Pair<String, Integer>("plains/villagers/unemployed", 10)), PlacementBehaviour.RIGID));
            this.put("plains/zombie/villagers", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("plains/zombie/villagers/nitwit", 1), new Pair<String, Integer>("plains/zombie/villagers/unemployed", 10)), PlacementBehaviour.RIGID));
            this.put("common/animals", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("common/animals/cows_1", 7), new Pair<String, Integer>("common/animals/pigs_1", 7), new Pair<String, Integer>("common/animals/horses_1", 1), new Pair<String, Integer>("common/animals/horses_2", 1), new Pair<String, Integer>("common/animals/horses_3", 1), new Pair<String, Integer>("common/animals/horses_4", 1), new Pair<String, Integer>("common/animals/horses_5", 1), new Pair<String, Integer>("common/animals/sheep_1", 1), new Pair<String, Integer>("common/animals/sheep_2", 1), new Pair<String, Integer>("empty", 5)), PlacementBehaviour.RIGID));
            this.put("common/sheep", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("common/animals/sheep_1", 1), new Pair<String, Integer>("common/animals/sheep_2", 1)), PlacementBehaviour.RIGID));
            this.put("common/cats", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("common/animals/cat_black", 1), new Pair<String, Integer>("common/animals/cat_british", 1), new Pair<String, Integer>("common/animals/cat_calico", 1), new Pair<String, Integer>("common/animals/cat_persian", 1), new Pair<String, Integer>("common/animals/cat_ragdoll", 1), new Pair<String, Integer>("common/animals/cat_red", 1), new Pair<String, Integer>("common/animals/cat_siamese", 1), new Pair<String, Integer>("common/animals/cat_tabby", 1), new Pair<String, Integer>("common/animals/cat_white", 1), new Pair<String, Integer>("common/animals/cat_jellie", 1), new Pair<String, Integer>("empty", 3)), PlacementBehaviour.RIGID));
            this.put("common/butcher_animals", new Triplet<String, List<Pair>, PlacementBehaviour>("empty", Arrays.asList(new Pair<String, Integer>("village/common/animals/cows_1", 3), new Pair<String, Integer>("village/common/animals/pigs_1", 3), new Pair<String, Integer>("village/common/animals/sheep_1", 1), new Pair<String, Integer>("village/common/animals/sheep_2", 1)), PlacementBehaviour.RIGID));
            this.put("common/iron_golem", new Triplet<String, List<Pair<String, Integer>>, PlacementBehaviour>("empty", Collections.singletonList(new Pair<String, Integer>("common/iron_golem", 1)), PlacementBehaviour.RIGID));
            this.put("common/well_bottoms", new Triplet<String, List<Pair<String, Integer>>, PlacementBehaviour>("empty", Collections.singletonList(new Pair<String, Integer>("common/well_bottom", 1)), PlacementBehaviour.RIGID));
            this.put("empty", new Triplet<String, List<Pair<String, Integer>>, PlacementBehaviour>("empty", Collections.singletonList(new Pair<String, Integer>("empty", 0)), PlacementBehaviour.RIGID));
        }
    };
    private static final HashMap<String, BPos> STRUCTURE_SIZE = new HashMap<String, BPos>(){
        {
            this.put("common/iron_golem", new BPos(1, 3, 1));
            this.put("common/well_bottom", new BPos(4, 3, 4));
            this.put("common/animals/cat_black", new BPos(1, 3, 1));
            this.put("common/animals/cat_british", new BPos(1, 3, 1));
            this.put("common/animals/cat_calico", new BPos(1, 3, 1));
            this.put("common/animals/cat_jellie", new BPos(1, 3, 1));
            this.put("common/animals/cat_persia", new BPos(1, 3, 1));
            this.put("common/animals/cat_ragdoll", new BPos(1, 3, 1));
            this.put("common/animals/cat_red", new BPos(1, 3, 1));
            this.put("common/animals/cat_siamese", new BPos(1, 3, 1));
            this.put("common/animals/cat_tabby", new BPos(1, 3, 1));
            this.put("common/animals/cat_white", new BPos(1, 3, 1));
            this.put("common/animals/cows_1", new BPos(1, 3, 1));
            this.put("common/animals/horses_1", new BPos(1, 3, 1));
            this.put("common/animals/horses_2", new BPos(1, 3, 1));
            this.put("common/animals/horses_3", new BPos(1, 3, 1));
            this.put("common/animals/horses_4", new BPos(1, 3, 1));
            this.put("common/animals/horses_5", new BPos(1, 3, 1));
            this.put("common/animals/pigs_1", new BPos(1, 3, 1));
            this.put("common/animals/sheep_1", new BPos(1, 3, 1));
            this.put("common/animals/sheep_2", new BPos(1, 3, 1));
            this.put("decays/grass_11x13", new BPos(13, 1, 11));
            this.put("decays/grass_16x16", new BPos(16, 1, 16));
            this.put("decays/grass_9x9", new BPos(9, 1, 9));
            this.put("desert/desert_lamp_1", new BPos(1, 4, 1));
            this.put("desert/houses/desert_animal_pen_1", new BPos(10, 6, 7));
            this.put("desert/houses/desert_animal_pen_2", new BPos(10, 6, 8));
            this.put("desert/houses/desert_armorer_1", new BPos(7, 7, 7));
            this.put("desert/houses/desert_butcher_shop_1", new BPos(8, 5, 8));
            this.put("desert/houses/desert_cartographer_house_1", new BPos(7, 7, 7));
            this.put("desert/houses/desert_farm_1", new BPos(5, 6, 7));
            this.put("desert/houses/desert_farm_2", new BPos(7, 7, 10));
            this.put("desert/houses/desert_fisher_1", new BPos(8, 6, 11));
            this.put("desert/houses/desert_fletcher_house_1", new BPos(6, 12, 12));
            this.put("desert/houses/desert_large_farm_1", new BPos(11, 7, 13));
            this.put("desert/houses/desert_library_1", new BPos(9, 7, 5));
            this.put("desert/houses/desert_mason_1", new BPos(7, 5, 8));
            this.put("desert/houses/desert_medium_house_1", new BPos(6, 6, 7));
            this.put("desert/houses/desert_medium_house_2", new BPos(11, 9, 7));
            this.put("desert/houses/desert_shepherd_house_1", new BPos(11, 6, 5));
            this.put("desert/houses/desert_small_house_1", new BPos(6, 6, 5));
            this.put("desert/houses/desert_small_house_2", new BPos(7, 6, 5));
            this.put("desert/houses/desert_small_house_3", new BPos(5, 5, 6));
            this.put("desert/houses/desert_small_house_4", new BPos(5, 5, 5));
            this.put("desert/houses/desert_small_house_5", new BPos(5, 6, 6));
            this.put("desert/houses/desert_small_house_6", new BPos(6, 18, 5));
            this.put("desert/houses/desert_small_house_7", new BPos(8, 5, 7));
            this.put("desert/houses/desert_small_house_8", new BPos(5, 5, 5));
            this.put("desert/houses/desert_tannery_1", new BPos(7, 10, 6));
            this.put("desert/houses/desert_temple_1", new BPos(11, 7, 10));
            this.put("desert/houses/desert_temple_2", new BPos(10, 6, 12));
            this.put("desert/houses/desert_tool_smith_1", new BPos(9, 9, 9));
            this.put("desert/houses/desert_weaponsmith_1", new BPos(10, 6, 7));
            this.put("desert/streets/corner_01", new BPos(7, 2, 15));
            this.put("desert/streets/corner_02", new BPos(6, 2, 6));
            this.put("desert/streets/crossroad_01", new BPos(18, 2, 15));
            this.put("desert/streets/crossroad_02", new BPos(11, 2, 11));
            this.put("desert/streets/crossroad_03", new BPos(5, 2, 5));
            this.put("desert/streets/square_01", new BPos(13, 2, 28));
            this.put("desert/streets/square_02", new BPos(16, 2, 19));
            this.put("desert/streets/straight_01", new BPos(15, 2, 12));
            this.put("desert/streets/straight_02", new BPos(15, 2, 18));
            this.put("desert/streets/straight_03", new BPos(4, 2, 3));
            this.put("desert/streets/turn_01", new BPos(4, 2, 4));
            this.put("desert/terminators/terminator_01", new BPos(3, 2, 3));
            this.put("desert/terminators/terminator_02", new BPos(3, 2, 3));
            this.put("desert/town_centers/desert_meeting_point_1", new BPos(17, 6, 9));
            this.put("desert/town_centers/desert_meeting_point_2", new BPos(12, 6, 12));
            this.put("desert/town_centers/desert_meeting_point_3", new BPos(15, 6, 15));
            this.put("desert/villagers/baby", new BPos(1, 2, 1));
            this.put("desert/villagers/nitwi", new BPos(1, 3, 1));
            this.put("desert/villagers/unemployed", new BPos(1, 3, 1));
            this.put("desert/zombie/houses/desert_medium_house_1", new BPos(6, 6, 7));
            this.put("desert/zombie/houses/desert_medium_house_2", new BPos(11, 9, 7));
            this.put("desert/zombie/houses/desert_small_house_1", new BPos(6, 6, 5));
            this.put("desert/zombie/houses/desert_small_house_2", new BPos(7, 6, 5));
            this.put("desert/zombie/houses/desert_small_house_3", new BPos(5, 5, 6));
            this.put("desert/zombie/houses/desert_small_house_4", new BPos(5, 5, 5));
            this.put("desert/zombie/houses/desert_small_house_5", new BPos(5, 6, 6));
            this.put("desert/zombie/houses/desert_small_house_6", new BPos(5, 17, 5));
            this.put("desert/zombie/houses/desert_small_house_7", new BPos(8, 5, 7));
            this.put("desert/zombie/houses/desert_small_house_8", new BPos(5, 5, 5));
            this.put("desert/zombie/streets/corner_01", new BPos(7, 2, 15));
            this.put("desert/zombie/streets/corner_02", new BPos(6, 2, 6));
            this.put("desert/zombie/streets/crossroad_01", new BPos(18, 2, 15));
            this.put("desert/zombie/streets/crossroad_02", new BPos(11, 2, 11));
            this.put("desert/zombie/streets/crossroad_03", new BPos(5, 2, 5));
            this.put("desert/zombie/streets/square_01", new BPos(13, 2, 28));
            this.put("desert/zombie/streets/square_02", new BPos(16, 2, 19));
            this.put("desert/zombie/streets/straight_01", new BPos(15, 2, 12));
            this.put("desert/zombie/streets/straight_02", new BPos(15, 2, 18));
            this.put("desert/zombie/streets/straight_03", new BPos(4, 2, 3));
            this.put("desert/zombie/streets/turn_01", new BPos(4, 2, 4));
            this.put("desert/zombie/terminators/terminator_02", new BPos(3, 2, 3));
            this.put("desert/zombie/town_centers/desert_meeting_point_1", new BPos(17, 6, 9));
            this.put("desert/zombie/town_centers/desert_meeting_point_2", new BPos(12, 6, 12));
            this.put("desert/zombie/town_centers/desert_meeting_point_3", new BPos(15, 6, 15));
            this.put("desert/zombie/villagers/nitwi", new BPos(1, 3, 1));
            this.put("desert/zombie/villagers/unemployed", new BPos(1, 3, 1));
            this.put("plains/plains_lamp_1", new BPos(3, 4, 3));
            this.put("plains/houses/plains_accessory_1", new BPos(3, 2, 5));
            this.put("plains/houses/plains_animal_pen_1", new BPos(5, 8, 6));
            this.put("plains/houses/plains_animal_pen_2", new BPos(7, 7, 11));
            this.put("plains/houses/plains_animal_pen_3", new BPos(8, 6, 11));
            this.put("plains/houses/plains_armorer_house_1", new BPos(9, 8, 8));
            this.put("plains/houses/plains_big_house_1", new BPos(7, 11, 11));
            this.put("plains/houses/plains_butcher_shop_1", new BPos(11, 8, 12));
            this.put("plains/houses/plains_butcher_shop_2", new BPos(15, 12, 7));
            this.put("plains/houses/plains_cartographer_1", new BPos(10, 8, 7));
            this.put("plains/houses/plains_fisher_cottage_1", new BPos(11, 9, 10));
            this.put("plains/houses/plains_fletcher_house_1", new BPos(9, 7, 11));
            this.put("plains/houses/plains_large_farm_1", new BPos(13, 6, 9));
            this.put("plains/houses/plains_library_1", new BPos(11, 10, 17));
            this.put("plains/houses/plains_library_2", new BPos(8, 10, 9));
            this.put("plains/houses/plains_masons_house_1", new BPos(8, 7, 9));
            this.put("plains/houses/plains_medium_house_1", new BPos(13, 8, 11));
            this.put("plains/houses/plains_medium_house_2", new BPos(7, 6, 13));
            this.put("plains/houses/plains_meeting_point_4", new BPos(10, 7, 16));
            this.put("plains/houses/plains_meeting_point_5", new BPos(10, 6, 11));
            this.put("plains/houses/plains_shepherds_house_1", new BPos(9, 6, 13));
            this.put("plains/houses/plains_small_farm_1", new BPos(7, 6, 9));
            this.put("plains/houses/plains_small_house_1", new BPos(7, 7, 7));
            this.put("plains/houses/plains_small_house_2", new BPos(7, 7, 7));
            this.put("plains/houses/plains_small_house_3", new BPos(7, 7, 7));
            this.put("plains/houses/plains_small_house_4", new BPos(7, 7, 7));
            this.put("plains/houses/plains_small_house_5", new BPos(9, 11, 9));
            this.put("plains/houses/plains_small_house_6", new BPos(7, 7, 7));
            this.put("plains/houses/plains_small_house_7", new BPos(7, 7, 8));
            this.put("plains/houses/plains_small_house_8", new BPos(8, 9, 9));
            this.put("plains/houses/plains_stable_1", new BPos(9, 7, 16));
            this.put("plains/houses/plains_stable_2", new BPos(7, 6, 17));
            this.put("plains/houses/plains_tannery_1", new BPos(8, 7, 10));
            this.put("plains/houses/plains_temple_3", new BPos(11, 7, 7));
            this.put("plains/houses/plains_temple_4", new BPos(10, 12, 7));
            this.put("plains/houses/plains_tool_smith_1", new BPos(9, 6, 12));
            this.put("plains/houses/plains_weaponsmith_1", new BPos(9, 8, 11));
            this.put("plains/streets/corner_01", new BPos(16, 2, 16));
            this.put("plains/streets/corner_02", new BPos(16, 2, 16));
            this.put("plains/streets/corner_03", new BPos(4, 2, 4));
            this.put("plains/streets/crossroad_01", new BPos(16, 2, 16));
            this.put("plains/streets/crossroad_02", new BPos(16, 2, 16));
            this.put("plains/streets/crossroad_03", new BPos(16, 2, 16));
            this.put("plains/streets/crossroad_04", new BPos(4, 2, 5));
            this.put("plains/streets/crossroad_05", new BPos(5, 2, 5));
            this.put("plains/streets/crossroad_06", new BPos(5, 2, 5));
            this.put("plains/streets/straight_01", new BPos(16, 2, 16));
            this.put("plains/streets/straight_02", new BPos(16, 2, 16));
            this.put("plains/streets/straight_03", new BPos(13, 2, 11));
            this.put("plains/streets/straight_04", new BPos(11, 2, 9));
            this.put("plains/streets/straight_05", new BPos(20, 2, 17));
            this.put("plains/streets/straight_06", new BPos(21, 2, 18));
            this.put("plains/streets/turn_01", new BPos(18, 2, 8));
            this.put("plains/terminators/terminator_01", new BPos(2, 2, 3));
            this.put("plains/terminators/terminator_02", new BPos(1, 2, 1));
            this.put("plains/terminators/terminator_03", new BPos(3, 2, 3));
            this.put("plains/terminators/terminator_04", new BPos(4, 2, 4));
            this.put("plains/town_centers/plains_fountain_01", new BPos(9, 4, 9));
            this.put("plains/town_centers/plains_meeting_point_1", new BPos(10, 7, 10));
            this.put("plains/town_centers/plains_meeting_point_2", new BPos(8, 5, 15));
            this.put("plains/town_centers/plains_meeting_point_3", new BPos(11, 9, 11));
            this.put("plains/villagers/baby", new BPos(1, 2, 1));
            this.put("plains/villagers/nitwi", new BPos(1, 3, 1));
            this.put("plains/villagers/unemployed", new BPos(1, 3, 1));
            this.put("plains/zombie/houses/plains_animal_pen_3", new BPos(8, 6, 11));
            this.put("plains/zombie/houses/plains_big_house_1", new BPos(7, 11, 11));
            this.put("plains/zombie/houses/plains_butcher_shop_2", new BPos(15, 12, 7));
            this.put("plains/zombie/houses/plains_fletcher_house_1", new BPos(9, 7, 11));
            this.put("plains/zombie/houses/plains_medium_house_1", new BPos(13, 8, 11));
            this.put("plains/zombie/houses/plains_medium_house_2", new BPos(7, 6, 13));
            this.put("plains/zombie/houses/plains_meeting_point_4", new BPos(10, 7, 16));
            this.put("plains/zombie/houses/plains_meeting_point_5", new BPos(10, 6, 11));
            this.put("plains/zombie/houses/plains_shepherds_house_1", new BPos(9, 6, 13));
            this.put("plains/zombie/houses/plains_small_house_1", new BPos(7, 7, 7));
            this.put("plains/zombie/houses/plains_small_house_2", new BPos(7, 7, 7));
            this.put("plains/zombie/houses/plains_small_house_3", new BPos(7, 7, 7));
            this.put("plains/zombie/houses/plains_small_house_4", new BPos(7, 7, 7));
            this.put("plains/zombie/houses/plains_small_house_5", new BPos(9, 11, 9));
            this.put("plains/zombie/houses/plains_small_house_6", new BPos(7, 7, 7));
            this.put("plains/zombie/houses/plains_small_house_7", new BPos(7, 7, 8));
            this.put("plains/zombie/houses/plains_small_house_8", new BPos(8, 9, 9));
            this.put("plains/zombie/houses/plains_stable_1", new BPos(9, 7, 16));
            this.put("plains/zombie/streets/corner_01", new BPos(16, 2, 16));
            this.put("plains/zombie/streets/corner_02", new BPos(16, 2, 16));
            this.put("plains/zombie/streets/corner_03", new BPos(4, 2, 4));
            this.put("plains/zombie/streets/crossroad_01", new BPos(16, 2, 16));
            this.put("plains/zombie/streets/crossroad_02", new BPos(16, 2, 16));
            this.put("plains/zombie/streets/crossroad_03", new BPos(16, 2, 16));
            this.put("plains/zombie/streets/crossroad_04", new BPos(4, 2, 5));
            this.put("plains/zombie/streets/crossroad_05", new BPos(5, 2, 5));
            this.put("plains/zombie/streets/crossroad_06", new BPos(5, 2, 5));
            this.put("plains/zombie/streets/straight_01", new BPos(16, 2, 16));
            this.put("plains/zombie/streets/straight_02", new BPos(16, 2, 16));
            this.put("plains/zombie/streets/straight_03", new BPos(13, 2, 11));
            this.put("plains/zombie/streets/straight_04", new BPos(11, 2, 9));
            this.put("plains/zombie/streets/straight_05", new BPos(20, 2, 17));
            this.put("plains/zombie/streets/straight_06", new BPos(21, 2, 18));
            this.put("plains/zombie/streets/turn_01", new BPos(18, 2, 8));
            this.put("plains/zombie/town_centers/plains_fountain_01", new BPos(9, 6, 9));
            this.put("plains/zombie/town_centers/plains_meeting_point_1", new BPos(10, 7, 10));
            this.put("plains/zombie/town_centers/plains_meeting_point_2", new BPos(8, 5, 15));
            this.put("plains/zombie/town_centers/plains_meeting_point_3", new BPos(11, 9, 11));
            this.put("plains/zombie/villagers/nitwi", new BPos(1, 3, 1));
            this.put("plains/zombie/villagers/unemployed", new BPos(1, 3, 1));
            this.put("savanna/savanna_lamp_post_01", new BPos(1, 2, 1));
            this.put("savanna/houses/savanna_animal_pen_1", new BPos(9, 5, 9));
            this.put("savanna/houses/savanna_animal_pen_2", new BPos(13, 7, 12));
            this.put("savanna/houses/savanna_animal_pen_3", new BPos(8, 5, 9));
            this.put("savanna/houses/savanna_armorer_1", new BPos(7, 7, 7));
            this.put("savanna/houses/savanna_butchers_shop_1", new BPos(11, 8, 11));
            this.put("savanna/houses/savanna_butchers_shop_2", new BPos(13, 10, 9));
            this.put("savanna/houses/savanna_cartographer_1", new BPos(8, 8, 9));
            this.put("savanna/houses/savanna_fisher_cottage_1", new BPos(8, 11, 9));
            this.put("savanna/houses/savanna_fletcher_house_1", new BPos(11, 7, 9));
            this.put("savanna/houses/savanna_large_farm_1", new BPos(9, 6, 9));
            this.put("savanna/houses/savanna_large_farm_2", new BPos(10, 7, 8));
            this.put("savanna/houses/savanna_library_1", new BPos(10, 8, 8));
            this.put("savanna/houses/savanna_mason_1", new BPos(8, 7, 10));
            this.put("savanna/houses/savanna_medium_house_1", new BPos(8, 7, 15));
            this.put("savanna/houses/savanna_medium_house_2", new BPos(10, 8, 11));
            this.put("savanna/houses/savanna_shepherd_1", new BPos(13, 14, 11));
            this.put("savanna/houses/savanna_small_farm", new BPos(6, 7, 9));
            this.put("savanna/houses/savanna_small_house_1", new BPos(7, 7, 7));
            this.put("savanna/houses/savanna_small_house_2", new BPos(7, 7, 7));
            this.put("savanna/houses/savanna_small_house_3", new BPos(7, 7, 7));
            this.put("savanna/houses/savanna_small_house_4", new BPos(10, 8, 7));
            this.put("savanna/houses/savanna_small_house_5", new BPos(7, 10, 7));
            this.put("savanna/houses/savanna_small_house_6", new BPos(7, 7, 7));
            this.put("savanna/houses/savanna_small_house_7", new BPos(7, 7, 7));
            this.put("savanna/houses/savanna_small_house_8", new BPos(6, 7, 7));
            this.put("savanna/houses/savanna_tannery_1", new BPos(8, 6, 9));
            this.put("savanna/houses/savanna_temple_1", new BPos(13, 8, 9));
            this.put("savanna/houses/savanna_temple_2", new BPos(7, 7, 9));
            this.put("savanna/houses/savanna_tool_smith_1", new BPos(7, 7, 11));
            this.put("savanna/houses/savanna_weaponsmith_1", new BPos(8, 6, 9));
            this.put("savanna/houses/savanna_weaponsmith_2", new BPos(9, 7, 13));
            this.put("savanna/streets/corner_01", new BPos(16, 2, 16));
            this.put("savanna/streets/corner_03", new BPos(4, 2, 4));
            this.put("savanna/streets/crossroad_02", new BPos(7, 2, 10));
            this.put("savanna/streets/crossroad_03", new BPos(16, 2, 16));
            this.put("savanna/streets/crossroad_04", new BPos(4, 2, 5));
            this.put("savanna/streets/crossroad_05", new BPos(5, 2, 5));
            this.put("savanna/streets/crossroad_06", new BPos(5, 2, 5));
            this.put("savanna/streets/crossroad_07", new BPos(15, 2, 14));
            this.put("savanna/streets/split_01", new BPos(8, 2, 6));
            this.put("savanna/streets/split_02", new BPos(14, 2, 9));
            this.put("savanna/streets/straight_02", new BPos(16, 2, 16));
            this.put("savanna/streets/straight_04", new BPos(11, 2, 9));
            this.put("savanna/streets/straight_05", new BPos(20, 2, 17));
            this.put("savanna/streets/straight_06", new BPos(9, 2, 14));
            this.put("savanna/streets/straight_08", new BPos(10, 2, 16));
            this.put("savanna/streets/straight_09", new BPos(23, 2, 16));
            this.put("savanna/streets/straight_10", new BPos(6, 2, 11));
            this.put("savanna/streets/straight_11", new BPos(17, 2, 17));
            this.put("savanna/streets/turn_01", new BPos(19, 2, 11));
            this.put("savanna/terminators/terminator_05", new BPos(16, 2, 16));
            this.put("savanna/town_centers/savanna_meeting_point_1", new BPos(14, 5, 12));
            this.put("savanna/town_centers/savanna_meeting_point_2", new BPos(11, 6, 11));
            this.put("savanna/town_centers/savanna_meeting_point_3", new BPos(9, 6, 11));
            this.put("savanna/town_centers/savanna_meeting_point_4", new BPos(9, 6, 9));
            this.put("savanna/villagers/baby", new BPos(1, 2, 1));
            this.put("savanna/villagers/nitwi", new BPos(1, 3, 1));
            this.put("savanna/villagers/unemployed", new BPos(1, 3, 1));
            this.put("savanna/zombie/houses/savanna_animal_pen_2", new BPos(13, 7, 12));
            this.put("savanna/zombie/houses/savanna_animal_pen_3", new BPos(8, 5, 9));
            this.put("savanna/zombie/houses/savanna_large_farm_2", new BPos(10, 7, 8));
            this.put("savanna/zombie/houses/savanna_medium_house_1", new BPos(8, 7, 15));
            this.put("savanna/zombie/houses/savanna_medium_house_2", new BPos(10, 8, 11));
            this.put("savanna/zombie/houses/savanna_small_house_1", new BPos(7, 7, 7));
            this.put("savanna/zombie/houses/savanna_small_house_2", new BPos(7, 7, 7));
            this.put("savanna/zombie/houses/savanna_small_house_3", new BPos(7, 7, 7));
            this.put("savanna/zombie/houses/savanna_small_house_4", new BPos(10, 8, 7));
            this.put("savanna/zombie/houses/savanna_small_house_5", new BPos(7, 10, 7));
            this.put("savanna/zombie/houses/savanna_small_house_6", new BPos(7, 7, 7));
            this.put("savanna/zombie/houses/savanna_small_house_7", new BPos(7, 7, 7));
            this.put("savanna/zombie/houses/savanna_small_house_8", new BPos(6, 7, 7));
            this.put("savanna/zombie/streets/corner_01", new BPos(16, 2, 16));
            this.put("savanna/zombie/streets/corner_03", new BPos(4, 2, 4));
            this.put("savanna/zombie/streets/crossroad_02", new BPos(7, 2, 10));
            this.put("savanna/zombie/streets/crossroad_03", new BPos(16, 2, 16));
            this.put("savanna/zombie/streets/crossroad_04", new BPos(4, 2, 5));
            this.put("savanna/zombie/streets/crossroad_05", new BPos(5, 2, 5));
            this.put("savanna/zombie/streets/crossroad_06", new BPos(5, 2, 5));
            this.put("savanna/zombie/streets/crossroad_07", new BPos(15, 2, 14));
            this.put("savanna/zombie/streets/split_01", new BPos(8, 2, 6));
            this.put("savanna/zombie/streets/split_02", new BPos(14, 2, 9));
            this.put("savanna/zombie/streets/straight_02", new BPos(16, 2, 16));
            this.put("savanna/zombie/streets/straight_04", new BPos(11, 2, 9));
            this.put("savanna/zombie/streets/straight_05", new BPos(20, 2, 17));
            this.put("savanna/zombie/streets/straight_06", new BPos(9, 2, 14));
            this.put("savanna/zombie/streets/straight_08", new BPos(10, 2, 16));
            this.put("savanna/zombie/streets/straight_09", new BPos(23, 2, 16));
            this.put("savanna/zombie/streets/straight_10", new BPos(6, 2, 11));
            this.put("savanna/zombie/streets/straight_11", new BPos(17, 2, 17));
            this.put("savanna/zombie/streets/turn_01", new BPos(19, 2, 11));
            this.put("savanna/zombie/terminators/terminator_05", new BPos(16, 2, 16));
            this.put("savanna/zombie/town_centers/savanna_meeting_point_1", new BPos(14, 6, 12));
            this.put("savanna/zombie/town_centers/savanna_meeting_point_2", new BPos(11, 6, 11));
            this.put("savanna/zombie/town_centers/savanna_meeting_point_3", new BPos(9, 6, 11));
            this.put("savanna/zombie/town_centers/savanna_meeting_point_4", new BPos(9, 6, 9));
            this.put("savanna/zombie/villagers/nitwi", new BPos(1, 3, 1));
            this.put("savanna/zombie/villagers/unemployed", new BPos(1, 3, 1));
            this.put("snowy/snowy_lamp_post_01", new BPos(3, 4, 1));
            this.put("snowy/snowy_lamp_post_02", new BPos(2, 4, 1));
            this.put("snowy/snowy_lamp_post_03", new BPos(3, 4, 3));
            this.put("snowy/houses/snowy_animal_pen_1", new BPos(8, 6, 9));
            this.put("snowy/houses/snowy_animal_pen_2", new BPos(9, 6, 8));
            this.put("snowy/houses/snowy_armorer_house_1", new BPos(8, 8, 7));
            this.put("snowy/houses/snowy_armorer_house_2", new BPos(7, 8, 7));
            this.put("snowy/houses/snowy_butchers_shop_1", new BPos(7, 8, 9));
            this.put("snowy/houses/snowy_butchers_shop_2", new BPos(9, 5, 5));
            this.put("snowy/houses/snowy_cartographer_house_1", new BPos(7, 7, 11));
            this.put("snowy/houses/snowy_farm_1", new BPos(6, 6, 7));
            this.put("snowy/houses/snowy_farm_2", new BPos(7, 6, 9));
            this.put("snowy/houses/snowy_fisher_cottage", new BPos(9, 8, 7));
            this.put("snowy/houses/snowy_fletcher_house_1", new BPos(9, 8, 7));
            this.put("snowy/houses/snowy_library_1", new BPos(13, 10, 7));
            this.put("snowy/houses/snowy_masons_house_1", new BPos(10, 8, 9));
            this.put("snowy/houses/snowy_masons_house_2", new BPos(9, 10, 9));
            this.put("snowy/houses/snowy_medium_house_1", new BPos(7, 6, 8));
            this.put("snowy/houses/snowy_medium_house_2", new BPos(14, 9, 7));
            this.put("snowy/houses/snowy_medium_house_3", new BPos(5, 5, 7));
            this.put("snowy/houses/snowy_shepherds_house_1", new BPos(9, 5, 10));
            this.put("snowy/houses/snowy_small_house_1", new BPos(7, 5, 6));
            this.put("snowy/houses/snowy_small_house_2", new BPos(7, 8, 7));
            this.put("snowy/houses/snowy_small_house_3", new BPos(7, 6, 7));
            this.put("snowy/houses/snowy_small_house_4", new BPos(8, 5, 7));
            this.put("snowy/houses/snowy_small_house_5", new BPos(7, 5, 5));
            this.put("snowy/houses/snowy_small_house_6", new BPos(7, 9, 7));
            this.put("snowy/houses/snowy_small_house_7", new BPos(6, 7, 7));
            this.put("snowy/houses/snowy_small_house_8", new BPos(6, 5, 5));
            this.put("snowy/houses/snowy_tannery_1", new BPos(8, 9, 9));
            this.put("snowy/houses/snowy_temple_1", new BPos(10, 14, 7));
            this.put("snowy/houses/snowy_tool_smith_1", new BPos(8, 8, 7));
            this.put("snowy/houses/snowy_weapon_smith_1", new BPos(9, 7, 10));
            this.put("snowy/streets/corner_01", new BPos(13, 2, 16));
            this.put("snowy/streets/corner_02", new BPos(16, 2, 16));
            this.put("snowy/streets/corner_03", new BPos(4, 2, 4));
            this.put("snowy/streets/crossroad_01", new BPos(16, 2, 16));
            this.put("snowy/streets/crossroad_02", new BPos(16, 2, 16));
            this.put("snowy/streets/crossroad_03", new BPos(16, 2, 17));
            this.put("snowy/streets/crossroad_04", new BPos(4, 2, 5));
            this.put("snowy/streets/crossroad_05", new BPos(5, 2, 5));
            this.put("snowy/streets/crossroad_06", new BPos(5, 2, 5));
            this.put("snowy/streets/square_01", new BPos(20, 2, 17));
            this.put("snowy/streets/straight_01", new BPos(16, 2, 16));
            this.put("snowy/streets/straight_02", new BPos(16, 2, 16));
            this.put("snowy/streets/straight_03", new BPos(13, 2, 11));
            this.put("snowy/streets/straight_04", new BPos(11, 2, 9));
            this.put("snowy/streets/straight_06", new BPos(21, 2, 18));
            this.put("snowy/streets/straight_08", new BPos(16, 2, 17));
            this.put("snowy/streets/turn_01", new BPos(18, 2, 8));
            this.put("snowy/town_centers/snowy_meeting_point_1", new BPos(12, 8, 8));
            this.put("snowy/town_centers/snowy_meeting_point_2", new BPos(11, 5, 9));
            this.put("snowy/town_centers/snowy_meeting_point_3", new BPos(7, 7, 7));
            this.put("snowy/villagers/baby", new BPos(1, 2, 1));
            this.put("snowy/villagers/nitwi", new BPos(1, 3, 1));
            this.put("snowy/villagers/unemployed", new BPos(1, 3, 1));
            this.put("snowy/zombie/houses/snowy_medium_house_1", new BPos(7, 6, 8));
            this.put("snowy/zombie/houses/snowy_medium_house_2", new BPos(14, 9, 7));
            this.put("snowy/zombie/houses/snowy_medium_house_3", new BPos(5, 5, 7));
            this.put("snowy/zombie/houses/snowy_small_house_1", new BPos(7, 5, 6));
            this.put("snowy/zombie/houses/snowy_small_house_2", new BPos(7, 8, 7));
            this.put("snowy/zombie/houses/snowy_small_house_3", new BPos(7, 6, 7));
            this.put("snowy/zombie/houses/snowy_small_house_4", new BPos(8, 5, 7));
            this.put("snowy/zombie/houses/snowy_small_house_5", new BPos(7, 5, 5));
            this.put("snowy/zombie/houses/snowy_small_house_6", new BPos(7, 9, 7));
            this.put("snowy/zombie/houses/snowy_small_house_7", new BPos(6, 7, 7));
            this.put("snowy/zombie/houses/snowy_small_house_8", new BPos(6, 4, 5));
            this.put("snowy/zombie/streets/corner_01", new BPos(13, 2, 16));
            this.put("snowy/zombie/streets/corner_02", new BPos(16, 2, 16));
            this.put("snowy/zombie/streets/corner_03", new BPos(4, 2, 4));
            this.put("snowy/zombie/streets/crossroad_01", new BPos(16, 2, 16));
            this.put("snowy/zombie/streets/crossroad_02", new BPos(16, 2, 16));
            this.put("snowy/zombie/streets/crossroad_03", new BPos(16, 2, 17));
            this.put("snowy/zombie/streets/crossroad_04", new BPos(4, 2, 5));
            this.put("snowy/zombie/streets/crossroad_05", new BPos(5, 2, 5));
            this.put("snowy/zombie/streets/crossroad_06", new BPos(5, 2, 5));
            this.put("snowy/zombie/streets/square_01", new BPos(20, 2, 17));
            this.put("snowy/zombie/streets/straight_01", new BPos(16, 2, 16));
            this.put("snowy/zombie/streets/straight_02", new BPos(16, 2, 16));
            this.put("snowy/zombie/streets/straight_03", new BPos(13, 2, 11));
            this.put("snowy/zombie/streets/straight_04", new BPos(11, 2, 9));
            this.put("snowy/zombie/streets/straight_06", new BPos(21, 2, 18));
            this.put("snowy/zombie/streets/straight_08", new BPos(16, 2, 17));
            this.put("snowy/zombie/streets/turn_01", new BPos(18, 2, 8));
            this.put("snowy/zombie/town_centers/snowy_meeting_point_1", new BPos(12, 8, 8));
            this.put("snowy/zombie/town_centers/snowy_meeting_point_2", new BPos(11, 6, 9));
            this.put("snowy/zombie/town_centers/snowy_meeting_point_3", new BPos(7, 7, 7));
            this.put("snowy/zombie/villagers/nitwi", new BPos(1, 3, 1));
            this.put("snowy/zombie/villagers/unemployed", new BPos(1, 3, 1));
            this.put("taiga/taiga_decoration_1", new BPos(3, 2, 6));
            this.put("taiga/taiga_decoration_2", new BPos(2, 2, 3));
            this.put("taiga/taiga_decoration_3", new BPos(1, 2, 2));
            this.put("taiga/taiga_decoration_4", new BPos(1, 2, 2));
            this.put("taiga/taiga_decoration_5", new BPos(1, 1, 1));
            this.put("taiga/taiga_decoration_6", new BPos(3, 2, 3));
            this.put("taiga/taiga_lamp_post_1", new BPos(1, 2, 1));
            this.put("taiga/houses/taiga_animal_pen_1", new BPos(13, 5, 8));
            this.put("taiga/houses/taiga_armorer_2", new BPos(7, 8, 7));
            this.put("taiga/houses/taiga_armorer_house_1", new BPos(10, 7, 7));
            this.put("taiga/houses/taiga_butcher_shop_1", new BPos(11, 7, 9));
            this.put("taiga/houses/taiga_cartographer_house_1", new BPos(7, 10, 8));
            this.put("taiga/houses/taiga_fisher_cottage_1", new BPos(10, 8, 12));
            this.put("taiga/houses/taiga_fletcher_house_1", new BPos(10, 6, 11));
            this.put("taiga/houses/taiga_large_farm_1", new BPos(10, 7, 10));
            this.put("taiga/houses/taiga_large_farm_2", new BPos(8, 7, 9));
            this.put("taiga/houses/taiga_library_1", new BPos(11, 10, 8));
            this.put("taiga/houses/taiga_masons_house_1", new BPos(8, 7, 9));
            this.put("taiga/houses/taiga_medium_house_1", new BPos(8, 11, 7));
            this.put("taiga/houses/taiga_medium_house_2", new BPos(7, 11, 8));
            this.put("taiga/houses/taiga_medium_house_3", new BPos(8, 7, 13));
            this.put("taiga/houses/taiga_medium_house_4", new BPos(9, 7, 9));
            this.put("taiga/houses/taiga_shepherds_house_1", new BPos(10, 7, 11));
            this.put("taiga/houses/taiga_small_farm_1", new BPos(7, 7, 8));
            this.put("taiga/houses/taiga_small_house_1", new BPos(7, 8, 9));
            this.put("taiga/houses/taiga_small_house_2", new BPos(7, 7, 7));
            this.put("taiga/houses/taiga_small_house_3", new BPos(7, 7, 7));
            this.put("taiga/houses/taiga_small_house_4", new BPos(7, 6, 8));
            this.put("taiga/houses/taiga_small_house_5", new BPos(9, 7, 7));
            this.put("taiga/houses/taiga_tannery_1", new BPos(9, 6, 9));
            this.put("taiga/houses/taiga_temple_1", new BPos(13, 14, 11));
            this.put("taiga/houses/taiga_tool_smith_1", new BPos(11, 6, 8));
            this.put("taiga/houses/taiga_weaponsmith_1", new BPos(7, 9, 7));
            this.put("taiga/houses/taiga_weaponsmith_2", new BPos(6, 5, 7));
            this.put("taiga/streets/corner_01", new BPos(16, 2, 16));
            this.put("taiga/streets/corner_02", new BPos(16, 2, 16));
            this.put("taiga/streets/corner_03", new BPos(4, 2, 4));
            this.put("taiga/streets/crossroad_01", new BPos(16, 2, 16));
            this.put("taiga/streets/crossroad_02", new BPos(16, 2, 16));
            this.put("taiga/streets/crossroad_03", new BPos(16, 2, 16));
            this.put("taiga/streets/crossroad_04", new BPos(4, 2, 5));
            this.put("taiga/streets/crossroad_05", new BPos(5, 2, 5));
            this.put("taiga/streets/crossroad_06", new BPos(5, 2, 5));
            this.put("taiga/streets/straight_01", new BPos(16, 2, 16));
            this.put("taiga/streets/straight_02", new BPos(16, 2, 16));
            this.put("taiga/streets/straight_03", new BPos(13, 2, 11));
            this.put("taiga/streets/straight_04", new BPos(11, 2, 9));
            this.put("taiga/streets/straight_05", new BPos(20, 2, 17));
            this.put("taiga/streets/straight_06", new BPos(21, 2, 18));
            this.put("taiga/streets/turn_01", new BPos(18, 2, 8));
            this.put("taiga/town_centers/taiga_meeting_point_1", new BPos(22, 3, 18));
            this.put("taiga/town_centers/taiga_meeting_point_2", new BPos(9, 7, 9));
            this.put("taiga/villagers/baby", new BPos(1, 2, 1));
            this.put("taiga/villagers/nitwi", new BPos(1, 3, 1));
            this.put("taiga/villagers/unemployed", new BPos(1, 3, 1));
            this.put("taiga/zombie/houses/taiga_cartographer_house_1", new BPos(7, 10, 8));
            this.put("taiga/zombie/houses/taiga_fisher_cottage_1", new BPos(10, 8, 12));
            this.put("taiga/zombie/houses/taiga_large_farm_2", new BPos(8, 7, 9));
            this.put("taiga/zombie/houses/taiga_library_1", new BPos(11, 10, 8));
            this.put("taiga/zombie/houses/taiga_medium_house_1", new BPos(8, 11, 7));
            this.put("taiga/zombie/houses/taiga_medium_house_2", new BPos(7, 11, 8));
            this.put("taiga/zombie/houses/taiga_medium_house_3", new BPos(8, 7, 13));
            this.put("taiga/zombie/houses/taiga_medium_house_4", new BPos(9, 7, 9));
            this.put("taiga/zombie/houses/taiga_shepherds_house_1", new BPos(10, 7, 11));
            this.put("taiga/zombie/houses/taiga_small_house_1", new BPos(7, 8, 9));
            this.put("taiga/zombie/houses/taiga_small_house_2", new BPos(7, 7, 7));
            this.put("taiga/zombie/houses/taiga_small_house_3", new BPos(7, 7, 7));
            this.put("taiga/zombie/houses/taiga_small_house_4", new BPos(7, 6, 8));
            this.put("taiga/zombie/houses/taiga_small_house_5", new BPos(9, 7, 7));
            this.put("taiga/zombie/houses/taiga_temple_1", new BPos(13, 14, 11));
            this.put("taiga/zombie/houses/taiga_tool_smith_1", new BPos(11, 6, 8));
            this.put("taiga/zombie/houses/taiga_weaponsmith_2", new BPos(6, 5, 7));
            this.put("taiga/zombie/streets/corner_01", new BPos(16, 2, 16));
            this.put("taiga/zombie/streets/corner_02", new BPos(16, 2, 16));
            this.put("taiga/zombie/streets/corner_03", new BPos(4, 2, 4));
            this.put("taiga/zombie/streets/crossroad_01", new BPos(16, 2, 16));
            this.put("taiga/zombie/streets/crossroad_02", new BPos(16, 2, 16));
            this.put("taiga/zombie/streets/crossroad_03", new BPos(16, 2, 16));
            this.put("taiga/zombie/streets/crossroad_04", new BPos(4, 2, 5));
            this.put("taiga/zombie/streets/crossroad_05", new BPos(5, 2, 5));
            this.put("taiga/zombie/streets/crossroad_06", new BPos(5, 2, 5));
            this.put("taiga/zombie/streets/straight_01", new BPos(16, 2, 16));
            this.put("taiga/zombie/streets/straight_02", new BPos(16, 2, 16));
            this.put("taiga/zombie/streets/straight_03", new BPos(13, 2, 11));
            this.put("taiga/zombie/streets/straight_04", new BPos(11, 2, 9));
            this.put("taiga/zombie/streets/straight_05", new BPos(20, 2, 17));
            this.put("taiga/zombie/streets/straight_06", new BPos(21, 2, 18));
            this.put("taiga/zombie/streets/turn_01", new BPos(18, 2, 8));
            this.put("taiga/zombie/town_centers/taiga_meeting_point_1", new BPos(22, 6, 18));
            this.put("taiga/zombie/town_centers/taiga_meeting_point_2", new BPos(9, 7, 9));
            this.put("taiga/zombie/villagers/nitwi", new BPos(1, 3, 1));
            this.put("taiga/zombie/villagers/unemployed", new BPos(1, 3, 1));
        }
    };
    public static final Map<VillageType, JigSawPool> STARTS = new HashMap<VillageType, JigSawPool>(){
        {
            this.put(VillageType.DESERT, new JigSawPool(VILLAGE_POOLS.get("desert/town_centers").getSecond()));
            this.put(VillageType.LEGACY, null);
            this.put(VillageType.PLAINS, null);
            this.put(VillageType.TAIGA, null);
            this.put(VillageType.SAVANNA, null);
            this.put(VillageType.SNOWY, null);
        }
    };

    public VillageGenerator(MCVersion version) {
        super(version);
    }

    @Override
    public boolean generate(TerrainGenerator generator, int chunkX, int chunkZ, ChunkRand rand) {
        rand = rand.asChunkRandDebugger();
        Village village = new Village(this.getVersion());
        if (!village.canStart(village.at(chunkX, chunkZ), generator.getWorldSeed(), rand)) {
            return false;
        }
        if (!village.canSpawn(chunkX, chunkZ, generator.getBiomeSource())) {
            return false;
        }
        Biome biome = village.getBiome();
        VillageType villageType = VillageType.getType(biome, generator.getVersion());
        rand.setCarverSeed(generator.getWorldSeed(), chunkX, chunkZ, generator.getVersion());
        BlockRotation rotation = BlockRotation.getRandom(rand);
        JigSawPool jigSawPool = STARTS.get((Object)villageType);
        String template = rand.getRandom(jigSawPool.getTemplates());
        BPos size = STRUCTURE_SIZE.get(template);
        BPos bPos = new CPos(chunkX, chunkZ).toBlockPos(0);
        BlockBox box = BlockBox.getBoundingBox(bPos, rotation, BPos.ORIGIN, BlockMirror.NONE, size);
        int centerX = (box.minX + box.maxX) / 2;
        int centerZ = (box.minZ + box.maxZ) / 2;
        int y = bPos.getY() + generator.getHeightOnGround(centerX, centerZ);
        int centerY = box.minY + 1;
        Piece piece = new Piece(template, bPos, box, rotation, PlacementBehaviour.RIGID);
        piece.move(0, y - centerY, 0);
        piece.setBoundsTop(y + 80);
        BlockBox fullBox = new BlockBox(centerX - 80, y - 80, centerZ - 80, centerX + 80 + 1, y + 80 + 1, centerZ + 80 + 1);
        Assembler assembler = new Assembler(6, generator);
        assembler.placing.addLast(piece);
        while (!assembler.placing.isEmpty()) {
            assembler.tryPlacing(villageType, (Piece)assembler.placing.removeFirst(), rand, true);
        }
        return true;
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getLootPos() {
        return this.getChestsPos();
    }

    @Override
    public List<Pair<Generator.ILootType, BPos>> getChestsPos() {
        return null;
    }

    @Override
    public Generator.ILootType[] getLootTypes() {
        return new Generator.ILootType[0];
    }

    public static enum VillageType {
        DESERT,
        PLAINS,
        SAVANNA,
        SNOWY,
        TAIGA,
        LEGACY;


        public static VillageType getType(Biome biome, MCVersion version) {
            if (version.isOlderThan(MCVersion.v1_14)) {
                return LEGACY;
            }
            if (Biomes.DESERT.equals(biome) || Biomes.DESERT_HILLS.equals(biome)) {
                return DESERT;
            }
            if (Biomes.SAVANNA.equals(biome)) {
                return SAVANNA;
            }
            if (Biomes.SNOWY_TUNDRA.equals(biome)) {
                return SNOWY;
            }
            if (Biomes.TAIGA.equals(biome)) {
                return TAIGA;
            }
            if (!biome.equals(Biomes.PLAINS)) {
                System.err.println("Biome unknown to village gen : " + biome.getName());
            }
            return PLAINS;
        }

        public HashMap<String, List<Pair<Quad<String, String, String, Block>, BPos>>> getJigsawBlocks() {
            switch (this) {
                case DESERT: {
                    return DesertVillageJigsawBlocks.JIGSAW_BLOCKS;
                }
                case PLAINS: {
                    return PlainsVillageJigsawBlocks.JIGSAW_BLOCKS;
                }
                case SAVANNA: {
                    return SavannaVillageJigsawBlocks.JIGSAW_BLOCKS;
                }
                case SNOWY: {
                    return SnowyVillageJigsawBlocks.JIGSAW_BLOCKS;
                }
                case TAIGA: {
                    return TaigaVillageJigsawBlocks.JIGSAW_BLOCKS;
                }
            }
            return null;
        }
    }

    public static class JigSawPool {
        private final LinkedList<String> templates = new LinkedList();

        JigSawPool(List<Pair<String, Integer>> templates) {
            for (Pair<String, Integer> template : templates) {
                for (int i = 0; i < template.getSecond(); ++i) {
                    this.templates.addLast(template.getFirst());
                }
            }
        }

        public LinkedList<String> getTemplates() {
            return this.templates;
        }
    }

    public class Piece {
        String name;
        BPos pos;
        BlockBox box;
        BlockRotation rotation;
        int boundsTop;
        PlacementBehaviour placementBehaviour;

        Piece(String name, BPos pos, BlockBox box, BlockRotation rotation, PlacementBehaviour placementBehaviour) {
            this.name = name;
            this.pos = pos;
            this.box = box;
            this.rotation = rotation;
            this.placementBehaviour = placementBehaviour;
        }

        public void move(int x, int y, int z) {
            this.box.move(x, y, z);
            this.pos = this.pos.add(x, y, z);
        }

        public void setBoundsTop(int boundsTop) {
            this.boundsTop = boundsTop;
        }

        public ArrayList<BlockJigsawInfo> getShuffledJigsawBlocks(VillageType villageType, BPos offset, JRand rand) {
            List<Pair<Quad<String, String, String, Block>, BPos>> blocks = villageType.getJigsawBlocks().get(this.name);
            assert (blocks != null);
            ArrayList<BlockJigsawInfo> list = new ArrayList<BlockJigsawInfo>(blocks.size());
            for (Pair<Quad<String, String, String, Block>, BPos> block : blocks) {
                BPos pos = block.getSecond().transform(BlockMirror.NONE, this.rotation, BPos.ORIGIN).add(offset);
                list.add(new BlockJigsawInfo(block.getFirst(), pos, this.rotation));
            }
            rand.shuffle(list);
            return list;
        }
    }

    public static enum PlacementBehaviour {
        RIGID,
        TERRAIN_MATCHING;

    }

    public class Assembler {
        int maxDepth;
        TerrainGenerator generator;
        private final Deque<Piece> placing = new ArrayDeque<Piece>();

        Assembler(int maxDepth, TerrainGenerator generator) {
            this.maxDepth = maxDepth;
            this.generator = generator;
        }

        public void tryPlacing(VillageType villageType, Piece piece, JRand rand, boolean expansionHack) {
            BPos pos = piece.pos;
            BlockRotation rotation = piece.rotation;
            PlacementBehaviour placementBehaviour = piece.placementBehaviour;
            boolean isRigid = placementBehaviour == PlacementBehaviour.RIGID;
            BlockBox box = piece.box;
            int minY = box.minY;
            for (BlockJigsawInfo blockJigsawInfo : piece.getShuffledJigsawBlocks(villageType, pos, rand)) {
                String fallbackLocation;
                Triplet<String, List<Pair<String, Integer>>, PlacementBehaviour> fallbackPool;
                BlockDirection blockDirection = blockJigsawInfo.getFront();
                BPos blockPos = blockJigsawInfo.pos;
                BPos relativeBlockPos = blockPos.relative(blockDirection);
                int y = blockPos.getY() - minY;
                int state = -1;
                Triplet<String, List<Pair<String, Integer>>, PlacementBehaviour> pool = blockJigsawInfo.getPool();
                if (pool == null || pool.getSecond().size() == 0 || (fallbackPool = VILLAGE_POOLS.get(fallbackLocation = pool.getFirst())) == null || fallbackPool.getSecond().size() == 0) continue;
                boolean bl = box.contains(relativeBlockPos);
            }
        }
    }

    public static class BlockJigsawInfo {
        Quad<String, String, String, Block> nbt;
        BPos pos;
        BlockRotation rotation;

        public BlockJigsawInfo(Quad<String, String, String, Block> nbt, BPos pos, BlockRotation rotation) {
            this.nbt = nbt;
            this.pos = pos;
            this.rotation = rotation;
        }

        public BlockDirection getFront() {
            return BlockDirection.fromString(this.nbt.getThird().split("_")[0]);
        }

        public Triplet<String, List<Pair<String, Integer>>, PlacementBehaviour> getPool() {
            return VILLAGE_POOLS.get(this.nbt.getFirst());
        }
    }
}

