/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.function;

import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.enchantment.Enchantment;
import com.seedfinding.mcfeature.loot.enchantment.Enchantments;
import com.seedfinding.mcfeature.loot.function.LootFunction;
import com.seedfinding.mcfeature.loot.item.Item;
import java.util.List;

public abstract class EnchantmentFunction
implements LootFunction {
    protected boolean isTreasure;
    protected boolean isDiscoverable;
    protected final Item item;

    public EnchantmentFunction(Item item) {
        this(item, true, true);
    }

    public EnchantmentFunction(Item item, boolean isTreasure) {
        this(item, isTreasure, true);
    }

    public EnchantmentFunction(Item item, boolean isTreasure, boolean isDiscoverable) {
        this.isTreasure = isTreasure;
        this.isDiscoverable = isDiscoverable;
        this.item = item;
    }

    public boolean isTreasure() {
        return this.isTreasure;
    }

    public boolean isDiscoverable() {
        return this.isDiscoverable;
    }

    public EnchantmentFunction apply(MCVersion version) {
        List<Enchantment> enchantments = Enchantments.getFor(version);
        return this.applyEnchantment(version, enchantments);
    }

    public abstract EnchantmentFunction applyEnchantment(MCVersion var1, List<Enchantment> var2);
}

