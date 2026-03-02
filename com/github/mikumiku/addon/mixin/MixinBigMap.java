/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MagicMix;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Pseudo
@Mixin(targets={"xaero/map/graphics/MapRenderHelper"})
public class MixinBigMap {
    @ModifyVariable(method={"drawCenteredStringWithBackground(Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;IIIFFFF)V"}, at=@At(value="HEAD"), argsOnly=true, require=0)
    private static String modifyCoordinatesStringOnly(String text) {
        if (MagicMix.coordinatesisActive() && text.contains("X:") && text.contains("Z:")) {
            text = text.replaceAll("X:\\s*-?\\d+", "X: " + (int)MagicMix.x).replaceAll("Z:\\s*-?\\d+", "Z: " + (int)MagicMix.z);
        }
        return text;
    }
}

