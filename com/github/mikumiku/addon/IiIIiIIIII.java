/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.misc.Pool
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockIterator
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_3726
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIiiiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiiIIIiiiI;
import com.github.mikumiku.addon.iiiIiIiiii;
import com.github.mikumiku.addon.modules.AutoWither;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.function.ToDoubleFunction;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.misc.Pool;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockIterator;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_3726;

public class IiIIiIIIII
extends iIiIiIIIii {
    private final Setting<SettingColor> IiiiiIiIiI;
    private int iiiIiIIiii;
    private final Setting<SettingColor> iIIIiiiiIi;
    private final Setting<Integer> iiiIiiIIII;
    private final Setting<Integer> iIiIIiIIIi;
    private final Setting<Integer> IIiIiiiiII;
    private iiiIiIiiii IIiiIIIIIi;
    private final Setting<AutoWither.Priority> iIiiiIiIii;
    private int iIiIiiiiII;
    private final Setting<ShapeMode> IIIIiiIiii;
    private final Pool<iiiIiIiiii> IiiIiIiiIi;
    private final ArrayList<iiiIiIiiii> IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    private final Setting<Integer> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    private static /* synthetic */ int ALLATORIxDEMO(iiiIiIiiii iiiIiIiiii2, iiiIiIiiii iiiIiIiiii3) {
        iiiIiIiiii iIiIiIIIII22 = iiiIiIiiii3;
        iiiIiIiiii iIiIiIIIII3 = iiiIiIiiii2;
        int iIiIiIIIII22 = Double.compare(PlayerUtils.distanceTo((class_2338)iIiIiIIIII3.iIiIiIIIII), PlayerUtils.distanceTo((class_2338)iIiIiIIIII22.iIiIiIIIII));
        if (iIiIiIIIII22 == 0) {
            return 5 >> 3;
        }
        if (iIiIiIIIII22 > 0) {
            return -4 >> 2;
        }
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(class_2338 class_23382, int n) {
        void iIiIiIIIII2;
        int n2 = n;
        IiIIiIIIII iIiIiIIIII3 = this;
        IiIiiiiIii.ALLATORIxDEMO(n2);
        iIiIiiIIIi.iiIIiIIiii((class_2338)iIiIiIIIII2);
        IiIiiiiIii.ALLATORIxDEMO(n2);
        IiIiiiiIii.ALLATORIxDEMO();
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }

    public IiIIiIIIII() {
        IiIIiIIIII iiIIiIIIII = this;
        super(iiiIIIiiiI.ALLATORIxDEMO("\u81f1\u52f5\u6538\u51dc\u96ba"), IiIIiIiiiI.ALLATORIxDEMO("\u81b4\u52a6\u5eb9\u9033\u51c2\u96af"));
        iiIIiIIIII.ALLATORIxDEMO = iiIIiIIIII.settings.getDefaultGroup();
        iiIIiIIIII.iIIiiIiIiI = iiIIiIIIII.settings.createGroup(iiiIIIiiiI.ALLATORIxDEMO("\u6e25\u679f"));
        iiIIiIIIII.IIiIiiiiII = iiIIiIIIII.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u6c77\u5e60\u5343\u5fdd"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u6522\u7f2e\u769f\u6c69\u5e75\u535d\u5fc8"))).defaultValue((Object)(--4))).min(3 >> 2).sliderMax(0x6F & 0x16).build());
        this.iiiIiiIIII = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u57c1\u76e7\u5343\u5fdd"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u6522\u7f2e\u769f\u57df\u76f2\u535d\u5fc8"))).defaultValue((Object)(--3))).min(3 >> 2).sliderMax(0x67 & 0x1E).build());
        this.iIiiiIiIii = this.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u4f0b\u5141\u7efe"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u4f1e\u515f\u7eeb"))).defaultValue((Object)AutoWither.Priority.iIiIiIIIII)).build());
        this.iIiIIiIIIi = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u5188\u96e5\u5eff\u8f86"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u51de\u96b8\u657e\u7f75\u4e0c\u95e8\u76c4\u5eed\u8f82\uff0e\u522c\uff45"))).defaultValue((Object)(3 >> 1))).min(4 ^ 5).sliderMax(0x1E & 0x6B).build());
        this.iiiiiIIiIi = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u65fa\u5744\u5eff\u8f86"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u65ac\u5719\u657e\u7f75\u4e0c\u95e8\u76c4\u5eed\u8f82\uff0e\u522c\uff45"))).defaultValue((Object)(4 ^ 5))).min(3 ^ 3).sliderMax(0x1A & 0x6F).build());
        this.iIIiIiiiIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u65c2\u8f35"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u5ee6\u9060\u65ed\u6672\u5420\u65dc\u8f20"))).defaultValue((Object)(5 >> 2))).build());
        this.iIiIiIIIII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u81a9\u52bb\u517a\u95b4"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u5eef\u906e\u5315\u4e31\u518c\u96ea\u606a\u5415\u81b7\u52ae\u5164\u95a1"))).defaultValue((Object)(5 >> 2))).build());
        this.IIIIiiIiii = this.iIIiiIiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u5f21\u72a5\u6a28\u5f56"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u5f7e\u72f6\u769f\u6e6f\u67d5\u65ae\u5f43"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIIIiiiiIi = this.iIIiiIiIiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u4fe4\u9771\u9895\u822b"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u76a0\u6847\u65a2\u5710\u6e2e\u6793\u769f\u4ffa\u9764\u988b\u823e"))).defaultValue(new SettingColor(0x34D7 & 0x4BED, 0x3FC9 & 0x40BF, 0x5DE9 & 0x22FE, 0x1B & 0x6E)).build());
        this.IiiiiIiIiI = this.iIIiiIiIiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u7efc\u6772\u9895\u822b"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u76a0\u6847\u65a2\u5710\u6e2e\u6793\u769f\u7ee2\u6767\u988b\u823e"))).defaultValue(new SettingColor(0x1EF5 & 0x61CF, 0x5ECB & 0x21BD, 0x7EEB & 0x1FC)).build());
        IiIIiIIIII iiIIiIIIII2 = this;
        iiIIiIIIII2.IiiIiIiiIi = new Pool(iiiIiIiiii::new);
        IiIIiIIIII iiIIiIIIII3 = this;
        iiIIiIIIII3.IIiIiIIiii = new ArrayList();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiIiiiI.ALLATORIxDEMO("\u000eb\u001bO\rK^[\u000eJ\u001fZnz~\u8bf9\u66ad\u65b9\u526e\u670e\u65f3\u725b\u6725\uff58"));
        }
    }

    public void onDeactivate() {
        this.IIiiIIIIIi = null;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiIIiIIIII iiIIiIIIII = object;
        Object object = pre;
        IiIIiIIIII iIiIiIIIII2 = iiIIiIIIII;
        if (iIiIiIIIII2.IIiiIIIIIi == null) {
            IiIIiIIIII iiIIiIIIII2 = iIiIiIIIII2;
            if (iiIIiIIIII2.iIiIiiiiII < (Integer)iiIIiIIIII2.iIiIIiIIIi.get() - (5 >> 2)) {
                return;
            }
            Object object2 = object = iIiIiIIIII2.IIiIiIIiii.iterator();
            while (object2.hasNext()) {
                iiiIiIiiii iiiIiIiiii2 = (iiiIiIiiii)object.next();
                object2 = object;
                iIiIiIIIII2.IiiIiIiiIi.free((Object)iiiIiIiiii2);
            }
            IiIIiIIIII iiIIiIIIII3 = iIiIiIIIII2;
            iiIIiIIIII3.IIiIiIIiii.clear();
            BlockIterator.register((int)((Integer)iiIIiIIIII3.IIiIiiiiII.get()), (int)((Integer)iIiIiIIIII2.iiiIiiIIII.get()), (class_23382, class_26802) -> {
                void iIiIiIIIII2;
                IiIIiIIIII iiIIiIIIII = iiIIiIIIII2;
                IiIIiIIIII iiIIiIIIII2 = class_26802;
                IiIIiIIIII iIiIiIIIII3 = iiIIiIIIII;
                iiIIiIIIII2 = iIiiiIIiIi.ALLATORIxDEMO((class_2338)iIiIiIIIII2);
                if (iIiIiIIIII3.ALLATORIxDEMO((class_2338)iIiIiIIIII2, (class_2350)iiIIiIIIII2)) {
                    IiIIiIIIII iiIIiIIIII3 = iIiIiIIIII3;
                    iiIIiIIIII3.IIiIiIIiii.add(((iiiIiIiiii)iiIIiIIIII3.IiiIiIiiIi.get()).ALLATORIxDEMO((class_2338)iIiIiIIIII2, (class_2350)iiIIiIIIII2));
                }
            });
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        void iIiIiIIIII2;
        IiIIiIIIII iiIIiIIIII = iiIIiIIIII4;
        if (iiIIiIIIII.IIiiIIIIIi == null) {
            return;
        }
        iIiIiIIIII2.renderer.box((class_2338)iiIIiIIIII.IIiiIIIIIi.iIiIiIIIII, (Color)iiIIiIIIII.iIIIiiiiIi.get(), (Color)iiIIiIIIII.IiiiiIiIiI.get(), (ShapeMode)iiIIiIIIII.IIIIiiIiii.get(), 3 ^ 3);
        iIiIiIIIII2.renderer.box(iiIIiIIIII.IIiiIIIIIi.iIiIiIIIII.method_10084(), (Color)iiIIiIIIII.iIIIiiiiIi.get(), (Color)iiIIiIIIII.IiiiiIiIiI.get(), (ShapeMode)iiIIiIIIII.IIIIiiIiii.get(), 5 >> 3);
        iIiIiIIIII2.renderer.box(iiIIiIIIII.IIiiIIIIIi.iIiIiIIIII.method_10084().method_30513(iiIIiIIIII.IIiiIIIIIi.iiiiiIIiIi, -4 >> 2), (Color)iiIIiIIIII.iIIIiiiiIi.get(), (Color)iiIIiIIIII.IiiiiIiIiI.get(), (ShapeMode)iiIIiIIIII.IIIIiiIiii.get(), 5 >> 3);
        iIiIiIIIII2.renderer.box(iiIIiIIIII.IIiiIIIIIi.iIiIiIIIII.method_10084().method_30513(iiIIiIIIII.IIiiIIIIIi.iiiiiIIiIi, 5 >> 2), (Color)iiIIiIIIII.iIIIiiiiIi.get(), (Color)iiIIiIIIII.IiiiiIiIiI.get(), (ShapeMode)iiIIiIIIII.IIIIiiIiii.get(), 3 & 4);
        IiIIiIIIII iiIIiIIIII2 = iiIIiIIIII;
        class_2338 class_23382 = iiIIiIIIII2.IIiiIIIIIi.iIiIiIIIII.method_10084().method_10084();
        IiIIiIIIII iiIIiIIIII3 = iiIIiIIIII;
        class_2338 class_23383 = iiIIiIIIII2.IIiiIIIIIi.iIiIiIIIII.method_10084().method_10084().method_30513(iiIIiIIIII3.IIiiIIIIIi.iiiiiIIiIi, -4 >> 2);
        IiIIiIIIII iiIIiIIIII4 = iiIIiIIIII3.IIiiIIIIIi.iIiIiIIIII.method_10084().method_10084().method_30513(iiIIiIIIII.IIiiIIIIIi.iiiiiIIiIi, 3 >> 1);
        iIiIiIIIII2.renderer.box((double)class_23382.method_10263() + 0.2, (double)class_23382.method_10263(), (double)class_23382.method_10263() + 0.2, (double)class_23382.method_10263() + 0.8, (double)class_23382.method_10263() + 0.7, (double)class_23382.method_10263() + 0.8, (Color)iiIIiIIIII.iIIIiiiiIi.get(), (Color)iiIIiIIIII.IiiiiIiIiI.get(), (ShapeMode)iiIIiIIIII.IIIIiiIiii.get(), 5 >> 3);
        iIiIiIIIII2.renderer.box((double)class_23383.method_10263() + 0.2, (double)class_23383.method_10263(), (double)class_23383.method_10263() + 0.2, (double)class_23383.method_10263() + 0.8, (double)class_23383.method_10263() + 0.7, (double)class_23383.method_10263() + 0.8, (Color)iiIIiIIIII.iIIIiiiiIi.get(), (Color)iiIIiIIIII.IiiiiIiIiI.get(), (ShapeMode)iiIIiIIIII.IIIIiiIiii.get(), 3 >> 2);
        iIiIiIIIII2.renderer.box((double)iiIIiIIIII4.method_10263() + 0.2, (double)iiIIiIIIII4.method_10263(), (double)iiIIiIIIII4.method_10263() + 0.2, (double)iiIIiIIIII4.method_10263() + 0.8, (double)iiIIiIIIII4.method_10263() + 0.7, (double)iiIIiIIIII4.method_10263() + 0.8, (Color)iiIIiIIIII.iIIIiiiiIi.get(), (Color)iiIIiIIIII.IiiiiIiIiI.get(), (ShapeMode)iiIIiIIIII.IIIIiiIiii.get(), 5 >> 3);
    }

    private static /* synthetic */ double ALLATORIxDEMO(iiiIiIiiii iIiIiIIIII2) {
        return PlayerUtils.distanceTo((class_2338)iIiIiIIIII2.iIiIiIIIII);
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post var1_2) {
        block29: {
            block28: {
                block27: {
                    block26: {
                        block25: {
                            block24: {
                                v0 = this;
                                this = var1_2;
                                iIiIiIIIII = v0;
                                if (iIiIiIIIII.IIiiIIIIIi != null) break block24;
                                v1 = iIiIiIIIII;
                                if (v1.iIiIiiiiII < (Integer)v1.iIiIIiIIIi.get() - (4 ^ 5)) {
                                    iIiIiIIIII.iIiIiiiiII += 2 ^ 3;
                                    return;
                                }
                                if (iIiIiIIIII.IIiIiIIiii.isEmpty()) {
                                    return;
                                }
                                switch (((AutoWither.Priority)iIiIiIIIII.iIiiiIiIii.get()).ordinal()) lbl-1000:
                                // 2 sources

                                {
                                    case 0: {
                                        if (false) ** GOTO lbl-1000
                                        iIiIiIIIII.IIiIiIIiii.sort(Comparator.comparingDouble((ToDoubleFunction<iiiIiIiiii>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, ALLATORIxDEMO(com.github.mikumiku.addon.iiiIiIiiii ), (Lcom/github/mikumiku/addon/iiiIiIiiii;)D)()));
                                    }
                                    case 1: {
                                        iIiIiIIIII.IIiIiIIiii.sort((Comparator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)I, ALLATORIxDEMO(com.github.mikumiku.addon.iiiIiIiiii com.github.mikumiku.addon.iiiIiIiiii ), (Lcom/github/mikumiku/addon/iiiIiIiiii;Lcom/github/mikumiku/addon/iiiIiIiiii;)I)());
                                    }
                                    case 2: {
                                        Collections.shuffle(iIiIiIIIII.IIiIiIIiii);
                                    }
                                }
                                iIiIiIIIII.IIiiIIIIIi = iIiIiIIIII.IIiIiIIiii.get(3 >> 2);
                            }
                            this = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8067);
                            var2_3 = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_21999);
                            var3_4 = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8791);
                            this = this == -4 >> 2 ? var2_3 : this;
                            if (this != -4 >> 2) break block25;
                            if (var2_3 == -4 >> 2) break block26;
                        }
                        if (var3_4 != -4 >> 2) break block27;
                    }
                    iIiIiIIIII.error(iiiIIIiiiI.ALLATORIxDEMO("\u809d\u530f\u4e40\u6c97\u6765\u8d84\u597b\u76bb\u8d22\u6ead"), new Object[5 >> 3]);
                    iIiIiIIIII.toggle();
                    return;
                }
                if ((Integer)iIiIiIIIII.iiiiiIIiIi.get() != 0) break block28;
                v2 = iIiIiIIIII;
                v2.ALLATORIxDEMO((class_2338)v2.IIiiIIIIIi.iIiIiIIIII, this);
                v2.ALLATORIxDEMO(v2.IIiiIIIIIi.iIiIiIIIII.method_10084(), this);
                v2.ALLATORIxDEMO(v2.IIiiIIIIIi.iIiIiIIIII.method_10084().method_30513(iIiIiIIIII.IIiiIIIIIi.iiiiiIIiIi, -4 >> 2), this);
                v2.ALLATORIxDEMO(v2.IIiiIIIIIi.iIiIiIIIII.method_10084().method_30513(iIiIiIIIII.IIiiIIIIIi.iiiiiIIiIi, 4 ^ 5), this);
                v2.ALLATORIxDEMO(v2.IIiiIIIIIi.iIiIiIIIII.method_10084().method_10084(), var3_4);
                v2.ALLATORIxDEMO(v2.IIiiIIIIIi.iIiIiIIIII.method_10084().method_10084().method_30513(iIiIiIIIII.IIiiIIIIIi.iiiiiIIiIi, -4 >> 2), var3_4);
                v2.ALLATORIxDEMO(v2.IIiiIIIIIi.iIiIiIIIII.method_10084().method_10084().method_30513(iIiIiIIIII.IIiiIIIIIi.iiiiiIIiIi, --1), var3_4);
                if (!((Boolean)v2.iIiIiIIIII.get()).booleanValue()) ** GOTO lbl-1000
                v3 = iIiIiIIIII;
                v4 = v3;
                v3.IIiiIIIIIi = null;
                v3.toggle();
                break block29;
            }
            v5 = iIiIiIIIII;
            if (v5.iiiIiIIiii < (Integer)v5.iiiiiIIiIi.get() - (3 >> 1)) {
                iIiIiIIIII.iiiIiIIiii += 4 ^ 5;
                return;
            }
            switch (iIiIiIIIII.IIiiIIIIIi.ALLATORIxDEMO) {
                case 0: {
                    v6 = iIiIiIIIII;
                    while (false) {
                    }
                    v4 = v6;
                    v6.ALLATORIxDEMO((class_2338)v6.IIiiIIIIIi.iIiIiIIIII, this);
                    v6.IIiiIIIIIi.ALLATORIxDEMO += 4 ^ 5;
                    break;
                }
                case 1: {
                    v7 = iIiIiIIIII;
                    v4 = v7;
                    v7.ALLATORIxDEMO(v7.IIiiIIIIIi.iIiIiIIIII.method_10084(), this);
                    v7.IIiiIIIIIi.ALLATORIxDEMO += 3 & 5;
                    break;
                }
                case 2: {
                    v8 = iIiIiIIIII;
                    v4 = v8;
                    v9 = iIiIiIIIII;
                    v8.ALLATORIxDEMO(v8.IIiiIIIIIi.iIiIiIIIII.method_10084().method_30513(v9.IIiiIIIIIi.iiiiiIIiIi, -4 >> 2), this);
                    v9.IIiiIIIIIi.ALLATORIxDEMO += 2 ^ 3;
                    break;
                }
                case 3: {
                    v10 = iIiIiIIIII;
                    v4 = v10;
                    v11 = iIiIiIIIII;
                    v10.ALLATORIxDEMO(v10.IIiiIIIIIi.iIiIiIIIII.method_10084().method_30513(v11.IIiiIIIIIi.iiiiiIIiIi, 3 >> 1), this);
                    v11.IIiiIIIIIi.ALLATORIxDEMO += 5 >> 2;
                    break;
                }
                case 4: {
                    v12 = iIiIiIIIII;
                    v4 = v12;
                    v12.ALLATORIxDEMO(v12.IIiiIIIIIi.iIiIiIIIII.method_10084().method_10084(), var3_4);
                    v12.IIiiIIIIIi.ALLATORIxDEMO += 4 ^ 5;
                    break;
                }
                case 5: {
                    v13 = iIiIiIIIII;
                    v4 = v13;
                    v14 = iIiIiIIIII;
                    v13.ALLATORIxDEMO(v13.IIiiIIIIIi.iIiIiIIIII.method_10084().method_10084().method_30513(v14.IIiiIIIIIi.iiiiiIIiIi, -4 >> 2), var3_4);
                    v14.IIiiIIIIIi.ALLATORIxDEMO += --1;
                    break;
                }
                case 6: {
                    v15 = iIiIiIIIII;
                    v4 = v15;
                    v16 = iIiIiIIIII;
                    v15.ALLATORIxDEMO(v15.IIiiIIIIIi.iIiIiIIIII.method_10084().method_10084().method_30513(v16.IIiiIIIIIi.iiiiiIIiIi, 3 >> 1), var3_4);
                    v16.IIiiIIIIIi.ALLATORIxDEMO += 3 >> 1;
                    break;
                }
                case 7: {
                    if (((Boolean)iIiIiIIIII.iIiIiIIIII.get()).booleanValue()) {
                        iIiIiIIIII.IIiiIIIIIi = null;
                        iIiIiIIIII.toggle();
                    }
                }
                default: lbl-1000:
                // 2 sources

                {
                    v4 = iIiIiIIIII;
                }
            }
        }
        v4.iIiIiiiiII = 0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_2350 class_23502) {
        int n;
        void iIiIiIIIII2;
        IiIIiIIIII iiIIiIIIII = iiIIiIIIII2;
        IiIIiIIIII iiIIiIIIII2 = class_23502;
        IiIIiIIIII iIiIiIIIII3 = iiIIiIIIII;
        if (iIiIiIIIII2.method_10264() > (0x7CFE & 0x3FD)) {
            return (3 & 4) != 0;
        }
        int n2 = 0;
        int n3 = 3 & 4;
        if (iiIIiIIIII2 == class_2350.field_11034 || iiIIiIIIII2 == class_2350.field_11039) {
            n3 = 1;
        }
        if (iiIIiIIIII2 == class_2350.field_11043 || iiIIiIIIII2 == class_2350.field_11035) {
            n2 = 1;
        }
        iiIIiIIIII2 = new class_2338.class_2339();
        int n4 = n = iIiIiIIIII2.method_10263() - n2;
        while (n4 <= iIiIiIIIII2.method_10263() + n2) {
            int n5 = iIiIiIIIII2.method_10260() - n3;
            while (n5 <= iIiIiIIIII2.method_10260()) {
                int n6;
                int n7 = iIiIiIIIII2.method_10264();
                while (true) {
                    int n8;
                    if (n7 > iIiIiIIIII2.method_10264() + (1 ^ 3)) break;
                    iiIIiIIIII2.method_10103(n, n8, n6);
                    if (!iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8320((class_2338)iiIIiIIIII2).method_45474()) {
                        return (3 ^ 3) != 0;
                    }
                    if (!iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8628(class_2246.field_10340.method_9564(), (class_2338)iiIIiIIIII2, class_3726.method_16194())) {
                        return (3 & 4) != 0;
                    }
                    n7 = ++n8;
                }
                n5 = ++n6;
            }
            n4 = ++n;
        }
        return true;
    }
}

