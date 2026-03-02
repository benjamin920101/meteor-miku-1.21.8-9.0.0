/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1787
 *  net.minecraft.class_1799
 *  net.minecraft.class_2350
 *  net.minecraft.class_243
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiIIiIIiI;
import com.github.mikumiku.addon.IiiIIiiiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import java.util.Date;
import java.util.Iterator;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1787;
import net.minecraft.class_1799;
import net.minecraft.class_2350;
import net.minecraft.class_243;

public class IiIiIiiiii
extends iIiIiIIIii {
    private int iIiIIiIIIi;
    private final SettingGroup IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private int iIiIiiiiII;
    private final SettingGroup IIIIiiIiii;
    private final Setting<Integer> IiiIiIiiIi;
    private class_1657 IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private boolean iiiiiIIiIi;
    private final Setting<Integer> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private final Setting<Double> ALLATORIxDEMO;

    public void onDeactivate() {
        IiIiIiiiii iiIiIiiiii = this;
        this.iIiIIiIIIi = 3 & 4;
        this.iIiIiiiiII = 2 & 5;
        iiIiIiiiii.iiiiiIIiIi = this.iIiIiiiiII;
        iiIiIiiiii.IIiIiIIiii = null;
        IiIiIIiiii.iiIIiIIiii(IiiIIiIIiI.ALLATORIxDEMO("\u9c0e\u7aaa\u7cb8\u816d\u6a53\u5702\u5d80\u5009\u6b10"));
    }

    private /* synthetic */ class_1657 ALLATORIxDEMO() {
        IiIiIiiiii iiIiIiiiii = iterator;
        class_1657 class_16572 = null;
        double d = Double.MAX_VALUE;
        Iterator iterator = iiIiIiiiii.iIIiiIiIiI.field_1687.method_18456().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                double d2;
                class_1657 class_16573 = (class_1657)iterator.next();
                if (class_16573.equals((Object)iiIiIiiiii.iIIiiIiIiI.field_1724)) {
                    iterator2 = iterator;
                    continue;
                }
                if (!iiIiIiiiii.ALLATORIxDEMO(class_16573)) {
                    iterator2 = iterator;
                    continue;
                }
                double d3 = iiIiIiiiii.iIIiiIiIiI.field_1724.method_5739((class_1297)class_16573);
                if (!(d2 <= (double)((Integer)iiIiIiiiii.iIIiIiiiIi.get()).intValue()) || !(d3 < d)) continue block0;
                d = d3;
                class_16572 = class_16573;
                continue block0;
            }
            break;
        }
        return class_16572;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_243 class_2432) {
        void iIiIiIIIII2;
        IiIiIiiiii iiIiIiiiii;
        IiIiIiiiii iiIiIiiiii2 = iiIiIiiiii = object;
        iiIiIiiiii2.ALLATORIxDEMO();
        Object object = iiIiIiiiii2.iIIiiIiIiI.field_1724.method_33571();
        iIiIiIIIII2.method_1020((class_243)object).method_1029();
        object = iiIiIiiiii2.ALLATORIxDEMO((class_243)object, (class_243)iIiIiIIIII2);
        iiIiIiiiii2.iIIiiIiIiI.field_1724.method_36456((float)object[2 & 5]);
        iiIiIiiiii2.iIIiiIiIiI.field_1724.method_36457((float)object[--1]);
        iiIiIiiiii2.iIIiiIiIiI.field_1761.method_2910(iiIiIiiiii.iIIiiIiIiI.field_1724.method_24515(), class_2350.field_11036);
        iiIiIiiiii.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
        Object[] objectArray = new Object[--3];
        objectArray[3 & 4] = iIiIiIIIII2.field_1352;
        objectArray[3 & 5] = iIiIiIIIII2.field_1351;
        objectArray[1 ^ 3] = iIiIiIIIII2.field_1350;
        iiIiIiiiii2.info("\u4e22\u9493\u9c7c\u7aff\u5411\u76ee\u6807: " + String.format(IiiIIiIIiI.ALLATORIxDEMO("}W[c3^Uw{C3^uW{C3["), objectArray), new Object[5 >> 3]);
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_1657 class_16572) {
        IiIiIiiiii iiIiIiiiii = iiIiIiiiii2;
        IiIiIiiiii iiIiIiiiii2 = class_16572;
        IiIiIiiiii iIiIiIIIII2 = iiIiIiiiii;
        return Friends.get().isFriend((class_1657)iiIiIiiiii2);
    }

    public IiIiIiiiii() {
        IiIiIiiiii iiIiIiiiii = this;
        super((Category)iIIiIiiiIi, IiiIIiIIiI.ALLATORIxDEMO("\u9c29\u7a8d\u7c9f\u814a"), IiiIIiiiiI.ALLATORIxDEMO("\u4f22\u757e\u9c21\u7aa9\u4e7f\u651a\u4ee7\u816e\u4e57"));
        iiIiIiiiii.IIIIiiIiii = iiIiIiiiii.settings.getDefaultGroup();
        iiIiIiiiii.IIiIiiiiII = iiIiIiiiii.settings.createGroup(IiiIIiIIiI.ALLATORIxDEMO("\u76bb\u6875\u8beb\u7f1c"));
        iiIiIiiiii.iIIiIiiiIi = iiIiIiiiii.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u6896\u6d16\u8355\u56a9"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u6892\u6d1e\u653e\u4eef\u76f6\u8356\u5686\uff5d\u65cb\u5702\uff7b"))).defaultValue((Object)(0x1E & 0x67))).min(2 ^ 3).max(0x4D64 & 0x339B).sliderMin(4 ^ 5).sliderMax(0xFFB & 0x7084).build());
        this.iIIiiIiIiI = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u4e74\u94ce\u5ea0\u8f82"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u4e50\u94e6\u9c2e\u7aaa\u76f6\u5ea3\u8fad\uff5d\u0006<\u0011>\uff7b"))).defaultValue((Object)(5 >> 2))).min(3 ^ 3).max(0x5C & 0x37).sliderMin(3 & 4).sliderMax(0x76 & 0x1D).build());
        this.IIiiIIIIIi = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u81bc\u52f5\u919b\u65ed\u4e74\u94ce"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u94c6\u5242\u4eef\u547c\u81bf\u52da\u9198\u65c2\u4e77\u94e1"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiIiIiiIi = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u919b\u65ed\u4e74\u94ce\u5ea0\u8f82"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u94e1\u5245\u4ee8\u545b\u91bf\u65c5\u4e70\u94c6\u76f6\u5ea3\u8fad\uff5d\u0006<\u0011>\uff7b"))).defaultValue((Object)(0x3B & 0x4E))).min(5 >> 3).max(0x2B & 0x7C).sliderMin(2 & 5).sliderMax(0x2A & 0x7D).build());
        this.iIiIiIIIII = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u7c9c\u5f59\u73ff\u5beb"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u667a\u5454\u94dd\u5b8b\u73fc\u5bc4"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIiiiIiIii = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u7c9c\u5f59\u9649\u5396"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u667a\u5454\u94dd\u5b8b\u964a\u53b9"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.ALLATORIxDEMO = this.IIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u5962\u90b5\u9a8e\u5efb\u5019\u79a6"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u94fa\u5bac\u5946\u90bd\u76f6\u9a8d\u5ed4\u501a\u7989"))).defaultValue(1.6).min(0.0).max(3.0).sliderMin(0.0).sliderMax(3.0).build());
        IiIiIiiiii iiIiIiiiii2 = this;
        this.iIiIIiIIIi = 3 & 4;
        this.iIiIiiiiII = 2 & 5;
        iiIiIiiiii2.iiiiiIIiIi = this.iIiIiiiiII;
        iiIiIiiiii2.IIiIiIIiii = null;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIIiiiiI.ALLATORIxDEMO("\u00016t{\u0005\u0018v(\u0006\u00197)\u0013\\v\u8baa\u66a2\u65ed\u5266\u675d\u65e6\u7215\u677a\uff5c"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiIiiiiIii.ALLATORIxDEMO(IiIiiiiIii.ALLATORIxDEMO((class_1799 iIiIiIIIII2) -> iIiIiIIIII2.method_7909() instanceof class_1787));
    }

    public String ALLATORIxDEMO() {
        if (this.IIiIiIIiii != null) {
            IiIiIiiiii iiIiIiiiii = this;
            double d = this.iIIiiIiIiI.field_1724.method_5739((class_1297)iiIiIiiiii.IIiIiIIiii);
            Object[] objectArray = new Object[--1];
            objectArray[3 >> 2] = d;
            return "\u76ee\u6807: " + iiIiIiiiii.IIiIiIIiii.method_5477().getString() + " | \u8ddd\u79bb: " + String.format(IiiIIiiiiI.ALLATORIxDEMO("ssg;"), objectArray);
        }
        return IiiIIiIIiI.ALLATORIxDEMO("\u6449\u7d50\u4e78\\{\\");
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1657 class_16572) {
        IiIiIiiiii iiIiIiiiii = iiIiIiiiii2;
        IiIiIiiiii iiIiIiiiii2 = class_16572;
        IiIiIiiiii iIiIiIIIII2 = iiIiIiiiii;
        if (iiIiIiiiii2.method_68878()) {
            return (3 ^ 3) != 0;
        }
        if (iiIiIiiiii2.method_29504()) {
            return (3 & 4) != 0;
        }
        if (iIiIiIIIII2.iiiIiIiiIi((class_1657)iiIiIiiiii2)) {
            return (Boolean)iIiIiIIIII2.iIiiiIiIii.get();
        }
        return (Boolean)iIiIiIIIII2.iIiIiIIIII.get();
    }

    private /* synthetic */ class_243 ALLATORIxDEMO(class_1657 class_16572) {
        IiIiIiiiii iiIiIiiiii = iiIiIiiiii2;
        IiIiIiiiii iiIiIiiiii2 = class_16572;
        IiIiIiiiii iIiIiIIIII2 = iiIiIiiiii;
        return iiIiIiiiii2.method_19538().method_1031(0.0, ((Double)iIiIiIIIII2.ALLATORIxDEMO.get()).doubleValue(), 0.0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ float[] ALLATORIxDEMO(class_243 class_2432, class_243 class_2433) {
        void iIiIiIIIII22;
        IiIiIiiiii iiIiIiiiii = iiIiIiiiii2;
        IiIiIiiiii iiIiIiiiii2 = class_2432;
        IiIiIiiiii iIiIiIIIII3 = iiIiIiiiii;
        void v1 = iIiIiIIIII22;
        double d = v1.field_1352 - ((class_243)iiIiIiiiii2).field_1352;
        double d2 = v1.field_1351 - ((class_243)iiIiIiiiii2).field_1351;
        double d3 = v1.field_1350 - ((class_243)iiIiIiiiii2).field_1350;
        double d4 = d;
        double d5 = d3;
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        float this2 = (float)Math.toDegrees(Math.atan2(d3, d)) - 90.0f;
        float iIiIiIIIII22 = (float)(-Math.toDegrees(Math.atan2(d2, d6)));
        float[] fArray = new float[5 >> 1];
        fArray[3 >> 2] = this2;
        fArray[--1] = iIiIiIIIII22;
        return fArray;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiIiIiiiii iiIiIiiiii = iiIiIiiiii2;
        IiIiIiiiii iiIiIiiiii2 = pre;
        IiIiIiiiii iIiIiIIIII2 = iiIiIiiiii;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (!iIiIiIIIII2.ALLATORIxDEMO()) {
            iIiIiIIIII2.warning(IiiIIiiiiI.ALLATORIxDEMO("\u809a\u5358\u4e7b\u6cfc\u675f\u9c21\u7aa9\uff5c"), new Object[3 ^ 3]);
            iIiIiIIIII2.toggle();
            return;
        }
        if (iIiIiIIIII2.iIiIiiiiII > 0) {
            iIiIiIIIII2.iIiIiiiiII -= 3 & 5;
            return;
        }
        if (iIiIiIIIII2.iIiIIiIIIi > 0) {
            iIiIiIIIII2.iIiIIiIIIi -= --1;
            return;
        }
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724.field_7513 != null) {
            iIiIiIIIII2.iiiiiIIiIi = 2 ^ 3;
            return;
        }
        iIiIiIIIII2.iiiiiIIiIi = 2 & 5;
        iiIiIiiiii2 = iIiIiIIIII2.ALLATORIxDEMO();
        if (iiIiIiiiii2 != null) {
            if (iIiIiIIIII2.IIiIiIIiii == null || !iIiIiIIIII2.IIiIiIIiii.equals((Object)iiIiIiiiii2)) {
                iIiIiIIIII2.IIiIiIIiii = iiIiIiiiii2;
                iIiIiIIIII2.info("\u9009\u4e2d\u76ee\u6807: " + iIiIiIIIII2.IIiIiIIiii.method_5477().getString(), new Object[3 >> 2]);
            }
            IiIiIiiiii iiIiIiiiii3 = iIiIiIIIII2;
            iiIiIiiiii3.ALLATORIxDEMO(iiIiIiiiii3.ALLATORIxDEMO((class_1657)iiIiIiiiii2));
            iiIiIiiiii3.iIiIIiIIIi = (Integer)iiIiIiiiii3.iIIiiIiIiI.get();
            if (((Boolean)iIiIiIIIII2.IIiiIIIIIi.get()).booleanValue()) {
                iIiIiIIIII2.iIiIiiiiII = (Integer)iIiIiIIIII2.IiiIiIiiIi.get();
                return;
            }
        } else if (iIiIiIIIII2.IIiIiIIiii != null) {
            iIiIiIIIII2.IIiIiIIiii = null;
        }
    }

    @Override
    public void onActivate() {
        IiIiIiiiii iiIiIiiiii = this;
        super.onActivate();
        this.iIiIIiIIIi = 3 ^ 3;
        this.iIiIiiiiII = 3 >> 2;
        iiIiIiiiii.iiiiiIIiIi = this.iIiIiiiiII;
        iiIiIiiiii.IIiIiIIiii = null;
        IiIiIIiiii.iiIIiIIiii(IiiIIiIIiI.ALLATORIxDEMO("\u9c0e\u7aaa\u7cb8\u816d\u6a53\u5702\u5d80\u547a\u52da"));
        IiIiIIiiii.iiIIiIIiii(IiiIIiiiiI.ALLATORIxDEMO("\u6b3e\u575e\u6461\u7d74\u835e\u56a2\u51d8\u76d2\u76b3\u6851sxs"));
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        IiIiIiiiii iiIiIiiiii = this;
        int n = this = 5 >> 3;
        while (n < iiIiIiiiii.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            class_1799 class_17992 = iiIiIiiiii.iIIiiIiIiI.field_1724.method_31548().method_5438(this);
            if (!class_17992.method_7960() && class_17992.method_7909() instanceof class_1787) {
                return (2 ^ 3) != 0;
            }
            n = ++this;
        }
        return false;
    }
}

