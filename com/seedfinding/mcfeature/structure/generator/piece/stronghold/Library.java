/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator.piece.stronghold;

import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mcfeature.structure.Stronghold;
import com.seedfinding.mcseed.rand.JRand;
import java.util.List;

public class Library
extends Stronghold.Piece {
    boolean isTall;

    public Library(int pieceId, JRand rand, BlockBox boundingBox, BlockDirection facing) {
        super(pieceId);
        this.setOrientation(facing);
        rand.nextInt(5);
        this.boundingBox = boundingBox;
        this.isTall = boundingBox.getYSpan() > 6;
    }

    public static Library createPiece(List<Stronghold.Piece> pieces, JRand rand, int x, int y, int z, BlockDirection facing, int pieceId) {
        BlockBox box = BlockBox.rotated(x, y, z, -4, -1, 0, 14, 11, 15, facing.getRotation());
        if (!(Stronghold.Piece.isHighEnough(box) && Stronghold.Piece.getNextIntersectingPiece(pieces, box) == null || Stronghold.Piece.isHighEnough(box = BlockBox.rotated(x, y, z, -4, -1, 0, 14, 6, 15, facing.getRotation())) && Stronghold.Piece.getNextIntersectingPiece(pieces, box) == null)) {
            return null;
        }
        return new Library(pieceId, rand, box, facing);
    }

    @Override
    public boolean process(JRand rand, BPos pos) {
        int yy = this.isTall ? 11 : 6;
        this.skipWithRandomized(rand, 0, 0, 0, 13, yy - 1, 14, true);
        this.skipWithRandomizedChance(rand, 0.07f, 2, 1, 1, 11, 4, 13, false, false);
        this.skipForChest(rand, 3, 3, 5);
        if (this.isTall) {
            this.skipForChest(rand, 12, 8, 1);
        }
        return true;
    }
}

