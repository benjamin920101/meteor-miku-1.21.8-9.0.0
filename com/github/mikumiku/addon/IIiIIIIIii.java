/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class IIiIIIIIii {
    private final long iIiIiIIIII;
    private final AtomicLong ALLATORIxDEMO;

    public void ALLATORIxDEMO(Runnable runnable) {
        long l;
        IIiIIIIIii iIiIIIIIii = runnable2;
        Runnable runnable2 = runnable;
        IIiIIIIIii iIiIiIIIII2 = iIiIIIIIii;
        long l2 = System.nanoTime();
        if (l2 - (l = iIiIiIIIII2.ALLATORIxDEMO.get()) < iIiIiIIIII2.iIiIiIIIII) {
            return;
        }
        if (iIiIiIIIII2.ALLATORIxDEMO.compareAndSet(l, l2)) {
            try {
                runnable2.run();
                return;
            }
            catch (Throwable this_) {
                this_.printStackTrace();
            }
        }
    }

    public IIiIIIIIii(long iIiIiIIIII2) {
        IIiIIIIIii iIiIIIIIii = this;
        IIiIIIIIii iIiIIIIIii2 = this;
        iIiIIIIIii.ALLATORIxDEMO = new AtomicLong(0L);
        iIiIIIIIii.iIiIiIIIII = iIiIiIIIII2 * 1000000L;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public void ALLATORIxDEMO(Runnable runnable, long l) {
        IIiIIIIIii iIiIIIIIii = runnable2;
        Runnable runnable2 = runnable;
        IIiIIIIIii iIiIiIIIII2 = iIiIIIIIii;
        new IIiIIIIIii(1000L).ALLATORIxDEMO(() -> System.out.println("\u6267\u884c\u4e00\u6b21: " + System.currentTimeMillis()));
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[2 ^ 3];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (2 ^ 3);
        char[] cArray = new char[n];
        int n3 = --3;
        int cfr_ignored_0 = --4 << --3 ^ --5;
        int n4 = --4 << --3 ^ (2 ^ 3);
        int n5 = iIiIiIIIII2 = string3.length() - (2 ^ 3);
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
}

