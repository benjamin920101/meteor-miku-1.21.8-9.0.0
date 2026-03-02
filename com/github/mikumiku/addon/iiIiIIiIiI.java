/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_3532
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiiIIIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_3532;

public class iiIiIIiIiI
extends iIiIiIIIii {
    public Setting<Integer> iiiIiiIIII;
    public Setting<SettingColor> iIiIIiIIIi;
    public int IIiIiiiiII;
    private final iiIIiiIIIi IIiiIIIIIi;
    public Setting<Integer> iIiiiIiIii;
    public Setting<SettingColor> iIiIiiiiII;
    public Setting<ShapeMode> IIIIiiIiii;
    public Setting<Boolean> IiiIiIiiIi;
    public int IIiIiIIiii;
    public Setting<class_2248> iIIiiIiIiI;
    public SettingGroup iiiiiIIiIi;
    public List<class_2338> iIIiIiiiIi;
    public SettingGroup iIiIiIIIII;
    public Setting<Double> ALLATORIxDEMO;

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        iiIiIIiIiI iiIiIIiIiI2 = iiIiIIiIiI3;
        iiIiIIiIiI iiIiIIiIiI3 = class_23382;
        iiIiIIiIiI iIiIiIIIII2 = iiIiIIiIiI2;
        if (iiIiIIiIiI3 == null) {
            return;
        }
        if (iIiIiIIIII2.iIIiIiiiIi.contains(iiIiIIiIiI3)) {
            return;
        }
        iiIiIIiIiI iiIiIIiIiI4 = iIiIiIIIII2;
        if (iiIiIIiIiI4.IIiIiiiiII >= (Integer)iiIiIIiIiI4.iiiIiiIIII.get()) {
            return;
        }
        if (iIiIiIIIII2.IIiiIIIIIi.ALLATORIxDEMO((class_2338)iiIiIIiIiI3)) {
            return;
        }
        if ((double)class_3532.method_15355((float)((float)iIiIiiIIIi.ALLATORIxDEMO().method_1025(iiIiIIiIiI3.method_46558()))) > (Double)iIiIiIIIII2.ALLATORIxDEMO.get()) {
            return;
        }
        int n = IiIiiiiIii.IIIIiIIiII(((class_2248)iIiIiIIIII2.iIIiiIiIiI.get()).method_8389());
        if (n == -4 >> 2) {
            return;
        }
        iIiIiIIIII2.iIIiIiiiIi.add((class_2338)iiIiIIiIiI3);
        IiIiiiiIii.ALLATORIxDEMO(n);
        iIiIiiIIIi.iiIIiIIiii((class_2338)iiIiIIiIiI3);
        IiIiiiiIii.ALLATORIxDEMO(n);
        IiIiiiiIii.ALLATORIxDEMO();
        iiIiIIiIiI iiIiIIiIiI5 = iIiIiIIIII2;
        iiIiIIiIiI5.IIiIiiiiII += 3 >> 1;
        iiIiIIiIiI5.IIiiIIIIIi.ALLATORIxDEMO((class_2338)iiIiIIiIiI3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        iiIiIIiIiI iiIiIIiIiI2 = iiIiIIiIiI3;
        class_2248 class_22482 = (class_2248)iiIiIIiIiI2.iIIiiIiIiI.get();
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = n = 3 >> 2;
        while (n3 < n2) {
            void iIiIiIIIII2;
            iiIiIIiIiI iiIiIIiIiI3 = class_2350Array[n];
            if (iiIiIIiIiI3 != class_2350.field_11033 && iiIiIIiIiI3 != class_2350.field_11036 && iiIiIIiIiI2.iIIiiIiIiI.field_1687.method_8320((class_2338)(iiIiIIiIiI3 = iIiIiIIIII2.method_10093((class_2350)iiIiIIiIiI3))).method_26204() == class_22482) {
                return (3 & 5) != 0;
            }
            n3 = ++n;
        }
        return false;
    }

    public iiIiIIiIiI() {
        iiIiIIiIiI iiIiIIiIiI2 = this;
        super(IiIIiIIiiI.ALLATORIxDEMO("\u7929\u4ff2\u6530\u7f0a\u65fd\u5779"), IiiiIIIiii.ALLATORIxDEMO("\u81b5\u52fe\u5eb8\u9061\u814f\u4e06\u6527\u7f20\u65e3\u571d\u76da\u7972\u4fd7zb\u5c1b\u7960j\u001c).?6bw'\u00033:+\u007fl\u001a,>Xm#2f~:\u001197\u001e\u0017\u0005\u0010\t?\t\u0016/~\u7542\u6cab"));
        iiIiIIiIiI2.iiiiiIIiIi = iiIiIIiIiI2.settings.getDefaultGroup();
        iiIiIIiIiI2.iIiIiIIIII = iiIiIIiIiI2.settings.createGroup(IiIIiIIiiI.ALLATORIxDEMO("\u6e76\u67fd"));
        iiIiIIiIiI2.ALLATORIxDEMO = iiIiIIiIiI2.iiiiiIIiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiiIIIiii.ALLATORIxDEMO("\u5eb0\u907e\u8369\u568a"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u8193\u52bc\u5e84\u9033\u76fd\u670e\u5943\u8347\u56da"))).defaultValue(4.0).range(0.0, 6.0).build());
        this.iIIiiIiIiI = this.iiiiiIIiIi.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IiiiIIIiii.ALLATORIxDEMO("\u65d3\u5729"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u9070\u62fd\u7556\u4e9d\u5e83\u902e\u76e0\u65fd\u5779"))).defaultValue((Object)class_2246.field_10445)).build());
        this.iiiIiiIIII = this.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIIIiii.ALLATORIxDEMO("\u6ba5\u6b5f\u6574\u7f30\u651a\u91b1"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u6b89\u4e06\u6e2b\u6276\u522f\u6540\u7f7d\u76fd\u65b7\u5733\u6534\u91e1"))).defaultValue((Object)(5 >> 1))).sliderRange(--1, 0x6E & 0x17).build());
        this.iIiiiIiIii = this.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIIIiii.ALLATORIxDEMO("\u6574\u7f30\u5e9c\u8fa1"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u652d\u7f17\u658a\u570e\u4e58\u958d\u76b7\u5eaf\u8f99\u65da\u95e7\uff71\u5341\u4f33\uff09\rg\u0007/\uff27"))).defaultValue((Object)(2 & 5))).sliderRange(5 >> 3, 0x34 & 0x5F).build());
        this.IiiIiIiiIi = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIIIiii.ALLATORIxDEMO("\u6674\u7964\u6e58\u67ad"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u661c\u547f\u6678\u7916\u5f96\u6547\u7f7a\u65c7\u5744\u76fd\u6e3c\u67b7\u98c0\u89e6"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.IIIIiiIiii = this.iIiIiIIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiiIIIiii.ALLATORIxDEMO("\u6e78\u678d\u6a4b\u5f71"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u9070\u62fd\u6e4c\u67c0\u76fd\u6630\u795e\u6a65\u5f21"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIiIiiiiII = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiiiIIIiii.ALLATORIxDEMO("\u4fed\u973c\u98f6\u820c"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u5fb6\u6567\u7f28\u6595\u5744\u6e4b\u67c7\u76fa\u4fb4\u971b\u5865\u5121\u98d8\u825c"))).defaultValue(new SettingColor(0x6C87 & 0x13FF, 0x14DE & 0x6BEF, 0x4CFF & 0x33EB, 0x1F & 0x7E)).build());
        this.iIiIIiIIIi = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiiiIIIiii.ALLATORIxDEMO("\u7ef5\u673f\u98f6\u820c"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u5fb6\u6567\u7f28\u6595\u5744\u6e4b\u67c7\u76fa\u8faa\u683f\u7eb1\u6705\u98d8\u825c"))).defaultValue(new SettingColor(0x64 & 0x7F, 0x21B5 & 0x5EDF, 0x7DFF & 0x2ED, 0x75 & 0x5A)).build());
        iiIiIIiIiI iiIiIIiIiI3 = this;
        iiIiIIiIiI iiIiIIiIiI4 = this;
        iiIiIIiIiI4.iIIiIiiiIi = new ArrayList<class_2338>();
        iiIiIIiIiI3.IIiIiIIiii = 2 & 5;
        iiIiIIiIiI3.IIiIiiiiII = 2 & 5;
        iiIiIIiIiI iiIiIIiIiI5 = this;
        iiIiIIiIiI3.IIiiIIIIIi = new iiIIiiIIIi(1000L);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIIIiii.ALLATORIxDEMO("\u001d5hx9;j+\u001a\u001a+*\u000f_J\u8b89\u66be\u65ee\u525a\u677e\u65fa\u7216\u6746\uff7f"));
        }
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiIiIIiIiI iiIiIIiIiI4;
        iiIiIIiIiI iiIiIIiIiI2;
        iiIiIIiIiI iiIiIIiIiI3 = iiIiIIiIiI2 = iiIiIIiIiI4;
        iiIiIIiIiI3.iIIiIiiiIi.clear();
        iiIiIIiIiI3.IIiIiiiiII = 3 & 4;
        if (iiIiIIiIiI3.IIiIiIIiii < (Integer)iiIiIIiIiI2.iIiiiIiIii.get()) {
            iiIiIIiIiI2.IIiIiIIiii += 3 >> 1;
            return;
        }
        iiIiIIiIiI2.IIiIiIIiii = 3 >> 2;
        for (class_2338 this_ : iiIIiiiIIi.ALLATORIxDEMO((Double)iiIiIIiIiI2.ALLATORIxDEMO.get())) {
            if (!iIiIiiIIIi.iiiIiIiiIi(this_, --1 != 0) || !iiIiIIiIiI2.ALLATORIxDEMO(this_) || this_.method_10264() != iiIiIIiIiI2.iIIiiIiIiI.field_1724.method_24515().method_10074().method_10264() || iiIiIIiIiI2.iIIiiIiIiI.field_1687.method_8320(this_).method_26204().method_8389() != class_1802.field_8162) continue;
            iiIiIIiIiI2.ALLATORIxDEMO(this_);
        }
    }

    @Override
    public void onActivate() {
        iiIiIIiIiI iiIiIIiIiI2 = this;
        super.onActivate();
        iiIiIIiIiI2.IIiiIIIIIi.iiIIiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiIiIIiIiI iiIiIIiIiI2 = this;
        if (((Boolean)iiIiIIiIiI2.IiiIiIiiIi.get()).booleanValue() && iiIiIIiIiI2.iIIiIiiiIi.size() > 0) {
            class_1792[] class_1792Array = new class_1792[5 >> 2];
            class_1792Array[5 >> 3] = ((class_2248)iiIiIIiIiI2.iIIiiIiIiI.get()).method_8389();
            if (IiIiiiiIii.ALLATORIxDEMO(class_1792Array).found()) {
                int n = this = 3 >> 2;
                while (n < iiIiIIiIiI2.iIIiIiiiIi.size()) {
                    void iIiIiIIIII2;
                    double d = iiIiIIiIiI2.iIIiIiiiIi.get(this).method_10263();
                    double d2 = iiIiIIiIiI2.iIIiIiiiIi.get(this).method_10264();
                    double d3 = iiIiIIiIiI2.iIIiIiiiIi.get(this).method_10260();
                    double d4 = iiIiIIiIiI2.iIIiIiiiIi.get(this).method_10263() + (3 >> 1);
                    double d5 = iiIiIIiIiI2.iIIiIiiiIi.get(this).method_10264() + --1;
                    double d6 = iiIiIIiIiI2.iIIiIiiiIi.get(this).method_10260() + (5 >> 2);
                    int n2 = 5 >> 2;
                    iIiIiIIIII2.renderer.box(d, d2, d3, d4, d5, d6, (Color)iiIiIIiIiI2.iIiIiiiiII.get(), (Color)iiIiIIiIiI2.iIiIIiIIIi.get(), (ShapeMode)iiIiIIiIiI2.IIIIiiIiii.get(), 3 ^ 3);
                    n = ++this;
                }
            }
        }
    }

    public void onDeactivate() {
        this.IIiiIIIIIi.iiiIiIiiIi();
    }
}

