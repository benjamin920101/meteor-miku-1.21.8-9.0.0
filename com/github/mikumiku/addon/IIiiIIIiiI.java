/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  fi.dy.masa.litematica.world.WorldSchematic
 *  net.minecraft.world.World
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.BlockState
 */
package com.github.mikumiku.addon;

import com.google.gson.Gson;
import fi.dy.masa.litematica.world.WorldSchematic;
import java.util.Date;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;

public class IIiiIIIiiI {
    public final class_1937 iIIiiIiIiI;
    public final WorldSchematic iiiiiIIiIi;
    public final class_2680 iIIiIiiiIi;
    public final class_2338 iIiIiIIIII;
    public final class_2680 ALLATORIxDEMO;

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (3 & 5);
        char[] cArray = new char[n];
        int n3 = (1 ^ 3 ^ --5) << --4 ^ --3;
        int cfr_ignored_0 = (1 ^ 3) << --3 ^ --3;
        int n4 = --4 << --3 ^ --3;
        int n5 = iIiIiIIIII2 = string3.length() - (5 >> 2);
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

    public IIiiIIIiiI ALLATORIxDEMO(class_2350 class_23502) {
        IIiiIIIiiI iIiIiIIIII2;
        IIiiIIIiiI iIiiIIIiiI = iIiiIIIiiI2;
        IIiiIIIiiI iIiiIIIiiI2 = class_23502;
        IIiiIIIiiI iIiiIIIiiI3 = iIiIiIIIII2 = iIiiIIIiiI;
        return new IIiiIIIiiI(iIiiIIIiiI3.iIIiiIiIiI, iIiiIIIiiI3.iiiiiIIiIi, iIiIiIIIII2.iIiIiIIIII.method_10093((class_2350)iIiiIIIiiI2));
    }

    public String toString() {
        return new Gson().toJson((Object)this);
    }

    /*
     * WARNING - void declaration
     */
    public IIiiIIIiiI(class_1937 class_19372, WorldSchematic worldSchematic, class_2338 class_23382) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IIiiIIIiiI iIiIiIIIII4;
        IIiiIIIiiI iIiiIIIiiI = iIiiIIIiiI2;
        IIiiIIIiiI iIiiIIIiiI2 = class_23382;
        IIiiIIIiiI iIiiIIIiiI3 = iIiIiIIIII4 = iIiiIIIiiI;
        IIiiIIIiiI iIiiIIIiiI4 = iIiIiIIIII4;
        iIiiIIIiiI4.iIIiiIiIiI = iIiIiIIIII3;
        iIiiIIIiiI4.iiiiiIIiIi = iIiIiIIIII2;
        iIiIiIIIII4.iIiIiIIIII = iIiiIIIiiI2;
        iIiiIIIiiI3.iIIiIiiiIi = iIiIiIIIII2.method_8320(iIiIiIIIII4.iIiIiIIIII);
        iIiiIIIiiI3.ALLATORIxDEMO = iIiIiIIIII3.method_8320((class_2338)iIiiIIIiiI2);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

