/*
 * Decompiled with CFR 0.152.
 */
package org.fusesource.hawtjni.runtime;

import com.github.mikumiku.addon.iIiIiIiIii;
import com.github.mikumiku.addon.iiIIIIiiiI;
import java.util.Date;

public final class ClassFlag
extends Enum<ClassFlag> {
    public static final /* enum */ ClassFlag IIiIiIIiii;
    public static final /* enum */ ClassFlag iIIiiIiIiI;
    public static final /* enum */ ClassFlag iiiiiIIiIi;
    public static final /* enum */ ClassFlag iIIiIiiiIi;
    private static final /* synthetic */ ClassFlag[] iIiIiIIIII;
    public static final /* enum */ ClassFlag ALLATORIxDEMO;

    static {
        iIIiIiiiIi = new ClassFlag(iIiIiIiIii.ALLATORIxDEMO("\u001ct\u0019l\fg\u0011nA?"), 3 >> 2);
        IIiIiIIiii = new ClassFlag(iiIIIIiiiI.ALLATORIxDEMO("@Z\u0019"), 2 ^ 3);
        ALLATORIxDEMO = new ClassFlag(iIiIiIiIii.ALLATORIxDEMO("\fl\u0010pK;"), --2);
        iiiiiIIiIi = new ClassFlag(iiIIIIiiiI.ALLATORIxDEMO("M\u0004N\u0005GO\u000f"), --3);
        iIIiiIiIiI = new ClassFlag(iIiIiIiIii.ALLATORIxDEMO("\u0002z\rw\u001dj];"), --4);
        iIiIiIIIII = ClassFlag.ALLATORIxDEMO();
    }

    public static ClassFlag valueOf(String iIiIiIIIII2) {
        return Enum.valueOf(ClassFlag.class, iIiIiIIIII2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ ClassFlag() {
        void var1_-1;
        void var2_-1;
        void this_ = var2_-1;
        ClassFlag classFlag = this;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIIIiiiI.ALLATORIxDEMO("\u0017h\"e\u0001Txn%r2dmj}\u8be9\u66ae\u65a9\u526d\u671e\u65f0\u724b\u6726\uff48"));
        }
    }

    public static ClassFlag[] values() {
        return (ClassFlag[])iIiIiIIIII.clone();
    }

    private static /* synthetic */ ClassFlag[] ALLATORIxDEMO() {
        ClassFlag[] classFlagArray = new ClassFlag[--5];
        classFlagArray[5 >> 3] = iIIiIiiiIi;
        classFlagArray[3 >> 1] = IIiIiIIiii;
        classFlagArray[1 ^ 3] = ALLATORIxDEMO;
        classFlagArray[--3] = iiiiiIIiIi;
        classFlagArray[--4] = iIIiiIiIiI;
        return classFlagArray;
    }
}

