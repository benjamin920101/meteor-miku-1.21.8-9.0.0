/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.hit.BlockHitResult
 */
package com.github.mikumiku.addon;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;

public class iiIIiiiIIi {
    public static double ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        class_2338 iIiIiIIIII2;
        class_2338 iIiIiIIIII3 = class_23383;
        class_2338 class_23384 = iIiIiIIIII2 = class_23382;
        double d = class_23384.method_10263() - iIiIiIIIII3.method_10263();
        double d2 = class_23384.method_10264() - iIiIiIIIII3.method_10264();
        double d3 = class_23384.method_10260() - iIiIiIIIII3.method_10260();
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        return class_3532.method_15355((float)((float)(d4 * d4 + d5 * d5 + d6 * d6)));
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(FindItemResult findItemResult, class_2338 class_23382) {
        void iIiIiIIIII2;
        FindItemResult findItemResult2 = findItemResult;
        boolean iIiIiIIIII3 = MeteorClient.mc.field_1724.method_5715();
        MeteorClient.mc.field_1724.method_5660((3 ^ 3) != 0);
        InvUtils.swap((int)findItemResult2.slot(), (boolean)(--1 != 0));
        MeteorClient.mc.field_1761.method_2896(MeteorClient.mc.field_1724, class_1268.field_5808, new class_3965(class_243.method_24953((class_2382)iIiIiIIIII2), class_2350.field_11036, (class_2338)iIiIiIIIII2, (2 & 5) != 0));
        MeteorClient.mc.field_1724.method_6104(class_1268.field_5808);
        InvUtils.swapBack();
        MeteorClient.mc.field_1724.method_5660(iIiIiIIIII3);
    }

    /*
     * WARNING - void declaration
     */
    public static List<class_2338> ALLATORIxDEMO(class_2338 class_23382, int n, int n2) {
        int n3;
        int iIiIiIIIII2 = n;
        class_2338 iIiIiIIIII3 = class_23382;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        int n4 = n3 = iIiIiIIIII3.method_10263() - iIiIiIIIII2;
        while (n4 < iIiIiIIIII3.method_10263() + iIiIiIIIII2) {
            void iIiIiIIIII4;
            int n5 = iIiIiIIIII3.method_10264() - iIiIiIIIII4;
            while (n5 < iIiIiIIIII3.method_10264() + iIiIiIIIII4) {
                int n6;
                int n7 = iIiIiIIIII3.method_10260() - iIiIiIIIII2;
                while (n7 < iIiIiIIIII3.method_10260() + iIiIiIIIII2) {
                    int n8;
                    class_2338 class_23383 = new class_2338(n3, n6, n8);
                    if (iiIIiiiIIi.ALLATORIxDEMO(iIiIiIIIII3, class_23383) <= (double)iIiIiIIIII2 && !arrayList.contains(class_23383)) {
                        arrayList.add(class_23383);
                    }
                    n7 = ++n8;
                }
                n5 = ++n6;
            }
            n4 = ++n3;
        }
        return arrayList;
    }

    public iiIIiiiIIi() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 >> 2, stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = --3;
        int n3 = string2.length();
        int n4 = n3 - --1;
        char[] cArray = new char[n3];
        int n5 = n2 << n2 ^ (1 ^ 3);
        int cfr_ignored_0 = --5 << --3 ^ (2 ^ 3);
        int n6 = n << n ^ --3 << --1;
        int n7 = iIiIiIIIII2 = string3.length() - (4 ^ 5);
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

    public static List<class_2338> ALLATORIxDEMO(double iIiIiIIIII2) {
        double d;
        class_243 class_2432 = class_310.method_1551().field_1724.method_33571();
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        double d2 = d = class_2432.method_10216() - iIiIiIIIII2;
        while (d2 < class_2432.method_10216() + iIiIiIIIII2) {
            double d3 = class_2432.method_10215() - iIiIiIIIII2;
            while (d3 < class_2432.method_10215() + iIiIiIIIII2) {
                double d4;
                double d5 = class_2432.method_10214() - iIiIiIIIII2;
                while (d5 < class_2432.method_10214() + iIiIiIIIII2) {
                    double d6;
                    class_2338 class_23382 = new class_2338(class_3532.method_15357((double)d), class_3532.method_15357((double)d6), class_3532.method_15357((double)d4));
                    if (!(class_23382.method_46558().method_1022(class_2432) > iIiIiIIIII2) && !arrayList.contains(class_23382)) {
                        arrayList.add(class_23382);
                    }
                    d5 = d6 + 1.0;
                }
                d3 = d4 + 1.0;
            }
            d2 = d + 1.0;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(class_2338 class_23382, FindItemResult findItemResult, boolean bl) {
        void iIiIiIIIII2;
        Object iIiIiIIIII3 = findItemResult;
        class_2338 iIiIiIIIII4 = class_23382;
        if (!iIiIiIIIII3.found()) {
            return 3 >> 2;
        }
        iIiIiIIIII3 = () -> iiIIiiiIIi.ALLATORIxDEMO((FindItemResult)iIiIiIIIII3, iIiIiIIIII4);
        if (iIiIiIIIII2 != false) {
            Rotations.rotate((double)Rotations.getYaw((class_2338)iIiIiIIIII4), (double)Rotations.getPitch((class_2338)iIiIiIIIII4), (int)(0xFFFFFF9E & 0xFFFFFFFD), (Runnable)iIiIiIIIII3);
        } else {
            iIiIiIIIII3.run();
        }
        return true;
    }
}

