/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.item.ItemStack
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIiIiII;
import com.github.mikumiku.addon.iiIiiiIiii;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiiIIIiiiI {
    public String IIiIiIIiii;
    public Map<String, Integer> iIIiiIiIiI;
    public iiIiiiIiii iiiiiIIiIi;
    public boolean iIIiIiiiIi;
    public final iiIiiiIiii iIiIiIIIII;
    public long ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public iiiIIIiiiI(iiIiiiIiii iiIiiiIiii2, iiIiiiIiii iiIiiiIiii3) {
        void iIiIiIIIII2;
        iiiIIIiiiI iIiIiIIIII3;
        iiiIIIiiiI iiiIIIiiiI2 = iiIiiiIiii4;
        iiIiiiIiii iiIiiiIiii4 = iiIiiiIiii3;
        iiiIIIiiiI iiiIIIiiiI3 = iIiIiIIIII3 = iiiIIIiiiI2;
        iiiIIIiiiI iiiIIIiiiI4 = iIiIiIIIII3;
        iiiIIIiiiI4.iiiiiIIiIi = null;
        iiiIIIiiiI iiiIIIiiiI5 = iIiIiIIIII3;
        iiiIIIiiiI4.iIIiiIiIiI = new HashMap<String, Integer>();
        iiiIIIiiiI4.iIiIiIIIII = iIiIiIIIII2;
        iiiIIIiiiI iiiIIIiiiI6 = iIiIiIIIII3;
        iiiIIIiiiI4.iIIiiIiIiI = new HashMap<String, Integer>();
        iiiIIIiiiI6.ALLATORIxDEMO = System.currentTimeMillis();
        iiiIIIiiiI3.iIIiIiiiIi = 3 & 5;
        iiiIIIiiiI3.iiiiiIIiIi = iiIiiiIiii4;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public int ALLATORIxDEMO() {
        iiiIIIiiiI iiiIIIiiiI2;
        iiiIIIiiiI iiiIIIiiiI3 = this;
        if (iiiIIIiiiI3.iIiIiIIIII.ALLATORIxDEMO) {
            this = 0x7D93 & 0xFEC;
            iiiIIIiiiI2 = iiiIIIiiiI3;
        } else {
            this = 1728;
            iiiIIIiiiI2 = iiiIIIiiiI3;
        }
        if (iiiIIIiiiI2.iIIiIiiiIi) {
            return this;
        }
        int n = iiiIIIiiiI3.iIIiiIiIiI.values().stream().mapToInt(Integer::intValue).sum();
        return Math.max(3 >> 2, this - n);
    }

    public iiiIIIiiiI(String string) {
        iiiIIIiiiI iIiIiIIIII2;
        iiiIIIiiiI iiiIIIiiiI2 = string2;
        String string2 = string;
        iiiIIIiiiI iiiIIIiiiI3 = iIiIiIIIII2 = iiiIIIiiiI2;
        iiiIIIiiiI iiiIIIiiiI4 = iIiIiIIIII2;
        iiiIIIiiiI4.iiiiiIIiIi = null;
        iiiIIIiiiI iiiIIIiiiI5 = iIiIiIIIII2;
        iiiIIIiiiI4.iIIiiIiIiI = new HashMap<String, Integer>();
        iiiIIIiiiI4.iIiIiIIIII = iiIiiiIiii.ALLATORIxDEMO(string2);
        iiiIIIiiiI iiiIIIiiiI6 = iIiIiIIIII2;
        iiiIIIiiiI3.iIIiiIiIiI = new HashMap<String, Integer>();
        iiiIIIiiiI6.ALLATORIxDEMO = System.currentTimeMillis();
        iiiIIIiiiI3.iIIiIiiiIi = 2 ^ 3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public String toString() {
        iiiIIIiiiI iiiIIIiiiI2 = this;
        return "ChestInfo{location=" + String.valueOf(this.iIiIiIIIII) + ", dedicatedItemType='" + iiiIIIiiiI2.IIiIiIIiii + "', isEmpty=" + iiiIIIiiiI2.iIIiIiiiIi + ", itemCounts=" + String.valueOf(this.iIIiiIiIiI) + "}";
    }

    /*
     * WARNING - void declaration
     */
    public iiiIIIiiiI(iiIiiiIiii object) {
        void iIiIiIIIII2;
        iiiIIIiiiI iiiIIIiiiI2 = object2;
        Object object2 = object;
        object = iiiIIIiiiI2;
        void v1 = iIiIiIIIII2;
        void v2 = iIiIiIIIII2;
        v2.iiiiiIIiIi = null;
        void v3 = iIiIiIIIII2;
        v2.iIIiiIiIiI = new HashMap<String, Integer>();
        v2.iIiIiIIIII = object2;
        void v4 = iIiIiIIIII2;
        v1.iIIiiIiIiI = new HashMap<String, Integer>();
        v1.ALLATORIxDEMO = System.currentTimeMillis();
        v1.iIIiIiiiIi = 2 ^ 3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[5 >> 2];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = --1;
        int n2 = string2.length();
        int n3 = n2 - (5 >> 2);
        char[] cArray = new char[n2];
        int n4 = --5 << --3 ^ 3 & 5;
        int cfr_ignored_0 = (1 ^ 3 ^ --5) << --4;
        int n5 = (1 ^ 3 ^ --5) << --4 ^ n << n;
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

    public boolean ALLATORIxDEMO(String string) {
        iiiIIIiiiI iiiIIIiiiI2 = string2;
        String string2 = string;
        iiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        if (iIiIiIIIII2.iIIiIiiiIi || Objects.equals(iIiIiIIIII2.IIiIiIIiii, string2)) {
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(class_1707 class_17072, IiIiIiIiII iiIiIiIiII) {
        int n;
        void iIiIiIIIII2;
        iiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        iiiIIIiiiI2.iIIiiIiIiI.clear();
        iiiIIIiiiI2.iIIiIiiiIi = 4 ^ 5;
        int n2 = 0x7E & 0x1B;
        if (iIiIiIIIII2.method_7629().method_5439() > (0x3F & 0x7E)) {
            n2 = 0x75 & 0x3F;
        }
        int n3 = n = 0;
        while (n3 <= n2) {
            iiiIIIiiiI iiiIIIiiiI3 = iIiIiIIIII2.method_7629().method_5438(n);
            if (iiiIIIiiiI3 != null && !iiiIIIiiiI3.method_7960()) {
                void iIiIiIIIII3;
                String string;
                iiiIIIiiiI2.iIIiIiiiIi = 3 >> 2;
                String string2 = string = iIiIiIIIII3.iiiIiIiiIi((class_1799)iiiIIIiiiI3);
                iiiIIIiiiI2.iIIiiIiIiI.put(string2, iiiIIIiiiI2.iIIiiIiIiI.getOrDefault(string2, 3 ^ 3) + iiiIIIiiiI3.method_7947());
            }
            n3 = ++n;
        }
        if (iiiIIIiiiI2.iIIiIiiiIi) {
            iiiIIIiiiI2.IIiIiIIiii = null;
            v2 = iiiIIIiiiI2;
        } else if (iiiIIIiiiI2.iIIiiIiIiI.size() == (3 & 5)) {
            iiiIIIiiiI2.IIiIiIIiii = iiiIIIiiiI2.iIIiiIiIiI.keySet().iterator().next();
            v2 = iiiIIIiiiI2;
        } else {
            iiiIIIiiiI2.IIiIiIIiii = iiiIIIiiiI2.iIIiiIiIiI.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
            v2 = iiiIIIiiiI2;
        }
        v2.ALLATORIxDEMO = System.currentTimeMillis();
    }
}

