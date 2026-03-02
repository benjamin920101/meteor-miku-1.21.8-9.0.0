/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_3532
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiiIIiiI;
import com.github.mikumiku.addon.IiIIIiIiiI;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.modules.HighwayBlocker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_3532;

public class iiiiiIiIii
extends iIiIiIIIii {
    private int iIIIIIIiII;
    private final iiIIiiIIIi iIIiiIIIIi;
    private int IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final Setting<class_2248> iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<Integer> iIiIIiIIIi;
    private final Setting<HighwayBlocker.SortMode> IIiIiiiiII;
    private final Setting<SettingColor> IIiiIIIIIi;
    private int iIiiiIiIii;
    private int iIiIiiiiII;
    private final SettingGroup IIIIiiIiii;
    private final Setting<Integer> IiiIiIiiIi;
    private final SettingGroup IIiIiIIiii;
    private int iIIiiIiIiI;
    private List<class_2338> iiiiiIIiIi;
    private final Setting<Integer> iIIiIiiiIi;
    private final Setting<ShapeMode> iIiIiIIIII;
    private final Setting<SettingColor> ALLATORIxDEMO;

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1687 == null) {
            return 5 >> 3;
        }
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        iiiiiIiIii iiiiiIiIii2 = this;
        int n = this = 3 & 4;
        while (true) {
            if (n >= 9) break;
            if (iiiiiIiIii2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909() == class_1802.field_8281) {
                return this;
            }
            n = ++this;
        }
        int n2 = this = 9;
        while (true) {
            if (n2 >= 36) break;
            if (iiiiiIiIii2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909() == class_1802.field_8281) {
                return this;
            }
            n2 = ++this;
        }
        return -1;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        class_2338 class_23382;
        iiiiiIiIii iiiiiIiIii2;
        iiiiiIiIii iiiiiIiIii3 = iiiiiIiIii2 = iterator;
        iiiiiIiIii3.iiiiiIIiIi.clear();
        iiiiiIiIii3.iIIIIIIiII = 5 >> 3;
        if (iiiiiIiIii3.IiiiiIiIiI < (Integer)iiiiiIiIii2.iIIiIiiiIi.get()) {
            iiiiiIiIii2.IiiiiIiIiI += 5 >> 2;
            return;
        }
        iiiiiIiIii2.IiiiiIiIiI = 3 ^ 3;
        if (((Boolean)iiiiiIiIii2.iiiIiiIIII.get()).booleanValue() && !iiiiiIiIii2.ALLATORIxDEMO()) {
            return;
        }
        class_1792[] class_1792Array = new class_1792[1];
        class_1792Array[3 >> 2] = ((class_2248)iiiiiIiIii2.iIIIiiiiIi.get()).method_8389();
        if (!IiIiiiiIii.ALLATORIxDEMO(class_1792Array).found()) {
            IiIiIIiiii.iiIIiIIiii("\u6ca1\u6709\u627e\u5230 " + ((class_2248)iiiiiIiIii2.iIIIiiiiIi.get()).method_9518().getString() + "\uff0c\u505c\u6b62\u6a21\u5757");
            iiiiiIiIii2.toggle();
            return;
        }
        iiiiiIiIii iiiiiIiIii4 = iiiiiIiIii2;
        iiiiiIiIii4.ALLATORIxDEMO();
        if (iiiiiIiIii4.iIIiiIiIiI != iiiiiIiIii2.iIiiiIiIii) {
            iiiiiIiIii iiiiiIiIii5 = iiiiiIiIii2;
            iiiiiIiIii5.iIiiiIiIii = iiiiiIiIii5.iIIiiIiIiI;
            IiIiIIiiii.iiIIiIIiii(iiiiiIiIii5.ALLATORIxDEMO());
        }
        iiiiiIiIii iiiiiIiIii6 = iiiiiIiIii2;
        class_2338 iIiIiIIIII2 = iiiiiIiIii6.iIIiiIiIiI.field_1724.method_24515();
        Iterator iterator = iiIIiiiIIi.ALLATORIxDEMO(((Integer)iiiiiIiIii6.IiiIiIiiIi.get()).intValue());
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_23382 = (class_2338)iterator.next();
            if (!iiiiiIiIii2.iiiIiIiiIi(class_23382, iIiIiIIIII2)) continue;
            arrayList.add(class_23382);
        }
        iiiiiIiIii2.ALLATORIxDEMO(arrayList, iIiIiIIIII2);
        iterator = arrayList.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            class_23382 = (class_2338)iterator.next();
            iterator2 = iterator;
            iiiiiIiIii2.ALLATORIxDEMO(class_23382);
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        iiiiiIiIii iiiiiIiIii2 = iiiiiIiIii3;
        iiiiiIiIii iiiiiIiIii3 = class_23382;
        iiiiiIiIii iIiIiIIIII2 = iiiiiIiIii2;
        if (iiiiiIiIii3 == null) {
            return;
        }
        if (iIiIiIIIII2.iiiiiIIiIi.contains(iiiiiIiIii3)) {
            return;
        }
        iiiiiIiIii iiiiiIiIii4 = iIiIiIIIII2;
        if (iiiiiIiIii4.iIIIIIIiII >= (Integer)iiiiiIiIii4.iIiIIiIIIi.get()) {
            return;
        }
        if (iIiIiIIIII2.iIIiiIIIIi.ALLATORIxDEMO((class_2338)iiiiiIiIii3)) {
            return;
        }
        if (class_3532.method_15355((float)((float)iIiIiiIIIi.ALLATORIxDEMO().method_1025(iiiiiIiIii3.method_46558()))) > (float)((Integer)iIiIiIIIII2.IiiIiIiiIi.get()).intValue()) {
            return;
        }
        int n = IiIiiiiIii.IIIIiIIiII(((class_2248)iIiIiIIIII2.iIIIiiiiIi.get()).method_8389());
        if (n == -4 >> 2) {
            return;
        }
        iIiIiIIIII2.iiiiiIIiIi.add((class_2338)iiiiiIiIii3);
        IiIiiiiIii.ALLATORIxDEMO(n);
        iIiIiiIIIi.iiIIiIIiii((class_2338)iiiiiIiIii3);
        IiIiiiiIii.ALLATORIxDEMO(n);
        IiIiiiiIii.ALLATORIxDEMO();
        iiiiiIiIii iiiiiIiIii5 = iIiIiIIIII2;
        iiiiiIiIii5.iIIIIIIiII += 4 ^ 5;
        iiiiiIiIii5.iIiIiiiiII += 4 ^ 5;
        iiiiiIiIii5.iIIiiIIIIi.ALLATORIxDEMO((class_2338)iiiiiIiIii3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String ALLATORIxDEMO() {
        Object object = object2;
        if (!object.isActive()) {
            return IIIiiIIiiI.iiIIiIIiii("\u6773\u546d\u7571");
        }
        switch (((iiiiiIiIii)object).iIIiiIiIiI) {
            case 0: {
                Object object2 = IiIIIiIiiI.ALLATORIxDEMO("\u0005G\u8f09lu\u547d\u4e61\u5879\u5823e");
                break;
            }
            case 1: {
                Object object2 = IIIiiIIiiI.iiIIiIIiii("8R\u8f36yJ\u5468\u5315\u586c\u581cp");
                break;
            }
            case 2: {
                Object object2 = IiIIIiIiiI.ALLATORIxDEMO("\u0005A\u8f09lu\u547d\u8902\u5879\u5823e");
                break;
            }
            case 3: {
                Object object2 = IIIiiIIiiI.iiIIiIIiii("8T\u8f36yJ\u5468\u5355\u586c\u581cp");
                break;
            }
            default: {
                Object object2 = IiIIIiIiiI.ALLATORIxDEMO("\u6757\u77a9");
            }
        }
        Object[] objectArray = new Object[--2];
        objectArray[3 >> 2] = object2;
        objectArray[4 ^ 5] = ((iiiiiIiIii)object).iIiIiiiiII;
        return String.format(IIIiiIIiiI.iiIIiIIiii("g*B\u0005b\u5dab\u655c\u7f17xyg="), objectArray);
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iiiiiIiIii iiiiiIiIii2 = iiiiiIiIii3;
        iiiiiIiIii iiiiiIiIii3 = class_23382;
        iiiiiIiIii iIiIiIIIII2 = iiiiiIiIii2;
        if (!(iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiiiIiIii3).method_26215() || iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiiiIiIii3).method_26204().equals(class_2246.field_10382) || iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiiiIiIii3).method_26204().equals(class_2246.field_10164))) {
            return (2 & 5) != 0;
        }
        return iIiIiiIIIi.iiiIiIiiIi((class_2338)iiiiiIiIii3, 3 >> 1);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int iiiIiIiiIi(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void iIiIiIIIII2;
        class_2338 iIiIiIIIII3 = class_23384;
        class_2338 iIiIiIIIII4 = class_23382;
        double d = Math.abs(iIiIiIIIII2.method_10260() - iIiIiIIIII4.method_10260());
        double d2 = Math.abs(iIiIiIIIII3.method_10260() - iIiIiIIIII4.method_10260());
        return Double.compare(d, d2);
    }

    public iiiiiIiIii() {
        iiiiiIiIii iiiiiIiIii2 = this;
        super(IiIIIiIiiI.ALLATORIxDEMO("\u9ab4\u9062\u5879\u8d92\u8049"), IIIiiIIiiI.iiIIiIIiii("\u81b3\u52e8\u5773\u4e55\u7509\u653b\u7f70\u65f3\u5706\u587a\u580a\u9a97\u904b\u8dabse\u5ea4\u8bab\u9153\u544a\u0002\u4e42\u9577\u8827\u7e80\u001f\u3058\u0019\u81b3\u52ca\u8d09\u8dad\u0004B\u4e79\u8d35\u4f26\u756a\u305b"));
        iiiiiIiIii2.IIIIiiIiii = iiiiiIiIii2.settings.getDefaultGroup();
        iiiiiIiIii2.IIiIiIIiii = iiiiiIiIii2.settings.createGroup(IiIIIiIiiI.ALLATORIxDEMO("\u6e4f\u679f"));
        iiiiiIiIii2.iIIIiiiiIi = iiiiiIiIii2.IIIIiiIiii.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u65fb\u570e\u7c39\u57d2"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u9045\u62b4\u7544\u4ef3\u5879\u5803\u76e8\u65c4\u571b\u7c06\u57c7"))).defaultValue((Object)class_2246.field_10540)).build());
        this.IiiIiIiiIi = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u657c\u7f37\u8341\u56ad"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u5755\u8ee7\u5453\u5976\u8fa1\u76c8\u4f10\u7f02\u6543\u7f22\u65c4\u571b"))).defaultValue((Object)(--4))).min(--1).sliderMax(0x3F & 0x4A).build());
        this.iIiIIiIIIi = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u6762\u595e\u657c\u7f37\u6532\u9196"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u6bb2\u6b6d\u675d\u5976\u6543\u7f22\u76d9\u9ebd\u66a1\u77bf\u650d\u9183"))).defaultValue((Object)(--2))).min(--1).sliderMax(--5).build());
        this.iIIiIiiiIi = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u657c\u7f37\u5eb4\u8f86"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u6543\u7f22\u9eac\u6690\u778e\u4e07\u95a9\u76e8\u5e8b\u8f93\uff55\u0018\u0014/\u0016\uff45"))).defaultValue((Object)(5 >> 3))).min(3 ^ 3).sliderMax(0x76 & 0x1D).build());
        this.IIiIiiiiII = this.IIIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u63d0\u5ed6\u6a63\u5f56"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u59df\u4f39\u63ef\u5ec3\u89dc\u6552\u7f13\u76c8\u4f30\u7f22"))).defaultValue((Object)HighwayBlocker.SortMode.iIIiIiiiIi)).build());
        this.iiiIiiIIII = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u4e9c\u4e49\u7515"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u53b7\u5744\u4e76\u7500\u7562\u6504"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiIiIIiii = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u667c\u7963\u6e70\u678a"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u6663\u545b\u6672\u7947\u5fc9\u6563\u7f02\u9eac\u6690\u77ae\u76e8\u6e4f\u679f\u98f9\u8984"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIiIiIIIII = this.IIiIiIIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u6e70\u678a\u6a63\u5f56"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u9065\u6294\u6e7e\u678e\u76e8\u6643\u7976\u6a5c\u5f43"))).defaultValue((Object)ShapeMode.Both)).build());
        int n = 0x26B0 & 0x59CF;
        this.IIiiIIIIIi = this.IIiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u4fe5\u973b\u98de\u822b"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u5fc9\u6543\u7f22\u9e8c\u66b0\u778e\u76c8\u4ffa\u970e\u5816\u5109\u98e1\u823e"))).defaultValue(new SettingColor(n, 3 & 4, n, 0x1F & 0x7E)).build());
        int n2 = 0xCF3 & 0x738C;
        this.ALLATORIxDEMO = this.IIiIiIIiii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIIiiIIiiI.iiIIiIIiii("\u7efd\u6738\u98de\u822b"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u5fc9\u6563\u7f02\u9eac\u6690\u77ae\u76e8\u7ec2\u672d\u98e1\u823e"))).defaultValue(new SettingColor(n2, 3 >> 2, n2, 0x7BFF & 0x4FF)).build());
        iiiiiIiIii iiiiiIiIii3 = this;
        this.iIIiiIiIiI = 3 ^ 3;
        this.iIiiiIiIii = -4 >> 2;
        this.iIiIiiiiII = 3 >> 2;
        iiiiiIiIii iiiiiIiIii4 = this;
        this.iiiiiIIiIi = new ArrayList<class_2338>();
        iiiiiIiIii3.IiiiiIiIiI = this.iIiIiiiiII;
        iiiiiIiIii3.iIIIIIIiII = 3 & 4;
        iiiiiIiIii iiiiiIiIii5 = this;
        iiiiiIiIii3.iIIiiIIIIi = new iiIIiiIIIi(1000L);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIiiIIiiI.iiIIiIIiii("\u00152`\u007f1<b,2=#-'xB\u8b8e\u66b6\u65e9\u5252\u6779\u65f2\u7211\u676e\uff58"));
        }
    }

    public void iiiIiIiiIi() {
        this.iIiIiiiiII = 2 & 5;
        IiIiIIiiii.iiIIiIIiii(IiIIIiIiiI.ALLATORIxDEMO("\u7eb3\u8bdc\u5dbe\u91b0\u7f22"));
    }

    @Override
    public void onActivate() {
        super.onActivate();
        this.iIiIiiiiII = 3 & 4;
        this.IiiiiIiIiI = 5 >> 3;
        this.iIIIIIIiII = this.IiiiiIiIiI;
        this.iIiiiIiIii = -4 >> 2;
        this.iiiiiIIiIi.clear();
        this.iIIiiIIIIi.iiIIiIIiii();
        IiIiIIiiii.iiIIiIIiii(IiIIIiIiiI.ALLATORIxDEMO("\u9a94\u9042\u8d83\u5848\u5812\u6a7c\u573b\u5d8f\u5463\u7555\uff4d"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382, class_2338 class_23383) {
        void iIiIiIIIII2;
        iiiiiIiIii iiiiiIiIii2 = iiiiiIiIii3;
        iiiiiIiIii iiiiiIiIii3 = class_23382;
        iiiiiIiIii iIiIiIIIII3 = iiiiiIiIii2;
        if (Math.sqrt(Math.pow(iiiiiIiIii3.method_10263() - iIiIiIIIII2.method_10263(), 2.0) + Math.pow(iiiiiIiIii3.method_10264() - iIiIiIIIII2.method_10264(), 2.0) + Math.pow(iiiiiIiIii3.method_10260() - iIiIiIIIII2.method_10260(), 2.0)) < 0.2) {
            return 5 >> 3;
        }
        if (!iIiIiIIIII3.ALLATORIxDEMO((class_2338)iiiiiIiIii3, (class_2338)iIiIiIIIII2)) {
            return (3 & 4) != 0;
        }
        return iIiIiIIIII3.ALLATORIxDEMO((class_2338)iiiiiIiIii3);
    }

    public void onDeactivate() {
        iiiiiIiIii iiiiiIiIii2 = this;
        IiIiIIiiii.iiIIiIIiii("\u9ad8\u901f\u8def\u5835\u585e\u6a21\u5757\u5df2\u505c\u7528\uff01\u603b\u5171\u653e\u7f6e\u4e86 " + iiiiiIiIii2.iIiIiiiiII + " \u4e2a " + ((class_2248)iiiiiIiIii2.iIIIiiiiIi.get()).method_9518().getString());
        iiiiiIiIii iiiiiIiIii3 = this;
        iiiiiIiIii3.iIiiiIiIii = -4 >> 2;
        iiiiiIiIii3.iIIiiIIIIi.iiiIiIiiIi();
        iiiiiIiIii3.iiiIiIiiIi();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<class_2338> list, class_2338 class_23382) {
        iiiiiIiIii iiiiiIiIii2;
        iiiiiIiIii iiiiiIiIii3 = list2;
        List<class_2338> list2 = list;
        iiiiiIiIii iIiIiIIIII2 = iiiiiIiIii3;
        if (list2.isEmpty()) {
            return;
        }
        switch (iIiIiIIIII2.iIIiiIiIiI) {
            case 0: 
            case 2: {
                void iIiIiIIIII3;
                while (false) {
                }
                list2.sort((arg_0, arg_1) -> iiiiiIiIii.ALLATORIxDEMO((class_2338)iIiIiIIIII3, arg_0, arg_1));
                iiiiiIiIii2 = iIiIiIIIII2;
                break;
            }
            case 1: 
            case 3: {
                void iIiIiIIIII3;
                list2.sort((arg_0, arg_1) -> iiiiiIiIii.iiiIiIiiIi((class_2338)iIiIiIIIII3, arg_0, arg_1));
            }
            default: {
                iiiiiIiIii2 = iIiIiIIIII2;
            }
        }
        if (iiiiiIiIii2.IIiIiiiiII.get() == HighwayBlocker.SortMode.iIIiIiiiIi) {
            Collections.reverse(list2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void iIiIiIIIII2;
        class_2338 iIiIiIIIII3 = class_23384;
        class_2338 iIiIiIIIII4 = class_23382;
        double d = Math.abs(iIiIiIIIII2.method_10263() - iIiIiIIIII4.method_10263());
        double d2 = Math.abs(iIiIiIIIII3.method_10263() - iIiIiIIIII4.method_10263());
        return Double.compare(d, d2);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiiiiIiIii iiiiiIiIii2;
        double d;
        if (this.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        iiiiiIiIii iiiiiIiIii3 = this;
        double d2 = Math.abs(iiiiiIiIii3.iIIiiIiIiI.field_1724.method_23317());
        if (d2 > (d = Math.abs(iiiiiIiIii3.iIIiiIiIiI.field_1724.method_23321()))) {
            iiiiiIiIii iiiiiIiIii4;
            this.iIIiiIiIiI = iiiiiIiIii4.iIIiiIiIiI.field_1724.method_23317() > 0.0 ? 3 & 4 : 2;
            return;
        }
        this.iIIiiIiIiI = iiiiiIiIii2.iIIiiIiIiI.field_1724.method_23321() > 0.0 ? 3 >> 1 : 3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        iiiiiIiIii iiiiiIiIii2 = iiiiiIiIii3;
        iiiiiIiIii iiiiiIiIii3 = class_23383;
        iiiiiIiIii iIiIiIIIII2 = iiiiiIiIii2;
        switch (iIiIiIIIII2.iIIiiIiIiI) {
            case 0: {
                void iIiIiIIIII3;
                if (iIiIiIIIII3.method_10263() >= iiiiiIiIii3.method_10263()) return false;
                return (2 ^ 3) != 0;
            }
            case 1: {
                void iIiIiIIIII3;
                if (iIiIiIIIII3.method_10260() >= iiiiiIiIii3.method_10260()) return false;
                return (4 ^ 5) != 0;
            }
            case 2: {
                void iIiIiIIIII3;
                if (iIiIiIIIII3.method_10263() <= iiiiiIiIii3.method_10263()) return false;
                return 3 >> 1;
            }
            case 3: {
                void iIiIiIIIII3;
                if (iIiIiIIIII3.method_10260() <= iiiiiIiIii3.method_10260()) return false;
                return 3 >> 1;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiiiiIiIii iiiiiIiIii2 = this;
        if (((Boolean)iiiiiIiIii2.iiiIiIIiii.get()).booleanValue() && iiiiiIiIii2.iiiiiIIiIi.size() > 0) {
            class_1792[] class_1792Array = new class_1792[3 & 5];
            class_1792Array[3 & 4] = ((class_2248)iiiiiIiIii2.iIIIiiiiIi.get()).method_8389();
            if (IiIiiiiIii.ALLATORIxDEMO(class_1792Array).found()) {
                int n = this = 3 & 4;
                while (n < iiiiiIiIii2.iiiiiIIiIi.size()) {
                    void iIiIiIIIII2;
                    double d = iiiiiIiIii2.iiiiiIIiIi.get(this).method_10263();
                    double d2 = iiiiiIiIii2.iiiiiIIiIi.get(this).method_10264();
                    double d3 = iiiiiIiIii2.iiiiiIIiIi.get(this).method_10260();
                    double d4 = iiiiiIiIii2.iiiiiIIiIi.get(this).method_10263() + (3 & 5);
                    double d5 = iiiiiIiIii2.iiiiiIIiIi.get(this).method_10264() + (2 ^ 3);
                    double d6 = iiiiiIiIii2.iiiiiIIiIi.get(this).method_10260() + (5 >> 2);
                    int n2 = --1;
                    iIiIiIIIII2.renderer.box(d, d2, d3, d4, d5, d6, (Color)iiiiiIiIii2.IIiiIIIIIi.get(), (Color)iiiiiIiIii2.ALLATORIxDEMO.get(), (ShapeMode)iiiiiIiIii2.iIiIiIIIII.get(), 3 ^ 3);
                    n = ++this;
                }
            }
        }
    }
}

