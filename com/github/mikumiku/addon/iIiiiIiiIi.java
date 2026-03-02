/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ModuleListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.entity.DamageUtils
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.CardinalDirection
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1511
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2824
 *  net.minecraft.class_2879
 *  net.minecraft.class_304
 *  net.minecraft.class_3191
 *  net.minecraft.class_5892
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiiIIiiII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.github.mikumiku.addon.mixin.WorldRendererAccessor;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.github.mikumiku.addon.modules.Surround;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ModuleListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.entity.DamageUtils;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.CardinalDirection;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2824;
import net.minecraft.class_2879;
import net.minecraft.class_304;
import net.minecraft.class_3191;
import net.minecraft.class_5892;

public class iIiiiIiiIi
extends iIiIiIIIii {
    private final Setting<Boolean> IiiIIiIIiI;
    private final Setting<SettingColor> iIIIIiiiii;
    private final Setting<SettingColor> IiIiIiIIii;
    private final Setting<List<Module>> iiiIiIiiII;
    public ArrayList<Module> IIiiiiIIii;
    private final Setting<Boolean> IiiiiIIiII;
    private final Setting<SettingColor> iIIIIIiiII;
    private final Setting<Integer> iIIiiiiIii;
    private final class_2338.class_2339 iiIIIiIIIi;
    private final Setting<Boolean> iIiiiiIIII;
    private final Setting<Boolean> iiIiIIiiii;
    private final Setting<Boolean> iIIiIiiIiI;
    private final Setting<Boolean> iIIIIIIiII;
    private final Setting<Boolean> iIIiiIIIIi;
    private final Setting<SettingColor> IiiiiIiIiI;
    private final Setting<List<class_2248>> iiiIiIIiii;
    private final Setting<ShapeMode> iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<SettingColor> iIiIIiIIIi;
    private final class_2338.class_2339 IIiIiiiiII;
    private final SettingGroup IIiiIIIIIi;
    private final SettingGroup iIiiiIiIii;
    private final Setting<Boolean> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private int IiiIiIiiIi;
    private final class_2338.class_2339 IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private final Setting<Surround.Center> iiiiiIIiIi;
    private final SettingGroup iIIiIiiiIi;
    private final Setting<SettingColor> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    public iIiiiIiiIi() {
        iIiiiIiiIi iIiiiIiiIi2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, MoveEvent.ALLATORIxDEMO("\u56be\u8116"), IiiiIIiiII.iiIIiIIiii("\u4f2b\u7523\u65ed\u575c\u5f9f\u9034\u5351\u88f2\u81be\u5dfa\u76f0\u73a2\u8de7\uff07\u51ce\u5c4f\u6c60\u667d\u7255\u70b4\u9074\u621b\u76cd\u4f32\u5bb0\u305e"));
        iIiiiIiiIi2.iIIiIiiiIi = iIiiiIiiIi2.settings.getDefaultGroup();
        iIiiiIiiIi2.IIiiIIIIIi = iIiiiIiiIi2.settings.createGroup(MoveEvent.ALLATORIxDEMO("\u526d\u634e\u8bf4\u7f62"));
        iIiiiIiiIi2.iIiiiIiIii = iIiiiIiiIi2.settings.createGroup(IiiiIIiiII.iiIIiIIiii("\u6e7b\u67c5\u8bbd\u7f32"));
        class_2248[] class_2248Array = new class_2248[--4];
        class_2248Array[3 & 4] = class_2246.field_10540;
        class_2248Array[--1] = class_2246.field_22423;
        class_2248Array[5 >> 1] = class_2246.field_10443;
        class_2248Array[--3] = class_2246.field_22108;
        iIiiiIiiIi2.iiiIiIIiii = iIiiiIiiIi2.iIIiIiiiIi.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u65d3\u577b\u7c31\u5787"))).description(IiiiIIiiII.iiIIiIIiii("\u7529\u4ed0\u5351\u88f2\u81b9\u8ea7\u76d0\u65b2\u571e\u7c6d\u5788\u305e"))).defaultValue(class_2248Array).filter(class_22482 -> {
            iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
            iIiiiIiiIi iIiiiIiiIi3 = class_22482;
            iIiiiIiiIi iIiIiIIIII2 = iIiiiIiiIi2;
            if (iIiiiIiiIi3 == class_2246.field_10540 || iIiiiIiiIi3 == class_2246.field_22423 || iIiiiIiiIi3 == class_2246.field_22108 || iIiiiIiiIi3 == class_2246.field_10443 || iIiiiIiiIi3 == class_2246.field_23152) {
                return true;
            }
            return false;
        }).build());
        this.iIIiiiiIii = this.iIIiIiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6554\u7f42\u5ebc\u8fd3"))).description(IiiiIIiiII.iiIIiIIiii("\u6bc4\u6b75\u6535\u7f1a\u6592\u5703\u4e40\u95f5\u76da\u5ea2\u8fd4\uff5b\u4ee9\u526f\u4e31\u531c\u4f5b\uff0a\u305e"))).min(3 ^ 3).defaultValue((Object)(3 ^ 3))).build());
        this.iiiiiIIiIi = this.iIIiIiiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u8180\u5284\u5c0f\u4e21"))).description(IiiiIIiiII.iiIIiIIiii("\u5424\u757c\u5405\u4f6e\u5c2d\u73fd\u5bbd\u4f21\u905f\u81a7\u5f58\u521e\u65b5\u5703\u4e26\u5f8a\u4f5b\u7f6d\u305e"))).defaultValue((Object)Surround.Center.iIIiiIiIiI)).build());
        this.iIIiiIIIIi = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u79f7\u52c2\u65da\u66c8\u5050"))).description(IiiiIIiiII.iiIIiIIiii("\u5f00\u73a5\u5be2\u79f0\u52e1\u65e0\u6681\u5000"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiIiiIiI = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u53a6\u5c6e\u9a92\u5eaa"))).description(IiiiIIiiII.iiIIiIIiii("\u5723\u53cb\u59c0\u5351\u88f2\u65cd\u577c\u4e5e\u65b2\u51d9\u6535\u7f1a\u4e2b\u5c16\u9eda\u66dd\u77ad\uff58\u9639\u6b31\u4eda\u4eee\u76ff\u63ec\u7822\u9631\u305e"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.ALLATORIxDEMO = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u4e8f\u5724\u575a\u974e\u7555\u6544"))).description(IiiiIIiiII.iiIIiIIiii("\u4e91\u5f58\u73a8\u5be8\u7a8d\u5723\u65ea\u575b\u4e5e\u65fd\u6204\u5df3\u4f5f\u305e"))).defaultValue((Object)(5 >> 2))).build());
        this.iIiiiiIIII = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5403\u7562\u65fa\u5139\u95e1\u511c\u4efa\u6a6b\u575b"))).description(IiiiIIiiII.iiIIiIIiii("\u577c\u5424\u52fc\u530e\u888d\u6a0a\u5703\u65fd\u81eb\u52f6\u5127\u95e6\u6354\u5b96\u76d0\u517d\u4e9f\u6a37\u5754\u305e"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIIIIIIiII = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u517f\u95a7\u5402\u91a7\u659c\u5465\u7524"))).description(IiiiIIiiII.iiIIiIIiii("\u5703\u5351\u88f2\u6a75\u575c\u5107\u95c6\u65a2\uff07\u91cc\u65ee\u5f54\u5424\u4e18\u5241\u5127\u95e6\u76cd\u6a37\u5754\u305e"))).defaultValue((Object)((3 ^ 3) != 0))).visible(() -> this.iIiiiiIIII.get())).build());
        this.iiiIiIiiII = this.iIIiIiiiIi.add((Setting)((ModuleListSetting.Builder)((ModuleListSetting.Builder)((ModuleListSetting.Builder)new ModuleListSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u53db\u5f1b\u54e1\u6a6b\u575b"))).description(IiiiIIiiII.iiIIiIIiii("\u630c\u5bee\u5703\u547b\u7523\u5304\u88a7\u6a75\u575c\u65a5\u5e98\u5127\u95e6\u76cd\u6a37\u5754\u305e"))).visible(() -> this.iIiiiiIIII.get())).build());
        this.IiiiiIIiII = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u9658\u6288\u787e\u5743"))).description(IiiiIIiiII.iiIIiIIiii("\u5c49\u8bde\u6207\u6382\u541c\u56df\u76d0\u6c3f\u6677\u4ebb\u9666\u6b69\u5356\u88f5\u65ed\u575c\u88e2\u7822\u574c\u305e"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiIiiIIII = this.IIiiIIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u9ad4\u5eec\u53d4\u537c\u65da\u5139\u95e1"))).description(IiiiIIiiII.iiIIiIIiii("\u5f07\u73a2\u5be2\u9ad3\u5ef2\uff03-\u577b\u6853\uff02\u538c\u531d\u6582\u81c1\u52fc\u798a\u7529\uff56\u59d6\u8df8\u8d90\u300d\u4e5e\u53fb\u967f\u7b5f\uff0a\u305e"))).defaultValue((Object)(3 >> 2))).build());
        this.iIIiiIiIiI = this.IIiiIIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5b80\u625a\u6532\u7f04\u5422\u5139\u95e1"))).description(IiiiIIiiII.iiIIiIIiii("\u5f58\u6234\u6722\u65ed\u575c\u653f\u7f30\u5bd8\u621b\u545d\u81e6\u52fc\u5178\u95a4\u6a37\u5754\u305e"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIiIiiiiII = this.IIiiIIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6b77\u4ecb\u65da\u5139\u95e1"))).description(IiiiIIiiII.iiIIiIIiii("\u5f58\u73a8\u5be8\u6b2f\u4eaa\u65a5\u81e6\u52fc\u5178\u95a4\u6a37\u5754\u305e"))).defaultValue((Object)(5 >> 2))).build());
        this.IIIIiiIiii = this.iIiiiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6e78\u67df\u634f\u6267\u52e2\u4f50"))).description(IiiiIIiiII.iiIIiIIiii("\u654a\u7f45\u65ed\u575c\u65f7\u6e6c\u6787\u73a2\u5be5\u6247\u90bc\u632e\u52e1\u52be\u7538\u305e"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiiIIiIIiI = this.iIiiiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5445\u7504\u6e78\u67df"))).description(IiiiIIiiII.iiIIiIIiii("\u577c\u5378\u5c72\u6515\u7f3a\u9eda\u66dd\u77ad\u76d0\u4f46\u7f3d\u6e3e\u6787\u65b2\u571e\u8f78\u5ed0\u305e"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiIiIIiiii = this.iIiiiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6e78\u67df\u8170\u4e27\u65f3\u575b"))).description(IiiiIIiiII.iiIIiIIiii("\u667b\u542d\u6e61\u67df\u814e\u4e00\u76cd\u65af\u5754\u305e"))).defaultValue((Object)(3 >> 2))).build());
        this.iIIIiiiiIi = this.iIiiiIiIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6e58\u67ff\u6a6b\u5f03"))).description(IiiiIIiiII.iiIIiIIiii("\u63a6\u5268\u65ed\u575c\u5f31\u72ba\u76d0\u6e39\u679a\u65af\u5f0c\u305e"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIiIIiIIIi = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5b85\u5122\u65b5\u573d\u974e\u98d6\u827e"))).description(IiiiIIiiII.iiIIiIIiii("\u5bdd\u5163\u65ea\u575b\u76d0\u8863\u972b\u988a\u8271\u305e"))).defaultValue(new SettingColor(0x4F & 0x3D, 0x17FF & 0x68FF, 3 ^ 3, 5 >> 3)).visible(() -> {
            if (((Boolean)this.IiiIIiIIiI.get()).booleanValue() && this.iIIIiiiiIi.get() != ShapeMode.Lines) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.iIIIIiiiii = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5b85\u5122\u65b5\u573d\u7e93\u98d6\u827e"))).description(IiiiIIiiII.iiIIiIIiii("\u5bdd\u5163\u65ea\u575b\u76d0\u7eb4\u6728\u988a\u8271\u305e"))).defaultValue(new SettingColor(0x1D & 0x6F, 0x50FF & 0x2FFF, 3 & 4, 3 >> 2)).visible(() -> {
            if (((Boolean)this.IiiIIiIIiI.get()).booleanValue() && this.iIIIiiiiIi.get() != ShapeMode.Sides) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIiIiIIIII = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6662\u9050\u65b5\u573d\u974e\u98d6\u827e"))).description(IiiiIIiiII.iiIIiIIiii("\u663a\u9011\u65ea\u575b\u76d0\u8863\u972b\u988a\u8271\u305e"))).defaultValue(new SettingColor(3 >> 2, 0x22FF & 0x5DFF, 0x49EE & 0x36FF, 0x3D & 0x4E)).visible(() -> {
            if (((Boolean)this.IiiIIiIIiI.get()).booleanValue() && this.iIIIiiiiIi.get() != ShapeMode.Lines) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIIIIIiiII = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6662\u9050\u65b5\u573d\u7e93\u98d6\u827e"))).description(IiiiIIiiII.iiIIiIIiii("\u663a\u9011\u65ea\u575b\u76d0\u7eb4\u6728\u988a\u8271\u305e"))).defaultValue(new SettingColor(2 & 5, 0x36FF & 0x49FF, 0x31FF & 0x4EEE, 0x6D & 0x76)).visible(() -> {
            if (((Boolean)this.IiiIIiIIiI.get()).booleanValue() && this.iIIIiiiiIi.get() != ShapeMode.Sides) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IiiiiIiIiI = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u537d\u9623\u65b5\u573d\u974e\u98d6\u827e"))).description(IiiiIIiiII.iiIIiIIiii("\u5325\u9662\u65ea\u575b\u76d0\u8863\u972b\u988a\u8271\u305e"))).defaultValue(new SettingColor(0x75FE & 0xACD, 5 >> 3, 2 & 5, 0x5F & 0x2C)).visible(() -> {
            if (((Boolean)this.IiiIIiIIiI.get()).booleanValue() && this.iIIIiiiiIi.get() != ShapeMode.Lines) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.IiIiIiIIii = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u537d\u9623\u65b5\u573d\u7e93\u98d6\u827e"))).description(IiiiIIiiII.iiIIiIIiii("\u5325\u9662\u65ea\u575b\u76d0\u7eb4\u6728\u988a\u8271\u305e"))).defaultValue(new SettingColor(0x3FDF & 0x40EC, 5 >> 3, 5 >> 3, 0x74 & 0x6F)).visible(() -> {
            if (((Boolean)this.IiiIIiIIiI.get()).booleanValue() && this.iIIIiiiiIi.get() != ShapeMode.Sides) {
                return --1 != 0;
            }
            return false;
        })).build());
        iIiiiIiiIi iIiiiIiiIi3 = this;
        iIiiiIiiIi iIiiiIiiIi4 = this;
        iIiiiIiiIi4.iiIIIiIIIi = new class_2338.class_2339();
        iIiiiIiiIi iIiiiIiiIi5 = this;
        iIiiiIiiIi3.IIiIiiiiII = new class_2338.class_2339();
        iIiiiIiiIi iIiiiIiiIi6 = this;
        iIiiiIiiIi5.IIiIiIIiii = new class_2338.class_2339();
        iIiiiIiiIi iIiiiIiiIi7 = this;
        iIiiiIiiIi3.IIiiiiIIii = new ArrayList();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u001dgh*9iJY:h+x/-J\u8bdb\u66be\u65bc\u527a\u670c\u65da\u7264\u6766\uff0d"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2338.class_2339 ALLATORIxDEMO(CardinalDirection cardinalDirection, int n) {
        void iIiIiIIIII2;
        iIiiiIiiIi iIiIiIIIII3;
        int n2 = n;
        iIiiiIiiIi iIiiiIiiIi2 = iIiIiIIIII3 = this;
        return iIiiiIiiIi2.ALLATORIxDEMO(iIiiiIiiIi2.iIIiiIiIiI.field_1724.method_24515(), (CardinalDirection)iIiIiIIIII2, n2);
    }

    public void onDeactivate() {
        iIiiiIiiIi iIiiiIiiIi2 = this;
        if (((Boolean)iIiiiIiiIi2.iIIIIIIiII.get()).booleanValue() && !iIiiiIiiIi2.IIiiiiIIii.isEmpty() && iIiiiIiiIi2.iIIiiIiIiI.field_1687 != null && iIiiiIiiIi2.iIIiiIiIiI.field_1724 != null) {
            for (Module module : iIiiiIiiIi2.IIiiiiIIii) {
                if (module.isActive()) continue;
                module.toggle();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iIiiiIiiIi iIiiiIiiIi2 = this;
        if (((Boolean)iIiiiIiiIi2.IiiIIiIIiI.get()).booleanValue()) {
            CardinalDirection cardinalDirection;
            void iIiIiIIIII2;
            if (((Boolean)iIiiiIiiIi2.iiIiIIiiii.get()).booleanValue()) {
                iIiiiIiiIi2.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2, null, -4 >> 2, 5 >> 3);
            }
            CardinalDirection[] cardinalDirectionArray = CardinalDirection.values();
            int n = cardinalDirectionArray.length;
            int n2 = this = 3 >> 2;
            while (n2 < n) {
                cardinalDirection = cardinalDirectionArray[this];
                iIiiiIiiIi2.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2, cardinalDirection, 5 >> 3, ((Boolean)iIiiiIiiIi2.iIIiIiiIiI.get()).booleanValue() ? 1 ^ 3 : 0);
                n2 = ++this;
            }
            if (((Boolean)iIiiiIiiIi2.iIIiIiiIiI.get()).booleanValue()) {
                cardinalDirectionArray = CardinalDirection.values();
                n = cardinalDirectionArray.length;
                int n3 = this = 2 & 5;
                while (n3 < n) {
                    cardinalDirection = cardinalDirectionArray[this];
                    iIiiiIiiIi2.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2, cardinalDirection, 2 ^ 3, --4);
                    n3 = ++this;
                }
            }
        }
    }

    private /* synthetic */ Color iiiIiIiiIi(class_2338 class_23382) {
        iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
        iIiiiIiiIi iIiiiIiiIi3 = class_23382;
        iIiiiIiiIi iIiIiIIIII2 = iIiiiIiiIi2;
        switch (iIiIiIIIII2.ALLATORIxDEMO((class_2338)iIiiiIiiIi3).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return (SettingColor)iIiIiIIIII2.iIIIIiiiii.get();
            }
            case 1: {
                return (SettingColor)iIiIiIIIII2.iIIIIIiiII.get();
            }
            case 2: {
                return (SettingColor)iIiIiIIIII2.IiIiIiIIii.get();
            }
        }
    }

    private /* synthetic */ boolean IIiIiIiIiI() {
        iIiiiIiiIi iIiiiIiiIi2 = this;
        boolean bl = Input.isPressed((class_304)iIiiiIiiIi2.iIIiiIiIiI.field_1690.field_1894) || Input.isPressed((class_304)iIiiiIiiIi2.iIIiiIiIiI.field_1690.field_1881) || Input.isPressed((class_304)iIiiiIiiIi2.iIIiiIiIiI.field_1690.field_1913) || Input.isPressed((class_304)iIiiiIiiIi2.iIIiiIiIiI.field_1690.field_1849) || Input.isPressed((class_304)iIiiiIiiIi2.iIIiiIiIiI.field_1690.field_1903);
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2338.class_2339 ALLATORIxDEMO(class_2338 class_23382, CardinalDirection cardinalDirection, int n) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iIiiiIiiIi iIiIiIIIII4;
        iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
        iIiiiIiiIi iIiiiIiiIi3 = class_23382;
        iIiiiIiiIi iIiiiIiiIi4 = iIiIiIIIII4 = iIiiiIiiIi2;
        if (iIiIiIIIII3 == null) {
            return iIiiiIiiIi4.IIiIiIIiii.method_10103(iIiiiIiiIi3.method_10263(), iIiiiIiiIi3.method_10264() + iIiIiIIIII2, iIiiiIiiIi3.method_10260());
        }
        return iIiiiIiiIi4.IIiIiIIiii.method_10103(iIiiiIiiIi3.method_10263() + iIiIiIIIII3.toDirection().method_10148(), iIiiiIiiIi3.method_10264() + iIiIiIIIII2, iIiiiIiiIi3.method_10260() + iIiIiIIIII3.toDirection().method_10165());
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        class_5892 iIiIiIIIII2;
        iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
        iIiiiIiiIi iIiiiIiiIi3 = iIiIiIIIII2.packet;
        if (iIiiiIiiIi3 instanceof class_5892 && (iIiiiIiiIi3 = iIiiiIiiIi2.iIIiiIiIiI.field_1687.method_8469((iIiIiIIIII2 = (class_5892)iIiiiIiiIi3).comp_2275())) == iIiiiIiiIi2.iIIiiIiIiI.field_1724 && ((Boolean)iIiiiIiiIi2.iIiIiiiiII.get()).booleanValue()) {
            iIiiiIiiIi iIiiiIiiIi4 = iIiiiIiiIi2;
            iIiiiIiiIi4.toggle();
            iIiiiIiiIi4.info(IiiiIIiiII.iiIIiIIiii("\u4f7a\u6b02\u4ea0\uff74\u51aa\u63d5\u51a2\u53fb\u0003"), new Object[3 & 4]);
        }
    }

    private /* synthetic */ Color ALLATORIxDEMO(class_2338 class_23382) {
        iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
        iIiiiIiiIi iIiiiIiiIi3 = class_23382;
        iIiiiIiiIi iIiIiIIIII2 = iIiiiIiiIi2;
        switch (iIiIiIIIII2.ALLATORIxDEMO((class_2338)iIiiiIiiIi3).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return (SettingColor)iIiIiIIIII2.iIiIIiIIIi.get();
            }
            case 1: {
                return (SettingColor)iIiIiIIIII2.iIiIiIIIII.get();
            }
            case 2: {
                return (SettingColor)iIiIiIIIII2.IiiiiIiIiI.get();
            }
        }
    }

    @Override
    public void onActivate() {
        iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
        if (iIiiiIiiIi2.iiiiiIIiIi.get() == Surround.Center.ALLATORIxDEMO) {
            PlayerUtils.centerPlayer();
        }
        iIiiiIiiIi2.IiiIiIiiIi = 3 >> 2;
        if (((Boolean)iIiiiIiiIi2.iIiiiiIIII.get()).booleanValue() && !((List)iIiiiIiiIi2.iiiIiIiiII.get()).isEmpty() && iIiiiIiiIi2.iIIiiIiIiI.field_1687 != null && iIiiiIiiIi2.iIIiiIiIiI.field_1724 != null) {
            for (iIiiiIiiIi iIiiiIiiIi3 : (List)iIiiiIiiIi2.iiiIiIiiII.get()) {
                if (!iIiiiIiiIi3.isActive()) continue;
                iIiiiIiiIi3.toggle();
                iIiiiIiiIi2.IIiiiiIIii.add(iIiiiIiiIi3);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent, CardinalDirection cardinalDirection, int n, int n2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        Color iIiIiIIIII4;
        int this22 = n;
        iIiiiIiiIi iIiIiIIIII5 = this;
        iIiIiIIIII5.IIiIiiiiII.method_10101((class_2382)iIiIiIIIII5.ALLATORIxDEMO((CardinalDirection)iIiIiIIIII4, this22));
        iIiiiIiiIi iIiiiIiiIi2 = iIiIiIIIII5;
        iIiIiIIIII4 = iIiiiIiiIi2.ALLATORIxDEMO((class_2338)iIiiiIiiIi2.IIiIiiiiII);
        Color this22 = iIiiiIiiIi2.iiiIiIiiIi((class_2338)iIiiiIiiIi2.IIiIiiiiII);
        iIiIiIIIII3.renderer.box((class_2338)iIiIiIIIII5.IIiIiiiiII, iIiIiIIIII4, this22, (ShapeMode)iIiIiIIIII5.iIIIiiiiIi.get(), (int)iIiIiIIIII2);
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        return IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
            iIiiiIiiIi iIiiiIiiIi3 = class_17992;
            iIiiiIiiIi iIiIiIIIII2 = iIiiiIiiIi2;
            return ((List)iIiIiIIIII2.iiiIiIIiii.get()).contains(class_2248.method_9503((class_1792)iIiiiIiiIi3.method_7909()));
        });
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(CardinalDirection cardinalDirection, int n) {
        iIiiiIiiIi iIiiiIiiIi2;
        boolean iIiIiIIIII422;
        int this232;
        iIiiiIiiIi iIiIiIIIII3;
        block4: {
            void iIiIiIIIII422;
            iIiiiIiiIi iIiiiIiiIi4;
            iIiiiIiiIi this232 = cardinalDirection;
            iIiIiIIIII3 = iIiiiIiiIi4;
            iIiIiIIIII3.iiIIIiIIIi.method_10101((class_2382)iIiIiIIIII3.ALLATORIxDEMO((CardinalDirection)this232, (int)iIiIiIIIII422));
            this232 = iIiIiIIIII3.ALLATORIxDEMO();
            int iIiIiIIIII422 = 3 >> 2;
            if (this232 != -4 >> 2) {
                IiIiiiiIii.ALLATORIxDEMO(this232);
                iIiIiIIIII422 = iIiIiiIIIi.iiIIiIIiii((class_2338)iIiIiIIIII3.iiIIIiIIIi);
                IiIiiiiIii.ALLATORIxDEMO(this232);
            }
            this232 = 0;
            for (class_3191 class_31912 : ((WorldRendererAccessor)iIiIiIIIII3.iIIiiIiIiI.field_1769).getBlockBreakingInfos().values()) {
                if (!class_31912.method_13991().equals((Object)iIiIiIIIII3.iiIIIiIIIi)) continue;
                this232 = --1;
                iIiiiIiiIi2 = iIiIiIIIII3;
                break block4;
            }
            iIiiiIiiIi2 = iIiIiIIIII3;
        }
        boolean bl = iIiiiIiiIi2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIiIIIII3.iiIIIiIIIi).method_45474() || this232 != 0;
        if (((Boolean)iIiIiIIIII3.IiiiiIIiII.get()).booleanValue() && !iIiIiIIIII422 && bl) {
            Object this232 = new class_238((double)(iIiIiIIIII3.iiIIIiIIIi.method_10263() - (4 ^ 5)), (double)(iIiIiIIIII3.iiIIIiIIIi.method_10264() - (3 & 5)), (double)(iIiIiIIIII3.iiIIIiIIIi.method_10260() - --1), (double)(iIiIiIIIII3.iiIIIiIIIi.method_10263() + (3 >> 1)), (double)(iIiIiIIIII3.iiIIIiIIIi.method_10264() + (5 >> 2)), (double)(iIiIiIIIII3.iiIIIiIIIi.method_10260() + (4 ^ 5)));
            Object object = class_12972 -> {
                iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
                iIiiiIiiIi iIiiiIiiIi3 = class_12972;
                iIiiiIiiIi iIiIiIIIII2 = iIiiiIiiIi2;
                if (iIiiiIiiIi3 instanceof class_1511 && DamageUtils.crystalDamage((class_1309)iIiIiIIIII2.iIIiiIiIiI.field_1724, (class_243)iIiiiIiiIi3.method_19538()) < PlayerUtils.getTotalHealth()) {
                    return (2 ^ 3) != 0;
                }
                return false;
            };
            this232 = iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8333(null, (class_238)this232, (Predicate)object).iterator();
            Iterator iterator = this232;
            while (iterator.hasNext()) {
                object = (class_1297)this232.next();
                iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(new IiIiiiIIIi((float)Rotations.getYaw((class_1297)object), (float)Rotations.getPitch((class_1297)object)));
                iIiiiIiiIi iIiiiIiiIi3 = iIiIiIIIII3;
                iIiIiIIIII3.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)class_2824.method_34206((class_1297)object, (boolean)iIiiiIiiIi3.iIIiiIiIiI.field_1724.method_5715()));
                iIiiiIiiIi3.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2879(class_1268.field_5808));
                iterator = this232;
            }
        }
        return iIiIiIIIII422;
    }

    private /* synthetic */ Surround.BlockType ALLATORIxDEMO(class_2338 class_23382) {
        class_2680 class_26802;
        iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
        iIiiiIiiIi iIiiiIiiIi3 = class_23382;
        iIiiiIiiIi iIiIiIIIII2 = iIiiiIiiIi2;
        iIiiiIiiIi3 = iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiiiIiiIi3);
        if (class_26802.method_26204().method_36555() < 0.0f) {
            return Surround.BlockType.ALLATORIxDEMO;
        }
        if (iIiiiIiiIi3.method_26204().method_9520() >= 600.0f) {
            return Surround.BlockType.iiiiiIIiIi;
        }
        return Surround.BlockType.iIiIiIIIII;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        CardinalDirection[] cardinalDirectionArray = cardinalDirectionArray3;
        if (cardinalDirectionArray.IiiIiIiiIi > 0) {
            cardinalDirectionArray.IiiIiIiiIi -= 4 ^ 5;
            return;
        }
        cardinalDirectionArray.IiiIiIiiIi = (Integer)cardinalDirectionArray.iIIiiiiIii.get();
        if (((Boolean)cardinalDirectionArray.iIIiiIIIIi.get()).booleanValue() && cardinalDirectionArray.IIiIiIiIiI()) {
            return;
        }
        if (((Boolean)cardinalDirectionArray.iiiIiiIIII.get()).booleanValue() && cardinalDirectionArray.iIIiiIiIiI.field_1724.field_5971 != cardinalDirectionArray.iIIiiIiIiI.field_1724.method_23318()) {
            cardinalDirectionArray.toggle();
            return;
        }
        if (!((Boolean)cardinalDirectionArray.ALLATORIxDEMO.get()).booleanValue() || cardinalDirectionArray.iIIiiIiIiI.field_1724.method_24828()) {
            if (cardinalDirectionArray.ALLATORIxDEMO() != -4 >> 2) {
                int n;
                block15: {
                    CardinalDirection[] cardinalDirectionArray2;
                    CardinalDirection cardinalDirection;
                    int n2;
                    int n3;
                    CardinalDirection[] cardinalDirectionArray3;
                    int iIiIiIIIII2;
                    block14: {
                        if (cardinalDirectionArray.iiiiiIIiIi.get() == Surround.Center.iIiIiIIIII) {
                            PlayerUtils.centerPlayer();
                        }
                        iIiIiIIIII2 = 0;
                        cardinalDirectionArray3 = CardinalDirection.values();
                        n3 = cardinalDirectionArray3.length;
                        int n4 = n2 = 3 ^ 3;
                        while (n4 < n3) {
                            cardinalDirection = cardinalDirectionArray3[n2];
                            if (cardinalDirectionArray.ALLATORIxDEMO(cardinalDirection, 3 ^ 3)) {
                                cardinalDirectionArray2 = cardinalDirectionArray;
                                break block14;
                            }
                            ++iIiIiIIIII2;
                            n4 = ++n2;
                        }
                        cardinalDirectionArray2 = cardinalDirectionArray;
                    }
                    if (((Boolean)cardinalDirectionArray2.iIIiIiiIiI.get()).booleanValue()) {
                        if (iIiIiIIIII2 == --4) {
                            cardinalDirectionArray3 = CardinalDirection.values();
                            n3 = cardinalDirectionArray3.length;
                            int n5 = n2 = 5 >> 3;
                            while (n5 < n3) {
                                cardinalDirection = cardinalDirectionArray3[n2];
                                if (cardinalDirectionArray.ALLATORIxDEMO(cardinalDirection, --1)) {
                                    n = iIiIiIIIII2;
                                    break block15;
                                }
                                ++iIiIiIIIII2;
                                n5 = ++n2;
                            }
                        }
                    }
                    n = iIiIiIIIII2;
                }
                int this_ = n == (((Boolean)cardinalDirectionArray.iIIiIiiIiI.get()).booleanValue() ? 0x4D & 0x3A : 4) ? 5 >> 2 : 0;
                if (this_ != 0 && ((Boolean)cardinalDirectionArray.iIIiiIiIiI.get()).booleanValue()) {
                    cardinalDirectionArray.toggle();
                    return;
                }
                if (this_ == 0 && cardinalDirectionArray.iiiiiIIiIi.get() == Surround.Center.iIIiiIiIiI) {
                    PlayerUtils.centerPlayer();
                }
            }
        }
    }
}

