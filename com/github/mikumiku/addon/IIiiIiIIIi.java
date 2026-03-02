/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIIIiiI;
import com.github.mikumiku.addon.IiIIiIiiiI;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class IIiiIiIIIi {
    private static /* synthetic */ byte[] iiiIiIiiIi(byte[] byArray, byte[] byArray2) throws Exception {
        Cipher cipher;
        Object iIiIiIIIII2 = byArray2;
        byte[] iIiIiIIIII3 = byArray;
        iIiIiIIIII2 = new SecretKeySpec((byte[])iIiIiIIIII2, IiIIiIiiiI.ALLATORIxDEMO("o\u001b]"));
        Cipher cipher2 = cipher = Cipher.getInstance(IIiiIIIiiI.ALLATORIxDEMO("{/iE_\tXej!Y\u0019\u000f:[\u000e^\u0003t-"));
        cipher2.init(3 & 5, (Key)iIiIiIIIII2);
        return cipher2.doFinal(iIiIiIIIII3);
    }

    private static /* synthetic */ boolean iiiiIIIiII(String iIiIiIIIII2) {
        if (iIiIiIIIII2 != null) {
            if (iIiIiIIIII2.length() > --3 && iIiIiIIIII2.matches(IiIIiIiiiI.ALLATORIxDEMO("\u0005OSt\u001f\u0003\u0004\u001es7!sU\n"))) {
                return 5 >> 2;
            }
        }
        return false;
    }

    private static /* synthetic */ boolean IIIIiIIiII(String string) {
        boolean bl;
        String string2 = string;
        try {
            Object iIiIiIIIII2;
            Object object = iIiIiIIIII2 = (HttpURLConnection)new URL(string2 + "?t=" + System.nanoTime()).openConnection();
            int n = 0xDFF & 0x73F4;
            ((URLConnection)iIiIiIIIII2).setConnectTimeout(n);
            ((URLConnection)object).setReadTimeout(n);
            ((HttpURLConnection)object).setRequestMethod(IiIIiIiiiI.ALLATORIxDEMO("i;z"));
            if (((HttpURLConnection)object).getResponseCode() == (0x27EA & 0x58DD)) {
                return --1 != 0;
            }
            bl = false;
        }
        catch (Exception exception) {
            return (2 ^ 3) != 0;
        }
        return bl;
    }

    public static boolean iiIIiIIiii(String string) {
        String string2 = string;
        byte[] byArray = IIiiIiIIIi.ALLATORIxDEMO();
        String string3 = IIiiIiIIIi.ALLATORIxDEMO();
        String iIiIiIIIII2 = IIiiIiIIIi.iiiIiIiiIi();
        if (!IIiiIiIIIi.iiiiIIIiII(string2)) {
            return 5 >> 3;
        }
        if (!IIiiIiIIIi.ALLATORIxDEMO()) {
            return 5 >> 3;
        }
        if (!IIiiIiIIIi.ALLATORIxDEMO(string2, byArray)) {
            return (3 ^ 3) != 0;
        }
        if (!IIiiIiIIIi.IIIIiIIiII(IIiiIIIiiI.ALLATORIxDEMO("z6c7d}3c|8)e\u0014\u001dU\u0018q/hdY\u0005weL\u000bV\u0003^\u000bn/"))) {
            return (2 & 5) != 0;
        }
        if (!IIiiIiIIIi.iiiIiIiiIi(string3)) {
            return (2 & 5) != 0;
        }
        if (!IIiiIiIIIi.ALLATORIxDEMO(iIiIiIIIII2)) {
            return (2 & 5) != 0;
        }
        return true;
    }

    private static /* synthetic */ byte[] ALLATORIxDEMO() {
        int n;
        byte[] byArray = new byte[0x19 & 0x76];
        int n2 = n = 5 >> 3;
        while (true) {
            if (n2 >= 16) break;
            int n3 = n++;
            byArray[n3] = (byte)(n3 * (0x3F & 0x5F) + (0x7D & 0x13) & (0x57FF & 0x28FF));
            n2 = n;
        }
        return byArray;
    }

    public static String iiiIiIiiIi(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 & 4, stackTraceElement.getMethodName()).toString();
        int n = 5 >> 1;
        int n2 = string2.length();
        int n3 = n2 - --1;
        char[] cArray = new char[n2];
        int n4 = --2 << --3 ^ 5 >> 1;
        int cfr_ignored_0 = 5 >> 1 << --3 ^ 3 & 5;
        int n5 = (--2 ^ --5) << --4 ^ (n << n ^ --3);
        int n6 = iIiIiIIIII2 = string3.length() - (2 ^ 3);
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

    private static /* synthetic */ boolean iiiIiIiiIi(String iIiIiIIIII2) {
        if (iIiIiIIIII2 != null && iIiIiIIIII2.length() > 0) {
            return (3 & 5) != 0;
        }
        return false;
    }

    private static /* synthetic */ String iiiIiIiiIi() {
        String string = System.getProperty(IIiiIIIiiI.ALLATORIxDEMO("\u0005IDT\u000bw/"));
        String string2 = System.getProperty(IiIIiIiiiI.ALLATORIxDEMO("[-k, \u0010O3k"));
        String string3 = System.getProperty(IIiiIIIiiI.ALLATORIxDEMO("\u0005ID[\u0018y\""));
        return Base64.getEncoder().encodeToString((string + string2 + string3).getBytes());
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(String iIiIiIIIII2) {
        if (iIiIiIIIII2 != null) {
            if (iIiIiIIIII2.length() > (0x4B & 0x3E)) {
                return (4 ^ 5) != 0;
            }
        }
        return false;
    }

    private static /* synthetic */ int ALLATORIxDEMO(int n) {
        int n2 = n;
        SecureRandom iIiIiIIIII2 = new SecureRandom();
        return n2 ^ iIiIiIIIII2.nextInt();
    }

    private static /* synthetic */ String ALLATORIxDEMO(String string) throws Exception {
        int iIiIiIIIII2;
        String string2 = string;
        byte[] byArray = string2.getBytes();
        int n = iIiIiIIIII2 = 3 >> 2;
        while (n < byArray.length) {
            int n2 = iIiIiIIIII2;
            byte by = (byte)(byArray[n2] ^ (byte)(iIiIiIIIII2 * (0x5F & 0x2D)));
            byArray[n2] = by;
            n = ++iIiIiIIIII2;
        }
        return Base64.getEncoder().encodeToString(byArray);
    }

    private static /* synthetic */ boolean ALLATORIxDEMO() {
        long l = System.currentTimeMillis();
        if ((l >> --4 ^ l << --2) > 0L) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    public IIiiIiIIIi() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiIiiiI.ALLATORIxDEMO(".B;o\rK^[\u000eJ?znz~\u8bf9\u66ad\u65b9\u526e\u670e\u65f3\u725b\u6725\uff58"));
        }
    }

    private static /* synthetic */ void ALLATORIxDEMO() {
        int n;
        int n2 = n = 3 >> 2;
        while (true) {
            if (n2 >= 10) break;
            if ((n << --3) % (5 >> 1) == 0) {
                System.out.print("");
            } else {
                System.err.print("");
            }
            n2 = ++n;
        }
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(String string, byte[] byArray) {
        Object iIiIiIIIII2 = byArray;
        String iIiIiIIIII3 = string;
        try {
            return new String(IIiiIiIIIi.ALLATORIxDEMO(Base64.getDecoder().decode(iIiIiIIIII3), (byte[])iIiIiIIIII2)).startsWith(IIiiIIIiiI.ALLATORIxDEMO("<{&S\u000e"));
        }
        catch (Exception exception) {
            return 3 >> 2;
        }
    }

    private static /* synthetic */ String ALLATORIxDEMO() {
        try {
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {
                int n;
                byte[] byArray = enumeration.nextElement().getHardwareAddress();
                if (byArray == null) continue;
                if (byArray.length != (0x36 & 0x4F)) continue;
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = byArray.length;
                int n3 = n = 5 >> 3;
                while (n3 < n2) {
                    byte by = byArray[n];
                    Object[] objectArray = new Object[--1];
                    objectArray[3 >> 2] = by;
                    stringBuilder.append(String.format(IIiiIIIiiI.ALLATORIxDEMO("\u001fZ(\u0012"), objectArray));
                    n3 = ++n;
                }
                return stringBuilder.toString();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return IiIIiIiiiI.ALLATORIxDEMO("v<i4e/f");
    }

    private static /* synthetic */ byte[] ALLATORIxDEMO(byte[] byArray, byte[] byArray2) throws Exception {
        Cipher cipher;
        Object iIiIiIIIII2 = byArray2;
        byte[] iIiIiIIIII3 = byArray;
        iIiIiIIIII2 = new SecretKeySpec((byte[])iIiIiIIIII2, IiIIiIiiiI.ALLATORIxDEMO("k={"));
        Cipher cipher2 = cipher = Cipher.getInstance(IIiiIIIiiI.ALLATORIxDEMO("{/iE_\tXej!Y\u0019\u000f:[\u000e^\u0003t-"));
        cipher2.init(--2, (Key)iIiIiIIIII2);
        return cipher2.doFinal(iIiIiIIIII3);
    }
}

