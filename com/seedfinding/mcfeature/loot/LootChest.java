/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot;

import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.item.Item;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;

public class LootChest {
    public final Map<Item, List<Stack>> stacksMap = new HashMap<Item, List<Stack>>();
    public static BiPredicate<Integer, Integer> EQUAL_TO = Integer::equals;
    public static BiPredicate<Integer, Integer> NOT_EQUAL_TO = (a, b) -> !a.equals(b);
    public static BiPredicate<Integer, Integer> LESS_THAN = (a, b) -> a < b;
    public static BiPredicate<Integer, Integer> MORE_THAN = (a, b) -> a > b;
    public static BiPredicate<Integer, Integer> LESS_OR_EQUAL_TO = (a, b) -> a <= b;
    public static BiPredicate<Integer, Integer> MORE_OR_EQUAL_TO = (a, b) -> a >= b;

    public LootChest(Stack ... stacks) {
        for (Stack stack : stacks) {
            Item item = stack.item;
            if (!this.stacksMap.containsKey(item)) {
                this.stacksMap.put(item, new ArrayList());
            }
            this.stacksMap.get(item).add(stack);
        }
    }

    public static Stack stack(Item item, BiPredicate<Integer, Integer> predicate, int amount) {
        return new Stack(item, predicate, amount);
    }

    public boolean testLoot(long lootTableSeed, LootTable lootTable) {
        LootContext context = new LootContext(lootTableSeed);
        List<ItemStack> itemStacks = lootTable.generate(context);
        HashSet<Item> foundItems = new HashSet<Item>();
        for (ItemStack itemStack : itemStacks) {
            List<Stack> stacks = this.stacksMap.get(itemStack.getItem());
            if (stacks == null) continue;
            boolean matches = true;
            for (Stack stack : stacks) {
                if (stack.test(itemStack.getCount())) continue;
                matches = false;
                break;
            }
            if (!matches) continue;
            foundItems.add(itemStack.getItem());
        }
        return foundItems.size() == this.stacksMap.size();
    }

    public static class Stack {
        private final Item item;
        private final BiPredicate<Integer, Integer> predicate;
        private final int amount;

        public Stack(Item item, BiPredicate<Integer, Integer> predicate, int amount) {
            this.item = item;
            this.predicate = predicate;
            this.amount = amount;
        }

        public boolean test(int count) {
            return this.predicate.test(count, this.amount);
        }

        public int hashCode() {
            return this.item.hashCode() * 31 + this.amount;
        }
    }
}

