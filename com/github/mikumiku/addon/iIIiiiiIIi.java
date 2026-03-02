/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.RenderUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1297
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_1922
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2346
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiiiIiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiiIIIiiiI;
import com.github.mikumiku.addon.modules.MEnum;
import com.google.common.collect.Streams;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.RenderUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1297;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;

public class iIIiiiiIIi
extends iIiIiIIIii {
    private final Setting<Boolean> iIIiiIIIIi;
    private final SettingGroup IiiiiIiIiI;
    private final Setting<ShapeMode> iiiIiIIiii;
    private final Setting<Double> iIIIiiiiIi;
    private final Setting<Double> iiiIiiIIII;
    private final Setting<SettingColor> iIiIIiIIIi;
    private final SettingGroup IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<Boolean> iIiIiiiiII;
    private final Setting<List<class_2248>> IIIIiiIiii;
    private final iiIIiiIIIi IiiIiIiiIi;
    private final Setting<Double> IIiIiIIiii;
    private final Setting<MEnum.ListMode> iIIiiIiIiI;
    private final Setting<Double> iiiiiIIiIi;
    private final Setting<SettingColor> iIIiIiiiIi;
    private final class_2338.class_2339 iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    private static /* synthetic */ double ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        class_2338 iIiIiIIIII2 = class_23383;
        class_2338 iIiIiIIIII3 = class_23382;
        return iIiIiIIIII2.method_10262((class_2382)iIiIiIIIII3);
    }

    @Override
    public void onActivate() {
        iIIiiiiIIi iIIiiiiIIi2 = this;
        super.onActivate();
        iIIiiiiIIi2.IiiIiIiiIi.iiIIiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_1799 class_17992, class_2338 class_23382) {
        void iIiIiIIIII2;
        iIIiiiiIIi iIIiiiiIIi2 = iIIiiiiIIi3;
        iIIiiiiIIi iIIiiiiIIi3 = class_17992;
        iIIiiiiIIi iIiIiIIIII3 = iIIiiiiIIi2;
        if (!(iIIiiiiIIi3.method_7909() instanceof class_1747)) {
            return (2 & 5) != 0;
        }
        iIIiiiiIIi3 = ((class_1747)iIIiiiiIIi3.method_7909()).method_7711();
        if (iIiIiIIIII3.iIIiiIiIiI.get() == MEnum.ListMode.iIiIiIIIII && ((List)iIiIiIIIII3.IIIIiiIiii.get()).contains(iIIiiiiIIi3)) {
            return 5 >> 3;
        }
        if (iIiIiIIIII3.iIIiiIiIiI.get() == MEnum.ListMode.ALLATORIxDEMO && !((List)iIiIiIIIII3.IIIIiiIiii.get()).contains(iIIiiiiIIi3)) {
            return (3 ^ 3) != 0;
        }
        if (!class_2248.method_9614((class_265)iIIiiiiIIi3.method_9564().method_26220((class_1922)iIiIiIIIII3.iIIiiIiIiI.field_1687, (class_2338)iIiIiIIIII2))) {
            return (2 & 5) != 0;
        }
        if (!(iIIiiiiIIi3 instanceof class_2346) || !class_2346.method_10128((class_2680)iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIiIIIII2))) {
            return true;
        }
        return false;
    }

    public void onDeactivate() {
        this.IiiIiIiiIi.iiiIiIiiIi();
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre var1_2) {
        block31: {
            block32: {
                var3_4 = this;
                v0 = var3_4;
                iIiIiIIIII = v0.iIIiiIiIiI.field_1724.method_19538().method_1019(var3_4.iIIiiIiIiI.field_1724.method_18798()).method_1031(0.0, -0.75, 0.0);
                v1 = var3_4;
                if (((Boolean)v0.iIIiiIIIIi.get()).booleanValue()) {
                    v1.iIiIiIIIII.method_10103(var3_4.iIIiiIiIiI.field_1724.method_24515().method_10263(), var3_4.iIIiiIiIiI.field_1724.method_24515().method_10264() - --1, var3_4.iIIiiIiIiI.field_1724.method_24515().method_10260());
                    v2 = var3_4;
                } else {
                    var4_5 = v1.iIIiiIiIiI.field_1724.method_19538();
                    if ((Double)var3_4.IIiIiIIiii.get() != 0.0 && !var3_4.ALLATORIxDEMO() && !var3_4.iIIiiIiIiI.field_1687.method_8320(var3_4.iIIiiIiIiI.field_1724.method_24515().method_10074()).method_26220((class_1922)var3_4.iIIiiIiIiI.field_1687, var3_4.iIIiiIiIiI.field_1724.method_24515()).method_1110()) {
                        this = class_243.method_1030((float)0.0f, (float)var3_4.iIIiiIiIiI.field_1724.method_36454()).method_18805(((Double)var3_4.IIiIiIIiii.get()).doubleValue(), 0.0, ((Double)var3_4.IIiIiIIiii.get()).doubleValue());
                        if (var3_4.iIIiiIiIiI.field_1690.field_1894.method_1434()) {
                            var4_5 = var4_5.method_1031(this.field_1352, 0.0, this.field_1350);
                        }
                        if (var3_4.iIIiiIiIiI.field_1690.field_1881.method_1434()) {
                            var4_5 = var4_5.method_1031(-this.field_1352, 0.0, -this.field_1350);
                        }
                        if (var3_4.iIIiiIiIiI.field_1690.field_1913.method_1434()) {
                            var4_5 = var4_5.method_1031(this.field_1350, 0.0, -this.field_1352);
                        }
                        if (var3_4.iIIiiIiIiI.field_1690.field_1849.method_1434()) {
                            var4_5 = var4_5.method_1031(-this.field_1350, 0.0, this.field_1352);
                        }
                    }
                    v3 = var3_4;
                    v2 = v3;
                    v3.iIiIiIIIII.method_10102(var4_5.field_1352, iIiIiIIIII.field_1351, var4_5.field_1350);
                }
                if (v2.iIIiiIiIiI.field_1690.field_1832.method_1434() && !var3_4.iIIiiIiIiI.field_1690.field_1903.method_1434() && var3_4.iIIiiIiIiI.field_1724.method_23318() + iIiIiIIIII.field_1351 > -1.0) {
                    v4 = var3_4;
                    v4.iIiIiIIIII.method_33098(v4.iIiIiIIIII.method_10264() - (4 ^ 5));
                }
                if (var3_4.iIiIiIIIII.method_10264() >= var3_4.iIIiiIiIiI.field_1724.method_24515().method_10264()) {
                    v5 = var3_4;
                    v5.iIiIiIIIII.method_33098(v5.iIIiiIiIiI.field_1724.method_24515().method_10264() - (4 ^ 5));
                }
                v6 = var3_4;
                var4_5 = v6.iIiIiIIIII.method_10062();
                if (((Boolean)v6.iIIiiIIIIi.get()).booleanValue() || iIiIiiIIIi.IIiIiIiIiI((class_2338)var3_4.iIiIiIIIII)) ** GOTO lbl86
                this = var3_4.iIIiiIiIiI.field_1724.method_24515();
                if (iIiIiiIIIi.IIiIiIiIiI((class_2338)this)) {
                    v7 = var3_4;
                    v8 = v7;
                    v7.iIiIiIIIII.method_10101((class_2382)this);
                } else {
                    v9 = var3_4;
                    if (iIiIiiIIIi.IIiIiIiIiI(this.method_10074())) {
                        v9.iIiIiIIIII.method_10101((class_2382)this);
                        v8 = var3_4;
                    } else {
                        var2_6 = v9.iIIiiIiIiI.field_1724.method_19538();
                        var2_6 = var2_6.method_1031(0.0, -0.9800000190734863, 0.0);
                        var2_6.method_1019(var3_4.iIIiiIiIiI.field_1724.method_18798());
                        var5_7 = new ArrayList();
                        v10 = var6_9 = (int)(var3_4.iIIiiIiIiI.field_1724.method_23317() - (Double)var3_4.iiiiiIIiIi.get());
                        while ((double)v10 < var3_4.iIIiiIiIiI.field_1724.method_23317() + (Double)var3_4.iiiiiIIiIi.get()) {
                            v11 = (int)(var3_4.iIIiiIiIiI.field_1724.method_23321() - (Double)var3_4.iiiiiIIiIi.get());
                            while ((double)v11 < var3_4.iIIiiIiIiI.field_1724.method_23321() + (Double)var3_4.iiiiiIIiIi.get()) {
                                v12 = (int)var3_4.iIIiiIiIiI.field_1724.method_23318();
                                while ((double)v12 > Math.max((double)var3_4.iIIiiIiIiI.field_1687.method_31607(), var3_4.iIIiiIiIiI.field_1724.method_23318() - (Double)var3_4.iiiiiIIiIi.get()) && (double)var8_15 < Math.min((double)iIiiiIIiIi.ALLATORIxDEMO(var3_4.iIIiiIiIiI), var3_4.iIIiiIiIiI.field_1724.method_23318() + (Double)var3_4.iiiiiIIiIi.get())) {
                                    v13 = var3_4;
                                    v13.iIiIiIIIII.method_10103(var6_9, var8_15, var7_11);
                                    if (iIiIiiIIIi.IIiIiIiIiI((class_2338)v13.iIiIiIIIII)) {
                                        v14 = var3_4;
                                        if (!(var3_4.iIIiiIiIiI.field_1724.method_33571().method_1025(class_243.method_24953((class_2382)v14.iIiIiIIIII.method_10093(BlockUtils.getClosestPlaceSide((class_2338)v14.iIiIiIIIII)))) > 36.0)) {
                                            var5_7.add(new class_2338((class_2382)var3_4.iIiIiIIIII));
                                        }
                                    }
                                    v12 = --var8_15;
                                }
                                v11 = ++var7_11;
                            }
                            v10 = ++var6_9;
                        }
                        if (var5_7.isEmpty()) {
                            return;
                        }
                        var5_7.sort(Comparator.comparingDouble((ToDoubleFunction<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, ALLATORIxDEMO(net.minecraft.class_2338 net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)D)((class_2338)var4_5)));
                        var3_4.iIiIiIIIII.method_10101((class_2382)var5_7.getFirst());
lbl86:
                        // 2 sources

                        v8 = var3_4;
                    }
                }
                if (!((Boolean)v8.iIIiiIIIIi.get()).booleanValue()) break block31;
                this = var3_4.iIIiiIiIiI.field_1724.method_24515().method_10074();
                if (!iIiIiiIIIi.IIiIiIiIiI((class_2338)this)) break block32;
                var3_4.ALLATORIxDEMO((class_2338)this);
                ** GOTO lbl126
            }
            var2_6 = new ArrayList();
            var2_6.add(this);
            v15 = var5_8 = (int)((double)var3_4.iIiIiIIIII.method_10263() - (Double)var3_4.iiiIiiIIII.get());
            while ((double)v15 <= (double)var3_4.iIiIiIIIII.method_10263() + (Double)var3_4.iiiIiiIIII.get()) {
                v16 = (int)((double)var3_4.iIiIiIIIII.method_10260() - (Double)var3_4.iiiIiiIIII.get());
                while ((double)v16 <= (double)var3_4.iIiIiIIIII.method_10260() + (Double)var3_4.iiiIiiIIII.get()) {
                    var7_13 = class_2338.method_49637((double)var5_8, (double)var3_4.iIiIiIIIII.method_10264(), (double)var6_9);
                    if (!var7_13.equals((Object)this) && (var3_4.iIIiiIiIiI.field_1724.method_19538().method_1022(class_243.method_24953((class_2382)var7_13)) <= (Double)var3_4.iiiIiiIIII.get() || var5_8 == var3_4.iIiIiIIIII.method_10263() && var6_9 == var3_4.iIiIiIIIII.method_10260())) {
                        var2_6.add(var7_13);
                    }
                    v16 = ++var6_9;
                }
                v15 = ++var5_8;
            }
            if (var2_6.isEmpty()) ** GOTO lbl126
            var2_6.sort(Comparator.comparingDouble((ToDoubleFunction<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, squaredDistanceTo(net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)D)()));
            var5_8 = 3 >> 2;
            for (class_2338 var7_14 : var2_6) {
                if (var3_4.ALLATORIxDEMO(var7_14)) {
                    ++var5_8;
                }
                if (var5_8 < (Integer)var3_4.IIiiIIIIIi.get()) continue;
                ** GOTO lbl126
            }
            ** GOTO lbl126
        }
        try {
            v17 = var3_4;
            v17.ALLATORIxDEMO((class_2338)v17.iIiIiIIIII);
lbl126:
            // 5 sources

            this = IiIiiiiIii.ALLATORIxDEMO((Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, ALLATORIxDEMO(net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)((iIIiiiiIIi)var3_4));
            if (((Boolean)var3_4.iIiIiiiiII.get()).booleanValue() && var3_4.iIIiiIiIiI.field_1690.field_1903.method_1434() && !var3_4.iIIiiIiIiI.field_1690.field_1832.method_1434()) {
                if (this != -4 >> 2) {
                    v18 = var3_4;
                    var2_6 = v18.iIIiiIiIiI.field_1724.method_18798();
                    var5_7 = v18.iIIiiIiIiI.field_1724.method_5829();
                    if (Streams.stream((Iterable)v18.iIIiiIiIiI.field_1687.method_20812((class_1297)var3_4.iIIiiIiIiI.field_1724, var5_7.method_989(0.0, 1.0, 0.0))).toList().isEmpty()) {
                        if (((Boolean)var3_4.ALLATORIxDEMO.get()).booleanValue() || !PlayerUtils.isMoving()) {
                            var2_6 = new class_243(var2_6.field_1352, ((Double)var3_4.iIIIiiiiIi.get()).doubleValue(), var2_6.field_1350);
                        }
                        var3_4.iIIiiIiIiI.field_1724.method_18799(var2_6);
                        return;
                    }
                    v19 = var3_4;
                    v19.iIIiiIiIiI.field_1724.method_18800(var2_6.field_1352, Math.ceil(var3_4.iIIiiIiIiI.field_1724.method_23318()) - var3_4.iIIiiIiIiI.field_1724.method_23318(), var2_6.field_1350);
                    v19.iIIiiIiIiI.field_1724.method_24830((boolean)(3 & 5));
                    return;
                }
            }
        }
        catch (Exception iIiIiIIIII) {
            var3_4.info("Scaffolding error:" + String.valueOf(iIiIiIIIII), new Object[3 >> 2]);
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1799 class_17992) {
        iIIiiiiIIi iIiIiIIIII2;
        iIIiiiiIIi iIIiiiiIIi2 = iIIiiiiIIi3;
        iIIiiiiIIi iIIiiiiIIi3 = class_17992;
        iIIiiiiIIi iIIiiiiIIi4 = iIiIiIIIII2 = iIIiiiiIIi2;
        return iIIiiiiIIi4.ALLATORIxDEMO((class_1799)iIIiiiiIIi3, (class_2338)iIIiiiiIIi4.iIiIiIIIII);
    }

    public iIIiiiiIIi() {
        iIIiiiiIIi iIIiiiiIIi2 = this;
        super(IiIIiiiIiI.ALLATORIxDEMO("\u818a\u52f2\u6407\u8dff"), iiiIIIiiiI.ALLATORIxDEMO("h#z&}\u000fW\u0004\u0015`\u81f1\u52bd\u5766\u4f20\u8101\u4e4c\u6522\u7f2e\u65a2\u570a\u642b\u8df8b"));
        iIIiiiiIIi2.IIiIiiiiII = iIIiiiiIIi2.settings.getDefaultGroup();
        iIIiiiiIIi2.IiiiiIiIiI = iIIiiiiIIi2.settings.createGroup(IiIIiiiIiI.ALLATORIxDEMO("\u6e18\u67c3"));
        iIIiiiiIIi2.IIIIiiIiii = iIIiiiiIIi2.IIiIiiiiII.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u65e4\u5751\u5200\u8824"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u9074\u62ae\u76e4\u65e3\u577d>"))).build());
        this.iIIiiIiIiI = this.IIiIiiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u65e4\u5751\u8fd0\u6ea8"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u59ff\u4f12\u4f05\u7568\u65c4\u5710\u5277\u8832\u8b94\u7f7e"))).defaultValue((Object)MEnum.ListMode.iIiIiIIIII)).build());
        this.iIiIiiiiII = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u5fb6\u9019\u643a\u5818"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u6607\u5434\u5452\u756f\u668e\u5fab\u76f9\u5456\u4e6a\u6477\u587e>"))).defaultValue((Object)(3 >> 2))).build());
        this.iIIIiiiiIi = this.IIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u6470\u5852\u9008\u5eea"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u646d\u5829\u65b1\u76e4\u9045\u5e8c>"))).defaultValue(0.5).min(0.0).sliderMax(1.0).visible(() -> this.iIiIiiiiII.get())).build());
        this.ALLATORIxDEMO = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u79e0\u52f5\u65f0\u643a\u5818"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u5106\u8bc2\u5768\u7986\u52ef\u6596\u6477\u587e>"))).defaultValue((Object)(--1 != 0))).visible(() -> this.iIiIiiiiII.get())).build());
        this.iIIiiIIIIi = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u7a27\u6c12\u6529\u7f22"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u5106\u8bc5\u576f\u7a07\u6c53\u4e50\u6579\u7f33\u65de\u570aI]\u8f9e\u4e77\u5153\u8bc5\u4f27\u4f94\u6579\u8167\u620c\u67d6\u5310\u5fae>"))).defaultValue((Object)(3 >> 2))).build());
        this.IIiIiIIiii = this.IIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u638d\u524b\u8dca\u79f7"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u63ad\u520a\u6544\u7f2e\u65c4\u5710\u76e4\u8d87\u7991>"))).defaultValue(0.0).min(0.0).sliderMax(1.0).visible(() -> {
            if (!((Boolean)this.iIIiiIIIIi.get()).booleanValue()) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iiiiiIIiIi = this.IIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u6563\u7f68\u8314\u56b8"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u5755\u7a3d\u4e05\u65e4\u5392\u4ea2\u6544\u7f2e\u65c4\u5710\u76e4\u8d87\u7991>"))).defaultValue(5.0).min(0.0).sliderMax(8.0).visible(() -> {
            if (!((Boolean)this.iIIiiIIIIi.get()).booleanValue()) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.iiiIiiIIII = this.IIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u535d\u5fc8"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u7a3d\u655e\u5310\u5fae>"))).defaultValue(0.0).min(0.0).max(6.0).visible(() -> this.iIIiiIIIIi.get())).build());
        this.IIiiIIIIIi = this.IIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u6bd4\u5266\u65bf\u5740\u653c"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u6bb2\u4e6d\\{\u001e,\u6544\u7f2e\u76f9\u65fe\u5737\u652a\u91e5>"))).defaultValue((Object)(--2))).min(--1).visible(() -> this.iIIiiIIIIi.get())).build());
        this.iIiiiIiIii = this.IiiiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u6e25\u679f"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u663d\u545b\u6e75\u67a9\u5db2\u6543\u7f29\u76e4\u65e3\u577d>"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiiIiIIiii = this.IiiiiIiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u5f3f\u72b0\u6a36\u5f43"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u5f18\u72f6\u76f9\u6e75\u67b3\u65e3\u5f25>"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.iIiiiIiIii.get())).build());
        this.iIiIIiIIIi = this.IiiiiIiIiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u4ffa\u9764\u988b\u823e"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u76c6\u6815\u65c4\u5710\u6e48\u6793\u76f9\u4fe0\u9702\u98c6\u8258>"))).defaultValue(new SettingColor(0x23C5 & 0x5CFF, 0xED9 & 0x71AF, 0xBFA & 0x74ED, 0x6F & 0x1A)).visible(() -> this.iIiiiIiIii.get())).build());
        this.iIIiIiiiIi = this.IiiiiIiIiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u7ee2\u6767\u988b\u823e"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u76c6\u6815\u65c4\u5710\u6e48\u6793\u76f9\u7ef8\u6701\u98c6\u8258>"))).defaultValue(new SettingColor(0x74C7 & 0xBFD, 0x65BD & 0x1ACB, 0x7EED & 0x1FA)).visible(() -> this.iIiiiIiIii.get())).build());
        iIIiiiiIIi iIIiiiiIIi3 = this;
        iIIiiiiIIi3.iIiIiIIIII = new class_2338.class_2339();
        iIIiiiiIIi iIIiiiiIIi4 = this;
        iIIiiiiIIi3.IiiIiIiiIi = new iiIIiiIIIi(1000L);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiIIIiiiI.ALLATORIxDEMO("\u0010w%z3~@N\u0010_!opo`\u8bec\u66b3\u65ac\u5270\u671b\u65ed\u724e\u673b\uff4d"));
        }
    }

    public boolean iiiIiIiiIi() {
        return this.isActive();
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        iIIiiiiIIi iIIiiiiIIi3;
        iIIiiiiIIi this_ = class_23382;
        iIIiiiiIIi iIiIiIIIII2 = iIIiiiiIIi3;
        if (iIiIiIIIII2.IiiIiIiiIi.ALLATORIxDEMO((class_2338)this_)) {
            return (3 ^ 3) != 0;
        }
        int n2 = IiIiiiiIii.ALLATORIxDEMO(arg_0 -> iIiIiIIIII2.ALLATORIxDEMO((class_2338)this_, arg_0));
        if (n2 == -4 >> 2) {
            return 3 >> 2;
        }
        IiIiiiiIii.ALLATORIxDEMO(n2);
        int n3 = 3 ^ 3;
        iIIiiiiIIi iIIiiiiIIi2 = this_;
        if (((Boolean)iIiIiIIIII2.iIIiiIIIIi.get()).booleanValue()) {
            n3 = iIiIiiIIIi.iIiIiIiIii((class_2338)iIIiiiiIIi2) ? 1 : 0;
            n = n2;
        } else {
            n3 = iIiIiiIIIi.iiIIiIIiii((class_2338)iIIiiiiIIi2) ? 1 : 0;
            n = n2;
        }
        IiIiiiiIii.ALLATORIxDEMO(n);
        if (n3 != 0) {
            iIIiiiiIIi iIIiiiiIIi4 = iIiIiIIIII2;
            iIIiiiiIIi4.IiiIiIiiIi.ALLATORIxDEMO((class_2338)this_);
            if (((Boolean)iIIiiiiIIi4.iIiiiIiIii.get()).booleanValue()) {
                boolean bl = 2 & 5;
                RenderUtils.renderTickingBlock((class_2338)this_.method_10062(), (Color)((Color)iIiIiIIIII2.iIiIIiIIIi.get()), (Color)((Color)iIiIiIIIII2.iIIiIiiiIi.get()), (ShapeMode)((ShapeMode)iIiIiIIIII2.iiiIiIIiii.get()), (int)(bl ? 1 : 0), (int)(0x4E & 0x39), (boolean)(5 >> 2), (boolean)bl);
            }
            return true;
        }
        iIiIiIIIII2.IiiIiIiiIi.ALLATORIxDEMO((class_2338)this_);
        return (3 & 4) != 0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_1799 class_17992) {
        void iIiIiIIIII2;
        iIIiiiiIIi iIIiiiiIIi2 = iIIiiiiIIi3;
        iIIiiiiIIi iIIiiiiIIi3 = class_17992;
        iIIiiiiIIi iIiIiIIIII3 = iIIiiiiIIi2;
        return iIiIiIIIII3.ALLATORIxDEMO((class_1799)iIIiiiiIIi3, (class_2338)iIiIiIIIII2);
    }

    public boolean ALLATORIxDEMO() {
        iIIiiiiIIi iIIiiiiIIi2 = this;
        int n = IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            iIIiiiiIIi iIiIiIIIII2;
            iIIiiiiIIi iIIiiiiIIi2 = iIIiiiiIIi3;
            iIIiiiiIIi iIIiiiiIIi3 = class_17992;
            iIIiiiiIIi iIIiiiiIIi4 = iIiIiIIIII2 = iIIiiiiIIi2;
            return iIIiiiiIIi4.ALLATORIxDEMO((class_1799)iIIiiiiIIi3, (class_2338)iIIiiiiIIi4.iIiIiIIIII);
        });
        if (iIIiiiiIIi2.iiiIiIiiIi() && ((Boolean)iIIiiiiIIi2.iIiIiiiiII.get()).booleanValue() && iIIiiiiIIi2.iIIiiIiIiI.field_1690.field_1903.method_1434() && !iIIiiiiIIi2.iIIiiIiIiI.field_1690.field_1832.method_1434() && (((Boolean)iIIiiiiIIi2.ALLATORIxDEMO.get()).booleanValue() || !PlayerUtils.isMoving())) {
            if (n != -4 >> 2) {
                return --1 != 0;
            }
        }
        return false;
    }
}

