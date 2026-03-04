/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.game.GameJoinedEvent
 *  meteordevelopment.meteorclient.mixininterface.IRaycastContext
 *  meteordevelopment.meteorclient.utils.PreInit
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.world.Difficulty
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.block.BlockState
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.Arrays;
import java.util.Date;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.game.GameJoinedEvent;
import meteordevelopment.meteorclient.mixininterface.IRaycastContext;
import meteordevelopment.meteorclient.utils.PreInit;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.world.Difficulty;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.world.BlockView;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import org.apache.commons.lang3.mutable.MutableInt;

public class iIiiIiiIii {
    public static class_3959 ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, class_2338 class_23383, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        boolean bl2 = bl;
        class_1309 iIiIiIIIII7 = class_13092;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII7, (class_238)iIiIiIIIII6, (class_243)iIiIiIIIII5, (class_2338)iIiIiIIIII4, (class_2338)iIiIiIIIII3, (boolean)iIiIiIIIII2, 6.0);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_243 class_2432, class_238 class_2383, class_2338 class_23382, class_2338 class_23383, boolean bl) {
        class_243 iIiIiIIIII2 = class_2383;
        class_243 iIiIiIIIII3 = class_2432;
        iIiiiIIiIi.iiiIiIiiIi((IRaycastContext)ALLATORIxDEMO, iIiIiIIIII3, null, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, MeteorClient.mc.field_1724);
        class_243 class_2433 = iIiIiIIIII2;
        double d = class_2433.method_17939();
        double d2 = class_2433.method_17940();
        double d3 = class_2433.method_17941();
        double d4 = 1.0 / (d * 2.0 + 1.0);
        double d5 = 1.0 / (d2 * 2.0 + 1.0);
        double d6 = 1.0 / (d3 * 2.0 + 1.0);
        double d7 = (1.0 - Math.floor(1.0 / d4) * d4) / 2.0;
        double d8 = (1.0 - Math.floor(1.0 / d6) * d6) / 2.0;
        d = d4 * d;
        d2 = d5 * d2;
        d3 = d6 * d3;
        if (d < 0.0 || d2 < 0.0 || d3 < 0.0) {
            return 0.0;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        class_243 class_2434 = iIiIiIIIII2;
        d4 = class_2434.field_1323 + d7;
        d5 = class_2434.field_1320 + d7;
        double d9 = d4;
        while (d9 <= d5) {
            double d10 = iIiIiIIIII2.field_1322;
            while (d10 <= iIiIiIIIII2.field_1325) {
                class_243 class_2435 = iIiIiIIIII2;
                d7 = class_2435.field_1321 + d8;
                double d11 = class_2435.field_1324 + d8;
                double d12 = d7;
                while (d12 <= d11) {
                    void iIiIiIIIII4;
                    void iIiIiIIIII5;
                    void iIiIiIIIII6;
                    class_243 class_2436 = new class_243(d4, d6, d7);
                    iIiiiIIiIi.iiiIiIiiIi((IRaycastContext)ALLATORIxDEMO, iIiIiIIIII3, class_2436, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, MeteorClient.mc.field_1724);
                    if (iIiiIiiIii.ALLATORIxDEMO(ALLATORIxDEMO, (class_2338)iIiIiIIIII6, (class_2338)iIiIiIIIII5, (boolean)iIiIiIIIII4).method_17783() == class_239.class_240.field_1333) {
                        f += 1.0f;
                    }
                    f2 += 1.0f;
                    d12 = d7 + d3;
                }
                d10 = d6 + d2;
            }
            d9 = d4 + d;
        }
        return f / f2;
    }

    @EventHandler
    public static void ALLATORIxDEMO(GameJoinedEvent iIiIiIIIII2) {
        ALLATORIxDEMO = new class_3959(class_243.field_1353, class_243.field_1353, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)MeteorClient.mc.field_1724);
    }

    public static double ALLATORIxDEMO(double iIiIiIIIII2) {
        class_1267 class_12672 = MeteorClient.mc.field_1687.method_8407();
        if (class_12672 == class_1267.field_5805) {
            return Math.min(iIiIiIIIII2 / 2.0 + 1.0, iIiIiIIIII2);
        }
        if (class_12672 == class_1267.field_5802) {
            return iIiIiIIIII2;
        }
        return iIiIiIIIII2 * 1.5;
    }

    @PreInit
    public static void ALLATORIxDEMO() {
        MeteorClient.EVENT_BUS.subscribe(iIiiIiiIii.class);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, boolean bl, double d) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        boolean bl2 = bl;
        class_1309 iIiIiIIIII7 = class_13092;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII7, (class_238)iIiIiIIIII6, (class_243)iIiIiIIIII5, (class_2338)iIiIiIIIII4, null, (boolean)iIiIiIIIII3, (double)iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_238 class_2383, class_243 class_2432, class_2338 class_23382, class_2338 class_23383, boolean bl, double d) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        double d2;
        class_238 iIiIiIIIII6 = class_2432;
        class_238 iIiIiIIIII7 = class_2383;
        double d3 = new class_243((iIiIiIIIII7.field_1323 + iIiIiIIIII7.field_1320) / 2.0, iIiIiIIIII7.field_1322, (iIiIiIIIII7.field_1321 + iIiIiIIIII7.field_1324) / 2.0).method_1022((class_243)iIiIiIIIII6) / (iIiIiIIIII2 *= 2.0);
        if (d2 > 1.0) {
            return 0.0;
        }
        double d4 = iIiiIiiIii.ALLATORIxDEMO((class_243)iIiIiIIIII6, iIiIiIIIII7, (class_2338)iIiIiIIIII5, (class_2338)iIiIiIIIII4, (boolean)iIiIiIIIII3);
        d3 = (1.0 - d3) * d4;
        return (int)((d3 * d3 + d3) * 3.5 * iIiIiIIIII2 + 1.0);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_1309 class_13092, double d, boolean n) {
        void iIiIiIIIII2;
        class_1309 iIiIiIIIII3;
        int iIiIiIIIII4 = n;
        class_1309 class_13093 = iIiIiIIIII3 = class_13092;
        class_1799 class_17992 = class_13093.method_6118(class_1304.field_6169);
        class_1799 class_17993 = class_13093.method_6118(class_1304.field_6174);
        class_1799 class_17994 = class_13093.method_6118(class_1304.field_6172);
        class_1799 class_17995 = class_13093.method_6118(class_1304.field_6166);
        class_1799[] class_1799Array = new class_1799[--4];
        class_1799Array[3 & 4] = class_17992;
        class_1799Array[2 ^ 3] = class_17993;
        class_1799Array[--2] = class_17994;
        class_1799Array[--3] = class_17995;
        iIiIiIIIII4 = iIiiIiiIii.ALLATORIxDEMO(Arrays.asList(class_1799Array), iIiIiIIIII4 != 0);
        if (iIiIiIIIII4 > 0) {
            iIiIiIIIII2 *= (double)(1.0f - class_3532.method_15363((float)iIiIiIIIII4, (float)0.0f, (float)20.0f) / 25.0f);
        }
        return (double)iIiIiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, class_2338 class_23383, boolean bl, double d) {
        double iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        class_1309 iIiIiIIIII7 = class_2383;
        class_1309 iIiIiIIIII8 = class_13092;
        if (iIiIiIIIII7 == null) {
            return 0.0;
        }
        iIiIiIIIII2 = iIiiIiiIii.ALLATORIxDEMO((class_238)iIiIiIIIII7, (class_243)iIiIiIIIII6, (class_2338)iIiIiIIIII5, (class_2338)iIiIiIIIII4, (boolean)iIiIiIIIII3, iIiIiIIIII2);
        iIiIiIIIII2 = iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII2);
        class_1309 class_13093 = iIiIiIIIII8;
        iIiIiIIIII2 = iIiiIiiIii.iiiIiIiiIi(class_13093, iIiIiIIIII2);
        iIiIiIIIII2 = iIiiIiiIii.ALLATORIxDEMO(class_13093, iIiIiIIIII2);
        iIiIiIIIII2 = iIiiIiiIii.ALLATORIxDEMO(class_13093, iIiIiIIIII2, (4 ^ 5) != 0);
        return iIiIiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    public static class_3965 ALLATORIxDEMO(class_3959 class_39592, class_2338 class_23382, class_2338 class_23383) {
        void iIiIiIIIII2;
        class_3959 iIiIiIIIII3 = class_23383;
        class_3959 iIiIiIIIII4 = class_39592;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII4, (class_2338)iIiIiIIIII2, (class_2338)iIiIiIIIII3, 5 >> 3);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(class_9304 class_93042, MutableInt mutableInt, boolean bl, class_6880 class_68802) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        class_9304 class_93043 = class_93042;
        void v0 = iIiIiIIIII4;
        int iIiIiIIIII5 = class_93043.method_57536((class_6880)v0);
        if (v0.method_40226(class_1893.field_9111.method_29177())) {
            iIiIiIIIII3.add(iIiIiIIIII5);
            return;
        }
        if (iIiIiIIIII2 != false && iIiIiIIIII4.method_40226(class_1893.field_9107.method_29177())) {
            iIiIiIIIII3.add(iIiIiIIIII5 * --2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static double iiiIiIiiIi(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        boolean bl2 = bl;
        class_1309 iIiIiIIIII6 = class_13092;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII6, (class_238)iIiIiIIIII5, (class_243)iIiIiIIIII4, (class_2338)iIiIiIIIII3, (boolean)iIiIiIIIII2, 5.0);
    }

    public static class_3965 iiiIiIiiIi(class_3959 iIiIiIIIII2) {
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII2, (3 & 4) != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(Iterable<class_1799> iterable, boolean bl) {
        Object iIiIiIIIII2;
        Iterable<class_1799> iterable2 = iterable;
        MutableInt mutableInt = new MutableInt();
        Object object = iIiIiIIIII2 = iterable2.iterator();
        while (object.hasNext()) {
            void iIiIiIIIII3;
            class_1799 class_17992 = (class_1799)iIiIiIIIII2.next();
            if (class_17992.method_7960()) {
                object = iIiIiIIIII2;
                continue;
            }
            class_17992 = class_17992.method_58657();
            class_17992.method_57534().stream().forEach(arg_0 -> iIiiIiiIii.ALLATORIxDEMO((class_9304)class_17992, mutableInt, (boolean)iIiIiIIIII3, arg_0));
            object = iIiIiIIIII2;
        }
        return mutableInt.intValue();
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        boolean bl2 = bl;
        class_1309 iIiIiIIIII6 = class_13092;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII6, (class_238)iIiIiIIIII5, (class_243)iIiIiIIIII4, (class_2338)iIiIiIIIII3, (boolean)iIiIiIIIII2, 6.0);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ class_3965 ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383, boolean bl, class_3959 class_39592, class_2338 class_23384) {
        class_243 class_2432;
        class_243 iIiIiIIIII2;
        void v0;
        void iIiIiIIIII3;
        class_2338 iIiIiIIIII4;
        void iIiIiIIIII5;
        class_2338 class_23385 = class_23382;
        if (iIiIiIIIII5.equals((Object)class_23385)) {
            iIiIiIIIII4 = class_2246.field_10540.method_9564();
            v0 = iIiIiIIIII3;
        } else if (iIiIiIIIII5.equals((Object)iIiIiIIIII2)) {
            iIiIiIIIII4 = class_2246.field_10124.method_9564();
            v0 = iIiIiIIIII3;
        } else {
            void iIiIiIIIII6;
            class_2432 = MeteorClient.mc.field_1687.method_8320((class_2338)iIiIiIIIII5);
            if (iIiIiIIIII6 != false && class_2432.method_26204().method_9520() < 200.0f) {
                iIiIiIIIII4 = class_2246.field_10124.method_9564();
                v0 = iIiIiIIIII3;
            } else {
                iIiIiIIIII4 = class_2432;
                v0 = iIiIiIIIII3;
            }
        }
        class_2432 = v0.method_17750();
        void v1 = iIiIiIIIII3;
        iIiIiIIIII2 = v1.method_17747();
        class_265 iIiIiIIIII6 = v1.method_17748((class_2680)iIiIiIIIII4, (class_1922)MeteorClient.mc.field_1687, (class_2338)iIiIiIIIII5);
        return MeteorClient.mc.field_1687.method_17745(class_2432, iIiIiIIIII2, (class_2338)iIiIiIIIII5, iIiIiIIIII6, (class_2680)iIiIiIIIII4);
    }

    /*
     * WARNING - void declaration
     */
    public static class_3965 ALLATORIxDEMO(class_3959 class_39593, class_2338 class_23382, class_2338 class_23383, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        boolean iIiIiIIIII4 = bl;
        class_3959 iIiIiIIIII5 = class_39593;
        return (class_3965)class_1922.method_17744((class_243)iIiIiIIIII5.method_17750(), (class_243)iIiIiIIIII5.method_17747(), (Object)iIiIiIIIII5, (arg_0, arg_1) -> iIiiIiiIii.ALLATORIxDEMO((class_2338)iIiIiIIIII3, (class_2338)iIiIiIIIII2, iIiIiIIIII4, arg_0, arg_1), class_39592 -> {
            class_3959 class_39593;
            class_3959 class_39594 = class_39593 = class_39592;
            class_3959 iIiIiIIIII2 = class_39593.method_17750().method_1020(class_39594.method_17747());
            return class_3965.method_17778((class_243)class_39594.method_17747(), (class_2350)class_2350.method_10142((double)iIiIiIIIII2.field_1352, (double)iIiIiIIIII2.field_1351, (double)iIiIiIIIII2.field_1350), (class_2338)class_2338.method_49638((class_2374)class_39593.method_17747()));
        });
    }

    public static class_3965 ALLATORIxDEMO(class_3959 class_39592, boolean bl) {
        boolean iIiIiIIIII2 = bl;
        class_3959 iIiIiIIIII3 = class_39592;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII3, null, null, iIiIiIIIII2);
    }

    public iIiiIiiIii() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static double iiiIiIiiIi(class_1309 iIiIiIIIII2, double iIiIiIIIII3) {
        double d = iIiIiIIIII2.method_6096();
        double d2 = 2.0 + iIiiiIIiIi.ALLATORIxDEMO(iIiIiIIIII2) / 4.0;
        return iIiIiIIIII3 * (1.0 - class_3532.method_15350((double)(d - iIiIiIIIII3 / d2), (double)(d * 0.2), (double)20.0) / 25.0);
    }

    /*
     * WARNING - void declaration
     */
    public static double iiiIiIiiIi(class_1309 class_13092, class_238 class_2383, class_243 class_2432, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        boolean iIiIiIIIII4 = bl;
        class_1309 iIiIiIIIII5 = class_13092;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII5, (class_238)iIiIiIIIII3, (class_243)iIiIiIIIII2, null, iIiIiIIIII4);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_1309 class_13092, double d) {
        void iIiIiIIIII2;
        class_1309 class_13093 = class_13092;
        int iIiIiIIIII3 = class_13093.method_6059(class_1294.field_5907) ? class_13093.method_6112(class_1294.field_5907).method_5578() : 0;
        iIiIiIIIII3 = (0x5D & 0x3B) - (iIiIiIIIII3 + (3 >> 1)) * --5;
        return Math.max((double)(iIiIiIIIII2 * (double)iIiIiIIIII3 / 25.0), 0.0);
    }

    public static double ALLATORIxDEMO(class_243 class_2432, class_238 class_2383) {
        class_243 iIiIiIIIII2 = class_2383;
        class_243 iIiIiIIIII3 = class_2432;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII3, (class_238)iIiIiIIIII2, null, null, (4 ^ 5) != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_243 class_2432, class_238 class_2383, class_2338 class_23382, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        boolean iIiIiIIIII4 = bl;
        class_243 iIiIiIIIII5 = class_2432;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII5, (class_238)iIiIiIIIII3, (class_2338)iIiIiIIIII2, null, iIiIiIIIII4);
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - --1;
        char[] cArray = new char[n];
        int n3 = --5 << --3 ^ --2;
        int cfr_ignored_0 = --5 << --4 ^ (--2 ^ --5);
        int n4 = (5 >> 1 ^ --5) << --4 ^ (--3 << (1 ^ 3) ^ 3 & 5);
        int n5 = iIiIiIIIII2 = string3.length() - --1;
        int n6 = n2;
        String string4 = string3;
        while (n6 >= 0) {
            int n7 = n2--;
            cArray[n7] = (char)(n4 ^ (string2.charAt(n7) ^ string4.charAt(iIiIiIIIII2)));
            if (n2 < 0) break;
            int n8 = n2--;
            char c = cArray[n8] = (char)(n3 ^ (string2.charAt(n8) ^ string4.charAt(iIiIiIIIII2)));
            if (--iIiIiIIIII2 < 0) {
                iIiIiIIIII2 = n5;
            }
            n6 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        boolean iIiIiIIIII4 = bl;
        class_1309 iIiIiIIIII5 = class_13092;
        return iIiiIiiIii.ALLATORIxDEMO(iIiIiIIIII5, (class_238)iIiIiIIIII3, (class_243)iIiIiIIIII2, null, iIiIiIIIII4, 5.0);
    }
}

