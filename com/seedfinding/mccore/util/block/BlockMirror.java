/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.util.block;

import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.math.Vec3i;
import com.seedfinding.mccore.util.pos.BPos;

public enum BlockMirror {
    NONE(new Vec3i(0, 0, 0)),
    LEFT_RIGHT(new Vec3i(0, 0, 1)),
    FRONT_BACK(new Vec3i(1, 0, 0));

    private final Vec3i orientation;

    private BlockMirror(Vec3i orientation) {
        this.orientation = orientation;
    }

    public int mirror(int anchor, int referent) {
        int middlePoint = referent / 2;
        int offset = anchor > middlePoint ? anchor - referent : anchor;
        switch (this) {
            case FRONT_BACK: {
                return (referent - offset) % referent;
            }
            case LEFT_RIGHT: {
                return (middlePoint - offset + referent) % referent;
            }
        }
        return anchor;
    }

    public BlockRotation getRotation(BlockDirection blockDirection) {
        BlockDirection.Axis axis = blockDirection.getAxis();
        return !(this == LEFT_RIGHT && axis == BlockDirection.Axis.Z || this == FRONT_BACK && axis == BlockDirection.Axis.X) ? BlockRotation.NONE : BlockRotation.CLOCKWISE_180;
    }

    public BlockDirection mirror(BlockDirection blockDirection) {
        if (this == FRONT_BACK && blockDirection.getAxis() == BlockDirection.Axis.X) {
            return blockDirection.getOpposite();
        }
        return this == LEFT_RIGHT && blockDirection.getAxis() == BlockDirection.Axis.Z ? blockDirection.getOpposite() : blockDirection;
    }

    public BPos mirror(BPos pos) {
        switch (this) {
            case LEFT_RIGHT: {
                return new BPos(pos.getX(), pos.getY(), -pos.getZ());
            }
            case FRONT_BACK: {
                return new BPos(-pos.getX(), pos.getY(), pos.getZ());
            }
        }
        return new BPos(pos.getX(), pos.getY(), pos.getZ());
    }

    public Vec3i getOrientation() {
        return this.orientation;
    }

    public String toString() {
        return "Mirror{orientation=" + this.orientation + '}';
    }
}

