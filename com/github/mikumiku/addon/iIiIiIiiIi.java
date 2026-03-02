/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiIIiIi;
import com.github.mikumiku.addon.IiIIIiIiiI;
import com.github.mikumiku.addon.auth.security.AuthenticationObfuscator;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIiIiiIi {
    private final List<String> iIiiiIiIii;
    private static final Pattern iIiIiiiiII;
    private static final Pattern IIIIiiIiii;
    private volatile boolean IiiIiIiiIi;
    private static final String[] IIiIiIIiii;
    private final SecureRandom iIIiiIiIiI;
    private volatile long iiiiiIIiIi;
    private final Map<String, Object> iIIiIiiiIi;
    private static final byte[] iIiIiIIIII;
    private static final String ALLATORIxDEMO = "X9#mK$pL@vN&qR*wE!tY^uI+oP";

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IIiIiIiIiI(String string, String string2) {
        void iIiIiIIIII2;
        iIiIiIiiIi iIiIiIIIII3;
        block4: {
            boolean bl;
            iIiIiIiiIi iIiIiIiiIi2 = string3;
            String string3 = string2;
            iIiIiIIIII3 = iIiIiIiiIi2;
            try {
                long l = (Long)iIiIiIIIII3.iIIiIiiiIi.getOrDefault(IIiiiIIiIi.ALLATORIxDEMO("\u0005@]\u0012Q)@\ng(K9x'B\u000fJ\u0007z/A\b"), 0L);
                long l2 = System.currentTimeMillis();
                long l3 = 604800000L;
                if (l2 - l <= l3) break block4;
                bl = false;
            }
            catch (Exception exception) {
                return (3 & 4) != 0;
            }
            return bl;
        }
        if (iIiIiIIIII3.iIiIiiiiii((String)iIiIiIIIII2) && iIiIiIIIII3.iiiiIIIiII(string3)) {
            return (2 ^ 3) != 0;
        }
        boolean bl = false;
        return bl;
    }

    public boolean IIiIiIiIiI() {
        return this.IiiIiIiiIi;
    }

    private /* synthetic */ String IIiIiIiiii() {
        iIiIiIiiIi iIiIiIiiIi2 = this;
        try {
            int n = ThreadLocalRandom.current().nextInt(IIiIiIIiii.length);
            String string = IIiIiIIiii[n];
            if (iIiIiIiiIi2.ALLATORIxDEMO(string)) {
                return string;
            }
            return IIiIiIIiii[(n + (4 ^ 5)) % IIiIiIIiii.length];
        }
        catch (Exception n) {
            return IIiIiIIiii[3 ^ 3];
        }
    }

    public List<String> ALLATORIxDEMO() {
        return new ArrayList<String>(this.iIiiiIiIii);
    }

    /*
     * WARNING - void declaration
     */
    public boolean iiiiIIIiII(String string, String string2) {
        iIiIiIiiIi iIiIiIIIII2;
        block12: {
            block11: {
                void iIiIiIIIII3;
                block10: {
                    block9: {
                        block8: {
                            boolean bl;
                            String string3;
                            String this_ = string2;
                            iIiIiIIIII2 = string3;
                            if (!iIiIiIIIII2.IiiIiIiiIi) {
                                return 5 >> 3;
                            }
                            try {
                                if (iIiIiIIIII2.iIiIiiiiii((String)iIiIiIIIII3)) break block8;
                                bl = false;
                            }
                            catch (Exception exception) {
                                boolean bl2 = 3 ^ 3;
                                iIiIiIIIII2.ALLATORIxDEMO(bl2);
                                return bl2;
                            }
                            return bl;
                        }
                        if (iIiIiIIIII2.iiiiIIIiII(this_)) break block9;
                        boolean bl = false;
                        return bl;
                    }
                    if (iIiIiIIIII2.iiiiIIIiII()) break block10;
                    boolean bl = false;
                    return bl;
                }
                if (iIiIiIIIII2.iiiIiIiiIi((String)iIiIiIIIII3, this_)) break block11;
                boolean bl = false;
                return bl;
            }
            if (iIiIiIIIII2.iiiIiIiiIi()) break block12;
            boolean bl = false;
            return bl;
        }
        iIiIiIIIII2.ALLATORIxDEMO((4 ^ 5) != 0);
        iIiIiIIIII2.iiiiiIIiIi = System.currentTimeMillis();
        boolean bl = true;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IIIIiIIiII(String string, String string2) {
        iIiIiIiiIi iIiIiIiiIi2 = string3;
        String string3 = string2;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            void iIiIiIIIII3;
            return iIiIiIIIII2.iiIIiIIiii((String)iIiIiIIIII3).equals(string3);
        }
        catch (Exception exception) {
            return (3 & 4) != 0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean IIiIiIiiii(String string) {
        String string2;
        iIiIiIiiIi iIiIiIiiIi2 = string2;
        if (!iIiIiIiiIi2.IiiIiIiiIi) {
            iIiIiIiiIi2.ALLATORIxDEMO();
        }
        try {
            void iIiIiIIIII2;
            iIiIiIiiIi iIiIiIiiIi3 = iIiIiIiiIi2;
            String exception = iIiIiIiiIi3.iIiIiIiIii();
            return iIiIiIiiIi3.ALLATORIxDEMO((String)iIiIiIIIII2, exception);
        }
        catch (Exception exception) {
            boolean bl = 5 >> 3;
            iIiIiIiiIi2.ALLATORIxDEMO(bl);
            return bl;
        }
    }

    private /* synthetic */ boolean iiiiIIIiII() {
        String string;
        iIiIiIiiIi iIiIiIiiIi2;
        block3: {
            boolean bl;
            iIiIiIiiIi2 = string2;
            try {
                String string2 = iIiIiIiiIi.iIiIiiiiii();
                string = (String)iIiIiIiiIi2.iIIiIiiiIi.get(IiIIIiIiiI.ALLATORIxDEMO("5\u001b\u0014("));
                if (string != null) break block3;
                bl = false;
            }
            catch (Exception this_) {
                return (2 & 5) != 0;
            }
            return bl;
        }
        return iIiIiIiiIi2.iiIIiIIiii(string2, string);
    }

    private /* synthetic */ boolean iIiIiiiiii(String string) {
        iIiIiIiiIi iIiIiIIIII2;
        block7: {
            block6: {
                boolean bl;
                Object object;
                block9: {
                    block8: {
                        iIiIiIiiIi iIiIiIiiIi2 = object;
                        object = string;
                        iIiIiIIIII2 = iIiIiIiiIi2;
                        if (object == null) break block8;
                        if (((String)object).length() >= (0x5C & 0x33)) break block9;
                    }
                    return false;
                }
                try {
                    iIiIiIiiIi iIiIiIiiIi3 = iIiIiIIIII2;
                    object = iIiIiIiiIi3.iiiIiIiiIi((String)object);
                    if (iIiIiIiiIi3.IIiIiIiIiI((String)object)) break block6;
                    bl = false;
                }
                catch (Exception this_) {
                    return (3 ^ 3) != 0;
                }
                return bl;
            }
            if (iIiIiIIIII2.iIiIiIiIii((String)object)) break block7;
            boolean bl = false;
            return bl;
        }
        return iIiIiIIIII2.iiiIiIiiIi((String)object);
    }

    private /* synthetic */ int ALLATORIxDEMO(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = string2;
        String string2 = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            return Math.abs(string2.hashCode() % (0x1B & 0x6E));
        }
        catch (Exception exception) {
            return 3 ^ 3;
        }
    }

    private /* synthetic */ String IIIIiIIiII(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = object;
        Object object = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        if (object == null) {
            return null;
        }
        if (((String)(object = ((String)object).trim())).startsWith(IiIIIiIiiI.ALLATORIxDEMO("n")) && ((String)object).endsWith(IIiiiIIiIi.ALLATORIxDEMO("D"))) {
            Object object2 = object;
            return ((String)object2).substring(--1, ((String)object2).length() - --1);
        }
        return object;
    }

    private /* synthetic */ void ALLATORIxDEMO(boolean bl) {
        boolean bl22 = bl;
        iIiIiIiiIi iIiIiIIIII2 = this;
        try {
            String bl22 = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " - " + (bl22 ? IiIIIiIiiI.ALLATORIxDEMO("\u001f(\u000f\u001e).\u001f") : IIiiiIIiIi.ALLATORIxDEMO(" o/B\u0013|#"));
            iIiIiIiiIi iIiIiIiiIi2 = iIiIiIIIII2;
            iIiIiIiiIi2.iIiiiIiIii.add(bl22);
            if (iIiIiIiiIi2.iIiiiIiIii.size() > (0x65 & 0x7E)) {
                iIiIiIIIII2.iIiiiIiIii.remove(2 & 5);
                return;
            }
        }
        catch (Exception exception) {}
    }

    private /* synthetic */ Map<String, Object> iiiIiIiiIi(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = string2;
        try {
            int n;
            String[] iIiIiIIIII2;
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            if (iIiIiIIIII2 == null || !iIiIiIIIII2.startsWith(IiIIIiIiiI.ALLATORIxDEMO("7")) || !iIiIiIIIII2.endsWith(IIiiiIIiIi.ALLATORIxDEMO("\u001b"))) {
                return null;
            }
            int n2 = 3 & 5;
            iIiIiIIIII2 = iIiIiIIIII2.substring(n2, iIiIiIIIII2.length() - n2).split(IiIIIiIiiI.ALLATORIxDEMO("`"));
            int n3 = iIiIiIIIII2.length;
            int n4 = n = 3 >> 2;
            while (n4 < n3) {
                Object object = iIiIiIIIII2[n].split(IIiiiIIiIi.ALLATORIxDEMO("\\"));
                if (((String[])object).length == 5 >> 1) {
                    object = object[3 & 4].trim().replace(IiIIIiIiiI.ALLATORIxDEMO("n"), "");
                    String string2 = object[3 >> 1].trim().replace(IIiiiIIiIi.ALLATORIxDEMO("D"), "");
                    if (IiIIIiIiiI.ALLATORIxDEMO(")\u001e\b)").equals(string2) || "false".equals(string2)) {
                        hashMap.put((String)object, Boolean.parseBoolean(string2));
                    } else {
                        HashMap<String, Object> hashMap2 = hashMap;
                        if (string2.matches(IIiiiIIiIi.ALLATORIxDEMO("\u001aJM"))) {
                            hashMap2.put((String)object, Long.parseLong(string2));
                        } else {
                            hashMap2.put((String)object, string2);
                        }
                    }
                }
                n4 = ++n;
            }
            return hashMap;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private /* synthetic */ boolean iIiIiIiIii(String string) {
        boolean bl;
        iIiIiIiiIi iIiIiIiiIi2 = string2;
        String string2 = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            long l = iIiIiIIIII2.ALLATORIxDEMO(string2);
            if (System.currentTimeMillis() - l < 86400000L) {
                return 5 >> 2;
            }
            bl = false;
        }
        catch (Exception exception) {
            return (3 & 4) != 0;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ List<String> ALLATORIxDEMO(String var1_1) {
        var3_2 = this;
        var7_3 = new ArrayList<String>();
        this = new StringBuilder();
        var4_4 = 5 >> 3;
        var5_5 = 3 & 4;
        v0 = var6_6 = 2 & 5;
        while (v0 < iIiIiIIIII.length()) {
            block9: {
                block8: {
                    block7: {
                        var2_7 = iIiIiIIIII.charAt(var6_6);
                        if (var2_7 == (42 & 119)) {
                            if (var6_6 != 0) {
                                if (iIiIiIIIII.charAt(var6_6 - (3 & 5)) == (95 & 124)) break block7;
                            }
                            var4_4 = var4_4 == 0 ? --1 : 0;
                        }
                    }
                    if (var4_4 != 0) ** GOTO lbl-1000
                    if (var2_7 != (127 & 123)) break block8;
                    v1 = this;
                    ++var5_5;
                    ** GOTO lbl45
                }
                if (var2_7 != (125 & 127)) break block9;
                v1 = this;
                --var5_5;
                ** GOTO lbl45
            }
            if (var2_7 == (61 & 110) && var5_5 == 0) {
                var7_3.add(this.toString().trim());
                this = new StringBuilder();
            } else lbl-1000:
            // 2 sources

            {
                v1 = this;
lbl45:
                // 3 sources

                v1.append(var2_7);
            }
            v0 = ++var6_6;
        }
        if (this.length() > 0) {
            var7_3.add(this.toString().trim());
        }
        return var7_3;
    }

    private /* synthetic */ void IIIIiIIiII() {
        iIiIiIiiIi iIiIiIiiIi2 = this;
        try {
            long l = System.currentTimeMillis();
            iIiIiIiiIi iIiIiIiiIi3 = iIiIiIiiIi2;
            iIiIiIiiIi2.iIIiIiiiIi.put(IIiiiIIiIi.ALLATORIxDEMO("6\\\u0003m.K\u0005E9z/C\u0003"), l);
            boolean bl = iIiIiIiiIi3.IIIIiIIiII();
            iIiIiIiiIi3.iIIiIiiiIi.put(IiIIIiIiiI.ALLATORIxDEMO("\u0014\")\t\u001a>4\u0018\u0004\u0013\u000e8<\u0018\b?"), bl);
            bl = iIiIiIiiIi2.ALLATORIxDEMO();
            iIiIiIiiIi3.iIIiIiiiIi.put(IIiiiIIiIi.ALLATORIxDEMO("\"K\u0004{!I\u0003|\u0019J\u0003Z\u0003m2K\u0002"), bl);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private /* synthetic */ boolean IIIIiIIiII() {
        block3: {
            boolean bl;
            iIiIiIiiIi iIiIiIiiIi2 = string;
            try {
                String string = System.getProperty(IIiiiIIiIi.ALLATORIxDEMO("D\u0007x'\u0000\u0010K\u0014}/A\b"));
                String string2 = System.getProperty(IiIIIiIiiI.ALLATORIxDEMO("#\u000eb3\r\u0010)"));
                if (!string.contains(IIiiiIIiIi.ALLATORIxDEMO("\u0002k$[\u0001")) && !string2.contains(IiIIIiIiiI.ALLATORIxDEMO(")\t\u000e8"))) break block3;
                bl = false;
            }
            catch (Exception exception) {
                return (2 & 5) != 0;
            }
            return bl;
        }
        boolean bl = true;
        return bl;
    }

    public boolean iiIIiIIiii() {
        long l;
        block8: {
            block7: {
                boolean bl;
                iIiIiIiiIi iIiIiIiiIi2 = object;
                try {
                    Object object = iIiIiIiiIi2.iIIiIiiiIi.get(IiIIIiIiiI.ALLATORIxDEMO(" 4\u000f\u0018\".\t\")\u0005<4\u001e\u0018?"));
                    if (object != null) break block7;
                    bl = true;
                }
                catch (Exception exception) {
                    return (2 ^ 3) != 0;
                }
                return bl;
            }
            Object object = object;
            if (object instanceof Long) {
                l = (Long)object;
                break block8;
            }
            if (object instanceof String) {
                l = Long.parseLong((String)object);
                break block8;
            }
            boolean bl = true;
            return bl;
        }
        if (System.currentTimeMillis() > l) {
            return --1 != 0;
        }
        boolean bl = false;
        return bl;
    }

    public static String iIiIiiiiii() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(System.getProperty(IIiiiIIiIi.ALLATORIxDEMO("\t]H`'C\u0003"), IiIIIiIiiI.ALLATORIxDEMO("9\u0013'3\u0003\n\"")));
            stringBuilder.append(System.getProperty(IIiiiIIiIi.ALLATORIxDEMO("a5\u0000\u0010K\u0014}/A\b"), IiIIIiIiiI.ALLATORIxDEMO("9\u0013'3\u0003\n\"")));
            stringBuilder.append(System.getProperty(IIiiiIIiIi.ALLATORIxDEMO("3]\u0003\\H`'C\u0003"), IiIIIiIiiI.ALLATORIxDEMO("9\u0013'3\u0003\n\"")));
            stringBuilder.append(Runtime.getRuntime().availableProcessors());
            stringBuilder.append(System.getProperty(IIiiiIIiIi.ALLATORIxDEMO("D\u0007x'\u0000\u0010K\u0014}/A\b"), IiIIIiIiiI.ALLATORIxDEMO("9\u0013'3\u0003\n\"")));
            return iIiIiIiiIi.ALLATORIxDEMO(MessageDigest.getInstance(IIiiiIIiIi.ALLATORIxDEMO("5f'#t\u001bP")).digest(stringBuilder.toString().getBytes(StandardCharsets.UTF_8))).substring(2 & 5, 0x68 & 0x37);
        }
        catch (Exception exception) {
            return "FALLBACK_HWID_" + System.currentTimeMillis();
        }
    }

    public Map<String, Object> iiiIiIiiIi() {
        return (Map)this.iIIiIiiiIi.get(IIiiiIIiIi.ALLATORIxDEMO("\u0010o*G\u0002o2G\t`\u0019\\\u0003]\u0016a(]\u0003"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String IIIIiIIiII(String string, String string2) {
        iIiIiIiiIi iIiIiIiiIi2 = hashMap;
        try {
            void iIiIiIIIII2;
            void iIiIiIIIII3;
            HashMap hashMap = new HashMap();
            void v0 = hashMap.put(IiIIIiIiiI.ALLATORIxDEMO("82\u0007\u0018\""), iIiIiIIIII3);
            HashMap hashMap2 = hashMap;
            hashMap.put(IIiiiIIiIi.ALLATORIxDEMO("\nG\u0005k(]\u0003"), iIiIiIIIII2);
            hashMap2.put(IiIIIiIiiI.ALLATORIxDEMO("5\u001b\u0014("), iIiIiIiiIi2.iIIiIiiiIi.get(IIiiiIIiIi.ALLATORIxDEMO("f1G\u0002")));
            hashMap.put(IiIIIiIiiI.ALLATORIxDEMO("\u0018\u0014!\u0018?)\r\u0010<"), System.currentTimeMillis());
            hashMap.put(IIiiiIIiIi.ALLATORIxDEMO("\u0010K\u0014}/A\b"), IiIIIiIiiI.ALLATORIxDEMO("\u007fs[S~"));
            hashMap.put(IIiiiIIiIi.ALLATORIxDEMO("5G\u0001@\u0007z3\\\u0003"), iIiIiIiiIi2.ALLATORIxDEMO((String)iIiIiIIIII3, (String)iIiIiIIIII2));
            return iIiIiIiiIi2.ALLATORIxDEMO(hashMap2);
        }
        catch (Exception exception) {
            return IiIIIiIiiI.ALLATORIxDEMO("\u00061");
        }
    }

    private /* synthetic */ String iIiIiIiIii() {
        iIiIiIiiIi iIiIiIiiIi2 = stringBuilder;
        try {
            int n;
            Object object;
            String string;
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Runtime.getRuntime().availableProcessors());
            stringBuilder.append(Runtime.getRuntime().maxMemory());
            stringBuilder.append(System.getProperty(IiIIIiIiiI.ALLATORIxDEMO("#\u000eb<\u001e\u001e$"), ""));
            String string3 = iIiIiIiiIi2.iiiiIIIiII();
            if (string3 != null) {
                stringBuilder.append(string3);
            }
            if ((string2 = iIiIiIiiIi2.IIiIiIiIiI()) != null) {
                stringBuilder.append(string2);
            }
            if ((string = iIiIiIiiIi2.iiiIiIiiIi()) != null) {
                stringBuilder.append(string);
            }
            if ((object = iIiIiIiiIi2.ALLATORIxDEMO()) != null) {
                stringBuilder.append((String)object);
            }
            if (stringBuilder.length() < (0x37 & 0x5C)) {
                stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO("+G\bg+o*Q\u000ey9")).append(System.currentTimeMillis() % 1000000L);
            }
            object = MessageDigest.getInstance(IiIIIiIiiI.ALLATORIxDEMO("\u001f5\rp^Hz")).digest(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
            StringBuilder stringBuilder2 = new StringBuilder();
            int n2 = ((Object)object).length;
            int n3 = n = 3 ^ 3;
            while (n3 < n2) {
                Object object2 = object[n];
                String string4 = Integer.toHexString(0x23FF & 0x5CFF & object2);
                if (string4.length() == --1) {
                    stringBuilder2.append((char)(0x7F & 0x30));
                }
                stringBuilder2.append(string4);
                n3 = ++n;
            }
            return stringBuilder2.toString().toUpperCase();
        }
        catch (Exception exception) {
            long l = Runtime.getRuntime().maxMemory();
            int n = Runtime.getRuntime().availableProcessors();
            return "HW_BACKUP_" + Long.toHexString(l + (long)n).toUpperCase();
        }
    }

    public void iiIIiIIiii() {
        this.iIIiIiiiIi.clear();
        this.iIiiiIiIii.clear();
        this.iiiiiIIiIi = 0L;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(String string, String string2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        block5: {
            iIiIiIiiIi iIiIiIiiIi2 = this;
            if (iIiIiIIIII3 != null && iIiIiIIIII2 != null) break block5;
            int n = 0;
            return n;
        }
        try {
            int n = 0;
            int n2 = Math.min(iIiIiIIIII3.length(), iIiIiIIIII2.length());
            int n3 = this = 3 & 4;
            while (n3 < n2) {
                if (iIiIiIIIII3.charAt(this) == iIiIiIIIII2.charAt(this)) {
                    ++n;
                }
                n3 = ++this;
            }
            return n * (0x66 & 0x7D) / Math.max(iIiIiIIIII3.length(), iIiIiIIIII2.length());
        }
        catch (Exception exception) {
            return 2 & 5;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiIIiIIiii(String string, String string2) {
        void iIiIiIIIII2;
        iIiIiIiiIi iIiIiIIIII3;
        block4: {
            boolean bl;
            iIiIiIiiIi iIiIiIiiIi2 = string3;
            String string3 = string2;
            iIiIiIIIII3 = iIiIiIiiIi2;
            try {
                if (iIiIiIIIII2 != null && string3 != null) break block4;
                bl = false;
            }
            catch (Exception exception) {
                return 3 >> 2;
            }
            return bl;
        }
        if (iIiIiIIIII3.ALLATORIxDEMO((String)iIiIiIIIII2, string3) >= (0x57 & 0x7D)) {
            return --1 != 0;
        }
        boolean bl = false;
        return bl;
    }

    private /* synthetic */ String iiIIiIIiii(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = object;
        Object object = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            int n;
            object = ((String)object).replace(IIiiiIIiIi.ALLATORIxDEMO("K"), "");
            int n2 = 3 ^ 3;
            int n3 = n = 3 ^ 3;
            while (n3 < ((String)object).length()) {
                char c = ((String)object).charAt(n);
                int n4 = n + --1;
                n2 += c * n4;
                n3 = ++n;
            }
            Object[] objectArray = new Object[5 >> 2];
            objectArray[3 >> 2] = n2;
            return String.format(IiIIIiIiiI.ALLATORIxDEMO("x\\E\u0014"), objectArray);
        }
        catch (Exception this2) {
            return IIiiiIIiIi.ALLATORIxDEMO("\u001eV\u001eV>v\u001eV");
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(Map<String, Object> map) {
        iIiIiIiiIi iIiIiIiiIi2 = object;
        Object object = map;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            iIiIiIIIII2.iIIiIiiiIi.put(IIiiiIIiIi.ALLATORIxDEMO("\u0005@]\u0012Q)@\ng(K9x'B\u000fJ\u0007z/A\b"), System.currentTimeMillis());
            iIiIiIIIII2.iIIiIiiiIi.put(IiIIIiIiiI.ALLATORIxDEMO(":<\u0000\u0014(<\u0018\u0014#33\u000f)\u000e<2\u0002\u000e)"), object);
            iIiIiIIIII2.ALLATORIxDEMO(5 >> 2);
            Object v = object.get(IIiiiIIiIi.ALLATORIxDEMO("\u0003V\u0016g4K\u0015"));
            if (v != null) {
                iIiIiIIIII2.iIIiIiiiIi.put(IiIIIiIiiI.ALLATORIxDEMO(" 4\u000f\u0018\".\t\")\u0005<4\u001e\u0018?"), v);
            }
            if ((object = object.get(IIiiiIIiIi.ALLATORIxDEMO("{5K\u0014"))) != null) {
                iIiIiIIIII2.iIIiIiiiIi.put(IiIIIiIiiI.ALLATORIxDEMO("\u0019\u000e)\u000f\u00134\u0002\u001b#"), object);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiiIiIiiIi(String string, String string2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iIiIiIiiIi iIiIiIiiIi2 = string3;
        try {
            iIiIiIiiIi iIiIiIiiIi3 = iIiIiIiiIi2;
            String string3 = iIiIiIiiIi3.IIiIiIiiii();
            String string4 = iIiIiIiiIi3.IIIIiIIiII((String)iIiIiIIIII3, (String)iIiIiIIIII2);
            return iIiIiIiiIi3.IIIIiIIiII(iIiIiIiiIi3.iiIIiIIiii(string3, string4));
        }
        catch (Exception exception) {
            return iIiIiIiiIi2.IIiIiIiIiI((String)iIiIiIIIII3, (String)iIiIiIIIII2);
        }
    }

    private /* synthetic */ String IIiIiIiIiI() {
        iIiIiIiiIi iIiIiIiiIi2 = string;
        try {
            String string = System.getProperty(IiIIIiIiiI.ALLATORIxDEMO("#\u000eb3\r\u0010)"), "").toLowerCase();
            if (string.contains(IIiiiIIiIi.ALLATORIxDEMO("\u0011G\bj)Y\u0015"))) {
                return iIiIiIiiIi2.ALLATORIxDEMO(IiIIIiIiiI.ALLATORIxDEMO("\u0007,\u0019\"[)\t;Hd\u00199>\u0018]+8\u0018]9(\u0005\u0019lR:<\u0000\b)"));
            }
            if (string.contains(IIiiiIIiIi.ALLATORIxDEMO("\ng([\u001e"))) {
                return iIiIiIiiIi2.ALLATORIxDEMO(IiIIIiIiiI.ALLATORIxDEMO("Yj\u0001d_2\t2T)\u0016*IxR(0\u0005R%9C\r>2\b\b/\t\u0013(\u0019\u0014("));
            }
            if (string.contains(IIiiiIIiIi.ALLATORIxDEMO("+O\u0005"))) {
                return iIiIiIiiIi2.ALLATORIxDEMO(IiIIIiIiiI.ALLATORIxDEMO("9\u00195_lYe\u000f(NnL3Y\u00012\u001c\u0013/\u00156Uy\u0018\u0001\b1\u00153\u000f\u000e\u001f=Sh\u0018l!L\u001a>8\u001c]a\u0018LZd(\u0019\u0014(Tk"));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private /* synthetic */ String iiiiIIIiII() {
        iIiIiIiiIi iIiIiIiiIi2 = object;
        try {
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {
                int n;
                byte[] byArray = enumeration.nextElement().getHardwareAddress();
                Object object = byArray;
                if (byArray == null || ((Object)object).length <= 0) continue;
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = ((Object)object).length;
                int n3 = n = 5 >> 3;
                while (n3 < n2) {
                    Object object2 = object[n];
                    Object[] objectArray = new Object[3 & 5];
                    objectArray[5 >> 3] = (byte)object2;
                    stringBuilder.append(String.format(IIiiiIIiIi.ALLATORIxDEMO("+v\u001c>"), objectArray));
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

    private /* synthetic */ Map<String, Object> ALLATORIxDEMO(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = iterator;
        Iterator iterator = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            if (iterator == null || ((String)((Object)iterator)).trim().isEmpty()) {
                return null;
            }
            if (!((String)((Object)(iterator = ((String)((Object)iterator)).trim()))).startsWith(IiIIIiIiiI.ALLATORIxDEMO("7")) || !((String)((Object)iterator)).endsWith(IIiiiIIiIi.ALLATORIxDEMO("\u001b"))) {
                return null;
            }
            int n = --1;
            if (((String)((Object)(iterator = ((String)((Object)iterator)).substring(n, ((String)((Object)iterator)).length() - n).trim()))).isEmpty()) {
                return hashMap;
            }
            iterator = iIiIiIIIII2.ALLATORIxDEMO((String)((Object)iterator)).iterator();
            while (iterator.hasNext()) {
                Object object = (String[])iterator.next();
                object = iIiIiIIIII2.ALLATORIxDEMO((String)object);
                if (((String[])object).length != --2) continue;
                iIiIiIiiIi iIiIiIiiIi3 = iIiIiIIIII2;
                String string2 = iIiIiIiiIi3.IIIIiIIiII(object[5 >> 3]);
                object = iIiIiIiiIi3.ALLATORIxDEMO(object[--1].trim());
                hashMap.put(string2, object);
            }
            return hashMap;
        }
        catch (Exception exception) {
            System.err.println("JSON\u89e3\u6790\u9519\u8bef: " + exception.getMessage());
            return null;
        }
    }

    private /* synthetic */ AuthenticationObfuscator.LicenseStatus ALLATORIxDEMO(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = string2;
        String string2 = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            int this_ = Math.abs(string2.hashCode()) % AuthenticationObfuscator.LicenseStatus.values().length;
            if (this_ <= --4) {
                return AuthenticationObfuscator.LicenseStatus.iIiIiIIIII;
            }
            return AuthenticationObfuscator.LicenseStatus.values()[this_];
        }
        catch (Exception exception) {
            return AuthenticationObfuscator.LicenseStatus.iIIiiIiIiI;
        }
    }

    private /* synthetic */ long ALLATORIxDEMO(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = string2;
        String string2 = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            int this_ = string2.hashCode();
            return System.currentTimeMillis() - (long)Math.abs(this_ % 86400000);
        }
        catch (Exception this_) {
            return System.currentTimeMillis();
        }
    }

    private /* synthetic */ String iiiIiIiiIi(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = object;
        try {
            byte[] iIiIiIIIII2;
            iIiIiIIIII2 = Base64.getDecoder().decode((String)iIiIiIIIII2);
            Object object = Cipher.getInstance(IiIIIiIiiI.ALLATORIxDEMO("<\t\u000eC8\u000f\u001fC-\u0007\u001e?H\u001c\u001c(9\u0005\u0013+"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(iIiIiIIIII, IIiiiIIiIi.ALLATORIxDEMO("\u0007k5"));
            Object object2 = object;
            ((Cipher)object2).init(--2, secretKeySpec);
            object = ((Cipher)object2).doFinal(iIiIiIIIII2);
            return new String((byte[])object, StandardCharsets.UTF_8);
        }
        catch (Exception iIiIiIIIII2) {
            return "DECRYPTED_TOKEN_" + System.currentTimeMillis();
        }
    }

    private /* synthetic */ String iiIIiIIiii(String string, String string2) {
        iIiIiIiiIi iIiIiIiiIi2 = hashMap;
        HashMap<String, Object> hashMap = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(0x6C & 0x77, 0x47EA & 0x3BFD));
            HashMap<String, Object> hashMap2 = hashMap = new HashMap<String, Object>();
            hashMap.put(IIiiiIIiIi.ALLATORIxDEMO("]\u0012o2[\u0015"), IiIIIiIiiI.ALLATORIxDEMO("?\b/>\t\u000e?"));
            hashMap2.put(IIiiiIIiIi.ALLATORIxDEMO("\u0010o*G\u0002"), (3 & 5) != 0);
            hashMap.put(IiIIIiIiiI.ALLATORIxDEMO(")\u0005<4\u001e\u0018?"), System.currentTimeMillis() + 2592000000L);
            String[] stringArray = new String[--3];
            stringArray[3 ^ 3] = IiIIIiIiiI.ALLATORIxDEMO("/\t\u001c(");
            stringArray[3 >> 1] = IIiiiIIiIi.ALLATORIxDEMO("\u0011|/Z\u0003");
            stringArray[--2] = IiIIIiIiiI.ALLATORIxDEMO(")\u0005)>\u0019\t)");
            hashMap2.put(IIiiiIIiIi.ALLATORIxDEMO("\u0016k4C\u000f]\u0015g)@\u0015"), Arrays.asList(stringArray));
            hashMap.put(IIiiiIIiIi.ALLATORIxDEMO("\u0015k4X\u0003\\9z/C\u0003"), System.currentTimeMillis());
            return iIiIiIIIII2.ALLATORIxDEMO(hashMap);
        }
        catch (Exception this2) {
            return IiIIIiIiiI.ALLATORIxDEMO("\u000ef\u00035\u00115\u000e9Xq\u0018n\u000f>2\u001e_`\u007f\u001a\u001c 4\b_v\u001b-1\u001f\u00181");
        }
    }

    private /* synthetic */ String IIIIiIIiII() {
        iIiIiIiiIi iIiIiIiiIi2 = object;
        try {
            int n;
            Object object = new byte[6];
            iIiIiIiiIi2.iIIiiIiIiI.nextBytes((byte[])object);
            StringBuilder stringBuilder = new StringBuilder();
            int n2 = n = 5 >> 3;
            while (n2 < ((Object)object).length) {
                Object[] objectArray = new Object[4 ^ 5];
                objectArray[3 & 4] = (byte)object[n];
                stringBuilder.append(String.format(IiIIIiIiiI.ALLATORIxDEMO("x\\O\u0014"), objectArray));
                if (n < ((Object)object).length - --1) {
                    stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO("\\"));
                }
                n2 = ++n;
            }
            return stringBuilder.toString();
        }
        catch (Exception exception) {
            return IiIIIiIiiI.ALLATORIxDEMO("\\Mvm\\G|mVM|G|mVM|");
        }
    }

    public void iiiIiIiiIi() {
        iIiIiIiiIi iIiIiIiiIi2 = this;
        iIiIiIiiIi2.IiiIiIiiIi = 3 >> 2;
        iIiIiIiiIi2.iiIIiIIiii();
        iIiIiIiiIi2.ALLATORIxDEMO();
    }

    private /* synthetic */ boolean IIiIiIiIiI(String string) {
        Object object;
        block3: {
            boolean bl;
            iIiIiIiiIi iIiIiIiiIi2 = object;
            object = string;
            iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
            try {
                if (((String)object).length() >= (0x54 & 0x3F)) break block3;
                bl = false;
            }
            catch (Exception exception) {
                return 3 >> 2;
            }
            return bl;
        }
        String string2 = iIiIiIiiIi.ALLATORIxDEMO(MessageDigest.getInstance(IiIIIiIiiI.ALLATORIxDEMO("\u001f5\rp^Hz")).digest(((String)object).getBytes(StandardCharsets.UTF_8))).substring(2 & 5, 0x35 & 0x5A);
        Object object2 = object;
        object = ((String)object2).substring(((String)object2).length() - (0x73 & 0x1C));
        return string2.equals(object);
    }

    static {
        String[] stringArray = new String[--3];
        stringArray[3 & 4] = IIiiiIIiIi.ALLATORIxDEMO("\u000eX\u0010B\t\u0010M\u0001\u0007Y\u0010ZT\u001aDE\u001bQ\u000e\u000e\u0007A\u0003L\u000f\u001aD\u0000\u0005a+\u0001\u0007~/\u0001\u0010<iX\u0007B\u000fj'Z\u0003");
        stringArray[3 & 5] = IiIIIiIiiI.ALLATORIxDEMO("8\r<\r?EaN&_y\u001c\"\u0019\"\u00115\u0012%\u0014eJy\u0018!4\u0019\u0010a<\u0019\t$s\u0002\u00188R/5\t\u001e'");
        stringArray[5 >> 1] = IIiiiIIiIi.ALLATORIxDEMO("D\u0010F\nYX\u0001I@\rQ\u001f\u0007RC@F\u0005W\u000eZ\u0010[\b\u001aD\u0003\u0015k%[\u0014g2WHa4IIX\u0003|/H\u001f");
        IIiIiIIiii = stringArray;
        byte[] byArray = new byte[0x71 & 0x1E];
        byArray[5 >> 3] = 0x5E & 0x6B;
        byArray[--1] = 0x7B & 0x7F;
        byArray[5 >> 1] = 0x3D & 0x6E;
        byArray[--3] = 0x3D & 0x5F;
        byArray[--4] = 0x7F & 0x1E;
        byArray[--5] = 0x3F & 0x7F;
        byArray[0x47 & 0x3E] = 0x7B & 0x3E;
        byArray[0x57 & 0x2F] = 0x6B & 0x7F;
        byArray[0x7F & 8] = 0x7E & 0x5D;
        byArray[0x49 & 0x3F] = 0x5D & 0x2F;
        byArray[0x2E & 0x5B] = 0x7E & 0x7F;
        byArray[0x4B & 0x3F] = 0x4F & 0x7F;
        byArray[0x5D & 0x2E] = 0x2B & 0x7E;
        byArray[0x4D & 0x3F] = 0x3F & 0x6B;
        byArray[0x3F & 0x4E] = 0x5F & 0x6C;
        byArray[0x1F & 0x6F] = 0x7F & 0x1D;
        iIiIiIIIII = byArray;
        IIIIiiIiii = Pattern.compile(IiIIIiIiiI.ALLATORIxDEMO("\u00037<a\u001b\\Pu 7n^\u0000h"));
        iIiIiiiiII = Pattern.compile(IIiiiIIiIi.ALLATORIxDEMO("$Az\u0016C\u001a*\u000e-u\u001b\u001b\u001c2\u001b\u0003;'=\u001b\u001b&\u001d\u001eK7\u0007\u0003 s\u001d<;\u0007B"));
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiIiIiiIi iIiIiIiiIi2 = string;
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(0x65 & 0x7E, 0x1BFF & 0x65F4));
            String string = iIiIiIiiIi.iIiIiiiiii();
            iIiIiIiiIi iIiIiIiiIi3 = iIiIiIiiIi2;
            iIiIiIiiIi2.iIIiIiiiIi.put(IiIIIiIiiI.ALLATORIxDEMO("5\u001b\u0014("), string);
            String string2 = iIiIiIiiIi3.IIIIiIIiII();
            iIiIiIiiIi3.iIIiIiiiIi.put(IIiiiIIiIi.ALLATORIxDEMO("+O\u0005"), string2);
            long l = System.currentTimeMillis();
            iIiIiIiiIi2.iIIiIiiiIi.put(IiIIIiIiiI.ALLATORIxDEMO("\u0005\u0013%\t\u0013)\u0005\u0010)"), l);
            iIiIiIiiIi2.IIIIiIIiII();
            iIiIiIiiIi3.IiiIiIiiIi = 5 >> 2;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public String iiIIiIIiii() {
        return (String)this.iIIiIiiiIi.get(IiIIIiIiiI.ALLATORIxDEMO("5\u001b\u0014("));
    }

    private /* synthetic */ boolean iiiiIIIiII(String string) {
        iIiIiIiiIi iIiIiIIIII2;
        Object object;
        block9: {
            block8: {
                boolean bl;
                block11: {
                    block10: {
                        iIiIiIiiIi iIiIiIiiIi2 = object;
                        object = string;
                        iIiIiIIIII2 = iIiIiIiiIi2;
                        if (object == null) break block10;
                        if (((String)object).length() == (0x3D & 0x5F)) break block11;
                    }
                    return false;
                }
                try {
                    if (((String)object).matches(IIiiiIIiIi.ALLATORIxDEMO("8h:\u0002=\u0002W\u001c0\u0012\u0014WOu'\u0001>\u0002W\u0013?USQIi;D{\u0016C\u001a6X^UMr D{\u001eK7\u001bUSsku'#\u001c\u001eK\u0017;urSB"))) break block8;
                    bl = false;
                }
                catch (Exception exception) {
                    return 3 >> 2;
                }
                return bl;
            }
            iIiIiIiiIi iIiIiIiiIi3 = iIiIiIIIII2;
            String string2 = iIiIiIiiIi3.iiIIiIIiii((String)object);
            if (iIiIiIiiIi3.IIIIiIIiII((String)object, string2)) break block9;
            boolean bl = false;
            return bl;
        }
        object = iIiIiIIIII2.ALLATORIxDEMO((String)object);
        if (object == AuthenticationObfuscator.LicenseStatus.iIiIiIIIII || object == AuthenticationObfuscator.LicenseStatus.IIIIiiIiii) {
            return true;
        }
        boolean bl = false;
        return bl;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(HttpResponse<String> httpResponse) {
        block13: {
            Object object;
            iIiIiIiiIi iIiIiIIIII2;
            block11: {
                Object object2;
                block12: {
                    block10: {
                        block9: {
                            block8: {
                                boolean bl;
                                iIiIiIiiIi iIiIiIiiIi2 = object3;
                                Object object3 = httpResponse;
                                iIiIiIIIII2 = iIiIiIiiIi2;
                                try {
                                    if (object3.statusCode() == (0x3BE9 & 0x44DE)) break block8;
                                    System.err.println("\u670d\u52a1\u5668\u8fd4\u56de\u9519\u8bef\u72b6\u6001\u7801: " + object3.statusCode());
                                    bl = false;
                                }
                                catch (Exception this2) {
                                    System.err.println("\u89e3\u6790\u54cd\u5e94\u65f6\u53d1\u751f\u9519\u8bef: " + this2.getMessage());
                                    return 3 >> 2;
                                }
                                return bl;
                            }
                            object3 = (String)object3.body();
                            if (object3 != null && !((String)object3).trim().isEmpty()) break block9;
                            System.err.println(IIiiiIIiIi.ALLATORIxDEMO("\u6723\u52c7\u5646\u8fb2\u56d0\u7a3c\u54e3\u5ef2"));
                            boolean bl = false;
                            return bl;
                        }
                        object = iIiIiIIIII2.ALLATORIxDEMO((String)object3);
                        if (object != null) break block10;
                        System.err.println(IiIIIiIiiI.ALLATORIxDEMO("\u658c\u6ca8\u89af\u67ed\u6741\u52fc\u5604\u54b0\u5ed8"));
                        boolean bl = false;
                        return bl;
                    }
                    object2 = object.get(IIiiiIIiIi.ALLATORIxDEMO("\u0015[\u0005m#]\u0015"));
                    if (!(object2 instanceof Boolean)) break block11;
                    boolean bl = (Boolean)object2;
                    if (!bl) break block12;
                    iIiIiIIIII2.ALLATORIxDEMO((Map<String, Object>)object);
                    boolean bl2 = true;
                    return bl2;
                }
                object2 = (String)object.get(IiIIIiIiiI.ALLATORIxDEMO("!\u0018?.\r\u001a)"));
                System.err.println("\u9a8c\u8bc1\u5931\u8d25: " + (object2 != null ? object2 : IIiiiIIiIi.ALLATORIxDEMO("\u6724\u77a3\u9537\u8b89")));
                boolean bl = false;
                return bl;
            }
            Object v = object.get(IiIIIiIiiI.ALLATORIxDEMO("\u000e8<\u0018\b?"));
            if (!IIiiiIIiIi.ALLATORIxDEMO("\u0015[\u0005m#]\u0015").equals(v) && !"ok".equals(v)) break block13;
            iIiIiIIIII2.ALLATORIxDEMO((Map<String, Object>)object);
            boolean bl = true;
            return bl;
        }
        boolean bl = false;
        return bl;
    }

    private /* synthetic */ boolean IIIIiIIiII(String string) {
        block9: {
            Object object;
            Map<String, Object> iIiIiIIIII22;
            block8: {
                block7: {
                    block6: {
                        boolean bl;
                        iIiIiIiiIi iIiIiIiiIi2 = object;
                        try {
                            iIiIiIIIII22 = iIiIiIiiIi2.iiiIiIiiIi((String)((Object)iIiIiIIIII22));
                            if (iIiIiIIIII22 != null) break block6;
                            bl = false;
                        }
                        catch (Exception iIiIiIIIII22) {
                            return (3 ^ 3) != 0;
                        }
                        return bl;
                    }
                    object = (String)iIiIiIIIII22.get(IIiiiIIiIi.ALLATORIxDEMO("]\u0012o2[\u0015"));
                    if (IiIIIiIiiI.ALLATORIxDEMO("?\b/>\t\u000e?").equals(object)) break block7;
                    boolean bl = false;
                    return bl;
                }
                object = (Boolean)iIiIiIIIII22.get(IIiiiIIiIi.ALLATORIxDEMO("\u0010o*G\u0002"));
                if (object != null && ((Boolean)object).booleanValue()) break block8;
                boolean bl = false;
                return bl;
            }
            object = (Long)iIiIiIIIII22.get(IiIIIiIiiI.ALLATORIxDEMO(")\u0005<4\u001e\u0018?"));
            if (object != null && (Long)object >= System.currentTimeMillis()) break block9;
            boolean bl = false;
            return bl;
        }
        boolean bl = true;
        return bl;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(long iIiIiIIIII2) {
        boolean bl;
        try {
            long l = 1577836800000L;
            long l2 = System.currentTimeMillis() + 31536000000L;
            if (iIiIiIIIII2 >= l && iIiIiIIIII2 <= l2) {
                return --1 != 0;
            }
            bl = false;
        }
        catch (Exception exception) {
            return (2 & 5) != 0;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String iiiIiIiiIi(String string, String string2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iIiIiIiiIi iIiIiIiiIi2 = hashMap;
        try {
            HashMap<String, void> hashMap = new HashMap<String, void>();
            hashMap.put(IIiiiIIiIi.ALLATORIxDEMO("-K\u001f"), iIiIiIIIII3);
            hashMap.put(IiIIIiIiiI.ALLATORIxDEMO("5\u001b\u0014("), iIiIiIIIII2);
            hashMap.put(IIiiiIIiIi.ALLATORIxDEMO("2G\u000bK\u0015z'C\u0016"), (void)String.valueOf(System.currentTimeMillis()));
            StringBuilder stringBuilder = new StringBuilder(IiIIIiIiiI.ALLATORIxDEMO("7"));
            int n = 5 >> 2;
            Iterator iterator = hashMap.entrySet().iterator();
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                Map.Entry entry = iterator.next();
                if (n == 0) {
                    stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO("J"));
                }
                stringBuilder.append(IiIIIiIiiI.ALLATORIxDEMO("n")).append((String)entry.getKey()).append(IIiiiIIiIi.ALLATORIxDEMO("\f\\")).append(IiIIIiIiiI.ALLATORIxDEMO("n")).append((String)entry.getValue()).append(IIiiiIIiIi.ALLATORIxDEMO("D"));
                n = 3 ^ 3;
                iterator2 = iterator;
            }
            StringBuilder stringBuilder2 = stringBuilder;
            stringBuilder2.append(IiIIIiIiiI.ALLATORIxDEMO("1"));
            return stringBuilder2.toString();
        }
        catch (Exception exception) {
            return "{\"key\":\"" + (String)iIiIiIIIII3 + "\",\"hwid\":\"" + (String)iIiIiIIIII2 + "\"}";
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String[] ALLATORIxDEMO(String string) {
        int n;
        void iIiIiIIIII2;
        int n2;
        block8: {
            iIiIiIiiIi iIiIiIiiIi2 = this;
            n2 = -4 >> 2;
            int n3 = 3 >> 2;
            int n4 = this = 3 & 4;
            while (n4 < iIiIiIIIII2.length()) {
                char c;
                block7: {
                    c = iIiIiIIIII2.charAt(this);
                    if (c == (0x73 & 0x2E)) {
                        if (this != 0) {
                            if (iIiIiIIIII2.charAt(this - (3 >> 1)) == (0x5E & 0x7D)) break block7;
                        }
                        n3 = n3 == 0 ? 4 ^ 5 : 0;
                    }
                }
                if (n3 == 0) {
                    if (c == (0x3A & 0x7F)) {
                        n = n2 = this;
                        break block8;
                    }
                }
                n4 = ++this;
            }
            n = n2;
        }
        if (n == -1) {
            String[] stringArray = new String[--1];
            stringArray[5 >> 3] = iIiIiIIIII2;
            return stringArray;
        }
        String[] stringArray = new String[2];
        int n5 = 5 >> 3;
        stringArray[n5] = iIiIiIIIII2.substring(n5, n2).trim();
        int n6 = 3 >> 1;
        stringArray[n6] = iIiIiIIIII2.substring(n2 + n6).trim();
        return stringArray;
    }

    public iIiIiIiiIi() {
        iIiIiIiiIi iIiIiIiiIi2 = this;
        iIiIiIiiIi2.IiiIiIiiIi = 5 >> 3;
        iIiIiIiiIi2.iiiiiIIiIi = 0L;
        iIiIiIiiIi iIiIiIiiIi3 = this;
        this.iIIiiIiIiI = new SecureRandom();
        iIiIiIiiIi iIiIiIiiIi4 = this;
        iIiIiIiiIi3.iIIiIiiiIi = new HashMap<String, Object>();
        iIiIiIiiIi iIiIiIiiIi5 = this;
        this.iIiiiIiIii = new ArrayList<String>();
        this.ALLATORIxDEMO();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiiiIIiIi.ALLATORIxDEMO("y\r\f@]\u0003.3^\u0002o2KG.\u8bb1\u66da\u65d6\u521e\u6766\u65be\u720e\u6702\uff67"));
        }
    }

    private /* synthetic */ String iiiIiIiiIi() {
        try {
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            return dimension.width + "x" + dimension.height;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private /* synthetic */ String ALLATORIxDEMO() {
        iIiIiIiiIi iIiIiIiiIi2 = string;
        try {
            String string = System.getProperty(IIiiiIIiIi.ALLATORIxDEMO("\t]H`'C\u0003"), "").toLowerCase();
            if (string.contains(IiIIIiIiiI.ALLATORIxDEMO(";\u0014\"9\u0003\n?"))) {
                return iIiIiIiiIi2.ALLATORIxDEMO(IIiiiIIiIi.ALLATORIxDEMO("[\t[\u0019IEO\u001dH\u000fQ\u0002^\u0005\t\u0006\fU\u000e\u0015k4G\u0007b([\u000bl#\\F\u0001\u0010o*[\u0003"));
            }
            if (string.contains(IiIIIiIiiI.ALLATORIxDEMO(" 4\u0002\b4"))) {
                return iIiIiIiiIi2.ALLATORIxDEMO(IIiiiIIiIi.ALLATORIxDEMO("B\u0015l*EF#(AF}#\\\u000fo*"));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    public Map<String, Object> ALLATORIxDEMO() {
        iIiIiIiiIi iIiIiIiiIi2 = hashMap;
        HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
        Boolean bl = hashMap.put(IIiiiIIiIi.ALLATORIxDEMO("\u000f`/Z\u000fO\ng<K\u0002"), iIiIiIiiIi2.IiiIiIiiIi);
        HashMap<String, Boolean> hashMap2 = hashMap;
        hashMap.put(IiIIIiIiiI.ALLATORIxDEMO(" <\u001f\t\u0013+\r\u0011%\u0019-)\u0005\u0012\""), (Boolean)((Object)Long.valueOf(iIiIiIiiIi2.iiiiiIIiIi)));
        hashMap2.put(IIiiiIIiIi.ALLATORIxDEMO("X\u0007b/J\u0007z/A\bq\u0005a3@\u0012"), (Boolean)((Object)Integer.valueOf(iIiIiIiiIi2.iIiiiIiIii.size())));
        hashMap.put(IiIIIiIiiI.ALLATORIxDEMO("5\u001b\u0014("), (Boolean)iIiIiIiiIi2.iIIiIiiiIi.get(IIiiiIIiIi.ALLATORIxDEMO("f1G\u0002")));
        hashMap.put(IiIIIiIiiI.ALLATORIxDEMO("\u0001\u001c/"), (Boolean)iIiIiIiiIi2.iIIiIiiiIi.get(IIiiiIIiIi.ALLATORIxDEMO("+O\u0005")));
        hashMap.put(IiIIIiIiiI.ALLATORIxDEMO("\u0014\")\t\u001a>4\u0018\u0004\u0013\u000e8<\u0018\b?"), (Boolean)iIiIiIiiIi2.iIIiIiiiIi.get(IIiiiIIiIi.ALLATORIxDEMO("G\bz#I\u0014g2W9]\u0012o2[\u0015")));
        hashMap.put(IiIIIiIiiI.ALLATORIxDEMO("\b\u0018.(\u000b\u001a)/3\u0019)\t)>\u0018\u0018("), (Boolean)iIiIiIiiIi2.iIIiIiiiIi.get(IIiiiIIiIi.ALLATORIxDEMO("\"K\u0004{!I\u0003|\u0019J\u0003Z\u0003m2K\u0002")));
        return hashMap2;
    }

    public boolean iiIIiIIiii(String string) {
        boolean bl;
        iIiIiIiiIi iIiIiIiiIi2 = string2;
        String string2 = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        if (!iIiIiIIIII2.IiiIiIiiIi) {
            return (3 & 4) != 0;
        }
        try {
            if (iIiIiIIIII2.iiiiIIIiII(string2) && iIiIiIIIII2.iiiiIIIiII()) {
                return (4 ^ 5) != 0;
            }
            bl = false;
        }
        catch (Exception exception) {
            return (2 & 5) != 0;
        }
        return bl;
    }

    private /* synthetic */ boolean iiiIiIiiIi(String string) {
        boolean bl;
        iIiIiIiiIi iIiIiIiiIi2 = string2;
        String string2 = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            if (iIiIiIIIII2.ALLATORIxDEMO(string2) >= --3) {
                return (2 ^ 3) != 0;
            }
            bl = false;
        }
        catch (Exception exception) {
            return 5 >> 3;
        }
        return bl;
    }

    private /* synthetic */ String ALLATORIxDEMO(Map<String, Object> map) {
        iIiIiIiiIi iIiIiIiiIi2 = stringBuilder;
        try {
            Iterator iIiIiIIIII2;
            StringBuilder stringBuilder = new StringBuilder(IIiiiIIiIi.ALLATORIxDEMO("\u001d"));
            int n = --1;
            Iterator iterator = iIiIiIIIII2 = iIiIiIIIII2.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iIiIiIIIII2.next();
                if (n == 0) {
                    stringBuilder.append(IiIIIiIiiI.ALLATORIxDEMO("`"));
                }
                stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO("D")).append((String)entry.getKey()).append(IiIIIiIiiI.ALLATORIxDEMO("_v"));
                entry = entry.getValue();
                if (entry instanceof String) {
                    stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO("D")).append(entry).append(IiIIIiIiiI.ALLATORIxDEMO("n"));
                } else if (entry instanceof List) {
                    stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO("="));
                    List list = (List)((Object)entry);
                    int n2 = 2 & 5;
                    while (n2 < list.size()) {
                        int n3;
                        if (n3 > 0) {
                            stringBuilder.append(IiIIIiIiiI.ALLATORIxDEMO("`"));
                        }
                        StringBuilder stringBuilder2 = stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO("D")).append(list.get(n3));
                        stringBuilder2.append(IiIIIiIiiI.ALLATORIxDEMO("n"));
                        n2 = ++n3;
                    }
                    stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO(";"));
                } else {
                    stringBuilder.append(entry);
                }
                n = 0;
                iterator = iIiIiIIIII2;
            }
            StringBuilder stringBuilder3 = stringBuilder;
            stringBuilder3.append(IiIIIiIiiI.ALLATORIxDEMO("1"));
            return stringBuilder3.toString();
        }
        catch (Exception exception) {
            return IIiiiIIiIi.ALLATORIxDEMO("U\u001b");
        }
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        block5: {
            long l;
            block4: {
                boolean bl;
                try {
                    l = System.currentTimeMillis();
                    long l2 = this.iiiiiIIiIi;
                    if (l2 <= 0L || l - l2 >= 1000L) break block4;
                    bl = false;
                }
                catch (Exception exception) {
                    return (3 & 4) != 0;
                }
                return bl;
            }
            if (this.ALLATORIxDEMO(l)) break block5;
            boolean bl = false;
            return bl;
        }
        boolean bl = true;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(String string, String string2) {
        iIiIiIiiIi iIiIiIiiIi2 = object;
        Object object = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            void iIiIiIIIII3;
            object = (String)object + (String)iIiIiIIIII3 + ALLATORIxDEMO;
            return iIiIiIiiIi.ALLATORIxDEMO(MessageDigest.getInstance(IIiiiIIiIi.ALLATORIxDEMO("5f'#t\u001bP")).digest(((String)object).getBytes(StandardCharsets.UTF_8))).substring(3 & 4, 0x3C & 0x63);
        }
        catch (Exception this2) {
            return IiIIIiIiiI.ALLATORIxDEMO("\u001b-1\u0000\u001f->\u0007\u0002?4\u000b3\r\t9/\t");
        }
    }

    private /* synthetic */ Object ALLATORIxDEMO(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = object;
        Object object = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        if (object == null) {
            return null;
        }
        if ("null".equals(object = ((String)object).trim())) {
            return null;
        }
        if (IiIIIiIiiI.ALLATORIxDEMO(")\u001e\b)").equals(object)) {
            return 3 >> 1;
        }
        if ("false".equals(object)) {
            return (3 & 4) != 0;
        }
        if (((String)object).matches(IIiiiIIiIi.ALLATORIxDEMO("K1\u001aJM"))) {
            try {
                return Long.parseLong((String)object);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        if (((String)object).matches(IiIIIiIiiI.ALLATORIxDEMO("pS!(V\u0010s0\u0019g"))) {
            try {
                return Double.parseDouble((String)object);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        if (((String)object).startsWith(IIiiiIIiIi.ALLATORIxDEMO("D")) && ((String)object).endsWith(IiIIIiIiiI.ALLATORIxDEMO("n"))) {
            Object object2 = object;
            return ((String)object2).substring(5 >> 2, ((String)object2).length() - (4 ^ 5));
        }
        return object;
    }

    private /* synthetic */ String ALLATORIxDEMO(String string) {
        iIiIiIiiIi iIiIiIiiIi2 = this;
        try {
            String[] stringArray;
            Process iIiIiIIIII2;
            iIiIiIIIII2 = Runtime.getRuntime().exec((String)((Object)iIiIiIIIII2));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(iIiIiIIIII2.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            block2: while (true) {
                BufferedReader bufferedReader2 = bufferedReader;
                while ((this = bufferedReader2.readLine()) != null) {
                    if (((String)(this = ((String)this).trim())).isEmpty()) continue block2;
                    if (((String)this).contains(IiIIIiIiiI.ALLATORIxDEMO("q"))) {
                        stringArray = ((String)this).split(IIiiiIIiIi.ALLATORIxDEMO("["), 1 ^ 3);
                        if (stringArray.length <= 5 >> 2) continue block2;
                        if (stringArray[4 ^ 5].trim().isEmpty()) continue block2;
                        stringBuilder.append(stringArray[--1].trim());
                        continue block2;
                    }
                    stringBuilder.append((String)this);
                    bufferedReader2 = bufferedReader;
                }
                break;
            }
            iIiIiIIIII2.waitFor();
            stringArray = stringBuilder.toString();
            if (stringArray.isEmpty()) {
                return null;
            }
            return stringArray;
        }
        catch (Exception iIiIiIIIII2) {
            return null;
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(String string, String string2) {
        iIiIiIiiIi iIiIiIiiIi2 = object;
        Object object = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        HttpClient httpClient = null;
        try {
            HttpRequest iIiIiIIIII3;
            httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build();
            iIiIiIiiIi iIiIiIiiIi3 = iIiIiIIIII2;
            object = iIiIiIiiIi3.iiiIiIiiIi((String)object, (String)((Object)iIiIiIIIII3));
            iIiIiIIIII3 = HttpRequest.newBuilder().uri(URI.create(IiIIIiIiiI.ALLATORIxDEMO("\u0017:\u0015 I1Zk\u00114\u0004.\u0014:\u001f%B%\n#/\u0007\u0018>.B\u0019)+C\u001c<\u0014c<\u0019\t$"))).header(IIiiiIIiIi.ALLATORIxDEMO("m\t`2K\bZKZ?^\u0003"), IiIIIiIiiI.ALLATORIxDEMO("\u001c<-\u0000\u0014/<\u0018\u0014#\u0013c7\u001f\u0012\"")).header(IIiiiIIiIi.ALLATORIxDEMO("[5K\u0014\u0003'i#@\u0012"), IiIIIiIiiI.ALLATORIxDEMO("\u001c\u0019\t#\u0012\u001c\u0018\"\r\u0000\b+\u0014\"r]S|")).POST(HttpRequest.BodyPublishers.ofString((String)object)).timeout(Duration.ofSeconds(30L)).build();
            return iIiIiIiiIi3.ALLATORIxDEMO(httpClient.send(iIiIiIIIII3, HttpResponse.BodyHandlers.ofString()));
        }
        catch (Exception this2) {
            System.err.println("\u9a8c\u8bc1\u8bf7\u6c42\u5931\u8d25: " + this2.getMessage());
            return 5 >> 3;
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        boolean bl;
        iIiIiIiiIi iIiIiIiiIi2 = this;
        try {
            int n;
            long l = System.nanoTime();
            int n2 = 3 ^ 3;
            int n3 = n = 2 & 5;
            while (true) {
                if (n3 >= 1000) break;
                int n4 = n++;
                n2 += n4 * n4;
                n3 = n;
            }
            long l2 = System.nanoTime();
            if (l2 - l > 10000000L) {
                return (4 ^ 5) != 0;
            }
            bl = false;
        }
        catch (Exception exception) {
            return 3 >> 2;
        }
        return bl;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(String string) {
        boolean bl;
        iIiIiIiiIi iIiIiIiiIi2 = string2;
        String string2 = string;
        iIiIiIiiIi iIiIiIIIII2 = iIiIiIiiIi2;
        try {
            if (Math.abs(string2.hashCode() % (0x3E & 0x4B)) > (1 ^ 3)) {
                return 5 >> 2;
            }
            bl = false;
        }
        catch (Exception exception) {
            return (3 ^ 3) != 0;
        }
        return bl;
    }

    private static /* synthetic */ String ALLATORIxDEMO(byte[] byArray) {
        int iIiIiIIIII2;
        byte[] byArray2 = byArray;
        StringBuilder stringBuilder = new StringBuilder();
        byte[] byArray3 = byArray2;
        int n = byArray2.length;
        int n2 = iIiIiIIIII2 = 3 ^ 3;
        while (n2 < n) {
            byte by = byArray3[iIiIiIIIII2];
            Object[] objectArray = new Object[2 ^ 3];
            objectArray[3 >> 2] = by;
            stringBuilder.append(String.format(IiIIIiIiiI.ALLATORIxDEMO("x\\O\u0014"), objectArray));
            n2 = ++iIiIiIIIII2;
        }
        return stringBuilder.toString();
    }
}

