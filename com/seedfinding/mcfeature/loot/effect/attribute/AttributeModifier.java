/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.loot.effect.attribute;

import com.seedfinding.mcseed.rand.JRand;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;

public class AttributeModifier {
    private final double amount;
    private final Operation operation;
    private final Supplier<String> nameGetter;
    private final UUID uuid;

    public AttributeModifier(String name, double amount, Operation operation) {
        this(AttributeModifier.createInsecureUUID(new JRand(0L)), () -> name, amount, operation);
    }

    public AttributeModifier(UUID uuid, String name, double amount, Operation operation) {
        this(uuid, () -> name, amount, operation);
    }

    public AttributeModifier(UUID uuid, Supplier<String> name, double amount, Operation operation) {
        this.uuid = uuid;
        this.nameGetter = name;
        this.amount = amount;
        this.operation = operation;
    }

    public static UUID createInsecureUUID(JRand rand) {
        long mostSigBits = rand.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long leastSigBits = rand.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(mostSigBits, leastSigBits);
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public String getName() {
        return this.nameGetter.get();
    }

    public Operation getOperation() {
        return this.operation;
    }

    public double getAmount() {
        return this.amount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && this.getClass() == other.getClass()) {
            AttributeModifier attributemodifier = (AttributeModifier)other;
            return Objects.equals(this.uuid, attributemodifier.uuid);
        }
        return false;
    }

    public int hashCode() {
        return this.uuid.hashCode();
    }

    public String toString() {
        return "AttributeModifier{amount=" + this.amount + ", operation=" + (Object)((Object)this.operation) + ", name='" + this.nameGetter.get() + '\'' + ", id=" + this.uuid + '}';
    }

    public static enum Operation {
        ADDITION(0),
        MULTIPLY_BASE(1),
        MULTIPLY_TOTAL(2);

        private static final Operation[] OPERATIONS;
        private final int value;

        private Operation(int operation) {
            this.value = operation;
        }

        public static Operation fromValue(int opId) {
            if (opId >= 0 && opId < OPERATIONS.length) {
                return OPERATIONS[opId];
            }
            throw new IllegalArgumentException("No operation with value " + opId);
        }

        public int toValue() {
            return this.value;
        }

        static {
            OPERATIONS = new Operation[]{ADDITION, MULTIPLY_BASE, MULTIPLY_TOTAL};
        }
    }
}

