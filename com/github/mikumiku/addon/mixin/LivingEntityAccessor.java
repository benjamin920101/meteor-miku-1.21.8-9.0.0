/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.github.mikumiku.addon.mixin;

import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1309.class})
public interface LivingEntityAccessor {
    @Accessor(value="field_6282")
    public boolean isJumping();

    @Accessor(value="field_6228")
    public int getJumpCooldown();

    @Accessor(value="field_6228")
    public void setJumpCooldown(int var1);
}

