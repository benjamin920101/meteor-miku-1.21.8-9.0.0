/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIiiiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIIIiiiI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_243;

public class iIiiIiiiII
extends iIiIiIIIii {
    private final Setting<Boolean> iIiiiiIIII;
    private final Setting<Boolean> iiIiIIiiii;
    private int iIIiIiiIiI;
    private final SettingGroup iIIIIIIiII;
    private final Setting<Double> iIIiiIIIIi;
    private final Setting<Boolean> IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final SettingGroup iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<Boolean> iIiIIiIIIi;
    private final Setting<Double> IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private final Setting<Double> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final SettingGroup IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Double> iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private long ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
        iIiiIiiiII iIiiIiiiII3 = pre;
        iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII2;
        if (System.currentTimeMillis() - iIiIiIIIII2.ALLATORIxDEMO < (long)((Integer)iIiIiIIIII2.iIIiiIiIiI.get()).intValue()) {
            return;
        }
        iIiIiIIIII2.iIIiIiiIiI = 5 >> 3;
        if (iIiIiIIIII2.ALLATORIxDEMO() == -4 >> 2) {
            return;
        }
        if (((Boolean)iIiIiIIIII2.IiiiiIiIiI.get()).booleanValue() && iIiIiIIIII2.iIIiiIiIiI.field_1724.method_6115()) {
            return;
        }
        if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue() && !iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24828()) {
            return;
        }
        iIiIiIIIII2.ALLATORIxDEMO().stream().flatMap(class_16572 -> {
            iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
            iIiiIiiiII iIiiIiiiII3 = class_16572;
            iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII2;
            return iIiIiIIIII2.ALLATORIxDEMO((class_1657)iIiiIiiiII3).stream();
        }).filter(class_23382 -> {
            iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
            iIiiIiiiII iIiiIiiiII3 = class_23382;
            iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII2;
            if (iIiiIiiiII3.method_46558().method_1022(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_19538()) <= (Double)iIiIiIIIII2.IIIIiiIiii.get()) {
                return 5 >> 3;
            }
            return iIiIiIIIII2.IIIIiIIiII((class_2338)iIiiIiiiII3);
        }).distinct().forEach(class_23382 -> {
            iIiiIiiiII iIiiIiiiII2;
            iIiiIiiiII iIiiIiiiII3 = iIiiIiiiII4;
            iIiiIiiiII iIiiIiiiII4 = class_23382;
            iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII3;
            if (iIiiIiiiII4 == null) {
                return;
            }
            iIiiIiiiII iIiiIiiiII5 = iIiIiIIIII2;
            if (iIiiIiiiII5.iIIiIiiIiI >= (Integer)iIiiIiiiII5.iIiIiiiiII.get()) {
                return;
            }
            if (iIiIiIIIII2.ALLATORIxDEMO() == -4 >> 2) {
                return;
            }
            if (!iIiIiIIIII2.iiIIiIIiii((class_2338)iIiiIiiiII4)) {
                return;
            }
            iIiiIiiiII iIiiIiiiII6 = iIiIiIIIII2;
            if (((Boolean)iIiIiIIIII2.iiiIiIIiii.get()).booleanValue()) {
                iIiiIiiiII6.iiiIiIiiIi((class_2338)iIiiIiiiII4);
                iIiiIiiiII2 = iIiIiIIIII2;
            } else {
                if (iIiiIiiiII6.ALLATORIxDEMO((class_2338)iIiiIiiiII4)) {
                    return;
                }
                iIiiIiiiII2 = iIiIiIIIII2;
            }
            iIiiIiiiII2.ALLATORIxDEMO((class_2338)iIiiIiiiII4);
            iIiIiIIIII2.iIIiIiiIiI += --1;
            iIiIiIIIII2.ALLATORIxDEMO = System.currentTimeMillis();
        });
    }

    private /* synthetic */ class_243 ALLATORIxDEMO(class_1657 class_16572) {
        iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
        iIiiIiiiII iIiiIiiiII3 = class_16572;
        iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII2;
        class_243 class_2432 = new class_243(iIiiIiiiII3.method_23317() - ((class_1657)iIiiIiiiII3).field_6038, iIiiIiiiII3.method_23318() - ((class_1657)iIiiIiiiII3).field_5971, iIiiIiiiII3.method_23321() - ((class_1657)iIiiIiiiII3).field_5989);
        return iIiiIiiiII3.method_19538().method_1019(class_2432.method_1021((double)((Integer)iIiIiIIIII2.IIiiIIIIIi.get()).intValue()));
    }

    private /* synthetic */ List<class_1657> ALLATORIxDEMO() {
        return this.iIIiiIiIiI.field_1687.method_18456().stream().filter(class_7422 -> {
            iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
            iIiiIiiiII iIiiIiiiII3 = class_7422;
            iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII2;
            if (iIiiIiiiII3 != iIiIiIIIII2.iIIiiIiIiI.field_1724) {
                return (3 & 5) != 0;
            }
            return false;
        }).filter(iIiIiIIIII2 -> {
            if (!iIiIiIIIII2.method_29504()) {
                return --1 != 0;
            }
            return false;
        }).filter(class_7422 -> {
            iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
            iIiiIiiiII iIiiIiiiII3 = class_7422;
            iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII2;
            if ((double)iIiiIiiiII3.method_5739((class_1297)iIiIiIIIII2.iIIiiIiIiI.field_1724) <= (Double)iIiIiIIIII2.IIiIiiiiII.get()) {
                return 3 >> 1;
            }
            return false;
        }).collect(Collectors.toList());
    }

    private /* synthetic */ boolean IIIIiIIiII(class_2338 class_23382) {
        iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
        iIiiIiiiII iIiiIiiiII3 = class_23382;
        iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII2;
        if (!iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiiIiiiII3).method_26215()) {
            return 5 >> 3;
        }
        return iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(iIiiIiiiII3.method_10074()).method_26212((class_1922)iIiIiIIIII2.iIIiiIiIiI.field_1687, iIiiIiiiII3.method_10074());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiIiiIi(class_2338 class_23382) {
        Iterator iterator;
        iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
        Iterator iterator2 = iterator = iIiiIiiiII2.iIIiiIiIiI.field_1687.method_18112().iterator();
        while (iterator2.hasNext()) {
            void iIiIiIIIII2;
            iIiiIiiiII iIiiIiiiII3 = (class_1297)iterator.next();
            if (iIiiIiiiII3 == null) {
                iterator2 = iterator;
                continue;
            }
            if (!iIiiIiiiII3.method_24515().equals((Object)iIiIiIIIII2)) {
                iterator2 = iterator;
                continue;
            }
            if (!(iIiiIiiiII3 instanceof class_1511)) break;
            iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(new IiIiiiIIIi((float)Rotations.getYaw((class_1297)iIiiIiiiII3), (float)Rotations.getPitch((class_1297)iIiiIiiiII3)));
            iIiiIiiiII iIiiIiiiII4 = iIiiIiiiII2;
            iIiiIiiiII2.iIIiiIiIiI.field_1761.method_2918((class_1657)iIiiIiiiII4.iIIiiIiIiI.field_1724, (class_1297)iIiiIiiiII3);
            iIiiIiiiII4.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        void iIiIiIIIII2;
        iIiiIiiiII iIiiIiiiII2 = this;
        int n = IiIiiiiIii.ALLATORIxDEMO(class_2246.field_10540.method_8389());
        if (n == -4 >> 2) {
            return;
        }
        IiIiiiiIii.ALLATORIxDEMO(n);
        iIiIiiIIIi.iiIIiIIiii((class_2338)iIiIiIIIII2);
        IiIiiiiIii.ALLATORIxDEMO(n);
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        iIiiIiiiII iIiiIiiiII2 = this;
        if (((Boolean)iIiiIiiiII2.iIiiiIiIii.get()).booleanValue()) {
            int n = IiIiiiiIii.ALLATORIxDEMO(class_2246.field_10343.method_8389());
            if (n != -4 >> 2) {
                return n;
            }
        }
        return IiIiiiiIii.ALLATORIxDEMO(class_2246.field_10540.method_8389());
    }

    private /* synthetic */ boolean iiIIiIIiii(class_2338 class_23382) {
        iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
        iIiiIiiiII iIiiIiiiII3 = class_23382;
        iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724.method_19538().method_1022(iIiiIiiiII3.method_46558()) <= (Double)iIiIiIIIII2.iIIiiIIIIi.get() && iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiiIiiiII3).method_45474()) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    public iIiiIiiiII() {
        iIiiIiiiII iIiiIiiiII2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, IIIiIIiiiI.ALLATORIxDEMO("\u81c0\u5289\u580b\u573a"), IIIiIIiiiI.ALLATORIxDEMO("\u8183\u529f\u5857\u5175\u6577\u4e8d\u5454\u56de\u76a5\u6d7e\u7a1f"));
        iIiiIiiiII2.iIIIiiiiIi = iIiiIiiiII2.settings.getDefaultGroup();
        iIiiIiiiII2.IIiIiIIiii = iIiiIiiiII2.settings.createGroup(IIIiIIiiiI.ALLATORIxDEMO("\u6514\u7f4f\u8bde\u7f05"));
        iIiiIiiiII2.iIIIIIIiII = iIiiIiiiII2.settings.createGroup(IIIiIIiiiI.ALLATORIxDEMO("\u8329\u56d5\u8bde\u7f05"));
        iIiiIiiiII2.iIiIiIIIII = iIiiIiiiII2.settings.createGroup(IIIiIIiiiI.ALLATORIxDEMO("\u515c\u4ef7\u8bde\u7f05"));
        iIiiIiiiII2.iIIiiIiIiI = iIiiIiiiII2.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6514\u7f4f\u5e96\u8fb4"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6bd3\u6b43\u6557\u7f59\u6585\u5767\u4e70\u95c3\u76b8\u5edc\u8ffe\u6596\u959f"))).defaultValue((Object)(0x36 & 0x7B))).min(5 >> 3).max(0x79F6 & 0x7FD).sliderMax(0x5FE & 0x7BF5).build());
        this.iIiIiiiiII = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6bf8\u6b1d\u6514\u7f4f\u6510\u91a4"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6bd3\u6b43\u001d^_[\u6505\u7f59\u76b8\u6593\u5776\u6510\u91a4"))).defaultValue((Object)(3 & 5))).min(4 ^ 5).max(0x6D & 0x1A).sliderMax(0x3F & 0x48).build());
        this.iIiIIiIIIi = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u65ab\u8f07"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6509\u7f52\u65c6\u65f0\u8f5b\u520c\u76c4\u6826\u4f2d\u7f05"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiiIiiIIII = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u654c\u6344\u5324\u655e\u7f05"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u4f43\u7518\u654b\u6359\u5339\u8ff1\u886d\u655e\u7f05"))).defaultValue((Object)(5 >> 2))).build());
        this.iiiIiIIiii = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u781e\u576e\u6c54\u661d"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6505\u7f59\u5271\u781e\u576e\u6c54\u661d"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiiiiIIII = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u8ff1\u98fe\u66e2\u5037"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u8fe7\u98ef\u65cd\u66b5\u5060\u781e\u576e\u6c54\u661d"))).defaultValue((Object)(5 >> 2))).visible(() -> this.iiiIiIIiii.get())).build());
        this.iiIiIIiiii = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u68ea\u6d6a\u6376\u63f3"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u68fc\u6d7b\u6b58\u571f\u632a\u63b2\u76a5\u65d9\u573c"))).defaultValue((Object)(5 >> 3))).build());
        this.iIIiiIIIIi = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6514\u7f4f\u8363\u569f"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6502\u7f5e\u6582\u5760\u76b8\u672a\u5906\u8363\u569f"))).defaultValue(5.0).min(0.0).max(8.0).sliderMax(8.0).build());
        this.IIiIiiiiII = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6566\u4e9b\u8363\u569f"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u68fb\u6d7c\u6570\u4e90\u76a5\u8363\u569f"))).defaultValue(6.0).min(0.0).max(8.0).sliderMax(8.0).build());
        this.iIIiIiiiIi = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6d34\u7a55\u8363\u569f"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u574a\u6525\u4e8d\u5454\u56c4\u6427\u7d15\u6d22\u7a5e\u76a5\u8363\u569f"))).defaultValue(2.0).min(0.0).max(8.0).sliderMax(8.0).build());
        this.IIIIiiIiii = this.iIIIIIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u81c0\u8e8a\u8363\u569f"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u8db4\u798c\u7395\u5b86\u76bf\u6737\u5c33\u5ba3\u5149\u8dbd\u79d0"))).defaultValue(2.0).min(0.0).max(8.0).sliderMax(8.0).build());
        this.IIiiIIIIIi = this.iIiIiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u98ae\u6d6a\u525b\u651b"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u98e6\u6d22\u657b\u4e86\u4f7d\u7f55\u76b3HCB\u000b\u651b"))).defaultValue((Object)(4 ^ 5))).min(--1).max(0x6B & 0x1C).sliderMax(0x3B & 0x4C).build());
        this.IiiiiIiIiI = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u4f48\u7514\u7243\u54e0\u66e2\u5037"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u4f43\u7518\u7252\u54f6\u65ca\u66a8\u507d\u580b\u573a"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiIiIiiIi = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u7a50\u4e0c\u66e2\u5037"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u5718\u7a41\u4e1a\u65ca\u66a8\u507d\u580b\u573a"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiiiiIIiIi = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u80e6\u5324\u5267\u6309"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u4f48\u7514\u80fc\u533e\u725e\u54fd\u8ff1\u886d\u5267\u6309"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiiiIiIii = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u8724\u86f1\u7f70\u4f78\u5123"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u4f04\u512a\u4f16\u751f\u8724\u86eb\u7f6a\u803b\u4e31\u6605\u9ef0\u66bc\u7798"))).defaultValue((Object)(--1 != 0))).build());
        iIiiIiiiII iIiiIiiiII3 = this;
        iIiiIiiiII3.ALLATORIxDEMO = 0L;
        iIiiIiiiII3.iIIiIiiIiI = 2 & 5;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIiIIiiiI.ALLATORIxDEMO("GpR]DY\u0017Igxvh\u0007H\u0017\u8bcb\u66c4\u658b\u5207\u673c\u659a\u7269\u674c\uff6a"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public List<class_2338> ALLATORIxDEMO(class_243 class_2432, double d) {
        int n;
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iIiiIiiiII iIiiIiiiII2 = this;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        class_2338 class_23382 = class_2338.method_49638((class_2374)iIiIiIIIII3);
        int n2 = (int)Math.ceil((double)iIiIiIIIII2);
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23383 = class_23382.method_10069(n, n5, n7);
                    if (iIiIiIIIII3.method_1022(class_23383.method_46558()) <= iIiIiIIIII2) {
                        arrayList.add(class_23383);
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return arrayList;
    }

    private /* synthetic */ List<class_2338> ALLATORIxDEMO(class_1657 class_16572) {
        iIiiIiiiII iIiIiIIIII2;
        iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
        iIiiIiiiII iIiiIiiiII3 = class_16572;
        iIiiIiiiII iIiiIiiiII4 = iIiIiIIIII2 = iIiiIiiiII2;
        return iIiiIiiiII4.ALLATORIxDEMO(iIiIiIIIII2.ALLATORIxDEMO((class_1657)iIiiIiiiII3), (Double)iIiiIiiiII4.iIIiIiiiIi.get());
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iIiiIiiiII iIiiIiiiII2 = iIiiIiiiII3;
        iIiiIiiiII iIiiIiiiII3 = class_23382;
        iIiiIiiiII iIiIiIIIII2 = iIiiIiiiII2;
        if (!iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8335(null, new class_238((class_2338)iIiiIiiiII3)).isEmpty()) {
            return 3 >> 1;
        }
        return false;
    }
}

