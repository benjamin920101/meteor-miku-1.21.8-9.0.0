/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1802
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIiiiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiiIIiiII;
import com.github.mikumiku.addon.iIiIiIIIii;
import java.util.Date;
import net.minecraft.class_1802;

public class IiIiIiIIii
extends iIiIiIIIii {
    public IiIiIiIIii() {
        super(iIiIiIIIii.iIIiIiiiIi, IiIIiIiiiI.ALLATORIxDEMO("\u4e43\u953d\u73c4\u73b9"), IiiiIIiiII.iiIIiIIiii("\u4e49\u9538\u73ce\u73bc"));
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiIiiiI.ALLATORIxDEMO(".B;o\rK^[.j?znz~\u8bf9\u66ad\u65b9\u526e\u670e\u65f3\u725b\u6725\uff58"));
        }
    }

    @Override
    public void onActivate() {
        IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8634);
        this.toggle();
    }
}

