/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon.ok;

import com.github.mikumiku.addon.IIIIiIiIii;
import com.github.mikumiku.addon.IiiiIIiiII;
import com.github.mikumiku.addon.iIiiiIiIII;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoginApiTester {
    private static final HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build();
    private static final List<String> LOGIN_ENDPOINTS;
    private static String JSON_BY_USERNAME;
    private static final String BASE_URL = "https://7027e3d4.mikulogin.pages.dev";
    private static String JSON_BY_EMAIL;

    private static /* synthetic */ void testLoginEndpoint(String string, String string2, String string3) {
        Object iIiIiIIIII22 = string3;
        String iIiIiIIIII3 = string;
        try {
            HttpRequest iIiIiIIIII4;
            iIiIiIIIII22 = URI.create(BASE_URL + iIiIiIIIII3);
            iIiIiIIIII4 = HttpRequest.newBuilder().uri((URI)iIiIiIIIII22).timeout(Duration.ofSeconds(15L)).header(iIiiiIiIII.ALLATORIxDEMO("\u00115(:<?+z\f)2/"), IIIIiIiIii.ALLATORIxDEMO("C,K)o\u001bV=H0Hw]:O0")).header(iIiiiIiIII.ALLATORIxDEMO("\u0013=<#r\u0016?5,>"), IIIIiIiIii.ALLATORIxDEMO("\u007f*M$\u001c\u000e|\nK2\u001b\u0011c\u000bC,S\u007f\txf>E0")).POST(HttpRequest.BodyPublishers.ofString((String)((Object)iIiIiIIIII4))).build();
            if (client.send(iIiIiIIIII4, HttpResponse.BodyHandlers.ofString()).statusCode() != (0x4BDF & 0x34E8)) {
                return;
            }
        }
        catch (Exception iIiIiIIIII22) {
            // empty catch block
        }
    }

    private static /* synthetic */ String truncate(String string, int n) {
        int iIiIiIIIII2 = n;
        String iIiIiIIIII3 = string;
        if (iIiIiIIIII3 == null || iIiIiIIIII3.isEmpty()) {
            return iIiiiIiIII.ALLATORIxDEMO("u222>*r");
        }
        if (iIiIiIIIII3.length() <= iIiIiIIIII2) {
            return iIiIiIIIII3;
        }
        return iIiIiIIIII3.substring(3 >> 2, iIiIiIIIII2) + "...";
    }

    public static void login() {
        Iterator<String> iterator;
        Iterator<String> iterator2 = iterator = LOGIN_ENDPOINTS.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            JSON_BY_USERNAME = "{\"username\": \"" + IiiiIIiiII.ALLATORIxDEMO(System.nanoTime() + "2") + "\", \"password\": \"" + IiiiIIiiII.ALLATORIxDEMO(System.nanoTime() + "securePassword123!") + "\"}";
            iterator2 = iterator;
            String string2 = string;
            LoginApiTester.testLoginEndpoint(string2, JSON_BY_USERNAME, iIiiiIiIII.ALLATORIxDEMO(",\"4+1655"));
            LoginApiTester.testLoginEndpoint(string2, JSON_BY_EMAIL, IIIIiIiIii.ALLATORIxDEMO("=Z(I2"));
        }
    }

    static {
        String[] stringArray = new String[--5];
        stringArray[2 & 5] = IIIIiIiIii.ALLATORIxDEMO("\t4X.I0");
        stringArray[5 >> 2] = iIiiiIiIII.ALLATORIxDEMO("p6(9p;--an");
        stringArray[5 >> 1] = IIIIiIiIii.ALLATORIxDEMO("WV<U7\t4X.I0");
        stringArray[--3] = iIiiiIiIII.ALLATORIxDEMO("}*$=\"p;--an");
        stringArray[--4] = IIIIiIiIii.ALLATORIxDEMO("pU1P'I0");
        LOGIN_ENDPOINTS = Arrays.asList(stringArray);
        JSON_BY_USERNAME = "{\"username\": \"user\", \"password\": \"securePassword123!\"}\n";
        JSON_BY_EMAIL = "{\"email\": \"user@example.com\", \"password\": \"securePassword123!\"}\n";
    }

    public LoginApiTester() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIIiIiIii.ALLATORIxDEMO("e'^$O'3\u0018R8Z1cY\u0017\u8bbe\u66d5\u65ef\u5216\u6758\u6587\u7201\u670c\uff5f"));
        }
    }
}

