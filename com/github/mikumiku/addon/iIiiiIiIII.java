/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIIiII;
import com.github.mikumiku.addon.iiiiiiiiii;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

public class iIiiiIiIII {
    /*
     * WARNING - void declaration
     */
    public static String ALLATORIxDEMO(Throwable throwable, int n) {
        int n2;
        void iIiIiIIIII2;
        Throwable throwable2 = throwable;
        Object iIiIiIIIII3 = iIiiiIiIII.iiiIiIiiIi(throwable2);
        String[] stringArray = ((String)iIiIiIIIII3).split(iiiiiiiiii.ALLATORIxDEMO("m"));
        if (stringArray.length <= iIiIiIIIII2) {
            return iIiIiIIIII3;
        }
        iIiIiIIIII3 = new StringBuilder();
        int n3 = n2 = 3 ^ 3;
        while (n3 < iIiIiIIIII2) {
            StringBuilder stringBuilder = ((StringBuilder)iIiIiIIIII3).append(stringArray[n2]);
            stringBuilder.append(IiIIiIIiII.ALLATORIxDEMO("d"));
            n3 = ++n2;
        }
        ((StringBuilder)iIiIiIIIII3).append(iiiiiiiiii.ALLATORIxDEMO("IYIWO")).append(stringArray.length - iIiIiIIIII2).append(IiIIiIIiII.ALLATORIxDEMO("2#]\u001cwn^\u0007\\\u000bAG"));
        return ((StringBuilder)iIiIiIIIII3).toString();
    }

    public iIiiiIiIII() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiiiiiiii.ALLATORIxDEMO("\u0000,ua$\"W\u0012'#632fW\u8b90\u66a3\u65f7\u5247\u6767\u65c7\u722f\u675b\uff66"));
        }
    }

    public static String iiIIiIIiii(Throwable iIiIiIIIII2) {
        return iIiIiIIIII2.getClass().getSimpleName() + ": " + iIiIiIIIII2.getMessage();
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[5 >> 2];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = string2.length();
        int n3 = n2 - --1;
        char[] cArray = new char[n2];
        int n4 = (--3 ^ --5) << --3 ^ (--3 ^ --5);
        int cfr_ignored_0 = n << n ^ (--3 << (5 >> 1) ^ --3);
        int n5 = (1 ^ 3 ^ --5) << --3 ^ (--3 ^ --5);
        int n6 = iIiIiIIIII2 = string3.length() - (3 & 5);
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

    public static String iiiIiIiiIi(Throwable throwable) {
        Throwable throwable2 = throwable;
        StringWriter iIiIiIIIII2 = new StringWriter();
        PrintWriter printWriter = new PrintWriter(iIiIiIIIII2);
        throwable2.printStackTrace(printWriter);
        return iIiIiIIIII2.toString();
    }

    public static String ALLATORIxDEMO(Throwable throwable) {
        int n;
        Throwable throwable2 = throwable;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(throwable2.getClass().getName()).append(IiIIiIIiII.ALLATORIxDEMO("\bN")).append(throwable2.getMessage()).append(iiiiiiiiii.ALLATORIxDEMO("m"));
        Object iIiIiIIIII2 = throwable2.getStackTrace();
        int n2 = ((StackTraceElement[])iIiIiIIIII2).length;
        int n3 = n = 3 ^ 3;
        while (n3 < n2) {
            StackTraceElement stackTraceElement = iIiIiIIIII2[n];
            stringBuilder.append(IiIIiIIiII.ALLATORIxDEMO(";\u000fFN")).append(stackTraceElement.toString()).append(iiiiiiiiii.ALLATORIxDEMO("m"));
            n3 = ++n;
        }
        Object object = iIiIiIIIII2 = throwable2.getCause();
        while (object != null) {
            stringBuilder.append(IiIIiIIiII.ALLATORIxDEMO("\rS\u001ba+VNP\u0017\bN")).append(iIiIiIIIII2.getClass().getName()).append(iiiiiiiiii.ALLATORIxDEMO("MG")).append(((Throwable)iIiIiIIIII2).getMessage()).append(IiIIiIIiII.ALLATORIxDEMO("d"));
            StackTraceElement[] stackTraceElementArray = ((Throwable)iIiIiIIIII2).getStackTrace();
            n = stackTraceElementArray.length;
            int n4 = 3 & 4;
            while (n4 < n) {
                int n5;
                StackTraceElement stackTraceElement = stackTraceElementArray[n5];
                stringBuilder.append(iiiiiiiiii.ALLATORIxDEMO("~\u0006\u0003G")).append(stackTraceElement.toString()).append(IiIIiIIiII.ALLATORIxDEMO("d"));
                n4 = ++n5;
            }
            object = ((Throwable)iIiIiIIIII2).getCause();
        }
        return stringBuilder.toString();
    }
}

