/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcbiome.layer.end;

import com.seedfinding.mcbiome.layer.BoolBiomeLayer;
import com.seedfinding.mcbiome.layer.FloatBiomeLayer;
import com.seedfinding.mccore.version.MCVersion;

public class EndHeightLayer
extends FloatBiomeLayer {
    public EndHeightLayer(MCVersion version, BoolBiomeLayer parent) {
        super(version, parent);
    }

    @Override
    public float sample(int x, int y, int z) {
        return this.getNoiseValueAt(x, z);
    }

    public float getNoiseValueAt(int x, int z) {
        int scaledX = x / 2;
        int scaledZ = z / 2;
        int oddX = x % 2;
        int oddZ = z % 2;
        float height = this.getVersion().isNewerOrEqualTo(MCVersion.v1_14) ? 100.0f - (float)Math.sqrt(x * x + z * z) * 8.0f : 100.0f - (float)Math.sqrt((float)x * (float)x + (float)z * (float)z) * 8.0f;
        height = EndHeightLayer.clamp(height);
        for (int rx = -12; rx <= 12; ++rx) {
            for (int rz = -12; rz <= 12; ++rz) {
                long shiftedX = scaledX + rx;
                long shiftedZ = scaledZ + rz;
                if (shiftedX * shiftedX + shiftedZ * shiftedZ <= 4096L || !this.getParent(BoolBiomeLayer.class).get((int)shiftedX, 0, (int)shiftedZ)) continue;
                float elevation = (Math.abs((float)shiftedX) * 3439.0f + Math.abs((float)shiftedZ) * 147.0f) % 13.0f + 9.0f;
                float smoothX = oddX - rx * 2;
                float smoothZ = oddZ - rz * 2;
                float noise = 100.0f - (float)Math.sqrt(smoothX * smoothX + smoothZ * smoothZ) * elevation;
                noise = EndHeightLayer.clamp(noise);
                height = Math.max(height, noise);
            }
        }
        return height;
    }

    protected static float clamp(float value) {
        if (value < -100.0f) {
            return -100.0f;
        }
        return Math.min(value, 80.0f);
    }
}

