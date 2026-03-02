/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  meteordevelopment.meteorclient.events.meteor.KeyEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.misc.input.KeyAction
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1887
 *  net.minecraft.class_1893
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_7923
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiiIIiiI;
import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.meteor.KeyEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.misc.input.KeyAction;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_7923;

public class iiiIIiiiII
extends iIiIiIIIii {
    private boolean IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    private long iiiiiIIiIi;
    private final Setting<Double> iIIiIiiiIi;
    private final Object2IntMap<class_6880<class_1887>> iIiIiIIIII;
    private boolean ALLATORIxDEMO;

    @Override
    public void onActivate() {
        iiiIIiiiII iiiIIiiiII2 = this;
        iiiIIiiiII2.ALLATORIxDEMO = 3 >> 2;
        iiiIIiiiII2.IIiIiIIiii = 3 ^ 3;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(KeyEvent keyEvent) {
        iiiIIiiiII iiiIIiiiII2 = iiiIIiiiII3;
        iiiIIiiiII iiiIIiiiII3 = keyEvent;
        iiiIIiiiII iIiIiIIIII2 = iiiIIiiiII2;
        if (((KeyEvent)iiiIIiiiII3).key == (0x70 & 0x2F) && ((KeyEvent)iiiIIiiiII3).action == KeyAction.Press) {
            long l;
            if (iIiIiIIIII2.iiiiiIIiIi == 0L) {
                iIiIiIIIII2.iiiiiIIiIi = System.currentTimeMillis();
                return;
            }
            long l2 = System.currentTimeMillis();
            if ((double)(l - iIiIiIIIII2.iiiiiIIiIi) > (Double)iIiIiIIIII2.iIIiIiiiIi.get() * 1000.0) {
                iIiIiIIIII2.iiiiiIIiIi = System.currentTimeMillis();
                return;
            }
            iiiIIiiiII3 = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(0x6F & 0x36).method_7909();
            if (class_7923.field_41178.method_10221((Object)iiiIIiiiII3).method_12832().equals(IIIiiIIiiI.iiIIiIIiii("'5\u001b\r\u0010\u0018"))) {
                iIiIiIIIII2.iiiiiIIiIi = l2;
                return;
            }
            if (iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(0x67 & 0x3E).method_7960() || IiIiiIIIiI.ALLATORIxDEMO((class_1792)iiiIIiiiII3)) {
                if (iIiIiIIIII2.iIIiiIiIiI.field_1755 != null) {
                    iIiIiIIIII2.iIIiiIiIiI.field_1755.method_25419();
                }
                class_1792[] class_1792Array = new class_1792[1];
                class_1792Array[2 & 5] = class_1802.field_8833;
                if (InvUtils.find((class_1792[])class_1792Array).found()) {
                    class_1792[] class_1792Array2 = new class_1792[--1];
                    class_1792Array2[5 >> 3] = class_1802.field_8833;
                    int this_ = InvUtils.find((class_1792[])class_1792Array2).slot();
                    InvUtils.move().from(this_).toArmor(5 >> 1);
                    iIiiiIIiIi.iiiIiIiiIi();
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre var1_2) {
        v0 = this;
        this = var1_2;
        iIiIiIIIII = v0;
        if (!iIiIiIIIII.ALLATORIxDEMO) ** GOTO lbl25
        v1 = iIiIiIIIII;
        if (!iIiIiIIIII.IIiIiIIiii) {
            v1.iIIiiIiIiI.field_1690.field_1832.method_23481(--1 != 0);
            v2 = iIiIiIIIII;
            iIiIiIIIII.IIiIiIIiii = 5 >> 2;
        } else {
            if (v1.IIiIiIIiii) {
                iIiIiIIIII.IIiIiIIiii = 5 >> 3;
                iIiIiIIIII.ALLATORIxDEMO = 3 & 4;
                iIiIiIIIII.iIIiiIiIiI.field_1690.field_1832.method_23481((boolean)(2 & 5));
            }
lbl25:
            // 4 sources

            v2 = iIiIiIIIII;
        }
        if (v2.iIIiiIiIiI.field_1724 != null) {
            this = iIiIiIIIII.iIIiiIiIiI.field_1724.method_31548().method_5438(103 & 62).method_7909();
            if (!IiIiiIIIiI.ALLATORIxDEMO((class_1792)this) && iIiIiIIIII.iIIiiIiIiI.field_1724.method_24828() && (this == class_1802.field_8162 || this == class_1802.field_8833)) {
                this = iIiIiIIIII.ALLATORIxDEMO();
                if (this != -4 >> 2) {
                    InvUtils.move().from(this).toArmor(1 ^ 3);
                    iIiiiIIiIi.iiiIiIiiIi();
                    iIiIiIIIII.ALLATORIxDEMO = 4 ^ 5;
                }
            }
        }
    }

    public iiiIIiiiII() {
        iiiIIiiiII iiiIIiiiII2 = this;
        super(IiIIiIIiiI.ALLATORIxDEMO("\u81f9\u52d1\u9796\u7fa1\u5243\u634c"), IIIiiIIiiI.iiIIiIIiii("\u576d\u5735\u977c\u65bc\u81bb\u52e7\u7a2b\u769b\u7566\uff48\u5777\u7a3f\u4e73\u4f7a\u7536\u97da\u7f9c\u3040\u5f0a\u4f22\u5395\u5199\u7a03\u685e\u658f\u4f58\u81b3\u52ea\u525e\u6320\u97c1\u7fa7\u4e77\u76b6\u754b"));
        iiiIIiiiII2.iIIiiIiIiI = iiiIIiiiII2.settings.getDefaultGroup();
        iiiIIiiiII iiiIIiiiII3 = this;
        iiiIIiiiII2.iIiIiIIIII = new Object2IntOpenHashMap();
        iiiIIiiiII2.iIIiIiiiIi = iiiIIiiiII2.iIIiiIiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIIiIIiiI.ALLATORIxDEMO("\u5209\u6306\u5eb2\u8ff1"))).description(IIIiiIIiiI.iiIIiIIiii("\u5265\u631b\u5e94\u8fa6"))).defaultValue(0.3).min(0.2).range(0.2, 2.0).build());
        iiiIIiiiII iiiIIiiiII4 = this;
        this.iiiiiIIiIi = 0L;
        iiiIIiiiII4.ALLATORIxDEMO = 3 ^ 3;
        iiiIIiiiII4.IIiIiIIiii = 2 & 5;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiIIiiI.ALLATORIxDEMO("c5v\u0018`\u001c3\fC=R-#\r3\u8b8e\u66e0\u65ce\u5223\u6779\u65be\u722c\u6768\uff2f"));
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1792 class_17922) {
        iiiIIiiiII iiiIIiiiII2 = iiiIIiiiII3;
        iiiIIiiiII iiiIIiiiII3 = class_17922;
        iiiIIiiiII iIiIiIIIII2 = iiiIIiiiII2;
        if (iiiIIiiiII3 == class_1802.field_22028 || iiiIIiiiII3 == class_1802.field_8058 || iiiIIiiiII3 == class_1802.field_8523 || iiiIIiiiII3 == class_1802.field_8873 || iiiIIiiiII3 == class_1802.field_8678 || iiiIIiiiII3 == class_1802.field_8577 || iiiIIiiiII3 == class_1802.field_8833) {
            return true;
        }
        return false;
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        int n;
        iiiIIiiiII iiiIIiiiII2 = this;
        List<Integer> list = IiIiiiiIii.ALLATORIxDEMO((class_1799 iIiIiIIIII2) -> IiIiiIIIiI.ALLATORIxDEMO(iIiIiIIIII2.method_7909()));
        if (list.size() == 0) {
            return -4 >> 2;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n2 = n3 = 3 >> 2;
        while (n2 < list.size()) {
            class_1799 class_17992 = iiiIIiiiII2.iIIiiIiIiI.field_1724.method_31548().method_5438(list.get(n3).intValue());
            class_1792 class_17922 = class_17992.method_7909();
            if ((IiIiiIIIiI.ALLATORIxDEMO(class_17922) || class_17922 == class_1802.field_8833) && iiiIIiiiII2.ALLATORIxDEMO(class_17922)) {
                arrayList.add(list.get(n3));
            }
            n2 = ++n3;
        }
        if (arrayList.size() == 0) {
            return -4 >> 2;
        }
        int n3 = -1;
        int n4 = 5 >> 3;
        int n5 = n = 5 >> 3;
        while (n5 < arrayList.size()) {
            iiiIIiiiII iiiIIiiiII3 = iiiIIiiiII2;
            int n6 = iiiIIiiiII3.ALLATORIxDEMO(iiiIIiiiII3.iIIiiIiIiI.field_1724.method_31548().method_5438(((Integer)arrayList.get(n)).intValue()));
            if (n6 > n4) {
                n4 = n6;
                n3 = (Integer)arrayList.get(n);
            }
            n5 = ++n;
        }
        return n3;
    }

    private /* synthetic */ int ALLATORIxDEMO(class_1799 class_17992) {
        iiiIIiiiII iiiIIiiiII2;
        iiiIIiiiII iiiIIiiiII3 = iiiIIiiiII4;
        iiiIIiiiII iiiIIiiiII4 = class_17992;
        iiiIIiiiII iIiIiIIIII2 = iiiIIiiiII3;
        class_1792 class_17922 = iiiIIiiiII4.method_7909();
        if (!IiIiiIIIiI.ALLATORIxDEMO(class_17922)) {
            return -4 >> 2;
        }
        int n = 0;
        if (class_17922 == class_1802.field_22028) {
            n = 0x1F & 0x6A;
            iiiIIiiiII2 = iiiIIiiiII4;
        } else if (class_17922 == class_1802.field_8058) {
            n = 0x2D & 0x5B;
            iiiIIiiiII2 = iiiIIiiiII4;
        } else if (class_17922 == class_1802.field_8678) {
            n = 0x27 & 0x5F;
            iiiIIiiiII2 = iiiIIiiiII4;
        } else if (class_17922 == class_1802.field_8523) {
            n = 0x4A & 0x3D;
            iiiIIiiiII2 = iiiIIiiiII4;
        } else if (class_17922 == class_1802.field_8873) {
            n = 0x66 & 0x1F;
            iiiIIiiiII2 = iiiIIiiiII4;
        } else if (class_17922 == class_1802.field_8577) {
            n = --5;
            iiiIIiiiII2 = iiiIIiiiII4;
        } else if (class_17922 == class_1802.field_8090) {
            n = --5;
            iiiIIiiiII2 = iiiIIiiiII4;
        } else {
            n = 4;
            iiiIIiiiII2 = iiiIIiiiII4;
        }
        Utils.getEnchantments((class_1799)iiiIIiiiII2, iIiIiIIIII2.iIiIiIIIII);
        iiiIIiiiII iiiIIiiiII5 = iIiIiIIIII2;
        int this2 = Utils.getEnchantmentLevel(iiiIIiiiII5.iIiIiIIIII, (class_5321)class_1893.field_9111);
        int n2 = Utils.getEnchantmentLevel(iiiIIiiiII5.iIiIiIIIII, (class_5321)class_1893.field_9107);
        int n3 = Utils.getEnchantmentLevel(iiiIIiiiII5.iIiIiIIIII, (class_5321)class_1893.field_9095);
        int n4 = Utils.getEnchantmentLevel(iiiIIiiiII5.iIiIiIIIII, (class_5321)class_1893.field_9096);
        int n5 = Utils.getEnchantmentLevel(iiiIIiiiII5.iIiIiIIIII, (class_5321)class_1893.field_9119);
        int n6 = Utils.getEnchantmentLevel(iiiIIiiiII5.iIiIiIIIII, (class_5321)class_1893.field_9101);
        this2 = this2 + n2 + n3 + n4 + n5 + n6 * (5 >> 1);
        return n + this2;
    }
}

