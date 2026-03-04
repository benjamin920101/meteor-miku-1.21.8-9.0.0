/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.BlockIterator
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.fluid.Fluids
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIIIiiI;
import com.github.mikumiku.addon.IiIIiIIiII;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.modules.LiquidFiller;
import com.github.mikumiku.addon.modules.MEnum;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.BlockIterator;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.fluid.Fluids;
import net.minecraft.world.RaycastContext;

public class IIiiIIIIIi
extends iIiIiIIIii {
    private final List<class_2338.class_2339> iIIIiiiiIi;
    private final Setting<List<class_2248>> iiiIiiIIII;
    private int iIiIIiIIIi;
    private final Setting<LiquidFiller.Shape> IIiIiiiiII;
    private final SettingGroup IIiiIIIIIi;
    private final Setting<MEnum.ListMode> iIiiiIiIii;
    private final Setting<List<class_2248>> iIiIiiiiII;
    private final iiIIiiIIIi IIIIiiIiii;
    private final SettingGroup IiiIiIiiIi;
    private final Setting<Double> IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private final Setting<LiquidFiller.SortMode> iiiiiIIiIi;
    private final Setting<Double> iIIiIiiiIi;
    private final Setting<Integer> iIiIiIIIII;
    private final Setting<LiquidFiller.PlaceIn> ALLATORIxDEMO;

    public void onDeactivate() {
        this.iIiIIiIIIi = 2 & 5;
        this.IIIIiiIiii.iiiIiIiiIi();
    }

    public IIiiIIIIIi() {
        IIiiIIIIIi iIiiIIIIIi = this;
        super(IIiiIIIiiI.ALLATORIxDEMO("\u81d0\u52c2\u5851\u6c5e\u5871\u6d3d"), IiIIiIIiII.ALLATORIxDEMO("\u8184\u529a\u5c68\u65ab\u5719\u652c\u7f20\u571a\u60c6\u8331\u569a\u51b7\u76ea\u6c06\u6efe\u658b\u5739\u5197\u304c"));
        iIiiIIIIIi.IiiIiIiiIi = iIiiIIIIIi.settings.getDefaultGroup();
        iIiiIIIIIi.IIiiIIIIIi = iIiiIIIIIi.settings.createGroup(IIiiIIIiiI.ALLATORIxDEMO("\u7617\u5417\u531f"));
        IIiiIIIIIi iIiiIIIIIi2 = this;
        iIiiIIIIIi.IIIIiiIiii = new iiIIiiIIIi(2000L);
        iIiiIIIIIi.ALLATORIxDEMO = iIiiIIIIIi.IiiIiIiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u650c\u7f00\u4f5f\u7f20"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u9013\u62a3\u5732\u54a0\u79f7\u7c11\u57b1\u76ee\u6d88\u4f39\u4e17\u6554\u7f54\u65d3\u574d\u3048"))).defaultValue((Object)LiquidFiller.PlaceIn.ALLATORIxDEMO)).build());
        this.IIiIiiiiII = this.IiiIiIiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u5f70\u72f8"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u6504\u7f04\u7bad\u6cbf\u76be\u5f08\u72ac\u3048"))).defaultValue((Object)LiquidFiller.Shape.ALLATORIxDEMO)).build());
        this.IIiIiIIiii = this.IiiIiIiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u650c\u7f00\u8311\u56ba"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u53d5\u4e8f\u6504\u7f04\u6583\u573d\u76be\u8369\u56ee\u3048"))).defaultValue(4.5).min(0.0).sliderMax(6.0).build());
        this.iIIiIiiiIi = this.IiiIiIiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u7a4d\u58f7\u8311\u56ba"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u5712\u65d3\u576d\u5464\u9758\u6554\u7f54\u659c\u76be\u8369\u56ee\u3048"))).defaultValue(3.0).min(0.0).sliderMax(6.0).build());
        this.iIIiiIiIiI = this.IiiIiIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u5ee4\u8f91"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u52c2\u4f46\u4e01\u95ee\u76ce\u5ecc\u8fb5\uff32\u4e8f\u6e02\u6265\u5201\u4e50\u536f\u4f27\uff13\u3048"))).defaultValue((Object)(3 >> 2))).min(3 & 4).build());
        this.iIiIiIIIII = this.IiiIiIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u6ba1\u5209\u676e\u5915\u65d7\u5745\u653e"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u6b85\u6e22\u6245\u5201\u5c77\u8bef\u6554\u7f54\u76ee\u673a\u594d\u6583\u573d\u656a\u3048"))).defaultValue((Object)(2 ^ 3))).min(4 ^ 5).sliderRange(--1, 0x2F & 0x5A).build());
        this.iiiiiIIiIi = this.IiiIiIiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u63a0\u5ee1\u6a33\u5f41"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u4f22\u5122\u6504\u7f04\u6583\u573d\u76be\u9810\u5e95\u3048"))).defaultValue((Object)LiquidFiller.SortMode.iiiiiIIiIi)).build());
        this.iIiiiIiIii = this.IIiiIIIIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u5225\u8806\u6a33\u5f41"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u9063\u62d3\u6a4b\u5f15\u3048"))).defaultValue((Object)MEnum.ListMode.ALLATORIxDEMO)).build());
        class_2248[] class_2248Array = new class_2248[0x6E & 0x19];
        class_2248Array[3 & 4] = class_2246.field_10566;
        class_2248Array[3 & 5] = class_2246.field_10445;
        class_2248Array[1 ^ 3] = class_2246.field_10340;
        class_2248Array[--3] = class_2246.field_10515;
        class_2248Array[--4] = class_2246.field_10508;
        class_2248Array[--5] = class_2246.field_10474;
        class_2248Array[0x6E & 0x17] = class_2246.field_10030;
        class_2248Array[0x2F & 0x57] = class_2246.field_10115;
        this.iIiIiiiiII = this.IIiiIIIIIi.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u7613\u541f\u531b"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u517b\u8bd2\u7512\u670f\u5851\u512f\u6d88\u4f39\u76be\u65d3\u574d\u3048"))).defaultValue(class_2248Array).visible(() -> {
            if (this.iIiiiIiIii.get() == MEnum.ListMode.ALLATORIxDEMO) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.iiiIiiIIII = this.IIiiIIIIIi.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u9ebf\u541f\u531b"))).description(IIiiIIIiiI.ALLATORIxDEMO("\u79bb\u6b08\u7512\u670f\u5851\u512f\u6d88\u4f39\u76be\u65d3\u574d\u3048"))).visible(() -> {
            if (this.iIiiiIiIii.get() == MEnum.ListMode.iIiIiIIIII) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        IIiiIIIIIi iIiiIIIIIi3 = this;
        iIiiIIIIIi3.iIIIiiiiIi = new ArrayList<class_2338.class_2339>();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiIIiII.ALLATORIxDEMO("E%0hA\u000b\u0012\u001bb*s:WO\u0012\u8b99\u66c6\u65de\u5202\u676e\u6582\u7226\u673e\uff4f"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, double d) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
        if (iIiiIIIIIi.IIiIiiiiII.get() == LiquidFiller.Shape.iIiIiIIIII) {
            IIiiIIIIIi iIiiIIIIIi2 = iIiiIIIIIi.iIIiiIiIiI.field_1724.method_24515();
            void v0 = iIiIiIIIII3;
            double d2 = Math.abs(v0.method_10263() - iIiiIIIIIi2.method_10263());
            double d3 = Math.abs(v0.method_10264() - iIiiIIIIIi2.method_10264());
            double d4 = Math.abs(v0.method_10260() - iIiiIIIIIi2.method_10260());
            if (Math.max(Math.max(d2, d3), d4) <= Math.floor((double)iIiIiIIIII2)) {
                return (2 ^ 3) != 0;
            }
            return false;
        }
        return PlayerUtils.isWithin((class_243)iIiIiIIIII3.method_46558(), (double)iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        void iIiIiIIIII2;
        IIiiIIIIIi iIiiIIIIIi;
        IIiiIIIIIi iIiiIIIIIi2 = iIiiIIIIIi = iIiiIIIIIi3;
        if (!iIiiIIIIIi2.ALLATORIxDEMO((class_2338)iIiIiIIIII2, (Double)iIiiIIIIIi2.IIiIiIIiii.get())) {
            return --1 != 0;
        }
        IIiiIIIIIi iIiiIIIIIi3 = new class_3959(iIiiIIIIIi.iIIiiIiIiI.field_1724.method_33571(), iIiIiIIIII2.method_46558(), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)iIiiIIIIIi.iIIiiIiIiI.field_1724);
        if ((iIiiIIIIIi3 = iIiiIIIIIi.iIIiiIiIiI.field_1687.method_17742((class_3959)iIiiIIIIIi3)) == null || !iIiiIIIIIi3.method_17777().equals((Object)iIiIiIIIII2)) {
            if (!iIiiIIIIIi.ALLATORIxDEMO((class_2338)iIiIiIIIII2, (Double)iIiiIIIIIi.iIIiIiiiIi.get())) {
                return (2 ^ 3) != 0;
            }
            return false;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = n = 5 >> 3;
        while (n3 < n2) {
            void iIiIiIIIII2;
            IIiiIIIIIi iIiiIIIIIi2 = class_2350Array[n];
            if (!iIiiIIIIIi.iIIiiIiIiI.field_1687.method_8320((class_2338)(iIiiIIIIIi2 = iIiIiIIIII2.method_10093((class_2350)iIiiIIIIIi2))).method_26215() && !iIiiIIIIIi.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiiIIIIIi2).method_51176()) {
                return (3 & 5) != 0;
            }
            n3 = ++n;
        }
        return false;
    }

    @Override
    public void onActivate() {
        IIiiIIIIIi iIiiIIIIIi = this;
        super.onActivate();
        iIiiIIIIIi.iIiIIiIIIi = 3 >> 2;
        iIiiIIIIIi.IIIIiiIiii.iiIIiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ double ALLATORIxDEMO(double d, double d2, double d3, class_2338.class_2339 class_23392) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
        IIiiIIIIIi iIiiIIIIIi2 = class_23392;
        IIiiIIIIIi iIiIiIIIII5 = iIiiIIIIIi;
        return Utils.squaredDistance((double)iIiIiIIIII4, (double)iIiIiIIIII3, (double)iIiIiIIIII2, (double)((double)iIiiIIIIIi2.method_10263() + 0.5), (double)((double)iIiiIIIIIi2.method_10264() + 0.5), (double)((double)iIiiIIIIIi2.method_10260() + 0.5)) * (double)(iIiIiIIIII5.iiiiiIIiIi.get() == LiquidFiller.SortMode.iIIiIiiiIi ? 4 ^ 5 : -1);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiiIIIIIi iIiIiIIIII2;
        IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
        IIiiIIIIIi iIiiIIIIIi2 = pre;
        IIiiIIIIIi iIiiIIIIIi3 = iIiIiIIIII2 = iIiiIIIIIi;
        if (iIiiIIIIIi3.iIiIIiIIIi < (Integer)iIiiIIIIIi3.iIIiiIiIiI.get()) {
            iIiIiIIIII2.iIiIIiIIIi += 3 & 5;
            return;
        }
        IIiiIIIIIi iIiiIIIIIi4 = iIiIiIIIII2;
        iIiiIIIIIi4.iIiIIiIIIi = 2 & 5;
        double d = iIiiIIIIIi4.iIIiiIiIiI.field_1724.method_23317();
        double d2 = iIiiIIIIIi4.iIIiiIiIiI.field_1724.method_23318();
        double d3 = iIiiIIIIIi4.iIIiiIiIiI.field_1724.method_23321();
        int this2 = -4 >> 2;
        int n = iIiiIIIIIi4.iIiiiIiIii.get() == MEnum.ListMode.ALLATORIxDEMO ? (this2 = IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
            IIiiIIIIIi iIiiIIIIIi2 = class_17992;
            IIiiIIIIIi iIiIiIIIII2 = iIiiIIIIIi;
            if (iIiiIIIIIi2.method_7909() instanceof class_1747 && ((List)iIiIiIIIII2.iIiIiiiiII.get()).contains(class_2248.method_9503((class_1792)iIiiIIIIIi2.method_7909()))) {
                return (4 ^ 5) != 0;
            }
            return false;
        })) : (this2 = IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
            IIiiIIIIIi iIiiIIIIIi2 = class_17992;
            IIiiIIIIIi iIiIiIIIII2 = iIiiIIIIIi;
            if (iIiiIIIIIi2.method_7909() instanceof class_1747 && !((List)iIiIiIIIII2.iiiIiiIIII.get()).contains(class_2248.method_9503((class_1792)iIiiIIIIIi2.method_7909()))) {
                return (3 & 5) != 0;
            }
            return false;
        }));
        if (n == -1) {
            return;
        }
        BlockIterator.register((int)((int)Math.ceil((Double)iIiIiIIIII2.IIiIiIIiii.get() + 1.0)), (int)((int)Math.ceil((Double)iIiIiIIIII2.IIiIiIIiii.get())), (class_23382, class_26802) -> {
            void iIiIiIIIII2;
            IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
            IIiiIIIIIi iIiiIIIIIi2 = class_26802;
            IIiiIIIIIi iIiIiIIIII3 = iIiiIIIIIi;
            if (iIiIiIIIII3.IIIIiiIiii.ALLATORIxDEMO((class_2338)iIiIiIIIII2)) {
                return;
            }
            if (iIiIiIIIII3.iiiIiIiiIi((class_2338)iIiIiIIIII2)) {
                return;
            }
            iIiiIIIIIi2 = iIiiIIIIIi2.method_26227().method_15772();
            if (iIiIiIIIII3.ALLATORIxDEMO.get() == LiquidFiller.PlaceIn.ALLATORIxDEMO && iIiiIIIIIi2 != class_3612.field_15910 && iIiiIIIIIi2 != class_3612.field_15908 || iIiIiIIIII3.ALLATORIxDEMO.get() == LiquidFiller.PlaceIn.iIIiiIiIiI && iIiiIIIIIi2 != class_3612.field_15910 || iIiIiIIIII3.ALLATORIxDEMO.get() == LiquidFiller.PlaceIn.iIiIiIIIII && iIiiIIIIIi2 != class_3612.field_15908) {
                return;
            }
            if (!iIiIiiIIIi.IIiIiIiIiI((class_2338)iIiIiIIIII2)) {
                return;
            }
            iIiIiIIIII3.iIIIiiiiIi.add(iIiIiIIIII2.method_25503());
        });
        BlockIterator.after(() -> {
            IIiiIIIIIi iIiiIIIIIi;
            block6: {
                Iterator<class_2338.class_2339> iterator;
                int n2 = this2;
                IIiiIIIIIi iIiIiIIIII2 = this;
                if (iIiIiIIIII2.iiiiiIIiIi.get() == LiquidFiller.SortMode.iIiIiIIIII || iIiIiIIIII2.iiiiiIIiIi.get() == LiquidFiller.SortMode.iiiiiIIiIi) {
                    iIiIiIIIII2.iIIIiiiiIi.sort(Comparator.comparingDouble(class_23392 -> {
                        IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
                        IIiiIIIIIi iIiiIIIIIi2 = class_23392;
                        IIiiIIIIIi iIiIiIIIII2 = iIiiIIIIIi;
                        return iIiiIIIIIi2.method_10264() * (iIiIiIIIII2.iiiiiIIiIi.get() == LiquidFiller.SortMode.iiiiiIIiIi ? 3 & 5 : -1);
                    }));
                } else if (iIiIiIIIII2.iiiiiIIiIi.get() != LiquidFiller.SortMode.ALLATORIxDEMO) {
                    void iIiIiIIIII3;
                    void iIiIiIIIII4;
                    void iIiIiIIIII5;
                    iIiIiIIIII2.iIIIiiiiIi.sort(Comparator.comparingDouble(arg_0 -> iIiIiIIIII2.ALLATORIxDEMO((double)iIiIiIIIII5, (double)iIiIiIIIII4, (double)iIiIiIIIII3, arg_0)));
                }
                int iIiIiIIIII5 = 0;
                Iterator<class_2338.class_2339> iterator2 = iterator = iIiIiIIIII2.iIIIiiiiIi.iterator();
                while (iterator2.hasNext()) {
                    class_2338 iIiIiIIIII4 = (class_2338)iterator.next();
                    if (iIiIiIIIII5 >= (Integer)iIiIiIIIII2.iIiIiIIIII.get()) {
                        iIiiIIIIIi = iIiIiIIIII2;
                        break block6;
                    }
                    if (!iIiIiIIIII2.ALLATORIxDEMO(iIiIiIIIII4)) {
                        iterator2 = iterator;
                        iIiIiIIIII2.IIIIiiIiii.ALLATORIxDEMO(iIiIiIIIII4);
                        continue;
                    }
                    IiIiiiiIii.ALLATORIxDEMO((int)this);
                    iterator2 = iterator;
                    iIiIiiIIIi.iiIIiIIiii(iIiIiIIIII4);
                    IiIiiiiIii.ALLATORIxDEMO((int)this);
                    ++iIiIiIIIII5;
                    iIiIiIIIII2.IIIIiiIiii.ALLATORIxDEMO(iIiIiIIIII4);
                }
                iIiiIIIIIi = iIiIiIIIII2;
            }
            iIiiIIIIIi.iIIIiiiiIi.clear();
        });
    }
}

