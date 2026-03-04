/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.mixininterface.IRaycastContext
 *  meteordevelopment.meteorclient.mixininterface.IVec3d
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  net.minecraft.util.PlayerInput
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.passive.VillagerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentLevelEntry
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.world.World
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.registry.Registry
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtList
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.InventoryS2CPacket
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$LookAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$OnGroundOnly
 *  net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket
 *  net.minecraft.world.Heightmap$Type
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.village.VillagerData
 *  net.minecraft.village.VillagerProfession
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.entry.RegistryEntry$Reference
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.registry.RegistryKeys
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiiIIII;
import com.github.mikumiku.addon.iIIIIIIIii;
import com.github.mikumiku.addon.iiIIIIiiII;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.mixininterface.IRaycastContext;
import meteordevelopment.meteorclient.mixininterface.IVec3d;
import meteordevelopment.meteorclient.utils.player.Rotations;
import net.minecraft.util.PlayerInput;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.Vec3d;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import net.minecraft.world.Heightmap;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.village.VillagerData;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.RaycastContext;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.registry.RegistryKeys;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiiiIIiIi {
    public static boolean iiIIiIIiii(class_310 iIiIiIIIII2) {
        return iIiIiIIIII2.field_1724.method_6128();
    }

    public static void ALLATORIxDEMO(class_332 class_3322, class_2960 class_29602, int n, int n2, int n3, int n4) {
        int n5 = n4;
        class_332 iIiIiIIIII2 = class_3322;
    }

    public static class_2350 ALLATORIxDEMO(class_2338 iIiIiIIIII2) {
        return class_2350.method_10150((double)Rotations.getYaw((class_2338)iIiIiIIIII2)).method_10153();
    }

    /*
     * WARNING - void declaration
     */
    public static void iiiIiIiiIi(IRaycastContext iRaycastContext, class_243 class_2432, class_243 class_2433, class_3959.class_3960 class_39602, class_3959.class_242 class_2422, class_746 class_7462) {
        IRaycastContext iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        IRaycastContext iRaycastContext2 = iRaycastContext;
        iRaycastContext = class_7462;
        IRaycastContext iIiIiIIIII7 = iRaycastContext2;
        iIiIiIIIII7.meteor$set((class_243)iIiIiIIIII6, (class_243)iIiIiIIIII5, (class_3959.class_3960)iIiIiIIIII4, (class_3959.class_242)iIiIiIIIII3, (class_1297)iIiIiIIIII2);
    }

    public static class_3852 ALLATORIxDEMO(class_1646 iIiIiIIIII2) {
        return (class_3852)iIiIiIIIII2.method_7231().comp_3521().comp_349();
    }

    public static void ALLATORIxDEMO(class_2487 class_24872, iiIIIIiiII iiIIIIiiII2) {
        Object iIiIiIIIII2 = iiIIIIiiII2;
        class_2487 iIiIiIIIII3 = class_24872;
        Object object = iIiIiIIIII2;
        class_2487 class_24873 = iIiIiIIIII3;
        iIiIiIIIII2.iIiIiIIIII = class_2960.method_12829((String)iIiIiIIIII3.method_68564(IIiiiiIIII.ALLATORIxDEMO("-\n\u000b\f\t*<\t\r*<"), ""));
        iIiIiIIIII2.ALLATORIxDEMO = class_24873.method_68083(iIIIIIIIii.ALLATORIxDEMO("@\u0001B%A\u0017C\u000f"), 4 ^ 5);
        object.iiiiiIIiIi = class_24873.method_68083(IIiiiiIIII.ALLATORIxDEMO("\u0005%0'\u00077<"), 0x60 & 0x5F);
        object.iIIiIiiiIi = iIiIiIIIII3.method_68566(iIIIIIIIii.ALLATORIxDEMO("\rB\bF\rC\u0007"), (4 ^ 5) != 0);
    }

    public iIiiiIIiIi() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIIIIii.ALLATORIxDEMO("P)E\u0004S\u0000 0P\u0001a101 \u8bb2\u66f3\u65f2\u5230\u6745\u65ad\u7210\u677b\uff13"));
        }
    }

    public static List<class_1799> ALLATORIxDEMO(class_2649 iIiIiIIIII2) {
        return iIiIiIIIII2.comp_3839();
    }

    public static class_2499 ALLATORIxDEMO(class_2487 class_24872, String string) {
        Object iIiIiIIIII2 = string;
        class_2487 iIiIiIIIII3 = class_24872;
        return iIiIiIIIII3.method_68569((String)iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    public static class_2828.class_2831 ALLATORIxDEMO(float f, float f2, boolean bl) {
        void iIiIiIIIII2;
        boolean iIiIiIIIII3 = bl;
        float iIiIiIIIII4 = f;
        return new class_2828.class_2831(iIiIiIIIII4, (float)iIiIiIIIII2, iIiIiIIIII3, 5 >> 3);
    }

    public static float iiiIiIiiIi(class_744 iIiIiIIIII2) {
        return iIiIiIIIII2.method_3128().field_1342;
    }

    public static void ALLATORIxDEMO(int iIiIiIIIII2) {
        class_310.method_1551().field_1724.method_31548().method_61496(iIiIiIIIII2);
    }

    public static class_243 ALLATORIxDEMO(class_2664 iIiIiIIIII2) {
        return iIiIiIIIII2.comp_2884().orElse(class_243.field_1353);
    }

    public static float ALLATORIxDEMO(class_744 iIiIiIIIII2) {
        return iIiIiIIIII2.method_3128().field_1343;
    }

    public static boolean iiiIiIiiIi(class_310 iIiIiIIIII2) {
        return iIiIiIIIII2.field_1724.field_3913.field_54155.comp_3164();
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[5 >> 2];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (5 >> 2);
        char[] cArray = new char[n];
        int n3 = --4 << --3 ^ --5;
        int cfr_ignored_0 = --5 << --3 ^ 5 >> 1;
        int n4 = (3 & 5) << --3 ^ --5;
        int n5 = iIiIiIIIII2 = string3.length() - (3 & 5);
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

    public static void ALLATORIxDEMO(IVec3d iIiIiIIIII2, double iIiIiIIIII3, double iIiIiIIIII4, double iIiIiIIIII5) {
        iIiIiIIIII2.meteor$set(iIiIiIIIII3, iIiIiIIIII4, iIiIiIIIII5);
    }

    public static class_1799 ALLATORIxDEMO(Optional<class_6880.class_6883<class_1887>> iIiIiIIIII2) {
        return class_1890.method_61711((class_1889)new class_1889((class_6880)iIiIiIIIII2.get(), ((class_1887)iIiIiIIIII2.get().comp_349()).method_8183()));
    }

    public static class_2828.class_2829 ALLATORIxDEMO(double iIiIiIIIII2, double iIiIiIIIII3, double iIiIiIIIII4, boolean iIiIiIIIII5) {
        return new class_2828.class_2829(iIiIiIIIII2, iIiIiIIIII3, iIiIiIIIII4, iIiIiIIIII5, MeteorClient.mc.field_1724.field_5976);
    }

    public static class_2487 ALLATORIxDEMO(class_2487 class_24872, String string) {
        Object iIiIiIIIII2 = string;
        class_2487 iIiIiIIIII3 = class_24872;
        return iIiIiIIIII3.method_68568((String)iIiIiIIIII2);
    }

    public static int ALLATORIxDEMO(class_310 iIiIiIIIII2) {
        return iIiIiIIIII2.field_1687.method_8624(class_2902.class_2903.field_13202, (int)iIiIiIIIII2.field_1724.method_23317(), (int)iIiIiIIIII2.field_1724.method_23321());
    }

    public static class_2828.class_5911 ALLATORIxDEMO(boolean iIiIiIIIII2) {
        return new class_2828.class_5911(iIiIiIIIII2, MeteorClient.mc.field_1724.field_5976);
    }

    public static void iiiIiIiiIi() {
        boolean bl2 = 3 >> 2;
        bl2 = 2 & 5;
        class_10185 class_101852 = new class_10185(bl, bl, 5 >> 3, bl, bl2, (3 & 4) != 0, bl2);
        MeteorClient.mc.field_1724.field_3944.method_52787((class_2596)new class_2851(class_101852));
    }

    public static int ALLATORIxDEMO() {
        return class_310.method_1551().field_1724.method_31548().method_67532();
    }

    public static class_243 ALLATORIxDEMO(class_1297 iIiIiIIIII2) {
        return iIiIiIIIII2.method_19538();
    }

    public static boolean ALLATORIxDEMO(class_3850 iIiIiIIIII2) {
        if (iIiIiIIIII2.comp_3521() == class_3852.field_17051) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    public static String ALLATORIxDEMO(class_1657 iIiIiIIIII2) {
        return iIiIiIIIII2.method_7334().getName();
    }

    public static void ALLATORIxDEMO() {
        boolean bl2 = 5 >> 3;
        bl2 = 5 >> 3;
        class_10185 class_101852 = new class_10185(bl, bl, 3 >> 2, bl, bl2, 5 >> 2, bl2);
        MeteorClient.mc.field_1724.field_3944.method_52787((class_2596)new class_2851(class_101852));
    }

    public static class_1937 ALLATORIxDEMO(class_1297 iIiIiIIIII2) {
        return iIiIiIIIII2.method_37908();
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(IRaycastContext iRaycastContext, class_243 class_2432, class_243 class_2433, class_3959.class_3960 class_39602, class_3959.class_242 class_2422, class_746 class_7462) {
        IRaycastContext iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        IRaycastContext iRaycastContext2 = iRaycastContext;
        iRaycastContext = class_7462;
        IRaycastContext iIiIiIIIII7 = iRaycastContext2;
        iIiIiIIIII7.meteor$set((class_243)iIiIiIIIII6, (class_243)iIiIiIIIII5, (class_3959.class_3960)iIiIiIIIII4, (class_3959.class_242)iIiIiIIIII3, (class_1297)iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    public static class_2828.class_2830 ALLATORIxDEMO(double d, double d2, double d3, float f, float f2, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        double iIiIiIIIII6;
        boolean bl2 = bl;
        float iIiIiIIIII7 = f;
        return new class_2828.class_2830(iIiIiIIIII6, (double)iIiIiIIIII5, (double)iIiIiIIIII4, iIiIiIIIII7, (float)iIiIiIIIII3, (boolean)iIiIiIIIII2, MeteorClient.mc.field_1724.field_5976);
    }

    public static int ALLATORIxDEMO(class_2649 iIiIiIIIII2) {
        return iIiIiIIIII2.comp_3837();
    }

    public static double ALLATORIxDEMO(class_1309 iIiIiIIIII2) {
        return iIiIiIIIII2.method_45325(class_5134.field_23725);
    }

    public static boolean ALLATORIxDEMO(class_310 iIiIiIIIII2) {
        return iIiIiIIIII2.field_1724.field_3913.field_54155.comp_3163();
    }

    public static class_2378<class_1887> ALLATORIxDEMO() {
        return class_310.method_1551().field_1687.method_30349().method_30530(class_7924.field_41265);
    }
}

