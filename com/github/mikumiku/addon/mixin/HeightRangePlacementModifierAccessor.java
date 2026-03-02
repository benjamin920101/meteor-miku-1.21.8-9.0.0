/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_6122
 *  net.minecraft.class_6795
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.github.mikumiku.addon.mixin;

import net.minecraft.class_6122;
import net.minecraft.class_6795;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_6795.class})
public interface HeightRangePlacementModifierAccessor {
    @Accessor(value="field_35726")
    public class_6122 getHeight();
}

