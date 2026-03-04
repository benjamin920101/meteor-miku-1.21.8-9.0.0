/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.renderer.text.TextRenderer
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.misc.Names
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.server.world.ServerWorld
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiiIIII;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIiIII;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.renderer.text.TextRenderer;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.misc.Names;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.Registries;

public class IIiiIIiiiI
extends iIiIiIIIii {
    public final Setting<List<class_1792>> iIIiiIIIIi;
    public final Setting<Double> IiiiiIiIiI;
    public final Setting<Integer> iiiIiIIiii;
    public final Setting<SettingColor> iIIIiiiiIi;
    public final Setting<SettingColor> iiiIiiIIII;
    public final Setting<Integer> iIiIIiIIIi;
    public final Setting<SettingColor> IIiIiiiiII;
    public final Setting<Set<class_1299<?>>> IIiiIIIIIi;
    private final SettingGroup iIiiiIiIii;
    public final Setting<Integer> iIiIiiiiII;
    public final Setting<List<class_1792>> IIIIiiIiii;
    public final Setting<SettingColor> IiiIiIiiIi;
    public final Setting<Set<class_1299<?>>> IIiIiIIiii;
    public final Setting<Set<class_1299<?>>> iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    public final Setting<List<class_1792>> iIIiIiiiIi;
    public final Setting<SettingColor> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(Map<String, Double> map, Map<String, String> map2, int n, Color color) {
        void iIiIiIIIII2;
        Iterator iIiIiIIIII3;
        IIiiIIiiiI iIiiIIiiiI = object;
        TextRenderer textRenderer = TextRenderer.get();
        int n2 = (Integer)iIiiIIiiiI.iIiIIiIIIi.get();
        Iterator iterator = iIiIiIIIII3 = iIiIiIIIII3.entrySet().iterator();
        while (iterator.hasNext()) {
            void iIiIiIIIII4;
            void iIiIiIIIII5;
            Object object = iIiIiIIIII3.next();
            String string = (String)object.getKey();
            String string2 = (String)iIiIiIIIII5.get(string);
            Object[] objectArray = new Object[--3];
            objectArray[2 & 5] = string;
            objectArray[--1] = string2;
            objectArray[--2] = object.getValue();
            object = String.format(IIiiiiIIII.ALLATORIxDEMO("a;D3A\u001b\u0019\u0013afu.\t5"), objectArray);
            textRenderer.begin(((Double)iIiiIIiiiI.IiiiiIiIiI.get()).doubleValue());
            textRenderer.render((String)object, (double)n2, (double)iIiIiIIIII2, (Color)iIiIiIIIII4, (4 ^ 5) != 0);
            textRenderer.end();
            iIiIiIIIII2 += (int)((double)((Integer)iIiiIIiiiI.iiiIiIIiii.get()).intValue() * (Double)iIiiIIiiiI.IiiiiIiIiI.get());
            iterator = iIiIiIIIII3;
        }
        return (int)iIiIiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int iiiIiIiiIi(Map<class_1792, Integer> map, int n, Color color) {
        void iIiIiIIIII2;
        Iterator iIiIiIIIII3;
        IIiiIIiiiI iIiiIIiiiI = object;
        if (iIiIiIIIII3.isEmpty()) {
            return (int)iIiIiIIIII2;
        }
        TextRenderer textRenderer = TextRenderer.get();
        int n2 = (Integer)iIiiIIiiiI.iIiIIiIIIi.get();
        Iterator iterator = iIiIiIIIII3 = iIiIiIIIII3.entrySet().iterator();
        while (iterator.hasNext()) {
            void iIiIiIIIII4;
            Object object = iIiIiIIIII3.next();
            Object[] objectArray = new Object[--2];
            objectArray[3 & 4] = Names.get((class_1792)((class_1792)object.getKey()));
            objectArray[3 >> 1] = object.getValue();
            object = String.format(IIiiiiIIII.ALLATORIxDEMO("3a;\u0019h<hA\u001b"), objectArray);
            textRenderer.begin(((Double)iIiiIIiiiI.IiiiiIiIiI.get()).doubleValue());
            textRenderer.render((String)object, (double)n2, (double)iIiIiIIIII2, (Color)iIiIiIIIII4, (4 ^ 5) != 0);
            textRenderer.end();
            iIiIiIIIII2 += (int)((double)((Integer)iIiiIIiiiI.iiiIiIIiii.get()).intValue() * (Double)iIiiIIiiiI.IiiiiIiIiI.get());
            iterator = iIiIiIIIII3;
        }
        return (int)iIiIiIIIII2;
    }

    public IIiiIIiiiI() {
        IIiiIIiiiI iIiiIIiiiI = this;
        super(iIiiiIiIII.ALLATORIxDEMO("\u5bdc\u4f19\u521f\u8868"), IIiiiiIIII.ALLATORIxDEMO("\u6631\u795e\u5bf6\u4f37\u527f\u882cfd\u672d\u818e\u67b8\u8fb9\u53a5\u530b\u8be6\u76c0$+<\u000b\u001b"));
        iIiiIIiiiI.ALLATORIxDEMO = iIiiIIiiiI.settings.getDefaultGroup();
        class_1299[] class_1299Array = new class_1299[--3];
        class_1299Array[3 >> 2] = class_1299.field_6044;
        class_1299Array[3 & 5] = class_1299.field_6082;
        class_1299Array[5 >> 1] = class_1299.field_6050;
        iIiiIIiiiI.IIiiIIIIIi = iIiiIIiiiI.ALLATORIxDEMO.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u9058\u7562\u5b96\u4f53"))).description(IIiiiiIIII.ALLATORIxDEMO("\u6228\u674d\u4e5e\u7508\u6676\u797e\u76cc\u5bfa\u4f3b"))).defaultValue(class_1299Array).build());
        class_1299[] class_1299Array2 = new class_1299[--3];
        class_1299Array2[3 >> 2] = class_1299.field_6044;
        class_1299Array2[--1] = class_1299.field_6082;
        class_1299Array2[1 ^ 3] = class_1299.field_6050;
        this.iIIiiIiIiI = this.ALLATORIxDEMO.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u4e6c\u4e54\u7506\u5b96\u4f53"))).description(IIiiiiIIII.ALLATORIxDEMO("\u4ea1\u5740\u4e7f\u4e5e\u7508\u6676\u797e\u76cc\u5bfa\u4f3b"))).defaultValue(class_1299Array2).build());
        class_1299[] class_1299Array3 = new class_1299[0x3F & 0x4F];
        class_1299Array3[3 ^ 3] = class_1299.field_6044;
        class_1299Array3[4 ^ 5] = class_1299.field_6085;
        class_1299Array3[1 ^ 3] = class_1299.field_6115;
        class_1299Array3[--3] = class_1299.field_6093;
        class_1299Array3[--4] = class_1299.field_6139;
        class_1299Array3[--5] = class_1299.field_6051;
        class_1299Array3[0x77 & 0xE] = class_1299.field_6046;
        class_1299Array3[0x77 & 0xF] = class_1299.field_49148;
        class_1299Array3[9 & 0x7E] = class_1299.field_6071;
        class_1299Array3[0x29 & 0x5F] = class_1299.field_6069;
        class_1299Array3[0xA & 0x7F] = class_1299.field_6077;
        class_1299Array3[0x4F & 0x3B] = class_1299.field_6079;
        class_1299Array3[0x1C & 0x6F] = class_1299.field_6084;
        class_1299Array3[0x6D & 0x1F] = class_1299.field_6123;
        class_1299Array3[0x6E & 0x1F] = class_1299.field_6054;
        this.IIiIiIIiii = this.ALLATORIxDEMO.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u4e49\u7506\u5b96\u4f53"))).description(IIiiiiIIII.ALLATORIxDEMO("\u4ead\u576c\u4e43\u7508\u6676\u797e\u76cc\u5bfa\u4f3b"))).defaultValue(class_1299Array3).build());
        this.IiiIiIiiIi = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u5bdc\u4f19\u9894\u8272"))).defaultValue(new SettingColor(0x2CA & 0x7DBF, 0x6EFE & 0x11B5, 0x7AFB & 0x5FC, 0x1AFF & 0x65FF)).build());
        this.iIIIiiiiIi = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiiiiIIII.ALLATORIxDEMO("\u73ed\u5bfe\u98f8\u821a"))).defaultValue(new SettingColor(0x5C1 & 0x7ABF, 0x25CB & 0x5AFD, 0x7B7 & 0x78DD, 0x70FF & 0xFFF)).build());
        IIiiIIiiiI iIiiIIiiiI2 = this;
        iIiiIIiiiI2.iIiiiIiIii = iIiiIIiiiI2.settings.createGroup(iIiiiIiIII.ALLATORIxDEMO("\u7261\u54c1"));
        class_1792[] class_1792Array = new class_1792[0x7F & 0x1F];
        class_1792Array[3 ^ 3] = class_1802.field_8833;
        class_1792Array[3 & 5] = class_1802.field_8722;
        class_1792Array[5 >> 1] = class_1802.field_8380;
        class_1792Array[--3] = class_1802.field_8050;
        class_1792Array[--4] = class_1802.field_8829;
        class_1792Array[--5] = class_1802.field_8271;
        class_1792Array[0x16 & 0x6F] = class_1802.field_8548;
        class_1792Array[0x17 & 0x6F] = class_1802.field_8520;
        class_1792Array[0x79 & 0xE] = class_1802.field_8627;
        class_1792Array[0x4D & 0x3B] = class_1802.field_8451;
        class_1792Array[0x4E & 0x3B] = class_1802.field_8213;
        class_1792Array[0x4B & 0x3F] = class_1802.field_8816;
        class_1792Array[0x3C & 0x4F] = class_1802.field_8350;
        class_1792Array[0x1F & 0x6D] = class_1802.field_8584;
        class_1792Array[0x5F & 0x2E] = class_1802.field_8461;
        class_1792Array[0x4F & 0x3F] = class_1802.field_8676;
        class_1792Array[0x51 & 0x3E] = class_1802.field_8268;
        class_1792Array[0x51 & 0x3F] = class_1802.field_27023;
        class_1792Array[0x36 & 0x5B] = class_1802.field_22019;
        class_1792Array[19] = class_1802.field_22021;
        class_1792Array[20] = class_1802.field_22020;
        class_1792Array[21] = class_1802.field_22018;
        class_1792Array[22] = class_1802.field_22022;
        class_1792Array[23] = class_1802.field_22025;
        class_1792Array[24] = class_1802.field_22026;
        class_1792Array[25] = class_1802.field_22024;
        class_1792Array[26] = class_1802.field_22023;
        class_1792Array[27] = class_1802.field_22027;
        class_1792Array[28] = class_1802.field_22028;
        class_1792Array[29] = class_1802.field_22029;
        class_1792Array[30] = class_1802.field_22030;
        iIiiIIiiiI2.iIIiIiiiIi = iIiiIIiiiI2.iIiiiIiIii.add((Setting)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IIiiiiIIII.ALLATORIxDEMO("\u7221\u54a5Y"))).defaultValue(class_1792Array).build());
        this.iiiIiiIIII = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u723e\u5483{\u9894\u8272"))).defaultValue(new SettingColor(255, 107, 107, 255)).build());
        this.IIIIiiIiii = this.iIiiiIiIii.add((Setting)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IIiiiiIIII.ALLATORIxDEMO("\u7221\u54a5Z"))).build());
        this.IIiIiiiiII = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u723e\u5483x\u9894\u8272"))).defaultValue(new SettingColor(78, 205, 196, 255)).build());
        this.iIiIiIIIII = this.iIiiiIiIii.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiiiiIIII.ALLATORIxDEMO("\u722d\u5489\u9e9c\u8bec\u98f8\u821a"))).defaultValue(new SettingColor(255, 193, 77, 255)).build());
        this.iIIiiIIIIi = this.iIiiiIiIii.add((Setting)((ItemListSetting.Builder)new ItemListSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u9e9b\u5405\u5355"))).build());
        IIiiIIiiiI iIiiIIiiiI3 = this;
        iIiiIIiiiI3.iiiiiIIiIi = iIiiIIiiiI3.settings.createGroup(IIiiiiIIII.ALLATORIxDEMO("\u7528\u970a"));
        iIiiIIiiiI3.iIiIIiIIIi = iIiiIIiiiI3.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u0012\u5047\u79fb"))).min(3 ^ 3).sliderMax(2048).defaultValue((Object)20)).build());
        this.iIiIiiiiII = this.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiiiIIII.ALLATORIxDEMO("\u0011\u502b\u7993"))).min(5 >> 3).sliderMax(2048).defaultValue((Object)500)).build());
        this.iiiIiIIiii = this.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u8844\u9ad8"))).min(5 >> 3).sliderMax(100).defaultValue((Object)20)).build());
        this.IiiiiIiIiI = this.iiiiiIIiIi.add((Setting)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiiiIIII.ALLATORIxDEMO("\u5b13\u4f1b\u5943\u5c67"))).min(0.0).sliderMax(6.0).defaultValue(1.0).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIiiiIiIII.ALLATORIxDEMO("/\u001b\u001a\u0016,2\u007f\"/3\u001e\u0003o#\u007f\u8ba0\u66ac\u65e0\u526f\u6757\u65f2\u7202\u6724\uff01"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        IIiiIIiiiI iIiiIIiiiI = iterator;
        if (!Utils.isLoading() && iIiiIIiiiI.isActive()) {
            HashSet iIiIiIIIII2 = new HashSet((Collection)iIiiIIiiiI.iIIiIiiiIi.get());
            HashSet hashSet = new HashSet((Collection)iIiiIIiiiI.IIIIiiIiii.get());
            HashSet hashSet2 = new HashSet((Collection)iIiiIIiiiI.iIIiiIIIIi.get());
            HashMap<class_1792, Integer> hashMap = new HashMap<class_1792, Integer>();
            HashMap<class_1792, Integer> hashMap2 = new HashMap<class_1792, Integer>();
            HashMap<class_1792, Integer> hashMap3 = new HashMap<class_1792, Integer>();
            HashMap hashMap4 = new HashMap();
            HashMap<String, Double> hashMap5 = new HashMap<String, Double>();
            HashMap<String, String> hashMap6 = new HashMap<String, String>();
            IIiiIIiiiI iIiiIIiiiI2 = iIiiIIiiiI;
            class_5321 class_53212 = iIiiIIiiiI2.iIIiiIiIiI.field_1724.method_37908().method_27983();
            Iterator iterator = iIiiIIiiiI2.iIIiiIiIiI.field_1687.method_18112().iterator();
            block0: while (true) {
                Iterator iterator2 = iterator;
                while (iterator2.hasNext()) {
                    int n;
                    Object object;
                    class_1799 class_17992;
                    class_1297 class_12972 = (class_1297)iterator.next();
                    if (class_12972 instanceof class_1542) {
                        class_17992 = ((class_1542)class_12972).method_6983();
                        Object object2 = class_17992.method_7909();
                        if (hashSet2.contains(object2)) continue block0;
                        HashMap<class_1792, Integer> hashMap7 = iIiIiIIIII2.contains(object2) ? hashMap : (hashSet.contains(object2) ? hashMap2 : hashMap3);
                        class_1799 class_17993 = class_17992;
                        n = hashMap7.containsKey(object2) ? class_17993.method_7947() + (Integer)object.get(object2) : class_17993.method_7947();
                        object.put(object2, n);
                        continue block0;
                    }
                    if (class_12972 instanceof class_1657) {
                        class_1657 class_16572 = (class_1657)class_12972;
                        if (class_12972 != iIiiIIiiiI.iIIiiIiIiI.field_1724) {
                            IIiiIIiiiI iIiiIIiiiI3 = iIiiIIiiiI;
                            double d = iIiiIIiiiI3.iIIiiIiIiI.field_1724.method_5739((class_1297)class_16572);
                            object = class_16572.method_7334().getName();
                            String string = iIiiIIiiiI3.ALLATORIxDEMO(class_16572);
                            hashMap5.put((String)object, d);
                            hashMap6.put((String)object, string);
                            continue block0;
                        }
                    }
                    class_17992 = class_12972.method_5864();
                    object = (Set)iIiiIIiiiI.IIiiIIIIIi.get();
                    if (object.contains(class_17992)) {
                        n = hashMap4.getOrDefault(class_17992, 3 & 4);
                        iterator2 = iterator;
                        hashMap4.put((class_1299<?>)class_17992, n + (3 >> 1));
                        continue;
                    }
                    if (!(class_53212 == class_3218.field_25180 ? (Set)iIiiIIiiiI.IIiIiIIiii.get() : (class_53212 == class_3218.field_25179 ? (Set)iIiiIIiiiI.iIIiiIiIiI.get() : Collections.emptySet())).contains(class_17992)) continue block0;
                    n = hashMap4.getOrDefault(class_17992, 3 >> 2);
                    hashMap4.put((class_1299<?>)class_17992, n + --1);
                    continue block0;
                }
                break;
            }
            int this2 = (Integer)iIiiIIiiiI.iIiIiiiiII.get();
            this2 = iIiiIIiiiI.ALLATORIxDEMO(hashMap5, hashMap6, this2, (Color)iIiiIIiiiI.iIIIiiiiIi.get());
            IIiiIIiiiI iIiiIIiiiI4 = iIiiIIiiiI;
            this2 = iIiiIIiiiI4.iiiIiIiiIi(hashMap, this2, (Color)iIiiIIiiiI4.iiiIiiIIII.get());
            IIiiIIiiiI iIiiIIiiiI5 = iIiiIIiiiI;
            this2 = iIiiIIiiiI5.iiiIiIiiIi(hashMap2, this2, (Color)iIiiIIiiiI5.IIiIiiiiII.get());
            IIiiIIiiiI iIiiIIiiiI6 = iIiiIIiiiI;
            this2 = iIiiIIiiiI6.iiiIiIiiIi(hashMap3, this2, (Color)iIiiIIiiiI6.iIiIiIIIII.get());
            IIiiIIiiiI iIiiIIiiiI7 = iIiiIIiiiI;
            this2 = iIiiIIiiiI7.ALLATORIxDEMO(hashMap4, this2, (Color)iIiiIIiiiI7.IiiIiIiiIi.get());
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(Map<class_1299<?>, Integer> map, int n, Color color) {
        void iIiIiIIIII2;
        Iterator iIiIiIIIII3;
        IIiiIIiiiI iIiiIIiiiI = object;
        TextRenderer textRenderer = TextRenderer.get();
        int n2 = (Integer)iIiiIIiiiI.iIiIIiIIIi.get();
        Iterator iterator = iIiIiIIIII3 = iIiIiIIIII3.entrySet().iterator();
        while (iterator.hasNext()) {
            void iIiIiIIIII4;
            Object object = iIiIiIIIII3.next();
            Object[] objectArray = new Object[1 ^ 3];
            objectArray[3 ^ 3] = Names.get((class_1299)((class_1299)object.getKey()));
            objectArray[--1] = object.getValue();
            object = String.format(iIiiiIiIII.ALLATORIxDEMO("\u001dW\t.[\u0003S\\\u0002"), objectArray);
            textRenderer.begin(((Double)iIiiIIiiiI.IiiiiIiIiI.get()).doubleValue());
            textRenderer.render((String)object, (double)n2, (double)iIiIiIIIII2, (Color)iIiIiIIIII4, 3 >> 1);
            textRenderer.end();
            iIiIiIIIII2 += (int)((double)((Integer)iIiiIIiiiI.iiiIiIIiii.get()).intValue() * (Double)iIiiIIiiiI.IiiiiIiIiI.get());
            iterator = iIiIiIIIII3;
        }
        return (int)iIiIiIIIII2;
    }

    private /* synthetic */ String ALLATORIxDEMO(class_1657 class_16572) {
        int n;
        Object iIiIiIIIII2;
        HashMap hashMap;
        IIiiIIiiiI iIiiIIiiiI = hashMap;
        void v0 = iIiIiIIIII2;
        iIiIiIIIII2 = v0.method_6118(class_1304.field_6169);
        class_1799 class_17992 = v0.method_6118(class_1304.field_6174);
        class_1799 class_17993 = v0.method_6118(class_1304.field_6172);
        class_1799 object2 = v0.method_6118(class_1304.field_6166);
        if (iIiIiIIIII2.method_7960() && class_17992.method_7960() && class_17993.method_7960() && object2.method_7960()) {
            return iIiiiIiIII.ALLATORIxDEMO("\u8881\u547b");
        }
        HashMap this_ = new HashMap();
        class_1799[] class_1799Array = new class_1799[--4];
        class_1799Array[5 >> 3] = iIiIiIIIII2;
        class_1799Array[3 >> 1] = class_17992;
        class_1799Array[--2] = class_17993;
        class_1799Array[--3] = object2;
        iIiIiIIIII2 = class_1799Array;
        int n2 = class_1799Array.length;
        int n3 = n = 5 >> 3;
        while (n3 < n2) {
            class_1799 class_17994 = iIiIiIIIII2[n];
            if (IiIiiIIIiI.ALLATORIxDEMO(class_17994.method_7909())) {
                HashMap hashMap2;
                String string;
                String string2 = class_7923.field_41178.method_10221((Object)class_17994.method_7909()).toString();
                if (string2.contains(IIiiiiIIII.ALLATORIxDEMO("\u0006!<,-6!\u0010\r"))) {
                    string = iIiiiIiIII.ALLATORIxDEMO("\u5471\u91a0");
                    hashMap2 = this_;
                } else if (string2.contains(IIiiiiIIII.ALLATORIxDEMO(",-))'\n\f"))) {
                    string = iIiiiIiIII.ALLATORIxDEMO("\u94c2\u7782");
                    hashMap2 = this_;
                } else if (string2.contains(IIiiiiIIII.ALLATORIxDEMO("-:\u000b\u0006"))) {
                    string = iIiiiIiIII.ALLATORIxDEMO("\u94b0");
                    hashMap2 = this_;
                } else if (string2.contains(IIiiiiIIII.ALLATORIxDEMO("#'\b\f"))) {
                    string = iIiiiIiIII.ALLATORIxDEMO("\u91a0");
                    hashMap2 = this_;
                } else if (string2.contains(IIiiiiIIII.ALLATORIxDEMO("+,)\r\u0006"))) {
                    string = iIiiiIiIII.ALLATORIxDEMO("\u9578\u948f");
                    hashMap2 = this_;
                } else if (string2.contains(IIiiiiIIII.ALLATORIxDEMO("$!)0 \u0001\u001a"))) {
                    string = iIiiiIiIII.ALLATORIxDEMO("\u76d7\u9718");
                    hashMap2 = this_;
                } else if (string2.contains(IIiiiiIIII.ALLATORIxDEMO("0=6<\b\r"))) {
                    string = iIiiiIiIII.ALLATORIxDEMO("\u6d0e\u9fee");
                    hashMap2 = this_;
                } else if (string2.contains(IIiiiiIIII.ALLATORIxDEMO("\t6%%,-$\b\u0007"))) {
                    string = iIiiiIiIII.ALLATORIxDEMO("\u72c9\u7282");
                    hashMap2 = this_;
                } else {
                    string = string2;
                    hashMap2 = this_;
                }
                hashMap2.merge(string, 5 >> 2, Integer::sum);
            }
            n3 = ++n;
        }
        if (this_.isEmpty()) {
            return IIiiiiIIII.ALLATORIxDEMO("\u889c\u5462");
        }
        iIiIiIIIII2 = null;
        n2 = 2 & 5;
        for (Map.Entry entry : this_.entrySet()) {
            if ((Integer)entry.getValue() <= n2) continue;
            iIiIiIIIII2 = (String)entry.getKey();
            n2 = (Integer)entry.getValue();
        }
        if (this_.size() == 5 >> 2) {
            return (String)iIiIiIIIII2 + "\u5957";
        }
        return (String)iIiIiIIIII2 + "\u5957(\u6df7)";
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }
}

