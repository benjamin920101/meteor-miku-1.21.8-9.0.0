/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIiiI;
import com.github.mikumiku.addon.IIiiiiIIII;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iIiIiIiiIi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Date;

public class iiiiIiiIIi {
    public iiiiIiiIIi() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiiiiIIII.ALLATORIxDEMO("\u0013#fn7-d=4,%<\u0001Id\u8bbf\u66b0\u65f8\u5254\u6768\u65d4\u7220\u6768\uff49"));
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 ^ 3, stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - --1;
        char[] cArray = new char[n];
        int n3 = (--3 ^ --5) << --3;
        int cfr_ignored_0 = (1 ^ 3 ^ --5) << --3 ^ (--3 ^ --5);
        int n4 = --1;
        int n5 = iIiIiIIIII2 = string3.length() - (5 >> 2);
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

    private static /* synthetic */ double ALLATORIxDEMO(String string, String string2) {
        int n;
        String iIiIiIIIII2 = string2;
        String iIiIiIIIII3 = string;
        if (iIiIiIIIII3 == null || iIiIiIIIII2 == null) {
            return 0.0;
        }
        if (iIiIiIIIII3.equals(iIiIiIIIII2)) {
            return 1.0;
        }
        int n2 = Math.min(iIiIiIIIII3.length(), iIiIiIIIII2.length());
        int n3 = 3 ^ 3;
        int n4 = n = 2 & 5;
        while (n4 < n2) {
            if (iIiIiIIIII3.charAt(n) == iIiIiIIIII2.charAt(n)) {
                ++n3;
            }
            n4 = ++n;
        }
        return (double)n3 / (double)Math.max(iIiIiIIIII3.length(), iIiIiIIIII2.length());
    }

    public static void iiIIiIIiii() {
        int n;
        int n2;
        System.out.println(IIiiiiIIII.ALLATORIxDEMO("Nuyud\u7824\u4e92!\u0000\u7a7b\u5bde\u606f\u6d2f\u8bbdDUyu"));
        IIIIiIIiiI iIIIiIIiiI = new IIIIiIIiiI();
        String[] stringArray = new String[--5];
        int n3 = n2 = 3 & 4;
        while (true) {
            if (n3 >= 5) break;
            try {
                Method method = IIIIiIIiiI.class.getDeclaredMethod(IiIiiIIIiI.ALLATORIxDEMO("E\u0018L\u0018P\u001cv8j\u001cP\u0019u<p8k\u0019"), new Class[3 & 4]);
                method.setAccessible((3 & 5) != 0);
                stringArray[n2] = (String)method.invoke((Object)iIIIiIIiiI, new Object[2 & 5]);
                System.out.println("\u7b2c" + (n2 + (3 & 5)) + "\u6b21: " + stringArray[n2]);
                Thread.sleep(100L);
            }
            catch (Exception exception) {
                System.out.println("\u751f\u6210\u5931\u8d25: " + exception.getMessage());
            }
            n3 = ++n2;
        }
        n2 = 1;
        int n4 = n = 2 ^ 3;
        while (n4 < stringArray.length) {
            if (!stringArray[3 ^ 3].equals(stringArray[n])) {
                n2 = 3 ^ 3;
                break;
            }
            n4 = ++n;
        }
        System.out.println("\u7a33\u5b9a\u6027\u6d4b\u8bd5\u7ed3\u679c: " + (n2 != 0 ? IIiiiiIIII.ALLATORIxDEMO("\u905e\u8f8f") : IiIiiIIIiI.ALLATORIxDEMO("\u5913\u8d58")));
        if (n2 == 0) {
            System.out.println(IIiiiiIIII.ALLATORIxDEMO("\u769c\u4f54\u5ec2\u526e\u67d4r"));
            int n5 = n = 2 ^ 3;
            while (n5 < stringArray.length) {
                double d = iiiiIiiIIi.ALLATORIxDEMO(stringArray[5 >> 3], stringArray[n]);
                int n6 = n + (3 >> 1);
                System.out.println("ID1 vs ID" + n6 + ": " + d * 100.0 + "%");
                n5 = ++n;
            }
        }
    }

    private static /* synthetic */ void iiiIiIiiIi() {
        Object object;
        System.out.println("CPU\u6838\u5fc3\u6570: " + Runtime.getRuntime().availableProcessors());
        System.out.println("\u6700\u5927\u5185\u5b58: " + Runtime.getRuntime().maxMemory() / 0x100000L + " MB");
        System.out.println("\u7cfb\u7edf\u67b6\u6784: " + System.getProperty(IiIiiIIIiI.ALLATORIxDEMO("\u0012qsc/A\u0015")));
        System.out.println("\u64cd\u4f5c\u7cfb\u7edf: " + System.getProperty(IIiiiiIIII.ALLATORIxDEMO("'\u0017F\n\t)-")));
        try {
            Dimension dimension;
            object = Toolkit.getDefaultToolkit();
            Dimension dimension2 = dimension = ((Toolkit)object).getScreenSize();
            System.out.println("\u5c4f\u5e55\u5206\u8fa8\u7387: " + dimension2.width + "x" + dimension2.height);
        }
        catch (Exception exception) {
            System.out.println(IiIiiIIIiI.ALLATORIxDEMO("\u5c12\u5e77\u527b\u8f8a\u73fa8}\u65e2\u6c88\u8395\u53ab"));
        }
        try {
            object = NetworkInterface.getNetworkInterfaces();
            int n = 2 & 5;
            while (object.hasMoreElements()) {
                if (n >= --3) break;
                byte[] byArray = ((NetworkInterface)object.nextElement()).getHardwareAddress();
                if (byArray == null || byArray.length <= 0) continue;
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = byArray.length;
                int n3 = 2 & 5;
                while (n3 < n2) {
                    int n4;
                    byte by = byArray[n4];
                    Object[] objectArray = new Object[--1];
                    objectArray[3 ^ 3] = by;
                    stringBuilder.append(String.format(IIiiiiIIII.ALLATORIxDEMO("AXv\u0010"), objectArray));
                    n3 = ++n4;
                }
                System.out.println("\u7f51\u5361MAC[" + n++ + "]: " + stringBuilder.toString());
            }
            if (n == 0) {
                System.out.println(IiIiiIIIiI.ALLATORIxDEMO("\u7f0c\u53430c>8}\u65e2\u6c88\u8395\u53ab"));
                return;
            }
        }
        catch (Exception exception) {
            System.out.println("\u7f51\u5361MAC: \u83b7\u53d6\u5931\u8d25 - " + exception.getMessage());
        }
    }

    private static /* synthetic */ void ALLATORIxDEMO() {
        IIIIiIIiiI iIIIiIIiiI = new IIIIiIIiiI();
        Object object = IIiiiiIIII.ALLATORIxDEMO("0-\u0017\u001ci#!1IYV[p}");
        System.out.println("\u4f7f\u7528\u6d4b\u8bd5\u5bc6\u94a5: " + (String)object);
        System.out.println("\u786c\u4ef6ID: " + iIIIiIIiiI.IIIIiIIiII());
        System.out.println(IiIiiIIIiI.ALLATORIxDEMO("\u51bf\u5925\u53ac\u9021\u9af3\u8bff\u8b96\u6c64\u5249\u0018]H\u000bJ\u0011\u0016\u0000\u0005ZN\u0005[\u001fK\u000b@\u0014\u001d\u0014U\u0012P\u0016G\u000fQSf8TRC\rkrc(V\u0015"));
        if ((3 ^ 3) != 0) {
            System.out.println(IIiiiiIIII.ALLATORIxDEMO("\u6b2b\u574c\u620f\u8808\u7757\u5bda\u9ac4\u8ba5\u8b9f\u6c26Fjf"));
            object = iIIIiIIiiI.ALLATORIxDEMO((String)object);
            System.out.println("\u9a8c\u8bc1\u7ed3\u679c: " + String.valueOf(object));
            return;
        }
        System.out.println(IiIiiIIIiI.ALLATORIxDEMO("\u8dd1\u8fba\u773f\u5be1\u8bc9\u6c23\uff6d\u8b84\u7f44U_\u0015]\u0016K\tH(\u0000[N/G\fW\u0018Q\t\"`\u0002\tP\bg}\u6767\u623a\u886e\uff74"));
    }

    public static void main(String[] stringArray) {
        Object object;
        Object iIiIiIIIII22;
        block6: {
            Object object2;
            String[] stringArray2 = stringArray;
            if (new Date().after(new Date(1773504000082L))) {
                throw new Throwable(IiIiiIIIiI.ALLATORIxDEMO("u\u0016\u0000[Q\u0018\u0002\bR\u0019C\tg|\u0002\u8b8a\u66d6\u65cd\u5232\u675d\u65b2\u7215\u670e\uff7c"));
            }
            System.out.println(IIiiiiIIII.ALLATORIxDEMO("Emaamco ,iegkzvfj{wl` ,cogkei{wcogkei{w ,ocjOjebnco#/dhdhdhdhDHdhdhDHDHdh`ll`dhconbbn`l \u0005ifdhyuej{tlc#/cldhfi{tcoghei{t ,l`jfjebnco \u0005ghdhdhghGHghdhGHDHghcllcdh`ombancl#,jfdhyufC{toc#/coghejxtcldhei{t#,l`jejeamco#,dhdhdhgBGHdhdhGHGHgkclocgh`ombbm`l ,ifghzufj{toc#/cFghfjxt`ldhfjxt#/l`ieiebnco#/dhdhdhdhDHdhdhGbGH\u0014:/8)#0!-(n\b#8!lb\u007f:*-+8!,&6'o0ja#)dzvzntcFghfjxt#/l`ieiebnco#/dhdhdhdhDHdhdhDHDHdh`loJghconbb\u000f, b{%4-h\u00167#<+7.7l}`:}fsj\u001c\u0011\r\u0003dhfjxt \u0005o`ieiebnco#/dhdhdhdhDHdhdhDHDHdh`ll`dhconbaDcl#/jfdhyueixto\u0007FB\u000fl\u0012\r\u0014\u0019\u0011\u001b\u000emdhfjxt#/l`ieieaD`o#/dhdhdhdhDHdhdhDHDHdh`ll`dhconbbn`l#/jfgBzueixtoc#/\u000e\u0003\u0010h\u0000\u0005\nt\u0003\u0003\t\u0005\u0003\u0018\u001b\u001dBCl\u0015\u001a\u0000hebnco#/dhgBghdhDHdhdhDHDHdh`ll`dhconbbn`l#/jfdhyueixtlI /`ldhfjxt`$0<69b{,n ,(1&7+`  n/dhdhdhdhDHgBghDHDHdh`ll`dhconbbn`l#/jfdhyueixtoc#/`ldhe@{wcogkei{w ,ocjfjfam`l ,gkgkgkgkGKgkgkGKGKgB"));
            System.out.println(IiIiiIIIiI.ALLATORIxDEMO("@\u001f@\u0002\u7811\u4ef4\u0014f\u7562\u6232\u6d36\u8bd7}?`\u001fw"));
            System.out.println(IIiiiiIIII.ALLATORIxDEMO("qge\u6d02\u8b90b\u001c&.oN1<,-*<-+\u0005\u001c+:d\u7824\u4e92! \u7577\u6254r"));
            Object object3 = new IIIIiIIiiI();
            try {
                Object object4 = object2 = IIIIiIIiiI.class.getDeclaredMethod(IiIiiIIIiI.ALLATORIxDEMO("E\u0018L\u0018P\u001cv8j\u001cP\u0019u<p8k\u0019"), new Class[3 & 4]);
                ((Method)object4).setAccessible((4 ^ 5) != 0);
                iIiIiIIIII22 = (String)((Method)object4).invoke(object3, new Object[3 & 4]);
                System.out.println("\u786c\u4ef6ID: " + (String)iIiIiIIIII22);
                System.out.println("\u957f\u5ea6: " + ((String)iIiIiIIIII22).length());
                object3 = (String)((Method)object2).invoke(object3, new Object[3 & 4]);
                System.out.println("\u518d\u6b21\u751f\u6210: " + (String)object3);
                System.out.println("\u4e00\u81f4\u6027: " + ((String)iIiIiIIIII22).equals(object3));
            }
            catch (Exception exception) {
                System.out.println("\u6d4b\u8bd5\u5931\u8d25: " + exception.getMessage());
            }
            System.out.println(IIiiiiIIII.ALLATORIxDEMO("Btdx\u6d1f\u8bd6/\r5=-,+6' .wf+&\u000b*\"=7+\u0005\u001c+:d\u7824\u4e92\u636f\u7edd\u7577\u6254r"));
            Object object5 = object2 = new iIiIiIiiIi();
            while (!((iIiIiIiiIi)object5).IIiIiIiIiI()) {
                try {
                    Thread.sleep(100L);
                    object5 = object2;
                }
                catch (InterruptedException iIiIiIIIII22) {
                    Thread.currentThread().interrupt();
                    object = object2;
                    break block6;
                }
            }
            object = object2;
        }
        iIiIiIIIII22 = ((iIiIiIiiIi)object).iiIIiIIiii();
        System.out.println("\u786c\u4ef6\u6307\u7eb9: " + (String)iIiIiIIIII22);
        System.out.println("\u957f\u5ea6: " + String.valueOf(iIiIiIIIII22 != null ? Integer.valueOf(((String)iIiIiIIIII22).length()) : "null"));
        System.out.println(IiIiiIIIiI.ALLATORIxDEMO("W\u0011S\u0002\u7c86\u7edd\u7831\u4ef4\u4fbc\u604dG"));
        iiiiIiiIIi.iiiIiIiiIi();
        System.out.println(IIiiiiIIII.ALLATORIxDEMO("bpfd\u6d03\u8bb1\u7777\u5bfa\u9ae4\u8b85r"));
        iiiiIiiIIi.ALLATORIxDEMO();
    }
}

