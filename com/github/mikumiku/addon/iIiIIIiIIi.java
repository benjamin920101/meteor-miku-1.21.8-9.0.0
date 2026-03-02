/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiIIiiiII;
import java.util.Date;

public class iIiIIIiIIi {
    private static final boolean ALLATORIxDEMO = iIiIIiiiII.ALLATORIxDEMO() == (0x60 & 0x3F) ? --1 : 0;

    public static final long ALLATORIxDEMO(long iIiIiIIIII2, long iIiIiIIIII3) {
        if (ALLATORIxDEMO) {
            return (int)(iIiIiIIIII2 + iIiIiIIIII3);
        }
        return iIiIiIIIII2 + iIiIiIIIII3;
    }

    public iIiIIIiIIi() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

