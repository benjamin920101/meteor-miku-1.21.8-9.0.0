/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.state.property.Properties
 *  net.minecraft.state.property.Property
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIiIiII;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiIIiiIiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiIiiIii;
import com.github.mikumiku.addon.modules.AnchorAuraPlus;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;

public class IiiIiIiiii
extends iIiIiIIIii {
    private long IiIiIiIIii;
    private class_2338 iiiIiIiiII;
    private class_2338 IIiiiiIIii;
    private final Map<class_2338, IiiIIiiIiI> IiiiiIIiII;
    private double iIIIIIiiII;
    private final Setting<AnchorAuraPlus.SwitchMode> iIIiiiiIii;
    private class_2338[] iiIIIiIIIi;
    private final Setting<Double> iIiiiiIIII;
    private int iiIiIIiiii;
    private class_2338 iIIiIiiIiI;
    private final Setting<Double> iIIIIIIiII;
    private List<class_1657> iIIiiIIIIi;
    public final Setting<SettingColor> IiiiiIiIiI;
    private final Setting<Double> iiiIiIIiii;
    private final SettingGroup iIIIiiiiIi;
    private final SettingGroup iiiIiiIIII;
    private long iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private int IIiiIIIIIi;
    private final Setting<Double> iIiiiIiIii;
    private final Setting<Boolean> iIiIiiiiII;
    private final SettingGroup IIIIiiIiii;
    private final Setting<SettingColor> IiiIiIiiIi;
    public final Setting<ShapeMode> IIiIiIIiii;
    private final Setting<AnchorAuraPlus.LogicMode> iIIiiIiIiI;
    private class_2338 iiiiiIIiIi;
    public double iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private final Setting<Double> ALLATORIxDEMO;

    public IiiIiIiiii() {
        IiiIiIiiii iiiIiIiiii2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, IiIiiIIIiI.ALLATORIxDEMO("\u9567\u7224\u5134\u738dV"), IiIiIiIiII.iiiIiIiiIi("\u4f46\u755f\u91d4\u7548\u9523\u819d\u5291\u6dff\u7054\u653b\u4e83\u3075"));
        iiiIiIiiii2.iIIIiiiiIi = iiiIiIiiii2.settings.getDefaultGroup();
        iiiIiIiiii2.IIIIiiIiii = iiiIiIiiii2.settings.createGroup(IiIiiIIIiI.ALLATORIxDEMO("\u4f06\u5bce"));
        iiiIiIiiii2.iiiIiiIIII = iiiIiIiiii2.settings.createGroup(IiIiIiIiII.iiiIiIiiIi("\u6e0b\u67a4"));
        iiiIiIiiii2.iIiIiiiiII = iiiIiIiiii2.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u8ff9\u98a2\u66a0\u5021"))).description(IiIiIiIiII.iiiIiIiiIi("\u8fe2\u98a8\u65cf\u66f5\u5065\u52e8\u80c4\u3075"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIiiiiIii = this.iIIIiiiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u5225\u631f\u6a03\u5f72"))).description(IiIiIiIiII.iiiIiIiiIi("\u5233\u6318\u7256\u54b0\u76ba\u65c9\u6cab\u3032\u9740\u9e8f\u6a18\u5f78\u6739\u5398\u9779\uff5b\u4f7f\u5e01\u9747\u577f\u6279\u677e\u5709\u65ce\u90c4\u677e\u6571\u3075"))).defaultValue((Object)AnchorAuraPlus.SwitchMode.iIiIiIIIII)).build());
        this.iIIiiIiIiI = this.iIIIiiiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u9019\u8fec\u6a03\u5f72"))).description(IiIiIiIiII.iiiIiIiiIi("\u6b6d\u8d26\u5c78\u6732\u53bc\u76bd\u904c\u8fa8\u3075"))).defaultValue((Object)AnchorAuraPlus.LogicMode.ALLATORIxDEMO)).build());
        this.iiiIiIIiii = this.iIIIiiiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u903d\u5edb"))).description(IiIiIiIiII.iiiIiIiiIi("\u6b98\u79eb\u5ee3\u8bfc\u5f42\u723f\u596d\u5c28\u4e5d\u91f4\u7568\u9523\u3075"))).defaultValue(2.0).min(0.0).sliderRange(0.0, 20.0).build());
        this.iIiiiIiIii = this.iIIIiiiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u8321\u5689"))).description(IiIiIiIiII.iiiIiIiiIi("\u81bd\u5291\u5e8d\u9019\u76f3\u6739\u5950\u833a\u5683"))).defaultValue(4.0).range(0.0, 6.0).build());
        this.iIiiiiIIII = this.IIIIiiIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6722\u5c72\u4f06\u5bce"))).description(IiIiIiIiII.iiiIiIiiIi("\u6527\u7f39\u6279\u9777\u76bd\u6777\u4f77\u4f53\u5b8a\u3075"))).defaultValue(8.0).min(0.0).sliderRange(0.0, 20.0).build());
        this.ALLATORIxDEMO = this.IIIIiiIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6722\u595a\u81c8\u4f59"))).description(IiIiIiIiII.iiiIiIiiIi("\u5bae\u81d3\u8edc\u76bd\u6777\u591e\u4f53\u5b8a\u3075"))).defaultValue(6.0).min(0.0).sliderRange(0.0, 20.0).build());
        this.iIIIIIIiII = this.IIIIiiIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6722\u5c72\u4f06\u5bce\u6bf6\u4ff6"))).description(IiIiIiIiII.iiiIiIiiIi("\u6555\u6246\u4f1d\u5bc4\u6bed\u4ffc\uff11\u651b\u4e83\u4f53\u5baaw\u0016W\u81d3\u8edc\u4f1d\u5bc4\uff30\u3075"))).defaultValue(2.0).min(0.0).sliderRange(0.0, 10.0).build());
        this.iIiIiIIIII = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u651c\u7f13\u6464\u52d5"))).description(IiIiIiIiII.iiiIiIiiIi("\u6507\u7f19\u65a0\u5700\u65cf\u6e45\u67ea\u6431\u5291\u52df\u7502\u3075"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IIiIiiiiII = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u4e86\u4eef\u6464\u52d5"))).description(IiIiIiIiII.iiiIiIiiIi("\u4e59\u6580\u5720\u4ebd\u4ec5\u65cf\u6e45\u67ea\u6431\u5291\u52df\u7502\u3075"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IIiIiIIiii = this.iiiIiiIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u5f40\u72cb\u6a03\u5f72"))).description(IiIiIiIiII.iiiIiIiiIi("\u5ec3\u8bdc\u6e45\u67ea\u549d\u4ea2\u909f\u523f\u3075"))).defaultValue((Object)ShapeMode.Both)).build());
        int n = 0x9FF & 0x76FF;
        this.IiiIiIiiIi = this.iiiIiiIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u7e9d\u671c\u98be\u820f"))).description(IiIiIiIiII.iiiIiIiiIi("\u6e65\u67ea\u51f2\u5b80\u76f3\u7e86\u6716\u98a5\u8205"))).defaultValue(new SettingColor(n, 3 ^ 3, 3 & 4, n)).build());
        this.IiiiiIiIiI = this.iiiIiiIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u4f85\u971f\u98be\u820f"))).description(IiIiIiIiII.iiiIiIiiIi("\u6e65\u67ea\u51f2\u5b80\u76f3\u4f9e\u9715\u98a5\u8205"))).defaultValue(new SettingColor(Short.MAX_VALUE & 0xFF, 5 >> 3, 3 >> 2, 0x77 & 0x3A)).build());
        this.iiIIIiIIIi = new class_2338[3 ^ 3];
        IiiIiIiiii iiiIiIiiii3 = this;
        IiiIiIiiii iiiIiIiiii4 = this;
        IiiIiIiiii iiiIiIiiii5 = this;
        IiiIiIiiii iiiIiIiiii6 = this;
        IiiIiIiiii iiiIiIiiii7 = this;
        this.IIiiIIIIIi = 5 >> 3;
        iiiIiIiiii7.iiIiIIiiii = this.IIiiIIIIIi;
        iiiIiIiiii7.IiIiIiIIii = -1L;
        iiiIiIiiii6.iIIIIIiiII = -1.0;
        iiiIiIiiii6.iIiIIiIIIi = 0L;
        iiiIiIiiii5.IIiiiiIIii = null;
        iiiIiIiiii5.iiiiiIIiIi = null;
        iiiIiIiiii4.iIIiIiiIiI = null;
        iiiIiIiiii4.iiiIiIiiII = null;
        IiiIiIiiii iiiIiIiiii8 = this;
        iiiIiIiiii4.iIIiiIIIIi = new ArrayList<class_1657>();
        IiiIiIiiii iiiIiIiiii9 = this;
        iiiIiIiiii3.IiiiiIIiII = new HashMap<class_2338, IiiIIiiIiI>();
        iiiIiIiiii3.iIIiIiiiIi = 0.0;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiIIIiI.ALLATORIxDEMO("u\u0016\u0000[q8\u0002\bR\u0019c)G\\\"\u8baa\u66d6\u65cd\u5212\u677d\u6592\u7235\u670e\uff7c"));
        }
    }

    private /* synthetic */ boolean IIIIiIIiII(class_2338 class_23382) {
        IiiIiIiiii iiiIiIiiii2 = iiiIiIiiii3;
        IiiIiIiiii iiiIiIiiii3 = class_23382;
        IiiIiIiiii iIiIiIIIII2 = iiiIiIiiii2;
        if (PlayerUtils.distanceTo((class_2338)iiiIiIiiii3) <= (Double)iIiIiIIIII2.iIiiiIiIii.get()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2338[] ALLATORIxDEMO(class_243 class_2432, double d) {
        int n;
        void iIiIiIIIII22;
        IiiIiIiiii iiiIiIiiii2 = this;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        int iIiIiIIIII22 = (int)Math.ceil((double)iIiIiIIIII22);
        int n2 = n = -iIiIiIIIII22;
        while (n2 <= iIiIiIIIII22) {
            int n3 = -iIiIiIIIII22;
            while (n3 <= iIiIiIIIII22) {
                int n4;
                int n5 = -iIiIiIIIII22;
                while (n5 <= iIiIiIIIII22) {
                    void iIiIiIIIII3;
                    class_2338 class_23382 = new class_2338((int)(Math.floor(iIiIiIIIII3.field_1352) + (double)n), (int)(Math.floor(iIiIiIIIII3.field_1351) + (double)n4), (int)(Math.floor(iIiIiIIIII3.field_1350) + (double)this));
                    if ((iIiIiiIIIi.IIiIiIiIiI(class_23382) || iiiIiIiiii2.iIIiiIiIiI.field_1687.method_8320(class_23382).method_26204() == class_2246.field_23152) && iiiIiIiiii2.iiIIiIIiii(class_23382) && iiiIiIiiii2.IIIIiIIiII(class_23382)) {
                        arrayList.add(class_23382);
                    }
                    n5 = ++this;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return arrayList.toArray(new class_2338[3 ^ 3]);
    }

    private /* synthetic */ void ALLATORIxDEMO(class_1268 class_12682) {
        IiiIiIiiii iIiIiIIIII2;
        IiiIiIiiii iiiIiIiiii2 = iiiIiIiiii3;
        IiiIiIiiii iiiIiIiiii3 = class_12682;
        IiiIiIiiii iiiIiIiiii4 = iIiIiIIIII2 = iiiIiIiiii2;
        iIiIiiIIIi.iiIIiIIiii(iiiIiIiiii4.iiiiiIIiIi);
        if (((Boolean)iiiIiIiiii4.iIiIiIIIII.get()).booleanValue()) {
            iIiIiiIIIi.ALLATORIxDEMO((class_1268)iiiIiIiiii3, BaritoneUtil.SwingSide.iIIiiIiIiI);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2350 class_23502, class_1268 class_12682) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IiiIiIiiii iiiIiIiiii2 = iiiIiIiiii3;
        IiiIiIiiii iiiIiIiiii3 = class_12682;
        IiiIiIiiii iIiIiIIIII4 = iiiIiIiiii2;
        iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiIiIIIII3, (class_2350)iIiIiIIIII2, (3 & 5) != 0, (class_1268)iiiIiIiiii3, BaritoneUtil.SwingSide.iIIiIiiiIi);
    }

    private /* synthetic */ IiiIIiiIiI ALLATORIxDEMO(class_2338 class_23382) {
        IiiIiIiiii iiiIiIiiii2;
        AnchorAuraPlus.AnchorState anchorState;
        IiiIiIiiii iiiIiIiiii3 = iiiIiIiiii4;
        IiiIiIiiii iiiIiIiiii4 = class_23382;
        IiiIiIiiii iIiIiIIIII2 = iiiIiIiiii3;
        if (iIiIiIIIII2.IiiiiIIiII.containsKey(iiiIiIiiii4)) {
            return iIiIiIIIII2.IiiiiIIiII.get(iiiIiIiiii4);
        }
        if ((iiiIiIiiii4 = iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiIiIiiii4)).method_26204() == class_2246.field_23152) {
            if ((Integer)iiiIiIiiii4.method_11654((class_2769)class_2741.field_23187) < (3 & 5)) {
                anchorState = AnchorAuraPlus.AnchorState.ALLATORIxDEMO;
                iiiIiIiiii2 = iiiIiIiiii4;
            } else {
                anchorState = AnchorAuraPlus.AnchorState.iiiiiIIiIi;
                iiiIiIiiii2 = iiiIiIiiii4;
            }
        } else {
            anchorState = AnchorAuraPlus.AnchorState.iIIiIiiiIi;
            iiiIiIiiii2 = iiiIiIiiii4;
        }
        return new IiiIIiiIiI(anchorState, iiiIiIiiii2.method_26204() == class_2246.field_23152 ? (Integer)iiiIiIiiii4.method_11654((class_2769)class_2741.field_23187) : 0, System.currentTimeMillis());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiIIiIIiii(class_2338 class_23382) {
        IiiIiIiiii iiiIiIiiii2 = iterator;
        Iterator<class_1657> iterator = iiiIiIiiii2.iIIiiIIIIi.iterator();
        while (iterator.hasNext()) {
            void iIiIiIIIII2;
            if (!(((class_1657)iterator.next()).method_19538().method_1031(0.0, 1.0, 0.0).method_1022(class_243.method_24953((class_2382)iIiIiIIIII2)) < 3.5)) continue;
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(double iIiIiIIIII2, double iIiIiIIIII3) {
        if (iIiIiIIIII2 < this.iIIIIIiiII) {
            return (3 ^ 3) != 0;
        }
        if (iIiIiIIIII2 < (Double)this.iIiiiiIIII.get()) {
            return 5 >> 3;
        }
        if (iIiIiIIIII3 > (Double)this.ALLATORIxDEMO.get()) {
            return (2 & 5) != 0;
        }
        if (iIiIiIIIII2 / iIiIiIIIII3 >= (Double)this.iIIIIIIiII.get()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void iiiIiIiiIi() {
        IiiIiIiiii iiiIiIiiii2 = iiiIIiiIiI;
        if (iiiIiIiiii2.IIiiiiIIii == null || iiiIiIiiii2.iiiiiIIiIi == null) {
            return;
        }
        IiiIiIiiii iiiIiIiiii3 = iiiIiIiiii2;
        IiiIIiiIiI iiiIIiiIiI = iiiIiIiiii3.ALLATORIxDEMO(iiiIiIiiii3.IIiiiiIIii);
        if (iiiIiIiiii3.iIIiiIiIiI.get() == AnchorAuraPlus.LogicMode.iIIiIiiiIi) {
            switch (iiiIIiiIiI.ALLATORIxDEMO.ordinal()) {
                case 1: {
                    IiiIiIiiii iiiIiIiiii4 = iiiIiIiiii2;
                    if (!iiiIiIiiii4.iiiIiIiiIi(iiiIiIiiii4.IIiiiiIIii)) return;
                    IiiIIiiIiI iiiIIiiIiI2 = new IiiIIiiIiI(AnchorAuraPlus.AnchorState.iiiiiIIiIi, iiiIIiiIiI.iIiIiIIIII + (3 & 5), System.currentTimeMillis());
                    IiiIiIiiii iiiIiIiiii5 = iiiIiIiiii2;
                    iiiIiIiiii5.IiiiiIIiII.remove(iiiIiIiiii5.IIiiiiIIii);
                    IiiIiIiiii iiiIiIiiii6 = iiiIiIiiii2;
                    iiiIiIiiii6.IiiiiIIiII.put(iiiIiIiiii6.IIiiiiIIii, iiiIIiiIiI2);
                    return;
                }
                case 2: {
                    IiiIiIiiii iiiIiIiiii7 = iiiIiIiiii2;
                    if (!iiiIiIiiii7.ALLATORIxDEMO(iiiIiIiiii7.IIiiiiIIii)) return;
                    IiiIiIiiii iiiIiIiiii8 = iiiIiIiiii2;
                    iiiIiIiiii8.IiiiiIIiII.remove(iiiIiIiiii8.IIiiiiIIii);
                    IiiIiIiiii iiiIiIiiii9 = iiiIiIiiii2;
                    iiiIiIiiii9.IiiiiIIiII.put(iiiIiIiiii9.IIiiiiIIii, new IiiIIiiIiI(AnchorAuraPlus.AnchorState.iIIiIiiiIi, 3 ^ 3, System.currentTimeMillis()));
                    return;
                }
                case 0: {
                    if (iiiIiIiiii2.iIIiIiiiIi <= 1.0 / (Double)iiiIiIiiii2.iiiIiIIiii.get()) {
                        return;
                    }
                    if (!iiiIiIiiii2.iiiIiIiiIi()) return;
                    IiiIiIiiii iiiIiIiiii10 = iiiIiIiiii2;
                    iiiIiIiiii10.IiiiiIIiII.remove(iiiIiIiiii10.IIiiiiIIii);
                    IiiIiIiiii iiiIiIiiii11 = iiiIiIiiii2;
                    iiiIiIiiii11.IiiiiIIiII.put(iiiIiIiiii11.IIiiiiIIii, new IiiIIiiIiI(AnchorAuraPlus.AnchorState.ALLATORIxDEMO, 3 ^ 3, System.currentTimeMillis()));
                    iiiIiIiiii2.iIIiIiiiIi = 0.0;
                }
                default: {
                    return;
                }
            }
        }
        switch (iiiIIiiIiI.ALLATORIxDEMO.ordinal()) {
            case 0: {
                if (!iiiIiIiiii2.iiiIiIiiIi()) return;
                IiiIiIiiii iiiIiIiiii12 = iiiIiIiiii2;
                iiiIiIiiii12.IiiiiIIiII.remove(iiiIiIiiii12.IIiiiiIIii);
                IiiIiIiiii iiiIiIiiii13 = iiiIiIiiii2;
                iiiIiIiiii13.IiiiiIIiII.put(iiiIiIiiii13.IIiiiiIIii, new IiiIIiiIiI(AnchorAuraPlus.AnchorState.ALLATORIxDEMO, 3 >> 2, System.currentTimeMillis()));
                return;
            }
            case 1: {
                IiiIiIiiii iiiIiIiiii14 = iiiIiIiiii2;
                if (!iiiIiIiiii14.iiiIiIiiIi(iiiIiIiiii14.IIiiiiIIii)) return;
                IiiIIiiIiI iiiIIiiIiI3 = new IiiIIiiIiI(AnchorAuraPlus.AnchorState.iiiiiIIiIi, iiiIIiiIiI.iIiIiIIIII + (3 >> 1), System.currentTimeMillis());
                IiiIiIiiii iiiIiIiiii15 = iiiIiIiiii2;
                iiiIiIiiii15.IiiiiIIiII.remove(iiiIiIiiii15.IIiiiiIIii);
                IiiIiIiiii iiiIiIiiii16 = iiiIiIiiii2;
                iiiIiIiiii16.IiiiiIIiII.put(iiiIiIiiii16.IIiiiiIIii, iiiIIiiIiI3);
                return;
            }
            case 2: {
                if (iiiIiIiiii2.iIIiIiiiIi <= 1.0 / (Double)iiiIiIiiii2.iiiIiIIiii.get()) {
                    return;
                }
                IiiIiIiiii iiiIiIiiii17 = iiiIiIiiii2;
                if (!iiiIiIiiii17.ALLATORIxDEMO(iiiIiIiiii17.IIiiiiIIii)) return;
                IiiIiIiiii iiiIiIiiii18 = iiiIiIiiii2;
                iiiIiIiiii18.IiiiiIIiII.remove(iiiIiIiiii18.IIiiiiIIii);
                IiiIiIiiii iiiIiIiiii19 = iiiIiIiiii2;
                iiiIiIiiii19.IiiiiIIiII.put(iiiIiIiiii19.IIiiiiIIii, new IiiIIiiIiI(AnchorAuraPlus.AnchorState.iIIiIiiiIi, 3 ^ 3, System.currentTimeMillis()));
                iiiIiIiiii2.iIIiIiiiIi = 0.0;
                return;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean iiiIiIiiIi() {
        var2_2 = this;
        var1_3 = class_1268.field_5808;
        this = var1_3 != null ? --1 : 0;
        if (this != 0) ** GOTO lbl-1000
        switch (((AnchorAuraPlus.SwitchMode)var2_2.iIIiiiiIii.get()).ordinal()) {
            case 0: 
            case 1: {
                while (false) {
                }
                v0 = new class_1792[1];
                v0[5 >> 3] = class_1802.field_23141;
                var3_4 = InvUtils.findInHotbar((class_1792[])v0);
                v1 = this = (int)var3_4.found();
                break;
            }
            case 2: 
            case 3: {
                v2 = new class_1792[1];
                v2[3 >> 2] = class_1802.field_23141;
                var3_4 = InvUtils.find((class_1792[])v2);
                this = (int)var3_4.found();
            }
            default: lbl-1000:
            // 2 sources

            {
                v1 = this;
            }
        }
        if (v1 == 0) {
            return 5 >> 3;
        }
        if (var1_3 != null) ** GOTO lbl-1000
        switch (((AnchorAuraPlus.SwitchMode)var2_2.iIIiiiiIii.get()).ordinal()) lbl-1000:
        // 2 sources

        {
            case 0: 
            case 1: {
                if (false) ** GOTO lbl-1000
                v3 = new class_1792[1];
                v3[3 & 4] = class_1802.field_23141;
                var3_4 = InvUtils.findInHotbar((class_1792[])v3);
                v4 = this;
                InvUtils.swap((int)var3_4.slot(), (boolean)(3 & 5));
                break;
            }
            case 2: {
                v5 = new class_1792[1];
                v5[3 ^ 3] = class_1802.field_23141;
                var3_4 = InvUtils.find((class_1792[])v5);
                IiIiiiiIii.ALLATORIxDEMO(var3_4.slot());
                v4 = this = 2 ^ 3;
                break;
            }
            case 3: {
                v6 = new class_1792[1];
                v6[3 ^ 3] = class_1802.field_23141;
                var3_4 = InvUtils.find((class_1792[])v6);
                this = 2 ^ 3;
                IiIiiiiIii.ALLATORIxDEMO(var3_4.slot());
            }
            default: lbl-1000:
            // 2 sources

            {
                v4 = this;
            }
        }
        if (v4 == 0) {
            return (boolean)(3 & 4);
        }
        var2_2.ALLATORIxDEMO(var1_3 == null ? class_1268.field_5808 : var1_3);
        if (var1_3 == null) {
            switch (((AnchorAuraPlus.SwitchMode)var2_2.iIIiiiiIii.get()).ordinal()) {
                case 0: {
                    IiIiiiiIii.ALLATORIxDEMO();
                    while (false) {
                    }
                    break;
                }
                case 2: {
                    IiIiiiiIii.ALLATORIxDEMO();
                    break;
                }
                case 3: {
                    IiIiiiiIii.ALLATORIxDEMO();
                }
            }
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ double ALLATORIxDEMO(class_2338 class_23382) {
        IiiIiIiiii iiiIiIiiii2 = this;
        double d = -1.0;
        Object object = this = iiiIiIiiii2.iIIiiIIIIi.iterator();
        while (object.hasNext()) {
            void iIiIiIIIII2;
            class_1657 class_16572;
            class_1657 class_16573 = class_16572 = (class_1657)this.next();
            d = Math.max(d, iIiiIiiIii.iiiIiIiiIi((class_1309)class_16573, class_16573.method_5829(), iIiIiIIIII2.method_46558(), (class_2338)iIiIiIIIII2, 3 >> 1));
            object = this;
        }
        return d;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (!((Boolean)this.iIiIiiiiII.get()).booleanValue() || !this.iIIiiIiIiI.field_1724.method_6115()) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean iiiIiIiiIi(class_2338 var1_2) {
        var2_3 = this;
        this = 2 & 5;
        if (this != 0) ** GOTO lbl-1000
        switch (((AnchorAuraPlus.SwitchMode)var2_3.iIIiiiiIii.get()).ordinal()) {
            case 0: 
            case 1: {
                while (false) {
                }
                v0 = new class_1792[1];
                v0[3 & 4] = class_1802.field_8801;
                var3_4 = InvUtils.findInHotbar((class_1792[])v0);
                v1 = this = (int)var3_4.found();
                break;
            }
            case 2: 
            case 3: {
                v2 = new class_1792[1];
                v2[3 ^ 3] = class_1802.field_8801;
                var3_4 = InvUtils.find((class_1792[])v2);
                this = (int)var3_4.found();
            }
            default: lbl-1000:
            // 2 sources

            {
                v1 = this;
            }
        }
        if (v1 == 0) {
            return (boolean)(3 & 4);
        }
        v3 = new class_1792[1];
        v3[5 >> 3] = class_1802.field_8801;
        var3_4 = InvUtils.findInHotbar((class_1792[])v3);
        IiIiiiiIii.ALLATORIxDEMO(var3_4.slot());
        if (this == 0) {
            return (boolean)(2 & 5);
        }
        iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiIiIIIII, class_2350.field_11036, 5 >> 2, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiiIiIiI);
        IiIiiiiIii.ALLATORIxDEMO();
        return (boolean)(2 ^ 3);
    }

    @EventHandler(priority=200)
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiiIiIiiii iIiIiIIIII2;
        IiiIiIiiii iiiIiIiiii2 = iiiIiIiiii3;
        IiiIiIiiii iiiIiIiiii3 = post;
        IiiIiIiiii iiiIiIiiii4 = iIiIiIIIII2 = iiiIiIiiii2;
        iiiIiIiiii4.ALLATORIxDEMO(iiiIiIiiii4.iiIiIIiiii - (3 >> 1));
        iiiIiIiiii4.iiiIiIiiII = iiiIiIiiii4.iIIiIiiIiI;
        iiiIiIiiii4.IIiiiiIIii = iiiIiIiiii4.iIIiIiiIiI;
        iiiIiIiiii4.iiIIIiIIIi = iiiIiIiiii4.ALLATORIxDEMO(iiiIiIiiii4.iIIiiIiIiI.field_1724.method_33571(), (double)((Double)iIiIiIIIII2.iIiiiIiIii.get()));
        iIiIiIIIII2.IiIiIiIIii = System.currentTimeMillis();
        iIiIiIIIII2.iiIiIIiiii = iIiIiIIIII2.iiIIIiIIIi.length;
        iIiIiIIIII2.IIiiIIIIIi = 3 & 4;
        iIiIiIIIII2.iIIIIIiiII = -1.0;
        iIiIiIIIII2.iIIiIiiIiI = null;
        iIiIiIIIII2.ALLATORIxDEMO();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        boolean bl;
        FindItemResult findItemResult;
        void iIiIiIIIII3;
        IiiIiIiiii iiiIiIiiii2 = this;
        Object var5_4 = null;
        class_2350 class_23502 = iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiIiIIIII3);
        if (class_23502 == null) {
            return 5 >> 3;
        }
        boolean bl2 = false;
        switch (((AnchorAuraPlus.SwitchMode)((Object)iiiIiIiiii2.iIIiiiiIii.get())).ordinal()) {
            case 0: 
            case 1: {
                findItemResult = InvUtils.findInHotbar(iIiIiIIIII2 -> {
                    if (iIiIiIIIII2.method_7909() != class_1802.field_8801) {
                        return 5 >> 2;
                    }
                    return false;
                });
                bl = bl2 = findItemResult.found();
                break;
            }
            case 2: 
            case 3: {
                findItemResult = InvUtils.find(iIiIiIIIII2 -> {
                    if (iIiIiIIIII2.method_7909() != class_1802.field_8801) {
                        return 5 >> 2;
                    }
                    return false;
                });
                bl2 = findItemResult.found();
            }
            default: {
                bl = bl2;
            }
        }
        if (!bl) {
            return 5 >> 3;
        }
        findItemResult = InvUtils.findInHotbar(iIiIiIIIII2 -> {
            if (iIiIiIIIII2.method_7909() != class_1802.field_8801) {
                return (4 ^ 5) != 0;
            }
            return false;
        });
        IiIiiiiIii.ALLATORIxDEMO(findItemResult.slot());
        if (!bl2) {
            return (3 & 4) != 0;
        }
        iiiIiIiiii2.ALLATORIxDEMO((class_2338)iIiIiIIIII3, class_23502, (class_1268)(var5_4 == null ? class_1268.field_5808 : var5_4));
        IiIiiiiIii.ALLATORIxDEMO(findItemResult.slot());
        return (3 & 5) != 0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n) {
        void iIiIiIIIII3;
        int n2;
        IiiIiIiiii iiiIiIiiii2 = iiiIiIiiii4;
        int n3 = n2 = iiiIiIiiii2.IIiiIIIIIi;
        while (n3 < iIiIiIIIII3) {
            IiiIiIiiii iiiIiIiiii3 = iiiIiIiiii2;
            IiiIiIiiii iiiIiIiiii4 = iiiIiIiiii3.iiIIIiIIIi[n2];
            double d = iiiIiIiiii3.ALLATORIxDEMO((class_2338)iiiIiIiiii4);
            double d2 = iIiiIiiIii.iiiIiIiiIi((class_1309)iiiIiIiiii3.iIIiiIiIiI.field_1724, iiiIiIiiii2.iIIiiIiIiI.field_1724.method_5829(), iiiIiIiiii4.method_46558(), (class_2338)iiiIiIiiii4, (3 & 4) != 0);
            if (iiiIiIiiii3.ALLATORIxDEMO(d, d2)) {
                class_2350 class_23502 = iIiIiiIIIi.iiiIiIiiIi((class_2338)iiiIiIiiii4, --1 != 0);
                if (class_23502 != null) {
                    iiiIiIiiii2.iiiiiIIiIi = iiiIiIiiii4.method_10093(class_23502);
                    if (!EntityUtils.intersectsWithEntity((class_238)new class_238((class_2338)iiiIiIiiii4), iIiIiIIIII2 -> {
                        if (!(iIiIiIIIII2 instanceof class_1542)) {
                            return (3 & 5) != 0;
                        }
                        return false;
                    })) {
                        iiiIiIiiii2.iIIiIiiIiI = iiiIiIiiii4;
                        iiiIiIiiii2.iIIIIIiiII = d;
                    }
                }
            }
            n3 = ++n2;
        }
        iiiIiIiiii2.IIiiIIIIIi = iIiIiIIIII3;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler(priority=200)
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IiiIiIiiii iiiIiIiiii2 = this;
        double d = (float)(System.currentTimeMillis() - iiiIiIiiii2.iIiIIiIIIi) / 1000.0f;
        IiiIiIiiii iiiIiIiiii3 = iiiIiIiiii2;
        iiiIiIiiii3.iIIiIiiiIi += d;
        iiiIiIiiii3.iIiIIiIIIi = System.currentTimeMillis();
        if (iiiIiIiiii3.IiIiIiIIii < 0L || iiiIiIiiii2.iIIiiIiIiI.field_1724 == null || iiiIiIiiii2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (iiiIiIiiii2.ALLATORIxDEMO()) {
            iiiIiIiiii2.iiiIiIiiIi();
        }
        ArrayList arrayList = new ArrayList();
        iiiIiIiiii2.IiiiiIIiII.forEach((class_23382, iiiIIiiIiI) -> {
            IiiIIiiIiI iIiIiIIIII2 = iiiIIiiIiI;
            List iIiIiIIIII3 = arrayList;
            if (System.currentTimeMillis() - iIiIiIIIII2.iIIiIiiiIi > 500L) {
                void iIiIiIIIII4;
                iIiIiIIIII3.add(iIiIiIIIII4);
            }
        });
        arrayList.forEach(iiiIiIiiii2.IiiiiIIiII::remove);
        int n = Math.min((int)Math.ceil((float)(System.currentTimeMillis() - iiiIiIiiii2.IiIiIiIIii) / 50.0f * (float)iiiIiIiiii2.iiIiIIiiii), iiiIiIiiii2.iiIiIIiiii - --1);
        IiiIiIiiii iiiIiIiiii4 = iiiIiIiiii2;
        iiiIiIiiii4.ALLATORIxDEMO(n);
        if (iiiIiIiiii4.iiiIiIiiII != null && iiiIiIiiii2.ALLATORIxDEMO()) {
            void iIiIiIIIII2;
            IiiIiIiiii iiiIiIiiii5 = iiiIiIiiii2;
            iIiIiIIIII2.renderer.box(iiiIiIiiii5.iiiIiIiiII, (Color)iiiIiIiiii5.IiiiiIiIiI.get(), (Color)iiiIiIiiii2.IiiIiIiiIi.get(), (ShapeMode)iiiIiIiiii2.IIiIiIIiii.get(), 3 ^ 3);
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        int n;
        IiiIiIiiii iiiIiIiiii2 = iiiIiIiiii4;
        ArrayList<class_1657> arrayList = new ArrayList<class_1657>();
        double d = 1000.0;
        int n2 = n = --3;
        while (n2 > 0) {
            IiiIiIiiii iiiIiIiiii3 = null;
            Iterator iterator = iiiIiIiiii2.iIIiiIiIiI.field_1687.method_18456().iterator();
            block1: while (true) {
                Iterator iterator2 = iterator;
                while (iterator2.hasNext()) {
                    double d2;
                    IiiIiIiiii iiiIiIiiii4 = (class_1657)iterator.next();
                    if (arrayList.contains(iiiIiIiiii4) || Friends.get().isFriend((class_1657)iiiIiIiiii4)) continue block1;
                    if (iiiIiIiiii4 == iiiIiIiiii2.iIIiiIiIiI.field_1724) {
                        iterator2 = iterator;
                        continue;
                    }
                    double d3 = iiiIiIiiii4.method_5739((class_1297)iiiIiIiiii2.iIIiiIiIiI.field_1724);
                    if (d2 > 15.0) {
                        iterator2 = iterator;
                        continue;
                    }
                    if (iiiIiIiiii3 != null && !(d3 < d)) continue block1;
                    d = d3;
                    iiiIiIiiii3 = iiiIiIiiii4;
                    continue block1;
                }
                break;
            }
            if (iiiIiIiiii3 != null) {
                arrayList.add((class_1657)iiiIiIiiii3);
            }
            n2 = --n;
        }
        iiiIiIiiii2.iIIiiIIIIi = arrayList;
    }
}

