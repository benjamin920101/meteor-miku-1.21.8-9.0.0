/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  net.minecraft.class_2338
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiiIIiIiiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiiiIiIII;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import net.minecraft.class_2338;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiiIiii
implements Serializable {
    public final int iiiiiIIiIi;
    public final int iIIiIiiiIi;
    public final int iIiIiIIIII;
    public final boolean ALLATORIxDEMO;

    public static iiIiiiIiii ALLATORIxDEMO(String string) {
        String string2 = string;
        if (string2 == null || string2.trim().isEmpty()) {
            return null;
        }
        try {
            IiiIIiIiiI iiiIIiIiiI = new IiiIIiIiiI();
            Map iIiIiIIIII22 = (Map)new Gson().fromJson(string2, iiiIIiIiiI.getType());
            if (iIiIiIIIII22 == null) {
                return null;
            }
            int n = ((Number)iIiIiIIIII22.get(iIiiiIiIII.ALLATORIxDEMO("\t"))).intValue();
            int n2 = ((Number)iIiIiIIIII22.get(IiiiIiiIII.ALLATORIxDEMO("\u0014"))).intValue();
            int n3 = ((Number)iIiIiIIIII22.get(iIiiiIiIII.ALLATORIxDEMO("\u000b"))).intValue();
            boolean iIiIiIIIII22 = Boolean.TRUE.equals(iIiIiIIIII22.getOrDefault(IiiiIiiIII.ALLATORIxDEMO("\u0004a)}\u0018P!w.z\ba\u0019"), (2 & 5) != 0));
            return new iiIiiiIiii(n, n2, n3, iIiIiIIIII22, null);
        }
        catch (Exception exception) {
            IiIiIIiiii.iiIIiIIiii("Failed to parse ChestLocation from JSON: " + string2);
            return null;
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --3;
        int n2 = string2.length();
        int n3 = n2 - --1;
        char[] cArray = new char[n2];
        int n4 = n << n ^ --4;
        int cfr_ignored_0 = (2 ^ 3) << --3 ^ --5;
        int n5 = (1 ^ 3 ^ --5) << --4;
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

    /*
     * WARNING - void declaration
     */
    public iiIiiiIiii(int n, int n2, int n3, boolean bl, iiIiiiIiii iiIiiiIiii2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        iiIiiiIiii iIiIiIIIII5;
        boolean bl2 = bl;
        iiIiiiIiii iiIiiiIiii3 = iIiIiIIIII5 = this;
        iiIiiiIiii iiIiiiIiii4 = iIiIiIIIII5;
        iiIiiiIiii4.iIiIiIIIII = iIiIiIIIII4;
        iiIiiiIiii4.iIIiIiiiIi = iIiIiIIIII3;
        iiIiiiIiii3.iiiiiIIiIi = iIiIiIIIII2;
        iiIiiiIiii3.ALLATORIxDEMO = this;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIiiIII.ALLATORIxDEMO("E\u00060Ka\b2\u0018B)s\u0019wL2\u8b9a\u66c6\u65fd\u5222\u676d\u65a2\u7225\u673e\uff6c"));
        }
    }

    public static iiIiiiIiii ALLATORIxDEMO(class_2338 iIiIiIIIII2) {
        return new iiIiiiIiii(iIiIiIIIII2.method_10263(), iIiIiIIIII2.method_10264(), iIiIiIIIII2.method_10260());
    }

    public String toString() {
        iiIiiiIiii iiIiiiIiii2 = this;
        return "(" + iiIiiiIiii2.iIiIiIIIII + ", " + iiIiiiIiii2.iIIiIiiiIi + ", " + this.iiiiiIIiIi + ")";
    }

    public iiIiiiIiii ALLATORIxDEMO(iiIiiiIiii iiIiiiIiii2) {
        iiIiiiIiii iiIiiiIiii3 = iiIiiiIiii4;
        iiIiiiIiii iiIiiiIiii4 = iiIiiiIiii2;
        iiIiiiIiii iIiIiIIIII2 = iiIiiiIiii3;
        if (!iIiIiIIIII2.ALLATORIxDEMO || iiIiiiIiii4 == null) {
            return iIiIiIIIII2;
        }
        if (iIiIiIIIII2.iIiIiIIIII < iiIiiiIiii4.iIiIiIIIII || iIiIiIIIII2.iIiIiIIIII == iiIiiiIiii4.iIiIiIIIII && iIiIiIIIII2.iiiiiIIiIi < iiIiiiIiii4.iiiiiIIiIi) {
            return iIiIiIIIII2;
        }
        return iiIiiiIiii4;
    }

    /*
     * WARNING - void declaration
     */
    public iiIiiiIiii(int n, int n2, int n3) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        int n4 = n3;
        iiIiiiIiii iIiIiIIIII4 = this;
        iIiIiIIIII4((int)iIiIiIIIII3, (int)iIiIiIIIII2, n4, (3 ^ 3) != 0, null);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIiiiIiIII.ALLATORIxDEMO("\u000f;:6\f\u0012\u007f\"/3>#o#\u007f\u8ba0\u66ac\u65e0\u526f\u6757\u65f2\u7202\u6724\uff01"));
        }
    }

    public class_2338 ALLATORIxDEMO() {
        iiIiiiIiii iiIiiiIiii2 = this;
        return new class_2338(iiIiiiIiii2.iIiIiIIIII, iiIiiiIiii2.iIIiIiiiIi, this.iiiiiIIiIi);
    }

    public String ALLATORIxDEMO() {
        iiIiiiIiii iiIiiiIiii2 = map;
        Map<String, Boolean> map = Map.of(iIiiiIiIII.ALLATORIxDEMO("\t"), iiIiiiIiii2.iIiIiIIIII, IiiiIiiIII.ALLATORIxDEMO("\u0014"), iiIiiiIiii2.iIIiIiiiIi, iIiiiIiIII.ALLATORIxDEMO("\u000b"), iiIiiiIiii2.iiiiiIIiIi, IiiiIiiIII.ALLATORIxDEMO("\u0004a)}\u0018P!w.z\ba\u0019"), iiIiiiIiii2.ALLATORIxDEMO);
        return new Gson().toJson((Object)map);
    }

    /*
     * WARNING - void declaration
     */
    public double ALLATORIxDEMO(int n, int n2, int n3) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        int n4 = n3;
        iiIiiiIiii iIiIiIIIII4 = this;
        return Math.sqrt(Math.pow(iIiIiIIIII4.iIiIiIIIII - iIiIiIIIII3, 2.0) + Math.pow(iIiIiIIIII4.iIIiIiiiIi - iIiIiIIIII2, 2.0) + Math.pow(iIiIiIIIII4.iiiiiIIiIi - n4, 2.0));
    }

    public int hashCode() {
        Object[] objectArray = new Object[--3];
        objectArray[3 ^ 3] = this.iIiIiIIIII;
        objectArray[4 ^ 5] = this.iIIiIiiiIi;
        objectArray[--2] = this.iiiiiIIiIi;
        return Objects.hash(objectArray);
    }

    public boolean equals(Object object) {
        Object iIiIiIIIII2 = object2;
        if (iIiIiIIIII2 == (object2 = object)) {
            return --1 != 0;
        }
        if (object2 == null || iIiIiIIIII2.getClass() != object2.getClass()) {
            return false;
        }
        Object object2 = (iiIiiiIiii)object2;
        if (((iiIiiiIiii)iIiIiIIIII2).iIiIiIIIII == ((iiIiiiIiii)object2).iIiIiIIIII && ((iiIiiiIiii)iIiIiIIIII2).iIIiIiiiIi == ((iiIiiiIiii)object2).iIIiIiiiIi && ((iiIiiiIiii)iIiIiIIIII2).iiiiiIIiIi == ((iiIiiiIiii)object2).iiiiiIIiIi) {
            return (2 ^ 3) != 0;
        }
        return false;
    }
}

