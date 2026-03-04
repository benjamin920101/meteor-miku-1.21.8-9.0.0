/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.AbstractRailBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.ButtonBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.block.SlabBlock
 *  net.minecraft.block.TrapdoorBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiiIIIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.iiiiIiiIIi;
import com.github.mikumiku.addon.modules.AutoSlab;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.world.BlockView;
import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.ButtonBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.TrapdoorBlock;

public class iIiIiIIIII
extends iIiIiIIIii {
    private final List<class_2338> iIiIIiIIIi;
    private final iiIIiiIIIi IIiIiiiiII;
    private final Setting<SettingColor> IIiiIIIIIi;
    private final SettingGroup iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private final Setting<Double> IIIIiiIiii;
    private final Setting<SettingColor> IiiIiIiiIi;
    private final Setting<ShapeMode> IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    private int iiiiiIIiIi;
    private final Setting<Integer> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private final Setting<AutoSlab.BlockType> ALLATORIxDEMO;

    public iIiIiIIIII() {
        iIiIiIIIII iIiIiIIIII2 = this;
        super(iIiIiIIIii.ALLATORIxDEMO, IiiiIIIiii.ALLATORIxDEMO("\u9490\u5334\u787cU"), iiiiIiiIIi.ALLATORIxDEMO("\u81c5\u52f9\u655e\u7f3a\u532f\u7842J\u6d64\u6711\u95b6@\u94df\u8f47v\u6361\u94d7g\u5769\u6b87Uh\u53b3\u4f72\u9483\u4e48\u5c3b\uff44Y\u7560\u671c\u967a\u524e\u6062"));
        iIiIiIIIII2.iIIiiIiIiI = iIiIiIIIII2.settings.getDefaultGroup();
        iIiIiIIIII2.iIiiiIiIii = iIiIiIIIII2.settings.createGroup(IiiiIIIiii.ALLATORIxDEMO("\u6e58\u67ad"));
        iIiIiIIIII2.ALLATORIxDEMO = iIiIiIIIII2.iIIiiIiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u65c0\u571f\u7c02\u57c3"))).description(IiiiIIIiii.ALLATORIxDEMO("\u89eb\u6540\u7f24\u76da\u65d3\u5729\u7c31\u57d5D^\u9097\u6651\u4e67\u5249\u6040\u76fa\u65d3\u5729"))).defaultValue((Object)AutoSlab.BlockType.iIIiIiiiIi)).build());
        this.iIiIiiiiII = this.iIIiiIiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u5e8f\u8f97"))).description(IiiiIIIiii.ALLATORIxDEMO("\u6554\u7f10\u4e21\u958a\u76ee\u5e88\u8fb5V\u5251W"))).defaultValue((Object)(2 ^ 3))).build());
        this.iIIiIiiiIi = this.iIIiiIiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6bb6\u5273\u6547\u7f26\u6509\u9187"))).description(IiiiIIIiii.ALLATORIxDEMO("\u6ba5\u5245\u6554\u7f10\u5970\u5c6f\u65d3\u5729"))).defaultValue((Object)(--2))).sliderRange(--1, 0x5B & 0x2E).build());
        this.IIIIiiIiii = this.iIIiiIiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u837a\u56bc"))).description(IiiiIIIiii.ALLATORIxDEMO("\u65d3\u5729\u6554\u7f10\u8369\u568a"))).defaultValue(4.5).range(1.0, 6.0).build());
        this.iIiIiIIIII = this.iIiiiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6e4b\u679b"))).description(IiiiIIIiii.ALLATORIxDEMO("\u6e58\u67ad\u65d3\u5729\u4f27\u7f10"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.IIiIiIIiii = this.iIiiiIiIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u5f1b\u72fe\u6a58\u5f47"))).description(IiiiIIIiii.ALLATORIxDEMO("\u59e8\u4f2b\u6e58\u67ad\u65d3\u5729"))).defaultValue((Object)ShapeMode.Both)).build());
        this.IIiiIIIIIi = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u4fde\u972a\u98e5\u823a"))).description(IiiiIIIiii.ALLATORIxDEMO("\u6e4c\u67b9\u65c7\u573d\u4fd9\u9708\u76fa\u98f6\u820c"))).defaultValue(new SettingColor(0x65 & 0x7E, 0x2DEE & 0x52D9, 0x36FF & 0x49FF, 0x6D & 0x3F)).build());
        this.IiiIiIiiIi = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u7ec6\u6729\u98e5\u823a"))).description(IiiiIIIiii.ALLATORIxDEMO("\u6e4c\u67b9\u65c7\u573d\u7ec1\u670b\u76fa\u98f6\u820c"))).defaultValue(new SettingColor(0x7D & 0x7A, 0x3CDE & 0x43FD, 0x78FF & 0x7FF, 0x7EF6 & 0x1BD)).build());
        iIiIiIIIII iIiIiIIIII3 = this;
        iIiIiIIIII3.iIiIIiIIIi = new ArrayList<class_2338>();
        iIiIiIIIII iIiIiIIIII4 = this;
        iIiIiIIIII3.IIiIiiiiII = new iiIIiiIIIi(1000L);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiiIiiIIi.ALLATORIxDEMO("\u000e\u0003{N*\rY=)\f\u0018<<IY\u8bbf\u668d\u65f8\u5249\u6748\u65c9\u7200\u6755\uff49"));
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 var1_1) {
        v0 = this;
        this = var1_1;
        v1 = iIiIiIIIII = v0;
        var2_2 = v1.iIIiiIiIiI.field_1687.method_8320(this.method_10074());
        var3_4 = v1.iIIiiIiIiI.field_1687.method_8320((class_2338)this);
        var4_5 = v1.iIIiiIiIiI.field_1687.method_8320(this.method_10084());
        v2 = var2_2;
        var5_6 = v2.method_26204();
        var3_4 = var3_4.method_26204();
        if (!v2.method_26234((class_1922)iIiIiIIIII.iIIiiIiIiI.field_1687, this.method_10074()) || iIiIiiIIIi.ALLATORIxDEMO.contains(var5_6) || !var4_5.method_26215() || var3_4 == class_2246.field_10382 || var3_4 == class_2246.field_10164 || iIiIiIIIII.ALLATORIxDEMO((class_2248)var3_4)) ** GOTO lbl-1000
        if (iIiIiiIIIi.iiiIiIiiIi((class_2338)this, 5 >> 2) && BlockUtils.canPlace((class_2338)this)) {
            v3 = 4 ^ 5;
        } else lbl-1000:
        // 2 sources

        {
            v3 = 0;
        }
        var6_7 = v3;
        var7_8 = var2_2.method_26220((class_1922)iIiIiIIIII.iIIiiIiIiI.field_1687, this.method_10074()).method_1105(class_2350.class_2351.field_11052);
        var2_3 = v4 > 0.8 && var7_8 < 1.0 && BlockUtils.canPlace((class_2338)this) && !iIiIiiIIIi.ALLATORIxDEMO.contains(var5_6) ? --1 : 0;
        if (var6_7 != 0 || var2_3 != 0) {
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iIiIiIIIII iIiIiIIIII2;
        block4: {
            block3: {
                iIiIiIIIII2 = this;
                if (!((Boolean)iIiIiIIIII2.iIiIiIIIII.get()).booleanValue() || iIiIiIIIII2.iIiIIiIIIi.isEmpty()) break block3;
                if (iIiIiIIIII2.ALLATORIxDEMO() != -4 >> 2) break block4;
            }
            return;
        }
        Object object = this = iIiIiIIIII2.iIiIIiIIIi.iterator();
        while (object.hasNext()) {
            void iIiIiIIIII3;
            class_2338 class_23382;
            class_2338 class_23383 = class_23382 = (class_2338)this.next();
            double d = class_23383.method_10263();
            double d2 = class_23383.method_10264();
            double d3 = class_23383.method_10260();
            double d4 = d + 1.0;
            double d5 = d2 + 1.0;
            double d6 = d3 + 1.0;
            iIiIiIIIII3.renderer.box(d, d2, d3, d4, d5, d6, (Color)iIiIiIIIII2.IIiiIIIIIi.get(), (Color)iIiIiIIIII2.IiiIiIiiIi.get(), (ShapeMode)iIiIiIIIII2.IIiIiIIiii.get(), 3 >> 2);
            object = this;
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiIiIIIII iIiIiIIIII4;
        iIiIiIIIII iIiIiIIIII2;
        iIiIiIIIII iIiIiIIIII3 = iIiIiIIIII2 = iIiIiIIIII4;
        iIiIiIIIII3.iIiIIiIIIi.clear();
        for (class_2338 this_ : iiIIiiiIIi.ALLATORIxDEMO(((Double)iIiIiIIIII3.IIIIiiIiii.get()).floatValue())) {
            if (!iIiIiIIIII2.ALLATORIxDEMO(this_) || iIiIiIIIII2.IIiIiiiiII.ALLATORIxDEMO(this_)) continue;
            iIiIiIIIII2.iIiIIiIIIi.add(this_);
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        iIiIiIIIII iIiIiIIIII2 = iIiIiIIIII3;
        iIiIiIIIII iIiIiIIIII3 = class_22482;
        iIiIiIIIII iIiIiIIIII4 = iIiIiIIIII2;
        if (iIiIiIIIII3 instanceof class_2482 || iIiIiIIIII3 instanceof class_2533 || iIiIiIIIII3 instanceof class_2241 || iIiIiIIIII3 instanceof class_2269) {
            return true;
        }
        return false;
    }

    @Override
    public void onActivate() {
        iIiIiIIIII iIiIiIIIII2 = this;
        super.onActivate();
        iIiIiIIIII2.iIiIIiIIIi.clear();
        iIiIiIIIII2.iiiiiIIiIi = 2 & 5;
        iIiIiIIIII2.IIiIiiiiII.iiIIiIIiii();
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        return IiIiiiiIii.iiiIiIiiIi(((AutoSlab.BlockType)((Object)this.ALLATORIxDEMO.get())).ALLATORIxDEMO());
    }

    public void onDeactivate() {
        iIiIiIIIII iIiIiIIIII2 = this;
        iIiIiIIIII2.iIiIIiIIIi.clear();
        iIiIiIIIII2.iiiiiIIiIi = 3 ^ 3;
        iIiIiIIIII2.IIiIiiiiII.iiiIiIiiIi();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        int n;
        iIiIiIIIII iIiIiIIIII6;
        iIiIiIIIII iIiIiIIIII2;
        iIiIiIIIII iIiIiIIIII3 = iIiIiIIIII2 = iIiIiIIIII6;
        if (iIiIiIIIII3.iiiiiIIiIi < (Integer)iIiIiIIIII3.iIiIiiiiII.get()) {
            iIiIiIIIII2.iiiiiIIiIi += --1;
            return;
        }
        iIiIiIIIII iIiIiIIIII4 = iIiIiIIIII2;
        iIiIiIIIII4.iiiiiIIiIi = 3 >> 2;
        iIiIiIIIII4.ALLATORIxDEMO();
        if (iIiIiIIIII4.iIiIIiIIIi.isEmpty()) {
            return;
        }
        int iIiIiIIIII5 = iIiIiIIIII2.ALLATORIxDEMO();
        if (iIiIiIIIII5 == -4 >> 2) {
            return;
        }
        int n2 = Math.min((Integer)iIiIiIIIII2.iIIiIiiiIi.get(), iIiIiIIIII2.iIiIIiIIIi.size());
        int n3 = n = 3 & 4;
        while (n3 < n2) {
            iIiIiIIIII this_ = iIiIiIIIII2.iIiIIiIIIi.get(n);
            if (!iIiIiIIIII2.IIiIiiiiII.ALLATORIxDEMO((class_2338)this_)) {
                IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII5);
                iIiIiIIIII iIiIiIIIII7 = iIiIiIIIII2;
                if (!iIiIiIIIII7.ALLATORIxDEMO(iIiIiIIIII7.iIIiiIiIiI.field_1687.method_8320((class_2338)this_).method_26204())) {
                    boolean bl = 3 >> 1;
                    iIiIiiIIIi.iiIIiIIiii((class_2338)this_, bl, bl, bl);
                    iIiIiIIIII2.IIiIiiiiII.ALLATORIxDEMO((class_2338)this_);
                }
                IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII5);
                IiIiiiiIii.ALLATORIxDEMO();
            }
            n3 = ++n;
        }
    }
}

