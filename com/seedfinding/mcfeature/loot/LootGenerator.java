/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot;

import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.condition.LootCondition;
import com.seedfinding.mcfeature.loot.function.LootFunction;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class LootGenerator {
    public Function<MCVersion, LootFunction>[] supplierLootFunctions = null;
    public LootFunction[] lootFunctions;
    public LootFunction combinedLootFunction;
    public Function<MCVersion, LootCondition>[] supplierLootConditions = null;
    public LootCondition[] lootConditions;
    public LootCondition combinedLootCondition;

    public LootGenerator() {
        this.apply((Collection<Function<MCVersion, LootFunction>>)null);
    }

    public LootGenerator apply(Collection<Function<MCVersion, LootFunction>> lootFunctions) {
        if (lootFunctions != null) {
            this.supplierLootFunctions = lootFunctions.toArray(new Function[0]);
        } else {
            this.lootFunctions = new LootFunction[0];
            this.combinedLootFunction = (baseStack, context) -> baseStack;
        }
        return this;
    }

    public LootGenerator when(Collection<Function<MCVersion, LootCondition>> lootConditions) {
        if (this.lootFunctions != null) {
            this.supplierLootConditions = lootConditions.toArray(new Function[0]);
        } else {
            this.lootConditions = new LootCondition[0];
            this.combinedLootCondition = context -> true;
        }
        return this;
    }

    public LootGenerator apply(MCVersion version) {
        int i;
        if (this.supplierLootFunctions != null) {
            this.lootFunctions = new LootFunction[this.supplierLootFunctions.length];
            i = 0;
            for (Function<MCVersion, Object> function : this.supplierLootFunctions) {
                this.lootFunctions[i++] = (LootFunction)function.apply(version);
            }
            this.combinedLootFunction = LootFunction.combine(this.lootFunctions);
        }
        if (this.supplierLootConditions != null) {
            this.lootConditions = new LootCondition[this.supplierLootConditions.length];
            i = 0;
            for (Function<MCVersion, Object> function : this.supplierLootConditions) {
                this.lootConditions[i++] = (LootCondition)function.apply(version);
            }
            this.combinedLootCondition = LootCondition.combine(this.lootConditions);
        }
        return this;
    }

    public abstract void generate(LootContext var1, Consumer<ItemStack> var2);
}

