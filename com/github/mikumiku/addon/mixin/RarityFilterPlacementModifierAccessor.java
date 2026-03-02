/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_6799
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.github.mikumiku.addon.mixin;

import net.minecraft.class_6799;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_6799.class})
public interface RarityFilterPlacementModifierAccessor {
    @Accessor(value="field_35753")
    public int getChance();
}

