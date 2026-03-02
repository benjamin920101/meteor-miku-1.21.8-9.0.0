/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator.piece.village;

import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mccore.util.pos.BPos;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CommonVillageJigsawBlocks {
    public static final HashMap<String, List<Pair<Quad<String, String, String, Block>, BPos>>> JIGSAW_BLOCKS = new HashMap<String, List<Pair<Quad<String, String, String, Block>, BPos>>>(){
        {
            this.put("common/iron_golem", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/well_bottom", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("village/common/well_bottoms", "bottom", "up_north", Blocks.COBBLESTONE), new BPos(3, 2, 0))));
            this.put("common/animals/cat_black", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cat_british", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cat_calico", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cat_jellie", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cat_persia", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cat_ragdoll", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cat_red", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cat_siamese", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cat_tabby", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cat_white", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/cows_1", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/horses_1", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/horses_2", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/horses_3", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/horses_4", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.HAY_BLOCK), new BPos(0, 0, 0))));
            this.put("common/animals/horses_5", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/pigs_1", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/sheep_1", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("common/animals/sheep_2", Collections.singletonList(new Pair<Quad<String, String, String, Block>, BPos>(new Quad<String, String, String, Block>("empty", "bottom", "down_south", Blocks.STRUCTURE_VOID), new BPos(0, 0, 0))));
            this.put("decays/grass_11x13", Collections.emptyList());
            this.put("decays/grass_16x16", Collections.emptyList());
            this.put("decays/grass_9x9", Collections.emptyList());
        }
    };
}

