/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator.piece.stronghold;

import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mcfeature.structure.Stronghold;
import com.seedfinding.mcfeature.structure.generator.piece.stronghold.Start;
import com.seedfinding.mcfeature.structure.generator.structure.StrongholdGenerator;
import com.seedfinding.mcseed.rand.JRand;
import java.util.List;

public class SquareRoom
extends Stronghold.Piece {
    private final int type;

    public SquareRoom(int pieceId, JRand rand, BlockBox boundingBox, BlockDirection facing) {
        super(pieceId);
        this.setOrientation(facing);
        rand.nextInt(5);
        this.boundingBox = boundingBox;
        this.type = rand.nextInt(5);
    }

    public static SquareRoom createPiece(List<Stronghold.Piece> pieces, JRand rand, int x, int y, int z, BlockDirection facing, int pieceId) {
        BlockBox blockBox_1 = BlockBox.rotated(x, y, z, -4, -1, 0, 11, 7, 11, facing.getRotation());
        return Stronghold.Piece.isHighEnough(blockBox_1) && Stronghold.Piece.getNextIntersectingPiece(pieces, blockBox_1) == null ? new SquareRoom(pieceId, rand, blockBox_1, facing) : null;
    }

    @Override
    public void populatePieces(StrongholdGenerator gen, Start start, List<Stronghold.Piece> pieces, JRand rand) {
        this.generateSmallDoorChildrenForward(gen, start, pieces, rand, 4, 1);
        this.generateSmallDoorChildrenLeft(gen, start, pieces, rand, 1, 4);
        this.generateSmallDoorChildRight(gen, start, pieces, rand, 1, 4);
    }

    @Override
    public boolean process(JRand rand, BPos pos) {
        this.skipWithRandomized(rand, 0, 0, 0, 10, 6, 10, true);
        if (this.type == 2) {
            this.skipForChest(rand, 3, 4, 8);
        }
        return true;
    }
}

