/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIiIiII;
import com.google.gson.Gson;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class IiiiIIiiII {
    private static /* synthetic */ IvParameterSpec ALLATORIxDEMO(byte[] byArray) {
        byte[] byArray2 = byArray;
        byte[] iIiIiIIIII2 = Arrays.copyOfRange(byArray2, 5 >> 3, 0x31 & 0x5E);
        return new IvParameterSpec(iIiIiIIIII2);
    }

    private static /* synthetic */ String ALLATORIxDEMO(byte[] byArray) {
        int iIiIiIIIII2;
        byte[] byArray2 = byArray;
        StringBuilder stringBuilder = new StringBuilder();
        byte[] byArray3 = byArray2;
        int n = byArray2.length;
        int n2 = iIiIiIIIII2 = 5 >> 3;
        while (n2 < n) {
            String string = Integer.toHexString(byArray3[iIiIiIIIII2] & (0x2FFF & 0x50FF) | 0x7D27 & 0x3D8);
            stringBuilder.append(string.substring(4 ^ 5));
            n2 = ++iIiIiIIIII2;
        }
        return stringBuilder.toString();
    }

    public static String iiIIiIIiii(String string, String string2) throws Exception {
        Cipher cipher;
        Object iIiIiIIIII2 = string2;
        String iIiIiIIIII3 = string;
        iIiIiIIIII2 = IiiiIIiiII.ALLATORIxDEMO((String)iIiIiIIIII2);
        IvParameterSpec ivParameterSpec = IiiiIIiiII.ALLATORIxDEMO(((SecretKeySpec)iIiIiIIIII2).getEncoded());
        Cipher cipher2 = cipher = Cipher.getInstance(IiiiIIiiII.iiIIiIIiii("\u0015N\u0007$7i7\u0004\u0004@7xA{5o0b:l"));
        cipher2.init(2 ^ 3, (Key)iIiIiIIIII2, ivParameterSpec);
        iIiIiIIIII2 = cipher2.doFinal(iIiIiIIIII3.getBytes(IiIiIiIiII.iiiIiIiiIi("\"M\u00114o")));
        return Base64.getEncoder().encodeToString((byte[])iIiIiIIIII2);
    }

    public static String iiIIiIIiii(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 >> 1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = 3 >> 1;
        int n2 = string2.length();
        int n3 = n2 - (5 >> 2);
        char[] cArray = new char[n2];
        int n4 = (5 >> 1 ^ --5) << --3 ^ --5;
        int cfr_ignored_0 = (--3 ^ --5) << --4 ^ (--3 << (1 ^ 3) ^ --3);
        int n5 = (--3 ^ --5) << --4 ^ n << n;
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

    public static void main(String[] stringArray) throws Exception {
        String[] stringArray2 = stringArray;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIIiiII.iiIIiIIiii("\u0004g1j\u0007NT^$o5\u007f\u0011\nT\u8bdc\u66a4\u65bf\u526c\u6703\u65e4\u7243\u677f\uff0d"));
        }
        System.out.println(IiIiIiIiII.iiiIiIiiIi("z\u0010^\u001cR\u001eP]\u0013\u0014Z\u001aT\u0007I\u001bU\u0006H\u0011_]\u0013\u001eP\u001aT\u0018V\u0006H\u001eP\u001aT\u0018V\u0006H]\u0013\u0012\\\u0017p\u0017Z\u001fQ\u001eP^\u00109w\u0019W\u0019W\u0019W9w9w\u0019W\u0019W9w9w\u001dS\u0011_\u0019W\u001eP\u0013]\u001fQ\u001dS]:\u0014Y\u0019W\u0004J\u0018U\u0006K\u0011\\^\u0010\u001eS\u0019W\u001bV\u0006K\u001eP\u001aW\u0018V\u0006K]\u0013\u0011_\u0017Y\u0017Z\u001fQ\u001eP]::w\u0019W\u0019W\u001aW:w:w\u0019W\u001aW9w:w\u001eS\u0011\\\u0019W\u001dP\u0010]\u001cQ\u001eS^\u0013\u0017Y\u0019W\u0004J\u001b|\u0006K\u0012\\^\u0010\u001eP\u001aW\u0018U\u0005K\u001eS\u0019W\u0018V\u0006K^\u0013\u0011_\u0017Z\u0017Z\u001cR\u001eP^\u00139w\u0019W\u0019W\u001a}:w9w\u0019W\u001aW:w:t\u001eS\u0012\\\u001aW\u001dP\u0010]\u001fR\u001dS]\u0013\u0014Y\u001aW\u0007J\u001bU\u0006K\u0012\\^\u0010\u001ey\u001aW\u001bU\u0005K\u001dS\u0019W\u001bU\u0005K^\u0010\u0011_\u0014Z\u0014Z\u001fQ\u001eP^\u00109w\u0019W\u0019W\u0019W9w9w\u0019W\u001a}:wI%R\u0007T\u001cM\u001eP\u0017\u00137^\u0007\\S\u001f@G\u0015P\u0014E\u001eQ\u0019K\u0018\u0012\u000f\u0017^^\u0016\u0019E\u000bE\u0013K\u001ey\u001aW\u001bU\u0005K^\u0010\u0011_\u0014Z\u0014Z\u001fQ\u001eP^\u00109w\u0019W\u0019W\u0019W9w9w\u0019W\u0019W9w9w\u001dS\u0012u\u001aW\u001eP\u0013]\u001f0Q\u001f\u001fDX\u000bPWk\b^\u0003V\bS\b\u0011B\u001d\u0005\u0000Y\u000eUa.p<\u0019W\u001bU\u0005K]:\u0012_\u0014Z\u0014Z\u001fQ\u001eP^\u00109w\u0019W\u0019W\u0019W9w9w\u0019W\u0019W9w9w\u001dS\u0011_\u0019W\u001eP\u0013]\u001c{\u001eS^\u0010\u0017Y\u0019W\u0004J\u0018V\u0005K\u00128;}rSo2i&l$sR\u0019W\u001bU\u0005K^\u0010\u0011_\u0014Z\u0014Z\u001c{\u001dP^\u00109w\u0019W\u0019W\u0019W9w9w\u0019W\u0019W9w9w\u001dS\u0011_\u0019W\u001eP\u0013]\u001fQ\u001dS^\u0010\u0017Y\u001a}\u0007J\u0018V\u0005K\u0012\\^\u0010s<mW}:wK~<t:~'f\"?|\u0011*g?\u0015Z\u001fQ\u001eP^\u00109w\u001a}\u001aW\u0019W9w9w\u0019W\u0019W9w9w\u001dS\u0011_\u0019W\u001eP\u0013]\u001fQ\u001dS^\u0010\u0017Y\u0019W\u0004J\u0018V\u0005K\u0011v]\u0010\u001dS\u0019W\u001bU\u0005K\u001d\u001bM\u0003K\u0006\u001fDQQ]\u0013U\u000e[\bV_]\u001f\u0013\u00109w\u0019W\u0019W\u0019W9w:]\u001aW\u0019W9w9w\u001dS\u0011_\u0019W\u001eP\u0013]\u001fQ\u001dS^\u0010\u0017Y\u0019W\u0004J\u0018V\u0005K\u0012\\^\u0010\u001dS\u0019W\u0018\u007f\u0006H\u001eP\u001aT\u0018V\u0006H]\u0013\u0012\\\u0017Y\u0017Y\u001cR\u001dS]\u0013:t\u001aT\u001aT\u001aT:t:t\u001aT\u001aT:t:]"));
        Object iIiIiIIIII2 = IiiiIIiiII.iiIIiIIiii("\u0012J\u001fN\u0000n/p#d!h");
        String string = IiIiIiIiII.iiiIiIiiIi("S\u0001Q\u001b\r\n\u001ePY\u0019\u0019\u001bJ\u0005Q]\u0011@|9\u0014\u0016L\u0003QYn8k<\\\u0005JY}2ox");
        String string2 = IiiiIIiiII.iiIIiIIiii(string, (String)iIiIiIIIII2);
        System.out.println("Encrypted: " + string2);
        iIiIiIIIII2 = IiiiIIiiII.iiiIiIiiIi(string2, (String)iIiIiIIIII2);
        System.out.println("Decrypted: " + (String)iIiIiIIIII2);
        iIiIiIIIII2 = string;
        string = IiiiIIiiII.iiiIiIiiIi((String)iIiIiIIIII2);
        System.out.println("SHA-256 digest: " + string);
        string = IiiiIIiiII.ALLATORIxDEMO((String)iIiIiIIIII2);
        System.out.println("SHA-256 digest (hex): " + string);
    }

    public static String iiiIiIiiIi(String string) throws Exception {
        String string2 = string;
        Object iIiIiIIIII2 = MessageDigest.getInstance(IiiiIIiiII.iiIIiIIiii("X\u001cJY\u0019a=")).digest(string2.getBytes(IiIiIiIiII.iiiIiIiiIi("\"M\u00114o")));
        return Base64.getEncoder().encodeToString((byte[])iIiIiIIIII2);
    }

    public static String iiiIiIiiIi(String string, String string2) throws Exception {
        Object iIiIiIIIII2 = string2;
        String iIiIiIIIII3 = string;
        iIiIiIIIII2 = IiiiIIiiII.ALLATORIxDEMO((String)iIiIiIIIII2);
        IvParameterSpec ivParameterSpec = IiiiIIiiII.ALLATORIxDEMO(((SecretKeySpec)iIiIiIIIII2).getEncoded());
        Cipher cipher = Cipher.getInstance(IiiiIIiiII.iiIIiIIiii("\u0015N\u0007$\u0017I7\u0004\u0004@7xa[5o\u0010B:l"));
        cipher.init(5 >> 1, (Key)iIiIiIIIII2, ivParameterSpec);
        iIiIiIIIII2 = cipher.doFinal(Base64.getDecoder().decode(iIiIiIIIII3));
        return new String((byte[])iIiIiIIIII2, IiIiIiIiII.iiiIiIiiIi("\"M\u00114o"));
    }

    public static String ALLATORIxDEMO(String string) {
        String string2 = string;
        byte[] byArray = null;
        try {
            MessageDigest iIiIiIIIII2 = MessageDigest.getInstance(IiiiIIiiII.iiIIiIIiii("u0f]\u001dG\u001b"));
            byArray = iIiIiIIIII2.digest(string2.getBytes(IiIiIiIiII.iiiIiIiiIi("\"M\u00114o")));
        }
        catch (NoSuchAlgorithmException iIiIiIIIII2) {
            throw new RuntimeException(iIiIiIIIII2);
        }
        catch (UnsupportedEncodingException iIiIiIIIII2) {
            throw new RuntimeException(iIiIiIIIII2);
        }
        return IiiiIIiiII.ALLATORIxDEMO(byArray);
    }

    private static /* synthetic */ SecretKeySpec ALLATORIxDEMO(String string) throws Exception {
        String string2 = string;
        Object iIiIiIIIII2 = MessageDigest.getInstance(IiIiIiIiII.iiiIiIiiIi("$q64e,a")).digest(string2.getBytes(IiiiIIiiII.iiIIiIIiii("r$i_\u0015")));
        return new SecretKeySpec((byte[])iIiIiIIIII2, IiIiIiIiII.iiiIiIiiIi("\u0016\\\u0004"));
    }

    public static String ALLATORIxDEMO(String string, String string2) throws Exception {
        String iIiIiIIIII2;
        String string3 = string;
        Object iIiIiIIIII3 = new HashMap<String, String>();
        iIiIiIIIII3.put(IiiiIIiiII.iiIIiIIiii("G\u001bD\u001fZ\u001cY"), string3);
        iIiIiIIIII3.put(IiIiIiIiII.iiiIiIiiIi("I\u0016J\u0004n8k3"), iIiIiIIIII2);
        iIiIiIIIII2 = new Gson().toJson(iIiIiIIIII3);
        iIiIiIIIII3 = String.valueOf(System.currentTimeMillis() / 1000L / 10L);
        return IiiiIIiiII.iiIIiIIiii(iIiIiIIIII2, (String)iIiIiIIIII3);
    }

    public IiiiIIiiII() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIIiiII.iiIIiIIiii("$G\u0011J'nt~\u0004O\u0015_d\u007ft\u8bfc\u66a7\u65bc\u5264\u670b\u65f9\u725e\u672f\uff5d"));
        }
    }
}

