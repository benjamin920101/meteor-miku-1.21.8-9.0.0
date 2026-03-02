/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_2242
 *  net.minecraft.class_2246
 *  net.minecraft.class_2302
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2421
 *  net.minecraft.class_2680
 *  net.minecraft.class_2741
 *  net.minecraft.class_2769
 *  net.minecraft.class_3611
 *  net.minecraft.class_3612
 *  net.minecraft.class_4865
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiiIIiiII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.mixinface.MySettings;
import com.github.mikumiku.addon.modules.FarmHelper;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2242;
import net.minecraft.class_2246;
import net.minecraft.class_2302;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2421;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2769;
import net.minecraft.class_3611;
import net.minecraft.class_3612;
import net.minecraft.class_4865;

public class IIiIIiIIiI
extends iIiIiIIIii {
    private final Setting<FarmHelper.SortMode> IiIiiIIiIi;
    private final Setting<Integer> IIiIiIiiii;
    private Map<class_1792, Integer> iiIIiiIIii;
    private static final long IIIiiIiiII = 5000L;
    private final Setting<Boolean> iIIIIIiIIi;
    private final Setting<FarmHelper.CropType> iIIIIiIIiI;
    private long iIIIIIiIii;
    private final Setting<Boolean> IiIIiiiiIi;
    private final Setting<Integer> IiiIIiIiii;
    private long IiiIiIiIIi;
    private final Setting<FarmHelper.WorkMode> iiIiiiiIii;
    private long IIIiiiIiIi;
    private Map<class_2338, Integer> iIIiIiiiII;
    private final Setting<ShapeMode> iiiiIiiIIi;
    private Map<class_1792, Integer> iiiIIiIIii;
    private long IiiIIiIIiI;
    private final Setting<SettingColor> iIIIIiiiii;
    private int IiIiIiIIii;
    private final Setting<Integer> iiiIiIiiII;
    private int IIiiiiIIii;
    private int IiiiiIIiII;
    private final SettingGroup iIIIIIiiII;
    private Map<class_1792, Integer> iIIiiiiIii;
    private int iiIIIiIIIi;
    private final Setting<Integer> iIiiiiIIII;
    private final Setting<Boolean> iiIiIIiiii;
    private final SettingGroup iIIiIiiIiI;
    private final Setting<SettingColor> iIIIIIIiII;
    private final Setting<SettingColor> iIIiiIIIIi;
    private final Setting<Integer> IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final Setting<Integer> iIIIiiiiIi;
    private final Setting<SettingColor> iiiIiiIIII;
    private final Setting<Integer> iIiIIiIIIi;
    private final Setting<SettingColor> IIiIiiiiII;
    private int IIiiIIIIIi;
    private final Setting<SettingColor> iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private static final long IIIIiiIiii = 1000L;
    private int IiiIiIiiIi;
    private final Setting<SettingColor> IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private final Setting<SettingColor> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ class_2338 IIIIiIIiII() {
        IIiIIiIIiI iIiIIiIIiI = arrayList;
        ArrayList arrayList = new ArrayList();
        for (class_2338 class_23382 : iiIIiiiIIi.ALLATORIxDEMO(iIiIIiIIiI.iIIiiIiIiI.field_1724.method_24515(), (Integer)iIiIIiIIiI.iIiIIiIIIi.get(), 1 ^ 3)) {
            if (!iIiIIiIIiI.iIiIiIiIii(class_23382)) continue;
            arrayList.add(class_23382);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (iIiIIiIIiI.IiIiiIIiIi.get() == FarmHelper.SortMode.iiiiiIIiIi) {
            Collections.reverse(arrayList);
        }
        return (class_2338)arrayList.get(3 & 4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iIiIiiiiii(class_2338 class_23382) {
        int n;
        IIiIIiIIiI iIiIIiIIiI = this;
        int n2 = --4;
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = 3 >> 2;
            while (true) {
                int n5;
                if (n4 > 1) break;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    void iIiIiIIIII2;
                    class_2338 class_23383 = iIiIiIIIII2.method_10069(n, n5, n7);
                    if (IIiIIiIIiI.ALLATORIxDEMO(iIiIIiIIiI.iIIiiIiIiI.field_1687.method_8320(class_23383))) {
                        return 5 >> 2;
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiiIIIiII(Render3DEvent render3DEvent) {
        IIiIIiIIiI iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        if (iIiIIiIIiI.iIIiiiiIii.isEmpty()) {
            return;
        }
        for (class_2338 this_ : iiIIiiiIIi.ALLATORIxDEMO(iIiIIiIIiI.iIIiiIiIiI.field_1724.method_24515(), (Integer)iIiIIiIIiI.iIiIiiiiII.get(), --1)) {
            void iIiIiIIIII2;
            if (!iIiIIiIIiI.IIiIiIiIiI(this_)) continue;
            IIiIIiIIiI iIiIIiIIiI3 = iIiIIiIIiI;
            iIiIIiIIiI3.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2, this_, (SettingColor)iIiIIiIIiI3.iIIIIIIiII.get(), (SettingColor)iIiIIiIIiI.iIIiiIIIIi.get());
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IIIIiIIiII(Render3DEvent render3DEvent) {
        IIiIIiIIiI iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        if (iIiIIiIIiI.iiiIIiIIii.isEmpty()) {
            return;
        }
        for (class_2338 this_ : iiIIiiiIIi.ALLATORIxDEMO(iIiIIiIIiI.iIIiiIiIiI.field_1724.method_24515(), (Integer)iIiIIiIIiI.iIIIiiiiIi.get(), 5 >> 1)) {
            void iIiIiIIIII2;
            if (!iIiIIiIIiI.iiiiIIIiII(this_)) continue;
            IIiIIiIIiI iIiIIiIIiI3 = iIiIIiIIiI;
            iIiIIiIIiI3.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2, this_.method_10084(), (SettingColor)iIiIIiIIiI3.iiiiiIIiIi.get(), (SettingColor)iIiIIiIIiI.IIiIiiiiII.get());
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void IIIIiIIiII(class_2338 var1_2) {
        var2_3 = this;
        if (!((Boolean)var2_3.iiiIiIIiii.get()).booleanValue()) ** GOTO lbl-1000
        if (var2_3.IiiiiIIiII != -4 >> 2) {
            v0 = 3 >> 1;
        } else lbl-1000:
        // 2 sources

        {
            v0 = 0;
        }
        this = v0;
        if (this != 0) {
            IiIiiiiIii.ALLATORIxDEMO(var2_3.IiiiiIIiII);
        }
        BlockUtils.breakBlock((class_2338)iIiIiIIIII, (boolean)(2 ^ 3));
        if (this != 0) {
            IiIiiiiIii.ALLATORIxDEMO(var2_3.IiiiiIIiII);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiIIiIIiii(class_2338 class_23382) {
        void iIiIiIIIII2;
        IIiIIiIIiI iIiIIiIIiI;
        IIiIIiIIiI iIiIIiIIiI2 = iIiIIiIIiI3;
        IIiIIiIIiI iIiIIiIIiI3 = null;
        Integer n = null;
        switch (((FarmHelper.CropType)((Object)iIiIIiIIiI2.iIIIIiIIiI.get())).ordinal()) {
            case 0: {
                while (false) {
                }
                iIiIIiIIiI = iIiIIiIIiI3 = class_1802.field_8317;
                break;
            }
            case 1: {
                iIiIIiIIiI = iIiIIiIIiI3 = class_1802.field_8179;
                break;
            }
            case 2: {
                iIiIIiIIiI = iIiIIiIIiI3 = class_1802.field_8567;
                break;
            }
            case 3: {
                iIiIIiIIiI = iIiIIiIIiI3 = class_1802.field_8309;
                break;
            }
            case 4: {
                iIiIIiIIiI = iIiIIiIIiI3 = class_1802.field_46249;
                break;
            }
            case 5: {
                iIiIIiIIiI = iIiIIiIIiI3 = class_1802.field_46250;
                break;
            }
            case 6: {
                iIiIIiIIiI3 = class_1802.field_8790;
            }
            default: {
                iIiIIiIIiI = iIiIIiIIiI3;
            }
        }
        if (iIiIIiIIiI != null) {
            n = iIiIIiIIiI2.iiiIIiIIii.get(iIiIIiIIiI3);
        }
        if (n == null) {
            long l = System.currentTimeMillis();
            if (l - iIiIIiIIiI2.IiiIIiIIiI >= 5000L) {
                iIiIIiIIiI2.error(MySettings.ALLATORIxDEMO("\u80dd\u5315\u4e1c\u6c91\u6738\u624e\u5221\u9019\u5b8b\u7694\u79dc\u5b40"), new Object[5 >> 3]);
                iIiIIiIIiI2.IiiIIiIIiI = l;
            }
            return;
        }
        if (((Boolean)iIiIIiIIiI2.ALLATORIxDEMO.get()).booleanValue()) {
            IiIiiiiIii.ALLATORIxDEMO(n);
        }
        void var4_5 = iIiIiIIIII2;
        iIiIiiIIIi.ALLATORIxDEMO((class_2338)var4_5, class_2350.field_11036, (3 & 5) != 0, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
        if (((Boolean)iIiIIiIIiI2.ALLATORIxDEMO.get()).booleanValue()) {
            IiIiiiiIii.ALLATORIxDEMO(n);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iIiIiIiIii(class_2338 class_23382) {
        void iIiIiIIIII2;
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = iIiIIiIIiI.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIiIIIII2).method_26204();
        if (iIiIIiIIiI2 instanceof class_2302 || iIiIIiIIiI2 == class_2246.field_46283 || iIiIIiIIiI2 == class_2246.field_46282 || iIiIIiIIiI2 == class_2246.field_10609 || iIiIIiIIiI2 == class_2246.field_10247 || iIiIIiIIiI2 == class_2246.field_9974 || iIiIIiIIiI2 == class_2246.field_10341) {
            if (((Boolean)iIiIIiIIiI.iiIiIIiiii.get()).booleanValue()) {
                return iIiIIiIIiI.IIIIiIIiII((class_2338)iIiIiIIIII2);
            }
            return true;
        }
        return false;
    }

    public IIiIIiIIiI() {
        IIiIIiIIiI iIiIIiIIiI = this;
        super(MySettings.ALLATORIxDEMO("\u5190\u5737\u52ef\u620c"), IiiiIIiiII.iiIIiIIiii("\u81eb\u52f6\u9550\u573b\u3052\u79c1\u6959\u5487\u657f\u5264\u4f5f\u7235"));
        iIiIIiIIiI.iIIiIiiIiI = iIiIIiIIiI.settings.getDefaultGroup();
        iIiIIiIIiI.iIIIIIiiII = iIiIIiIIiI.settings.createGroup(MySettings.ALLATORIxDEMO("\u9aee\u7cce"));
        iIiIIiIIiI.iIiIiIIIII = iIiIIiIIiI.settings.createGroup(IiiiIIiiII.iiIIiIIiii("\u6e31\u678f"));
        iIiIIiIIiI.iiIiiiiIii = iIiIIiIIiI.iIIiIiiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("\u5de9\u4f51\u6a67\u5f48"))).description(IiiiIIiiII.iiIIiIIiii("\u9057\u62bd\u5197\u5769\u52a5\u621f\u768f\u5dac\u4f4a\u6a22\u5f53"))).defaultValue((Object)FarmHelper.WorkMode.iIIiIiiiIi)).build());
        this.IiiiiIiIiI = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u9508\u573d\u5eb0\u8f98"))).description(IiiiIIiiII.iiIIiIIiii("\u950f\u5763\u64c1\u4f08\u4e40\u95bd\u7692\u5ef5\u8f83"))).defaultValue((Object)(4 ^ 5))).min(5 >> 3).sliderMax(0x54 & 0x3F).build());
        this.iIiIiiiiII = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u9508\u573d\u8345\u56b3"))).description(IiiiIIiiII.iiIIiIIiii("\u9508\u5764\u768f\u6c7d\u5e65\u8300\u56a8"))).defaultValue((Object)(--4))).min(4 ^ 5).sliderMax(0x66 & 0x1F).build());
        this.iiiIiIIiii = this.iIIiIiiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u81fb\u52b8\u520b\u636f\u9542\u5973"))).description(IiiiIIiiII.iiIIiIIiii("\u6caa\u677d\u952f\u5935\u65a8\u81be\u52a3\u5254\u636e\u5264\u53e4\u7561\u7692\u9507\u5968"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIiiIiIiI = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u79c1\u6900\u5eb0\u8f98"))).description(IiiiIIiiII.iiIIiIIiii("\u79c6\u695e\u64c1\u4f08\u4e40\u95bd\u7692\u5ef5\u8f83"))).defaultValue((Object)(2 ^ 3))).min(3 ^ 3).sliderMax(0x5F & 0x34).build());
        this.iIIIiiiiIi = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u79c1\u6900\u8345\u56b3"))).description(IiiiIIiiII.iiIIiIIiii("\u79c1\u6959\u768f\u6c7d\u5e65\u8300\u56a8"))).defaultValue((Object)(--4))).min(5 >> 2).sliderMax(0x2E & 0x57).build());
        this.iIIIIiIIiI = this.iIIiIiiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("\u4f50\u7264\u7c3d\u57cc"))).description(IiiiIIiiII.iiIIiIIiii("\u905d\u62e2\u89d2\u79c1\u6959\u768f\u4f15\u727f\u7c78\u57d7"))).defaultValue((Object)FarmHelper.CropType.iIIiIiiiIi)).build());
        this.ALLATORIxDEMO = this.iIIiIiiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u81fb\u52b8\u520b\u636f\u798b\u5b17"))).description(IiiiIIiiII.iiIIiIIiii("\u79e6\u690c\u65a8\u81be\u52a3\u5254\u636e\u5264\u9002\u5bd3\u7692\u79ce\u5b0c"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiIiIiiII = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u653a\u527f\u5eb0\u8f98"))).description(IiiiIIiiII.iiIIiIIiii("\u653d\u5221\u64c1\u4f08\u4e40\u95bd\u7692\u5ef5\u8f83"))).defaultValue((Object)(4 ^ 5))).min(3 >> 2).sliderMax(0x76 & 0x1D).build());
        this.iIiIIiIIIi = this.iIIiIiiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u653a\u527f\u8345\u56b3"))).description(IiiiIIiiII.iiIIiIIiii("\u653a\u5226\u768f\u6c7d\u5e65\u8300\u56a8"))).defaultValue((Object)(--4))).min(5 >> 2).sliderMax(0x3F & 0x46).build());
        this.iiIiIIiiii = this.iIIiIiiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u4ed5\u653a\u527f\u6256\u71d8"))).description(IiiiIIiiII.iiIIiIIiii("\u53b9\u653a\u5226\u621b\u71d6\u7692\u4f5f\u7235"))).defaultValue((Object)(3 >> 1))).build());
        this.IiIiiIIiIi = this.iIIiIiiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("\u639e\u5e82\u6a67\u5f48"))).description(IiiiIIiiII.iiIIiIIiii("\u59d6\u4f5e\u63c1\u5e83\u89d5\u590f\u744f\u7692\u65ba\u570b"))).defaultValue((Object)FarmHelper.SortMode.iiiiiIIiIi)).build());
        this.IiIIiiiiIi = this.iIIIIIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u4f73\u7525\u9aee\u7cce"))).description(IiiiIIiiII.iiIIiIIiii("\u547b\u7523\u9afb\u7c85\u50f8\u7194\u4f15\u727f\u529c\u80a1"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIiiiiIIII = this.iIIIIIiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u9aa4\u7c84\u5eb0\u8f98"))).description(IiiiIIiiII.iiIIiIIiii("\u4f74\u757b\u9aa4\u7cdd\u4e40\u95bd\u7692\u5ef5\u8f83"))).defaultValue((Object)(3 >> 1))).min(2 & 5).sliderMax(0x75 & 0x1E).build());
        this.IIiIiIiiii = this.iIIIIIiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u9aa4\u7c84\u8345\u56b3"))).description(IiiiIIiiII.iiIIiIIiii("\u9aa3\u7cda\u4f73\u757c\u768f\u6c7d\u5e65\u8300\u56a8"))).defaultValue((Object)(--4))).min(3 & 5).sliderMax(0x76 & 0xF).build());
        this.IiiIIiIiii = this.iIIIIIiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u6711\u5937\u9aa4\u7c84\u6b67\u6537"))).description(IiiiIIiiII.iiIIiIIiii("\u5b8d\u537e\u4e2b\u4f02\u723d\u670b\u5949\u4f73\u757c\u9aa3\u7cc0\u7692\u6b22\u652c"))).defaultValue((Object)(0xB & 0x7E))).min(3 & 5).sliderMax(0x3E & 0x55).build());
        this.iIIIIIiIIi = this.iIIIIIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u81fb\u52b8\u520b\u636f\u9aee\u7cce"))).description(IiiiIIiiII.iiIIiIIiii("\u4f7e\u7576\u9afc\u7c82\u65a5\u81e6\u52fc\u520c\u632b\u5226\u9aab\u7cd5"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiIiiiIi = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u6632\u7937\u6e74\u6794"))).description(IiiiIIiiII.iiIIiIIiii("\u665b\u540d\u663f\u7964\u89d5\u590f\u7455\u7688\u65ed\u575c\u6e7b\u67c5\u9887\u8994"))).defaultValue((Object)(3 >> 1))).build());
        this.iiiiIiiIIi = this.iIiIiIIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("\u6e3e\u67de\u6a67\u5f48"))).description(IiiiIIiiII.iiIIiIIiii("\u9002\u62ba\u6e3e\u6787\u768f\u6677\u792c\u6a22\u5f53"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIIIIIIiII = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("\u9515\u5720\u4fab\u976f\u98da\u8235"))).description(IiiiIIiiII.iiIIiIIiii("\u8980\u955a\u5764\u65b2\u5704\u7688\u4ff3\u9769\u5822\u5153\u989f\u822e"))).defaultValue(new SettingColor(0x11EB & 0x6E9F, 0x6F & 0x55, 0x37 & 0x5B, 0x7E & 0x1F)).build());
        this.iIIiiIIIIi = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("\u9515\u5720\u7eb3\u676c\u98da\u8235"))).description(IiiiIIiiII.iiIIiIIiii("\u89d5\u950f\u5763\u65b5\u5703\u768f\u7ef6\u6777\u989f\u822e"))).defaultValue(new SettingColor(0x75AB & 0xADF, 0x6D & 0x57, 0x5B & 0x37, 0x4CFF & 0x33FF)).build());
        int n = 0x7B & 0x26;
        this.iiiiiIIiIi = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("\u79dc\u691d\u4fab\u976f\u98da\u8235"))).description(IiiiIIiiII.iiIIiIIiii("\u8980\u7993\u6959\u4f46\u7f3d\u7688\u4ff3\u9769\u5822\u5153\u989f\u822e"))).defaultValue(new SettingColor(n, 0x178F & 0x68FB, n, 0x3F & 0x5E)).build());
        int n2 = 0x7E & 0x23;
        this.IIiIiiiiII = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("\u79dc\u691d\u7eb3\u676c\u98da\u8235"))).description(IiiiIIiiII.iiIIiIIiii("\u89d5\u79c6\u695e\u4f41\u7f3a\u768f\u7ef6\u6777\u989f\u822e"))).defaultValue(new SettingColor(n2, 0x8FF & 0x778B, n2, 0x12FF & 0x6DFF)).build());
        this.iIiiiIiIii = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("\u6527\u5262\u4fab\u976f\u98da\u8235"))).description(IiiiIIiiII.iiIIiIIiii("\u8980\u6568\u5226\u4f57\u723a\u7688\u4ff3\u9769\u5822\u5153\u989f\u822e"))).defaultValue(new SettingColor(0x65FF & 0x1AFF, 0x3EDF & 0x41F7, 2 & 5, 0x3E & 0x5F)).build());
        int n3 = 0x73FF & 0xCFF;
        this.IIiIiIIiii = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("\u6527\u5262\u7eb3\u676c\u98da\u8235"))).description(IiiiIIiiII.iiIIiIIiii("\u89d5\u653d\u5221\u4f50\u723d\u768f\u7ef6\u6777\u989f\u822e"))).defaultValue(new SettingColor(n3, 0x1FF & 0x7ED7, 2 & 5, n3)).build());
        int n4 = 0x18FF & 0x67FF;
        this.iIIIIiiiii = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("\u9ab9\u7c99\u4fab\u976f\u98da\u8235"))).description(IiiiIIiiII.iiIIiIIiii("\u89f5\u4f54\u7529\u9af6\u7cdd\u4f57\u723a\u7688\u4ff3\u9769\u5822\u5153\u989f\u822e"))).defaultValue(new SettingColor(n4, 0x22FF & 0x5DFF, n4, 0x3F & 0x5E)).build());
        this.iiiIiiIIII = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(MySettings.ALLATORIxDEMO("\u9ab9\u7c99\u7eb3\u676c\u98da\u8235"))).description(IiiiIIiiII.iiIIiIIiii("\u8980\u4f21\u757c\u9aa3\u7cda\u4f50\u723d\u768f\u7ef6\u6777\u989f\u822e"))).defaultValue(new SettingColor(255, 255, 255, 255)).build());
        IIiIIiIIiI iIiIIiIIiI2 = this;
        IIiIIiIIiI iIiIIiIIiI3 = this;
        IIiIIiIIiI iIiIIiIIiI4 = this;
        iIiIIiIIiI4.IiiiiIIiII = -4 >> 2;
        iIiIIiIIiI4.iiIIIiIIIi = -4 >> 2;
        iIiIIiIIiI3.IIIiiiIiIi = 0L;
        iIiIIiIIiI3.IiiIiIiIIi = 0L;
        iIiIIiIIiI2.IiiIIiIIiI = 0L;
        iIiIIiIIiI2.iIIIIIiIii = 0L;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("a\\tqBU\u0011EatPD!d1\u8be7\u66e2\u65a7\u5221\u6710\u65bc\u7245\u676a\uff46"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IIiIiIiIiI(class_2338 class_23382) {
        void iIiIiIIIII2;
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = iIiIIiIIiI.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIiIIIII2).method_26204();
        if ((iIiIIiIIiI2 == class_2246.field_10566 || iIiIIiIIiI2 == class_2246.field_10219 || iIiIIiIIiI2 == class_2246.field_10253 || iIiIIiIIiI2 == class_2246.field_10520 || iIiIIiIIiI2 == class_2246.field_10402 || iIiIIiIIiI2 == class_2246.field_28685) && iIiIIiIIiI.iIIiiIiIiI.field_1687.method_8320((class_2338)(iIiIIiIIiI2 = iIiIiIIIII2.method_10084())).method_26204() == class_2246.field_10124) {
            return iIiIIiIIiI.iIiIiiiiii((class_2338)iIiIiIIIII2);
        }
        return false;
    }

    private /* synthetic */ class_2338 iiIIiIIiii() {
        IIiIIiIIiI iIiIIiIIiI = arrayList;
        if (iIiIIiIIiI.iiiIIiIIii.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (class_2338 class_23382 : iiIIiiiIIi.ALLATORIxDEMO(iIiIIiIIiI.iIIiiIiIiI.field_1724.method_24515(), (Integer)iIiIIiIIiI.iIIIiiiiIi.get(), 5 >> 1)) {
            if (!iIiIIiIIiI.iiiiIIIiII(class_23382)) continue;
            arrayList.add(class_23382);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (iIiIIiIIiI.IiIiiIIiIi.get() == FarmHelper.SortMode.iiiiiIIiIi) {
            Collections.reverse(arrayList);
        }
        return (class_2338)arrayList.get(3 >> 2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent, class_2338 class_23382, SettingColor settingColor, SettingColor settingColor2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = settingColor2;
        IIiIIiIIiI iIiIiIIIII5 = iIiIIiIIiI;
        void v1 = iIiIiIIIII4;
        double d = v1.method_10263();
        double d2 = v1.method_10264();
        double d3 = v1.method_10260();
        double d4 = v1.method_10263() + --1;
        double d5 = v1.method_10264() + (2 ^ 3);
        double d6 = v1.method_10260() + --1;
        iIiIiIIIII3.renderer.box(d, d2, d3, d4, d5, d6, (Color)iIiIiIIIII2, (Color)iIiIIiIIiI2, (ShapeMode)iIiIiIIIII5.iiiiIiiIIi.get(), 2 & 5);
    }

    private /* synthetic */ class_2338 iiiIiIiiIi() {
        IIiIIiIIiI iIiIIiIIiI = arrayList;
        if (iIiIIiIIiI.iiIIiiIIii.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (class_2338 class_23382 : iiIIiiiIIi.ALLATORIxDEMO(iIiIIiIIiI.iIIiiIiIiI.field_1724.method_24515(), (Integer)iIiIIiIIiI.IIiIiIiiii.get(), --2)) {
            if (!iIiIIiIIiI.iiIIiIIiii(class_23382)) continue;
            arrayList.add(class_23382);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (iIiIIiIIiI.IiIiiIIiIi.get() == FarmHelper.SortMode.iiiiiIIiIi) {
            Collections.reverse(arrayList);
        }
        return (class_2338)arrayList.get(5 >> 3);
    }

    @Override
    public void onActivate() {
        IIiIIiIIiI iIiIIiIIiI = this;
        IIiIIiIIiI iIiIIiIIiI2 = this;
        IIiIIiIIiI iIiIIiIIiI3 = this;
        super.onActivate();
        this.IIiiiiIIii = 3 >> 2;
        this.IiiIiIiiIi = 5 >> 3;
        iIiIIiIIiI3.IIiiIIIIIi = this.IiiIiIiiIi;
        iIiIIiIIiI3.IiIiIiIIii = 2 & 5;
        IIiIIiIIiI iIiIIiIIiI4 = this;
        iIiIIiIIiI2.iIIiiiiIii = new HashMap<class_1792, Integer>();
        IIiIIiIIiI iIiIIiIIiI5 = this;
        iIiIIiIIiI4.iiiIIiIIii = new HashMap<class_1792, Integer>();
        IIiIIiIIiI iIiIIiIIiI6 = this;
        iIiIIiIIiI2.iiIIiiIIii = new HashMap<class_1792, Integer>();
        IIiIIiIIiI iIiIIiIIiI7 = this;
        iIiIIiIIiI.iIIiIiiiII = new HashMap<class_2338, Integer>();
        iIiIIiIIiI.IIIiiiIiIi = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean iiiiIIIiII(class_2338 class_23382) {
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = class_23382;
        IIiIIiIIiI iIiIiIIIII2 = iIiIIiIIiI;
        FarmHelper.CropType cropType = (FarmHelper.CropType)((Object)iIiIiIIIII2.iIIIIiIIiI.get());
        if (cropType == FarmHelper.CropType.iIiIiIIIII ? !iIiIiIIIII2.ALLATORIxDEMO((class_2338)iIiIIiIIiI2) : !iIiIiIIIII2.iiiIiIiiIi((class_2338)iIiIIiIIiI2)) {
            return (2 & 5) != 0;
        }
        class_2338 class_23383 = iIiIIiIIiI2.method_10084();
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(class_23383).method_26204() != class_2246.field_10124) {
            return (3 ^ 3) != 0;
        }
        if (!iIiIiiIIIi.iiiIiIiiIi((class_2338)iIiIIiIIiI2, class_2350.field_11036)) {
            return 5 >> 3;
        }
        switch (cropType.ordinal()) {
            case 0: {
                return iIiIiIIIII2.iiiIIiIIii.containsKey(class_1802.field_8317);
            }
            case 1: {
                return iIiIiIIIII2.iiiIIiIIii.containsKey(class_1802.field_8179);
            }
            case 2: {
                return iIiIiIIIII2.iiiIIiIIii.containsKey(class_1802.field_8567);
            }
            case 3: {
                return iIiIiIIIII2.iiiIIiIIii.containsKey(class_1802.field_8309);
            }
            case 4: {
                return iIiIiIIIII2.iiiIIiIIii.containsKey(class_1802.field_46249);
            }
            case 5: {
                return iIiIiIIIII2.iiiIIiIIii.containsKey(class_1802.field_46250);
            }
            case 6: {
                return iIiIiIIIII2.iiiIIiIIii.containsKey(class_1802.field_8790);
            }
        }
        return false;
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Post post) {
        IIiIIiIIiI iIiIIiIIiI;
        IIiIIiIIiI iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI3 = iIiIIiIIiI2 = iIiIIiIIiI;
        iIiIIiIIiI3.IIiiiiIIii -= 2 ^ 3;
        iIiIIiIIiI3.IiiIiIiiIi -= 5 >> 2;
        iIiIIiIIiI3.IIiiIIIIIi -= 4 ^ 5;
        iIiIIiIIiI3.IiIiIiIIii -= 3 & 5;
        iIiIIiIIiI3.ALLATORIxDEMO();
        FarmHelper.WorkMode iIiIiIIIII2 = (FarmHelper.WorkMode)((Object)iIiIIiIIiI3.iiIiiiiIii.get());
        if ((iIiIiIIIII2 == FarmHelper.WorkMode.iIIiIiiiIi || iIiIiIIIII2 == FarmHelper.WorkMode.ALLATORIxDEMO) && iIiIIiIIiI2.IIiiiiIIii <= 0) {
            iIiIIiIIiI = iIiIIiIIiI2.ALLATORIxDEMO();
            if (iIiIIiIIiI != null) {
                iIiIIiIIiI2.ALLATORIxDEMO((class_2338)iIiIIiIIiI);
            }
            iIiIIiIIiI2.IIiiiiIIii = (Integer)iIiIIiIIiI2.IiiiiIiIiI.get();
        }
        if ((iIiIiIIIII2 == FarmHelper.WorkMode.iIIiIiiiIi || iIiIiIIIII2 == FarmHelper.WorkMode.iiiiiIIiIi) && iIiIIiIIiI2.IiiIiIiiIi <= 0) {
            iIiIIiIIiI = iIiIIiIIiI2.iiIIiIIiii();
            if (iIiIIiIIiI != null) {
                iIiIIiIIiI2.iiIIiIIiii((class_2338)iIiIIiIIiI);
            }
            iIiIIiIIiI2.IiiIiIiiIi = (Integer)iIiIIiIIiI2.iIIiiIiIiI.get();
        }
        if ((iIiIiIIIII2 == FarmHelper.WorkMode.iIIiIiiiIi || iIiIiIIIII2 == FarmHelper.WorkMode.iIIiiIiIiI) && iIiIIiIIiI2.IIiiIIIIIi <= 0) {
            iIiIIiIIiI = iIiIIiIIiI2.IIIIiIIiII();
            if (iIiIIiIIiI != null) {
                iIiIIiIIiI2.IIIIiIIiII((class_2338)iIiIIiIIiI);
            }
            iIiIIiIIiI2.IIiiIIIIIi = (Integer)iIiIIiIIiI2.iiiIiIiiII.get();
        }
        if (((Boolean)iIiIIiIIiI2.IiIIiiiiIi.get()).booleanValue() && iIiIIiIIiI2.IiIiIiIIii <= 0) {
            iIiIIiIIiI = iIiIIiIIiI2.iiiIiIiiIi();
            if (iIiIIiIIiI != null) {
                iIiIIiIIiI2.iiiIiIiiIi((class_2338)iIiIIiIIiI);
            }
            iIiIIiIIiI2.IiIiIiIIii = (Integer)iIiIIiIIiI2.iIiiiiIIII.get();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiIIiIIiii(Render3DEvent render3DEvent) {
        IIiIIiIIiI iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        if (iIiIIiIIiI.iiIIiiIIii.isEmpty()) {
            return;
        }
        for (class_2338 this_ : iiIIiiiIIi.ALLATORIxDEMO(iIiIIiIIiI.iIIiiIiIiI.field_1724.method_24515(), (Integer)iIiIIiIIiI.IIiIiIiiii.get(), 1 ^ 3)) {
            void iIiIiIIIII2;
            if (!iIiIIiIIiI.iiIIiIIiii(this_)) continue;
            IIiIIiIIiI iIiIIiIIiI3 = iIiIIiIIiI;
            iIiIIiIIiI3.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2, this_, (SettingColor)iIiIIiIIiI3.iIIIIiiiii.get(), (SettingColor)iIiIIiIIiI.iiiIiiIIII.get());
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void iiiIiIiiIi(Render3DEvent render3DEvent) {
        void iIiIiIIIII2;
        IIiIIiIIiI iIiIIiIIiI = object;
        if (!((Boolean)iIiIIiIIiI.iIIiIiiiIi.get()).booleanValue() || iIiIIiIIiI.iIIiiIiIiI.field_1724 == null || iIiIIiIIiI.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        Object object = (FarmHelper.WorkMode)((Object)iIiIIiIIiI.iiIiiiiIii.get());
        if (object == FarmHelper.WorkMode.iIIiIiiiIi || object == FarmHelper.WorkMode.ALLATORIxDEMO) {
            iIiIIiIIiI.iiiiIIIiII((Render3DEvent)iIiIiIIIII2);
        }
        if (object == FarmHelper.WorkMode.iIIiIiiiIi || object == FarmHelper.WorkMode.iiiiiIIiIi) {
            iIiIIiIIiI.IIIIiIIiII((Render3DEvent)iIiIiIIIII2);
        }
        if (object == FarmHelper.WorkMode.iIIiIiiiIi || object == FarmHelper.WorkMode.iIIiiIiIiI) {
            iIiIIiIIiI.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2);
        }
        if (((Boolean)iIiIIiIIiI.IiIIiiiiIi.get()).booleanValue()) {
            iIiIIiIIiI.iiIIiIIiii((Render3DEvent)iIiIiIIIII2);
        }
    }

    private /* synthetic */ class_2338 ALLATORIxDEMO() {
        IIiIIiIIiI iIiIIiIIiI = arrayList;
        if (iIiIIiIIiI.iIIiiiiIii.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (class_2338 class_23382 : iiIIiiiIIi.ALLATORIxDEMO(iIiIIiIIiI.iIIiiIiIiI.field_1724.method_24515(), (Integer)iIiIIiIIiI.iIiIiiiiII.get(), 3 & 5)) {
            if (!iIiIIiIIiI.IIiIiIiIiI(class_23382)) continue;
            arrayList.add(class_23382);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (iIiIIiIIiI.IiIiiIIiIi.get() == FarmHelper.SortMode.iiiiiIIiIi) {
            Collections.reverse(arrayList);
        }
        return (class_2338)arrayList.get(2 & 5);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IIiIIiIIiI iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        for (class_2338 this_ : iiIIiiiIIi.ALLATORIxDEMO(iIiIIiIIiI.iIIiiIiIiI.field_1724.method_24515(), (Integer)iIiIIiIIiI.iIiIIiIIIi.get(), 5 >> 1)) {
            void iIiIiIIIII2;
            if (!iIiIIiIIiI.iIiIiIiIii(this_)) continue;
            IIiIIiIIiI iIiIIiIIiI3 = iIiIIiIIiI;
            iIiIIiIIiI3.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2, this_, (SettingColor)iIiIIiIIiI3.iIiiiIiIii.get(), (SettingColor)iIiIIiIIiI.IIiIiIIiii.get());
        }
    }

    private /* synthetic */ boolean IIIIiIIiII(class_2338 class_23382) {
        class_2680 iIiIiIIIII2;
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = (iIiIiIIIII2 = iIiIIiIIiI.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIiIIIII2)).method_26204();
        if (iIiIIiIIiI2 instanceof class_2302) {
            return ((class_2302)iIiIIiIIiI2).method_9825(iIiIiIIIII2);
        }
        if (iIiIIiIIiI2 == class_2246.field_46283 || iIiIIiIIiI2 == class_2246.field_46282) {
            return true;
        }
        if (iIiIIiIIiI2 == class_2246.field_10609 || iIiIIiIIiI2 == class_2246.field_10247) {
            if ((Integer)iIiIiIIIII2.method_11654((class_2769)class_4865.field_22509) >= (0x7F & 7)) {
                return (4 ^ 5) != 0;
            }
            return false;
        }
        if (iIiIIiIIiI2 == class_2246.field_10341) {
            if ((Integer)iIiIiIIIII2.method_11654((class_2769)class_2242.field_9962) >= --3) {
                return (2 ^ 3) != 0;
            }
            return false;
        }
        if (iIiIIiIIiI2 == class_2246.field_9974) {
            if ((Integer)iIiIiIIIII2.method_11654((class_2769)class_2421.field_11306) >= --3) {
                return 3 >> 1;
            }
            return false;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiIIiIIiii(class_2338 class_23382) {
        void iIiIiIIIII2;
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = iIiIIiIIiI.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIiIIIII2).method_26204();
        if ((iIiIIiIIiI2 instanceof class_2302 || iIiIIiIIiI2 == class_2246.field_46287 || iIiIIiIIiI2 == class_2246.field_46286 || iIiIIiIIiI2 == class_2246.field_10609 || iIiIIiIIiI2 == class_2246.field_10247 || iIiIIiIIiI2 == class_2246.field_9974 || iIiIIiIIiI2 == class_2246.field_10341) && !iIiIIiIIiI.IIIIiIIiII((class_2338)iIiIiIIIII2)) {
            if (iIiIIiIIiI.iIIiIiiiII.getOrDefault(iIiIiIIIII2, 2 & 5) < (Integer)iIiIIiIIiI.IiiIIiIiii.get()) {
                return (4 ^ 5) != 0;
            }
            return false;
        }
        return false;
    }

    public static boolean ALLATORIxDEMO(class_2680 class_26802) {
        class_2680 class_26803 = class_26802;
        class_2680 iIiIiIIIII2 = class_26803.method_26204();
        if (iIiIiIIIII2 == class_2246.field_10382 || iIiIiIIIII2 == class_2246.field_10376 || iIiIiIIIII2 == class_2246.field_10238 || iIiIiIIIII2 == class_2246.field_9993 || iIiIiIIIII2 == class_2246.field_10463 || iIiIiIIIII2 == class_2246.field_10422 || class_26803.method_26227().method_39360((class_3611)class_3612.field_15910)) {
            return true;
        }
        if (class_26803.method_28498((class_2769)class_2741.field_12508) && ((Boolean)class_26803.method_11654((class_2769)class_2741.field_12508)).booleanValue()) {
            return 3 >> 1;
        }
        return false;
    }

    private /* synthetic */ void iiiIiIiiIi(class_2338 class_23382) {
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = class_23382;
        IIiIIiIIiI iIiIiIIIII2 = iIiIIiIIiI;
        if (iIiIiIIIII2.iiIIIiIIIi == -4 >> 2) {
            long l = System.currentTimeMillis();
            if (l - iIiIiIIIII2.iIIIIIiIii >= 5000L) {
                iIiIiIIIII2.error(IiiiIIiiII.iiIIiIIiii("\u80e7\u5351\u4e26\u6cf5\u6702\u620a\u521b\u9afc\u7c82"), new Object[3 >> 2]);
                iIiIiIIIII2.iIIIIIiIii = l;
            }
            return;
        }
        if (((Boolean)iIiIiIIIII2.iIIIIIiIIi.get()).booleanValue()) {
            IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2.iiIIIiIIIi);
        }
        iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiIIiIIiI2, class_2350.field_11036, (3 & 5) != 0, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
        int n = iIiIiIIIII2.iIIiIiiiII.getOrDefault(iIiIIiIIiI2, 3 >> 2);
        IIiIIiIIiI iIiIIiIIiI3 = iIiIiIIIII2;
        iIiIIiIIiI3.iIIiIiiiII.put((class_2338)iIiIIiIIiI2, n + --1);
        if (((Boolean)iIiIIiIIiI3.iIIIIIiIIi.get()).booleanValue()) {
            IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2.iiIIIiIIIi);
        }
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = class_23382;
        IIiIIiIIiI iIiIiIIIII2 = iIiIIiIIiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIIiIIiI2).method_26204() == class_2246.field_10362) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void ALLATORIxDEMO() {
        int n;
        IIiIIiIIiI iIiIIiIIiI = cropType;
        long l = System.currentTimeMillis();
        if (l - iIiIIiIIiI.IIIiiiIiIi < 1000L) {
            return;
        }
        IIiIIiIIiI iIiIIiIIiI2 = iIiIIiIIiI;
        iIiIIiIIiI.iIIiiiiIii.clear();
        iIiIIiIIiI2.iiiIIiIIii.clear();
        iIiIIiIIiI2.iiIIiiIIii.clear();
        iIiIIiIIiI2.IiiiiIIiII = -4 >> 2;
        iIiIIiIIiI.iiIIIiIIIi = iIiIIiIIiI2.IiiiiIIiII;
        class_1792[] class_1792Array = new class_1792[0x16 & 0x6F];
        class_1792Array[5 >> 3] = class_1802.field_8167;
        class_1792Array[3 & 5] = class_1802.field_8431;
        class_1792Array[--2] = class_1802.field_8609;
        class_1792Array[--3] = class_1802.field_8303;
        class_1792Array[--4] = class_1802.field_8527;
        class_1792Array[--5] = class_1802.field_22026;
        for (class_1792 class_17922 : Arrays.asList(class_1792Array)) {
            n = IiIiiiiIii.ALLATORIxDEMO(class_17922);
            if (n == -4 >> 2) continue;
            iIiIIiIIiI.iIIiiiiIii.put(class_17922, n);
            iIiIIiIIiI.IiiiiIIiII = n;
        }
        FarmHelper.CropType cropType = (FarmHelper.CropType)((Object)iIiIIiIIiI.iIIIIiIIiI.get());
        switch (cropType.ordinal()) {
            case 0: {
                int n2 = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8317);
                if (n2 == -4 >> 2) break;
                iIiIIiIIiI.iiiIIiIIii.put(class_1802.field_8317, n2);
                break;
            }
            case 1: {
                n = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8179);
                if (n == -4 >> 2) break;
                iIiIIiIIiI.iiiIIiIIii.put(class_1802.field_8179, n);
                break;
            }
            case 2: {
                int this_ = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8567);
                if (this_ == -4 >> 2) break;
                iIiIIiIIiI.iiiIIiIIii.put(class_1802.field_8567, this_);
                break;
            }
            case 3: {
                int this_ = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8309);
                if (this_ == -4 >> 2) break;
                iIiIIiIIiI.iiiIIiIIii.put(class_1802.field_8309, this_);
                break;
            }
            case 4: {
                int this_ = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_46249);
                if (this_ == -4 >> 2) break;
                iIiIIiIIiI.iiiIIiIIii.put(class_1802.field_46249, this_);
                break;
            }
            case 5: {
                int this_ = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_46250);
                if (this_ == -4 >> 2) break;
                iIiIIiIIiI.iiiIIiIIii.put(class_1802.field_46250, this_);
                break;
            }
            case 6: {
                int this_ = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8790);
                if (this_ == -4 >> 2) break;
                iIiIIiIIiI.iiiIIiIIii.put(class_1802.field_8790, this_);
                break;
            }
        }
        int n3 = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8324);
        if (n3 != -4 >> 2) {
            iIiIIiIIiI.iiIIiiIIii.put(class_1802.field_8324, n3);
            iIiIIiIIiI.iiIIIiIIIi = n3;
        }
        iIiIIiIIiI.IIIiiiIiIi = l;
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = class_23382;
        IIiIIiIIiI iIiIiIIIII2 = iIiIIiIIiI;
        if (iIiIiIIIII2.IiiiiIIiII == -4 >> 2) {
            long l = System.currentTimeMillis();
            if (l - iIiIiIIIII2.IiiIiIiIIi >= 5000L) {
                iIiIiIIIII2.error(IiiiIIiiII.iiIIiIIiii("\u80be\u5328\u4e42\u6c91\u677d\u6255\u5275\u94a1\u778a\u9522\u626e\u4e2c\u753c\u5427\u91a3\u9529"), new Object[3 & 4]);
                iIiIiIIIII2.IiiIiIiIIi = l;
            }
            return;
        }
        if (((Boolean)iIiIiIIIII2.iiiIiIIiii.get()).booleanValue()) {
            IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2.IiiiiIIiII);
        }
        iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiIIiIIiI2, class_2350.field_11036, --1 != 0, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
        if (((Boolean)iIiIiIIIII2.iiiIiIIiii.get()).booleanValue()) {
            IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2.IiiiiIIiII);
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IIiIIiIIiI iIiIIiIIiI = iIiIIiIIiI2;
        IIiIIiIIiI iIiIIiIIiI2 = class_23382;
        IIiIIiIIiI iIiIiIIIII2 = iIiIIiIIiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIIiIIiI2).method_26204() == class_2246.field_10114) {
            return 3 >> 1;
        }
        return false;
    }
}

