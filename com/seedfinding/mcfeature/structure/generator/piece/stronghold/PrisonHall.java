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

public class PrisonHall
extends Stronghold.Piece {
    public PrisonHall(int pieceId, JRand rand, BlockBox boundingBox, BlockDirection facing) {
        super(pieceId);
        this.setOrientation(facing);
        rand.nextInt(5);
        this.boundingBox = boundingBox;
    }

    public static PrisonHall createPiece(List<Stronghold.Piece> pieces, JRand rand, int x, int y, int z, BlockDirection facing, int pieceId) {
        BlockBox box = BlockBox.rotated(x, y, z, -1, -1, 0, 9, 5, 11, facing.getRotation());
        return Stronghold.Piece.isHighEnough(box) && Stronghold.Piece.getNextIntersectingPiece(pieces, box) == null ? new PrisonHall(pieceId, rand, box, facing) : null;
    }

    @Override
    public void populatePieces(StrongholdGenerator gen, Start start, List<Stronghold.Piece> pieces, JRand rand) {
        this.generateSmallDoorChildrenForward(gen, start, pieces, rand, 1, 1);
    }

    @Override
    public boolean process(JRand rand, BPos pos) {
        this.skipWithRandomized(rand, 0, 0, 0, 8, 4, 10, true);
        this.skipWithRandomized(rand, 4, 1, 1, 4, 3, 1, false);
        this.skipWithRandomized(rand, 4, 1, 3, 4, 3, 3, false);
        this.skipWithRandomized(rand, 4, 1, 7, 4, 3, 7, false);
        this.skipWithRandomized(rand, 4, 1, 9, 4, 3, 9, false);
        return true;
    }
}

