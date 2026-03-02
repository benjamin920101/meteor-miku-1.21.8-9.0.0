/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon.mixinface;

import java.util.Date;

public class MoveEvent {
    public double z;
    public double x;
    private boolean cancelled;
    public double y;

    public double getY() {
        return this.y;
    }

    public MoveEvent(double iIiIiIIIII2, double iIiIiIIIII3, double iIiIiIIIII4) {
        MoveEvent moveEvent = this;
        this.x = iIiIiIIIII2;
        moveEvent.y = iIiIiIIIII3;
        moveEvent.z = iIiIiIIIII4;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public void setY(double iIiIiIIIII2) {
        this.y = iIiIiIIIII2;
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --3;
        int n2 = string2.length();
        int n3 = n2 - (5 >> 2);
        char[] cArray = new char[n2];
        int n4 = --4 << --3 ^ --3;
        int cfr_ignored_0 = n << n ^ 5 >> 1;
        int n5 = (--3 ^ --5) << --4 ^ --5;
        int n6 = iIiIiIIIII2 = string3.length() - (4 ^ 5);
        int n7 = n3;
        String string4 = string3;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string2.charAt(n8) ^ string4.charAt(iIiIiIIIII2)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string2.charAt(n9) ^ string4.charAt(iIiIiIIIII2)));
            if (--iIiIiIIIII2 < 0) {
                iIiIiIIIII2 = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }

    public void setZ(double iIiIiIIIII2) {
        this.z = iIiIiIIIII2;
    }

    public void cancel() {
        this.setCancelled((3 & 5) != 0);
    }

    public double getX() {
        return this.x;
    }

    public void setCancelled(boolean bl) {
        boolean bl2 = bl;
        MoveEvent iIiIiIIIII2 = this;
        iIiIiIIIII2.cancelled = bl2;
    }

    public double getZ() {
        return this.z;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setX(double iIiIiIIIII2) {
        this.x = iIiIiIIIII2;
    }
}

