/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.enchantment;

import com.seedfinding.mcfeature.misc.IntBiPredicate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalInt;

public final class Enchantment {
    private final String name;
    private final int rarity;
    private final HashSet<String> category;
    private final int minLevel;
    private final int maxLevel;
    private final IntBiPredicate isLowerThanMinCost;
    private final IntBiPredicate isHigherThanMaxCost;
    private final HashSet<String> incompatible;
    private final boolean isTreasure;
    private final boolean isDiscoverable;

    private Enchantment(String name, int rarity, HashSet<String> category, int minLevel, int maxLevel, IntBiPredicate minCost, IntBiPredicate maxCost, HashSet<String> incompatible, boolean isTreasure, boolean isDiscoverable) {
        this.name = name;
        this.rarity = rarity;
        this.category = category;
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
        this.isLowerThanMinCost = minCost;
        this.isHigherThanMaxCost = maxCost;
        this.incompatible = incompatible == null ? new HashSet<String>(Collections.singletonList(name)) : incompatible;
        this.isTreasure = isTreasure;
        this.isDiscoverable = isDiscoverable;
    }

    public static Builder builder(String name, int rarity, HashSet<String> category) {
        return new Builder(name, rarity, category);
    }

    public String getName() {
        return this.name;
    }

    public int getRarity() {
        return this.rarity;
    }

    public HashSet<String> getCategory() {
        return this.category;
    }

    public int getMinLevel() {
        return this.minLevel;
    }

    public int getMaxLevel() {
        return this.maxLevel;
    }

    public boolean isTreasure() {
        return this.isTreasure;
    }

    public IntBiPredicate getIsLowerThanMinCost() {
        return this.isLowerThanMinCost;
    }

    public IntBiPredicate getIsHigherThanMaxCost() {
        return this.isHigherThanMaxCost;
    }

    public boolean isDiscoverable() {
        return this.isDiscoverable;
    }

    public HashSet<String> getIncompatible() {
        return this.incompatible;
    }

    public static final class Builder {
        private final String name;
        private final int rarity;
        private final HashSet<String> category;
        private OptionalInt minLevel = OptionalInt.empty();
        private OptionalInt maxLevel = OptionalInt.empty();
        private Optional<IntBiPredicate> isLowerThanMinCost = Optional.empty();
        private Optional<IntBiPredicate> isHigherThanMaxCost = Optional.empty();
        private Optional<HashSet<String>> incompatible = Optional.empty();
        private boolean isTreasure = false;
        private boolean isDiscoverable = true;

        private Builder(String name, int rarity, HashSet<String> category) {
            this.name = name;
            this.rarity = rarity;
            this.category = category;
        }

        public Builder minMaxLevel(int minLevel, int maxLevel) {
            this.minLevel = OptionalInt.of(minLevel);
            this.maxLevel = OptionalInt.of(maxLevel);
            return this;
        }

        public Builder isLowerThanMinCost(IntBiPredicate isLowerThanMinCost) {
            this.isLowerThanMinCost = Optional.of(isLowerThanMinCost);
            return this;
        }

        public Builder isHigherThanMaxCost(IntBiPredicate isHigherThanMaxCost) {
            this.isHigherThanMaxCost = Optional.of(isHigherThanMaxCost);
            return this;
        }

        public Builder incompatible(String ... incompatibilities) {
            return this.incompatible(new HashSet<String>(Arrays.asList(incompatibilities)));
        }

        public Builder incompatible(HashSet<String> incompatibilities) {
            return this.incompatible(Optional.of(incompatibilities));
        }

        public Builder incompatible(Optional<HashSet<String>> incompatibilities) {
            this.incompatible = incompatibilities;
            return this;
        }

        public Builder treasure() {
            this.isTreasure = true;
            return this;
        }

        public Builder nonDiscoverable() {
            this.isDiscoverable = false;
            return this;
        }

        public Enchantment build() {
            return new Enchantment(this.name, this.rarity, this.category, this.minLevel.orElseThrow(() -> new IllegalStateException("minLevel not specified")), this.maxLevel.orElseThrow(() -> new IllegalStateException("maxLevel not specified")), this.isLowerThanMinCost.orElseThrow(() -> new IllegalStateException("isLowerThanMinCost not specified")), this.isHigherThanMaxCost.orElseThrow(() -> new IllegalStateException("isHigherThanMaxCost not specified")), this.incompatible.orElseGet(() -> new HashSet<String>(Collections.singletonList(this.name))), this.isTreasure, this.isDiscoverable);
        }
    }
}

