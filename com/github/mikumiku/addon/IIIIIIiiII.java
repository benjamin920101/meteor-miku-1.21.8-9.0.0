/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIiIiiiI;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class IIIIIIiiII {
    private static final String iIIiIiiiIi = "user.dat";
    private static final String iIiIiIIIII = "MySecretKey12345";
    private static final String ALLATORIxDEMO = "config";

    public IIIIIIiiII() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIiiiIIi.ALLATORIxDEMO("$DQ\t jsz#k2{6.s\u8bf8\u6687\u659f\u5243\u672f\u65e3\u7247\u677f\uff0e"));
        }
    }

    public static JsonObject ALLATORIxDEMO() {
        try {
            File file = new File(ALLATORIxDEMO, iIIiIiiiIi);
            if (!file.exists()) {
                return null;
            }
            String[] stringArray = new String[2 ^ 3];
            stringArray[3 ^ 3] = iIIiIiiiIi;
            String string = IIIIIIiiII.ALLATORIxDEMO(new String(Files.readAllBytes(Paths.get(ALLATORIxDEMO, stringArray))));
            return (JsonObject)new Gson().fromJson(string, JsonObject.class);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(String string, String string2, boolean bl) {
        String string3 = string;
        try {
            String iIiIiIIIII2;
            void iIiIiIIIII3;
            String iIiIiIIIII4;
            File file = new File(ALLATORIxDEMO);
            if (!file.exists()) {
                file.mkdirs();
            }
            String string4 = iIiIiIIIII4 = new JsonObject();
            string4.addProperty(IiiIiIiiiI.ALLATORIxDEMO("x\u001bi\u001bj\u0000k\u0006"), string3);
            string4.addProperty(iiIIiiiIIi.ALLATORIxDEMO("\u0003N\u0000\\$`!k"), iIiIiIIIII3 != false ? iIiIiIIIII2 : "");
            iIiIiIIIII4.addProperty(IiiIiIiiiI.ALLATORIxDEMO("\u007f\ra\fi\u0003c\u0011"), Boolean.valueOf((boolean)iIiIiIIIII3));
            iIiIiIIIII2 = IIIIIIiiII.iiiIiIiiIi(new Gson().toJson((JsonElement)iIiIiIIIII4));
            String[] stringArray = new String[2 ^ 3];
            stringArray[3 & 4] = iIIiIiiiIi;
            Files.write(Paths.get(ALLATORIxDEMO, stringArray), iIiIiIIIII2.getBytes(), new OpenOption[3 & 4]);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public static String iiIIiIIiii(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 >> 2, stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = string2.length();
        int n3 = n2 - (3 >> 1);
        char[] cArray = new char[n2];
        int n4 = n << n ^ (--3 << (1 ^ 3) ^ --3);
        int cfr_ignored_0 = (--3 ^ --5) << --4 ^ --4 << (5 >> 2);
        int n5 = 5 >> 2 << --3 ^ --2;
        int n6 = iIiIiIIIII2 = string3.length() - (3 >> 1);
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

    private static /* synthetic */ String iiiIiIiiIi(String string) throws Exception {
        Cipher cipher;
        String string2 = string;
        Object iIiIiIIIII2 = new SecretKeySpec(iIiIiIIIII.getBytes(iiIIiiiIIi.ALLATORIxDEMO("z\u0007I~7")), IiiIiIiiiI.ALLATORIxDEMO("$e\u0016"));
        Cipher cipher2 = cipher = Cipher.getInstance(iiIIiiiIIi.ALLATORIxDEMO("\u0012J\u0000 \u0016L\u0011 \u0003D\u0010\\F\u007f\u0012K7f=h"));
        cipher2.init(--1, (Key)iIiIiIIIII2);
        iIiIiIIIII2 = cipher2.doFinal(string2.getBytes(IiiIiIiiiI.ALLATORIxDEMO("\u0010T#\r}")));
        return Base64.getEncoder().encodeToString((byte[])iIiIiIIIII2);
    }

    private static /* synthetic */ String ALLATORIxDEMO(String string) throws Exception {
        String string2 = string;
        Object iIiIiIIIII2 = new SecretKeySpec(iIiIiIIIII.getBytes(iiIIiiiIIi.ALLATORIxDEMO("z\u0007I~7")), IiiIiIiiiI.ALLATORIxDEMO(" C0"));
        Cipher cipher = Cipher.getInstance(iiIIiiiIIi.ALLATORIxDEMO("\u0012J\u0000 \u0016L\u0011 \u0003D\u0010\\F\u007f\u0012K7f=h"));
        cipher.init(5 >> 1, (Key)iIiIiIIIII2);
        iIiIiIIIII2 = cipher.doFinal(Base64.getDecoder().decode(string2));
        return new String((byte[])iIiIiIIIII2, IiiIiIiiiI.ALLATORIxDEMO("<P'+["));
    }
}

