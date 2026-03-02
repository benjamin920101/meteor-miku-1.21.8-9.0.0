/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.enchantment;

import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.enchantment.Enchantment;
import java.util.List;

public final class EnchantmentInstance {
    private final Enchantment enchantment;
    private final int level;

    public EnchantmentInstance(Enchantment e, int level) {
        this.enchantment = e;
        this.level = level;
    }

    public static int getTotalWeight(List<EnchantmentInstance> list) {
        int weightSum = 0;
        for (EnchantmentInstance weighedRandomInstance : list) {
            weightSum += weighedRandomInstance.getEnchantment().getRarity();
        }
        return weightSum;
    }

    public static EnchantmentInstance getRandomItem(LootContext random, List<EnchantmentInstance> list, int weightSum) {
        return EnchantmentInstance.getWeightedItem(list, random.nextInt(weightSum));
    }

    public static EnchantmentInstance getWeightedItem(List<EnchantmentInstance> list, int n) {
        for (EnchantmentInstance weighedRandomItem : list) {
            if ((n -= weighedRandomItem.getEnchantment().getRarity()) >= 0) continue;
            return weighedRandomItem;
        }
        return null;
    }

    public static EnchantmentInstance getRandomItem(LootContext random, List<EnchantmentInstance> list) {
        return EnchantmentInstance.getRandomItem(random, list, EnchantmentInstance.getTotalWeight(list));
    }

    public Enchantment getEnchantment() {
        return this.enchantment;
    }

    public int getLevel() {
        return this.level;
    }
}

