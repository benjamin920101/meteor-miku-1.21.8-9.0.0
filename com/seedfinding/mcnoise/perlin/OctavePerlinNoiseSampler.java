/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcnoise.perlin;

import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mcnoise.noise.NoiseSampler;
import com.seedfinding.mcnoise.perlin.PerlinNoiseSampler;
import com.seedfinding.mcnoise.utils.MathHelper;
import com.seedfinding.mcseed.rand.JRand;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OctavePerlinNoiseSampler
implements NoiseSampler {
    public final double lacunarity;
    public final double persistence;
    private final PerlinNoiseSampler[] octaveSamplers;
    private final List<Double> amplitudes;

    public OctavePerlinNoiseSampler(JRand random, int octaveCount) {
        this.amplitudes = null;
        this.octaveSamplers = new PerlinNoiseSampler[octaveCount];
        for (int i = 0; i < octaveCount; ++i) {
            this.octaveSamplers[i] = new PerlinNoiseSampler(random);
        }
        this.lacunarity = 1.0;
        this.persistence = 1.0;
    }

    public int getCount() {
        return this.octaveSamplers.length;
    }

    public OctavePerlinNoiseSampler(JRand rand, IntStream octaves) {
        this(rand, octaves.boxed().collect(Collectors.toList()));
    }

    public static Pair<Integer, List<Double>> makeAmplitudes(List<Integer> octaves) {
        Quad<Integer, Integer, Integer, List<Integer>> processedOctaves = OctavePerlinNoiseSampler.processOctaves(octaves);
        int start = processedOctaves.getFirst();
        ArrayList<Double> octavePlaces = new ArrayList<Double>();
        for (int octave : processedOctaves.getFourth()) {
            octavePlaces.set(octave + start, 1.0);
        }
        return new Pair<Integer, List<Double>>(start, octavePlaces);
    }

    public OctavePerlinNoiseSampler(JRand rand, Pair<Integer, List<Double>> octaveParams) {
        double d0;
        this.amplitudes = octaveParams.getSecond();
        PerlinNoiseSampler perlin = new PerlinNoiseSampler(rand);
        int length = this.amplitudes.size();
        int start = octaveParams.getFirst();
        this.octaveSamplers = new PerlinNoiseSampler[length];
        if (start >= 0 && start < length && (d0 = this.amplitudes.get(start).doubleValue()) != 0.0) {
            this.octaveSamplers[start] = perlin;
        }
        for (int idx = start - 1; idx >= 0; --idx) {
            if (idx < length) {
                double d1 = this.amplitudes.get(idx);
                if (d1 != 0.0) {
                    this.octaveSamplers[idx] = new PerlinNoiseSampler(rand);
                    continue;
                }
                rand.advance(SKIP_262);
                continue;
            }
            rand.advance(SKIP_262);
        }
        if (start < length - 1) {
            long noiseSeed = (long)(perlin.sample(0.0, 0.0, 0.0, 0.0, 0.0) * 9.223372036854776E18);
            rand.setSeed(noiseSeed);
            for (int l = start + 1; l < length; ++l) {
                if (l >= 0) {
                    double d2 = this.amplitudes.get(l);
                    if (d2 != 0.0) {
                        this.octaveSamplers[l] = new PerlinNoiseSampler(rand);
                        continue;
                    }
                    rand.advance(SKIP_262);
                    continue;
                }
                rand.advance(SKIP_262);
            }
        }
        this.persistence = Math.pow(2.0, -start);
        this.lacunarity = Math.pow(2.0, length - 1) / (Math.pow(2.0, length) - 1.0);
    }

    private static Quad<Integer, Integer, Integer, List<Integer>> processOctaves(List<Integer> octaves) {
        int end;
        if ((octaves = octaves.stream().sorted(Integer::compareTo).collect(Collectors.toList())).isEmpty()) {
            throw new IllegalArgumentException("Need some octaves!");
        }
        int start = -octaves.get(0).intValue();
        int length = start + (end = octaves.get(octaves.size() - 1).intValue()) + 1;
        if (length < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
        }
        return new Quad<Integer, Integer, Integer, List<Integer>>(start, end, length, octaves);
    }

    public OctavePerlinNoiseSampler(JRand rand, List<Integer> octaves) {
        this.amplitudes = null;
        Quad<Integer, Integer, Integer, List<Integer>> processedOctaves = OctavePerlinNoiseSampler.processOctaves(octaves);
        int end = processedOctaves.getSecond();
        int length = processedOctaves.getThird();
        PerlinNoiseSampler perlin = new PerlinNoiseSampler(rand);
        this.octaveSamplers = new PerlinNoiseSampler[length];
        if (end >= 0 && end < length && octaves.contains(0)) {
            this.octaveSamplers[end] = perlin;
        }
        for (int idx = end + 1; idx < length; ++idx) {
            if (idx >= 0 && octaves.contains(end - idx)) {
                this.octaveSamplers[idx] = new PerlinNoiseSampler(rand);
                continue;
            }
            rand.advance(SKIP_262);
        }
        if (end > 0) {
            long noiseSeed = (long)(perlin.sample(0.0, 0.0, 0.0, 0.0, 0.0) * 9.223372036854776E18);
            rand.setSeed(noiseSeed);
            for (int index = end - 1; index >= 0; --index) {
                if (index < length && octaves.contains(end - index)) {
                    this.octaveSamplers[index] = new PerlinNoiseSampler(rand);
                    continue;
                }
                rand.advance(SKIP_262);
            }
        }
        this.persistence = Math.pow(2.0, end);
        this.lacunarity = 1.0 / (Math.pow(2.0, length) - 1.0);
    }

    public double sample(double x, double y, double z) {
        return this.sample(x, y, z, 0.0, 0.0, false);
    }

    public double sample(double x, double y, double z, double yAmplification, double minY, boolean useDefaultY) {
        double noise = 0.0;
        double persistence = this.persistence;
        double lacunarity = this.lacunarity;
        for (int idx = 0; idx < this.octaveSamplers.length; ++idx) {
            PerlinNoiseSampler sampler = this.octaveSamplers[idx];
            if (sampler != null) {
                double sample = sampler.sample(MathHelper.maintainPrecision(x * persistence), useDefaultY ? -sampler.originY : MathHelper.maintainPrecision(y * persistence), MathHelper.maintainPrecision(z * persistence), yAmplification * persistence, minY * persistence) * lacunarity;
                noise += (this.amplitudes != null ? this.amplitudes.get(idx) : 1.0) * sample;
            }
            persistence /= 2.0;
            lacunarity *= 2.0;
        }
        return noise;
    }

    public PerlinNoiseSampler getOctave(int octave) {
        return this.octaveSamplers[octave];
    }

    @Override
    public double sample(double x, double y, double yAmplification, double minY) {
        return this.sample(x, y, 0.0, yAmplification, minY, false);
    }
}

