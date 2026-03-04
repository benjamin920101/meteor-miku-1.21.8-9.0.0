/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.intprovider.IntProvider
 *  net.minecraft.world.gen.placementmodifier.CountPlacementModifier
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.github.mikumiku.addon.mixin;

import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_6793.class})
public interface CountPlacementModifierAccessor {
    @Accessor(value="field_35719")
    public class_6017 getCount();
}

