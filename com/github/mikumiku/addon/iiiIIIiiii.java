/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_310
 *  net.minecraft.class_5250
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.iIIIIIIIii;
import com.github.mikumiku.addon.mixinface.MySettings;
import java.util.Date;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_5250;

public class iiiIIIiiii
extends Module {
    private boolean iIIiIiiiIi;
    private final int iIiIiIIIII;
    public class_310 ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public iiiIIIiiii(Category category, String string, String object) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        iiiIIIiiii iiiIIIiiii2 = object2;
        Object object2 = object;
        object = iiiIIIiiii2;
        void v1 = iIiIiIIIII4;
        super((Category)iIiIiIIIII3, (String)iIiIiIIIII2, (String)object2);
        v1.ALLATORIxDEMO = class_310.method_1551();
        v1.iIiIiIIIII = 0x6C & 0x77;
        v1.ALLATORIxDEMO = class_310.method_1551();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIIIIii.ALLATORIxDEMO("p\tE\u0004s  0p!a101 \u8bb2\u66f3\u65f2\u5230\u6745\u65ad\u7210\u677b\uff13"));
        }
    }

    public void sendToggledMsg() {
        iiiIIIiiii iiiIIIiiii2 = iiiIIIiiii3;
        class_5250 class_52502 = class_2561.method_43473().method_10862(class_2583.field_24360.method_27706(class_124.field_1060)).method_27693(MySettings.ALLATORIxDEMO("PP"));
        class_5250 class_52503 = class_2561.method_43473().method_10862(class_2583.field_24360.method_27706(class_124.field_1061)).method_27693(iIIIIIIIii.ALLATORIxDEMO("\u0010H\r"));
        ChatUtils.forceNextPrefixClass(((Object)((Object)iiiIIIiiii2)).getClass());
        iiiIIIiiii iiiIIIiiii3 = class_2561.method_43473();
        iiiIIIiiii iiiIIIiiii4 = iiiIIIiiii2;
        iiiIIIiiii iiiIIIiiii5 = iiiIIIiiii3;
        iiiIIIiiii3.method_10852((class_2561)class_2561.method_43473().method_10862(class_2583.field_24360.method_27706(class_124.field_1068)).method_27693(iiiIIIiiii4.title));
        iiiIIIiiii5.method_27693(MySettings.ALLATORIxDEMO(">"));
        iiiIIIiiii3.method_10852((class_2561)class_2561.method_43473().method_10862(class_2583.field_24360.method_27706(class_124.field_1080)).method_27693(iIIIIIIIii.ALLATORIxDEMO("y'C\u0006v:jk")));
        iiiIIIiiii5.method_10852((class_2561)(iiiIIIiiii4.isActive() ? class_52502 : class_52503));
        IiIiIIiiii.ALLATORIxDEMO((class_2561)iiiIIIiiii3, iiiIIIiiii2.hashCode());
    }
}

