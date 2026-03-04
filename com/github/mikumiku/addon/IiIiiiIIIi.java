/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import java.util.Date;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiiiIIIi {
    public int iiiiiIIiIi;
    public float iIIiIiiiIi;
    public int iIiIiIIIII;
    public float ALLATORIxDEMO;

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 >> 1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(3 & 4, stackTraceElement.getClassName()).toString();
        int n = --4;
        int n2 = string2.length();
        int n3 = n2 - (2 ^ 3);
        char[] cArray = new char[n2];
        int n4 = --5 << --3 ^ --5;
        int cfr_ignored_0 = n << n ^ --3 << (4 ^ 5);
        int n5 = --2 << --3 ^ --3;
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
    private /* synthetic */ float[] ALLATORIxDEMO(class_243 class_2432, class_243 class_2433) {
        void iIiIiIIIII22;
        IiIiiiIIIi iiIiiiIIIi = iiIiiiIIIi2;
        IiIiiiIIIi iiIiiiIIIi2 = class_2432;
        IiIiiiIIIi iIiIiIIIII3 = iiIiiiIIIi;
        void v1 = iIiIiIIIII22;
        double d = v1.field_1352 - ((class_243)iiIiiiIIIi2).field_1352;
        double d2 = v1.field_1351 - ((class_243)iiIiiiIIIi2).field_1351;
        double d3 = v1.field_1350 - ((class_243)iiIiiiIIIi2).field_1350;
        double d4 = d;
        double d5 = d3;
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        float this2 = (float)Math.toDegrees(Math.atan2(d3, d)) - 90.0f;
        float iIiIiIIIII22 = (float)(-Math.toDegrees(Math.atan2(d2, d6)));
        float[] fArray = new float[1 ^ 3];
        fArray[2 & 5] = class_3532.method_15393((float)this2);
        fArray[4 ^ 5] = class_3532.method_15393((float)iIiIiIIIII22);
        return fArray;
    }

    public int iiiIiIiiIi() {
        return this.iIiIiIIIII;
    }

    public void iiiIiIiiIi(float f) {
        float f2 = f;
        IiIiiiIIIi iIiIiIIIII2 = this;
        iIiIiIIIII2.iIIiIiiiIi = f2;
    }

    public float iiiIiIiiIi() {
        return this.iIIiIiiiIi;
    }

    /*
     * WARNING - void declaration
     */
    public IiIiiiIIIi(float f, float f2) {
        void iIiIiIIIII2;
        IiIiiiIIIi iIiIiIIIII3;
        float f3 = f2;
        IiIiiiIIIi iiIiiiIIIi = iIiIiIIIII3 = this;
        IiIiiiIIIi iiIiiiIIIi2 = iIiIiIIIII3;
        iiIiiiIIIi2.iiiiiIIiIi = 2 & 5;
        iiIiiiIIIi2.iIiIiIIIII = 0x65 & 0x7E;
        iiIiiiIIIi.ALLATORIxDEMO = iIiIiIIIII2;
        iiIiiiIIIi.iIIiIiiiIi = f3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public IiIiiiIIIi iiiIiIiiIi(int n) {
        int n2 = n;
        IiIiiiIIIi iIiIiIIIII2 = this;
        iIiIiIIIII2.iiiiiIIiIi = n2;
        return iIiIiIIIII2;
    }

    public int ALLATORIxDEMO() {
        return this.iiiiiIIiIi;
    }

    public IiIiiiIIIi ALLATORIxDEMO(int n) {
        int n2 = n;
        IiIiiiIIIi iIiIiIIIII2 = this;
        iIiIiIIIII2.iIiIiIIIII = n2;
        return iIiIiIIIII2;
    }

    public IiIiiiIIIi(class_243 class_2432) {
        class_310 class_3102;
        IiIiiiIIIi iIiIiIIIII2;
        IiIiiiIIIi iiIiiiIIIi = object;
        Object object = class_2432;
        IiIiiiIIIi iiIiiiIIIi2 = iIiIiIIIII2 = iiIiiiIIIi;
        iIiIiIIIII2.iiiiiIIiIi = 3 >> 2;
        iiIiiiIIIi2.iIiIiIIIII = 0x66 & 0x7D;
        class_310 class_3103 = class_3102 = class_310.method_1551();
        float[] fArray = iIiIiIIIII2.ALLATORIxDEMO(class_3102.field_1724.method_19538().method_1031(0.0, (double)class_3103.field_1724.method_18381(class_3103.field_1724.method_18376()), 0.0), (class_243)object);
        object = fArray;
        iiIiiiIIIi2.ALLATORIxDEMO = fArray[3 & 4];
        iiIiiiIIIi2.iIIiIiiiIi = (float)object[4 ^ 5];
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public void ALLATORIxDEMO(float f) {
        float f2 = f;
        IiIiiiIIIi iIiIiIIIII2 = this;
        iIiIiIIIII2.ALLATORIxDEMO = f2;
    }

    public float ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }
}

