/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2487
 *  net.minecraft.class_2499
 *  net.minecraft.class_2507
 *  net.minecraft.class_2520
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIIIiiI;
import com.github.mikumiku.addon.IiiiIIIiii;
import com.github.mikumiku.addon.iiIIIIiiII;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.class_2487;
import net.minecraft.class_2499;
import net.minecraft.class_2507;
import net.minecraft.class_2520;

public class iiIIIiIiII {
    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[2 ^ 3];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(2 & 5, stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = string2.length();
        int n3 = n2 - --1;
        char[] cArray = new char[n2];
        int n4 = (1 ^ 3) << --3 ^ n;
        int cfr_ignored_0 = --5 << --4 ^ --3;
        int n5 = n;
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

    public iiIIIiIiII() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIIIiii.ALLATORIxDEMO("\u001d5hx9;j+\u001a\u001a\u000b\n\u000f_j\u8ba9\u669e\u65ce\u527a\u675e\u65da\u7236\u6746\uff7f"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean iiiIiIiiIi(File file, List<iiIIIIiiII> list, Consumer<String> consumer) {
        void iIiIiIIIII2;
        File file2;
        void iIiIiIIIII3;
        File file3 = file;
        if (!file3.exists() || !file3.canRead()) {
            iIiIiIIIII3.accept(IIiiIIIiiI.ALLATORIxDEMO("\u659d\u4ebc\u4e37\u5b32\u5732\u625c\u65da\u6cbf\u529a\u8f17"));
            return 3 >> 2;
        }
        Object iIiIiIIIII4 = null;
        try {
            iIiIiIIIII4 = class_2507.method_10633((Path)file3.toPath());
            file2 = iIiIiIIIII4;
        }
        catch (IOException iOException) {
            file2 = iIiIiIIIII4;
            iOException.printStackTrace();
        }
        if (file2 == null) {
            iIiIiIIIII3.accept(IiiiIIIiii.ALLATORIxDEMO("\u4e84\u65d9\u4e9c\u52de\u8f37\u0010(*\u595b\u8d5b"));
            return (2 & 5) != 0;
        }
        class_2499 class_24992 = iIiIiIIIII4.method_68569(IIiiIIIiiI.ALLATORIxDEMO("\u0018u&V\u0003T\r"));
        iIiIiIIIII2.clear();
        Object object = iIiIiIIIII4 = class_24992.iterator();
        while (object.hasNext()) {
            class_24992 = (class_2520)iIiIiIIIII4.next();
            if (class_24992.method_10711() != (0x1B & 0x6E)) {
                iIiIiIIIII3.accept(IiiiIIIiii.ALLATORIxDEMO("\u659e\u6502\u76da\u527d\u8816\u5129\u7d5e"));
                return (2 & 5) != 0;
            }
            iIiIiIIIII2.add(new iiIIIIiiII().ALLATORIxDEMO((class_2487)class_24992));
            object = iIiIiIIIII4;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(File file, List<iiIIIIiiII> list, Consumer<String> consumer) {
        class_2487 iIiIiIIIII2 = list;
        File iIiIiIIIII3 = file;
        class_2499 class_24992 = new class_2499();
        class_2487 class_24872 = iIiIiIIIII2 = iIiIiIIIII2.iterator();
        while (class_24872.hasNext()) {
            iiIIIIiiII iiIIIIiiII2 = (iiIIIIiiII)iIiIiIIIII2.next();
            class_24872 = iIiIiIIIII2;
            class_24992.add((Object)iiIIIIiiII2.toTag());
        }
        iIiIiIIIII2 = new class_2487();
        iIiIiIIIII2.method_10566(IIiiIIIiiI.ALLATORIxDEMO("\u0018u&V\u0003T\r"), (class_2520)class_24992);
        if (Files.notExists(iIiIiIIIII3.getParentFile().toPath(), new LinkOption[3 ^ 3]) && !iIiIiIIIII3.getParentFile().mkdirs()) {
            void iIiIiIIIII4;
            iIiIiIIIII4.accept(IiiiIIIiii.ALLATORIxDEMO("\u5251\u5ea4\u7684\u5f2b\u595b\u8d5b"));
            return (3 & 4) != 0;
        }
        try {
            class_2507.method_10630((class_2487)iIiIiIIIII2, (Path)iIiIiIIIII3.toPath());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return (3 & 4) != 0;
        }
        return true;
    }
}

