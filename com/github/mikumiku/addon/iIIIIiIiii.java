/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIIIiiiiiI;
import com.github.mikumiku.addon.iIIiIIiIIi;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iIIIIiIiii {
    private /* synthetic */ iIIIIiIiii() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static iIIiIIiIIi ALLATORIxDEMO(long iIiIiIIIII2) {
        return new iIIiIIiIIi(iIiIiIIIII2);
    }

    public static iIIiIIiIIi iiiIiIiiIi() {
        return new iIIiIIiIIi(50L);
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[5 >> 2];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(5 >> 3, stackTraceElement.getClassName()).toString();
        int n = --4;
        int n2 = 3 & 5;
        int n3 = string2.length();
        int n4 = n3 - (3 & 5);
        char[] cArray = new char[n3];
        int n5 = (--3 ^ --5) << --4 ^ n2 << n2;
        int cfr_ignored_0 = (--3 ^ --5) << --3 ^ --3;
        int n6 = n << n ^ --5 << (3 & 5);
        int n7 = iIiIiIIIII2 = string3.length() - --1;
        int n8 = n4;
        String string4 = string3;
        while (n8 >= 0) {
            int n9 = n4--;
            cArray[n9] = (char)(n6 ^ (string2.charAt(n9) ^ string4.charAt(iIiIiIIIII2)));
            if (n4 < 0) break;
            int n10 = n4--;
            char c = cArray[n10] = (char)(n5 ^ (string2.charAt(n10) ^ string4.charAt(iIiIiIIIII2)));
            if (--iIiIiIIIII2 < 0) {
                iIiIiIIIII2 = n7;
            }
            n8 = n4;
        }
        return new String(cArray);
    }

    public static iIIiIIiIIi ALLATORIxDEMO() {
        return new iIIiIIiIIi();
    }

    public static iIIIiiiiiI ALLATORIxDEMO() {
        return new iIIIiiiiiI();
    }
}

