/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_310
 *  net.minecraft.class_4050
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MagicMix;
import java.util.UUID;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_4050;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1297.class})
public class EntityMixin {
    @Shadow
    protected UUID field_6021;

    @Inject(at={@At(value="HEAD")}, method={"method_18376()Lnet/minecraft/class_4050;"}, require=0, cancellable=true)
    private void getPose(CallbackInfoReturnable<class_4050> cir) {
        class_310 mc = class_310.method_1551();
        if (MagicMix.eflyenabled() && this.field_6021 == mc.field_1724.method_5667()) {
            cir.setReturnValue((Object)class_4050.field_18076);
        }
    }

    @Inject(at={@At(value="HEAD")}, method={"method_5624()Z"}, require=0, cancellable=true)
    private void isSprinting(CallbackInfoReturnable<Boolean> cir) {
        class_310 mc = class_310.method_1551();
        if (MagicMix.eflyenabled() && this.field_6021 == mc.field_1724.method_5667()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(at={@At(value="HEAD")}, method={"method_5697(Lnet/minecraft/class_1297;)V"}, require=0, cancellable=true)
    private void pushAwayFrom(class_1297 entity, CallbackInfo ci) {
        class_310 mc = class_310.method_1551();
        if (mc.field_1724 != null && this.field_6021 == mc.field_1724.method_5667() && MagicMix.eflyenabled() && !entity.method_5667().equals(this.field_6021)) {
            ci.cancel();
        }
    }
}

