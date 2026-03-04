/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.BlockState
 *  net.minecraft.util.Pair
 *  net.minecraft.block.CartographyTableBlock
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.util.Pair;
import net.minecraft.block.CartographyTableBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={BlockUtils.class}, remap=false)
public class BlockUtilsMixin {
    @Inject(method={"isClickable(Lnet/minecraft/class_2248;)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private static void injectedIsClickable(class_2248 block, CallbackInfoReturnable<Boolean> cir) {
        if (block instanceof class_3711) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(method={"getPlaceSide(Lnet/minecraft/class_2338;)Lnet/minecraft/class_2350;"}, at={@At(value="HEAD")}, cancellable=true)
    private static void injectedGetPlaceSide(class_2338 blockPos, CallbackInfoReturnable<class_2350> cir) {
        ArrayList<class_2350> placeableDirections = new ArrayList<class_2350>();
        for (class_2350 side : class_2350.values()) {
            class_2338 neighbor = blockPos.method_10093(side);
            class_2680 state = MeteorClient.mc.field_1687.method_8320(neighbor);
            if (state.method_26215() || BlockUtils.isClickable((class_2248)state.method_26204()) || !state.method_26227().method_15769()) continue;
            placeableDirections.add(side);
        }
        class_243 lookVec = blockPos.method_46558().method_1020(MeteorClient.mc.field_1724.method_33571());
        List<class_3545> directionSignificance = Arrays.asList(new class_3545((Object)class_2350.field_11039, (Object)(-lookVec.method_10216())), new class_3545((Object)class_2350.field_11034, (Object)lookVec.method_10216()), new class_3545((Object)class_2350.field_11033, (Object)(-lookVec.method_10214())), new class_3545((Object)class_2350.field_11036, (Object)lookVec.method_10214()), new class_3545((Object)class_2350.field_11043, (Object)(-lookVec.method_10215())), new class_3545((Object)class_2350.field_11035, (Object)lookVec.method_10215()));
        Collections.sort(directionSignificance, (pair1, pair2) -> Double.compare((Double)pair2.method_15441(), (Double)pair1.method_15441()));
        for (class_3545 pair : directionSignificance) {
            if (!placeableDirections.contains(pair.method_15442())) continue;
            cir.setReturnValue((Object)((class_2350)pair.method_15442()));
            return;
        }
        cir.setReturnValue(null);
    }
}

