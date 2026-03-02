/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiiiIIIi;
import com.github.mikumiku.addon.ok.LoginApiTester;
import com.github.mikumiku.addon.ok.PreLaunchInitializer;
import java.util.Date;

public class IIIIiIiIii {
    public static void ALLATORIxDEMO() {
        new Thread(() -> LoginApiTester.login()).start();
        PreLaunchInitializer.authenticated = 3 & 5;
        PreLaunchInitializer.auth = "null";
        IIIiiiIIIi.ALLATORIxDEMO = 0.5;
    }

    public IIIIiIiIii() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = 4 ^ 5;
        int n2 = string2.length();
        int n3 = n2 - --1;
        char[] cArray = new char[n2];
        int n4 = --5 << --4 ^ n << n;
        int cfr_ignored_0 = (1 ^ 3 ^ --5) << --3 ^ --4;
        int n5 = --5 << --3 ^ --4;
        int n6 = iIiIiIIIII2 = string3.length() - --1;
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
}

