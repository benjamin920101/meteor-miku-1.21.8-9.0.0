/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IiiiIIiiII;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class iiiiiIIIiI {
    private static final String[] iIiIiIIIII;
    private static final int[] ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(String string, String string2, String string3, int n) {
        iiiiiIIIiI iiiiiIIIiI2;
        int n2;
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        iiiiiIIIiI iiiiiIIIiI3 = object;
        Object object = (String)iIiIiIIIII5 + (String)iIiIiIIIII4 + (String)iIiIiIIIII3 + (int)iIiIiIIIII2;
        object = iiiiiIIIiI3.ALLATORIxDEMO((String)object, IIiIIIIIii.ALLATORIxDEMO(";\"\tgY"));
        object = Base64.getEncoder().encodeToString((byte[])object);
        if (((String)object).hashCode() == --1) {
            n2 = 3 & 5;
            iiiiiIIIiI2 = iiiiiIIIiI3;
        } else {
            n2 = 0;
            iiiiiIIIiI2 = iiiiiIIIiI3;
        }
        if (n2 == iiiiiIIIiI2.ALLATORIxDEMO((String)object, (int)iIiIiIIIII2) && iiiiiIIIiI3.IIiIiIiiii((String)iIiIiIIIII3) && iiiiiIIIiI3.iiiiIIIiII((String)iIiIiIIIII4) && iiiiiIIIiI3.ALLATORIxDEMO() && iiiiiIIIiI3.iiIIiIIiii((String)iIiIiIIIII5)) {
            return 3 >> 1;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(String string, int n) {
        int n2;
        char[] iIiIiIIIII2;
        iiiiiIIIiI iiiiiIIIiI2 = this;
        int n3 = 2 & 5;
        iIiIiIIIII2 = iIiIiIIIII2.toCharArray();
        int n4 = iIiIiIIIII2.length;
        int n5 = n2 = 3 ^ 3;
        while (n5 < n4) {
            void iIiIiIIIII3;
            char c = iIiIiIIIII2[n2];
            n3 += c ^ iIiIiIIIII3;
            n5 = ++n2;
        }
        if (n3 % (1 ^ 3) == 0) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] ALLATORIxDEMO(String string, String string2) {
        iiiiiIIIiI iiiiiIIIiI2 = string3;
        String string3 = string2;
        iiiiiIIIiI iIiIiIIIII2 = iiiiiIIIiI2;
        try {
            void iIiIiIIIII3;
            MessageDigest messageDigest = MessageDigest.getInstance(string3);
            messageDigest.update(iIiIiIIIII3.getBytes(StandardCharsets.UTF_8));
            return messageDigest.digest();
        }
        catch (Exception exception) {
            return new byte[5 >> 3];
        }
    }

    private /* synthetic */ String iiiIiIiiIi() {
        iiiiiIIIiI iiiiiIIIiI2 = object;
        try {
            Object object = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getHardwareAddress();
            StringBuilder stringBuilder = new StringBuilder();
            if (object != null) {
                int n;
                int n2 = ((Object)object).length;
                int n3 = n = 3 & 4;
                while (n3 < n2) {
                    Object object2 = object[n];
                    Object[] objectArray = new Object[4 ^ 5];
                    objectArray[3 >> 2] = (byte)object2;
                    stringBuilder.append(String.format(IiiiIIiiII.iiIIiIIiii("Q\u001bfS"), objectArray));
                    n3 = ++n;
                }
            }
            return stringBuilder.toString();
        }
        catch (Exception exception) {
            return IIiIIIIIii.ALLATORIxDEMO("ZxzXzXzXZxzX");
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IIiIiIiiii(String string) {
        void iIiIiIIIII2;
        int n;
        iiiiiIIIiI iiiiiIIIiI2 = this;
        String string2 = iiiiiIIIiI2.ALLATORIxDEMO();
        int n2 = 5 >> 3;
        int n3 = n = 3 ^ 3;
        while (n3 < string2.length()) {
            char c = string2.charAt(n);
            int n4 = n + --1;
            n2 += c * n4;
            n3 = ++n;
        }
        if (n2 % (0x11 & 0x7F) == iIiIiIIIII2.hashCode() % (0x73 & 0x1D)) {
            return 5 >> 2;
        }
        return false;
    }

    private /* synthetic */ boolean iIiIiiiiii(String object) {
        iiiiiIIIiI iiiiiIIIiI2 = object2;
        Object object2 = object;
        object = iiiiiIIIiI2;
        int this2 = --3;
        if (new Random().nextInt(--5) < this2) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(int n) {
        int n2;
        void iIiIiIIIII2;
        iiiiiIIIiI iiiiiIIIiI2 = this;
        void this_ = iIiIiIIIII2;
        int n3 = n2 = 3 & 4;
        while (true) {
            if (n3 >= 100) break;
            int n4 = n2 * iIiIiIIIII2;
            this_ += n4 % (0x3FB & 0x7FEC);
            n3 = ++n2;
        }
        if (this_ % --5 != false) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiiIiIiiIi(String string, String string2) {
        int n;
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiiiIIIiI iiiiiIIIiI2 = this;
        int n2 = Math.min(iIiIiIIIII3.length(), iIiIiIIIII2.length());
        int n3 = 3 & 4;
        int n4 = n = 2 & 5;
        while (n4 < n2) {
            char c = iIiIiIIIII3.charAt(n);
            char c2 = iIiIiIIIII2.charAt(n);
            n3 ^= c ^ c2;
            n4 = ++n;
        }
        if (n3 % --2 == 0) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    public iiiiiIIIiI() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIIiiII.iiIIiIIiii("\u0004g\u0011J\u0007NT^$o\u0015_d\u007ft\u8bfc\u66a7\u65bc\u5264\u670b\u65f9\u725e\u672f\uff5d"));
        }
    }

    private /* synthetic */ String iiiIiIiiIi(String string) {
        iiiiiIIIiI iiiiiIIIiI2 = string2;
        String string2 = string;
        iiiiiIIIiI iIiIiIIIII2 = iiiiiIIIiI2;
        return Base64.getEncoder().encodeToString(iIiIiIIIII2.ALLATORIxDEMO(string2, IiiiIIiiII.iiIIiIIiii("f\u0010>")));
    }

    /*
     * WARNING - void declaration
     */
    public boolean iiiIiIiiIi(String string, String string2, String string3) {
        iiiiiIIIiI iiiiiIIIiI2 = this;
        int n = 2 & 5;
        int n2 = n4 = 3 ^ 3;
        while (true) {
            if (n2 >= 10000) break;
            int n3 = n4 * --3 + (0x3F & 0x47);
            n += n3 % (0x65EB & 0x1A94);
            n2 = ++n4;
        }
        int n4 = 0;
        try {
            void iIiIiIIIII2;
            void iIiIiIIIII3;
            void iIiIiIIIII4;
            n4 = iiiiiIIIiI2.ALLATORIxDEMO((String)iIiIiIIIII4, (String)iIiIiIIIII3, (String)iIiIiIIIII2, n) ? 1 : 0;
        }
        catch (Exception exception) {
            return (3 & 4) != 0;
        }
        if (n4 != 0 && iiiiiIIIiI2.ALLATORIxDEMO(n) && iiiiiIIIiI2.iiiIiIiiIi()) {
            return 3 >> 1;
        }
        return false;
    }

    private /* synthetic */ boolean iIiIiIiIii(String string) {
        int n;
        char[] iIiIiIIIII2;
        iiiiiIIIiI iiiiiIIIiI2 = this;
        int n2 = 2 & 5;
        iIiIiIIIII2 = iIiIiIIIII2.toCharArray();
        int n3 = iIiIiIIIII2.length;
        int n4 = n = 5 >> 3;
        while (n4 < n3) {
            char c = iIiIiIIIII2[n];
            n2 += c;
            n4 = ++n;
        }
        if (n2 % (0x3B & 0x57) == 0) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ boolean IIiIiIiIiI(String string) {
        iiiiiIIIiI iiiiiIIIiI2 = string2;
        String string2 = string;
        iiiiiIIIiI iIiIiIIIII2 = iiiiiIIIiI2;
        if (string2.hashCode() % --3 == 0) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public boolean ALLATORIxDEMO(String string, String string2, String string3) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        Object iIiIiIIIII4 = this;
        if (((iiiiiIIIiI)iIiIiIIIII4).ALLATORIxDEMO((String)(this = string), (String)iIiIiIIIII3) && ((iiiiiIIIiI)iIiIiIIIII4).IIIIiIIiII((String)this) && ((iiiiiIIIiI)iIiIiIIIII4).iIiIiiiiii((String)iIiIiIIIII2) && ((iiiiiIIIiI)iIiIiIIIII4).iiiIiIiiIi((String)this)) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ String ALLATORIxDEMO(String string) {
        iiiiiIIIiI iiiiiIIIiI2 = string2;
        String string2 = string;
        iiiiiIIIiI iIiIiIIIII2 = iiiiiIIIiI2;
        return Base64.getEncoder().encodeToString(iIiIiIIIII2.ALLATORIxDEMO(string2, IIiIIIIIii.ALLATORIxDEMO(";\"\tgY")));
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        long l = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(0x7FD & 0x7FEB, 0x37 & 0x4E, --1);
        long l2 = calendar.getTimeInMillis();
        if (Math.abs(l - l2) < -1702967296L) {
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        Object object;
        iiiiiIIIiI iiiiiIIIiI2;
        block4: {
            iiiiiIIIiI2 = object;
            byte[] byArray = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getHardwareAddress();
            object = byArray;
            if (byArray != null) break block4;
            boolean bl = false;
            return bl;
        }
        try {
            int n;
            StringBuilder stringBuilder = new StringBuilder();
            int n2 = ((Object)object).length;
            int n3 = n = 5 >> 3;
            while (n3 < n2) {
                Object object2 = object[n];
                Object[] objectArray = new Object[--2];
                objectArray[3 ^ 3] = (byte)object2;
                objectArray[2 ^ 3] = "";
                stringBuilder.append(String.format(IiiiIIiiII.iiIIiIIiii("]\u0017BwW^"), objectArray));
                n3 = ++n;
            }
            object = stringBuilder.toString();
            String string = IIiIIIIIii.ALLATORIxDEMO("Zxx^\b*|+Yz{)");
            return iiiiiIIIiI2.iiiIiIiiIi((String)object, string);
        }
        catch (Exception exception) {
            return (3 & 4) != 0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiiiIIIiII(String string) {
        int n;
        void iIiIiIIIII2;
        iiiiiIIIiI iiiiiIIIiI2 = this;
        int n2 = 2 & 5;
        char[] cArray = iIiIiIIIII2.toCharArray();
        int n3 = cArray.length;
        int n4 = n = 3 ^ 3;
        while (n4 < n3) {
            char c = cArray[n];
            n2 += c;
            n4 = ++n;
        }
        if (n2 % (0x5F & 0x2D) == 0) {
            if (iIiIiIIIII2.length() > --5) {
                return 5 >> 2;
            }
        }
        return false;
    }

    static {
        int n;
        String[] stringArray = new String[0x1F & 0x66];
        stringArray[3 >> 2] = IiiiIIiiII.iiIIiIIiii("B\u001dH\u0016B\u0007N\u0016]F\u0005");
        stringArray[4 ^ 5] = IIiIIIIIii.ALLATORIxDEMO("\t)\u001c#\u001e\u000b<\u0003'\u00047)\u0007\u000e-");
        stringArray[--2] = IiiiIIiiII.iiIIiIIiii("\u0001X\u0016^\u000b_\u0006]F\u0012");
        stringArray[--3] = IIiIIIIIii.ALLATORIxDEMO("\"\u001f\u0003,");
        stringArray[--4] = IiiiIIiiII.iiIIiIIiii("C\u0015H\fM\u0010O\u001bSP\u000f");
        stringArray[--5] = IIiIIIIIii.ALLATORIxDEMO("\r2\u0018#\u001a\u000b<\u0003'\u00047.\t\u001e-");
        iIiIiIIIII = stringArray;
        ALLATORIxDEMO = new int[0x77 & 0x6C];
        int n2 = n = 5 >> 3;
        while (n2 < ALLATORIxDEMO.length) {
            int n3 = n++;
            iiiiiIIIiI.ALLATORIxDEMO[n3] = (n3 * (0x6D & 0x37) + (0x6D & 0x1F)) % (0x15C4 & 0x6B3B);
            n2 = n;
        }
    }

    private /* synthetic */ boolean IIIIiIIiII(String string) {
        iiiiiIIIiI iiiiiIIIiI2 = object;
        Object object = string;
        iiiiiIIIiI iIiIiIIIII2 = iiiiiIIIiI2;
        String string2 = IIiIIIIIii.ALLATORIxDEMO("\r2\u0018#\u001a\u000f7xXx][zyY");
        if (((String)(object = iIiIiIIIII2.iiiIiIiiIi((String)object + string2))).contains(IiiiIIiiII.iiIIiIIiii("J")) || ((String)object).contains(IIiIIIIIii.ALLATORIxDEMO("\n"))) {
            return true;
        }
        return false;
    }

    private /* synthetic */ boolean iiIIiIIiii(String string) {
        iiiiiIIIiI iiiiiIIIiI2 = object;
        Object object = string;
        iiiiiIIIiI iIiIiIIIII2 = iiiiiIIIiI2;
        if (((String)(object = "ACTIVATION_OK_" + iIiIiIIIII2.iiiIiIiiIi((String)object))).contains(IiiiIIiiII.iiIIiIIiii("\u001b@")) && !((String)object).contains(IIiIIIIIii.ALLATORIxDEMO("-8\u001a\u0005:"))) {
            return 3 >> 1;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(String string, String string2) {
        void iIiIiIIIII2;
        Object iIiIiIIIII3 = this;
        if (((iiiiiIIIiI)iIiIiIIIII3).iIiIiIiIii((String)(this = string)) && ((iiiiiIIIiI)iIiIiIIIII3).ALLATORIxDEMO((String)this) && iIiIiIIIII2.hashCode() % ((String)this).length() > 0) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ String ALLATORIxDEMO() {
        iiiiiIIIiI iiiiiIIIiI2;
        iiiiiIIIiI iiiiiIIIiI3 = iiiiiIIIiI2 = string3;
        String string = iiiiiIIIiI3.iiiIiIiiIi();
        String string2 = IiiiIIiiII.iiIIiIIiii("?s<i!h=y5g\u001a#A\u0011N\u0012D\u001c@\u001c");
        String string3 = IIiIIIIIii.ALLATORIxDEMO("\f#\u001b!\u0017#\f\u0015)\b+{ZY\u0010\u00132");
        return iiiiiIIIiI3.iiiIiIiiIi(string + string2 + (String)string3);
    }

    private /* synthetic */ boolean iiiIiIiiIi(String string) {
        iiiiiIIIiI iiiiiIIIiI2 = string2;
        String string2 = string;
        iiiiiIIIiI iIiIiIIIII2 = iiiiiIIIiI2;
        return new Random().nextBoolean();
    }

    private /* synthetic */ boolean ALLATORIxDEMO(String string) {
        String[] stringArray;
        block6: {
            block5: {
                iiiiiIIIiI iiiiiIIIiI2 = stringArray;
                stringArray = string;
                iiiiiIIIiI iIiIiIIIII2 = iiiiiIIIiI2;
                if (stringArray == null) break block5;
                if (stringArray.length() == (0x5F & 0x39)) break block6;
            }
            return false;
        }
        stringArray = stringArray.split(IiiiIIiiII.iiIIiIIiii("\u0000"));
        if (stringArray.length == --5) {
            if (stringArray[3 >> 2].length() == --5) {
                return 5 >> 2;
            }
        }
        return false;
    }
}

