/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.movement.Blink
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.item.Items
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIIiIiiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.Blink;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Items;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;

public class IiiIIIiIiI
extends iIiIiIIIii {
    public Setting<Integer> iiIIIiIIIi;
    private final Setting<Boolean> iIiiiiIIII;
    private int iiIiIIiiii;
    private final Setting<SettingColor> iIIiIiiIiI;
    private final SettingGroup iIIIIIIiII;
    private final Setting<Boolean> iIIiiIIIIi;
    public Setting<Boolean> IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    public Setting<Boolean> iIIIiiiiIi;
    private final SettingGroup iiiIiiIIII;
    private final SettingGroup iIiIIiIIIi;
    private int IIiIiiiiII;
    private boolean IIiiIIIIIi;
    private final Setting<ShapeMode> iIiiiIiIii;
    private final Setting<Boolean> iIiIiiiiII;
    public Setting<Boolean> IIIIiiIiii;
    private Thread IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private final Setting<SettingColor> iIIiiIiIiI;
    private final ConcurrentHashMap<class_2338, Long> iiiiiIIiIi;
    public Setting<Integer> iIIiIiiiIi;
    public Setting<Integer> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    @EventHandler
    public void ALLATORIxDEMO(PacketEvent.Receive receive) {
        IiiIIIiIiI iiiIIIiIiI = iiiIIIiIiI2;
        IiiIIIiIiI iiiIIIiIiI2 = receive;
        IiiIIIiIiI iIiIiIIIII2 = iiiIIIiIiI;
        if (((PacketEvent.Receive)iiiIIIiIiI2).packet instanceof class_2708 && ((Boolean)iIiIiIIIII2.iIIiiIIIIi.get()).booleanValue() && iIiIiIIIII2.IIiiIIIIIi) {
            iIiIiIIIII2.info(MoveEvent.ALLATORIxDEMO("\u68ec\u6d21\u521c\u6767\u528d\u5622\u4f2c\u906b\uff20\u5139\u95e1\u6a4b\u577b"), new Object[3 & 4]);
            iIiIiIIIII2.toggle();
        }
    }

    public List<class_2338> ALLATORIxDEMO() {
        class_2350 class_23502;
        int n;
        IiiIIIiIiI iiiIIIiIiI3;
        IiiIIIiIiI iiiIIIiIiI = iiiIIIiIiI3;
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        LinkedHashSet<class_2338> linkedHashSet2 = new LinkedHashSet<class_2338>();
        IiiIIIiIiI iiiIIIiIiI2 = iiiIIIiIiI;
        class_2338 class_23382 = iiiIIIiIiI2.iIIiiIiIiI.field_1724.method_24515();
        class_238 class_2383 = iiiIIIiIiI2.iIIiiIiIiI.field_1724.method_5829();
        linkedHashSet.add(class_23382);
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = n = 5 >> 3;
        while (n3 < n2) {
            class_2350 class_23503 = class_2350Array[n];
            if (class_23503 != class_2350.field_11036 && class_23503 != class_2350.field_11033) {
                IiiIIIiIiI this_ = class_23382.method_10093(class_23503);
                if (class_2383.method_994(new class_238((class_2338)this_))) {
                    linkedHashSet.add(this_);
                    class_23502 = class_2350.values();
                    int n4 = ((class_2350)class_23502).length;
                    int n5 = 3 & 4;
                    while (n5 < n4) {
                        int n6;
                        class_2350 class_23504 = class_23502[n6];
                        if (class_23504 != class_2350.field_11036 && class_23504 != class_2350.field_11033) {
                            class_23504 = this_.method_10093(class_23504);
                            if (class_2383.method_994(new class_238((class_2338)class_23504))) {
                                linkedHashSet.add(class_23504);
                            }
                        }
                        n5 = ++n6;
                    }
                }
            }
            n3 = ++n;
        }
        for (class_2338 class_23383 : linkedHashSet) {
            class_2350[] class_2350Array2 = class_2350.values();
            int n7 = class_2350Array2.length;
            int n6 = 3 >> 2;
            while (n6 < n7) {
                class_23502 = class_2350Array2[this_];
                if (class_23502 != class_2350.field_11036 && class_23502 != class_2350.field_11033) {
                    class_2338 class_23384 = class_23383.method_10093(class_23502);
                    if (!class_2383.method_994(new class_238(class_23384))) {
                        linkedHashSet2.add(class_23384);
                    }
                }
                n6 = ++this_;
            }
        }
        return new ArrayList<class_2338>(linkedHashSet2);
    }

    @Override
    public void onActivate() {
        IiiIIIiIiI iiiIIIiIiI = this;
        iiiIIIiIiI.iiIiIIiiii = 0x35 & 0x5E;
        iiiIIIiIiI.IIiIiiiiII = 0xFFFFFF7E & 0xFFFFFC99;
        this.IIiiIIIIIi = 3 ^ 3;
        this.IiiIiIiiIi = null;
        this.iiiiiIIiIi.clear();
    }

    public IiiIIIiIiI() {
        IiiIIIiIiI iiiIIIiIiI = this;
        super(iIiIiIIIii.iIIiIiiiIi, IiIIIiIiiI.ALLATORIxDEMO("\u56b8\u8147G"), MoveEvent.ALLATORIxDEMO("\u4f33\u7522\u65f4\u575c\u5fe6\u9054\u536f\u88d5\u81a0\u5dfd\u76ce\u7385\u8dd9\uff20\u51a5\u5c3d\u6c5e\u665a\u724c\u70b4\u904a\u623c\u76ce\u4f28\u5bd9\u302e"));
        iiiIIIiIiI.iiiIiiIIII = iiiIIIiIiI.settings.getDefaultGroup();
        iiiIIIiIiI.IIIIiiIiii = iiiIIIiIiI.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u4e98\u4f13\u7555\u9e9d\u6681\u779f"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIIiIiiiIi = this.iiiIiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5e9c\u8ff3"))).sliderRange(2 & 5, 0x74 & 0x1F).defaultValue((Object)(3 >> 2))).build());
        this.iiIIIiIIIi = this.iiiIiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u6543\u7f22\u652d\u91a3"))).sliderRange(3 & 5, 9 & 0x7E).defaultValue((Object)(--4))).build());
        this.IiiiiIiIiI = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6571\u51f7\u6c5e\u665a"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIiIiIIIII = this.iiiIiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u6c49\u663a\u5e29\u9fe8"))).sliderRange(5 >> 3, 0x4F & 0x3A).defaultValue((Object)(--4))).build());
        this.iIIIiiiiIi = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5eff\u90c4"))).defaultValue((Object)(--1 != 0))).build());
        IiiIIIiIiI iiiIIIiIiI2 = this;
        iiiIIIiIiI2.iIIIIIIiII = iiiIIIiIiI2.settings.createGroup(IiIIIiIiiI.ALLATORIxDEMO("\u527a\u632e\u8be3\u7f02"));
        iiiIIIiIiI2.iIiIiiiiII = iiiIIIiIiI2.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u0013\u8f78\u53b2\u533a"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIIiiIIIIi = this.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u7d67\u98df\u67f0"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIiiiiIIII = this.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6761\u5f7d\u73a7\u73cc"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiiIiIIiii = this.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u9883\u8820"))).defaultValue((Object)(5 >> 3))).build());
        this.ALLATORIxDEMO = this.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6b11\u4e8d"))).defaultValue((Object)(3 >> 2))).build());
        IiiIIIiIiI iiiIIIiIiI3 = this;
        iiiIIIiIiI3.iIiIIiIIIi = iiiIIIiIiI3.settings.createGroup(IiIIIiIiiI.ALLATORIxDEMO("\u6e4f\u679f\u8be3\u7f02"));
        iiiIIIiIiI3.IIiIiIIiii = iiiIIIiIiI3.iIiIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6e58\u67ff"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u6652\u546a\u6e6f\u67bf"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiiiIiIii = this.iIiIIiIIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5f28\u72ba\u6a4b\u5f23"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u6e5e\u67ae\u76c8\u5f3f\u72da"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.IIiIiIIiii.get())).build());
        this.iIIiIiiIiI = this.iIiIIiIIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u51ac\u592b\u4fed\u976e\u98f6\u825e"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u518a\u595a\u76e8\u4fda\u972e\u98c1\u821e"))).defaultValue(new SettingColor(0x49EF & 0x36FE, 0x4D & 0x7E, 0x49FD & 0x36E7, 0x37 & 0x7A)).build());
        int n = Short.MAX_VALUE & 0xFF;
        this.iIIiiIiIiI = this.iIiIIiIIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u51ac\u592b\u7ef5\u676d\u98f6\u825e"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u518a\u595a\u76e8\u7ec2\u672d\u98c1\u821e"))).defaultValue(new SettingColor(n, 0x2FFF & 0x50FF, n, 0x5D2 & 0x7AAD)).build());
        IiiIIIiIiI iiiIIIiIiI4 = this;
        IiiIIIiIiI iiiIIIiIiI5 = this;
        iiiIIIiIiI5.iiIiIIiiii = 3 ^ 3;
        iiiIIIiIiI5.IIiIiiiiII = 0xFFFFFDBB & 0xFFFFFE5C;
        iiiIIIiIiI4.IIiiIIIIIi = 2 & 5;
        iiiIIIiIiI4.IiiIiIiiIi = null;
        IiiIIIiIiI iiiIIIiIiI6 = this;
        iiiIIIiIiI4.iiiiiIIiIi = new ConcurrentHashMap();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u001dgh*\u0019Ijy:h\u000bX\u000f\rJ\u8bdb\u66be\u65bc\u525a\u672c\u65fa\u7244\u6746\uff2d"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IiiIIIiIiI iiiIIIiIiI = iterator;
        if (!((Boolean)iiiIIIiIiI.IIiIiIIiii.get()).booleanValue() || iiiIIIiIiI.iiiiiIIiIi.isEmpty()) {
            return;
        }
        long l = System.currentTimeMillis();
        Iterator<Map.Entry<class_2338, Long>> iterator = iiiIIIiIiI.iiiiiIIiIi.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            class_2338 class_23382 = (class_2338)entry.getKey();
            long l2 = l - (Long)entry.getValue();
            if (l2 <= 300L) {
                void iIiIiIIIII2;
                double d = 0.5 * ((double)l2 / 300.0);
                class_2338 class_23383 = class_23382;
                double d2 = (double)class_23383.method_10263() + d;
                double d3 = (double)class_23383.method_10264() + d;
                double d4 = (double)class_23383.method_10260() + d;
                double d5 = (double)(class_23383.method_10263() + (5 >> 2)) - d;
                double d6 = (double)(class_23383.method_10264() + (2 ^ 3)) - d;
                d = (double)(class_23383.method_10260() + (3 >> 1)) - d;
                iIiIiIIIII2.renderer.box(d2, d3, d4, d5, d6, d, (Color)iiiIIIiIiI.iIIiIiiIiI.get(), (Color)iiiIIIiIiI.iIIiiIiIiI.get(), (ShapeMode)iiiIIIiIiI.iIiiiIiIii.get(), 5 >> 3);
                continue;
            }
            iterator.remove();
        }
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiiIIIiIiI iiiIIIiIiI = this;
        if (iIiiiIIiIi.iiIIiIIiii(iiiIIIiIiI.iIIiiIiIiI) && ((Boolean)iiiIIIiIiI.iiiIiIIiii.get()).booleanValue()) {
            iiiIIIiIiI.info(IiIIIiIiiI.ALLATORIxDEMO("\u73c5\u5beb\u6b0f\u5755\u9892\u8811\uff60\u510e\u95a1\u6a7c\u573b"), new Object[3 >> 2]);
            iiiIIIiIiI.toggle();
            return;
        }
        if (!Modules.get().isActive(Blink.class)) {
            int n;
            if (((Boolean)iiiIIIiIiI.iIiIiiiiII.get()).booleanValue()) {
                if (iiiIIIiIiI.IIiIiiiiII == (0xFFFFFCDB & 0xFFFFFF3C)) {
                    iiiIIIiIiI.IIiIiiiiII = iiiIIIiIiI.iIIiiIiIiI.field_1724.method_24515().method_10264();
                }
                if (iiiIIIiIiI.iIIiiIiIiI.field_1724.method_24515().method_10264() != iiiIIIiIiI.IIiIiiiiII) {
                    iiiIIIiIiI.info(MoveEvent.ALLATORIxDEMO("\u73a5\u5bdcu\u8f1e\u577c\u686d\u53fd\u7555\u53d4\u537c\uff20\u5139\u95e1\u6a4b\u577b"), new Object[3 ^ 3]);
                    iiiIIIiIiI.toggle();
                    return;
                }
            }
            if (((Boolean)iiiIIIiIiI.iIIiiIIIIi.get()).booleanValue()) {
                iiiIIIiIiI.IIiiIIIIIi = iiiIIIiIiI.iIIiiIiIiI.field_1724.method_6030().method_7909() == class_1802.field_8233 ? --1 : 0;
            }
            if (((Boolean)iiiIIIiIiI.ALLATORIxDEMO.get()).booleanValue() && iiiIIIiIiI.iIIiiIiIiI.field_1724.method_29504()) {
                iiiIIIiIiI.info(IiIIIiIiiI.ALLATORIxDEMO("\u73f4\u5bda\u5d8f\u6b37\u4efc\uff60\u510e\u95a1\u6a7c\u573b"), new Object[5 >> 3]);
                iiiIIIiIiI.toggle();
                return;
            }
            int iIiIiIIIII2 = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8281);
            int this232 = iIiIiIIIII2 != -4 >> 2 ? 5 >> 2 : 0;
            if (this232 == 0) {
                if (((Boolean)iiiIIIiIiI.IIIIiiIiii.get()).booleanValue()) {
                    return;
                }
                iIiIiIIIII2 = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8466);
                this232 = iIiIiIIIII2 != -4 >> 2 ? 5 >> 2 : 0;
                if (this232 == 0) {
                    return;
                }
            }
            IiiIIIiIiI iiiIIIiIiI2 = iiiIIIiIiI;
            if (iiiIIIiIiI2.iiIiIIiiii <= (Integer)iiiIIIiIiI2.iIIiIiiiIi.get()) {
                iiiIIIiIiI.iiIiIIiiii += 5 >> 2;
                return;
            }
            IiiIIIiIiI iiiIIIiIiI3 = iiiIIIiIiI;
            iiiIIIiIiI3.iiIiIIiiii = 5 >> 3;
            List<Object> this232 = iiiIIIiIiI3.ALLATORIxDEMO();
            if (((Boolean)iiiIIIiIiI3.iIIIiiiiIi.get()).booleanValue()) {
                this232.add(2 & 5, iiiIIIiIiI.iIIiiIiIiI.field_1724.method_24515().method_10074());
            }
            Object object = new ArrayList();
            this232 = this232.stream().filter(class_23382 -> {
                IiiIIIiIiI iiiIIIiIiI = iiiIIIiIiI2;
                IiiIIIiIiI iiiIIIiIiI2 = class_23382;
                IiiIIIiIiI iIiIiIIIII2 = iiiIIIiIiI;
                int n = !((Boolean)iIiIiIIIII2.IiiiiIiIiI.get()).booleanValue() ? 3 & 5 : 0;
                if (BlockUtils.canPlace((class_2338)iiiIIIiIiI2, n != 0) && !iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiIIIiIiI2).method_26234((class_1922)iIiIiIIIII2.iIIiiIiIiI.field_1687, (class_2338)iiiIIIiIiI2)) {
                    if (iIiIiiIIIi.iiiIiIiiIi((class_2338)iiiIIIiIiI2, 5 >> 2)) {
                        return (2 ^ 3) != 0;
                    }
                }
                if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiIIIiIiI2).method_26204().method_8389() == class_1802.field_8162) {
                    void iIiIiIIIII3;
                    iIiIiIIIII3.add(iiiIIIiIiI2);
                }
                return false;
            }).collect(Collectors.toList());
            object = object.iterator();
            while (object.hasNext()) {
                class_2338 class_23383 = (class_2338)object.next();
                class_2338 class_23384 = class_23383.method_10074();
                if (!iIiIiiIIIi.iiiIiIiiIi(class_23384, --1 != 0) || this232.contains(class_23384)) continue;
                this232.add(5 >> 3, class_23384);
            }
            int n2 = Math.min(this232.size(), (Integer)iiiIIIiIiI.iiIIIiIIIi.get());
            int n3 = n = 3 & 4;
            while (n3 < n2) {
                IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2);
                if (((Boolean)iiiIIIiIiI.IiiiiIiIiI.get()).booleanValue()) {
                    for (class_1297 class_12972 : iiiIIIiIiI.iIIiiIiIiI.field_1687.method_18112()) {
                        if (!(class_12972 instanceof class_1511)) continue;
                        class_1511 class_15112 = (class_1511)class_12972;
                        if (!(PlayerUtils.distanceTo((class_1297)class_12972) < 3.0) || !class_12972.method_5829().method_994(new class_238((class_2338)this232.get(n)))) continue;
                        class_12972 = class_15112.method_24515();
                        iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(new IiIiiiIIIi((float)Rotations.getYaw((class_2338)class_12972), (float)Rotations.getPitch((class_2338)class_12972)));
                        IiiIIIiIiI iiiIIIiIiI4 = iiiIIIiIiI;
                        iiiIIIiIiI.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)class_2824.method_34206((class_1297)class_15112, (boolean)iiiIIIiIiI4.iIIiiIiIiI.field_1724.method_5715()));
                        iiiIIIiIiI4.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
                    }
                }
                boolean bl = 2 ^ 3;
                iIiIiiIIIi.iiIIiIIiii((class_2338)this232.get(n), bl, bl, bl);
                if (!iiiIIIiIiI.iiiiiIIiIi.containsKey(this232.get(n))) {
                    iiiIIIiIiI.iiiiiIIiIi.put((class_2338)this232.get(n), System.currentTimeMillis());
                }
                IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2);
                n3 = ++n;
            }
        }
    }

    public void onDeactivate() {
        this.iiIiIIiiii = 0x36 & 0x5D;
        this.IIiIiiiiII = 0xFFFFFDDB & 0xFFFFFE3C;
        this.IIiiIIIIIi = 2 & 5;
        if (this.IiiIiIiiIi != null) {
            this.IiiIiIiiIi.interrupt();
        }
    }

    @EventHandler
    public void ALLATORIxDEMO(PacketEvent.Send send) {
        IiiIIIiIiI iiiIIIiIiI = iiiIIIiIiI2;
        IiiIIIiIiI iiiIIIiIiI2 = send;
        IiiIIIiIiI iIiIiIIIII2 = iiiIIIiIiI;
        iiiIIIiIiI2 = ((PacketEvent.Send)iiiIIIiIiI2).packet;
        if (iiiIIIiIiI2 instanceof class_2886) {
            class_2886 cfr_ignored_0 = (class_2886)iiiIIIiIiI2;
            if (((Boolean)iIiIiIIIII2.iIiiiiIIII.get()).booleanValue() && iIiIiIIIII2.iIIiiIiIiI.field_1724.method_6047().method_7909() == class_1802.field_8634) {
                iIiIiIIIII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u4f13\u7575\u6747\u5f0c\u7381\u73bd\uff60\u510e\u95a1\u6a7c\u573b"), new Object[3 >> 2]);
                iIiIiIIIII2.toggle();
            }
        }
    }
}

