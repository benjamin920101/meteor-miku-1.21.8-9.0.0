/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package com.seedfinding.mccore.util.data;

import com.seedfinding.mccore.util.math.Vec3i;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import org.jetbrains.annotations.NotNull;

public class SpiralIterator<T extends Vec3i>
implements Iterable<T> {
    private final T center;
    private final T lowerBound;
    private final T upperBound;
    private final int step;
    private final Builder<T> builder;

    public SpiralIterator(T center, T lowerBound, T upperBound, int step, Builder<T> builder) {
        this.center = center;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.step = step;
        this.builder = builder;
    }

    public SpiralIterator(T center, T radius, int step, Builder<T> builder) {
        this(center, builder.build(((Vec3i)center).getX() - ((Vec3i)radius).getX(), 0, ((Vec3i)center).getZ() - ((Vec3i)radius).getZ()), builder.build(((Vec3i)center).getX() + ((Vec3i)radius).getX(), 0, ((Vec3i)center).getZ() + ((Vec3i)radius).getZ()), step, builder);
    }

    public SpiralIterator(T center, T radius, Builder<T> builder) {
        this(center, radius, 1, builder);
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new Iterator<T>(){
            private int x;
            private int z;
            private float n;
            private int i;
            private int j;
            {
                this.x = SpiralIterator.this.center.getX();
                this.z = SpiralIterator.this.center.getZ();
                this.n = 1.0f;
                this.i = 0;
                this.j = 0;
            }

            @Override
            public boolean hasNext() {
                return this.x >= SpiralIterator.this.lowerBound.getX() && this.x <= SpiralIterator.this.upperBound.getX() && this.z >= SpiralIterator.this.lowerBound.getZ() && this.z <= SpiralIterator.this.upperBound.getZ();
            }

            @Override
            public T next() {
                Object returnValue = SpiralIterator.this.builder.build(this.x, 0, this.z);
                int floorN = (int)this.n;
                if (this.j < floorN) {
                    switch (this.i % 4) {
                        case 0: {
                            this.z += SpiralIterator.this.step;
                            break;
                        }
                        case 1: {
                            this.x += SpiralIterator.this.step;
                            break;
                        }
                        case 2: {
                            this.z -= SpiralIterator.this.step;
                            break;
                        }
                        case 3: {
                            this.x -= SpiralIterator.this.step;
                        }
                    }
                    ++this.j;
                    return returnValue;
                }
                this.j = 0;
                this.n += 0.5f;
                ++this.i;
                return this.next();
            }
        };
    }

    @Override
    public Spliterator<T> spliterator() {
        return Spliterators.spliterator(this.iterator(), (long)((((Vec3i)this.upperBound).getX() - ((Vec3i)this.lowerBound).getX()) / this.step + 1) * (long)((((Vec3i)this.upperBound).getZ() - ((Vec3i)this.lowerBound).getZ()) / this.step + 1), 16);
    }

    @FunctionalInterface
    public static interface Builder<T extends Vec3i> {
        public T build(int var1, int var2, int var3);
    }
}

