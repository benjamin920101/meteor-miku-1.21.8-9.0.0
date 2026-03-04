/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.SlabBlock
 *  net.minecraft.state.property.Properties
 *  net.minecraft.state.property.Property
 *  net.minecraft.block.enums.SlabType
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiIiIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.iiiiiiiiii;
import com.github.mikumiku.addon.modules.RoadBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.SlabBlock;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.MathHelper;

public class iIIiIIIIII
extends iIiIiIIIii {
    public Setting<Integer> iIIIiiiiIi;
    public Setting<class_2248> iiiIiiIIII;
    public Setting<RoadBuilder.SlapType> iIiIIiIIIi;
    public SettingGroup IIiIiiiiII;
    public Setting<Double> IIiiIIIIIi;
    public Setting<SettingColor> iIiiiIiIii;
    private final iiIIiiIIIi iIiIiiiiII;
    public Setting<Integer> IIIIiiIiii;
    public int IiiIiIiiIi;
    public SettingGroup IIiIiIIiii;
    public Setting<ShapeMode> iIIiiIiIiI;
    public Setting<SettingColor> iiiiiIIiIi;
    public List<class_2338> iIIiIiiiIi;
    public int iIiIiIIIII;
    public Setting<Boolean> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        iIIiIIIIII iIIiIIIIII2 = iIIiIIIIII3;
        class_2248 class_22482 = (class_2248)iIIiIIIIII2.iiiIiiIIII.get();
        RoadBuilder.SlapType slapType = (RoadBuilder.SlapType)((Object)iIIiIIIIII2.iIiIIiIIIi.get());
        boolean bl = class_22482 instanceof class_2482;
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = n = 3 >> 2;
        while (n3 < n2) {
            iIIiIIIIII iIIiIIIIII3 = class_2350Array[n];
            if (iIIiIIIIII3 != class_2350.field_11033 && iIIiIIIIII3 != class_2350.field_11036) {
                void iIiIiIIIII2;
                iIIiIIIIII3 = iIiIiIIIII2.method_10093((class_2350)iIIiIIIIII3);
                class_2248 class_22483 = iIIiIIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIiIIIIII3).method_26204();
                if (bl) {
                    if (class_22483 instanceof class_2482) {
                        iIIiIIIIII3 = (class_2771)iIIiIIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIiIIIIII3).method_11654((class_2769)class_2741.field_12485);
                        if (slapType == RoadBuilder.SlapType.iIiIiIIIII && iIIiIIIIII3 == class_2771.field_12679) {
                            return (2 ^ 3) != 0;
                        }
                        if (slapType == RoadBuilder.SlapType.iIIiIiiiIi && (iIIiIIIIII3 == class_2771.field_12681 || iIIiIIIIII3 == class_2771.field_12682)) {
                            return true;
                        }
                    }
                } else if (class_22483 == class_22482) {
                    return (4 ^ 5) != 0;
                }
            }
            n3 = ++n;
        }
        return false;
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIIiIIIIII iIIiIIIIII5;
        iIIiIIIIII iIIiIIIIII2;
        iIIiIIIIII iIIiIIIIII3 = iIIiIIIIII2 = iIIiIIIIII5;
        iIIiIIIIII3.iIIiIiiiIi.clear();
        iIIiIIIIII3.iIiIiIIIII = 3 ^ 3;
        if (iIIiIIIIII3.IiiIiIiiIi < (Integer)iIIiIIIIII2.iIIIiiiiIi.get()) {
            iIIiIIIIII2.IiiIiIiiIi += 5 >> 2;
            return;
        }
        iIIiIIIIII iIIiIIIIII4 = iIIiIIIIII2;
        iIIiIIIIII4.IiiIiIiiIi = 3 ^ 3;
        class_243 iIiIiIIIII2 = iIIiIIIIII4.iIIiiIiIiI.field_1724.method_33571();
        new class_2338((int)Math.round(iIiIiIIIII2.field_1352), (int)Math.round(iIiIiIIIII2.field_1351), (int)Math.round(iIiIiIIIII2.field_1350));
        for (class_2338 this_ : iiIIiiiIIi.ALLATORIxDEMO((Double)iIIiIIIIII4.IIiiIIIIIi.get())) {
            if (iIIiIIIIII2.iiiIiiIIII.get() instanceof class_2482 && iIIiIIIIII2.iIiIIiIIIi.get() == RoadBuilder.SlapType.iIIiIiiiIi) {
                class_2338 class_23382 = this_;
                if (!iIiIiiIIIi.iiiIiIiiIi(class_23382, iIiIiiIIIi.iiIIiIIiii(class_23382, 5 >> 2)) || iIIiIIIIII2.iIIiiIiIiI.field_1687.method_8320(this_).method_26204().method_8389() != class_1802.field_8162 || !iIIiIIIIII2.ALLATORIxDEMO(this_) || this_.method_10264() != iIIiIIIIII2.iIIiiIiIiI.field_1724.method_24515().method_10264()) continue;
                iIIiIIIIII2.ALLATORIxDEMO(this_);
                continue;
            }
            if (!iIiIiiIIIi.iiiIiIiiIi(this_, 5 >> 2) || !iIIiIIIIII2.ALLATORIxDEMO(this_) || this_.method_10264() != iIIiIIIIII2.iIIiiIiIiI.field_1724.method_24515().method_10074().method_10264() || iIIiIIIIII2.iIIiiIiIiI.field_1687.method_8320(this_).method_26204().method_8389() != class_1802.field_8162) continue;
            iIIiIIIIII2.ALLATORIxDEMO(this_);
        }
    }

    public void onDeactivate() {
        this.iIiIiiiiII.iiiIiIiiIi();
    }

    @Override
    public void onActivate() {
        iIIiIIIIII iIIiIIIIII2 = this;
        super.onActivate();
        iIIiIIIIII2.iIiIiiiiII.iiIIiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iIIiIIIIII iIIiIIIIII2 = this;
        if (((Boolean)iIIiIIIIII2.ALLATORIxDEMO.get()).booleanValue() && iIIiIIIIII2.iIIiIiiiIi.size() > 0) {
            class_1792[] class_1792Array = new class_1792[--1];
            class_1792Array[3 ^ 3] = ((class_2248)iIIiIIIIII2.iiiIiiIIII.get()).method_8389();
            if (IiIiiiiIii.ALLATORIxDEMO(class_1792Array).found()) {
                int n = this = 3 & 4;
                while (n < iIIiIIIIII2.iIIiIiiiIi.size()) {
                    void iIiIiIIIII2;
                    double d = iIIiIIIIII2.iIIiIiiiIi.get(this).method_10263();
                    double d2 = iIIiIIIIII2.iIIiIiiiIi.get(this).method_10264();
                    double d3 = iIIiIIIIII2.iIIiIiiiIi.get(this).method_10260();
                    double d4 = iIIiIIIIII2.iIIiIiiiIi.get(this).method_10263() + --1;
                    double d5 = iIIiIIIIII2.iIIiIiiiIi.get(this).method_10264() + (3 >> 1);
                    double d6 = iIIiIIIIII2.iIIiIiiiIi.get(this).method_10260() + (3 >> 1);
                    int n2 = 4 ^ 5;
                    iIiIiIIIII2.renderer.box(d, d2, d3, d4, d5, d6, (Color)iIIiIIIIII2.iIiiiIiIii.get(), (Color)iIIiIIIIII2.iiiiiIIiIi.get(), (ShapeMode)iIIiIIIIII2.iIIiiIiIiI.get(), 5 >> 3);
                    n = ++this;
                }
            }
        }
    }

    public iIIiIIIIII() {
        iIIiIIIIII iIIiIIIIII2 = this;
        super(iIiIiIiIii.ALLATORIxDEMO("\u8125\u4e54\u5fd3\u905d\u6408\u5e7b\u539f"), iiiiiiiiii.ALLATORIxDEMO("\u81bd\u52ef\u5e8d\u9047\u5e04\u5397\u6241\u815d\u4e7c\u644a\u8d98\uff6b\u9777\u89e6\u623c\u52cf\u6549\u7b4b\u4e77\u5730"));
        iIIiIIIIII2.IIiIiiiiII = iIIiIIIIII2.settings.getDefaultGroup();
        iIIiIIIIII2.IIiIiIIiii = iIIiIIIIII2.settings.createGroup(iIiIiIiIii.ALLATORIxDEMO("\u6e3a\u67bc"));
        iIIiIIIIII2.IIiiIIIIIi = iIIiIIIIII2.IIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u5e8d\u9047\u8374\u5693"))).description(iIiIiIiIii.ALLATORIxDEMO("\u81d2\u52f0\u5ec5\u907f\u76bc\u6742\u5902\u830b\u569b"))).defaultValue(4.0).range(0.0, 6.0).build());
        this.iiiIiiIIII = this.IIiIiiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u65ce\u5730"))).description(iIiIiIiIii.ALLATORIxDEMO("\u9031\u62b1\u7517\u4ed1\u5ec2\u9062\u76a1\u65b1\u5738"))).defaultValue((Object)class_2246.field_10445)).build());
        this.iIiIIiIIIi = this.IIiIiiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u532d\u7861\u65de\u5466O\u59f5\u67fb\u677eN"))).description(iIiIiIiIii.ALLATORIxDEMO("\u5308\u7833\u65b1\u547e"))).defaultValue((Object)RoadBuilder.SlapType.iIiIiIIIII)).visible(() -> this.iiiIiiIIII.get() instanceof class_2482)).build());
        this.IIIIiiIiii = this.IIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u6bb8\u6b46\u6549\u7f09\u6507\u91a8"))).description(iIiIiIiIii.ALLATORIxDEMO("\u6bc5\u4e47\u6e67\u6237\u5263\u6501\u7f31\u76bc\u65fb\u5772\u6578\u91a0"))).defaultValue((Object)(1 ^ 3))).sliderRange(--1, 0x4E & 0x37).build());
        this.iIIIiiiiIi = this.IIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u6549\u7f09\u5e81\u8fb8"))).description(iIiIiIiIii.ALLATORIxDEMO("\u6541\u7f76\u65c6\u574f\u4e34\u95ec\u76fb\u5eee\u8fd5\u659b\u95ab\uff30\u530d\u4f72\uff45L+Fc\uff66"))).defaultValue((Object)(3 >> 2))).sliderRange(2 & 5, 0x74 & 0x1F).build());
        this.ALLATORIxDEMO = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u6649\u795d\u6e45\u67b4"))).description(iIiIiIiIii.ALLATORIxDEMO("\u6650\u543e\u6634\u7957\u5fda\u6506\u7f36\u6586\u5708\u76bc\u6e70\u67f6\u988c\u89a7"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIiiIiIiI = this.IIiIiIIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u6e45\u67b4\u6a56\u5f68"))).description(iIiIiIiIii.ALLATORIxDEMO("\u9031\u62b1\u6e0d\u678c\u76bc\u667c\u791f\u6a29\u5f60"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIiiiIiIii = this.IIiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u4fd0\u9705\u98eb\u8215"))).description(iIiIiIiIii.ALLATORIxDEMO("\u5ffa\u6526\u7f64\u65d4\u5708\u6e0a\u678b\u76bb\u4ff8\u975a\u5829\u5160\u9894\u821d"))).defaultValue(new SettingColor(0xFC7 & 0x70BF, 0xCCE & 0x73FF, 0xFFF & 0x70EB, 0x7E & 0x1F)).build());
        this.iiiiiIIiIi = this.IIiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiiiiiiii.ALLATORIxDEMO("\u7ec8\u6706\u98eb\u8215"))).description(iIiIiIiIii.ALLATORIxDEMO("\u5ffa\u6526\u7f64\u65d4\u5708\u6e0a\u678b\u76bb\u8fe6\u687e\u7efd\u6744\u9894\u821d"))).defaultValue(new SettingColor(0x6C & 0x77, 0x2DBF & 0x52D5, 0x1FED & 0x60FF, 0x76 & 0x59)).build());
        iIIiIIIIII iIIiIIIIII3 = this;
        iIIiIIIIII iIIiIIIIII4 = this;
        iIIiIIIIII4.iIIiIiiiIi = new ArrayList<class_2338>();
        iIIiIIIIII3.IiiIiIiiIi = 3 ^ 3;
        iIIiIIIIII3.iIiIiIIIII = 3 & 4;
        iIIiIIIIII iIIiIIIIII5 = this;
        iIIiIIIIII3.iIiIiiiiII = new iiIIiiIIIi(1000L);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiiiiiiii.ALLATORIxDEMO("\u0000,ua$\"W\u0012\u0007\u000363\u0012FW\u8b90\u6683\u65d7\u5247\u6767\u65c7\u722f\u675b\uff66"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        iIIiIIIIII iIIiIIIIII3;
        iIIiIIIIII this_ = class_23382;
        iIIiIIIIII iIiIiIIIII2 = iIIiIIIIII3;
        if (this_ == null) {
            return;
        }
        if (iIiIiIIIII2.iIIiIiiiIi.contains(this_)) {
            return;
        }
        iIIiIIIIII iIIiIIIIII2 = iIiIiIIIII2;
        if (iIIiIIIIII2.iIiIiIIIII >= (Integer)iIIiIIIIII2.IIIIiiIiii.get()) {
            return;
        }
        if (iIiIiIIIII2.iIiIiiiiII.ALLATORIxDEMO((class_2338)this_)) {
            return;
        }
        if ((double)class_3532.method_15355((float)((float)iIiIiiIIIi.ALLATORIxDEMO().method_1025(this_.method_46558()))) > (Double)iIiIiIIIII2.IIiiIIIIIi.get()) {
            return;
        }
        int n2 = IiIiiiiIii.IIIIiIIiII(((class_2248)iIiIiIIIII2.iiiIiiIIII.get()).method_8389());
        if (n2 == -4 >> 2) {
            return;
        }
        iIIiIIIIII iIIiIIIIII4 = iIiIiIIIII2;
        iIIiIIIIII4.iIIiIiiiIi.add((class_2338)this_);
        IiIiiiiIii.ALLATORIxDEMO(n2);
        int cfr_ignored_0 = 3 ^ 3;
        if (iIIiIIIIII4.iiiIiiIIII.get() instanceof class_2482) {
            if (iIiIiIIIII2.iIiIIiIIIi.get() == RoadBuilder.SlapType.iIiIiIIIII) {
                boolean bl = 5 >> 2;
                iIiIiiIIIi.iiiIiIiiIi((class_2338)this_, bl, bl, bl);
                n = n2;
            } else {
                boolean bl = 5 >> 2;
                iIiIiiIIIi.ALLATORIxDEMO((class_2338)this_, bl, bl, bl);
                n = n2;
            }
        } else {
            iIiIiiIIIi.iiIIiIIiii((class_2338)this_);
            n = n2;
        }
        IiIiiiiIii.ALLATORIxDEMO(n);
        IiIiiiiIii.ALLATORIxDEMO();
        iIIiIIIIII iIIiIIIIII5 = iIiIiIIIII2;
        iIIiIIIIII5.iIiIiIIIII += 3 & 5;
        iIIiIIIIII5.iIiIiiiiII.ALLATORIxDEMO((class_2338)this_);
    }
}

