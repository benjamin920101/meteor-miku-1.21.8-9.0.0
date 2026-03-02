/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.condition;

import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.condition.LootCondition;

public class OpenWaterCondition
implements LootCondition {
    public final boolean inOpenwater;

    public OpenWaterCondition(boolean inOpenwater) {
        this.inOpenwater = inOpenwater;
    }

    @Override
    public boolean is_valid(LootContext context) {
        return context.isInOpenWater() == this.inOpenwater;
    }
}

