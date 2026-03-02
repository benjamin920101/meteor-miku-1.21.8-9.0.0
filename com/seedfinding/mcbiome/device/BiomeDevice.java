/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.device;

import com.seedfinding.mcbiome.device.Restriction;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcmath.util.Mth;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.LongConsumer;

public class BiomeDevice {
    private final MCVersion version;
    protected List<Restriction> restrictions = new ArrayList<Restriction>();

    public BiomeDevice(MCVersion version) {
        this.version = version;
    }

    public BiomeDevice add(Restriction restriction) {
        this.restrictions.add(restriction);
        return this;
    }

    public BiomeDevice add(Restriction.Factory<?> factory, int x, int z) {
        return this.add((Restriction)factory.create(this.version, x, z));
    }

    public void findSeeds(LongConsumer onSeedFound) {
        List<BitGroup> groups = this.groupRestrictions();
        BitGroup entry = groups.get(0);
        if (entry.bits < 64) {
            this.search(entry, 0L, 0, onSeedFound);
        } else {
            long worldSeed = 0L;
            do {
                boolean valid = true;
                for (BitGroup group : groups) {
                    if (group.testSeed(worldSeed)) continue;
                    valid = false;
                    break;
                }
                if (!valid || !groups.get(groups.size() - 1).testSource(worldSeed)) continue;
                onSeedFound.accept(worldSeed);
            } while (++worldSeed != 0L);
        }
    }

    public void search(BitGroup group, long baseSeed, int bits, LongConsumer onSeedFound) {
        long searchSpace = Mth.getPow2(group.bits - bits);
        for (long i = 0L; i < searchSpace; ++i) {
            long seed = baseSeed | i << bits;
            if (!group.testSeed(seed)) continue;
            if (group.next == null) {
                if (!group.testSource(seed)) continue;
                onSeedFound.accept(seed);
                continue;
            }
            this.search(group.next, seed, group.bits, onSeedFound);
        }
    }

    private List<BitGroup> groupRestrictions() {
        TreeMap<Integer, BitGroup> raw = new TreeMap<Integer, BitGroup>(Integer::compare);
        for (Restriction restriction : this.restrictions) {
            for (int bitPoint : restriction.getBitPoints()) {
                raw.computeIfAbsent(Integer.valueOf((int)bitPoint), (Function<Integer, BitGroup>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$groupRestrictions$0(java.lang.Integer ), (Ljava/lang/Integer;)Lcom/seedfinding/mcbiome/device/BiomeDevice$BitGroup;)()).restrictions.add(restriction);
            }
        }
        ArrayList<BitGroup> result = new ArrayList<BitGroup>(raw.values());
        for (int i = 0; i < result.size() - 1; ++i) {
            ((BitGroup)result.get((int)i)).next = (BitGroup)result.get(i + 1);
        }
        return result;
    }

    private static /* synthetic */ BitGroup lambda$groupRestrictions$0(Integer i) {
        return new BitGroup(i, new ArrayList<Restriction>());
    }

    public static final class BitGroup {
        public final int bits;
        public final List<Restriction> restrictions;
        public BitGroup next;

        public BitGroup(int bits, List<Restriction> restrictions) {
            this.bits = bits;
            this.restrictions = restrictions;
        }

        public boolean testSeed(long seed) {
            for (Restriction restriction : this.restrictions) {
                if (restriction.testSeed(seed, this.bits)) continue;
                return false;
            }
            return true;
        }

        public boolean testSource(long seed) {
            OverworldBiomeSource source = new OverworldBiomeSource(MCVersion.v1_16_2, seed);
            for (Restriction restriction : this.restrictions) {
                if (restriction.testSource(source)) continue;
                return false;
            }
            return true;
        }

        public String toString() {
            return "lift " + this.bits + " bits: " + this.restrictions;
        }
    }
}

