/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.entity.SortPriority
 *  meteordevelopment.meteorclient.utils.entity.Target
 *  meteordevelopment.meteorclient.utils.entity.TargetUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1802
 *  net.minecraft.class_1934
 *  net.minecraft.class_238
 *  net.minecraft.class_3532
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiiiiiiiii;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.Target;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_1934;
import net.minecraft.class_238;
import net.minecraft.class_3532;

public class IIiIIiiIii
extends iIiIiIIIii {
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final SettingGroup iIiIiiiiII;
    private final SettingGroup IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<ShapeMode> IIiIiIIiii;
    private final Setting<SortPriority> iIIiiIiIiI;
    private final List<class_1297> iiiiiIIiIi;
    private final Setting<SettingColor> iIIiIiiiIi;
    private final Setting<SettingColor> iIiIiIIIII;
    private final Setting<Double> ALLATORIxDEMO;

    public IIiIIiiIii() {
        IIiIIiiIii iIiIIiiIii = this;
        super(iIiIiIIIii.iIIiIiiiIi, IIiiIiIIIi.iiiIiIiiIi("\u97e3\u7fd7\u8f86\u4ea8"), iiiiiiiiii.ALLATORIxDEMO("\u97cf\u7f82\u8faa\u4efd"));
        iIiIIiiIii.IIIIiiIiii = iIiIIiiIii.settings.getDefaultGroup();
        iIiIIiiIii.iIiIiiiiII = iIiIIiiIii.settings.createGroup(IIiiIiIIIi.iiiIiIiiIi("\u6e49\u67c1\u8bc5\u7f7c"));
        IIiIIiiIii iIiIIiiIii2 = this;
        iIiIIiiIii.iiiiiIIiIi = new ArrayList<class_1297>();
        iIiIIiiIii.iIIiiIiIiI = iIiIIiiIii.IIIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u7689\u6850\u4f5f\u511f\u7ee0"))).description(IIiiIiIIIi.iiiIiIiiIi("\u5f06\u689b\u6d79\u526b\u5928\u4e51\u655e\u4ee1\u65c4\uff57\u633b\u4f2e\u79df\u9801\u5e9d\u4f43\u517a\u957a\u5b88\u7695\u6815"))).defaultValue((Object)SortPriority.LowestDistance)).build());
        this.ALLATORIxDEMO = this.IIIIiiIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u6897\u6d0c\u8354\u56b3"))).description(IIiiIiIIIi.iiiIiIiiIi("\u53b4\u9533\u5be1\u655e\u4ec1\u7696\u675b\u5915\u8da6\u79a9\u8378\u56e6"))).defaultValue(50.0).range(0.0, 192.0).build());
        this.IIiiIIIIIi = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u4eb2\u9637\u7a2d\u4e6a\u76b9\u6840"))).description(IIiiIiIIIi.iiiIiIiiIi("\u5391\u5beb\u595f\u4ebc\u7a21\u4e1f\u76ff\u76fc\u687c\u8fc9\u8817\u68f2\u6d30\u4e1c\u957a\u5b88"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIiiiIiIii = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u9665\u6b25\u846a\u5777"))).description(IIiiIiIIIi.iiiIiIiiIi("\u543d\u7573\u543c\uff57\u89e0\u8209\u573a\u621c\u885e\u6744\u95c6\u4e76\u4f08\u899d\u5722"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiIiIiiIi = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u5478\u756f\u6e65\u6794"))).description(IIiiIiIIIi.iiiIiIiiIi("\u663d\u547d\u571a\u5c14\u5e67\u4e71\u6e20\u67a8\u9513\u5bc1\u76dc\u687c\u7696\u687c\u8bd4"))).defaultValue((Object)(--1 != 0))).build());
        this.IIiIiIIiii = this.iIiIiiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u6e65\u6794\u6a76\u5f48"))).description(IIiiIiIIIi.iiiIiIiiIi("\u51a7\u5be6\u76fb\u683b\u6852\u8b9d\u76b6\u6665\u7908\u65c2\u5f1d\uff53\u7e8d\u681d\u0012T2\u5810\u5157{\u001d[\u53de\u91b6\uff1b"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.IiiIiIiiIi.get())).build());
        this.iIIiIiiiIi = this.iIiIiiiiII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u583c\u5102\u98cb\u8235"))).description(IIiiIiIIIi.iiiIiIiiIi("\u76dc\u687c\u5328\u57a4\u7696\u5830\u5177\u9093\u5214\u98e7\u8260"))).defaultValue(new SettingColor(0x63FE & 0x1CA1, 2 & 5, 0x5FEB & 0x20F5, 0x37 & 0x6B)).visible(() -> ((ShapeMode)this.IIiIiIIiii.get()).sides())).build());
        int n = 0x19FF & 0x66FF;
        this.iIiIiIIIII = this.iIiIiiiiII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u8f39\u5e94\u98cb\u8235"))).description(IIiiIiIIIi.iiiIiIiiIi("\u7695\u6815\u8f35\u5ee1\u7ec4\u7696\u98e7\u8260"))).defaultValue(new SettingColor(n, 0x69FF & 0x16FF, n, 0x7F & 0x32)).visible(() -> {
            if (((Boolean)this.IiiIiIiiIi.get()).booleanValue() && ((ShapeMode)this.IIiIiIIiii.get()).lines()) {
                return 5 >> 2;
            }
            return false;
        })).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiiiiiiii.ALLATORIxDEMO("\u0000,ua\u0004\u0002W\u0012'#\u0016\u0013\u0012Fw\u8bb0\u66a3\u65f7\u5247\u6767\u65e7\u720f\u677b\uff46"));
        }
    }

    @Override
    public void onActivate() {
        IIiIIiiIii iIiIIiiIii = this;
        iIiIIiiIii.iiiiiIIiIi.clear();
        TargetUtils.getList(iIiIIiiIii.iiiiiIIiIi, class_12972 -> {
            IIiIIiiIii iIiIIiiIii = iIiIIiiIii2;
            IIiIIiiIii iIiIIiiIii2 = class_12972;
            IIiIIiiIii iIiIiIIIII2 = iIiIIiiIii;
            if (iIiIIiiIii2 instanceof class_1657) {
                class_1657 class_16572 = (class_1657)iIiIIiiIii2;
                if (Friends.get().isFriend(class_16572)) {
                    return (3 ^ 3) != 0;
                }
                if (iIiIIiiIii2 == iIiIiIIIII2.iIIiiIiIiI.field_1724) {
                    return (3 ^ 3) != 0;
                }
                iIiIIiiIii2 = iIiIIiiIii2.method_5829();
                return PlayerUtils.isWithin((double)class_3532.method_15350((double)iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23317(), (double)((class_238)iIiIIiiIii2).field_1323, (double)((class_238)iIiIIiiIii2).field_1320), (double)class_3532.method_15350((double)iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23318(), (double)((class_238)iIiIIiiIii2).field_1322, (double)((class_238)iIiIIiiIii2).field_1325), (double)class_3532.method_15350((double)iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23321(), (double)((class_238)iIiIIiiIii2).field_1321, (double)((class_238)iIiIIiiIii2).field_1324), (double)((Double)iIiIiIIIII2.ALLATORIxDEMO.get()));
            }
            return false;
        }, (SortPriority)((SortPriority)this.iIIiiIiIiI.get()), (int)(--1));
        IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8639);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IIiIIiiIii iIiIIiiIii = iIiIIiiIii2;
        if (iIiIIiiIii.iIIiiIiIiI.field_1724.method_5805() && PlayerUtils.getGameMode() != class_1934.field_9219) {
            IIiIIiiIii iIiIIiiIii2;
            if (iIiIIiiIii.iiiiiIIiIi.isEmpty()) {
                return;
            }
            if (!((Boolean)iIiIIiiIii.IIiiIIIIIi.get()).booleanValue() || !iIiIIiiIii.iIIiiIiIiI.field_1724.method_24828()) {
                iIiIIiiIii2 = iIiIIiiIii.iiiiiIIiIi.getFirst();
                if (!((Boolean)iIiIIiiIii.iIiiiIiIii.get()).booleanValue() || !iIiIIiiIii2.method_24828()) {
                    MeteorClient.mc.field_1724.method_36456((float)Rotations.getYaw((class_1297)iIiIIiiIii2));
                }
                MeteorClient.mc.field_1724.method_36457(iIiIIiiIii2.method_24828() && (Boolean)iIiIIiiIii.iIiiiIiIii.get() != false ? -90.0f : (float)Rotations.getPitch((class_1297)iIiIIiiIii2, (Target)Target.Body));
            }
            try {
                iIiIIiiIii2 = iIiIIiiIii.iiiiiIIiIi.getFirst();
                if (iIiIIiiIii.iiiiiIIiIi.getFirst() != null) {
                    class_238 iIiIiIIIII2;
                    void v0 = iIiIiIIIII2;
                    double d = class_3532.method_16436((double)iIiIiIIIII2.tickDelta, (double)((class_1297)iIiIIiiIii2).field_6038, (double)iIiIIiiIii2.method_23317()) - iIiIIiiIii2.method_23317();
                    double d2 = class_3532.method_16436((double)v0.tickDelta, (double)((class_1297)iIiIIiiIii2).field_5971, (double)iIiIIiiIii2.method_23318()) - iIiIIiiIii2.method_23318();
                    double d3 = class_3532.method_16436((double)v0.tickDelta, (double)((class_1297)iIiIIiiIii2).field_5989, (double)iIiIIiiIii2.method_23321()) - iIiIIiiIii2.method_23321();
                    iIiIiIIIII2 = iIiIIiiIii2.method_5829();
                    v0.renderer.box(d + iIiIiIIIII2.field_1323, d2 + iIiIiIIIII2.field_1322, d3 + iIiIiIIIII2.field_1321, d + iIiIiIIIII2.field_1320, d2 + iIiIiIIIII2.field_1325, d3 + iIiIiIIIII2.field_1324, (Color)iIiIIiiIii.iIIiIiiiIi.get(), (Color)iIiIIiiIii.iIiIiIIIII.get(), (ShapeMode)iIiIIiiIii.IIiIiIIiii.get(), 5 >> 3);
                    return;
                }
            }
            catch (Exception this_) {
                // empty catch block
            }
        }
    }

    public String getInfoString() {
        if (!this.iiiiiIIiIi.isEmpty()) {
            return EntityUtils.getName((class_1297)this.iiiiiIIiIi.getFirst());
        }
        return null;
    }

    public void onDeactivate() {
        this.iiiiiIIiIi.clear();
    }
}

