/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.EntityAddedEvent
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1684
 *  net.minecraft.class_243
 *  net.minecraft.class_2487
 *  net.minecraft.class_2520
 *  net.minecraft.class_2561
 *  net.minecraft.class_742
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIIIiiI;
import com.github.mikumiku.addon.IiiIIiiiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import meteordevelopment.meteorclient.events.entity.EntityAddedEvent;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_243;
import net.minecraft.class_2487;
import net.minecraft.class_2520;
import net.minecraft.class_2561;
import net.minecraft.class_742;

public class iIiIIiiiii
extends iIiIiIIIii {
    private final Setting<Boolean> IIiIiIIiii;
    public int iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    public static final int iIIiIiiiIi = 200000000;
    public static String iIiIiIIIII = "miku_pearl_owner_cache";
    public final Map<UUID, String> ALLATORIxDEMO;

    public void iiiIiIiiIi(EntityAddedEvent entityAddedEvent) {
        iIiIIiiiii iIiIIiiiii2 = iIiIIiiiii3;
        iIiIIiiiii iIiIIiiiii3 = entityAddedEvent;
        iIiIIiiiii iIiIiIIIII2 = iIiIIiiiii2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        iIiIIiiiii3 = ((EntityAddedEvent)iIiIIiiiii3).entity;
        if (iIiIIiiiii3 instanceof class_1684) {
            iIiIIiiiii3 = (class_1684)iIiIIiiiii3;
            iIiIiIIIII2.iIIiiIiIiI.field_1687.method_18456().stream().min(Comparator.comparingDouble(arg_0 -> iIiIIiiiii.ALLATORIxDEMO((class_1684)iIiIIiiiii3, arg_0))).ifPresent(arg_0 -> iIiIIiiiii.ALLATORIxDEMO((class_1684)iIiIIiiiii3, arg_0));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2487 class_24872, String string) {
        iIiIIiiiii iIiIIiiiii2 = object;
        Object object = class_24872;
        iIiIIiiiii iIiIiIIIII2 = iIiIIiiiii2;
        try {
            void iIiIiIIIII3;
            UUID uUID = UUID.fromString((String)iIiIiIIIII3);
            Object object2 = object = object.method_10558((String)iIiIiIIIII3);
            if (!((String)(object instanceof Optional ? (object = (String)((Optional)object2).get()) : (object = (String)object2))).isEmpty()) {
                iIiIiIIIII2.ALLATORIxDEMO.put(uUID, (String)object);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(class_1684 class_16842, class_742 class_7422) {
        class_1684 iIiIiIIIII2;
        void iIiIiIIIII3;
        class_1684 class_16843 = class_16842;
        class_16842 = class_7422;
        class_7422 = class_16843;
        void v1 = iIiIiIIIII3;
        v1.method_5665(iIiIiIIIII2.method_5477());
        v1.method_5880(3 >> 1);
    }

    public Module fromTag(class_2487 class_24872) {
        iIiIIiiiii iIiIIiiiii2 = iIiIIiiiii3;
        iIiIIiiiii iIiIIiiiii3 = class_24872;
        iIiIIiiiii iIiIiIIIII2 = iIiIIiiiii2;
        iIiIIiiiii iIiIIiiiii4 = iIiIIiiiii3;
        super.fromTag((class_2487)iIiIIiiiii4);
        if (iIiIIiiiii4 != null && iIiIIiiiii3.method_10545(iIiIiIIIII)) {
            iIiIIiiiii3 = iIiiiIIiIi.ALLATORIxDEMO((class_2487)iIiIIiiiii3, iIiIiIIIII);
            iIiIiIIIII2.ALLATORIxDEMO.clear();
            iIiIIiiiii3.method_10541().forEach(arg_0 -> iIiIiIIIII2.ALLATORIxDEMO((class_2487)iIiIIiiiii3, arg_0));
        }
        return iIiIiIIIII2;
    }

    public class_2487 toTag() {
        iIiIIiiiii iIiIIiiiii2 = iIiIIiiiii3;
        class_2487 class_24872 = super.toTag();
        if (class_24872 != null && ((Boolean)iIiIIiiiii2.IIiIiIIiii.get()).booleanValue()) {
            iIiIIiiiii iIiIIiiiii3 = new class_2487();
            iIiIIiiiii2.ALLATORIxDEMO.forEach((arg_0, arg_1) -> iIiIIiiiii.ALLATORIxDEMO((class_2487)iIiIIiiiii3, arg_0, arg_1));
            class_24872.method_10566(iIiIiIIIII, (class_2520)iIiIIiiiii3);
        }
        return class_24872;
    }

    private static /* synthetic */ double iiiIiIiiIi(class_1684 class_16842, class_742 class_7422) {
        class_1684 iIiIiIIIII2 = class_7422;
        class_1684 iIiIiIIIII3 = class_16842;
        return iIiIiIIIII2.method_19538().method_1022(new class_243(iIiIiIIIII3.method_23317(), iIiIiIIIII3.method_23318(), iIiIiIIIII3.method_23321()));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIiIIiiiii iIiIIiiiii2 = iIiIIiiiii3;
        iIiIIiiiii iIiIIiiiii3 = post;
        iIiIIiiiii iIiIiIIIII2 = iIiIIiiiii2;
        if (!((Boolean)iIiIiIIIII2.IIiIiIIiii.get()).booleanValue()) {
            return;
        }
        iIiIIiiiii iIiIIiiiii4 = iIiIiIIIII2;
        iIiIIiiiii4.iIIiiIiIiI += 5 >> 2;
        if (iIiIIiiiii4.iIIiiIiIiI >= 200000000) {
            iIiIiIIIII2.iIIiiIiIiI = 3 & 4;
            iIiIiIIIII2.ALLATORIxDEMO();
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(class_2487 class_24872, UUID uUID, String string) {
        void iIiIiIIIII2;
        Object iIiIiIIIII3 = string;
        class_2487 iIiIiIIIII4 = class_24872;
        iIiIiIIIII4.method_10582(iIiIiIIIII2.toString(), (String)iIiIiIIIII3);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiIIiiiii iIiIIiiiii2 = hashMap;
        if (iIiIIiiiii2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        iIiIIiiiii2.iIIiiIiIiI.field_1687.method_18112().forEach(class_12972 -> {
            Map iIiIiIIIII2 = class_12972;
            Map iIiIiIIIII3 = hashMap;
            if (iIiIiIIIII2 instanceof class_1684) {
                iIiIiIIIII3.put(iIiIiIIIII2.method_5667(), --1 != 0);
            }
        });
        iIiIIiiiii2.ALLATORIxDEMO.keySet().removeIf(uUID -> {
            Map iIiIiIIIII2 = hashMap;
            UUID iIiIiIIIII3 = uUID;
            if (!iIiIiIIIII2.containsKey(iIiIiIIIII3)) {
                return (2 ^ 3) != 0;
            }
            return false;
        });
    }

    private static /* synthetic */ double ALLATORIxDEMO(class_1684 class_16842, class_742 class_7422) {
        class_1684 iIiIiIIIII2 = class_7422;
        class_1684 iIiIiIIIII3 = class_16842;
        return iIiIiIIIII2.method_19538().method_1022(new class_243(iIiIiIIIII3.method_23317(), iIiIiIIIII3.method_23318(), iIiIiIIIII3.method_23321()));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1684 class_16842, UUID uUID, class_742 class_7422) {
        void iIiIiIIIII2;
        iIiIIiiiii iIiIIiiiii2 = object;
        Object object = class_7422;
        iIiIIiiiii iIiIiIIIII3 = iIiIIiiiii2;
        object = object.method_7334().getName();
        void v1 = iIiIiIIIII2;
        v1.method_5665((class_2561)class_2561.method_43470((String)object));
        v1.method_5880((3 & 5) != 0);
        if (((Boolean)iIiIiIIIII3.IIiIiIIiii.get()).booleanValue()) {
            void iIiIiIIIII4;
            iIiIiIIIII3.ALLATORIxDEMO.put((UUID)iIiIiIIIII4, (String)object);
        }
    }

    private /* synthetic */ void iiiIiIiiIi(Render2DEvent render2DEvent) {
        iIiIIiiiii iIiIIiiiii2 = iIiIIiiiii3;
        if (!Utils.isLoading() && iIiIIiiiii2.isActive()) {
            for (iIiIIiiiii iIiIIiiiii3 : iIiIIiiiii2.iIIiiIiIiI.field_1687.method_18112()) {
                if (!(iIiIIiiiii3 instanceof class_1684)) continue;
                class_1297 class_12972 = (iIiIIiiiii3 = (class_1684)iIiIIiiiii3).method_24921();
                if (class_12972 != null) {
                    if (class_12972 instanceof class_1657) {
                        class_1657 class_16572 = (class_1657)class_12972;
                        class_16572.method_7334().getName();
                        iIiIIiiiii iIiIIiiiii4 = iIiIIiiiii3;
                        iIiIIiiiii4.method_5665(class_16572.method_5477());
                        iIiIIiiiii4.method_5880((2 ^ 3) != 0);
                        continue;
                    }
                    iIiIIiiiii3.method_5665(class_12972.method_5477());
                    iIiIIiiiii3.method_5880(3 >> 1);
                    continue;
                }
                iIiIIiiiii3.method_5665((class_2561)class_2561.method_43470((String)IiiIIiiiiI.ALLATORIxDEMO("\u9198\u7542\u739b\u73bd")));
                iIiIIiiiii3.method_5880(3 >> 1);
            }
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(EntityAddedEvent entityAddedEvent) {
        iIiIIiiiii iIiIIiiiii2 = iIiIIiiiii3;
        iIiIIiiiii iIiIIiiiii3 = entityAddedEvent;
        iIiIIiiiii iIiIiIIIII2 = iIiIIiiiii2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        iIiIIiiiii3 = ((EntityAddedEvent)iIiIIiiiii3).entity;
        if (iIiIIiiiii3 instanceof class_1684) {
            String string;
            iIiIIiiiii3 = (class_1684)iIiIIiiiii3;
            UUID uUID = iIiIIiiiii3.method_5667();
            if (((Boolean)iIiIiIIIII2.IIiIiIIiii.get()).booleanValue() && (string = iIiIiIIIII2.ALLATORIxDEMO.get(uUID)) != null) {
                iIiIIiiiii iIiIIiiiii4 = iIiIIiiiii3;
                iIiIIiiiii4.method_5665((class_2561)class_2561.method_43470((String)string));
                iIiIIiiiii4.method_5880(3 >> 1);
                return;
            }
            iIiIiIIIII2.iIIiiIiIiI.field_1687.method_18456().stream().filter(arg_0 -> iIiIIiiiii.ALLATORIxDEMO((class_1684)iIiIIiiiii3, arg_0)).min(Comparator.comparingDouble(arg_0 -> iIiIIiiiii.iiiIiIiiIi((class_1684)iIiIIiiiii3, arg_0))).ifPresent(arg_0 -> iIiIiIIIII2.ALLATORIxDEMO((class_1684)iIiIIiiiii3, uUID, arg_0));
        }
    }

    public iIiIIiiiii() {
        iIiIIiiiii iIiIIiiiii2 = this;
        super(IIiiIIIiiI.ALLATORIxDEMO("\u8c1b\u76ce\u73d7\u73aa"), IiiIIiiiiI.ALLATORIxDEMO("\u4e4c\u6756\u5f27\u7390\u73b6\u685a\u8be6\u4e66\u4eec\u76d9\u545b\u5b0a"));
        iIiIIiiiii2.iiiiiIIiIi = iIiIIiiiii2.settings.getDefaultGroup();
        iIiIIiiiii2.IIiIiIIiii = iIiIIiiiii2.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIiiI.ALLATORIxDEMO("\u6660\u80b7\u7f09\u5b12"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u5459\u7555\u662c\u80a0\u7f65\u5b25\u52e9\u8080\uff5a\u8bed\u4f19\u7390\u73b6\u4e66\u4eec\u76d9\u545b\u5b0a"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        iIiIIiiiii iIiIIiiiii3 = this;
        iIiIIiiiii iIiIIiiiii4 = this;
        iIiIIiiiii3.ALLATORIxDEMO = new HashMap<UUID, String>();
        iIiIIiiiii3.iIIiiIiIiI = 3 >> 2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiiIIIiiI.ALLATORIxDEMO("M!8li/\u001a\u001fj.[\u001e_K:\u8bbd\u66ee\u65fa\u522a\u674a\u65aa\u7202\u6736\uff4b"));
        }
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(class_1684 class_16842, class_742 class_7422) {
        class_1684 iIiIiIIIII2 = class_7422;
        class_1684 iIiIiIIIII3 = class_16842;
        class_243 class_2432 = new class_243(iIiIiIIIII3.method_23317(), iIiIiIIIII3.method_23318(), iIiIiIIIII3.method_23321());
        if (iIiIiIIIII2.method_19538().method_1022(class_2432) < 2.0) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    public void onDeactivate() {
        super.onDeactivate();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        block3: {
            iIiIIiiiii iIiIIiiiii2 = object;
            if (Utils.isLoading() || !iIiIIiiiii2.isActive()) break block3;
            for (class_1297 class_12972 : iIiIIiiiii2.iIIiiIiIiI.field_1687.method_18112()) {
                iIiIIiiiii iIiIIiiiii3;
                Object object;
                UUID uUID;
                block6: {
                    block4: {
                        class_1297 class_12973;
                        block5: {
                            if (!(class_12972 instanceof class_1684)) continue;
                            class_12972 = (class_1684)class_12972;
                            uUID = class_12972.method_5667();
                            object = null;
                            class_12973 = class_12972.method_24921();
                            if (class_12973 == null) break block4;
                            if (!(class_12973 instanceof class_1657)) break block5;
                            object = ((class_1657)class_12973).method_7334().getName();
                            if (!((Boolean)iIiIIiiiii2.IIiIiIIiii.get()).booleanValue()) break block4;
                            iIiIIiiiii iIiIIiiiii4 = iIiIIiiiii2;
                            iIiIIiiiii3 = iIiIIiiiii4;
                            iIiIIiiiii4.ALLATORIxDEMO.put(uUID, (String)object);
                            break block6;
                        }
                        object = class_12973.method_5477().getString();
                    }
                    iIiIIiiiii3 = iIiIIiiiii2;
                }
                if (((Boolean)iIiIIiiiii3.IIiIiIIiii.get()).booleanValue() && object == null) {
                    object = iIiIIiiiii2.ALLATORIxDEMO.get(uUID);
                }
                class_1297 class_12974 = class_12972;
                if (object != null) {
                    class_12974.method_5665((class_2561)class_2561.method_43470((String)object));
                    class_12972.method_5880((4 ^ 5) != 0);
                    continue;
                }
                class_12974.method_5665((class_2561)class_2561.method_43470((String)IIiiIIIiiI.ALLATORIxDEMO("\u91d4\u7555\u73d7\u73aa")));
                class_12972.method_5880(3 >> 1);
            }
        }
    }
}

