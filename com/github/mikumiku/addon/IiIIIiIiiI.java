/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.block.DispenserBlock
 *  net.minecraft.block.DropperBlock
 *  net.minecraft.block.EnderChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.block.HopperBlock
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.block.BarrelBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiIIIiIIiI;
import com.github.mikumiku.addon.modules.sorter.ContainerSearcher;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.DropperBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.HopperBlock;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.block.BarrelBlock;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiIiiI {
    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(int n, int n2, int n3) {
        void iIiIiIIIII2;
        int iIiIiIIIII3 = n;
        int iIiIiIIIII4 = n3;
        if (IiIIIiIiiI.ALLATORIxDEMO(iIiIiIIIII3, (int)iIiIiIIIII2, iIiIiIIIII4) == ContainerSearcher.ContainerType.iIiIiIIIII) {
            return (3 & 4) != 0;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static ContainerSearcher.ContainerType ALLATORIxDEMO(int n, int n2, int n3) {
        void iIiIiIIIII2;
        int iIiIiIIIII3 = n;
        int iIiIiIIIII222 = n2;
        class_2680 iIiIiIIIII222 = class_310.method_1551().field_1687.method_8320(new class_2338(iIiIiIIIII3, iIiIiIIIII222, (int)iIiIiIIIII2));
        if (iIiIiIIIII222.method_26204() instanceof class_2281) {
            return ContainerSearcher.ContainerType.ALLATORIxDEMO;
        }
        if (iIiIiIIIII222.method_26204() instanceof class_2480) {
            return ContainerSearcher.ContainerType.iIiIiiiiII;
        }
        if (iIiIiIIIII222.method_26204() instanceof class_3708) {
            return ContainerSearcher.ContainerType.iIIiIiiiIi;
        }
        if (iIiIiIIIII222.method_26204() instanceof class_2336) {
            return ContainerSearcher.ContainerType.IIIIiiIiii;
        }
        if (iIiIiIIIII222.method_26204() instanceof class_2377) {
            return ContainerSearcher.ContainerType.iIIiiIiIiI;
        }
        if (iIiIiIIIII222.method_26204() instanceof class_2325) {
            return ContainerSearcher.ContainerType.IIiIiIIiii;
        }
        if (iIiIiIIIII222.method_26204() instanceof class_2315) {
            return ContainerSearcher.ContainerType.iiiiiIIiIi;
        }
        return ContainerSearcher.ContainerType.iIiIiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public static List<iiIIIiIIiI> ALLATORIxDEMO(int n, int n2, int n3, int n4) {
        int n5;
        void iIiIiIIIII2;
        int iIiIiIIIII3 = n4;
        int iIiIiIIIII4 = n;
        ArrayList<iiIIIiIIiI> arrayList = new ArrayList<iiIIIiIIiI>();
        void var5_5 = iIiIiIIIII2 - (2 ^ 3);
        iIiIiIIIII2 += --3;
        int n6 = n5 = -iIiIiIIIII3;
        while (n6 <= iIiIiIIIII3) {
            void v1 = var5_5;
            while (v1 <= iIiIiIIIII2) {
                void var7_7;
                int n7 = -iIiIiIIIII3;
                while (n7 <= iIiIiIIIII3) {
                    int n8;
                    void iIiIiIIIII5;
                    int n9 = iIiIiIIIII4 + n5;
                    void var10_10 = var7_7;
                    void var11_11 = iIiIiIIIII5 + n8;
                    ContainerSearcher.ContainerType containerType = IiIIIiIiiI.ALLATORIxDEMO(n9, (int)var10_10, (int)var11_11);
                    if (containerType == ContainerSearcher.ContainerType.ALLATORIxDEMO) {
                        arrayList.add(new iiIIIiIIiI(n9, (int)var10_10, (int)var11_11, containerType));
                    }
                    n7 = ++n8;
                }
                v1 = ++var7_7;
            }
            n6 = ++n5;
        }
        return arrayList;
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 >> 1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (5 >> 2);
        char[] cArray = new char[n];
        int n3 = --2 << --3 ^ --4;
        int cfr_ignored_0 = (5 >> 1 ^ --5) << --4 ^ 3 & 5;
        int n4 = --4 << --3 ^ --5;
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

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(iiIIIiIIiI iiIIIiIIiI2, int n, int n2, int n3) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        iiIIIiIIiI iiIIIiIIiI3 = iiIIIiIIiI2;
        int iIiIiIIIII5 = 3 & 4;
        iiIIIiIIiI iiIIIiIIiI4 = switch (iiIIIiIIiI3.iIIiIiiiIi.ordinal()) {
            case 1 -> {
                iIiIiIIIII5 += 100;
                yield iiIIIiIIiI3;
            }
            case 0 -> {
                iIiIiIIIII5 += 80;
                while (false) {
                }
                yield iiIIIiIIiI3;
            }
            case 2 -> {
                iIiIiIIIII5 += 70;
                yield iiIIIiIIiI3;
            }
            case 3 -> {
                iIiIiIIIII5 += 60;
                yield iiIIIiIIiI3;
            }
            case 4 -> {
                iIiIiIIIII5 += 40;
                yield iiIIIiIIiI3;
            }
            case 5, 6 -> {
                iIiIiIIIII5 += 20;
                yield iiIIIiIIiI3;
            }
            default -> {
                iIiIiIIIII5 += 10;
                yield iiIIIiIIiI3;
            }
        };
        double d = Math.sqrt(Math.pow(iiIIIiIIiI4.iIiIiIIIII - iIiIiIIIII4, 2.0) + Math.pow(iiIIIiIIiI3.ALLATORIxDEMO - iIiIiIIIII3, 2.0) + Math.pow(iiIIIiIIiI3.iiiiiIIiIi - iIiIiIIIII2, 2.0));
        return iIiIiIIIII5 -= (int)d;
    }

    public IiIIIiIiiI() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

