/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
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
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiiIIII;
import com.github.mikumiku.addon.iIIiIiiiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.iiiiIiiIIi;
import com.github.mikumiku.addon.modules.HighwayClearer;
import com.github.mikumiku.addon.modules.MEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
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
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;

public class iIIiIiIIII
extends iIiIiIIIii {
    private final Setting<Integer> iIIiiiiIii;
    private final SettingGroup iiIIIiIIIi;
    private final SettingGroup iIiiiiIIII;
    private int iiIiIIiiii;
    private final Setting<SettingColor> iIIiIiiIiI;
    private int iIIIIIIiII;
    private List<class_2338> iIIiiIIIIi;
    private final Setting<HighwayClearer.SortMode> IiiiiIiIiI;
    private final Setting<SettingColor> iiiIiIIiii;
    private final Setting<List<class_2248>> iIIIiiiiIi;
    private final Setting<Integer> iiiIiiIIII;
    private final Setting<Boolean> iIiIIiIIIi;
    private final Setting<Integer> IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<ShapeMode> iIiIiiiiII;
    private int IIIIiiIiii;
    private int IiiIiIiiIi;
    private int IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<MEnum.ListMode> iIIiIiiiIi;
    private final Setting<HighwayClearer.Direction> iIiIiIIIII;
    private final Setting<List<class_2248>> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int iiIIiIIiii(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void iIiIiIIIII2;
        class_2338 iIiIiIIIII3 = class_23384;
        class_2338 iIiIiIIIII4 = class_23382;
        double d = Math.abs(iIiIiIIIII2.method_10260() - iIiIiIIIII4.method_10260());
        double d2 = Math.abs(iIiIiIIIII3.method_10260() - iIiIiIIIII4.method_10260());
        return Double.compare(d, d2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean iiIIiIIiii(class_2338 class_23382, class_2338 class_23383) {
        iIIiIiIIII iIIiIiIIII2 = iIIiIiIIII3;
        iIIiIiIIII iIIiIiIIII3 = class_23383;
        iIIiIiIIII iIiIiIIIII2 = iIIiIiIIII2;
        if (iIiIiIIIII2.IIiIiIIiii == -4 >> 2) {
            return (4 ^ 5) != 0;
        }
        switch (iIiIiIIIII2.IIiIiIIiii) {
            case 0: {
                void iIiIiIIIII3;
                if (iIiIiIIIII3.method_10263() <= iIIiIiIIII3.method_10263()) return false;
                return --1 != 0;
            }
            case 1: {
                void iIiIiIIIII3;
                if (iIiIiIIIII3.method_10260() <= iIIiIiIIII3.method_10260()) return false;
                return (4 ^ 5) != 0;
            }
            case 2: {
                void iIiIiIIIII3;
                if (iIiIiIIIII3.method_10263() >= iIIiIiIIII3.method_10263()) return false;
                return --1 != 0;
            }
            case 3: {
                void iIiIiIIIII3;
                if (iIiIiIIIII3.method_10260() >= iIIiIiIIII3.method_10260()) return false;
                return (2 ^ 3) != 0;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382, class_2338 class_23383) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iIIiIiIIII iIIiIiIIII2 = this;
        int n = (Integer)iIIiIiIIII2.iIIiiiiIii.get() / --2;
        double d = iIIiIiIIII2.iIIiiIiIiI.field_1724.method_23318() + 0.3;
        if (iIiIiIIIII3.method_10264() < (int)Math.floor(d)) {
            return (3 ^ 3) != 0;
        }
        if (iIIiIiIIII2.IIiIiIIiii == -4 >> 2) {
            void v0 = iIiIiIIIII3;
            int n2 = Math.abs(v0.method_10263() - iIiIiIIIII2.method_10263());
            int n3 = Math.abs(v0.method_10260() - iIiIiIIIII2.method_10260());
            if (n2 <= n && n3 <= n) {
                return (2 ^ 3) != 0;
            }
            return false;
        }
        switch (iIIiIiIIII2.IIiIiIIiii) {
            case 0: 
            case 2: {
                while (false) {
                }
                int n4 = Math.abs(iIiIiIIIII3.method_10260() - iIiIiIIIII2.method_10260());
                if (n4 <= n) {
                    return (3 & 5) != 0;
                }
                return false;
            }
            case 1: 
            case 3: {
                int n5 = Math.abs(iIiIiIIIII3.method_10263() - iIiIiIIIII2.method_10263());
                if (n5 <= n) {
                    return --1 != 0;
                }
                return false;
            }
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        class_2338 class_23382;
        iIIiIiIIII iIIiIiIIII2;
        iIIiIiIIII iIIiIiIIII3 = iIIiIiIIII2 = iterator;
        iIIiIiIIII3.iIIiiIIIIi.clear();
        iIIiIiIIII3.IiiIiIiiIi = 2 & 5;
        if (iIIiIiIIII3.iIIIIIIiII < (Integer)iIIiIiIIII2.IIiiIIIIIi.get()) {
            iIIiIiIIII2.iIIIIIIiII += 2 ^ 3;
            return;
        }
        iIIiIiIIII2.iIIIIIIiII = 3 & 4;
        if (((Boolean)iIIiIiIIII2.iiiiiIIiIi.get()).booleanValue() && !iIIiIiIIII2.ALLATORIxDEMO()) {
            return;
        }
        iIIiIiIIII iIIiIiIIII4 = iIIiIiIIII2;
        iIIiIiIIII4.ALLATORIxDEMO();
        if (iIIiIiIIII4.IIiIiIIiii != iIIiIiIIII2.IIIIiiIiii) {
            iIIiIiIIII iIIiIiIIII5 = iIIiIiIIII2;
            iIIiIiIIII5.IIIIiiIiii = iIIiIiIIII5.IIiIiIIiii;
            iIIiIiIIII5.info(iIIiIiIIII5.ALLATORIxDEMO(), new Object[3 ^ 3]);
        }
        class_2338 iIiIiIIIII2 = iIIiIiIIII2.iIIiiIiIiI.field_1724.method_24515();
        Iterator iterator = iiIIiiiIIi.ALLATORIxDEMO(iIiIiIIIII2, (Integer)iIIiIiIIII2.IIiIiiiiII.get(), (Integer)iIIiIiIIII2.IIiIiiiiII.get());
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_23382 = (class_2338)iterator.next();
            if (!iIIiIiIIII2.ALLATORIxDEMO(class_23382, iIiIiIIIII2)) continue;
            arrayList.add(class_23382);
        }
        iIIiIiIIII2.ALLATORIxDEMO(arrayList, iIiIiIIIII2);
        iterator = arrayList.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            class_23382 = (class_2338)iterator.next();
            iterator2 = iterator;
            iIIiIiIIII2.ALLATORIxDEMO(class_23382);
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(List<class_2338> list, class_2338 class_23382) {
        iIIiIiIIII iIIiIiIIII2;
        iIIiIiIIII iIIiIiIIII3 = list2;
        List<class_2338> list2 = list;
        iIIiIiIIII iIiIiIIIII2 = iIIiIiIIII3;
        if (list2.isEmpty()) {
            return;
        }
        if (iIiIiIIIII2.IIiIiIIiii == -4 >> 2) {
            list2.sort((arg_0, arg_1) -> iIIiIiIIII.ALLATORIxDEMO((class_2338)iIiIiIIIII, arg_0, arg_1));
            iIIiIiIIII2 = iIiIiIIIII2;
        } else {
            switch (iIiIiIIIII2.IIiIiIIiii) {
                case 0: 
                case 2: {
                    while (false) {
                    }
                    list2.sort((arg_0, arg_1) -> iIIiIiIIII.iiiIiIiiIi((class_2338)iIiIiIIIII, arg_0, arg_1));
                    iIIiIiIIII2 = iIiIiIIIII2;
                    break;
                }
                case 1: 
                case 3: {
                    list2.sort((arg_0, arg_1) -> iIIiIiIIII.iiIIiIIiii((class_2338)iIiIiIIIII, arg_0, arg_1));
                }
                default: {
                    iIIiIiIIII2 = iIiIiIIIII2;
                }
            }
        }
        if (iIIiIiIIII2.IiiiiIiIiI.get() == HighwayClearer.SortMode.iiiiiIIiIi) {
            Collections.reverse(list2);
        }
    }

    public iIIiIiIIII() {
        iIIiIiIIII iIIiIiIIII2 = this;
        super(iiiiIiiIIi.ALLATORIxDEMO("\u9a90\u9066\u6e4d\u8d96\u804d"), IiIiiiIIII.ALLATORIxDEMO("\u81fb\u52a6\u6e0a\u7416\u9007\u8da4\u5256\u65bd\u9ac6\u5905\u769a\u65b8\u5742&4\u5ef1\u8bfa\u9106\u541bW\u81d9\u5284\u8d43\u8dc3N\u4e0c\u8d44\u4f53\u753b\u300e\u4e6c\u53c3\u4ed6\u4f70\u4e09\u968b\u9060\u633a\u63de\u5631\u3012\u4e05\u4f47\u5e78\u6567\u5664\u7b47\u4f6e\u756c\u3059"));
        iIIiIiIIII2.iIiiiiIIII = iIIiIiIIII2.settings.getDefaultGroup();
        iIIiIiIIII2.iIIiiIiIiI = iIIiIiIIII2.settings.createGroup(iiiiIiiIIi.ALLATORIxDEMO("\u8fbe\u6eac"));
        iIIiIiIIII2.iiIIIiIIIi = iIIiIiIIII2.settings.createGroup(IiIiiiIIII.ALLATORIxDEMO("\u6e76\u6788"));
        iIIiIiIIII2.IIiIiiiiII = iIIiIiIIII2.iIiiiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6e7c\u744e\u837a\u56bc"))).description(IiIiiiIIII.ALLATORIxDEMO("\u573b\u5916\u8fc8\u768f\u4f5e\u7f62\u6e0b\u7417\u65fd\u570c"))).defaultValue((Object)(--5))).min(3 & 5).sliderMax(0x17 & 0x6F).build());
        this.iIIiiiiIii = this.iIiiiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u8da7\u5bc4\u5eee"))).description(IiIiiiIIII.ALLATORIxDEMO("\u8ddc\u76a8\u5b8e\u5e8a\uff4a\u53b3\u6305\u6394\u8fcd\u4e21\u8310\u56f8\u518b\u7695\u65fd\u570c"))).defaultValue((Object)(--5))).min(3 >> 1).sliderMax(0x19 & 0x6F).build());
        this.iiiIiiIIII = this.iIiiiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6779\u596f\u636f\u63d0\u6509\u9187"))).description(IiIiiiIIII.ALLATORIxDEMO("\u6b96\u6b32\u670c\u590e\u631d\u638b\u7688\u65b7\u5746\u6534\u9194"))).defaultValue((Object)(--2))).min(3 >> 1).sliderMax(--5).build());
        this.IIiiIIIIIi = this.iIiiiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u636f\u63d0\u5e8f\u8f97"))).description(IiIiiiIIII.ALLATORIxDEMO("\u633a\u63ab\u6595\u5711\u4e12\u95e7\u7688\u5ee2\u8fd4\uff1bxgr/\uff52"))).defaultValue((Object)(2 & 5))).min(2 & 5).sliderMax(0x56 & 0x3D).build());
        this.iIiiiIiIii = this.iIiiiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u8193\u52e0\u527e\u632a"))).description(IiIiiiIIII.ALLATORIxDEMO("\u81f9\u52a4\u5213\u6369\u5223\u5404\u900c\u7695\u5da1\u512c"))).defaultValue((Object)(5 >> 2))).build());
        this.iiiiiIIiIi = this.iIiiiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u4e8d\u4e72\u7504"))).description(IiIiiiIIII.ALLATORIxDEMO("\u53f9\u5724\u4e05\u755d\u755b\u6513"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiIiIIIII = this.iIiiiiIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u65c0\u5459"))).description(IiIiiiIIII.ALLATORIxDEMO("\u901a\u62e5\u6e0b\u7417\u65fd\u544a"))).defaultValue((Object)HighwayClearer.Direction.IIiIiIIiii)).build());
        this.IiiiiIiIiI = this.iIiiiiIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u63eb\u5ec7\u6a58\u5f47"))).description(IiIiiiIIII.ALLATORIxDEMO("\u5991\u4f59\u6386\u5e84\u8992\u6e09\u7408\u7695\u4f09\u7f35"))).defaultValue((Object)HighwayClearer.SortMode.iiiiiIIiIi)).build());
        this.iIIiIiiiIi = this.iIIiiIiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u8fbe\u6eac\u6a58\u5f47"))).description(IiIiiiIIII.ALLATORIxDEMO("\u901d\u62e2\u65aa\u575b\u8fc9\u6ef5\u6a65\u5f54"))).defaultValue((Object)MEnum.ListMode.ALLATORIxDEMO)).build());
        class_2248[] class_2248Array = new class_2248[--4];
        class_2248Array[3 >> 2] = class_2246.field_10515;
        class_2248Array[3 & 5] = class_2246.field_10540;
        class_2248Array[5 >> 1] = class_2246.field_10255;
        class_2248Array[--3] = class_2246.field_10114;
        this.ALLATORIxDEMO = this.iIIiiIiIiI.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u7635\u5474\u531d"))).description(IiIiiiIIII.ALLATORIxDEMO("\u901a\u62e5\u89b2\u6e29\u7435\u76a8\u658a\u577b\u7c48\u57a7\uff4e\u4e9c\u573b\u7671\u5419\u535e\u6a32\u5f03\u4e05\u750e\u650c\uff52"))).defaultValue(class_2248Array).visible(() -> {
            if (this.iIIiIiiiIi.get() == MEnum.ListMode.ALLATORIxDEMO) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        class_2248[] class_2248Array2 = new class_2248[4 ^ 5];
        class_2248Array2[2 & 5] = class_2246.field_9987;
        this.iIIIiiiiIi = this.iIIiiIiIiI.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u9e99\u5474\u531d"))).description(IiIiiiIIII.ALLATORIxDEMO("\u901a\u62e5\u4e3e\u6e29\u7435\u76a8\u658a\u577b\u7c48\u57a7\uff4e\u4e9c\u573b\u9edd\u5419\u535e\u6a32\u5f03\u4e05\u750e\u650c\uff52"))).defaultValue(class_2248Array2).visible(() -> {
            if (this.iIIiIiiiIi.get() == MEnum.ListMode.iIiIiIIIII) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIiIIiIIIi = this.iiIIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6647\u7972\u6e4b\u679b"))).description(IiIiiiIIII.ALLATORIxDEMO("\u661c\u540a\u6678\u7963\u5f96\u6e09\u7412\u65b2\u5744\u7688\u6e3c\u67c2\u98c0\u8993"))).defaultValue((Object)(3 >> 1))).build());
        this.iIiIiiiiII = this.iiIIIiIIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u6e4b\u679b\u6a58\u5f47"))).description(IiIiiiIIII.ALLATORIxDEMO("\u9005\u62fd\u6e39\u67c0\u7688\u6630\u792b\u6a65\u5f54"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIIiIiiIiI = this.iiIIIiIIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u4fde\u972a\u98e5\u823a"))).description(IiIiiiIIII.ALLATORIxDEMO("\u5fc3\u6e5c\u7415\u65b5\u5743\u768f\u4fb4\u976e\u5865\u5154\u98d8\u8229"))).defaultValue(new SettingColor(0x21FF & 0x5EFF, 0x66FF & 0x19A5, 5 >> 3, 0x5E & 0x3F)).build());
        int n = 0x79FF & 0x6FF;
        this.iiiIiIIiii = this.iiIIIiIIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiiiIiiIIi.ALLATORIxDEMO("\u7ec6\u6729\u98e5\u823a"))).description(IiIiiiIIII.ALLATORIxDEMO("\u5f96\u6e09\u7412\u65b2\u5744\u7688\u7eb1\u6770\u98d8\u8229"))).defaultValue(new SettingColor(n, 0x1AB5 & 0x65EF, 3 ^ 3, n)).build());
        iIIiIiIIII iIIiIiIIII3 = this;
        this.IIiIiIIiii = 5 >> 3;
        this.IIIIiiIiii = -4 >> 2;
        this.iiIiIIiiii = 2 & 5;
        iIIiIiIIII iIIiIiIIII4 = this;
        this.iIIiiIIIIi = new ArrayList<class_2338>();
        iIIiIiIIII3.iIIIIIIiII = this.iiIiIIiiii;
        iIIiIiIIII3.IiiIiIiiIi = 5 >> 3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiiIiiIIi.ALLATORIxDEMO("\u000e\u0003{N*\rY=\t,8\u001c\u001ciy\u8b9f\u668d\u65f8\u5249\u6748\u65c9\u7200\u6755\uff49"));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public String ALLATORIxDEMO() {
        Object object = this;
        if (!object.isActive()) {
            return iiiiIiiIIi.ALLATORIxDEMO("\u6762\u5456\u7560");
        }
        HighwayClearer.Direction direction = (HighwayClearer.Direction)((Object)((iIIiIiIIII)object).iIiIiIIIII.get());
        if (direction == HighwayClearer.Direction.IiiIiIiiIi) {
            switch (((iIIiIiIIII)object).IIiIiIIiii) {
                case 0: {
                    this = IiIiiiIIII.ALLATORIxDEMO("\u6650\u80d5\u0017\u001e\fZ6\u8f4a\u0001\u0017\u5431\u4e2b\u6e2d\u7433\u0003");
                    break;
                }
                case 1: {
                    this = iiiiIiiIIi.ALLATORIxDEMO("\u6632\u80a4HTh\u0003C\u8f0dhQ\u5459\u532e\u6e4d\u747fa");
                    break;
                }
                case 2: {
                    this = IiIiiiIIII.ALLATORIxDEMO("\u6650\u80d5\u0017\u001e\fZ0\u8f4a\u0001\u0017\u5431\u8948\u6e2d\u7433\u0003");
                    break;
                }
                case 3: {
                    this = iiiiIiiIIi.ALLATORIxDEMO("\u6632\u80a4HTh\u0003E\u8f0dhQ\u5459\u536e\u6e4d\u747fa");
                    break;
                }
                default: {
                    this = IiIiiiIIII.ALLATORIxDEMO("\u665b\u80c2\u0000\u001a\b\u671f\u77cf");
                    break;
                }
            }
        } else {
            switch (direction.ordinal()) {
                case 1: {
                    this = iiiiIiiIIi.ALLATORIxDEMO("\u4e65\u5459Y`!c\u8f0da");
                    break;
                }
                case 2: {
                    this = IiIiiiIIII.ALLATORIxDEMO("\u5369\u5430\u001f\bm\u0003\u8f41\u0003");
                    break;
                }
                case 3: {
                    this = iiiiIiiIIi.ALLATORIxDEMO("\u8906\u5459Y`!e\u8f0da");
                    break;
                }
                case 4: {
                    this = IiIiiiIIII.ALLATORIxDEMO("\u5329\u5430\u001f\bm\u0005\u8f41\u0003");
                    break;
                }
                case 5: {
                    this = iiiiIiiIIi.ALLATORIxDEMO("\u5120\u65c0\u5459");
                    break;
                }
                default: {
                    this = IiIiiiIIII.ALLATORIxDEMO("\u671f\u77cf");
                }
            }
        }
        Object[] objectArray = new Object[5 >> 1];
        objectArray[2 & 5] = this;
        objectArray[3 >> 1] = ((iIIiIiIIII)object).iiIiIIiiii;
        return String.format(iiiiIiiIIi.ALLATORIxDEMO("\\;y\u0014Y\u5dba\u6e7c\u744eCh\\,"), objectArray);
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        iIIiIiIIII iIIiIiIIII2 = iIIiIiIIII3;
        iIIiIiIIII iIIiIiIIII3 = class_23382;
        iIIiIiIIII iIiIiIIIII2 = iIIiIiIIII2;
        if (iIIiIiIIII3 == null) {
            return;
        }
        if (iIiIiIIIII2.iIIiiIIIIi.contains(iIIiIiIIII3)) {
            return;
        }
        iIIiIiIIII iIIiIiIIII4 = iIiIiIIIII2;
        if (iIIiIiIIII4.IiiIiIiiIi >= (Integer)iIIiIiIIII4.iiiIiiIIII.get()) {
            return;
        }
        if (iIIiIiiiii.ALLATORIxDEMO() >= (1 ^ 3)) {
            return;
        }
        if (iIiIiiIIIi.ALLATORIxDEMO().method_1022(iIIiIiIIII3.method_46558()) > (double)((Integer)iIiIiIIIII2.IIiIiiiiII.get()).intValue()) {
            return;
        }
        iIiIiIIIII2.iIIiiIIIIi.add((class_2338)iIIiIiIIII3);
        BlockUtils.breakBlock((class_2338)iIIiIiIIII3, (boolean)(5 >> 2));
        iIIiIiIIII iIIiIiIIII5 = iIiIiIIIII2;
        iIIiIiIIII5.IiiIiIiiIi += 5 >> 2;
        iIIiIiIIII5.iiIiIIiiii += --1;
    }

    public void iiiIiIiiIi() {
        this.iiIiIIiiii = 3 >> 2;
        this.info(IiIiiiIIII.ALLATORIxDEMO("\u7ed3\u8b92\u5dde\u91de\u7f62"), new Object[5 >> 3]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        void iIiIiIIIII2;
        iIIiIiIIII iIiIiIIIII3 = this;
        if (!iIiIiIIIII3.iiiIiIiiIi((class_2338)(this = class_23382), (class_2338)iIiIiIIIII2)) {
            return (2 & 5) != 0;
        }
        if (Math.sqrt(Math.pow(this.method_10263() - iIiIiIIIII2.method_10263(), 2.0) + Math.pow(this.method_10264() - iIiIiIIIII2.method_10264(), 2.0) + Math.pow(this.method_10260() - iIiIiIIIII2.method_10260(), 2.0)) < 1.0) {
            return 3 >> 2;
        }
        if (!iIiIiIIIII3.iiIIiIIiii((class_2338)this, (class_2338)iIiIiIIIII2)) {
            return (3 ^ 3) != 0;
        }
        if (iIiIiIIIII3.ALLATORIxDEMO((class_2338)this) && !iIiIiIIIII3.iiiIiIiiIi((class_2338)this)) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        switch (((HighwayClearer.Direction)((Object)this.iIiIiIIIII.get())).ordinal()) {
            case 0: {
                iIIiIiIIII iIIiIiIIII2;
                double d;
                iIIiIiIIII iIIiIiIIII3 = this;
                while (false) {
                }
                double d2 = Math.abs(iIIiIiIIII3.iIIiiIiIiI.field_1724.method_23317());
                if (d2 > (d = Math.abs(iIIiIiIIII3.iIIiiIiIiI.field_1724.method_23321()))) {
                    iIIiIiIIII iIIiIiIIII4;
                    this.IIiIiIIiii = iIIiIiIIII4.iIIiiIiIiI.field_1724.method_23317() > 0.0 ? 3 >> 2 : 2;
                    return;
                }
                this.IIiIiIIiii = iIIiIiIIII2.iIIiiIiIiI.field_1724.method_23321() > 0.0 ? 3 >> 1 : 3;
                return;
            }
            case 1: {
                this.IIiIiIIiii = 3 >> 2;
                return;
            }
            case 2: {
                this.IIiIiIIiii = 5 >> 2;
                return;
            }
            case 3: {
                this.IIiIiIIiii = 5 >> 1;
                return;
            }
            case 4: {
                this.IIiIiIIiii = --3;
                return;
            }
            case 5: {
                this.IIiIiIIiii = -4 >> 2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iIIiIiIIII iIIiIiIIII2 = this;
        if (((Boolean)iIIiIiIIII2.iIiIIiIIIi.get()).booleanValue() && iIIiIiIIII2.iIIiiIIIIi.size() > 0) {
            int n = this = 2 & 5;
            while (n < iIIiIiIIII2.iIIiiIIIIi.size()) {
                void iIiIiIIIII2;
                double d = iIIiIiIIII2.iIIiiIIIIi.get(this).method_10263();
                double d2 = iIIiIiIIII2.iIIiiIIIIi.get(this).method_10264();
                double d3 = iIIiIiIIII2.iIIiiIIIIi.get(this).method_10260();
                double d4 = iIIiIiIIII2.iIIiiIIIIi.get(this).method_10263() + --1;
                double d5 = iIIiIiIIII2.iIIiiIIIIi.get(this).method_10264() + (3 >> 1);
                double d6 = iIIiIiIIII2.iIIiiIIIIi.get(this).method_10260() + --1;
                int n2 = 3 & 5;
                iIiIiIIIII2.renderer.box(d, d2, d3, d4, d5, d6, (Color)iIIiIiIIII2.iIIiIiiIiI.get(), (Color)iIIiIiIIII2.iiiIiIIiii.get(), (ShapeMode)iIIiIiIIII2.iIiIiiiiII.get(), 5 >> 3);
                n = ++this;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int iiiIiIiiIi(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void iIiIiIIIII2;
        class_2338 iIiIiIIIII3 = class_23384;
        class_2338 iIiIiIIIII4 = class_23382;
        double d = Math.abs(iIiIiIIIII2.method_10263() - iIiIiIIIII4.method_10263());
        double d2 = Math.abs(iIiIiIIIII3.method_10263() - iIiIiIIIII4.method_10263());
        return Double.compare(d, d2);
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        iIIiIiIIII iIIiIiIIII2 = iIIiIiIIII3;
        iIIiIiIIII iIIiIiIIII3 = class_23382;
        iIIiIiIIII iIiIiIIIII2 = iIIiIiIIII2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIiIiIIII3).method_26204() == class_2246.field_9987) {
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iIIiIiIIII iIIiIiIIII2 = iIIiIiIIII3;
        iIIiIiIIII iIIiIiIIII3 = class_23382;
        iIIiIiIIII iIiIiIIIII2 = iIIiIiIIII2;
        if ((iIIiIiIIII3 = iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIiIiIIII3).method_26204()) == class_2246.field_10124 || iIIiIiIIII3 == class_2246.field_10543 || iIIiIiIIII3 == class_2246.field_10382 || iIIiIiIIII3 == class_2246.field_10164) {
            return false;
        }
        if (iIiIiIIIII2.iIIiIiiiIi.get() == MEnum.ListMode.ALLATORIxDEMO) {
            return ((List)iIiIiIIIII2.ALLATORIxDEMO.get()).contains(iIIiIiIIII3);
        }
        if (!((List)iIiIiIIIII2.iIIIiiiiIi.get()).contains(iIIiIiIIII3)) {
            return 3 >> 1;
        }
        return false;
    }

    public void onDeactivate() {
        iIIiIiIIII iIIiIiIIII2 = this;
        iIIiIiIIII2.info("\u9ad8\u901f\u6e05\u8def\u8005\u6a21\u5757\u5df2\u505c\u7528\uff01\u603b\u5171\u6e05\u7406\u4e86 " + iIIiIiIIII2.iiIiIIiiii + " \u4e2a\u65b9\u5757", new Object[3 >> 2]);
        this.IIIIiiIiii = -4 >> 2;
        this.iiiIiIiiIi();
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void iIiIiIIIII2;
        class_2338 iIiIiIIIII3 = class_23384;
        class_2338 iIiIiIIIII4 = class_23382;
        double d = Math.sqrt(Math.pow(iIiIiIIIII2.method_10263() - iIiIiIIIII4.method_10263(), 2.0) + Math.pow(iIiIiIIIII2.method_10264() - iIiIiIIIII4.method_10264(), 2.0) + Math.pow(iIiIiIIIII2.method_10260() - iIiIiIIIII4.method_10260(), 2.0));
        double d2 = Math.sqrt(Math.pow(iIiIiIIIII3.method_10263() - iIiIiIIIII4.method_10263(), 2.0) + Math.pow(iIiIiIIIII3.method_10264() - iIiIiIIIII4.method_10264(), 2.0) + Math.pow(iIiIiIIIII3.method_10260() - iIiIiIIIII4.method_10260(), 2.0));
        return Double.compare(d, d2);
    }

    @Override
    public void onActivate() {
        iIIiIiIIII iIIiIiIIII2 = this;
        iIIiIiIIII iIIiIiIIII3 = this;
        super.onActivate();
        this.iiIiIIiiii = 3 & 4;
        iIIiIiIIII3.iIIIIIIiII = this.iiIiIIiiii;
        iIIiIiIIII3.IiiIiIiiIi = 5 >> 3;
        iIIiIiIIII2.IIIIiiIiii = -4 >> 2;
        iIIiIiIIII2.iIIiiIIIIi.clear();
        iIIiIiIIII2.info(IiIiiiIIII.ALLATORIxDEMO("\u9ac9\u900c\u6e09\u8de3\u8016\u6a3a\u5753\u5dfc\u543e\u7537\uff01"), new Object[5 >> 3]);
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1687 == null) {
            return (3 ^ 3) != 0;
        }
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }
}

