/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
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
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIIIiiII;
import com.github.mikumiku.addon.IIIIiIiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
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
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

public class IiiiIIiIiI
extends iIiIiIIIii {
    private final Setting<Boolean> iIIIIIIiII;
    private final SettingGroup iIIiiIIIIi;
    private final Setting<Boolean> IiiiiIiIiI;
    private int iiiIiIIiii;
    private final Setting<Integer> iIIIiiiiIi;
    private final Set<class_2338> iiiIiiIIII;
    private int iIiIIiIIIi;
    private final Setting<Integer> IIiIiiiiII;
    private class_2338 IIiiIIIIIi;
    private final Set<class_2338> iIiiiIiIii;
    private final Setting<Boolean> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final Setting<SettingColor> IiiIiIiiIi;
    private final SettingGroup IIiIiIIiii;
    private boolean iIIiiIiIiI;
    private int iiiiiIIiIi;
    private final Setting<SettingColor> iIIiIiiiIi;
    private int iIiIiIIIII;
    private final Setting<ShapeMode> ALLATORIxDEMO;

    private /* synthetic */ boolean iiIIiIIiii(class_2338 class_23382) {
        IiiiIIiIiI iiiiIIiIiI = iiiiIIiIiI2;
        IiiiIIiIiI iiiiIIiIiI2 = class_23382;
        IiiiIIiIiI iIiIiIIIII2 = iiiiIIiIiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return false;
        }
        IiiiIIiIiI iiiiIIiIiI3 = iIiIiIIIII2;
        class_243 class_2432 = iiiiIIiIiI3.iIIiiIiIiI.field_1724.method_33571();
        iiiiIIiIiI2 = class_243.method_24953((class_2382)iiiiIIiIiI2);
        if (iiiiIIiIiI3.iIIiiIiIiI.field_1687.method_17742((class_3959)(iiiiIIiIiI2 = new class_3959(class_2432, (class_243)iiiiIIiIiI2, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)iIiIiIIIII2.iIIiiIiIiI.field_1724))).method_17783() == class_239.class_240.field_1333) {
            return 5 >> 2;
        }
        return false;
    }

    @Override
    public void onActivate() {
        IiiiIIiIiI iiiiIIiIiI = this;
        super.onActivate();
        iiiiIIiIiI.ALLATORIxDEMO();
        iiiiIIiIiI.info(IIIIIIiiII.iiIIiIIiii("\u5f26\u59a8\u641a\u7d615;\u0015\u5799\u5caf\u5379\u57f9M(m"), new Object[2 & 5]);
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IiiiIIiIiI iiiiIIiIiI = iiiiIIiIiI2;
        if (!((Boolean)iiiiIIiIiI.IIIIiiIiii.get()).booleanValue() || iiiiIIiIiI.iiiIiiIIII.isEmpty()) {
            return;
        }
        Iterator<class_2338> iterator = iiiiIIiIiI.iiiIiiIIII.iterator();
        block0: while (true) {
            Iterator<class_2338> iterator2 = iterator;
            while (iterator2.hasNext()) {
                double d;
                double d2;
                double d3;
                double d4;
                double d5;
                void iIiIiIIIII2;
                class_2338 class_23382;
                int n;
                class_2338 class_23383 = iterator.next();
                if (!((Boolean)iiiiIIiIiI.iIiIiiiiII.get()).booleanValue() && !iiiiIIiIiI.iiIIiIIiii(class_23383)) {
                    iterator2 = iterator;
                    continue;
                }
                int n2 = this = -1;
                while (true) {
                    if (n2 > 1) break;
                    int n3 = -4 >> 2;
                    while (true) {
                        if (n3 > 1) break;
                        class_23382 = class_23383.method_10069(this, 2 & 5, n);
                        if (((Boolean)iiiiIIiIiI.iIiIiiiiII.get()).booleanValue() || iiiiIIiIiI.iiIIiIIiii(class_23382)) {
                            class_2338 class_23384 = class_23382;
                            double d6 = class_23384.method_10263();
                            double d7 = class_23384.method_10264();
                            double d8 = class_23384.method_10260();
                            double d9 = class_23384.method_10263() + (5 >> 2);
                            double d10 = class_23384.method_10264() + --1;
                            double d11 = class_23384.method_10260() + --1;
                            iIiIiIIIII2.renderer.box(d6, d7, d8, d9, d10, d11, (Color)iiiiIIiIiI.iIIiIiiiIi.get(), (Color)iiiiIIiIiI.IiiIiIiiIi.get(), (ShapeMode)iiiiIIiIiI.ALLATORIxDEMO.get(), 5 >> 3);
                        }
                        n3 = ++n;
                    }
                    n2 = ++this;
                }
                IiiiIIiIiI iiiiIIiIiI2 = class_23383.method_10084();
                n = ((Boolean)iiiiIIiIiI.iIiIiiiiII.get()).booleanValue() || iiiiIIiIiI.iiIIiIIiii((class_2338)iiiiIIiIiI2) ? 1 : 0;
                if (n != 0) {
                    IiiiIIiIiI iiiiIIiIiI3 = iiiiIIiIiI2;
                    double d12 = iiiiIIiIiI3.method_10263();
                    d5 = iiiiIIiIiI3.method_10264();
                    d4 = iiiiIIiIiI3.method_10260();
                    d3 = iiiiIIiIiI3.method_10263() + (4 ^ 5);
                    d2 = iiiiIIiIiI3.method_10264() + (3 & 5);
                    d = iiiiIIiIiI3.method_10260() + (5 >> 2);
                    int n4 = 0x2FF & 0x7DFF;
                    iIiIiIIIII2.renderer.box(d12, d5, d4, d3, d2, d, (Color)new SettingColor(0x4DFF & 0x32FF, 0x76FF & 0x9FF, 2 & 5, 0x78 & 0x7F), (Color)new SettingColor(n4, n4, 3 >> 2, n4), (ShapeMode)iiiiIIiIiI.ALLATORIxDEMO.get(), 3 ^ 3);
                }
                class_23382 = class_23383.method_10087(1 ^ 3);
                boolean bl = ((Boolean)iiiiIIiIiI.iIiIiiiiII.get()).booleanValue() || iiiiIIiIiI.iiIIiIIiii(class_23382);
                boolean bl2 = bl;
                if (!bl2) continue block0;
                class_2338 class_23385 = class_23382;
                d5 = class_23385.method_10263();
                d4 = class_23385.method_10264();
                d3 = class_23385.method_10260();
                d2 = class_23385.method_10263() + (3 & 5);
                d = class_23385.method_10264() + --1;
                double d13 = class_23385.method_10260() + (3 & 5);
                int n5 = 3 & 4;
                int n6 = 3 >> 2;
                iIiIiIIIII2.renderer.box(d5, d4, d3, d2, d, d13, (Color)new SettingColor(n5, 0x5EFF & 0x21FF, n5, 0x67 & 0x7C), (Color)new SettingColor(n6, 0x68FF & 0x17FF, n6, 0x28EA & 0x57DD), (ShapeMode)iiiiIIiIiI.ALLATORIxDEMO.get(), 3 ^ 3);
                continue block0;
            }
            break;
        }
    }

    public IiiiIIiIiI() {
        IiiiIIiIiI iiiiIIiIiI = this;
        super(IIIIIIiiII.iiIIiIIiii("\u6723\u96d3\u6779\u57dc\u5cca\u5bfd\u623d"), IIIIiIiIii.ALLATORIxDEMO("\u5b87\u627c\u903d\u7569\u4eb5\u6705\u96ec\u677d\u76a3jGr\u57c1\u5cec\u5303\u5798\uff3d\u0000A3\u0001{\u001by\u0004{\u4e76\u95b7\u000f:O\u57f8\u5cb2N\u4e16\u5f86\u7082\u4e4f\u6582\u57bf\u5cb2N\u4e36\u5fa6\u7082\u4e4e\u65a2W\u6807\u971b\u57e1\u5ccc"));
        iiiiIIiIiI.iIIiiIIIIi = iiiiIIiIiI.settings.getDefaultGroup();
        iiiiIIiIiI.IIiIiIIiii = iiiiIIiIiI.settings.createGroup(IIIIIIiiII.iiIIiIIiii("\u6e34\u6790"));
        iiiiIIiIiI.iIIIiiiiIi = iiiiIIiIiI.iIIiiIIIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u6427\u7d67\u8318\u5691"))).description(IIIIIIiiII.iiIIiIIiii("\u645f\u7d24\u57b9\u5c8f\u76e7\u8305\u56b7\uff2e\u65da\u5751\uff4a"))).defaultValue((Object)(0x8AF & 0x77D0))).min(0x5D & 0x32).max(0x716A & 0xF95).sliderRange(0x51 & 0x3E, 0x3180 & 0x4EFF).build());
        this.IIiIiiiiII = this.iIIiiIIIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u6427\u7d67\u9004\u5ec3"))).description(IIIIIIiiII.iiIIiIIiii("\u6bac\u4e2c7o M\u68a3\u67e3\u76c7\u659f\u5734\u6576\u918c"))).defaultValue((Object)(0x6F5A & 0x1EB5))).min(0x6A & 0x1F).max(0x7F3C & 0x4EE3).sliderRange(0x6F & 0x1A, 0x2FB6 & 0x7759).build());
        this.iIIIIIIiII = this.iIIiiIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u621b\u520b\u65b3\u9001\u7780"))).description(IIIIIIiiII.iiIIiIIiii("\u6258\u52535;5\u57b9\u5c8f\u6595\u53d7\u9042\u806c\u594a\u6d8e\u602c"))).defaultValue((Object)(5 >> 2))).build());
        this.IiiiiIiIiI = this.iIIiiIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u621b\u520b\u544b\u6699\u5039"))).description(IIIIIIiiII.iiIIiIIiii("\u6258\u52535;5\u57b9\u5c8f\u546d\u81ec\u52eb\u66a4\u503f\u641a\u7d61"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IIIIiiIiii = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u6e77\u67c8\u621b\u520b\u76c1\u5321\u57ba"))).description(IIIIIIiiII.iiIIiIIiii("\u6e34\u6790\u6278\u5273\u76a2P~p\u57dc\u5cca\u533c\u579c"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiIiiiiII = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u9034\u8983\u6e29\u67b6"))).description(IIIIIIiiII.iiIIiIIiii("\u6609\u5445\u9009\u8985\u6e34\u6790\uff2e\u538c\u4ee3\u96d7\u58bf\u7768\u5236\uff4a"))).defaultValue((Object)(--1 != 0))).visible(() -> this.IIIIiiIiii.get())).build());
        this.ALLATORIxDEMO = this.IIiIiIIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u5f59\u72f3\u6a3a\u5f6a"))).description(IIIIIIiiII.iiIIiIIiii("\u6e34\u6790\u5f44\u72d5\u6a27\u5f4c"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.IIIIiiIiii.get())).build());
        this.iIIiIiiiIi = this.IIiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u4f9c\u9727\u9887\u8217"))).description(IIIIIIiiII.iiIIiIIiii("5;5\u57b9\u5c8f\u5359\u57d9\u76c7\u4f81\u9701\u989a\u8231"))).defaultValue(new SettingColor(3 >> 2, 0x79 & 0x7E, 0x67FF & 0x18FF, 0x3B & 0x76)).visible(() -> this.IIIIiiIiii.get())).build());
        this.IiiIiIiiIi = this.IIiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u7e84\u6724\u9887\u8217"))).description(IIIIIIiiII.iiIIiIIiii("5;5\u57b9\u5c8f\u5359\u57d9\u76c7\u7e99\u6702\u989a\u8231"))).defaultValue(new SettingColor(0x17 & 0x7C, 0x57DA & 0x28B7, 0x75FE & 0xAE7, 0x34FF & 0x4BFF)).visible(() -> this.IIIIiiIiii.get())).build());
        IiiiIIiIiI iiiiIIiIiI2 = this;
        this.iIiIiIIIII = 5 >> 3;
        this.iIiIIiIIIi = this.iIiIiIIIII;
        this.iiiIiIIiii = 3 ^ 3;
        iiiiIIiIiI2.iiiiiIIiIi = this.iiiIiIIiii;
        iiiiIIiIiI2.iIIiiIiIiI = --1;
        IiiiIIiIiI iiiiIIiIiI3 = this;
        iiiiIIiIiI2.iiiIiiIIII = new HashSet<class_2338>();
        IiiiIIiIiI iiiiIIiIiI4 = this;
        iiiiIIiIiI3.iIiiiIiIii = new HashSet<class_2338>();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIIiIiIii.ALLATORIxDEMO("l.\u0019ch\u0000\u001b0K!Z1~D;\u8b92\u66cf\u65f5\u522b\u6765\u658b\u720d\u6737\uff64"));
        }
    }

    public String ALLATORIxDEMO() {
        Object object = string;
        if (!object.isActive()) {
            return IIIIiIiIii.ALLATORIxDEMO("\u57e1\u5ccc\u5bc0\u623b\u5673_\u001b\u676f\u5434\u754d");
        }
        String string = ((IiiiIIiIiI)object).iIIiiIiIiI ? IIIIIIiiII.iiIIiIIiii("\u647f\u7d24\u4e6e") : IIIIiIiIii.ALLATORIxDEMO("\u5db7\u6699\u5039");
        Object[] objectArray = new Object[--5];
        objectArray[3 & 4] = string;
        objectArray[3 & 5] = ((IiiiIIiIiI)object).iIiIiIIIII;
        objectArray[1 ^ 3] = ((IiiiIIiIiI)object).iIIIiiiiIi.get();
        objectArray[--3] = ((IiiiIIiIiI)object).iiiiiIIiIi;
        objectArray[--4] = ((IiiiIIiIiI)object).iiiIiiIIII.size();
        return String.format(IIIIIIiiII.iiIIiIIiii("\u57dc\u5cca\u5bdf\u621f\u5652EA\u0001]KWN\u5361\u5fea\u001aE\u0004\u0000N\u0001bcZC\u5dd4\u68a3\u67c3Y&fbcZC\u6278\u5273\u001cC#'"), objectArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        int n;
        IiiiIIiIiI iiiiIIiIiI = object;
        int[][] nArrayArray = new int[--4][];
        int[] nArray = new int[5 >> 1];
        int n2 = 3 ^ 3;
        nArray[n2] = 5 >> 3;
        int n3 = 4 ^ 5;
        nArray[n3] = n3;
        nArrayArray[n2] = nArray;
        int[] nArray2 = new int[--2];
        nArray2[2 & 5] = 3 & 4;
        int n4 = --1;
        nArray2[n4] = -4 >> 2;
        nArrayArray[n4] = nArray2;
        int[] nArray3 = new int[1 ^ 3];
        nArray3[3 >> 2] = 3 & 5;
        nArray3[5 >> 2] = 5 >> 3;
        nArrayArray[--2] = nArray3;
        int[] nArray4 = new int[--2];
        nArray4[2 & 5] = -4 >> 2;
        nArray4[3 & 5] = 3 & 4;
        nArrayArray[--3] = nArray4;
        int[][] nArrayArray2 = nArrayArray;
        int n5 = nArrayArray.length;
        int n6 = n = 3 & 4;
        while (n6 < n5) {
            int n7;
            block7: {
                int n8;
                void iIiIiIIIII2;
                Object object = nArrayArray2[n];
                object = iIiIiIIIII2.method_10069((int)object[3 >> 2], 5 >> 3, (int)object[2 ^ 3]);
                int cfr_ignored_0 = 5 >> 2;
                int n9 = -4 >> 2;
                while (true) {
                    int n10;
                    int n11;
                    block6: {
                        if (n9 > 1) break;
                        int n12 = -4 >> 2;
                        while (true) {
                            int n13;
                            if (n12 > 1) break;
                            class_2338 class_23383 = object.method_10069(n11, 3 & 4, n13);
                            if (iiiiIIiIiI.iIIiiIiIiI.field_1687.method_8320(class_23383).method_26204() == class_2246.field_9987) {
                                n10 = 2 & 5;
                                break block6;
                            }
                            n12 = ++n13;
                        }
                        n10 = n8;
                    }
                    if (n10 == 0) {
                        n7 = n8;
                        break block7;
                    }
                    n9 = ++n11;
                }
                n7 = n8;
            }
            if (n7 != 0) {
                return 3 >> 1;
            }
            n6 = ++n;
        }
        return false;
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        int n;
        IiiiIIiIiI iiiiIIiIiI;
        IiiiIIiIiI iiiiIIiIiI2 = iiiiIIiIiI = iiiiIIiIiI3;
        int n2 = iiiiIIiIiI.IIiiIIIIIi.method_10263() + (int)((double)iiiiIIiIiI2.iIiIiIIIII * Math.cos((double)iiiiIIiIiI.iIiIIiIIIi * Math.PI / 180.0));
        int n3 = iiiiIIiIiI2.IIiiIIIIIi.method_10260() + (int)((double)iiiiIIiIiI.iIiIiIIIII * Math.sin((double)iiiiIIiIiI.iIiIIiIIIi * Math.PI / 180.0));
        int n4 = n = 0x7F & 0x7E;
        while (true) {
            if (n4 < 123) break;
            IiiiIIiIiI iiiiIIiIiI3 = new class_2338(n2, n, n3);
            if (!iiiiIIiIiI.iIiiiIiIii.contains(iiiiIIiIiI3)) {
                IiiiIIiIiI iiiiIIiIiI4 = iiiiIIiIiI;
                iiiiIIiIiI4.iIiiiIiIii.add((class_2338)iiiiIIiIiI3);
                if (iiiiIIiIiI4.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiiIIiIiI3).method_26204() == class_2246.field_9987 && iiiiIIiIiI.ALLATORIxDEMO((class_2338)iiiiIIiIiI3)) {
                    return (2 ^ 3) != 0;
                }
            }
            n4 = --n;
        }
        IiiiIIiIiI iiiiIIiIiI5 = iiiiIIiIiI;
        iiiiIIiIiI5.iIiIIiIIIi += (0x45ED & 0x3B7A) / Math.max(2 ^ 3, iiiiIIiIiI.iIiIiIIIII * (0x6E & 0x19));
        if (iiiiIIiIiI5.iIiIIiIIIi >= (0x497E & 0x37E9)) {
            iiiiIIiIiI.iIiIIiIIIi = 2 & 5;
        }
        return true;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1687 == null) {
            return 5 >> 3;
        }
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiiiIIiIiI iiiiIIiIiI;
        IiiiIIiIiI iiiiIIiIiI2;
        block7: {
            iiiiIIiIiI2 = this;
            if (iiiiIIiIiI2.iIIiiIiIiI.field_1724 == null || iiiiIIiIiI2.iIIiiIiIiI.field_1687 == null || !iiiiIIiIiI2.ALLATORIxDEMO()) {
                iiiiIIiIiI2.error(IIIIiIiIii.ALLATORIxDEMO("\u5f80\u9840\u576d\u4e10\u7529\u6256\u8098\u4f44\u756d\u57e1\u5ccc\u5bc0\u623b\u5673\uff64"), new Object[3 & 4]);
                iiiiIIiIiI2.toggle();
                return;
            }
            if (!iiiiIIiIiI2.iIIiiIiIiI) {
                return;
            }
            int iIiIiIIIII2 = (Integer)iiiiIIiIiI2.IIiIiiiiII.get();
            int n = this = 3 & 4;
            while (n < iIiIiIIIII2 && iiiiIIiIiI2.iIIiiIiIiI) {
                if (!iiiiIIiIiI2.iiiIiIiiIi()) {
                    iiiiIIiIiI = iiiiIIiIiI2;
                    iiiiIIiIiI2.iIIiiIiIiI = 3 & 4;
                    break block7;
                }
                n = ++this;
                IiiiIIiIiI iiiiIIiIiI3 = iiiiIIiIiI2;
                iiiiIIiIiI3.iiiIiIIiii += 5 >> 2;
                iiiiIIiIiI3.iiiiiIIiIi += 5 >> 2;
            }
            iiiiIIiIiI = iiiiIIiIiI2;
        }
        IiiiIIiIiI iiiiIIiIiI4 = iiiiIIiIiI2;
        if (iiiiIIiIiI.iiiIiIIiii >= iiiiIIiIiI4.iIiIiIIIII * iiiiIIiIiI4.iIiIiIIIII * --4) {
            IiiiIIiIiI iiiiIIiIiI5 = iiiiIIiIiI2;
            iiiiIIiIiI5.iIiIiIIIII += 3 & 5;
            iiiiIIiIiI5.iiiIiIIiii = 3 ^ 3;
            if (iiiiIIiIiI5.iIiIiIIIII > (Integer)iiiiIIiIiI2.iIIIiiiiIi.get()) {
                IiiiIIiIiI iiiiIIiIiI6 = iiiiIIiIiI2;
                iiiiIIiIiI6.iIIiiIiIiI = 2 & 5;
                iiiiIIiIiI6.info("\u641c\u7d22\u5b8c\u6210\uff01\u641c\u7d22\u8303\u56f4\u5df2\u8fbe\u5230\u6700\u5927\u503c " + String.valueOf(iiiiIIiIiI6.iIIIiiiiIi.get()) + " \u683c\u3002", new Object[3 >> 2]);
                IiiiIIiIiI iiiiIIiIiI7 = iiiiIIiIiI2;
                iiiiIIiIiI7.info("\u603b\u5171\u68c0\u67e5\u4e86 " + iiiiIIiIiI2.iiiiiIIiIi + " \u4e2a\u65b9\u5757\uff0c\u627e\u5230\u4e86 " + iiiiIIiIiI7.iiiIiiIIII.size() + " \u4e2a3x3\u57fa\u5ca9\u533a\u57df\u3002", new Object[3 ^ 3]);
                if (((Boolean)iiiiIIiIiI2.IiiiiIiIiI.get()).booleanValue() && !iiiiIIiIiI2.iiiIiiIIII.isEmpty()) {
                    iiiiIIiIiI2.iIIiiIiIiI = 3 >> 2;
                }
            }
        }
    }

    public void onDeactivate() {
        IiiiIIiIiI iiiiIIiIiI = this;
        super.onDeactivate();
        IiiiIIiIiI iiiiIIiIiI2 = this;
        iiiiIIiIiI2.info("\u57fa\u5ca9\u641c\u7d22\u5df2\u505c\u6b62\u3002\u603b\u5171\u68c0\u67e5\u4e86 " + iiiiIIiIiI.iiiiiIIiIi + " \u4e2a\u65b9\u5757\uff0c\u627e\u5230\u4e86 " + iiiiIIiIiI2.iiiIiiIIII.size() + " \u4e2a3x3\u57fa\u5ca9\u533a\u57df\u3002", new Object[5 >> 3]);
    }

    public void iiIIiIIiii() {
        IiiiIIiIiI iiiiIIiIiI = this;
        iiiiIIiIiI.iiiIiiIIII.clear();
        iiiiIIiIiI.info(IIIIiIiIii.ALLATORIxDEMO("\u5db7\u6e3e\u9621\u625b\u676c\u6265\u5255\u76bf\u57bf\u5cb2\u535f\u57e4\u7f56\u5b43\u3067"), new Object[5 >> 3]);
    }

    public void iiiIiIiiIi() {
        IiiiIIiIiI iiiiIIiIiI = this;
        iiiiIIiIiI.ALLATORIxDEMO();
        iiiiIIiIiI.info(IIIIIIiiII.iiIIiIIiii("\u91eb\u65d3\u5f26\u59a8\u641a\u7d615;\u0015\u5799\u5caf\u5379\u57f9M(m"), new Object[5 >> 3]);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1724 == null || this.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        this.IIiiIIIIIi = this.iIIiiIiIiI.field_1724.method_24515();
        this.iIiIiIIIII = 3 >> 2;
        this.iIiIIiIIIi = this.iIiIiIIIII;
        this.iiiIiIIiii = 2 & 5;
        this.iiiiiIIiIi = this.iiiIiIIiii;
        this.iIIiiIiIiI = 2 ^ 3;
        this.iiiIiiIIII.clear();
        this.iIiiiIiIii.clear();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 object) {
        void iIiIiIIIII2;
        int n;
        IiiiIIiIiI iiiiIIiIiI = iiiiIIiIiI2;
        IiiiIIiIiI iiiiIIiIiI2 = object;
        object = iiiiIIiIiI;
        int n2 = n = -4 >> 2;
        while (true) {
            if (n2 > 1) break;
            int n3 = -4 >> 2;
            while (true) {
                int n4;
                if (n3 > 1) break;
                class_2338 class_23382 = iiiiIIiIiI2.method_10069(n, 2 & 5, n4);
                if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(class_23382).method_26204() != class_2246.field_9987) {
                    return 5 >> 3;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        class_2338 class_23383 = iiiiIIiIiI2.method_10084();
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(class_23383).method_26204() != class_2246.field_9987) {
            return (3 & 4) != 0;
        }
        class_2338 class_23384 = iiiiIIiIiI2.method_10087(1 ^ 3);
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(class_23384).method_26204() == class_2246.field_9987) {
            return 5 >> 3;
        }
        if (!iIiIiIIIII2.iiiIiIiiIi(class_23384)) {
            return 3 >> 2;
        }
        if (iIiIiIIIII2.iiiIiiIIII.contains(iiiiIIiIiI2)) {
            return 3 >> 2;
        }
        void v3 = iIiIiIIIII2;
        v3.iiiIiiIIII.add((class_2338)iiiiIIiIiI2);
        if (((Boolean)v3.iIIIIIIiII.get()).booleanValue()) {
            iIiIiIIIII2.info("\ud83c\udf89 \u627e\u52303x3\u57fa\u5ca9\u533a\u57df\uff01\u4f4d\u7f6e: " + iiiiIIiIiI2.method_10263() + ", " + iiiiIIiIiI2.method_10264() + ", " + iiiiIIiIiI2.method_10260(), new Object[5 >> 3]);
            void v4 = iIiIiIIIII2;
            v4.info("\u8ddd\u79bb: " + v4.iIIiiIiIiI.field_1724.method_24515().method_19455((class_2382)iiiiIIiIiI2) + " \u683c", new Object[3 >> 2]);
        }
        if (((Boolean)iIiIiIIIII2.IiiiiIiIiI.get()).booleanValue()) {
            iIiIiIIIII2.iIIiiIiIiI = 2 & 5;
            iIiIiIIIII2.info(IIIIIIiiII.iiIIiIIiii("\u643a\u7d41\u5df4\u66c1\u505a\uff4f\u6258\u5253\u4e80\u76ad\u6821\u4f2e\u7f68\u3041"), new Object[3 >> 2]);
        }
        return true;
    }
}

