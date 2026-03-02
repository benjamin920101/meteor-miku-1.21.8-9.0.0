/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiiiIiIII;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class IIiiiiIiiI {
    private static final Gson iIiIiIIIII = new Gson();
    private static final SecureRandom ALLATORIxDEMO = new SecureRandom();

    public IIiiiiIiiI() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIIIiiiI.ALLATORIxDEMO("\rr8\u007f\u000e[}k-z\u001cJmj}\u8be9\u66ae\u65a9\u526d\u671e\u65f0\u724b\u6726\uff48"));
        }
    }

    public static Map<String, byte[]> ALLATORIxDEMO(byte[] byArray, String string) throws Exception {
        byte[] iIiIiIIIII2;
        byte[] byArray2 = byArray;
        byte[] byArray3 = new byte[0x4C & 0x3F];
        ALLATORIxDEMO.nextBytes(byArray3);
        Object iIiIiIIIII3 = new SecretKeySpec(byArray2, iiIIIIiiiI.ALLATORIxDEMO("{>k"));
        Cipher cipher = Cipher.getInstance(iIiiiIiIII.ALLATORIxDEMO("+<\"K+<:a\b\u001d*\u0012\u001f\u001f\u001a\u0017\u0016"));
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(0x10CB & 0x6FB4, byArray3);
        Cipher cipher2 = cipher;
        cipher2.init(2 ^ 3, (Key)iIiIiIIIII3, gCMParameterSpec);
        iIiIiIIIII2 = cipher2.doFinal(iIiIiIIIII2.getBytes(StandardCharsets.UTF_8));
        HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        Object object = iIiIiIIIII3 = (Object)hashMap;
        hashMap.put(iiIIIIiiiI.ALLATORIxDEMO("\u0012N"), byArray3);
        object.put(iIiiiIiIII.ALLATORIxDEMO("\u0010\u0012\u000b\u001b\u001c\u0003"), iIiIiIIIII2);
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] ALLATORIxDEMO(byte[] byArray, PublicKey publicKey) throws Exception {
        void iIiIiIIIII2;
        Object iIiIiIIIII3;
        byte[] byArray2 = byArray;
        Object object = iIiIiIIIII3 = (Object)Cipher.getInstance(iIiiiIiIII.ALLATORIxDEMO("\u0005\f\u0016P2\u001c\u0015p\u0018>2'(\u0013\u0006\u0012!?>OXLG%\u0002\u001b:\t\u0000C*\u0012\u001f\u001f\u001a\u0017\u0016"));
        ((Cipher)object).init(2 ^ 3, (Key)iIiIiIIIII2);
        return ((Cipher)object).doFinal(byArray2);
    }

    public static byte[] ALLATORIxDEMO() {
        byte[] byArray = new byte[0x33 & 0x6C];
        ALLATORIxDEMO.nextBytes(byArray);
        return byArray;
    }

    public static PublicKey ALLATORIxDEMO(String string) throws Exception {
        String string2 = string;
        Object iIiIiIIIII2 = Base64.getDecoder().decode(string2);
        iIiIiIIIII2 = new X509EncodedKeySpec((byte[])iIiIiIIIII2);
        return KeyFactory.getInstance(iiIIIIiiiI.ALLATORIxDEMO("h(y")).generatePublic((KeySpec)iIiIiIIIII2);
    }

    public static String ALLATORIxDEMO(Map<String, Object> map) throws Exception {
        Map<String, Object> iIiIiIIIII2;
        Map<String, Object> map2 = map;
        Object object = IIiiiiIiiI.ALLATORIxDEMO((String)map2.get(iIiiiIiIII.ALLATORIxDEMO("\u001c\u001b'#\u001c\u000e#\u000e\u00198\u001c\b")));
        byte[] byArray = IIiiiiIiiI.ALLATORIxDEMO();
        object = IIiiiiIiiI.ALLATORIxDEMO(byArray, (PublicKey)object);
        Object object2 = List.of(iiIIIIiiiI.ALLATORIxDEMO("@\u0014Q\u000b_\u000f\t"), iIiiiIiIII.ALLATORIxDEMO("\t\u0016\u0018\t\u0016\rC"), iiIIIIiiiI.ALLATORIxDEMO("P\u001e\\\u001fS\u001c`"));
        object2 = IIiiiiIiiI.ALLATORIxDEMO(byArray, iIiIiIIIII.toJson(object2));
        Map<String, Object> map3 = iIiIiIIIII2 = new HashMap<String, Object>();
        map3.put(iIiiiIiIII.ALLATORIxDEMO("#\u001c\u00198\u001e\u00021OE"), Base64.getEncoder().encodeToString((byte[])object));
        map3.put(iiIIIIiiiI.ALLATORIxDEMO("[\u000fxM\f"), Base64.getEncoder().encodeToString((byte[])object2.get(iIiiiIiIII.ALLATORIxDEMO("\u0010\u0007"))));
        iIiIiIIIII2.put(iiIIIIiiiI.ALLATORIxDEMO("l\u0019C\u0019W\u000bxM\f"), Base64.getEncoder().encodeToString((byte[])object2.get(iIiiiIiIII.ALLATORIxDEMO("\u0010\u0012\u000b\u001b\u001c\u0003"))));
        iIiIiIIIII2.put(iiIIIIiiiI.ALLATORIxDEMO("\u0014J\tS\tA"), System.currentTimeMillis() + 600000L);
        return iIiIiIIIII.toJson(iIiIiIIIII2);
    }
}

