/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_636
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.IClientPlayerInteractionManager;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_636.class}, priority=1002)
public abstract class ClientPlayerInteractionManagerMixin
implements IClientPlayerInteractionManager {
    @Override
    @Shadow
    public abstract void method_2906(int var1, int var2, int var3, class_1713 var4, class_1657 var5);
}

