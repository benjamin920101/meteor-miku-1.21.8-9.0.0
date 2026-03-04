/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.block.FluidBlock
 *  net.minecraft.block.BlockState
 *  net.minecraft.state.property.Property
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraft.world.Heightmap$Type
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import java.util.List;
import lombok.Generated;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Property;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.Heightmap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={ESPChunk.class})
public abstract class BlockESPMixin {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(BlockESPMixin.class);

    @Inject(method={"searchChunk(Lnet/minecraft/class_2791;Ljava/util/List;)Lmeteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk;"}, at={@At(value="HEAD")}, cancellable=true)
    private static void injectSearchChunk(class_2791 chunk, List<class_2248> blocks, CallbackInfoReturnable<ESPChunk> cir) {
        try {
            ESPChunk schunk = new ESPChunk(chunk.method_12004().field_9181, chunk.method_12004().field_9180);
            if (schunk.shouldBeDeleted()) {
                cir.setReturnValue((Object)schunk);
                return;
            }
            class_2338.class_2339 blockPos = new class_2338.class_2339();
            class_2338 playerPos = MeteorClient.mc.field_1724.method_24515();
            for (int x = chunk.method_12004().method_8326(); x <= chunk.method_12004().method_8327(); ++x) {
                for (int z = chunk.method_12004().method_8328(); z <= chunk.method_12004().method_8329(); ++z) {
                    int height = chunk.method_12032(class_2902.class_2903.field_13202).method_12603(x - chunk.method_12004().method_8326(), z - chunk.method_12004().method_8328());
                    for (int y = MeteorClient.mc.field_1687.method_31607(); y < height; ++y) {
                        blockPos.method_10103(x, y, z);
                        class_2680 bs = chunk.method_8320((class_2338)blockPos);
                        class_2248 block = bs.method_26204();
                        if (!blocks.contains(block)) continue;
                        if (block instanceof class_2404) {
                            double distanceSq;
                            Integer level = (Integer)bs.method_11654((class_2769)class_2404.field_11278);
                            if (level == null || level != 0 || block == class_2246.field_10382 && (distanceSq = blockPos.method_10262((class_2382)playerPos)) > 4096.0) continue;
                            schunk.add((class_2338)blockPos, false);
                            continue;
                        }
                        schunk.add((class_2338)blockPos, false);
                    }
                }
            }
            cir.setReturnValue((Object)schunk);
        }
        catch (Exception e) {
            log.error("Miku BlockESPMixin.injectSearchChunk err: " + String.valueOf(e));
        }
    }
}

