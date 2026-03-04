/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 */
package com.github.mikumiku.addon.mixinface;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;

public interface IClientPlayerInteractionManager {
    public float getCurrentBreakingProgress();

    public void setBlockBreakingCooldown(int var1);

    public void method_2906(int var1, int var2, int var3, class_1713 var4, class_1657 var5);
}

