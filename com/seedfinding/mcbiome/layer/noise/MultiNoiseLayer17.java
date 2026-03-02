/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.layer.noise;

import com.seedfinding.mcbiome.biome.BiomePoint;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.layer.BiomeLayer;
import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcnoise.noise.DoublePerlinNoiseSampler;
import com.seedfinding.mcseed.rand.JRand;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiNoiseLayer17
extends IntBiomeLayer {
    private final BiomePoint[] biomePoints;
    private final boolean is3D;
    private DoublePerlinNoiseSampler temperature;
    private DoublePerlinNoiseSampler humidity;
    private DoublePerlinNoiseSampler altitude;
    private DoublePerlinNoiseSampler weirdness;

    public MultiNoiseLayer17(MCVersion version, long worldSeed, boolean is3D, BiomePoint[] biomePoints) {
        super(version, new BiomeLayer[]{null});
        this.is3D = is3D;
        if (biomePoints != null) {
            this.temperature = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed), IntStream.rangeClosed(-7, -6));
            this.humidity = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 1L), IntStream.rangeClosed(-7, -6));
            this.altitude = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 2L), IntStream.rangeClosed(-7, -6));
            this.weirdness = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 3L), IntStream.rangeClosed(-7, -6));
        }
        this.biomePoints = biomePoints;
    }

    public MultiNoiseLayer17(MCVersion version, long worldSeed, boolean is3D, BiomePoint[] biomePoints, NoiseSettings noiseSettings) {
        super(version, new BiomeLayer[]{null});
        this.is3D = is3D;
        if (biomePoints != null) {
            this.temperature = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed), noiseSettings.temperatureNoise);
            this.humidity = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 1L), noiseSettings.humidityNoise);
            this.altitude = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 2L), noiseSettings.altitudeNoise);
            this.weirdness = new DoublePerlinNoiseSampler((JRand)new ChunkRand(worldSeed + 3L), noiseSettings.weirdnessNoise);
        }
        this.biomePoints = biomePoints;
    }

    @Override
    public int sample(int x, int y, int z) {
        if (this.biomePoints == null) {
            return Biomes.THE_VOID.getId();
        }
        y = this.is3D ? y : 0;
        BiomePoint point = new BiomePoint(null, (float)this.temperature.sample(x, y, z), (float)this.humidity.sample(x, y, z), (float)this.altitude.sample(x, y, z), (float)this.weirdness.sample(x, y, z), 0.0f);
        return Stream.of(this.biomePoints).min(Comparator.comparing(m -> Float.valueOf(m.distanceTo(point)))).map(BiomePoint::getBiome).orElse(Biomes.THE_VOID).getId();
    }

    public static class NoiseSettings {
        public Pair<Integer, List<Double>> temperatureNoise;
        public Pair<Integer, List<Double>> humidityNoise;
        public Pair<Integer, List<Double>> altitudeNoise;
        public Pair<Integer, List<Double>> weirdnessNoise;

        public NoiseSettings() {
            this.setTemperature(-7, Arrays.asList(1.0, 1.0)).setHumidity(-7, Arrays.asList(1.0, 1.0)).setAltitude(-7, Arrays.asList(1.0, 1.0)).setWeirdness(-7, Arrays.asList(1.0, 1.0));
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

        public NoiseSettings setWeirdness(int firstOctaves, List<Double> amplitudes) {
            this.weirdnessNoise = new Pair<Integer, List<Double>>(firstOctaves, amplitudes);
            return this;
        }
    }
}

