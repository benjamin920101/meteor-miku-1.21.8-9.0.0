/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.layer.scale;

import com.seedfinding.mcbiome.layer.IntBiomeLayer;
import com.seedfinding.mcbiome.layer.composite.CrossLayer;
import com.seedfinding.mccore.version.MCVersion;

public class SmoothScaleLayer
extends CrossLayer {
    public SmoothScaleLayer(MCVersion version, long worldSeed, long salt, IntBiomeLayer parent) {
        super(version, worldSeed, salt, parent);
    }

    @Override
    public int sample(int n, int e, int s, int w, int center) {
        boolean zMatches;
        boolean xMatches = e == w;
        boolean bl = zMatches = n == s;
        if (xMatches && zMatches) {
            return this.choose(w, n);
        }
        if (!xMatches && !zMatches) {
            return center;
        }
        if (xMatches) {
            return w;
        }
        return n;
    }
}

