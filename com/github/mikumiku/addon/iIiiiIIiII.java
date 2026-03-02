/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalNear
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.utils.BetterBlockPos
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightModes
 *  meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1703
 *  net.minecraft.class_1713
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_243
 *  net.minecraft.class_2480
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_465
 *  net.minecraft.class_9288
 *  net.minecraft.class_9334
 *  org.jetbrains.annotations.Nullable
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.utils.BetterBlockPos;
import com.github.mikumiku.addon.IIIiiIIiiI;
import com.github.mikumiku.addon.IIIiiiIiiI;
import com.github.mikumiku.addon.IiIIIiIiiI;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iIIIIiIIII;
import com.github.mikumiku.addon.iIIIIiiiIi;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiIIIIII;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiiIIIiIII;
import com.github.mikumiku.addon.modules.MEnum;
import com.github.mikumiku.addon.modules.UniversalSupply;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightModes;
import meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_465;
import net.minecraft.class_9288;
import net.minecraft.class_9334;
import org.jetbrains.annotations.Nullable;

public class iIiiiIIiII
extends iIiIiIIIii {
    private final Setting<Integer> IiiIIiIIiI;
    private double iIIIIiiiii;
    private final SettingGroup IiIiIiIIii;
    private final Setting<Integer> iiiIiIiiII;
    private final SettingGroup IIiiiiIIii;
    private final SettingGroup IiiiiIIiII;
    private final Setting<Integer> iIIIIIiiII;
    private final Setting<Integer> iIIiiiiIii;
    public static long iiIIIiIIIi = 0L;
    private int iIiiiiIIII;
    private final Setting<MEnum.LandingMode> iiIiIIiiii;
    public Setting<Boolean> iIIiIiiIiI;
    private final Setting<Integer> iIIIIIIiII;
    public boolean iIIiiIIIIi;
    private final Setting<Integer> IiiiiIiIiI;
    private final Setting<Integer> iiiIiIIiii;
    private final Setting<Integer> iIIIiiiiIi;
    private class_243 iiiIiiIIII;
    private final Setting<Integer> iIiIIiIIIi;
    private final SettingGroup IIiIiiiiII;
    private class_2338 IIiiIIIIIi;
    private double iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private boolean IIIIiiIiii;
    private final Setting<Integer> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    public class_2338 iiiiiIIiIi;
    public Setting<Boolean> iIIiIiiiIi;
    private UniversalSupply.SupplyState iIiIiIIIII;
    private final Setting<Integer> ALLATORIxDEMO;

    private /* synthetic */ boolean IIiIiIiIiI() {
        if (IiIiiIIIiI.ALLATORIxDEMO(class_1802.field_8639) < (Integer)this.iiiIiIiiII.get()) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ void iiiiiIiIII() {
        this.ALLATORIxDEMO(class_1802.field_8233);
    }

    private /* synthetic */ void iiIIiiiIII() {
        if (this.iIIiiIiIiI.field_1755 != null) {
            iIiiiIIiII iIiiiIIiII2 = this;
            iIiiiIIiII2.iIIiiIiIiI.field_1724.method_3137();
            iIiiiIIiII2.info(IIIiiIIiiI.iiIIiIIiii("\u5d8b\u5111\u9594\u4f9f\u5b01\u754a\u6752\u5f13\u7bc8"), new Object[3 >> 2]);
        }
        this.iIiIiIIIII = UniversalSupply.SupplyState.iIIiiIiIiI;
    }

    private /* synthetic */ void IiIiiIiiiI() {
        iIiiiIIiII iIiiiIIiII2;
        int n;
        Object object;
        iIiiiIIiII iIiiiIIiII3;
        block17: {
            Iterator iterator;
            iIiiiIIiII3 = stringBuilder;
            if (iIiiiIIiII3.iIIiiIiIiI.field_1755 == null) {
                iIiiiIIiII3.info(IIIiiIIiiI.iiIIiIIiii("\u7b2b\u5ffc\u5bfb\u5631\u750e\u973b\u6211\u5f59LWLYj\u7515\u9700\u4e43\u7a18P"), new Object[3 & 4]);
                return;
            }
            if (!(iIiiiIIiII3.iIIiiIiIiI.field_1755 instanceof class_465)) {
                iIiiiIIiII iIiiiIIiII4 = iIiiiIIiII3;
                iIiiiIIiII4.info("\u7b49\u5f85\u5bb9\u5668\u754c\u9762\u6253\u5f00... (\u5f53\u524d\u754c\u9762: " + iIiiiIIiII4.iIIiiIiIiI.field_1755.getClass().getSimpleName() + ")", new Object[3 & 4]);
                return;
            }
            object = (class_465)iIiiiIIiII3.iIIiiIiIiI.field_1755;
            class_1703 class_17032 = object.method_17577();
            iIiiiIIiII3.info("\u5bb9\u5668\u754c\u9762\u5df2\u6253\u5f00: " + object.getClass().getSimpleName(), new Object[3 & 4]);
            if (iiiIIIiIII.ALLATORIxDEMO() <= --1) {
                iIiiiIIiII3.info(IiIIIiIiiI.ALLATORIxDEMO("\u5edf\u5b25\u7a36\u9589\u4e41\u8dee\uff60\u81ae\u5c7d\u4fa0\u7515\u4e5d\u6850\u7a27\u4f21"), new Object[2 & 5]);
                iIiiiIIiII3.iIiIiIIIII = UniversalSupply.SupplyState.iIiiiIiIii;
                return;
            }
            object = iIiiiIIiII3.iiiIiIiiIi();
            if (object.isEmpty()) {
                iIiiiIIiII3.info(IIIiiIIiiI.iiIIiIIiii("\u6219\u674b\u7230\u54a3\u6509\u91ad\u513c\u8df1\uff55\u6582\u9779\u8807\u513c"), new Object[3 ^ 3]);
                iIiiiIIiII3.iIiIiIIIII = UniversalSupply.SupplyState.iIiiiIiIii;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder(IiIIIiIiiI.ALLATORIxDEMO("\u976c\u89dc\u8809\u5138\u76c8\u7234\u54adgL"));
            Iterator iterator2 = iterator = object.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry entry = iterator.next();
                stringBuilder.append(((class_1792)entry.getKey()).method_63680().getString()).append(IIIiiIIiiI.iiIIiIIiii("B\u0001")).append(entry.getValue()).append(IiIIIiIiiI.ALLATORIxDEMO("qL"));
                iterator2 = iterator;
            }
            iIiiiIIiII3.info(stringBuilder.toString(), new Object[5 >> 3]);
            int n2 = 2 & 5;
            int n3 = class_17032.field_7761.size() - (0x65 & 0x3E);
            iIiiiIIiII3.info("\u5bb9\u5668\u69fd\u4f4d\u6570: " + n3 + ", \u603b\u69fd\u4f4d\u6570: " + class_17032.field_7761.size(), new Object[2 & 5]);
            int n4 = this = 3 & 4;
            while (n4 < n3) {
                class_1799 class_17992 = class_17032.method_7611(this).method_7677();
                if (!class_17992.method_7960()) {
                    iIiiiIIiII3.info("\u69fd\u4f4d " + this + ": " + class_17992.method_7909().method_63680().getString() + " x" + class_17992.method_7947(), new Object[3 >> 2]);
                    class_1792 class_17922 = class_17992.method_7909();
                    if (class_17922 instanceof class_1747 && (class_17922 = ((class_1747)class_17922).method_7711()) instanceof class_2480) {
                        int n5;
                        block16: {
                            int n6 = 5 >> 3;
                            for (class_1792 class_17923 : object.keySet()) {
                                if (!iiiIIIiIII.ALLATORIxDEMO(class_17992, class_17923)) continue;
                                n5 = n6 = --1;
                                break block16;
                            }
                            n5 = n6;
                        }
                        if (n5 != 0) {
                            iIiiiIIiII3.info(IIIiiIIiiI.iiIIiIIiii("\u53a8\u73f2\u535c\u5469\u76b7\u6845\u7230\u54a3\u76fd\u6f3e\u5f08\u7690\uff55\u5f62\u59b2\u63b2\u53af"), new Object[3 >> 2]);
                            iIiiiIIiII iIiiiIIiII5 = iIiiiIIiII3;
                            iIiiiIIiII5.iIIiiIiIiI.field_1761.method_2906(class_17032.field_7763, this, 2 & 5, class_1713.field_7794, (class_1657)iIiiiIIiII3.iIIiiIiIiI.field_1724);
                            n2 = 2 ^ 3;
                            iIiiiIIiII5.info("\u63d0\u53d6\u4e86 " + class_17992.method_7947() + " \u4e2a " + class_17992.method_7964().getString(), new Object[2 & 5]);
                            if (iiiIIIiIII.ALLATORIxDEMO() <= (2 ^ 3)) {
                                iIiiiIIiII3.info(IiIIIiIiiI.ALLATORIxDEMO("\u5edf\u5b05\u7a16\u95a9\u4e61\u8dce\uff40\u5001\u6b0e\u638d\u53ba"), new Object[3 ^ 3]);
                                n = n2;
                                break block17;
                            }
                            object = iIiiiIIiII3.iiiIiIiiIi();
                            if (object.isEmpty()) {
                                iIiiiIIiII3.info(IIIiiIIiiI.iiIIiIIiii("\u722b\u5498\u8807\u513c\u5bee\u6269"), new Object[5 >> 3]);
                                n = n2;
                                break block17;
                            }
                        }
                    }
                }
                n4 = ++this;
            }
            n = n2;
        }
        if (n == 0) {
            iIiiiIIiII3.info(IiIIIiIiiI.ALLATORIxDEMO("\u6767\u5f0c\u7bfd\u4e50\u6ced\u6754\u6212\u526d\u976c\u89fc\u76c8\u76b3\u686b\u7234\u54ad"), new Object[3 >> 2]);
            iIiiiIIiII2 = iIiiiIIiII3;
        } else {
            if (object.isEmpty()) {
                iIiiiIIiII3.info(IIIiiIIiiI.iiIIiIIiii("\u6219\u674b\u7230\u54a3\u881c\u5127\u5bf5\u6252\uff55\u5111\u9594\u5bdb\u5611"), new Object[5 >> 3]);
            }
            iIiiiIIiII2 = iIiiiIIiII3;
        }
        if (iIiiiIIiII2.iIIiiIiIiI.field_1755 != null) {
            iIiiiIIiII3.iIIiiIiIiI.field_1724.method_3137();
        }
        iIiiiIIiII3.iIiIiIIIII = UniversalSupply.SupplyState.iIiiiIiIii;
    }

    private /* synthetic */ void IiiiiiiiiI() {
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII3;
        if (iIiiiIIiII2.ALLATORIxDEMO(class_2246.field_10443) != null) {
            iIiiiIIiII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u53ac\u73fc\u73cd\u6745\u6776\u5f1d\u7bec\uff60\u659d\u974c\u6563\u7f02\u65ed\u76e8"), new Object[3 ^ 3]);
            iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.iiiIiIIiii;
            return;
        }
        iIiiiIIiII iIiiiIIiII3 = IiIiiIIIiI.ALLATORIxDEMO();
        if (iIiiiIIiII3 != null) {
            iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiiiIIiII3, class_1802.field_8466);
            iIiiiIIiII2.info(IIIiiIIiiI.iiIIiIIiii("\u5d8b\u655c\u7f17\u4f9f\u5b01\u754a\u6752\u5f13\u7bc8"), new Object[3 >> 2]);
            iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.iiiIiIIiii;
            return;
        }
        iIiiiIIiII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u6223\u4e61\u524d\u5444\u907f\u76c8\u4f30\u7f22\u6563\u7f02\u6776\u5f1d\u7bcc\uff40\u76a9\u63c9\u8d2a\u98b2"), new Object[3 & 4]);
        iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.iIiIIiIIIi;
    }

    private /* synthetic */ void iiIiiiIIII() {
        iIiiiIIiII iIiiiIIiII2;
        iIiiiIIiII iIiiiIIiII3 = this;
        if (this.iiIIiIIiii()) {
            iIiiiIIiII3.info(IiIIIiIiiI.ALLATORIxDEMO("\u5d9e\u5683\u655a\u4fa0\u5b14\u7575\u6747\u5f2c\u7bdd"), new Object[2 & 5]);
            iIiiiIIiII2 = this;
        } else {
            iIiiiIIiII3.info(IIIiiIIiiI.iiIIiIIiii("\u6748\u8084\u56bc\u654f\u4f9f\u5b01\u754a\u6752\u5f13\u7bc8"), new Object[3 ^ 3]);
            iIiiiIIiII2 = this;
        }
        if (iIiiiIIiII2.ALLATORIxDEMO(class_2246.field_10443) == null) {
            this.info(IiIIIiIiiI.ALLATORIxDEMO("\u6f21\u5f3d\u768f\u4fb1\u5b05\u5be0\u626d\uff40\u519b\u596b\u8d2a\u98b2"), new Object[5 >> 3]);
            this.iIiIiIIIII = UniversalSupply.SupplyState.iIiIIiIIIi;
            return;
        }
    }

    private /* synthetic */ void IIIiIIiIII() {
        iIiiiIIiII iIiiiIIiII2 = iIiIiIIIii2;
        iIiIiIIIii iIiIiIIIii2 = (iiiIIIiIII)Modules.get().get(iiiIIIiIII.class);
        if (!iIiIiIIIii2.isActive()) {
            ((iiiIIIiIII)iIiIiIIIii2).iIIiIiiiIi.set((Object)class_1802.field_8639);
            iIiIiIIIii2.toggle();
        }
    }

    private /* synthetic */ void iiIIIIIIIi() {
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        void iIiIiIIIII2;
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII3;
        iIiiiIIiII iIiiiIIiII3 = iIiiiIIiII2.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII2.method_10074()).method_26204();
        if (IiIiiIIIiI.iiIIiIIiii()) {
            int n;
            if (iIiiiIIiII3 == class_2246.field_10164 || iIiiiIIiII3 == class_2246.field_10092) {
                return false;
            }
            int n2 = n = -2;
            while (true) {
                if (n2 > 2) break;
                int n3 = 0xFFFFFFFE & 0xFFFFFFFF;
                while (true) {
                    int n4;
                    if (n3 > 2) break;
                    class_2248 class_22482 = iIiiiIIiII2.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII2.method_10069(n, -4 >> 2, n4)).method_26204();
                    if (class_22482 == class_2246.field_22091 || class_22482 == class_2246.field_23869) {
                        return false;
                    }
                    n3 = ++n4;
                }
                n2 = ++n;
            }
        }
        if (iIiiiIIiII3 != class_2246.field_10124 && iIiiiIIiII3 != class_2246.field_10164) {
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean iiiiIIIiII() {
        long l = this.iIIiiIiIiI.field_1687.method_8532() % 24000L;
        if (l >= 13000L && l <= 23000L) {
            return 3 >> 1;
        }
        return false;
    }

    private /* synthetic */ void IIiiiIiiIi() {
        iIiiiIIiII iIiiiIIiII2 = iIiIiIIIii2;
        iIiIiIIIii iIiIiIIIii2 = (iIIIIiiiIi)Modules.get().get(iIIIIiiiIi.class);
        if (((iIIIIiiiIi)iIiIiIIIii2).ALLATORIxDEMO()) {
            iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.IIIIiiIiii;
            return;
        }
        if (!iIiIiIIIii2.isActive()) {
            iIiIiIIIii2.toggle();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1799 class_17992, Map<class_1792, Integer> map) {
        iIiiiIIiII iIiiiIIiII2 = object;
        Object object = class_17992;
        iIiiiIIiII iIiIiIIIII2 = iIiiiIIiII2;
        if ((object = (class_9288)object.method_58694(class_9334.field_49622)) == null) {
            return;
        }
        object = object.method_57489().toList().iterator();
        block0: while (true) {
            Object object2 = object;
            while (object2.hasNext()) {
                void iIiIiIIIII3;
                class_1799 class_17993 = (class_1799)object.next();
                if (class_17993.method_7960()) {
                    object2 = object;
                    continue;
                }
                class_1792 class_17922 = class_17993.method_7909();
                if (class_17922 == class_1802.field_8833) {
                    if (class_17993.method_7936() - class_17993.method_7919() <= (Integer)iIiIiIIIII2.ALLATORIxDEMO.get()) continue block0;
                    void v2 = iIiIiIIIII3;
                    v2.put(class_17922, v2.getOrDefault(class_17922, 3 >> 2) + class_17993.method_7947());
                    continue block0;
                }
                void v3 = iIiIiIIIII3;
                class_1792 class_17923 = class_17922;
                v3.put(class_17923, v3.getOrDefault(class_17923, 3 & 4) + class_17993.method_7947());
                continue block0;
            }
            break;
        }
    }

    private /* synthetic */ void iIIiIiIiii() {
        this.iiiiiIiIII();
    }

    private /* synthetic */ Dimension ALLATORIxDEMO() {
        return PlayerUtils.getDimension();
    }

    private /* synthetic */ boolean IIIIiIIiII() {
        iIiiiIIiII iIiiiIIiII2 = this;
        if ((this = iIiiiIIiII2.ALLATORIxDEMO(class_2246.field_10443)) == null) {
            IiIiIIiiii.ALLATORIxDEMO((class_2561)class_2561.method_43470((String)IiIIIiIiiI.ALLATORIxDEMO("\u9639\u8f9d\u6cdc\u6745\u6756\u5f3d\u7bec\uff64i\u6850\u51f8\uff45qL\u7b14\u5fe9")));
            return (3 & 4) != 0;
        }
        if (this != null) {
            iIiIiiIIIi.ALLATORIxDEMO((class_2338)this, class_2350.field_11036, --1 != 0, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
            iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.IIiIiiiiII;
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ Map<class_1792, Integer> iiiIiIiiIi() {
        int n;
        int n2;
        int n3;
        iIiiiIIiII iIiiiIIiII2 = linkedHashMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap<class_1792, Integer> linkedHashMap2 = new LinkedHashMap<class_1792, Integer>();
        int n4 = n3 = 5 >> 3;
        while (n4 < iIiiiIIiII2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            class_1799 class_17992 = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_31548().method_5438(n3);
            if (!class_17992.method_7960()) {
                class_1747 class_17472;
                class_2248 class_22482;
                class_1792 class_17922 = class_17992.method_7909();
                if (class_17922 == class_1802.field_8833) {
                    n2 = class_17992.method_7936() - class_17992.method_7919();
                    if (n2 > (Integer)iIiiiIIiII2.ALLATORIxDEMO.get()) {
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        linkedHashMap3.put(class_17922, linkedHashMap3.getOrDefault(class_17922, 3 >> 2) + class_17992.method_7947());
                    }
                } else {
                    Object object = linkedHashMap;
                    class_1792 class_17923 = class_17922;
                    object.put(class_17923, object.getOrDefault(class_17923, 5 >> 3) + class_17992.method_7947());
                }
                if (class_17922 instanceof class_1747 && (class_22482 = (class_17472 = (class_1747)class_17922).method_7711()) instanceof class_2480) {
                    iIiiiIIiII2.ALLATORIxDEMO(class_17992, linkedHashMap);
                }
            }
            n4 = ++n3;
        }
        n3 = linkedHashMap.getOrDefault(class_1802.field_8639, 2 & 5);
        if (n3 < (Integer)iIiiiIIiII2.iiiIiIiiII.get()) {
            linkedHashMap2.put(class_1802.field_8639, (Integer)iIiiiIIiII2.iiiIiIiiII.get() - n3);
        }
        if ((n = linkedHashMap.getOrDefault(class_1802.field_8288, 3 >> 2).intValue()) < (Integer)iIiiiIIiII2.IiiIiIiiIi.get()) {
            linkedHashMap2.put(class_1802.field_8288, (Integer)iIiiiIIiII2.IiiIiIiiIi.get() - n);
        }
        int n5 = linkedHashMap.getOrDefault(class_1802.field_8287, 3 & 4);
        n2 = (Integer)iIiiiIIiII2.iIIIiiiiIi.get();
        int n6 = iIiiiIIiII.ALLATORIxDEMO(n5);
        if (n6 < n2) {
            linkedHashMap2.put(class_1802.field_8287, n2 - n6);
        }
        if ((n3 = linkedHashMap.getOrDefault(class_1802.field_8833, 5 >> 3).intValue()) < (Integer)iIiiiIIiII2.iiiIiIIiii.get()) {
            linkedHashMap2.put(class_1802.field_8833, (Integer)iIiiiIIiII2.iiiIiIIiii.get() - n3);
        }
        int this2 = linkedHashMap.getOrDefault(class_1802.field_8233, 5 >> 3);
        n3 = (Integer)iIiiiIIiII2.IiiiiIiIiI.get();
        if ((this2 = iIiiiIIiII.ALLATORIxDEMO(this2)) < n3) {
            linkedHashMap2.put(class_1802.field_8233, n3 - this2);
        }
        return linkedHashMap2;
    }

    private /* synthetic */ void iIIIIIIiiI() {
        iIiiiIIiII iIiiiIIiII2 = iIiIiIIIii2;
        iIiIiIIIii iIiIiIIIii2 = (iIiiIIIIII)Modules.get().get(iIiiIIIIII.class);
        if (!iIiIiIIIii2.isActive()) {
            iIiIiIIIii2.toggle();
        }
        iIiiiIIiII2.info(IIIiiIIiiI.iiIIiIIiii("\u4e5b:)"), new Object[5 >> 3]);
        iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.iIiIiIIIII;
    }

    private /* synthetic */ void IiIIIiiiII() {
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII3;
        iIiiiIIiII iIiiiIIiII3 = IiIiiIIIiI.ALLATORIxDEMO();
        if (iIiiiIIiII3 != null) {
            iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiiiIIiII3, class_1802.field_8466);
            IiIiIIiiii.ALLATORIxDEMO((class_2561)class_2561.method_43470((String)IIIiiIIiiI.iiIIiIIiii("\u5db0\u6567\u7f0c\u6752\u5f13\u7bc8")));
            iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.IIiIiiiiII;
        }
    }

    private /* synthetic */ boolean iiIIiIIiii() {
        iIiiiIIiII iIiiiIIiII2 = this;
        if ((this = iIiiiIIiII2.ALLATORIxDEMO(class_2246.field_10443)) == null) {
            return (3 & 4) != 0;
        }
        if (this != null) {
            iIiiiIIiII iIiiiIIiII3 = this = BetterBlockPos.from((class_2338)this);
            BaritoneAPI.getProvider().getPrimaryBaritone().getSelectionManager().addSelection((BetterBlockPos)iIiiiIIiII3, (BetterBlockPos)iIiiiIIiII3);
            iIiiiIIiII iIiiiIIiII4 = this;
            BaritoneAPI.getProvider().getPrimaryBaritone().getBuilderProcess().clearArea((class_2338)iIiiiIIiII4, (class_2338)iIiiiIIiII4);
            return (4 ^ 5) != 0;
        }
        return false;
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iIiiiIIiII iIiiiIIiII2 = iIiIiIIIii2;
        if (iIiiiIIiII2.iIIiiIiIiI.field_1724.method_24828()) {
            iIiiiIIiII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u5daf\u9621\u8440\uff40\u519b\u596b\u8838\u7eb5"), new Object[3 >> 2]);
            BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
            iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.iiiIiiIIII;
            return;
        }
        iIiIiIIIii iIiIiIIIii2 = (iIIIIiIIII)Modules.get().get(iIIIIiIIII.class);
        if (!iIiIiIIIii2.isActive()) {
            iIiIiIIIii2.toggle();
        }
    }

    public void onDeactivate() {
        super.onDeactivate();
        this.iIiIiIIIII = UniversalSupply.SupplyState.iIIIiiiiIi;
    }

    private /* synthetic */ class_2350 ALLATORIxDEMO(class_243 class_2432) {
        double d;
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII3;
        iIiiiIIiII iIiiiIIiII3 = class_2432;
        iIiiiIIiII iIiIiIIIII2 = iIiiiIIiII2;
        iIiiiIIiII iIiiiIIiII4 = iIiiiIIiII3;
        double d2 = Math.abs(((class_243)iIiiiIIiII4).field_1352);
        if (d2 > (d = Math.abs(((class_243)iIiiiIIiII4).field_1350))) {
            if (((class_243)iIiiiIIiII3).field_1352 > 0.0) {
                return class_2350.field_11034;
            }
            return class_2350.field_11039;
        }
        if (((class_243)iIiiiIIiII3).field_1350 > 0.0) {
            return class_2350.field_11035;
        }
        return class_2350.field_11043;
    }

    private /* synthetic */ void iIIiIiiiII() {
        this.info(IIIiiIIiiI.iiIIiIIiii("\u5f59\u59a9\u4fa4\u5b3a\u6f25\u5f33\u768b\u5252\u6752\u5f13\u7bc8"), new Object[3 & 4]);
        this.iIiIiIIIII = UniversalSupply.SupplyState.IiiIiIiiIi;
    }

    private /* synthetic */ void IiiIIiIIIi() {
    }

    private /* synthetic */ Map<class_1792, Integer> ALLATORIxDEMO() {
        int n;
        int n2;
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII3;
        HashMap<class_1792, Integer> hashMap = new HashMap<class_1792, Integer>();
        LinkedHashMap<class_1792, Integer> linkedHashMap = new LinkedHashMap<class_1792, Integer>();
        int n3 = n2 = 3 & 4;
        while (n3 < iIiiiIIiII2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            class_1747 class_17472;
            class_2248 class_22482;
            class_1792 class_17922;
            iIiiiIIiII iIiiiIIiII3 = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_31548().method_5438(n2);
            if (!(iIiiiIIiII3.method_7960() || (class_17922 = iIiiiIIiII3.method_7909()) instanceof class_1747 && (class_22482 = (class_17472 = (class_1747)class_17922).method_7711()) instanceof class_2480)) {
                if (class_17922 == class_1802.field_8833) {
                    int n4 = iIiiiIIiII3.method_7936() - iIiiiIIiII3.method_7919();
                    if (n4 > (Integer)iIiiiIIiII2.ALLATORIxDEMO.get()) {
                        HashMap<class_1792, Integer> hashMap2 = hashMap;
                        hashMap2.put(class_17922, hashMap2.getOrDefault(class_17922, 3 ^ 3) + iIiiiIIiII3.method_7947());
                    }
                } else {
                    HashMap<class_1792, Integer> hashMap3 = hashMap;
                    class_1792 class_17923 = class_17922;
                    hashMap3.put(class_17923, hashMap3.getOrDefault(class_17923, 3 >> 2) + iIiiiIIiII3.method_7947());
                }
            }
            n3 = ++n2;
        }
        n2 = hashMap.getOrDefault(class_1802.field_8288, 2 & 5);
        if (n2 < (Integer)iIiiiIIiII2.IiiIiIiiIi.get()) {
            linkedHashMap.put(class_1802.field_8288, (Integer)iIiiiIIiII2.IiiIiIiiIi.get() - n2);
        }
        int this_ = hashMap.getOrDefault(class_1802.field_8287, 3 & 4);
        int n5 = (Integer)iIiiiIIiII2.iIIIiiiiIi.get();
        int n6 = iIiiiIIiII.ALLATORIxDEMO(this_);
        if (n6 < n5) {
            linkedHashMap.put(class_1802.field_8287, n5 - n6);
        }
        if ((n = hashMap.getOrDefault(class_1802.field_8833, 2 & 5).intValue()) < (Integer)iIiiiIIiII2.iiiIiIIiii.get()) {
            linkedHashMap.put(class_1802.field_8833, (Integer)iIiiiIIiII2.iiiIiIIiii.get() - n);
        }
        n2 = hashMap.getOrDefault(class_1802.field_8233, 2 & 5);
        this_ = (Integer)iIiiiIIiII2.IiiiiIiIiI.get();
        if ((n2 = iIiiiIIiII.ALLATORIxDEMO(n2)) < this_) {
            linkedHashMap.put(class_1802.field_8233, this_ - n2);
        }
        if (hashMap.getOrDefault(class_1802.field_8639, 3 & 4) < (Integer)iIiiiIIiII2.iiiIiIiiII.get()) {
            linkedHashMap.put(class_1802.field_8639, 0x2E & 0x79);
        }
        return linkedHashMap;
    }

    public iIiiiIIiII() {
        iIiiiIIiII iIiiiIIiII2 = this;
        super(IiIIIiIiiI.ALLATORIxDEMO("\u8d2b\u8d83\u52f4\u6227"), IIIiiIIiiI.iiIIiIIiii("\u9045\u756d\u5136\u81ef\u52b6\u8d34\u8db6I\u7210\u8d06\u883c\u7e9b\u7ca2\u7e9dwB\u8193\u52ca\u597d\u7444\u6156\u5974\u8444\u5752W"));
        iIiiiIIiII2.IiIiIiIIii = iIiiiIIiII2.settings.getDefaultGroup();
        iIiiiIIiII2.IiiiiIIiII = iIiiiIIiII2.settings.createGroup(IiIIIiIiiI.ALLATORIxDEMO("\u6776\u575c\u8be3\u7f02"));
        iIiiiIIiII2.IIiiiiIIii = iIiiiIIiII2.settings.createGroup(IIIiiIIiiI.iiIIiIIiii("\u5752\u7288\u8bdc\u7f17"));
        iIiiiIIiII2.IIiIiiiiII = iIiiiIIiII2.settings.createGroup(IiIIIiIiiI.ALLATORIxDEMO("\u4e77\u4e4b\u7520\u8be3\u7f02"));
        iIiiiIIiII2.ALLATORIxDEMO = iIiiiIIiII2.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u97da\u7f9c\u8072\u4e3c\u966a\u5045"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u4f02\u4ed3\u6b08\u804d\u4e29\u5edb\u65ba\u89bb\u53bd\u8838\u7eb5"))).defaultValue((Object)(0x3F & 0x4A))).min(3 >> 1).max(0x75F1 & 0xBBE).sliderMax(0x1FF9 & 0x61B6).build());
        this.iiiIiIiiII = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u709d\u82e8\u6512\u91b6\u966a\u5045"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u4f13\u4ee2\u6b39\u651c\u91b2\u65ba\u89bb\u53bd\u8838\u7eb5"))).defaultValue((Object)(0x3C & 0x57))).min(4 ^ 5).max(0x1FFA & 0x6085).sliderMax(0x7FEA & 0x95).build());
        this.IiiIiIiiIi = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u56bc\u8127\u8807\u513c\u6512\u91b6"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u4f02\u4ed3\u6b08\u652d\u91a3\u658b\u8829\u7e84\u525c\u652d\u91a3"))).defaultValue((Object)(--4))).min(--1).max(0x3F & 0x5E).sliderMax(0x7E & 0x1F).build());
        this.iIIIiiiiIi = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u0001\u0012\u881c\u5107\u6529\u91adQ\u7ea6P"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u4f02\u4ed3\u6b08\u652d\u91a3\u658b\u8829\u7e84\u525c\u652d\u91a3"))).defaultValue((Object)(5 >> 1))).min(3 >> 2).max(0x7F & 0x1E).sliderMax(0x3E & 0x5F).build());
        this.iiiIiIIiii = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u97da\u7f9c\u8807\u513c\u6512\u91b6"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u4f02\u4ed3\u6b08\u652d\u91a3\u658b\u8829\u7e84\u525c\u652d\u91a3"))).defaultValue((Object)(5 >> 1))).min(2 & 5).max(0x3E & 0x5F).sliderMax(0x7E & 0x1F).build());
        this.IiiiiIiIiI = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u7d52\u839a\u67c5\u8807\u513c\u7ea6\u6509"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u4f02\u4ed3\u6b08\u652d\u91a3\u658b\u8829\u7e84\u525c\u652d\u91a3"))).defaultValue((Object)(2 ^ 3))).min(3 >> 2).max(0x7F & 0x1E).sliderMax(0x7E & 0x1F).build());
        this.IiiIIiIIiI = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u8d15\u98a7\u89b0\u5edf"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u5ea7\u8bc2j\\"))).defaultValue((Object)(0x5F & 0x66))).min(3 >> 2).sliderRange(3 & 4, 0x5B & 0x7E).build());
        this.iiIiIIiiii = this.IiIiIiIIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u962f\u8444\u65db\u6cac"))).description(IiIIIiIiiI.ALLATORIxDEMO("}\u306e"))).defaultValue((Object)MEnum.LandingMode.iIIiIiiiIi)).onChanged(iIiIiIIIII2 -> {
            if (iIiIiIIIII2 != MEnum.LandingMode.iIIiIiiiIi) {
                IiIiIIiiii.IIIIiIIiII(IiIIIiIiiI.ALLATORIxDEMO("\u5f0e\u5221\u53b7\u6543\u637c\u7d67\u8385\u67f0\u9610\u8451"));
            }
        })).build());
        this.IIiIiIIiii = this.IiIiIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u7a18\u6c6d\u655c\u7f17"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u513d\u8bf5\u5749\u7a2a\u6c62\u4e6a\u6504\u7f65\u65c0\u571f\uff71\u65ac\u89b9\u6570\u7f0f\u9600\u524f\u304a\u5e0b\u4e58\u65c6\u545f\u538e\u80ad\u4e37\u7cb5\u51b3\u3046\u9770\u89c0\u677d\u52e0\u5613\u6565\u637bg\u001a\u5df9\u7798\u6563\u635cV]#\u000f+Ql>\u000f}\u4e61\u6552\u634dgLn\u000f"))).defaultValue((Object)(5 >> 3))).build());
        this.iIIiiiiIii = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u768c\u687e\u9aba\u5edf"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u8818\u7e95\u5453\u91a1\u65ed\u98b2\u8831\u76c8\u76b3\u686b\u9a85\u5eca"))).defaultValue((Object)(0x616C & 0x1FBF))).min(0xA & 0x7F).sliderMax(0x7FEB & 0x139C).build());
        this.iIIiIiiiIi = this.IIiiiiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u966b\u6014\u9b3b\u7009\u747a"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u967e\u602b\u9b2e\u7036\u746f\uff71l\u81b7\u52c4\u56a9\u58f5"))).defaultValue((Object)(5 >> 3))).build());
        this.iIIiIiiIiI = this.IIiiiiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u5732\u687e\u4e6f\u7551\u7be3\u4f43\u8188\u52d1\u6696\u65c9"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u967e\u602b\u9b2e\u7036\u746f\uff71l\u81b7\u52c4\u56a9\u58f5"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIiIIiIIIi = this.IIiiiiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u5749\u72b3\u76b7\u6865!\u5732\u687e"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u756a\u4e41\u978e\u76a2\u685a4\u570d\u686b"))).defaultValue((Object)(2 & 5))).build());
        this.iIIIIIiiII = this.IIiiiiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u5749\u72b3\u76b7\u6865#\u5732\u687e"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u756a\u4e41\u978e\u76a2\u685a6\u570d\u686b"))).defaultValue((Object)(3 >> 2))).build());
        this.iIiIiiiiII = this.IIiiiiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u5772\u72a8\u5beb\u5111\u5328\u5ffd"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u688c\u6d16\u5be5\u5135\u9621\u8440\u5376\u5782\u76e8\u5317\u5fe8"))).defaultValue((Object)(0x2A & 0x5F))).min(--5).max(0x3C & 0x57).sliderMax(0x5C & 0x37).build());
        this.iIIiiIiIiI = this.IIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u4e42\u4e54\u7515\u5e11\u5389\u9aba\u5edf"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u8838\u7eb5\u5e0e\u53bc\u6470\u5e96\u9a85\u5eca"))).defaultValue((Object)(0x37CF & 0x48F8))).min(0x47F6 & 0x389F).max(0x6D6F & 0x13BC).sliderMax(0x4FAF & 0x317C).build());
        this.iIIIIIIiII = this.IIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u5e11\u5389\u5945\u5c76"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u8809\u7ea4\u5e3f\u53ad\u76e8\u8fe4\u9513"))).defaultValue((Object)(--5))).min(--3).max(0x5A & 0x2F).sliderMax(0x6E & 0x1B).build());
        iIiiiIIiII iIiiiIIiII3 = this;
        iIiiiIIiII iIiiiIIiII4 = this;
        this.iIiIiIIIII = UniversalSupply.SupplyState.iIIIiiiiIi;
        iIiiiIIiII4.iIiiiiIIII = 3 ^ 3;
        iIiiiIIiII4.IIIIiiIiii = 3 >> 2;
        iIiiiIIiII3.iiiiiIIiIi = null;
        iIiiiIIiII3.iIIiiIIIIi = 3 >> 2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIiiIIiiI.iiIIiIIiii("\u00152`\u007f1<B\f2=#-'xB\u8b8e\u6696\u65c9\u5272\u6759\u65d2\u7231\u674e\uff78"));
        }
    }

    private /* synthetic */ void IIIIiIIIII() {
        iIiiiIIiII iIiiiIIiII2 = this;
        iIiiiIIiII2.IIiiIIIIIi = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_24515();
        ((Integer)iIiiiIIiII2.iIIIIIIiII.get()).intValue();
    }

    private /* synthetic */ void IIIIiIiiii() {
        iIiiiIIiII iIiiiIIiII2 = this;
        iIiiiIIiII2.iIIIIiiiii = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_36454();
        iIiiiIIiII2.iIiiiIiIii = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_36455();
        iIiiiIIiII2.iiiIiiIIII = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_5828(1.0f);
        iIiiiIIiII iIiiiIIiII3 = this;
        if (BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().isActive()) {
            iIiiiIIiII3.IIIIiiIiii = --1;
            this.iiiiiIIiIi = BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().currentDestination();
            return;
        }
        iIiiiIIiII3.IIIIiiIiii = false;
    }

    private /* synthetic */ void iiiIiIiIII() {
        this.ALLATORIxDEMO(class_1802.field_8639);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1792 class_17922) {
        iIiiiIIiII iIiiiIIiII2 = this;
        int n = this = 5 >> 3;
        while (true) {
            void iIiIiIIIII2;
            if (n >= 9) break;
            if (iIiiiIIiII2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909() == iIiIiIIIII2) {
                iIiiiIIiIi.ALLATORIxDEMO(this);
                iIiiiIIiII2.iIIiiIiIiI.field_1761.method_2919((class_1657)iIiiiIIiII2.iIIiiIiIiI.field_1724, iIiiiIIiII2.iIIiiIiIiI.field_1724.method_6058());
                return;
            }
            n = ++this;
        }
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        int n;
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII3;
        int n2 = 3 & 4;
        int n3 = n = 5 >> 3;
        while (n3 < iIiiiIIiII2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            iIiiiIIiII iIiiiIIiII3 = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_31548().method_5438(n);
            if (iIiiiIIiII3.method_7909() == class_1802.field_8833) {
                ++n2;
                if (iIiiiIIiII3.method_7936() - iIiiiIIiII3.method_7919() > (Integer)iIiiiIIiII2.ALLATORIxDEMO.get()) {
                    return 3 >> 2;
                }
            }
            n3 = ++n;
        }
        if (n2 == 0) {
            return --1 != 0;
        }
        return true;
    }

    private /* synthetic */ void IIIIIIIiII() {
        if (this.iiiIiIiiIi() || this.IIiIiIiIiI()) {
            if (!iIiiiIIiIi.iiIIiIIiii(this.iIIiiIiIiI)) {
                return;
            }
            this.IIIIiIiiii();
            this.info(IIIiiIIiiI.iiIIiIIiii("\u6882\u6d12\u5272\u9759\u89e3\u881c\u7ebb\uff75\u5f42\u5992\u962f\u8444\u6d23\u7a72"), new Object[3 & 4]);
            this.iIiIiIIIII = UniversalSupply.SupplyState.IIiIiIIiii;
        }
    }

    private /* synthetic */ void IIiIiIiiii() {
        if (!((iIiiIIIIII)Modules.get().get(iIiiIIIIII.class)).isActive()) {
            this.info(IiIIIiIiiI.ALLATORIxDEMO("\u7ea9\u4f82\u5bf1\u625c\uff51\u4e67\u4e5d\u6b09"), new Object[3 >> 2]);
            this.iIiIiIIIII = UniversalSupply.SupplyState.iIIiIiiiIi;
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
        if (!IiIiiIIIiI.ALLATORIxDEMO(IIIiiIIiiI.iiIIiIIiii("fq'\u007f< .',q-+kjl4\r\u001d75'*l\t\u000b\r\u0001\u0011vi7\r\u000b\u0015"))) {
            this.error(IiIIIiIiiI.ALLATORIxDEMO("\u6721\u6203\u527c7\t\u001b*]!\u0012(\uff51\u8b9b\u689d\u6789\u6652\u546a\u6b3e\u7802\u5bd4\u88a9"), new Object[3 & 4]);
            return;
        }
        this.iiIIIIIIIi();
    }

    private /* synthetic */ void iIiIiiiiii() {
        if (this.iIIiiIiIiI.field_1755 != null) {
            this.iIIiiIiIiI.field_1724.method_3137();
            this.info(IiIIIiIiiI.ALLATORIxDEMO("\u510e\u95a1\u5be4\u5604\u7511\u970e"), new Object[5 >> 3]);
            return;
        }
        this.iIiIiIIIII = UniversalSupply.SupplyState.IiiiiIiIiI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void iIiIiIiIii() {
        iIiiiIIiII iIiiiIIiII2 = this;
        if (iIiiiIIiII2.iIIiiIiIiI.field_1724.method_24828()) {
            Rotations.rotate((double)iIiiiIIiII2.iIIiiIiIiI.field_1724.method_36454(), (double)((Integer)iIiiiIIiII2.IiiIIiIIiI.get() * (-4 >> 2)), (int)(0x37 & 0x7A), () -> {
                this.iIIiiIiIiI.field_1724.method_6043();
                new Thread(() -> {
                    iIiiiIIiII iIiiiIIiII2;
                    try {
                        Thread.sleep(200L);
                        iIiiiIIiII2 = this;
                    }
                    catch (InterruptedException interruptedException) {
                        iIiiiIIiII2 = this;
                    }
                    iIiiiIIiII2.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2848((class_1297)this.iIIiiIiIiI.field_1724, class_2848.class_2849.field_12982));
                    this.iiiIiIiIII();
                    iiIIIiIIIi = System.currentTimeMillis();
                }).start();
            });
            return;
        }
        switch (IIIiiiIiiI.ALLATORIxDEMO[iIiiiIIiII2.ALLATORIxDEMO().ordinal()]) {
            default: {
                throw new MatchException(null, null);
            }
            case 1: {
                int n = (Integer)iIiiiIIiII2.iIIiiiiIii.get();
                break;
            }
            case 2: {
                int n = (Integer)iIiiiIIiII2.iIIiiiiIii.get();
                break;
            }
            case 3: {
                int n = this = (int)iIiiiIIiII2.iIIiiIiIiI.field_1724.method_23318();
            }
        }
        if (iIiiiIIiII2.iIIiiIiIiI.field_1724.method_23318() >= (double)this) {
            iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.iIIiiIIIIi;
            iIiiiIIiII2.iIiiiiIIII = 2 & 5;
            iIiiiIIiII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u524d\u8ff2\u7693\u684b\u9a85\u5eca\uff51\u600e\u5970\u53d3\u9883\u8820\u72eb\u606d"), new Object[5 >> 3]);
        }
    }

    private /* synthetic */ void IIiIiIiIiI() {
        if (this.ALLATORIxDEMO(class_2246.field_10443) == null) {
            this.info(IIIiiIIiiI.iiIIiIIiii("\u542a\u56ad\u6ce3\u6750\u6749\u5f08\u7bd3\uff75\u8f96\u5687\u655c\u7f17\u72d4\u6078"), new Object[2 & 5]);
            this.iIiIiIIIII = UniversalSupply.SupplyState.IiiIiIiiIi;
            return;
        }
        if (this.IIIIiIIiII()) {
            this.iIiIiIIIII = UniversalSupply.SupplyState.iiiiiIIiIi;
            return;
        }
        this.info(IiIIIiIiiI.ALLATORIxDEMO("\u659d\u6c99\u620e\u5f6c\u6776\u5f1d\u7bcc\uff40\u7b14\u5fe9\u9190\u8bb9"), new Object[3 >> 2]);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII3;
        iIiiiIIiII iIiiiIIiII3 = pre;
        iIiiiIIiII iIiIiIIIII2 = iIiiiIIiII2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        switch (iIiIiIIIII2.iIiIiIIIII.ordinal()) {
            case 0: {
                if (!iIiiiIIiIi.iiIIiIIiii(iIiIiIIIII2.iIIiiIiIiI)) return;
                iIiIiIIIII2.IIIIIIIiII();
                return;
            }
            case 1: {
                iIiIiIIIII2.IiiiiiiIIi();
                return;
            }
            case 2: {
                iIiIiIIIII2.IIiiiIiiIi();
                return;
            }
            case 3: {
                iIiIiIIIII2.iIIIIIIiiI();
                return;
            }
            case 4: {
                iIiIiIIIII2.IIiIiIiiii();
                return;
            }
            case 5: {
                iIiIiIIIII2.IiIIIiiiII();
                return;
            }
            case 6: {
                iIiIiIIIII2.IIIIiIIiII();
                return;
            }
            case 7: {
                iIiIiIIIII2.IiIiiIiiiI();
                return;
            }
            case 8: {
                iIiIiIIIII2.iIiIiiiiii();
                return;
            }
            case 9: {
                iIiIiIIIII2.ALLATORIxDEMO();
                return;
            }
            case 10: {
                iIiIiIIIII2.iIIiIiiiII();
                return;
            }
            case 11: {
                iIiIiIIIII2.IiiiiiiiiI();
                return;
            }
            case 12: {
                iIiIiIIIII2.IIiIiIiIiI();
                return;
            }
            case 13: {
                iIiIiIIIII2.iiiIiIiiIi();
                return;
            }
            case 14: {
                iIiIiIIIII2.iiIIiiiIII();
                return;
            }
            case 15: {
                iIiIiIIIII2.iiIiiiIIII();
                return;
            }
            case 16: {
                iIiIiIIIII2.iIiIiIiIii();
                return;
            }
            case 17: {
                iIiIiIIIII2.iiiiIIIiII();
                return;
            }
        }
    }

    public void iiiiIIIiII() {
        iIiiiIIiII iIiiiIIiII2;
        iIiiiIIiII iIiiiIIiII3 = this;
        this.iIIiiIiIiI.field_1724.method_36456((float)iIiiiIIiII3.iIIIIiiiii);
        if (iIiiiIIiII3.ALLATORIxDEMO() == Dimension.End) {
            iIiiiIIiII2 = this;
        } else if (this.ALLATORIxDEMO() == Dimension.Overworld) {
            iIiiiIIiII iIiiiIIiII4 = this;
            iIiiiIIiII2 = iIiiiIIiII4;
            this.iIIiiIiIiI.field_1724.method_36457((float)iIiiiIIiII4.iIiiiIiIii);
        } else {
            if (this.ALLATORIxDEMO() == Dimension.Nether) {
                iIiiiIIiII iIiiiIIiII5 = this;
                iIiiiIIiII5.ALLATORIxDEMO(((Integer)iIiiiIIiII5.iIiIIiIIIi.get()).intValue(), ((Integer)this.iIIIIIiiII.get()).intValue());
                BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().pathTo(this.iiiiiIIiIi);
            }
            iIiiiIIiII2 = this;
        }
        if (iIiiiIIiII2.IIIIiiIiii) {
            BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().pathTo(this.iiiiiIIiIi);
        }
        iIiiiIIiII iIiiiIIiII6 = this;
        iIiiiIIiII6.iIiiiiIIII += 2 ^ 3;
        if (iIiiiIIiII6.iIiiiiIIII > (0x7D & 0x16)) {
            this.iIiIiIIIII = UniversalSupply.SupplyState.iIIIiiiiIi;
            this.info(IIIiiIIiiI.iiIIiIIiii("\u5d8b\u6020\u5954\u98bc\u8835\u72d4\u6078"), new Object[3 & 4]);
        }
    }

    private /* synthetic */ void IIIIiIIiII() {
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII3;
        if (BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().isActive()) {
            iIiiiIIiII iIiiiIIiII3;
            Goal goal = BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().getGoal();
            if (goal instanceof GoalXZ) {
                iIiiiIIiII3 = (GoalXZ)goal;
                iIiiiIIiII2.iIiIIiIIIi.set((Object)iIiiiIIiII3.getX());
                iIiiiIIiII2.iIIIIIiiII.set((Object)iIiiiIIiII3.getZ());
            }
            if (goal instanceof GoalBlock) {
                iIiiiIIiII3 = (GoalBlock)goal;
                iIiiiIIiII2.iIiIIiIIIi.set((Object)((GoalBlock)iIiiiIIiII3).x);
                iIiiiIIiII2.iIIIIIiiII.set((Object)((GoalBlock)iIiiiIIiII3).z);
            }
            if (goal instanceof GoalNear) {
                iIiiiIIiII3 = (GoalNear)goal;
                iIiiiIIiII2.iIiIIiIIIi.set((Object)iIiiiIIiII3.getGoalPos().method_10263());
                iIiiiIIiII2.iIIIIIiiII.set((Object)iIiiiIIiII3.getGoalPos().method_10260());
            }
        }
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void iiIIiIIiii() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 1[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private /* synthetic */ void iiiIiIiiIi() {
        int n;
        int n2;
        iIiiiIIiII iIiiiIIiII2;
        block14: {
            int n3;
            class_1747 class_17472;
            class_1792 class_17922;
            iIiiiIIiII2 = this;
            if (iIiiiIIiII2.iIIiiIiIiI.field_1755 == null) {
                iIiiiIIiII2.info(IIIiiIIiiI.iiIIiIIiii("\u7b0b\u5fdc\u4f9f\u5b01\u754a\u5bc0\u560a\u7535\u9720\u620a\u5f62WLW"), new Object[3 & 4]);
                return;
            }
            if (!(iIiiiIIiII2.iIIiiIiIiI.field_1755 instanceof class_465)) {
                iIiiiIIiII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u7b34\u5fc9\u4fa0\u5b14\u7575\u5bd5\u5635\u7520\u971f\u621f\u5f5dBsB"), new Object[3 >> 2]);
                return;
            }
            class_1703 class_17032 = ((class_465)iIiiiIIiII2.iIIiiIiIiI.field_1755).method_17577();
            iIiiiIIiII2.info(IIIiiIIiiI.iiIIiIIiii("\u4fbf\u5b21\u754a\u5bc0\u562a\u7515\u9700\u5d8b\u6231\u5f79"), new Object[2 & 5]);
            n2 = 5 >> 3;
            int n4 = class_17032.field_7761.size() - (0x65 & 0x3E);
            int n5 = n6 = 3 >> 2;
            while (n5 < n4) {
                class_1799 class_17992 = class_17032.method_7611(n6).method_7677();
                if (!class_17992.method_7960() && (class_17922 = class_17992.method_7909()) instanceof class_1747) {
                    class_17472 = (class_1747)class_17922;
                    if (class_17472.method_7711() instanceof class_2480) {
                        n2 = 3 & 5;
                        break;
                    }
                }
                n5 = ++n6;
            }
            int n6 = 0;
            int n7 = n3 = 5 >> 3;
            while (n7 < iIiiiIIiII2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
                class_17922 = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_31548().method_5438(n3);
                if (!class_17922.method_7960() && (class_17472 = class_17922.method_7909()) instanceof class_1747) {
                    if (class_17472.method_7711() instanceof class_2480) {
                        int n8;
                        block13: {
                            int n9 = 3 & 4;
                            while (n9 < n4) {
                                int n10;
                                if (class_17032.method_7611(n10).method_7677().method_7960()) {
                                    iIiiiIIiII iIiiiIIiII3 = iIiiiIIiII2;
                                    iIiiiIIiII3.iIIiiIiIiI.field_1761.method_2906(class_17032.field_7763, n3 + (0x27 & 0x7C), 3 ^ 3, class_1713.field_7794, (class_1657)iIiiiIIiII2.iIIiiIiIiI.field_1724);
                                    n6 = 2 ^ 3;
                                    iIiiiIIiII3.info(IiIIIiIiiI.ALLATORIxDEMO("\u5daf\u5c6a\u6f01\u5f1d\u76af\u79b7\u5138\u6747\u5f2c\u7bdd"), new Object[3 ^ 3]);
                                    n8 = n6;
                                    break block13;
                                }
                                n9 = ++n10;
                            }
                            n8 = n6;
                        }
                        if (n8 != 0) {
                            n = n6;
                            break block14;
                        }
                    }
                }
                n7 = ++n3;
            }
            n = n6;
        }
        if (n != 0) {
            iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.iIIIIIIiII;
            return;
        }
        iIiiiIIiII iIiiiIIiII4 = iIiiiIIiII2;
        if (n2 != 0) {
            iIiiiIIiII4.info(IIIiiIIiiI.iiIIiIIiii("\u6769\u5f28\u7bf3\u4e74\u5d90\u6770\u6f3e\u5f08\u7690\uff55\u6582\u9779\u7999\u52d1"), new Object[3 & 4]);
            iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.iIIIIIIiII;
            return;
        }
        iIiiiIIiII4.info(IiIIIiIiiI.ALLATORIxDEMO("\u80b1\u5349\u4e70\u6ccd\u6754\u6f30\u5f0c\u769e\u975d\u89ed\u4f80\u5b34"), new Object[3 >> 2]);
        iIiiiIIiII2.iIiIiIIIII = UniversalSupply.SupplyState.iIIIIIIiII;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    private /* synthetic */ class_2338 ALLATORIxDEMO(class_2248 class_22482) {
        int n;
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII4;
        if (iIiiiIIiII2.iIIiiIiIiI.field_1724 == null || iIiiiIIiII2.iIIiiIiIiI.field_1687 == null || iIiiiIIiII2.iIIiiIiIiI.field_1761 == null) {
            return null;
        }
        class_2338 class_23382 = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_24515();
        iIiiiIIiII iIiiiIIiII3 = null;
        double d = 4.0;
        int n2 = n = 0xFFFFFFFE & 0xFFFFFFFD;
        while (true) {
            if (n2 > 4) break;
            int n3 = 0xFFFFFFFF & 0xFFFFFFFE;
            while (true) {
                int n4;
                if (n3 > 2) break;
                int n5 = 0xFFFFFFFE & 0xFFFFFFFD;
                while (true) {
                    void iIiIiIIIII2;
                    int n6;
                    if (n5 > 4) break;
                    iIiiiIIiII iIiiiIIiII4 = class_23382.method_10069(n, n4, n6);
                    if (iIiiiIIiII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiiiIIiII4).method_26204() == iIiIiIIIII2) {
                        double d2;
                        double d3 = iIiiiIIiII2.iIIiiIiIiI.field_1724.method_5649((double)iIiiiIIiII4.method_10263() + 0.5, (double)iIiiiIIiII4.method_10264() + 0.5, (double)iIiiiIIiII4.method_10260() + 0.5);
                        double d4 = d;
                        if (d2 <= d4 * d4) {
                            iIiiiIIiII3 = iIiiiIIiII4;
                            d = Math.sqrt(d3);
                        }
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return iIiiiIIiII3;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        Map.Entry entry;
        Object object = object3;
        Map<class_1792, Integer> map = ((iIiiiIIiII)object).ALLATORIxDEMO();
        if (map.isEmpty()) {
            object.info(IIIiiIIiiI.iiIIiIIiii("\u4e62\u808e\u535c\u722b\u5498\u5d90\u513c\u8dd1\uff75\u5184\u595e\u56bc\u654f\u76b0\u5b29"), new Object[3 ^ 3]);
            ((iIiiiIIiII)object).iIiIiIIIII = UniversalSupply.SupplyState.ALLATORIxDEMO;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(IiIIIiIiiI.ALLATORIxDEMO("\u975d\u89ed\u4e93\u6f30\u5f0c\u769e\u638d\u53bagL"));
        Object object2 = object3 = map.entrySet().iterator();
        while (object2.hasNext()) {
            entry = (Map.Entry)object3.next();
            stringBuilder.append(((class_1792)entry.getKey()).method_63680().getString()).append(IIIiiIIiiI.iiIIiIIiii("B\u0001")).append(entry.getValue()).append(IiIIIiIiiI.ALLATORIxDEMO("qL"));
            object2 = object3;
        }
        object.info(stringBuilder.toString(), new Object[3 ^ 3]);
        Object object3 = (iiiIIIiIII)Modules.get().get(iiiIIIiIII.class);
        if (object3 == null) {
            object.info(IIIiiIIiiI.iiIIiIIiii("\u6231\u4e59\u5274\u007f\u00166pr)<\u0010;-!\u000b-'4$\u001c\u0016\u001a*<\u0010Y\u6a43\u572e"), new Object[3 >> 2]);
            ((iIiiiIIiII)object).iIiIiIIIII = UniversalSupply.SupplyState.ALLATORIxDEMO;
            return;
        }
        if (object3.isActive()) {
            return;
        }
        entry = map.keySet().iterator().next();
        int n = map.get(entry);
        Map.Entry entry2 = entry;
        ((iiiIIIiIII)object3).iIIiIiiiIi.set((Object)entry2);
        ((iiiIIIiIII)object3).IIiiIIIIIi.set((Object)n);
        object3.toggle();
        object.info("\u5f00\u59cb\u63d0\u53d6 " + entry2.method_63680().getString() + " x (" + n + " \u7ec4)", new Object[3 & 4]);
    }

    private /* synthetic */ void ALLATORIxDEMO(double iIiIiIIIII2, double iIiIiIIIII3) {
        iIiIiIIIII2 -= this.iIIiiIiIiI.field_1724.method_23317();
        iIiIiIIIII2 = Math.toDegrees(Math.atan2(iIiIiIIIII3 - this.iIIiiIiIiI.field_1724.method_23321(), iIiIiIIIII2)) - 90.0;
        this.iIIiiIiIiI.field_1724.method_36456((float)iIiIiIIIII2);
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        iIiiiIIiII iIiiiIIiII2 = iIiiiIIiII3;
        iIiiiIIiII iIiiiIIiII3 = (ElytraFly)Modules.get().get(ElytraFly.class);
        if (iIiiiIIiII3 == null) {
            return 5 >> 3;
        }
        if (!iIiiiIIiII3.isActive()) {
            return 5 >> 3;
        }
        if (((ElytraFly)iIiiiIIiII3).flightMode.get() == ElytraFlightModes.Pitch40) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    public static int ALLATORIxDEMO(int iIiIiIIIII2) {
        if (iIiIiIIIII2 <= 0) {
            return 3 ^ 3;
        }
        return (iIiIiIIIII2 + (0x7F & 0x3F)) / (0x70 & 0x4F);
    }
}

