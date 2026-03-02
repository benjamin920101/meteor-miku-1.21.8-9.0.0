/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIiIIiiI {
    private long ALLATORIxDEMO;

    public boolean iiIIiIIiii(long iIiIiIIIII2) {
        return this.iiiIiIiiIi(iIiIiIIIII2);
    }

    public boolean iiIIiIIiii(double iIiIiIIIII2) {
        return this.iiiIiIiiIi((long)iIiIiIIIII2);
    }

    public boolean iiiIiIiiIi(int n) {
        int n2 = n;
        IiIIiIIiiI iIiIiIIIII2 = this;
        return iIiIiIIIII2.iiiIiIiiIi((long)(n2 * (0x3F & 0x72)));
    }

    public boolean iiiIiIiiIi(double iIiIiIIIII2) {
        return this.iiIIiIIiii(iIiIiIIIII2 * 1000.0);
    }

    public long ALLATORIxDEMO() {
        IiIIiIIiiI iiIIiIIiiI2 = this;
        return iiIIiIIiiI2.ALLATORIxDEMO(System.nanoTime() - iiIIiIIiiI2.ALLATORIxDEMO);
    }

    public long iiiIiIiiIi(long iIiIiIIIII2) {
        return iIiIiIIIII2 * 1000000L;
    }

    public boolean ALLATORIxDEMO(int n) {
        int n2 = n;
        IiIIiIIiiI iIiIiIIIII2 = this;
        return iIiIiIIIII2.iiiIiIiiIi((long)(n2 * (0x7E & 0x33)));
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(3 ^ 3, stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (3 >> 1);
        char[] cArray = new char[n];
        int n3 = (1 ^ 3 ^ --5) << --4 ^ --5 << --1;
        int cfr_ignored_0 = --5 << --4 ^ (--3 << (5 >> 1) ^ --1);
        int n4 = --2 << --3;
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

    public boolean ALLATORIxDEMO(double iIiIiIIIII2) {
        return this.iiiIiIiiIi((long)iIiIiIIIII2);
    }

    public IiIIiIIiiI ALLATORIxDEMO() {
        this.ALLATORIxDEMO = System.nanoTime();
        return this;
    }

    public long ALLATORIxDEMO(long iIiIiIIIII2) {
        return iIiIiIIIII2 / 1000000L;
    }

    public void ALLATORIxDEMO(long iIiIiIIIII2) {
        this.ALLATORIxDEMO = System.nanoTime() - this.iiiIiIiiIi(iIiIiIIIII2);
    }

    public boolean iiiIiIiiIi(long iIiIiIIIII2) {
        IiIIiIIiiI iiIIiIIiiI2 = this;
        return iiIIiIIiiI2.ALLATORIxDEMO(iiIIiIIiiI2.iiiIiIiiIi(iIiIiIIIII2));
    }

    public boolean ALLATORIxDEMO(long iIiIiIIIII2) {
        if (System.nanoTime() - this.ALLATORIxDEMO >= iIiIiIIIII2) {
            return (3 & 5) != 0;
        }
        return false;
    }

    public IiIIiIIiiI() {
        IiIIiIIiiI iiIIiIIiiI2 = this;
        iiIIiIIiiI2.ALLATORIxDEMO = -1L;
        iiIIiIIiiI2.ALLATORIxDEMO();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

