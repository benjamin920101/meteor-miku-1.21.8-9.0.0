/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2374
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiIiiIii;
import com.github.mikumiku.addon.iiIIIiIiII;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_243;
import net.minecraft.class_310;

public class iiiIiIIIiI
extends iIiIiIIIii {
    private final SettingGroup iiiIiiIIII;
    private final Setting<Boolean> iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private static final long IIiiIIIIIi = 5000L;
    private final List<class_2248> iIiiiIiIii;
    private long iIiIiiiiII;
    private final SettingGroup IIIIiiIiii;
    private int IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private final Setting<Integer> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Set<class_2338> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_1511 class_15112) {
        Object iIiIiIIIII2;
        iiiIiIIIiI iiiIiIIIiI2;
        iiiIiIIIiI iiiIiIIIiI3 = iiiIiIIIiI2 = iiiIiIIIiI4;
        iiiIiIIIiI iiiIiIIIiI4 = iiiIiIIIiI3.iIIiiIiIiI.field_1724.method_24515();
        iIiIiIIIII2 = iIiIiIIIII2.method_24515();
        iIiIiIIIII2 = iiiIiIIIiI3.ALLATORIxDEMO((class_2338)iiiIiIIIiI4, (class_2338)iIiIiIIIII2).iterator();
        block0: while (true) {
            Object object = iIiIiIIIII2;
            while (true) {
                if (!object.hasNext()) {
                    return false;
                }
                iiiIiIIIiI4 = (class_2338)iIiIiIIIII2.next();
                if (!iiiIiIIIiI2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiIiIIIiI4).method_26215()) continue block0;
                if (!iiiIiIIIiI2.iIiIiIIIII.contains(iiiIiIIIiI4)) break;
                object = iIiIiIIIII2;
            }
            FindItemResult findItemResult = iiiIiIIIiI2.ALLATORIxDEMO();
            if (!findItemResult.found()) {
                iiiIiIIIiI2.ALLATORIxDEMO();
                return 3 >> 2;
            }
            if (iiiIiIIIiI2.ALLATORIxDEMO((class_2338)iiiIiIIIiI4, findItemResult)) break;
        }
        iiiIiIIIiI iiiIiIIIiI5 = iiiIiIIIiI2;
        iiiIiIIIiI5.iIiIiIIIII.add((class_2338)iiiIiIIIiI4);
        iiiIiIIIiI5.info("\u5728 " + iiiIiIIIiI4.method_23854() + " \u653e\u7f6e\u9632\u62a4\u65b9\u5757\u62b5\u6321\u6c34\u6676", new Object[3 ^ 3]);
        return --1 != 0;
    }

    @Override
    public void onActivate() {
        if (this.iIIiiIiIiI == null) {
            this.iIIiiIiIiI = class_310.method_1551();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, FindItemResult findItemResult) {
        void iIiIiIIIII2;
        iiiIiIIIiI iiiIiIIIiI2 = iiiIiIIIiI3;
        iiiIiIIIiI iiiIiIIIiI3 = class_23382;
        iiiIiIIIiI iIiIiIIIII3 = iiiIiIIIiI2;
        void v1 = iIiIiIIIII2;
        IiIiiiiIii.ALLATORIxDEMO(v1.slot());
        boolean this2 = iIiIiiIIIi.iiIIiIIiii((class_2338)iiiIiIIIiI3);
        IiIiiiiIii.ALLATORIxDEMO(v1.slot());
        return this2;
    }

    private /* synthetic */ List<class_2338> ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        iiiIiIIIiI iiiIiIIIiI2 = this;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        if (((Boolean)iiiIiIIIiI2.ALLATORIxDEMO.get()).booleanValue()) {
            class_243 class_2432 = iIiIiIIIII.method_46558();
            class_243 class_2433 = iIiIiIIIII.method_46558().method_1020(class_2432).method_1029();
            int n = this = -4 >> 2;
            while (true) {
                if (n <= 1) {
                    int n2 = -4 >> 2;
                    while (true) {
                        int n3;
                        if (n2 > 1) break;
                        if (this != 0 || n3 != 0) {
                            class_2338 class_23384 = iIiIiIIIII.method_10069(this, 3 ^ 3, n3);
                            arrayList.add(class_23384);
                        }
                        n2 = ++n3;
                    }
                    n = ++this;
                    continue;
                }
                break;
            }
        } else {
            class_243 class_2434 = iIiIiIIIII.method_46558();
            class_243 class_2435 = iIiIiIIIII.method_46558().method_1020(class_2434).method_1029();
            int n = this = 4 ^ 5;
            while (true) {
                if (n > 2) break;
                class_243 class_2436 = class_2434.method_1019(class_2435.method_1021((double)this));
                class_2338 class_23385 = class_2338.method_49638((class_2374)class_2436);
                arrayList.add(class_23385);
                arrayList.add(class_23385.method_10084());
                n = ++this;
            }
        }
        return arrayList;
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482, class_1799 class_17992) {
        class_2248 iIiIiIIIII2 = class_17992;
        class_2248 iIiIiIIIII3 = class_22482;
        if ((iIiIiIIIII2 = iIiIiIIIII2.method_7909()) instanceof class_1747) {
            if (((class_1747)iIiIiIIIII2).method_7711() == iIiIiIIIII3) {
                return (3 & 5) != 0;
            }
            return false;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        iiiIiIIIiI iiiIiIIIiI2 = iiiIiIIIiI3;
        iiiIiIIIiI iiiIiIIIiI3 = class_22482;
        iiiIiIIIiI iIiIiIIIII2 = iiiIiIIIiI2;
        if (iiiIiIIIiI3 == class_2246.field_10540 || iiiIiIIIiI3 == class_2246.field_22423) {
            return (Boolean)iIiIiIIIII2.iIiIIiIIIi.get();
        }
        if (iiiIiIIIiI3 == class_2246.field_10340 || iiiIiIIIiI3 == class_2246.field_10056 || iiiIiIIIiI3 == class_2246.field_28888 || iiiIiIIIiI3 == class_2246.field_29031) {
            return (Boolean)iIiIiIIIII2.iIIiiIiIiI.get();
        }
        if (iiiIiIIIiI3 == class_2246.field_10445) {
            return (Boolean)iIiIiIIIII2.IIiIiiiiII.get();
        }
        if (iiiIiIIIiI3.method_9564().toString().contains(iiIIIiIiII.ALLATORIxDEMO("-!\u001c\u00036>"))) {
            return (Boolean)iIiIiIIIII2.iIIiIiiiIi.get();
        }
        return true;
    }

    private /* synthetic */ List<class_1511> ALLATORIxDEMO() {
        iiiIiIIIiI iiiIiIIIiI2 = iiiIiIIIiI3;
        ArrayList<class_1511> arrayList = new ArrayList<class_1511>();
        for (iiiIiIIIiI iiiIiIIIiI3 : iiiIiIIIiI2.iIIiiIiIiI.field_1687.method_18112()) {
            if (!(iiiIiIIIiI3 instanceof class_1511)) continue;
            class_1511 class_15112 = (class_1511)iiiIiIIIiI3;
            if (!PlayerUtils.isWithin((class_1297)iiiIiIIIiI3, (double)((Integer)iiiIiIIIiI2.IIiIiIIiii.get()).intValue())) continue;
            arrayList.add(class_15112);
        }
        return arrayList;
    }

    public iiiIiIIIiI() {
        iiiIiIIIiI iiiIiIIIiI2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, iiIIIiIiII.ALLATORIxDEMO("\u81a7\u52d5\u634c\u6c69\u663b"), iIiiIiiIii.ALLATORIxDEMO("\u68a3\u6d7f\u5273\u9650\u8fb2\u671f\u5726\u6c75\u6635\u65e2\u81ae\u52bb\u657d\u7f7a\u65e7\u575e\u62a1\u6362"));
        iiiIiIIIiI2.IIIIiiIiii = iiiIiIIIiI2.settings.getDefaultGroup();
        iiiIiIIIiI2.iiiIiiIIII = iiiIiIIIiI2.settings.createGroup(iiIIIiIiII.ALLATORIxDEMO("\u65c4\u573a\u8be3\u7f23"));
        iiiIiIIIiI2.IIiIiIIiii = iiiIiIIIiI2.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiiIiiIii.ALLATORIxDEMO("\u689e\u6d42\u8317\u56b7"))).description(iiIIIiIiII.ALLATORIxDEMO("\u689d\u6d06\u6c69\u663b\u76d9\u834e\u5689\uff65\u6861\uff44"))).defaultValue((Object)(0x56 & 0x2F))).min(2 ^ 3).max(0x2F & 0x5A).sliderMax(0x6F & 0x1A).build());
        this.iiiiiIIiIi = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiiIiiIii.ALLATORIxDEMO("\u6560\u7f67\u5ee2\u8f9c"))).description(iiIIIiIiII.ALLATORIxDEMO("\u6573\u7f13\u65d4\u570a\u76c9\u5eab\u8f92\uff559\u0014\u000e6\uff44"))).defaultValue((Object)(3 ^ 3))).min(3 >> 2).max(0x55 & 0x3E).sliderMax(0x36 & 0x5D).build());
        this.ALLATORIxDEMO = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiiIiiIii.ALLATORIxDEMO("\u4ed1\u8144\u8fb0\u652a\u7f2d"))).description(iiIIIiIiII.ALLATORIxDEMO("\u53d0\u5702\u73d4\u5bdb\u8167\u8fd4\u6543\u7f03\u65e4\u571a\uff71\u8061\u4e50\u6662\u5775\u6c79\u662b\u54c1\u73d4\u5bdb\u4e16\u95b9"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiIIiIIIi = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiiIiiIii.ALLATORIxDEMO("\u4f6b\u7576\u9ed8\u66c8\u77b0"))).description(iiIIIiIiII.ALLATORIxDEMO("\u4f55\u5115\u4f32\u7555\u9ebc\u6681\u77be"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIIiiIiIiI = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiiIiiIii.ALLATORIxDEMO("\u4f21\u7521\u77e7\u5977"))).description(iiIIIiIiII.ALLATORIxDEMO("\u4f32\u7575\u77be\u5949\u7c16\u65e4\u571a"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIiIiiiIi = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiiIiiIii.ALLATORIxDEMO("\u4f21\u7521\u673c\u5977"))).description(iiIIIiIiII.ALLATORIxDEMO("\u4f32\u7575\u6765\u5949\u7c16\u65e4\u571a"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IIiIiiiiII = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiiIiiIii.ALLATORIxDEMO("\u4f21\u7521\u5712\u77b0"))).description(iiIIIiIiII.ALLATORIxDEMO("\u4f02\u7545\u575b\u77be"))).defaultValue((Object)(3 >> 1))).build());
        iiiIiIIIiI iiiIiIIIiI3 = this;
        this.IiiIiIiiIi = 3 >> 2;
        iiiIiIIIiI iiiIiIIIiI4 = this;
        iiiIiIIIiI4.iIiIiIIIII = new HashSet<class_2338>();
        iiiIiIIIiI3.iIiIiiiiII = 0L;
        class_2248[] class_2248Array = new class_2248[0x53 & 0x3E];
        class_2248Array[5 >> 3] = class_2246.field_10540;
        class_2248Array[5 >> 2] = class_2246.field_22423;
        class_2248Array[1 ^ 3] = class_2246.field_10340;
        class_2248Array[--3] = class_2246.field_10445;
        class_2248Array[--4] = class_2246.field_10056;
        class_2248Array[--5] = class_2246.field_28888;
        class_2248Array[0xF & 0x76] = class_2246.field_29031;
        class_2248Array[0x2F & 0x57] = class_2246.field_10161;
        class_2248Array[0x3D & 0x4A] = class_2246.field_9975;
        class_2248Array[0x79 & 0xF] = class_2246.field_10148;
        class_2248Array[0x2B & 0x5E] = class_2246.field_10334;
        class_2248Array[0x3B & 0x4F] = class_2246.field_10218;
        class_2248Array[0x4D & 0x3E] = class_2246.field_10075;
        class_2248Array[0x2D & 0x5F] = class_2246.field_37577;
        class_2248Array[0x7E & 0xF] = class_2246.field_42751;
        class_2248Array[0x7F & 0xF] = class_2246.field_40294;
        class_2248Array[0x7A & 0x15] = class_2246.field_10566;
        class_2248Array[0x79 & 0x17] = class_2246.field_10515;
        iiiIiIIIiI3.iIiiiIiIii = Arrays.asList(class_2248Array);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIiiIiiIii.ALLATORIxDEMO("\u0013x\u0006U\u0010QCA3p\u0002@s`c\u8be3\u66b0\u65a3\u5273\u6714\u65ee\u7241\u6738\uff42"));
        }
    }

    public void onDeactivate() {
        this.iIiIiIIIII.clear();
        this.IiiIiIiiIi = 5 >> 3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ FindItemResult ALLATORIxDEMO() {
        iiiIiIIIiI iiiIiIIIiI2 = iiiIiIIIiI3;
        Iterator<class_2248> iterator = iiiIiIIIiI2.iIiiiIiIii.iterator();
        block0: do {
            Iterator<class_2248> iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return new FindItemResult(3 & 4, 2 & 5);
                }
                iiiIiIIIiI iiiIiIIIiI3 = iterator.next();
                if (iiiIiIIIiI2.ALLATORIxDEMO((class_2248)iiiIiIIIiI3)) continue block0;
                iterator2 = iterator;
            }
        } while (!(iiiIiIIIiI3 = InvUtils.find(arg_0 -> iiiIiIIIiI.ALLATORIxDEMO((class_2248)iiiIiIIIiI3, arg_0))).found());
        return iiiIiIIIiI3;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        long l = System.currentTimeMillis();
        if (l - this.iIiIiiiiII >= 5000L) {
            this.error(iIiiIiiIii.ALLATORIxDEMO("\u80e3\u5366\u4e19\u6cf3\u670c\u5381\u7511\u76eb\u960a\u62c3\u6589\u5732\uff33"), new Object[3 >> 2]);
            this.iIiIiiiiII = l;
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iiiIiIIIiI iiiIiIIIiI2 = object;
        Object object = post;
        iiiIiIIIiI iIiIiIIIII2 = iiiIiIIIiI2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (iIiIiIIIII2.IiiIiIiiIi > 0) {
            iIiIiIIIII2.IiiIiIiiIi -= 5 >> 2;
            return;
        }
        object = iIiIiIIIII2.ALLATORIxDEMO();
        if (object.isEmpty()) {
            iIiIiIIIII2.iIiIiIIIII.clear();
            return;
        }
        object = object.iterator();
        while (object.hasNext()) {
            class_1511 class_15112 = (class_1511)object.next();
            if (!iIiIiIIIII2.ALLATORIxDEMO(class_15112)) continue;
            iIiIiIIIII2.IiiIiIiiIi = (Integer)iIiIiIIIII2.iiiiiIIiIi.get();
            return;
        }
    }
}

