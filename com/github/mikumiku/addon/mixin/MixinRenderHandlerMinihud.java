/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.Slice
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MagicMix;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Pseudo
@Mixin(targets={"fi/dy/masa/minihud/event/RenderHandler"})
public class MixinRenderHandlerMinihud {
    @Redirect(method={"addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V"}, slice=@Slice(from=@At(value="FIELD", target="Lfi/dy/masa/minihud/config/InfoToggle;COORDINATES:Lfi/dy/masa/minihud/config/InfoToggle;"), to=@At(value="INVOKE", target="Ljava/lang/StringBuilder;toString()Ljava/lang/String;")), require=0, at=@At(value="INVOKE", target="Lnet/minecraft/class_1297;method_23317()D", ordinal=0))
    private double redirectCoordinateX(class_1297 entity) {
        if (MagicMix.coordinatesisActive()) {
            return MagicMix.x;
        }
        return entity.method_23317();
    }

    @Redirect(method={"addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V"}, slice=@Slice(from=@At(value="FIELD", target="Lfi/dy/masa/minihud/config/InfoToggle;COORDINATES:Lfi/dy/masa/minihud/config/InfoToggle;"), to=@At(value="INVOKE", target="Ljava/lang/StringBuilder;toString()Ljava/lang/String;")), require=0, at=@At(value="INVOKE", target="Lnet/minecraft/class_1297;method_23321()D"))
    private double redirectCoordinateZ(class_1297 entity) {
        if (MagicMix.coordinatesisActive()) {
            return MagicMix.z;
        }
        return entity.method_23321();
    }
}

