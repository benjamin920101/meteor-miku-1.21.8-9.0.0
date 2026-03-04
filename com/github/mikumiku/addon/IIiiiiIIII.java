/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtLong
 *  net.minecraft.nbt.NbtString
 *  net.minecraft.nbt.NbtElement
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIiIiII;
import com.github.mikumiku.addon.iiIiiiIiii;
import com.seedfinding.mccore.version.MCVersion;
import java.util.Date;
import java.util.Optional;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtLong;
import net.minecraft.nbt.NbtString;
import net.minecraft.nbt.NbtElement;

public class IIiiiiIIII {
    public final Long iIiIiIIIII;
    public final MCVersion ALLATORIxDEMO;

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(5 >> 3, stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - (5 >> 2);
        char[] cArray = new char[n];
        int n3 = --5 << --3 ^ --5;
        int cfr_ignored_0 = (--3 ^ --5) << --4 ^ --3;
        int n4 = --4 << --3 ^ 3 & 5;
        int n5 = iIiIiIIIII2 = string3.length() - (3 & 5);
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

    public static IIiiiiIIII ALLATORIxDEMO(class_2487 class_24872) {
        class_2487 class_24873;
        Object iIiIiIIIII2;
        class_2487 class_24874 = class_24872;
        Object object = class_24874.method_10558(iiIiiiIiii.ALLATORIxDEMO("O0K&P:W"));
        Optional optional = object;
        if (object instanceof Optional) {
            iIiIiIIIII2 = optional;
            object = (String)optional.get();
            class_24873 = class_24874;
        } else {
            object = (String)((Object)optional);
            class_24873 = class_24874;
        }
        Object object2 = iIiIiIIIII2 = class_24873.method_10537(IiIiIiIiII.iiiIiIiiIi("j2|3"));
        iIiIiIIIII2 = iIiIiIIIII2 instanceof Optional ? (Long)((Optional)object2).get() : (Long)object2;
        return new IIiiiiIIII((Long)iIiIiIIIII2, MCVersion.fromString((String)object));
    }

    public class_2487 ALLATORIxDEMO() {
        IIiiiiIIII iIiiiiIIII = this;
        IIiiiiIIII iIiiiiIIII2 = this = new class_2487();
        this.method_10566(iiIiiiIiii.ALLATORIxDEMO("&\\0]"), (class_2520)class_2503.method_23251((long)iIiiiiIIII.iIiIiIIIII));
        iIiiiiIIII2.method_10566(IiIiIiIiII.iiiIiIiiIi("!|%j>v9"), (class_2520)class_2519.method_23256((String)iIiiiiIIII.ALLATORIxDEMO.name));
        return iIiiiiIIII2;
    }

    /*
     * WARNING - void declaration
     */
    public IIiiiiIIII(Long l, MCVersion mCVersion) {
        void iIiIiIIIII2;
        IIiiiiIIII iIiiiiIIII = object;
        Object object = mCVersion;
        IIiiiiIIII iIiIiIIIII3 = iIiiiiIIII;
        iIiIiIIIII3.iIiIiIIIII = iIiIiIIIII2;
        if (object == null) {
            object = MCVersion.latest();
        }
        iIiIiIIIII3.ALLATORIxDEMO = object;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiIiIiII.iiiIiIiiIi("n\u001c\u001bQj29\"I\u0013X\u0003\\V\u0019\u8b80\u66ed\u65e7\u5229\u6757\u65a9\u721f\u6735\uff56"));
        }
    }
}

