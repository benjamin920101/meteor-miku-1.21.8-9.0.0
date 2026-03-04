/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIiiiIiii;
import com.github.mikumiku.addon.iiiiiiiiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class iIIIIiiiIi
extends iIiIiIIIii {
    private final Setting<Boolean> iIIiiIiIiI;
    private final Setting<Double> iiiiiIIiIi;
    private final SettingGroup iIIiIiiiIi;
    private final Setting<Double> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ boolean ALLATORIxDEMO(double iIiIiIIIII2) {
        double d;
        double d2 = iIiIiIIIII2;
        iIiIiIIIII2 = d2 - Math.floor(d2);
        if (d >= 0.3 && iIiIiIIIII2 <= 0.7) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    private /* synthetic */ double ALLATORIxDEMO(double iIiIiIIIII2) {
        double d;
        double d2 = iIiIiIIIII2;
        double d3 = d2 - Math.floor(d2);
        if (d >= 0.3 && d3 <= 0.7) {
            return Math.floor(iIiIiIIIII2) + 0.5;
        }
        if (d3 < 0.3) {
            return Math.floor(iIiIiIIIII2) + 0.5;
        }
        return Math.floor(iIiIiIIIII2) + 0.5;
    }

    public boolean ALLATORIxDEMO() {
        iIIIIiiiIi iIIIIiiiIi2 = iIIIIiiiIi4;
        if (iIIIIiiiIi2.iIIiiIiIiI.field_1724 == null) {
            return (2 & 5) != 0;
        }
        iIIIIiiiIi iIIIIiiiIi3 = iIIIIiiiIi2;
        iIIIIiiiIi iIIIIiiiIi4 = iIIIIiiiIi3.iIIiiIiIiI.field_1724.method_19538();
        if (iIIIIiiiIi3.ALLATORIxDEMO(((class_243)iIIIIiiiIi4).field_1352) && iIIIIiiiIi2.ALLATORIxDEMO(((class_243)iIIIIiiiIi4).field_1350)) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        double d;
        iIIIIiiiIi iIIIIiiiIi2 = iIIIIiiiIi3;
        iIIIIiiiIi iIIIIiiiIi3 = pre;
        iIIIIiiiIi iIiIiIIIII2 = iIIIIiiiIi2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        if (((Boolean)iIiIiIIIII2.ALLATORIxDEMO.get()).booleanValue() && !iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24828()) {
            iIiIiIIIII2.toggle();
            return;
        }
        if (iIiIiIIIII2.ALLATORIxDEMO()) {
            iIiIiIIIII2.toggle();
            return;
        }
        iIIIIiiiIi iIIIIiiiIi4 = iIiIiIIIII2;
        iIIIIiiiIi3 = iIiiiIIiIi.ALLATORIxDEMO((class_1297)iIIIIiiiIi4.iIIiiIiIiI.field_1724);
        double d2 = ((class_243)iIIIIiiiIi3).field_1352;
        double d3 = ((class_243)iIIIIiiiIi3).field_1350;
        double d4 = ((class_243)iIIIIiiiIi3).field_1351;
        double d5 = iIIIIiiiIi4.ALLATORIxDEMO(d2);
        double d6 = iIIIIiiiIi4.ALLATORIxDEMO(d3);
        double d7 = d5 -= d2;
        double d8 = d6 -= d3;
        double d9 = Math.sqrt(d7 * d7 + d8 * d8);
        if (d < (Double)iIiIiIIIII2.iIiIiIIIII.get()) {
            iIiIiIIIII2.toggle();
            return;
        }
        double d10 = Math.min((Double)iIiIiIIIII2.iiiiiIIiIi.get(), d9);
        d5 = d5 / d9 * d10;
        d6 = d6 / d9 * d10;
        iIIIIiiiIi iIIIIiiiIi5 = iIiIiIIIII2;
        if (((Boolean)iIiIiIIIII2.iIIiiIiIiI.get()).booleanValue()) {
            iIIIIiiiIi5.iIIiiIiIiI.field_1724.method_5814(d2 + d5, d4, d3 + d6);
            return;
        }
        iIIIIiiiIi5.iIIiiIiIiI.field_1724.method_5814(d2 + d5, ((class_243)iIIIIiiiIi3).field_1351, d3 + d6);
    }

    public iIIIIiiiIi() {
        iIIIIiiiIi iIIIIiiiIi2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, iiiiiiiiii.ALLATORIxDEMO("\u628e\u65ce\u5730\u4e7a\u5f84"), iiIiiiIiii.ALLATORIxDEMO("\u81b4\u52d5\u5c17\u73d1\u5ba2\u7983\u52bc\u5243\u65a6\u5725\u4e33\u5ff1\u4f13\u7f1b9}A{\nxA{\u000eY9\u000f7F4/\u0017B0"));
        iIIIIiiiIi2.iIIiIiiiIi = iIIIIiiiIi2.settings.getDefaultGroup();
        iIIIIiiiIi2.iiiiiIIiIi = iIIIIiiiIi2.iIIiIiiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u9048\u5ee1"))).description(iiIiiiIiii.ALLATORIxDEMO("\u798e\u52b1\u5245\u65a0\u5722\u4e34\u5f96\u76bd\u906a\u5ebf"))).defaultValue(0.2).min(0.01).max(1.0).sliderMin(0.01).sliderMax(1.0).build());
        this.ALLATORIxDEMO = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u4eb2\u574f\u5767\u9725"))).description(iiIiiiIiii.ALLATORIxDEMO("\u53bf\u6730\u575d\u5729\u9717\u4e13\u6583\u6254\u81bf\u5291\u5c30\u4e34"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiIiIiI = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u4faa\u6366\u000e\u8f33"))).description(iiIiiiIiii.ALLATORIxDEMO("\u79c2\u52dd\u65ef\u4fa8\u6318,\u8f6d\u4f18\u7f57\u4e78\u53c1"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiIiIIIII = this.iIIiIiiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u6777\u5c68\u5018\u79bc"))).description(iiIiiiIiii.ALLATORIxDEMO("\u89df\u53a4\u5c5c\u4e58\u769d\u6775\u5c16\u501a\u79c2\u8da8\u79a2"))).defaultValue(0.01).min(0.001).max(0.2).sliderMin(0.001).sliderMax(0.2).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiiiiiiii.ALLATORIxDEMO("\u0000,ua$\"W\u0012\u0007\u0003\u0016\u0013\u0012Fw\u8bb0\u66a3\u65f7\u5267\u6747\u65c7\u722f\u677b\uff46"));
        }
    }
}

