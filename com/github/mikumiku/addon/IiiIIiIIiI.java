/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import java.util.Date;

public class IiiIIiIIiI {
    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 >> 1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --3;
        int n2 = string2.length();
        int n3 = n2 - --1;
        char[] cArray = new char[n2];
        int n4 = (5 >> 1 ^ --5) << --3 ^ --4;
        int cfr_ignored_0 = (--3 ^ --5) << --3 ^ --4;
        int n5 = n << n ^ --3;
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

    private /* synthetic */ IiiIIiIIiI() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

