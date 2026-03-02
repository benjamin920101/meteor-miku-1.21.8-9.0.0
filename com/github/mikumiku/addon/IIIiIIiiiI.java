/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import java.awt.Color;
import java.util.Date;

public class IIIiIIiiiI {
    /*
     * WARNING - void declaration
     */
    public static Color ALLATORIxDEMO(Color color, Color color2, int n, int n2, double d) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        double iIiIiIIIII4;
        int iIiIiIIIII5 = n2;
        Color iIiIiIIIII6 = color;
        iIiIiIIIII4 = Math.abs(((double)System.currentTimeMillis() * iIiIiIIIII4 % 2000.0 / (double)Float.intBitsToFloat(Float.floatToIntBits(0.0013786979f) ^ 0x7ECEB56D) + (double)iIiIiIIIII3 / (double)iIiIiIIIII5 * (double)Float.intBitsToFloat(Float.floatToIntBits(0.09192204f) ^ 0x7DBC419F)) % (double)Float.intBitsToFloat(Float.floatToIntBits(0.7858098f) ^ 0x7F492AD5) - (double)Float.intBitsToFloat(Float.floatToIntBits(6.46708f) ^ 0x7F4EF252)) % (double)Float.intBitsToFloat(Float.floatToIntBits(0.8992331f) ^ 0x7F663424);
        return IIIiIIiiiI.ALLATORIxDEMO(iIiIiIIIII6, (Color)iIiIiIIIII2, iIiIiIIIII4);
    }

    /*
     * WARNING - void declaration
     */
    public static Color ALLATORIxDEMO(Color color, int n) {
        void iIiIiIIIII2;
        int iIiIiIIIII3;
        int n2 = n;
        Color color2 = color;
        iIiIiIIIII3 = Math.max(Math.min(0x1DFF & 0x62FF, iIiIiIIIII3), 3 >> 2);
        return new Color(iIiIiIIIII2.getRed(), iIiIiIIIII2.getGreen(), iIiIiIIIII2.getBlue(), iIiIiIIIII3);
    }

    public static int ALLATORIxDEMO(int n, int n2) {
        int iIiIiIIIII2 = n2;
        int iIiIiIIIII3 = n;
        return IIIiIIiiiI.ALLATORIxDEMO(new Color(iIiIiIIIII3).getRed(), new Color(iIiIiIIIII3).getGreen(), new Color(iIiIiIIIII3).getBlue(), iIiIiIIIII2);
    }

    public static Color ALLATORIxDEMO(Color color, Color color2, double d) {
        double iIiIiIIIII2;
        Color iIiIiIIIII3 = color;
        Color iIiIiIIIII222 = color2;
        if (iIiIiIIIII3 == iIiIiIIIII222) {
            return iIiIiIIIII3;
        }
        iIiIiIIIII2 = Math.min(Math.max(iIiIiIIIII2, 0.0), 1.0);
        Color color3 = iIiIiIIIII3;
        int n = color3.getRed();
        int n2 = color3.getGreen();
        int n3 = color3.getBlue();
        int n4 = color3.getAlpha();
        Color color4 = iIiIiIIIII222;
        int iIiIiIIIII222 = color4.getRed();
        int n5 = color4.getGreen();
        int n6 = color4.getBlue();
        int n7 = color4.getAlpha();
        return new Color(Math.min((int)((double)n + (double)(iIiIiIIIII222 - n) * iIiIiIIIII2), Short.MAX_VALUE & 0xFF), Math.min((int)((double)n2 + (double)(n5 - n2) * iIiIiIIIII2), Short.MAX_VALUE & 0xFF), Math.min((int)((double)n3 + (double)(n6 - n3) * iIiIiIIIII2), 0x6BFF & 0x14FF), Math.min((int)((double)n4 + (double)(n7 - n4) * iIiIiIIIII2), 0xFFF & 0x70FF));
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(5 >> 3, stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (3 >> 1);
        char[] cArray = new char[n];
        int n3 = --5 << --4 ^ (--2 ^ --5) << (4 ^ 5);
        int cfr_ignored_0 = --5 << --3 ^ 5 >> 1;
        int n4 = --5 << --4 ^ --5;
        int n5 = iIiIiIIIII2 = string3.length() - (4 ^ 5);
        int n6 = n2;
        String string4 = string3;
        while (n6 >= 0) {
            int n7 = n2--;
            cArray[n7] = (char)(n4 ^ (string2.charAt(n7) ^ string4.charAt(iIiIiIIIII2)));
            if (n2 < 0) break;
            int n8 = n2--;
            char c = cArray[n8] = (char)(n3 ^ (string2.charAt(n8) ^ string4.charAt(iIiIiIIIII2)));
            if (--iIiIiIIIII2 < 0) {
                iIiIiIIIII2 = n5;
            }
            n6 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public static Color ALLATORIxDEMO(Color color, int n, int n2, double d) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        double iIiIiIIIII4;
        Color color2 = color;
        Object iIiIiIIIII5 = new float[--3];
        Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), (float[])iIiIiIIIII5);
        iIiIiIIIII4 = Math.abs(((double)System.currentTimeMillis() * iIiIiIIIII4 % 2000.0 / (double)Float.intBitsToFloat(Float.floatToIntBits(0.0013786979f) ^ 0x7ECEB56D) + (double)((float)iIiIiIIIII3 / (float)iIiIiIIIII2 * Float.intBitsToFloat(Float.floatToIntBits(0.09192204f) ^ 0x7DBC419F))) % (double)Float.intBitsToFloat(Float.floatToIntBits(0.7858098f) ^ 0x7F492AD5) - (double)Float.intBitsToFloat(Float.floatToIntBits(6.46708f) ^ 0x7F4EF252));
        iIiIiIIIII4 = (double)Float.intBitsToFloat(Float.floatToIntBits(18.996923f) ^ 0x7E97F9B3) + (double)Float.intBitsToFloat(Float.floatToIntBits(2.7958195f) ^ 0x7F32EEB5) * iIiIiIIIII4;
        iIiIiIIIII5[--2] = (float)(iIiIiIIIII4 % (double)Float.intBitsToFloat(Float.floatToIntBits(0.8992331f) ^ 0x7F663424));
        return new Color(Color.HSBtoRGB((float)iIiIiIIIII5[5 >> 3], (float)iIiIiIIIII5[--1], (float)iIiIiIIIII5[5 >> 1]));
    }

    public IIIiIIiiiI() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(int n, int n2, int n3, int n4) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        int iIiIiIIIII4 = n4;
        int iIiIiIIIII5 = n;
        return (iIiIiIIIII5 << (0x70 & 0x1F)) + (iIiIiIIIII3 << (0x79 & 0xE)) + iIiIiIIIII2 + (iIiIiIIIII4 << (0x7E & 0x19));
    }
}

