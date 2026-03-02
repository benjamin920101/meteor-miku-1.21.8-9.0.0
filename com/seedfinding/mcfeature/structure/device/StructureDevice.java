/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.device;

import com.seedfinding.mccore.util.data.ThreadPool;
import com.seedfinding.mcfeature.Feature;
import com.seedfinding.mcfeature.structure.device.node.Node;
import com.seedfinding.mcmath.util.Mth;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.LongConsumer;

public class StructureDevice {
    public final List<Node<?>> heads = new ArrayList();
    private final ThreadPool pool;

    public StructureDevice() {
        this(1);
    }

    public StructureDevice(int threadCount) {
        this.pool = new ThreadPool(threadCount);
    }

    public <C extends Feature.Config> Node<C> addBranch(Node<C> node) {
        this.heads.add(node);
        return node;
    }

    public void findSeeds(LongConsumer onSeedFound, int bits) {
        List<BitGroup> groups = this.groupRestrictions();
        BitGroup entry = groups.get(0);
        if (entry.bits >= 48) {
            throw new UnsupportedOperationException();
        }
        this.search(entry, 0L, 0, onSeedFound, bits);
        this.pool.awaitCompletion();
        this.pool.shutdown();
    }

    public void search(BitGroup group, long baseSeed, int bits, LongConsumer onSeedFound, int totalBits) {
        System.out.println("[" + baseSeed + "] is good for the lowest " + bits + " bits! Lifting the next " + (group.bits - bits) + " bits...");
        long searchSpace = Mth.getPow2(group.bits - bits);
        for (long i = 0L; i < searchSpace; ++i) {
            long seed = baseSeed | i << bits;
            if (!group.testSeed(seed)) continue;
            if (group.next == null || group.bits >= totalBits) {
                onSeedFound.accept(seed);
                continue;
            }
            this.pool.run(() -> this.search(group.next, seed, group.bits, onSeedFound, totalBits));
            this.pool.awaitFreeThread();
        }
    }

    private List<BitGroup> groupRestrictions() {
        TreeMap<Integer, BitGroup> raw = new TreeMap<Integer, BitGroup>(Integer::compare);
        for (Node<?> head : this.heads) {
            for (int bitPoint : head.getLiftingPoints()) {
                raw.computeIfAbsent(Integer.valueOf((int)bitPoint), (Function<Integer, BitGroup>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$groupRestrictions$1(java.lang.Integer ), (Ljava/lang/Integer;)Lcom/seedfinding/mcfeature/structure/device/StructureDevice$BitGroup;)()).heads.add(head);
            }
        }
        ArrayList<BitGroup> result = new ArrayList<BitGroup>(raw.values());
        for (int i = 0; i < result.size() - 1; ++i) {
            ((BitGroup)result.get((int)i)).next = (BitGroup)result.get(i + 1);
        }
        return result;
    }

    private static /* synthetic */ BitGroup lambda$groupRestrictions$1(Integer i) {
        return new BitGroup(i, new ArrayList());
    }

    public static final class BitGroup {
        public final int bits;
        public final List<Node<?>> heads;
        public BitGroup next;

        public BitGroup(int bits, List<Node<?>> heads) {
            this.bits = bits;
            this.heads = heads;
        }

        public boolean testSeed(long seed) {
            for (Node<?> head : this.heads) {
                if (!head.test(seed, this.bits, null)) continue;
                return true;
            }
            return false;
        }

        public String toString() {
            return "lift " + this.bits + " bits: " + this.heads;
        }
    }
}

