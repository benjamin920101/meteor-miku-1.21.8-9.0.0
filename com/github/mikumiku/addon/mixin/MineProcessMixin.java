/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BlockOptionalMetaLookup
 *  baritone.pathing.movement.CalculationContext
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.mikumiku.addon.mixin;

import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.pathing.movement.CalculationContext;
import com.github.mikumiku.addon.mixinface.MagicMix;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets={"baritone/process/MineProcess"})
public class MineProcessMixin {
    @Shadow(remap=false)
    private List<class_2338> a;

    @Inject(method={"a(Ljava/util/List;Lbaritone/pathing/movement/CalculationContext;)V"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private void onRescan(List<class_2338> already, CalculationContext context, CallbackInfo ci) {
        if (MagicMix.oreSimBaritone()) {
            this.a = MagicMix.oreGoals;
            ci.cancel();
        }
    }

    @Redirect(method={"a(Lbaritone/pathing/movement/CalculationContext;Lbaritone/api/utils/BlockOptionalMetaLookup;Ljava/util/List;Lnet/minecraft/class_2338;)Z"}, at=@At(value="INVOKE", target="Lbaritone/api/utils/BlockOptionalMetaLookup;has(Lnet/minecraft/class_2680;)Z"))
    private static boolean onPruneStream(BlockOptionalMetaLookup instance, class_2680 blockState) {
        if (!MagicMix.oreSimBaritone()) {
            return instance.has(blockState);
        }
        return !blockState.method_26215();
    }
}

