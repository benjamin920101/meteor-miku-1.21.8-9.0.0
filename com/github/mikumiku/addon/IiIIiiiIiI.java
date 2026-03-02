/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiiiIIIiii;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;

public class IiIIiiiIiI {
    private static final String ALLATORIxDEMO = "https://googlese.bbbbbbb.top/time";

    public static long ALLATORIxDEMO() {
        int n;
        HttpClient httpClient = HttpClient.newHttpClient();
        int n2 = --3;
        int n3 = n = 4 ^ 5;
        while (n3 <= n2) {
            try {
                JsonObject jsonObject;
                HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(ALLATORIxDEMO)).GET().header(IiiiIIIiii.ALLATORIxDEMO("\u001f-/,G?-;\u0004\n"), IiIiiiIIIi.ALLATORIxDEMO("\u0017\u0003(\b3\r>CgWwBt((\n>:\u001c\u001aw&\u0002@oRr~Kb+)\u00105\tqT<LmNe:(\u0016#\u0014TX\"5-\u000eiMkQnMrZn3\u00102Nq`R%\u001e\"\u0012b;&\u001ehRMz\u0007\u0012\u00165\t?kKpHjJJjjJD\t\r4\u0000-\bpYaNiQj_\u0004\u0000=zZ]eFfNnLl")).build();
                HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                if (httpResponse.statusCode() == (0x48D8 & 0x37EF) && (jsonObject = JsonParser.parseString((String)httpResponse.body()).getAsJsonObject()).has(IiiiIIIiii.ALLATORIxDEMO(".?\u001e\u001f"))) {
                    long l = jsonObject.get(IiIiiiIIIi.ALLATORIxDEMO("\u0004?\u0016=")).getAsLong();
                    return l;
                }
            }
            catch (Exception exception) {
                System.err.println("\u8bf7\u6c42\u5931\u8d25\uff0c\u6b63\u5728\u91cd\u8bd5 (" + n + "/" + n2 + ")\uff1a" + exception.getMessage());
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            n3 = ++n;
        }
        throw new RuntimeException(IiiiIIIiii.ALLATORIxDEMO("\u8b9d\u6c3c\u7fc4\u56bc\u65bc\u95aa\u597b\u8d7b\uff66\u5d8c\u9187\u8b8bY\u6b5f"));
    }

    public IiIIiiiIiI() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiiIIIi.ALLATORIxDEMO("\u0014\u0016!\u001b7\u001fD/4\u001e\u0005.t\u000ed\u8b8d\u66b7\u65cd\u5274\u677a\u65e9\u722f\u673f\uff2c"));
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - (5 >> 2);
        char[] cArray = new char[n];
        int n3 = --2 << --3 ^ --4;
        int cfr_ignored_0 = (--3 ^ --5) << --3 ^ (1 ^ 3);
        int n4 = --5 << --3 ^ (--3 ^ --5);
        int n5 = iIiIiIIIII2 = string3.length() - (4 ^ 5);
        int n6 = n2;
        String string4 = string3;
        while (n6 >= 0) {
            int n7 = n2--;
            cArray[n7] = (char)(n4 ^ (string2.charAt(n7) ^ string4.charAt(iIiIiIIIII2)));
            if (n2 < 0) break;
            int n8 = n2--;
            char c = cArray[n8] = (char)(n3 ^ (string2.charAt(n8) ^ string4.charAt(iIiIiIIIII2)));
            if (--iIiIiIIIII2 < 0) {
                iIiIiIIIII2 = n5;
            }
            n6 = n2;
        }
        return new String(cArray);
    }
}

