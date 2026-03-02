/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.renderer.text.TextRenderer
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.utils.entity.DamageUtils
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.entity.SortPriority
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.NametagUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1303
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1511
 *  net.minecraft.class_1531
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_1743
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1812
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2604
 *  net.minecraft.class_2716
 *  net.minecraft.class_2767
 *  net.minecraft.class_2824
 *  net.minecraft.class_2885
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_9362
 *  org.joml.Vector3d
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiIIiIIiI;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIIIiiiiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.iiIiiiIiii;
import com.github.mikumiku.addon.modules.AutoCrystal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.renderer.text.TextRenderer;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.entity.DamageUtils;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.NametagUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1303;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1531;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1812;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2604;
import net.minecraft.class_2716;
import net.minecraft.class_2767;
import net.minecraft.class_2824;
import net.minecraft.class_2885;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_9362;
import org.joml.Vector3d;

public class IiiIiiIiIi
extends iIiIiIIIii {
    private final Setting<Boolean> iiIIiiiIII;
    private final Setting<Set<class_1299<?>>> IiIiiIIiIi;
    private final SettingGroup IIiIiIiiii;
    private class_2338 iiIIiiIIii;
    private final Setting<Double> IIIiiIiiII;
    private final Setting<Boolean> iIIIIIiIIi;
    private final SettingGroup iIIIIiIIiI;
    private final Setting<Double> iIIIIIiIii;
    private final Setting<Boolean> IiIIiiiiIi;
    private final Setting<Double> IiiIIiIiii;
    private final Setting<Boolean> IiiIiIiIIi;
    private double iiIiiiiIii;
    private final Setting<Double> IIIiiiIiIi;
    private final List<class_1309> iIIiIiiiII;
    private final iIIIiiiiiI iiiiIiiIIi;
    private final Setting<Boolean> iiiIIiIIii;
    private final Setting<AutoCrystal.SupportMode> IiiIIiIIiI;
    private final Setting<Boolean> iIIIIiiiii;
    private final Setting<Double> IiIiIiIIii;
    private final SettingGroup iiiIiIiiII;
    private final SettingGroup IIiiiiIIii;
    private final iIIIiiiiiI IiiiiIIiII;
    private final Setting<Double> iIIIIIiiII;
    private final Map<class_2338, Long> iIIiiiiIii;
    private final Setting<SettingColor> iiIIIiIIIi;
    private final Setting<Double> iIiiiiIIII;
    private final Setting<SettingColor> iiIiIIiiii;
    private final Setting<Boolean> iIIiIiiIiI;
    private final Setting<Boolean> iIIIIIIiII;
    private final Setting<Boolean> iIIiiIIIIi;
    private final Map<Integer, Long> IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final Setting<Double> iIIIiiiiIi;
    private final SettingGroup iiiIiiIIII;
    private class_1309 iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<SortPriority> iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final SettingGroup IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private final Setting<Double> iIIiiIiIiI;
    private final Setting<Double> iiiiiIIiIi;
    private final Setting<ShapeMode> iIIiIiiiIi;
    private final Setting<Integer> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ void iiiIiIiiIi(class_2338 class_23382) {
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi2;
        IiiIiiIiIi iiiIiiIiIi2 = class_23382;
        IiiIiiIiIi iIiIiIIIII2 = iiiIiiIiIi;
        class_2350 class_23502 = iIiIiIIIII2.ALLATORIxDEMO((class_2338)iiiIiiIiIi2);
        IiiIiiIiIi.ALLATORIxDEMO(arg_0 -> IiiIiiIiIi.ALLATORIxDEMO(new class_3965(class_243.method_24953((class_2382)iiiIiiIiIi2), class_23502, (class_2338)iiiIiiIiIi2, 3 >> 2), arg_0));
        IiiIiiIiIi iiiIiiIiIi3 = iIiIiIIIII2;
        iiiIiiIiIi3.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
        iiiIiiIiIi3.iIIiiiiIii.put((class_2338)iiiIiiIiIi2, System.currentTimeMillis());
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void ALLATORIxDEMO() {
        v0 = var1_1 = this;
        v0.iIIiIiiiII.clear();
        this = v0.iIIiiIiIiI.field_1687.method_18112().iterator();
        block0: while (true) {
            v1 = this;
            while (v1.hasNext()) {
                var2_2 = (class_1297)this.next();
                if (!(var2_2 instanceof class_1309)) continue block0;
                if ((var2_2 = (class_1309)var2_2) instanceof class_1657) {
                    var3_3 = (class_1657)var2_2;
                    if (var3_3.method_31549().field_7477) continue block0;
                    if (var2_2 == var1_1.iIIiiIiIiI.field_1724) {
                        v1 = this;
                        continue;
                    }
                    if (var3_3.method_5805()) ** break;
                    continue block0;
                    if (!Friends.get().shouldAttack(var3_3)) {
                        v1 = this;
                        continue;
                    }
                    if (((Boolean)var1_1.iIIiIiiIiI.get()).booleanValue()) {
                        v2 = var3_3;
                        var4_4 = v2.method_6118(class_1304.field_6166);
                        var5_5 = v2.method_6118(class_1304.field_6172);
                        var6_6 = v2.method_6118(class_1304.field_6174);
                        var7_7 = v2.method_6118(class_1304.field_6169);
                        if (v2.method_6079().method_7960() && var3_3.method_6047().method_7960() && var4_4.method_7960() && var5_5.method_7960() && var6_6.method_7960() && var7_7.method_7960()) {
                            v1 = this;
                            continue;
                        }
                    }
                }
                if (!((Set)var1_1.IiIiiIIiIi.get()).contains(var2_2.method_5864())) {
                    v1 = this;
                    continue;
                }
                if (var2_2.method_5858((class_1297)var1_1.iIIiiIiIiI.field_1724) > (Double)var1_1.IIIiiiIiIi.get() * (Double)var1_1.IIIiiiIiIi.get()) {
                    v1 = this;
                    continue;
                }
                var1_1.iIIiIiiiII.add((class_1309)var2_2);
                v1 = this;
            }
            break;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        void iIiIiIIIII2;
        IiiIiiIiIi iiiIiiIiIi = this;
        int n = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8301);
        if (n == -4 >> 2) {
            return;
        }
        IiIiiiiIii.ALLATORIxDEMO(n);
        class_243 class_2432 = class_243.method_24953((class_2382)iIiIiIIIII2);
        if (iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(new IiIiiiIIIi(class_2432))) {
            iiiIiiIiIi.iiiIiIiiIi((class_2338)iIiIiIIIII2);
        }
        IiIiiiiIii.ALLATORIxDEMO(n);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiiIiiIiIi iIiIiIIIII2;
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi2;
        IiiIiiIiIi iiiIiiIiIi2 = pre;
        IiiIiiIiIi iiiIiiIiIi3 = iIiIiIIIII2 = iiiIiiIiIi;
        iiiIiiIiIi3.ALLATORIxDEMO();
        if (iiiIiiIiIi3.iIIiIiiiII.isEmpty()) {
            return;
        }
        IiiIiiIiIi iiiIiiIiIi4 = iIiIiIIIII2;
        iiiIiiIiIi4.iIiIIiIIIi = iiiIiiIiIi4.ALLATORIxDEMO();
        if (iiiIiiIiIi4.ALLATORIxDEMO()) {
            return;
        }
        if (iIiIiIIIII2.iiiiIiiIIi.ALLATORIxDEMO((0x16 & 0x7D) - ((Double)iIiIiIIIII2.iIiiiiIIII.get()).intValue()) && (iiiIiiIiIi2 = iIiIiIIIII2.ALLATORIxDEMO()) != null) {
            IiiIiiIiIi iiiIiiIiIi5 = iIiIiIIIII2;
            iiiIiiIiIi5.ALLATORIxDEMO((class_1511)iiiIiiIiIi2);
            iiiIiiIiIi5.iiiiIiiIIi.ALLATORIxDEMO();
        }
        if (((Boolean)iIiIiIIIII2.ALLATORIxDEMO.get()).booleanValue()) {
            if (iIiIiIIIII2.IiiiiIIiII.ALLATORIxDEMO((0x54 & 0x3F) - ((Double)iIiIiIIIII2.iIIIIIiiII.get()).intValue())) {
                iiiIiiIiIi2 = iIiIiIIIII2.ALLATORIxDEMO();
                if (iiiIiiIiIi2 != null) {
                    iIiIiIIIII2.ALLATORIxDEMO((class_2338)iiiIiiIiIi2);
                }
                iIiIiIIIII2.IiiiiIIiII.ALLATORIxDEMO();
            }
        }
    }

    private static /* synthetic */ class_2596 ALLATORIxDEMO(class_3965 class_39652, int n) {
        int iIiIiIIIII2 = n;
        class_3965 iIiIiIIIII3 = class_39652;
        return new class_2885(class_1268.field_5808, iIiIiIIIII3, iIiIiIIIII2);
    }

    @Override
    public void onActivate() {
        IiiIiiIiIi iiiIiiIiIi = this;
        IiiIiiIiIi iiiIiiIiIi2 = this;
        IiiIiiIiIi iiiIiiIiIi3 = this;
        iiiIiiIiIi3.iiIIiiIIii = null;
        iiiIiiIiIi3.iiIiiiiIii = 0.0;
        iiiIiiIiIi2.IiiiiIiIiI.clear();
        iiiIiiIiIi2.iIIiiiiIii.clear();
        iiiIiiIiIi2.IiiiiIIiII.ALLATORIxDEMO();
        iiiIiiIiIi.iiiiIiiIIi.ALLATORIxDEMO();
        iiiIiiIiIi.iIiIIiIIIi = null;
        iiiIiiIiIi.iIIiIiiiII.clear();
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi2;
        IiiIiiIiIi iiiIiiIiIi2 = class_23382;
        IiiIiiIiIi iIiIiIIIII2 = iiiIiiIiIi;
        if (!iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiIiiIiIi2).method_27852(class_2246.field_10540) && !iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiIiiIiIi2).method_27852(class_2246.field_9987)) {
            return 3 >> 2;
        }
        if (!iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)(iiiIiiIiIi2 = iiiIiiIiIi2.method_10084())).method_26215() && !iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiIiiIiIi2).method_27852(class_2246.field_10036)) {
            return (3 & 4) != 0;
        }
        IiiIiiIiIi iiiIiiIiIi3 = iiiIiiIiIi2;
        double d = iiiIiiIiIi3.method_10263();
        double d2 = iiiIiiIiIi3.method_10264();
        double d3 = iiiIiiIiIi3.method_10260();
        iiiIiiIiIi2 = new class_238(0.0, 0.0, 0.0, 1.0, 2.0, 1.0);
        iiiIiiIiIi2 = new class_238(d, d2, d3, d + ((class_238)iiiIiiIiIi2).field_1320, d2 + ((class_238)iiiIiiIiIi2).field_1325, d3 + ((class_238)iiiIiiIiIi2).field_1324);
        return iIiIiIIIII2.ALLATORIxDEMO((class_238)iiiIiiIiIi2);
    }

    private /* synthetic */ class_1309 ALLATORIxDEMO() {
        IiiIiiIiIi iiiIiiIiIi = this;
        class_1309 class_13092 = null;
        double d = Double.MAX_VALUE;
        for (class_1309 class_13093 : iiiIiiIiIi.iIIiIiiiII) {
            double d2;
            double d3 = PlayerUtils.squaredDistanceTo((class_1297)class_13093);
            if (!(d2 < d)) continue;
            class_13092 = class_13093;
            d = d3;
        }
        return class_13092;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_243 class_2432) {
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi2;
        IiiIiiIiIi iiiIiiIiIi2 = class_2432;
        IiiIiiIiIi iIiIiIIIII2 = iiiIiiIiIi;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_17742(new class_3959(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_33571(), (class_243)iiiIiiIiIi2, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)iIiIiIIIII2.iIIiiIiIiI.field_1724)).method_17783() == class_239.class_240.field_1333) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (((Boolean)this.IIiiIIIIIi.get()).booleanValue() && this.iIIiiIiIiI.field_1724.method_6115() && this.iIIiiIiIiI.field_1724.method_6030().method_7909() != class_1802.field_8301) {
            return --1 != 0;
        }
        if (((Boolean)this.iiIIiiiIII.get()).booleanValue() && this.iIIiiIiIiI.field_1724.method_6115() && this.iIIiiIiIiI.field_1724.method_6030().method_7909() instanceof class_1812) {
            return (3 & 5) != 0;
        }
        if (!((Boolean)this.iIIIIIIiII.get()).booleanValue() && this.iIIiiIiIiI.field_1761.method_2923()) {
            return (3 & 5) != 0;
        }
        return false;
    }

    public IiiIiiIiIi() {
        IiiIiiIiIi iiiIiiIiIi = this;
        super(iIiIiIIIii.iIIiIiiiIi, com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u0018\u001b\u001e'\u6c61\u6604"), iiIiiiIiii.ALLATORIxDEMO("\u81f3\u52dd\u6527\u7f3b\u54b5\u7841\u5756\u677e\u5f48\u6c41\u666f"));
        iiiIiiIiIi.IIiIiIiiii = iiiIiiIiIi.settings.getDefaultGroup();
        iiiIiiIiIi.IIiiiiIIii = iiiIiiIiIi.settings.createGroup(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u656b\u7f1c"));
        iiiIiiIiIi.iIIIIiIIiI = iiiIiiIiIi.settings.createGroup(iiIiiiIiii.ALLATORIxDEMO("\u7841\u5756"));
        iiiIiiIiIi.iiiIiIiiII = iiiIiiIiIi.settings.createGroup(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u4f71\u5bc1"));
        iiiIiiIiIi.IiiIiIiiIi = iiiIiiIiIi.settings.createGroup(iiIiiiIiii.ALLATORIxDEMO("\u5ee0\u5ebe"));
        iiiIiiIiIi.iiiIiiIIII = iiiIiiIiIi.settings.createGroup(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u6e67\u67a1"));
        class_1299[] class_1299Array = new class_1299[--3];
        class_1299Array[3 >> 2] = class_1299.field_6097;
        class_1299Array[3 & 5] = class_1299.field_38095;
        class_1299Array[1 ^ 3] = class_1299.field_6119;
        iiiIiiIiIi.IiIiiIIiIi = iiiIiiIiIi.IIiIiIiiii.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u769b\u681e"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u89d4\u6549\u518e\u76d6\u76bb\u6875"))).onlyAttackable().defaultValue(class_1299Array).build());
        this.IIIiiiIiIi = this.IIiIiIiiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u76bb\u683e\u8376\u56ed"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u644e\u7d77\u769c\u6872\u76d6\u8356\u5686"))).defaultValue(10.0).min(0.0).sliderMax(20.0).build());
        this.iIIiIiiIiI = this.IIiIiIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u5fa8\u755c\u888d\u5413"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u5fa8\u7517\u6cd4\u675b\u8890\u5975\u76f1\u73fb\u5be3\u3070"))).defaultValue((Object)(5 >> 3))).build());
        this.iIIIIIIiII = this.IIiIiIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u630f\u63cd\u65cf\u654e\u51e2"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u5114\u8bca\u577d\u6364\u63ed\u65eb\u5702\u6584\u8fae\u881e\u656e\u5189"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IIiiIIIIIi = this.IIiIiIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u8f8e\u98e6\u66f7\u5045"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u8fa9\u98aa\u65a4\u66d7\u502e"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiIIiiiIII = this.IIiIiIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u55c8\u8356\u66f7\u5045"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u55ef\u831a\u65a4\u66d7\u502e"))).defaultValue((Object)(3 >> 1))).build());
        this.iIiiiIiIii = this.IIiIiIiiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u76f7\u6852\u4f21\u513d\u7ebe"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u59d7\u4f27\u907c\u62bb\u76bb\u6875"))).defaultValue((Object)SortPriority.LowestHealth)).build());
        this.iiiIiIIiii = this.IIiIiIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u660f\u80e4\u76bb\u683e\u907c\u62f0"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u686c\u631c\u5a54\u80b3\u7a7e\u5ef4\u662f\u808f\u907c\u62bb\u76bb\u6875"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.ALLATORIxDEMO = this.IIiiiiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u654b\u7f77"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u667a\u5454\u654b\u7f3c\u6c61\u6604"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIIIIiiII = this.IIiiiiIIii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u656b\u7f57\u906a\u5ebf"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u6bbd\u79a7\u656c\u7f3b\u6c46\u6603\u76d6\u6b74\u6502"))).defaultValue(18.0).min(0.0).sliderMax(20.0).visible(() -> this.ALLATORIxDEMO.get())).build());
        this.IIIiiIiiII = this.IIiiiiIIii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u656b\u7f57\u8376\u56ed"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u656c\u7f3b\u6c46\u6603\u76d6\u8356\u5686"))).defaultValue(4.5).min(0.0).sliderMax(6.0).visible(() -> this.ALLATORIxDEMO.get())).build());
        this.IiiIIiIiii = this.IIiiiiIIii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u7a0a\u5880\u656b\u7f57\u8376\u56ed"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u7a0d\u58ec\u656c\u7f3b\u6c46\u6603\u76d6\u8356\u5686"))).defaultValue(4.5).min(0.0).sliderMax(6.0).visible(() -> this.ALLATORIxDEMO.get())).build());
        this.IiiIiIiIIi = this.IIiiiiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u81f3\u9057\u5ead\u906a\u5ebf"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u684b\u631b\u675f\u52f4\u561a\u5ea3\u8fad\u819f\u52fa\u8c56\u6506\u654b\u7f3c\u904a\u5ed4"))).defaultValue((Object)(3 >> 1))).visible(() -> this.ALLATORIxDEMO.get())).build());
        this.iiiIIiIIii = this.IIiiiiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u4e70\u6805\u65cc\u5408"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u53bf\u654c\u7f1b\u53bd\u8994\u65cb\u5464\u76d6\u6c61\u6604"))).defaultValue((Object)((3 & 4) != 0))).visible(() -> this.ALLATORIxDEMO.get())).build());
        this.IiiIIiIIiI = this.IIiiiiIIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u656b\u7f57\u5ee0\u5ebe"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u5f06\u6cd3\u677c\u545a\u9057\u4f3f\u7f3b\u6584\uff79\u656c\u7f3b\u5ee7\u5ed2\u65eb\u5702\u3070"))).defaultValue((Object)AutoCrystal.SupportMode.iiiiiIIiIi)).build());
        this.iIiIiIIIII = this.IIiiiiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u5ec0\u5e9e\u5e83\u8fc6"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u656c\u7f3b\u5ee7\u5ef2\u65cb\u5722\u545c\u76d1\u5e84\u8faa\u5269\u6525\u3070"))).defaultValue((Object)(2 ^ 3))).min(5 >> 3).visible(() -> {
            if (this.IiiIIiIIiI.get() != AutoCrystal.SupportMode.iiiiiIIiIi) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iIiiiiIIII = this.iIIIIiIIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u7861\u5776\u906a\u5ebf"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u6bbd\u79a7\u7866\u571a\u6c46\u6603\u76d6\u6b74\u6502"))).defaultValue(13.0).min(0.0).sliderMax(20.0).build());
        this.iIIIIIiIii = this.iIIIIiIIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u7861\u5776\u8376\u56ed"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u7866\u571a\u6c46\u6603\u76d6\u8356\u5686"))).defaultValue(4.5).min(0.0).sliderMax(6.0).build());
        this.IiIiIiIIii = this.iIIIIiIIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u7a0a\u5880\u7861\u5776\u8376\u56ed"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u7a0d\u58ec\u7866\u571a\u6c46\u6603\u76d6\u8356\u5686"))).defaultValue(4.0).min(0.0).sliderMax(6.0).build());
        this.iIIiiIIIIi = this.iIIIIiIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u53f4\u862f\u5f28"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u5f41\u673c\u862f\u5f63\u651d\u67ee\u65a3\u8198\u52dd\u5255\u6337\u5242\u53ba\u4e97\u7841\u571d\u6c61\u6604\u76f1\u5db7\u5122\u3070"))).defaultValue((Object)(5 >> 2))).build());
        this.IIiIiIIiii = this.iIIIIiIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u79ae\u965d\u62e4\u522f"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u9667\u6b10\u596f\u6b73\u656e\u5189\u5479\u4e52\u6c61\u6604"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiIiiiiII = this.iIIIIiIIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u62c4\u520f\u5e83\u8fc6"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u62c4\u5244\u5e83\u8f8d}\u0006\u001c1>["))).defaultValue((Object)(--5))).min(3 >> 2).sliderMax(0x37 & 0x5C).visible(() -> this.IIiIiIIiii.get())).build());
        this.iIIIiiiiIi = this.iiiIiIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u6755\u5c36\u4f51\u5baa"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u6549\u51ae\u769c\u6872\u6212\u9755\u76f6\u6775\u4f1c\u4f71\u5bc1"))).defaultValue(4.0).min(0.0).sliderMax(20.0).build());
        this.iIIiiIiIiI = this.iiiIiIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u6755\u591e\u819f\u4f3d"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u5133\u8bcd\u76d6\u6755\u5955\u819f\u8ef9\u4f71\u5bc1"))).defaultValue(19.0).min(0.0).sliderMax(20.0).build());
        this.IiIIiiiiIi = this.iiiIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u960b\u819f\u6759"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u9647\u6b30\u81bf\u6732"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIIIIiIIi = this.iiiIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u7841\u752b"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u4f4d\u513a\u656e\u5189\u4f3b\u8042\u4e10\u62d6\u7547\u76d6\u6519\u4ec8"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiiiIIiIi = this.iiiIiIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u62d1\u752b\u8045\u4e7c\u967d\u5025"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u62f6\u7567\u8062\u4e30\u762c\u5253\u6ba6"))).defaultValue(10.0).min(0.0).sliderMax(100.0).visible(() -> this.iIIIIIiIIi.get())).build());
        this.IIiIiiiiII = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u6e47\u67ca"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u6e67\u67a1\u654b\u7f3c\u4f18\u7f1c"))).defaultValue((Object)(5 >> 2))).build());
        this.iIIiIiiiIi = this.iiiIiiIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u5f37\u728f\u6a54\u5f16"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u6e40\u67a6\u76d6\u5f37\u72c4"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.IIiIiiiiII.get())).build());
        int n = 0x23FF & 0x5CFF;
        this.iiIiIIiiii = this.iiiIiiIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u4ff2\u975b\u98e9\u826b"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u6e60\u6786\u76f6\u4fd2\u9730\u98c9\u8200"))).defaultValue(new SettingColor(n, 5 >> 3, n, 0x39 & 0x6E)).visible(() -> this.IIiIiiiiII.get())).build());
        int n2 = 0x72FF & 0xDFF;
        this.iiIIIiIIIi = this.iiiIiiIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u7eea\u6758\u98e9\u826b"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u6e60\u6786\u76f6\u7eca\u6733\u98c9\u8200"))).defaultValue(new SettingColor(n2, 3 >> 2, 0x56FF & 0x29FF, n2)).visible(() -> this.IIiIiiiiII.get())).build());
        this.iIIIIiiiii = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u6e67\u67ea\u4f51\u5baa"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u6e40\u67a6\u4f76\u5be6\u504e"))).defaultValue((Object)((2 ^ 3) != 0))).visible(() -> this.IIiIiiiiII.get())).build());
        this.IIIIiiIiii = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("}0[\u0000~"))).description(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("\u0016\u00100 \u0015"))).defaultValue((Object)((3 ^ 3) != 0))).visible(() -> this.IIiIiiiiII.get())).build());
        IiiIiiIiIi iiiIiiIiIi2 = this;
        iiiIiiIiIi2.IiiiiIIiII = iIIIIiIiii.ALLATORIxDEMO();
        iiiIiiIiIi2.iiiiIiiIIi = iIIIIiIiii.ALLATORIxDEMO();
        IiiIiiIiIi iiiIiiIiIi3 = this;
        iiiIiiIiIi3.IiiiiIiIiI = new ConcurrentHashMap<Integer, Long>();
        IiiIiiIiIi iiiIiiIiIi4 = this;
        iiiIiiIiIi2.iIIiiiiIii = new ConcurrentHashMap<class_2338, Long>();
        IiiIiiIiIi iiiIiiIiIi5 = this;
        iiiIiiIiIi2.iIIiIiiiII = new ArrayList<class_1309>();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIiiiIiii.ALLATORIxDEMO("\"rW?&\\Ul\u0005}4M\u00108U\u8bee\u66a1\u6589\u5245\u6719\u65e5\u7271\u6759\uff18"));
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        return IiIiiiiIii.ALLATORIxDEMO((class_1799 iIiIiIIIII2) -> {
            if (IiIiiIIIiI.iiIIiIIiii(iIiIiIIIII2.method_7909()) || iIiIiIIIII2.method_7909() instanceof class_9362 || iIiIiIIIII2.method_7909() instanceof class_1743) {
                return true;
            }
            return false;
        });
    }

    private /* synthetic */ void iiiIiIiiIi(class_1511 class_15112) {
        IiiIiiIiIi iIiIiIIIII2;
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi2;
        IiiIiiIiIi iiiIiiIiIi2 = class_15112;
        IiiIiiIiIi iiiIiiIiIi3 = iIiIiIIIII2 = iiiIiiIiIi;
        IiiIiiIiIi iiiIiiIiIi4 = iIiIiIIIII2;
        iiiIiiIiIi3.iIIiiIiIiI.method_1562().method_52787((class_2596)class_2824.method_34206((class_1297)iiiIiiIiIi2, (boolean)iiiIiiIiIi4.iIIiiIiIiI.field_1724.method_5715()));
        iiiIiiIiIi4.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
        iiiIiiIiIi3.IiiiiIiIiI.put(iiiIiiIiIi2.method_5628(), System.currentTimeMillis());
    }

    private /* synthetic */ class_1511 ALLATORIxDEMO() {
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi3;
        IiiIiiIiIi iiiIiiIiIi2 = null;
        double d = 0.0;
        Iterator iterator = iiiIiiIiIi.iIIiiIiIiI.field_1687.method_18112().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                IiiIiiIiIi iiiIiiIiIi3 = (class_1297)iterator.next();
                if (!(iiiIiiIiIi3 instanceof class_1511)) continue block0;
                if (!(iiiIiiIiIi3 = (class_1511)iiiIiiIiIi3).method_5805()) {
                    iterator2 = iterator;
                    continue;
                }
                if (iiiIiiIiIi.iIIiiIiIiI.field_1724.method_33571().method_1022(iiiIiiIiIi3.method_19538()) > (Double)iiiIiiIiIi.iIIIIIiIii.get()) {
                    iterator2 = iterator;
                    continue;
                }
                if (!iiiIiiIiIi.ALLATORIxDEMO(iiiIiiIiIi3.method_19538()) && iiiIiiIiIi.iIIiiIiIiI.field_1724.method_33571().method_1022(iiiIiiIiIi3.method_19538()) > (Double)iiiIiiIiIi.IiIiIiIIii.get()) {
                    iterator2 = iterator;
                    continue;
                }
                if (((Boolean)iiiIiiIiIi.IIiIiIIiii.get()).booleanValue() && iiiIiiIiIi.IiiiiIiIiI.containsKey(iiiIiiIiIi3.method_5628())) {
                    long l = iiiIiiIiIi.IiiiiIiIiI.get(iiiIiiIiIi3.method_5628());
                    if (System.currentTimeMillis() - l < (long)((Integer)iiiIiiIiIi.iIiIiiiiII.get()).intValue() * 50L) {
                        iterator2 = iterator;
                        continue;
                    }
                }
                IiiIiiIiIi iiiIiiIiIi4 = iiiIiiIiIi;
                double d2 = DamageUtils.crystalDamage((class_1309)iiiIiiIiIi4.iIiIIiIIIi, (class_243)iiiIiiIiIi3.method_19538());
                double d3 = DamageUtils.crystalDamage((class_1309)iiiIiiIiIi4.iIIiiIiIiI.field_1724, (class_243)iiiIiiIiIi3.method_19538());
                if (d2 < (Double)iiiIiiIiIi.iIIIiiiiIi.get()) {
                    iterator2 = iterator;
                    continue;
                }
                if (d3 > (Double)iiiIiiIiIi.iIIiiIiIiI.get()) {
                    iterator2 = iterator;
                    continue;
                }
                if (((Boolean)iiiIiiIiIi.IiIIiiiiIi.get()).booleanValue() && d3 >= (double)EntityUtils.getTotalHealth((class_1309)iiiIiiIiIi.iIIiiIiIiI.field_1724)) {
                    iterator2 = iterator;
                    continue;
                }
                if (!(d2 > d)) continue block0;
                iiiIiiIiIi2 = iiiIiiIiIi3;
                d = d2;
                continue block0;
            }
            break;
        }
        return iiiIiiIiIi2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1511 class_15112) {
        void iIiIiIIIII2;
        IiiIiiIiIi iiiIiiIiIi;
        IiiIiiIiIi iiiIiiIiIi2 = iiiIiiIiIi = this;
        int n = iiiIiiIiIi2.ALLATORIxDEMO();
        if (((Boolean)iiiIiiIiIi2.iIIiiIIIIi.get()).booleanValue() && iiiIiiIiIi.iIIiiIiIiI.field_1724.method_6059(class_1294.field_5911)) {
            if (n != -4 >> 2) {
                IiIiiiiIii.ALLATORIxDEMO(n);
            }
        }
        class_243.method_24953((class_2382)iIiIiIIIII2.method_24515());
        IiIiiiIIIi iiIiiiIIIi = new IiIiiiIIIi((float)Rotations.getYaw((class_243)iIiIiIIIII2.method_19538()), (float)Rotations.getPitch((class_243)iIiIiIIIII2.method_19538()));
        if (iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(iiIiiiIIIi)) {
            iiiIiiIiIi.iiiIiIiiIi((class_1511)iIiIiIIIII2);
        }
        if (((Boolean)iiiIiiIiIi.iIIiiIIIIi.get()).booleanValue() && iiiIiiIiIi.iIIiiIiIiI.field_1724.method_6059(class_1294.field_5911)) {
            if (n != -4 >> 2) {
                IiIiiiiIii.ALLATORIxDEMO(n);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2350 ALLATORIxDEMO(class_2338 class_23382) {
        void iIiIiIIIII2;
        IiiIiiIiIi iiiIiiIiIi = this;
        void v0 = iIiIiIIIII2;
        int n = v0.method_10263();
        int n2 = v0.method_10264();
        int n3 = v0.method_10260();
        if (((Boolean)iiiIiiIiIi.iiiIIiIIii.get()).booleanValue()) {
            if (iiiIiiIiIi.iIIiiIiIiI.field_1724.method_23318() >= (double)iIiIiIIIII2.method_10264()) {
                return class_2350.field_11036;
            }
            this = iiiIiiIiIi.iIIiiIiIiI.field_1687.method_17742(new class_3959(iiiIiiIiIi.iIIiiIiIiI.field_1724.method_33571(), new class_243((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)iiiIiiIiIi.iIIiiIiIiI.field_1724));
            if (this != null && this.method_17783() == class_239.class_240.field_1332) {
                return this.method_17780();
            }
        } else {
            if (iiiIiiIiIi.iIIiiIiIiI.field_1687.method_24794((class_2338)iIiIiIIIII2)) {
                return class_2350.field_11033;
            }
            this = iiiIiiIiIi.iIIiiIiIiI.field_1687.method_17742(new class_3959(iiiIiiIiIi.iIIiiIiIiI.field_1724.method_33571(), new class_243((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)iiiIiiIiIi.iIIiiIiIiI.field_1724));
            if (this != null && this.method_17783() == class_239.class_240.field_1332) {
                return this.method_17780();
            }
        }
        return class_2350.field_11036;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_243 class_2432, class_1297 class_12972) {
        void iIiIiIIIII2;
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi2;
        IiiIiiIiIi iiiIiiIiIi2 = class_12972;
        IiiIiiIiIi iIiIiIIIII3 = iiiIiiIiIi;
        if (iiiIiiIiIi2 instanceof class_1511 && iiiIiiIiIi2.method_19538().method_1022((class_243)iIiIiIIIII2) < 12.0) {
            iIiIiIIIII3.IiiiiIiIiI.remove(iiiIiiIiIi2.method_5628());
        }
    }

    private /* synthetic */ class_2338 ALLATORIxDEMO() {
        IiiIiiIiIi iiiIiiIiIi = iterator;
        class_2338 class_23382 = null;
        double d = 0.0;
        Iterator<class_2338> iterator = iiIIiiiIIi.ALLATORIxDEMO((Double)iiiIiiIiIi.IIIiiIiiII.get()).iterator();
        block0: while (true) {
            Iterator<class_2338> iterator2 = iterator;
            while (iterator2.hasNext()) {
                class_2338 class_23383 = (class_2338)iterator.next();
                if (!iiiIiiIiIi.ALLATORIxDEMO(class_23383)) {
                    iterator2 = iterator;
                    continue;
                }
                if (iiiIiiIiIi.iIIiiIiIiI.field_1724.method_33571().method_1022(class_243.method_24953((class_2382)class_23383)) > (Double)iiiIiiIiIi.IIIiiIiiII.get()) {
                    iterator2 = iterator;
                    continue;
                }
                if (!iiiIiiIiIi.ALLATORIxDEMO(class_243.method_24953((class_2382)class_23383)) && iiiIiiIiIi.iIIiiIiIiI.field_1724.method_33571().method_1022(class_243.method_24953((class_2382)class_23383)) > (Double)iiiIiiIiIi.IiiIIiIiii.get()) {
                    iterator2 = iterator;
                    continue;
                }
                class_243 class_2432 = class_243.method_24954((class_2382)class_23383).method_1031(0.5, 1.0, 0.5);
                IiiIiiIiIi iiiIiiIiIi2 = iiiIiiIiIi;
                double d2 = DamageUtils.crystalDamage((class_1309)iiiIiiIiIi2.iIiIIiIIIi, (class_243)class_2432);
                double d3 = DamageUtils.crystalDamage((class_1309)iiiIiiIiIi2.iIIiiIiIiI.field_1724, (class_243)class_2432);
                if (d2 < (Double)iiiIiiIiIi.iIIIiiiiIi.get()) {
                    iterator2 = iterator;
                    continue;
                }
                if (d3 > (Double)iiiIiiIiIi.iIIiiIiIiI.get()) {
                    iterator2 = iterator;
                    continue;
                }
                if (((Boolean)iiiIiiIiIi.IiIIiiiiIi.get()).booleanValue() && d3 >= (double)EntityUtils.getTotalHealth((class_1309)iiiIiiIiIi.iIIiiIiIiI.field_1724)) {
                    iterator2 = iterator;
                    continue;
                }
                if (((Boolean)iiiIiiIiIi.iIIIIIiIIi.get()).booleanValue()) {
                    IiiIiiIiIi iiiIiiIiIi3 = iiiIiiIiIi;
                    d2 += iiiIiiIiIi3.ALLATORIxDEMO(iiiIiiIiIi3.iIiIIiIIIi);
                }
                if (!(d2 > d)) continue block0;
                class_23382 = class_23383;
                d = d2;
                IiiIiiIiIi iiiIiiIiIi4 = iiiIiiIiIi;
                iiiIiiIiIi4.iiIIiiIIii = class_23383;
                iiiIiiIiIi4.iiIiiiiIii = d2;
                continue block0;
            }
            break;
        }
        return class_23382;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        class_2604 class_26042;
        void iIiIiIIIII2;
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi2;
        IiiIiiIiIi iiiIiiIiIi2 = iIiIiIIIII2.packet;
        if (iiiIiiIiIi2 instanceof class_2604 && (class_26042 = (class_2604)iiiIiiIiIi2).method_11169() == class_1299.field_6110) {
            iiiIiiIiIi2 = class_2338.method_49637((double)class_26042.method_11175(), (double)(class_26042.method_11174() - 1.0), (double)class_26042.method_11176());
            iiiIiiIiIi.iIIiiiiIii.remove(iiiIiiIiIi2);
        }
        if ((iiiIiiIiIi2 = iIiIiIIIII2.packet) instanceof class_2716) {
            class_26042 = (class_2716)iiiIiiIiIi2;
            iiiIiiIiIi2 = class_26042.method_36548().iterator();
            Object object = iiiIiiIiIi2;
            while (object.hasNext()) {
                int n = (Integer)iiiIiiIiIi2.next();
                object = iiiIiiIiIi2;
                iiiIiiIiIi.IiiiiIiIiI.remove(n);
            }
        }
        if ((iiiIiiIiIi2 = iIiIiIIIII2.packet) instanceof class_2767 && (class_26042 = (class_2767)iiiIiiIiIi2).method_11894().comp_349() == class_3417.field_15152.comp_349() && class_26042.method_11888() == class_3419.field_15245) {
            iiiIiiIiIi2 = new class_243(class_26042.method_11890(), class_26042.method_11889(), class_26042.method_11893());
            iiiIiiIiIi.iIIiiIiIiI.field_1687.method_18112().forEach(arg_0 -> iiiIiiIiIi.ALLATORIxDEMO((class_243)iiiIiiIiIi2, arg_0));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_238 class_2383) {
        void iIiIiIIIII2;
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi2;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(iiiIiiIiIi.iIIiiIiIiI.field_1687.method_8335(null, (class_238)iIiIiIIIII2));
        if (copyOnWriteArrayList.isEmpty()) {
            return (3 & 5) != 0;
        }
        for (IiiIiiIiIi iiiIiiIiIi2 : copyOnWriteArrayList) {
            block7: {
                block6: {
                    if (iiiIiiIiIi2 == null || !iiiIiiIiIi2.method_5805() || iiiIiiIiIi2 instanceof class_1531 || iiiIiiIiIi2 instanceof class_1303) break block6;
                    if (!(iiiIiiIiIi2 instanceof class_1542)) break block7;
                    if (((class_1297)iiiIiiIiIi2).field_6012 > (0xE & 0x7B)) break block7;
                }
                copyOnWriteArrayList.remove(iiiIiiIiIi2);
                continue;
            }
            if (iiiIiiIiIi2 instanceof class_1511 && ((class_1511)iiiIiiIiIi2).method_5829().method_994((class_238)iIiIiIIIII2)) {
                return 5 >> 3;
            }
            copyOnWriteArrayList.remove(iiiIiiIiIi2);
        }
        return copyOnWriteArrayList.isEmpty();
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        IiiIiiIiIi iiiIiiIiIi = string2;
        String string2 = string;
        IiiIiiIiIi iIiIiIIIII2 = iiiIiiIiIi;
        if (((Boolean)iIiIiIIIII2.IIIIiiIiii.get()).booleanValue()) {
            iIiIiIIIII2.info(string2, new Object[5 >> 3]);
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IiiIiiIiIi iiiIiiIiIi = iiiIiiIiIi2;
        IiiIiiIiIi iiiIiiIiIi2 = render3DEvent;
        IiiIiiIiIi iIiIiIIIII2 = iiiIiiIiIi;
        if (!((Boolean)iIiIiIIIII2.IIiIiiiiII.get()).booleanValue() || iIiIiIIIII2.iiIIiiIIii == null) {
            return;
        }
        IiiIiiIiIi iiiIiiIiIi3 = iIiIiIIIII2;
        ((Render3DEvent)iiiIiiIiIi2).renderer.box(iiiIiiIiIi3.iiIIiiIIii, (Color)iiiIiiIiIi3.iiIiIIiiii.get(), (Color)iIiIiIIIII2.iiIIIiIIIi.get(), (ShapeMode)iIiIiIIIII2.iIIiIiiiIi.get(), 3 ^ 3);
        if (((Boolean)iIiIiIIIII2.iIIIIiiiii.get()).booleanValue() && iIiIiIIIII2.iiIiiiiIii > 0.0) {
            Object[] objectArray = new Object[4 ^ 5];
            objectArray[5 >> 3] = iIiIiIIIII2.iiIiiiiIii;
            String.format(com.github.mikumiku.addon.IiiIIiIIiI.ALLATORIxDEMO("P|d\u0014"), objectArray);
            new class_243((double)iIiIiIIIII2.iiIIiiIIii.method_10263() + 0.5, (double)iIiIiIIIII2.iiIIiiIIii.method_10264() + 0.5, (double)iIiIiIIIII2.iiIIiiIIii.method_10260() + 0.5);
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        IiiIiiIiIi iiiIiiIiIi = object;
        Object object = render2DEvent;
        IiiIiiIiIi iIiIiIIIII2 = iiiIiiIiIi;
        if (((Boolean)iIiIiIIIII2.iIIIIiiiii.get()).booleanValue() && iIiIiIIIII2.iiIiiiiIii > 0.0) {
            object = new Vector3d();
            IiiIiiIiIi iiiIiiIiIi2 = object;
            iiiIiiIiIi2.set((double)iIiIiIIIII2.iiIIiiIIii.method_10263() + 0.5, (double)iIiIiIIIII2.iiIIiiIIii.method_10264() + 0.5, (double)iIiIiIIIII2.iiIIiiIIii.method_10260() + 0.5);
            if (NametagUtils.to2D((Vector3d)iiiIiiIiIi2, (double)1.25)) {
                NametagUtils.begin((Vector3d)object);
                TextRenderer.get().begin(1.0, (3 ^ 3) != 0, 5 >> 2);
                Object[] objectArray = new Object[--1];
                objectArray[2 & 5] = iIiIiIIIII2.iiIiiiiIii;
                object = String.format(iiIiiiIiii.ALLATORIxDEMO("p\u0017D\u007f"), objectArray);
                double d = TextRenderer.get().getWidth((String)object) / 2.0;
                TextRenderer.get().render((String)object, -d, 0.0, (Color)iIiIiIIIII2.iiIIIiIIIi.get(), (2 ^ 3) != 0);
                TextRenderer.get().end();
                NametagUtils.end();
            }
        }
    }

    private /* synthetic */ double ALLATORIxDEMO(class_1309 class_13092) {
        int n;
        class_1799[] class_1799Array = class_1799Array2;
        class_1799[] class_1799Array2 = class_13092;
        class_1799[] iIiIiIIIII2 = class_1799Array;
        double d = 0.0;
        class_1799[] class_1799Array3 = new class_1799[--4];
        class_1799Array3[5 >> 3] = class_1799Array2.method_6118(class_1304.field_6169);
        class_1799Array3[--1] = class_1799Array2.method_6118(class_1304.field_6174);
        class_1799Array3[--2] = class_1799Array2.method_6118(class_1304.field_6172);
        class_1799Array3[--3] = class_1799Array2.method_6118(class_1304.field_6166);
        class_1799Array2 = class_1799Array3;
        int n2 = class_1799Array3.length;
        int n3 = n = 3 >> 2;
        while (n3 < n2) {
            class_1799 class_17992 = class_1799Array2[n];
            if (!class_17992.method_7960() && (double)(class_17992.method_7936() - class_17992.method_7919()) / (double)class_17992.method_7936() * 100.0 < (Double)iIiIiIIIII2.iiiiiIIiIi.get()) {
                d += 2.0;
            }
            n3 = ++n;
        }
        return d;
    }
}

