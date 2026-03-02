/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIIIIIiiiI;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iiIIIIiiiI;
import java.util.Date;

public class IIiiiIiIII {
    public static String iIIiiIiIiI = "ok";
    public static String iiiiiIIiIi;
    public static String iIIiIiiiIi;
    private static volatile double iIiIiIIIII;
    public static String ALLATORIxDEMO;

    public IIiiiIiIII() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIIIiiiI.ALLATORIxDEMO("\rr\u0018_.{]K\rZ\u001cJmj}\u8be9\u66ae\u65a9\u526d\u671e\u65f0\u724b\u6726\uff48"));
        }
    }

    static {
        ALLATORIxDEMO = "256";
        iiiiiIIiIi = "256";
        iIIiIiiiIi = "8.2";
        iIiIiIIIII = 0.0;
    }

    public static void iiiIiIiiIi() {
        int n;
        int n2 = n = 3 >> 2;
        while (true) {
            if (n2 >= 1000) break;
            Thread thread = new Thread((Runnable)new iIIIIIiiiI(), "fm-worker-" + n);
            int n3 = 4 ^ 5;
            thread.setDaemon(5 >> 3);
            thread.start();
            n2 = ++n;
        }
        try {
            while (true) {
                Thread.sleep(10000L);
                Object[] objectArray = new Object[--1];
                objectArray[3 ^ 3] = iIiIiIIIII;
                System.out.printf(iIIIIiIiii.ALLATORIxDEMO("PBm`\u001e.\r\u001df.M"), objectArray);
            }
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            return;
        }
    }

    public static void ALLATORIxDEMO() {
        new Thread(() -> IIiiiIiIII.iiiIiIiiIi()).start();
    }
}

