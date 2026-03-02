/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.orbit.EventHandler
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiIiIii;
import com.github.mikumiku.addon.iiIiIiiiiI;
import com.github.mikumiku.addon.mixin.LivingEntityAccessor;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.orbit.EventHandler;

public class iIiIIiIiII
extends iIiIiIIIii {
    public iIiIIiIiII() {
        super(iIiIiIiIii.ALLATORIxDEMO("\u53ad\u9853\u593c\u8d9c"), iiIiIiiiiI.ALLATORIxDEMO("\u53f2:\u6801\u9ad0\u984b\u5949\u8dbb\uff24\u65fd\u5ed9\u8fc5\uff24\u9743\u5e0d\u6e7f\u6eae\u3048"));
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIiIiIiIii.ALLATORIxDEMO("/t:Y\f}\u007fM\u000f|\u001eloL\u007f\u8bcf\u66ac\u658f\u526f\u6738\u65f2\u726d\u6724\uff6e"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIiIIiIiII iIiIIiIiII2 = iIiIIiIiII3;
        iIiIIiIiII iIiIIiIiII3 = post;
        iIiIIiIiII iIiIiIIIII2 = iIiIIiIiII2;
        ((LivingEntityAccessor)iIiIiIIIII2.iIIiiIiIiI.field_1724).setJumpCooldown(3 >> 2);
    }
}

