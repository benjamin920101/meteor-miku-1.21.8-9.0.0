/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIiiiiI;
import com.github.mikumiku.addon.iIIIIIIIii;
import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class IIIIiiIiIi {
    private static final Gson ALLATORIxDEMO = new Gson();

    public IIIIiiIiIi() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIIiiiiI.ALLATORIxDEMO("\u00016t{\u0005\u0018V\b\u0006\u0019\u0017\t3|v\u8baa\u6682\u65cd\u5266\u675d\u65c6\u7235\u677a\uff5c"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String ALLATORIxDEMO(byte[] byArray, byte[] byArray2, byte[] byArray3) throws Exception {
        void iIiIiIIIII2;
        Object iIiIiIIIII3 = byArray2;
        byte[] iIiIiIIIII4 = byArray;
        SecretKeySpec secretKeySpec = new SecretKeySpec(iIiIiIIIII4, iIIIIIIIii.ALLATORIxDEMO(" c0"));
        Cipher cipher = Cipher.getInstance(IiiIIiiiiI.ALLATORIxDEMO("<3.Y:\u0015\u0010y\u0013\u0019-79\u0012\u00148:"));
        iIiIiIIIII3 = new GCMParameterSpec(0x779E & 0x8E1, (byte[])iIiIiIIIII3);
        Cipher cipher2 = cipher;
        cipher2.init(1 ^ 3, (Key)secretKeySpec, (AlgorithmParameterSpec)iIiIiIIIII3);
        iIiIiIIIII3 = cipher2.doFinal((byte[])iIiIiIIIII2);
        return new String((byte[])iIiIiIIIII3, StandardCharsets.UTF_8);
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] ALLATORIxDEMO(byte[] byArray, PrivateKey privateKey) throws Exception {
        void iIiIiIIIII2;
        Object iIiIiIIIII3;
        byte[] byArray2 = byArray;
        Object object = iIiIiIIIII3 = (Object)Cipher.getInstance(IiiIIiiiiI.ALLATORIxDEMO("\r\u0019\u0000>_\u001d\u0017t\u001f\u001a\u0015\u0000\f8.yI><[OCK7\u00132\u0010\u0011\u001bG-79\u0012\u00148:"));
        ((Cipher)object).init(5 >> 1, (Key)iIiIiIIIII2);
        return ((Cipher)object).doFinal(byArray2);
    }

    public static String ALLATORIxDEMO(PublicKey iIiIiIIIII2) {
        return Base64.getEncoder().encodeToString(iIiIiIIIII2.getEncoded());
    }

    public static List<String> ALLATORIxDEMO(String string, PrivateKey privateKey) throws Exception {
        String iIiIiIIIII2;
        String string2 = string;
        Object iIiIiIIIII3 = (Map)ALLATORIxDEMO.fromJson(string2, Map.class);
        byte[] byArray = Base64.getDecoder().decode((String)iIiIiIIIII3.get(iIIIIIIIii.ALLATORIxDEMO("1C\u000bg\f]#\u0010W")));
        byte[] byArray2 = Base64.getDecoder().decode((String)iIiIiIIIII3.get(IiiIIiiiiI.ALLATORIxDEMO("4\u0000?`i")));
        iIiIiIIIII3 = Base64.getDecoder().decode((String)iIiIiIIIII3.get(iIIIIIIIii.ALLATORIxDEMO("7D\u0018D\fV#\u0010W")));
        iIiIiIIIII2 = IIIIiiIiIi.ALLATORIxDEMO(IIIIiiIiIi.ALLATORIxDEMO(byArray, (PrivateKey)((Object)iIiIiIIIII2)), byArray2, (byte[])iIiIiIIIII3);
        return (List)ALLATORIxDEMO.fromJson(iIiIiIIIII2, List.class);
    }

    public static KeyPair ALLATORIxDEMO() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(iIIIIIIIii.ALLATORIxDEMO("3u\""));
        keyPairGenerator.initialize(0x5CA7 & 0x2F58, new SecureRandom());
        return keyPairGenerator.generateKeyPair();
    }
}

