/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiIIiiII;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIiIiIii {
    public iIiIiIiIii() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIIiiII.iiIIiIIiii("\u0004g\u0011J'nT^$o5\u007fd\u007ft\u8bfc\u66a7\u65bc\u5264\u670b\u65f9\u725e\u672f\uff5d"));
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(3 & 4, stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (3 >> 1);
        char[] cArray = new char[n];
        int n3 = (--3 ^ --5) << --3 ^ (--3 ^ --5);
        int cfr_ignored_0 = (--2 ^ --5) << --4 ^ --3 << --1;
        int n4 = --5 << --4 ^ 5 >> 2;
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

    public static Boolean ALLATORIxDEMO(String string) {
        int n;
        String string2 = string;
        int cfr_ignored_0 = --3;
        Object object = Duration.ofSeconds(5L);
        HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
        object = HttpRequest.newBuilder().uri(URI.create(string2)).timeout((Duration)object).GET().build();
        int n2 = n = 2 ^ 3;
        while (true) {
            block7: {
                if (n2 > 3) break;
                try {
                    String string3;
                    HttpResponse<String> iIiIiIIIII2 = httpClient.send((HttpRequest)object, HttpResponse.BodyHandlers.ofString());
                    if (iIiIiIIIII2.statusCode() == (0x53FB & 0x2CCC) && (string3 = (String)iIiIiIIIII2.body()) != null && string3.trim().equals(iIiIiIiIii.ALLATORIxDEMO("\u000bs\u0017y"))) {
                        return Boolean.TRUE;
                    }
                }
                catch (IOException | InterruptedException iIiIiIIIII2) {
                    if (!(iIiIiIIIII2 instanceof InterruptedException)) break block7;
                    Thread.currentThread().interrupt();
                }
            }
            if (n < --3) {
                try {
                    Thread.sleep(500L * (long)n);
                }
                catch (InterruptedException iIiIiIIIII2) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
            n2 = ++n;
        }
        return Boolean.FALSE;
    }
}

