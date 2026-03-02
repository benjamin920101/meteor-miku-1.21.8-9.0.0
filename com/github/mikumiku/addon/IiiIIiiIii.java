/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IIiiiiIIII;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.modules.FastFall;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_243;

public class IiiIIiiIii
extends iIiIiIIIii {
    private boolean IIiIiiiiII;
    private static final long IIiiIIIIIi = 1000L;
    private final Setting<Double> iIiiiIiIii;
    private final SettingGroup iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private long IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private boolean iiiiiIIiIi;
    private final Setting<Double> iIIiIiiiIi;
    private int iIiIiIIIII;
    private final Setting<FastFall.FallMode> ALLATORIxDEMO;

    private /* synthetic */ boolean iiIIiIIiii() {
        if (this.iIIiiIiIiI.field_1724 == null) {
            return 3 >> 2;
        }
        if (this.iIIiiIiIiI.field_1724.method_3144() || iIiiiIIiIi.iiIIiIIiii(this.iIIiiIiIiI) || this.iIIiiIiIiI.field_1724.method_6101() || this.iIIiiIiIiI.field_1724.method_5771() || this.iIIiiIiIiI.field_1724.method_5799() || iIiiiIIiIi.iiiIiIiiIi(this.iIIiiIiIiI) || iIiiiIIiIi.ALLATORIxDEMO(this.iIIiiIiIiI)) {
            return false;
        }
        if (this.iIIiiIiIiI.field_1724.method_6059(class_1294.field_5902) || this.iIIiiIiIiI.field_1724.method_6059(class_1294.field_5906)) {
            return false;
        }
        return true;
    }

    public IiiIIiiIii() {
        IiiIIiiIii iiiIIiiIii = this;
        super(IIiIIIIIii.ALLATORIxDEMO("\u5f81\u9057\u4e61\u8475"), IIiiiiIIII.ALLATORIxDEMO("\u669c\u5faf\u5778\u4e4f\u9605"));
        iiiIIiiIii.iIiIiiiiII = iiiIIiiIii.settings.getDefaultGroup();
        iiiIIiiIii.iIIiIiiiIi = iiiIIiiIii.iIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u9ab2\u5eee"))).description(IIiiiiIIII.ALLATORIxDEMO("\u6764\u594f\u4e4f\u8475\u9a9c\u5eee"))).defaultValue(3.0).min(1.0).max(10.0).sliderMin(1.0).sliderMax(10.0).build());
        this.ALLATORIxDEMO = this.iIiIiiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u6a4b\u5f47"))).description(IIiiiiIIII.ALLATORIxDEMO("\u4e4f\u8475\u6a65\u5f47"))).defaultValue((Object)FastFall.FallMode.iIIiIiiiIi)).build());
        this.iIIiiIiIiI = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u52ca\u9057"))).description(IIiiiiIIII.ALLATORIxDEMO("\u52c4\u9077\u4e4f\u8475\u905b\u5eee"))).defaultValue((Object)(3 >> 2))).visible(() -> {
            if (this.ALLATORIxDEMO.get() == FastFall.FallMode.iIIiIiiiIi) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IIiIiIIiii = this.iIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u5025\u79b3\u5251\u6538"))).description(IIiiiiIIII.ALLATORIxDEMO("\u5459\u5229\u5027\u79bf\u76cc\u527f\u6538"))).defaultValue((Object)(--3))).min(--1).sliderMax(--5).visible(() -> {
            if (this.ALLATORIxDEMO.get() == FastFall.FallMode.iiiiiIIiIi) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.IIIIiiIiii = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u9658\u8e6a"))).description(IIiiiiIIII.ALLATORIxDEMO("\u965a\u6b06\u5688\u8f83\u5fa3\u4e4f\u8475\u88cf\u6765\u52e5\u5620\u8e66\u51b2"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiiiIiIii = this.iIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u674a\u5c67\u4e61\u8475\u8db7\u79f3"))).description(IIiiiiIIII.ALLATORIxDEMO("\u898e\u5395\u5fa3\u905b\u4e43\u8459\u76ec\u6744\u5c47\u8d99\u79f3"))).defaultValue(0.5).min(0.1).max(2.0).sliderMin(0.1).sliderMax(2.0).build());
        IiiIIiiIii iiiIIiiIii2 = this;
        this.IIiIiiiiII = 5 >> 3;
        this.iiiiiIIiIi = 2 & 5;
        iiiIIiiIii2.iIiIiIIIII = this.iiiiiIIiIi;
        iiiIIiiIii2.IiiIiIiiIi = 0L;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiIIIIIii.ALLATORIxDEMO("=#Hn9\rJ=\u001a,+\u001c/IJ\u8bbf\u669e\u65f8\u527a\u6768\u65da\u7200\u6746\uff49"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiiIIiiIii iiiIIiiIii = iiiIIiiIii3;
        if (!iiiIIiiIii.iiIIiIIiii()) {
            return;
        }
        if (iiiIIiiIii.iiiIiIiiIi()) {
            return;
        }
        double d = iiiIIiiIii.ALLATORIxDEMO();
        if (d < (Double)iiiIIiiIii.iIiiiIiIii.get() || d > (Double)iiiIIiiIii.iIIiIiiiIi.get()) {
            return;
        }
        if (!iiiIIiiIii.iIIiiIiIiI.field_1724.method_24828()) {
            return;
        }
        if (((Boolean)iiiIIiiIii.IIIIiiIiii.get()).booleanValue() && System.currentTimeMillis() - iiiIIiiIii.IiiIiIiiIi < 1000L) {
            return;
        }
        IiiIIiiIii iiiIIiiIii2 = iiiIIiiIii;
        IiiIIiiIii iiiIIiiIii3 = iiiIIiiIii2.iIIiiIiIiI.field_1724.method_18798();
        iiiIIiiIii2.iIIiiIiIiI.field_1724.method_18800(((class_243)iiiIIiiIii3).field_1352 * 0.05, ((class_243)iiiIIiiIii3).field_1351, ((class_243)iiiIIiiIii3).field_1350 * 0.05);
        d = (Boolean)iiiIIiiIii2.iIIiiIiIiI.get() != false ? ((class_243)iiiIIiiIii3).field_1351 - 0.62 : -3.0;
        iiiIIiiIii.iIIiiIiIiI.field_1724.method_18800(((class_243)iiiIIiiIii3).field_1352 * 0.05, d, ((class_243)iiiIIiiIii3).field_1350 * 0.05);
        iiiIIiiIii.IiiIiIiiIi = System.currentTimeMillis();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlayerMoveEvent playerMoveEvent) {
        IiiIIiiIii iiiIIiiIii = iiiIIiiIii2;
        IiiIIiiIii iiiIIiiIii2 = playerMoveEvent;
        IiiIIiiIii iIiIiIIIII2 = iiiIIiiIii;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (iIiIiIIIII2.ALLATORIxDEMO.get() == FastFall.FallMode.iiiiiIIiIi) {
            IiIiIIiiii.iiIIiIIiii(IIiiiiIIII.ALLATORIxDEMO("\u6394\u7972\uff7e\u8b9f\u4e69\u89e9\u4f3b\u7560\u8ba1\u6a69\u5f6b\uff64d\u6ce9\u51dd\u5bc4"));
        }
    }

    @Override
    public void onActivate() {
        IiiIIiiIii iiiIIiiIii = this;
        super.onActivate();
        this.iiiiiIIiIi = 3 & 4;
        iiiIIiiIii.iIiIiIIIII = 3 ^ 3;
        iiiIIiiIii.IIiIiiiiII = this.iIIiiIiIiI.field_1724 != null && this.iIIiiIiIiI.field_1724.method_24828() ? --1 : 0;
    }

    private /* synthetic */ double ALLATORIxDEMO() {
        double d;
        IiiIIiiIii iiiIIiiIii = iiiIIiiIii2;
        IiiIIiiIii iiiIIiiIii2 = iiiIIiiIii.iIIiiIiIiI.field_1724.method_5829();
        double d2 = d = 0.0;
        while (d2 < (Double)iiiIIiiIii.iIIiIiiiIi.get() + 0.5) {
            if (!iiiIIiiIii.iIIiiIiIiI.field_1687.method_8587((class_1297)iiiIIiiIii.iIIiiIiIiI.field_1724, iiiIIiiIii2.method_989(0.0, -d, 0.0))) {
                return d;
            }
            d2 = d + 0.01;
        }
        return -1.0;
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        boolean bl;
        try {
            bl = false;
        }
        catch (Exception exception) {
            return (2 & 5) != 0;
        }
        return bl;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiiIIiiIii iiiIIiiIii = iiiIIiiIii2;
        IiiIIiiIii iiiIIiiIii2 = post;
        IiiIIiiIii iIiIiIIIII2 = iiiIIiiIii;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        IiiIIiiIii iiiIIiiIii3 = iIiIiIIIII2;
        iiiIIiiIii3.IIiIiiiiII = iiiIIiiIii3.iIIiiIiIiI.field_1724.method_24828();
        if (iiiIIiiIii3.ALLATORIxDEMO.get() == FastFall.FallMode.iIIiIiiiIi) {
            iIiIiIIIII2.ALLATORIxDEMO();
        }
    }

    public void onDeactivate() {
        IiiIIiiIii iiiIIiiIii = this;
        iiiIIiiIii.iiiiiIIiIi = 5 >> 3;
        iiiIIiiIii.iIiIiIIIII = 3 & 4;
    }
}

