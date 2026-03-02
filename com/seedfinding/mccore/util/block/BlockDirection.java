/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.util.block;

import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.math.Vec3i;
import com.seedfinding.mcseed.rand.JRand;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum BlockDirection {
    DOWN(Axis.Y, new Vec3i(0, -1, 0)),
    UP(Axis.Y, new Vec3i(0, 1, 0)),
    NORTH(Axis.Z, new Vec3i(0, 0, -1)),
    SOUTH(Axis.Z, new Vec3i(0, 0, 1)),
    WEST(Axis.X, new Vec3i(-1, 0, 0)),
    EAST(Axis.X, new Vec3i(1, 0, 0));

    private static final BlockDirection[] HORIZONTALS;
    private static final BlockDirection[] BY_2D_DATA;
    private static final Map<String, BlockDirection> STRING_TO_BLOCK_DIRECTION;
    private final Axis axis;
    private final Vec3i vec;

    private BlockDirection(Axis axis, Vec3i vec) {
        this.axis = axis;
        this.vec = vec;
    }

    public static BlockDirection fromString(String name) {
        return STRING_TO_BLOCK_DIRECTION.get(name.toUpperCase());
    }

    public static BlockDirection randomHorizontal(JRand rand) {
        return HORIZONTALS[rand.nextInt(HORIZONTALS.length)];
    }

    public static BlockDirection getRandom(JRand rand) {
        return BlockDirection.values()[rand.nextInt(BlockDirection.values().length)];
    }

    public static BlockDirection random2D(JRand rand) {
        return BY_2D_DATA[rand.nextInt(BY_2D_DATA.length)];
    }

    public static BlockDirection[] getHorizontal() {
        return HORIZONTALS;
    }

    public static BlockDirection[] get2d() {
        return BY_2D_DATA;
    }

    public static List<BlockDirection> getShuffled(JRand rand) {
        List<BlockDirection> list = Arrays.asList(BlockDirection.values());
        JRand.shuffle(list, rand);
        return list;
    }

    public BlockDirection getClockWise() {
        return this.getDirection(EAST, WEST, NORTH, SOUTH);
    }

    public BlockDirection getCounterClockWise() {
        return this.getDirection(WEST, EAST, SOUTH, NORTH);
    }

    public BlockDirection getOpposite() {
        return this.getDirection(SOUTH, NORTH, EAST, WEST);
    }

    private BlockDirection getDirection(BlockDirection dir1, BlockDirection dir2, BlockDirection dir3, BlockDirection dir4) {
        switch (this) {
            case NORTH: {
                return dir1;
            }
            case SOUTH: {
                return dir2;
            }
            case WEST: {
                return dir3;
            }
            case EAST: {
                return dir4;
            }
        }
        throw new IllegalStateException("Unable to get facing of " + (Object)((Object)this));
    }

    public Axis getAxis() {
        return this.axis;
    }

    public Vec3i getVector() {
        return this.vec;
    }

    public BlockRotation getRotation() {
        switch (this) {
            case NORTH: {
                return BlockRotation.NONE;
            }
            case SOUTH: {
                return BlockRotation.CLOCKWISE_180;
            }
            case WEST: {
                return BlockRotation.COUNTERCLOCKWISE_90;
            }
            case EAST: {
                return BlockRotation.CLOCKWISE_90;
            }
        }
        throw new IllegalStateException("Unable to get direction of " + (Object)((Object)this));
    }

    public String toString() {
        return "Direction{axis=" + (Object)((Object)this.axis) + ", vec=" + this.vec + '}';
    }

    static {
        HORIZONTALS = new BlockDirection[]{NORTH, EAST, SOUTH, WEST};
        BY_2D_DATA = new BlockDirection[]{SOUTH, WEST, NORTH, EAST};
        STRING_TO_BLOCK_DIRECTION = Arrays.stream(BlockDirection.values()).collect(Collectors.toMap(Enum::name, o -> o));
    }

    public static enum Axis {
        X,
        Y,
        Z;


        public Axis get2DRotated() {
            switch (this) {
                case X: {
                    return Z;
                }
                case Z: {
                    return X;
                }
            }
            return Y;
        }
    }
}

