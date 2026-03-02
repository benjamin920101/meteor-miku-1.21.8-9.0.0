/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  net.minecraft.class_2338
 */
package com.github.mikumiku.addon.mixinface;

import com.github.mikumiku.addon.IiiIiiiIII;
import com.github.mikumiku.addon.IiiiIiiIIi;
import com.github.mikumiku.addon.iiiIIiiiIi;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.class_2338;

public class MagicMix {
    public static double z;
    public static List<class_2338> oreGoals;
    public static double x;

    public static boolean coordinatesisActive() {
        IiiIiiiIII iiiIiiiIII = (IiiIiiiIII)Modules.get().get(IiiIiiiIII.class);
        if (iiiIiiiIII != null && iiiIiiiIII.isActive()) {
            return 3 >> 1;
        }
        return false;
    }

    static {
        x = 0.0;
        z = 0.0;
        oreGoals = new ArrayList<class_2338>();
    }

    public static boolean oreSimBaritone() {
        IiiiIiiIIi iiiiIiiIIi2 = (IiiiIiiIIi)Modules.get().get(IiiiIiiIIi.class);
        if (iiiiIiiIIi2 == null || !iiiiIiiIIi2.iiiIiIiiIi()) {
            return false;
        }
        return true;
    }

    public static boolean eflyenabled() {
        iiiIIiiiIi iiiIIiiiIi2 = (iiiIIiiiIi)Modules.get().get(iiiIIiiiIi.class);
        if (iiiIIiiiIi2 != null && iiiIIiiiIi2.ALLATORIxDEMO()) {
            return 3 >> 1;
        }
        return false;
    }

    public MagicMix() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

