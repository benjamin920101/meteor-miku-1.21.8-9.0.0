/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Sent
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.combat.CrystalAura
 *  meteordevelopment.meteorclient.systems.modules.combat.Surround
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1922
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_238
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.IiIIiiIIII;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.modules.Criticals;
import java.util.Date;
import java.util.Random;
import meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.systems.modules.combat.Surround;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2848;

public class IiIiIIIIii
extends iIiIiIIIii {
    private final Random IIiiIIIIIi;
    private boolean iIiiiIiIii;
    private final Setting<Boolean> iIiIiiiiII;
    private long IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private boolean iiiiiIIiIi;
    private final Setting<Criticals.Mode> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1297 class_12972) {
        IiIiIIIIii iiIiIIIIii2 = this;
        if (!iiIiIIIIii2.iIIiiIiIiI.field_1724.method_24828() || iIiiiIIiIi.ALLATORIxDEMO(iiIiIIIIii2.iIIiiIiIiI)) {
            return;
        }
        IiIiIIIIii iiIiIIIIii3 = iiIiIIIIii2;
        double d = iiIiIIIIii3.iIIiiIiIiI.field_1724.method_23317();
        double d2 = iiIiIIIIii3.iIIiiIiIiI.field_1724.method_23318();
        double d3 = iiIiIIIIii3.iIIiiIiIiI.field_1724.method_23321();
        float f = iiIiIIIIii3.iIIiiIiIiI.field_1724.method_36454();
        float f2 = iiIiIIIIii3.iIIiiIiIiI.field_1724.method_36455();
        switch (((Criticals.Mode)((Object)iiIiIIIIii3.iIIiIiiiIi.get())).ordinal()) {
            case 0: {
                void iIiIiIIIII2;
                IiIiIIIIii iiIiIIIIii4 = iiIiIIIIii2;
                double d4 = 1.0E-7 + 1.0E-7 * (1.0 + (double)iiIiIIIIii4.IIiiIIIIIi.nextInt(iiIiIIIIii4.IIiiIIIIIi.nextBoolean() ? 0x2A & 0x77 : 43));
                IiIiIIIIii iiIiIIIIii5 = iiIiIIIIii2;
                double d5 = d;
                iiIiIIIIii2.ALLATORIxDEMO(d5, d2 + 0.1016 + d4 * 3.0, d3, (3 ^ 3) != 0);
                iiIiIIIIii5.ALLATORIxDEMO(d5, d2 + 0.0202 + d4 * 2.0, d3, 3 >> 2);
                iiIiIIIIii5.ALLATORIxDEMO(d, d2 + 3.239E-4 + d4, d3, 5 >> 3);
                iiIiIIIIii5.iIIiiIiIiI.field_1724.method_7277((class_1297)iIiIiIIIII2);
                return;
            }
            case 1: {
                void iIiIiIIIII2;
                IiIiIIIIii iiIiIIIIii6 = iiIiIIIIii2;
                iiIiIIIIii6.ALLATORIxDEMO(d, d2 + 0.0625, d3, (2 & 5) != 0);
                iiIiIIIIii6.ALLATORIxDEMO(d, d2, d3, (2 & 5) != 0);
                iiIiIIIIii2.iIIiiIiIiI.field_1724.method_7277((class_1297)iIiIiIIIII2);
                return;
            }
            case 2: {
                if (System.currentTimeMillis() - iiIiIIIIii2.IIIIiiIiii < 500L) return;
                double d6 = d;
                iiIiIIIIii2.ALLATORIxDEMO(d6, d2 + 1.1E-7, d3, 5 >> 3);
                iiIiIIIIii2.ALLATORIxDEMO(d6, d2 + 1.0E-8, d3, 5 >> 3);
                iiIiIIIIii2.iiiiiIIiIi = 3 & 5;
                iiIiIIIIii2.IIIIiiIiii = System.currentTimeMillis();
                return;
            }
            case 3: {
                if (((Boolean)iiIiIIIIii2.iIiIiiiiII.get()).booleanValue() && ((Boolean)iiIiIIIIii2.IIiIiIIiii.get() != false ? !iiIiIIIIii2.ALLATORIxDEMO() : !iiIiIIIIii2.iiIIiIIiii())) {
                    return;
                }
                if (((Boolean)iiIiIIIIii2.iIiIiIIIII.get()).booleanValue() && PlayerUtils.isMoving()) {
                    return;
                }
                if (System.currentTimeMillis() - iiIiIIIIii2.IIIIiiIiii < 250L || iiIiIIIIii2.iIIiiIiIiI.field_1724.method_20448()) return;
                IiIiIIIIii iiIiIIIIii7 = iiIiIIIIii2;
                double d7 = d;
                iiIiIIIIii2.ALLATORIxDEMO(d7, d2 + 0.0625, d3, f, f2, (2 & 5) != 0);
                iiIiIIIIii7.ALLATORIxDEMO(d7, d2 + 0.0625013579, d3, f, f2, (3 ^ 3) != 0);
                iiIiIIIIii7.ALLATORIxDEMO(d, d2 + 1.3579E-6, d3, f, f2, 3 >> 2);
                iiIiIIIIii7.IIIIiiIiii = System.currentTimeMillis();
                return;
            }
            case 4: {
                if (((Boolean)iiIiIIIIii2.iIiIiiiiII.get()).booleanValue() && ((Boolean)iiIiIIIIii2.IIiIiIIiii.get() != false ? !iiIiIIIIii2.ALLATORIxDEMO() : !iiIiIIIIii2.iiIIiIIiii())) {
                    return;
                }
                if (((Boolean)iiIiIIIIii2.iIiIiIIIII.get()).booleanValue() && PlayerUtils.isMoving()) {
                    return;
                }
                if (iiIiIIIIii2.iIIiiIiIiI.field_1724.method_20448()) return;
                IiIiIIIIii iiIiIIIIii8 = iiIiIIIIii2;
                double d8 = d;
                iiIiIIIIii2.ALLATORIxDEMO(d8, d2, d3, f, f2, 5 >> 2);
                iiIiIIIIii8.ALLATORIxDEMO(d8, d2 + 0.0625, d3, f, f2, (3 & 4) != 0);
                iiIiIIIIii8.ALLATORIxDEMO(d, d2 + 0.04535, d3, f, f2, (3 & 4) != 0);
                return;
            }
            case 5: {
                iiIiIIIIii2.iIIiiIiIiI.field_1724.method_18800(iiIiIIIIii2.iIIiiIiIiI.field_1724.method_18798().field_1352, 0.3425, iiIiIIIIii2.iIIiiIiIiI.field_1724.method_18798().field_1350);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(double d, double d2, double d3, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        boolean bl2 = bl;
        IiIiIIIIii iIiIiIIIII5 = this;
        iIiIiIIIII5.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO((double)iIiIiIIIII4, (double)iIiIiIIIII3, (double)iIiIiIIIII2, (boolean)this));
    }

    private /* synthetic */ boolean iiIIiIIiii() {
        int n;
        IiIiIIIIii iiIiIIIIii2 = iiIiIIIIii3;
        IiIiIIIIii iiIiIIIIii3 = iiIiIIIIii2.iIIiiIiIiI.field_1724.method_5829();
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        int n2 = n = (int)Math.floor(((class_238)iiIiIIIIii3).field_1323);
        while ((double)n2 < Math.ceil(((class_238)iiIiIIIIii3).field_1320)) {
            int n3 = (int)Math.floor(((class_238)iiIiIIIIii3).field_1322);
            while ((double)n3 < Math.ceil(((class_238)iiIiIIIIii3).field_1325)) {
                int n4;
                int n5 = (int)Math.floor(((class_238)iiIiIIIIii3).field_1321);
                while ((double)n5 < Math.ceil(((class_238)iiIiIIIIii3).field_1324)) {
                    int n6;
                    class_23392.method_10103(n, n4, n6);
                    if (!iiIiIIIIii2.iIIiiIiIiI.field_1687.method_8320((class_2338)class_23392).method_26220((class_1922)iiIiIIIIii2.iIIiiIiIiI.field_1687, (class_2338)class_23392).method_1110()) {
                        return (3 & 5) != 0;
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
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Sent sent) {
        IiIiIIIIii iiIiIIIIii2 = iiIiIIIIii3;
        IiIiIIIIii iiIiIIIIii3 = sent;
        IiIiIIIIii iIiIiIIIII2 = iiIiIIIIii2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        if (((PacketEvent.Sent)iiIiIIIIii3).packet instanceof class_2824) {
            if (iIiIiIIIII2.iiiiiIIiIi) {
                iIiIiIIIII2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23317(), iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23318(), iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23321(), (3 ^ 3) != 0));
                iIiIiIIIII2.iiiiiIIiIi = 3 ^ 3;
            }
            if (iIiIiIIIII2.iIiiiIiIii) {
                iIiIiIIIII2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)iIiIiIIIII2.iIIiiIiIiI.field_1724, class_2848.class_2849.field_12981));
                iIiIiIIIII2.iIiiiIiIii = 2 & 5;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(AttackEntityEvent attackEntityEvent) {
        void iIiIiIIIII2;
        IiIiIIIIii iiIiIIIIii2 = iiIiIIIIii3;
        if (((Boolean)iiIiIIIIii2.IiiIiIiiIi.get()).booleanValue() && (iiIiIIIIii3 = (CrystalAura)Modules.get().get(CrystalAura.class)) != null && iiIiIIIIii3.isActive()) {
            return;
        }
        if (!((Boolean)iiIiIIIIii2.iIIiiIiIiI.get()).booleanValue() && (Modules.get().isActive(Surround.class) || Modules.get().isActive(IiIIiiIIII.class))) {
            return;
        }
        IiIiIIIIii iiIiIIIIii3 = iIiIiIIIII2.entity;
        if (iiIiIIIIii3 == null || !iiIiIIIIii3.method_5805() || !(iiIiIIIIii3 instanceof class_1309)) {
            return;
        }
        if (iiIiIIIIii2.iIIiiIiIiI.field_1724.method_3144() || iIiiiIIiIi.iiIIiIIiii(iiIiIIIIii2.iIIiiIiIiI) || iiIiIIIIii2.iIIiiIiIiI.field_1724.method_5799() || iiIiIIIIii2.iIIiiIiIiI.field_1724.method_5771() || iiIiIIIIii2.iIIiiIiIiI.field_1724.method_6101() || iiIiIIIIii2.iIIiiIiIiI.field_1724.method_6059(class_1294.field_5919)) {
            return;
        }
        IiIiIIIIii iiIiIIIIii4 = iiIiIIIIii2;
        iiIiIIIIii4.iIiiiIiIii = iiIiIIIIii4.iIIiiIiIiI.field_1724.method_5624();
        if (iiIiIIIIii4.iIiiiIiIii) {
            iiIiIIIIii2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)iiIiIIIIii2.iIIiiIiIiI.field_1724, class_2848.class_2849.field_12985));
        }
        iiIiIIIIii2.ALLATORIxDEMO((class_1297)iiIiIIIIii3);
    }

    public IiIiIIIIii() {
        IiIiIIIIii iiIiIIIIii2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, iIIIIiIiii.ALLATORIxDEMO("\u5216\u668a\u51a7_"), IiIIiIIiiI.ALLATORIxDEMO("\u8bef\u6be3\u6b32\u6542\u51ef\u9083\u6240\u5183\u66ba\u519f\u4f60\u5b9d"));
        iiIiIIIIii2.ALLATORIxDEMO = iiIiIIIIii2.settings.getDefaultGroup();
        iiIiIIIIii2.iIIiIiiiIi = iiIiIIIIii2.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6a7d\u5f7b"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u66cd\u51ef\u6545\u51e8\u76fd\u89e8\u53b5\u65fd\u5f21"))).defaultValue((Object)Criticals.Mode.iIiIiIIIII)).build());
        this.iIIiiIiIiI = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5924\u4ea7\u52d5"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u510f\u4e90\u6a0d\u5744\u5456\u753c\u6588\u4e4c\u8084\u89e8\u53b5\u66f0\u51d5"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiIiiiiII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4ed3\u535f\u58c5\u6582"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u4ee9\u573b\u7681\u4f59\u72c8\u6012\u4e72\u5c13\u8bb1\u66f0\u51d5"))).defaultValue((Object)((3 & 4) != 0))).visible(() -> {
            if (this.iIIiIiiiIi.get() == Criticals.Mode.iIIiiIiIiI || this.iIIiIiiiIi.get() == Criticals.Mode.iIiIiIIIII) {
                return true;
            }
            return false;
        })).build());
        this.IIiIiIIiii = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4efb\u58c5\u51f1"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u5393\u576e\u5ba0\u517b\u5318\u573c\u58e7\u91df\u658f\u89e8\u53b5\u66f0\u51d5"))).defaultValue((Object)((3 ^ 3) != 0))).visible(() -> {
            if ((this.iIIiIiiiIi.get() == Criticals.Mode.iIIiiIiIiI || this.iIIiIiiiIi.get() == Criticals.Mode.iIiIiIIIII) && ((Boolean)this.iIiIiiiiII.get()).booleanValue()) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iIiIiIIIII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u79d8\u52be\u65c8\u66de\u5028"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u79ef\u52d6\u65e5\u4e74\u89e8\u53b5\u66f0\u51d5"))).defaultValue((Object)(5 >> 3))).visible(() -> {
            if (this.iIIiIiiiIi.get() == Criticals.Mode.iIIiiIiIiI || this.iIIiIiiiIi.get() == Criticals.Mode.iIiIiIIIII) {
                return true;
            }
            return false;
        })).build());
        this.IiiIiIiiIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6c17\u6660\u65c8\u66de\u5028"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u4f39\u7504\u6c27\u660f\u515d\u73d1\u65e5\u4e74\u89e8\u53b5\u66f0\u51d5"))).defaultValue((Object)(3 >> 1))).build());
        IiIiIIIIii iiIiIIIIii3 = this;
        IiIiIIIIii iiIiIIIIii4 = this;
        IiIiIIIIii iiIiIIIIii5 = this;
        iiIiIIIIii4.IIiiIIIIIi = new Random();
        iiIiIIIIii4.IIIIiiIiii = 0L;
        iiIiIIIIii3.iiiiiIIiIi = 5 >> 3;
        iiIiIIIIii3.iIiiiIiIii = 3 >> 2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIiIiii.ALLATORIxDEMO("{oNbXf\u000bv{GjW;W+\u8bd4\u66f8\u6594\u523b\u6723\u65a6\u7276\u6770\uff75"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(double d, double d2, double d3, float f, float f2, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        boolean bl2 = bl;
        IiIiIIIIii iIiIiIIIII7 = this;
        iIiIiIIIII7.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO((double)iIiIiIIIII6, (double)iIiIiIIIII5, (double)iIiIiIIIII4, (float)iIiIiIIIII3, (float)iIiIiIIIII2, (boolean)this));
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        int n;
        IiIiIIIIii iiIiIIIIii2 = iiIiIIIIii3;
        class_238 class_2383 = iiIiIIIIii2.iIIiiIiIiI.field_1724.method_5829();
        IiIiIIIIii iiIiIIIIii3 = new class_2338.class_2339();
        int n2 = n = (int)Math.floor(class_2383.field_1323);
        while ((double)n2 < Math.ceil(class_2383.field_1320)) {
            int n3 = (int)Math.floor(class_2383.field_1322);
            while ((double)n3 < Math.ceil(class_2383.field_1325)) {
                int n4;
                int n5 = (int)Math.floor(class_2383.field_1321);
                while ((double)n5 < Math.ceil(class_2383.field_1324)) {
                    int n6;
                    iiIiIIIIii3.method_10103(n, n4, n6);
                    iiIiIIIIii3.method_10103(n, n4 + (2 ^ 3), n6);
                    if (!iiIiIIIIii2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiIiIIIIii3).method_26220((class_1922)iiIiIIIIii2.iIIiiIiIiI.field_1687, (class_2338)iiIiIIIIii3).method_1110() && !iiIiIIIIii2.iIIiiIiIiI.field_1687.method_8320(iiIiIIIIii3.method_10084()).method_26220((class_1922)iiIiIIIIii2.iIIiiIiIiI.field_1687, iiIiIIIIii3.method_10084()).method_1110()) {
                        return 3 >> 1;
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return false;
    }

    public String getInfoString() {
        return ((Criticals.Mode)((Object)this.iIIiIiiiIi.get())).name();
    }
}

