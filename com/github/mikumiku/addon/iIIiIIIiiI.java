/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.utils.player.SlotUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIiiIIIi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.utils.player.SlotUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class iIIiIIIiiI
extends iIiIiIIIii {
    private final Setting<List<class_1792>> iIIiiIIIIi;
    private final Setting<Boolean> IiiiiIiIiI;
    private final Setting<Integer> iiiIiIIiii;
    private final Setting<List<class_1792>> iIIIiiiiIi;
    private final SettingGroup iiiIiiIIII;
    private final Setting<Boolean> iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private Set<class_1792> IIiiIIIIIi;
    private final SettingGroup iIiiiIiIii;
    private final Setting<String> iIiIiiiiII;
    private final Setting<String> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private int iIIiiIiIiI;
    private final Setting<List<class_1792>> iiiiiIIiIi;
    private final SettingGroup iIIiIiiiIi;
    private final Setting<String> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    public void iiiIiIiiIi() {
        iIIiIIIiiI iIIiIIIiiI2 = this;
        if (iIIiIIIiiI2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        iIIiIIIiiI2.ALLATORIxDEMO();
        int n = 2 & 5;
        int n2 = this = ((Boolean)iIIiIIIiiI2.IIiIiiiiII.get()).booleanValue() ? 0x59 & 0x2F : 0;
        while (n2 < iIIiIIIiiI2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            if (!iIIiIIIiiI2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7960()) {
                iIIiIIIiiI iIIiIIIiiI3 = iIIiIIIiiI2;
                class_1792 class_17922 = iIIiIIIiiI3.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909();
                if (iIIiIIIiiI3.IIiiIIIIIi.contains(class_17922)) {
                    iIIiIIIiiI iIIiIIIiiI4 = iIIiIIIiiI2;
                    int n3 = iIIiIIIiiI4.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7947();
                    iIIiIIIiiI4.ALLATORIxDEMO(this);
                    n += n3;
                }
            }
            n2 = ++this;
        }
        iIIiIIIiiI iIIiIIIiiI5 = iIIiIIIiiI2;
        if (n > 0) {
            Object[] objectArray = new Object[3 >> 1];
            objectArray[3 ^ 3] = n;
            iIIiIIIiiI5.info(iiIIiiIIIi.ALLATORIxDEMO("\u625a\u52e8\u6e14\u7446\u5b9d\u6270\uff3d\u5131\u4e33\u5f63\u0011eu`\u4e3b\u57e3\u570f\u7229\u54d0"), objectArray);
            return;
        }
        iIIiIIIiiI5.info(IiiiIiiIII.ALLATORIxDEMO("\u5e81\u5b35\u4e1f\u6cec\u673b\u974d\u89b3\u6e48\u7414\u76e9\u5791\u5753\u725b\u548c"), new Object[5 >> 3]);
    }

    public String ALLATORIxDEMO() {
        Object object;
        class_1792 class_17922;
        iIIiIIIiiI iIIiIIIiiI2 = this;
        if (iIIiIIIiiI2.iIIiiIiIiI.field_1724 == null) {
            return IiiiIiiIII.ALLATORIxDEMO("\u658d\u6542\u6323");
        }
        HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        int n = stringBuilder = 5 >> 3;
        while (n < iIIiIIIiiI2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            if (!iIIiIIIiiI2.iIIiiIiIiI.field_1724.method_31548().method_5438(stringBuilder).method_7960()) {
                iIIiIIIiiI iIIiIIIiiI3 = iIIiIIIiiI2;
                class_17922 = iIIiIIIiiI3.iIIiiIiIiI.field_1724.method_31548().method_5438(stringBuilder).method_7909();
                if (iIIiIIIiiI3.IIiiIIIIIi.contains(class_17922)) {
                    iIIiIIIiiI iIIiIIIiiI4 = iIIiIIIiiI2;
                    object = iIIiIIIiiI4.ALLATORIxDEMO(class_17922);
                    int n2 = iIIiIIIiiI4.iIIiiIiIiI.field_1724.method_31548().method_5438(stringBuilder).method_7947();
                    HashMap<Object, Integer> hashMap2 = hashMap;
                    hashMap2.put(object, hashMap2.getOrDefault(object, 3 ^ 3) + n2);
                }
            }
            n = ++stringBuilder;
        }
        if (hashMap.isEmpty()) {
            return iiIIiiIIIi.ALLATORIxDEMO("\u5efe\u5b64\u4e41\u65dd\u57e7\u570b\u720f\u54f6");
        }
        StringBuilder stringBuilder = new StringBuilder(IiiiIiiIII.ALLATORIxDEMO("\u5791\u5753\u7ecd\u8bcc\bm"));
        class_1792 class_17923 = class_17922 = hashMap.entrySet().iterator();
        while (class_17923.hasNext()) {
            object = (Map.Entry)class_17922.next();
            stringBuilder.append((String)object.getKey()).append(iiIIiiIIIi.ALLATORIxDEMO("\u001f")).append(object.getValue()).append(IiiiIiiIII.ALLATORIxDEMO("\u001bm"));
            class_17923 = class_17922;
        }
        return stringBuilder.toString().trim();
    }

    public void onDeactivate() {
        iIIiIIIiiI iIIiIIIiiI2 = this;
        iIIiIIIiiI2.IIiiIIIIIi.clear();
        iIIiIIIiiI2.info(IiiiIiiIII.ALLATORIxDEMO("\u81d8\u52e5\u6246\u57ee\u572c\u5d9f\u79b3\u7565"), new Object[2 & 5]);
    }

    public iIIiIIIiiI() {
        iIIiIIIiiI iIIiIIIiiI2 = this;
        super(IiiiIiiIII.ALLATORIxDEMO("\u8187\u52ba\u6239\u57b1\u5773"), iiIIiiIIIi.ALLATORIxDEMO("\u81ff\u52ec\u4e62\u5f12\u808b\u5313\u4e6d\u7695\u57de\u5732\u727e\u5487"));
        iIIiIIIiiI2.iIIiIiiiIi = iIIiIIIiiI2.settings.getDefaultGroup();
        iIIiIIIiiI2.iiiIiiIIII = iIIiIIIiiI2.settings.createGroup(IiiiIiiIII.ALLATORIxDEMO("\u57ee\u572c\u7ea9\u0012|"));
        iIIiIIIiiI2.iIiiiIiIii = iIIiIIIiiI2.settings.createGroup(iiIIiiIIIi.ALLATORIxDEMO("\u5792\u5763\u7ec87t"));
        iIIiIIIiiI2.ALLATORIxDEMO = iIIiIIIiiI2.settings.createGroup(IiiiIiiIII.ALLATORIxDEMO("\u57ee\u572c\u7ea9\u0012~"));
        iIIiIIIiiI2.iiiIiIIiii = iIIiIIIiiI2.iIIiIiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIiiIIIi.ALLATORIxDEMO("\u4e7f\u5f0f\u5ee1\u8f99"))).description(IiiiIiiIII.ALLATORIxDEMO("\u6bfd\u6b6c\u4e30\u5f6e\u725b\u548c\u4e79\u95b9\u76b6\u5ebb\u8fcd\uff65\u6e2a\u6262\u5209\uff44"))).defaultValue((Object)(--5))).min(2 ^ 3).max(0x3C & 0x7F).sliderMin(--1).sliderMax(0x5C & 0x37).build());
        this.IiiiiIiIiI = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiIIIi.ALLATORIxDEMO("\u5135\u90e4\u4e35\u5f45"))).description(IiiiIiiIII.ALLATORIxDEMO("\u661d\u546b\u4e30\u5f6e\u6546\u7e89\u725b\u548c\uff3e\u546b\u520b\u5387\u4e30\u5f6e\u4e32\u4e67"))).defaultValue((Object)(5 >> 2))).build());
        this.IIiIiiiiII = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiIIIi.ALLATORIxDEMO("\u6383\u9639\u5fe7\u6360\u6849"))).description(IiiiIiiIII.ALLATORIxDEMO("\u4e3f\u4e6f\u5f31\u5fa6\u6365\u6862\u4e3f\u76e9\u725b\u548c"))).defaultValue((Object)(3 >> 2))).build());
        this.IIiIiIIiii = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiIIIi.ALLATORIxDEMO("\u5439\u7568\u5792\u5763\u7ec87w"))).description(IiiiIiiIII.ALLATORIxDEMO("\u541d\u7565\u7b3e\u4e6d\u4e38\u57ee\u570c\u7e89"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiIiiiiII = this.iiiIiiIIII.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIIiiIIIi.ALLATORIxDEMO("\u7ed3\u544b"))).description(IiiiIiiIII.ALLATORIxDEMO("\u57ce\u570c\u7e892\\2\u76e9\u543f\u79bd"))).defaultValue((Object)iiIIiiIIIi.ALLATORIxDEMO("\u9882\u7265\u5794\u5778"))).build());
        class_1792[] class_1792Array = new class_1792[--4];
        class_1792Array[2 & 5] = class_1802.field_8511;
        class_1792Array[--1] = class_1802.field_8680;
        class_1792Array[1 ^ 3] = class_1802.field_8635;
        class_1792Array[--3] = class_1802.field_8323;
        this.iIIiiIIIIi = this.iiiIiiIIII.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u727b\u54ac\u5225\u8825"))).description(iiIIiiIIIi.ALLATORIxDEMO("\u57c3\u572f\u7e836q1\u4e70\u7688\u727e\u5487"))).defaultValue(Arrays.asList(class_1792Array))).build());
        this.iIiIIiIIIi = this.iIiiiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u5462\u753a\u57ee\u572c\u7ea9\u0012\u007f"))).description(iiIIiiIIIi.ALLATORIxDEMO("\u5468\u753e\u7b6c\u4e9d\u4e77\u578f\u5729\u7e82"))).defaultValue((Object)(--1 != 0))).build());
        this.IIIIiiIiii = this.iIiiiIiIii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u7ef6\u5440"))).description(iiIIiiIIIi.ALLATORIxDEMO("\u5792\u5779\u7ed2`#}\u7688\u541a\u79b6"))).defaultValue((Object)IiiiIiiIII.ALLATORIxDEMO("\u65ab\u573a\u57b1\u5773"))).build());
        class_1792[] class_1792Array2 = new class_1792[0x77 & 0xF];
        class_1792Array2[3 ^ 3] = class_1802.field_8328;
        class_1792Array2[--1] = class_1802.field_23843;
        class_1792Array2[5 >> 1] = class_1802.field_8831;
        class_1792Array2[--3] = class_1802.field_8110;
        class_1792Array2[--4] = class_1802.field_20394;
        class_1792Array2[--5] = class_1802.field_20401;
        class_1792Array2[0x77 & 0xE] = class_1802.field_20407;
        this.iIIIiiiiIi = this.iIiiiIiIii.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(iiIIiiIIIi.ALLATORIxDEMO("\u7234\u54cd\u5200\u882e"))).description(IiiiIiiIII.ALLATORIxDEMO("\u57b1\u5773\u7ef6m M\u4e3f\u76e9\u725b\u548c"))).defaultValue(Arrays.asList(class_1792Array2))).build());
        this.IiiIiIiiIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiIIIi.ALLATORIxDEMO("\u5439\u7568\u5792\u5763\u7ec87u"))).description(IiiiIiiIII.ALLATORIxDEMO("\u541d\u7565\u7b3e\u4e64\u4e38\u57ee\u570c\u7e89"))).defaultValue((Object)(5 >> 3))).build());
        this.iIiIiIIIII = this.ALLATORIxDEMO.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIIiiIIIi.ALLATORIxDEMO("\u7ed3\u544b"))).description(IiiiIiiIII.ALLATORIxDEMO("\u57ce\u570c\u7e892^2\u76e9\u543f\u79bd"))).defaultValue((Object)iiIIiiIIIi.ALLATORIxDEMO("\u81fb\u5bc7\u4e45\u5794\u5778"))).build());
        this.iiiiiIIiIi = this.ALLATORIxDEMO.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u727b\u54ac\u5225\u8825"))).description(iiIIiiIIIi.ALLATORIxDEMO("\u57c3\u572f\u7e836s1\u4e70\u7688\u727e\u5487"))).defaultValue(new ArrayList())).build());
        this.iIIiiIiIiI = 3 & 4;
        iIIiIIIiiI iIIiIIIiiI3 = this;
        iIIiIIIiiI3.IIiiIIIIIi = new HashSet<class_1792>();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIiiIII.ALLATORIxDEMO("E\u00060Ka\b\u00128B)s\u0019Wl\u0012\u8bba\u66c6\u65fd\u5222\u676d\u65a2\u7225\u671e\uff4c"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(int n) {
        int n2 = n;
        iIIiIIIiiI iIiIiIIIII2 = this;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1761 == null) {
            return;
        }
        n2 = SlotUtils.indexToId((int)n2);
        iIIiIIIiiI iIIiIIIiiI2 = iIiIiIIIII2;
        if (((Boolean)iIiIiIIIII2.IiiiiIiIiI.get()).booleanValue()) {
            iIIiIIIiiI2.iIIiiIiIiI.field_1761.method_2906(iIiIiIIIII2.iIIiiIiIiI.field_1724.field_7512.field_7763, n2, 3 & 5, class_1713.field_7795, (class_1657)iIiIiIIIII2.iIIiiIiIiI.field_1724);
            return;
        }
        iIIiIIIiiI2.iIIiiIiIiI.field_1761.method_2906(iIiIiIIIII2.iIIiiIiIiI.field_1724.field_7512.field_7763, n2, 3 >> 2, class_1713.field_7795, (class_1657)iIiIiIIIII2.iIIiiIiIiI.field_1724);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIIiIIIiiI iIIiIIIiiI2 = this;
        iIIiIIIiiI2.IIiiIIIIIi.clear();
        if (((Boolean)iIIiIIIiiI2.IIiIiIIiii.get()).booleanValue()) {
            iIIiIIIiiI iIIiIIIiiI3 = this;
            iIIiIIIiiI3.IIiiIIIIIi.addAll((Collection)iIIiIIIiiI3.iIIiiIIIIi.get());
        }
        if (((Boolean)this.iIiIIiIIIi.get()).booleanValue()) {
            iIIiIIIiiI iIIiIIIiiI4 = this;
            iIIiIIIiiI4.IIiiIIIIIi.addAll((Collection)iIIiIIIiiI4.iIIIiiiiIi.get());
        }
        if (((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
            iIIiIIIiiI iIIiIIIiiI5 = this;
            iIIiIIIiiI5.IIiiIIIIIi.addAll((Collection)iIIiIIIiiI5.iiiiiIIiIi.get());
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        int n;
        iIIiIIIiiI iIIiIIIiiI2;
        block6: {
            iIIiIIIiiI2 = this;
            if (iIIiIIIiiI2.iIIiiIiIiI.field_1724 == null || iIIiIIIiiI2.iIIiiIiIiI.field_1687 == null) {
                return;
            }
            iIIiIIIiiI iIIiIIIiiI3 = iIIiIIIiiI2;
            iIIiIIIiiI3.ALLATORIxDEMO();
            if (iIIiIIIiiI3.iIIiiIiIiI > 0) {
                iIIiIIIiiI2.iIIiiIiIiI -= 3 >> 1;
                return;
            }
            int iIiIiIIIII2 = 0;
            int n2 = this = (this = ((Boolean)iIIiIIIiiI2.IIiIiiiiII.get()).booleanValue() ? 0x5F & 0x29 : 0);
            while (n2 < iIIiIIIiiI2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
                if (!iIIiIIIiiI2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7960()) {
                    iIIiIIIiiI iIIiIIIiiI4 = iIIiIIIiiI2;
                    class_1792 class_17922 = iIIiIIIiiI4.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909();
                    if (iIIiIIIiiI4.IIiiIIIIIi.contains(class_17922)) {
                        iIIiIIIiiI iIIiIIIiiI5 = iIIiIIIiiI2;
                        iIIiIIIiiI5.ALLATORIxDEMO(this);
                        iIiIiIIIII2 = 4 ^ 5;
                        class_17922.method_63680().toString();
                        iIIiIIIiiI5.ALLATORIxDEMO(class_17922);
                        n = iIiIiIIIII2;
                        break block6;
                    }
                }
                n2 = ++this;
            }
            n = iIiIiIIIII2;
        }
        if (n != 0) {
            iIIiIIIiiI2.iIIiiIiIiI = (Integer)iIIiIIIiiI2.iiiIiIIiii.get();
        }
    }

    @Override
    public void onActivate() {
        iIIiIIIiiI iIIiIIIiiI2 = this;
        super.onActivate();
        iIIiIIIiiI2.ALLATORIxDEMO();
        this.iIIiiIiIiI = 3 >> 2;
        Object[] objectArray = new Object[3 & 5];
        objectArray[3 & 4] = this.IIiiIIIIIi.size();
        this.info(iiIIiiIIIi.ALLATORIxDEMO("\u81fd\u52ef\u6242\u57eb\u5707\u5db8\u5434\u7575\uff00\u51311zjh\u79d4\u57de\u5732\u7225\u54dc"), objectArray);
    }

    private /* synthetic */ String ALLATORIxDEMO(class_1792 class_17922) {
        iIIiIIIiiI iIIiIIIiiI2 = iIIiIIIiiI3;
        iIIiIIIiiI iIIiIIIiiI3 = class_17922;
        iIIiIIIiiI iIiIiIIIII2 = iIIiIIIiiI2;
        if (((Boolean)iIiIiIIIII2.IIiIiIIiii.get()).booleanValue() && ((List)iIiIiIIIII2.iIIiiIIIIi.get()).contains(iIIiIIIiiI3)) {
            return (String)iIiIiIIIII2.iIiIiiiiII.get();
        }
        if (((Boolean)iIiIiIIIII2.iIiIIiIIIi.get()).booleanValue() && ((List)iIiIiIIIII2.iIIIiiiiIi.get()).contains(iIIiIIIiiI3)) {
            return (String)iIiIiIIIII2.IIIIiiIiii.get();
        }
        if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue() && ((List)iIiIiIIIII2.iiiiiIIiIi.get()).contains(iIIiIIIiiI3)) {
            return (String)iIiIiIIIII2.iIiIiIIIII.get();
        }
        return iiIIiiIIIi.ALLATORIxDEMO("\u671f\u7783\u7ef3");
    }
}

