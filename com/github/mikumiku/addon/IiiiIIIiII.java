/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent
 *  meteordevelopment.meteorclient.mixininterface.IVec3d
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiiIIIiiiI;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent;
import meteordevelopment.meteorclient.mixininterface.IVec3d;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;

public class IiiiIIIiII
extends iIiIiIIIii {
    private final SettingGroup iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Double> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    public boolean ALLATORIxDEMO() {
        IiiiIIIiII iiiiIIIiII = this;
        boolean bl = Input.isPressed((class_304)iiiiIIIiII.iIIiiIiIiI.field_1690.field_1894) || Input.isPressed((class_304)iiiiIIIiII.iIIiiIiIiI.field_1690.field_1881) || Input.isPressed((class_304)iiiiIIIiII.iIIiiIiIiI.field_1690.field_1913) || Input.isPressed((class_304)iiiiIIIiII.iIIiiIiIiI.field_1690.field_1849) || Input.isPressed((class_304)iiiiIIIiII.iIIiiIiIiI.field_1690.field_1903) || Input.isPressed((class_304)iiiiIIIiII.iIIiiIiIiI.field_1690.field_1832);
        return bl;
    }

    public IiiiIIIiII() {
        IiiiIIIiII iiiiIIIiII = this;
        super(iIIIIiIiii.ALLATORIxDEMO("\u60f0\u5028"), iiiIIIiiiI.ALLATORIxDEMO("\u517a\u8bad\u73e7\u5bf6\u5733\u7a3d\u4e31\u4f9d\u631a\u4f10\u7f68\u4e1a\u5394"));
        iiiiIIIiII.iIIiiIiIiI = iiiiIIIiII.settings.getDefaultGroup();
        iiiiIIIiII.iIiIiIIIII = iiiiIIIiII.iIIiiIiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u60ba\u5062\u9043\u5ed2"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u60eb\u5040\u65b6\u769f\u79a6\u52ae\u9008\u5eea"))).defaultValue(0.1).min(0.01).sliderRange(0.01, 1.0).build());
        this.iIIiIiiiIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5726\u975c\u79dd\u755c"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u573d\u73e7\u5bf6\u63be\u89a1\u572c\u9722\u65ed\u79dc\u752e\u60bb\u5010"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.ALLATORIxDEMO = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u81fc\u5296\u97c4\u7fb1"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u81d1\u52c8\u6ffb\u6d2e\u97d6\u7f85\u98c5\u880b\u4ef9\u4f9d\u631a\u60f1\u505a\u72a1\u604d"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiiiIIiIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u79d8\u52be\u65c8\u66de\u5028"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u5f13\u73b2\u5bf1\u79e7\u52e8\u65ed\u66df\u505a\u60bb\u5010"))).defaultValue((Object)((3 & 5) != 0))).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIiIiii.ALLATORIxDEMO("{oNbXf+V[gJw;W+\u8bd4\u66f8\u6594\u523b\u6723\u65a6\u7276\u6770\uff75"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlayerMoveEvent playerMoveEvent) {
        IiiiIIIiII iiiiIIIiII = this;
        if (iiiiIIIiII.iIIiiIiIiI.field_1724 == null || iiiiIIIiII.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (((Boolean)iiiiIIIiII.iIIiIiiiIi.get()).booleanValue() && iiiiIIIiII.iIIiiIiIiI.field_1724.method_24828()) {
            return;
        }
        if (((Boolean)iiiiIIIiII.ALLATORIxDEMO.get()).booleanValue() && !iIiiiIIiIi.iiIIiIIiii((class_310)iiiiIIIiII.iIIiiIiIiI) && !iiiiIIIiII.iIIiiIiIiI.field_1724.method_24828()) {
            iiiiIIIiII.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)iiiiIIIiII.iIIiiIiIiI.field_1724, class_2848.class_2849.field_12982));
        }
        if (iIiiiIIiIi.iiIIiIIiii((class_310)iiiiIIIiII.iIIiiIiIiI)) {
            void v2;
            class_243 iIiIiIIIII2;
            IiiiIIIiII iiiiIIIiII2 = iiiiIIIiII;
            float f = iIiiiIIiIi.iiiIiIiiIi(iiiiIIIiII2.iIIiiIiIiI.field_1724.field_3913);
            float f2 = iIiiiIIiIi.ALLATORIxDEMO(iiiiIIIiII2.iIIiiIiIiI.field_1724.field_3913);
            float f3 = iiiiIIIiII2.iIIiiIiIiI.field_1724.method_36454();
            double d = Math.cos(Math.toRadians(f3 + 90.0f));
            double d2 = Math.sin(Math.toRadians(f3 + 90.0f));
            double d3 = ((double)f * d + (double)f2 * d2) * (Double)iiiiIIIiII.iIiIiIIIII.get();
            d = ((double)f * d2 - (double)f2 * d) * (Double)iiiiIIIiII.iIiIiIIIII.get();
            d2 = 0.0;
            IiiiIIIiII iiiiIIIiII3 = iiiiIIIiII;
            if (iiiiIIIiII.iIIiiIiIiI.field_1690.field_1903.method_1434()) {
                d2 = (Double)iiiiIIIiII3.iIiIiIIIII.get();
                v2 = iIiIiIIIII2;
            } else {
                if (iiiiIIIiII3.iIIiiIiIiI.field_1690.field_1832.method_1434()) {
                    d2 = -((Double)iiiiIIIiII.iIiIiIIIII.get()).doubleValue();
                }
                v2 = iIiIiIIIII2;
            }
            iIiiiIIiIi.ALLATORIxDEMO((IVec3d)v2.movement, d3, d2, d);
            IiiiIIIiII iiiiIIIiII4 = iiiiIIIiII;
            iIiIiIIIII2 = iiiiIIIiII4.iIIiiIiIiI.field_1724.method_18798();
            iiiiIIIiII4.iIIiiIiIiI.field_1724.method_18800(iIiIiIIIII2.field_1352, iIiIiIIIII2.field_1351 * 0.9, iIiIiIIIII2.field_1350);
        }
        boolean f = false;
        if (((Boolean)iiiiIIIiII.iiiiiIIiIi.get()).booleanValue()) {
            f = iiiiIIIiII.ALLATORIxDEMO();
        }
        if (!f) {
            iiiiIIIiII.ALLATORIxDEMO();
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiiiIIIiII iiiiIIIiII;
        IiiiIIIiII iiiiIIIiII2 = iiiiIIIiII = this;
        float f = iiiiIIIiII2.iIIiiIiIiI.field_1724.method_36454();
        iiiiIIIiII2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO(f, iiiiIIIiII.iIIiiIiIiI.field_1724.method_36455(), iiiiIIIiII.iIIiiIiIiI.field_1724.method_24828()));
    }
}

