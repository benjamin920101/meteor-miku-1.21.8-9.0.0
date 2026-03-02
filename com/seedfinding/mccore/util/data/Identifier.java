/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.util.data;

import java.util.regex.Pattern;

public class Identifier {
    protected final String namespace;
    protected final String path;

    protected Identifier(String[] id) {
        this.namespace = id[0] == null || id[0].isEmpty() ? "minecraft" : id[0];
        this.path = id[1];
    }

    public Identifier(String namespace, String path) {
        this(new String[]{namespace, path});
    }

    public Identifier(String id) {
        this(Identifier.split(id));
    }

    public static String[] split(String id) {
        String[] stringArray;
        String[] s = id.split(Pattern.quote(":"));
        if (s.length == 1) {
            String[] stringArray2 = new String[2];
            stringArray2[0] = "minecraft";
            stringArray = stringArray2;
            stringArray2[1] = id;
        } else {
            stringArray = s;
        }
        return stringArray;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getPath() {
        return this.path;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Identifier)) {
            return false;
        }
        Identifier that = (Identifier)other;
        return this.getNamespace().equals(that.getNamespace()) && this.getPath().equals(that.getPath());
    }

    public int hashCode() {
        return this.getNamespace().hashCode() * 31 + this.getPath().hashCode();
    }

    public String toString() {
        return this.namespace + ":" + this.path;
    }
}

