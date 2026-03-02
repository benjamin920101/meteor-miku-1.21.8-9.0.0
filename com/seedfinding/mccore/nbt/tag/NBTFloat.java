/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.nbt.tag;

import com.seedfinding.mccore.nbt.tag.NBTTag;
import com.seedfinding.mccore.net.ByteBuffer;
import java.io.IOException;
import java.nio.ByteOrder;

public class NBTFloat
extends NBTTag<Float> {
    public static final NBTFloat NULL = new NBTFloat(){

        @Override
        public void readPayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }

        @Override
        public void writePayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }
    };

    public NBTFloat() {
        this(0.0f);
    }

    public NBTFloat(float value) {
        super(Float.valueOf(value));
    }

    @Override
    public void readPayload(ByteBuffer buffer) throws IOException {
        this.setValue(Float.valueOf(buffer.readFloat(ByteOrder.BIG_ENDIAN)));
    }

    @Override
    public void writePayload(ByteBuffer buffer) throws IOException {
        buffer.writeFloat(((Float)this.getValue()).floatValue(), ByteOrder.BIG_ENDIAN);
    }
}

