/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1802
 *  net.minecraft.class_1835
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2596
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiIiIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIiIiiiiI;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_1835;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;

public class iIiIIiiiIi
extends iIiIiIIIii {
    private final Setting<Boolean> IIIIiiIiii;
    private boolean IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private int iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private final Setting<Double> ALLATORIxDEMO;

    private /* synthetic */ boolean iiIIiIIiii() {
        if (!this.ALLATORIxDEMO()) {
            return (3 ^ 3) != 0;
        }
        if (this.iIIiiIiIiI.field_1724.method_6047().method_7909() == class_1802.field_8547) {
            return this.iIIiiIiIiI.field_1724.method_6047().method_7942();
        }
        if (this.iIIiiIiIiI.field_1724.method_6079().method_7909() == class_1802.field_8547) {
            return this.iIIiiIiIiI.field_1724.method_6079().method_7942();
        }
        return false;
    }

    public String ALLATORIxDEMO() {
        Object object = string3;
        if (!object.isActive()) {
            return iiIiIiiiiI.ALLATORIxDEMO("\u6713\u5421\u7513");
        }
        String string = ((iIiIIiiiIi)object).IiiIiIiiIi ? iIiIiIiIii.ALLATORIxDEMO("\u98c2\u8835\u4e33") : iiIiIiiiiI.ALLATORIxDEMO("\u5f8b\u5446");
        String string2 = (Boolean)((iIiIIiiiIi)object).IIIIiiIiii.get() != false ? iIiIiIiIii.ALLATORIxDEMO("\u513a\u8ba4\u6599\u6c2a") : iiIiIiiiiI.ALLATORIxDEMO("\u9739\u898f\u6c0f");
        String string3 = (Boolean)((iIiIIiiiIi)object).iIIiiIiIiI.get() != false ? iIiIiIiIii.ALLATORIxDEMO("\u8193\u52b6") : iiIiIiiiiI.ALLATORIxDEMO("\u6245\u5293");
        Object[] objectArray = new Object[--3];
        objectArray[2 & 5] = string;
        objectArray[--1] = string2;
        objectArray[--2] = string3;
        return String.format(iIiIiIiIii.ALLATORIxDEMO("Ap_dn\f\u00015\u000f4^o\u6a58\u5f11"), objectArray);
    }

    private /* synthetic */ void iiiIiIiiIi() {
        iIiIIiiiIi iIiIIiiiIi2 = this;
        iIiIIiiiIi2.iIIiIiiiIi += 5 >> 2;
        if (iIiIIiiiIi2.iIIiIiiiIi >= (Integer)this.IIiIiIIiii.get()) {
            if (this.iIIiiIiIiI.field_1724.method_6115() && this.iIIiiIiIiI.field_1724.method_6058() == class_1268.field_5808) {
                if (this.iIIiiIiIiI.field_1724.method_6048() >= (Integer)this.IIiIiIIiii.get()) {
                    iIiIIiiiIi iIiIIiiiIi3 = this;
                    this.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
                    iIiIIiiiIi3.iIIiiIiIiI.field_1724.method_6075();
                    iIiIIiiiIi3.iIIiIiiiIi = 3 >> 2;
                    if (!iIiIIiiiIi3.IiiIiIiiIi) {
                        this.IiiIiIiiIi = --1;
                        this.info(iIiIiIiIii.ALLATORIxDEMO("\u5f38\u59b4\u98c6\u8813\uff39"), new Object[3 >> 2]);
                        return;
                    }
                }
            } else if (this.iIIiiIiIiI.field_1724.method_6047().method_7909() instanceof class_1835) {
                iIiIIiiiIi iIiIIiiiIi4 = this;
                iIiIIiiiIi4.iIIiiIiIiI.field_1724.method_5660((2 & 5) != 0);
                iIiIIiiiIi4.iIIiiIiIiI.field_1724.method_6043();
            }
        }
    }

    public iIiIIiiiIi() {
        iIiIIiiiIi iIiIIiiiIi2 = this;
        super(iiIiIiiiiI.ALLATORIxDEMO("\u4e14\u53fc\u621f\u98a1\u8806"), iIiIiIiIii.ALLATORIxDEMO("\u4f40\u7577\u4e31\u538b\u623a\u98d6\u8823"));
        iIiIIiiiIi2.iIiIiIIIII = iIiIIiiiIi2.settings.getDefaultGroup();
        iIiIIiiiIi2.IIIIiiIiii = iIiIIiiiIi2.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u5174\u8bb8\u659f\u6c7e"))).description(iIiIiIiIii.ALLATORIxDEMO("\u5179\u8bc7\u5730\u6cfe\u6731\u6c3e\u76e9\u609a\u518d\u4e53\u4f40\u7577\u4e31\u538b\u623a\u98d6\u8823"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIIiiIiIiI = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u81df\u52a8\u98a1\u8806"))).description(iIiIiIiIii.ALLATORIxDEMO("\u81b2\u5297\u4f20\u7510\u6f82\u6d64\u6540\u67f3"))).defaultValue((Object)(5 >> 3))).build());
        this.IIiIiIIiii = this.iIiIiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u89d3\u53d1\u958b\u96de"))).description(iIiIiIiIii.ALLATORIxDEMO("\u6fd8\u6d1e\u5298\u9015\u4e26\u95ab\u76bc\u95ac\u96ab\uff57L+Fc\uff66"))).defaultValue((Object)(--3))).min(3 & 4).sliderMax(0x5F & 0x34).visible(() -> (Boolean)this.iIIiiIiIiI.get())).build());
        this.ALLATORIxDEMO = this.iIiIiIIIII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u902a\u5ea6\u5072\u73cd"))).description(iIiIiIiIii.ALLATORIxDEMO("\u98e1\u8813\u9027\u5ee4\u76a1\u5005\u651f"))).defaultValue(1.0).min(0.5).max(3.0).sliderMin(0.5).sliderMax(3.0).build());
        this.iiiiiIIiIi = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u81df\u52a8\u5278\u6328"))).description(iIiIiIiIii.ALLATORIxDEMO("\u81b2\u5297\u5258\u635a\u5272\u4e2c\u53c1\u6270"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        iIiIIiiiIi iIiIIiiiIi3 = this;
        iIiIIiiiIi3.iIIiIiiiIi = 2 & 5;
        iIiIIiiiIi3.IiiIiIiiIi = 2 & 5;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIiIiiiiI.ALLATORIxDEMO("XQM|[x\bhxYIi\u0018i\b\u8bea\u66db\u65aa\u5218\u671d\u6585\u7248\u6753\uff4b"));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIiIIiiiIi iIiIIiiiIi2;
        iIiIIiiiIi iIiIIiiiIi3 = iIiIIiiiIi4;
        iIiIIiiiIi iIiIIiiiIi4 = post;
        iIiIIiiiIi iIiIiIIIII2 = iIiIIiiiIi3;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (!iIiIiIIIII2.ALLATORIxDEMO()) {
            if (!((Boolean)iIiIiIIIII2.iiiiiIIiIi.get()).booleanValue()) return;
            iIiIIiiiIi iIiIIiiiIi5 = iIiIiIIIII2;
            iIiIIiiiIi2 = iIiIIiiiIi5;
            iIiIIiiiIi5.ALLATORIxDEMO();
        } else {
            iIiIIiiiIi2 = iIiIiIIIII2;
        }
        if (!((Boolean)iIiIIiiiIi2.iIIiiIiIiI.get()).booleanValue()) return;
        iIiIiIIIII2.iiiIiIiiIi();
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiIIiiiIi iIiIIiiiIi2 = this;
        int n = this = 5 >> 3;
        while (true) {
            if (n >= 9) break;
            if (iIiIIiiiIi2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909() == class_1802.field_8547) {
                iIiiiIIiIi.ALLATORIxDEMO(this);
                return;
            }
            n = ++this;
        }
        int n2 = this = 9;
        while (true) {
            if (n2 >= 36) break;
            if (iIiIIiiiIi2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909() == class_1802.field_8547) {
                iIiIIiiiIi2.info(iiIiIiiiiI.ALLATORIxDEMO("\u5725\u4e03\u7269\u54f4\u681a\u4e0d\u6270\u520b\u4e95\u4e2f\u53c1\u6222\uff35\u8bfb\u624e\u5298\u79ff\u5299\u523c\u5fd2\u6379\u6834"), new Object[3 ^ 3]);
                return;
            }
            n2 = ++this;
        }
        iIiIIiiiIi2.info(iIiIiIiIii.ALLATORIxDEMO("\u6cb4\u677a\u626a\u524b\u4e15\u53b0\u6201"), new Object[3 >> 2]);
        iIiIIiiiIi2.toggle();
    }

    public void onDeactivate() {
        this.info(iiIiIiiiiI.ALLATORIxDEMO("\u4e09\u53e1\u6202\u98e9\u884e\u6a01\u5742\u5dc7\u505c\u750c\uff10"), new Object[3 & 4]);
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1724.method_6047().method_7909() == class_1802.field_8547 || this.iIIiiIiIiI.field_1724.method_6079().method_7909() == class_1802.field_8547) {
            return true;
        }
        return false;
    }

    @Override
    public void onActivate() {
        this.iIIiIiiiIi = 3 ^ 3;
        this.IiiIiIiiIi = this.iIIiIiiiIi;
        this.info(iIiIiIiIii.ALLATORIxDEMO("\u4e2c\u5396\u6227\u989e\u886b\u6a76\u5767\u5db0\u540a\u757b\uff35"), new Object[3 & 4]);
    }
}

