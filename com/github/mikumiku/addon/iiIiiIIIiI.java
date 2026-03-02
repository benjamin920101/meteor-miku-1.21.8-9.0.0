/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiIIIiI {
    private final boolean iIIiIiiiIi;
    private final String iIiIiIIIII;
    private final String ALLATORIxDEMO;

    public static iiIiiIIIiI ALLATORIxDEMO(String string, String string2) {
        String iIiIiIIIII2 = string2;
        String iIiIiIIIII3 = string;
        return new iiIiiIIIiI(--1 != 0, iIiIiIIIII3, iIiIiIIIII2);
    }

    public String iiiIiIiiIi() {
        return this.ALLATORIxDEMO;
    }

    public String toString() {
        iiIiiIIIiI iiIiiIIIiI2 = this;
        return "AuthResult{success=" + iiIiiIIIiI2.iIIiIiiiIi + ", message='" + iiIiiIIIiI2.ALLATORIxDEMO + "', data=" + this.iIiIiIIIII + "}";
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(2 & 5, stackTraceElement.getMethodName()).toString();
        int n = --3;
        int n2 = string2.length();
        int n3 = n2 - (5 >> 2);
        char[] cArray = new char[n2];
        int n4 = --4 << --3 ^ 3 >> 1;
        int cfr_ignored_0 = n << n ^ --5;
        int n5 = 5 >> 1 ^ --5;
        int n6 = iIiIiIIIII2 = string3.length() - (3 >> 1);
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

    public boolean ALLATORIxDEMO() {
        return this.iIIiIiiiIi;
    }

    public static iiIiiIIIiI ALLATORIxDEMO(String iIiIiIIIII2) {
        return new iiIiiIIIiI(5 >> 3, iIiIiIIIII2, null);
    }

    /*
     * WARNING - void declaration
     */
    public iiIiiIIIiI(boolean bl, String string, String string2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiIiiIIIiI iIiIiIIIII4;
        iiIiiIIIiI iiIiiIIIiI2 = string3;
        String string3 = string2;
        iiIiiIIIiI iiIiiIIIiI3 = iIiIiIIIII4 = iiIiiIIIiI2;
        iIiIiIIIII4.iIIiIiiiIi = iIiIiIIIII3;
        iiIiiIIIiI3.ALLATORIxDEMO = iIiIiIIIII2;
        iiIiiIIIiI3.iIiIiIIIII = string3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public String ALLATORIxDEMO() {
        return this.iIiIiIIIII;
    }
}

