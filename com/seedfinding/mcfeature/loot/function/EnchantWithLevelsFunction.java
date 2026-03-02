/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.function;

import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.enchantment.Enchantment;
import com.seedfinding.mcfeature.loot.enchantment.EnchantmentInstance;
import com.seedfinding.mcfeature.loot.enchantment.Enchantments;
import com.seedfinding.mcfeature.loot.function.EnchantmentFunction;
import com.seedfinding.mcfeature.loot.item.Item;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.loot.item.Items;
import com.seedfinding.mcmath.util.Mth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EnchantWithLevelsFunction
extends EnchantmentFunction {
    private static final HashMap<String, Integer> enchantments = new HashMap();
    private final int minLevel;
    private final int maxLevel;
    private boolean is114Nerf;
    private final ArrayList<EnchantmentInstance>[] availableEnchantmentResults;

    public EnchantWithLevelsFunction(Item item, int minLevel, int maxLevel) {
        this(item, minLevel, maxLevel, true, true);
    }

    public EnchantWithLevelsFunction(Item item, int minLevel, int maxLevel, boolean treasure) {
        this(item, minLevel, maxLevel, treasure, true);
    }

    public EnchantWithLevelsFunction(Item item, int minLevel, int maxLevel, boolean treasure, boolean discoverable) {
        super(item, treasure, discoverable);
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
        int preprocessMaxLevel = (int)((float)maxLevel * 2.0f);
        this.availableEnchantmentResults = new ArrayList[preprocessMaxLevel];
    }

    @Override
    public EnchantmentFunction applyEnchantment(MCVersion version, List<Enchantment> enchantments) {
        this.is114Nerf = version.isBetween(MCVersion.v1_14, MCVersion.v1_14_2);
        for (int level = 0; level < this.availableEnchantmentResults.length; ++level) {
            ArrayList<EnchantmentInstance> res = new ArrayList<EnchantmentInstance>();
            List<Enchantment> list = Enchantments.getApplicableEnchantments(enchantments, Enchantments.getCategories(new ItemStack(this.item)), this.isTreasure, this.isDiscoverable);
            block1: for (Enchantment enchantment : list) {
                if (enchantment.isTreasure() && !this.isTreasure || enchantment.isDiscoverable() != this.isDiscoverable) continue;
                for (int i = enchantment.getMaxLevel(); i > enchantment.getMinLevel() - 1; --i) {
                    if (enchantment.getIsLowerThanMinCost().test(i, level) || enchantment.getIsHigherThanMaxCost().test(i, level)) continue;
                    res.add(new EnchantmentInstance(enchantment, i));
                    continue block1;
                }
            }
            this.availableEnchantmentResults[level] = res;
        }
        return this;
    }

    @Override
    public ItemStack process(ItemStack itemStack, LootContext lootContext) {
        return this.enchantItem(lootContext, itemStack, this.getRandomValueFromBounds(lootContext), this.isTreasure, this.isDiscoverable);
    }

    public ItemStack enchantItem(LootContext random, ItemStack itemStack, int level, boolean isTreasure, boolean isDiscoverable) {
        List<EnchantmentInstance> list = this.selectEnchantment(random, itemStack, level, isTreasure, isDiscoverable);
        if (itemStack.getItem().equalsName(Items.BOOK)) {
            itemStack = new ItemStack(new Item(Items.ENCHANTED_BOOK.getName()));
        }
        for (EnchantmentInstance enchantmentInstance : list) {
            itemStack.getItem().addEnchantment(new Pair<String, Integer>(enchantmentInstance.getEnchantment().getName(), enchantmentInstance.getLevel()));
        }
        return itemStack;
    }

    public List<EnchantmentInstance> selectEnchantment(LootContext lootContext, ItemStack itemStack, int level, boolean isTreasure, boolean isDiscoverable) {
        ArrayList<EnchantmentInstance> res = new ArrayList<EnchantmentInstance>();
        Item item = itemStack.getItem();
        if (!enchantments.containsKey(item.getName())) {
            return res;
        }
        int enchantmentValue = enchantments.get(item.getName());
        level += 1 + lootContext.nextInt(enchantmentValue / 4 + 1) + lootContext.nextInt(enchantmentValue / 4 + 1);
        float amplifier = (lootContext.nextFloat() + lootContext.nextFloat() - 1.0f) * 0.15f;
        ArrayList<EnchantmentInstance> availableEnchantments = this.getAvailableEnchantmentResults(level);
        if (!availableEnchantments.isEmpty()) {
            res.add(EnchantmentInstance.getRandomItem(lootContext, availableEnchantments));
            for (level = Mth.clamp(Math.round((float)level + (float)level * amplifier), 1, Integer.MAX_VALUE); lootContext.nextInt(50) <= level; level /= 2) {
                if (this.is114Nerf) {
                    level = level * 4 / 5 + 1;
                    availableEnchantments = this.getAvailableEnchantmentResults(level);
                    for (EnchantmentInstance ench : res) {
                        Enchantments.filterCompatibleEnchantments(availableEnchantments, ench);
                    }
                } else {
                    Enchantments.filterCompatibleEnchantments(availableEnchantments, res.get(res.size() - 1));
                }
                if (availableEnchantments.isEmpty()) break;
                res.add(EnchantmentInstance.getRandomItem(lootContext, availableEnchantments));
            }
        }
        return res;
    }

    public ArrayList<EnchantmentInstance> getAvailableEnchantmentResults(int level) {
        return (ArrayList)this.availableEnchantmentResults[level].clone();
    }

    public int getRandomValueFromBounds(LootContext lootContext) {
        if (this.minLevel == this.maxLevel) {
            return this.minLevel;
        }
        return lootContext.nextInt(this.maxLevel - this.minLevel + 1) + this.minLevel;
    }

    static {
        enchantments.put("leather_helmet", 15);
        enchantments.put("leather_chestplate", 15);
        enchantments.put("leather_leggings", 15);
        enchantments.put("leather_boots", 15);
        enchantments.put("chainmail_helmet", 12);
        enchantments.put("chainmail_chestplate", 12);
        enchantments.put("chainmail_leggings", 12);
        enchantments.put("chainmail_boots", 12);
        enchantments.put("iron_helmet", 9);
        enchantments.put("iron_chestplate", 9);
        enchantments.put("iron_leggings", 9);
        enchantments.put("iron_boots", 9);
        enchantments.put("golden_helmet", 25);
        enchantments.put("golden_chestplate", 25);
        enchantments.put("golden_leggings", 25);
        enchantments.put("golden_boots", 25);
        enchantments.put("diamond_helmet", 10);
        enchantments.put("diamond_chestplate", 10);
        enchantments.put("diamond_leggings", 10);
        enchantments.put("diamond_boots", 10);
        enchantments.put("turtle_helmet", 9);
        enchantments.put("netherite_helmet", 15);
        enchantments.put("netherite_chestplate", 15);
        enchantments.put("netherite_leggings", 15);
        enchantments.put("netherite_boots", 15);
        enchantments.put("fishing_rod", 1);
        enchantments.put("book", 1);
        enchantments.put("wooden_pickaxe", 15);
        enchantments.put("wooden_axe", 15);
        enchantments.put("wooden_hoe", 15);
        enchantments.put("wooden_shovel", 15);
        enchantments.put("wooden_sword", 15);
        enchantments.put("stone_pickaxe", 5);
        enchantments.put("stone_axe", 5);
        enchantments.put("stone_hoe", 5);
        enchantments.put("stone_shovel", 5);
        enchantments.put("stone_sword", 5);
        enchantments.put("iron_pickaxe", 14);
        enchantments.put("iron_axe", 14);
        enchantments.put("iron_hoe", 14);
        enchantments.put("iron_shovel", 14);
        enchantments.put("iron_sword", 14);
        enchantments.put("golden_pickaxe", 22);
        enchantments.put("golden_axe", 22);
        enchantments.put("golden_hoe", 22);
        enchantments.put("golden_shovel", 22);
        enchantments.put("golden_sword", 22);
        enchantments.put("diamond_pickaxe", 10);
        enchantments.put("diamond_axe", 10);
        enchantments.put("diamond_hoe", 10);
        enchantments.put("diamond_shovel", 10);
        enchantments.put("diamond_sword", 10);
        enchantments.put("netherite_pickaxe", 15);
        enchantments.put("netherite_axe", 15);
        enchantments.put("netherite_hoe", 15);
        enchantments.put("netherite_shovel", 15);
        enchantments.put("netherite_sword", 15);
        enchantments.put("bow", 1);
    }
}

