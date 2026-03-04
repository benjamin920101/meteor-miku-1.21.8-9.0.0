/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.meteor.KeyEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.KeybindSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.movement.Blink
 *  meteordevelopment.meteorclient.utils.misc.Keybind
 *  meteordevelopment.meteorclient.utils.misc.input.KeyAction
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.text.Text
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.block.ShapeContext
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIIIIIIIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.github.mikumiku.addon.modules.SurroundPlus2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import meteordevelopment.meteorclient.events.meteor.KeyEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.KeybindSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.Blink;
import meteordevelopment.meteorclient.utils.misc.Keybind;
import meteordevelopment.meteorclient.utils.misc.input.KeyAction;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.text.Text;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.block.ShapeContext;

public class IIIIiiiiIi
extends iIiIiIIIii {
    private final Setting<Boolean> iiiIiIiiII;
    private final Setting<Integer> IIiiiiIIii;
    private final SettingGroup IiiiiIIiII;
    private final Setting<SettingColor> iIIIIIiiII;
    private final Setting<SettingColor> iIIiiiiIii;
    private final Setting<Integer> iiIIIiIIIi;
    private final Setting<Boolean> iIiiiiIIII;
    private final List<class_2338> iiIiIIiiii;
    private boolean iIIiIiiIiI;
    private final Setting<SurroundPlus2.SurroundType> iIIIIIIiII;
    private final Setting<Boolean> iIIiiIIIIi;
    private final SettingGroup IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final Setting<Integer> iIIIiiiiIi;
    private final Setting<Keybind> iiiIiiIIII;
    private final Setting<SurroundPlus2.SurroundType> iIiIIiIIIi;
    private final SettingGroup IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<Keybind> iIiiiIiIii;
    private List<class_2338> iIiIiiiiII;
    private final Setting<ShapeMode> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    public boolean IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private final IiIIiIIiiI iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final IiIIiIIiiI iIiIiIIIII;
    private final Setting<Integer> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_2338> ALLATORIxDEMO(SurroundPlus2.SurroundType surroundType) {
        void iIiIiIIIII2;
        IIIIiiiiIi iIIIiiiiIi = arrayList;
        class_2338 class_23382 = iIIIiiiiIi.iIIiiIiIiI.field_1724.method_24515();
        ArrayList arrayList = new ArrayList();
        if (iIiIiIIIII2 == SurroundPlus2.SurroundType.iIIiIiiiIi) {
            arrayList.add(class_23382.method_10069(--1, 5 >> 3, 3 ^ 3));
            arrayList.add(class_23382.method_10069(-4 >> 2, 3 & 4, 3 & 4));
            arrayList.add(class_23382.method_10069(2 & 5, 3 >> 2, -4 >> 2));
            arrayList.add(class_23382.method_10069(3 >> 2, 5 >> 3, 3 >> 1));
        }
        if (iIiIiIIIII2 == SurroundPlus2.SurroundType.ALLATORIxDEMO) {
            arrayList.add(class_23382.method_10069(--1, 3 & 4, 3 >> 2));
            int n = 3 & 5;
            arrayList.add(class_23382.method_10069(n, 2 & 5, n));
            arrayList.add(class_23382.method_10069(-4 >> 2, 3 & 4, 3 ^ 3));
            arrayList.add(class_23382.method_10069(-4 >> 2, 3 ^ 3, --1));
            arrayList.add(class_23382.method_10069(5 >> 3, 3 ^ 3, --1));
            arrayList.add(class_23382.method_10069(4 ^ 5, 5 >> 3, -4 >> 2));
            arrayList.add(class_23382.method_10069(5 >> 3, 3 >> 2, -4 >> 2));
            int n2 = -4 >> 2;
            arrayList.add(class_23382.method_10069(n2, 3 ^ 3, n2));
            arrayList.add(class_23382.method_10069(1 ^ 3, 3 ^ 3, 3 & 4));
            arrayList.add(class_23382.method_10069(0xFFFFFFFE & 0xFFFFFFFF, 2 & 5, 2 & 5));
            arrayList.add(class_23382.method_10069(3 ^ 3, 3 ^ 3, --2));
            arrayList.add(class_23382.method_10069(2 & 5, 3 & 4, 0xFFFFFFFE & 0xFFFFFFFF));
        }
        if (iIiIiIIIII2 == SurroundPlus2.SurroundType.iIiIiIIIII) {
            arrayList.add(class_23382.method_10069(--1, 3 ^ 3, 3 >> 2));
            int n = 5 >> 2;
            arrayList.add(class_23382.method_10069(n, 3 >> 2, n));
            arrayList.add(class_23382.method_10069(-4 >> 2, 3 ^ 3, 3 ^ 3));
            arrayList.add(class_23382.method_10069(-4 >> 2, 3 & 4, 3 >> 1));
            arrayList.add(class_23382.method_10069(2 & 5, 3 >> 2, --1));
            arrayList.add(class_23382.method_10069(4 ^ 5, 5 >> 3, -4 >> 2));
            arrayList.add(class_23382.method_10069(3 >> 2, 3 >> 2, -4 >> 2));
            int n3 = -4 >> 2;
            arrayList.add(class_23382.method_10069(n3, 3 & 4, n3));
            arrayList.add(class_23382.method_10069(5 >> 1, 2 & 5, 3 ^ 3));
            arrayList.add(class_23382.method_10069(0xFFFFFFFF & 0xFFFFFFFE, 3 >> 2, 2 & 5));
            arrayList.add(class_23382.method_10069(3 ^ 3, 3 & 4, 5 >> 1));
            arrayList.add(class_23382.method_10069(5 >> 3, 5 >> 3, 0xFFFFFFFE & 0xFFFFFFFF));
            int n4 = 3 >> 1;
            arrayList.add(class_23382.method_10069(n4, n4, 5 >> 3));
            arrayList.add(class_23382.method_10069(-4 >> 2, 3 & 5, 5 >> 3));
            arrayList.add(class_23382.method_10069(0, 1, 1));
            arrayList.add(class_23382.method_10069(0, 1, -4 >> 2));
            arrayList.add(class_23382.method_10069(5 >> 1, 1, 0));
            arrayList.add(class_23382.method_10069(0xFFFFFFFE & 0xFFFFFFFF, 1, 0));
            arrayList.add(class_23382.method_10069(0, 1, --2));
            arrayList.add(class_23382.method_10069(0, 1, 0xFFFFFFFE & 0xFFFFFFFF));
            arrayList.add(class_23382.method_10069(-4 >> 2, 1, 1));
            arrayList.add(class_23382.method_10069(1, 1, -4 >> 2));
            arrayList.add(class_23382.method_10069(1, 1, 1));
            int n5 = -4 >> 2;
            arrayList.add(class_23382.method_10069(n5, 1, n5));
        }
        return arrayList;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIIIiiiiIi iIIIiiiiIi5;
        IIIIiiiiIi iIIIiiiiIi = iIIIiiiiIi5;
        if (!Modules.get().isActive(Blink.class)) {
            int n;
            int n2;
            if (((Boolean)iIIIiiiiIi.iIIiiIiIiI.get()).booleanValue()) {
                iIIIiiiiIi.iIIiIiiIiI = iIIIiiiiIi.iIIiiIiIiI.field_1724.method_6030().method_7909() == class_1802.field_8233 ? 5 >> 2 : 0;
            }
            if (!iIIIiiiiIi.IIiIiIIiii) {
                iIIIiiiiIi.info(class_2561.method_30163((String)IIiiIiIIIi.iiiIiIiiIi("\u6a33\u570c\u5dc0\u5454\u52ba")));
                iIIIiiiiIi.IIiIiIIiii = --1;
            }
            if (((Boolean)iIIIiiiiIi.IIiiIIIIIi.get()).booleanValue()) {
                if (iIIIiiiiIi.iIIiiIiIiI.field_1724.method_31548().method_5438(0x37 & 0x6E).method_7909() == class_1802.field_8833 && ((Boolean)iIIIiiiiIi.iIiiiiIIII.get()).booleanValue()) {
                    iIIIiiiiIi.IIiiIIIIIi.set((Object)(3 >> 2));
                    iIIIiiiiIi.info(class_2561.method_30163((String)iIIIIIIIii.ALLATORIxDEMO("\u68fb\u6d35\u5210\u97fd\u7fd4\uff58\u81c7\u52c0\u515f\u9584\u56d0\u817b\u6a07\u5f6c")));
                }
            }
            int iIiIiIIIII2 = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8281);
            if (iIiIiIIIII2 == -4 >> 2) {
                iIIIiiiiIi.iiIiIIiiii.clear();
                return;
            }
            IIIIiiiiIi iIIIiiiiIi2 = iIIIiiiiIi;
            iIIIiiiiIi2.ALLATORIxDEMO(class_2246.field_10540);
            if (iIIIiiiiIi2.iiIiIIiiii.contains(iIIIiiiiIi.iIIiiIiIiI.field_1724.method_24515().method_10074()) && ((Boolean)iIIIiiiiIi.iiiIiIIiii.get()).booleanValue()) {
                IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2);
                boolean bl = 5 >> 2;
                iIiIiiIIIi.iiIIiIIiii(iIIIiiiiIi.iIIiiIiIiI.field_1724.method_24515().method_10074(), bl, bl, bl);
                IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2);
            }
            IIIIiiiiIi iIIIiiiiIi3 = iIIIiiiiIi;
            if (iIIIiiiiIi3.iIiIiIIIII.iiIIiIIiii(((Integer)iIIIiiiiIi3.iiIIIiIIIi.get()).intValue()) && iIIIiiiiIi.iiIiIIiiii.size() > 0) {
                n2 = Math.min((Integer)iIIIiiiiIi.IIiiiiIIii.get(), iIIIiiiiIi.iiIiIIiiii.size());
                int n3 = n = 3 >> 2;
                while (n3 < n2) {
                    IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2);
                    boolean bl = 5 >> 2;
                    iIiIiiIIIi.iiIIiIIiii(iIIIiiiiIi.iiIiIIiiii.get(n), bl, bl, bl);
                    IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2);
                    iIIIiiiiIi.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2815(iIIIiiiiIi.iIIiiIiIiI.field_1724.field_7512.field_7763));
                    n3 = ++n;
                }
                iIIIiiiiIi.iIiIiIIIII.ALLATORIxDEMO();
            }
            if (iIIIiiiiIi.iIiIiiiiII.size() > 0) {
                IIIIiiiiIi iIIIiiiiIi4 = iIIIiiiiIi;
                if (iIIIiiiiIi4.iIiIiIIIII.iiIIiIIiii(((Integer)iIIIiiiiIi4.iiIIIiIIIi.get()).intValue())) {
                    if (iIiIiIIIII2 != -4 >> 2) {
                        iIIIiiiiIi.iIiIiiiiII = iIIIiiiiIi.iIiIiiiiII.stream().filter(class_23382 -> {
                            IIIIiiiiIi iIIIiiiiIi = iIIIiiiiIi2;
                            IIIIiiiiIi iIIIiiiiIi2 = class_23382;
                            IIIIiiiiIi iIiIiIIIII2 = iIIIiiiiIi;
                            if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIIiiiiIi2).method_26204().method_8389() == class_1802.field_8162) {
                                if (iIiIiiIIIi.iiiIiIiiIi((class_2338)iIIIiiiiIi2, 3 >> 1) && PlayerUtils.distanceTo((class_2338)iIIIiiiiIi2) <= 4.0) {
                                    return --1 != 0;
                                }
                            }
                            return false;
                        }).collect(Collectors.toList());
                        n2 = Math.min((Integer)iIIIiiiiIi.IIiiiiIIii.get(), iIIIiiiiIi.iIiIiiiiII.size());
                        int n4 = n = 5 >> 3;
                        while (n4 < n2) {
                            IIIIiiiiIi this_ = iIIIiiiiIi.iIiIiiiiII.get(n);
                            if (iIIIiiiiIi.iIIiiIiIiI.field_1687.method_8320((class_2338)this_).method_45474() && iIIIiiiiIi.iIIiiIiIiI.field_1687.method_8628(class_2246.field_10540.method_9564(), (class_2338)this_, class_3726.method_16194())) {
                                int n5 = !(IiIiiIIIiI.ALLATORIxDEMO(this_.method_10074(), class_2246.field_10540) || IiIiiIIIiI.ALLATORIxDEMO(this_.method_10078(), class_2246.field_22423) || IiIiiIIIiI.ALLATORIxDEMO(this_.method_10067(), class_2246.field_9987) || IiIiiIIIiI.ALLATORIxDEMO(this_.method_10072(), class_2246.field_10443) || IiIiiIIIiI.ALLATORIxDEMO(this_.method_10095(), class_2246.field_10535)) ? --1 : 0;
                                if (n5 != 0) {
                                    IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2);
                                    boolean bl = 3 & 5;
                                    iIiIiiIIIi.iiIIiIIiii((class_2338)this_, bl, bl, bl);
                                    IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2);
                                    iIIIiiiiIi.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2815(iIIIiiiiIi.iIIiiIiIiI.field_1724.field_7512.field_7763));
                                }
                            }
                            n4 = ++n;
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void ALLATORIxDEMO(PacketEvent.Receive receive) {
        IIIIiiiiIi iIIIiiiiIi = iIIIiiiiIi2;
        IIIIiiiiIi iIIIiiiiIi2 = receive;
        IIIIiiiiIi iIiIiIIIII2 = iIIIiiiiIi;
        if (((PacketEvent.Receive)iIIIiiiiIi2).packet instanceof class_2708 && ((Boolean)iIiIiIIIII2.iIIiiIiIiI.get()).booleanValue() && iIiIiIIIII2.iIIiIiiIiI && ((Boolean)iIiIiIIIII2.IIiiIIIIIi.get()).booleanValue()) {
            IIIIiiiiIi iIIIiiiiIi3 = iIiIiIIIII2;
            iIIIiiiiIi3.IIiiIIIIIi.set((Object)((2 & 5) != 0));
            iIIIiiiiIi3.info(IIiiIiIIIi.iiiIiIiiIi("\u68f2\u6d10\u5202\u6776\u52b3\u5613\u4f32\u907a\uff1e\u5108\u95ff\u56af\u8128\u6a5a\u5f1d"), new Object[3 >> 2]);
        }
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        IIIIiiiiIi iIiIiIIIII2;
        IIIIiiiiIi iIIIiiiiIi = iIIIiiiiIi2;
        IIIIiiiiIi iIIIiiiiIi2 = class_23382;
        IIIIiiiiIi iIIIiiiiIi3 = iIiIiIIIII2 = iIIIiiiiIi;
        return iIIIiiiiIi3.ALLATORIxDEMO((SurroundPlus2.SurroundType)((Object)iIIIiiiiIi3.iIiIIiIIIi.get())).contains(iIIIiiiiIi2);
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(KeyEvent keyEvent) {
        void iIiIiIIIII2;
        IIIIiiiiIi iIIIiiiiIi = iIIIiiiiIi2;
        if (iIiIiIIIII2.action != KeyAction.Press) {
            return;
        }
        Keybind keybind = (Keybind)iIIIiiiiIi.iIiiiIiIii.get();
        IIIIiiiiIi iIIIiiiiIi2 = (Keybind)iIIIiiiiIi.iiiIiiIIII.get();
        if (keybind != Keybind.none() && iIiIiIIIII2.key == keybind.getValue()) {
            IIIIiiiiIi iIIIiiiiIi3 = iIIIiiiiIi;
            iIIIiiiiIi3.ALLATORIxDEMO(iIIIiiiiIi3.iiiIiIiiII, iIIIIIIIii.ALLATORIxDEMO("\u5691\u810b\u007f\u0006\u8182\u5284\u785d\u576b\u6c55\u6650\uff79"), IIiiIiIIIi.iiiIiIiiIi("\u5dc0\u5454\u753a"), iIIIIIIIii.ALLATORIxDEMO("\u5d93\u79a7\u754b"));
            return;
        }
        if (iIIIiiiiIi2 != Keybind.none() && iIiIiIIIII2.key == iIIIiiiiIi2.getValue()) {
            IIIIiiiiIi iIIIiiiiIi4 = iIIIiiiiIi;
            iIIIiiiiIi4.ALLATORIxDEMO(iIIIiiiiIi4.IIiiIIIIIi, IIiiIiIIIi.iiiIiIiiIi("\u56e6\u81619P\u65ab\u570c\u56c6\u8161\uff08"), iIIIIIIIii.ALLATORIxDEMO("\u5d93\u5409\u754b"), IIiiIiIIIi.iiiIiIiiIi("\u5dc0\u79fa\u753a"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Setting<Boolean> setting, String string, String string2, String string3) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        boolean bl;
        Setting<Boolean> setting2 = setting3;
        Setting<Boolean> setting3 = setting;
        Setting<Boolean> iIiIiIIIII5 = setting2;
        boolean bl2 = bl = !((Boolean)setting3.get()).booleanValue() ? 3 >> 1 : false;
        setting3.set((Object)bl2);
        setting3 = bl2 ? iIiIiIIIII4 : iIiIiIIIII3;
        iIiIiIIIII5.info(class_2561.method_30163((String)((String)iIiIiIIIII2 + setting3)));
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IIIIiiiiIi iIIIiiiiIi = this;
        if (((Boolean)iIIIiiiiIi.iIIiIiiiIi.get()).booleanValue() && iIIIiiiiIi.iiIiIIiiii.size() > 0) {
            int n = this = 3 ^ 3;
            while (n < iIIIiiiiIi.iiIiIIiiii.size()) {
                void iIiIiIIIII2;
                double d = iIIIiiiiIi.iiIiIIiiii.get(this).method_10263();
                double d2 = iIIIiiiiIi.iiIiIIiiii.get(this).method_10264();
                double d3 = iIIIiiiiIi.iiIiIIiiii.get(this).method_10260();
                double d4 = iIIIiiiiIi.iiIiIIiiii.get(this).method_10263() + (3 >> 1);
                double d5 = iIIIiiiiIi.iiIiIIiiii.get(this).method_10264() + (2 ^ 3);
                double d6 = iIIIiiiiIi.iiIiIIiiii.get(this).method_10260() + (4 ^ 5);
                int n2 = 3 & 5;
                iIiIiIIIII2.renderer.box(d, d2, d3, d4, d5, d6, (Color)iIIIiiiiIi.iIIiiiiIii.get(), (Color)iIIIiiiiIi.iIIIIIiiII.get(), (ShapeMode)iIIIiiiiIi.IIIIiiIiii.get(), 3 >> 2);
                n = ++this;
            }
        }
    }

    @Override
    public void onActivate() {
        if (!this.iiIiIIiiii.isEmpty()) {
            this.iiIiIIiiii.clear();
        }
        this.iIiIiIIIII.ALLATORIxDEMO();
        this.iiiiiIIiIi.ALLATORIxDEMO();
        this.iIIiIiiIiI = 5 >> 3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2248 class_22482) {
        void iIiIiIIIII2;
        IIIIiiiiIi iIIIiiiiIi = iIIIiiiiIi2;
        IIIIiiiiIi iIIIiiiiIi2 = class_23382;
        IIIIiiiiIi iIiIiIIIII3 = iIIIiiiiIi;
        if (!iIiIiIIIII3.iiIiIIiiii.contains(iIIIiiiiIi2) && iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIIiiiiIi2).method_45474() && iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8628(iIiIiIIIII2.method_9564(), (class_2338)iIIIiiiiIi2, class_3726.method_16194())) {
            if (iIiIiiIIIi.iiiIiIiiIi((class_2338)iIIIiiiiIi2, 3 >> 1)) {
                if (iIiIiIIIII3.iIIIIIIiII.get() == SurroundPlus2.SurroundType.iIiIiIIIII || iIiIiIIIII3.iIIIIIIiII.get() == SurroundPlus2.SurroundType.ALLATORIxDEMO) {
                    int n = 3 >> 2;
                    if (iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8320(iIIIiiiiIi2.method_10069(n, -4 >> 2, n)).method_26204().method_9518().getString().equals(iIIIIIIIii.ALLATORIxDEMO("\u0000O\u0011"))) {
                        return;
                    }
                }
                iIiIiIIIII3.iiIiIIiiii.add((class_2338)iIIIiiiiIi2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2248 var1_1) {
        block55: {
            block54: {
                v0 = var2_2 = this;
                v0.iiIiIIiiii.clear();
                this = v0.iIIiiIiIiI.field_1724.method_24515();
                if (!((Boolean)v0.IIiiIIIIIi.get()).booleanValue()) break block54;
                if (((Boolean)var2_2.IiiIiIiiIi.get()).booleanValue()) {
                    v1 = var2_2;
                    v2 = this;
                    v3 = var2_2;
                    v4 = 3 ^ 3;
                    v3.ALLATORIxDEMO(this.method_10069(v4, --2, v4), (class_2248)iIiIiIIIII);
                    v3.ALLATORIxDEMO(this.method_10069(3 >> 1, 5 >> 1, 3 ^ 3), (class_2248)iIiIiIIIII);
                    var2_2.ALLATORIxDEMO(v2.method_10069(-4 >> 2, --2, 2 & 5), (class_2248)iIiIiIIIII);
                    v1.ALLATORIxDEMO(v2.method_10069(3 >> 2, --2, 2 ^ 3), (class_2248)iIiIiIIIII);
                    v1.ALLATORIxDEMO(this.method_10069(3 >> 2, --2, -4 >> 2), (class_2248)iIiIiIIIII);
                }
                if (((Boolean)var2_2.iIIiiIIIIi.get()).booleanValue()) ** GOTO lbl-1000
                switch (((SurroundPlus2.SurroundType)var2_2.iIIIIIIiII.get()).ordinal()) {
                    case 0: {
                        v5 = var2_2;
                        while (false) {
                        }
                        v6 = var2_2;
                        v7 = this;
                        var2_2.ALLATORIxDEMO(this.method_10069(--1, 2 & 5, 3 ^ 3), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v7.method_10069(-4 >> 2, 3 & 4, 5 >> 3), (class_2248)iIiIiIIIII);
                        v6.ALLATORIxDEMO(v7.method_10069(3 >> 2, 3 >> 2, 5 >> 2), (class_2248)iIiIiIIIII);
                        v6.ALLATORIxDEMO(this.method_10069(3 & 4, 2 & 5, -4 >> 2), (class_2248)iIiIiIIIII);
                        break;
                    }
                    case 1: {
                        v5 = var2_2;
                        v8 = var2_2;
                        v9 = this;
                        v10 = var2_2;
                        v11 = this;
                        v12 = var2_2;
                        v13 = this;
                        v14 = -4 >> 2;
                        v15 = var2_2;
                        v16 = this;
                        var2_2.ALLATORIxDEMO(v16.method_10069(3 >> 1, 2 & 5, 3 ^ 3), (class_2248)iIiIiIIIII);
                        v15.ALLATORIxDEMO(v16.method_10069(2 ^ 3, 3 & 4, 2 ^ 3), (class_2248)iIiIiIIIII);
                        v15.ALLATORIxDEMO(this.method_10069(v14, 5 >> 3, 3 & 4), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v13.method_10069(v14, 3 ^ 3, --1), (class_2248)iIiIiIIIII);
                        v12.ALLATORIxDEMO(v13.method_10069(2 & 5, 3 >> 2, 2 ^ 3), (class_2248)iIiIiIIIII);
                        v12.ALLATORIxDEMO(this.method_10069(2 ^ 3, 3 >> 2, -4 >> 2), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v11.method_10069(3 ^ 3, 3 >> 2, -4 >> 2), (class_2248)iIiIiIIIII);
                        v10.ALLATORIxDEMO(v11.method_10069(-4 >> 2, 2 & 5, -4 >> 2), (class_2248)iIiIiIIIII);
                        v10.ALLATORIxDEMO(this.method_10069(--2, 3 ^ 3, 2 & 5), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v9.method_10069(-2 & -1, 3 & 4, 3 >> 2), (class_2248)iIiIiIIIII);
                        v8.ALLATORIxDEMO(v9.method_10069(3 & 4, 2 & 5, 5 >> 1), (class_2248)iIiIiIIIII);
                        v8.ALLATORIxDEMO(this.method_10069(3 >> 2, 3 >> 2, -1 & -2), (class_2248)iIiIiIIIII);
                        break;
                    }
                    case 2: {
                        v17 = this;
                        v18 = --1;
                        v19 = var2_2;
                        v20 = this;
                        v21 = 3 ^ 3;
                        v22 = var2_2;
                        v23 = this;
                        v24 = var2_2;
                        v25 = this;
                        v26 = var2_2;
                        v27 = this;
                        v28 = var2_2;
                        v29 = this;
                        v30 = var2_2;
                        v31 = this;
                        v32 = var2_2;
                        v33 = this;
                        v34 = 3 & 5;
                        var2_2.ALLATORIxDEMO(this.method_10069(v34, 3 >> 2, 3 & 4), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v33.method_10069(v34, 2 & 5, --1), (class_2248)iIiIiIIIII);
                        v32.ALLATORIxDEMO(v33.method_10069(-4 >> 2, 2 & 5, 5 >> 3), (class_2248)iIiIiIIIII);
                        v32.ALLATORIxDEMO(this.method_10069(-4 >> 2, 2 & 5, --1), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v31.method_10069(3 >> 2, 3 & 4, --1), (class_2248)iIiIiIIIII);
                        v30.ALLATORIxDEMO(v31.method_10069(3 >> 1, 0, -4 >> 2), (class_2248)iIiIiIIIII);
                        v30.ALLATORIxDEMO(this.method_10069(2 & 5, 0, -4 >> 2), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v29.method_10069(-4 >> 2, 0, -4 >> 2), (class_2248)iIiIiIIIII);
                        v28.ALLATORIxDEMO(v29.method_10069(5 >> 1, 0, 0), (class_2248)iIiIiIIIII);
                        v28.ALLATORIxDEMO(this.method_10069(-2 & -1, 0, 0), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v27.method_10069(3 >> 2, 0, 5 >> 1), (class_2248)iIiIiIIIII);
                        v26.ALLATORIxDEMO(v27.method_10069(3 ^ 3, 0, -2 & -1), (class_2248)iIiIiIIIII);
                        v26.ALLATORIxDEMO(this.method_10069(2 ^ 3, 1, 0), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v25.method_10069(-4 >> 2, 1, 0), (class_2248)iIiIiIIIII);
                        v24.ALLATORIxDEMO(v25.method_10069(3 & 4, 1, 1), (class_2248)iIiIiIIIII);
                        v24.ALLATORIxDEMO(this.method_10069(3 ^ 3, 1, -4 >> 2), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v23.method_10069(5 >> 1, 1, 0), (class_2248)iIiIiIIIII);
                        v22.ALLATORIxDEMO(v23.method_10069(-1 & -2, 1, 0), (class_2248)iIiIiIIIII);
                        v22.ALLATORIxDEMO(this.method_10069(v21, 1, 1 ^ 3), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v20.method_10069(v21, 1, -1 & -2), (class_2248)iIiIiIIIII);
                        v19.ALLATORIxDEMO(v20.method_10069(-4 >> 2, 1, 1), (class_2248)iIiIiIIIII);
                        v19.ALLATORIxDEMO(this.method_10069(v18, 1, -4 >> 2), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v17.method_10069(v18, 1, 1), (class_2248)iIiIiIIIII);
                        var2_2.ALLATORIxDEMO(v17.method_10069(-4 >> 2, 1, -4 >> 2), (class_2248)iIiIiIIIII);
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        v5 = var2_2;
                    }
                }
                v5.ALLATORIxDEMO(this.method_10069(0, -1, 0), (class_2248)iIiIiIIIII);
            }
            if (!((Boolean)var2_2.iiiIiIiiII.get()).booleanValue()) break block55;
            if (((Boolean)var2_2.iIiiiiIIII.get()).booleanValue()) {
                if (var2_2.iIIiiIiIiI.field_1724.method_31548().method_5438(102 & 63).method_7909() == class_1802.field_8833) {
                    return;
                }
            }
            iIiIiIIIII = var2_2.iIIiiIiIiI.field_1687.method_18112().iterator();
            v35 = new class_1792[1];
            v35[0] = class_1802.field_8281;
            if (!InvUtils.findInHotbar((class_1792[])v35).found()) {
                return;
            }
            while (iIiIiIIIII.hasNext()) {
                block58: {
                    block59: {
                        block56: {
                            block57: {
                                var3_3 = (class_1297)iIiIiIIIII.next();
                                if (!(var3_3 instanceof class_1511) || !(PlayerUtils.distanceTo((class_1297)var3_3) <= 5.0)) continue;
                                if (var2_2.iIiIIiIIIi.get() != SurroundPlus2.SurroundType.iIIiIiiiIi) break block56;
                                if (var3_3.method_24515().equals((Object)this.method_10069(-1, 0, 0))) break block57;
                                if (var3_3.method_24515().equals((Object)this.method_10069(1, 0, 0))) break block57;
                                if (var3_3.method_24515().equals((Object)this.method_10069(0, 0, 1))) break block57;
                                if (!var3_3.method_24515().equals((Object)this.method_10069(0, 0, -1))) break block56;
                            }
                            v36 = var2_2;
                            if (v36.iiiiiIIiIi.iiIIiIIiii(((Integer)v36.ALLATORIxDEMO.get()).intValue())) {
                                var4_4 = var3_3.method_24515();
                                iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(new IiIiiiIIIi((float)Rotations.getYaw((class_2338)var4_4), (float)Rotations.getPitch((class_2338)var4_4)));
                                v37 = var2_2;
                                v38 = var2_2;
                                v37.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)class_2824.method_34206((class_1297)var3_3, (boolean)v38.iIIiiIiIiI.field_1724.method_5715()));
                                v38.iIIiiIiIiI.field_1724.method_7350();
                                v37.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
                                iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO();
                                v37.iiiiiIIiIi.ALLATORIxDEMO();
                                if (!var2_2.iIiIiiiiII.contains(var3_3.method_24515())) {
                                    var2_2.iIiIiiiiII.add(var3_3.method_24515());
                                }
                            }
                        }
                        if (var2_2.iIiIIiIIIi.get() != SurroundPlus2.SurroundType.ALLATORIxDEMO) break block58;
                        if (var3_3.method_24515().equals((Object)this.method_10069(2, 0, 0))) break block59;
                        if (var3_3.method_24515().equals((Object)this.method_10069(-1 & -2, 0, 0))) break block59;
                        if (var3_3.method_24515().equals((Object)this.method_10069(0, 0, 2))) break block59;
                        if (var3_3.method_24515().equals((Object)this.method_10069(0, 0, -1 & -2))) break block59;
                        if (var3_3.method_24515().equals((Object)this.method_10069(1, 0, 1))) break block59;
                        if (var3_3.method_24515().equals((Object)this.method_10069(-1, 0, 1))) break block59;
                        if (var3_3.method_24515().equals((Object)this.method_10069(1, 0, -1))) break block59;
                        if (var3_3.method_24515().equals((Object)this.method_10069(-1, 0, 0))) break block59;
                        if (var3_3.method_24515().equals((Object)this.method_10069(1, 0, 0))) break block59;
                        if (var3_3.method_24515().equals((Object)this.method_10069(0, 0, 1))) break block59;
                        if (!var3_3.method_24515().equals((Object)this.method_10069(0, 0, -1))) break block58;
                    }
                    v39 = var2_2;
                    if (v39.iiiiiIIiIi.iiIIiIIiii(((Integer)v39.ALLATORIxDEMO.get()).intValue())) {
                        var4_4 = var3_3.method_24515();
                        iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(new IiIiiiIIIi((float)Rotations.getYaw((class_2338)var4_4), (float)Rotations.getPitch((class_2338)var4_4)));
                        v40 = var2_2;
                        v41 = var2_2;
                        v40.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)class_2824.method_34206((class_1297)var3_3, (boolean)v41.iIIiiIiIiI.field_1724.method_5715()));
                        v41.iIIiiIiIiI.field_1724.method_7350();
                        v40.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
                        iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO();
                        v40.iiiiiIIiIi.ALLATORIxDEMO();
                        if (!var2_2.iIiIiiiiII.contains(var3_3.method_24515())) {
                            var2_2.iIiIiiiiII.add(var3_3.method_24515());
                        }
                    }
                }
                if (var2_2.iIiIIiIIIi.get() != SurroundPlus2.SurroundType.iIiIiIIIII) continue;
                if (!var3_3.method_24515().equals((Object)this.method_10069(2, 0, 0))) {
                    if (!var3_3.method_24515().equals((Object)this.method_10069(-1 & -2, 0, 0))) {
                        if (!var3_3.method_24515().equals((Object)this.method_10069(0, 0, 2))) {
                            if (!var3_3.method_24515().equals((Object)this.method_10069(0, 0, -2 & -1))) {
                                if (!var3_3.method_24515().equals((Object)this.method_10069(1, 0, 1))) {
                                    if (!var3_3.method_24515().equals((Object)this.method_10069(-1, 0, 1))) {
                                        if (!var3_3.method_24515().equals((Object)this.method_10069(1, 0, -1))) {
                                            if (!var3_3.method_24515().equals((Object)this.method_10069(-1, 0, 0))) {
                                                if (!var3_3.method_24515().equals((Object)this.method_10069(1, 0, 0))) {
                                                    if (!var3_3.method_24515().equals((Object)this.method_10069(0, 0, 1))) {
                                                        if (!var3_3.method_24515().equals((Object)this.method_10069(0, 0, -1))) {
                                                            if (!var3_3.method_24515().equals((Object)this.method_10069(-1, 0, -1))) {
                                                                if (!var3_3.method_24515().equals((Object)this.method_10069(-1, 1, 0))) {
                                                                    if (!var3_3.method_24515().equals((Object)this.method_10069(1, 1, 0))) {
                                                                        if (!var3_3.method_24515().equals((Object)this.method_10069(0, 1, 1))) {
                                                                            if (!var3_3.method_24515().equals((Object)this.method_10069(0, 1, -1))) {
                                                                                if (!var3_3.method_24515().equals((Object)this.method_10069(-1 & -2, 1, 0))) {
                                                                                    if (!var3_3.method_24515().equals((Object)this.method_10069(2, 1, 0))) {
                                                                                        if (!var3_3.method_24515().equals((Object)this.method_10069(0, 1, 2))) {
                                                                                            if (!var3_3.method_24515().equals((Object)this.method_10069(0, 1, -1 & -2))) {
                                                                                                if (!var3_3.method_24515().equals((Object)this.method_10069(1, 1, -1))) {
                                                                                                    if (!var3_3.method_24515().equals((Object)this.method_10069(1, 1, 1))) {
                                                                                                        if (!var3_3.method_24515().equals((Object)this.method_10069(-1, 1, -1))) {
                                                                                                            if (!var3_3.method_24515().equals((Object)this.method_10069(-1, 1, 1))) {
                                                                                                                if (!var3_3.method_24515().equals((Object)this.method_10069(-1, 2, 0))) {
                                                                                                                    if (!var3_3.method_24515().equals((Object)this.method_10069(1, 2, 0))) {
                                                                                                                        if (!var3_3.method_24515().equals((Object)this.method_10069(0, 2, 1))) {
                                                                                                                            if (!var3_3.method_24515().equals((Object)this.method_10069(0, 2, -1))) {
                                                                                                                                if (!var3_3.method_24515().equals((Object)this.method_10069(0, 3, 0))) {
                                                                                                                                    if (!var3_3.method_24515().equals((Object)this.method_10069(0, -1, 1))) {
                                                                                                                                        if (!var3_3.method_24515().equals((Object)this.method_10069(0, -1, -1))) {
                                                                                                                                            if (!var3_3.method_24515().equals((Object)this.method_10069(1, -1, 0))) {
                                                                                                                                                if (!var3_3.method_24515().equals((Object)this.method_10069(-1, -1, 0))) continue;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                v42 = var2_2;
                if (!v42.iiiiiIIiIi.iiIIiIIiii(((Integer)v42.ALLATORIxDEMO.get()).intValue())) continue;
                if (var3_3.field_6012 > (Integer)var2_2.iIIIiiiiIi.get()) {
                    var4_4 = var3_3.method_24515();
                    iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(new IiIiiiIIIi((float)Rotations.getYaw((class_2338)var4_4), (float)Rotations.getPitch((class_2338)var4_4)));
                    v43 = var2_2;
                    v44 = var2_2;
                    v43.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)class_2824.method_34206((class_1297)var3_3, (boolean)v44.iIIiiIiIiI.field_1724.method_5715()));
                    v44.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
                    iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO();
                    v43.iiiiiIIiIi.ALLATORIxDEMO();
                }
                if (var2_2.iIiIiiiiII.contains(var3_3.method_24515())) continue;
                var2_2.iIiIiiiiII.add(var3_3.method_24515());
            }
        }
    }

    public IIIIiiiiIi() {
        IIIIiiiiIi iIIIiiiiIi = this;
        super(iIiIiIIIii.iIIiIiiiIi, iIIIIIIIii.ALLATORIxDEMO("\u56e9\u8142|9"), IIiiIiIIIi.iiiIiIiiIi("\u4f02\u753c\u65c5\u5742\u5fd7\u904a\u535e\u88cb\u81b1\u5dc3\u76df\u73bb\u8de8\uff3e\u51b4\u5c03\u6c4f\u6664\u727d\u70aa\u905b\u6202\u76df\u4f16\u5bc8\u3010"));
        iIIIiiiiIi.IIiIiiiiII = iIIIiiiiIi.settings.createGroup(iIIIIIIIii.ALLATORIxDEMO("\u9007\u7570\u8be9\u7f7c"));
        iIIIiiiiIi.IiiiiIIiII = iIIIiiiiIi.settings.createGroup(IIiiIiIIIi.iiiIiIiiIi("\u786f\u577d\u8bc5\u7f7c"));
        iIIIiiiiIi.IiiiiIiIiI = iIIIiiiiIi.settings.getDefaultGroup();
        iIIIiiiiIi.iIiiiiIIII = iIIIiiiiIi.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u97dd\u7fd8\u65ae\u5124\u95ff"))).description(IIiiIiIIIi.iiiIiIiiIi("\u5f08\u739b\u5bcd\u88d7\u597c\u978a\u7fbe\u65e4\u5108\u95ff\u56af\u8128\u6a5a\u5f1d"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiIiIiI = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u7d2b\u98c7\u6781\u65ae\u5124\u95ff"))).description(IIiiIiIIIi.iiiIiIiiIi("\u5f61\u73f2\u5b84\u98a4\u753a\u7d50\u9890\u67e7\u65e4\u5108\u95ff\u56af\u8128\u6a5a\u5f1d"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IIiiIIIIIi = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u5432\u7570\u56a3\u8108"))).description(IIiiIiIIIi.iiiIiIiiIi("\u5454\u753a\u65c2\u5745\u56af\u8128\u6a5a\u5f1d"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiiIiiIIII = this.IIiIiiiiII.add((Setting)((KeybindSetting.Builder)((KeybindSetting.Builder)((KeybindSetting.Builder)new KeybindSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u56b1\u8107\u5fb3\u6320\u953c"))).description(IIiiIiIIIi.iiiIiIiiIi("\u527c\u6370\u568f\u8108\u6a5a\u5f1d\u76df\u5fd9\u630c\u953c"))).defaultValue((Object)Keybind.none())).build());
        this.iIIIIIIiII = this.IIiIiiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u56e9\u8142\u7c2c\u5799"))).description(IIiiIiIIIi.iiiIiIiiIi("\u901b\u6292\u56e6\u8141\u76b6\u7c00\u5799"))).defaultValue((Object)SurroundPlus2.SurroundType.iIIiIiiiIi)).build());
        this.iiIIIiIIIi = this.IIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u6523\u7f36\u5ea1\u8fcd"))).description(IIiiIiIIIi.iiiIiIiiIi("\u65ab\u572c\u652c\u7f15\u7696\u5e8d\u8fcd\uff53\u6bd9\u79a9\uff1b"))).defaultValue((Object)(0x3E & 0x73))).sliderRange(2 & 5, 0x9F7 & 0x77FC).build());
        this.IIiiiiIIii = this.IIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u6bcf\u6b64\u6523\u7f36\u6527\u91dd"))).description(IIiiIiIIIi.iiiIiIiiIi("\u6bdd\u6b5a\u652c\u7f15\u7696\u65e2\u5765\u650b\u91dd"))).sliderRange(4 ^ 5, 0xC & 0x7B).defaultValue((Object)(4 ^ 5))).build());
        this.iiiIiIIiii = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u4f05\u5110\u5ec2\u90fa"))).description(IIiiIiIIIi.iiiIiIiiIi("\u4f63\u515a\u6545\u7f7c\u8141\u4e39\u65c2\u5745"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IiiIiIiiIi = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u986b\u90b0\u56a3\u8108"))).description(IIiiIiIIIi.iiiIiIiiIi("\u573a\u594f\u9864\u6d80\u52b2\u56af\u8128\u65c2\u5745"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIIiiIIIIi = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u4e9d\u9821\u90fa"))).description(IIiiIiIIIi.iiiIiIiiIi("\u53f8\u6545\u7f7c\u980d\u90fa\u56af\u8128\u65c2\u5745"))).defaultValue((Object)((3 & 4) != 0))).visible(() -> this.IiiIiIiiIi.get())).build());
        this.iiiIiIiiII = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u7829\u5717\u6c63\u6664"))).description(IIiiIiIIIi.iiiIiIiiIi("\u81d8\u52d3\u7826\u5734\u9629\u78f6\u56e6\u8161\u7696\u6770\u5f43\u6c4f\u6664"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIiiiIiIii = this.IiiiiIIiII.add((Setting)((KeybindSetting.Builder)((KeybindSetting.Builder)((KeybindSetting.Builder)new KeybindSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u7876\u574f\u6c71\u666b\u5fb3\u6320\u953c"))).description(IIiiIiIIIi.iiiIiIiiIi("\u527c\u6370\u8191\u52ba\u784f\u575d\u6c4f\u6664\u76df\u5fd9\u630c\u953c"))).defaultValue((Object)Keybind.none())).build());
        this.ALLATORIxDEMO = this.IiiiiIIiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u7829\u5717\u5ea1\u8fcd"))).description(IIiiIiIIIi.iiiIiIiiIi("\u7806\u5734\u6739\u5f0a\u6c26\u660d\u7696\u5e8d\u8fcd\uff53\u6bd9\u79a9\uff1b"))).defaultValue((Object)(0x7A & 0x37))).sliderRange(3 >> 2, 0x17EC & 0x6BFB).build());
        this.iIIIiiiiIi = this.IiiiiIIiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u7b54\u5fdd\u526c\u6562"))).description(IIiiIiIIIi.iiiIiIiiIi("\u7b5b\u5ffe\u6739\u5f0a\u6c26\u662d\u76b6\u5240\u6562"))).defaultValue((Object)(--5))).sliderRange(3 >> 2, --5).build());
        this.iIiIIiIIIi = this.IiiiiIIiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u7829\u5717\u7c2c\u5799"))).description(IIiiIiIIIi.iiiIiIiiIi("\u901b\u6292\u7826\u5734\u6c26\u662d\u76b6\u7c00\u5799"))).defaultValue((Object)SurroundPlus2.SurroundType.iIIiIiiiIi)).build());
        this.iIIiIiiiIi = this.IiiiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u6e65\u67c1"))).description(IIiiIiIIIi.iiiIiIiiIi("\u6654\u5434\u6e49\u67c1\u56af\u8128\u65c2\u5745"))).defaultValue((Object)(3 >> 2))).build());
        this.IIIIiiIiii = this.IiiiiIiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u5f7f\u72ee\u6a76\u5f1d"))).description(IIiiIiIIIi.iiiIiIiiIi("\u6e20\u6788\u76b6\u5f19\u72a4"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.iIIiIiiiIi.get())).build());
        int n = 2 & 5;
        this.iIIiiiiIii = this.IiiiiIiIiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u51c6\u5942\u4fba\u973a\u98cb\u8260"))).description(IIiiIiIIIi.iiiIiIiiIi("\u51d4\u597c\u652c\u7f15\u65ab\u572c\u7696\u4ffc\u9750\u98e7\u8260"))).defaultValue(new SettingColor(n, 0x60DD & 0x1FEE, n, 0x6F & 0x1A)).build());
        int n2 = 2 & 5;
        this.iIIIIIiiII = this.IiiiiIiIiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIIIIIii.ALLATORIxDEMO("\u51c6\u5942\u7ea2\u6739\u98cb\u8260"))).description(IIiiIiIIIi.iiiIiIiiIi("\u51d4\u597c\u652c\u7f15\u65ab\u572c\u7696\u7ee4\u6753\u98e7\u8260"))).defaultValue(new SettingColor(n2, 0x5FC & 0x7ACF, n2, 0xAFF & 0x75FF)).build());
        IIIIiiiiIi iIIIiiiiIi2 = this;
        IIIIiiiiIi iIIIiiiiIi3 = this;
        IIIIiiiiIi iIIIiiiiIi4 = this;
        iIIIiiiiIi4.iiIiIIiiii = new ArrayList<class_2338>();
        IIIIiiiiIi iIIIiiiiIi5 = this;
        iIIIiiiiIi3.iIiIiiiiII = new ArrayList<class_2338>();
        IIIIiiiiIi iIIIiiiiIi6 = this;
        iIIIiiiiIi5.iIiIiIIIII = new IiIIiIIiiI();
        IIIIiiiiIi iIIIiiiiIi7 = this;
        iIIIiiiiIi3.iiiiiIIiIi = new IiIIiIIiiI();
        iIIIiiiiIi2.IIiIiIIiii = 3 >> 2;
        iIIIiiiiIi2.iIIiIiiIiI = 2 & 5;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIIIIii.ALLATORIxDEMO("P)e$s  0P\u0001a101 \u8bb2\u66f3\u65f2\u5230\u6745\u65ad\u7210\u677b\uff13"));
        }
    }
}

