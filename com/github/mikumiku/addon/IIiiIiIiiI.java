/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent
 *  meteordevelopment.meteorclient.events.world.PlaySoundEvent
 *  meteordevelopment.meteorclient.mixininterface.IVec3d
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiiiIiiIIi;
import com.github.mikumiku.addon.modules.ElytraFlyPlus;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent;
import meteordevelopment.meteorclient.events.world.PlaySoundEvent;
import meteordevelopment.meteorclient.mixininterface.IVec3d;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class IIiiIiIiiI
extends iIiIiIIIii {
    private final Setting<Boolean> iiIiIIiiii;
    private final Setting<Boolean> iIIiIiiIiI;
    private final SettingGroup iIIIIIIiII;
    private final Setting<Double> iIIiiIIIIi;
    private final Setting<Double> IiiiiIiIiI;
    private boolean iiiIiIIiii;
    private final Setting<Double> iIIIiiiiIi;
    private double iiiIiiIIII;
    private final Setting<Double> iIiIIiIIIi;
    private final Setting<Double> IIiIiiiiII;
    private float IIiiIIIIIi;
    private final Setting<ElytraFlyPlus.Mode> iIiiiIiIii;
    private final Setting<Double> iIiIiiiiII;
    private float IIIIiiIiii;
    private final Setting<Double> IiiIiIiiIi;
    private final Setting<Double> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private float iiiiiIIiIi;
    private final SettingGroup iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private int ALLATORIxDEMO;

    private /* synthetic */ void iiiIiIiiIi() {
        IIiiIiIiiI iIiiIiIiiI;
        IIiiIiIiiI iIiiIiIiiI2 = iIiiIiIiiI = this;
        float f = iIiiIiIiiI2.iIIiiIiIiI.field_1724.method_36454();
        float f2 = iIiiiIIiIi.iiiIiIiiIi(iIiiIiIiiI2.iIIiiIiIiI.field_1724.field_3913);
        float f3 = iIiiiIIiIi.ALLATORIxDEMO(iIiiIiIiiI2.iIIiiIiIiI.field_1724.field_3913);
        if (f2 > 0.0f) {
            iIiiIiIiiI.iiiIiIIiii = --1;
            f += f3 > 0.0f ? -45.0f : (f3 < 0.0f ? 45.0f : 0.0f);
            v1 = iIiiIiIiiI;
        } else if (f2 < 0.0f) {
            iIiiIiIiiI.iiiIiIIiii = --1;
            f += f3 > 0.0f ? -135.0f : (f3 < 0.0f ? 135.0f : 180.0f);
            v1 = iIiiIiIiiI;
        } else {
            iIiiIiIiiI.iiiIiIIiii = f3 != 0.0f ? 2 ^ 3 : 0;
            f += f3 > 0.0f ? -90.0f : (f3 < 0.0f ? 90.0f : 0.0f);
            v1 = iIiiIiIiiI;
        }
        v1.IIIIiiIiii = f;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IIIIiIIiII(PlayerMoveEvent playerMoveEvent) {
        IIiiIiIiiI iIiiIiIiiI;
        IIiiIiIiiI iIiiIiIiiI2 = iIiiIiIiiI = iIiiIiIiiI3;
        IIiiIiIiiI iIiiIiIiiI3 = iIiiIiIiiI2.ALLATORIxDEMO(iIiiIiIiiI2.iIIiiIiIiI.field_1724.method_18798());
        if (iIiiIiIiiI3 != null) {
            void iIiIiIIIII2;
            iIiiiIIiIi.ALLATORIxDEMO((IVec3d)iIiIiIIIII2.movement, iIiiIiIiiI3.method_10216(), iIiiIiIiiI3.method_10214(), iIiiIiIiiI3.method_10215());
            iIiIiIIIII2.movement = iIiiIiIiiI3;
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlaySoundEvent playSoundEvent) {
        IIiiIiIiiI iIiiIiIiiI = iterator;
        Iterator<class_2960> iterator = List.of(class_2960.method_60654((String)IIiiIiIIIi.iiiIiIiiIi("Q<\u001d\u007f\u0015m\u0017y\t.\u0015aY8uS)_\u0014`Uw*G\u0012b\u0004U\u001e|\u001e`2Q")), class_2960.method_60654((String)iiiiIiiIIi.ALLATORIxDEMO("(\u001dpJ2\u00125\u0003 _6\u001a;\u00020N\u000b%\u0016:w\r(\u001d\u00108\u0006\u0006\u001c<1\r+\u0001\r-")), class_2960.method_60654((String)IIiiIiIIIi.iiiIiIiiIi("8\u001at\u0013|\u0004~\u001b`F|H06\u001c:@\u0016}\t<>C\u000e{+m\u001e~\u0002f)S")), class_2960.method_60654((String)iiiiIiiIIi.ALLATORIxDEMO("sF?\u00057\u00175\u0003+T7\u001b{BW)\u000b%6\u001aw\r\b=0\u0018&,0\t4\u0007\u0017,")), class_2960.method_60654((String)IIiiIiIIIi.iiiIiIiiIi("w\u001fq\u0013|\u000fu\u001aa\u0006</W6\u001c\u001a`\u0016})\u001c\u001ec.[\u000bM\u001c}7V")), class_2960.method_60654((String)iiiiIiiIIi.ALLATORIxDEMO("\r=\u000b1\u0006-\u000f8\u001b$F\r-\u0014f8\u001a4\u0007\u000bf<\u0019\f!)70\u001a\u0016&")), class_2960.method_60654((String)IIiiIiIIIi.iiiIiIiiIi("\u001es\u0018z\u0015m\u001cr\b/U!>_uS\t\u007f\u0014`uW\ng2B$q\u0013s2\\")), class_2960.method_60654((String)iiiiIiiIIi.ALLATORIxDEMO("sF?\u00057\u00175\u0003+T7\u001b{BW)\u000b%6\u001aw\r\b=0\u0018&$<\t-\u0000\u001c:")), class_2960.method_60654((String)IIiiIiIIIi.iiiIiIiiIi("\u001bv\u0013q\u001fg]3/\b2F\u001e\u007fUw7K\u000f`:\u001c\u001d~\u0002{5U"))).iterator();
        while (iterator.hasNext()) {
            void iIiIiIIIII2;
            if (!((class_2960)iterator.next()).equals((Object)iIiIiIIIII2.sound.method_4775())) continue;
            iIiIiIIIII2.cancel();
            return;
        }
    }

    private /* synthetic */ double ALLATORIxDEMO(double iIiIiIIIII2, double iIiIiIIIII3, double iIiIiIIIII4, double iIiIiIIIII5) {
        double d = iIiIiIIIII4;
        double d2 = iIiIiIIIII5;
        double d3 = d * d + d2 * d2;
        double d4 = iIiIiIIIII4;
        double d5 = iIiIiIIIII5;
        return (Math.sqrt(d3 * (Double)this.IiiiiIiIiI.get() * (Double)this.IiiiiIiIiI.get() - d4 * d4 * iIiIiIIIII3 * iIiIiIIIII3 - d5 * d5 * iIiIiIIIII2 * iIiIiIIIII2 + 2.0 * iIiIiIIIII4 * iIiIiIIIII5 * iIiIiIIIII2 * iIiIiIIIII3) - iIiIiIIIII4 * iIiIiIIIII2 - iIiIiIIIII5 * iIiIiIIIII3) / d3;
    }

    public boolean IIIIIIIiII() {
        if (((Boolean)this.iIIiIiiIiI.get()).booleanValue() && this.iIIiiIiIiI.field_1724.method_5799()) {
            this.ALLATORIxDEMO = 3 >> 2;
            return this.ALLATORIxDEMO != 0;
        }
        if (((Boolean)this.iIiIiIIIII.get()).booleanValue() && this.iIIiiIiIiI.field_1724.method_5771()) {
            this.ALLATORIxDEMO = 3 >> 2;
            return this.ALLATORIxDEMO != 0;
        }
        return iIiiiIIiIi.iiIIiIIiii(this.iIIiiIiIiI);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IIiiIiIiiI iIiiIiIiiI;
        IIiiIiIiiI iIiiIiIiiI2 = iIiiIiIiiI = this;
        float f = iIiiIiIiiI2.iIIiiIiIiI.field_1724.method_36454();
        float f2 = iIiiiIIiIi.iiiIiIiiIi(iIiiIiIiiI2.iIIiiIiIiI.field_1724.field_3913);
        float f3 = iIiiiIIiIi.ALLATORIxDEMO(iIiiIiIiiI2.iIIiiIiIiI.field_1724.field_3913);
        if (f2 > 0.0f) {
            iIiiIiIiiI.iiiIiIIiii = 2 ^ 3;
            f += f3 > 0.0f ? -45.0f : (f3 < 0.0f ? 45.0f : 0.0f);
            v1 = iIiiIiIiiI;
        } else if (f2 < 0.0f) {
            iIiiIiIiiI.iiiIiIIiii = --1;
            f += f3 > 0.0f ? -135.0f : (f3 < 0.0f ? 135.0f : 180.0f);
            v1 = iIiiIiIiiI;
        } else {
            iIiiIiIiiI.iiiIiIIiii = f3 != 0.0f ? 5 >> 2 : 0;
            f += f3 > 0.0f ? -90.0f : (f3 < 0.0f ? 90.0f : 0.0f);
            v1 = iIiiIiIiiI;
        }
        v1.IIIIiiIiii = f;
    }

    private /* synthetic */ class_243 ALLATORIxDEMO(class_243 class_2432) {
        IIiiIiIiiI iIiiIiIiiI = iIiiIiIiiI2;
        IIiiIiIiiI iIiiIiIiiI2 = class_2432;
        IIiiIiIiiI iIiIiIIIII2 = iIiiIiIiiI;
        if (iIiiiIIiIi.iiiIiIiiIi(iIiIiIIIII2.iIIiiIiIiI.field_1724.field_3913) == 0.0f) {
            if (((Boolean)iIiIiIIIII2.iIIiiIiIiI.get()).booleanValue()) {
                return new class_243(0.0, 0.0, 0.0);
            }
            return null;
        }
        int n = iIiiiIIiIi.iiiIiIiiIi(iIiIiIIIII2.iIIiiIiIiI.field_1724.field_3913) > 0.0f ? 3 >> 1 : 0;
        double d = Math.toRadians(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_36454() + (float)(n != 0 ? 0x7E & 0x5B : -90));
        double d2 = Math.cos(d);
        d = Math.sin(d);
        IIiiIiIiiI iIiiIiIiiI3 = iIiiIiIiiI2;
        double d3 = iIiIiIIIII2.ALLATORIxDEMO(((class_243)iIiiIiIiiI3).field_1352, ((class_243)iIiiIiIiiI2).field_1350, d2, d);
        double d4 = Math.clamp(class_3532.method_15370((double)iIiiIiIiiI3.method_37267(), (double)0.0, (double)0.5), 0.0, 1.0);
        d3 = Math.min(d3, (Double)iIiIiIIIII2.iIIiiIIIIi.get() / 20.0 * (0.1 + d4 * 0.9));
        return new class_243(iIiiIiIiiI2.method_10216() + d2 * d3, iIiiIiIiiI2.method_10214(), iIiiIiIiiI2.method_10215() + d * d3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiIIiIIiii(PlayerMoveEvent playerMoveEvent) {
        IIiiIiIiiI iIiiIiIiiI = this;
        if (iIiiiIIiIi.iiIIiIIiii(iIiiIiIiiI.iIIiiIiIiI)) {
            void iIiIiIIIII2;
            iIiiIiIiiI.ALLATORIxDEMO();
            iIiiIiIiiI.iiiiiIIiIi = 0.0f;
            int n = 3 & 4;
            if (!iIiiIiIiiI.iIIiiIiIiI.field_1690.field_1832.method_1434() && iIiiIiIiiI.iIIiiIiIiI.field_1690.field_1903.method_1434() && iIiiIiIiiI.iiiIiiIIII > (Double)iIiiIiIiiI.iIiIIiIIIi.get() * 0.4) {
                v0 = iIiiIiIiiI;
                IIiiIiIiiI iIiiIiIiiI2 = iIiiIiIiiI;
                iIiiIiIiiI2.IIiiIIIIIi = (float)Math.min((double)iIiiIiIiiI2.IIiiIIIIIi + 0.1 * (double)(1.0f - iIiiIiIiiI.IIiiIIIIIi) * (double)(1.0f - iIiiIiIiiI.IIiiIIIIIi) * (double)(1.0f - iIiiIiIiiI.IIiiIIIIIi), 1.0);
                iIiiIiIiiI.iiiiiIIiIi = Math.max(Math.max(iIiiIiIiiI2.IIiiIIIIIi, 0.0f) * -90.0f, -90.0f);
                n = --1;
                iIiiIiIiiI.iiiIiIIiii = 3 & 4;
            } else {
                iIiiIiIiiI.iiiIiiIIII = (Double)iIiiIiIiiI.iIiIIiIIIi.get();
                v0 = iIiiIiIiiI;
                iIiiIiIiiI.IIiiIIIIIi = -0.2f;
            }
            IIiiIiIiiI iIiiIiIiiI3 = iIiiIiIiiI;
            v0.iiiIiiIIII = iIiiIiIiiI.iiiIiIIiii ? (Double)iIiiIiIiiI3.iIiIIiIIIi.get() : Math.min(iIiiIiIiiI3.iiiIiiIIII + Math.sin(Math.toRadians(iIiiIiIiiI.iiiiiIIiIi)) * 0.08, (Double)iIiiIiIiiI.iIiIIiIIIi.get());
            IIiiIiIiiI iIiiIiIiiI4 = iIiiIiIiiI;
            double d = Math.cos(Math.toRadians(iIiiIiIiiI4.IIIIiiIiii + 90.0f));
            double d2 = Math.sin(Math.toRadians(iIiiIiIiiI4.IIIIiiIiii + 90.0f));
            double d3 = iIiiIiIiiI4.iiiIiIIiii && n == 0 ? d * (Double)iIiiIiIiiI.iIiIIiIIIi.get() : (n != 0 ? iIiiIiIiiI.iiiIiiIIII * Math.cos(Math.toRadians(iIiiIiIiiI.iiiiiIIiIi)) * d : 0.0);
            IIiiIiIiiI iIiiIiIiiI5 = iIiiIiIiiI;
            double d4 = d = iIiiIiIiiI.iiiiiIIiIi < 0.0f ? iIiiIiIiiI5.iiiIiiIIII * (Double)iIiiIiIiiI.iIiIiiiiII.get() * -Math.sin(Math.toRadians(iIiiIiIiiI.iiiiiIIiIi)) * iIiiIiIiiI.iiiIiiIIII : -((Double)iIiiIiIiiI5.IIiIiIIiii.get()).doubleValue();
            double d5 = iIiiIiIiiI.iiiIiIIiii && n == 0 ? d2 * (Double)iIiiIiIiiI.iIiIIiIIIi.get() : (n != 0 ? iIiiIiIiiI.iiiIiiIIII * Math.cos(Math.toRadians(iIiiIiIiiI.iiiiiIIiIi)) * d2 : 0.0);
            IIiiIiIiiI iIiiIiIiiI6 = iIiiIiIiiI;
            d *= Math.abs(Math.sin(Math.toRadians(n != 0 ? (double)iIiiIiIiiI6.iiiiiIIiIi : (double)iIiiIiIiiI6.iIIiiIiIiI.field_1724.method_36455())));
            if (iIiiIiIiiI.iIIiiIiIiI.field_1690.field_1832.method_1434() && !iIiiIiIiiI.iIIiiIiIiI.field_1690.field_1903.method_1434()) {
                d = -((Double)iIiiIiIiiI.IIiIiiiiII.get()).doubleValue();
            }
            iIiiiIIiIi.ALLATORIxDEMO((IVec3d)iIiIiIIIII2.movement, d3, d, d5);
            iIiiIiIiiI.iIIiiIiIiI.field_1724.method_18800(0.0, 0.0, 0.0);
        }
    }

    private /* synthetic */ void iiiIiIiiIi(PlayerMoveEvent playerMoveEvent) {
        IIiiIiIiiI iIiiIiIiiI = iIiiIiIiiI2;
        IIiiIiIiiI iIiiIiIiiI2 = playerMoveEvent;
        IIiiIiIiiI iIiIiIIIII2 = iIiiIiIiiI;
        if (iIiiiIIiIi.iiIIiIIiii(iIiIiIIIII2.iIIiiIiIiI)) {
            double d;
            IIiiIiIiiI iIiiIiIiiI3 = iIiIiIIIII2;
            iIiiIiIiiI3.iiiIiIiiIi();
            iIiiIiIiiI3.iiiiiIIiIi = iIiiIiIiiI3.iIIiiIiIiI.field_1724.method_36455();
            double d2 = Math.cos(Math.toRadians(iIiiIiIiiI3.IIIIiiIiii + 90.0f));
            double d3 = Math.sin(Math.toRadians(iIiiIiIiiI3.IIIIiiIiii + 90.0f));
            double d4 = iIiiIiIiiI3.iiiIiIIiii ? d2 * (Double)iIiIiIIIII2.IiiIiIiiIi.get() : 0.0;
            d2 = -((Double)iIiIiIIIII2.IIiIiIIiii.get()).doubleValue();
            double d5 = d = iIiIiIIIII2.iiiIiIIiii ? d3 * (Double)iIiIiIIIII2.IiiIiIiiIi.get() : 0.0;
            if (((Boolean)iIiIiIIIII2.iiIiIIiiii.get()).booleanValue()) {
                d2 *= Math.abs(Math.sin(Math.toRadians(iIiIiIIIII2.iiiiiIIiIi)));
            }
            if (iIiIiIIIII2.iIIiiIiIiI.field_1690.field_1832.method_1434() && !iIiIiIIIII2.iIIiiIiIiI.field_1690.field_1903.method_1434()) {
                d2 = -((Double)iIiIiIIIII2.IIiIiiiiII.get()).doubleValue();
            }
            if (!iIiIiIIIII2.iIIiiIiIiI.field_1690.field_1832.method_1434() && iIiIiIIIII2.iIIiiIiIiI.field_1690.field_1903.method_1434()) {
                d2 = (Double)iIiIiIIIII2.iIIIiiiiIi.get();
            }
            iIiiiIIiIi.ALLATORIxDEMO((IVec3d)((PlayerMoveEvent)iIiiIiIiiI2).movement, d4, d2, d);
            iIiIiIIIII2.iIIiiIiIiI.field_1724.method_18800(0.0, 0.0, 0.0);
        }
    }

    public IIiiIiIiiI() {
        IIiiIiIiiI iIiiIiIiiI = this;
        super(IIiiIiIIIi.iiiIiIiiIi("\u97e3\u7fd7\u5e28\u98ec"), iiiiIiiIIi.ALLATORIxDEMO("\u669c\u5963\u63ef\u526f\u97f0\u7f9c\u65d1\u6cac\u304a"));
        iIiiIiIiiI.iIIiIiiiIi = iIiiIiIiiI.settings.getDefaultGroup();
        iIiiIiIiiI.iIIIIIIiII = iIiiIiIiiI.settings.createGroup(IIiiIiIIIi.iiiIiIiiIi("\u9044\u5e94"));
        iIiiIiIiiI.iIiiiIiIii = iIiiIiIiiI.iIIiIiiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6a58\u5f47"))).description(IIiiIiIIIi.iiiIiIiiIi("\u9072\u62fb\u98a5\u885e\u6a7a\u5f3d"))).defaultValue((Object)ElytraFlyPlus.Mode.iiiiiIIiIi)).build());
        this.iIIiIiiIiI = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6c6d\u4e45\u5025\u7560"))).description(IIiiIiIIIi.iiiIiIiiIi("\u571a\u6c4f\u4e3f\u4e56\u4fdc\u6542\u79e9\u52d3\u65ab\u5f54\u3030"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIiIiIIIII = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u5cc1\u6d1f\u4e45\u5025\u7560"))).description(IIiiIiIIIi.iiiIiIiiIi("\u5773\u5c9b\u6d3d\u4e3f\u4e56\u4fdc\u6542\u79e9\u52d3\u65ab\u5f54\u3030"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiIiIiiIi = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6c6d\u5e1b\u9066\u5eee"))).description(IIiiIiIIIi.iiiIiIiiIi("\u6bdd/[\u0018y\u6c6f\u5e41\u7980\u52ba\u5961\u5c03\u6867\u3030"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.iiiiiIIiIi) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iIIIiiiiIi = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u4e53\u532f\u9066\u5eee"))).description(IIiiIiIIIi.iiiIiIiiIi("\u6bfd\u4e51\u5229\u544a\u4e38\u7980\u52ba\u5961\u5c03\u6867\u3030"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.iiiiiIIiIi) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIiIIiIIIi = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u9066\u5eee"))).description(IIiiIiIIIi.iiiIiIiiIi("\u6bdd\u4e71\u5209\u7980\u52ba\u5961\u5c03\u6867\u3030"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.iIIiIiiiIi) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.iIiIiiiiII = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u4e53\u532f\u5074\u73cf"))).description(IIiiIiIIIi.iiiIiIiiIi("\u4e18\u531c\u65c4\u52db\u5ff9\u5961\u5c03\u5056\u3030"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.iIIiIiiiIi) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.IIiIiiiiII = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u4e52\u9625\u9066\u5eee"))).description(IIiiIiIIIi.iiiIiIiiIi("\u6bfd\u4e51\u5229\u544a\u4e39\u7980\u52ba\u5961\u5c03\u6867\u3030"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.iIIiIiiiIi || this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.iiiiiIIiIi) {
                return true;
            }
            return false;
        })).build());
        this.iiIiIIiiii = this.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6623\u8095\u4e72\u8475"))).description(IIiiIiIIIi.iiiIiIiiIi("\u53d8\u6772\u573a\u4f15\u5906\u658d\u625f\u4f61\u4e19\u9616\u3030"))).defaultValue((Object)(--1 != 0))).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.iiiiiIIiIi) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.IIiIiIIiii = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u4e52\u8455\u9066\u5eee"))).description(IIiiIiIIIi.iiiIiIiiIi("\u6bdd\u4e71\u5209\u4e70\u842f\u5961\u5c03\u6867\u3030"))).defaultValue(0.01).min(0.0).sliderRange(0.0, 1.0).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.iIIiIiiiIi || this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.iiiiiIIiIi) {
                return true;
            }
            return false;
        })).build());
        this.IiiiiIiIiI = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u600b\u9077\u9887\u8824\u9066\u5eee"))).description(IIiiIiIIIi.iiiIiIiiIi("\u573d\u001c\u00164\\(F\u001a|\u000f{:_[\u6a33\u5f54\u4e39\u76ff\u6712\u595c\u900d\u5efd\u3030"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.ALLATORIxDEMO) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.iIIiiIIIIi = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u603a\u9046\u52c8\u9066\u5eee"))).description(IIiiIiIIIi.iiiIiIiiIi("\u57545\u007f:5A/S\u0015f\u0012s6\u0012\u6a5a\u5f1d\u4e50\u76b6\u677b\u5935\u52db\u900d\u5efd\u3030"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.ALLATORIxDEMO) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.iIIiiIiIiI = this.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u600b\u9077\u5025\u7560"))).description(IIiiIiIIIi.iiiIiIiiIi("\u571a\u6cda\u671b\u8fc8\u5157\u658d\u504e\u6b19\u79e9\u52f3\u3030"))).defaultValue((Object)((2 ^ 3) != 0))).visible(() -> {
            if (this.iIiiiIiIii.get() == ElytraFlyPlus.Mode.ALLATORIxDEMO) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiiIiiIIi.ALLATORIxDEMO("\u000e\u0003{N\n-Y=)\f8\u001c\u001ciy\u8b9f\u668d\u65f8\u5269\u6768\u65e9\u7220\u6755\uff49"));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=200)
    private /* synthetic */ void ALLATORIxDEMO(PlayerMoveEvent playerMoveEvent) {
        IIiiIiIiiI iIiiIiIiiI = iIiiIiIiiI2;
        IIiiIiIiiI iIiiIiIiiI2 = playerMoveEvent;
        IIiiIiIiiI iIiIiIIIII2 = iIiiIiIiiI;
        if (!iIiIiIIIII2.IIIIIIIiII()) return;
        IIiiIiIiiI iIiiIiIiiI3 = iIiIiIIIII2;
        iIiiIiIiiI3.ALLATORIxDEMO += --1;
        if (iIiiIiIiiI3.ALLATORIxDEMO < --5) return;
        switch (((ElytraFlyPlus.Mode)((Object)iIiIiIIIII2.iIiiiIiIii.get())).ordinal()) {
            case 0: {
                iIiIiIIIII2.iiiIiIiiIi((PlayerMoveEvent)iIiiIiIiiI2);
                return;
            }
            case 1: {
                iIiIiIIIII2.iiIIiIIiii((PlayerMoveEvent)iIiiIiIiiI2);
                return;
            }
            case 2: {
                iIiIiIIIII2.IIIIiIIiII((PlayerMoveEvent)iIiiIiIiiI2);
                return;
            }
        }
    }
}

