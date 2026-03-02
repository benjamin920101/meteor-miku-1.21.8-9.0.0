/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.function;

import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.function.LootFunction;
import com.seedfinding.mcfeature.loot.item.ItemStack;

public class ApplyDamageFunction
implements LootFunction {
    @Override
    public ItemStack process(ItemStack baseStack, LootContext context) {
        context.advance(1L);
        return baseStack;
    }
}

