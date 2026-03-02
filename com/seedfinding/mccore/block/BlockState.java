/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.block;

import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.nbt.tag.NBTCompound;

public class BlockState {
    private final Block block;
    private final NBTCompound properties;

    public BlockState(Block block) {
        this(block, NBTCompound.NULL);
    }

    public BlockState(Block block, NBTCompound properties) {
        this.block = block;
        this.properties = properties;
    }

    public Block getBlock() {
        return this.block;
    }

    public NBTCompound getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.block.hashCode() * 31 + this.properties.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockState)) {
            return false;
        }
        BlockState that = (BlockState)other;
        return this.getBlock() == that.getBlock() && this.getProperties().equals(that.getProperties());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.getBlock().getName().toUpperCase());
        if (!this.getProperties().isEmpty()) {
            sb.append(this.properties);
        }
        return sb.toString();
    }
}

