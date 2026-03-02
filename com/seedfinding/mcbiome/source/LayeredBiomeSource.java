/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.source;

import com.seedfinding.mcbiome.layer.BiomeLayer;
import com.seedfinding.mcbiome.layer.LayerStack;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.version.MCVersion;
import java.util.List;

public abstract class LayeredBiomeSource<T extends BiomeLayer>
extends BiomeSource {
    protected final LayerStack<T> layers = new LayerStack();

    public LayeredBiomeSource(MCVersion version, long worldSeed) {
        super(version, worldSeed);
    }

    public List<T> getLayers() {
        return this.layers;
    }

    public T getLayer(int index) {
        return (T)((BiomeLayer)this.getLayers().get(index));
    }

    public T getLayer(Class<? extends BiomeLayer> layerClass) {
        for (BiomeLayer layer : this.getLayers()) {
            if (layer.getClass() != layerClass) continue;
            return (T)layer;
        }
        return null;
    }

    public int getLayerCount() {
        return this.getLayers().size();
    }
}

