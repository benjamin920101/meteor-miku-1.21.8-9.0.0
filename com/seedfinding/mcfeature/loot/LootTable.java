/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot;

import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.LootGenerator;
import com.seedfinding.mcfeature.loot.LootPool;
import com.seedfinding.mcfeature.loot.function.LootFunction;
import com.seedfinding.mcfeature.loot.item.Item;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.loot.roll.UniformRoll;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LootTable
extends LootGenerator {
    public final LootPool[] lootPools;
    private boolean hasVersionApplied = false;
    private Integer luck = null;

    public LootTable(LootPool ... lootPools) {
        this(Arrays.asList(lootPools), null);
    }

    public LootTable(Collection<LootPool> lootPools, Collection<Function<MCVersion, LootFunction>> lootFunctions) {
        this.lootPools = lootPools.toArray(new LootPool[0]);
        this.apply(lootFunctions);
    }

    @Override
    public LootTable apply(MCVersion version) {
        return this.apply(version, 1);
    }

    public LootTable apply(MCVersion version, int luck) {
        for (LootPool lootPool : this.lootPools) {
            lootPool.apply(version).processWeights(luck, null);
        }
        this.hasVersionApplied = true;
        this.luck = luck;
        return this;
    }

    public LootTable apply(MCVersion version, int luck, LootContext lootContext) {
        for (LootPool lootPool : this.lootPools) {
            lootPool.apply(version).processWeights(luck, lootContext);
        }
        this.hasVersionApplied = true;
        this.luck = luck;
        return this;
    }

    private LootTable apply(int luck) {
        if (!this.hasVersionApplied) {
            System.err.println("Version was not applied, we default to latest " + (Object)((Object)MCVersion.latest()));
            return this.apply(MCVersion.latest(), luck);
        }
        for (LootPool lootPool : this.lootPools) {
            lootPool.processWeights(luck, null);
        }
        this.luck = luck;
        return this;
    }

    public static LinkedList<ItemStack> shuffleItems(LootContext context, LinkedList<ItemStack> items) {
        List container = IntStream.range(0, 27).boxed().collect(Collectors.toList());
        context.shuffle(container);
        ArrayList<ItemStack> list = new ArrayList<ItemStack>();
        Iterator iterator = items.iterator();
        int size = container.size();
        while (iterator.hasNext()) {
            ItemStack itemstack = (ItemStack)iterator.next();
            if (itemstack.isEmpty()) {
                iterator.remove();
                continue;
            }
            if (itemstack.getCount() <= 1) continue;
            list.add(itemstack);
            iterator.remove();
        }
        while (size - items.size() - list.size() > 0 && !list.isEmpty()) {
            ItemStack itemstack2 = (ItemStack)list.remove(new UniformRoll(0.0f, list.size() - 1).getCount(context));
            int half = itemstack2.getCount() / 2;
            int i = new UniformRoll(1.0f, half).getCount(context);
            ItemStack itemstack1 = itemstack2.split(i);
            if (itemstack2.getCount() > 1 && context.nextBoolean()) {
                list.add(itemstack2);
            } else {
                items.add(itemstack2);
            }
            if (itemstack1.getCount() > 1 && context.nextBoolean()) {
                list.add(itemstack1);
                continue;
            }
            items.add(itemstack1);
        }
        items.addAll(list);
        context.shuffle(items);
        HashMap<Integer, ItemStack> positions = new HashMap<Integer, ItemStack>();
        int len = container.size();
        for (ItemStack itemstack : items) {
            if (container.isEmpty()) {
                return items;
            }
            if (itemstack.isEmpty()) {
                positions.put((Integer)container.remove(container.size() - 1), ItemStack.EMPTY);
                continue;
            }
            positions.put((Integer)container.remove(container.size() - 1), itemstack);
        }
        LinkedList<ItemStack> result = new LinkedList<ItemStack>();
        for (int i = 0; i < len; ++i) {
            result.add(positions.getOrDefault(i, ItemStack.EMPTY));
        }
        return result;
    }

    @Override
    public void generate(LootContext context, Consumer<ItemStack> stackConsumer) {
        if (!this.hasVersionApplied) {
            this.apply(context.getVersion(), context.getLuck(), context);
        } else if (this.luck == null || this.luck.intValue() != context.getLuck()) {
            this.apply(context.getLuck());
        }
        stackConsumer = LootFunction.stack(stackConsumer, this.combinedLootFunction, context);
        for (LootPool lootPool : this.lootPools) {
            lootPool.generate(context, stackConsumer);
        }
    }

    public LinkedList<ItemStack> generateIndexed(LootContext context) {
        LinkedList<ItemStack> itemStacks = new LinkedList<ItemStack>();
        this.generate(context, itemStacks::add);
        return LootTable.shuffleItems(context, itemStacks);
    }

    public List<ItemStack> generate(LootContext context) {
        HashMap itemCounts = new HashMap();
        this.generate(context, stack -> {
            int oldCount = itemCounts.getOrDefault(stack.getItem(), 0);
            itemCounts.put(stack.getItem(), oldCount + stack.getCount());
        });
        return itemCounts.entrySet().stream().map(e -> new ItemStack((Item)e.getKey(), (Integer)e.getValue())).collect(Collectors.toList());
    }
}

