/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.function;

import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.enchantment.Enchantment;
import com.seedfinding.mcfeature.loot.enchantment.Enchantments;
import com.seedfinding.mcfeature.loot.function.EnchantmentFunction;
import com.seedfinding.mcfeature.loot.item.Item;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.loot.item.Items;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class EnchantRandomlyFunction
extends EnchantmentFunction {
    private List<Enchantment> applicableEnchantments = new ArrayList<Enchantment>();
    private static final HashSet<String> DAMAGEABLE_ITEMS = new HashSet<String>(){
        {
            this.add(Items.FLINT_AND_STEEL.getName());
            this.add(Items.BOW.getName());
            this.add(Items.FISHING_ROD.getName());
            this.add(Items.SHEARS.getName());
            this.add(Items.CARROT_ON_A_STICK.getName());
            this.add(Items.SHIELD.getName());
            this.add(Items.ELYTRA.getName());
            this.add(Items.TRIDENT.getName());
            this.add(Items.CROSSBOW.getName());
        }
    };
    private static final HashSet<String> DAMAGE_ENCHANTS = new HashSet<String>(){
        {
            this.add("sharpness");
            this.add("smite");
            this.add("bane_of_arthropods");
        }
    };

    public EnchantRandomlyFunction(Item item) {
        super(item);
    }

    public EnchantRandomlyFunction(Item item, boolean isTreasure) {
        super(item, isTreasure);
    }

    public EnchantRandomlyFunction(Item item, boolean isTreasure, boolean isDiscoverable) {
        super(item, isTreasure, isDiscoverable);
    }

    @Override
    public EnchantmentFunction applyEnchantment(MCVersion version, List<Enchantment> enchantments) {
        this.applicableEnchantments = enchantments.stream().filter(Enchantment::isDiscoverable).collect(Collectors.toList());
        return this;
    }

    private boolean processOverrides(Enchantment enchantment, Item item) {
        if (enchantment.getName().equals("thorns")) {
            return Enchantments.ARMOR.contains(item.getName().toUpperCase(Locale.ROOT));
        }
        if (DAMAGE_ENCHANTS.contains(enchantment.getName()) && item.getName().endsWith("_axe")) {
            return true;
        }
        if (enchantment.getName().equals("efficiency") && item.equalsName(Items.SHEARS)) {
            return true;
        }
        if (enchantment.getName().equals("unbreaking") && DAMAGEABLE_ITEMS.contains(item.getName())) {
            return true;
        }
        return Enchantments.getCategories(new ItemStack(item)).contains(enchantment.getCategory());
    }

    @Override
    public ItemStack process(ItemStack baseStack, LootContext context) {
        Item newItem = baseStack.getItem();
        List enchantments = this.applicableEnchantments.stream().filter(enchantment -> newItem.equalsName(Items.BOOK) || this.processOverrides((Enchantment)enchantment, newItem)).collect(Collectors.toList());
        if (enchantments.isEmpty()) {
            return baseStack;
        }
        int enchantNr = context.nextInt(enchantments.size());
        Enchantment enchantment2 = (Enchantment)enchantments.get(enchantNr);
        int level = 1;
        if (!Enchantments.SingleEnchants.contains(enchantment2.getName())) {
            level = context.nextInt(enchantment2.getMaxLevel()) + 1;
        }
        newItem.addEnchantment(new Pair<String, Integer>(enchantment2.getName(), level));
        return new ItemStack(newItem, baseStack.getCount());
    }
}

