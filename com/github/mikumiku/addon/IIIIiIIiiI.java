/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.IIiiiIiIII;
import com.github.mikumiku.addon.IiIIiiiIiI;
import com.github.mikumiku.addon.IiiiIIiIII;
import com.github.mikumiku.addon.IiiiIIiiII;
import com.github.mikumiku.addon.IiiiiIiiIi;
import com.github.mikumiku.addon.iIIIIIIIii;
import com.github.mikumiku.addon.iIiIiIiiIi;
import com.github.mikumiku.addon.iiIIIIIIiI;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiiiIIIiI;
import com.github.mikumiku.addon.iiiiiIiiiI;
import com.google.gson.Gson;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIiIIiiI {
    private static final int iIiiiIiIii = 10;
    private static final String iIiIiiiiII = "p8164YglwPe4BISRy5hkDhBHt01DW27lb3VB/PEx/ZHkydlieJ5FGtp9JaP8+w2e";
    private String IIIIiiIiii;
    private long IiiIiIiiIi;
    public static ExecutorService IIiIiIIiii = Executors.newFixedThreadPool(0x5B & 0x2E);
    private String iIIiiIiIiI;
    private static final int iiiiiIIiIi = 30;
    private final HttpClient iIIiIiiiIi;
    private final HttpClient iIiIiIIIII;
    private static final Random ALLATORIxDEMO = new Random();

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ iiIiiIIIiI ALLATORIxDEMO(HttpResponse<String> httpResponse) {
        IIIIiIIiiI iIIIiIIiiI = object;
        try {
            void iIiIiIIIII22;
            void v0 = iIiIiIIIII22;
            int iIiIiIIIII22 = v0.statusCode();
            Object object = (String)v0.body();
            if (iIiIiIIIII22 != (0x4DDD & 0x32EA)) {
                return iiIiiIIIiI.ALLATORIxDEMO("HTTP\u9519\u8bef: " + iIiIiIIIII22);
            }
            if (object == null || ((String)object).trim().isEmpty()) {
                return iiIiiIIIiI.ALLATORIxDEMO(iiIIiiIIIi.ALLATORIxDEMO("\u6760\u529d\u5604\u8fe9\u56ba\u7a4f\u54ab\u5ea3"));
            }
            Object object2 = iIIIiIIiiI.ALLATORIxDEMO((String)object);
            if (object2 == null) {
                return iiIiiIIIiI.ALLATORIxDEMO(iiIiiIIIiI.ALLATORIxDEMO("\u65ae\u6cbd\u89ad\u67d8\u6763\u52e9\u5606\u54a5\u5eda"));
            }
            Object v = object2.get(iiIIiiIIIi.ALLATORIxDEMO("O\u0019^\u0007P\u0015D"));
            if (v instanceof Boolean && ((Boolean)v).booleanValue()) {
                return iiIiiIIIiI.ALLATORIxDEMO(iiIiiIIIiI.ALLATORIxDEMO("\u9ac4\u8baf\u6278\u52d1"), (String)object);
            }
            v = object2.get(iiIIiiIIIi.ALLATORIxDEMO("\u001fI\u0005A\u0013D"));
            if (iiIiiIIIiI.ALLATORIxDEMO("==\r+\u000b\u001b=").equals(v) || "ok".equals(v)) {
                return iiIiiIIIiI.ALLATORIxDEMO(iiIIiiIIIi.ALLATORIxDEMO("\u9ae8\u8bf4\u6276\u52a8"), (String)object);
            }
            object = (String)object2.get(iiIiiIIIiI.ALLATORIxDEMO("#-\u001d;\u000f\u000f+"));
            if (object == null) {
                object = (String)object2.get(iiIIiiIIIi.ALLATORIxDEMO("X\u0016G\tE"));
            }
            if (object == null) {
                object = iiIiiIIIiI.ALLATORIxDEMO("\u9ac4\u8baf\u5959\u8d6b");
            }
            return iiIiiIIIiI.ALLATORIxDEMO((String)object);
        }
        catch (Exception iIiIiIIIII22) {
            return iiIiiIIIiI.ALLATORIxDEMO("\u89e3\u6790\u54cd\u5e94\u5931\u8d25: " + iIiIiIIIII22.getMessage());
        }
    }

    private /* synthetic */ String iIiIiiiiii() {
        try {
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            return dimension.width + "x" + dimension.height;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(String string, String string2) {
        void iIiIiIIIII22;
        StringBuilder iIiIiIIIII3;
        IIIIiIIiiI iIIIiIIiiI = iterator;
        Iterator<Map.Entry<String, void>> iterator = new HashMap<String, void>();
        iterator.put(iiIIiiIIIi.ALLATORIxDEMO("^\u0003N"), iIiIiIIIII3);
        iterator.put(iiIiiIIIiI.ALLATORIxDEMO(" \u0019\u0001*"), iIiIiIIIII22);
        iterator.put(iiIIiiIIIi.ALLATORIxDEMO("t\u0004Q\tN\u0010T\u000bG"), String.valueOf(System.currentTimeMillis()));
        iterator.put(iiIiiIIIiI.ALLATORIxDEMO("8-\u001c;\u0007\u0007 "), iiIIiiIIIi.ALLATORIxDEMO("\fJ\u0005H\u0007"));
        iIiIiIIIII3 = new StringBuilder(iiIiiIIIiI.ALLATORIxDEMO("5"));
        int iIiIiIIIII22 = 3 >> 1;
        iterator = iterator.entrySet().iterator();
        Iterator<Map.Entry<String, void>> iterator2 = iterator;
        while (iterator2.hasNext()) {
            Map.Entry entry = iterator.next();
            if (iIiIiIIIII22 == 0) {
                iIiIiIIIII3.append(iiIIiiIIIi.ALLATORIxDEMO("\u001b"));
            }
            iIiIiIIIII3.append(iiIiiIIIiI.ALLATORIxDEMO("l")).append((String)entry.getKey()).append(iiIIiiIIIi.ALLATORIxDEMO("D\r")).append(iiIiiIIIiI.ALLATORIxDEMO("l")).append((String)entry.getValue()).append(iiIIiiIIIi.ALLATORIxDEMO("\u0015"));
            iIiIiIIIII22 = 3 & 4;
            iterator2 = iterator;
        }
        StringBuilder stringBuilder = iIiIiIIIII3;
        stringBuilder.append(iiIiiIIIiI.ALLATORIxDEMO("3"));
        return stringBuilder.toString();
    }

    public String iIiIiIiIii() {
        return this.IIIIiiIiii;
    }

    private /* synthetic */ Map<String, Object> ALLATORIxDEMO(String string) {
        IIIIiIIiiI iIIIiIIiiI = stringArray;
        String[] stringArray = string;
        IIIIiIIiiI iIiIiIIIII2 = iIIIiIIiiI;
        try {
            int n;
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            stringArray = stringArray.trim();
            if (!stringArray.startsWith(iiIIiiIIIi.ALLATORIxDEMO("L")) || !stringArray.endsWith(iiIiiIIIiI.ALLATORIxDEMO("3"))) {
                return null;
            }
            int n2 = --1;
            if ((stringArray = stringArray.substring(n2, stringArray.length() - n2).trim()).isEmpty()) {
                return hashMap;
            }
            stringArray = iIiIiIIIII2.iiiIiIiiIi((String)stringArray);
            int n3 = stringArray.length;
            int n4 = n = 2 & 5;
            while (n4 < n3) {
                Object object = stringArray[n];
                object = iIiIiIIIII2.ALLATORIxDEMO((String)object);
                if (((String[])object).length == (1 ^ 3)) {
                    IIIIiIIiiI iIIIiIIiiI2 = iIiIiIIIII2;
                    String string2 = iIIIiIIiiI2.iiiIiIiiIi(object[3 & 4]);
                    object = iIIIiIIiiI2.ALLATORIxDEMO(object[2 ^ 3]);
                    hashMap.put(string2, object);
                }
                n4 = ++n;
            }
            return hashMap;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static String IIiIiIiIiI() {
        Object object = System.getProperty(iiIiiIIIiI.ALLATORIxDEMO(";\u001b+:@&\u000f\u0005+"));
        Object object2 = System.getenv(iiIIiiIIIi.ALLATORIxDEMO("\u0003^-a\u0015E%c\u000eP-t"));
        Object object3 = System.getenv(iiIiiIIIiI.ALLATORIxDEMO("8\u001c'\r-\u001d;\u0001\u001a1!\n-\u0000\u001c'\u000e'-\u001c"));
        Object object4 = System.getProperty(iiIIiiIIIi.ALLATORIxDEMO("~\u0013\u001f!c\u0003Y"));
        Object object5 = System.getProperty(iiIiiIIIiI.ALLATORIxDEMO("\u0007=F8-\u001c;\u0007\u0007 "));
        Object object6 = System.getProperty(iiIIiiIIIi.ALLATORIxDEMO("D3t\u0012\u001f,p\u000eV5p\u0007T"));
        Object object7 = System.getenv(iiIiiIIIiI.ALLATORIxDEMO("\u001e:\u0001\u000b+;\u001d'\u001c\u0017\"\r8-\u0002"));
        Object object8 = System.getenv(iiIIiiIIIi.ALLATORIxDEMO("0c\u000fR%b\u0013^2n\u0012T6x\u0013X/\u007f"));
        Object object9 = System.getenv(iiIiiIIIiI.ALLATORIxDEMO("_{'\r-\u001d;\u0001:\u0011\t<+\u0006!\u001a\r-\u001c;:\u000b"));
        Object object10 = System.getenv(iiIIiiIIIi.ALLATORIxDEMO(".d-s\u0005C?~\u0006N0c\u000fR%b\u0013^2b"));
        object = IIIIiIIiiI.ALLATORIxDEMO((String)object);
        object2 = IIIIiIIiiI.ALLATORIxDEMO((String)object2);
        object3 = IIIIiIIiiI.ALLATORIxDEMO((String)object3);
        object4 = IIIIiIIiiI.ALLATORIxDEMO((String)object4);
        object5 = IIIIiIIiiI.ALLATORIxDEMO((String)object5);
        object6 = IIIIiIIiiI.ALLATORIxDEMO((String)object6);
        object7 = IIIIiIIiiI.ALLATORIxDEMO((String)object7);
        object8 = IIIIiIIiiI.ALLATORIxDEMO((String)object8);
        object9 = IIIIiIIiiI.ALLATORIxDEMO((String)object9);
        object10 = IIIIiIIiiI.ALLATORIxDEMO((String)object10);
        System.out.println("user.name: " + (String)object);
        System.out.println("COMPUTERNAME: " + (String)object2);
        System.out.println("PROCESSOR_IDENTIFIER: " + (String)object3);
        System.out.println("os.arch: " + (String)object4);
        System.out.println("os.version: " + (String)object5);
        System.out.println("user.language: " + (String)object6);
        System.out.println("PROCESSOR_LEVEL: " + (String)object7);
        System.out.println("PROCESSOR_REVISION: " + (String)object8);
        System.out.println("PROCESSOR_ARCHITECTURE: " + (String)object9);
        System.out.println("NUMBER_OF_PROCESSORS: " + (String)object10);
        object2 = (String)object + (String)object2 + (String)object3 + (String)object4 + (String)object5 + (String)object6 + (String)object7 + (String)object8 + (String)object3 + (String)object9 + (String)object10;
        System.out.println("\u62fc\u63a5\u540e\uff08\u672a\u7f16\u7801\uff09: " + (String)object2);
        object2 = Base64.getEncoder().encodeToString(((String)object2).getBytes(StandardCharsets.UTF_8));
        System.out.println("\u751f\u6210\u7684 HWID (Base64): " + (String)object2);
        return object2;
    }

    public static String iiiiIIIiII() {
        try {
            int n;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Runtime.getRuntime().availableProcessors());
            stringBuilder.append(System.getProperty(iiIiiIIIiI.ALLATORIxDEMO("!;@)\u001c\u000b&"), ""));
            String string = IIIIiIIiiI.iiIIiIIiii();
            if (string != null && !string.isEmpty()) {
                stringBuilder.append(string);
            }
            byte[] byArray = MessageDigest.getInstance(iiIIiiIIIi.ALLATORIxDEMO("b\bPM\u0003U\u0007")).digest(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
            StringBuilder stringBuilder2 = new StringBuilder();
            byte[] byArray2 = byArray;
            int n2 = byArray.length;
            int n3 = n = 3 & 4;
            while (n3 < n2) {
                byte by = byArray2[n];
                String string2 = Integer.toHexString(0xFF & Short.MAX_VALUE & by);
                if (string2.length() == 5 >> 2) {
                    stringBuilder2.append((char)(0x72 & 0x3D));
                }
                stringBuilder2.append(string2);
                n3 = ++n;
            }
            return stringBuilder2.toString().toUpperCase();
        }
        catch (Exception exception) {
            long l = Runtime.getRuntime().maxMemory();
            int n = Runtime.getRuntime().availableProcessors();
            return "HW_" + Long.toHexString(l + (long)n).toUpperCase();
        }
    }

    public String IIIIiIIiII() {
        return this.iIIiiIiIiI;
    }

    private static /* synthetic */ String iiIIiIIiii() {
        try {
            byte[] byArray;
            NetworkInterface networkInterface = NetworkInterface.getNetworkInterfaces().nextElement();
            if (networkInterface != null && (byArray = networkInterface.getHardwareAddress()) != null) {
                int n;
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = byArray.length;
                int n3 = n = 3 & 4;
                while (n3 < n2) {
                    byte by = byArray[n];
                    Object[] objectArray = new Object[5 >> 2];
                    objectArray[3 >> 2] = by;
                    stringBuilder.append(String.format(iiIiiIIIiI.ALLATORIxDEMO("m^Z\u0016"), objectArray));
                    n3 = ++n;
                }
                return stringBuilder.toString();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ String iiIIiIIiii(String var1_1) {
        var2_3 = this;
        try {
            iIiIiIIIII = Runtime.getRuntime().exec((String)iIiIiIIIII);
            var4_4 = new BufferedReader(new InputStreamReader(iIiIiIIIII.getInputStream()));
            var3_5 = new StringBuilder();
            block2: while (true) {
                v0 = var4_4;
                while ((this = v0.readLine()) != null) {
                    if (this.contains(iiIIiiIIIi.ALLATORIxDEMO(","))) {
                        var5_6 = this.split(iiIiiIIIiI.ALLATORIxDEMO("s"));
                        if (var5_6.length <= --1) continue block2;
                        if (var5_6[2 ^ 3].trim().isEmpty()) continue block2;
                        var3_5.append(var5_6[3 & 5].trim());
                        continue block2;
                    }
                    if (!this.trim().isEmpty()) ** break;
                    continue block2;
                    v0 = var4_4;
                    var3_5.append(this.trim());
                }
                break;
            }
            iIiIiIIIII.waitFor();
            return var3_5.toString();
        }
        catch (Exception iIiIiIIIII) {
            return null;
        }
    }

    private /* synthetic */ String iiiIiIiiIi() {
        IIIIiIIiiI iIIIiIIiiI = string;
        try {
            String string = System.getProperty(iiIiiIIIiI.ALLATORIxDEMO("!;@&\u000f\u0005+"), "").toLowerCase();
            if (string.contains(iiIIiiIIIi.ALLATORIxDEMO("f)\u007f\u0004^7b"))) {
                return iIIIiIIiiI.iiIIiIIiii(iiIiiIIIiI.ALLATORIxDEMO("^+\t+N9\u001c.\u00067\u0013/\u0001fZ'J?\u0006/\u001e1R/\u000b8\u001a#\u0003:O-jzDe\u0004 \u0017n\u001e \u0005zD\r=\r<\u0001/\u0004 =\u0003\n+\u001ang\u0018)\u0002\u001d+"));
            }
            if (string.contains(iiIIiiIIIi.ALLATORIxDEMO("}\t_5i"))) {
                return iIIIiIIiiI.iiIIiIIiii(iiIiiIIIiI.ALLATORIxDEMO("\"\n.\n!Cc\u001bo<Z`,nE!H8\t\"=\u000bHa\f+>A;\n\t\u007f"));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private /* synthetic */ String[] iiiIiIiiIi(String string) {
        IIIIiIIiiI iIIIiIIiiI = string2;
        String string2 = string;
        IIIIiIIiiI iIiIiIIIII2 = iIIIiIIiiI;
        return string2.split(iiIIiiIIIi.ALLATORIxDEMO("="));
    }

    private /* synthetic */ String ALLATORIxDEMO() {
        IIIIiIIiiI iIIIiIIiiI = string;
        try {
            String string = System.getProperty(iiIIiiIIIi.ALLATORIxDEMO("S\u001f\u0013\nT\u000bR"), "").toLowerCase();
            if (string.contains(iiIiiIIIiI.ALLATORIxDEMO("9!\u0000,\u0001\u001f="))) {
                return iIIIiIIiiI.iiIIiIIiii(iiIIiiIIIi.ALLATORIxDEMO("7|\tR@S!b%s\u000fP\u001a]ES\u0000@HJ\u0018^\u000fV\u0017D\u0015\\3e\u001f\u001cCK\u0005Y\u0013R"));
            }
            if (string.contains(iiIiiIIIiI.ALLATORIxDEMO("\u0002!\u0000\u001d6"))) {
                return iIIIiIIiiI.iiIIiIIiii(iiIIiiIIIi.ALLATORIxDEMO("Z\u001cXF\u0018\u001e^\u0003\u001e<a\u000eT\u0005S\u0001\u0018\u000fS"));
            }
            if (string.contains(iiIiiIIIiI.ALLATORIxDEMO("\u0003\t-"))) {
                return iIIIiIIiiI.iiIIiIIiii(iiIIiiIIIi.ALLATORIxDEMO("j4o9y+H7dh0\t]\u0005C@b0y!c\u0004F\u0001C%U!e\u0001e\u0011I\u0000\u0014\u0019\u0014\u000fK\u0018\\F\u00103K\u0012U&a\u001fYLh1|\"\u0010"));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private /* synthetic */ String[] ALLATORIxDEMO(String string) {
        IIIIiIIiiI iIIIiIIiiI = string2;
        String string2 = string;
        IIIIiIIiiI iIiIiIIIII2 = iIIIiIIiiI;
        int n = string2.indexOf(0x3E & 0x7B);
        if (n == -4 >> 2) {
            String[] stringArray = new String[3 >> 1];
            stringArray[3 & 4] = string2;
            return stringArray;
        }
        String[] stringArray = new String[2];
        int n2 = 2 & 5;
        stringArray[n2] = string2.substring(n2, n).trim();
        int n3 = 2 ^ 3;
        stringArray[n3] = string2.substring(n + n3).trim();
        return stringArray;
    }

    private /* synthetic */ Object ALLATORIxDEMO(String string) {
        IIIIiIIiiI iIIIiIIiiI = object;
        Object object = string;
        IIIIiIIiiI iIiIiIIIII2 = iIIIiIIiiI;
        if ("null".equals(object = ((String)object).trim())) {
            return null;
        }
        if (iiIiiIIIiI.ALLATORIxDEMO("<\u001c\u001d+").equals(object)) {
            return --1 != 0;
        }
        if ("false".equals(object)) {
            return 3 >> 2;
        }
        if (((String)object).startsWith(iiIIiiIIIi.ALLATORIxDEMO("\u0015")) && ((String)object).endsWith(iiIiiIIIiI.ALLATORIxDEMO("l"))) {
            Object object2 = object;
            return ((String)object2).substring(4 ^ 5, ((String)object2).length() - (3 >> 1));
        }
        try {
            if (((String)object).contains(iiIIiiIIIi.ALLATORIxDEMO("\u0019"))) {
                return Double.parseDouble((String)object);
            }
            return Long.parseLong((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            return object;
        }
    }

    /*
     * WARNING - void declaration
     */
    public iiIiiIIIiI iiIIiIIiii(String string) {
        IIIIiIIiiI iIIIiIIiiI = string2;
        try {
            void iIiIiIIIII2;
            String string2 = IIIIiIIiiI.iiiiIIIiII();
            if (IiiiIIiiII.iiiIiIiiIi(IiiiIIiiII.iiIIiIIiii(string2, iiIIiiIIIi.ALLATORIxDEMO("|$$"))).equals(iIiIiIIIII2)) {
                return new iiIiiIIIiI(--1 != 0, iiIiiIIIiI.ALLATORIxDEMO("\u9ac4\u8baf\u5959\u8d6b"), null);
            }
            return new iiIiiIIIiI((3 ^ 3) != 0, iiIIiiIIIi.ALLATORIxDEMO("\u9acc\u8bd0\u5971\u8d34"), null);
        }
        catch (Exception exception) {
            return iiIiiIIIiI.ALLATORIxDEMO("\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: " + exception.getMessage());
        }
    }

    private /* synthetic */ String iiiIiIiiIi(String string) {
        IIIIiIIiiI iIIIiIIiiI = object;
        Object object = string;
        IIIIiIIiiI iIiIiIIIII2 = iIIIiIIiiI;
        if (((String)(object = ((String)object).trim())).startsWith(iiIiiIIIiI.ALLATORIxDEMO("l")) && ((String)object).endsWith(iiIIiiIIIi.ALLATORIxDEMO("3"))) {
            Object object2 = object;
            return ((String)object2).substring(5 >> 2, ((String)object2).length() - (2 ^ 3));
        }
        return object;
    }

    private static /* synthetic */ String ALLATORIxDEMO(String iIiIiIIIII2) {
        if (iIiIiIIIII2 == null) {
            return "";
        }
        return iIiIiIIIII2;
    }

    public static void ALLATORIxDEMO() {
        int n;
        HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
        int n2 = n = 2 & 5;
        while (true) {
            if (n2 >= 4) break;
            IIiIiIIiii.submit(() -> {
                HttpClient httpClient2 = httpClient;
                try {
                    String string = "" + Math.abs(ALLATORIxDEMO.nextInt());
                    long l = System.currentTimeMillis();
                    Object iIiIiIIIII2 = IiiiIIiiII.ALLATORIxDEMO(String.valueOf(ALLATORIxDEMO.nextInt()));
                    String string2 = string;
                    iIiIiIIIII2 = "{\"qq_number\":\"" + string2 + "\",\"hwid\":\"" + IiiiIIiiII.ALLATORIxDEMO(string2) + "\",\"v\":\"8.0\",\"rsa_public_key\":\"" + (String)iIiIiIIIII2 + "\",\"timestamp\":\"" + l + "\"}";
                    String string3 = String.valueOf(System.currentTimeMillis() / 100000L);
                    iIiIiIIIII2 = IiiiIIiiII.iiIIiIIiii((String)iIiIiIIIII2, string3);
                    iIiIiIIIII2 = HttpRequest.newBuilder().uri(URI.create(IiiiIIiiII.iiiIiIiiIi(iiIiiIIIiI.ALLATORIxDEMO("\u0017,-\u0018f\u0001p! \u001dz1=s\b\u0018g\u0005\u0000$\u00127c\u0003;\u001c\f:\u0004\u0003~l\u0001/<\u0004\u001c$x\u0003\n\\?P,{'\u000f\u0012\"\u0006\n\u0000\u000f\u0000\u007f:\u001e0\u0000\u001e\u0016\u0002\u001a"), iiIIiiIIIi.ALLATORIxDEMO("X\u0002\u0002")))).timeout(Duration.ofSeconds(10L)).header(iiIiiIIIiI.ALLATORIxDEMO("\u000b\u0001\u0006:\r <C\u001c\u0017\u0018+"), iiIIiiIIIi.ALLATORIxDEMO("\u0007G\u000bF\tR0t\u0004S\u0002\u0012\u000eF\tY")).POST(HttpRequest.BodyPublishers.ofString((String)iIiIiIIIII2)).build();
                    httpClient2.sendAsync((HttpRequest)iIiIiIIIII2, HttpResponse.BodyHandlers.discarding()).whenComplete((httpResponse, throwable) -> {
                        Throwable iIiIiIIIII2 = throwable;
                        HttpResponse iIiIiIIIII3 = httpResponse;
                        if (iIiIiIIIII2 != null) {
                            // empty if block
                        }
                    });
                    Thread.sleep((0x7C & 0x67) + ALLATORIxDEMO.nextInt(0x31B9 & 0x4FD6));
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            });
            n2 = ++n;
        }
    }

    public long ALLATORIxDEMO() {
        return this.IiiIiIiiIi;
    }

    public iiIiiIIIiI iiiIiIiiIi(String string) {
        IIIIiIIiiI iIIIiIIiiI = object;
        try {
            Object iIiIiIIIII2;
            IIIIiIIiiI.ALLATORIxDEMO();
            String string2 = IIIIiIIiiI.IIiIiIiIiI();
            string2 = IiiiIIiiII.ALLATORIxDEMO(IiiiIIiiII.iiIIiIIiii(string2, iiIiiIIIiI.ALLATORIxDEMO("\u0003\f{")));
            Object object = iiIIiiIIIi.ALLATORIxDEMO("d\"uu3\u0014z\u0005H\u0013T\u0003C%e+T\u0019B%r2t\u0014z%h3t#c\u0005E\u000bt\u0019B%r2t\u0014z%h");
            if (string2.equals(object)) {
                return new iiIiiIIIiI(5 >> 3, iiIiiIIIiI.ALLATORIxDEMO("\u9ac4\u8baf\u5959\u8d6b"), null);
            }
            object = IiiiIIiiII.iiiIiIiiIi(String.valueOf(new Random().nextInt()));
            long l = IiIIiiiIiI.ALLATORIxDEMO();
            iIiIiIIIII2 = "{\"qq_number\":\"" + (String)iIiIiIIIII2 + "\",\"hwid\":\"" + string2 + "\",\"v\":\"8.0\",\"rsa_public_key\":\"" + (String)object + "\",\"timestamp\":\"" + l + "\"}";
            Object object2 = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
            String string3 = String.valueOf(l / 100000L);
            iIiIiIIIII2 = IiiiIIiiII.iiIIiIIiii((String)iIiIiIIIII2, string3);
            iIiIiIIIII2 = HttpRequest.newBuilder().uri(URI.create(IiiiIIiiII.iiiIiIiiIi(iiIIiiIIIi.ALLATORIxDEMO("\rA!csc{](b>\u0002zC\tnbw\f_\u0001S(?\u0013C&g0@\u0011t\u0001X\u0019V9vvz\u0005$PH\u0004$\u000fP:}\u000eu\bp\b\u0000\u0012A8\u007f6I*E"), iiIiiIIIiI.ALLATORIxDEMO("\u0003\f{")))).timeout(Duration.ofSeconds(10L)).header(iiIIiiIIIi.ALLATORIxDEMO("\u0003~\u000eE%\u007f4<4H0t"), iiIiiIIIiI.ALLATORIxDEMO("\t>\u0018\"!\r\t:\u0001!&A\"\u001d\u0007 ")).POST(HttpRequest.BodyPublishers.ofString((String)iIiIiIIIII2)).build();
            iIiIiIIIII2 = ((HttpClient)object2).send((HttpRequest)iIiIiIIIII2, HttpResponse.BodyHandlers.ofString());
            System.out.println("\u54cd\u5e94\u7801: " + iIiIiIIIII2.statusCode());
            iIiIiIIIII2 = iIiIiIIIII2.body();
            System.out.println("\u54cd\u5e94\u5185\u5bb9: " + (String)iIiIiIIIII2);
            iIiIiIIIII2 = IiiiIIiiII.iiiIiIiiIi((String)iIiIiIIIII2, (String)object);
            iiIIiiIIIi.ALLATORIxDEMO("nJ1b1/xd5-j>>w<2e2s+\\@\u0011B\\\u0005B\u0013P'tB\u000b@\u0013/zb=j\u0011`3$p4pB\u000b`jj\u0011`1`3\u0014^+t$9|7fah=+qb=W,a0|/(ui0-rb+bhV-d5`1b1=}n\t>|?o$s(5}6%gN\u0001B\u001dj\u0011@\u0011`1@\u0013\u0013T2g%c?E)|%3z1Q\u0006s$U\u0004u$u$U\u0004u=@;f7d5't(z!e(~$c\u0003h%{e:!qb+bH~k!t4d0vm/+vj\u007f(}9i4ru4Zzj\u0011@\u0011@\u0011@\u0013-p\u0018n\u0003^.\u007f%r\u0014X/\u007f33z1Q\u0001J1@\u0011`lJ1@LJl");
            object = new Gson();
            object2 = new IiiiIIiIII(iIIIiIIiiI).getType();
            object = (Map)object.fromJson((String)iIiIiIIIII2, (Type)object2);
            boolean bl = (Boolean)object.get(iiIiiIIIiI.ALLATORIxDEMO("==\r+\u000b\u001b="));
            String string4 = (String)object.get(iiIIiiIIIi.ALLATORIxDEMO("|%b\u0013P't"));
            object = (Map)object.get(iiIiiIIIiI.ALLATORIxDEMO(",\u000f\u001c/"));
            String cfr_ignored_0 = (String)object.get(iiIIiiIIIi.ALLATORIxDEMO("e\u000fZ%\u007f"));
            object = (Map)object.get("config");
            IIiiiIiIII.iIIiIiiiIi = (String)object.get(iiIiiIIIiI.ALLATORIxDEMO("\u000f\u0018'78-\u001c;\u0007\u0007 "));
            Double.valueOf(((Number)object.get(iiIIiiIIIi.ALLATORIxDEMO("Y)e"))).doubleValue());
            List cfr_ignored_1 = (List)object.get(iiIiiIIIiI.ALLATORIxDEMO("\u000e+\t:=\u001c\r=7+&\u000f*\u0002\r*"));
            ((Number)object.get(iiIIiiIIIi.ALLATORIxDEMO("|\u0001I\u001fr\u000f_.t#e\t^.b"))).intValue();
            return new iiIiiIIIiI(bl, string4, (String)iIiIiIIIII2);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception2.printStackTrace();
            return iiIiiIIIiI.ALLATORIxDEMO("\u8bf7\u8054\u7cfb\u7ba1\u7406" + exception2.getMessage());
        }
    }

    public IIIIiIIiiI() {
        IIIIiIIiiI iIIIiIIiiI = this;
        this.iIiIiIIIII = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
        iIIIiIIiiI.iIIiIiiiIi = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build();
        iIIIiIIiiI.IiiIiIiiIi = 0L;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIiiIIIiI.ALLATORIxDEMO("\u001f\u0005jH\u001b+H;\u0018*\t:-OH\u8bb9\u669c\u65fe\u5278\u676e\u65f8\u7226\u6744\uff4f"));
        }
    }

    public iiIiiIIIiI ALLATORIxDEMO(String string) {
        IIIIiIIiiI iIIIiIIiiI = string2;
        String string2 = string;
        IIIIiIIiiI iIiIiIIIII2 = iIIIiIIiiI;
        try {
            String string3 = IIIIiIIiiI.iiiiIIIiII();
            Object object = new iIiIiIiiIi();
            Object object2 = new IiiiiIiiIi();
            if (IiiiIIiiII.ALLATORIxDEMO(string2) == "fb3abe990957f7f983624e3c01e32b019") {
                ((iIiIiIiiIi)object).IIiIiIiiii(iiIIiiIIIi.ALLATORIxDEMO("=S\u001fN\u0013Z\u0014S"));
                ((IiiiiIiiIi)object2).iiiIiIiiIi(string2);
                ((IiiiiIiiIi)object2).ALLATORIxDEMO();
            }
            if (IiiiIIiiII.ALLATORIxDEMO(string2) == "a926be3b7af6b765ab60fb3abe990957f7f9") {
                ((iIiIiIiiIi)object).iiiiIIIiII(string3, string2);
            }
            if (IiiiIIiiII.ALLATORIxDEMO(string2) == "b7af6b765ab60fb3abe990957f7f9") {
                object = new iiiiiIiiiI(string2);
                ((iiiiiIiiiI)object).ALLATORIxDEMO(string3, string2, UUID.randomUUID());
            }
            IIIIiIIiiI iIIIiIIiiI2 = iIiIiIIIII2;
            iIiIiIIIII2.iIIiiIiIiI = string3;
            object = iIiIiIIIII2.ALLATORIxDEMO(string2, string3);
            object2 = IiiiIIiiII.iiiIiIiiIi(iIiIiiiiII, iiIiiIIIiI.ALLATORIxDEMO(".\u000f\u0003+8/;\u001d?\u0001\u001a*"));
            object = HttpRequest.newBuilder().uri(URI.create((String)object2)).header(iiIIiiIIIi.ALLATORIxDEMO("#^?t\bR\u0018\u00100L\u0016R"), iiIiiIIIiI.ALLATORIxDEMO("\t>\u0018\"!\r\t:\u0001!&A\"\u001d\u0007 ")).header(iiIIiiIIIi.ALLATORIxDEMO("\u0004s\bNA|\u0003P\bC"), iiIiiIIIiI.ALLATORIxDEMO(");\u001c!'>-\u00008\"\u001d)!\u0000g_F~")).header(iiIIiiIIIi.ALLATORIxDEMO("-^\u0007P\u0016C"), iiIiiIIIiI.ALLATORIxDEMO("\t>\u0018\"!\r\t:\u0001!&A\"\u001d\u0007 ")).POST(HttpRequest.BodyPublishers.ofString((String)object, StandardCharsets.UTF_8)).timeout(Duration.ofSeconds(30L)).build();
            if (((iiIiiIIIiI)(object = iIIIiIIiiI2.ALLATORIxDEMO(iIIIiIIiiI2.iIIiIiiiIi.send((HttpRequest)object, HttpResponse.BodyHandlers.ofString())))).ALLATORIxDEMO()) {
                IIIIiIIiiI iIIIiIIiiI3 = iIiIiIIIII2;
                iIIIiIIiiI3.IiiIiIiiIi = System.currentTimeMillis();
                iIIIiIIiiI3.IIIIiiIiii = ((iiIiiIIIiI)object).ALLATORIxDEMO();
            }
            if (IiiiIIiiII.ALLATORIxDEMO(string2) == "b7af6b765ab60fb3abe990957f7f9") {
                object2 = new iiiiiIIIiI();
                ((iiiiiIIIiI)object2).iiiIiIiiIi(string3, string2, UUID.randomUUID().toString());
                ((iiiiiIIIiI)object2).ALLATORIxDEMO(string3, string2, UUID.randomUUID().toString());
            }
            if (IiiiIIiiII.ALLATORIxDEMO(string2) == "b7af6b765ab60fb3abe990957f7f9" && !((iiIIIIIIiI)(object2 = new iiIIIIIIiI())).IIIIiIIiII(string2)) {
                System.exit(--1);
            }
            if (IiiiIIiiII.ALLATORIxDEMO(string2) == "b7af6b765ab60fb3abe990957f7f9") {
                object2 = new iiIIIIIIiI();
                String string4 = string2;
                IIiiIiIIIi.iiIIiIIiii(string2);
                ((iiIIIIIIiI)object2).IIIIiIIiII(string4);
                if (!IIiiIiIIIi.iiIIiIIiii(string4)) {
                    System.exit(5 >> 2);
                }
            }
            if (IiiiIIiiII.ALLATORIxDEMO(string2) == "fac6bd70d11a926be3b7af6b765ab60fb3abe990957f7f983624e3c01e32b019") {
                object2 = new iIiIiIiiIi();
                IIiiIiIIIi.iiIIiIIiii(string2);
                ((iIiIiIiiIi)object2).iiiiIIIiII(string2, string3);
                String[] stringArray = new String[4 ^ 5];
                stringArray[5 >> 3] = string2;
                iIIIIIIIii.ALLATORIxDEMO(stringArray);
            }
            return object;
        }
        catch (Exception exception) {
            return iiIiiIIIiI.ALLATORIxDEMO("\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: " + exception.getMessage());
        }
    }
}

