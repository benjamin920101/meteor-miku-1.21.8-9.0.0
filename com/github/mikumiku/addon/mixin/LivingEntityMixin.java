/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.world.World
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.ai.brain.Brain
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MagicMix;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.ai.brain.Brain;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1309.class})
public abstract class LivingEntityMixin
extends class_1297 {
    public LivingEntityMixin(class_1299<?> type, class_1937 world) {
        super(type, world);
    }

    @Shadow
    public abstract class_4095<?> method_18868();

    @Inject(at={@At(value="HEAD")}, method={"isFallFlying"}, require=0, cancellable=true)
    private void isFallFlying(CallbackInfoReturnable<Boolean> cir) {
        class_310 mc = class_310.method_1551();
        if (mc.field_1724 != null && mc.field_1724.method_18868().equals(this.method_18868()) && MagicMix.eflyenabled()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(at={@At(value="HEAD")}, method={"method_6128()Z"}, require=0, cancellable=true)
    private void isGliding2(CallbackInfoReturnable<Boolean> cir) {
        class_310 mc = class_310.method_1551();
        if (mc.field_1724 != null && mc.field_1724.method_18868().equals(this.method_18868()) && MagicMix.eflyenabled()) {
            cir.setReturnValue((Object)true);
        }
    }
}

