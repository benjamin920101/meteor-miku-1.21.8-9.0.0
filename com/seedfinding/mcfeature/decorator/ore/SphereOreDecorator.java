/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.decorator.ore;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.decorator.ore.OreDecorator;
import com.seedfinding.mcseed.rand.JRand;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.ArrayList;
import java.util.List;

public abstract class SphereOreDecorator<C extends OreDecorator.Config, D extends OreDecorator.Data<?>>
extends OreDecorator<C, D> {
    public SphereOreDecorator(C config, MCVersion version) {
        super(config, version);
    }

    @Override
    public Dimension getValidDimension() {
        return Dimension.OVERWORLD;
    }

    @Override
    protected List<BPos> generateOrePositions(BPos bPos, Biome biome, TerrainGenerator generator, JRand rand) {
        ArrayList<BPos> poses = new ArrayList<BPos>();
        int radius = this.getHeightProvider(biome).getY(rand);
        for (int x = bPos.getX() - radius; x <= bPos.getX() + radius; ++x) {
            for (int z = bPos.getZ() - radius; z <= bPos.getZ() + radius; ++z) {
                int distanceCenterZ;
                int distanceCenterX = x - bPos.getX();
                if (!(DistanceMetric.EUCLIDEAN_SQ.getDistance(distanceCenterX, 0, distanceCenterZ = z - bPos.getZ()) <= (double)(radius * radius))) continue;
                for (int y = bPos.getY() - this.getSize(biome); y <= bPos.getY() + this.getSize(biome); ++y) {
                    BPos currentPos = new BPos(x, y, z);
                    Block current = generator.getBiomeColumnAt(x, z)[y];
                    if (!this.getReplaceBlocks(biome).contains(current)) continue;
                    poses.add(currentPos);
                }
            }
        }
        return poses;
    }
}

