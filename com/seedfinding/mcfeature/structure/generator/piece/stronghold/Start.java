/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator.piece.stronghold;

import com.seedfinding.mcfeature.structure.generator.piece.stronghold.PieceWeight;
import com.seedfinding.mcfeature.structure.generator.piece.stronghold.PortalRoom;
import com.seedfinding.mcfeature.structure.generator.piece.stronghold.SpiralStaircase;
import com.seedfinding.mcseed.rand.JRand;

public class Start
extends SpiralStaircase {
    public PieceWeight pieceWeight;
    public PortalRoom portalRoom;

    public Start(JRand rand, int x, int z) {
        super(0, rand, x, z);
    }
}

