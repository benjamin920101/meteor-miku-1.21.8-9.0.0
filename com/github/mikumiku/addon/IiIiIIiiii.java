/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.mixininterface.IChatHud
 *  meteordevelopment.meteorclient.systems.config.Config
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_5250
 *  org.jetbrains.annotations.Nullable
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIiiiI;
import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.mojang.brigadier.StringReader;
import java.awt.Color;
import java.util.Date;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.mixininterface.IChatHud;
import meteordevelopment.meteorclient.systems.config.Config;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import org.jetbrains.annotations.Nullable;

public class IiIiIIiiii {
    public static String ALLATORIxDEMO = "";

    public static void ALLATORIxDEMO(String string, int n) {
        int iIiIiIIIII2 = n;
        String iIiIiIIIII3 = string;
        IiIiIIiiii.ALLATORIxDEMO(class_2561.method_30163((String)iIiIiIIIII3), iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ class_5250 iiiIiIiiIi(String string, class_124 class_1242) {
        void iIiIiIIIII2;
        String iIiIiIIIII3;
        String string2 = string;
        String string3 = iIiIiIIIII3 = class_2561.method_43473();
        iIiIiIIIII3.method_10862(iIiIiIIIII3.method_10866().method_27706(class_124.field_1080));
        string3.method_27693(iiIIiiiIIi.ALLATORIxDEMO("t"));
        class_5250 class_52502 = class_2561.method_43470((String)string2);
        class_52502.method_10862(class_52502.method_10866().method_27706((class_124)iIiIiIIIII2));
        iIiIiIIIII3.method_10852((class_2561)class_52502);
        iIiIiIIIII3.method_27693(IiiiIiiIII.ALLATORIxDEMO("OM"));
        return string3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ class_5250 ALLATORIxDEMO(String string, class_124 class_1242) {
        void iIiIiIIIII2;
        String string2 = string;
        StringReader stringReader = new StringReader(string2);
        class_5250 class_52502 = class_2561.method_43473();
        String iIiIiIIIII3 = class_2583.field_24360.method_27706((class_124)iIiIiIIIII2);
        StringBuilder stringBuilder = new StringBuilder();
        int n = 2 & 5;
        while (stringReader.canRead()) {
            int n2;
            block15: {
                char c = stringReader.read();
                if (c == (0x78 & 0x2F)) {
                    class_52502.method_10852((class_2561)class_2561.method_43470((String)stringBuilder.toString()).method_10862((class_2583)iIiIiIIIII3));
                    StringBuilder stringBuilder2 = stringBuilder;
                    stringBuilder2.setLength(3 & 4);
                    stringBuilder2.append(c);
                    int cfr_ignored_0 = 5 >> 2;
                    continue;
                }
                stringBuilder.append(c);
                if (n == 0) continue;
                if (c != (0x6F & 0x39)) continue;
                String string3 = stringBuilder.toString();
                int n3 = -4 >> 2;
                switch (string3.hashCode()) {
                    case 1360546352: {
                        if (!string3.equals(iiIIiiiIIi.ALLATORIxDEMO("'\u0017J\u0015N\u0006C\u0007\u0006"))) break;
                        n2 = n3 = 3 ^ 3;
                        break block15;
                    }
                    case 1493694493: {
                        if (!string3.equals(IiiiIiiIII.ALLATORIxDEMO("eZ$u\u0005~\u0004u\u0005fD"))) break;
                        n2 = n3 = 5 >> 2;
                        break block15;
                    }
                    case -634715899: {
                        if (!string3.equals(iiIIiiiIIi.ALLATORIxDEMO("'&a\u0017J\u0001C\u001aA\u0016\u0006"))) break;
                        n2 = n3 = 1 ^ 3;
                        break block15;
                    }
                    case 1239084828: {
                        if (!string3.equals(IiiiIiiIII.ALLATORIxDEMO(":\u000f}\u0001vD"))) break;
                        n3 = --3;
                    }
                }
                n2 = n3;
            }
            switch (n2) {
                case 0: {
                    iIiIiIIIII3 = iIiIiIIIII3.method_27706((class_124)iIiIiIIIII2);
                    stringBuilder.setLength(2 & 5);
                    break;
                }
                case 1: {
                    iIiIiIIIII3 = iIiIiIIIII3.method_27706(class_124.field_1068);
                    stringBuilder.setLength(3 >> 2);
                    break;
                }
                case 2: {
                    iIiIiIIIII3 = iIiIiIIIII3.method_27706(class_124.field_1073);
                    stringBuilder.setLength(3 ^ 3);
                    break;
                }
                case 3: {
                    iIiIiIIIII3 = iIiIiIIIII3.method_27706(class_124.field_1067);
                    stringBuilder.setLength(3 & 4);
                    break;
                }
            }
            n = 0;
        }
        if (!stringBuilder.isEmpty()) {
            class_52502.method_10852((class_2561)class_2561.method_43470((String)stringBuilder.toString()).method_10862((class_2583)iIiIiIIIII3));
        }
        return class_52502;
    }

    public static void IIiIiIiIiI(String iIiIiIIIII2) {
        if (iIiIiIIIII2 == null) {
            return;
        }
        if (iIiIiIIIII2.equals(ALLATORIxDEMO)) {
            return;
        }
        IiIiIIiiii.iiIIiIIiii("\u00a7c " + iIiIiIIIII2);
        ALLATORIxDEMO = iIiIiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, @Nullable String string, @Nullable class_124 class_1242, class_124 class_1243, String string2, Object ... objectArray) {
        void prefixColor;
        void prefixTitle;
        void args;
        void messageContent;
        class_124 id = class_1243;
        int messageColor = n;
        id = IiIiIIiiii.ALLATORIxDEMO(String.format((String)messageContent, (Object[])args), id);
        IiIiIIiiii.ALLATORIxDEMO(messageColor, (String)prefixTitle, (class_124)prefixColor, (class_2561)id);
    }

    public static void iiiiIIIiII(String iIiIiIIIII2) {
        if (iIiIiIIIII2 == null) {
            return;
        }
        if (iIiIiIIIII2.equals(ALLATORIxDEMO)) {
            return;
        }
        IiIiIIiiii.iiIIiIIiii("\u00a7a " + iIiIiIIIII2);
        ALLATORIxDEMO = iIiIiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, @Nullable String string, @Nullable class_124 class_1242, String string2, class_124 class_1243) {
        void prefixColor;
        void prefixTitle;
        void messageColor;
        String id = string2;
        int messageContent = n;
        id = IiIiIIiiii.ALLATORIxDEMO(id, (class_124)messageColor);
        IiIiIIiiii.ALLATORIxDEMO(messageContent, (String)prefixTitle, (class_124)prefixColor, (class_2561)id);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(String string, class_2561 object) {
        String iIiIiIIIII2;
        void iIiIiIIIII3;
        String string2 = string;
        string = object;
        object = string2;
        IiIiIIiiii.ALLATORIxDEMO(3 & 4, (String)iIiIiIIIII3, class_124.field_1076, (class_2561)iIiIiIIIII2);
    }

    public static void IIIIiIIiII(String iIiIiIIIII2) {
        if (iIiIiIIIII2 == null) {
            return;
        }
        if (iIiIiIIIII2.equals(ALLATORIxDEMO)) {
            return;
        }
        String string = iIiIiIIIII2;
        IiIiIIiiii.iiIIiIIiii(string);
        ALLATORIxDEMO = string;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(class_124 objectArray, String string, Object ... objectArray2) {
        class_124 iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        Object[] objectArray3 = objectArray;
        objectArray = objectArray2;
        objectArray2 = objectArray3;
        IiIiIIiiii.ALLATORIxDEMO(3 >> 2, null, null, (class_124)iIiIiIIIII4, (String)iIiIiIIIII3, (Object[])iIiIiIIIII2);
    }

    public IiIiIIiiii() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIiiiIIi.ALLATORIxDEMO("$DQ\t jSZ#k\u0012[6.s\u8bf8\u6687\u659f\u5243\u672f\u65c3\u7267\u675f\uff2e"));
        }
    }

    public static class_2561 ALLATORIxDEMO() {
        int n;
        String string = IiiiIiiIII.ALLATORIxDEMO("_\u0004y\u0018_\u0004y\u0018");
        Color color = new Color(5 >> 3, 0xFFF & 0x70FF, 0x60FF & 0x1FF7);
        Color color2 = new Color(0x3F & 0x70, 0xEFB & 0x719F, 0x9BE & 0x76FB);
        char[] cArray = string.toCharArray();
        class_5250 class_52502 = class_2561.method_43473();
        int n2 = cArray.length;
        int n3 = n = 2 & 5;
        while (n3 < n2) {
            char c = cArray[n];
            double d = (double)n / (double)(n2 - (4 ^ 5));
            Color color3 = IIIiIIiiiI.ALLATORIxDEMO(color, color2, d);
            class_52502.method_10852((class_2561)class_2561.method_43470((String)String.valueOf(c)).method_10862(class_2583.field_24360.method_36139(color3.getRGB())));
            n3 = ++n;
        }
        class_52502 = class_2561.method_43470((String)iiIIiiiIIi.ALLATORIxDEMO("t")).method_10852((class_2561)class_52502).method_27693(IiiiIiiIII.ALLATORIxDEMO("OM"));
        return class_52502;
    }

    public static void iiIIiIIiii(String iIiIiIIIII2) {
        if (iIiIiIIIII2 == null) {
            return;
        }
        if (iIiIiIIIII2.equals(ALLATORIxDEMO)) {
            return;
        }
        String string = iIiIiIIIII2;
        IiIiIIiiii.ALLATORIxDEMO(class_2561.method_30163((String)string));
        ALLATORIxDEMO = string;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, @Nullable String string, @Nullable class_124 class_1242, class_2561 class_25612) {
        void msg;
        void prefixTitle;
        int n2 = n;
        if (MeteorClient.mc.field_1687 == null) {
            return;
        }
        class_5250 id = class_2561.method_43473();
        id.method_10852(IiIiIIiiii.ALLATORIxDEMO());
        if (prefixTitle != null) {
            void prefixColor;
            id.method_10852((class_2561)IiIiIIiiii.iiiIiIiiIi((String)prefixTitle, (class_124)prefixColor));
        }
        id.method_10852((class_2561)msg);
        if (!((Boolean)Config.get().deleteChatFeedback.get()).booleanValue()) {
            n2 = 3 >> 2;
        }
        ((IChatHud)MeteorClient.mc.field_1705.method_1743()).meteor$add((class_2561)id, n2);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(class_2561 class_25612, int n) {
        class_2561 class_25613 = class_25612;
        if (MeteorClient.mc.field_1687 == null) {
            return;
        }
        class_2561 iIiIiIIIII2 = class_2561.method_43473();
        iIiIiIIIII2.method_10862(class_2583.field_24360.method_27706(class_124.field_1080));
        iIiIiIIIII2.method_10852(IiIiIIiiii.ALLATORIxDEMO());
        iIiIiIIIII2.method_10852(class_25613);
        try {
            void iIiIiIIIII3;
            ((IChatHud)MeteorClient.mc.field_1705.method_1743()).meteor$add(iIiIiIIIII2, (int)iIiIiIIIII3);
            return;
        }
        catch (Exception iIiIiIIIII3) {
            iIiIiIIIII3.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, class_124 class_1242, String string, Object ... objectArray) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        Object[] iIiIiIIIII4 = objectArray;
        int iIiIiIIIII5 = n;
        IiIiIIiiii.ALLATORIxDEMO(iIiIiIIIII5, null, null, (class_124)iIiIiIIIII3, (String)iIiIiIIIII2, iIiIiIIIII4);
    }

    public static void ALLATORIxDEMO(String iIiIiIIIII2) {
        if (iIiIiIIIII2 == null) {
            return;
        }
        if (iIiIiIIIII2.equals(ALLATORIxDEMO)) {
            return;
        }
        new IIiIIIIIii(50L).ALLATORIxDEMO(() -> IiIiIIiiii.ALLATORIxDEMO(class_2561.method_30163((String)iIiIiIIIII2)));
        ALLATORIxDEMO = iIiIiIIIII2;
    }

    public static void ALLATORIxDEMO(class_2561 class_25612) {
        class_2561 class_25613 = class_25612;
        if (MeteorClient.mc.field_1687 == null) {
            return;
        }
        class_2561 iIiIiIIIII2 = class_2561.method_43473();
        iIiIiIIIII2.method_10862(class_2583.field_24360.method_27706(class_124.field_1080));
        iIiIiIIIII2.method_10852(IiIiIIiiii.ALLATORIxDEMO());
        iIiIiIIIII2.method_10852(class_25613);
        ((IChatHud)MeteorClient.mc.field_1705.method_1743()).meteor$add(iIiIiIIIII2, 3 ^ 3);
    }
}

