/*
 * Decompiled with CFR 0.152.
 */
package org.fusesource.hawtjni.runtime;

import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Callback {
    public long iIIIiiiiIi;
    public boolean iiiIiiIIII;
    public static final String iIiIIiIIIi;
    public String IIiIiiiiII;
    public static final String IIiiIIIIIi;
    public static final String iIiiiIiIii;
    public static final String iIiIiiiiII;
    public Object IIIIiiIiii;
    public int IiiIiIiiIi;
    public static final String IIiIiIIiii = "J";
    public long iIIiiIiIiI;
    public static final String iiiiiIIiIi;
    public boolean iIIiIiiiIi;
    public static final String iIiIiIIIII = "([J)J";
    public String ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public Callback(Object object, String string, int n, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        boolean bl2 = bl;
        Callback iIiIiIIIII5 = this;
        iIiIiIIIII5(iIiIiIIIII4, (String)iIiIiIIIII3, (int)iIiIiIIIII2, (boolean)this, 0L);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiIIIIIii.ALLATORIxDEMO(":$\u000b-\u0015!\rz0\u0006\u00034\nlO\u8bba\u6695\u65f3\u5252\u6740\u65d0\u720a\u6744\uff4b"));
        }
    }

    public static String ALLATORIxDEMO(int n) {
        int n2;
        int n3 = n;
        String iIiIiIIIII2 = IIiIIIIIii.ALLATORIxDEMO("b");
        int n4 = n2 = 5 >> 3;
        while (n4 < n3) {
            iIiIiIIIII2 = new StringBuilder().insert(5 >> 3, iIiIiIIIII2).append(IIiIiIIiii).toString();
            n4 = ++n2;
        }
        iIiIiIIIII2 = new StringBuilder().insert(3 & 4, iIiIiIIIII2).append(MoveEvent.ALLATORIxDEMO("aD")).toString();
        return iIiIiIIIII2;
    }

    public static synchronized native long bind(Callback var0, Object var1, String var2, String var3, int var4, boolean var5, boolean var6, long var7);

    static {
        iiiiiIIiIi = Callback.ALLATORIxDEMO(3 >> 2);
        iIiIiiiiII = Callback.ALLATORIxDEMO(4 ^ 5);
        iIiiiIiIii = Callback.ALLATORIxDEMO(5 >> 1);
        iIiIIiIIIi = Callback.ALLATORIxDEMO(--3);
        IIiiIIIIIi = Callback.ALLATORIxDEMO(--4);
    }

    public static native int getEntryCount();

    public static final synchronized native void unbind(Callback var0);

    public void ALLATORIxDEMO() {
        if (this.IIIIiiIiii == null) {
            return;
        }
        Callback callback = this;
        Callback.unbind(this);
        callback.IIiIiiiiII = null;
        this.ALLATORIxDEMO = null;
        callback.IIIIiiIiii = null;
        this.iIIIiiiiIi = 0L;
    }

    public static final synchronized native void reset();

    public static native String getPlatform();

    /*
     * WARNING - void declaration
     */
    public Callback(Object object, String string, int n, boolean bl, long l) {
        Callback callback;
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        Callback iIiIiIIIII6;
        int n2 = n;
        Callback callback2 = iIiIiIIIII6 = this;
        Callback callback3 = iIiIiIIIII6;
        callback3.IIIIiiIiii = iIiIiIIIII5;
        callback3.ALLATORIxDEMO = iIiIiIIIII4;
        callback2.IiiIiIiiIi = n2;
        callback2.iiiIiiIIII = iIiIiIIIII5 instanceof Class;
        Callback callback4 = iIiIiIIIII6;
        callback4.iIIiIiiiIi = iIiIiIIIII3;
        callback4.iIIiiIiIiI = iIiIiIIIII2;
        if (iIiIiIIIII3 != false) {
            callback = iIiIiIIIII6;
            iIiIiIIIII6.IIiIiiiiII = iIiIiIIIII;
        } else {
            switch (n2) {
                case 0: {
                    while (false) {
                    }
                    callback = iIiIiIIIII6;
                    iIiIiIIIII6.IIiIiiiiII = iiiiiIIiIi;
                    break;
                }
                case 1: {
                    callback = iIiIiIIIII6;
                    iIiIiIIIII6.IIiIiiiiII = iIiIiiiiII;
                    break;
                }
                case 2: {
                    callback = iIiIiIIIII6;
                    iIiIiIIIII6.IIiIiiiiII = iIiiiIiIii;
                    break;
                }
                case 3: {
                    callback = iIiIiIIIII6;
                    iIiIiIIIII6.IIiIiiiiII = iIiIIiIIIi;
                    break;
                }
                case 4: {
                    callback = iIiIiIIIII6;
                    iIiIiIIIII6.IIiIiiiiII = IIiiIIIIIi;
                    break;
                }
                default: {
                    callback = iIiIiIIIII6;
                    iIiIiIIIII6.IIiIiiiiII = Callback.ALLATORIxDEMO(n2);
                }
            }
        }
        callback.iIIIiiiiIi = Callback.bind(iIiIiIIIII6, iIiIiIIIII5, (String)iIiIiIIIII4, iIiIiIIIII6.IIiIiiiiII, n2, iIiIiIIIII6.iiiIiiIIII, (boolean)iIiIiIIIII3, (long)iIiIiIIIII2);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u001a`+i5e->\u0010B#p*(o\u8bfe\u66b5\u65b7\u5272\u6704\u65f0\u724e\u6764\uff0f"));
        }
    }

    public static final synchronized native boolean getEnabled();

    public long ALLATORIxDEMO() {
        return this.iIIIiiiiIi;
    }

    /*
     * WARNING - void declaration
     */
    public Callback(Object object, String string, int n) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        int n2 = n;
        Callback iIiIiIIIII4 = this;
        iIiIiIIIII4(iIiIiIIIII3, (String)iIiIiIIIII2, n2, (2 & 5) != 0);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u001a`+i5e->\u0010B#p*(o\u8bfe\u66b5\u65b7\u5272\u6704\u65f0\u724e\u6764\uff0f"));
        }
    }

    public static final synchronized native void setEnabled(boolean var0);
}

