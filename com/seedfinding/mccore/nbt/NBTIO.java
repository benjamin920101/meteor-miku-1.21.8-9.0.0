/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.nbt;

import com.seedfinding.mccore.nbt.tag.NBTCompound;
import com.seedfinding.mccore.nbt.tag.NBTTag;
import com.seedfinding.mccore.net.ByteBuffer;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipException;

public class NBTIO {
    public static NBTCompound read(String path) throws IOException {
        return NBTIO.read(new File(path));
    }

    public static NBTCompound read(File file) throws IOException {
        return NBTIO.read(Files.readAllBytes(file.toPath()));
    }

    public static NBTCompound read(byte[] bytes) throws IOException {
        InputStream in;
        try {
            in = new GZIPInputStream(new ByteArrayInputStream(bytes));
        }
        catch (ZipException e) {
            in = new ByteArrayInputStream(bytes);
        }
        NBTTag<?> tag = NBTTag.create(new ByteBuffer(in));
        in.close();
        if (tag instanceof NBTCompound) {
            return (NBTCompound)tag;
        }
        NBTCompound compound = new NBTCompound();
        ((Map)compound.getValue()).put("", tag);
        return compound;
    }

    public static void write(NBTTag<?> tag, String path, boolean compressed) throws IOException {
        NBTIO.write(tag, new File(path), compressed);
    }

    public static void write(NBTTag<?> tag, File file, boolean compressed) throws IOException {
        OutputStream out = new FileOutputStream(file);
        if (compressed) {
            out = new GZIPOutputStream(out);
        }
        tag.write(new ByteBuffer(out));
        out.flush();
        out.close();
    }
}

