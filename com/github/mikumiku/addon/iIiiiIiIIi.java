/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.BlockBreakingCooldownEvent
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Categories
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.RenderUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockIterator
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1922
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.mixinface.MySettings;
import com.github.mikumiku.addon.modules.MEnum;
import com.github.mikumiku.addon.modules.Nuker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.entity.player.BlockBreakingCooldownEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.RenderUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockIterator;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2846;

public class iIiiiIiIIi
extends iIiIiIIIii {
    private final Setting<Nuker.Mode> IiiIIiIiii;
    private final Setting<ShapeMode> IiiIiIiIIi;
    private final SettingGroup iiIiiiiIii;
    private final Setting<Integer> IIIiiiIiIi;
    private final Setting<SettingColor> iIIiIiiiII;
    private final Setting<Nuker.Shape> iiiiIiiIIi;
    private final Setting<Boolean> iiiIIiIIii;
    public int IiiIIiIIiI;
    private final Setting<SettingColor> iIIIIiiiii;
    private final Setting<Boolean> IiIiIiIIii;
    private final Setting<Integer> iiiIiIiiII;
    private final Setting<Integer> IIiiiiIIii;
    private final SettingGroup IiiiiIIiII;
    private final Setting<SettingColor> iIIIIIiiII;
    private final class_2338.class_2339 iIIiiiiIii;
    private final Setting<Double> iiIIIiIIIi;
    private boolean iIiiiiIIII;
    public int iiIiIIiiii;
    private final SettingGroup iIIiIiiIiI;
    private final Setting<MEnum.ListMode> iIIIIIIiII;
    private final Setting<ShapeMode> iIIiiIIIIi;
    private final Setting<Integer> IiiiiIiIiI;
    private final Setting<Integer> iiiIiIIiii;
    private final Setting<Boolean> iIIIiiiiIi;
    private final Setting<SettingColor> iiiIiiIIII;
    private final Setting<Integer> iIiIIiIIIi;
    private final class_2338.class_2339 IIiIiiiiII;
    private final Setting<List<class_2248>> IIiiIIIIIi;
    private int iIiiiIiIii;
    private final Setting<Nuker.SortMode> iIiIiiiiII;
    private final List<class_2338> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<List<class_2248>> IIiIiIIiii;
    private final class_2338.class_2339 iIIiiIiIiI;
    private final Setting<Integer> iiiiiIIiIi;
    private final Setting<Integer> iIIiIiiiIi;
    private int iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    @EventHandler(priority=200)
    private /* synthetic */ void ALLATORIxDEMO(BlockBreakingCooldownEvent blockBreakingCooldownEvent) {
        iIiiiIiIIi iIiiiIiIIi2 = iIiiiIiIIi3;
        iIiiiIiIIi iIiiiIiIIi3 = blockBreakingCooldownEvent;
        iIiiiIiIIi iIiIiIIIII2 = iIiiiIiIIi2;
        ((BlockBreakingCooldownEvent)iIiiiIiIIi3).cooldown = 5 >> 3;
    }

    public iIiiiIiIIi() {
        iIiiiIiIIi iIiiiIiIIi2 = this;
        super(Categories.Player, MySettings.ALLATORIxDEMO("~yf#5"), IiIiiiIIIi.ALLATORIxDEMO("\u8190\u52f1\u6371\u547b\u56d9"));
        iIiiiIiIIi2.iIIiIiiIiI = iIiiiIiIIi2.settings.getDefaultGroup();
        iIiiiIiIIi2.IiiiiIIiII = iIiiiIiIIi2.settings.createGroup(MySettings.ALLATORIxDEMO("G~~eu`d53"));
        iIiiiIiIIi2.iiIiiiiIii = iIiiiIiIIi2.settings.createGroup(IiIiiiIIIi.ALLATORIxDEMO("\u0016\u001f7\u0003v_"));
        iIiiiIiIIi2.iiiiIiiIIi = iIiiiIiIIi2.iIIiIiiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("cdl6\""))).description(IiIiiiIIIi.ALLATORIxDEMO("\u636c\u63c1\u76e3\u5f71\u729b"))).defaultValue((Object)Nuker.Shape.ALLATORIxDEMO)).build());
        this.IiiIIiIiii = this.iIIiIiiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("ab\"\""))).description(IiIiiiIIIi.ALLATORIxDEMO("\u636c\u63c1\u76e3\u65aa\u5f22"))).defaultValue((Object)Nuker.Mode.iIiIiIIIII)).build());
        this.iiIIIiIIIi = this.iIIiIiiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(MySettings.ALLATORIxDEMO("bmc!\""))).description(IiIiiiIIIi.ALLATORIxDEMO("\u786d\u5728\u8310\u56d9"))).defaultValue(4.0).min(0.0).visible(() -> {
            if (this.iiiiIiiIIi.get() != Nuker.Shape.iiiiiIIiIi) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.iIiIIiIIIi = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("37"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u5455\u4e70\u786d\u5728\u8310\u56d9"))).defaultValue((Object)(4 ^ 5))).min(3 & 4).visible(() -> {
            if (this.iiiiIiiIIi.get() == Nuker.Shape.iiiiiIIiIi) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.iiiIiIIiii = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("hb1)"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u5455\u4e71\u786d\u5728\u8310\u56d9"))).defaultValue((Object)(--1))).min(3 >> 2).visible(() -> {
            if (this.iiiiIiiIIi.get() == Nuker.Shape.iiiiiIIiIi) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IIiiiiIIii = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("`h 3"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u5455\u5d9c\u786d\u5728\u8310\u56d9"))).defaultValue((Object)(3 >> 1))).min(2 & 5).visible(() -> {
            if (this.iiiiIiiIIi.get() == Nuker.Shape.iiiiiIIiIi) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.IIIiiiIiIi = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("bej.3"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u5455\u5389\u786d\u5728\u8310\u56d9"))).defaultValue((Object)(2 ^ 3))).min(3 >> 2).visible(() -> {
            if (this.iiiiIiiIIi.get() == Nuker.Shape.iiiiiIIiIi) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.iiiIiIiiII = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("q~b{l4#"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u5455\u5237\u786d\u5728\u8310\u56d9"))).defaultValue((Object)(3 >> 1))).min(3 ^ 3).visible(() -> {
            if (this.iiiiIiiIIi.get() == Nuker.Shape.iiiiiIIiIi) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.IiiiiIiIiI = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("nl%,"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u5455\u5474\u786d\u5728\u8310\u56d9"))).defaultValue((Object)(3 & 5))).min(3 & 4).visible(() -> {
            if (this.iiiiIiiIIi.get() == Nuker.Shape.iiiiiIIiIi) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIIiIiiiIi = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("tia'>"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u786d\u5728\u95e7\u96b9"))).defaultValue((Object)(3 >> 2))).build());
        this.iiiiiIIiIi = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("}PH\u001cR}\u007f'.b=frc=xd%,"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u4e7a\u6b62\u7849\u570b\u65c3\u570e\u76e3\u6563\u91e2"))).defaultValue((Object)(4 ^ 5))).min(--1).sliderRange(2 ^ 3, 0x67 & 0x1E).build());
        this.iIiIiiiiII = this.iIIiIiiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("cyee=ab\"\""))).description(IiIiiiIIIi.ALLATORIxDEMO("\u65e0\u5730\u7b48\u9024"))).defaultValue((Object)Nuker.SortMode.iiiiiIIiIi)).build());
        this.iiiIIiIIii = this.iIIiIiiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("bg\u007fyv=dl(#"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u6455\u6266"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIIIiiiiIi = this.iIIiIiiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("5ps}re=ad(\""))).description(IiIiiiIIIi.ALLATORIxDEMO("\u4f26\u754f\u5316\u633b"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IiiIiIiiIi = this.iIIiIiiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("c\u007fxl2\""))).description(IiIiiiIIIi.ALLATORIxDEMO("\u6749\u52db\u5631\u7a88\u8f7f\u5919"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIIIIIIiII = this.IiiiiIIiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("|\u007fde=ab\"\""))).description(IiIiiiIIIi.ALLATORIxDEMO("\u7b02\u906e\u6a32\u5f22"))).defaultValue((Object)MEnum.ListMode.iIiIiIIIII)).build());
        this.IIiIiIIiii = this.IiiiiIIiII.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(MySettings.ALLATORIxDEMO("rzvr{`d53"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u4e49\u784e\u5716\u76e3\u65aa\u577a"))).visible(() -> {
            if (this.iIIIIIIiII.get() == MEnum.ListMode.iIiIiIIIII) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IIiiIIIIIi = this.IiiiiIIiII.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(MySettings.ALLATORIxDEMO("g~~eu`d53"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u784e\u5716\u76e3\u65aa\u577a"))).visible(() -> {
            if (this.iIIIIIIiII.get() == MEnum.ListMode.ALLATORIxDEMO) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IiIiIiIIii = this.iiIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("&*d~r~\u007fw!o)?"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u6e76\u67a9\u786d\u5728\u8310\u56d9"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiIiIiIIi = this.iiIiiiiIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("~1.t=txi=ab\"\""))).description(IiIiiiIIIi.ALLATORIxDEMO("\u6e6b\u67b4\u6a32\u5f22"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIIIIiiiii = this.iiIiiiiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("byrr<sca)5"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u8fde\u988f\u825f"))).defaultValue(new SettingColor(0x3D & 0x52, 0x7B & 0x6E, 0x1990 & 0x66FF, 0x76 & 0x6D)).build());
        this.iIIIIIiiII = this.iiIiiiiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("}yxr<sca)5"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u8f37\u5eb4\u988f\u825f"))).defaultValue(new SettingColor(0x1B & 0x74, 0x6F & 0x7A, 0x3B6 & 0x7CD9, 0xFFF & 0x70FF)).build());
        this.ALLATORIxDEMO = this.iiIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("r6*zux:s|cn-4"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u88d6\u7870\u5735\u65e0\u5730\u6e21\u67fe"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiIIIIi = this.iiIiiiiIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("^d{!hs|ytz=ab\"\""))).description(IiIiiiIIIi.ALLATORIxDEMO("\u6e4f\u6797\u88d1\u786d\u5728\u65aa\u577a"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.ALLATORIxDEMO.get())).build());
        this.iiiIiiIIII = this.iiIiiiiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("byrr<sca)5"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u8fde\u988f\u825f"))).defaultValue(new SettingColor(0x17FF & 0x68FF, 3 & 4, 2 & 5, 0x73 & 0x5C)).visible(() -> this.ALLATORIxDEMO.get())).build());
        int n = 0x14FF & 0x6BFF;
        this.iIIiIiiiII = this.iiIiiiiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("}yxr<sca)5"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u8f37\u5eb4\u988f\u825f"))).defaultValue(new SettingColor(n, 5 >> 3, 3 & 4, n)).visible(() -> this.ALLATORIxDEMO.get())).build());
        iIiiiIiIIi iIiiiIiIIi3 = this;
        iIiiiIiIIi iIiiiIiIIi4 = this;
        iIiiiIiIIi iIiiiIiIIi5 = this;
        iIiiiIiIIi5.IIIIiiIiii = new ArrayList<class_2338>();
        iIiiiIiIIi iIiiiIiIIi6 = this;
        iIiiiIiIIi4.iIIiiiiIii = new class_2338.class_2339();
        iIiiiIiIIi iIiiiIiIIi7 = this;
        iIiiiIiIIi6.iIIiiIiIiI = new class_2338.class_2339();
        iIiiiIiIIi iIiiiIiIIi8 = this;
        iIiiiIiIIi4.IIiIiiiiII = new class_2338.class_2339();
        iIiiiIiIIi3.IiiIIiIIiI = 5 >> 3;
        iIiiiIiIIi3.iiIiIIiiii = 3 >> 2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("A|TQbu\u0011EATpd!d1\u8be7\u66e2\u65a7\u5221\u6710\u65bc\u7245\u676a\uff46"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(int n, int n2, int n3, int n4, int n5, int n6) {
        int iIiIiIIIII2;
        void iIiIiIIIII3;
        int iIiIiIIIII4;
        void iIiIiIIIII5;
        int iIiIiIIIII6 = n4;
        int iIiIiIIIII7 = n;
        iIiIiIIIII6 = Math.abs(iIiIiIIIII6 - iIiIiIIIII7);
        iIiIiIIIII4 = Math.abs((int)(iIiIiIIIII5 - iIiIiIIIII4));
        iIiIiIIIII2 = Math.abs((int)(iIiIiIIIII3 - iIiIiIIIII2));
        return Math.max(Math.max(iIiIiIIIII6, iIiIiIIIII4), iIiIiIIIII2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiiiIiIIi iIiiiIiIIi2;
        iIiiiIiIIi iIiiiIiIIi3 = iIiiiIiIIi4;
        iIiiiIiIIi iIiiiIiIIi4 = pre;
        iIiiiIiIIi iIiIiIIIII2 = iIiiiIiIIi3;
        if (iIiIiIIIII2.iIiIiIIIII > 0) {
            iIiIiIIIII2.iIiIiIIIII -= 5 >> 2;
            return;
        }
        iIiiiIiIIi iIiiiIiIIi5 = iIiIiIIIII2;
        double d = iIiiiIiIIi5.iIIiiIiIiI.field_1724.method_23317();
        double d2 = iIiiiIiIIi5.iIIiiIiIiI.field_1724.method_23318();
        double d3 = iIiiiIiIIi5.iIIiiIiIiI.field_1724.method_23321();
        double d4 = Math.pow((Double)iIiiiIiIIi5.iiIIIiIIIi.get(), 2.0);
        if (iIiIiIIIII2.iiiiIiiIIi.get() == Nuker.Shape.iIiIiIIIII) {
            iIiiiIiIIi iIiiiIiIIi6 = iIiIiIIIII2;
            iIiiiIiIIi6.iiIIIiIIIi.set((Object)Math.round((Double)iIiiiIiIIi6.iiIIIiIIIi.get()));
        }
        double d5 = d;
        double d6 = d3;
        int this2 = (int)Math.round((Double)iIiIiIIIII2.iiIIIiIIIi.get());
        if (iIiIiIIIII2.iiiiIiiIIi.get() == Nuker.Shape.iIiIiIIIII) {
            iIiiiIiIIi iIiiiIiIIi7 = iIiIiIIIII2;
            iIiIiIIIII2.iIIiiIiIiI.method_10102((d5 += 1.0) - (double)this2, d2 - (double)this2 + 1.0, d3 - (double)this2 + 1.0);
            iIiiiIiIIi2 = iIiiiIiIIi7;
            iIiiiIiIIi7.IIiIiiiiII.method_10102(d5 + (double)this2 - 1.0, d2 + (double)this2, d3 + (double)this2);
        } else {
            iIiiiIiIIi iIiiiIiIIi8 = iIiIiIIIII2;
            int n = Math.round(iIiiiIiIIi8.iIIiiIiIiI.field_1724.method_5802().field_1342 % 360.0f / 90.0f);
            n = Math.floorMod(n, --4);
            iIiiiIiIIi8.iIIiiIiIiI.method_10102(d5 - (double)((Integer)iIiIiIIIII2.iiiIiIiiII.get()).intValue(), Math.ceil(d2) - (double)((Integer)iIiIiIIIII2.iiiIiIIiii.get()).intValue(), d6 - (double)((Integer)iIiIiIIIII2.IIIiiiIiIi.get()).intValue());
            iIiIiIIIII2.IIiIiiiiII.method_10102(d5 + (double)((Integer)iIiIiIIIII2.IiiiiIiIiI.get()).intValue() + 1.0, Math.ceil(d2 + (double)((Integer)iIiIiIIIII2.iIiIIiIIIi.get()).intValue() + 1.0), d6 + (double)((Integer)iIiIiIIIII2.IIiiiiIIii.get()).intValue() + 1.0);
            switch (n) {
                case 0: {
                    iIiIiIIIII2.iIIiiIiIiI.method_10102((d5 += 1.0) - (double)((Integer)iIiIiIIIII2.IIIiiiIiIi.get() + (3 & 5)), Math.ceil(d2) - (double)((Integer)iIiIiIIIII2.iiiIiIIiii.get()).intValue(), (d6 += 1.0) - (double)((Integer)iIiIiIIIII2.IiiiiIiIiI.get() + (5 >> 2)));
                    iIiIiIIIII2.IIiIiiiiII.method_10102(d5 + (double)((Integer)iIiIiIIIII2.IIiiiiIIii.get()).intValue(), Math.ceil(d2 + (double)((Integer)iIiIiIIIII2.iIiIIiIIIi.get()).intValue() + 1.0), d6 + (double)((Integer)iIiIiIIIII2.iiiIiIiiII.get()).intValue());
                    iIiiiIiIIi iIiiiIiIIi9 = iIiIiIIIII2;
                    break;
                }
                case 2: {
                    d5 += 1.0;
                    iIiIiIIIII2.iIIiiIiIiI.method_10102(d5 - (double)((Integer)iIiIiIIIII2.IIiiiiIIii.get() + --1), Math.ceil(d2) - (double)((Integer)iIiIiIIIII2.iiiIiIIiii.get()).intValue(), (d6 += 1.0) - (double)((Integer)iIiIiIIIII2.iiiIiIiiII.get() + (3 >> 1)));
                    iIiIiIIIII2.IIiIiiiiII.method_10102(d5 + (double)((Integer)iIiIiIIIII2.IIIiiiIiIi.get()).intValue(), Math.ceil(d2 + (double)((Integer)iIiIiIIIII2.iIiIIiIIIi.get()).intValue() + 1.0), d6 + (double)((Integer)iIiIiIIIII2.IiiiiIiIiI.get()).intValue());
                    iIiiiIiIIi iIiiiIiIIi9 = iIiIiIIIII2;
                    break;
                }
                case 3: {
                    iIiIiIIIII2.iIIiiIiIiI.method_10102((d5 += 1.0) - (double)((Integer)iIiIiIIIII2.IiiiiIiIiI.get() + (3 >> 1)), Math.ceil(d2) - (double)((Integer)iIiIiIIIII2.iiiIiIIiii.get()).intValue(), d6 - (double)((Integer)iIiIiIIIII2.IIiiiiIIii.get()).intValue());
                    iIiIiIIIII2.IIiIiiiiII.method_10102(d5 + (double)((Integer)iIiIiIIIII2.iiiIiIiiII.get()).intValue(), Math.ceil(d2 + (double)((Integer)iIiIiIIIII2.iIiIIiIIIi.get()).intValue() + 1.0), d6 + (double)((Integer)iIiIiIIIII2.IIIiiiIiIi.get()).intValue() + 1.0);
                }
                default: {
                    iIiiiIiIIi iIiiiIiIIi9 = iIiIiIIIII2;
                }
            }
            iIiiiIiIIi9.IiiIIiIIiI = 1 + Math.max(Math.max(Math.max((Integer)iIiIiIIIII2.IiiiiIiIiI.get(), (Integer)iIiIiIIIII2.IIIiiiIiIi.get()), (Integer)iIiIiIIIII2.iiiIiIiiII.get()), (Integer)iIiIiIIIII2.IIiiiiIIii.get());
            iIiIiIIIII2.iiIiIIiiii = --1 + Math.max((Integer)iIiIiIIIII2.iIiIIiIIIi.get(), (Integer)iIiIiIIIII2.iiiIiIIiii.get());
            iIiiiIiIIi2 = iIiIiIIIII2;
        }
        if (iIiiiIiIIi2.IiiIIiIiii.get() == Nuker.Mode.iIiIiIIIII) {
            iIiIiIIIII2.iIIiiIiIiI.method_33098((int)Math.floor(d2));
        }
        class_238 class_2383 = new class_238(iIiIiIIIII2.iIIiiIiIiI.method_46558(), iIiIiIIIII2.IIiIiiiiII.method_46558());
        BlockIterator.register((int)Math.max((int)Math.ceil((Double)iIiIiIIIII2.iiIIIiIIIi.get() + 1.0), iIiIiIIIII2.IiiIIiIIiI), (int)Math.max((int)Math.ceil((Double)iIiIiIIIII2.iiIIIiIIIi.get()), iIiIiIIIII2.iiIiIIiiii), (class_23382, class_26802) -> {
            void iIiIiIIIII2;
            iIiiiIiIIi iIiiiIiIIi2 = iIiiiIiIIi3;
            iIiiiIiIIi iIiiiIiIIi3 = class_23382;
            iIiiiIiIIi iIiIiIIIII3 = iIiiiIiIIi2;
            switch (((Nuker.Shape)((Object)((Object)iIiIiIIIII3.iiiiIiiIIi.get()))).ordinal()) {
                case 2: {
                    void iIiIiIIIII4;
                    void iIiIiIIIII5;
                    void iIiIiIIIII6;
                    void iIiIiIIIII7;
                    if (!(Utils.squaredDistance((double)iIiIiIIIII7, (double)iIiIiIIIII6, (double)iIiIiIIIII5, (double)((double)iIiiiIiIIi3.method_10263() + 0.5), (double)((double)iIiiiIiIIi3.method_10264() + 0.5), (double)((double)iIiiiIiIIi3.method_10260() + 0.5)) > iIiIiIIIII4)) break;
                    return;
                }
                case 1: {
                    if (!((double)iIiiiIiIIi.ALLATORIxDEMO(iIiIiIIIII3.iIIiiIiIiI.field_1724.method_24515().method_10263(), iIiIiIIIII3.iIIiiIiIiI.field_1724.method_24515().method_10264(), iIiIiIIIII3.iIIiiIiIiI.field_1724.method_24515().method_10260(), iIiiiIiIIi3.method_10263(), iIiiiIiIIi3.method_10264(), iIiiiIiIIi3.method_10260()) >= (Double)iIiIiIIIII3.iiIIIiIIIi.get())) break;
                    return;
                }
                case 0: {
                    void iIiIiIIIII8;
                    if (iIiIiIIIII8.method_1006(class_243.method_24953((class_2382)iIiiiIiIIi3))) break;
                    return;
                }
            }
            if (!BlockUtils.canBreak((class_2338)iIiiiIiIIi3, (class_2680)iIiIiIIIII2)) {
                return;
            }
            if (iIiIiIIIII3.IiiIIiIiii.get() == Nuker.Mode.iIiIiIIIII && (double)iIiiiIiIIi3.method_10264() < Math.floor(iIiIiIIIII3.iIIiiIiIiI.field_1724.method_23318())) {
                return;
            }
            if (iIiIiIIIII3.IiiIIiIiii.get() == Nuker.Mode.iiiiiIIiIi && iIiIiIIIII2.method_26214((class_1922)iIiIiIIIII3.iIIiiIiIiI.field_1687, (class_2338)iIiiiIiIIi3) != 0.0f) {
                return;
            }
            if (iIiIiIIIII3.iIIIIIIiII.get() == MEnum.ListMode.ALLATORIxDEMO && !((List)iIiIiIIIII3.IIiiIIIIIi.get()).contains(iIiIiIIIII2.method_26204())) {
                return;
            }
            if (iIiIiIIIII3.iIIIIIIiII.get() == MEnum.ListMode.iIiIiIIIII && ((List)iIiIiIIIII3.IIiIiIIiii.get()).contains(iIiIiIIIII2.method_26204())) {
                return;
            }
            iIiIiIIIII3.IIIIiiIiii.add(iIiiiIiIIi3.method_10062());
        });
        BlockIterator.after(() -> {
            block14: {
                iIiiiIiIIi iIiiiIiIIi2;
                iIiiiIiIIi iIiiiIiIIi3;
                if (this.iIiIiiiiII.get() == Nuker.SortMode.iIIiIiiiIi) {
                    this.IIIIiiIiii.sort(Comparator.comparingDouble(iIiIiIIIII2 -> -iIiIiIIIII2.method_10264()));
                    iIiiiIiIIi3 = this;
                } else {
                    if (this.iIiIiiiiII.get() != Nuker.SortMode.ALLATORIxDEMO) {
                        this.IIIIiiIiii.sort(Comparator.comparingDouble(class_23382 -> {
                            void iIiIiIIIII2;
                            void iIiIiIIIII3;
                            void iIiIiIIIII4;
                            iIiiiIiIIi iIiiiIiIIi2 = iIiiiIiIIi3;
                            iIiiiIiIIi iIiiiIiIIi3 = class_23382;
                            iIiiiIiIIi iIiIiIIIII5 = iIiiiIiIIi2;
                            return Utils.squaredDistance((double)iIiIiIIIII4, (double)iIiIiIIIII3, (double)iIiIiIIIII2, (double)((double)iIiiiIiIIi3.method_10263() + 0.5), (double)((double)iIiiiIiIIi3.method_10264() + 0.5), (double)((double)iIiiiIiIIi3.method_10260() + 0.5)) * (double)(iIiIiIIIII5.iIiIiiiiII.get() == Nuker.SortMode.iiiiiIIiIi ? --1 : -1);
                        }));
                    }
                    iIiiiIiIIi3 = this;
                }
                if (iIiiiIiIIi3.IIIIiiIiii.isEmpty()) {
                    int n = this.iIiiiIiIii;
                    this.iIiiiIiIii = n + --1;
                    if (n >= (Integer)this.iIIiIiiiIi.get()) {
                        this.iIiiiiIIII = 2 ^ 3;
                    }
                    return;
                }
                this.iIiiiIiIii = 3 ^ 3;
                if (!this.iIiiiiIIII) {
                    iIiiiIiIIi iIiiiIiIIi4 = this;
                    if (!iIiiiIiIIi4.iIIiiiiIii.equals((Object)iIiiiIiIIi4.IIIIiiIiii.getFirst())) {
                        this.iIiIiIIIII = (Integer)this.iIIiIiiiIi.get();
                        this.iIiiiiIIII = 2 & 5;
                        this.iIIiiiiIii.method_10101((class_2382)this.IIIIiiIiii.getFirst());
                        if (this.iIiIiIIIII > 0) {
                            return;
                        }
                    }
                }
                int iIiIiIIIII322 = 0;
                for (class_2338 iIiIiIIIII422 : this.IIIIiiIiii) {
                    if (iIiIiIIIII322 >= (Integer)this.iiiiiIIiIi.get()) {
                        iIiiiIiIIi2 = this;
                    } else {
                        iIiiiIiIIi iIiiiIiIIi5;
                        boolean bl = BlockUtils.canInstaBreak((class_2338)iIiIiIIIII422);
                        if (((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
                            Rotations.rotate((double)Rotations.getYaw((class_2338)iIiIiIIIII422), (double)Rotations.getPitch((class_2338)iIiIiIIIII422), () -> {
                                iIiiiIiIIi iIiiiIiIIi2 = iIiiiIiIIi3;
                                iIiiiIiIIi iIiiiIiIIi3 = iIiIiIIIII422;
                                iIiiiIiIIi iIiIiIIIII2 = iIiiiIiIIi2;
                                iIiIiIIIII2.ALLATORIxDEMO((class_2338)iIiiiIiIIi3);
                            });
                            iIiiiIiIIi5 = this;
                        } else {
                            iIiiiIiIIi iIiiiIiIIi5 = this;
                            iIiiiIiIIi5 = iIiiiIiIIi5;
                            iIiiiIiIIi6.ALLATORIxDEMO(iIiIiIIIII422);
                        }
                        if (((Boolean)iIiiiIiIIi5.ALLATORIxDEMO.get()).booleanValue()) {
                            boolean bl2 = 3 ^ 3;
                            RenderUtils.renderTickingBlock((class_2338)iIiIiIIIII422, (Color)((Color)this.iiiIiiIIII.get()), (Color)((Color)this.iIIiIiiiII.get()), (ShapeMode)((ShapeMode)this.iIIiiIIIIi.get()), (int)(bl2 ? 1 : 0), (int)(0x2E & 0x59), (boolean)(--1 != 0), (boolean)bl2);
                        }
                        ++iIiIiIIIII322;
                        this.iIIiiiiIii.method_10101((class_2382)iIiIiIIIII422);
                        if (bl || ((Boolean)this.iIIIiiiiIi.get()).booleanValue()) continue;
                        iIiiiIiIIi2 = this;
                    }
                    break block14;
                }
                iIiiiIiIIi2 = this;
            }
            iIiiiIiIIi2.iIiiiiIIII = false;
            this.IIIIiiIiii.clear();
        });
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        iIiiiIiIIi iIiiiIiIIi2 = iIiiiIiIIi3;
        iIiiiIiIIi iIiiiIiIIi3 = class_23382;
        iIiiiIiIIi iIiIiIIIII2 = iIiiiIiIIi2;
        if (((Boolean)iIiIiIIIII2.iIIIiiiiIi.get()).booleanValue()) {
            iIiiiIiIIi iIiiiIiIIi4 = iIiIiIIIII2;
            iIiiiIiIIi iIiiiIiIIi5 = iIiiiIiIIi3;
            iIiiiIiIIi4.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12968, (class_2338)iIiiiIiIIi5, BlockUtils.getDirection((class_2338)iIiiiIiIIi5)));
            iIiiiIiIIi4.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
            iIiiiIiIIi iIiiiIiIIi6 = iIiiiIiIIi3;
            iIiiiIiIIi4.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, (class_2338)iIiiiIiIIi6, BlockUtils.getDirection((class_2338)iIiiiIiIIi6)));
            return;
        }
        BlockUtils.breakBlock((class_2338)iIiiiIiIIi3, (boolean)((Boolean)iIiIiIIIII2.iiiIIiIIii.get()));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iIiiiIiIIi iIiiiIiIIi2 = iIiiiIiIIi3;
        iIiiiIiIIi iIiiiIiIIi3 = render3DEvent;
        iIiiiIiIIi iIiIiIIIII2 = iIiiiIiIIi2;
        if (((Boolean)iIiIiIIIII2.IiIiIiIIii.get()).booleanValue() && iIiIiIIIII2.iiiiIiiIIi.get() != Nuker.Shape.ALLATORIxDEMO && iIiIiIIIII2.IiiIIiIiii.get() != Nuker.Mode.iiiiiIIiIi) {
            iIiiiIiIIi iIiiiIiIIi4 = iIiIiIIIII2;
            iIiiiIiIIi iIiiiIiIIi5 = iIiIiIIIII2;
            int this_ = Math.min(iIiiiIiIIi4.iIIiiIiIiI.method_10263(), iIiiiIiIIi5.IIiIiiiiII.method_10263());
            int n = Math.min(iIiiiIiIIi4.iIIiiIiIiI.method_10264(), iIiIiIIIII2.IIiIiiiiII.method_10264());
            int n2 = Math.min(iIiiiIiIIi5.iIIiiIiIiI.method_10260(), iIiIiIIIII2.IIiIiiiiII.method_10260());
            int n3 = Math.max(iIiiiIiIIi4.iIIiiIiIiI.method_10263(), iIiIiIIIII2.IIiIiiiiII.method_10263());
            int n4 = Math.max(iIiiiIiIIi4.iIIiiIiIiI.method_10264(), iIiIiIIIII2.IIiIiiiiII.method_10264());
            int n5 = Math.max(iIiiiIiIIi4.iIIiiIiIiI.method_10260(), iIiIiIIIII2.IIiIiiiiII.method_10260());
            ((Render3DEvent)iIiiiIiIIi3).renderer.box((double)this_, (double)n, (double)n2, (double)n3, (double)n4, (double)n5, (Color)iIiIiIIIII2.iIIIIiiiii.get(), (Color)iIiIiIIIII2.iIIIIIiiII.get(), (ShapeMode)iIiIiIIIII2.IiiIiIiIIi.get(), 3 ^ 3);
        }
    }

    @Override
    public void onActivate() {
        iIiiiIiIIi iIiiiIiIIi2 = this;
        this.iIiiiiIIII = 3 & 5;
        iIiiiIiIIi2.iIiIiIIIII = 2 & 5;
        iIiiiIiIIi2.iIiiiIiIii = 3 >> 2;
    }
}

