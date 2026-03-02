/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  meteordevelopment.meteorclient.MeteorClient
 *  net.minecraft.class_1313
 *  net.minecraft.class_243
 *  net.minecraft.class_638
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.mojang.authlib.GameProfile;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.class_1313;
import net.minecraft.class_243;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_746.class}, priority=800)
public abstract class ClientPlayerEntity
extends class_742 {
    @Shadow
    public abstract float method_5695(float var1);

    private ClientPlayerEntity(class_638 world, GameProfile profile) {
        super(world, profile);
    }

    @Inject(method={"method_5784(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_742;method_5784(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V")}, cancellable=true)
    public void onMoveHook(class_1313 movementType, class_243 movement, CallbackInfo ci) {
        MoveEvent event = new MoveEvent(movement.field_1352, movement.field_1351, movement.field_1350);
        MeteorClient.EVENT_BUS.post((Object)event);
        if (event.isCancelled()) {
            super.method_5784(movementType, new class_243(event.getX(), event.getY(), event.getZ()));
            ci.cancel();
        }
    }
}

