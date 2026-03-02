/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcfeature.structure.generator;

import com.seedfinding.mcfeature.Feature;
import com.seedfinding.mcfeature.structure.BuriedTreasure;
import com.seedfinding.mcfeature.structure.DesertPyramid;
import com.seedfinding.mcfeature.structure.EndCity;
import com.seedfinding.mcfeature.structure.RuinedPortal;
import com.seedfinding.mcfeature.structure.Shipwreck;
import com.seedfinding.mcfeature.structure.Village;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcfeature.structure.generator.structure.BuriedTreasureGenerator;
import com.seedfinding.mcfeature.structure.generator.structure.DesertPyramidGenerator;
import com.seedfinding.mcfeature.structure.generator.structure.EndCityGenerator;
import com.seedfinding.mcfeature.structure.generator.structure.RuinedPortalGenerator;
import com.seedfinding.mcfeature.structure.generator.structure.ShipwreckGenerator;
import com.seedfinding.mcfeature.structure.generator.structure.VillageGenerator;
import java.util.HashMap;
import java.util.Map;

public class Generators {
    private static final Map<Class<? extends Feature<?, ?>>, Generator.GeneratorFactory<?>> REGISTRY = new HashMap();

    public static <T extends Feature<?, ?>> void register(Class<T> clazz, Generator.GeneratorFactory<?> lootFactory) {
        REGISTRY.put(clazz, lootFactory);
    }

    public static <T extends Feature<?, ?>> Generator.GeneratorFactory<?> get(Class<T> clazz) {
        return REGISTRY.get(clazz);
    }

    static {
        Generators.register(DesertPyramid.class, DesertPyramidGenerator::new);
        Generators.register(BuriedTreasure.class, BuriedTreasureGenerator::new);
        Generators.register(Shipwreck.class, ShipwreckGenerator::new);
        Generators.register(EndCity.class, EndCityGenerator::new);
        Generators.register(RuinedPortal.class, RuinedPortalGenerator::new);
        Generators.register(Village.class, VillageGenerator::new);
    }
}

