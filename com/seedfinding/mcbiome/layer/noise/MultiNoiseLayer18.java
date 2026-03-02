/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.layer.noise;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.BiomeLayer;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcnoise.noise.DoublePerlinNoiseSampler;
import com.seedfinding.mcseed.rand.JRand;
import java.util.Arrays;
import java.util.List;

public class MultiNoiseLayer18
extends IntBiomeLayer {
    private final TargetPoint[] biomePoints;
    private final boolean is3D;
    private DoublePerlinNoiseSampler temperature;
    private DoublePerlinNoiseSampler humidity;
    private DoublePerlinNoiseSampler altitude;
    private DoublePerlinNoiseSampler erosion;
    private DoublePerlinNoiseSampler weirdness;
    private DoublePerlinNoiseSampler offset;
    public static final TerrainShaper shaper = new TerrainShaper();

    public MultiNoiseLayer18(MCVersion version, long worldSeed, boolean is3D, TargetPoint[] biomePoints) {
        super(version, new BiomeLayer[]{null});
        this.is3D = is3D;
        if (biomePoints != null) {
            this.temperature = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed), new Pair<Integer, List<Double>>(-9, Arrays.asList(1.0, 1.0, 0.0, 1.0, 1.0, 0.0)));
            this.humidity = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 1L), new Pair<Integer, List<Double>>(-7, Arrays.asList(1.0, 0.0, 1.0, 0.0, 1.0, 0.0)));
            this.altitude = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 2L), new Pair<Integer, List<Double>>(-9, Arrays.asList(1.0, 1.0, 2.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0)));
            this.erosion = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 3L), new Pair<Integer, List<Double>>(-9, Arrays.asList(1.0, 1.0, 0.0, 1.0, 1.0)));
            this.weirdness = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 4L), new Pair<Integer, List<Double>>(-7, Arrays.asList(1.0, 2.0, 1.0, 0.0, 0.0, 0.0)));
            this.offset = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 5L), new Pair<Integer, List<Double>>(-3, Arrays.asList(1.0, 1.0, 1.0, 0.0)));
        }
        this.biomePoints = biomePoints;
    }

    public MultiNoiseLayer18(MCVersion version, long worldSeed, boolean is3D, TargetPoint[] biomePoints, NoiseSettings noiseSettings) {
        super(version, new BiomeLayer[]{null});
        this.is3D = is3D;
        if (biomePoints != null) {
            this.temperature = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed), noiseSettings.temperatureNoise);
            this.humidity = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 1L), noiseSettings.humidityNoise);
            this.altitude = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 2L), noiseSettings.altitudeNoise);
            this.erosion = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 3L), noiseSettings.erosionNoise);
            this.altitude = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 4L), noiseSettings.altitudeNoise);
            this.offset = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 5L), noiseSettings.offsetNoise);
        }
        this.biomePoints = biomePoints;
    }

    @Override
    public int sample(int x, int y, int z) {
        if (this.biomePoints == null) {
            return Biomes.THE_VOID.getId();
        }
        double X = (double)x + this.offset.sample(x, 0.0, z) * 4.0;
        double Y = (double)y + this.offset.sample(y, z, x) * 4.0;
        double Z = (double)z + this.offset.sample(z, x, 0.0) * 4.0;
        float altitude = (float)this.altitude.sample(X, 0.0, Z);
        float erosion = (float)this.erosion.sample(X, 0.0, Z);
        float weirdness = (float)this.weirdness.sample(X, 0.0, Z);
        double shape = shaper.compute(altitude, erosion, weirdness);
        float depth = (float)(MultiNoiseLayer18.computeDimensionDensity(1.0, -0.51875, y * 4) + shape);
        float temperature = (float)this.temperature.sample(X, Y, Z);
        float humidity = (float)this.humidity.sample(X, Y, Z);
        TargetPoint target = new TargetPoint(temperature, humidity, altitude, erosion, depth, weirdness);
        return this.bruteforceFinder(target, Arrays.asList(new BiomePoint[0])).getId();
    }

    private Biome bruteforceFinder(TargetPoint target, List<BiomePoint> biomes) {
        float current = Float.MAX_VALUE;
        Biome biome = Biomes.THE_VOID;
        for (BiomePoint biomePoint : biomes) {
            float fitness = biomePoint.fitness(target);
            if (!(fitness < current)) continue;
            current = fitness;
            biome = biomePoint.getBiome();
        }
        return biome;
    }

    public static double computeDimensionDensity(double x, double y, double z) {
        return MultiNoiseLayer18.computeDimensionDensity(x, y, z, 0.0);
    }

    public static double computeDimensionDensity(double x, double y, double z, double offset) {
        double d5 = 1.0 - z / 128.0 + offset;
        return d5 * x + y;
    }

    public static class NoiseSettings {
        public Pair<Integer, List<Double>> temperatureNoise;
        public Pair<Integer, List<Double>> humidityNoise;
        public Pair<Integer, List<Double>> altitudeNoise;
        public Pair<Integer, List<Double>> erosionNoise;
        public Pair<Integer, List<Double>> weirdnessNoise;
        public Pair<Integer, List<Double>> offsetNoise;

        public NoiseSettings() {
            this.setTemperature(-9, Arrays.asList(1.0, 1.0, 0.0, 1.0, 1.0, 0.0)).setHumidity(-7, Arrays.asList(1.0, 0.0, 1.0, 0.0, 1.0, 0.0)).setAltitude(-9, Arrays.asList(1.0, 1.0, 2.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0)).setErosion(-9, Arrays.asList(1.0, 1.0, 0.0, 1.0, 1.0)).setWeirdness(-7, Arrays.asList(1.0, 2.0, 1.0, 0.0, 0.0, 0.0)).setOffset(-3, Arrays.asList(1.0, 1.0, 1.0, 0.0));
        }

        public NoiseSettings setTemperature(int firstOctaves, List<Double> amplitudes) {
            this.temperatureNoise = new Pair<Integer, List<Double>>(firstOctaves, amplitudes);
            return this;
        }

        public NoiseSettings setHumidity(int firstOctaves, List<Double> amplitudes) {
            this.humidityNoise = new Pair<Integer, List<Double>>(firstOctaves, amplitudes);
            return this;
        }

        public NoiseSettings setAltitude(int firstOctaves, List<Double> amplitudes) {
            this.altitudeNoise = new Pair<Integer, List<Double>>(firstOctaves, amplitudes);
            return this;
        }

        public NoiseSettings setErosion(int firstOctaves, List<Double> amplitudes) {
            this.erosionNoise = new Pair<Integer, List<Double>>(firstOctaves, amplitudes);
            return this;
        }

        public NoiseSettings setWeirdness(int firstOctaves, List<Double> amplitudes) {
            this.weirdnessNoise = new Pair<Integer, List<Double>>(firstOctaves, amplitudes);
            return this;
        }

        public NoiseSettings setOffset(int firstOctaves, List<Double> amplitudes) {
            this.offsetNoise = new Pair<Integer, List<Double>>(firstOctaves, amplitudes);
            return this;
        }
    }

    public static class TerrainShaper {
        public double compute(float x, float y, float z) {
            z = TerrainShaper.peaksAndValleys(z);
            return 0.015f;
        }

        public static float peaksAndValleys(float f) {
            return -(Math.abs(Math.abs(f) - 0.6666667f) - 0.33333334f) * 3.0f;
        }
    }

    public static class TargetPoint {
        public final float temperature;
        public final float humidity;
        public final float altitude;
        public final float erosion;
        public final float depth;
        public final float weirdness;

        public TargetPoint(float temperature, float humidity, float altitude, float erosion, float depth, float weirdness) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.altitude = altitude;
            this.erosion = erosion;
            this.depth = depth;
            this.weirdness = weirdness;
        }
    }

    public static class BiomePoint {
        public final Biome biome;
        public final Pair<Float, Float> temperature;
        public final Pair<Float, Float> humidity;
        public final Pair<Float, Float> altitude;
        public final Pair<Float, Float> erosion;
        public final Pair<Float, Float> depth;
        public final Pair<Float, Float> weirdness;
        public final float offset;

        public BiomePoint(Biome biome, Pair<Float, Float> temperature, Pair<Float, Float> humidity, Pair<Float, Float> altitude, Pair<Float, Float> erosion, Pair<Float, Float> depth, Pair<Float, Float> weirdness, float offset) {
            this.biome = biome;
            this.temperature = temperature;
            this.humidity = humidity;
            this.altitude = altitude;
            this.erosion = erosion;
            this.depth = depth;
            this.weirdness = weirdness;
            this.offset = offset;
        }

        public Biome getBiome() {
            return this.biome;
        }

        float fitness(TargetPoint targetPoint) {
            return BiomePoint.square(BiomePoint.distance(this.temperature, targetPoint.temperature)) + BiomePoint.square(BiomePoint.distance(this.humidity, targetPoint.humidity)) + BiomePoint.square(BiomePoint.distance(this.altitude, targetPoint.altitude)) + BiomePoint.square(BiomePoint.distance(this.erosion, targetPoint.erosion)) + BiomePoint.square(BiomePoint.distance(this.depth, targetPoint.depth)) + BiomePoint.square(BiomePoint.distance(this.weirdness, targetPoint.weirdness)) + BiomePoint.square(this.offset);
        }

        public static float distance(Pair<Float, Float> minMax, float f) {
            float f2 = f - minMax.getSecond().floatValue();
            float f3 = minMax.getFirst().floatValue() - f;
            if (f2 > 0.0f) {
                return f2;
            }
            return Math.max(f3, 0.0f);
        }

        public static float square(float f) {
            return f * f;
        }
    }
}

