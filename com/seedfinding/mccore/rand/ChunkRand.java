/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mccore.rand;

import com.seedfinding.mccore.rand.seed.PositionSeed;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.UnsupportedVersion;
import com.seedfinding.mcmath.util.Mth;
import com.seedfinding.mcseed.lcg.LCG;
import com.seedfinding.mcseed.rand.JRand;
import java.util.Collection;

public class ChunkRand
extends JRand {
    public ChunkRand() {
        super(0L, false);
    }

    public ChunkRand(long seed) {
        super(seed);
    }

    public ChunkRand(long seed, boolean scramble) {
        super(seed, scramble);
    }

    public Debugger asChunkRandDebugger() {
        return new Debugger(this);
    }

    public long setTerrainSeed(int chunkX, int chunkZ, MCVersion version) {
        long seed = (long)chunkX * 341873128712L + (long)chunkZ * 132897987541L;
        this.setSeed(seed);
        return seed & Mth.MASK_48;
    }

    public long setPopulationSeed(long worldSeed, int x, int z, MCVersion version) {
        long b;
        long a;
        this.setSeed(worldSeed);
        if (version.isOlderThan(MCVersion.v1_13)) {
            a = this.nextLong() / 2L * 2L + 1L;
            b = this.nextLong() / 2L * 2L + 1L;
        } else {
            a = this.nextLong() | 1L;
            b = this.nextLong() | 1L;
        }
        long seed = (long)x * a + (long)z * b ^ worldSeed;
        this.setSeed(seed);
        return seed & Mth.MASK_48;
    }

    public long setDecoratorSeed(long populationSeed, int index, int step, MCVersion version) {
        return this.setDecoratorSeed(populationSeed, index + 10000 * step, version);
    }

    public long setDecoratorSeed(long populationSeed, int salt, MCVersion version) {
        if (version.isOlderThan(MCVersion.v1_13)) {
            throw new UnsupportedVersion(version, "decorator seed");
        }
        long seed = populationSeed + (long)salt;
        this.setSeed(seed);
        return seed & Mth.MASK_48;
    }

    public long setDecoratorSeed(long worldSeed, int blockX, int blockZ, int index, int step, MCVersion version) {
        long populationSeed = this.setPopulationSeed(worldSeed, blockX, blockZ, version);
        return this.setDecoratorSeed(populationSeed, index, step, version);
    }

    public long setDecoratorSeed(long worldSeed, int blockX, int blockZ, int salt, MCVersion version) {
        long populationSeed = this.setPopulationSeed(worldSeed, blockX, blockZ, version);
        return this.setDecoratorSeed(populationSeed, salt, version);
    }

    public long setCarverSeed(long worldSeed, int chunkX, int chunkZ, MCVersion version) {
        this.setSeed(worldSeed);
        long a = this.nextLong();
        long b = this.nextLong();
        long seed = (long)chunkX * a ^ (long)chunkZ * b ^ worldSeed;
        this.setSeed(seed);
        return seed & Mth.MASK_48;
    }

    public long setRegionSeed(long worldSeed, int regionX, int regionZ, int salt, MCVersion version) {
        long seed = (long)regionX * 341873128712L + (long)regionZ * 132897987541L + worldSeed + (long)salt;
        this.setSeed(seed);
        return seed & Mth.MASK_48;
    }

    public long setWeakSeed(long worldSeed, int chunkX, int chunkZ, MCVersion version) {
        int sX = chunkX >> 4;
        int sZ = chunkZ >> 4;
        long seed = (long)(sX ^ sZ << 4) ^ worldSeed;
        this.setSeed(seed);
        return seed & Mth.MASK_48;
    }

    public long setSlimeSeed(long worldSeed, int chunkX, int chunkZ, long scrambler, MCVersion version) {
        long seed = worldSeed + (long)(chunkX * chunkX * 4987142) + (long)(chunkX * 5947611) + (long)(chunkZ * chunkZ) * 4392871L + (long)(chunkZ * 389711) ^ scrambler;
        this.setSeed(seed);
        return seed & Mth.MASK_48;
    }

    public long setSlimeSeed(long worldSeed, int chunkX, int chunkZ, MCVersion version) {
        return this.setSlimeSeed(worldSeed, chunkX, chunkZ, 987234911L, version);
    }

    public long setPositionSeed(int x, int y, int z, MCVersion version) {
        long seed = PositionSeed.getPositionSeed(x, y, z);
        this.setSeed(seed);
        return seed & Mth.MASK_48;
    }

    public long setPositionSeed(BPos pos, MCVersion version) {
        return this.setPositionSeed(pos.getX(), pos.getY(), pos.getZ(), version);
    }

    public long setBaseStoneSeed(long worldSeed, int x, int y, int z) {
        this.setSeed(worldSeed);
        long a = this.nextLong();
        long b = this.nextLong();
        long c = this.nextLong();
        long seed = (long)x * a ^ (long)y * b ^ (long)z * (long)z ^ worldSeed;
        this.setSeed(seed);
        return seed;
    }

    public <T> T getRandom(Collection<T> list) {
        return (T)ChunkRand.getRandom(list.toArray(), this);
    }

    public <T> T getRandom(T[] list) {
        return ChunkRand.getRandom(list, this);
    }

    public static <T> T getRandom(T[] list, ChunkRand rand) {
        return list[rand.nextInt(list.length)];
    }

    public int getInt(int minimum, int maximum) {
        return ChunkRand.getInt(this, minimum, maximum);
    }

    public static int getInt(ChunkRand rand, int minimum, int maximum) {
        return minimum >= maximum ? minimum : rand.nextInt(maximum - minimum + 1) + minimum;
    }

    public static final class Debugger
    extends ChunkRand {
        public JRand.Debugger debugger;

        public Debugger(JRand delegate) {
            this.debugger = delegate.asDebugger();
        }

        @Override
        public long nextSeed() {
            return this.debugger.nextSeed();
        }

        @Override
        public void advance(long calls) {
            this.debugger.advance(calls);
        }

        @Override
        public int nextInt(int bound) {
            return this.debugger.nextInt(bound);
        }

        @Override
        public int next(int bits) {
            return this.debugger.next(bits);
        }

        @Override
        public void advance(LCG lcg) {
            this.debugger.advance(lcg);
        }

        @Override
        public long getSeed() {
            return this.debugger.getSeed();
        }

        @Override
        public void setSeed(long seed) {
            this.debugger.setSeed(seed);
        }

        public long getGlobalCounter() {
            return this.debugger.getGlobalCounter();
        }

        public long getNextIntSkip() {
            return this.debugger.getNextIntSkip();
        }
    }
}

