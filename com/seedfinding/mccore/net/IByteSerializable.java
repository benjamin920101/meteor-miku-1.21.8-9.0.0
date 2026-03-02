/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.net;

import com.seedfinding.mccore.net.ByteBuffer;
import java.io.IOException;

public interface IByteSerializable {
    public void read(ByteBuffer var1) throws IOException;

    public void write(ByteBuffer var1) throws IOException;
}

