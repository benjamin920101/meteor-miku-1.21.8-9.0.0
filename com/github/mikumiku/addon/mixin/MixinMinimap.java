/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_332
 *  net.minecraft.class_4597$class_4598
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  xaero.hud.minimap.Minimap
 *  xaero.hud.minimap.module.MinimapSession
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MagicMix;
import net.minecraft.class_2338;
import net.minecraft.class_332;
import net.minecraft.class_4597;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xaero.hud.minimap.Minimap;
import xaero.hud.minimap.module.MinimapSession;

@Pseudo
@Mixin(targets={"xaero/hud/minimap/info/render/InfoDisplayRenderer"})
public class MixinMinimap {
    @Inject(method={"render(Lxaero/hud/minimap/module/MinimapSession;Lxaero/hud/minimap/Minimap;IILnet/minecraft/class_2338;IIFLnet/minecraft/class_332;)V"}, at={@At(value="HEAD")}, require=0)
    private void modifyPlayerPosForCompile(class_332 guiGraphics, MinimapSession session, Minimap minimap, int height, int size, class_2338 playerPos, int scaledX, int scaledY, float mapScale, class_4597.class_4598 renderTypeBuffer, CallbackInfo ci) {
        if (MagicMix.coordinatesisActive() && playerPos instanceof class_2338.class_2339) {
            class_2338.class_2339 mutablePos = (class_2338.class_2339)playerPos;
            mutablePos.method_10102(MagicMix.x, (double)playerPos.method_10264(), MagicMix.z);
        }
    }
}

