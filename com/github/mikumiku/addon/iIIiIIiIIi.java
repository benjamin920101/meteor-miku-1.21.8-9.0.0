/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiiiIIiIIi;
import java.util.Date;

public class iIIiIIiIIi
implements iiiiIIiIIi {
    private final long iIiIiIIIII;
    private long ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ALLATORIxDEMO(long l, boolean bl) {
        void iIiIiIIIII2;
        boolean bl2 = bl;
        iIIiIIiIIi iIiIiIIIII3 = this;
        if (System.currentTimeMillis() - iIiIiIIIII3.ALLATORIxDEMO > iIiIiIIIII2 * iIiIiIIIII3.iIiIiIIIII) {
            if (bl2) {
                iIiIiIIIII3.ALLATORIxDEMO = System.currentTimeMillis();
            }
            return true;
        }
        return false;
    }

    @Override
    public void iiiIiIiiIi() {
        this.ALLATORIxDEMO = 0L;
    }

    public iIIiIIiIIi(long iIiIiIIIII2) {
        iIIiIIiIIi iIIiIIiIIi2 = this;
        iIIiIIiIIi2.ALLATORIxDEMO = System.currentTimeMillis();
        iIIiIIiIIi2.iIiIiIIIII = iIiIiIIIII2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    @Override
    public boolean ALLATORIxDEMO(long iIiIiIIIII2) {
        return this.ALLATORIxDEMO(iIiIiIIIII2, (2 ^ 3) != 0);
    }

    public iIIiIIiIIi() {
        iIIiIIiIIi iIIiIIiIIi2 = this;
        iIIiIIiIIi2.ALLATORIxDEMO = System.currentTimeMillis();
        iIIiIIiIIi2.iIiIiIIIII = 1L;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    @Override
    public void ALLATORIxDEMO() {
        this.ALLATORIxDEMO = System.currentTimeMillis();
    }
}

