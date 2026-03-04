/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiiIIIiiiI;
import com.github.mikumiku.addon.iiiiiiiiii;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.util.math.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIiiIIIi {
    private final Map<class_2338, Long> iIIiiIiIiI;
    private Thread iiiiiIIiIi;
    private volatile boolean iIIiIiiiIi;
    private static final long iIiIiIIIII = 10000L;
    private volatile long ALLATORIxDEMO;

    public void ALLATORIxDEMO(class_2338 class_23382) {
        iiIIiiIIIi iiIIiiIIIi2 = iiIIiiIIIi3;
        iiIIiiIIIi iiIIiiIIIi3 = class_23382;
        iiIIiiIIIi iIiIiIIIII2 = iiIIiiIIIi2;
        if (iiIIiiIIIi3 == null) {
            return;
        }
        long l = System.currentTimeMillis();
        iIiIiIIIII2.iIIiiIiIiI.put((class_2338)iiIIiiIIIi3, l);
    }

    public void IIIIiIIiII() {
        this.iIIiiIiIiI.clear();
    }

    public void iiIIiIIiii() {
        this.iiiIiIiiIi();
        this.iIIiIiiiIi = --1;
        iiIIiiIIIi iiIIiiIIIi2 = this;
        this.iiiiiIIiIi = new Thread(() -> {
            iiIIiiIIIi iiIIiiIIIi2 = this;
            block3: while (true) {
                iiIIiiIIIi iiIIiiIIIi3 = iiIIiiIIIi2;
                while (iiIIiiIIIi3.iIIiIiiiIi) {
                    try {
                        Thread.sleep(10000L);
                        if (!iiIIiiIIIi2.iIIiIiiiIi) continue block3;
                        iiIIiiIIIi2.ALLATORIxDEMO();
                    }
                    catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    catch (Exception interruptedException) {
                        System.err.println("PositionCache \u6e05\u7406\u7ebf\u7a0b\u53d1\u751f\u5f02\u5e38: " + interruptedException.getMessage());
                        iiIIiiIIIi3 = iiIIiiIIIi2;
                        continue;
                    }
                    continue block3;
                }
                break;
            }
        });
        iiIIiiIIIi iiIIiiIIIi3 = this;
        iiIIiiIIIi3.iiiiiIIiIi.setDaemon(5 >> 2);
        iiIIiiIIIi3.iiiiiIIiIi.setName(iiiIIIiiiI.ALLATORIxDEMO("k\u000fH\tO)t.X!x\b^Mx,~\u0001U\u0015K\u0014s2~!\u007f"));
        iiIIiiIIIi3.iiiiiIIiIi.start();
    }

    public void ALLATORIxDEMO(long iIiIiIIIII2) {
        if (iIiIiIIIII2 <= 0L) {
            throw new IllegalArgumentException(iiiiiiiiii.ALLATORIxDEMO("\u8f80\u6768\u6591\u9583\u5fa2\u980c\u5940\u4ed9w"));
        }
        this.ALLATORIxDEMO = iIiIiIIIII2;
    }

    public boolean ALLATORIxDEMO() {
        if (this.iIIiIiiiIi && this.iiiiiIIiIi != null && this.iiiiiIIiIi.isAlive()) {
            return --1 != 0;
        }
        return false;
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 >> 1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(3 & 4, stackTraceElement.getClassName()).toString();
        int n = --3;
        int n2 = string2.length();
        int n3 = n2 - (2 ^ 3);
        char[] cArray = new char[n2];
        int n4 = --5 << --3 ^ (2 ^ 3);
        int cfr_ignored_0 = n << n ^ --2;
        int n5 = (5 >> 1 ^ --5) << --4 ^ --4 << (3 >> 1);
        int n6 = iIiIiIIIII2 = string3.length() - --1;
        int n7 = n3;
        String string4 = string3;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string2.charAt(n8) ^ string4.charAt(iIiIiIIIII2)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string2.charAt(n9) ^ string4.charAt(iIiIiIIIII2)));
            if (--iIiIiIIIII2 < 0) {
                iIiIiIIIII2 = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }

    public void iiiIiIiiIi() {
        iiIIiiIIIi iiIIiiIIIi2;
        block3: {
            this.iIIiIiiiIi = 2 & 5;
            if (this.iiiiiIIiIi != null && this.iiiiiIIiIi.isAlive()) {
                this.iiiiiIIiIi.interrupt();
                try {
                    this.iiiiiIIiIi.join(1000L);
                    iiIIiiIIIi2 = this;
                    break block3;
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                }
            }
            iiIIiiIIIi2 = this;
        }
        iiIIiiIIIi2.IIIIiIIiII();
    }

    public iiIIiiIIIi(long iIiIiIIIII2) {
        iiIIiiIIIi iiIIiiIIIi2 = this;
        this.iIIiiIiIiI = new ConcurrentHashMap<class_2338, Long>();
        this.iIIiIiiiIi = 2 ^ 3;
        if (iIiIiIIIII2 <= 0L) {
            throw new IllegalArgumentException(iiiiiiiiii.ALLATORIxDEMO("\u8f80\u6768\u6591\u9583\u5fa2\u980c\u5940\u4ed9w"));
        }
        this.ALLATORIxDEMO = iIiIiIIIII2;
        this.iiIIiIIiii();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiIIIiiiI.ALLATORIxDEMO("\u0010w%z\u0013^@N\u0010_!opo`\u8bec\u66b3\u65ac\u5270\u671b\u65ed\u724e\u673b\uff4d"));
        }
    }

    public int ALLATORIxDEMO() {
        return this.iIIiiIiIiI.size();
    }

    public iiIIiiIIIi() {
        this(1000L);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiIIIiiiI.ALLATORIxDEMO("\u0010w%z\u0013^@N\u0010_!opo`\u8bec\u66b3\u65ac\u5270\u671b\u65ed\u724e\u673b\uff4d"));
        }
    }

    public long ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public String ALLATORIxDEMO() {
        Object[] objectArray = new Object[--3];
        objectArray[2 & 5] = this.ALLATORIxDEMO();
        objectArray[5 >> 2] = this.ALLATORIxDEMO;
        objectArray[5 >> 1] = this.ALLATORIxDEMO();
        return String.format(iiiiiiiiii.ALLATORIxDEMO("\u0015$(:7>(;\u0006*8xe\u0004\u5968\u5c55pzo5mp\u8f87\u670f\u65f6\u95a3}wb\u0013\n\u0004Kw\u6e42\u7451\u7ef8\u7a7c\u8fb7\u883b]WB$\u001a"), objectArray);
    }

    public boolean ALLATORIxDEMO(class_2338 class_23382) {
        iiIIiiIIIi iiIIiiIIIi2 = iiIIiiIIIi3;
        iiIIiiIIIi iiIIiiIIIi3 = class_23382;
        iiIIiiIIIi iIiIiIIIII2 = iiIIiiIIIi2;
        if (iiIIiiIIIi3 == null || !iIiIiIIIII2.iIIiiIiIiI.containsKey(iiIIiiIIIi3)) {
            return false;
        }
        long l = iIiIiIIIII2.iIIiiIiIiI.get(iiIIiiIIIi3);
        if (System.currentTimeMillis() - l >= iIiIiIIIII2.ALLATORIxDEMO) {
            iIiIiIIIII2.iIIiiIiIiI.remove(iiIIiiIIIi3);
            return (3 ^ 3) != 0;
        }
        return true;
    }

    public void ALLATORIxDEMO() {
        iiIIiiIIIi iiIIiiIIIi2 = iterator;
        long l = System.currentTimeMillis();
        Iterator<Map.Entry<class_2338, Long>> iterator = iiIIiiIIIi2.iIIiiIiIiI.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (l - (Long)entry.getValue() < iiIIiiIIIi2.ALLATORIxDEMO) continue;
            iterator.remove();
        }
    }
}

