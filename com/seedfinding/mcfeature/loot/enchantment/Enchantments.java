/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.enchantment;

import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.enchantment.Enchantment;
import com.seedfinding.mcfeature.loot.enchantment.EnchantmentInstance;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class Enchantments {
    private static final HashSet<String> ARMOR_TYPES = new HashSet<String>(Arrays.asList("NETHERITE", "DIAMOND", "GOLDEN", "IRON", "LEATHER", "CHAINMAIL"));
    private static final HashSet<String> TOOL_TYPES = new HashSet<String>(Arrays.asList("NETHERITE", "DIAMOND", "GOLDEN", "IRON", "STONE", "WOODEN"));
    private static final HashSet<String> BOOKS = new HashSet<String>(Arrays.asList("ENCHANTED_BOOK", "BOOK"));
    public static final HashSet<String> ARMOR_HEAD = new HashSet<String>(){
        {
            for (String type : ARMOR_TYPES) {
                this.add(type + "_HELMET");
            }
            this.addAll(BOOKS);
            this.add("TURTLE_HELMET");
        }
    };
    public static final HashSet<String> ARMOR_CHEST = new HashSet<String>(){
        {
            for (String type : ARMOR_TYPES) {
                this.add(type + "_CHESTPLATE");
            }
            this.addAll(BOOKS);
            this.add("ELYTRA");
        }
    };
    public static final HashSet<String> ARMOR_LEGGINGS = new HashSet<String>(){
        {
            for (String type : ARMOR_TYPES) {
                this.add(type + "_LEGGINGS");
            }
            this.addAll(BOOKS);
        }
    };
    public static final HashSet<String> ARMOR_FEET = new HashSet<String>(){
        {
            for (String type : ARMOR_TYPES) {
                this.add(type + "_BOOTS");
            }
            this.addAll(BOOKS);
        }
    };
    public static final HashSet<String> ARMOR = new HashSet<String>(){
        {
            this.addAll(ARMOR_HEAD);
            this.addAll(ARMOR_CHEST);
            this.addAll(ARMOR_LEGGINGS);
            this.addAll(ARMOR_FEET);
        }
    };
    public static final HashSet<String> SWORDS = new HashSet<String>(){
        {
            for (String type : TOOL_TYPES) {
                this.add(type + "_SWORD");
            }
        }
    };
    public static final HashSet<String> AXES = new HashSet<String>(){
        {
            for (String type : TOOL_TYPES) {
                this.add(type + "_AXE");
            }
        }
    };
    public static final HashSet<String> HOES = new HashSet<String>(){
        {
            for (String type : TOOL_TYPES) {
                this.add(type + "_HOE");
            }
        }
    };
    public static final HashSet<String> PICKAXES = new HashSet<String>(){
        {
            for (String type : TOOL_TYPES) {
                this.add(type + "_PICKAXE");
            }
        }
    };
    public static final HashSet<String> SHOVELS = new HashSet<String>(){
        {
            for (String type : TOOL_TYPES) {
                this.add(type + "_SHOVEL");
            }
        }
    };
    public static final HashSet<String> BOW = new HashSet<String>(){
        {
            this.add("BOW");
            this.addAll(BOOKS);
        }
    };
    public static final HashSet<String> CROSSBOW = new HashSet<String>(){
        {
            this.add("CROSSBOW");
            this.addAll(BOOKS);
        }
    };
    public static final HashSet<String> FISHING_ROD = new HashSet<String>(){
        {
            this.add("FISHING_ROD");
            this.addAll(BOOKS);
        }
    };
    public static final HashSet<String> TRIDENT = new HashSet<String>(){
        {
            this.add("TRIDENT");
            this.addAll(BOOKS);
        }
    };
    public static final HashSet<String> BREAKABLE = new HashSet<String>(){
        {
            this.addAll(CROSSBOW);
            this.addAll(BOW);
            this.addAll(TRIDENT);
            this.addAll(FISHING_ROD);
            this.addAll(ARMOR);
            this.addAll(SWORDS);
            this.addAll(AXES);
            this.addAll(HOES);
            this.addAll(PICKAXES);
            this.addAll(SHOVELS);
        }
    };
    public static final HashSet<String> DIGGER = new HashSet<String>(){
        {
            this.addAll(HOES);
            this.addAll(PICKAXES);
            this.addAll(AXES);
            this.addAll(SHOVELS);
            this.addAll(BOOKS);
        }
    };
    public static final HashSet<String> WEAPON = new HashSet<String>(){
        {
            this.addAll(SWORDS);
            this.addAll(BOOKS);
        }
    };
    public static final HashSet<String> DAMAGE = new HashSet<String>(){
        {
            this.addAll(SWORDS);
            this.addAll(AXES);
            this.addAll(BOOKS);
        }
    };
    public static final HashSet<String> THORNS = new HashSet<String>(){
        {
            this.addAll(ARMOR_CHEST);
            this.remove("ELYTRA");
        }
    };
    public static final HashSet<String> VANISHABLE = new HashSet<String>(){
        {
            this.addAll(BREAKABLE);
        }
    };
    public static final HashSet<String> SingleEnchants = new HashSet<String>(Arrays.asList("aqua_affinity", "binding_curse", "channeling", "silk_touch", "flame", "infinity", "multishot", "mending", "vanishing_curse"));
    public static final List<HashSet<String>> allCategories = new ArrayList<HashSet>(Arrays.asList(ARMOR, ARMOR_HEAD, ARMOR_CHEST, ARMOR_FEET, BOW, BREAKABLE, CROSSBOW, DIGGER, DAMAGE, FISHING_ROD, TRIDENT, WEAPON, VANISHABLE, THORNS));
    private static final int COMMON = 10;
    private static final int UNCOMMON = 5;
    private static final int RARE = 2;
    private static final int VERY_RARE = 1;
    private static final int COMMON_1_14 = 30;
    private static final int UNCOMMON_1_14 = 10;
    private static final int RARE_1_14 = 3;
    public static final ConcurrentHashMap<MCVersion, List<Enchantment>> CACHE_ENCHANTMENT_REGISTRY = new ConcurrentHashMap();

    public static boolean canApply(Enchantment enchantment, ItemStack item) {
        return enchantment.getCategory().contains(item.getItem().getName().toUpperCase(Locale.ROOT));
    }

    public static List<Enchantment> removeAllNull(List<Enchantment> list) {
        list.removeIf(Objects::isNull);
        return list;
    }

    public static List<Enchantment> getFor(MCVersion version) {
        return CACHE_ENCHANTMENT_REGISTRY.computeIfAbsent(version, key -> Enchantments.apply(new ArrayList<Enchantment>(), version));
    }

    public static List<Enchantment> apply(List<Enchantment> enchantments, MCVersion version) {
        enchantments.clear();
        int common = version.isBetween(MCVersion.v1_14, MCVersion.v1_14_2) ? 30 : 10;
        int uncommon = version.isBetween(MCVersion.v1_14, MCVersion.v1_14_2) ? 10 : 5;
        int rare = version.isBetween(MCVersion.v1_14, MCVersion.v1_14_2) ? 3 : 2;
        Supplier<Optional> protectionIncompatible = () -> version.isBetween(MCVersion.v1_14, MCVersion.v1_14_2) ? Optional.empty() : Optional.of(new HashSet<String>(Arrays.asList("protection", "fire_protection", "projectile_protection", "blast_protection")));
        enchantments.add(Enchantment.builder("protection", common, ARMOR).minMaxLevel(1, 4).isLowerThanMinCost((i, n) -> n < 1 + (i - 1) * 11).isHigherThanMaxCost((i, n) -> n > 1 + (i - 1) * 11 + 11).incompatible(protectionIncompatible.get()).build());
        enchantments.add(Enchantment.builder("fire_protection", uncommon, ARMOR).minMaxLevel(1, 4).isLowerThanMinCost((i, n) -> n < 10 + (i - 1) * 8).isHigherThanMaxCost((i, n) -> n > 10 + (i - 1) * 8 + 8).incompatible(protectionIncompatible.get()).build());
        enchantments.add(Enchantment.builder("feather_falling", uncommon, ARMOR_FEET).minMaxLevel(1, 4).isLowerThanMinCost((i, n) -> n < 5 + (i - 1) * 6).isHigherThanMaxCost((i, n) -> n > 5 + (i - 1) * 6 + 6).build());
        enchantments.add(Enchantment.builder("blast_protection", rare, ARMOR).minMaxLevel(1, 4).isLowerThanMinCost((i, n) -> n < 5 + (i - 1) * 8).isHigherThanMaxCost((i, n) -> n > 5 + (i - 1) * 8 + 8).incompatible(protectionIncompatible.get()).build());
        enchantments.add(Enchantment.builder("projectile_protection", uncommon, ARMOR).minMaxLevel(1, 4).isLowerThanMinCost((i, n) -> n < 3 + (i - 1) * 6).isHigherThanMaxCost((i, n) -> n > 3 + (i - 1) * 6 + 6).incompatible(protectionIncompatible.get()).build());
        enchantments.add(Enchantment.builder("respiration", rare, ARMOR_HEAD).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 10 * i).isHigherThanMaxCost((i, n) -> n > 10 * i + 30).build());
        enchantments.add(Enchantment.builder("aqua_affinity", rare, ARMOR_HEAD).minMaxLevel(1, 1).isLowerThanMinCost((i, n) -> n < 1).isHigherThanMaxCost((i, n) -> n > 41).build());
        enchantments.add(Enchantment.builder("thorns", 1, THORNS).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 10 + 20 * (i - 1)).isHigherThanMaxCost((i, n) -> n > 10 + 20 * (i - 1) + 50).build());
        if (version.isNewerOrEqualTo(MCVersion.v1_8)) {
            enchantments.add(Enchantment.builder("depth_strider", rare, ARMOR_FEET).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < i * 10).isHigherThanMaxCost((i, n) -> n > i * 10 + 15).incompatible("frost_walker", "depth_strider").build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_9)) {
            enchantments.add(Enchantment.builder("frost_walker", rare, ARMOR_FEET).minMaxLevel(1, 2).isLowerThanMinCost((i, n) -> n < i * 10).isHigherThanMaxCost((i, n) -> n > i * 10 + 15).incompatible("frost_walker", "depth_strider").treasure().build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_11)) {
            enchantments.add(Enchantment.builder("binding_curse", 1, ARMOR).minMaxLevel(1, 1).isLowerThanMinCost((i, n) -> n < 25).isHigherThanMaxCost((i, n) -> n > 50).treasure().build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_16)) {
            enchantments.add(Enchantment.builder("soul_speed", 1, ARMOR_FEET).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < i * 10).isHigherThanMaxCost((i, n) -> n > i * 10 + 15).treasure().nonDiscoverable().build());
        }
        enchantments.add(Enchantment.builder("sharpness", common, DAMAGE).minMaxLevel(1, 5).isLowerThanMinCost((i, n) -> n < 1 + (i - 1) * 11).isHigherThanMaxCost((i, n) -> n > 1 + (i - 1) * 11 + 20).incompatible("sharpness", "smite", "bane_of_arthropods").build());
        enchantments.add(Enchantment.builder("smite", uncommon, DAMAGE).minMaxLevel(1, 5).isLowerThanMinCost((i, n) -> n < 5 + (i - 1) * 8).isHigherThanMaxCost((i, n) -> n > 5 + (i - 1) * 8 + 20).incompatible("sharpness", "smite", "bane_of_arthropods").build());
        enchantments.add(Enchantment.builder("bane_of_arthropods", uncommon, DAMAGE).minMaxLevel(1, 5).isLowerThanMinCost((i, n) -> n < 5 + (i - 1) * 8).isHigherThanMaxCost((i, n) -> n > 5 + (i - 1) * 8 + 20).incompatible("sharpness", "smite", "bane_of_arthropods").build());
        enchantments.add(Enchantment.builder("knockback", uncommon, WEAPON).minMaxLevel(1, 2).isLowerThanMinCost((i, n) -> n < 5 + 20 * (i - 1)).isHigherThanMaxCost((i, n) -> n > 1 + i * 10 + 50).build());
        enchantments.add(Enchantment.builder("fire_aspect", rare, WEAPON).minMaxLevel(1, 2).isLowerThanMinCost((i, n) -> n < 10 + 20 * (i - 1)).isHigherThanMaxCost((i, n) -> n > 1 + i * 10 + 50).build());
        enchantments.add(Enchantment.builder("looting", rare, WEAPON).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 15 + (i - 1) * 9).isHigherThanMaxCost((i, n) -> n > 1 + i * 10 + 50).incompatible("looting", "silk_touch").build());
        if (version.isNewerOrEqualTo(MCVersion.v1_11_1)) {
            enchantments.add(Enchantment.builder("sweeping", rare, WEAPON).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 5 + (i - 1) * 9).isHigherThanMaxCost((i, n) -> n > 5 + (i - 1) * 9 + 15).build());
        }
        enchantments.add(Enchantment.builder("efficiency", common, DIGGER).minMaxLevel(1, 5).isLowerThanMinCost((i, n) -> n < 1 + 10 * (i - 1)).isHigherThanMaxCost((i, n) -> n > 1 + i * 10 + 50).build());
        enchantments.add(Enchantment.builder("silk_touch", 1, DIGGER).minMaxLevel(1, 1).isLowerThanMinCost((i, n) -> n < 15).isHigherThanMaxCost((i, n) -> n > 1 + i * 10 + 50).incompatible("fortune", "silk_touch").build());
        enchantments.add(Enchantment.builder("unbreaking", uncommon, BREAKABLE).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 5 + (i - 1) * 8).isHigherThanMaxCost((i, n) -> n > 1 + i * 10 + 50).build());
        enchantments.add(Enchantment.builder("fortune", rare, DIGGER).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 15 + (i - 1) * 9).isHigherThanMaxCost((i, n) -> n > 1 + i * 10 + 50).incompatible("fortune", "silk_touch").build());
        enchantments.add(Enchantment.builder("power", common, BOW).minMaxLevel(1, 5).isLowerThanMinCost((i, n) -> n < 1 + (i - 1) * 10).isHigherThanMaxCost((i, n) -> n > 1 + (i - 1) * 10 + 15).build());
        enchantments.add(Enchantment.builder("punch", rare, BOW).minMaxLevel(1, 2).isLowerThanMinCost((i, n) -> n < 12 + (i - 1) * 20).isHigherThanMaxCost((i, n) -> n > 12 + (i - 1) * 20 + 25).build());
        enchantments.add(Enchantment.builder("flame", rare, BOW).minMaxLevel(1, 1).isLowerThanMinCost((i, n) -> n < 20).isHigherThanMaxCost((i, n) -> n > 50).build());
        enchantments.add(Enchantment.builder("infinity", 1, BOW).minMaxLevel(1, 1).isLowerThanMinCost((i, n) -> n < 20).isHigherThanMaxCost((i, n) -> n > 50).incompatible(version.isNewerOrEqualTo(MCVersion.v1_11_1) ? Optional.of(new HashSet<String>(Arrays.asList("mending", "infinity"))) : Optional.empty()).build());
        if (version.isNewerOrEqualTo(MCVersion.v1_7_2)) {
            enchantments.add(Enchantment.builder("luck_of_the_sea", rare, FISHING_ROD).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 15 + (i - 1) * 9).isHigherThanMaxCost((i, n) -> n > 1 + i * 10 + 50).incompatible("luck_of_the_sea", "silk_touch").build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_7_2)) {
            enchantments.add(Enchantment.builder("lure", rare, FISHING_ROD).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 15 + (i - 1) * 9).isHigherThanMaxCost((i, n) -> n > 1 + i * 10 + 50).build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_13)) {
            enchantments.add(Enchantment.builder("loyalty", uncommon, TRIDENT).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 5 + i * 7).isHigherThanMaxCost((i, n) -> n > 50).incompatible("loyalty", "riptide").build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_13)) {
            enchantments.add(Enchantment.builder("impaling", rare, TRIDENT).minMaxLevel(1, 5).isLowerThanMinCost((i, n) -> n < 1 + (i - 1) * 8).isHigherThanMaxCost((i, n) -> n > 1 + (i - 1) * 8 + 20).build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_13)) {
            enchantments.add(Enchantment.builder("riptide", rare, TRIDENT).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 10 + i * 7).isHigherThanMaxCost((i, n) -> n > 50).incompatible("riptide", "loyalty", "channeling").build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_13)) {
            enchantments.add(Enchantment.builder("channeling", 1, TRIDENT).minMaxLevel(1, 1).isLowerThanMinCost((i, n) -> n < 25).isHigherThanMaxCost((i, n) -> n > 50).incompatible("channeling", "riptide").build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_14)) {
            enchantments.add(Enchantment.builder("multishot", rare, CROSSBOW).minMaxLevel(1, 1).isLowerThanMinCost((i, n) -> n < 20).isHigherThanMaxCost((i, n) -> n > 50).incompatible("multishot", "piercing").build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_14)) {
            enchantments.add(Enchantment.builder("quick_charge", uncommon, CROSSBOW).minMaxLevel(1, 3).isLowerThanMinCost((i, n) -> n < 12 + (i - 1) * 20).isHigherThanMaxCost((i, n) -> n > 50).build());
        }
        if (version.isNewerOrEqualTo(MCVersion.v1_14)) {
            enchantments.add(Enchantment.builder("piercing", common, CROSSBOW).minMaxLevel(1, 4).isLowerThanMinCost((i, n) -> n < 1 + (i - 1) * 10).isHigherThanMaxCost((i, n) -> n > 50).incompatible("multishot", "piercing").build());
        }
        enchantments.add(Enchantment.builder("mending", rare, BREAKABLE).minMaxLevel(1, 1).isLowerThanMinCost((i, n) -> n < i * 25).isHigherThanMaxCost((i, n) -> n > i * 25 + 50).incompatible(version.isNewerOrEqualTo(MCVersion.v1_11_1) ? Optional.of(new HashSet<String>(Arrays.asList("mending", "infinity"))) : Optional.empty()).treasure().build());
        enchantments.add(Enchantment.builder("vanishing_curse", 1, VANISHABLE).minMaxLevel(1, 1).isLowerThanMinCost((i, n) -> n < 25).isHigherThanMaxCost((i, n) -> n > 50).treasure().build());
        return enchantments;
    }

    public static HashSet<HashSet<String>> getCategories(ItemStack baseStack) {
        HashSet<HashSet<String>> applicableCategories = new HashSet<HashSet<String>>();
        for (HashSet<String> category : allCategories) {
            if (!category.contains(baseStack.getItem().getName().toUpperCase(Locale.ROOT))) continue;
            applicableCategories.add(category);
        }
        return applicableCategories;
    }

    public static List<Enchantment> getApplicableEnchantments(List<Enchantment> enchantments, HashSet<HashSet<String>> applicableCategories) {
        return Enchantments.getApplicableEnchantments(enchantments, applicableCategories, false, true);
    }

    public static List<Enchantment> getApplicableEnchantments(List<Enchantment> enchantments, HashSet<HashSet<String>> applicableCategories, boolean isTreasure) {
        return Enchantments.getApplicableEnchantments(enchantments, applicableCategories, isTreasure, true);
    }

    public static List<Enchantment> getApplicableEnchantments(List<Enchantment> enchantments, HashSet<HashSet<String>> applicableCategories, boolean isTreasure, boolean isDiscoverable) {
        ArrayList<Enchantment> applicableEnchantments = new ArrayList<Enchantment>();
        ArrayList<String> applicableEnchantmentNames = new ArrayList<String>();
        for (Enchantment currentEnchantment : enchantments) {
            if (currentEnchantment.isTreasure() && !isTreasure || currentEnchantment.isDiscoverable() != isDiscoverable || !applicableCategories.contains(currentEnchantment.getCategory()) || applicableEnchantmentNames.contains(currentEnchantment.getName())) continue;
            applicableEnchantments.add(currentEnchantment);
            applicableEnchantmentNames.add(currentEnchantment.getName());
        }
        return applicableEnchantments;
    }

    public static void filterCompatibleEnchantments(ArrayList<EnchantmentInstance> list, EnchantmentInstance instance) {
        list.removeIf(e -> e.getEnchantment().getIncompatible().contains(instance.getEnchantment().getName()) || instance.getEnchantment().getIncompatible().contains(e.getEnchantment().getName()));
    }

    public Enchantment getEnchantment(List<Enchantment> enchantments, String name) {
        for (Enchantment enchantment : enchantments) {
            if (!enchantment.getName().equals(name)) continue;
            return enchantment;
        }
        return null;
    }
}

