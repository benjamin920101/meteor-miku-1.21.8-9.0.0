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

public class PortalRoom
extends Stronghold.Piece {
    private final boolean[] eyes = new boolean[12];

    public PortalRoom(int pieceId, BlockBox boundingBox, BlockDirection facing) {
        super(pieceId);
        this.setOrientation(facing);
        this.boundingBox = boundingBox;
    }

    public static PortalRoom createPiece(List<Stronghold.Piece> pieces, int x, int y, int z, BlockDirection facing, int pieceId) {
        BlockBox box = BlockBox.rotated(x, y, z, -4, -1, 0, 11, 8, 16, facing.getRotation());
        return Stronghold.Piece.isHighEnough(box) && Stronghold.Piece.getNextIntersectingPiece(pieces, box) == null ? new PortalRoom(pieceId, box, facing) : null;
    }

    @Override
    public void populatePieces(StrongholdGenerator gen, Start start, List<Stronghold.Piece> pieces, JRand rand) {
        if (start != null) {
            start.portalRoom = this;
        }
    }

    @Override
    public boolean process(JRand rand, BPos pos) {
        this.skipWithRandomized(rand, 0, 0, 0, 10, 7, 15, false);
        int yy = 6;
        this.skipWithRandomized(rand, 1, yy, 1, 1, yy, 14, false);
        this.skipWithRandomized(rand, 9, yy, 1, 9, yy, 14, false);
        this.skipWithRandomized(rand, 2, yy, 1, 8, yy, 2, false);
        this.skipWithRandomized(rand, 2, yy, 14, 8, yy, 14, false);
        this.skipWithRandomized(rand, 1, 1, 1, 2, 1, 4, false);
        this.skipWithRandomized(rand, 8, 1, 1, 9, 1, 4, false);
        this.skipWithRandomized(rand, 3, 1, 8, 7, 1, 12, false);
        this.skipWithRandomized(rand, 4, 1, 5, 6, 1, 7, false);
        this.skipWithRandomized(rand, 4, 2, 6, 6, 2, 7, false);
        this.skipWithRandomized(rand, 4, 3, 7, 6, 3, 7, false);
        for (int i = 0; i < this.eyes.length; ++i) {
            this.eyes[i] = rand.nextFloat() > 0.9f;
        }
        return true;
    }

    public boolean[] getEyes() {
        return this.eyes;
    }
}

