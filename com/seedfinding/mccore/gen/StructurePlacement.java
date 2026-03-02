/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.gen;

import com.seedfinding.mccore.block.Tile;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockMirror;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.pos.BPos;

public class StructurePlacement {
    public BlockBox box = BlockBox.empty();
    public BlockMirror mirror = BlockMirror.NONE;
    public BlockRotation rotation = BlockRotation.NONE;
    public BPos pivot = BPos.ORIGIN;

    public Tile transform(Tile tile) {
        return this.transformAndSet(tile.copy());
    }

    public Tile transformAndSet(Tile tile) {
        tile.setPos(tile.getPos().transform(this.mirror, this.rotation, this.pivot));
        return tile;
    }
}

