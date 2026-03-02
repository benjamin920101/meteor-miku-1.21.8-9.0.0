/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.item;

import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mcfeature.loot.effect.Effect;
import java.util.ArrayList;
import java.util.Objects;

public class Item {
    private final String name;
    private ArrayList<Pair<String, Integer>> enchantments;
    private ArrayList<Pair<Effect, Integer>> effects;

    public Item(String name) {
        this(name, new ArrayList<Pair<String, Integer>>(), new ArrayList<Pair<Effect, Integer>>());
    }

    public Item(String name, ArrayList<Pair<String, Integer>> enchantments, ArrayList<Pair<Effect, Integer>> effects) {
        this.name = name;
        this.enchantments = enchantments;
        this.effects = effects;
    }

    public ArrayList<Pair<Effect, Integer>> getEffects() {
        return this.effects;
    }

    public void setEffects(ArrayList<Pair<Effect, Integer>> effects) {
        this.effects = effects;
    }

    public void addEffect(Pair<Effect, Integer> effect) {
        this.effects.add(effect);
    }

    public ArrayList<Pair<String, Integer>> getEnchantments() {
        return this.enchantments;
    }

    public void setEnchantments(ArrayList<Pair<String, Integer>> enchantments) {
        this.enchantments = enchantments;
    }

    public void addEnchantment(Pair<String, Integer> enchantment) {
        this.enchantments.add(enchantment);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Item{name='" + this.name + '\'' + ", enchantments=" + this.enchantments + ", effects=" + this.effects + '}';
    }

    public boolean equalsName(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Item)) {
            return false;
        }
        Item item = (Item)o;
        return Objects.equals(this.name, item.name);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Item)) {
            return false;
        }
        Item item = (Item)o;
        boolean sameEnchantment = item.enchantments.size() == this.enchantments.size();
        for (Pair<String, Integer> enchantment : this.enchantments) {
            if (item.enchantments.contains(enchantment)) continue;
            sameEnchantment = false;
            break;
        }
        boolean sameEffect = item.effects.size() == this.effects.size();
        for (Pair<Effect, Integer> effect : this.effects) {
            if (item.effects.contains(effect)) continue;
            sameEffect = false;
            break;
        }
        return this.equalsName(o) && sameEnchantment && sameEffect;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.enchantments);
    }
}

