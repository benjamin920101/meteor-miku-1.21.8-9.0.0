/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fi.dy.masa.litematica.data.DataManager
 *  fi.dy.masa.litematica.world.SchematicWorldHandler
 *  fi.dy.masa.litematica.world.WorldSchematic
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
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
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2482
 *  net.minecraft.class_2510
 *  net.minecraft.class_2533
 *  net.minecraft.class_2680
 *  net.minecraft.class_2741
 *  net.minecraft.class_2760
 *  net.minecraft.class_2769
 *  net.minecraft.class_2771
 *  net.minecraft.class_4538
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIIIiiII;
import com.github.mikumiku.addon.IIIiIIiiiI;
import com.github.mikumiku.addon.IIiiIIIiiI;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.modules.BestPrinter;
import fi.dy.masa.litematica.data.DataManager;
import fi.dy.masa.litematica.world.SchematicWorldHandler;
import fi.dy.masa.litematica.world.WorldSchematic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2482;
import net.minecraft.class_2510;
import net.minecraft.class_2533;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2760;
import net.minecraft.class_2769;
import net.minecraft.class_2771;
import net.minecraft.class_4538;

public class IiiIIIiiiI
extends iIiIiIIIii {
    private final Setting<class_2248> IiIIiiiiIi;
    private final Setting<Boolean> IiiIIiIiii;
    private final Setting<class_2248> IiiIiIiIIi;
    private final Setting<BestPrinter.PlaceMode> iiIiiiiIii;
    private final Setting<class_2248> IIIiiiIiIi;
    private final SettingGroup iIIiIiiiII;
    private final ArrayList<class_2338> iiiiIiiIIi;
    private final Setting<Boolean> iiiIIiIIii;
    private final SettingGroup IiiIIiIIiI;
    private final Setting<SettingColor> iIIIIiiiii;
    private final List<class_2248> IiIiIiIIii;
    private final Setting<Boolean> iiiIiIiiII;
    private final SettingGroup IIiiiiIIii;
    private final Setting<class_2248> IiiiiIIiII;
    private int iIIIIIiiII;
    private final Setting<Boolean> iIIiiiiIii;
    private final Setting<Boolean> iiIIIiIIIi;
    private final Setting<class_2248> iIiiiiIIII;
    private final Setting<Boolean> iiIiIIiiii;
    private final Setting<class_2248> iIIiIiiIiI;
    private final Setting<Boolean> iIIIIIIiII;
    private final Setting<Integer> iIIiiIIIIi;
    private final iiIIiiIIIi IiiiiIiIiI;
    private final Setting<class_2248> iiiIiIIiii;
    private final Setting<class_2248> iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<Boolean> iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private final Setting<Double> IIiiIIIIIi;
    private final Setting<class_2248> iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final Setting<SettingColor> IiiIiIiiIi;
    private final Map<class_2338, class_2680> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    private final Setting<ShapeMode> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private final Setting<class_2248> ALLATORIxDEMO;

    private /* synthetic */ void ALLATORIxDEMO() {
        IiiIIIiiiI iiiIIIiiiI4;
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI4;
        WorldSchematic worldSchematic = SchematicWorldHandler.getSchematicWorld();
        List<class_2338> list = iiIIiiiIIi.ALLATORIxDEMO((Double)iiiIIIiiiI2.IIiiIIIIIi.get());
        IiiIIIiiiI iiiIIIiiiI3 = iiiIIIiiiI2;
        iiiIIIiiiI3.iiiiIiiIIi.clear();
        iiiIIIiiiI3.IIiIiIIiii.clear();
        for (class_2338 this_ : list) {
            if (!iiiIIIiiiI2.ALLATORIxDEMO(this_, worldSchematic)) continue;
            IIiiIIIiiI iIiiIIIiiI = new IIiiIIIiiI(iiiIIIiiiI2.iIIiiIiIiI.field_1724.method_37908(), worldSchematic, this_);
            iiiIIIiiiI2.iiiiIiiIIi.add(this_);
            iiiIIIiiiI2.IIiIiIIiii.put(this_, iIiiIIIiiI.iIIiIiiiIi);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2680 class_26802, int n, class_2769<class_2350> class_27692) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_26802;
        IiiIIIiiiI iIiIiIIIII4 = iiiIIIiiiI2;
        class_2350 iIiIiIIIII5 = (class_2350)iiiIIIiiiI3.method_11654((class_2769)iIiIiIIIII3);
        iiiIIIiiiI3 = iIiIiIIIII4.ALLATORIxDEMO(iiiIIIiiiI3.method_26204()) ? iIiIiIIIII5 : iIiIiIIIII5.method_10153();
        void v1 = iIiIiIIIII2;
        if (((Boolean)iIiIiIIIII4.iiiIiiIIII.get()).booleanValue()) {
            iIiIiiIIIi.iIiIiIiIii((class_2338)v1);
            return;
        }
        boolean bl = --1 != 0;
        iIiIiiIIIi.iiIIiIIiii((class_2338)v1, true, bl, bl, (class_2350)iiiIIIiiiI3);
    }

    private /* synthetic */ void IIIIiIIiII(class_2338 class_23382, class_2680 class_26802) {
        class_2771 iIiIiIIIII2;
        IiiIIIiiiI iiiIIIiiiI3;
        IiiIIIiiiI this_ = class_23382;
        IiiIIIiiiI iIiIiIIIII3 = iiiIIIiiiI3;
        if (((Boolean)iIiIiIIIII3.iiiIiiIIII.get()).booleanValue()) {
            iIiIiiIIIi.iIiIiIiIii((class_2338)this_);
            return;
        }
        if (!iIiIiIIIII2.method_28501().contains(class_2741.field_12485)) {
            boolean bl = 4 ^ 5;
            iIiIiiIIIi.iiIIiIIiii((class_2338)this_, bl, bl, bl);
            return;
        }
        if ((iIiIiIIIII2 = (class_2771)iIiIiIIIII2.method_11654((class_2769)class_2741.field_12485)) == class_2771.field_12679) {
            boolean bl = 2 ^ 3;
            iIiIiiIIIi.iiiIiIiiIi((class_2338)this_, bl, bl, bl);
            return;
        }
        if (iIiIiIIIII2 == class_2771.field_12681) {
            boolean bl = 3 & 5;
            iIiIiiIIIi.ALLATORIxDEMO((class_2338)this_, bl, bl, bl);
            return;
        }
        if (iIiIiIIIII2 == class_2771.field_12682) {
            boolean bl = 2 ^ 3;
            iIiIiiIIIi.ALLATORIxDEMO((class_2338)this_, bl, bl, bl);
            return;
        }
        boolean bl = 4 ^ 5;
        iIiIiiIIIi.iiIIiIIiii((class_2338)this_, bl, bl, bl);
    }

    public IiiIIIiiiI() {
        IiiIIIiiiI iiiIIIiiiI2 = this;
        super(iIiIiIIIii.ALLATORIxDEMO, IIIIIIiiII.iiIIiIIiii("\u000eO\bS\u62f6\u5f57\u6230\u5376\u6779"), IIIiIIiiiI.ALLATORIxDEMO("\u6737\u5f4a\u6228\u5343\u6702\u3035\u6805\u635b\u62ab\u5f5a\u84fd\u56cd\u81d2\u529f\u6502\u7f5b\u6587\u577c\u3022z\u8191\u5297\u91f9\u5ec0\u62a4\u5f4b\u65b6\u4ec7\uff32cX\u0018\u001ez}CUT\uff35\u4e3a\u7698\u5eed\u7b4d\u3015\u0016\u4f48\u7514\u527a\u673c\u594a\u62b6Au\u0003I\u8c34\r\u001e\t\u0007\u0012\u001c\u6237\u4e85\u4e60"));
        iiiIIIiiiI2.IiiIIiIIiI = iiiIIIiiiI2.settings.getDefaultGroup();
        iiiIIIiiiI2.iiiiiIIiIi = iiiIIIiiiI2.settings.createGroup(IIIIIIiiII.iiIIiIIiii("\u725f\u6be9\u659f\u5734\u8bb8\u7f2d"));
        iiiIIIiiiI2.iIIiIiiiII = iiiIIIiiiI2.settings.createGroup(IIIiIIiiiI.ALLATORIxDEMO("\u66d5\u8844\u65d9\u573c"));
        iiiIIIiiiI2.IIiiiiIIii = iiiIIIiiiI2.settings.createGroup(IIIIIIiiII.iiIIiIIiii("\u6e34\u6790"));
        iiiIIIiiiI2.iiIiiiiIii = iiiIIIiiiI2.IiiIIiIIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6514\u7f4f\u6a41\u5f64"))).description(IIIIIIiiII.iiIIiIIiii("\u5197\u5b9c\u6210\u5356\u65da\u5771\u6595\u7682\u657d\u7f68\u9078\u8f97\uff59\u4e03\u685f\u6230\u546b\u6cf3\u6a42\u5f09\u3041"))).defaultValue((Object)BestPrinter.PlaceMode.ALLATORIxDEMO)).build());
        this.iIiIiiiiII = this.IiiIIiIIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6bf8\u6b1d\u6514\u7f4f\u6510\u91a4"))).description(IIIIIIiiII.iiIIiIIiii("\u6bacr*e(\u6706\u5959\u6518\u7f0d\u76a2\u65da\u5771\u6513\u91c9\u3041"))).defaultValue((Object)(--2))).sliderRange(4 ^ 5, 0x26 & 0x5F).build());
        this.iIIiiIIIIi = this.IiiIIiIIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6514\u7f4f\u5e96\u8fb4"))).description(IIIIIIiiII.iiIIiIIiii("\u4e02\u6b42\u659f\u5734\u6538\u7f2d\u4e4d\u95b7\u7682\u5eb5\u8ff9\uff6bR\nE\b\uff0f\u3041"))).defaultValue((Object)(5 >> 3))).sliderRange(2 & 5, 0xE & 0x7B).build());
        this.IIiiIIIIIi = this.IiiIIiIIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6514\u7f4f\u8363\u569f"))).description(IIIIIIiiII.iiIIiIIiii("\u645f\u7d24\u53ac\u6538\u7f2d\u659f\u5734\u76a2\u5329\u5fa2\u8360\u56f2\u3041"))).defaultValue(4.1).sliderRange(1.0, 7.0).build());
        this.iIiIiIIIII = this.IiiIIiIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u81c0\u5289\u7ec0\u9572"))).description(IIIIIIiiII.iiIIiIIiii("\u8b96\u5f36\u6255\u5333\u4f4b\u7f2d\uff0a\u955a\u8bc9\u8189\u528e\u6375\u63af\u7ec3\u6b65\u3041"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiiIiiIIII = this.IiiIIiIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u7a50\u6c35\u655e\u7f05"))).description(IIIIIIiiII.iiIIiIIiii("\u5166\u8bda\u5712\u7a05\u6c39\u4e45\u655f\u7f4a\u659b\u5730\uff2a\u6583\u89e2\u655f\u7f54\u962f\u5214\u3065\u5e50\u4e77\u659d\u5470\u53d5\u8082\u4e6c\u7c9a\u51e8\u3069\u972b\u89ef\u6726\u52cf\u5648\u654a\u6320HA\u5dd6\u77e3\u656c\u6327Y\u0006\ft$*ce \u0006\u4e6e\u6509\u6362\u001cC5 "))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIiIIiIIIi = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u7e95\u77cf\u5169\u4ed7\u5964\u746d"))).description(IIIIIIiiII.iiIIiIIiii("\u666c\u5420\u546c\u750e\u721a\u6bac\u655d\u7f48\u9058\u8f97\u3041"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiiiIii = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6956\u688e\u5964\u746d"))).description(IIIIIIiiII.iiIIiIIiii("\u6629\u5465\u5429\u756b\u697a\u68ec\u76a2\u721a\u6bac\u655d\u7f48\u9058\u8f97\u3041"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IIiIiiiiII = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u5360\u7837\u5964\u746d"))).description(IIIIIIiiII.iiIIiIIiii("\u6629\u5465\u5429\u756b\u534c\u7855\u76a2\u721a\u6bac\u655d\u7f48\u9058\u8f97\u3041"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiIiIiiII = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6d07\u6755\u95c9\u5964\u746d"))).description(IIIIIIiiII.iiIIiIIiii("\u664c\u5420\u546c\u752e\u6d78\u6779\u95ab\u76a2\u721a\u6bac\u655d\u7f48\u9058\u8f97\u3041"))).defaultValue((Object)(5 >> 2))).build());
        this.iIIIIIIiII = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u7041\u62ab\u5964\u746d"))).description(IIIIIIiiII.iiIIiIIiii("\u6629\u5465\u5429\u756b\u706d\u62c9\u76a2\u721a\u6bac\u655d\u7f48\u9058\u8f97\u3041"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiIIIiIIIi = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6f25\u65b6\u5964\u746d"))).description(IIIIIIiiII.iiIIiIIiii("\u666c\u5420\u546c\u750e\u721a\u6bac\u655d\u7f48\u9058\u8f97\u3041"))).defaultValue((Object)(5 >> 2))).build());
        this.iIIiiIiIiI = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u7b9b\u5b71\u5964\u746d"))).description(IIIIIIiiII.iiIIiIIiii("\u666c\u5420\u546c\u750e\u721a\u6bac\u655d\u7f48\u9058\u8f97\u3041"))).defaultValue((Object)(3 >> 1))).build());
        this.iiIiIIiiii = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6ccf\u573e\u5964\u746d"))).description(IIIIIIiiII.iiIIiIIiii("\u832a\u659f\u5734\u4e0b\u8df0\u65f0\uff4f\u6ce3\u575c\u4e79\u8bc7\u4e1c\u664c\u836f\u65da\u5751\u3041"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiiIIiIiii = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("XOC\u0015\f"))).description(IIIIIIiiII.iiIIiIIiii("'C\u0001S\u0004\u0006\u000fi$"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiiIIiIIii = this.iIIiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u5405\u7509\u669f\u880e"))).description(IIIIIIiiII.iiIIiIIiii("\u5f75\u768d\u6821\u65da\u5751\u7f79\u5937\u65b5\uff0a\u81a9\u528e\u4f1c\u750e\u669c\u8843\u65da\u5751\u3041"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIiiiIiIii = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u53a3\u6593\u5776MZ"))).description(IIIIIIiiII.iiIIiIIiii("\u9743\u8987\u88e8\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10219)).visible(() -> this.iiiIIiIIii.get())).build());
        this.IiIIiiiiIi = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u66c8\u8859\u6593\u5776MZ"))).description(IIIIIIiiII.iiIIiIIiii("\u752e\u4ecd\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10566)).visible(() -> this.iiiIIiIIii.get())).build());
        this.IiiIiIiIIi = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u53a3\u6593\u5776MY"))).description(IIIIIIiiII.iiIIiIIiii("\u9743\u8987\u88e8\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10402)).visible(() -> this.iiiIIiIIii.get())).build());
        this.iIiiiiIIII = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u66c8\u8859\u6593\u5776MY"))).description(IIIIIIiiII.iiIIiIIiii("\u752e\u4ecd\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10566)).visible(() -> this.iiiIIiIIii.get())).build());
        this.IiiiiIIiII = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u53a3\u6593\u5776MX"))).description(IIIIIIiiII.iiIIiIIiii("\u9743\u8987\u88e8\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10520)).visible(() -> this.iiiIIiIIii.get())).build());
        this.IIIiiiIiIi = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u66c8\u8859\u6593\u5776MX"))).description(IIIIIIiiII.iiIIiIIiii("\u752e\u4ecd\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10566)).visible(() -> this.iiiIIiIIii.get())).build());
        this.iIIIiiiiIi = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u53a3\u6593\u5776M_"))).description(IIIIIIiiII.iiIIiIIiii("\u9743\u8987\u88e8\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10340)).visible(() -> this.iiiIIiIIii.get())).build());
        this.iiiIiIIiii = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u66c8\u8859\u6593\u5776M_"))).description(IIIIIIiiII.iiIIiIIiii("\u752e\u4ecd\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10445)).visible(() -> this.iiiIIiIIii.get())).build());
        this.iIIiIiiIiI = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u53a3\u6593\u5776M^"))).description(IIIIIIiiII.iiIIiIIiii("\u9743\u8987\u88e8\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10124)).visible(() -> this.iiiIIiIIii.get())).build());
        this.ALLATORIxDEMO = this.iIIiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u66c8\u8859\u6593\u5776M^"))).description(IIIIIIiiII.iiIIiIIiii("\u752e\u4ecd\u66d9\u6301\u76a2\u65da\u5771\u7c18\u578d\u3041"))).defaultValue((Object)class_2246.field_10124)).visible(() -> this.iiiIIiIIii.get())).build());
        this.IIIIiiIiii = this.IIiiiiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6e18\u67f2\u98e4\u89a3"))).description(IIIIIIiiII.iiIIiIIiii("\u666c\u5420\u6e71\u67d5\u6210\u5356\u65da\u5771\u76e7\u98a2\u89ab\u6840\u3041"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIiIiiiIi = this.IIiiiiIIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6e18\u67f2\u6a41\u5f64"))).description(IIIIIIiiII.iiIIiIIiii("\u902f\u628a\u6e34\u6790\u65bf\u5f4c\uff1c\u7efc\u6860\u3062\u584d\u5126\u6230\u4e47\u8003\u3041"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIIIIiiiii = this.IIiiiiIIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u4f8d\u9743\u98fc\u8219"))).description(IIIIIIiiII.iiIIiIIiii("\u6255\u5333\u65bf\u5714\u98a2\u89ab\u76a2\u4fc4\u9744\u98ff\u8274\u3041"))).defaultValue(new SettingColor(2 & 5, 0x7B & 0x7C, 0x1CFF & 0x63FF, 0x3E & 0x73)).build());
        this.IiiIiIiiIi = this.IIiiiiIIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u8f98\u6826\u8219"))).description(IIIIIIiiII.iiIIiIIiii("\u6255\u5333\u65bf\u5714\u98a2\u89ab\u76a2\u7edc\u6747\u98ff\u8274\u3041"))).defaultValue(new SettingColor(0x1F & 0x74, 0x2BFA & 0x5497, 0x5F7 & 0x7AEE, 0x4BFF & 0x34FF)).build());
        IiiIIIiiiI iiiIIIiiiI3 = this;
        IiiIIIiiiI iiiIIIiiiI4 = this;
        iiiIIIiiiI4.iiiiIiiIIi = new ArrayList();
        IiiIIIiiiI iiiIIIiiiI5 = this;
        iiiIIIiiiI4.IIiIiIIiii = new HashMap<class_2338, class_2680>();
        iiiIIIiiiI3.iIIIIIiiII = 3 >> 2;
        class_2248[] class_2248Array = new class_2248[1 ^ 3];
        class_2248Array[2 & 5] = class_2246.field_10282;
        class_2248Array[3 & 5] = class_2246.field_10312;
        iiiIIIiiiI3.IiIiIiIIii = Arrays.asList(class_2248Array);
        IiiIIIiiiI iiiIIIiiiI6 = this;
        iiiIIIiiiI6.IiiiiIiIiI = new iiIIiiIIIi(1000L);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIiIIiiiI.ALLATORIxDEMO("Gpr}DY\u0017IGXvh\u0007H\u0017\u8bcb\u66c4\u658b\u5207\u673c\u659a\u7269\u674c\uff6a"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent, class_2338 class_23382) {
        void iIiIiIIIII2;
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_23382;
        IiiIIIiiiI iIiIiIIIII3 = iiiIIIiiiI2;
        IiiIIIiiiI iiiIIIiiiI4 = iiiIIIiiiI3;
        double d = iiiIIIiiiI4.method_10263();
        double d2 = iiiIIIiiiI4.method_10264();
        double d3 = iiiIIIiiiI4.method_10260();
        double d4 = iiiIIIiiiI4.method_10263() + (2 ^ 3);
        double d5 = iiiIIIiiiI4.method_10264() + (3 & 5);
        double d6 = iiiIIIiiiI4.method_10260() + (3 & 5);
        iIiIiIIIII2.renderer.box(d, d2, d3, d4, d5, d6, (Color)iIiIiIIIII3.iIIIIiiiii.get(), (Color)iIiIiIIIII3.IiiIiIiiIi.get(), (ShapeMode)iIiIiIIIII3.iIIiIiiiIi.get(), 3 ^ 3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2680 class_26802, int n) {
        class_2338 iIiIiIIIII22;
        class_2338 class_23383;
        void iIiIiIIIII3;
        class_2350 iIiIiIIIII4;
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI4;
        if ((iIiIiIIIII4 = (class_2350)iIiIiIIIII4.method_11654((class_2769)class_2741.field_12545)) == class_2350.field_11033) {
            void v0 = iIiIiIIIII3;
            class_2338 iIiIiIIIII22 = v0.method_10084();
            class_23383 = v0.method_10074();
            IiiIIIiiiI iiiIIIiiiI3 = iiiIIIiiiI2;
            IiiIIIiiiI iiiIIIiiiI4 = iiiIIIiiiI3.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII22);
            boolean bl = iiiIIIiiiI4.method_51367();
            boolean bl2 = iiiIIIiiiI3.iIIiiIiIiI.field_1687.method_8320(class_23383).method_51367();
            if (!bl && !bl2) {
                return;
            }
        }
        boolean this_ = (class_23383 = iiiIIIiiiI2.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII22 = iIiIiIIIII3.method_10093(iIiIiIIIII4))).method_26215() || class_23383.method_51176();
        if (this_) {
            return;
        }
        void v2 = iIiIiIIIII3;
        if (((Boolean)iiiIIIiiiI2.iiiIiiIIII.get()).booleanValue()) {
            iIiIiiIIIi.iIiIiIiIii((class_2338)v2);
            return;
        }
        boolean bl = --1 != 0;
        iIiIiiIIIi.iiiIiIiiIi((class_2338)v2, true, bl, bl, iIiIiIIIII4);
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2680 class_26802) {
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_26802;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        if (iIiIiIIIII2.ALLATORIxDEMO((class_2680)iiiIIIiiiI3) != -4 >> 2) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, int n) {
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_23382;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        IiiIIIiiiI iiiIIIiiiI4 = iiiIIIiiiI3;
        if (((Boolean)iIiIiIIIII2.iiiIiiIIII.get()).booleanValue()) {
            iIiIiiIIIi.iIiIiIiIii((class_2338)iiiIIIiiiI4);
            return;
        }
        iIiIiiIIIi.iiIIiIIiii((class_2338)iiiIIIiiiI4);
    }

    @Override
    public void onActivate() {
        IiiIIIiiiI iiiIIIiiiI2 = this;
        super.onActivate();
        iiiIIIiiiI2.iIIIIIiiII = 5 >> 3;
        iiiIIIiiiI2.IiiiiIiIiI.iiIIiIIiii();
        IiIiIIiiii.iiIIiIIiii(IIIIIIiiII.iiIIiIIiii("\u62f0\u5f50\u6237\u5311\u5ede\u8ba8cp\nGC\u8c05\u6537\u5236r(q\u0016M\u0010\u6275\u4ec3\u4e68\u724e\u676f"));
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Post post) {
        int n;
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = post;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        iiiIIIiiiI3 = SchematicWorldHandler.getSchematicWorld();
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iiiIIIiiiI3 == null) {
            return;
        }
        IiiIIIiiiI iiiIIIiiiI4 = iIiIiIIIII2;
        if (iiiIIIiiiI4.iIIIIIiiII < (Integer)iiiIIIiiiI4.iIIiiIIIIi.get()) {
            iIiIiIIIII2.iIIIIIiiII += 3 >> 1;
            return;
        }
        IiiIIIiiiI iiiIIIiiiI5 = iIiIiIIIII2;
        iiiIIIiiiI5.iIIIIIiiII = 3 & 4;
        iiiIIIiiiI5.ALLATORIxDEMO();
        if (iiiIIIiiiI5.iiiiIiiIIi.isEmpty()) {
            return;
        }
        int this2 = Math.min((Integer)iIiIiIIIII2.iIiIiiiiII.get(), iIiIiIIIII2.iiiiIiiIIi.size());
        int n2 = n = 3 ^ 3;
        while (n2 < this2) {
            iIiIiIIIII2.ALLATORIxDEMO(n++);
            n2 = n;
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2680 class_26802) {
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_26802;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        if (iiiIIIiiiI3.method_26204() != class_2246.field_10124 && iiiIIIiiiI3.method_26204().method_8389() != class_1802.field_8162) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiIIiIIiii(class_2338 class_23382, class_2680 class_26802) {
        class_2760 iIiIiIIIII2;
        void iIiIiIIIII3;
        IiiIIIiiiI iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        if (((Boolean)iiiIIIiiiI2.iiiIiiIIII.get()).booleanValue()) {
            iIiIiiIIIi.iIiIiIiIii((class_2338)iIiIiIIIII3);
            return;
        }
        void v0 = iIiIiIIIII2;
        v0.method_26204();
        IiiIIIiiiI this_ = (class_2350)v0.method_11654((class_2769)class_2533.field_11177);
        iIiIiIIIII2 = (class_2760)iIiIiIIIII2.method_11654((class_2769)class_2533.field_11625);
        if (this_ == null || iIiIiIIIII2 == null) {
            boolean bl = 2 ^ 3;
            iIiIiiIIIi.iiIIiIIiii((class_2338)iIiIiIIIII3, bl, bl, bl);
            return;
        }
        this_ = this_.method_10153();
        if (iIiIiIIIII2 == class_2760.field_12619) {
            boolean bl = 4 ^ 5;
            iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiIiIIIII3, bl, bl, bl, (class_2350)this_);
            return;
        }
        boolean bl = 3 & 5;
        iIiIiiIIIi.iiIIiIIiii((class_2338)iIiIiIIIII3, bl, bl, bl, (class_2350)this_);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiIiiIi(class_2338 class_23382, class_2680 class_26802) {
        void iIiIiIIIII2;
        void iIiIiIIIII222322;
        IiiIIIiiiI iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI this_ = iIiIiIIIII222322.method_26204();
        boolean bl = this_ == class_2246.field_10099 || this_ == class_2246.field_10301 || this_ == class_2246.field_22093;
        if (bl) {
            this_ = ((class_2350)iIiIiIIIII222322.method_11654((class_2769)class_2741.field_12481)).method_10153();
            class_2338 class_23383 = iIiIiIIIII2.method_10093((class_2350)this_);
            class_2680 class_26803 = iiiIIIiiiI2.iIIiiIiIiI.field_1687.method_8320(class_23383);
            boolean iIiIiIIIII222322 = class_26803.method_26215() || class_26803.method_51176();
            if (iIiIiIIIII222322) {
                return;
            }
            IiiIIIiiiI iIiIiIIIII222322 = this_;
            boolean bl2 = --1 != 0;
            iIiIiiIIIi.iiiIiIiiIi((class_2338)iIiIiIIIII2, bl2, bl2, bl2, (class_2350)iIiIiIIIII222322);
            return;
        }
        this_ = iIiIiIIIII2.method_10074();
        class_2680 class_26804 = iiiIIIiiiI2.iIIiiIiIiI.field_1687.method_8320((class_2338)this_);
        int n = !class_26804.method_26215() && class_2248.method_20044((class_4538)iiiIIIiiiI2.iIIiiIiIiI.field_1687, (class_2338)this_, (class_2350)class_2350.field_11036) ? --1 : 0;
        if (n != 0) {
            boolean bl3 = 5 >> 2;
            iIiIiiIIIi.iiIIiIIiii((class_2338)iIiIiIIIII2, bl3, bl3, bl3);
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(IIiiIIIiiI iIiiIIIiiI) {
        IiiIIIiiiI iiiIIIiiiI2 = iIiiIIIiiI2;
        IIiiIIIiiI iIiiIIIiiI2 = iIiiIIIiiI;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        if (iIiiIIIiiI2.iIIiIiiiIi.method_26204() != iIiiIIIiiI2.ALLATORIxDEMO.method_26204()) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, IIiiIIIiiI iIiiIIIiiI) {
        class_2680 iIiIiIIIII2;
        IiiIIIiiiI iiiIIIiiiI2 = iterator;
        iIiIiIIIII2 = iIiIiIIIII2.iIIiIiiiIi;
        if (!iIiIiIIIII2.method_28501().contains(class_2741.field_12485)) {
            return 5 >> 2;
        }
        class_2771 class_27712 = (class_2771)iIiIiIIIII2.method_11654((class_2769)class_2741.field_12485);
        iIiIiIIIII2.method_26204();
        Iterator<class_2350> iterator = new ArrayList();
        iterator.add(class_2350.field_11043);
        iterator.add(class_2350.field_11035);
        iterator.add(class_2350.field_11034);
        iterator.add(class_2350.field_11039);
        if (class_27712 == class_2771.field_12679) {
            iterator.add(class_2350.field_11036);
        }
        if (class_27712 == class_2771.field_12681) {
            iterator.add(class_2350.field_11033);
        }
        if (class_27712 == class_2771.field_12682) {
            iterator.add(class_2350.field_11036);
            iterator.add(class_2350.field_11033);
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_2680 class_26802;
            void iIiIiIIIII3;
            class_2350 class_23502 = (class_2350)iterator.next();
            class_23502 = iIiIiIIIII3.method_10093(class_23502);
            if ((class_23502 = iiiIIIiiiI2.iIIiiIiIiI.field_1687.method_8320((class_2338)class_23502)).method_26204() instanceof class_2482) {
                if (!class_23502.method_28501().contains(class_2741.field_12485)) continue;
                class_26802 = (class_2771)class_23502.method_11654((class_2769)class_2741.field_12485);
                if (class_27712 == class_2771.field_12679 && (class_26802 == class_2771.field_12679 || class_26802 == class_2771.field_12682)) {
                    return true;
                }
                if (class_27712 == class_2771.field_12681 && (class_26802 == class_2771.field_12681 || class_26802 == class_2771.field_12682)) {
                    return true;
                }
                if (class_27712 != class_2771.field_12682) continue;
                return --1 != 0;
            }
            class_26802 = (class_2680)class_2246.field_10351.method_9564().method_11657((class_2769)class_2482.field_11501, (Comparable)class_2771.field_12679);
            class_26802 = iIiIiIIIII2;
            if (!class_26802.method_26184((class_4538)iiiIIIiiiI2.iIIiiIiIiI.field_1687, (class_2338)iIiIiIIIII3)) continue;
            return (4 ^ 5) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_23382;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        if (iiiIIIiiiI3.method_10264() <= DataManager.getRenderLayerRange().getLayerMax()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n) {
        IiiIIIiiiI iiiIIIiiiI2;
        void iIiIiIIIII22;
        IiiIIIiiiI iiiIIIiiiI3 = iiiIIIiiiI4;
        class_2338 iIiIiIIIII22 = iiiIIIiiiI3.iiiiIiiIIi.get((int)iIiIiIIIII22);
        IiiIIIiiiI iiiIIIiiiI4 = iiiIIIiiiI3.IIiIiIIiii.get(iIiIiIIIII22);
        int n2 = iiiIIIiiiI3.ALLATORIxDEMO((class_2680)iiiIIIiiiI4);
        if (n2 == -4 >> 2) {
            return;
        }
        IiIiiiiIii.ALLATORIxDEMO(n2);
        if (((Boolean)iiiIIIiiiI3.IIiIiiiiII.get()).booleanValue() && iiiIIIiiiI4.method_26204() instanceof class_2482) {
            IiiIIIiiiI iiiIIIiiiI5 = iiiIIIiiiI3;
            iiiIIIiiiI2 = iiiIIIiiiI5;
            iiiIIIiiiI5.IIIIiIIiII(iIiIiIIIII22, (class_2680)iiiIIIiiiI4);
        } else {
            IiiIIIiiiI iiiIIIiiiI6 = iiiIIIiiiI3;
            if (iiiIIIiiiI4.method_26204() instanceof class_2510) {
                iiiIIIiiiI6.ALLATORIxDEMO(iIiIiIIIII22, (class_2680)iiiIIIiiiI4);
                iiiIIIiiiI2 = iiiIIIiiiI3;
            } else {
                IiiIIIiiiI iiiIIIiiiI7 = iiiIIIiiiI3;
                if (iiiIIIiiiI6.iiiIiIiiIi(iiiIIIiiiI4.method_26204())) {
                    iiiIIIiiiI7.iiiIiIiiIi(iIiIiIIIII22, (class_2680)iiiIIIiiiI4);
                    iiiIIIiiiI2 = iiiIIIiiiI3;
                } else if (((Boolean)iiiIIIiiiI7.iiiIiIiiII.get()).booleanValue() && iiiIIIiiiI4.method_26204() instanceof class_2533) {
                    IiiIIIiiiI iiiIIIiiiI8 = iiiIIIiiiI3;
                    iiiIIIiiiI2 = iiiIIIiiiI8;
                    iiiIIIiiiI8.iiIIiIIiii(iIiIiIIIII22, (class_2680)iiiIIIiiiI4);
                } else if (iiiIIIiiiI4.method_28501().contains(class_2741.field_12525)) {
                    IiiIIIiiiI iiiIIIiiiI9 = iiiIIIiiiI3;
                    iiiIIIiiiI2 = iiiIIIiiiI9;
                    iiiIIIiiiI9.ALLATORIxDEMO(iIiIiIIIII22, (class_2680)iiiIIIiiiI4, n2, (class_2769<class_2350>)class_2741.field_12525);
                } else if (iiiIIIiiiI4.method_28501().contains(class_2741.field_12545)) {
                    IiiIIIiiiI iiiIIIiiiI10 = iiiIIIiiiI3;
                    iiiIIIiiiI2 = iiiIIIiiiI10;
                    iiiIIIiiiI10.ALLATORIxDEMO(iIiIiIIIII22, (class_2680)iiiIIIiiiI4, n2);
                } else {
                    IiiIIIiiiI iiiIIIiiiI11 = iiiIIIiiiI3;
                    if (iiiIIIiiiI4.method_28501().contains(class_2741.field_12481)) {
                        iiiIIIiiiI11.ALLATORIxDEMO(iIiIiIIIII22, (class_2680)iiiIIIiiiI4, n2, (class_2769<class_2350>)class_2741.field_12481);
                        iiiIIIiiiI2 = iiiIIIiiiI3;
                    } else {
                        iiiIIIiiiI11.ALLATORIxDEMO(iIiIiIIIII22, n2);
                        iiiIIIiiiI2 = iiiIIIiiiI3;
                    }
                }
            }
        }
        iiiIIIiiiI2.IiiiiIiIiI.ALLATORIxDEMO(iIiIiIIIII22);
        IiIiiiiIii.ALLATORIxDEMO(n2);
        IiIiiiiIii.ALLATORIxDEMO();
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2248 class_22482) {
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_22482;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        if (iiiIIIiiiI3 == class_2246.field_10336 || iiiIIIiiiI3 == class_2246.field_10099 || iiiIIIiiiI3 == class_2246.field_10523 || iiiIIIiiiI3 == class_2246.field_10301 || iiiIIIiiiI3 == class_2246.field_22092 || iiiIIIiiiI3 == class_2246.field_22093) {
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2680 class_26802) {
        void iIiIiIIIII2;
        IiiIIIiiiI iiiIIIiiiI3;
        IiiIIIiiiI this_ = class_23382;
        IiiIIIiiiI iIiIiIIIII3 = iiiIIIiiiI3;
        if (((Boolean)iIiIiIIIII3.iiiIiiIIII.get()).booleanValue()) {
            iIiIiiIIIi.iIiIiIiIii((class_2338)this_);
            return;
        }
        if (!iIiIiIIIII2.method_28501().contains(class_2741.field_12481)) {
            boolean bl = --1 != 0;
            iIiIiiIIIi.iiIIiIIiii((class_2338)this_, bl, bl, bl);
            return;
        }
        class_2350 class_23502 = (class_2350)iIiIiIIIII2.method_11654((class_2769)class_2741.field_12481);
        if (!iIiIiIIIII2.method_28501().contains(class_2741.field_12518)) {
            boolean bl = 2 ^ 3;
            iIiIiiIIIi.iiIIiIIiii((class_2338)this_, bl, bl, bl, class_23502);
            return;
        }
        if ((class_2760)iIiIiIIIII2.method_11654((class_2769)class_2741.field_12518) == class_2760.field_12619) {
            boolean bl = --1 != 0;
            iIiIiiIIIi.iiiIiIiiIi((class_2338)this_, bl, bl, bl);
            return;
        }
        boolean bl = 3 >> 1;
        iIiIiiIIIi.iiIIiIIiii((class_2338)this_, bl, bl, bl, class_23502);
    }

    private /* synthetic */ class_2248 ALLATORIxDEMO(class_2248 class_22482) {
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_22482;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        if (iIiIiIIIII2.iIiiiIiIii.get() == iiiIIIiiiI3) {
            return (class_2248)iIiIiIIIII2.IiIIiiiiIi.get();
        }
        if (iIiIiIIIII2.IiiIiIiIIi.get() == iiiIIIiiiI3) {
            return (class_2248)iIiIiIIIII2.iIiiiiIIII.get();
        }
        if (iIiIiIIIII2.IiiiiIIiII.get() == iiiIIIiiiI3) {
            return (class_2248)iIiIiIIIII2.IIIiiiIiIi.get();
        }
        if (iIiIiIIIII2.iIIIiiiiIi.get() == iiiIIIiiiI3) {
            return (class_2248)iIiIiIIIII2.iiiIiIIiii.get();
        }
        if (iIiIiIIIII2.iIIiIiiIiI.get() == iiiIIIiiiI3) {
            return (class_2248)iIiIiIIIII2.ALLATORIxDEMO.get();
        }
        return null;
    }

    public void onDeactivate() {
        IiiIIIiiiI iiiIIIiiiI2 = this;
        iiiIIIiiiI2.iIIIIIiiII = 3 ^ 3;
        iiiIIIiiiI2.iiiiIiiIIi.clear();
        iiiIIIiiiI2.IIiIiIIiii.clear();
        iiiIIIiiiI2.IiiiiIiIiI.iiiIiIiiIi();
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_23382;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        if (((Boolean)iIiIiIIIII2.iiiIiiIIII.get()).booleanValue()) {
            return (3 & 5) != 0;
        }
        if (iIiIiIIIII2.iiIiiiiIii.get() == BestPrinter.PlaceMode.iIIiIiiiIi) {
            return iIiIiiIIIi.ALLATORIxDEMO((class_2338)iiiIIIiiiI3, (Double)iIiIiIIIII2.IIiiIIIIIi.get(), --1 != 0);
        }
        if (iIiIiiIIIi.iiIIiIIiii((class_2338)iiiIIIiiiI3, 3 >> 1) != null) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IiiIIIiiiI iiiIIIiiiI2 = this;
        if (!((Boolean)iiiIIIiiiI2.IIIIiiIiii.get()).booleanValue() || iiiIIIiiiI2.iiiiIiiIIi.isEmpty()) {
            return;
        }
        Object object = this = iiiIIIiiiI2.iiiiIiiIIi.iterator();
        while (object.hasNext()) {
            void iIiIiIIIII2;
            class_2338 class_23382 = (class_2338)this.next();
            object = this;
            iiiIIIiiiI2.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2, class_23382);
        }
    }

    private /* synthetic */ int ALLATORIxDEMO(class_2680 class_26802) {
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_26802;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        iiiIIIiiiI3 = iiiIIIiiiI3.method_26204();
        int n = IiIiiiiIii.IIIIiIIiII(iiiIIIiiiI3.method_8389());
        if (n != -4 >> 2) {
            return n;
        }
        if (((Boolean)iIiIiIIIII2.iiIiIIiiii.get()).booleanValue() && iiiIIIiiiI3 == class_2246.field_10219) {
            n = IiIiiiiIii.IIIIiIIiII(class_1802.field_8831);
            if (n != -4 >> 2) {
                return n;
            }
        }
        if (((Boolean)iIiIiIIIII2.iiiIIiIIii.get()).booleanValue() && (iiiIIIiiiI3 = iIiIiIIIII2.ALLATORIxDEMO((class_2248)iiiIIIiiiI3)) != null && iiiIIIiiiI3 != class_2246.field_10124) {
            n = IiIiiiiIii.IIIIiIIiII(iiiIIIiiiI3.method_8389());
            if (n != -4 >> 2) {
                return n;
            }
        }
        return -1;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        IiiIIIiiiI iiiIIIiiiI2 = iiiIIIiiiI3;
        IiiIIIiiiI iiiIIIiiiI3 = class_22482;
        IiiIIIiiiI iIiIiIIIII2 = iiiIIIiiiI2;
        return iIiIiIIIII2.IiIiIiIIii.contains(iiiIIIiiiI3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, WorldSchematic worldSchematic) {
        void iIiIiIIIII2;
        IiiIIIiiiI iiiIIIiiiI2 = object;
        Object object = worldSchematic;
        IiiIIIiiiI iIiIiIIIII3 = iiiIIIiiiI2;
        object = new IIiiIIIiiI(iIiIiIIIII3.iIIiiIiIiI.field_1724.method_37908(), (WorldSchematic)object, (class_2338)iIiIiIIIII2);
        if (((Boolean)iIiIiIIIII3.IIiIiiiiII.get()).booleanValue() && ((IIiiIIIiiI)object).iIIiIiiiIi.method_26204() instanceof class_2482 && !iIiIiIIIII3.ALLATORIxDEMO((class_2338)iIiIiIIIII2, (IIiiIIIiiI)object)) {
            return (3 & 4) != 0;
        }
        if (iIiIiIIIII3.ALLATORIxDEMO((class_2338)iIiIiIIIII2) && iIiIiIIIII3.ALLATORIxDEMO(((IIiiIIIiiI)object).iIIiIiiiIi) && iIiIiIIIII3.ALLATORIxDEMO((IIiiIIIiiI)object) && iIiIiIIIII3.iiiIiIiiIi((class_2338)iIiIiIIIII2) && iIiIiIIIII3.iiiIiIiiIi(((IIiiIIIiiI)object).iIIiIiiiIi) && !iIiIiIIIII3.iiiiIiiIIi.contains(iIiIiIIIII2) && !iIiIiIIIII3.IiiiiIiIiI.ALLATORIxDEMO((class_2338)iIiIiIIIII2)) {
            return --1 != 0;
        }
        return false;
    }
}

