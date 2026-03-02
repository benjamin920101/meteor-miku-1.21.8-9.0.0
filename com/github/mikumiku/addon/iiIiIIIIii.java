/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 *  net.minecraft.class_243
 *  net.minecraft.class_2708
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_243;
import net.minecraft.class_2708;
import net.minecraft.class_310;
import net.minecraft.class_3532;

public class iiIiIIIIii
extends iIiIiIIIii {
    private class_243 iIIiIiiIiI;
    private final SettingGroup iIIIIIIiII;
    private class_2338 iIIiiIIIIi;
    private final Setting<Boolean> IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private int iIIIiiiiIi;
    private final Setting<Integer> iiiIiiIIII;
    private final Setting<SettingColor> iIiIIiIIIi;
    private final Setting<Double> IIiIiiiiII;
    private int IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<Double> iIiIiiiiII;
    private final Setting<Integer> IIIIiiIiii;
    private final Setting<Double> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private boolean iIIiiIiIiI;
    private final Setting<Double> iiiiiIIiIi;
    private boolean iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private final Setting<Double> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiIiIIIIii iiIiIIIIii2 = this2;
        if (iiIiIIIIii2.iIIiIiiIiI == null || iiIiIIIIii2.iIIiiIIIIi == null || iiIiIIIIii2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        class_243 class_2432 = new class_243(iiIiIIIIii2.iIIiIiiIiI.field_1352, (double)iiIiIIIIii2.iIIiiIIIIi.method_10264(), iiIiIIIIii2.iIIiIiiIiI.field_1350);
        if (((Boolean)iiIiIIIIii2.IIiIiIIiii.get()).booleanValue()) {
            double d;
            double d2 = 0.01;
            double d3 = d = 0.0;
            while (d3 < (Double)iiIiIIIIii2.ALLATORIxDEMO.get()) {
                int n = (int)Math.min((double)(((SettingColor)iiIiIIIIii2.iIiIIiIIIi.get()).a * (1 ^ 3)) / ((Double)iiIiIIIIii2.ALLATORIxDEMO.get() / d2), 255.0);
                iiIiIIIIii this2 = new SettingColor(((SettingColor)iiIiIIIIii2.iIiIIiIIIi.get()).r, ((SettingColor)iiIiIIIIii2.iIiIIiIIIi.get()).g, ((SettingColor)iiIiIIIIii2.iIiIIiIIIi.get()).b, n);
                iiIiIIIIii2.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII, (SettingColor)this2, d, class_2432);
                d3 = d + d2;
            }
        } else {
            iiIiIIIIii2.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII, (SettingColor)iiIiIIIIii2.iIiIIiIIIi.get(), (Double)iiIiIIIIii2.ALLATORIxDEMO.get(), class_2432);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_2338> ALLATORIxDEMO(float f, class_243 class_2432) {
        int n;
        class_2338 iIiIiIIIII2;
        void iIiIiIIIII3;
        iiIiIIIIii iiIiIIIIii2 = this;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        int n2 = (int)Math.ceil((double)iIiIiIIIII3);
        iIiIiIIIII2 = class_2338.method_49638((class_2374)iIiIiIIIII2);
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23382 = iIiIiIIIII2.method_10069(n, n5, n7);
                    int n8 = n;
                    int n9 = n5;
                    int n10 = n7;
                    if (Math.sqrt(n8 * n8 + n9 * n9 + n10 * n10) <= (double)iIiIiIIIII3) {
                        arrayList.add(class_23382);
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2338 ALLATORIxDEMO(float f, boolean bl, boolean bl2, boolean bl3) {
        void iIiIiIIIII232;
        iiIiIIIIii iiIiIIIIii5;
        iiIiIIIIii iiIiIIIIii2 = iiIiIIIIii5;
        if (iiIiIIIIii2.iIIiiIiIiI.field_1724 == null || iiIiIIIIii2.iIIiiIiIiI.field_1687 == null) {
            return null;
        }
        iiIiIIIIii iiIiIIIIii3 = null;
        double d = (double)(iIiIiIIIII232 + 1.0f);
        iiIiIIIIii iiIiIIIIii4 = iiIiIIIIii2;
        Iterator<class_2338> iIiIiIIIII232 = iiIiIIIIii4.ALLATORIxDEMO((float)iIiIiIIIII232, iiIiIIIIii4.iIIiiIiIiI.field_1724.method_19538()).iterator();
        block0: while (true) {
            Iterator<class_2338> iterator = iIiIiIIIII232;
            while (iterator.hasNext()) {
                void iIiIiIIIII3;
                void iIiIiIIIII4;
                void iIiIiIIIII5;
                iiIiIIIIii this_ = iIiIiIIIII232.next();
                if ((this_.method_10263() != iiIiIIIIii2.iIIiiIiIiI.field_1724.method_31477() || this_.method_10260() != iiIiIIIIii2.iIIiiIiIiI.field_1724.method_31479()) && iIiIiIIIII5 == false) {
                    int n = --1;
                    if ((double)(this_.method_10264() + n) > iiIiIIIIii2.iIIiiIiIiI.field_1724.method_23318()) {
                        iterator = iIiIiIIIII232;
                        continue;
                    }
                }
                boolean bl4 = 4 ^ 5;
                if (!iiIiIIIIii2.ALLATORIxDEMO((class_2338)this_, bl4, bl4, (boolean)iIiIiIIIII4) && (iIiIiIIIII3 == false || !iiIiIIIIii2.iiiIiIiiIi((class_2338)this_))) continue block0;
                if (this_.method_10264() - iiIiIIIIii2.iIIiiIiIiI.field_1724.method_31478() > (4 ^ 5)) {
                    iterator = iIiIiIIIII232;
                    continue;
                }
                double d2 = class_3532.method_15355((float)((float)iiIiIIIIii2.iIIiiIiIiI.field_1724.method_5649((double)this_.method_10263() + 0.5, (double)this_.method_10264() + 0.5, (double)this_.method_10260() + 0.5)));
                if (iiIiIIIIii3 != null && !(d2 < d)) continue block0;
                iiIiIIIIii3 = this_;
                d = d2;
                continue block0;
            }
            break;
        }
        return iiIiIIIIii3;
    }

    @Override
    public void onActivate() {
        if (this.iIIiiIiIiI.field_1724 == null) {
            this.toggle();
            return;
        }
        this.iIIiiIiIiI = 3 >> 2;
        this.iIIiIiiiIi = 2 & 5;
        this.iIIiiIIIIi = this.ALLATORIxDEMO(((Double)this.IiiIiIiiIi.get()).floatValue(), --1 != 0, (boolean)((Boolean)this.IiiiiIiIiI.get()), (boolean)((Boolean)this.iIiiiIiIii.get()));
        iiIiIIIIii iiIiIIIIii2 = this;
        iiIiIIIIii2.iIIIiiiiIi = 3 >> 2;
        iiIiIIIIii2.IIiiIIIIIi = 3 >> 2;
    }

    private /* synthetic */ double ALLATORIxDEMO(double iIiIiIIIII2) {
        double d;
        iIiIiIIIII2 %= 360.0;
        if (d >= 180.0) {
            iIiIiIIIII2 -= 360.0;
        }
        if (iIiIiIIIII2 < -180.0) {
            iIiIiIIIII2 += 360.0;
        }
        return iIiIiIIIII2;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        iiIiIIIIii iiIiIIIIii2 = iiIiIIIIii3;
        iiIiIIIIii iiIiIIIIii3 = receive;
        iiIiIIIIii iIiIiIIIII2 = iiIiIIIIii2;
        if (((PacketEvent.Receive)iiIiIIIIii3).packet instanceof class_2708) {
            iIiIiIIIII2.toggle();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ float[] ALLATORIxDEMO(class_243 class_2432, class_243 class_2433) {
        void iIiIiIIIII2;
        iiIiIIIIii iiIiIIIIii2 = iiIiIIIIii3;
        iiIiIIIIii iiIiIIIIii3 = class_2432;
        iiIiIIIIii iIiIiIIIII3 = iiIiIIIIii2;
        iiIiIIIIii3 = iIiIiIIIII2.method_1020((class_243)iiIiIIIIii3);
        double d = ((class_243)iiIiIIIIii3).field_1352;
        double d2 = ((class_243)iiIiIIIIii3).field_1350;
        double d3 = Math.hypot(d, d2);
        iiIiIIIIii iiIiIIIIii4 = iIiIiIIIII3;
        d = iiIiIIIIii4.ALLATORIxDEMO(Math.toDegrees(Math.atan2(d2, d)) - 90.0);
        d2 = iiIiIIIIii4.ALLATORIxDEMO(Math.toDegrees(-Math.atan2(((class_243)iiIiIIIIii3).field_1351, d3)));
        float[] fArray = new float[--2];
        fArray[3 ^ 3] = (float)d;
        fArray[4 ^ 5] = (float)d2;
        return fArray;
    }

    public iiIiIIIIii() {
        iiIiIIIIii iiIiIIIIii2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, IiIiiIIIiI.ALLATORIxDEMO("\u8ff9\u5787\u5c8b\u572c"), iIIIIiIiii.ALLATORIxDEMO("\u81b4\u52de\u8fd0\u9667\u8fdd\u76a0\u5b82\u514b\u57ec\u5c97\u570d\u3076"));
        iiIiIIIIii2.iIIIIIIiII = iiIiIIIIii2.settings.getDefaultGroup();
        iiIiIIIIii2.iIiIiIIIII = iiIiIIIIii2.settings.createGroup(IiIiiIIIiI.ALLATORIxDEMO("\u6e10\u67ae"));
        iiIiIIIIii2.IiiiiIiIiI = iiIiIIIIii2.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4eed\u6131\u570d\u6d6a"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u662d\u547b\u6357\u6314\u4ef9\u6152\u7c79\u57d6\u76a6\u572c\u6d3c\u307f"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiiIiIiiIi = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u835f\u5680"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u641e\u7d7f\u5753\u6d43\u7686\u675d\u5905\u837e\u56d6\u307f"))).defaultValue(5.0).min(1.0).max(50.0).sliderMax(50.0).build());
        this.IIIIiiIiii = this.iIIIIIIiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u8d93\u65c8\u5267\u6504"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u81b7\u52aa\u79dc\u752a\u5210\u7686\u675d\u5905\u5246\u6552\u307f"))).defaultValue((Object)(0x79 & 0x2E))).min(3 & 4).max(0x74 & 0x6F).sliderMax(0x66 & 0x7D).build());
        this.IIiIiiiiII = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u8b9f\u65aa\u561c"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u79a6\u52aa\u9042\u5e84\u5070\u73a5\u307f"))).defaultValue(1.0).min(0.1).max(8.0).sliderMax(8.0).build());
        this.iIiiiIiIii = this.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u544d\u4e7e"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u662d\u547b\u5143\u8be5\u5413\u4e57\u79f9\u52f5\u5212\u572c\u6d3c\u307f"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiiIiIIiii = this.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("LQ\u007fS\u6a7d\u5f7b"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u4f5d\u7555E/k0\u53cf\u4f01\u5f08\u5121\u5b9b\u6a5c\u5f2d\u307f"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIiIiiiiII = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6b39\u8faf"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u6596\u8f6e\u6b38\u8ff9\u9062\u5e84\u307f"))).defaultValue(0.8).min(0.0).max(1.0).sliderMax(1.0).visible(() -> this.iiiIiIIiii.get())).build());
        this.iiiiiIIiIi = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4f26\u5114\u7ed3"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u65c9\u8f31\u4f3a\u5135\u7e85\u307f"))).defaultValue(10.0).min(0.0).max(100.0).sliderMax(100.0).visible(() -> this.iiiIiIIiii.get())).build());
        int n = 0xFF & Short.MAX_VALUE;
        this.iIiIIiIIIi = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u98c0\u8206"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u6e30\u678e\u5704\u5755\u76a6\u98e1\u8250\u307f"))).defaultValue(new SettingColor(n, 0xBFF & 0x74FF, n, 0x7F & 0x64)).build());
        this.ALLATORIxDEMO = this.iIiIiIIIII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5710\u5736\u597b\u5c7b"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u6e30\u678e\u5704\u5755\u76a6\u595a\u5c2d\u307f"))).defaultValue(1.0).min(0.1).max(2.5).sliderMax(2.5).build());
        this.IIiIiIIiii = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6e4c\u53ac"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u6672\u5424\u4f22\u752a\u6e4d\u53fa\u6535\u67be\u307f"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiIiiIIII = this.iIiIiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5238\u6be9\u6504"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u575b\u570a\u76d9\u5e51\u6eac\u5e84\u307f"))).defaultValue((Object)(0x2CF4 & 0x53BF))).min(3 & 4).max(0x17C & 0x7FEB).sliderMax(0x11F8 & 0x6F6F).build());
        iiIiIIIIii iiIiIIIIii3 = this;
        iiIiIIIIii3.iIIiIiiiIi = 5 >> 3;
        iiIiIIIIii3.iIIiiIiIiI = 3 >> 2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIiIiii.ALLATORIxDEMO("{oNbXf\u000bv{GjW;W+\u8bd4\u66f8\u6594\u523b\u6723\u65a6\u7276\u6770\uff75"));
        }
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        iiIiIIIIii iIiIiIIIII2 = this;
        class_2350 class_23502 = iIiIiIIIII2.ALLATORIxDEMO((class_2338)(this = class_23382));
        if (class_23502 != null) {
            if ((class_23502 = iIiIiIIIII2.ALLATORIxDEMO((class_2338)(this = this.method_10093(class_23502)))) != null) {
                return (3 & 5) != 0;
            }
            return false;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiIiIIIIii iiIiIIIIii2 = iiIiIIIIii3;
        iiIiIIIIii iiIiIIIIii3 = pre;
        iiIiIIIIii iIiIiIIIII2 = iiIiIIIIii2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        iiIiIIIIii iiIiIIIIii4 = iIiIiIIIII2;
        iiIiIIIIii4.iIIiiIIIIi = iiIiIIIIii4.ALLATORIxDEMO(((Double)iiIiIIIIii4.IiiIiIiiIi.get()).floatValue(), (4 ^ 5) != 0, (boolean)((Boolean)iIiIiIIIII2.IiiiiIiIiI.get()), (boolean)((Boolean)iIiIiIIIII2.iIiiiIiIii.get()));
        if (iIiIiIIIII2.iIIiiIIIIi == null) {
            iIiIiIIIII2.toggle();
            return;
        }
        iiIiIIIIii iiIiIIIIii5 = iIiIiIIIII2;
        iiIiIIIIii5.IIiiIIIIIi += --1;
        if (iiIiIIIIii5.IIiiIIIIIi > (Integer)iIiIiIIIII2.IIIIiiIiii.get() - --1) {
            iIiIiIIIII2.toggle();
            return;
        }
        iIiIiIIIII2.iIIiiIiIiI = 3 & 5;
        if (!((Boolean)iIiIiIIIII2.iiiIiIIiii.get()).booleanValue()) {
            if (!iIiIiIIIII2.iIIiiIiIiI.field_1724.method_5805() || iIiiiIIiIi.iiIIiIIiii((class_310)iIiIiIIIII2.iIIiiIiIiI)) {
                iIiIiIIIII2.toggle();
                return;
            }
            if (iIiIiIIIII2.iIIIiiiiIi > (0xE & 0x79)) {
                iIiIiIIIII2.toggle();
                return;
            }
            iiIiIIIIii iiIiIIIIii6 = iIiIiIIIII2;
            iiIiIIIIii6.ALLATORIxDEMO();
            iiIiIIIIii3 = iiIiIIIIii6.iIIiiIiIiI.field_1724.method_19538();
            iiIiIIIIii iiIiIIIIii7 = iIiIiIIIII2;
            float f = iiIiIIIIii7.ALLATORIxDEMO((class_243)iiIiIIIIii3, iiIiIIIIii7.iIIiIiiIiI)[3 ^ 3] / 180.0f * (float)Math.PI;
            double d = iiIiIIIIii3.method_1022(iIiIiIIIII2.iIIiIiiIiI);
            d = Math.min(0.2873, d);
            double d2 = -Math.sin(f) * d;
            d = Math.cos(f) * d;
            iiIiIIIIii6.iIIiiIiIiI.field_1724.method_18800(d2, iIiIiIIIII2.iIIiiIiIiI.field_1724.method_18798().field_1351, d);
            iiIiIIIIii6.iIIiIiiiIi = 2 ^ 3;
            if (Math.abs(d2) < 0.1 && Math.abs(d) < 0.1 && ((class_243)iiIiIIIIii3).field_1351 <= (double)iIiIiIIIII2.iIIiiIIIIi.method_10264() + 0.5) {
                iIiIiIIIII2.toggle();
            }
            if (iIiIiIIIII2.iIIiiIiIiI.field_1724.field_5976) {
                iIiIiIIIII2.iIIIiiiiIi += 3 & 5;
                return;
            }
            iIiIiIIIII2.iIIIiiiiIi = 0;
            return;
        }
        if (!iIiIiIIIII2.iIIiiIiIiI.field_1724.method_5805() || iIiiiIIiIi.iiIIiIIiii((class_310)iIiIiIIIII2.iIIiiIiIiI)) {
            iIiIiIIIII2.toggle();
            return;
        }
        if (iIiIiIIIII2.iIIIiiiiIi > (0x2A & 0x5D)) {
            iIiIiIIIII2.toggle();
            return;
        }
        iiIiIIIIii iiIiIIIIii8 = iIiIiIIIII2;
        iiIiIIIIii8.ALLATORIxDEMO();
        iiIiIIIIii3 = iiIiIIIIii8.iIIiiIiIiI.field_1724.method_19538();
        double d = iiIiIIIIii3.method_1022(iIiIiIIIII2.iIIiIiiIiI);
        if (d < 0.25 && ((class_243)iiIiIIIIii3).field_1351 <= (double)iIiIiIIIII2.iIIiiIIIIi.method_10264() + 0.8) {
            iIiIiIIIII2.toggle();
        }
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724.field_5976) {
            iIiIiIIIII2.iIIIiiiiIi += --1;
            return;
        }
        iIiIiIIIII2.iIIIiiiiIi = 0;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiIiIIIIii iiIiIIIIii2 = iiIiIIIIii5;
        if (iiIiIIIIii2.iIIiiIIIIi == null || iiIiIIIIii2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        iiIiIIIIii iiIiIIIIii3 = iiIiIIIIii2;
        iiIiIIIIii2.iIIiIiiIiI = new class_243((double)iiIiIIIIii2.iIIiiIIIIi.method_10263() + 0.5, iiIiIIIIii2.iIIiiIiIiI.field_1724.method_23318(), (double)iiIiIIIIii2.iIIiiIIIIi.method_10260() + 0.5);
        if (iiIiIIIIii3.iiiIiIiiIi(iiIiIIIIii3.iIIiiIIIIi)) {
            iiIiIIIIii iiIiIIIIii4 = iiIiIIIIii2;
            iiIiIIIIii iiIiIIIIii5 = iiIiIIIIii4.ALLATORIxDEMO(iiIiIIIIii4.iIIiiIIIIi);
            if (iiIiIIIIii5 != null) {
                iiIiIIIIii2.iIIiIiiIiI = iiIiIIIIii2.iIIiIiiIiI.method_1031((double)iiIiIIIIii5.method_62675().method_10263() * 0.5, (double)iiIiIIIIii5.method_62675().method_10264() * 0.5, (double)iiIiIIIIii5.method_62675().method_10260() * 0.5);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent, SettingColor settingColor, double d, class_243 class_2432) {
        int n;
        iiIiIIIIii iiIiIIIIii2 = iiIiIIIIii3;
        iiIiIIIIii iiIiIIIIii3 = class_2432;
        iiIiIIIIii iIiIiIIIII2 = iiIiIIIIii2;
        int n2 = (Integer)iIiIiIIIII2.iiiIiiIIII.get();
        int n3 = n = 3 ^ 3;
        while (n3 < n2) {
            void iIiIiIIIII3;
            void iIiIiIIIII4;
            void iIiIiIIIII5;
            double d2 = Math.toRadians((double)n * 360.0 / (double)n2);
            double d3 = Math.toRadians((double)(n + (3 >> 1)) * 360.0 / (double)n2);
            double d4 = Math.sin(d2) * iIiIiIIIII5;
            d2 = Math.cos(d2) * iIiIiIIIII5;
            double d5 = Math.sin(d3) * iIiIiIIIII5;
            d3 = Math.cos(d3) * iIiIiIIIII5;
            iIiIiIIIII4.renderer.line(((class_243)iiIiIIIIii3).field_1352 + d4, ((class_243)iiIiIIIIii3).field_1351, ((class_243)iiIiIIIIii3).field_1350 + d2, ((class_243)iiIiIIIIii3).field_1352 + d5, ((class_243)iiIiIIIIii3).field_1351, ((class_243)iiIiIIIIii3).field_1350 + d3, (Color)iIiIiIIIII3);
            n3 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2350 ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        void iIiIiIIIII2;
        iiIiIIIIii iiIiIIIIii2;
        block15: {
            block14: {
                iiIiIIIIii2 = iiIiIIIIii4;
                if (iiIiIIIIii2.iIIiiIiIiI.field_1687 == null) {
                    return null;
                }
                if (!iiIiIIIIii2.ALLATORIxDEMO(iIiIiIIIII2.method_10074())) {
                    return null;
                }
                if (!iiIiIIIIii2.iIIiiIiIiI.field_1687.method_22347((class_2338)iIiIiIIIII2) || !iiIiIIIIii2.iIIiiIiIiI.field_1687.method_22347(iIiIiIIIII2.method_10084())) break block14;
                if (iiIiIIIIii2.iIIiiIiIiI.field_1687.method_22347(iIiIiIIIII2.method_10086(1 ^ 3))) break block15;
            }
            return null;
        }
        int n2 = 0;
        iiIiIIIIii iiIiIIIIii3 = null;
        class_2350[] class_2350Array = class_2350.values();
        int n3 = class_2350Array.length;
        int n4 = n = 2 & 5;
        while (n4 < n3) {
            iiIiIIIIii iiIiIIIIii4 = class_2350Array[n];
            if (iiIiIIIIii4 != class_2350.field_11036 && iiIiIIIIii4 != class_2350.field_11033) {
                if (iiIiIIIIii2.ALLATORIxDEMO(iIiIiIIIII2.method_10093((class_2350)iiIiIIIIii4))) {
                    ++n2;
                } else {
                    int n5 = 0;
                    class_2350[] class_2350Array2 = class_2350.values();
                    int n6 = class_2350Array2.length;
                    int n7 = 3 ^ 3;
                    while (n7 < n6) {
                        int n8;
                        class_2350 class_23502 = class_2350Array2[n8];
                        if (class_23502 != class_2350.field_11033 && class_23502 != iiIiIIIIii4.method_10153() && iiIiIIIIii2.ALLATORIxDEMO(iIiIiIIIII2.method_10093((class_2350)iiIiIIIIii4).method_10093(class_23502))) {
                            ++n5;
                        }
                        n7 = ++n8;
                    }
                    if (n5 == --4) {
                        ++n2;
                    } else {
                        iiIiIIIIii3 = iiIiIIIIii4;
                    }
                }
            }
            n4 = ++n;
        }
        if (n2 == --3) {
            return iiIiIIIIii3;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        block8: {
            v0 = this;
            this = var1_1;
            iIiIiIIIII = v0;
            if (iIiIiIIIII.iIIiiIiIiI.field_1687 == null || iIiIiIIIII.iIIiiIiIiI.field_1724 == null) {
                return false;
            }
            var5_5 = 0;
            var6_6 = class_2350.values();
            var7_8 = var6_6.length;
            v1 = var8_9 = 5 >> 3;
            while (v1 < var7_8) {
                var9_10 = var6_6[var8_9];
                if (var9_10 != class_2350.field_11036 && var9_10 != class_2350.field_11033) {
                    var9_10 = this.method_10093(var9_10);
                    if (iIiIiIIIII != false && !iIiIiIIIII.iIIiiIiIiI.field_1687.method_22347((class_2338)var9_10) || iIiIiIIIII.ALLATORIxDEMO((class_2338)var9_10)) {
                        ++var5_5;
                    }
                }
                v1 = ++var8_9;
            }
            if (iIiIiIIIII == false) ** GOTO lbl-1000
            if (!iIiIiIIIII.iIIiiIiIiI.field_1687.method_22347((class_2338)this) || !iIiIiIIIII.iIIiiIiIiI.field_1687.method_22347(this.method_10084())) ** GOTO lbl-1000
            if (!iIiIiIIIII.iIIiiIiIiI.field_1687.method_22347(this.method_10086(--1))) ** GOTO lbl-1000
            if (!iIiIiIIIII.iIIiiIiIiI.field_1687.method_22347(this.method_10086(--2))) ** GOTO lbl-1000
            if (iIiIiIIIII.iIIiiIiIiI.field_1724.method_31478() - --1 <= this.method_10264()) break block8;
            if (!iIiIiIIIII.iIIiiIiIiI.field_1687.method_22347(this.method_10086(--3))) ** GOTO lbl-1000
        }
        if (iIiIiIIIII.iIIiiIiIiI.field_1724.method_31478() - (1 ^ 3) <= this.method_10264()) ** GOTO lbl-1000
        if (iIiIiIIIII.iIIiiIiIiI.field_1687.method_22347(this.method_10086(--4))) lbl-1000:
        // 3 sources

        {
            v2 = true;
        } else lbl-1000:
        // 5 sources

        {
            v2 = false;
        }
        var6_7 = v2;
        var7_8 = iIiIiIIIII == false || iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(this.method_10074()).method_51366() ? 1 : 0;
        if (var6_7) {
            if (var5_5 > --3 && var7_8 != 0) {
                return --1 != 0;
            }
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iiIiIIIIii iiIiIIIIii2 = iiIiIIIIii3;
        iiIiIIIIii iiIiIIIIii3 = class_23382;
        iiIiIIIIii iIiIiIIIII2 = iiIiIIIIii2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return 5 >> 3;
        }
        if ((iiIiIIIIii3 = iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiIiIIIIii3).method_26204()) == class_2246.field_10540 || iiIiIIIIii3 == class_2246.field_22108 || iiIiIIIIii3 == class_2246.field_10443 || iiIiIIIIii3 == class_2246.field_9987) {
            return true;
        }
        return false;
    }

    public void onDeactivate() {
        iiIiIIIIii iiIiIIIIii2 = iiIiIIIIii4;
        iiIiIIIIii2.iIIiiIIIIi = null;
        iiIiIIIIii2.iIIIiiiiIi = 5 >> 3;
        iiIiIIIIii2.IIiiIIIIIi = 3 >> 2;
        if (iiIiIIIIii2.iIIiiIiIiI.field_1724 != null && iiIiIIIIii2.iIIiIiiiIi && !((Boolean)iiIiIIIIii2.iiiIiIIiii.get()).booleanValue()) {
            iiIiIIIIii iiIiIIIIii3 = iiIiIIIIii2;
            iiIiIIIIii iiIiIIIIii4 = iiIiIIIIii3.iIIiiIiIiI.field_1724.method_18798();
            iiIiIIIIii3.iIIiiIiIiI.field_1724.method_18800(0.0, ((class_243)iiIiIIIIii4).field_1351, 0.0);
        }
    }
}

