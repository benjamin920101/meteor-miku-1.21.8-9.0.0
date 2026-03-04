/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent
 *  meteordevelopment.meteorclient.events.world.CollisionShapeEvent
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.ItemFrameEntity
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.shape.VoxelShapes
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.block.ScaffoldingBlock
 *  net.minecraft.util.hit.BlockHitResult
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiIIiIi;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.github.mikumiku.addon.mixinface.MySettings;
import com.github.mikumiku.addon.modules.Phase;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent;
import meteordevelopment.meteorclient.events.world.CollisionShapeEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.block.ScaffoldingBlock;
import net.minecraft.util.hit.BlockHitResult;

public class iIIiiiiIii
extends iIiIiIIIii {
    private final Setting<Double> iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Double> IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Phase.PhaseMode> iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    private /* synthetic */ void iiIIiIIiii() {
        iIIiiiiIii iIIiiiiIii2 = this;
        double d = Math.cos(Math.toRadians(iIIiiiiIii2.iIIiiIiIiI.field_1724.method_36454() + 90.0f));
        double d2 = Math.sin(Math.toRadians(iIIiiiiIii2.iIIiiIiIiI.field_1724.method_36454() + 90.0f));
        iIIiiiiIii2.iIIiiIiIiI.field_1724.method_5814(this.iIIiiIiIiI.field_1724.method_23317() + (Double)this.IIiIiIIiii.get() * d, this.iIIiiIiIiI.field_1724.method_23318(), this.iIIiiIiIiI.field_1724.method_23321() + (Double)this.IIiIiIIiii.get() * d2);
    }

    public String getInfoString() {
        return ((Phase.PhaseMode)((Object)this.iIIiIiiiIi.get())).name();
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(CollisionShapeEvent collisionShapeEvent) {
        iIIiiiiIii iIIiiiiIii2 = iIIiiiiIii3;
        iIIiiiiIii iIIiiiiIii3 = collisionShapeEvent;
        iIIiiiiIii iIiIiIIIII2 = iIIiiiiIii2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        switch (((Phase.PhaseMode)((Object)iIiIiIIIII2.iIIiIiiiIi.get())).ordinal()) {
            case 0: {
                if (((CollisionShapeEvent)iIIiiiiIii3).shape == class_259.method_1073() || !(((CollisionShapeEvent)iIIiiiiIii3).shape.method_1107().field_1325 > iIiIiIIIII2.iIIiiIiIiI.field_1724.method_5829().field_1322) || !iIiIiIIIII2.iIIiiIiIiI.field_1724.method_5715()) return;
                ((CollisionShapeEvent)iIIiiiiIii3).shape = class_259.method_1073();
                return;
            }
            case 1: {
                ((CollisionShapeEvent)iIIiiiiIii3).shape = class_259.method_1073();
                iIiIiIIIII2.iIIiiIiIiI.field_1724.field_5960 = 2 ^ 3;
                return;
            }
            case 2: {
                if (!iIiIiIIIII2.iIIiiIiIiI.field_1724.field_5976) return;
                ((CollisionShapeEvent)iIIiiiiIii3).shape = class_259.method_1073();
                return;
            }
        }
    }

    private /* synthetic */ void iiiIiIiiIi() {
        iIIiiiiIii iIIiiiiIii2 = this;
        int n = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8634);
        if (n == -4 >> 2) {
            iIIiiiiIii2.error(MySettings.ALLATORIxDEMO("\u671b\u624e\u5221\u673b\u5f40\u73fd\u73f1\u6206\u73dc\u73f0\u5186\u5344\u4e3c\uff11"), new Object[5 >> 3]);
            return;
        }
        iIIiiiiIii iIIiiiiIii3 = iIIiiiiIii2;
        float f = iIIiiiiIii3.iIIiiIiIiI.field_1724.method_36454();
        float f2 = iIIiiiiIii3.iIIiiIiIiI.field_1724.method_36455();
        class_243 class_2432 = new class_243(Math.floor(iIIiiiiIii2.iIIiiIiIiI.field_1724.method_23317()) + 0.5, 0.0, Math.floor(iIIiiiiIii2.iIIiiIiIiI.field_1724.method_23321()) + 0.5);
        double d = class_2432.field_1352 - iIIiiiiIii2.iIIiiIiIiI.field_1724.method_23317();
        float f3 = (float)(Math.toDegrees(Math.atan2(class_2432.field_1350 - iIIiiiiIii2.iIIiiIiIiI.field_1724.method_23321(), d)) - 90.0) + 180.0f;
        if (((Boolean)iIIiiiiIii3.IIIIiiIiii.get()).booleanValue()) {
            iIIiiiiIii iIIiiiiIii4 = iIIiiiiIii2;
            iIIiiiiIii4.ALLATORIxDEMO(f3);
            iIIiiiiIii4.ALLATORIxDEMO();
        }
        if (((Boolean)iIIiiiiIii2.IiiIiIiiIi.get()).booleanValue()) {
            iIIiiiiIii2.iiiIiIiiIi(f3);
        }
        if (iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(new IiIiiiIIIi(f3, ((Integer)iIIiiiiIii2.iIiIiiiiII.get()).intValue()))) {
            // empty if block
        }
        Rotations.rotate((double)f3, (double)((Integer)iIIiiiiIii2.iIiIiiiiII.get()).intValue(), () -> {
            void iIiIiIIIII2;
            int n2 = n;
            iIIiiiiIii iIiIiIIIII3 = this;
            IiIiiiiIii.ALLATORIxDEMO(n2);
            iIiIiIIIII3.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2886(class_1268.field_5808, 3 & 4, (float)iIiIiIIIII2, (float)((Integer)iIiIiIIIII3.iIiIiiiiII.get()).intValue()));
            iIiIiIIIII3.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
            IiIiiiiIii.ALLATORIxDEMO(n2);
        });
        iIIiiiiIii iIIiiiiIii5 = iIIiiiiIii2;
        iIIiiiiIii5.iIIiiIiIiI.field_1724.method_36456(f);
        iIIiiiiIii5.iIIiiIiIiI.field_1724.method_36457(f2);
    }

    private /* synthetic */ void iiiIiIiiIi(float f) {
        float f2;
        float this22 = f;
        iIIiiiiIii iIiIiIIIII3 = this;
        this22 %= 360.0f;
        if (f2 < 0.0f) {
            this22 += 360.0f;
        }
        class_2338 class_23382 = iIiIiIIIII3.iIIiiIiIiI.field_1724.method_24515();
        class_23382 = (double)this22 >= 22.5 && (double)this22 < 67.5 ? class_23382.method_10072().method_10067() : ((double)this22 >= 67.5 && (double)this22 < 112.5 ? class_23382.method_10067() : ((double)this22 >= 112.5 && (double)this22 < 157.5 ? class_23382.method_10095().method_10067() : ((double)this22 >= 157.5 && (double)this22 < 202.5 ? class_23382.method_10095() : ((double)this22 >= 202.5 && (double)this22 < 247.5 ? class_23382.method_10095().method_10078() : ((double)this22 >= 247.5 && (double)this22 < 292.5 ? class_23382.method_10078() : ((double)this22 >= 292.5 && (double)this22 < 337.5 ? class_23382.method_10072().method_10078() : class_23382.method_10072()))))));
        FindItemResult this22 = InvUtils.findInHotbar(iIiIiIIIII2 -> {
            if (iIiIiIIIII2.method_7909() == class_1802.field_8281 || iIiIiIIIII2.method_7909() == class_1802.field_20399 || iIiIiIIIII2.method_7909() == class_1802.field_22018 || iIiIiIIIII2.method_7909() == class_1802.field_8603 || iIiIiIIIII2.method_7909() == class_1802.field_8773 || iIiIiIIIII2.method_7909() == class_1802.field_8494 || iIiIiIIIII2.method_7909() == class_1802.field_8797 || iIiIiIIIII2.method_7909() == class_1802.field_8793) {
                return true;
            }
            return false;
        });
        if (this22.found() && !iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8320(class_23382.method_10074()).method_45474()) {
            BlockUtils.place((class_2338)class_23382, (FindItemResult)this22, (boolean)(5 >> 2), (int)(3 >> 2));
        }
    }

    private /* synthetic */ boolean iiiiIIIiII() {
        int n;
        iIIiiiiIii iIIiiiiIii2 = iIIiiiiIii3;
        iIIiiiiIii iIIiiiiIii3 = iIIiiiiIii2.iIIiiIiIiI.field_1724.method_5829();
        int n2 = n = class_3532.method_15357((double)((class_238)iIIiiiiIii3).field_1323);
        while (true) {
            if (n2 >= class_3532.method_15357((double)((class_238)iIIiiiiIii3).field_1320) + (4 ^ 5)) break;
            int n3 = class_3532.method_15357((double)((class_238)iIIiiiiIii3).field_1322);
            while (true) {
                int n4;
                if (n3 >= class_3532.method_15357((double)((class_238)iIIiiiiIii3).field_1325) + (2 ^ 3)) break;
                int n5 = class_3532.method_15357((double)((class_238)iIIiiiiIii3).field_1321);
                while (true) {
                    int n6;
                    if (n5 >= class_3532.method_15357((double)((class_238)iIIiiiiIii3).field_1324) + --1) break;
                    class_2338 class_23382 = new class_2338(n, n4, n6);
                    if (iIIiiiiIii2.iIIiiIiIiI.field_1687.method_8320(class_23382).method_51366()) {
                        if (iIIiiiiIii3.method_994(new class_238((double)n, (double)n4, (double)n6, (double)n + 1.0, (double)n4 + 1.0, (double)n6 + 1.0))) {
                            return 5 >> 2;
                        }
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlayerMoveEvent playerMoveEvent) {
        iIIiiiiIii iIIiiiiIii2 = iIIiiiiIii3;
        iIIiiiiIii iIIiiiiIii3 = playerMoveEvent;
        iIIiiiiIii iIiIiIIIII2 = iIIiiiiIii2;
        if (iIiIiIIIII2.iIIiIiiiIi.get() == Phase.PhaseMode.iIiIiIIIII && iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24828() && !iIiIiIIIII2.iIIiiIiIiI.field_1724.method_5765()) {
            class_243 class_2432;
            iIIiiiiIii3 = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24515().method_46558();
            int n = class_2432.field_1352 - iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23317() > 0.0 ? 4 ^ 5 : 0;
            int n2 = ((class_243)iIIiiiiIii3).field_1350 - iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23321() > 0.0 ? 2 ^ 3 : 0;
            double d = ((class_243)iIIiiiiIii3).field_1352 + 0.2 * (double)(n != 0 ? -4 >> 2 : 1);
            double d2 = ((class_243)iIIiiiiIii3).field_1350 + 0.2 * (double)(n2 != 0 ? -4 >> 2 : 1);
            iIIiiiiIii iIIiiiiIii4 = iIiIiIIIII2;
            iIIiiiiIii4.iIIiiIiIiI.field_1724.method_5814(d, iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23318(), d2);
            iIIiiiiIii4.toggle();
        }
    }

    @Override
    public void onActivate() {
        if (this.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        if (this.iIIiIiiiIi.get() == Phase.PhaseMode.iIIiIiiiIi) {
            iIIiiiiIii iIIiiiiIii2 = this;
            iIIiiiiIii2.iiiIiIiiIi();
            iIIiiiiIii2.toggle();
            return;
        }
        if (((Boolean)this.iiiiiIIiIi.get()).booleanValue() && this.iIIiIiiiIi.get() != Phase.PhaseMode.iIiIiIIIII) {
            this.iiIIiIIiii();
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(float f) {
        float this22 = f;
        iIIiiiiIii iIiIiIIIII2 = this;
        Object this22 = (class_3965)iIiIiIIIII2.iIIiiIiIiI.field_1724.method_5745(3.0, 0.0f, 3 >> 2);
        this22 = new class_238(this22.method_17777()).method_1014(0.2);
        for (class_1297 class_12972 : iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8335(null, (class_238)this22)) {
            if (!(class_12972 instanceof class_1533)) continue;
            iIIiiiiIii iIIiiiiIii2 = iIiIiIIIII2;
            iIiIiIIIII2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)class_2824.method_34206((class_1297)class_12972, (boolean)iIIiiiiIii2.iIIiiIiIiI.field_1724.method_5715()));
            iIIiiiiIii2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2879(class_1268.field_5808));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1687.method_8320(this.iIIiiIiIiI.field_1724.method_24515()).method_26204() instanceof class_3736) {
            iIIiiiiIii iIIiiiiIii2 = this;
            iIIiiiiIii2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12968, this.iIIiiIiIiI.field_1724.method_24515(), class_2350.field_11036));
            iIIiiiiIii2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, this.iIIiiIiIiI.field_1724.method_24515(), class_2350.field_11036));
        }
    }

    public iIIiiiiIii() {
        iIIiiiiIii iIIiiiiIii2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, IIiiiIIiIi.ALLATORIxDEMO("\u73e3\u7386\u7a51\u58ff"), MySettings.ALLATORIxDEMO("\u5150\u8ba8\u73bf\u5ba1\u7a6e\u8fd7\u56f6\u4f5e\u65ff\u5710"));
        iIIiiiiIii2.ALLATORIxDEMO = iIIiiiiIii2.settings.getDefaultGroup();
        iIIiiiiIii2.iIiIiIIIII = iIIiiiiIii2.settings.createGroup(IIiiiIIiIi.ALLATORIxDEMO("\u6705\u5f17\u73e3\u7386"));
        iIIiiiiIii2.iIIiiIiIiI = iIIiiiiIii2.settings.createGroup(MySettings.ALLATORIxDEMO("\u7a73\u5894\u8bf8\u7f29"));
        iIIiiiiIii2.iIIiIiiiIi = iIIiiiiIii2.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u6a0f\u5f69"))).description(MySettings.ALLATORIxDEMO("\u7a6e\u5889\u6a2d\u5f02\u904f\u62ae"))).defaultValue((Object)Phase.PhaseMode.IIiIiIIiii)).build());
        this.iIiIiiiiII = this.iIiIiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u4f89\u4ede\u89b4"))).description(MySettings.ALLATORIxDEMO("\u62d0\u63a6\u673b\u5f67\u73da\u73f1\u7694\u4fe3\u4efd\u8994\u5ee1"))).defaultValue((Object)(0x5F & 0x75))).min(0x77 & 0x4E).max(0x5E & 0x7B).visible(() -> {
            if (this.iIIiIiiiIi.get() == Phase.PhaseMode.iIIiIiiiIi) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IIIIiiIiii = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u6515\u519d\u5bb0\u4f35"))).description(MySettings.ALLATORIxDEMO("\u652a\u51eb\u73db\u73f7\u8dfe\u5f94\u4e06\u7689\u5bd8\u4f14"))).defaultValue((Object)((3 ^ 3) != 0))).visible(() -> {
            if (this.iIIiIiiiIi.get() == Phase.PhaseMode.iIIiIiiiIi) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IiiIiIiiIi = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u81c4\u52ce\u5845\u5123"))).description(MySettings.ALLATORIxDEMO("\u81af\u52b9\u5738\u7a69\u588e\u4f5c\u7f7e\u5867\u5148\u65ff\u5710"))).defaultValue((Object)(5 >> 3))).visible(() -> {
            if (this.iIIiIiiiIi.get() == Phase.PhaseMode.iIIiIiiiIi) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.IIiIiIIiii = this.iIIiiIiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u7a51\u58ff\u8df3\u79dd"))).description(MySettings.ALLATORIxDEMO("\u7a68\u5888\u7694\u65b5\u575a\u8d9b\u79fc"))).defaultValue(0.003).min(0.001).max(10.0).sliderMax(1.0).visible(() -> {
            if (this.iIIiIiiiIi.get() != Phase.PhaseMode.iIIiIiiiIi && this.iIIiIiiiIi.get() != Phase.PhaseMode.iIiIiIIIII) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.iIiiiIiIii = this.iIIiiIiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u5061\u799d\u8df3\u79dd"))).description(MySettings.ALLATORIxDEMO("\u7a69\u588e\u65e7\u7694\u5043\u79f6\u8d9b\u79fc"))).defaultValue(0.2).min(0.0).max(10.0).sliderMax(1.0).visible(() -> {
            if (this.iIIiIiiiIi.get() != Phase.PhaseMode.iIIiIiiiIi && this.iIIiIiiiIi.get() != Phase.PhaseMode.iIiIiIIIII) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.iiiiiIIiIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u81c4\u52ce\u7a51\u58ff"))).description(MySettings.ALLATORIxDEMO("\u81fc\u52bf\u6276\u885c\u7a73\u5894\u648b\u4f1b"))).defaultValue((Object)(5 >> 2))).visible(() -> {
            if (this.iIIiIiiiIi.get() != Phase.PhaseMode.iIIiIiiiIi && this.iIIiIiiiIi.get() != Phase.PhaseMode.iIiIiIIIII) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiiiIIiIi.ALLATORIxDEMO("y\r\f@]\u0003.3~\"O\u0012KG\u000e\u8b91\u66da\u65d6\u523e\u6746\u659e\u722e\u6702\uff67"));
        }
    }
}

