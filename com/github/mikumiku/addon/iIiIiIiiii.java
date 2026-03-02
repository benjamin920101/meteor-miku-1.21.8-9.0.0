/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.combat.AnchorAura
 *  meteordevelopment.meteorclient.systems.modules.combat.BedAura
 *  meteordevelopment.meteorclient.systems.modules.combat.CrystalAura
 *  meteordevelopment.meteorclient.systems.modules.combat.KillAura
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import com.github.mikumiku.addon.IIIiIIiiiI;
import com.github.mikumiku.addon.iIIIIIIIIi;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.mixinface.MySettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.AnchorAura;
import meteordevelopment.meteorclient.systems.modules.combat.BedAura;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.systems.modules.combat.KillAura;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;

public class iIiIiIiiii
extends iIiIiIIIii {
    private final Setting<Integer> iIIIIIiiII;
    private final Setting<Integer> iIIiiiiIii;
    private final Setting<List<class_1792>> iiIIIiIIIi;
    private final Setting<List<class_1792>> iIiiiiIIII;
    private final Setting<Boolean> iiIiIIiiii;
    private boolean iIIiIiiIiI;
    private final SettingGroup iIIIIIIiII;
    private boolean iIIiiIIIIi;
    private final Setting<Boolean> IiiiiIiIiI;
    private final SettingGroup iiiIiIIiii;
    private final Setting<Integer> iIIIiiiiIi;
    private int iiiIiiIIII;
    private final SettingGroup iIiIIiIIIi;
    private int IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private int iIiiiIiIii;
    private static final Class<? extends Module>[] iIiIiiiiII;
    private final Setting<Integer> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final SettingGroup IIiIiIIiii;
    private final Setting<List<class_1792>> iIIiiIiIiI;
    private final List<Class<? extends Module>> iiiiiIIiIi;
    private final Setting<Integer> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiIiIiiii iIiIiIiiii2 = iIiIiIiiii3;
        iIiIiIiiii iIiIiIiiii3 = pre;
        iIiIiIiiii iIiIiIIIII2 = iIiIiIiiii2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (iIiIiIIIII2.iIiiiIiIii > 0) {
            iIiIiIIIII2.iIiiiIiIii -= 3 & 5;
        }
        iIiIiIiiii iIiIiIiiii4 = iIiIiIIIII2;
        iIiIiIiiii4.iiiIiiIIII += 3 >> 1;
        if (iIiIiIiiii4.iIIiIiiIiI) {
            iIiIiIiiii iIiIiIiiii5 = iIiIiIIIII2;
            iIiIiIiiii5.iIIiiIiIiI.field_1690.field_1904.method_23481(--1 != 0);
            if (!iIiIiIiiii5.iIIiiIiIiI.field_1724.method_6115()) {
                Utils.rightClick();
            }
            if (!iIiIiIIIII2.iiiIiIiiIi()) {
                iIiIiIIIII2.IIIIiIIiII();
            }
            return;
        }
        if (iIiIiIIIII2.iIiiiIiIii > 0) {
            return;
        }
        if (((Boolean)iIiIiIIIII2.iiIiIIiiii.get()).booleanValue()) {
            iIiIiIIIII2.iiIIiIIiii();
        }
        if (((Boolean)iIiIiIIIII2.IiiiiIiIiI.get()).booleanValue() && iIiIiIIIII2.iiIIiIIiii()) {
            iIiIiIiiii iIiIiIiiii6 = iIiIiIIIII2;
            iIiIiIiiii3 = iIiIiIiiii6.ALLATORIxDEMO((List)iIiIiIiiii6.iIiiiiIIII.get());
            if (iIiIiIiiii3 != null) {
                iIiIiIIIII2.ALLATORIxDEMO((class_1792)iIiIiIiiii3);
                return;
            }
        }
        if (((Boolean)iIiIiIIIII2.iIiIiIIIII.get()).booleanValue() && iIiIiIIIII2.ALLATORIxDEMO()) {
            iIiIiIiiii iIiIiIiiii7 = iIiIiIIIII2;
            iIiIiIiiii3 = iIiIiIiiii7.ALLATORIxDEMO((List)iIiIiIiiii7.iiIIIiIIIi.get());
            if (iIiIiIiiii3 != null) {
                iIiIiIIIII2.ALLATORIxDEMO((class_1792)iIiIiIiiii3);
                return;
            }
        }
        if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue() && iIiIiIIIII2.IIIIiIIiII()) {
            iIiIiIiiii iIiIiIiiii8 = iIiIiIIIII2;
            iIiIiIiiii3 = iIiIiIiiii8.ALLATORIxDEMO((List)iIiIiIiiii8.iIIiiIiIiI.get());
            if (iIiIiIiiii3 != null) {
                iIiIiIIIII2.ALLATORIxDEMO((class_1792)iIiIiIiiii3);
                iIiIiIIIII2.iiiIiiIIII = 3 >> 2;
            }
        }
    }

    private /* synthetic */ void IIIIiIIiII() {
        iIiIiIiiii iIiIiIiiii2 = this;
        iIiIiIiiii2.iIIiiIiIiI.field_1690.field_1904.method_23481((2 & 5) != 0);
        if (iIiIiIiiii2.IIiIiiiiII != -4 >> 2) {
            InvUtils.swap((int)this.IIiIiiiiII, (2 & 5) != 0);
            this.IIiIiiiiII = -4 >> 2;
        }
        this.iIIiIiiIiI = 2 & 5;
        this.iiiIiIiiIi();
    }

    private /* synthetic */ boolean IIIIiIIiII() {
        iIiIiIiiii iIiIiIiiii2 = this;
        if (iIiIiIiiii2.iiiIiiIIII >= (Integer)iIiIiIiiii2.iIIIIIiiII.get() * (0x5F & 0x34)) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    @Override
    public void onActivate() {
        super.onActivate();
        this.iIiiiIiIii = 3 >> 2;
        this.iiiIiiIIII = 5 >> 3;
        this.iIIiIiiIiI = this.iiiIiiIIII;
        this.info(MySettings.ALLATORIxDEMO("\u81e5\u52b1\u541b\u5591\u5dff\u5432\u52b4"), new Object[3 >> 2]);
    }

    private /* synthetic */ void iiIIiIIiii() {
        int n;
        iIiIiIiiii iIiIiIiiii2 = this;
        int n2 = n = 5 >> 3;
        while (true) {
            if (n2 >= 9) break;
            class_1799 class_17992 = iIiIiIiiii2.iIIiiIiIiI.field_1724.method_31548().method_5438(n);
            if (!class_17992.method_7960() && class_17992.method_7947() < (Integer)iIiIiIiiii2.IIIIiiIiii.get()) {
                int n3 = this = 9;
                while (n3 < iIiIiIiiii2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
                    class_1799 class_17993 = iIiIiIiiii2.iIIiiIiIiI.field_1724.method_31548().method_5438(this);
                    if (!class_17993.method_7960() && class_1799.method_7984((class_1799)class_17992, (class_1799)class_17993)) {
                        InvUtils.move().from(this).to(n);
                        Object[] objectArray = new Object[5 >> 2];
                        objectArray[3 & 4] = class_17992.method_7909().method_63680().getString();
                        iIiIiIiiii2.info(IIIiIIiiiI.ALLATORIxDEMO("\u8879\u5152\u5ff7\u6340\u6833\r\u001c\u0012O"), objectArray);
                        return;
                    }
                    n3 = ++this;
                }
            }
            n2 = ++n;
        }
    }

    static {
        Class[] classArray = new Class[--5];
        classArray[3 ^ 3] = KillAura.class;
        classArray[2 ^ 3] = CrystalAura.class;
        classArray[--2] = iIIIIIIIIi.class;
        classArray[--3] = AnchorAura.class;
        classArray[--4] = BedAura.class;
        iIiIiiiiII = classArray;
    }

    public iIiIiIiiii() {
        iIiIiIiiii iIiIiIiiii2 = this;
        super(iIiIiIIIii.iiiiiIIiIi, IIIiIIiiiI.ALLATORIxDEMO("\u81c0\u5289\u5463\u55f6"), MySettings.ALLATORIxDEMO("\u81fa\u52b9\u4f6f\u756c\u722c\u54d0\uff1c\u6539\u6316\u590b\u79dd\u89ea\u53dc\u6727\u4eb1"));
        iIiIiIiiii2.iIiIIiIIIi = iIiIiIiiii2.settings.getDefaultGroup();
        iIiIiIiiii2.iIIIIIIiII = iIiIiIiiii2.settings.createGroup(IIIiIIiiiI.ALLATORIxDEMO("\u7523\u5457\u501d\u8986\u53ba"));
        iIiIiIiiii2.iiiIiIIiii = iIiIiIiiii2.settings.createGroup(MySettings.ALLATORIxDEMO("\u9975\u9973\u5031\u89a0\u5396"));
        iIiIiIiiii2.IIiIiIIiii = iIiIiIiiii2.settings.createGroup(IIIiIIiiiI.ALLATORIxDEMO("\u5bb0\u65d7\u8986\u53ba"));
        iIiIiIiiii2.ALLATORIxDEMO = iIiIiIiiii2.settings.createGroup(MySettings.ALLATORIxDEMO("\u81e6\u52a5\u8823\u5102"));
        iIiIiIiiii2.iIIiIiiiIi = iIiIiIiiii2.iIiIIiIIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u4f55\u7509\u5e96\u8fb4"))).description(MySettings.ALLATORIxDEMO("\u4f6e\u7538\u722d\u5484\u4e5a\u95e4\u7692\u5ee1\u8fce\uff18\u6e34\u6202\u527d\uff4e"))).defaultValue((Object)(0x75 & 0x1E))).min(5 >> 2).max(0x5BFF & 0x24C8).build());
        this.IIiiIIIIIi = this.iIiIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u4f43\u7518\u65cd\u66b5\u5060\u515c\u4ef7\u52c8\u4f37"))).description(MySettings.ALLATORIxDEMO("\u4f3a\u7539\u7279\u54d7\u65e1\u6693\u504c\u517a\u4edb\u52ee\u4f1b"))).defaultValue((Object)(3 >> 1))).build());
        this.IiiiiIiIiI = this.iIIIIIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u5414\u751f\u7523\u5457\u501d\u8986\u53ba"))).description(MySettings.ALLATORIxDEMO("\u5f43\u750e\u546d\u502d\u4f5e\u4eca\u964d\u502d\u65e6\u81fc\u52bf\u4f6e\u7538\u6cb7\u759a\u722f\u5486"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIIiiiiIii = this.iIIIIIIiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u7523\u5457\u501d\u9668\u5057"))).description(MySettings.ALLATORIxDEMO("\u89a2\u5394\u4f6e\u7538\u6cad\u7580\u7278\u54d1\u7688\u7512\u543b\u507b"))).defaultValue((Object)(0x2E & 0x5B))).min(--1).max(0x77 & 0x1C).build());
        class_1792[] class_1792Array = new class_1792[--4];
        class_1792Array[5 >> 3] = class_1802.field_8463;
        class_1792Array[3 & 5] = class_1802.field_8367;
        class_1792Array[1 ^ 3] = class_1802.field_8176;
        class_1792Array[--3] = class_1802.field_8261;
        this.iIiiiiIIII = this.iIIIIIIiII.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u6c91\u75b6\u7209\u54aa"))).description(MySettings.ALLATORIxDEMO("\u7539\u4e9e\u6074\u591a\u750e\u546d\u5030\u7689\u722f\u5486"))).defaultValue(Arrays.asList(class_1792Array))).build());
        this.iIiIiIIIII = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u5414\u751f\u9959\u9955\u501d\u8986\u53ba"))).description(MySettings.ALLATORIxDEMO("\u5f43\u9974\u996f\u5078\u4f0b\u4e9f\u9618\u502a\u65e1\u81fb\u52b8\u4f73\u7525\u9899\u722e"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIIIiiiiIi = this.iiiIiIIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u9959\u9955\u501d\u9668\u5057"))).description(MySettings.ALLATORIxDEMO("\u89f7\u53c1\u4f69\u753f\u98ce\u7279\u7688\u9968\u9939\u507b"))).defaultValue((Object)(0x7F & 0xE))).min(--1).max(0x54 & 0x3F).build());
        class_1792[] class_1792Array2 = new class_1792[--4];
        class_1792Array2[5 >> 3] = class_1802.field_8176;
        class_1792Array2[--1] = class_1802.field_8261;
        class_1792Array2[5 >> 1] = class_1802.field_8229;
        class_1792Array2[--3] = class_1802.field_8071;
        this.iiIIIiIIIi = this.iiiIiIIiii.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u98f5\u7248\u7209\u54aa"))).description(MySettings.ALLATORIxDEMO("\u7539\u4e9e\u6074\u591a\u9974\u996f\u5030\u7689\u722f\u5486"))).defaultValue(Arrays.asList(class_1792Array2))).build());
        this.IiiIiIiiIi = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u5418\u7514\u5bb0\u65d7\u8986\u53ba"))).description(MySettings.ALLATORIxDEMO("\u5b8b\u65e6\u81fc\u52bf\u4f6e\u7538\u630b\u5b97\u722f\u5486"))).defaultValue((Object)(5 >> 3))).build());
        this.iIIIIIiiII = this.IIiIiIIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u5ba1\u65c1\u95c8\u96be\uff29\u79b2\uff62"))).description(MySettings.ALLATORIxDEMO("\u5bde\u65b3\u4f6e\u7538\u727f\u54d6\u7695\u95e4\u9698\uff05\u7994\uff4e"))).defaultValue((Object)(0x3C & 0x7F))).min(5 >> 2).max(0x2E9D & 0x5F72).build());
        this.iIIiiIiIiI = this.IIiIiIIiii.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u5bb0\u65d7\u7209\u54aa"))).description(MySettings.ALLATORIxDEMO("\u5b8d\u65e7\u4f6f\u7524\u7689\u722f\u5486"))).defaultValue(Collections.singletonList(class_1802.field_50140))).build());
        this.iiIiIIiiii = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u81d1\u529f\u8859\u516f\u5fca\u6317\u6864"))).description(MySettings.ALLATORIxDEMO("\u81fa\u52b9\u4ede\u8088\u5340\u8874\u5155\u5ffd\u6360\u681e\u4e3d\u7688\u6d85\u8051\u5486"))).defaultValue((Object)(3 >> 1))).build());
        this.IIIIiiIiii = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u884f\u5164\u9668\u5057"))).description(MySettings.ALLATORIxDEMO("\u5f42\u7279\u5485\u6535\u91de\u4f5e\u4e98\u6b73\u502d\u65e6\u8fd7\u8841\u8823\u5102"))).defaultValue((Object)(4 ^ 5))).min(3 & 5).max(0x4C & 0x73).build());
        iIiIiIiiii iIiIiIiiii3 = this;
        iIiIiIiiii iIiIiIiiii4 = this;
        iIiIiIiiii4.iIiiiIiIii = 5 >> 3;
        iIiIiIiiii4.iiiIiiIIII = 3 >> 2;
        iIiIiIiiii3.IIiIiiiiII = -4 >> 2;
        iIiIiIiiii3.iIIiIiiIiI = 3 ^ 3;
        iIiIiIiiii iIiIiIiiii5 = this;
        iIiIiIiiii3.iiiiiIIiIi = new ArrayList<Class<? extends Module>>();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIiIIiiiI.ALLATORIxDEMO("gPr}DY\u0017IGXVH\u0007H\u0017\u8bcb\u66c4\u658b\u5207\u673c\u659a\u7269\u674c\uff6a"));
        }
    }

    private /* synthetic */ boolean iiIIiIIiii() {
        if (this.iIIiiIiIiI.field_1724.method_6032() < (float)((Integer)this.iIIiiiiIii.get()).intValue()) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    public void onDeactivate() {
        if (this.iIIiIiiIiI) {
            this.IIIIiIIiII();
        }
        this.info(IIIiIIiiiI.ALLATORIxDEMO("\u81c9\u5297\u5437\u55b7\u5dd3\u5148\u95dd"), new Object[3 ^ 3]);
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        if (this.iIIiiIiIiI.field_1724.method_6115()) {
            return (4 ^ 5) != 0;
        }
        iIiIiIiiii iIiIiIiiii2 = this;
        if (iIiIiIiiii2.iIiiiIiIii > (Integer)iIiIiIiiii2.iIIiIiiiIi.get() - --5) {
            return 3 >> 1;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1724.method_7344().method_7586() < (Integer)this.iIIIiiiiIi.get()) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ void iiiIiIiiIi() {
        Class<? extends Module>[] classArray = classArray2;
        if (((Boolean)classArray.IIiiIIIIIi.get()).booleanValue()) {
            int n;
            Class<? extends Module>[] classArray2 = iIiIiiiiII;
            int n2 = iIiIiiiiII.length;
            int n3 = n = 3 & 4;
            while (n3 < n2) {
                Class<? extends Module> clazz = classArray2[n];
                Module module = Modules.get().get(clazz);
                if (classArray.iiiiiIIiIi.contains(clazz) && !module.isActive()) {
                    module.toggle();
                }
                n3 = ++n;
            }
        }
        try {
            if (((Boolean)classArray.IIiiIIIIIi.get()).booleanValue() && classArray.iIIiiIIIIi) {
                BaritoneAPI.getProvider().getPrimaryBaritone().getCommandManager().execute(IIIiIIiiiI.ALLATORIxDEMO("EYdiZY"));
                return;
            }
        }
        catch (Exception this_) {
            classArray.info("error:" + String.valueOf(this_), new Object[3 & 4]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1792 class_17922) {
        void iIiIiIIIII2;
        iIiIiIiiii iIiIiIiiii2 = iIiIiIiiii3;
        class_1792[] class_1792Array = new class_1792[4 ^ 5];
        class_1792Array[3 ^ 3] = iIiIiIIIII2;
        iIiIiIiiii iIiIiIiiii3 = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (!iIiIiIiiii3.found()) {
            return;
        }
        iIiIiIiiii2.ALLATORIxDEMO();
        iIiIiIiiii2.IIiIiiiiII = iIiiiIIiIi.ALLATORIxDEMO();
        InvUtils.swap((int)iIiIiIiiii3.slot(), (3 ^ 3) != 0);
        iIiIiIiiii2.iIIiiIiIiI.field_1690.field_1904.method_23481(5 >> 2);
        if (!iIiIiIiiii2.iIIiiIiIiI.field_1724.method_6115()) {
            Utils.rightClick();
        }
        iIiIiIiiii2.iIIiIiiIiI = 4 ^ 5;
        iIiIiIiiii2.iIiiiIiIii = (Integer)iIiIiIiiii2.iIIiIiiiIi.get();
        Object[] objectArray = new Object[--1];
        objectArray[3 >> 2] = iIiIiIIIII2.method_63680().getString();
        iIiIiIiiii2.info(MySettings.ALLATORIxDEMO("\u4f43\u7515\u7254\u54fd\u000f\u0014\u0012E"), objectArray);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        Class<? extends Module>[] classArray = classArray2;
        classArray.iiiiiIIiIi.clear();
        if (((Boolean)classArray.IIiiIIIIIi.get()).booleanValue()) {
            int n;
            Class<? extends Module>[] classArray2 = iIiIiiiiII;
            int n2 = iIiIiiiiII.length;
            int n3 = n = 2 & 5;
            while (n3 < n2) {
                Class<? extends Module> clazz = classArray2[n];
                Module module = Modules.get().get(clazz);
                if (module.isActive()) {
                    classArray.iiiiiIIiIi.add(clazz);
                    module.toggle();
                }
                n3 = ++n;
            }
        }
        classArray.iIIiiIIIIi = 3 ^ 3;
        try {
            if (((Boolean)classArray.IIiiIIIIIi.get()).booleanValue() && BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
                classArray.iIIiiIIIIi = 3 >> 1;
                BaritoneAPI.getProvider().getPrimaryBaritone().getCommandManager().execute(MySettings.ALLATORIxDEMO("LTADS"));
                return;
            }
        }
        catch (Exception this_) {
            classArray.info("error:" + String.valueOf(this_), new Object[2 & 5]);
        }
    }

    private /* synthetic */ class_1792 ALLATORIxDEMO(List<class_1792> list) {
        iIiIiIiiii iIiIiIiiii2 = iterator;
        Iterator iterator = list;
        iIiIiIiiii iIiIiIIIII2 = iIiIiIiiii2;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_1792 class_17922 = (class_1792)iterator.next();
            class_1792[] class_1792Array = new class_1792[2 ^ 3];
            class_1792Array[3 >> 2] = class_17922;
            if (!InvUtils.findInHotbar((class_1792[])class_1792Array).found()) continue;
            return class_17922;
        }
        return null;
    }
}

