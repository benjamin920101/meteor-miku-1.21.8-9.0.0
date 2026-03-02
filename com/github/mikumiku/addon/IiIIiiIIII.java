/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.renderer.Renderer3D
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1299
 *  net.minecraft.class_1542
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3341
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIIIIiii;
import com.github.mikumiku.addon.IiIIIiIiiI;
import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiIIiiiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.github.mikumiku.addon.modules.SelfTrapPlusPlus;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.renderer.Renderer3D;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1299;
import net.minecraft.class_1542;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3341;

public class IiIIiiIIII
extends iIiIiIIIii {
    private final SettingGroup IiIiIiIIii;
    private final Setting<Boolean> iiiIiIiiII;
    private final Setting<SelfTrapPlusPlus.ToggleYMode> IIiiiiIIii;
    private final Setting<Boolean> IiiiiIIiII;
    private final Setting<SettingColor> iIIIIIiiII;
    private final Setting<Boolean> iIIiiiiIii;
    private final SettingGroup iiIIIiIIIi;
    private int iIiiiiIIII;
    private final Setting<SettingColor> iiIiIIiiii;
    private final Map<class_2338, IiIIiIIiiI> iIIiIiiIiI;
    private final Setting<SelfTrapPlusPlus.SwitchMode> iIIIIIIiII;
    private final Setting<SettingColor> iIIiiIIIIi;
    private final SettingGroup IiiiiIiIiI;
    private final SettingGroup iiiIiIIiii;
    private final Setting<Boolean> iIIIiiiiIi;
    private final Setting<SettingColor> iiiIiiIIII;
    private final Setting<Boolean> iIiIIiIIIi;
    private final IiIIiIIiiI IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private final List<IiIIIIIiii> iIiiiIiIii;
    private boolean iIiIiiiiII;
    private final Setting<Double> IIIIiiIiii;
    public static boolean IiiIiIiiIi = 3 ^ 3;
    private final Setting<Double> IIiIiIIiii;
    private class_2338 iIIiiIiIiI;
    private final Setting<ShapeMode> iiiiiIIiIi;
    private final Setting<List<class_2248>> iIIiIiiiIi;
    private final Map<class_2338, IiIIiIIiiI> iIiIiIIIII;
    private final Setting<SelfTrapPlusPlus.TrapMode> ALLATORIxDEMO;

    private /* synthetic */ class_1268 ALLATORIxDEMO() {
        IiIIiiIIII iiIIiiIIII;
        IiIIiiIIII iiIIiiIIII2 = iiIIiiIIII = iiIIiiIIII3;
        class_1799 class_17992 = iiIIiiIIII2.iIIiiIiIiI.field_1724.method_6047();
        IiIIiiIIII iiIIiiIIII3 = iiIIiiIIII2.iIIiiIiIiI.field_1724.method_6079();
        if (iiIIiiIIII2.iiiIiIiiIi(class_17992)) {
            return class_1268.field_5808;
        }
        if (iiIIiiIIII.iiiIiIiiIi((class_1799)iiIIiiIIII3)) {
            return class_1268.field_5810;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int[] ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        int n2;
        int n3;
        int n4;
        block4: {
            IiIIiiIIII iiIIiiIIII = iiIIiiIIII2;
            n4 = 3 & 4;
            n3 = 2 & 5;
            n2 = 2 & 5;
            n = 2 & 5;
            if (iiIIiiIIII.iIIiiIiIiI.field_1724 != null && iiIIiiIIII.iIIiiIiIiI.field_1687 != null) {
                void iIiIiIIIII2;
                IiIIiiIIII iiIIiiIIII2 = iiIIiiIIII.iIIiiIiIiI.field_1724.method_5829();
                if (iiIIiiIIII2.method_994(class_238.method_19316((class_3341)new class_3341(iIiIiIIIII2.method_10095())))) {
                    --n2;
                }
                if (iiIIiiIIII2.method_994(class_238.method_19316((class_3341)new class_3341(iIiIiIIIII2.method_10072())))) {
                    ++n;
                }
                if (iiIIiiIIII2.method_994(class_238.method_19316((class_3341)new class_3341(iIiIiIIIII2.method_10067())))) {
                    --n4;
                }
                if (!iiIIiiIIII2.method_994(class_238.method_19316((class_3341)new class_3341(iIiIiIIIII2.method_10078())))) break block4;
            }
        }
        int[] nArray = new int[4];
        nArray[2 & 5] = n4;
        nArray[3 >> 1] = ++n3;
        nArray[--2] = n2;
        nArray[--3] = n;
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler(priority=200)
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IiIIiiIIII iiIIiiIIII;
        IiIIiiIIII iiIIiiIIII2 = iiIIiiIIII = list;
        iiIIiiIIII2.ALLATORIxDEMO();
        IiiIiIiiIi = 3 >> 2;
        if (iiIIiiIIII2.IIiIiiiiII.iiIIiIIiii((Double)iiIIiiIIII.IIIIiiIiii.get() * 1000.0)) {
            iiIIiiIIII.iIiiiiIIII = (Integer)iiIIiiIIII.IIiiIIIIIi.get();
            iiIIiiIIII.IIiIiiiiII.ALLATORIxDEMO();
        }
        if (iiIIiiIIII.iIIiiIiIiI.field_1724 != null && iiIIiiIIII.iIIiiIiIiI.field_1687 != null) {
            void iIiIiIIIII2;
            if (iiIIiiIIII.ALLATORIxDEMO()) {
                return;
            }
            IiIIiiIIII iiIIiiIIII3 = iiIIiiIIII;
            IiIIiiIIII iiIIiiIIII4 = iiIIiiIIII;
            List<class_2338> list = iiIIiiIIII4.ALLATORIxDEMO(iiIIiiIIII3.ALLATORIxDEMO(iiIIiiIIII3.iIIiiIiIiI.field_1724.method_24515().method_10084()), iiIIiiIIII4.iIIiiIiIiI.field_1724.method_5829().method_994(class_238.method_19316((class_3341)new class_3341(iiIIiiIIII.iIIiiIiIiI.field_1724.method_24515().method_10086(5 >> 1)))));
            iiIIiiIIII3.iIiiiIiIii.clear();
            list = iiIIiiIIII3.ALLATORIxDEMO(list);
            iiIIiiIIII3.iIiiiIiIii.forEach(arg_0 -> iiIIiiIIII.ALLATORIxDEMO((Render3DEvent)iIiIiIIIII2, arg_0));
            if (iiIIiiIIII.ALLATORIxDEMO(list)) {
                iiIIiiIIII.ALLATORIxDEMO(list);
            }
        }
    }

    private /* synthetic */ boolean iiIIiIIiii() {
        if (this.ALLATORIxDEMO.get() == SelfTrapPlusPlus.TrapMode.iIiIiIIIII || this.ALLATORIxDEMO.get() == SelfTrapPlusPlus.TrapMode.iIIiIiiiIi) {
            return true;
        }
        return false;
    }

    public void onDeactivate() {
        IiIIiiIIII iiIIiiIIII = this;
        super.onDeactivate();
        iiIIiiIIII.iIiiiiIIII = (Integer)iiIIiiIIII.IIiiIIIIIi.get();
        this.IIiIiiiiII.ALLATORIxDEMO();
        IiIIiiIIII iiIIiiIIII2 = this;
        iiIIiiIIII2.iIiIiIIIII.clear();
        iiIIiiIIII2.iIIiIiiIiI.clear();
        iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO();
    }

    private /* synthetic */ boolean ALLATORIxDEMO(List<class_2338> list) {
        IiIIiiIIII iiIIiiIIII = list2;
        List<class_2338> list2 = list;
        IiIIiiIIII iIiIiIIIII2 = iiIIiiIIII;
        if (((Boolean)iIiIiIIIII2.IiiiiIIiII.get()).booleanValue() && iIiIiIIIII2.iIIiiIiIiI.field_1724.method_6115()) {
            return (3 ^ 3) != 0;
        }
        if (iIiIiIIIII2.iIiiiiIIII <= 0 || list2.isEmpty()) {
            return false;
        }
        if (iIiIiIIIII2.ALLATORIxDEMO() != null) {
            return --1 != 0;
        }
        switch (((SelfTrapPlusPlus.SwitchMode)((Object)iIiIiIIIII2.iIIIIIIiII.get())).ordinal()) {
            case 1: 
            case 2: {
                while (false) {
                }
                return iIiIiIIIII2.ALLATORIxDEMO().found();
            }
            case 3: 
            case 4: {
                return iIiIiIIIII2.iiiIiIiiIi().found();
            }
        }
        return false;
    }

    private /* synthetic */ FindItemResult iiiIiIiiIi() {
        return InvUtils.find(class_17992 -> {
            IiIIiiIIII iiIIiiIIII = iiIIiiIIII2;
            IiIIiiIIII iiIIiiIIII2 = class_17992;
            IiIIiiIIII iIiIiIIIII2 = iiIIiiIIII;
            if (iiIIiiIIII2.method_7909() instanceof class_1747 && ((List)iIiIiIIIII2.iIIiIiiiIi.get()).contains(((class_1747)iiIIiiIIII2.method_7909()).method_7711())) {
                return 5 >> 2;
            }
            return false;
        });
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        class_2338 iIiIiIIIII2;
        IiIIiiIIII iiIIiiIIII = object;
        class_2350 class_23502 = iIiIiiIIIi.iiIIiIIiii(iIiIiIIIII2, --1 != 0);
        if (class_23502 == null) {
            return 3 >> 2;
        }
        iIiIiIIIII2 = iIiIiIIIII2.method_10093(class_23502.method_10153());
        Object object = iIiIiIIIII2.method_46558();
        object = new IiIiiiIIIi((class_243)object);
        ((IiIiiiIIIi)object).iiiIiIiiIi(0x7C & 0x67);
        if (!iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO((IiIiiiIIIi)object)) {
            return (3 & 4) != 0;
        }
        object = iiIIiiIIII.ALLATORIxDEMO();
        if (object == null) {
            switch (((SelfTrapPlusPlus.SwitchMode)((Object)iiIIiiIIII.iIIIIIIiII.get())).ordinal()) {
                case 1: 
                case 2: {
                    while (false) {
                    }
                    FindItemResult findItemResult = iiIIiiIIII.ALLATORIxDEMO();
                    if (!findItemResult.found()) break;
                    IiIiiiiIii.ALLATORIxDEMO(findItemResult.slot());
                    object = class_1268.field_5808;
                    break;
                }
                case 3: 
                case 4: {
                    FindItemResult findItemResult = iiIIiiIIII.iiiIiIiiIi();
                    if (!findItemResult.found()) break;
                    if (iiIIiiIIII.iIIIIIIiII.get() == SelfTrapPlusPlus.SwitchMode.iiiiiIIiIi) {
                        IiIiiiiIii.iiiIiIiiIi(findItemResult.slot(), 0x3F & 0x6D);
                    } else {
                        IiIiiiiIii.ALLATORIxDEMO(findItemResult.slot());
                    }
                    object = class_1268.field_5808;
                }
            }
        }
        if (object == null) {
            iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO();
            return 5 >> 3;
        }
        boolean bl = iIiIiiIIIi.iiiIiIiiIi(iIiIiIIIII2, class_23502, (boolean)((Boolean)iiIIiiIIII.iIIIiiiiIi.get()), --1 != 0);
        if (((Boolean)iiIIiiIIII.iIIIiiiiIi.get()).booleanValue()) {
            iiIIiiIIII.iIIiiIiIiI.field_1724.method_6104((class_1268)object);
        }
        if (iiIIiiIIII.ALLATORIxDEMO() == null) {
            switch (((SelfTrapPlusPlus.SwitchMode)((Object)iiIIiiIIII.iIIIIIIiII.get())).ordinal()) {
                case 2: {
                    int n = iIiiiIIiIi.ALLATORIxDEMO();
                    while (false) {
                    }
                    IiIiiiiIii.IIIIiIIiII(n);
                    return bl;
                }
                case 3: {
                    IiIiiiiIii.iiiIiIiiIi(45, iIiiiIIiIi.ALLATORIxDEMO());
                    return bl;
                }
                case 4: {
                    IiIiiiiIii.IIIIiIIiII(iIiiiIIiIi.ALLATORIxDEMO());
                }
            }
        }
        return bl;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        this.iIiIiIIIII.entrySet().removeIf(entry -> {
            IiIIiiIIII iiIIiiIIII = entry2;
            Map.Entry entry2 = entry;
            IiIIiiIIII iIiIiIIIII2 = iiIIiiIIII;
            return ((IiIIiIIiiI)entry2.getValue()).iiIIiIIiii((Double)iIiIiIIIII2.IIiIiIIiii.get() * 1000.0);
        });
        this.iIIiIiiIiI.entrySet().removeIf(iIiIiIIIII2 -> ((IiIIiIIiiI)iIiIiIIIII2.getValue()).iiiIiIiiIi(1000L));
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        IiIIiiIIII iiIIiiIIII = string2;
        String string2 = string;
        IiIIiiIIII iIiIiIIIII2 = iiIIiiIIII;
        iIiIiIIIII2.info("\u5df2\u5173\u95ed\uff1a" + (String)string2, new Object[2 & 5]);
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IiIIiiIIII iiIIiiIIII = iiIIiiIIII2;
        IiIIiiIIII iiIIiiIIII2 = class_23382;
        IiIIiiIIII iIiIiIIIII2 = iiIIiiIIII;
        if (!iIiIiiIIIi.iiiIiIiiIi((class_2338)iiIIiiIIII2, 3 >> 1)) {
            return (3 ^ 3) != 0;
        }
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724.method_33571().method_1022(iiIIiiIIII2.method_46558()) <= 6.0) {
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ int ALLATORIxDEMO(int n) {
        int n2 = n;
        IiIIiiIIII iIiIiIIIII2 = this;
        if (n2 > 0) {
            return -4 >> 2;
        }
        if (n2 < 0) {
            return 5 >> 2;
        }
        return 0;
    }

    public IiIIiiIIII() {
        IiIIiiIIII iiIIiiIIII = this;
        super(iIiIiIIIii.iIIiIiiiIi, IiiIIiiiiI.ALLATORIxDEMO("\u5373\u8884\u819c\u5d8c"), IiIIIiIiiI.ALLATORIxDEMO("\u4f22\u75440%\u00169\u7575\u65d5\u570a\u569c\u4f12\u8186\u5dac\u306e"));
        iiIIiiIIII.IiIiIiIIii = iiIIiiIIII.settings.getDefaultGroup();
        iiIIiiIIII.IiiiiIiIiI = iiIIiiIIII.settings.createGroup(IiiIIiiiiI.ALLATORIxDEMO("\u6548\u7f13"));
        iiIIiiIIII.iiIIIiIIIi = iiIIiiIIII.settings.createGroup(IiIIIiIiiI.ALLATORIxDEMO("\u5f5d\u511f"));
        iiIIiiIIII.iiiIiIIiii = iiIIiiIIII.settings.createGroup(IiiIIiiiiI.ALLATORIxDEMO("\u6e44\u67ae"));
        iiIIiiIIII.IiiiiIIiII = iiIIiiIIII.IiIiIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u8fb7\u9882\u659a\u66df\u5030"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u545e\u4e4a\u8922\u6580\u66ff\u502a\u6543\u7f18\u65c4\u5721\u307f"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiIiIiiII = this.IiIiIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u4ea9\u7833\u8bc8\u65e4\u573b"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u539c\u5755\u677b\u52dc\u563e\u7833\u8bf2\u5b05\u575e\u76f9\u65cf\u572a\u4e7c\u6543\u7f18\u307f"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIIIIIiII = this.IiIiIiIIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u525a\u630e\u6a7c\u5f63"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u5271\u631f\u721f\u54bc\u76d2\u65e4\u6c83\u305f\u972f\u9ea5\u6a57\u5f72\u6776\u5392\u9716\u307f"))).defaultValue((Object)SelfTrapPlusPlus.SwitchMode.iIiIiIIIII)).build());
        this.ALLATORIxDEMO = this.IiIiIiIIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u962a\u965d\u6a7c\u5f63"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u577e\u54b7\u4eed\u4f30\u7f18\u6543\u7f18\u65c4\u5721\u307f"))).defaultValue((Object)SelfTrapPlusPlus.TrapMode.iIiIiIIIII)).build());
        class_2248[] class_2248Array = new class_2248[--3];
        class_2248Array[3 & 4] = class_2246.field_10540;
        class_2248Array[5 >> 2] = class_2246.field_22423;
        class_2248Array[--2] = class_2246.field_22108;
        this.iIIiIiiiIi = this.IiiiiIiIiI.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u65e4\u573b"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u89fc\u4f09\u7555\u76f2\u65c4\u5721\u307f"))).defaultValue(class_2248Array).build());
        this.IIIIiiIiii = this.IiiiiIiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u6563\u7f02\u5eab\u8fb3"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u6b99\u6b7c\u6548\u7f13\u4e3d\u9589\u76f2\u5e8b\u8fa9\u307f"))).defaultValue(0.125).range(0.0, 10.0).sliderRange(0.0, 10.0).build());
        this.IIiiIIIIIi = this.IiiiiIiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u6ba3\u6b7c\u6552\u7f33\u651c"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u6b99\u6b7c\u6548\u7f13\u76f2\u65c4\u5721\u650d\u91b9\u307f"))).defaultValue((Object)(--1))).range(2 ^ 3, 0x6F & 0x1A).sliderRange(2 ^ 3, 0x5F & 0x2A).build());
        this.IIiIiIIiii = this.IiiiiIiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u4f10\u7f02\u5eab\u8fb3"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u5755\u6b99\u4e77\u4f1b\u7f33\u6548\u7f13\u4e3d\u9589\u76f2\u5e8b\u8fa9\u307f"))).defaultValue(0.3).range(0.0, 10.0).sliderRange(0.0, 10.0).build());
        this.iIIiiiiIii = this.iiIIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u7997\u52f5\u659a\u512e\u9581"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u6c62\u5e2e\u798d\u52d5\u6580\u510e\u959b\u6a5c\u5721\u307f"))).defaultValue((Object)(3 >> 1))).build());
        this.IIiiiiIIii = this.iiIIIiIIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u57ee\u76a9\u7997\u52f5\u659a\u512e\u9581"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u57d4\u76a9\u798d\u52d5\u6580\u510e\u959b\u6a5c\u5721\u307f"))).defaultValue((Object)SelfTrapPlusPlus.ToggleYMode.iiiiiIIiIi)).build());
        this.iIiIIiIIIi = this.iiIIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u6f30\u8811\u659a\u512e\u9581"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u6f2a\u8831\u6580\u510e\u959b\u6a5c\u5721\u307f"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIIIiiiiIi = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u6378\u6227\u52f5\u7557"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u6568\u7f33\u65ef\u570a\u6580\u6643\u794c\u6358\u623d\u52d5\u754d\u307f"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiiiIIiIi = this.iiiIiIIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u5f3f\u72da\u6a7c\u5f63"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u6e64\u678e\u65cf\u572a\u76f2\u5497\u4eed\u9095\u5270\u307f"))).defaultValue((Object)ShapeMode.Both)).build());
        int n = 0x2FF & 0x7DFF;
        this.iiiIiiIIII = this.iiiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u7ee2\u670d\u98c1\u821e"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u65c4\u6830\u8f13\u5ea5\u76f9\u98ea\u820f"))).defaultValue(new SettingColor(n, 3 & 4, 5 >> 3, n)).build());
        this.iIIIIIiiII = this.iiiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u4ffa\u970e\u98c1\u821e"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u65cf\u683b\u4fd1\u971f\u76f2\u98e1\u8204\u307f"))).defaultValue(new SettingColor(0x18FF & 0x67FF, 2 & 5, 3 ^ 3, 0x3B & 0x76)).build());
        int n2 = 0x26FF & 0x59FF;
        this.iiIiIIiiii = this.iiiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u6572\u64fd\u7ee2\u670d\u98c1\u821e"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u6572\u64e7\u65c4\u5721\u76f9\u8f18\u5eae\u98ea\u820f"))).defaultValue(new SettingColor(n2, 2 & 5, 2 & 5, n2)).build());
        this.iIIiiIIIIi = this.iiiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIIIiIiiI.ALLATORIxDEMO("\u6572\u64fd\u4ffa\u970e\u98c1\u821e"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u6579\u64cc\u65cf\u572a\u76f2\u4fda\u9714\u98e1\u8204\u307f"))).defaultValue(new SettingColor(0x61FF & 0x1EFF, 3 & 4, 3 >> 2, 0x73 & 0x3E)).build());
        IiIIiiIIII iiIIiiIIII2 = this;
        IiIIiiIIII iiIIiiIIII3 = this;
        IiIIiiIIII iiIIiiIIII4 = this;
        iiIIiiIIII4.iIiIiIIIII = new HashMap<class_2338, IiIIiIIiiI>();
        IiIIiiIIII iiIIiiIIII5 = this;
        iiIIiiIIII3.iIIiIiiIiI = new HashMap<class_2338, IiIIiIIiiI>();
        IiIIiiIIII iiIIiiIIII6 = this;
        iiIIiiIIII3.IIiIiiiiII = new IiIIiIIiiI();
        iiIIiiIIII3.iIiiiiIIII = 3 >> 2;
        iiIIiiIIII2.iIIiiIiIiI = class_2338.field_10980;
        iiIIiiIIII2.iIiIiiiiII = 2 & 5;
        IiIIiiIIII iiIIiiIIII7 = this;
        iiIIiiIIII2.iIiiiIiIii = new ArrayList<IiIIIIIiii>();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIIiIiiI.ALLATORIxDEMO("*'_j.\t]9-\b<\u0018\u0018m]\u8bbb\u66a9\u65dc\u526d\u676c\u65ed\u7224\u6771\uff6d"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2350 ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        IiIIiiIIII iiIIiiIIII = iiIIiiIIII2;
        class_2350 class_23502 = null;
        double d = Double.MAX_VALUE;
        int n2 = -4 >> 2;
        class_2350[] class_2350Array = class_2350.values();
        int n3 = class_2350Array.length;
        int n4 = n = 5 >> 3;
        while (n4 < n3) {
            void iIiIiIIIII3;
            class_2350 class_23503 = class_2350Array[n];
            IiIIiiIIII iiIIiiIIII2 = iIiIiIIIII3.method_10093(class_23503);
            if (iIiIiiIIIi.iiiIiIiiIi((class_2338)iiIIiiIIII2, --1 != 0) && iiIIiiIIII.ALLATORIxDEMO((class_2338)iiIIiiIIII2)) {
                boolean bl = EntityUtils.intersectsWithEntity((class_238)class_238.method_19316((class_3341)new class_3341((class_2338)iiIIiiIIII2)), iIiIiIIIII2 -> {
                    if (!iIiIiIIIII2.method_7325() && iIiIiIIIII2.method_5864() == class_1299.field_6052) {
                        return (4 ^ 5) != 0;
                    }
                    return false;
                });
                boolean bl2 = EntityUtils.intersectsWithEntity((class_238)class_238.method_19316((class_3341)new class_3341((class_2338)iiIIiiIIII2)), iIiIiIIIII2 -> {
                    if (!iIiIiIIIII2.method_7325() && iIiIiIIIII2.method_5864() == class_1299.field_6110) {
                        return (4 ^ 5) != 0;
                    }
                    return false;
                });
                double d2 = iiIIiiIIII.iIIiiIiIiI.field_1724.method_33571().method_1022(iiIIiiIIII2.method_46558());
                int this_ = bl2 ? 4 ^ 5 : (bl ? --2 : 0);
                if (d2 < d || this_ > n2) {
                    class_23502 = class_23503;
                    d = d2;
                    n2 = this_;
                }
            }
            n4 = ++n;
        }
        return class_23502;
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        IiIIiiIIII iiIIiiIIII = iiIIiiIIII2;
        if ((iiIIiiIIII2 = iiIIiiIIII.ALLATORIxDEMO()) != null) {
            IiIIiiIIII iiIIiiIIII2 = iiIIiiIIII2 == class_1268.field_5808 ? iiIIiiIIII.iIIiiIiIiI.field_1724.method_6047() : iiIIiiIIII.iIIiiIiIiI.field_1724.method_6079();
            return iiIIiiIIII2.method_7947();
        }
        switch (((SelfTrapPlusPlus.SwitchMode)((Object)iiIIiiIIII.iIIIIIIiII.get())).ordinal()) {
            case 1: 
            case 2: {
                while (false) {
                }
                return iiIIiiIIII.ALLATORIxDEMO().count();
            }
            case 3: 
            case 4: {
                return iiIIiiIIII.iiiIiIiiIi().count();
            }
        }
        return 0;
    }

    @Override
    public void onActivate() {
        IiIIiiIIII iiIIiiIIII = this;
        super.onActivate();
        if (iiIIiiIIII.iIIiiIiIiI.field_1724 == null || this.iIIiiIiIiI.field_1687 == null) {
            this.toggle();
            return;
        }
        IiIIiiIIII iiIIiiIIII2 = this;
        iiIIiiIIII2.iIIiiIiIiI = iiIIiiIIII2.iIIiiIiIiI.field_1724.method_24515();
        iiIIiiIIII2.iIiiiiIIII = (Integer)iiIIiiIIII2.IIiiIIIIIi.get();
        this.IIiIiiiiII.ALLATORIxDEMO();
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        if (this.ALLATORIxDEMO.get() == SelfTrapPlusPlus.TrapMode.iIiIiIIIII || this.ALLATORIxDEMO.get() == SelfTrapPlusPlus.TrapMode.ALLATORIxDEMO) {
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_2338> ALLATORIxDEMO(List<class_2338> list) {
        void iIiIiIIIII2;
        IiIIiiIIII iiIIiiIIII = arrayList;
        ArrayList arrayList = new ArrayList();
        if (iIiIiIIIII2.isEmpty()) {
            return arrayList;
        }
        iIiIiIIIII2.forEach(class_23382 -> {
            int n;
            void iIiIiIIIII3;
            IiIIiiIIII iiIIiiIIII = iiIIiiIIII2;
            IiIIiiIIII iiIIiiIIII2 = class_23382;
            IiIIiiIIII iIiIiIIIII4 = iiIIiiIIII;
            if (!iIiIiIIIII4.iIIiiIiIiI.field_1687.method_8320((class_2338)iiIIiiIIII2).method_26215()) {
                return;
            }
            if (iIiIiiIIIi.iiiIiIiiIi((class_2338)iiIIiiIIII2, (4 ^ 5) != 0) && iIiIiIIIII4.ALLATORIxDEMO((class_2338)iiIIiiIIII2)) {
                iIiIiIIIII4.iIiiiIiIii.add(new IiIIIIIiii((class_2338)iiIIiiIIII2, 5 >> 3));
                if (!EntityUtils.intersectsWithEntity((class_238)class_238.method_19316((class_3341)new class_3341((class_2338)iiIIiiIIII2)), iIiIiIIIII2 -> {
                    if (!iIiIiIIIII2.method_7325() && !(iIiIiIIIII2 instanceof class_1542)) {
                        return --1 != 0;
                    }
                    return false;
                }) && !iIiIiIIIII4.iIiIiIIIII.containsKey(iiIIiiIIII2)) {
                    iIiIiIIIII3.add(iiIIiiIIII2);
                }
                return;
            }
            class_2350[] class_2350Array = iIiIiIIIII4.ALLATORIxDEMO((class_2338)iiIIiiIIII2);
            if (class_2350Array != null) {
                iIiIiIIIII4.iIiiiIiIii.add(new IiIIIIIiii((class_2338)iiIIiiIIII2, (3 & 4) != 0));
                iIiIiIIIII4.iIiiiIiIii.add(new IiIIIIIiii(iiIIiiIIII2.method_10093((class_2350)class_2350Array), --1 != 0));
                if (!EntityUtils.intersectsWithEntity((class_238)class_238.method_19316((class_3341)new class_3341(iiIIiiIIII2.method_10093((class_2350)class_2350Array))), iIiIiIIIII2 -> {
                    if (!iIiIiIIIII2.method_7325() && !(iIiIiIIIII2 instanceof class_1542)) {
                        return (2 ^ 3) != 0;
                    }
                    return false;
                }) && !iIiIiIIIII4.iIiIiIIIII.containsKey(iiIIiiIIII2.method_10093((class_2350)class_2350Array))) {
                    iIiIiIIIII3.add(iiIIiiIIII2.method_10093((class_2350)class_2350Array));
                }
                return;
            }
            class_2350Array = class_2350.values();
            int n2 = class_2350Array.length;
            int n3 = n = 3 ^ 3;
            while (n3 < n2) {
                class_2350 class_23502;
                class_2350 class_23503 = class_2350Array[n];
                if (iIiIiIIIII4.iIIiiIiIiI.field_1687.method_8320(iiIIiiIIII2.method_10093(class_23503)).method_26215() && iIiIiIIIII4.ALLATORIxDEMO(iiIIiiIIII2.method_10093(class_23503)) && (class_23502 = iIiIiIIIII4.ALLATORIxDEMO(iiIIiiIIII2.method_10093(class_23503))) != null) {
                    iIiIiIIIII4.iIiiiIiIii.add(new IiIIIIIiii((class_2338)iiIIiiIIII2, 3 >> 2));
                    iIiIiIIIII4.iIiiiIiIii.add(new IiIIIIIiii(iiIIiiIIII2.method_10093(class_23503), --1 != 0));
                    iIiIiIIIII4.iIiiiIiIii.add(new IiIIIIIiii(iiIIiiIIII2.method_10093(class_23503).method_10093(class_23502), 3 >> 1));
                    if (!EntityUtils.intersectsWithEntity((class_238)class_238.method_19316((class_3341)new class_3341(iiIIiiIIII2.method_10093(class_23503).method_10093(class_23502))), iIiIiIIIII2 -> {
                        if (!iIiIiIIIII2.method_7325() && !(iIiIiIIIII2 instanceof class_1542)) {
                            return --1 != 0;
                        }
                        return false;
                    }) && !iIiIiIIIII4.iIiIiIIIII.containsKey(iiIIiiIIII2.method_10093(class_23503).method_10093(class_23502))) {
                        iIiIiIIIII3.add(iiIIiiIIII2.method_10093(class_23503).method_10093(class_23502));
                    }
                    return;
                }
                n3 = ++n;
            }
        });
        return arrayList;
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_1799 class_17992) {
        IiIIiiIIII iiIIiiIIII = iiIIiiIIII2;
        IiIIiiIIII iiIIiiIIII2 = class_17992;
        IiIIiiIIII iIiIiIIIII2 = iiIIiiIIII;
        if (iiIIiiIIII2.method_7909() instanceof class_1747 && ((List)iIiIiIIIII2.iIIiIiiiIi.get()).contains(((class_1747)iiIIiiIIII2.method_7909()).method_7711())) {
            return (3 & 5) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent, IiIIIIIiii iiIIIIIiii) {
        IiIIiiIIII iiIIiiIIII;
        Color color;
        IiIIIIIiii iiIIIIIiii2;
        Color color2;
        void iIiIiIIIII2;
        IiIIiiIIII iiIIiiIIII2 = iiIIIIIiii3;
        IiIIIIIiii iiIIIIIiii3 = iiIIIIIiii;
        IiIIiiIIII iIiIiIIIII3 = iiIIiiIIII2;
        Renderer3D renderer3D = iIiIiIIIII2.renderer;
        class_238 class_2383 = class_238.method_19316((class_3341)new class_3341(iiIIIIIiii3.ALLATORIxDEMO));
        IiIIiiIIII iiIIiiIIII3 = iIiIiIIIII3;
        if (iiIIIIIiii3.iIiIiIIIII) {
            color2 = (Color)iiIIiiIIII3.iIIiiIIIIi.get();
            iiIIIIIiii2 = iiIIIIIiii3;
        } else {
            color2 = (Color)iiIIiiIIII3.iIIIIIiiII.get();
            iiIIIIIiii2 = iiIIIIIiii3;
        }
        IiIIiiIIII iiIIiiIIII4 = iIiIiIIIII3;
        if (iiIIIIIiii2.iIiIiIIIII) {
            color = (Color)iiIIiiIIII4.iiIiIIiiii.get();
            iiIIiiIIII = iIiIiIIIII3;
        } else {
            color = (Color)iiIIiiIIII4.iiiIiiIIII.get();
            iiIIiiIIII = iIiIiIIIII3;
        }
        renderer3D.box(class_2383, color2, color, (ShapeMode)iiIIiiIIII.iiiiiIIiIi.get(), 3 ^ 3);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ List<class_2338> ALLATORIxDEMO(int[] var1_3, boolean var2_4) {
        block16: {
            this = var2_4;
            iIiIiIIIII = this;
            var5_6 = new ArrayList<class_2338>();
            this = iIiIiIIIII.iIIiiIiIiI.field_1724.method_24515().method_10086(this ? --2 : 1);
            if (iIiIiIIIII.iIIiiIiIiI.field_1724 == null || iIiIiIIIII.iIIiiIiIiI.field_1687 == null) break block16;
            v0 = var4_7 = iIiIiIIIII[3 & 4] - (2 ^ 3);
            while (true) {
                if (v0 > iIiIiIIIII[4 ^ 5] + (4 ^ 5)) break;
                v1 = iIiIiIIIII[5 >> 1] - (4 ^ 5);
                while (true) {
                    block18: {
                        block17: {
                            if (v1 > iIiIiIIIII[--3] + (2 ^ 3)) break;
                            if (var4_7 == iIiIiIIIII[5 >> 3] - (4 ^ 5)) ** GOTO lbl-1000
                            if (var4_7 == iIiIiIIIII[--1] + (4 ^ 5)) lbl-1000:
                            // 2 sources

                            {
                                v2 = true;
                            } else {
                                v2 = false;
                            }
                            var6_9 = v2;
                            if (var3_8 == iIiIiIIIII[5 >> 1] - --1) ** GOTO lbl-1000
                            if (var3_8 == iIiIiIIIII[--3] + (4 ^ 5)) lbl-1000:
                            // 2 sources

                            {
                                v3 = true;
                            } else {
                                v3 = false;
                            }
                            var7_10 = v3;
                            if (!var6_9 || var7_10) break block17;
                            if (!iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(this.method_10069(iIiIiIIIII.ALLATORIxDEMO((int)var4_7), 2 & 5, (int)var3_8)).method_26215()) ** GOTO lbl-1000
                            if (iIiIiIIIII.iIIiIiiIiI.containsKey(this.method_10069(iIiIiIIIII.ALLATORIxDEMO((int)var4_7), 3 & 4, (int)var3_8))) lbl-1000:
                            // 2 sources

                            {
                                v4 = true;
                            } else {
                                v4 = false;
                            }
                            break block18;
                        }
                        if (var6_9 || !var7_10) ** GOTO lbl-1000
                        if (!iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(this.method_10069((int)var4_7, 2 & 5, iIiIiIIIII.ALLATORIxDEMO((int)var3_8))).method_26215()) ** GOTO lbl-1000
                        if (iIiIiIIIII.iIIiIiiIiI.containsKey(this.method_10069((int)var4_7, 2 & 5, iIiIiIIIII.ALLATORIxDEMO((int)var3_8)))) lbl-1000:
                        // 2 sources

                        {
                            v4 = true;
                        } else lbl-1000:
                        // 2 sources

                        {
                            v4 = false;
                        }
                    }
                    var8_11 = v4;
                    var9_12 = null;
                    if (iIiIiIIIII.iiIIiIIiii() && var6_9 != var7_10 && !var8_11) {
                        v5 = var9_12 = new class_2338((int)var4_7, this.method_10264(), (int)var3_8).method_10069(this.method_10263(), 2 & 5, this.method_10260());
                    } else {
                        if (iIiIiIIIII.iiiIiIiiIi() && !var6_9 && !var7_10) {
                            if (iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(this.method_10069((int)var4_7, 3 ^ 3, (int)var3_8)).method_26215()) {
                                if (!iIiIiIIIII.iIIiIiiIiI.containsKey(this.method_10069((int)var4_7, 5 >> 3, (int)var3_8))) {
                                    var9_12 = new class_2338((int)var4_7, this.method_10264(), (int)var3_8).method_10069(this.method_10263(), 3 & 5, this.method_10260());
                                }
                            }
                        }
                        v5 = var9_12;
                    }
                    if (v5 != null) {
                        var5_6.add(var9_12);
                    }
                    v1 = ++var3_8;
                }
                v0 = ++var4_7;
            }
        }
        return var5_6;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        IiIIiiIIII iiIIiiIIII = this;
        if (((Boolean)iiIIiiIIII.iIIiiiiIii.get()).booleanValue() && (iiIIiiIIII.iIIiiIiIiI.field_1724.method_24515().method_10263() != iiIIiiIIII.iIIiiIiIiI.method_10263() || iiIIiiIIII.iIIiiIiIiI.field_1724.method_24515().method_10260() != iiIIiiIIII.iIIiiIiIiI.method_10260())) {
            IiIIiiIIII iiIIiiIIII2 = iiIIiiIIII;
            iiIIiiIIII2.ALLATORIxDEMO(IiiIIiiiiI.ALLATORIxDEMO("\u7986\u52de\u4efb"));
            iiIIiiIIII2.toggle();
            return (2 ^ 3) != 0;
        }
        switch (((SelfTrapPlusPlus.ToggleYMode)((Object)iiIIiiIIII.IIiiiiIIii.get())).ordinal()) {
            case 3: {
                if (iiIIiiIIII.iIIiiIiIiI.field_1724.method_24515().method_10264() == iiIIiiIIII.iIIiiIiIiI.method_10264()) break;
                boolean bl = --1 != 0;
                IiIIiiIIII iiIIiiIIII3 = iiIIiiIIII;
                iiIIiiIIII3.ALLATORIxDEMO(IiIIIiIiiI.ALLATORIxDEMO("\u57ee\u76a9\u7997\u52f5\u4eea"));
                iiIIiiIIII3.toggle();
                return bl;
            }
            case 1: {
                while (false) {
                }
                if (iiIIiiIIII.iIIiiIiIiI.field_1724.method_24515().method_10264() <= iiIIiiIIII.iIIiiIiIiI.method_10264()) break;
                IiIIiiIIII iiIIiiIIII4 = iiIIiiIIII;
                iiIIiiIIII4.ALLATORIxDEMO(IiiIIiiiiI.ALLATORIxDEMO("\u546c\u4e7c\u7986\u52de\u4efb"));
                iiIIiiIIII4.toggle();
                return (4 ^ 5) != 0;
            }
            case 2: {
                if (iiIIiiIIII.iIIiiIiIiI.field_1724.method_24515().method_10264() >= iiIIiiIIII.iIIiiIiIiI.method_10264()) break;
                IiIIiiIIII iiIIiiIIII5 = iiIIiiIIII;
                iiIIiiIIII5.ALLATORIxDEMO(IiIIIiIiiI.ALLATORIxDEMO("\u547d\u4e56\u7997\u52f5\u4eea"));
                iiIIiiIIII5.toggle();
                return 5 >> 2;
            }
        }
        if (((Boolean)iiIIiiIIII.iIiIIiIIIi.get()).booleanValue()) {
            boolean bl = iiIIiiIIII.iIIiiIiIiI.field_1690.field_1832.method_1434();
            if (bl && !iiIIiiIIII.iIiIiiiiII) {
                boolean bl2 = --1 != 0;
                IiIIiiIIII iiIIiiIIII6 = iiIIiiIIII;
                iiIIiiIIII6.ALLATORIxDEMO(IiiIIiiiiI.ALLATORIxDEMO("\u6f21\u883a\u4efb"));
                iiIIiiIIII6.toggle();
                return bl2;
            }
            iiIIiiIIII.iIiIiiiiII = bl;
        }
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO(List<class_2338> list) {
        Iterator iIiIiIIIII22;
        IiIIiiIIII iiIIiiIIII = iiIIiiIIII2;
        ArrayList<IiIIiiIIII> arrayList = new ArrayList<IiIIiiIIII>();
        iIiIiIIIII22 = iIiIiIIIII22.iterator();
        while (iIiIiIIIII22.hasNext()) {
            IiIIiiIIII iiIIiiIIII2 = (class_2338)iIiIiIIIII22.next();
            if (arrayList.size() >= iiIIiiIIII.iIiiiiIIII || !iiIIiiIIII.ALLATORIxDEMO((class_2338)iiIIiiIIII2)) continue;
            arrayList.add(iiIIiiIIII2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int iIiIiIIIII22 = iiIIiiIIII.ALLATORIxDEMO();
        if (iIiIiIIIII22 <= 0) {
            return;
        }
        IiiIiIiiIi = true;
        int n = this = 3 >> 2;
        while (n < Math.min(iIiIiIIIII22, arrayList.size())) {
            class_2338 class_23382 = (class_2338)arrayList.get(this);
            if (iiIIiiIIII.iiiIiIiiIi(class_23382)) {
                IiIIiiIIII iiIIiiIIII3 = iiIIiiIIII;
                iiIIiiIIII3.iIiiiiIIII -= 5 >> 2;
                IiIIiiIIII iiIIiiIIII4 = iiIIiiIIII;
                iiIIiiIIII3.IIiIiiiiII.ALLATORIxDEMO();
                iiIIiiIIII4.iIiIiIIIII.put(class_23382, new IiIIiIIiiI());
                if (((Boolean)iiIIiiIIII4.iiiIiIiiII.get()).booleanValue()) {
                    iiIIiiIIII.iIIiIiiIiI.put(class_23382, new IiIIiIIiiI());
                }
            }
            n = ++this;
        }
        iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO();
    }

    private /* synthetic */ FindItemResult ALLATORIxDEMO() {
        return InvUtils.findInHotbar(class_17992 -> {
            IiIIiiIIII iiIIiiIIII = iiIIiiIIII2;
            IiIIiiIIII iiIIiiIIII2 = class_17992;
            IiIIiiIIII iIiIiIIIII2 = iiIIiiIIII;
            if (iiIIiiIIII2.method_7909() instanceof class_1747 && ((List)iIiIiIIIII2.iIIiIiiiIi.get()).contains(((class_1747)iiIIiiIIII2.method_7909()).method_7711())) {
                return (3 & 5) != 0;
            }
            return false;
        });
    }
}

