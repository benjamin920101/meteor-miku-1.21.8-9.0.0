/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 */
package com.github.mikumiku.addon.ok;

import com.github.mikumiku.addon.IIIIiIiIii;
import java.util.Date;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class PreLaunchInitializer
implements PreLaunchEntrypoint {
    public static final String PURCHASE_URL = "https://qm.qq.com/q/ugixHq8ceI";
    public static String auth;
    public static boolean authenticated;

    public PreLaunchInitializer() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public void onPreLaunch() {
        IIIIiIiIii.ALLATORIxDEMO();
    }

    static {
        authenticated = 5 >> 3;
        auth = "false";
    }
}

