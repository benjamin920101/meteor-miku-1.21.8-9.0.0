/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ShovelItem
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIIIiIi;
import com.github.mikumiku.addon.IIiiiIIiIi;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.modules.GhostMine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIiIiiiii
extends iIiIiIIIii {
    private IIiiIIIiIi iIiiiiIIII;
    public static final List<class_2248> iiIiIIiiii;
    private final Setting<SettingColor> iIIiIiiIiI;
    private final Setting<Boolean> iIIIIIIiII;
    private final Setting<SettingColor> iIIiiIIIIi;
    public static IIiiIIIiIi IiiiiIiIiI;
    public Setting<Boolean> iiiIiIIiii;
    public static iIIiIiiiii iIIIiiiiIi;
    private final Setting<SettingColor> iiiIiiIIII;
    private final List<IIiiIIIiIi> iIiIIiIIIi;
    public Setting<Integer> IIiIiiiiII;
    private final Setting<SettingColor> IIiiIIIIIi;
    public Setting<Boolean> iIiiiIiIii;
    private final Setting<ShapeMode> iIiIiiiiII;
    public Setting<Double> IIIIiiIiii;
    public Setting<GhostMine.SwapMode> IiiIiIiiIi;
    public static IIiiIIIiIi IIiIiIIiii;
    private int iIIiiIiIiI;
    public static IIiiIIIiIi iiiiiIIiIi;
    private final SettingGroup iIIiIiiiIi;
    public Setting<Integer> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    public static void ALLATORIxDEMO(class_2338 iIiIiIIIII2) {
        int n = 2 & 5;
        class_310.method_1551().field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12968, iIiIiIIIII2.method_10069(n, 0x336D & 0x4DBE, n), class_2350.field_11036));
        int n2 = 3 ^ 3;
        class_310.method_1551().field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIiIiIIIII2.method_10069(n2, 0x61AC & 0x1F7F, n2), class_2350.field_11036));
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    public void ALLATORIxDEMO(PacketEvent.Send send) {
        void iIiIiIIIII2;
        iIIiIiiiii iIIiIiiiii2 = iIIiIiiiii3;
        class_2596 class_25962 = iIiIiIIIII2.packet;
        if (class_25962 instanceof class_2846) {
            iIIiIiiiii iIIiIiiiii3 = (class_2846)class_25962;
            if (iIIiIiiiii3.method_12363() == class_2846.class_2847.field_12968 && iiIiIIiiii.contains(iIIiIiiiii2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii3.method_12362()).method_26204())) {
                iIiIiIIIII2.cancel();
                iIIiIiiiii.ALLATORIxDEMO(iIIiIiiiii3.method_12362());
            }
            if (iIIiIiiiii3.method_12363() == class_2846.class_2847.field_12971 && iiIiIIiiii.contains(iIIiIiiiii2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii3.method_12362()).method_26204())) {
                iIiIiIIIII2.cancel();
                iIIiIiiiii.ALLATORIxDEMO(iIIiIiiiii3.method_12362());
            }
            if (iIIiIiiiii3.method_12363() == class_2846.class_2847.field_12973 && iiIiIIiiii.contains(iIIiIiiiii2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii3.method_12362()).method_26204())) {
                iIiIiIIIII2.cancel();
                iIIiIiiiii.ALLATORIxDEMO(iIIiIiiiii3.method_12362());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(class_2338 class_23382, class_2350 class_23502) {
        void iIiIiIIIII2;
        iIIiIiiiii iIiIiIIIII3;
        iIIiIiiiii iIIiIiiiii2 = iIIiIiiiii3;
        iIIiIiiiii iIIiIiiiii3 = class_23502;
        iIIiIiiiii iIIiIiiiii4 = iIiIiIIIII3 = iIIiIiiiii2;
        iIIiIiiiii4.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
        iIIiIiiiii4.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, (class_2338)iIiIiIIIII2, (class_2350)iIIiIiiiii3));
        iIIiIiiiii4.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
        iIIiIiiiii4.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12968, (class_2338)iIiIiIIIII2, (class_2350)iIIiIiiiii3));
        iIIiIiiiii4.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
        iIIiIiiiii iIIiIiiiii5 = iIiIiIIIII3;
        if (!((Boolean)iIIiIiiiii4.iiiIiIIiii.get()).booleanValue()) {
            iIIiIiiiii5.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12971, (class_2338)iIiIiIIIII2, (class_2350)iIIiIiiiii3));
            return;
        }
        iIIiIiiiii5.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, (class_2338)iIiIiIIIII2, (class_2350)iIIiIiiiii3));
    }

    public void onDeactivate() {
        IIiIiIIiii = null;
        iiiiiIIiIi = null;
        iIIiIiiiii iIIiIiiiii2 = this;
        iIIiIiiiii2.iIiiiiIIII = null;
        IiiiiIiIiI = null;
        iIIiIiiiii2.iIIiiIiIiI = 2 & 5;
    }

    public static int ALLATORIxDEMO() {
        int n = 2 & 5;
        class_310 class_3102 = class_310.method_1551();
        if (IIiIiIIiii != null && class_3102.field_1687.method_8320(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii).method_26204() != class_2246.field_10124) {
            ++n;
        }
        if (iiiiiIIiIi != null && class_3102.field_1687.method_8320(iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii).method_26204() != class_2246.field_10124) {
            ++n;
        }
        return n;
    }

    public iIIiIiiiii() {
        iIIiIiiiii iIIiIiiiii2 = this;
        super(IIiiiIIiIi.ALLATORIxDEMO("\u53ff\u5363\u6338\u63fe"), iIIIIiIiii.ALLATORIxDEMO("\u4f74\u750b\u53dd\u5321\u5fe0\u903c\u6300\u63a6\u65e5\u5723"));
        iIIiIiiiii2.iIIiIiiiIi = iIIiIiiiii2.settings.getDefaultGroup();
        iIIiIiiiii2.IIiIiiiiII = iIIiIiiiii2.iIIiIiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u6338\u63fe\u832d\u5692"))).description(iIIIIiIiii.ALLATORIxDEMO("\u8bc8\u7f65\u6335\u6394\u659d\u575c\u76a7\u6716\u5919\u8d81\u79cf"))).sliderRange(3 & 5, 0x17 & 0x6E).defaultValue((Object)(0x47 & 0x3E))).build());
        this.IIIIiiIiii = this.iIIiIiiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u6338\u63fe\u9031\u5ec0"))).description(iIIIIiIiii.ALLATORIxDEMO("\u63d1\u523d\u6335\u6394\u659d\u575c\u76a7\u9009\u5e98\u5051\u73f3"))).sliderRange(0.65, 1.0).defaultValue(0.85).build());
        this.iiiIiIIiii = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u53e2\u6370"))).description(iIIIIiIiii.ALLATORIxDEMO("\u542f\u65a8\u6360\u6393\u4e07\u4e26\u659d\u575c\u4ec6\u63c6\u9ae6\u6514\u73f3"))).defaultValue((Object)(3 >> 1))).build());
        this.iIiiiIiIii = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u81c4\u52ce\u91e3\u6370"))).description(iIIIIiIiii.ALLATORIxDEMO("\u81b4\u52de\u91c6\u6593\u631a\u63bc\u5df9\u7817\u5759\u76ba\u65e5\u5723"))).defaultValue((Object)(5 >> 2))).build());
        this.iIiIiIIIII = this.iIIiIiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u91e3\u6370\u5ed8\u8fb9"))).description(iIIIIiIiii.ALLATORIxDEMO("\u91c6\u6593\u631d\u63bb\u65b2\u5774\u5213\u76f2\u5efd\u8ffc\u65fa\u95d0#W\u007f]7]"))).sliderRange(2 & 5, 0x7B & 0xE).defaultValue((Object)(3 & 4))).visible(() -> this.iIiiiIiIii.get())).build());
        this.IiiIiIiiIi = this.iIIiIiiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u5229\u6304\u6a0f\u5f69"))).description(iIIIIiIiii.ALLATORIxDEMO("\u902a\u62e5\u5dc1\u517c\u5224\u6374\u76ba\u65e5\u5f7b"))).defaultValue((Object)GhostMine.SwapMode.iIIiIiiiIi)).visible(() -> (3 & 4) != 0)).build());
        iIIiIiiiii iIIiIiiiii3 = this;
        iIIiIiiiii3.ALLATORIxDEMO = iIIiIiiiii3.settings.createGroup(IIiiiIIiIi.ALLATORIxDEMO("\u6e1c\u67b5\u8b90\u7f08"));
        iIIiIiiiii3.iIIIIIIiII = iIIiIiiiii3.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6628\u7904\u6e6e\u67a7"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u6621\u5460\u6610\u795c\u6b6d\u576e\u6338\u63fe\u6597\u5731\u76aa\u5389\u89e8\u5370\u6566\u67fa"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIiIiiiiII = this.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5f3e\u72c2"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u904f\u62c7\u6e54\u67fd\u5f04\u7298\u76e2\u6610\u795c\u6597\u5f69"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iiiIiiIIII = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5b87\u6233\u4fb1\u975c\u98c0\u8206"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u65b7\u5711\u6338\u63fe\u5ba2\u6276\u65d8\u4fc1\u974c\u76e2\u98b2\u8214"))).defaultValue(new SettingColor(0x60FF & 0x1FFF, 0x45F4 & 0x3ACB, 0x57FF & 0x28CB, 0x77 & 0x58)).build());
        int n = 0x4DFF & 0x32FF;
        this.IIiiIIIIIi = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5b87\u6233\u8faf\u6878\u98c0\u8206"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u65b7\u5711\u6338\u63fe\u5ba2\u6276\u65d8\u8fdf\u6868\u76e2\u98b2\u8214"))).defaultValue(new SettingColor(n, 0x11C9 & 0x6EF6, 0x2CCF & 0x53FB, n)).build());
        this.iIIiiIIIIi = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4fb1\u975c\u98c0\u8206"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u6b25\u5706\u6370\u63b6\u65df\u5779\u4fc1\u974c\u76e2\u98b2\u8214"))).defaultValue(new SettingColor(0x5BFF & 0x24FF, 0xCC0 & 0x73FF, 0x30CF & 0x4FFB, 0x54 & 0x7B)).build());
        int n2 = 0x5DFF & 0x22FF;
        this.iIIiIiiIiI = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u8faf\u6878\u98c0\u8206"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u6b25\u5706\u6370\u63b6\u65df\u5779\u8fdf\u6868\u76e2\u98b2\u8214"))).defaultValue(new SettingColor(n2, 0x7DC3 & 0x2FC, 0x29DB & 0x56EF, n2)).build());
        iIIiIiiiii iIIiIiiiii4 = this;
        iIIiIiiiii4.iIiIIiIIIi = new ArrayList<IIiiIIIiIi>();
        this.iIiiiiIIII = null;
        this.iIIiiIiIiI = 2 & 5;
        iIIIiiiiIi = this;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIiIiii.ALLATORIxDEMO("{onBxF+V{GjW;W+\u8bd4\u66f8\u6594\u523b\u6723\u65a6\u7276\u6770\uff75"));
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Pre var1_7) {
        block50: {
            block51: {
                block49: {
                    v0 = this;
                    this = var1_7;
                    iIiIiIIIII = v0;
                    if (iIiIiIIIII.iIIiiIiIiI == null) {
                        iIiIiIIIII.iIIiiIiIiI = (int)class_310.method_1551();
                    }
                    v1 = iIiIiIIIII;
                    v1.ALLATORIxDEMO();
                    v1.iIIiiIiIiI += 2 ^ 3;
                    if (((Boolean)v1.iiiIiIIiii.get()).booleanValue()) break block49;
                    if (iIIiIiiiii.IIiIiIIiii != null && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii).method_26204() == class_2246.field_10124) {
                        iIIiIiiiii.IIiIiIIiii = null;
                    }
                    if (iIIiIiiiii.IIiIiIIiii != null && !iIIiIiiiii.IIiIiIIiii.IIIIiiIiii) {
                        iIiIiIIIII.ALLATORIxDEMO(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii, iIIiIiiiii.IIiIiIIiii.iiiiiIIiIi);
                        iIIiIiiiii.IIiIiIIiii.IIIIiiIiii = --1;
                    }
                    if (iIIiIiiiii.IIiIiIIiii != null && iIIiIiiiii.IIiIiIIiii.IIIIiiIiii && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii).method_26204() == class_2246.field_10124 && ((Boolean)iIiIiIIIII.iIiiiIiIii.get()).booleanValue()) {
                        iIIiIiiiii.IIiIiIIiii.iIiIiiiiII = 5 >> 2;
                    }
                    if (iIIiIiiiii.IIiIiIIiii != null && iIIiIiiiii.IIiIiIIiii.IIIIiiIiii && !iIIiIiiiii.IIiIiIIiii.iIiIiIIIII) {
                        iIIiIiiiii.IIiIiIIiii.ALLATORIxDEMO();
                    }
                    if (iIIiIiiiii.IIiIiIIiii != null && !iIIiIiiiii.IIiIiIIiii.iIiIiiiiII && iIIiIiiiii.IIiIiIIiii.IIIIiiIiii && iIIiIiiiii.IIiIiIIiii.iIiIiIIIII) {
                        if (iIiIiIIIII.IiiIiIiiIi.get() == GhostMine.SwapMode.ALLATORIxDEMO) {
                            v2 = iIiIiIIIII;
                            this = v2.ALLATORIxDEMO(v2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii));
                            if (this != -4 >> 2) {
                                InvUtils.swap((int)this, (boolean)(2 ^ 3));
                            }
                        }
                        v3 = iIiIiIIIII;
                        v3.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIIiIiiiii.IIiIiIIiii.IIiIiIIiii, iIIiIiiiii.IIiIiIIiii.iiiiiIIiIi));
                        if (v3.IiiIiIiiIi.get() == GhostMine.SwapMode.ALLATORIxDEMO) {
                            InvUtils.swapBack();
                        }
                        v4 = iIiIiIIIII;
                        v4.iIiiiiIIII = iIIiIiiiii.IIiIiIIiii.iIIiiIiIiI != false ? iIIiIiiiii.IIiIiIIiii : null;
                        iIIiIiiiii.IIiIiIIiii = null;
                    }
                    if (iIiIiIIIII.iIiiiiIIII != null && iIIiIiiiii.IIiIiIIiii == null && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII.iIiiiiIIII.IIiIiIIiii).method_26204() != class_2246.field_10124 && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII.iIiiiiIIII.IIiIiIIiii).method_26204() != class_2246.field_10382 && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII.iIiiiiIIII.IIiIiIIiii).method_26204() != class_2246.field_10164 && ((Boolean)iIiIiIIIII.iIiiiIiIii.get()).booleanValue()) {
                        v5 = iIiIiIIIII;
                        if (v5.iIIiiIiIiI >= (Integer)v5.iIiIiIIIII.get() * --4) {
                            v6 = iIiIiIIIII;
                            this = v6.ALLATORIxDEMO(iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(v6.iIiiiiIIII.IIiIiIIiii));
                            if (this != -4 >> 2 && this != iIiiiIIiIi.ALLATORIxDEMO() && iIiIiIIIII.IiiIiIiiIi.get() == GhostMine.SwapMode.ALLATORIxDEMO) {
                                InvUtils.swap((int)this, (boolean)(--1 != 0));
                            }
                            if (this != -4 >> 2 && this != iIiiiIIiIi.ALLATORIxDEMO() && iIiIiIIIII.IiiIiIiiIi.get() == GhostMine.SwapMode.iIIiIiiiIi) {
                                InvUtils.swap((int)this, (boolean)(2 & 5));
                            }
                            iIiIiIIIII.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIiIiIIIII.iIiiiiIIII.IIiIiIIiii, iIiIiIIIII.iIiiiiIIII.iiiiiIIiIi));
                            iIiIiIIIII.iIIiiIiIiI = 5 >> 3;
                            if (this != -4 >> 2 && iIiIiIIIII.IiiIiIiiIi.get() == GhostMine.SwapMode.ALLATORIxDEMO) {
                                InvUtils.swapBack();
                                return;
                            }
                        }
                    }
                    break block50;
                }
                if (iIIiIiiiii.IIiIiIIiii != null && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii).method_26204() == class_2246.field_10124) {
                    iIIiIiiiii.IIiIiIIiii = null;
                }
                if (iIIiIiiiii.iiiiiIIiIi != null && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii).method_26204() == class_2246.field_10124) {
                    iIIiIiiiii.iiiiiIIiIi = null;
                }
                if (iIIiIiiiii.IIiIiIIiii != null && !iIIiIiiiii.IIiIiIIiii.IIIIiiIiii && iIIiIiiiii.iiiiiIIiIi == null) {
                    iIiIiIIIII.ALLATORIxDEMO(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii, iIIiIiiiii.IIiIiIIiii.iiiiiIIiIi);
                    iIIiIiiiii.IIiIiIIiii.IIIIiiIiii = 5 >> 2;
                }
                if (iIIiIiiiii.iiiiiIIiIi != null && !iIIiIiiiii.iiiiiIIiIi.IIIIiiIiii) {
                    if (iIIiIiiiii.IIiIiIIiii != null) {
                        iIiIiIIIII.ALLATORIxDEMO(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii, iIIiIiiiii.IIiIiIIiii.iiiiiIIiIi);
                    }
                    iIiIiIIIII.ALLATORIxDEMO(iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii, iIIiIiiiii.iiiiiIIiIi.iiiiiIIiIi);
                    iIIiIiiiii.iiiiiIIiIi.IIIIiiIiii = 3 >> 1;
                }
                if (iIIiIiiiii.IIiIiIIiii != null && iIIiIiiiii.IIiIiIIiii.IIIIiiIiii && !iIIiIiiiii.IIiIiIIiii.iIiIiIIIII) {
                    iIIiIiiiii.IIiIiIIiii.ALLATORIxDEMO();
                }
                if (iIIiIiiiii.iiiiiIIiIi != null && iIIiIiiiii.iiiiiIIiIi.IIIIiiIiii && !iIIiIiiiii.iiiiiIIiIi.iIiIiIIIII) {
                    iIIiIiiiii.iiiiiIIiIi.ALLATORIxDEMO();
                }
                if (iIIiIiiiii.IiiiiIiIiI != null && iIIiIiiiii.IiiiiIiIiI.IIIIiiIiii && !iIIiIiiiii.IiiiiIiIiI.iIiIiIIIII) {
                    iIIiIiiiii.IiiiiIiIiI.ALLATORIxDEMO();
                }
                if (iIIiIiiiii.IiiiiIiIiI != null && iIIiIiiiii.IiiiiIiIiI.iIiIiIIIII) {
                    iIIiIiiiii.IiiiiIiIiI = null;
                }
                if (iIIiIiiiii.IIiIiIIiii != null && !iIIiIiiiii.IIiIiIIiii.iIiIiiiiII && iIIiIiiiii.IIiIiIIiii.IIIIiiIiii && iIIiIiiiii.IIiIiIIiii.iIiIiIIIII && iIIiIiiiii.iiiiiIIiIi == null) {
                    if (iIiIiIIIII.IiiIiIiiIi.get() == GhostMine.SwapMode.ALLATORIxDEMO) {
                        v7 = iIiIiIIIII;
                        this = v7.ALLATORIxDEMO(v7.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii));
                        if (this != -4 >> 2) {
                            InvUtils.swap((int)this, (boolean)(--1 != 0));
                        }
                    }
                    iIiIiIIIII.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIIiIiiiii.IIiIiIIiii.IIiIiIIiii, iIIiIiiiii.IIiIiIIiii.iiiiiIIiIi));
                    v8 = iIiIiIIIII;
                    if (iIIiIiiiii.IIiIiIIiii.iIIiiIiIiI) {
                        v9 = iIiIiIIIII;
                        v8.iIiiiiIIII = new IIiiIIIiIi(iIiIiIIIII, iIIiIiiiii.IIiIiIIiii.IIiIiIIiii, iIIiIiiiii.IIiIiIIiii.iiiiiIIiIi);
                    } else {
                        v8.iIiiiiIIII = null;
                    }
                    iIIiIiiiii.IIiIiIIiii = null;
                    if (iIiIiIIIII.IiiIiIiiIi.get() == GhostMine.SwapMode.ALLATORIxDEMO) {
                        InvUtils.swapBack();
                    }
                }
                if (iIIiIiiiii.IIiIiIIiii == null || iIIiIiiiii.IIiIiIIiii.iIiIiiiiII || !iIIiIiiiii.IIiIiIIiii.IIIIiiIiii || !iIIiIiiiii.IIiIiIIiii.iIiIiIIIII || iIIiIiiiii.iiiiiIIiIi == null) break block51;
                if (iIiIiIIIII.IiiIiIiiIi.get() == GhostMine.SwapMode.ALLATORIxDEMO) {
                    v10 = iIiIiIIIII;
                    this = v10.ALLATORIxDEMO(v10.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii));
                    if (this != -4 >> 2) {
                        InvUtils.swap((int)this, (boolean)(3 & 5));
                    }
                }
                if (iIiIiIIIII.IiiIiIiiIi.get() != GhostMine.SwapMode.iIIiIiiiIi) ** GOTO lbl178
                v11 = iIiIiIIIII;
                this = v11.ALLATORIxDEMO(v11.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii));
                var2_8 = v11.ALLATORIxDEMO(v11.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii));
                if (this == -4 >> 2) {
                    if (var2_8 != -4 >> 2) {
                        InvUtils.swap((int)var2_8, (boolean)(5 >> 3));
                    }
                }
                if (this != -4 >> 2) {
                    if (var2_8 == -4 >> 2) {
                        InvUtils.swap((int)this, (boolean)(3 >> 2));
                    }
                }
                if (this == -4 >> 2) ** GOTO lbl178
                if (var2_8 == -4 >> 2 || this == var2_8) ** GOTO lbl178
                if (IiIiiIIIiI.iiiIiIiiIi(iIiIiIIIII.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909())) {
                    InvUtils.swap((int)this, (boolean)(3 ^ 3));
                    v12 = iIiIiIIIII;
                } else {
                    if (IiIiiIIIiI.iiiIiIiiIi(iIiIiIIIII.iIIiiIiIiI.field_1724.method_31548().method_5438(var2_8).method_7909())) {
                        InvUtils.swap((int)var2_8, (boolean)(3 & 4));
                    }
lbl178:
                    // 6 sources

                    v12 = iIiIiIIIII;
                }
                v12.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIIiIiiiii.IIiIiIIiii.IIiIiIIiii, iIIiIiiiii.IIiIiIIiii.iiiiiIIiIi));
                v13 = iIiIiIIIII;
                v13.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii, iIIiIiiiii.iiiiiIIiIi.iiiiiIIiIi));
                iIIiIiiiii.IIiIiIIiii = null;
                if (v13.IiiIiIiiIi.get() == GhostMine.SwapMode.ALLATORIxDEMO) {
                    InvUtils.swapBack();
                }
            }
            if (iIIiIiiiii.iiiiiIIiIi != null && iIIiIiiiii.iiiiiIIiIi.iIiIiIIIII) {
                v14 = iIiIiIIIII;
                if (iIIiIiiiii.iiiiiIIiIi.iIIiiIiIiI) {
                    v15 = iIiIiIIIII;
                    v14.iIiiiiIIII = new IIiiIIIiIi(iIiIiIIIII, iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii, iIIiIiiiii.iiiiiIIiIi.iiiiiIIiIi);
                } else {
                    v14.iIiiiiIIII = null;
                }
                if (iIIiIiiiii.IIiIiIIiii != null && iIIiIiiiii.IIiIiIIiii.iIiIiIIIII) {
                    iIiIiIIIII.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIIiIiiiii.IIiIiIIiii.IIiIiIIiii, iIIiIiiiii.IIiIiIIiii.iiiiiIIiIi));
                }
                iIiIiIIIII.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii, iIIiIiiiii.iiiiiIIiIi.iiiiiIIiIi));
                iIIiIiiiii.iiiiiIIiIi = null;
                if (iIIiIiiiii.IIiIiIIiii != null && !iIIiIiiiii.IIiIiIIiii.iIiIiIIIII) {
                    iIIiIiiiii.IiiiiIiIiI = iIIiIiiiii.IIiIiIIiii;
                }
                iIIiIiiiii.IIiIiIIiii = null;
            }
            if (iIiIiIIIII.iIiiiiIIII != null && iIIiIiiiii.IIiIiIIiii == null && iIIiIiiiii.iiiiiIIiIi == null && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII.iIiiiiIIII.IIiIiIIiii).method_26204() != class_2246.field_10124 && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII.iIiiiiIIII.IIiIiIIiii).method_26204() != class_2246.field_10382 && iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII.iIiiiiIIII.IIiIiIIiii).method_26204() != class_2246.field_10164 && ((Boolean)iIiIiIIIII.iIiiiIiIii.get()).booleanValue()) {
                v16 = iIiIiIIIII;
                if (v16.iIIiiIiIiI >= (Integer)v16.iIiIiIIIII.get() * --4) {
                    v17 = iIiIiIIIII;
                    this = v17.ALLATORIxDEMO(iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(v17.iIiiiiIIII.IIiIiIIiii));
                    if (this != -4 >> 2 && this != iIiiiIIiIi.ALLATORIxDEMO() && iIiIiIIIII.IiiIiIiiIi.get() == GhostMine.SwapMode.ALLATORIxDEMO) {
                        InvUtils.swap((int)this, (boolean)(5 >> 2));
                    }
                    if (this != -4 >> 2 && this != iIiiiIIiIi.ALLATORIxDEMO() && iIiIiIIIII.IiiIiIiiIi.get() == GhostMine.SwapMode.iIIiIiiiIi) {
                        InvUtils.swap((int)this, (boolean)(2 & 5));
                    }
                    iIiIiIIIII.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIiIiIIIII.iIiiiiIIII.IIiIiIIiii, iIiIiIIIII.iIiiiiIIII.iiiiiIIiIi));
                    iIiIiIIIII.iIIiiIiIiI = 3 >> 2;
                    if (this != -4 >> 2) {
                        InvUtils.swapBack();
                    }
                }
            }
        }
    }

    @Override
    public void onActivate() {
        iIIiIiiiii iIIiIiiiii2 = this;
        super.onActivate();
        IIiIiIIiii = null;
        iiiiiIIiIi = null;
        iIIiIiiiii2.iIiiiiIIII = null;
        IiiiiIiIiI = null;
        iIIiIiiiii2.iIIiiIiIiI = 3 >> 2;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iIIiIiiiii iIIiIiiiii2 = iIIiIiiiii3;
        if (((Boolean)iIIiIiiiii2.iIIIIIIiII.get()).booleanValue()) {
            void iIiIiIIIII2;
            SettingColor settingColor;
            SettingColor settingColor2;
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            double d;
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            iIIiIiiiii iIIiIiiiii3;
            if (IIiIiIIiii != null && iIIiIiiiii2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii).method_26204() != class_2246.field_10124) {
                double d8;
                iIIiIiiiii3 = iIIiIiiiii.IIiIiIIiii.IIiIiIIiii;
                d7 = iIIiIiiiii.IIiIiIIiii.IiiIiIiiIi * (1.0 / (Double)iIIiIiiiii2.IIIIiiIiii.get());
                if (d8 > 1.0) {
                    d7 = 1.0;
                }
                if (d7 < 0.0) {
                    d7 = 0.0;
                }
                iIIiIiiiii iIIiIiiiii4 = iIIiIiiiii3;
                d6 = (double)iIIiIiiiii4.method_10263() + (0.5 - 0.5 * d7);
                d5 = (double)iIIiIiiiii4.method_10264() + (0.5 - 0.5 * d7);
                d4 = (double)iIIiIiiiii4.method_10260() + (0.5 - 0.5 * d7);
                d3 = (double)iIIiIiiiii4.method_10263() + 0.5 + 0.5 * d7;
                d2 = (double)iIIiIiiiii4.method_10264() + 0.5 + 0.5 * d7;
                d = (double)iIIiIiiiii4.method_10260() + 0.5 + 0.5 * d7;
                n8 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).r + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).r - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).r) * d7);
                n7 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).g + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).g - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).g) * d7);
                n6 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).b + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).b - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).b) * d7);
                n5 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).a + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).a - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).a) * d7);
                n4 = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).r + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).r - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).r) * d7);
                n3 = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).g + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).g - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).g) * d7);
                n2 = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).b + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).b - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).b) * d7);
                n = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).a + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).a - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).a) * d7);
                settingColor2 = new SettingColor(n8, n7, n6, n5);
                settingColor = new SettingColor(n4, n3, n2, n);
                iIiIiIIIII2.renderer.box(d6, d5, d4, d3, d2, d, (Color)settingColor2, (Color)settingColor, (ShapeMode)iIIiIiiiii2.iIiIiiiiII.get(), 5 >> 3);
            }
            if (iiiiiIIiIi != null && iIIiIiiiii2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii).method_26204() != class_2246.field_10124) {
                double d9;
                iIIiIiiiii3 = iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii;
                d7 = iIIiIiiiii.iiiiiIIiIi.IiiIiIiiIi * (1.0 / (Double)iIIiIiiiii2.IIIIiiIiii.get());
                if (d9 > 1.0) {
                    d7 = 1.0;
                }
                if (d7 < 0.0) {
                    d7 = 0.0;
                }
                iIIiIiiiii iIIiIiiiii5 = iIIiIiiiii3;
                d6 = (double)iIIiIiiiii5.method_10263() + (0.5 - 0.5 * d7);
                d5 = (double)iIIiIiiiii5.method_10264() + (0.5 - 0.5 * d7);
                d4 = (double)iIIiIiiiii5.method_10260() + (0.5 - 0.5 * d7);
                d3 = (double)iIIiIiiiii5.method_10263() + 0.5 + 0.5 * d7;
                d2 = (double)iIIiIiiiii5.method_10264() + 0.5 + 0.5 * d7;
                d = (double)iIIiIiiiii5.method_10260() + 0.5 + 0.5 * d7;
                n8 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).r + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).r - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).r) * d7);
                n7 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).g + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).g - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).g) * d7);
                n6 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).b + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).b - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).b) * d7);
                n5 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).a + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).a - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).a) * d7);
                n4 = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).r + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).r - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).r) * d7);
                n3 = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).g + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).g - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).g) * d7);
                n2 = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).b + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).b - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).b) * d7);
                n = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).a + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).a - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).a) * d7);
                settingColor2 = new SettingColor(n8, n7, n6, n5);
                settingColor = new SettingColor(n4, n3, n2, n);
                iIiIiIIIII2.renderer.box(d6, d5, d4, d3, d2, d, (Color)settingColor2, (Color)settingColor, (ShapeMode)iIIiIiiiii2.iIiIiiiiII.get(), 3 ^ 3);
            }
            if (IiiiiIiIiI != null && iIIiIiiiii2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii.IiiiiIiIiI.IIiIiIIiii).method_26204() != class_2246.field_10124) {
                double d10;
                iIIiIiiiii3 = iIIiIiiiii.IiiiiIiIiI.IIiIiIIiii;
                d7 = iIIiIiiiii.IiiiiIiIiI.IiiIiIiiIi * (1.0 / (Double)iIIiIiiiii2.IIIIiiIiii.get());
                if (d10 > 1.0) {
                    d7 = 1.0;
                }
                if (d7 < 0.0) {
                    d7 = 0.0;
                }
                iIIiIiiiii iIIiIiiiii6 = iIIiIiiiii3;
                d6 = (double)iIIiIiiiii6.method_10263() + (0.5 - 0.5 * d7);
                d5 = (double)iIIiIiiiii6.method_10264() + (0.5 - 0.5 * d7);
                d4 = (double)iIIiIiiiii6.method_10260() + (0.5 - 0.5 * d7);
                d3 = (double)iIIiIiiiii6.method_10263() + 0.5 + 0.5 * d7;
                d2 = (double)iIIiIiiiii6.method_10264() + 0.5 + 0.5 * d7;
                d = (double)iIIiIiiiii6.method_10260() + 0.5 + 0.5 * d7;
                n8 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).r + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).r - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).r) * d7);
                n7 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).g + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).g - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).g) * d7);
                n6 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).b + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).b - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).b) * d7);
                n5 = ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).a + (int)((double)(((SettingColor)iIIiIiiiii2.iiiIiiIIII.get()).a - ((SettingColor)iIIiIiiiii2.iIIiiIIIIi.get()).a) * d7);
                n4 = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).r + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).r - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).r) * d7);
                n3 = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).g + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).g - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).g) * d7);
                n2 = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).b + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).b - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).b) * d7);
                n = ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).a + (int)((double)(((SettingColor)iIIiIiiiii2.IIiiIIIIIi.get()).a - ((SettingColor)iIIiIiiiii2.iIIiIiiIiI.get()).a) * d7);
                settingColor2 = new SettingColor(n8, n7, n6, n5);
                settingColor = new SettingColor(n4, n3, n2, n);
                iIiIiIIIII2.renderer.box(d6, d5, d4, d3, d2, d, (Color)settingColor2, (Color)settingColor, (ShapeMode)iIIiIiiiii2.iIiIiiiiII.get(), 2 & 5);
            }
            if (((Boolean)iIIiIiiiii2.iIiiiIiIii.get()).booleanValue() && iIIiIiiiii2.iIiiiiIIII != null && iIIiIiiiii2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii2.iIiiiiIIII.IIiIiIIiii).method_26204() != class_2246.field_10124 && iIIiIiiiii2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii2.iIiiiiIIII.IIiIiIIiii).method_26204() != class_2246.field_10382 && iIIiIiiiii2.iIIiiIiIiI.field_1687.method_8320(iIIiIiiiii2.iIiiiiIIII.IIiIiIIiii).method_26204() != class_2246.field_10164 && IIiIiIIiii == null && iiiiiIIiIi == null) {
                iIIiIiiiii iIIiIiiiii7 = iIIiIiiiii3 = iIIiIiiiii2.iIiiiiIIII.IIiIiIIiii;
                d7 = iIIiIiiiii7.method_10263();
                d6 = iIIiIiiiii7.method_10264();
                d5 = iIIiIiiiii7.method_10260();
                d4 = iIIiIiiiii7.method_10263() + (4 ^ 5);
                d3 = iIIiIiiiii7.method_10264() + (2 ^ 3);
                d2 = iIIiIiiiii7.method_10260() + (4 ^ 5);
                iIiIiIIIII2.renderer.box(d7, d6, d5, d4, d3, d2, (Color)iIIiIiiiii2.iiiIiiIIII.get(), (Color)iIIiIiiiii2.IIiiIIIIIi.get(), (ShapeMode)iIIiIiiiii2.iIiIiiiiII.get(), 3 & 4);
            }
        }
    }

    static {
        IIiIiIIiii = null;
        iiiiiIIiIi = null;
        IiiiiIiIiI = null;
        class_2248[] class_2248Array = new class_2248[0x7B & 0xE];
        class_2248Array[2 & 5] = class_2246.field_10525;
        class_2248Array[3 >> 1] = class_2246.field_27098;
        class_2248Array[5 >> 1] = class_2246.field_10164;
        class_2248Array[--3] = class_2246.field_27097;
        class_2248Array[--4] = class_2246.field_10382;
        class_2248Array[--5] = class_2246.field_9987;
        class_2248Array[0x67 & 0x1E] = class_2246.field_10499;
        class_2248Array[0x47 & 0x3F] = class_2246.field_10027;
        class_2248Array[0x59 & 0x2E] = class_2246.field_10316;
        class_2248Array[0x49 & 0x3F] = class_2246.field_10398;
        iiIiIIiiii = Arrays.asList(class_2248Array);
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    public void ALLATORIxDEMO(StartBreakingBlockEvent startBreakingBlockEvent) {
        block3: {
            void iIiIiIIIII2;
            block4: {
                iIIiIiiiii iIIiIiiiii2;
                class_2350 class_23502;
                iIIiIiiiii iIIiIiiiii3;
                block7: {
                    block6: {
                        block5: {
                            iIIiIiiiii3 = iIIiIiiiii4;
                            void v0 = iIiIiIIIII2;
                            iIIiIiiiii iIIiIiiiii4 = v0.blockPos;
                            class_23502 = v0.direction;
                            if (iiIiIIiiii.contains(iIIiIiiiii3.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIiIiiiii4).method_26204()) || iIIiIiiiii3.iIiIIiIIIi.contains(iIIiIiiiii4) || iIIiIiiiii4.method_46558().method_1022(iIIiIiiiii3.iIIiiIiIiI.field_1724.method_19538()) > (double)((Integer)iIIiIiiiii3.IIiIiiiiII.get()).intValue()) break block3;
                            if (IIiIiIIiii != null && iIIiIiiiii4.equals(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii) || iiiiiIIiIi != null && iIIiIiiiii4.equals(iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii)) break block4;
                            if (IIiIiIIiii == null || iIIiIiiiii4.equals(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii) || !((Boolean)iIIiIiiiii3.iiiIiIIiii.get()).booleanValue()) break block5;
                            if (iiiiiIIiIi != null && iIIiIiiiii4.equals(iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii)) break block6;
                            iiiiiIIiIi = new IIiiIIIiIi(iIIiIiiiii3, (class_2338)iIIiIiiiii4, class_23502);
                            iIIiIiiiii.IIiIiIIiii.IiiIiIiiIi -= (1.0 - (Double)iIIiIiiiii3.IIIIiiIiii.get()) * 0.7;
                            iIIiIiiiii2 = iIIiIiiiii3;
                            break block7;
                        }
                        if (IIiIiIIiii == null || !iIIiIiiiii4.equals(iIIiIiiiii.IIiIiIIiii.IIiIiIIiii)) {
                            IIiIiIIiii = new IIiiIIIiIi(iIIiIiiiii3, (class_2338)iIIiIiiiii4, class_23502);
                        }
                    }
                    iIIiIiiiii2 = iIIiIiiiii3;
                }
                if (((Boolean)iIIiIiiiii2.iiiIiIIiii.get()).booleanValue()) {
                    iIIiIiiiii3.ALLATORIxDEMO((class_2338)iIIiIiiiii4, class_23502);
                }
                if (!((Boolean)iIIiIiiiii3.iiiIiIIiii.get()).booleanValue()) {
                    iIiIiIIIII2.cancel();
                    return;
                }
                break block3;
            }
            iIiIiIIIII2.cancel();
        }
    }

    public void ALLATORIxDEMO() {
        if (IIiIiIIiii != null && PlayerUtils.distanceTo((class_2338)iIIiIiiiii.IIiIiIIiii.IIiIiIIiii) > (double)((Integer)this.IIiIiiiiII.get()).intValue()) {
            IIiIiIIiii = null;
        }
        if (iiiiiIIiIi != null && PlayerUtils.distanceTo((class_2338)iIIiIiiiii.iiiiiIIiIi.IIiIiIIiii) > (double)((Integer)this.IIiIiiiiII.get()).intValue()) {
            IIiIiIIiii = null;
        }
        if (this.iIiiiiIIII != null && PlayerUtils.distanceTo((class_2338)this.iIiiiiIIII.IIiIiIIiii) > (double)((Integer)this.IIiIiiiiII.get()).intValue()) {
            this.iIiiiiIIII = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int ALLATORIxDEMO(class_2680 class_26802) {
        iIIiIiiiii iIIiIiiiii2 = this;
        double d = -1.0;
        int n = -4 >> 2;
        int n2 = class_17922 = 3 ^ 3;
        while (true) {
            double d2;
            void iIiIiIIIII2;
            if (n2 >= 9) break;
            double d3 = iIIiIiiiii2.iIIiiIiIiI.field_1724.method_31548().method_5438(class_17922).method_7924((class_2680)iIiIiIIIII2);
            if (d2 > d) {
                d = d3;
                n = class_17922;
            }
            n2 = ++class_17922;
        }
        class_1792 class_17922 = iIIiIiiiii2.iIIiiIiIiI.field_1724.method_31548().method_5438(n).method_7909();
        if (!(IiIiiIIIiI.iiiIiIiiIi(class_17922) || class_17922 instanceof class_1743 || class_17922 instanceof class_1821 || IiIiiIIIiI.iiIIiIIiii(class_17922))) {
            return -4 >> 2;
        }
        return n;
    }

    public static iIIiIiiiii ALLATORIxDEMO() {
        return iIIIiiiiIi;
    }

    /*
     * WARNING - void declaration
     */
    public IIiiIIIiIi ALLATORIxDEMO(class_2338 class_23382, class_2350 class_23502, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        boolean bl2 = bl;
        iIIiIiiiii iIiIiIIIII4 = this;
        return new IIiiIIIiIi(iIiIiIIIII4, (class_2338)iIiIiIIIII3, (class_2350)iIiIiIIIII2, bl2);
    }

    /*
     * WARNING - void declaration
     */
    public IIiiIIIiIi ALLATORIxDEMO(class_2338 class_23382, class_2350 class_23502) {
        void iIiIiIIIII2;
        iIIiIiiiii iIIiIiiiii2 = iIIiIiiiii3;
        iIIiIiiiii iIIiIiiiii3 = class_23502;
        iIIiIiiiii iIiIiIIIII3 = iIIiIiiiii2;
        return new IIiiIIIiIi(iIiIiIIIII3, (class_2338)iIiIiIIIII2, (class_2350)iIIiIiiiii3);
    }
}

