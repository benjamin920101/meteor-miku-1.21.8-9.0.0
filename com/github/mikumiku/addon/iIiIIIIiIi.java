/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.orbit.EventHandler
 */
package com.github.mikumiku.addon;

import java.util.Date;
import lombok.Generated;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.orbit.EventHandler;

public final class iIiIIIIiIi {
    public static final int iIIiIiiiIi = 0x7FFFFFFE;
    public static final iIiIIIIiIi iIiIiIIIII = new iIiIIIIiIi();
    private volatile long ALLATORIxDEMO = 0L;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIiIIIIiIi iIiIIIIiIi2 = iIiIIIIiIi3;
        iIiIIIIiIi iIiIIIIiIi3 = post;
        iIiIIIIiIi iIiIiIIIII2 = iIiIIIIiIi2;
        iIiIiIIIII2.ALLATORIxDEMO();
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        ++this.ALLATORIxDEMO;
    }

    @Generated
    public long ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    private /* synthetic */ iIiIIIIiIi() {
        MeteorClient.EVENT_BUS.subscribe((Object)this);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

