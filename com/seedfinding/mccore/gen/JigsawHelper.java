/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.gen;

import com.seedfinding.mccore.block.BlockState;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockRotation;
import java.util.regex.Pattern;

public class JigsawHelper {
    public static void rotate(BlockState blockState, BlockRotation rotation) {
        String newOrientation = rotation.rotate(JigsawHelper.getFacing(blockState)).name().toLowerCase() + "_" + rotation.rotate(JigsawHelper.getRotation(blockState)).name().toLowerCase();
        blockState.getProperties().putString("orientation", newOrientation);
    }

    public static BlockDirection getFacing(BlockState blockState) {
        return BlockDirection.fromString(blockState.getProperties().getString("orientation").split(Pattern.quote("_"))[0]);
    }

    public static BlockDirection getRotation(BlockState blockState) {
        return BlockDirection.fromString(blockState.getProperties().getString("orientation").split(Pattern.quote("_"))[1]);
    }
}

