/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1309
 *  net.minecraft.class_1937
 *  net.minecraft.class_310
 *  net.minecraft.class_4095
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MagicMix;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import net.minecraft.class_4095;
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

