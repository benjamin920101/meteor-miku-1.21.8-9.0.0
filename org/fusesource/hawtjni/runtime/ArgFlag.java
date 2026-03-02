/*
 * Decompiled with CFR 0.152.
 */
package org.fusesource.hawtjni.runtime;

import com.github.mikumiku.addon.iiIiIiiiiI;
import com.github.mikumiku.addon.mixinface.MySettings;
import java.util.Date;

public final class ArgFlag
extends Enum<ArgFlag> {
    public static final /* enum */ ArgFlag iIiiiIiIii;
    public static final /* enum */ ArgFlag iIiIiiiiII;
    public static final /* enum */ ArgFlag IIIIiiIiii;
    public static final /* enum */ ArgFlag IiiIiIiiIi;
    public static final /* enum */ ArgFlag IIiIiIIiii;
    private static final /* synthetic */ ArgFlag[] iIIiiIiIiI;
    public static final /* enum */ ArgFlag iiiiiIIiIi;
    public static final /* enum */ ArgFlag iIIiIiiiIi;
    public static final /* enum */ ArgFlag iIiIiIIIII;
    public static final /* enum */ ArgFlag ALLATORIxDEMO;

    public static ArgFlag valueOf(String iIiIiIIIII2) {
        return Enum.valueOf(ArgFlag.class, iIiIiIIIII2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ ArgFlag() {
        void var1_-1;
        void var2_-1;
        void this_ = var2_-1;
        ArgFlag argFlag = this;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("Zgz\u007fMZ4`i|~j!d1\u8be7\u66e2\u65a7\u5221\u6710\u65bc\u7245\u676a\uff46"));
        }
    }

    public static ArgFlag[] values() {
        return (ArgFlag[])iIIiiIiIiI.clone();
    }

    private static /* synthetic */ ArgFlag[] ALLATORIxDEMO() {
        ArgFlag[] argFlagArray = new ArgFlag[0x6F & 0x19];
        argFlagArray[3 & 4] = iIiIiIIIII;
        argFlagArray[3 >> 1] = iIiIiiiiII;
        argFlagArray[1 ^ 3] = IIiIiIIiii;
        argFlagArray[--3] = iIiiiIiIii;
        argFlagArray[--4] = iiiiiIIiIi;
        argFlagArray[--5] = IiiIiIiiIi;
        argFlagArray[0x6E & 0x17] = IIIIiiIiii;
        argFlagArray[0xF & 0x77] = ALLATORIxDEMO;
        argFlagArray[0x4D & 0x3A] = iIIiIiiiIi;
        return argFlagArray;
    }

    static {
        iIiIiIIIII = new ArgFlag(iiIiIiiiiI.ALLATORIxDEMO("Sz_6\u0004"), 3 ^ 3);
        iIiIiiiiII = new ArgFlag(MySettings.ALLATORIxDEMO("__SB\u0013\u0013"), 2 ^ 3);
        IIiIiIIiii = new ArgFlag(iiIiIiiiiI.ALLATORIxDEMO("lHaI|C>\u0006"), --2);
        iIiiiIiIii = new ArgFlag(MySettings.ALLATORIxDEMO("EC\u000f\u0013"), --3);
        iiiiiIIiIi = new ArgFlag(iiIiIiiiiI.ALLATORIxDEMO("HgTaNmOjA-\r"), --4);
        IiiIiIiiIi = new ArgFlag(MySettings.ALLATORIxDEMO("TNNFMA\u0013\u0002"), --5);
        IIIIiiIiii = new ArgFlag(iiIiIiiiiI.ALLATORIxDEMO("OfTvO;\u000f"), 0x56 & 0x2F);
        ALLATORIxDEMO = new ArgFlag(MySettings.ALLATORIxDEMO("ER_DEC\u0003\u000b"), 0x3F & 0x47);
        iIIiIiiiIi = new ArgFlag(iiIiIiiiiI.ALLATORIxDEMO("^|Eg_\u007fE<\u001e"), 0x4D & 0x3A);
        iIIiiIiIiI = ArgFlag.ALLATORIxDEMO();
    }
}

