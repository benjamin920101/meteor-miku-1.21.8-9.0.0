/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.nbt.tag;

import com.seedfinding.mccore.nbt.tag.NBTTag;
import com.seedfinding.mccore.net.ByteBuffer;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NBTByteArray
extends NBTTag<byte[]> {
    public static final NBTByteArray NULL = new NBTByteArray(){

        @Override
        public void readPayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }

        @Override
        public void writePayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }
    };

    public NBTByteArray() {
        this(0);
    }

    public NBTByteArray(int length) {
        this(new byte[length]);
    }

    public NBTByteArray(byte[] value) {
        super(value);
    }

    public byte[] copyValue() {
        return (byte[])((byte[])super.getValue()).clone();
    }

    public Stream<Byte> stream() {
        return IntStream.range(0, ((byte[])super.getValue()).length).mapToObj(i -> ((byte[])this.getValue())[i]);
    }

    public Byte[] toBoxed() {
        return (Byte[])this.stream().toArray(Byte[]::new);
    }

    public List<Byte> toList() {
        return this.stream().collect(Collectors.toList());
    }

    @Override
    public void readPayload(ByteBuffer buffer) throws IOException {
        this.setValue(new byte[buffer.readInt(ByteOrder.BIG_ENDIAN)]);
        for (int i = 0; i < ((byte[])this.getValue()).length; ++i) {
            ((byte[])this.getValue())[i] = buffer.readByte();
        }
    }

    @Override
    public void writePayload(ByteBuffer buffer) throws IOException {
        buffer.writeInt(((byte[])this.getValue()).length, ByteOrder.BIG_ENDIAN);
        for (byte b : (byte[])this.getValue()) {
            buffer.writeByte(b);
        }
    }
}

