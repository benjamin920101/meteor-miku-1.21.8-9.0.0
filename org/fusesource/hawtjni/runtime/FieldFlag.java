/*
 * Decompiled with CFR 0.152.
 */
package org.fusesource.hawtjni.runtime;

import com.github.mikumiku.addon.IiIIIiIiiI;
import com.github.mikumiku.addon.iIiiIiiIii;
import java.util.Date;

public final class FieldFlag
extends Enum<FieldFlag> {
    public static final /* enum */ FieldFlag IiiIiIiiIi;
    public static final /* enum */ FieldFlag IIiIiIIiii;
    private static final /* synthetic */ FieldFlag[] iIIiiIiIiI;
    public static final /* enum */ FieldFlag iiiiiIIiIi;
    public static final /* enum */ FieldFlag iIIiIiiiIi;
    public static final /* enum */ FieldFlag iIiIiIIIII;
    public static final /* enum */ FieldFlag ALLATORIxDEMO;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ FieldFlag() {
        void var1_-1;
        void var2_-1;
        void this_ = var2_-1;
        FieldFlag fieldFlag = this;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIiiIiiIii.ALLATORIxDEMO("\u0016}+x\u001f^fd;x,ns`c\u8be3\u66b0\u65a3\u5273\u6714\u65ee\u7241\u6738\uff42"));
        }
    }

    public static FieldFlag[] values() {
        return (FieldFlag[])iIIiiIiIiI.clone();
    }

    private static /* synthetic */ FieldFlag[] ALLATORIxDEMO() {
        FieldFlag[] fieldFlagArray = new FieldFlag[6 & 0x7F];
        fieldFlagArray[3 >> 2] = iIiIiIIIII;
        fieldFlagArray[5 >> 2] = IiiIiIiiIi;
        fieldFlagArray[5 >> 1] = ALLATORIxDEMO;
        fieldFlagArray[--3] = iiiiiIIiIi;
        fieldFlagArray[--4] = IIiIiIIiii;
        fieldFlagArray[--5] = iIIiIiiiIi;
        return fieldFlagArray;
    }

    static {
        iIiIiIIIII = new FieldFlag(IiIIIiIiiI.ALLATORIxDEMO("6\b\u0017/<\u0016&\u000f:\u0012"), 5 >> 3);
        IiiIiIiiIi = new FieldFlag(iIiiIiiIii.ALLATORIxDEMO("\u0007\\\rG\nHZ\u0017"), 2 ^ 3);
        ALLATORIxDEMO = new FieldFlag(IiIIIiIiiI.ALLATORIxDEMO("\u00107\u0000>\u0015\u00171'\u000f<\u0001?\u0006"), 1 ^ 3);
        iiiiiIIiIi = new FieldFlag(iIiiIiiIii.ALLATORIxDEMO("\u0010\\\u0005A\u0006P\u0001Y@\u0011"), --3);
        IIiIiIIiii = new FieldFlag(IiIIIiIiiI.ALLATORIxDEMO(":\t%\u0014=\u001b/\u000f\u001d-5\f8\u00066\u0010"), --4);
        iIIiIiiiIi = new FieldFlag(iIiiIiiIii.ALLATORIxDEMO("E\u0004\u001dJ\u0003C\u001cZ\u000b]\u000eQ\u0013KQ\u0011"), --5);
        iIIiiIiIiI = FieldFlag.ALLATORIxDEMO();
    }

    public static FieldFlag valueOf(String iIiIiIIIII2) {
        return Enum.valueOf(FieldFlag.class, iIiIiIIIII2);
    }
}

