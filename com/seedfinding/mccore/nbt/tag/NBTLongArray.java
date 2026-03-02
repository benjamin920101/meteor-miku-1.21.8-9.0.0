/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.nbt.tag;

import com.seedfinding.mccore.nbt.tag.NBTTag;
import com.seedfinding.mccore.net.ByteBuffer;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NBTLongArray
extends NBTTag<long[]> {
    public static final NBTLongArray NULL = new NBTLongArray(){

        @Override
        public void readPayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }

        @Override
        public void writePayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }
    };

    public NBTLongArray() {
        this(0);
    }

    public NBTLongArray(int length) {
        this(new long[length]);
    }

    public NBTLongArray(long[] value) {
        super(value);
    }

    public long[] copyValue() {
        return (long[])((long[])super.getValue()).clone();
    }

    public Stream<Long> stream() {
        return Arrays.stream((long[])this.getValue()).boxed();
    }

    public Long[] toBoxed() {
        return (Long[])this.stream().toArray(Long[]::new);
    }

    public List<Long> toList() {
        return this.stream().collect(Collectors.toList());
    }

    @Override
    public void readPayload(ByteBuffer buffer) throws IOException {
        this.setValue(new long[buffer.readInt(ByteOrder.BIG_ENDIAN)]);
        for (int i = 0; i < ((long[])this.getValue()).length; ++i) {
            ((long[])this.getValue())[i] = buffer.readLong(ByteOrder.BIG_ENDIAN);
        }
    }

    @Override
    public void writePayload(ByteBuffer buffer) throws IOException {
        buffer.writeInt(((long[])this.getValue()).length, ByteOrder.BIG_ENDIAN);
        for (long v : (long[])this.getValue()) {
            buffer.writeLong(v, ByteOrder.BIG_ENDIAN);
        }
    }
}

