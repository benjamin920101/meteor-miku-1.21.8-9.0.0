/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Items
 *  net.minecraft.block.BedBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.CobwebBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIIIiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiIiiIii;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.CobwebBlock;

public class iIIiIIIIii
extends iIiIiIIIii {
    private final Setting<Double> iIiiiIiIii;
    private final SettingGroup iIiIiiiiII;
    private class_2338 IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private class_2338 iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Double> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, boolean bl) {
        int iIiIiIIIII2;
        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
        iIIiIIIIii iIIiIIIIii3 = class_23382;
        iIIiIIIIii iIiIiIIIII3 = iIIiIIIIii2;
        iIIiIIIIii3 = iIIiIIIIii3.method_10074();
        class_2338 class_23383 = iIIiIIIIii3.method_10084();
        boolean bl2 = (iIIiIIIIii3 = iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIiIIIIii3).method_26204()) == class_2246.field_9987 || iIIiIIIIii3 == class_2246.field_10540 || iIiIiIIIII2 == 0;
        int this2 = !iIiIiIIIII3.iiIIiIIiii(class_23383) ? 4 ^ 5 : 0;
        iIiIiIIIII2 = !iIiIiIIIII3.iiIIiIIiii(class_23383.method_10084()) ? 2 ^ 3 : 0;
        boolean bl3 = !((Boolean)iIiIiIIIII3.iiiiiIIiIi.get()).booleanValue() || iIiIiIIIII3.iIIiiIiIiI.field_1687.method_22347(class_23383.method_10084());
        if (bl2 && this2 != 0 && iIiIiIIIII2 != 0 && bl3) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiIiiIi(class_2338 object) {
        void iIiIiIIIII2;
        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
        iIIiIIIIii iIIiIIIIii3 = object;
        object = iIIiIIIIii2;
        iIiIiIIIII2.iIIiiIiIiI = iIIiIIIIii3;
        BlockUtils.breakBlock((class_2338)iIiIiIIIII2.iIIiiIiIiI, (3 ^ 3) != 0);
    }

    private /* synthetic */ boolean IIIIiIIiII(class_2338 class_23382) {
        iIIiIIIIii iIiIiIIIII2 = this;
        if (!iIiIiIIIII2.iiiIiIiiIi((class_2338)(this = class_23382))) {
            return (2 & 5) != 0;
        }
        if (this.equals(iIiIiIIIII2.IIIIiiIiii) && Set.of(class_1802.field_8647, class_1802.field_8387, class_1802.field_8403, class_1802.field_8335, class_1802.field_8377, class_1802.field_22024).contains(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_6047().method_7909())) {
            return (3 & 4) != 0;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(class_2338 class_23382) {
        void iIiIiIIIII2;
        iIIiIIIIii iIIiIIIIii2 = this;
        int n = 2 & 5;
        if (!iIIiIIIIii2.IIIIiIIiII((class_2338)iIiIiIIIII2)) {
            ++n;
        }
        if (!iIIiIIIIii2.IIIIiIIiII(iIiIiIIIII2.method_10084())) {
            ++n;
        }
        return n;
    }

    private /* synthetic */ boolean iiIIiIIiii(class_2338 class_23382) {
        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
        iIIiIIIIii iIIiIIIIii3 = class_23382;
        iIIiIIIIii iIiIiIIIII3 = iIIiIIIIii2;
        return iIiIiIIIII3.iIIiiIiIiI.field_1687.method_8335(null, new class_238((class_2338)iIIiIIIIii3)).stream().anyMatch(iIiIiIIIII2 -> {
            if (!iIiIiIIIII2.method_7325()) {
                return (3 & 5) != 0;
            }
            return false;
        });
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
        iIIiIIIIii iIiIiIIIII2 = iIIiIIIIii2;
        iIIiIIIIii iIIiIIIIii3 = class_23382;
        if (iIiIiIIIII2.ALLATORIxDEMO((class_2338)iIIiIIIIii3) > (Double)iIiIiIIIII2.iIiIiIIIII.get()) {
            return 5 >> 3;
        }
        if ((iIIiIIIIii3 = iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIiIIIIii3).method_26204()) == class_2246.field_10540 || iIIiIIIIii3 == class_2246.field_10443 || iIIiIIIIii3 == class_2246.field_22108 || iIIiIIIIii3 == class_2246.field_23152) {
            return true;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIIiIIIIii iIiIiIIIII2;
        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
        iIIiIIIIii iIIiIIIIii3 = pre;
        iIIiIIIIii iIIiIIIIii4 = iIiIiIIIII2 = iIIiIIIIii2;
        iIIiIIIIii3 = iIIiIIIIii4.ALLATORIxDEMO((Double)iIIiIIIIii4.iIiiiIiIii.get());
        if (iIIiIIIIii3 == null) {
            return;
        }
        iIiIiIIIII2.ALLATORIxDEMO((class_1657)iIIiIIIIii3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        void iIiIiIIIII2;
        iIIiIIIIii iIIiIIIIii2;
        iIIiIIIIii iIIiIIIIii3 = iIIiIIIIii2 = iIIiIIIIii4;
        class_2248 class_22482 = iIIiIIIIii3.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIiIIIII2).method_26204();
        iIIiIIIIii iIIiIIIIii4 = iIIiIIIIii3.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII2.method_10084()).method_26204();
        if (iIIiIIIIii3.ALLATORIxDEMO(class_22482) || class_22482 instanceof class_2244 || class_22482 instanceof class_2560) {
            return false;
        }
        if (iIIiIIIIii2.ALLATORIxDEMO((class_2248)iIIiIIIIii4) || iIIiIIIIii4 instanceof class_2244 || iIIiIIIIii4 instanceof class_2560) {
            return false;
        }
        return iIIiIIIIii2.ALLATORIxDEMO((class_2338)iIiIiIIIII2, (2 ^ 3) != 0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_1657> ALLATORIxDEMO(double d) {
        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
        ArrayList<class_1657> arrayList = new ArrayList<class_1657>();
        Iterator iterator = iIIiIIIIii2.iIIiiIiIiI.field_1687.method_18456().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                void iIiIiIIIII2;
                iIIiIIIIii iIIiIIIIii3 = (class_1657)iterator.next();
                if (iIIiIIIIii3 == iIIiIIIIii2.iIIiiIiIiI.field_1724 || iIIiIIIIii3.method_29504()) continue block0;
                if (iIIiIIIIii3.method_6032() <= 0.0f) {
                    iterator2 = iterator;
                    continue;
                }
                if (!((double)iIIiIIIIii2.iIIiiIiIiI.field_1724.method_5739((class_1297)iIIiIIIIii3) <= iIiIiIIIII2)) continue block0;
                arrayList.add((class_1657)iIIiIIIIii3);
                continue block0;
            }
            break;
        }
        return arrayList;
    }

    private /* synthetic */ class_1657 ALLATORIxDEMO(double d) {
        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii4;
        iIIiIIIIii iIIiIIIIii3 = null;
        Iterator iterator = iIIiIIIIii2.iIIiiIiIiI.field_1687.method_18456().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                double iIiIiIIIII2;
                double d2;
                iIIiIIIIii iIIiIIIIii4 = (class_1657)iterator.next();
                if (iIIiIIIIii4 == iIIiIIIIii2.iIIiiIiIiI.field_1724 || iIIiIIIIii4.method_29504()) continue block0;
                if (iIIiIIIIii4.method_6032() <= 0.0f) {
                    iterator2 = iterator;
                    continue;
                }
                double d3 = iIIiIIIIii2.iIIiiIiIiI.field_1724.method_5739((class_1297)iIIiIIIIii4);
                if (!(d2 < iIiIiIIIII2)) continue block0;
                iIiIiIIIII2 = d3;
                iIIiIIIIii3 = iIIiIIIIii4;
                continue block0;
            }
            break;
        }
        return iIIiIIIIii3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1657 class_16572) {
        int n;
        int n2;
        void iIiIiIIIII2;
        iIIiIIIIii object2;
        iIIiIIIIii iIIiIIIIii2 = object2;
        class_2338 class_23383 = iIiIiIIIII2.method_24515();
        double[] dArray = new double[--3];
        dArray[2 & 5] = -0.8;
        dArray[2 ^ 3] = 0.5;
        dArray[1 ^ 3] = 1.1;
        double[] dArray2 = dArray;
        double[] dArray3 = new double[--2];
        dArray3[3 >> 2] = 0.3;
        dArray3[4 ^ 5] = -0.3;
        double[] dArray4 = dArray3;
        iIIiIIIIii iIIiIIIIii3 = iIIiIIIIii2;
        for (class_1657 this3222 : iIIiIIIIii3.ALLATORIxDEMO((Double)iIIiIIIIii3.iIiiiIiIii.get())) {
            double[] dArray5 = dArray2;
            n2 = dArray2.length;
            int n3 = 3 & 4;
            while (n3 < n2) {
                int n4;
                double d = dArray5[n4];
                double[] dArray6 = dArray4;
                int n5 = dArray4.length;
                int n6 = 2 & 5;
                while (n6 < n5) {
                    int n7;
                    double d2 = dArray6[n7];
                    double[] dArray7 = dArray4;
                    int n8 = dArray4.length;
                    int n9 = 5 >> 3;
                    while (n9 < n8) {
                        int n10;
                        double d3 = dArray7[n10];
                        class_2338 class_23384 = new class_2338((int)(this3222.method_23317() + d2), (int)(this3222.method_23318() + d), (int)(this3222.method_23321() + d3));
                        if (iIIiIIIIii2.IIIIiIIiII(class_23384) && class_23384.equals((Object)iIIiIIIIii2.iIIiiIiIiI)) {
                            return;
                        }
                        n9 = ++n10;
                    }
                    n6 = ++n7;
                }
                n3 = ++n4;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (((Boolean)iIIiIIIIii2.IIiIiIIiii.get()).booleanValue()) {
            arrayList.add(-0.8);
        }
        if (((Boolean)iIIiIIIIii2.IiiIiIiiIi.get()).booleanValue()) {
            arrayList.add(0.5);
        }
        if (((Boolean)iIIiIIIIii2.iIIiIiiiIi.get()).booleanValue()) {
            arrayList.add(1.1);
        }
        Iterator this3222 = arrayList.iterator();
        while (this3222.hasNext()) {
            double d = (Double)this3222.next();
            double[] dArray8 = dArray4;
            int n11 = dArray4.length;
            int n12 = 3 & 4;
            while (n12 < n11) {
                double d4 = dArray8[n];
                class_2338 class_23385 = new class_2338((int)(iIiIiIIIII2.method_23317() + d4), (int)(iIiIiIIIII2.method_23318() + d), (int)(iIiIiIIIII2.method_23321() + d4));
                if (iIIiIIIIii2.IIIIiIIiII(class_23385)) {
                    iIIiIIIIii2.iiiIiIiiIi(class_23385);
                    return;
                }
                n12 = ++n;
            }
        }
        this3222 = arrayList.iterator();
        while (this3222.hasNext()) {
            double d = (Double)this3222.next();
            double[] dArray9 = dArray4;
            int n13 = dArray4.length;
            int n14 = 2 & 5;
            while (n14 < n13) {
                double d5 = dArray9[n];
                double[] dArray10 = dArray4;
                int n15 = dArray4.length;
                int n16 = 3 >> 2;
                while (n16 < n15) {
                    int n17;
                    double d6 = dArray10[n17];
                    class_2338 class_23386 = new class_2338((int)(iIiIiIIIII2.method_23317() + d6), (int)(iIiIiIIIII2.method_23318() + d), (int)(iIiIiIIIII2.method_23321() + d5));
                    if (iIIiIIIIii2.IIIIiIIiII(class_23386)) {
                        iIIiIIIIii2.iiiIiIiiIi(class_23386);
                        return;
                    }
                    n16 = ++n17;
                }
                n14 = ++n;
            }
        }
        if (((Boolean)iIIiIIIIii2.ALLATORIxDEMO.get()).booleanValue()) {
            if (!((Boolean)iIIiIIIIii2.iiiiiIIiIi.get()).booleanValue()) {
                int n18;
                class_2350[] this3222 = class_2350.values();
                int n19 = this3222.length;
                int n20 = n2 = 2 & 5;
                while (n20 < n19) {
                    class_2338 class_23387;
                    class_2350 class_23502 = this3222[n2];
                    if (class_23502 != class_2350.field_11036 && class_23502 != class_2350.field_11033 && !(iIIiIIIIii2.ALLATORIxDEMO(class_23387 = class_23383.method_10093(class_23502)) > (Double)iIIiIIIIii2.iIiIiIIIII.get()) && (iIIiIIIIii2.iIIiiIiIiI.field_1687.method_22347(class_23387) || class_23387.equals((Object)iIIiIIIIii2.iIIiiIiIiI))) {
                        if (iIIiIIIIii2.ALLATORIxDEMO(class_23387, (3 & 4) != 0)) {
                            return;
                        }
                    }
                    n20 = ++n2;
                }
                ArrayList<class_2338> this3222 = new ArrayList<class_2338>();
                class_2338 class_23388 = class_2350.values();
                n2 = ((class_2350[])class_23388).length;
                int n21 = n18 = 3 & 4;
                while (n21 < n2) {
                    class_2338 class_23389;
                    class_2350 class_23503 = class_23388[n18];
                    if (class_23503 != class_2350.field_11036 && class_23503 != class_2350.field_11033 && !(iIIiIIIIii2.ALLATORIxDEMO(class_23389 = class_23383.method_10093(class_23503)) > (Double)iIIiIIIIii2.iIiIiIIIII.get()) && iIIiIIIIii2.IIIIiIIiII(class_23389)) {
                        if (iIIiIIIIii2.ALLATORIxDEMO(class_23389, 5 >> 2)) {
                            this3222.add(class_23389);
                        }
                    }
                    n21 = ++n18;
                }
                if (!this3222.isEmpty()) {
                    class_23388 = this3222.stream().min(Comparator.comparingDouble(class_23382 -> {
                        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
                        iIIiIIIIii iIIiIIIIii3 = class_23382;
                        iIIiIIIIii iIiIiIIIII2 = iIIiIIIIii2;
                        class_243 class_2432 = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_33571();
                        iIIiIIIIii3 = class_243.method_24953((class_2382)iIIiIIIIii3);
                        return Math.sqrt(class_2432.method_1025((class_243)iIIiIIIIii3));
                    })).orElse(null);
                    if (class_23388 != null) {
                        iIIiIIIIii2.iiiIiIiiIi(class_23388);
                    }
                } else {
                    this3222.clear();
                    class_23388 = class_2350.values();
                    n2 = ((class_2350[])class_23388).length;
                    int n22 = n18 = 2 & 5;
                    while (n22 < n2) {
                        class_2338 class_233810;
                        class_2338 class_233811 = class_23388[n18];
                        if (class_233811 != class_2350.field_11036 && class_233811 != class_2350.field_11033 && !(iIIiIIIIii2.ALLATORIxDEMO(class_233810 = class_23383.method_10093((class_2350)class_233811)) > (Double)iIIiIIIIii2.iIiIiIIIII.get()) && iIIiIIIIii2.IIIIiIIiII(class_233810)) {
                            if (iIIiIIIIii2.ALLATORIxDEMO(class_233810, 5 >> 3)) {
                                this3222.add(class_233810);
                            }
                        }
                        n22 = ++n18;
                    }
                    if (!this3222.isEmpty() && (class_23388 = (class_2338)this3222.stream().min(Comparator.comparingDouble(class_23382 -> {
                        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
                        iIIiIIIIii iIIiIIIIii3 = class_23382;
                        iIIiIIIIii iIiIiIIIII2 = iIIiIIIIii2;
                        class_243 class_2432 = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_33571();
                        iIIiIIIIii3 = class_243.method_24953((class_2382)iIIiIIIIii3);
                        return Math.sqrt(class_2432.method_1025((class_243)iIIiIIIIii3));
                    })).orElse(null)) != null) {
                        iIIiIIIIii2.iiiIiIiiIi(class_23388);
                    }
                }
            } else {
                int n23;
                class_2350[] this3222 = class_2350.values();
                int n24 = this3222.length;
                int n25 = n2 = 2 & 5;
                while (n25 < n24) {
                    class_2338 class_233812;
                    class_2350 class_23504 = this3222[n2];
                    if (class_23504 != class_2350.field_11036 && class_23504 != class_2350.field_11033 && !(iIIiIIIIii2.ALLATORIxDEMO(class_233812 = class_23383.method_10093(class_23504)) > (Double)iIIiIIIIii2.iIiIiIIIII.get()) && iIIiIIIIii2.iIIiiIiIiI.field_1687.method_22347(class_233812) && iIIiIIIIii2.iIIiiIiIiI.field_1687.method_22347(class_233812.method_10084())) {
                        if (iIIiIIIIii2.ALLATORIxDEMO(class_233812, (2 & 5) != 0)) {
                            return;
                        }
                    }
                    n25 = ++n2;
                }
                ArrayList<class_2338> this3222 = new ArrayList<class_2338>();
                class_2350[] class_2350Array = class_2350.values();
                n2 = class_2350Array.length;
                int n26 = n23 = 3 & 4;
                while (n26 < n2) {
                    class_2338 class_233813;
                    class_2350 class_23505 = class_2350Array[n23];
                    if (class_23505 != class_2350.field_11036 && class_23505 != class_2350.field_11033 && !(iIIiIIIIii2.ALLATORIxDEMO(class_233813 = class_23383.method_10093(class_23505)) > (Double)iIIiIIIIii2.iIiIiIIIII.get()) && iIIiIIIIii2.ALLATORIxDEMO(class_233813)) {
                        this3222.add(class_233813);
                    }
                    n26 = ++n23;
                }
                int n27 = 0;
                class_2338 class_233814 = null;
                for (class_2338 class_233815 : this3222) {
                    int n28 = iIIiIIIIii2.ALLATORIxDEMO(class_233815);
                    if (n28 < n27) continue;
                    n27 = n28;
                    class_233814 = class_233815;
                }
                if (class_233814 != null) {
                    iIIiIIIIii2.ALLATORIxDEMO(class_233814);
                }
            }
        }
        if (iIIiIIIIii2.iIIiiIiIiI == null && ((Boolean)iIIiIIIIii2.IiiIiIiiIi.get()).booleanValue()) {
            int n29;
            double[] dArray11 = new double[--3];
            dArray11[3 ^ 3] = 0.0;
            dArray11[3 & 5] = 0.3;
            dArray11[--2] = -0.3;
            double[] this3222 = dArray11;
            double[] dArray12 = new double[1 ^ 3];
            dArray12[5 >> 3] = 0.5;
            dArray12[3 >> 1] = 1.1;
            double[] dArray13 = dArray12;
            double[] dArray14 = dArray12;
            int n30 = dArray14.length;
            int n31 = n29 = 3 & 4;
            while (n31 < n30) {
                double d = dArray14[n29];
                double[] dArray15 = this3222;
                int n32 = this3222.length;
                int n33 = 3 ^ 3;
                while (n33 < n32) {
                    int n34;
                    double d7 = dArray15[n34];
                    class_2338 class_233816 = new class_2338((int)(iIiIiIIIII2.method_23317() + d7), (int)(iIiIiIIIII2.method_23318() + d), (int)(iIiIiIIIII2.method_23321() + d7));
                    if (iIIiIIIIii2.iiiIiIiiIi(class_233816)) {
                        iIIiIIIIii2.iiiIiIiiIi(class_233816);
                        return;
                    }
                    n33 = ++n34;
                }
                n31 = ++n29;
            }
            dArray14 = dArray13;
            n30 = dArray13.length;
            int n35 = n29 = 3 >> 2;
            while (n35 < n30) {
                double d = dArray14[n29];
                double[] dArray16 = this3222;
                int n36 = this3222.length;
                int n37 = 3 & 4;
                while (n37 < n36) {
                    int n38;
                    double d8 = dArray16[n38];
                    double[] dArray17 = this3222;
                    int n39 = this3222.length;
                    int n40 = 3 >> 2;
                    while (n40 < n39) {
                        int n41;
                        double d9 = dArray17[n41];
                        class_23383 = new class_2338((int)(iIiIiIIIII2.method_23317() + d9), (int)(iIiIiIIIII2.method_23318() + d), (int)(iIiIiIIIII2.method_23321() + d8));
                        if (iIIiIIIIii2.iiiIiIiiIi(class_23383)) {
                            iIIiIIIIii2.iiiIiIiiIi(class_23383);
                            return;
                        }
                        n40 = ++n41;
                    }
                    n37 = ++n38;
                }
                n35 = ++n29;
            }
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        iIIiIIIIii iIiIiIIIII2;
        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
        iIIiIIIIii iIIiIIIIii3 = class_23382;
        iIIiIIIIii iIIiIIIIii4 = iIiIiIIIII2 = iIIiIIIIii2;
        if (iIiIiIIIII2.IIIIiIIiII((class_2338)iIIiIIIIii3)) {
            iIIiIIIIii4.iiiIiIiiIi((class_2338)iIIiIIIIii3);
            return;
        }
        if (iIIiIIIIii4.IIIIiIIiII(iIIiIIIIii3.method_10084())) {
            iIiIiIIIII2.iiiIiIiiIi(iIIiIIIIii3.method_10084());
        }
    }

    public iIIiIIIIii() {
        iIIiIIIIii iIIiIIIIii2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, IIiiIIIiiI.ALLATORIxDEMO("\u630c\u8150"), iIiiIiiIii.ALLATORIxDEMO("\u8189\u529c\u7877\u575b\u652f\u4e8e\u540b\u56c0\u76e7\u9606\u62c7\u658d\u5714\uff18\u5346\u62f8\u94ad\u5771\u3042\u9776\u90ac\u549f\u56b7\u57da\u9e8f\u66d5\u77e7\u3041"));
        iIIiIIIIii2.iIiIiiiiII = iIIiIIIIii2.settings.getDefaultGroup();
        iIIiIIIIii2.IiiIiIiiIi = iIIiIIIIii2.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIiiI.ALLATORIxDEMO("\u94a1\u577a\u782e\u5705"))).description(iIiiIiiIii.ALLATORIxDEMO("\u7875\u570c\u6558\u4efe\u94a8\u5773\u65e2\u76da\u65b0\u5743\u3041"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiIiiiIi = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIiiI.ALLATORIxDEMO("\u9778\u90a2\u782e\u5705"))).description(iIiiIiiIii.ALLATORIxDEMO("\u7822\u570e\u650f\u4eae\u9726\u90fb\u9a9b\u5eb2\u76da\u65b0\u5743\u3041"))).defaultValue((Object)(5 >> 2))).build());
        this.ALLATORIxDEMO = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIiiI.ALLATORIxDEMO("\u56ee\u8150\u782e\u5705"))).description(iIiiIiiIii.ALLATORIxDEMO("\u7875\u570c\u6558\u4efe\u547b\u56b7\u7690\u9e8f\u66d5\u77e7\u3041"))).defaultValue((Object)(3 >> 1))).build());
        this.IIiIiIIiii = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIiiI.ALLATORIxDEMO("\u8100\u4e41\u782e\u5705"))).description(iIiiIiiIii.ALLATORIxDEMO("\u7877\u575b\u6508\u4ea9\u8159\u4e1f\u76da\u65b0\u5743\u3041"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiiiiIIiIi = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIiiI.ALLATORIxDEMO("\u000bD+x\u6a3b\u5f45"))).description(iIiiIiiIii.ALLATORIxDEMO("\u4f1c\u751cc%m%$a\u720b\u6738\u76c0\u6c27\u6635\u652a\u7f30\u89cd\u520d\u3041"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIiiiIiIii = this.iIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiIIIiiI.ALLATORIxDEMO("\u76f4\u684d\u8319\u56be"))).description(iIiiIiiIii.ALLATORIxDEMO("\u6458\u7d31\u76ad\u6813\u76da\u830a\u56e0\u3041"))).defaultValue(5.0).min(1.0).max(8.0).sliderMax(8.0).build());
        this.iIiIiIIIII = this.iIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiIIIiiI.ALLATORIxDEMO("\u630c\u63d2\u8319\u56be"))).description(iIiiIiiIii.ALLATORIxDEMO("\u6355\u638c\u65fd\u5744\u76c7\u6714\u5979\u830a\u56e0\u3041"))).defaultValue(5.0).min(1.0).max(8.0).sliderMax(8.0).build());
        iIIiIIIIii iIIiIIIIii3 = this;
        iIIiIIIIii3.iIIiiIiIiI = null;
        iIIiIIIIii3.IIIIiiIiii = null;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiiIIIiiI.ALLATORIxDEMO("M!8li/\u001a\u001fJ\u000e{>_K\u001a\u8b9d\u66ce\u65da\u520a\u676a\u65aa\u7202\u6736\uff4b"));
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        iIIiIIIIii iIIiIIIIii2 = iIIiIIIIii3;
        iIIiIIIIii iIIiIIIIii3 = class_22482;
        iIIiIIIIii iIiIiIIIII2 = iIIiIIIIii2;
        if (iIIiIIIIii3 == class_2246.field_9987 || iIIiIIIIii3 == class_2246.field_10525 || iIIiIIIIii3 == class_2246.field_10499 || iIIiIIIIii3 == class_2246.field_10398) {
            return true;
        }
        return false;
    }
}

