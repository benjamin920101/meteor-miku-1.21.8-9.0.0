/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  net.minecraft.class_2596
 *  net.minecraft.class_310
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.Date;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.player.Rotations;
import net.minecraft.class_2596;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIIIiiiI {
    public class_310 iiiiiIIiIi = class_310.method_1551();
    private static volatile iiIIIIiiiI iIIiIiiiIi;
    public IiIIiIIiiI iIiIiIIIII;
    public IiIiiiIIIi ALLATORIxDEMO = null;

    public void ALLATORIxDEMO() {
        this.iiiiiIIiIi.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO(this.iiiiiIIiIi.field_1724.method_23317(), this.iiiiiIIiIi.field_1724.method_23318(), this.iiiiiIIiIi.field_1724.method_23321(), this.iiiiiIIiIi.field_1724.method_36454(), this.iiiiiIIiIi.field_1724.method_36455(), this.iiiiiIIiIi.field_1724.method_24828()));
        this.ALLATORIxDEMO = null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean ALLATORIxDEMO(IiIiiiIIIi object) {
        void iIiIiIIIII2;
        iiIIIIiiiI iiIIIIiiiI2 = object2;
        Object object2 = object;
        object = iiIIIIiiiI2;
        iIiIiIIIII2.ALLATORIxDEMO = object2;
        iIiIiIIIII2.iIiIiIIIII.ALLATORIxDEMO();
        iIiIiIIIII2.iiiiiIIiIi.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO(iIiIiIIIII2.iiiiiIIiIi.field_1724.method_23317(), iIiIiIIIII2.iiiiiIIiIi.field_1724.method_23318(), iIiIiIIIII2.iiiiiIIiIi.field_1724.method_23321(), ((IiIiiiIIIi)object2).ALLATORIxDEMO(), ((IiIiiiIIIi)object2).iiiIiIiiIi(), iIiIiIIIII2.iiiiiIIiIi.field_1724.method_24828()));
        Rotations.setCamRotation((double)((IiIiiiIIIi)object2).ALLATORIxDEMO(), (double)((IiIiiiIIIi)object2).iiiIiIiiIi());
        return 5 >> 2;
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - --1;
        char[] cArray = new char[n];
        int n3 = (--3 ^ --5) << --3 ^ --4;
        int cfr_ignored_0 = --5 << --4 ^ (5 >> 1 ^ --5) << (4 ^ 5);
        int n4 = (1 ^ 3 ^ --5) << --4 ^ (--2 ^ --5);
        int n5 = iIiIiIIIII2 = string3.length() - (3 >> 1);
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static iiIIIIiiiI ALLATORIxDEMO() {
        if (iIIiIiiiIi != null) return iIIiIiiiIi;
        Class<iiIIIIiiiI> clazz = iiIIIIiiiI.class;
        synchronized (iiIIIIiiiI.class) {
            if (iIIiIiiiIi != null) return iIIiIiiiIi;
            iIIiIiiiIi = new iiIIIIiiiI();
            // ** MonitorExit[var0] (shouldn't be in output)
            return iIIiIiiiIi;
        }
    }

    private /* synthetic */ iiIIIIiiiI() {
        iiIIIIiiiI iiIIIIiiiI2 = this;
        this.iIiIiIIIII = new IiIIiIIiiI();
        MeteorClient.EVENT_BUS.subscribe((Object)this);
        iiIIIIiiiI2.iiiiiIIiIi = class_310.method_1551();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

