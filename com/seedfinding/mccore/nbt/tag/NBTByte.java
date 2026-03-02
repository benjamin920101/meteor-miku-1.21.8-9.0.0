/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.nbt.tag;

import com.seedfinding.mccore.nbt.tag.NBTTag;
import com.seedfinding.mccore.net.ByteBuffer;
import java.io.IOException;

public class NBTByte
extends NBTTag<Byte> {
    public static final NBTByte NULL = new NBTByte(){

        @Override
        public void readPayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }

        @Override
        public void writePayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }
    };

    public NBTByte() {
        this(0);
    }

    public NBTByte(byte value) {
        super(value);
    }

    @Override
    public void readPayload(ByteBuffer buffer) throws IOException {
        this.setValue(buffer.readByte());
    }

    @Override
    public void writePayload(ByteBuffer buffer) throws IOException {
        buffer.writeByte(((Byte)this.getValue()).byteValue());
    }
}

