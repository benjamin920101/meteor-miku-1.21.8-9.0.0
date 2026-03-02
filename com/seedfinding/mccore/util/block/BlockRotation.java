/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.util.block;

import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mcseed.rand.JRand;
import java.util.Arrays;
import java.util.List;

public enum BlockRotation {
    NONE(BlockDirection.NORTH),
    CLOCKWISE_90(BlockDirection.EAST),
    CLOCKWISE_180(BlockDirection.SOUTH),
    COUNTERCLOCKWISE_90(BlockDirection.WEST);

    private final BlockDirection direction;

    private BlockRotation(BlockDirection direction) {
        this.direction = direction;
    }

    public static BlockRotation getRandom(JRand rand) {
        return BlockRotation.values()[rand.nextInt(BlockRotation.values().length)];
    }

    public static List<BlockRotation> getShuffled(JRand rand) {
        List<BlockRotation> list = Arrays.asList(BlockRotation.values());
        JRand.shuffle(list, rand);
        return list;
    }

    public BlockDirection getDirection() {
        return this.direction;
    }

    public BlockRotation getRotated(BlockRotation rotation) {
        switch (rotation) {
            case CLOCKWISE_180: {
                return this.direction.getOpposite().getRotation();
            }
            case COUNTERCLOCKWISE_90: {
                return this.direction.getCounterClockWise().getRotation();
            }
            case CLOCKWISE_90: {
                return this.direction.getClockWise().getRotation();
            }
        }
        return this;
    }

    public BlockDirection rotate(BlockDirection direction) {
        if (direction.getAxis() == BlockDirection.Axis.Y) {
            return direction;
        }
        switch (this) {
            case CLOCKWISE_90: {
                return direction.getClockWise();
            }
            case CLOCKWISE_180: {
                return direction.getOpposite();
            }
            case COUNTERCLOCKWISE_90: {
                return direction.getCounterClockWise();
            }
        }
        return direction;
    }

    public BPos rotate(BPos origin, BPos pivot) {
        int px = pivot.getX();
        int pz = pivot.getZ();
        switch (this) {
            case CLOCKWISE_90: {
                return new BPos(px + pz - origin.getZ(), origin.getY(), pz - px + origin.getX());
            }
            case CLOCKWISE_180: {
                return new BPos(px + px - origin.getX(), origin.getY(), pz + pz - origin.getZ());
            }
            case COUNTERCLOCKWISE_90: {
                return new BPos(px - pz + origin.getZ(), origin.getY(), px + pz - origin.getX());
            }
        }
        return origin;
    }

    public BPos getSize(BPos size) {
        switch (this) {
            case COUNTERCLOCKWISE_90: 
            case CLOCKWISE_90: {
                return new BPos(size.getZ(), size.getY(), size.getX());
            }
        }
        return size;
    }

    public int rotate(int anchor, int referent) {
        switch (this) {
            case CLOCKWISE_90: {
                return (anchor + referent / 4) % referent;
            }
            case CLOCKWISE_180: {
                return (anchor + referent / 2) % referent;
            }
            case COUNTERCLOCKWISE_90: {
                return (anchor + referent * 3 / 4) % referent;
            }
        }
        return anchor;
    }

    public String toString() {
        return "Rotation{direction=" + (Object)((Object)this.direction) + '}';
    }
}

