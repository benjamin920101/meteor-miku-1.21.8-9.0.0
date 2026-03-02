/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.device.node;

import com.seedfinding.mcfeature.structure.RegionStructure;
import com.seedfinding.mcfeature.structure.UniformStructure;
import com.seedfinding.mcfeature.structure.device.CoordChecker;
import com.seedfinding.mcfeature.structure.device.ParentInfo;
import com.seedfinding.mcfeature.structure.device.node.Node;
import com.seedfinding.mcmath.util.Mth;
import com.seedfinding.mcseed.lcg.LCG;
import java.util.Set;

public class UniformNode
extends Node<RegionStructure.Config> {
    private final int offset;
    private final Analyser analyser;

    protected UniformNode(RegionStructure.Config config, int regionX, int regionZ, CoordChecker checker) {
        super(config, regionX, regionZ, checker);
        this.offset = ((RegionStructure.Config)this.config).spacing - ((RegionStructure.Config)this.config).separation;
        this.analyser = new Analyser(this);
    }

    protected UniformNode(UniformStructure<?> structure, int regionX, int regionZ, CoordChecker checker) {
        this((RegionStructure.Config)structure.getConfig(), regionX, regionZ, checker);
    }

    public static UniformNode head(UniformStructure<?> structure, int regionX, int regionZ, CoordChecker.Head checker) {
        return new UniformNode(structure, regionX, regionZ, (CoordChecker)checker);
    }

    public static UniformNode head(RegionStructure.Config config, int regionX, int regionZ, CoordChecker.Head checker) {
        return new UniformNode(config, regionX, regionZ, (CoordChecker)checker);
    }

    public static UniformNode node(UniformStructure<?> structure, int regionX, int regionZ, CoordChecker checker) {
        return new UniformNode(structure, regionX, regionZ, checker);
    }

    public static UniformNode node(RegionStructure.Config config, int regionX, int regionZ, CoordChecker checker) {
        return new UniformNode(config, regionX, regionZ, checker);
    }

    public int getOffset() {
        return this.offset;
    }

    @Override
    public Set<Integer> getLiftingPoints() {
        Set<Integer> points = super.getLiftingPoints();
        if (this.analyser.canLift()) {
            points.add(17 + this.analyser.getBits());
        }
        return points;
    }

    @Override
    public boolean test(long structureSeed, int bits, ParentInfo parent) {
        long regionSeed = structureSeed + 341873128712L * (long)this.regionX + 132897987541L * (long)this.regionZ + (long)((RegionStructure.Config)this.config).salt;
        regionSeed = LCG.JAVA.nextSeed(regionSeed ^ LCG.JAVA.multiplier);
        int x = (int)(regionSeed >>> 17) % this.getOffset();
        regionSeed = LCG.JAVA.nextSeed(regionSeed);
        int z = (int)(regionSeed >>> 17) % this.getOffset();
        if (bits != 48) {
            x &= this.analyser.getMask();
            z &= this.analyser.getMask();
        }
        if (!this.checker.test(x, z, bits == 48 ? Mth.MASK_48 : (long)this.analyser.getMask(), parent)) {
            return false;
        }
        return super.test(structureSeed, bits, new ParentInfo(parent, x, z, true));
    }

    public static class Analyser
    extends Node.Analyser<UniformNode> {
        private boolean canLift;
        private int bits;
        private int mask;

        public Analyser(UniformNode node) {
            super(node);
            if (Mth.isPowerOf2(((UniformNode)this.node).getOffset())) {
                return;
            }
            this.bits = Long.numberOfTrailingZeros(((UniformNode)this.node).getOffset());
            if (this.bits == 0) {
                return;
            }
            this.mask = (1 << this.bits) - 1;
            this.canLift = true;
        }

        public boolean canLift() {
            return this.canLift;
        }

        public int getBits() {
            return this.bits;
        }

        public int getMask() {
            return this.mask;
        }
    }
}

