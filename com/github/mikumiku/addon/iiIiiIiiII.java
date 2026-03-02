/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_2664
 *  net.minecraft.class_2743
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.modules.AntiKnockback;
import java.util.Date;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_2664;
import net.minecraft.class_2743;

public class iiIiiIiiII
extends iIiIiIIIii {
    private final Setting<Boolean> iIIIiiiiIi;
    private final Setting<Integer> iiiIiiIIII;
    private final SettingGroup iIiIIiIIIi;
    private final SettingGroup IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private int iIiiiIiIii;
    private double iIiIiiiiII;
    private final Setting<Integer> IIIIiiIiii;
    private double IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private final Setting<AntiKnockback.Mode> iIIiiIiIiI;
    private double iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private boolean iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    public iiIiiIiiII() {
        iiIiiIiiII iiIiiIiiII2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, IIiIIIIIii.ALLATORIxDEMO("\u5385\u51b1\u9068aC"), IiIiiiIIIi.ALLATORIxDEMO("\u51b5\u5c52\u626b\u5392\u6df2\u51a2\u9067\u655b\u67b1"));
        iiIiiIiiII2.iIiIIiIIIi = iiIiiIiiII2.settings.getDefaultGroup();
        iiIiiIiiII2.IIiIiiiiII = iiIiiIiiII2.settings.createGroup(IIiIIIIIii.ALLATORIxDEMO("+,\u001c)$\u000b/\f"));
        iiIiiIiiII2.iIIiiIiIiI = iiIiiIiiII2.iIiIIiIIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u6a32\u5f22"))).description(IIiIIIIIii.ALLATORIxDEMO("\u9043\u6281\u53a7\u51b3\u906a\u76cc\u5daf\u4f34\u6a6b\u5f67"))).defaultValue((Object)AntiKnockback.Mode.iiiiiIIiIi)).build());
        this.IIIIiiIiii = this.iIiIIiIIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u6c6d\u5e14\u5f29\u5e8b"))).description(IIiIIIIIii.ALLATORIxDEMO("\u6c7c\u5e39\u65d1\u547b\u51b3\u906a\u5187\u5c5b\u7616\u524c\u6bbc"))).defaultValue((Object)(3 ^ 3))).min(3 >> 2).max(0x67 & 0x7C).sliderMax(0x7F & 0x64).visible(() -> {
            if (this.iIIiiIiIiI.get() == AntiKnockback.Mode.ALLATORIxDEMO) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.iiiIiiIIII = this.iIiIIiIIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u57db\u7693\u5f29\u5e8b"))).description(IIiIIIIIii.ALLATORIxDEMO("\u57ca\u76be\u65d1\u547b\u51b3\u906a\u5187\u5c5b\u7616\u524c\u6bbc"))).defaultValue((Object)(2 & 5))).min(3 & 4).max(0x7C & 0x67).sliderMax(0x77 & 0x6C).visible(() -> {
            if (this.iIIiiIiIiI.get() == AntiKnockback.Mode.ALLATORIxDEMO) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iIIIiiiiIi = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u518b\u5c6b\u725f\u70df\u51e8\u902d"))).description(IIiIIIIIii.ALLATORIxDEMO("\u51a5\u5c59\u724c\u70d0\u51b1\u9068"))).defaultValue((Object)(--1 != 0))).build());
        this.IIiIiIIiii = this.iIiIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u9655\u5372\u8137"))).description(IIiIIIIIii.ALLATORIxDEMO("\u9658\u5329\u8150\uff64J\u79b3\u52c2\u65be\u4e47\u53a5\u51b1\u9068"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIIiIiiiIi = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u5397\u576c\u574a\u973b\u6591\u750c\u6565"))).description(IIiIIIIIii.ALLATORIxDEMO("\u53a2\u5742\u5778\u9728\u659e\u7555\u6520"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IIiiIIIIIi = this.IIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u5ee5\u8ff2"))).description(IIiIIIIIii.ALLATORIxDEMO("\u5edc\u7542\u51b3\u904a\u76ec\u5e9c\u8f97B<#\u000b!A"))).defaultValue((Object)(3 >> 2))).min(3 >> 2).max(0x5E & 0x2B).sliderMax(0x1E & 0x6B).visible(() -> {
            if (this.iIIiiIiIiI.get() == AntiKnockback.Mode.iiiiiIIiIi) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.ALLATORIxDEMO = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u79a2\u52cf\u4ffd\u6b4e"))).description(IIiIIIIIii.ALLATORIxDEMO("\u7991\u52e0\u4f84\u6b2bf\u669c\u5917\u5778\u7ebf\u8f8f\r\u001a#\u0005"))).defaultValue((Object)((2 ^ 3) != 0))).visible(() -> {
            if (this.iIIiiIiIiI.get() == AntiKnockback.Mode.iiiiiIIiIi) {
                return 5 >> 2;
            }
            return false;
        })).build());
        iiIiiIiiII iiIiiIiiII3 = this;
        iiIiiIiiII3.iIiiiIiIii = 3 >> 2;
        iiIiiIiiII3.iIiIiIIIII = 5 >> 3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiiIIIi.ALLATORIxDEMO("\u0014\u0016\u0001;7\u001fd\u000f\u0014>\u0005.t\u000ed\u8b8d\u66b7\u65cd\u5274\u677a\u65e9\u722f\u673f\uff2c"));
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive var1_1) {
        v0 = this;
        this = var1_1;
        iIiIiIIIII = v0;
        if (iIiIiIIIII.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        if (((Boolean)iIiIiIIIII.IIiIiIIiii.get()).booleanValue() && (iIiIiIIIII.iIIiiIiIiI.field_1690.field_1881.method_1434() || iIiIiIIIII.iIIiiIiIiI.field_1690.field_1894.method_1434() || iIiIiIIIII.iIIiiIiIiI.field_1690.field_1913.method_1434() || iIiIiIIIII.iIIiiIiIiI.field_1690.field_1849.method_1434())) {
            return;
        }
        if (((Boolean)iIiIiIIIII.iIIiIiiiIi.get()).booleanValue() && !iIiIiIIIII.iIIiiIiIiI.field_1724.method_24828()) {
            return;
        }
        var3_2 = this.packet;
        if (!(var3_2 instanceof class_2743)) ** GOTO lbl-1000
        var2_5 = (class_2743)var3_2;
        if (var2_5.method_11818() != iIiIiIIIII.iIIiiIiIiI.field_1724.method_5628()) {
            return;
        }
        var3_3 = (double)((Integer)iIiIiIIIII.IIIIiiIiii.get()).intValue() / 100.0;
        var5_6 = (double)((Integer)iIiIiIIIII.iiiIiiIIII.get()).intValue() / 100.0;
        switch (((AntiKnockback.Mode)iIiIiIIIII.iIIiiIiIiI.get()).ordinal()) lbl-1000:
        // 2 sources

        {
            case 0: {
                if (false) ** GOTO lbl-1000
                this.cancel();
                v1 = iIiIiIIIII;
                break;
            }
            case 1: {
                this.cancel();
                v2 = iIiIiIIIII;
                v3 = var2_5;
                iIiIiIIIII.iIiIiiiiII = v3.method_11815() / 8000.0;
                iIiIiIIIII.iiiiiIIiIi = v3.method_11816() / 8000.0;
                v2.IiiIiIiiIi = var2_5.method_11819() / 8000.0;
                v2.iIiiiIiIii = (Integer)iIiIiIIIII.IIiiIIIIIi.get();
                v1 = iIiIiIIIII;
                iIiIiIIIII.iIiIiIIIII = 2 ^ 3;
                break;
            }
            case 2: {
                if (var3_3 == 0.0 && var5_6 == 0.0) {
                    this.cancel();
                }
            }
            default: lbl-1000:
            // 2 sources

            {
                v1 = iIiIiIIIII;
            }
        }
        if (((Boolean)v1.iIIIiiiiIi.get()).booleanValue() && this.packet instanceof class_2664) {
            if (iIiIiIIIII.iIIiiIiIiI.get() == AntiKnockback.Mode.iIiIiIIIII) {
                this.cancel();
                return;
            }
            if (iIiIiIIIII.iIIiiIiIiI.get() == AntiKnockback.Mode.iiiiiIIiIi) {
                var2_5 = (class_2664)this.packet;
                this.cancel();
                var3_4 = iIiiiIIiIi.ALLATORIxDEMO((class_2664)var2_5);
                v4 = iIiIiIIIII;
                v5 = var3_4;
                iIiIiIIIII.iIiIiiiiII = v5.field_1352;
                iIiIiIIIII.iiiiiIIiIi = v5.field_1351;
                v4.IiiIiIiiIi = var3_4.field_1350;
                v4.iIiiiIiIii = (Integer)iIiIiIIIII.IIiiIIIIIi.get();
                iIiIiIIIII.iIiIiIIIII = 3 >> 1;
            }
        }
    }

    public void onDeactivate() {
        iiIiiIiiII iiIiiIiiII2 = this;
        iiIiiIiiII iiIiiIiiII3 = this;
        this.iIiIiIIIII = 2 & 5;
        iiIiiIiiII3.iIiiiIiIii = this.iIiIiIIIII;
        iiIiiIiiII3.IiiIiIiiIi = 0.0;
        iiIiiIiiII2.iiiiiIIiIi = 0.0;
        iiIiiIiiII2.iIiIiiiiII = 0.0;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iiIiiIiiII iiIiiIiiII2 = iiIiiIiiII3;
        iiIiiIiiII iiIiiIiiII3 = post;
        iiIiiIiiII iIiIiIIIII2 = iiIiiIiiII2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.get() != AntiKnockback.Mode.iiiiiIIiIi) {
            return;
        }
        if (((Boolean)iIiIiIIIII2.IIiIiIIiii.get()).booleanValue() && (iIiIiIIIII2.iIIiiIiIiI.field_1690.field_1881.method_1434() || iIiIiIIIII2.iIIiiIiIiI.field_1690.field_1894.method_1434() || iIiIiIIIII2.iIIiiIiIiI.field_1690.field_1913.method_1434() || iIiIiIIIII2.iIIiiIiIiI.field_1690.field_1849.method_1434())) {
            return;
        }
        if (iIiIiIIIII2.iIiIiIIIII) {
            iiIiiIiiII iiIiiIiiII4 = iIiIiIIIII2;
            if (iIiIiIIIII2.iIiiiIiIii > 0) {
                iiIiiIiiII4.iIiiiIiIii -= 2 ^ 3;
                return;
            }
            double d = iiIiiIiiII4.iIiIiiiiII;
            iiIiiIiiII iiIiiIiiII5 = iIiIiIIIII2;
            double d2 = iiIiiIiiII5.iiiiiIIiIi;
            double d3 = iiIiiIiiII5.IiiIiIiiIi;
            if (((Boolean)iiIiiIiiII5.ALLATORIxDEMO.get()).booleanValue()) {
                d *= 0.6;
                d3 *= 0.6;
                d2 *= 0.98;
            }
            iIiIiIIIII2.iIIiiIiIiI.field_1724.method_18800(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_18798().field_1352 + d, iIiIiIIIII2.iIIiiIiIiI.field_1724.method_18798().field_1351 + d2, iIiIiIIIII2.iIIiiIiIiI.field_1724.method_18798().field_1350 + d3);
            iIiIiIIIII2.iIiIiIIIII = 5 >> 3;
            iIiIiIIIII2.iIiiiIiIii = iIiIiIIIII2.iIiIiIIIII;
        }
    }
}

