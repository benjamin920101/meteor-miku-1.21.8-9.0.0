/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MagicMix;
import net.minecraft.class_304;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_304.class})
public abstract class KeyBindingMixin {
    @Final
    @Shadow
    private String field_1660;

    @Inject(at={@At(value="RETURN")}, method={"method_1434()Z"}, require=0, cancellable=true)
    public void isPressed(CallbackInfoReturnable<Boolean> cir) {
        if (MagicMix.eflyenabled() && this.field_1660.equals("key.forward")) {
            cir.setReturnValue((Object)true);
        }
    }
}

