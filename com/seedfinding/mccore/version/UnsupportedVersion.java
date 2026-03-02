/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.version;

import com.seedfinding.mccore.version.MCVersion;

public class UnsupportedVersion
extends RuntimeException {
    public UnsupportedVersion(MCVersion version, String type) {
        super("Minecraft " + (Object)((Object)version) + " does not support " + type);
    }
}

