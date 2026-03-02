/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.version;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum MCVersion {
    v1_21("1.21", 21, 0),
    v1_20_6("1.20.6", 20, 6),
    v1_20_5("1.20.5", 20, 5),
    v1_20_4("1.20.4", 20, 4),
    v1_20_3("1.20.3", 20, 3),
    v1_20_2("1.20.2", 20, 2),
    v1_20_1("1.20.1", 20, 1),
    v1_20("1.20", 20, 0),
    v1_19_4("1.19.4", 19, 4),
    v1_19_3("1.19.3", 19, 3),
    v1_19_2("1.19.2", 19, 2),
    v1_19_1("1.19.1", 19, 1),
    v1_19("1.19", 19, 0),
    v1_18_2("1.18.2", 18, 2),
    v1_18_1("1.18.1", 18, 1),
    v1_18("1.18", 18, 0),
    v1_17_1("1.17.1", 17, 1),
    v1_17("1.17", 17, 0),
    v1_16_5("1.16.5", 16, 5),
    v1_16_4("1.16.4", 16, 4),
    v1_16_3("1.16.3", 16, 3),
    v1_16_2("1.16.2", 16, 2),
    v1_16_1("1.16.1", 16, 1),
    v1_16("1.16", 16, 0),
    v1_15_2("1.15.2", 15, 2),
    v1_15_1("1.15.1", 15, 1),
    v1_15("1.15", 15, 0),
    v1_14_4("1.14.4", 14, 4),
    v1_14_3("1.14.3", 14, 3),
    v1_14_2("1.14.2", 14, 2),
    v1_14_1("1.14.1", 14, 1),
    v1_14("1.14", 14, 0),
    v1_13_2("1.13.2", 13, 2),
    v1_13_1("1.13.1", 13, 1),
    v1_13("1.13", 13, 0),
    v1_12_2("1.12.2", 12, 2),
    v1_12_1("1.12.1", 12, 1),
    v1_12("1.12", 12, 0),
    v1_11_2("1.11.2", 11, 2),
    v1_11_1("1.11.1", 11, 1),
    v1_11("1.11", 11, 0),
    v1_10_2("1.10.2", 10, 2),
    v1_10_1("1.10.1", 10, 1),
    v1_10("1.10", 10, 0),
    v1_9_4("1.9.4", 9, 4),
    v1_9_3("1.9.3", 9, 3),
    v1_9_2("1.9.2", 9, 2),
    v1_9_1("1.9.1", 9, 1),
    v1_9("1.9", 9, 0),
    v1_8_9("1.8.9", 8, 9),
    v1_8_8("1.8.8", 8, 8),
    v1_8_7("1.8.7", 8, 7),
    v1_8_6("1.8.6", 8, 6),
    v1_8_5("1.8.5", 8, 5),
    v1_8_4("1.8.4", 8, 4),
    v1_8_3("1.8.3", 8, 3),
    v1_8_2("1.8.2", 8, 2),
    v1_8_1("1.8.1", 8, 1),
    v1_8("1.8", 8, 0),
    v1_7_10("1.7.10", 7, 10),
    v1_7_9("1.7.9", 7, 9),
    v1_7_8("1.7.8", 7, 8),
    v1_7_7("1.7.7", 7, 7),
    v1_7_6("1.7.6", 7, 6),
    v1_7_5("1.7.5", 7, 5),
    v1_7_4("1.7.4", 7, 4),
    v1_7_3("1.7.3", 7, 3),
    v1_7_2("1.7.2", 7, 2),
    v1_6_4("1.6.4", 6, 4),
    v1_6_2("1.6.2", 6, 2),
    v1_6_1("1.6.1", 6, 1),
    v1_5_2("1.5.2", 5, 2),
    v1_5_1("1.5.1", 5, 1),
    v1_4_7("1.4.7", 4, 7),
    v1_4_6("1.4.6", 4, 6),
    v1_4_5("1.4.5", 4, 5),
    v1_4_4("1.4.4", 4, 4),
    v1_4_2("1.4.2", 4, 2),
    v1_3_2("1.3.2", 3, 2),
    v1_3_1("1.3.1", 3, 1),
    v1_2_5("1.2.5", 2, 5),
    v1_2_4("1.2.4", 2, 4),
    v1_2_3("1.2.3", 2, 3),
    v1_2_2("1.2.2", 2, 2),
    v1_2_1("1.2.1", 2, 1),
    v1_1("1.1", 1, 0),
    v1_0("1.0", 0, 0),
    vb1_8_1("b1.8.1", 8, 1),
    vb1_8("b1.8", 8, 0),
    vb1_7_3("b1.7.3", 7, 3),
    vb1_7_2("b1.7.2", 7, 2),
    vb1_7("b1.7", 7, 0),
    vb1_6_6("b1.6.6", 6, 6),
    vb1_6_5("b1.6.5", 6, 5),
    vb1_6_4("b1.6.4", 6, 4),
    vb1_6_3("b1.6.3", 6, 3),
    vb1_6_2("b1.6.2", 6, 2),
    vb1_6_1("b1.6.1", 6, 1),
    vb1_6("b1.6", 6, 0),
    vb1_5_01("b1.5_01", 501, 0),
    vb1_5("b1.5", 5, 0),
    vb1_4_01("b1.4_01", 401, 0),
    vb1_4("b1.4", 4, 0),
    vb1_3_01("b1.3_01", 301, 0),
    vb1_3b("b1.3b", 3, 0),
    vb1_2_02("b1.2_02", 202, 0),
    vb1_2_01("b1.2_01", 201, 0),
    vb1_2("b1.2", 2, 0),
    vb1_1_02("b1.1_02", 102, 0),
    vb1_1_01("b1.1_01", 101, 0),
    vb1_0_2("b1.0.2", 0, 2),
    vb1_0_01("b1.0_01", 1, 0),
    vb1_0("b1.0", 0, 0),
    va1_2_6("a1.2.6", 2, 6),
    va1_2_5("a1.2.5", 2, 5),
    va1_2_4_01("a1.2.4_01", 2, 401),
    va1_2_3_04("a1.2.3_04", 2, 304),
    va1_2_3_02("a1.2.3_02", 2, 302),
    va1_2_3_01("a1.2.3_01", 2, 301),
    va1_2_3("a1.2.3", 2, 3),
    va1_2_2b("a1.2.2b", 2, 2),
    va1_2_2a("a1.2.2a", 2, 2),
    va1_2_1_01("a1.2.1_01", 2, 101),
    va1_2_1("a1.2.1", 2, 1),
    va1_2_0_02("a1.2.0_02", 2, 2),
    va1_2_0_01("a1.2.0_01", 2, 1),
    va1_2_0("a1.2.0", 2, 0),
    va1_1_2_01("a1.1.2_01", 1, 201),
    va1_1_2("a1.1.2", 1, 2),
    va1_1_0("a1.1.0", 1, 0),
    va1_0_17_04("a1.0.17_04", 0, 1704),
    va1_0_17_02("a1.0.17_02", 0, 1702),
    va1_0_16("a1.0.16", 0, 16),
    va1_0_15("a1.0.15", 0, 15),
    va1_0_14("a1.0.14", 0, 14),
    va1_0_11("a1.0.11", 0, 11),
    va1_0_5_01("a1.0.5_01", 0, 501),
    va1_0_4("a1.0.4", 0, 4);

    public final String name;
    public final int release;
    public final int subVersion;
    private static final Map<String, MCVersion> STRING_TO_VERSION;

    private MCVersion(String name, int release, int subVersion) {
        this.name = name;
        this.release = release;
        this.subVersion = subVersion;
    }

    public static MCVersion fromString(String name) {
        return STRING_TO_VERSION.get(name);
    }

    public int getRelease() {
        return this.release;
    }

    public int getSubVersion() {
        return this.subVersion;
    }

    public static MCVersion latest() {
        return MCVersion.values()[0];
    }

    public static MCVersion oldest() {
        return MCVersion.values()[MCVersion.values().length - 1];
    }

    public boolean isNewerThan(MCVersion v) {
        return this.compareTo(v) < 0;
    }

    public boolean isNewerOrEqualTo(MCVersion v) {
        return this.compareTo(v) <= 0;
    }

    public boolean isOlderThan(MCVersion v) {
        return this.compareTo(v) > 0;
    }

    public boolean isOlderOrEqualTo(MCVersion v) {
        return this.compareTo(v) >= 0;
    }

    public boolean isEqualTo(MCVersion v) {
        return this.compareTo(v) == 0;
    }

    public boolean isBetween(MCVersion a, MCVersion b) {
        return this.compareTo(a) <= 0 && this.compareTo(b) >= 0;
    }

    public boolean isBetweenExclusive(MCVersion a, MCVersion b) {
        return this.compareTo(a) < 0 && this.compareTo(b) > 0;
    }

    public MCVersion newer() {
        int i = this.ordinal() - 1;
        return i < 0 ? null : MCVersion.values()[i];
    }

    public MCVersion older() {
        int i = this.ordinal() + 1;
        return i >= MCVersion.values().length ? null : MCVersion.values()[i];
    }

    public boolean isRelease() {
        return MCVersion.isRelease(this);
    }

    public static boolean isRelease(MCVersion version) {
        return version.isOlderOrEqualTo(v1_0);
    }

    public boolean isAlpha() {
        return MCVersion.isAlpha(this);
    }

    public static boolean isAlpha(MCVersion version) {
        return version.isBetween(va1_0_4, va1_2_6);
    }

    public boolean isBeta() {
        return MCVersion.isBeta(this);
    }

    public static boolean isBeta(MCVersion version) {
        return version.isBetween(vb1_0, vb1_8_1);
    }

    public String toString() {
        return this.name;
    }

    static {
        STRING_TO_VERSION = Arrays.stream(MCVersion.values()).collect(Collectors.toMap(MCVersion::toString, o -> o));
    }
}

