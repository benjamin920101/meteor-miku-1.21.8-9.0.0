/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.nbt.tag;

import com.seedfinding.mccore.nbt.tag.NBTByte;
import com.seedfinding.mccore.nbt.tag.NBTByteArray;
import com.seedfinding.mccore.nbt.tag.NBTDouble;
import com.seedfinding.mccore.nbt.tag.NBTEnd;
import com.seedfinding.mccore.nbt.tag.NBTFloat;
import com.seedfinding.mccore.nbt.tag.NBTInt;
import com.seedfinding.mccore.nbt.tag.NBTIntArray;
import com.seedfinding.mccore.nbt.tag.NBTList;
import com.seedfinding.mccore.nbt.tag.NBTLong;
import com.seedfinding.mccore.nbt.tag.NBTLongArray;
import com.seedfinding.mccore.nbt.tag.NBTShort;
import com.seedfinding.mccore.nbt.tag.NBTString;
import com.seedfinding.mccore.nbt.tag.NBTTag;
import com.seedfinding.mccore.net.ByteBuffer;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class NBTCompound
extends NBTTag<Map<String, NBTTag<?>>> {
    public static final NBTCompound NULL = new NBTCompound(){

        @Override
        public void readPayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }

        @Override
        public void writePayload(ByteBuffer buffer) {
            throw new NullPointerException();
        }
    };

    public NBTCompound() {
        this(HashMap::new);
    }

    public NBTCompound(Supplier<Map<String, NBTTag<?>>> supplier) {
        super(supplier.get());
    }

    @Override
    public void readPayload(ByteBuffer buffer) throws IOException {
        NBTTag<?> nbt;
        ((Map)this.getValue()).clear();
        while (!((nbt = NBTCompound.create(buffer)) instanceof NBTEnd)) {
            ((Map)this.getValue()).put(nbt.getName(), nbt);
        }
    }

    @Override
    public void writePayload(ByteBuffer buffer) throws IOException {
        for (Map.Entry entry : ((Map)this.getValue()).entrySet()) {
            String name = (String)entry.getKey();
            NBTTag tag = (NBTTag)entry.getValue();
            tag.writePayload(buffer.writeByte(tag.getType()).writeASCII(name, ByteOrder.BIG_ENDIAN));
        }
        NBTEnd.INSTANCE.write(buffer);
    }

    public NBTCompound run(Consumer<NBTCompound> action) {
        action.accept(this);
        return this;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        return ((Map)this.getValue()).size();
    }

    public boolean contains(String key) {
        return ((Map)this.getValue()).containsKey(key);
    }

    public boolean contains(String key, int type) {
        NBTTag<?> tag = this.getTag(key);
        return tag != null && tag.getType() == type;
    }

    public NBTTag<?> getTag(String key) {
        return (NBTTag)((Map)this.getValue()).get(key);
    }

    public NBTTag<?> getTagOrDefault(String key, NBTTag<?> defaultValue) {
        return ((Map)this.getValue()).getOrDefault(key, defaultValue);
    }

    public NBTCompound putTag(String key, NBTTag<?> value) {
        if (value.getType() < 0) {
            throw new RuntimeException("Serializing unregistered tag " + this.getClass());
        }
        if (value.getType() == 0) {
            throw new RuntimeException("Cannot write END tag to compound");
        }
        ((Map)this.getValue()).put(key, value);
        return this;
    }

    public boolean getBoolean(String key) {
        return this.getBooleanOrDefault(key, false);
    }

    public boolean getBooleanOrDefault(String key, boolean defaultValue) {
        NBTByte tag = this.getByteTag(key);
        return tag == null ? defaultValue : (Byte)tag.getValue() != 0;
    }

    public NBTCompound putBoolean(String key, boolean value) {
        ((Map)this.getValue()).put(key, new NBTByte((byte)(value ? 1 : 0)));
        return this;
    }

    public NBTByte getByteTag(String key) {
        return this.getByteTagOrDefault(key, null);
    }

    public NBTByte getByteTagOrDefault(String key, NBTByte defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 1) {
            return defaultTag;
        }
        return (NBTByte)nbt;
    }

    public byte getByte(String key) {
        return (Byte)this.getByteTagOrDefault(key, NBTByte.NULL).getValue();
    }

    public byte getByteOrDefault(String key, byte defaultValue) {
        NBTByte tag = this.getByteTag(key);
        return tag == null ? defaultValue : (Byte)tag.getValue();
    }

    public NBTCompound putByte(String key, byte value) {
        ((Map)this.getValue()).put(key, new NBTByte(value));
        return this;
    }

    public NBTShort getShortTag(String key) {
        return this.getShortTagOrDefault(key, null);
    }

    public NBTShort getShortTagOrDefault(String key, NBTShort defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 2) {
            return defaultTag;
        }
        return (NBTShort)nbt;
    }

    public short getShort(String key) {
        return (Short)this.getShortTagOrDefault(key, NBTShort.NULL).getValue();
    }

    public short getShortOrDefault(String key, short defaultValue) {
        NBTShort tag = this.getShortTag(key);
        return tag == null ? defaultValue : (Short)tag.getValue();
    }

    public NBTCompound putShort(String key, short value) {
        ((Map)this.getValue()).put(key, new NBTShort(value));
        return this;
    }

    public NBTInt getIntTag(String key) {
        return this.getIntTagOrDefault(key, null);
    }

    public NBTInt getIntTagOrDefault(String key, NBTInt defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 3) {
            return defaultTag;
        }
        return (NBTInt)nbt;
    }

    public int getInt(String key) {
        return (Integer)this.getIntTagOrDefault(key, NBTInt.NULL).getValue();
    }

    public int getIntOrDefault(String key, int defaultValue) {
        NBTInt tag = this.getIntTag(key);
        return tag == null ? defaultValue : (Integer)tag.getValue();
    }

    public NBTCompound putInt(String key, int value) {
        ((Map)this.getValue()).put(key, new NBTInt(value));
        return this;
    }

    public NBTLong getLongTag(String key) {
        return this.getLongTagOrDefault(key, null);
    }

    public NBTLong getLongTagOrDefault(String key, NBTLong defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 4) {
            return defaultTag;
        }
        return (NBTLong)nbt;
    }

    public long getLong(String key) {
        return (Long)this.getLongTagOrDefault(key, NBTLong.NULL).getValue();
    }

    public long getLongOrDefault(String key, long defaultValue) {
        NBTLong tag = this.getLongTag(key);
        return tag == null ? defaultValue : (Long)tag.getValue();
    }

    public NBTCompound putLong(String key, long value) {
        ((Map)this.getValue()).put(key, new NBTLong(value));
        return this;
    }

    public NBTFloat getFloatTag(String key) {
        return this.getFloatTagOrDefault(key, null);
    }

    public NBTFloat getFloatTagOrDefault(String key, NBTFloat defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 5) {
            return defaultTag;
        }
        return (NBTFloat)nbt;
    }

    public float getFloat(String key) {
        return ((Float)this.getFloatTagOrDefault(key, NBTFloat.NULL).getValue()).floatValue();
    }

    public float getFloatOrDefault(String key, float defaultValue) {
        NBTFloat tag = this.getFloatTag(key);
        return tag == null ? defaultValue : ((Float)tag.getValue()).floatValue();
    }

    public NBTCompound putFloat(String key, float value) {
        ((Map)this.getValue()).put(key, new NBTFloat(value));
        return this;
    }

    public NBTDouble getDoubleTag(String key) {
        return this.getDoubleTagOrDefault(key, null);
    }

    public NBTDouble getDoubleTagOrDefault(String key, NBTDouble defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 6) {
            return defaultTag;
        }
        return (NBTDouble)nbt;
    }

    public double getDouble(String key) {
        return (Double)this.getDoubleTagOrDefault(key, NBTDouble.NULL).getValue();
    }

    public double getDoubleOrDefault(String key, double defaultValue) {
        NBTDouble tag = this.getDoubleTag(key);
        return tag == null ? defaultValue : (Double)tag.getValue();
    }

    public NBTCompound putDouble(String key, double value) {
        ((Map)this.getValue()).put(key, new NBTDouble(value));
        return this;
    }

    public NBTByteArray getByteArrayTag(String key) {
        return this.getByteArrayTagOrDefault(key, null);
    }

    public NBTByteArray getByteArrayTagOrDefault(String key, NBTByteArray defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 7) {
            return defaultTag;
        }
        return (NBTByteArray)nbt;
    }

    public byte[] getByteArray(String key) {
        return (byte[])this.getByteArrayTagOrDefault(key, NBTByteArray.NULL).getValue();
    }

    public byte[] getByteArrayOrDefault(String key, byte[] defaultValue) {
        NBTByteArray tag = this.getByteArrayTag(key);
        return tag == null ? defaultValue : (byte[])tag.getValue();
    }

    public NBTCompound putByteArray(String key, byte[] value) {
        ((Map)this.getValue()).put(key, new NBTByteArray(value));
        return this;
    }

    public NBTString getStringTag(String key) {
        return this.getStringTagOrDefault(key, null);
    }

    public NBTString getStringTagOrDefault(String key, NBTString defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 8) {
            return defaultTag;
        }
        return (NBTString)nbt;
    }

    public String getString(String key) {
        return (String)this.getStringTagOrDefault(key, NBTString.NULL).getValue();
    }

    public String getStringOrDefault(String key, String defaultValue) {
        NBTString tag = this.getStringTag(key);
        return tag == null ? defaultValue : (String)tag.getValue();
    }

    public NBTCompound putString(String key, String value) {
        ((Map)this.getValue()).put(key, new NBTString(value));
        return this;
    }

    public NBTList getListTag(String key) {
        return this.getListTagOrDefault(key, null);
    }

    public NBTList getListTagOrDefault(String key, NBTList defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 9) {
            return defaultTag;
        }
        return (NBTList)nbt;
    }

    public List<NBTTag<?>> getList(String key) {
        return (List)this.getListTagOrDefault(key, NBTList.NULL).getValue();
    }

    public List<NBTTag<?>> getListOrDefault(String key, List<NBTTag<?>> defaultValue) {
        NBTList tag = this.getListTag(key);
        return tag == null ? defaultValue : (List)tag.getValue();
    }

    public <T extends NBTTag<?>> List<T> getList(String key, Class<T> tagClass) {
        return this.getListTagOrDefault(key, NBTList.NULL).getValue(tagClass);
    }

    public <T extends NBTTag<?>> List<T> getListOrDefault(String key, List<T> defaultValue, Class<T> tagClass) {
        NBTList tag = this.getListTag(key);
        return tag == null ? defaultValue : tag.getValue(tagClass);
    }

    public List<Object> getListElements(String key) {
        return this.getListTagOrDefault(key, NBTList.NULL).getElements();
    }

    public List<Object> getListElementsOrDefault(String key, List<Object> defaultValue) {
        NBTList tag = this.getListTag(key);
        return tag == null ? defaultValue : tag.getElements();
    }

    public <T> List<T> getListElements(String key, Class<T> elementClass) {
        return this.getListTagOrDefault(key, NBTList.NULL).getElements(elementClass);
    }

    public <T> List<T> getListElementsOrDefault(String key, List<T> defaultValue, Class<T> elementClass) {
        NBTList tag = this.getListTag(key);
        return tag == null ? defaultValue : tag.getElements(elementClass);
    }

    public NBTCompound getCompoundTag(String key) {
        return this.getCompoundTagOrDefault(key, null);
    }

    public NBTCompound getCompoundTagOrDefault(String key, NBTCompound defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 10) {
            return defaultTag;
        }
        return (NBTCompound)nbt;
    }

    public Map<String, NBTTag<?>> getCompound(String key) {
        return (Map)this.getCompoundTagOrDefault(key, NULL).getValue();
    }

    public Map<String, NBTTag<?>> getCompoundOrDefault(String key, Map<String, NBTTag<?>> defaultValue) {
        NBTCompound tag = this.getCompoundTag(key);
        return tag == null ? defaultValue : (Map)tag.getValue();
    }

    public NBTIntArray getIntArrayTag(String key) {
        return this.getIntArrayTagOrDefault(key, null);
    }

    public NBTIntArray getIntArrayTagOrDefault(String key, NBTIntArray defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 11) {
            return defaultTag;
        }
        return (NBTIntArray)nbt;
    }

    public int[] getIntArray(String key) {
        return (int[])this.getIntArrayTagOrDefault(key, NBTIntArray.NULL).getValue();
    }

    public int[] getIntArrayOrDefault(String key, int[] defaultValue) {
        NBTIntArray tag = this.getIntArrayTag(key);
        return tag == null ? defaultValue : (int[])tag.getValue();
    }

    public NBTCompound putIntArray(String key, int[] value) {
        ((Map)this.getValue()).put(key, new NBTIntArray(value));
        return this;
    }

    public NBTLongArray getLongArrayTag(String key) {
        return this.getLongArrayTagOrDefault(key, null);
    }

    public NBTLongArray getLongArrayTagOrDefault(String key, NBTLongArray defaultTag) {
        NBTTag nbt = (NBTTag)((Map)this.getValue()).get(key);
        if (nbt == null || nbt.getType() != 7) {
            return defaultTag;
        }
        return (NBTLongArray)nbt;
    }

    public long[] getLongArray(String key) {
        return (long[])this.getLongArrayTagOrDefault(key, NBTLongArray.NULL).getValue();
    }

    public long[] getLongArrayOrDefault(String key, long[] defaultValue) {
        NBTLongArray tag = this.getLongArrayTag(key);
        return tag == null ? defaultValue : (long[])tag.getValue();
    }

    public NBTCompound putLongArray(String key, long[] value) {
        ((Map)this.getValue()).put(key, new NBTLongArray(value));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        Iterator it = ((Map)this.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = it.next();
            sb.append("\"").append((String)e.getKey()).append("\": ").append(e.getValue());
            sb.append(it.hasNext() ? ", " : "");
        }
        return sb.append("}").toString();
    }
}

