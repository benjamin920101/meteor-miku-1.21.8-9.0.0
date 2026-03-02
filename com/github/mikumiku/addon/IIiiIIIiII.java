/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent
 *  meteordevelopment.meteorclient.events.game.ReceiveMessageEvent
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2382
 *  net.minecraft.class_2533
 *  net.minecraft.class_2561
 *  net.minecraft.class_2625
 *  net.minecraft.class_310
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import com.github.mikumiku.addon.IIIiIIiiiI;
import com.github.mikumiku.addon.IiIIiiiIiI;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iIiIIiIiIi;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiIiiii;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent;
import meteordevelopment.meteorclient.events.game.ReceiveMessageEvent;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_2533;
import net.minecraft.class_2561;
import net.minecraft.class_2625;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiiIIIiII
extends iIiIiIIIii {
    private final Setting<Boolean> iIIIIIIiII;
    private class_2338 iIIiiIIIIi;
    private final Setting<Map<String, String>> IiiiiIiIiI;
    private final Setting<String> iiiIiIIiii;
    private final SettingGroup iIIIiiiiIi;
    private String iiiIiiIIII;
    private final Setting<Integer> iIiIIiIIIi;
    private final Setting<String> IIiIiiiiII;
    private static final int IIiiIIIIIi = 200;
    private boolean iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    public final Map<UUID, String> IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private int iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private class_2338 iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String string, class_2338 class_23382) {
        void iIiIiIIIII2;
        IIiiIIIiII iIiiIIIiII = string2;
        String string2 = string;
        IIiiIIIiII iIiIiIIIII3 = iIiiIIIiII;
        ((Map)iIiIiIIIII3.IiiiiIiIiI.get()).put(string2, IIiiIIIiII.ALLATORIxDEMO((class_2338)iIiIiIIIII2));
        IiIiIIiiii.iiIIiIIiii("\u5df2\u6dfb\u52a0\u73cd\u73e0 \u00a7b" + (String)string2 + "\u00a7f -> " + iIiIiIIIII2.method_23854());
        IiIiIIiiii.iiIIiIIiii("\u8bf7\u81ea\u884c\u4fee\u6539\u00a7b" + (String)string2 + "\u00a7f \u4e3a\u7528\u6237\u6635\u79f0");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(String string, String string2) {
        void iIiIiIIIII2;
        IIiiIIIiII iIiiIIIiII = string3;
        String string3 = string2;
        IIiiIIIiII iIiIiIIIII3 = iIiiIIIiII;
        if (iIiIiIIIII3.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        iIiIiIIIII3.iIIiiIiIiI.field_1724.field_3944.method_45729("/msg " + (String)iIiIiIIIII2 + " " + (String)string3);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(ReceiveMessageEvent receiveMessageEvent) {
        IIiiIIIiII iIiiIIIiII = object;
        Object object = receiveMessageEvent;
        IIiiIIIiII iIiIiIIIII2 = iIiiIIIiII;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        object = object.getMessage().getString();
        if ((object = iIiIiIIIII2.iiiIiIiiIi((String)object)) == null) {
            return;
        }
        Object object2 = object;
        object = ((iIiIIiIiIi)object2).iIiIiIIIII;
        if (!((iIiIIiIiIi)object2).ALLATORIxDEMO.contains((CharSequence)iIiIiIIIII2.iiiIiIIiii.get())) {
            return;
        }
        iIiIiIIIII2.info("\u6536\u5230\u6765\u81ea " + (String)object + " \u7684\u62c9\u73cd\u73e0\u8bf7\u6c42\u3002", new Object[3 >> 2]);
        class_2338 class_23382 = IIiiIIIiII.ALLATORIxDEMO((String)((Map)iIiIiIIIII2.IiiiiIiIiI.get()).get(object));
        if (class_23382 == null && ((Boolean)iIiIiIIIII2.ALLATORIxDEMO.get()).booleanValue() && (class_23382 = iIiIiIIIII2.iiiIiIiiIi((String)object)) != null) {
            ((Map)iIiIiIIIII2.IiiiiIiIiI.get()).put(object, IIiiIIIiII.ALLATORIxDEMO(class_23382));
            iIiIiIIIII2.info("\u5df2\u901a\u8fc7\u544a\u793a\u724c\u8bb0\u5f55\u73cd\u73e0: " + IIiiIIIiII.ALLATORIxDEMO(class_23382), new Object[2 & 5]);
        }
        if (class_23382 == null) {
            Object object3 = object;
            iIiIiIIIII2.ALLATORIxDEMO((String)object3, "\u6ca1\u627e\u5230\u4f60\u7684\u73cd\u73e0\u554a " + (String)object3);
            return;
        }
        IIiiIIIiII iIiiIIIiII2 = iIiIiIIIII2;
        double d = iIiiIIIiII2.iIIiiIiIiI.field_1724.method_24515().method_10262((class_2382)class_23382);
        if (((Boolean)iIiiIIIiII2.iIIIIIIiII.get()).booleanValue() && d > (double)((Integer)iIiIiIIIII2.iIiIIiIIIi.get() * (Integer)iIiIiIIIII2.iIiIIiIIIi.get())) {
            iIiIiIIIII2.ALLATORIxDEMO((String)object, "\u6211\u73b0\u5728\u79bb\u4f60\u7684\u73cd\u73e0\u592a\u8fdc\uff0c\u8ddd\u79bb " + d);
            return;
        }
        iIiIiIIIII2.info("\u5f00\u59cb\u6267\u884c\u73cd\u73e0\u62c9\u4efb\u52a1: " + (String)object, new Object[3 & 4]);
        iIiIiIIIII2.ALLATORIxDEMO(class_23382, (String)object, d);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, String string) {
        void iIiIiIIIII2;
        IIiiIIIiII iIiiIIIiII = iIiiIIIiII2;
        IIiiIIIiII iIiiIIIiII2 = class_23382;
        IIiiIIIiII iIiIiIIIII3 = iIiiIIIiII;
        if (iIiIiIIIII3.iIIiiIiIiI.field_1724.method_5649((double)iIiiIIIiII2.method_10263(), (double)iIiiIIIiII2.method_10264(), (double)iIiiIIIiII2.method_10260()) < 25.0) {
            iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiiIIIiII2, class_2350.field_11036, (2 ^ 3) != 0, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
            iIiIiIIIII3.info("\u00a7a\u73cd\u73e0\u5df2\u6210\u529f\u62c9\uff01ID: \u00a7b" + (String)iIiIiIIIII2, new Object[3 & 4]);
            IIiiIIIiII iIiiIIIiII3 = iIiIiIIIII3;
            iIiiIIIiII3.iIiiiIiIii = 3 & 4;
            iIiiIIIiII3.iIIiiIIIIi = null;
            return;
        }
        IIiiIIIiII iIiiIIIiII4 = iIiIiIIIII3;
        iIiiIIIiII4.iIIiiIIIIi = iIiiIIIiII2;
        iIiiIIIiII4.iiiIiiIIII = iIiIiIIIII2;
        iIiIiIIIII3.iIIiiIiIiI.execute(() -> iIiIiIIIII3.ALLATORIxDEMO((String)iIiIiIIIII2));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2338 iiiIiIiiIi(String string) {
        int n;
        IIiiIIIiII iIiiIIIiII;
        IIiiIIIiII iIiiIIIiII2 = iIiiIIIiII = this;
        int n2 = iIiiIIIiII2.iIIiiIiIiI.field_1724.method_24515().method_10263();
        int n3 = iIiiIIIiII2.iIIiiIiIiI.field_1724.method_24515().method_10264();
        int n4 = iIiiIIIiII2.iIIiiIiIiI.field_1724.method_24515().method_10260();
        int n5 = (Integer)iIiiIIIiII2.IIiIiIIiii.get();
        int n6 = n = -n5;
        while (n6 <= n5) {
            int n7 = 0xFFFFFFFE & 0xFFFFFFFD;
            while (true) {
                int n8;
                if (n7 > 4) break;
                int n9 = -n5;
                while (n9 <= n5) {
                    int n10;
                    class_2338 class_23382 = new class_2338(n2 + n, n3 + n8, n4 + n10);
                    class_2561[] class_2561Array = iIiiIIIiII.iIIiiIiIiI.field_1687.method_8321(class_23382);
                    if (class_2561Array instanceof class_2625) {
                        class_2561Array = ((class_2625)class_2561Array).method_49853().method_49877(3 >> 2);
                        int n11 = class_2561Array.length;
                        int n12 = 5 >> 3;
                        while (n12 < n11) {
                            void iIiIiIIIII2;
                            int n13;
                            if (class_2561Array[n13].getString().toLowerCase().contains(iIiIiIIIII2.toLowerCase())) {
                                iIiiIIIiII.info("\u627e\u5230\u5305\u542b\u540d\u5b57\u7684\u544a\u793a\u724c: " + class_23382.method_23854(), new Object[5 >> 3]);
                                return class_23382.method_10074();
                            }
                            n12 = ++n13;
                        }
                    }
                    n9 = ++n10;
                }
                n7 = ++n8;
            }
            n6 = ++n;
        }
        return null;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        IIiiIIIiII iIiiIIIiII = iIiiIIIiII2;
        IIiiIIIiII iIiiIIIiII2 = render2DEvent;
        IIiiIIIiII iIiIiIIIII2 = iIiiIIIiII;
        if (Utils.isLoading() || iIiIiIIIII2.isActive()) {
            // empty if block
        }
    }

    public static class_2338 ALLATORIxDEMO(String string) {
        String string2 = string;
        if (string2 == null) {
            return null;
        }
        try {
            String[] iIiIiIIIII2 = string2.trim().split(IIIiIIiiiI.ALLATORIxDEMO("Db1"));
            if (iIiIiIIIII2.length != --3) {
                throw new IllegalArgumentException(IiIIiiiIiI.ALLATORIxDEMO("+6\u00144\u0003)\u001e{#*\u0013>\f<9#J7\u0004+\u000e:\u0015"));
            }
            int n = Integer.parseInt(iIiIiIIIII2[2 & 5]);
            int n2 = Integer.parseInt(iIiIiIIIII2[3 & 5]);
            int n3 = Integer.parseInt(iIiIiIIIII2[1 ^ 3]);
            return new class_2338(n, n2, n3);
        }
        catch (Exception iIiIiIIIII2) {
            IiIiIIiiii.iiIIiIIiii("\u65e0\u6cd5\u89e3\u6790\u73cd\u73e0\u4f4d\u7f6e\u5b57\u7b26: " + string2);
            return null;
        }
    }

    @Override
    public void onActivate() {
        IIiiIIIiII iIiiIIIiII = this;
        super.onActivate();
        if (((Boolean)iIiiIIIiII.IIIIiiIiii.get()).booleanValue()) {
            IiIiIIiiii.iiIIiIIiii(IiIIiiiIiI.ALLATORIxDEMO("\u8b90\u7cc3\u7829\u53ae\u9549\u70e4\u519c\u73b6\u73a1\u70c3\u76c4\u6d6e\u6710\u959f\u65f4\u5737\u673f\u6d86\u52e7\uff6e\u4e55\u755d\u628a\u5fa3\u89bc\u53a0\u3049"));
        }
    }

    public static String ALLATORIxDEMO(class_2338 iIiIiIIIII2) {
        return iIiIiIIIII2.method_10263() + " " + iIiIiIIIII2.method_10264() + " " + iIiIiIIIII2.method_10260();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IIiiIIIiII iIiiIIIiII = iIiiIIIiII2;
        IIiiIIIiII iIiiIIIiII2 = post;
        IIiiIIIiII iIiIiIIIII2 = iIiiIIIiII;
        if (iIiIiIIIII2.iIiiiIiIii) {
            IIiiIIIiII iIiiIIIiII3 = iIiIiIIIII2;
            iIiiIIIiII3.iiiiiIIiIi += --1;
            if (iIiiIIIiII3.iiiiiIIiIi > (Integer)iIiIiIIIII2.iIiIiiiiII.get()) {
                iIiIiIIIII2.info(IIIiIIiiiI.ALLATORIxDEMO("\u62de\u73d1\u73c6\u528d\u8f67\u8d94\u65ed\uff1c\u81f9\u52b0\u91dc\u7f74"), new Object[3 & 4]);
                IIiiIIIiII iIiiIIIiII4 = iIiIiIIIII2;
                iIiiIIIiII4.iIiiiIiIii = 3 ^ 3;
                iIiiIIIiII4.iiiiiIIiIi = 3 ^ 3;
                BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
                return;
            }
        }
        if (iIiIiIIIII2.iIIiiIIIIi != null && IiIiiIIIiI.ALLATORIxDEMO(iIiIiIIIII2.iIIiiIIIIi, 4.0)) {
            IIiiIIIiII iIiiIIIiII5 = iIiIiIIIII2;
            IIiiIIIiII iIiiIIIiII6 = iIiIiIIIII2;
            iIiiIIIiII5.ALLATORIxDEMO(iIiiIIIiII5.iIIiiIIIIi, iIiiIIIiII6.iiiIiiIIII);
            if (((Boolean)iIiiIIIiII6.iIIiiIiIiI.get()).booleanValue() && iIiIiIIIII2.iIiIiIIIII != null) {
                IiIiiIIIiI.ALLATORIxDEMO(iIiIiIIIII2.iIiIiIIIII, 0.0);
            }
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        IIiiIIIiII iIiiIIIiII = string2;
        String string2 = string;
        IIiiIIIiII iIiIiIIIII2 = iIiiIIIiII;
        iIiIiIIIII2.info("\u00a7a\u73cd\u73e0\u5df2\u6210\u529f\u62c9\uff01ID: \u00a7b" + (String)string2, new Object[3 & 4]);
        if (((Boolean)iIiIiIIIII2.iIIiiIiIiI.get()).booleanValue() && iIiIiIIIII2.iIiIiIIIII != null) {
            iIiIiIIIII2.iIIiiIiIiI.execute(() -> {
                IIiiIIIiII iIiiIIIiII = this;
                this.iIIiiIiIiI.field_1724.method_5859((double)iIiiIIIiII.iIiIiIIIII.method_10263() + 0.5, (double)this.iIiIiIIIII.method_10264(), (double)this.iIiIiIIIII.method_10260() + 0.5);
                iIiiIIIiII.info(IiIIiiiIiI.ALLATORIxDEMO("\u00cba\u5da2\u8fbe\u568f\u8d1c\u5992\u4f2e\u7f35\u3063"), new Object[3 & 4]);
            });
        }
        iIiIiIIIII2.iIiiiIiIii = 3 ^ 3;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractBlockEvent interactBlockEvent) {
        void iIiIiIIIII2;
        IIiiIIIiII iIiiIIIiII = iIiiIIIiII2;
        if (!((Boolean)iIiiIIIiII.IIIIiiIiii.get()).booleanValue()) {
            return;
        }
        IIiiIIIiII iIiiIIIiII2 = iIiIiIIIII2.result.method_17777();
        if (iIiiIIIiII.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiiIIIiII2).method_26204() instanceof class_2533) {
            IIiiIIIiII iIiiIIIiII3 = iIiiIIIiII;
            iIiiIIIiII3.ALLATORIxDEMO("\u7528\u6237\u540d" + ((Map)iIiiIIIiII3.IiiiiIiIiI.get()).size(), (class_2338)iIiiIIIiII2);
            iIiIiIIIII2.cancel();
        }
    }

    public iIiIIiIiIi iiiIiIiiIi(String string) {
        IIiiIIIiII iIiiIIIiII = object;
        Object object = string;
        IIiiIIIiII iIiIiIIIII2 = iIiiIIIiII;
        String string2 = IIIiIIiiiI.ALLATORIxDEMO("i\ud801\udcff@d7\u001fgi\u279dj\u0017(5kO<\u27bdkO\u001c\u001497\u001e\u0018");
        if (((Boolean)iIiIiIIIII2.iIIiIiiiIi.get()).booleanValue()) {
            string2 = (String)iIiIiIIIII2.IIiIiiiiII.get();
        }
        if (((Matcher)(object = Pattern.compile(string2).matcher((CharSequence)object))).matches()) {
            return new iIiIIiIiIi(((Matcher)object).group(2 ^ 3).trim(), ((Matcher)object).group(5 >> 1).trim());
        }
        return null;
    }

    public IIiiIIIiII() {
        IIiiIIIiII iIiiIIIiII = this;
        super((Category)ALLATORIxDEMO, IiIIiiiIiI.ALLATORIxDEMO("\u73b0\u73a7\u70d9\u597d\u7b8b\u5ba6"), IIIiIIiiiI.ALLATORIxDEMO("\u81fd\u52b4\u7b96\u743a\u4e1d\u7662\u4ead\u7698\u73af\u7389\u708e\u90c1\u53df\u4ede\uff3b\u96b3\u65dc\u79e0\u802a\u62a2"));
        iIiiIIIiII.iIIIiiiiIi = iIiiIIIiII.settings.getDefaultGroup();
        iIiiIIIiII.iiiIiIIiii = iIiiIIIiII.iIIIiiiiIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u5129\u9504\u5b47"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u536c\u541c\u8bd9\u5143\u9515\u5b60\u76b8\u79eb\u806b\u5c51\u62a2"))).defaultValue((Object)IiIIiiiIiI.ALLATORIxDEMO("\u62e3\u6201"))).build());
        this.IiiiiIiIiI = this.iIIIiiiiIi.add((Setting)((iiIIiIiiii)((Object)((iiIIiIiiii)((Object)new iiIIiIiiii().name(IIIiIIiiiI.ALLATORIxDEMO("\u73ec\u7380\u70d2")))).description(IiIIiiiIiI.ALLATORIxDEMO("\u5d81\u8fe4\u754f\u621f\u541f\uff71\u53b4\u8fc3\u666f\u6d46\u6738\u9588\u570a\u682d\u3012")))).ALLATORIxDEMO());
        this.IIIIiiIiii = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6dc0\u5297\u73f1\u73ca\u7098\u6a41\u5f64"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u8b98\u6a66\u5f75\u53af\u4e98\u6dbc\u52c0\u7397\u73ca\u70a9"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.ALLATORIxDEMO = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6641\u80ca\u8bfa\u5201\u546b\u795a\u7227"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u82a2\u6757\u6239\u526d\u73aa\u73bd\u8bd7\u5f08\uff6b\u5264\u5c5a\u8b88\u4ea9\u4e57\u65de\u5462\u7928\u7231\u83f0\u53ac\u738d\u739d\u4e7c\u4eda\u76de\u5427\u5b47"))).defaultValue((Object)(--1 != 0))).build());
        this.IIiIiIIiii = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6427\u7d15\u5476\u7910\u726d\u532a\u5fef"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u640e\u7d5f\u540d\u7940\u720c\u76f9\u8344\u5694\u5310\u5fae\u3012"))).defaultValue((Object)(0x6B & 0x54))).min(0x5E & 0x29).sliderRange(0x7B & 0xC, 0x719C & 0xEE3).visible(() -> (Boolean)this.ALLATORIxDEMO.get())).build());
        this.iIiIiiiiII = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u8d41\u8dd3\u8daf\u65d7\u6596\u959f"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u5126\u8be5\u62ae\u73e5\u73f2\u76f9\u6747\u595d\u65b6\u95893\t9A\u3012"))).defaultValue((Object)(0x15DC & 0x6AEB))).min(0x5C & 0x37).sliderRange(0x7D & 0x16, 0x4E25 & 0x7FFA).build());
        this.iIIIIIIiII = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u5916\u8ff6\u76a5\u4e6d\u62a2"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u5f0e\u4e69\u7390\u7387\u8df5\u79a9\u8fba\u8f9b\u658c\u81aa\u52d5\u6295\u7ebd\u8bad\u6c68\u3012"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiIIiIIIi = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u672a\u5906\u8dbd\u79d0"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u5153\u8bc5\u628e\u73b7\u73a0\u76f9\u6747\u5947\u8d87\u7991\u3012"))).defaultValue((Object)(0x7D & 0x7A))).min(0x4A & 0x3F).sliderRange(0x6F & 0x1A, 0x57FE & 0x292D).visible(() -> (Boolean)this.iIIIIIIiII.get())).build());
        this.iIIiiIiIiI = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u4f4f\u7513\u5439\u8fe8\u56f4\u51db\u53b1\u70d2"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u62ae\u73e5\u73f2\u5473\u6668\u545c\u8f94\u56a3\u8d30\u59ab\u4f17\u7f44\u3012"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIiIiiiIi = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u81d1\u5bad\u4e75\u79eb\u806b\u6b03\u5272"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u6750\u52c6\u5615\u76c3\u799c\u802d\u6b3e\u527e\uff24\u6bdd\u4e57\u674a\u52db\u5628\u5392\u80ba\u4e6d\u4e5a\u681d\u3012"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IIiIiiiiII = this.iIIIiiiiIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u79eb\u806b\u6b03\u5272"))).description(IiIIiiiIiI.ALLATORIxDEMO("\u799c\u802d\u6b4b\u520bQ\u9e9f\u8bde\u666fN\u0004\u76e4\u6866\u5f25\u3012"))).defaultValue((Object)IIIiIIiiiI.ALLATORIxDEMO("i\ud801\udcff@d7?Gi\u279dJ7(5>\u001a\u001c\u279dlH\u001c\u0014\u0004\nIO"))).visible(() -> (Boolean)this.iIIiIiiiIi.get())).build());
        IIiiIIIiII iIiiIIIiII2 = this;
        IIiiIIIiII iIiiIIIiII3 = this;
        this.iIiIiIIIII = null;
        iIiiIIIiII3.iIiiiIiIii = 3 ^ 3;
        iIiiIIIiII3.iIIiiIIIIi = null;
        iIiiIIIiII2.iiiIiiIIII = "";
        iIiiIIIiII2.iiiiiIIiIi = 3 ^ 3;
        IIiiIIIiII iIiiIIIiII4 = this;
        iIiiIIIiII2.IiiIiIiiIi = new HashMap<UUID, String>();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiiiIiI.ALLATORIxDEMO("\r\u000b8\u0006.\u0002]2-\u0003<\u0013M3]\u8bb0\u668e\u65f0\u524d\u6747\u65d0\u7212\u6706\uff11"));
        }
    }

    public iIiIIiIiIi ALLATORIxDEMO(String string) {
        IIiiIIIiII iIiiIIIiII = object;
        Object object = string;
        IIiiIIIiII iIiIiIIIII2 = iIiiIIIiII;
        object = Pattern.compile(IiIIiiiIiI.ALLATORIxDEMO("\u0003O\u0006&P\u001d<J'WxV\u0007?sK\t\u001ck\r3\b5\f8\u0015\u001fl\f\u0019zCwHrE")).matcher((CharSequence)object);
        if (((Matcher)object).matches()) {
            Object object2 = object;
            object = ((Matcher)object2).group(4 ^ 5).trim();
            String string2 = ((Matcher)object2).group(--2).trim();
            return new iIiIIiIiIi((String)object, string2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(class_2338 class_23382, String string, double d) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IIiiIIIiII iIiiIIIiII = string2;
        String string2 = string;
        IIiiIIIiII iIiIiIIIII4 = iIiiIIIiII;
        if (iIiIiIIIII4.iIiiiIiIii) {
            iIiIiIIIII4.warning(IIIiIIiiiI.ALLATORIxDEMO("\u5f75\u5260\u5de8\u6718\u73d6\u73f0\u573b\u62d1\u4e3c\u3018"), new Object[5 >> 3]);
            return;
        }
        if (iIiIiIIIII3 == null) {
            iIiIiIIIII4.error("\u672a\u627e\u5230 \u00a7c" + (String)string2 + "\u00a7f \u7684\u73cd\u73e0\u3002", new Object[3 ^ 3]);
            return;
        }
        if (iIiIiIIIII4.iIIiiIiIiI.field_1724 == null || iIiIiIIIII4.iIIiiIiIiI.field_1687 == null) {
            iIiIiIIIII4.error(IiIIiiiIiI.ALLATORIxDEMO("\u73ce\u5bda\u677c\u5778\u7ed5\uff5d\u658b\u6c8c\u6204\u8817\u3063"), new Object[3 >> 2]);
            return;
        }
        iIiIiIIIII4.iIiIiIIIII = iIiIiIIIII4.iIIiiIiIiI.field_1724.method_24515();
        iIiIiIIIII4.iIiiiIiIii = 2 ^ 3;
        iIiIiIIIII4.info("\u00a7a\u6b63\u5728\u62c9\u73cd\u73e0: " + (String)string2, new Object[2 & 5]);
        iIiIiIIIII4.ALLATORIxDEMO(string2, "\u6b63\u5728\u8def\u4e0a\uff0c\u8ddd\u79bb\uff1a" + (double)iIiIiIIIII2);
        iIiIiIIIII4.ALLATORIxDEMO((class_2338)iIiIiIIIII3, string2);
    }

    public static String ALLATORIxDEMO() {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.method_1558() != null) {
            return class_3102.method_1558().field_3761;
        }
        return IIIiIIiiiI.ALLATORIxDEMO("du{}wft");
    }
}

