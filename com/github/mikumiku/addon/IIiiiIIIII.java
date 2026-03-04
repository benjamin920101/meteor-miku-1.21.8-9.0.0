/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.ObjectIntImmutablePair
 *  meteordevelopment.meteorclient.events.game.GameLeftEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BlockPosSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnchantmentListSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.VillagerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.screen.PlayerScreenHandler
 *  net.minecraft.screen.MerchantScreenHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.village.TradeOffer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.village.VillagerProfession
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIIIii;
import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIiIiiii;
import com.github.mikumiku.addon.modules.VillagerTrader;
import com.github.mikumiku.addon.util.BaritoneUtil;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectIntImmutablePair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import meteordevelopment.meteorclient.events.game.GameLeftEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockPosSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnchantmentListSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.village.TradeOffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.village.VillagerProfession;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.Registries;

public class IIiiiIIIII
extends iIiIiIIIii {
    private boolean IiIiIiIIii;
    private VillagerTrader.State iiiIiIiiII;
    private final Setting<Boolean> IIiiiiIIii;
    private final Setting<Integer> IiiiiIIiII;
    private final Setting<Integer> iIIIIIiiII;
    private final Setting<Boolean> iIIiiiiIii;
    private final Setting<Integer> iiIIIiIIIi;
    private final Setting<Integer> iIiiiiIIII;
    private final Setting<Set<class_5321<class_1887>>> iiIiIIiiii;
    private final Setting<List<class_3852>> iIIiIiiIiI;
    private int iIIIIIIiII;
    private final Setting<Map<String, String>> iIIiiIIIIi;
    private final SettingGroup IiiiiIiIiI;
    private final Setting<Integer> iiiIiIIiii;
    private final Setting<List<class_1792>> iIIIiiiiIi;
    private final SettingGroup iiiIiiIIII;
    private final Setting<class_2338> iIiIIiIIIi;
    private int IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private final Setting<Integer> iIiiiIiIii;
    private final SettingGroup iIiIiiiiII;
    private final Setting<class_2338> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private int IIiIiIIiii;
    private final Setting<class_2338> iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    private final SettingGroup iIIiIiiiIi;
    private final Set<Integer> iIiIiIIIII;
    private final Setting<Integer> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n) {
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII3;
        if (iIiiiIIIII.iIIiiIiIiI.field_1761 == null) {
            return;
        }
        IIiiiIIIII iIiiiIIIII2 = iIiiiIIIII;
        IIiiiIIIII iIiiiIIIII3 = iIiiiIIIII2.iIIiiIiIiI.field_1724.field_7512;
        IIiiiIIIII iIiiiIIIII4 = iIiiiIIIII;
        if (iIiiiIIIII2.iIIiiIiIiI.field_1724.field_7512 instanceof class_1723) {
            void iIiIiIIIII2;
            iIiiiIIIII4.iIIiiIiIiI.field_1761.method_2906(((class_1703)iIiiiIIIII3).field_7763, (int)iIiIiIIIII2, 3 >> 2, class_1713.field_7790, (class_1657)iIiiiIIIII.iIIiiIiIiI.field_1724);
            IIiiiIIIII iIiiiIIIII5 = iIiiiIIIII;
            iIiiiIIIII5.iIIiiIiIiI.field_1761.method_2906(((class_1703)iIiiiIIIII3).field_7763, 3 >> 1, 2 & 5, class_1713.field_7790, (class_1657)iIiiiIIIII.iIIiiIiIiI.field_1724);
            iIiiiIIIII5.iIIiiIiIiI.field_1761.method_2906(((class_1703)iIiiiIIIII3).field_7763, 3 ^ 3, 2 & 5, class_1713.field_7794, (class_1657)iIiiiIIIII.iIIiiIiIiI.field_1724);
            iIiiiIIIII5.iIIiiIiIiI.field_1724.method_7346();
            return;
        }
        iIiiiIIIII4.iIIiiIiIiI.method_1507((class_437)new class_490((class_1657)iIiiiIIIII.iIIiiIiIiI.field_1724));
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void iIIIIIIIIi() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[DOLOOP]], but top level block is 1[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private /* synthetic */ void IiiiiiiIIi() {
        IIiiiIIIII iIiiiIIIII = this;
        if (iIiiiIIIII.iIIiiIiIiI.field_1724.field_7512 == iIiiiIIIII.iIIiiIiIiI.field_1724.field_7498) {
            return;
        }
        HashSet<class_1792> hashSet = new HashSet<class_1792>((Collection)iIiiiIIIII.iIIIiiiiIi.get());
        if (((Boolean)iIiiiIIIII.IiiIiIiiIi.get()).booleanValue()) {
            hashSet.add(class_1802.field_8598);
        }
        int n = this = 9;
        while (true) {
            if (n >= 45) break;
            class_1799 class_17992 = iIiiiIIIII.iIIiiIiIiI.field_1724.method_31548().method_5438(this);
            if (!class_17992.method_7960() && hashSet.contains(class_17992.method_7909())) {
                iIiiiIIIII.ALLATORIxDEMO(this, 3 ^ 3, class_1713.field_7794);
            }
            n = ++this;
        }
    }

    private /* synthetic */ void iIIiIiiiII() {
        IIiiiIIIII iIiiiIIIII;
        IIiiiIIIII iIiiiIIIII2 = iIiiiIIIII = this;
        int n = iIiiiIIIII2.ALLATORIxDEMO(class_1802.field_8687);
        int n2 = iIiiiIIIII2.ALLATORIxDEMO(class_1802.field_8733);
        if (n + n2 * (0x79 & 0xF) < (Integer)iIiiiIIIII.iiIIIiIIIi.get()) {
            IiIiIIiiii.IIIIiIIiII(IIiIIIIIii.ALLATORIxDEMO("\u7eb7\u5bd7\u779b\u4e47\u8ddb\uff46\u5225\u5fca\u880d\u7e93\u7bd9"));
            iIiiiIIIII.IiIiIiIIii = 3 ^ 3;
            IiIiiIIIiI.ALLATORIxDEMO((class_2338)iIiiiIIIII.iIIiiIiIiI.get(), ((Integer)iIiiiIIIII.IiiiiIIiII.get()).intValue());
            iIiiiIIIII.ALLATORIxDEMO(VillagerTrader.State.IiiIiIiiIi);
            return;
        }
        IIiiiIIIII iIiiiIIIII3 = iIiiiIIIII;
        if (n2 > 0) {
            iIiiiIIIII3.ALLATORIxDEMO(VillagerTrader.State.iIiIiiiiII);
            return;
        }
        iIiiiIIIII3.ALLATORIxDEMO(VillagerTrader.State.iIIiIiiiIi);
    }

    private /* synthetic */ void IiiIIiIIIi() {
        IIiiiIIIII iIiiiIIIII;
        IIiiiIIIII iIiiiIIIII2 = iIiiiIIIII = this;
        iIiiiIIIII2.IIiIiIIiii += 4 ^ 5;
        if (iIiiiIIIII2.IIiIiIIiii > (0x3F & 0x54)) {
            iIiiiIIIII.IIiIiIIiii = 3 ^ 3;
            int n = iIiiiIIIII.ALLATORIxDEMO();
            if (n > 0) {
                IiIiIIiiii.IIiIiIiIiI("\u65e0\u6cd5\u5b8c\u5168\u5b58\u50a8\u7269\u54c1\uff08\u5269\u4f59 " + n + "\uff09\uff0c\u7ee7\u7eed\u4ea4\u6613");
            }
            iIiiiIIIII.ALLATORIxDEMO(VillagerTrader.State.iIIiiIiIiI);
        }
    }

    public IIiiiIIIII() {
        IIiiiIIIII iIiiiIIIII = this;
        super((Category)ALLATORIxDEMO, iIIIIiIiii.ALLATORIxDEMO("\u678d\u903b\u81e1\u528b\u6747\u6c2f\u4ef8\u6667"), IIiIIIIIii.ALLATORIxDEMO("\u8182\u52e2\u4e66\u671b\u6c79\u4eee\u667b"));
        iIiiiIIIII.iIiIiiiiII = iIiiiIIIII.settings.getDefaultGroup();
        iIiiiIIIII.IiiiiIiIiI = iIiiiIIIII.settings.createGroup(iIIIIiIiii.ALLATORIxDEMO("\u8873\u7ee7\u8be2\u7f1a"));
        iIiiiIIIII.iiiiiIIiIi = iIiiiIIIII.settings.createGroup(IIiIIIIIii.ALLATORIxDEMO("\u4eee\u667b\u8bf4\u7f06"));
        iIiiiIIIII.iIIiIiiiIi = iIiiiIIIII.settings.createGroup(iIIIIiIiii.ALLATORIxDEMO("\u5b4e\u5096\u8be2\u7f1a"));
        iIiiiIIIII.iiiIiiIIII = iIiiiIIIII.settings.createGroup(IIiIIIIIii.ALLATORIxDEMO("\u962c\u9b1e\u4e0e\u8bf4\u7f06"));
        iIiiiIIIII.iiiIiIIiii = iIiiiIIIII.iIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4eb2\u4eac\u8dd9\u6582"))).description(IIiIIIIIii.ALLATORIxDEMO("\u7b21\u5fef\u4eec\u4ef8\u5bc4\u627a\u76cc\u8dcf\u659e\u65bc\u959cb\u001c#\u000b!A"))).defaultValue((Object)(0x6D & 0x76))).min(0x37 & 0x5C).max(0x22D9 & 0x5F7E).sliderMax(0x267F & 0x5BD8).build());
        this.IiiiiIIiII = this.iIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6217\u950b"))).description(IIiIIIIIii.ALLATORIxDEMO("\u64a7\u4f14\u659c\u4e46\u7684\u684f\u76ce\u8db5\u79f1\uff64\u4f2a\u6223\u6743\u5972\u9535\uff77"))).defaultValue((Object)(--4))).min(2 ^ 3).max(0xE & 0x7B).sliderMax(0x3B & 0x4E).build());
        int n = 2 & 5;
        this.iIIiiIiIiI = this.IiiiiIiIiI.add((Setting)((BlockPosSetting.Builder)((BlockPosSetting.Builder)((BlockPosSetting.Builder)new BlockPosSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u8846\u7ecf\u7b8f\u4f11\u7f1a"))).description(IIiIIIIIii.ALLATORIxDEMO("\u5b12\u6556\u7eb5\u5bf5\u77b9\u76ec\u7bfb\u5b38\u4f07\u7f06"))).defaultValue((Object)new class_2338(n, 3 >> 2, n))).build());
        this.iiIIIiIIIi = this.IiiiiIiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u8873\u7ee7\u9654\u5048"))).description(IIiIIIIIii.ALLATORIxDEMO("\u7e95\u5bd5\u7799\u6538\u9185\u4f26\u4ec4\u6b0c\u5076\u659e\u89ac\u53b9\u882f\u7eb1"))).defaultValue((Object)(0x3A & 0x4F))).min(2 ^ 3).max(0x19B3 & 0x6F4C).sliderMax(0x4FAD & 0x3952).build());
        this.iIiiiiIIII = this.IiiiiIiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6bc4\u6b02\u8873\u7ee7\u7e98\u6504"))).description(IIiIIIIIii.ALLATORIxDEMO("\u6ba7\u6b6b\u880d\u7e93\u76ec\u7e8e\u6518"))).defaultValue((Object)(--3))).min(2 ^ 3).max(0x3D & 0x66).sliderMax(0x7C & 0x27).build());
        this.iIIiIiiIiI = this.iiiiiIIiIi.add((Setting)((IIIiIIIIii)((Object)((IIIiIIIIii)((Object)new IIIiIIIIii().name(iIIIIiIiii.ALLATORIxDEMO("\u6747\u6c2f\u8010\u4e6e")))).description(IIiIIIIIii.ALLATORIxDEMO("\u89cb\u4ecc\u6659\u76ec\u671b\u6c79\u8006\u4e72")))).ALLATORIxDEMO());
        class_1792[] class_1792Array = new class_1792[2 ^ 3];
        class_1792Array[3 & 4] = class_1802.field_8287;
        this.iIIIiiiiIi = this.iiiiiIIiIi.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u8d3b\u4e4e\u7235\u54b5"))).description(IIiIIIIIii.ALLATORIxDEMO("\u89cb\u8d45\u4e3a\u76ec\u7223\u54a9\u525d\u8800"))).defaultValue(Arrays.asList(class_1792Array))).build());
        this.iIIIIIiiII = this.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6bc3\u6b05\u4eaf\u6630\u6716\u5919\u82ed\u8d4d"))).description(IIiIIIIIii.ALLATORIxDEMO("\u531d\u6b4b\u4eec\u6659\u6768\u5950\u82d9\u8d73\u76ec\u7eb5\u5bf5\u77b9\u6518"))).defaultValue((Object)(3 >> 1))).min(3 & 5).max(0x4D & 0x72).sliderMax(0x52 & 0x6D).build());
        this.iIIiiIIIIi = this.iiiiiIIiIi.add((Setting)((iiIIiIiiii)((Object)((iiIIiIiiii)((Object)new iiIIiIiiii().name(iIIIIiIiii.ALLATORIxDEMO("\u7262\u54e2\u726f\u5ba4\u82ed\u8d4d")))).description(IIiIIIIIii.ALLATORIxDEMO("\u7233\u5bf2\u7223\u54a9\u76ee\u6748\u594d\u82f9\u8d53`\u7223\u54a9\u82bb\u65ef#\fp\u4e9f\u6876A")))).ALLATORIxDEMO(Maps.newHashMap(Map.of(iIIIIiIiii.ALLATORIxDEMO("fSsNq7\u0013e@i{iLbJ0\u0011"), IIiIIIIIii.ALLATORIxDEMO("Y")))).ALLATORIxDEMO());
        this.iIiiiIiIii = this.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5b4e\u5096\u9654\u5048"))).description(IIiIIIIIii.ALLATORIxDEMO("\u8d65\u4e1a\u7221\u548b\u6995\u4f07\u8ded\u8f8d\u6b0c\u5076\u659e\u5b12\u50c0"))).defaultValue((Object)(0x5F & 0x34))).min(3 & 5).max(0x36 & 0x6D).sliderMax(0x77 & 0x2C).build());
        this.ALLATORIxDEMO = this.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u886e\u8d04\u7b5f\u5fbb\u65aa\u9580"))).description(IIiIIIIIii.ALLATORIxDEMO("\u7b23\u5fcd\u671b\u6c79\u882f\u8d4f\u76ce\u659e\u95be@\u7998A"))).defaultValue((Object)(0x7F & 0x3C))).min(0x5A & 0x2F).max(0x1BDC & 0x667B).sliderMax(0x2B5F & 0x56F8).build());
        int n2 = 5 >> 3;
        this.IIIIiiIiii = this.iIIiIiiiIi.add((Setting)((BlockPosSetting.Builder)((BlockPosSetting.Builder)((BlockPosSetting.Builder)new BlockPosSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5b7b\u50be\u7b8f\u4f11\u7f1a"))).description(IIiIIIIIii.ALLATORIxDEMO("\u5b10\u6574\u8d45\u4e3a\u7201\u548b\u76ec\u7bfb\u5b38\u4f07\u7f06"))).defaultValue((Object)new class_2338(n2, 5 >> 3, n2))).build());
        this.IiiIiIiiIi = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u8d0e\u4e66\u967a\u9b08\u4e12"))).description(IIiIIIIIii.ALLATORIxDEMO("\u6647\u546c\u8d45\u4e3a\u962c\u9b1e\u4e0e"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiiiIii = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4ee6\u6716\u9ae6\u7b15\u7ed3"))).description(IIiIIIIIii.ALLATORIxDEMO("\u53a2\u8d67\u4e18\u674a\u9ab0\u7b03\u7ecf\u76ce\u962c\u9b1e\u4e0e"))).defaultValue((Object)(--1 != 0))).visible(() -> this.IiiIiIiiIi.get())).build());
        this.IIiiiiIIii = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4ee6\u6311\u5ba4\u9618\u9b20"))).description(IIiIIIIIii.ALLATORIxDEMO("\u5382\u8d67\u4e18\u634d\u5bf2\u76ce\u962c\u9b1e\u4e0e"))).defaultValue((Object)((4 ^ 5) != 0))).visible(() -> this.IiiIiIiiIi.get())).build());
        class_5321[] class_5321Array = new class_5321[1 ^ 3];
        class_5321Array[3 >> 2] = class_1893.field_9101;
        class_5321Array[--1] = class_1893.field_9119;
        this.iiIiIIiiii = this.iiiIiiIIII.add((Setting)((EnchantmentListSetting.Builder)((EnchantmentListSetting.Builder)((EnchantmentListSetting.Builder)((EnchantmentListSetting.Builder)new EnchantmentListSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6709\u6725\u9618\u9b20"))).description(IIiIIIIIii.ALLATORIxDEMO("\u6777\u6751\u76ec\u960e\u9b3c"))).defaultValue(new LinkedHashSet<class_5321>(Arrays.asList(class_5321Array)))).visible(() -> {
            if (((Boolean)this.IiiIiIiiIi.get()).booleanValue() && ((Boolean)this.IIiiiiIIii.get()).booleanValue()) {
                return 5 >> 2;
            }
            return false;
        })).build());
        int n3 = 5 >> 3;
        this.iIiIIiIIIi = this.iiiIiiIIII.add((Setting)((BlockPosSetting.Builder)((BlockPosSetting.Builder)((BlockPosSetting.Builder)((BlockPosSetting.Builder)new BlockPosSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4e45\u673a\u885b\u7e85\u7bc5"))).description(IIiIIIIIii.ALLATORIxDEMO("\u5b12\u6556\u6624\u9072\u4e2c\u76ec\u7bfb\u5b38\u4f07\u7f06"))).defaultValue((Object)new class_2338(n3, 3 >> 2, n3))).visible(() -> this.IiiIiIiiIi.get())).build());
        this.IIiiIIIIIi = this.iiiIiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u4e6d\u670f\u8873\u7ee7\u9654\u5048"))).description(IIiIIIIIii.ALLATORIxDEMO("\u4e2e\u6766\u6518\u9185\u4f26\u4ec4\u6b0c\u5076\u659e\u882f\u7eb1"))).defaultValue((Object)(0x7C & 0x1B))).min(2 ^ 3).max(0x75 & 0x4A).sliderMax(0x43 & 0x7C).visible(() -> this.IiiIiIiiIi.get())).build());
        IIiiiIIIII iIiiiIIIII2 = this;
        this.iiiIiIiiII = VillagerTrader.State.iIIiiIiIiI;
        IIiiiIIIII iIiiiIIIII3 = this;
        iIiiiIIIII3.iIiIiIIIII = new HashSet<Integer>();
        this.IIiIiIIiii = 2 & 5;
        this.iIIIIIIiII = 2 & 5;
        iIiiiIIIII2.IiIiIiIIii = this.iIIIIIIiII;
        iIiiiIIIII2.IIiIiiiiII = 3 ^ 3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIiIiii.ALLATORIxDEMO("[ONbXf\u000bv[gJw;W+\u8bd4\u66f8\u6594\u523b\u6723\u65a6\u7276\u6770\uff75"));
        }
    }

    public static class_3852 ALLATORIxDEMO(class_1646 iIiIiIIIII2) {
        return iIiiiIIiIi.ALLATORIxDEMO(iIiIiIIIII2);
    }

    private /* synthetic */ int iiIIiIIiii() {
        IIiiiIIIII iIiiiIIIII = this;
        int n = 2 & 5;
        HashSet<class_1792> hashSet = new HashSet<class_1792>((Collection)iIiiiIIIII.iIIIiiiiIi.get());
        if (((Boolean)iIiiiIIIII.IiiIiIiiIi.get()).booleanValue()) {
            hashSet.add(class_1802.field_8598);
        }
        int n2 = this = 0;
        while (true) {
            if (n2 >= 45) break;
            class_1799 class_17992 = iIiiiIIIII.iIIiiIiIiI.field_1724.method_31548().method_5438(this);
            if (!class_17992.method_7960() && hashSet.contains(class_17992.method_7909())) {
                ++n;
            }
            n2 = ++this;
        }
        return n;
    }

    private /* synthetic */ int iiiIiIiiIi() {
        IIiiiIIIII iIiiiIIIII = this;
        int n = 3 ^ 3;
        int n2 = this = 0x19 & 0x6F;
        while (true) {
            if (n2 >= 45) break;
            if (iIiiiIIIII.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7960()) {
                ++n;
            }
            n2 = ++this;
        }
        return n;
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        int n;
        IIiiiIIIII iIiiiIIIII = this;
        int n2 = 3 & 4;
        HashSet<class_1792> hashSet = new HashSet<class_1792>((Collection)iIiiiIIIII.iIIIiiiiIi.get());
        if (((Boolean)iIiiiIIIII.IiiIiIiiIi.get()).booleanValue()) {
            hashSet.add(class_1802.field_8598);
        }
        int n3 = n = 9;
        while (true) {
            if (n3 >= 45) break;
            class_1799 class_17992 = iIiiiIIIII.iIIiiIiIiI.field_1724.method_31548().method_5438(n);
            if (!class_17992.method_7960() && hashSet.contains(class_17992.method_7909())) {
                n2 += class_17992.method_7947();
            }
            n3 = ++n;
        }
        return n2;
    }

    private /* synthetic */ void ALLATORIxDEMO(VillagerTrader.State state) {
        IIiiiIIIII iIiiiIIIII = object;
        Object object = state;
        IIiiiIIIII iIiIiIIIII2 = iIiiiIIIII;
        iIiIiIIIII2.iiiIiIiiII = object;
    }

    private /* synthetic */ void IIIIiIIIII() {
        IIiiiIIIII iIiiiIIIII = this;
        iIiiiIIIII.iIIIIIIiII += 3 >> 1;
        if (iIiiiIIIII.iIIIIIIiII >= (Integer)this.ALLATORIxDEMO.get() * (0x1D & 0x76)) {
            IIiiiIIIII iIiiiIIIII2 = this;
            iIiiiIIIII2.iIiIiIIIII.clear();
            IiIiIIiiii.IIIIiIIiII(IIiIIIIIii.ALLATORIxDEMO("\u7b01\u5fcf\u5be4\u625a\uff64\u9187\u65d8\u5f4a\u59a3\u4eee\u667b"));
            iIiiiIIIII2.ALLATORIxDEMO(VillagerTrader.State.iIIiiIiIiI);
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_1297 class_12972) {
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII2;
        IIiiiIIIII iIiiiIIIII2 = class_12972;
        IIiiiIIIII iIiIiIIIII2 = iIiiiIIIII;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1761 == null) {
            return;
        }
        iIiIiIIIII2.iIIiiIiIiI.field_1761.method_2905((class_1657)iIiIiIIIII2.iIIiiIiIiI.field_1724, (class_1297)iIiiiIIIII2, class_1268.field_5808);
    }

    private /* synthetic */ void IIIIiIiiii() {
        if (!this.IiIiIiIIii) {
            int n = 3 >> 1;
            if (this.iIIiiIiIiI.field_1724.method_19538().method_1022(class_243.method_24953((class_2382)((class_2382)this.IIIIiiIiii.get()))) <= (double)((Integer)this.IiiiiIIiII.get() + n)) {
                this.IiIiIiIIii = 4 ^ 5;
                this.IIiIiiiiII = 2 & 5;
                this.ALLATORIxDEMO((class_2338)this.IIIIiiIiii.get());
                return;
            }
        } else {
            IIiiiIIIII iIiiiIIIII = this;
            iIiiiIIIII.IIiIiiiiII += 3 >> 1;
            if (iIiiiIIIII.iIIiiIiIiI.field_1724.field_7512 != this.iIIiiIiIiI.field_1724.field_7498) {
                IIiiiIIIII iIiiiIIIII2 = this;
                iIiiiIIIII2.IIiIiIIiii = 2 & 5;
                iIiiiIIIII2.IiiiiiiIIi();
                iIiiiIIIII2.iIIiiIiIiI.field_1724.method_7346();
                iIiiiIIIII2.ALLATORIxDEMO(VillagerTrader.State.IIiiIIIIIi);
                return;
            }
            IIiiiIIIII iIiiiIIIII3 = this;
            if (iIiiiIIIII3.IIiIiiiiII > (Integer)iIiiiIIIII3.iiiIiIIiii.get()) {
                IiIiIIiiii.IIiIiIiIiI(iIIIIiIiii.ALLATORIxDEMO("\u6278\u5f03\u5b53\u508b\u7bba\u8da6\u65fd\uff2f\u91c6\u8bf6"));
                this.ALLATORIxDEMO(VillagerTrader.State.IIiIiiiiII);
            }
        }
    }

    private /* synthetic */ void iiiIiIiIII() {
        IiIiIIiiii.IIIIiIIiII(iIIIIiIiii.ALLATORIxDEMO("\u526e\u5fab\u4e65\u6707\u8866\u7ef2\u7bb2"));
        this.IiIiIiIIii = 5 >> 3;
        IiIiiIIIiI.ALLATORIxDEMO((class_2338)this.iIiIIiIIIi.get(), ((Integer)this.IiiiiIIiII.get()).intValue());
        this.ALLATORIxDEMO(VillagerTrader.State.IiiiiIiIiI);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_1728 class_17282, class_1914 class_19142) {
        void iIiIiIIIII22;
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII2;
        IIiiiIIIII iIiiiIIIII2 = class_19142;
        IIiiiIIIII iIiIiIIIII3 = iIiiiIIIII;
        int n = iIiIiIIIII22.method_17438().indexOf((Object)iIiiiIIIII2);
        if (n == -4 >> 2) {
            return (2 & 5) != 0;
        }
        void v1 = iIiIiIIIII22;
        int n2 = n;
        v1.method_7650(n2);
        v1.method_20215(n2);
        int iIiIiIIIII22 = iIiiiIIIII2.method_8248() - iIiiiIIIII2.method_8249();
        int n3 = this = 3 & 4;
        while (n3 < iIiIiIIIII22) {
            int n4 = 2 ^ 3;
            iIiIiIIIII3.ALLATORIxDEMO(1 ^ 3, 3 & 4, class_1713.field_7794);
            n3 = ++this;
        }
        return true;
    }

    private /* synthetic */ void IIIIIIIiII() {
        IIiiiIIIII iIiiiIIIII;
        IIiiiIIIII iIiiiIIIII2 = iIiiiIIIII = this;
        iIiiiIIIII2.IIiIiIIiii += 2 ^ 3;
        if (iIiiiIIIII2.iIIiiIiIiI.field_1724.field_7512 != iIiiiIIIII.iIIiiIiIiI.field_1724.field_7498) {
            IIiiiIIIII iIiiiIIIII3 = iIiiiIIIII;
            iIiiiIIIII3.ALLATORIxDEMO(class_1802.field_8687, (Integer)iIiiiIIIII3.iIiiiiIIII.get());
            int n = --1;
            if ((Integer)iIiiiIIIII.iIiiiiIIII.get() > (0x59 & 0x2F)) {
                n = (Integer)iIiiiIIIII.iIiiiiIIII.get() / (0x1F & 0x69);
            }
            IIiiiIIIII iIiiiIIIII4 = iIiiiIIIII;
            iIiiiIIIII4.ALLATORIxDEMO(class_1802.field_8733, n);
            iIiiiIIIII4.iIIiiIiIiI.field_1724.method_7346();
        }
        if (iIiiiIIIII.IIiIiIIiii > (0x7D & 0x16)) {
            IIiiiIIIII iIiiiIIIII5 = iIiiiIIIII;
            int n = iIiiiIIIII5.ALLATORIxDEMO(class_1802.field_8687);
            int n2 = iIiiiIIIII5.ALLATORIxDEMO(class_1802.field_8733);
            if (n + n2 * (0x5F & 0x29) < (Integer)iIiiiIIIII.iiIIIiIIIi.get()) {
                IiIiIIiiii.IIiIiIiIiI("\u8865\u7ed9\u540e\u7eff\u5b9d\u77f3\u4ecd\u4e0d\u8db3 " + String.valueOf(iIiiiIIIII.iiIIIiIIIi.get()) + "\uff0c\u7ee7\u7eed\u4ea4\u6613");
            }
            IIiiiIIIII iIiiiIIIII6 = iIiiiIIIII;
            if (n2 > 0) {
                iIiiiIIIII6.ALLATORIxDEMO(VillagerTrader.State.iIiIiiiiII);
                return;
            }
            iIiiiIIIII6.ALLATORIxDEMO(VillagerTrader.State.iIIiIiiiIi);
        }
    }

    private /* synthetic */ void IIiIiIiiii() {
        if (!this.IiIiIiIIii) {
            int n = 5 >> 2;
            if (this.iIIiiIiIiI.field_1724.method_19538().method_1022(class_243.method_24953((class_2382)((class_2382)this.iIIiiIiIiI.get()))) <= (double)((Integer)this.IiiiiIIiII.get() + n)) {
                this.IiIiIiIIii = 4 ^ 5;
                this.IIiIiiiiII = 3 & 4;
                this.ALLATORIxDEMO((class_2338)this.iIIiiIiIiI.get());
                return;
            }
        } else {
            IIiiiIIIII iIiiiIIIII = this;
            iIiiiIIIII.IIiIiiiiII += 4 ^ 5;
            if (iIiiiIIIII.iIIiiIiIiI.field_1724.field_7512 != this.iIIiiIiIiI.field_1724.field_7498) {
                this.IIiIiIIiii = 5 >> 3;
                this.ALLATORIxDEMO(VillagerTrader.State.iiiIiiIIII);
                return;
            }
            IIiiiIIIII iIiiiIIIII2 = this;
            if (iIiiiIIIII2.IIiIiiiiII > (Integer)iIiiiIIIII2.iiiIiIIiii.get()) {
                IiIiIIiiii.IIiIiIiIiI(iIIIIiIiii.ALLATORIxDEMO("\u6278\u5f03\u886e\u7efa\u7bba\u8da6\u65fd\uff2f\u91c6\u8bf6"));
                this.ALLATORIxDEMO(VillagerTrader.State.iIIiiIiIiI);
            }
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1799 class_17992) {
        IIiiiIIIII iIiiiIIIII = iterator;
        Iterator iterator = class_17992;
        IIiiiIIIII iIiIiIIIII2 = iIiiiIIIII;
        iterator = iIiIiIIIII2.ALLATORIxDEMO((class_1799)iterator);
        if (iterator.size() != 5 >> 2) {
            return 5 >> 3;
        }
        for (Map.Entry entry : iterator.entrySet()) {
            class_6880 class_68802 = (class_6880)entry.getKey();
            int n = (Integer)entry.getValue();
            ((class_1887)class_68802.comp_349()).method_8183();
            if (((Boolean)iIiIiIIIII2.iIIiiiiIii.get()).booleanValue() && n < ((class_1887)class_68802.comp_349()).method_8183()) {
                return (3 ^ 3) != 0;
            }
            if (!((Boolean)iIiIiIIIII2.IIiiiiIIii.get()).booleanValue() || ((Set)iIiIiIIIII2.iiIiIIiiii.get()).isEmpty() || ((Set)iIiIiIIIII2.iiIiIIiiii.get()).contains(class_68802)) continue;
            return 3 >> 2;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int iiiIiIiiIi(class_1792 class_17922) {
        IIiiiIIIII iIiiiIIIII = this;
        int n = this = 0x39 & 0x4F;
        while (true) {
            void iIiIiIIIII2;
            if (n >= 45) break;
            if (iIiiiIIIII.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909() == iIiIiIIIII2) {
                return this;
            }
            n = ++this;
        }
        return -1;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1914 class_19142) {
        IIiiiIIIII iIiiiIIIII = object;
        Object object = class_19142;
        IIiiiIIIII iIiIiIIIII2 = iIiiiIIIII;
        IIiiiIIIII iIiiiIIIII2 = object;
        object = iIiiiIIIII2.method_8250();
        class_1799 class_17992 = iIiiiIIIII2.method_57556().comp_2427();
        if (class_17992.method_7909() != class_1802.field_8687) {
            return 3 >> 2;
        }
        HashSet hashSet = new HashSet((Collection)iIiIiIIIII2.iIIIiiiiIi.get());
        if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue() && object.method_7909() == class_1802.field_8598) {
            return iIiIiIIIII2.ALLATORIxDEMO((class_1799)object);
        }
        if (!hashSet.contains(object.method_7909())) {
            return (2 & 5) != 0;
        }
        int n = class_17992.method_7947();
        object = class_7923.field_41178.method_10221((Object)object.method_7909()).method_12832();
        object = (String)((Map)iIiIiIIIII2.iIIiiIIIIi.get()).get(object);
        IIiiiIIIII iIiiiIIIII3 = iIiIiIIIII2;
        int this2 = iIiiiIIIII3.ALLATORIxDEMO((Integer)iIiiiIIIII3.iIIIIIiiII.get(), (String)object);
        if (n <= this2) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ void iIiIiiiiii() {
        if (!this.IiIiIiIIii) {
            int n = 3 >> 1;
            if (this.iIIiiIiIiI.field_1724.method_19538().method_1022(class_243.method_24953((class_2382)((class_2382)this.iIiIIiIIIi.get()))) <= (double)((Integer)this.IiiiiIIiII.get() + n)) {
                this.IiIiIiIIii = --1;
                this.IIiIiiiiII = 2 & 5;
                this.ALLATORIxDEMO((class_2338)this.iIiIIiIIIi.get());
                return;
            }
        } else {
            IIiiiIIIII iIiiiIIIII = this;
            iIiiiIIIII.IIiIiiiiII += 5 >> 2;
            if (iIiiiIIIII.iIIiiIiIiI.field_1724.field_7512 != this.iIIiiIiIiI.field_1724.field_7498) {
                this.IIiIiIIiii = 2 & 5;
                this.ALLATORIxDEMO(VillagerTrader.State.IIiIiIIiii);
                return;
            }
            IIiiiIIIII iIiiiIIIII2 = this;
            if (iIiiiIIIII2.IIiIiiiiII > (Integer)iIiiiIIIII2.iiiIiIIiii.get()) {
                IiIiIIiiii.IIiIiIiIiI(IIiIIIIIii.ALLATORIxDEMO("\u6219\u5f68\u4e2c\u6744\u7bfb\u8ded\u65bc\uff64\u9187\u8bbd"));
                this.ALLATORIxDEMO(VillagerTrader.State.iIIIiiiiIi);
            }
        }
    }

    private /* synthetic */ void iIiIiIiIii() {
        IIiiiIIIII iIiiiIIIII = this;
        iIiiiIIIII.IIiIiIIiii += 3 >> 1;
        if (iIiiiIIIII.IIiIiIIiii > (0x1F & 0x74)) {
            this.IIiIiIIiii = 3 & 4;
            if (this.iiIIiIIiii() > (Integer)this.iIiiiIiIii.get()) {
                this.ALLATORIxDEMO(VillagerTrader.State.IIiIiiiiII);
                return;
            }
            if (this.ALLATORIxDEMO(class_1802.field_8687) < (Integer)this.iiIIIiIIIi.get()) {
                this.ALLATORIxDEMO(VillagerTrader.State.iIIiiIiIiI);
                return;
            }
            this.ALLATORIxDEMO(VillagerTrader.State.iIIiIiiiIi);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(class_1914 class_19142) {
        void iIiIiIIIII22;
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII2;
        void v0 = iIiIiIIIII22;
        IIiiiIIIII iIiiiIIIII2 = v0.method_8250();
        int iIiIiIIIII22 = (v0.method_8248() - iIiIiIIIII22.method_8249()) * iIiiiIIIII2.method_7947();
        int this2 = iIiiiIIIII2.method_7914();
        return (iIiIiIIIII22 + this2 - (4 ^ 5)) / this2;
    }

    public void onDeactivate() {
        IIiiiIIIII iIiiiIIIII = this;
        iIiiiIIIII.iiiIiIiiII = VillagerTrader.State.iIIiiIiIiI;
        iIiiiIIIII.iIiIiIIIII.clear();
        if (iIiiiIIIII.iIIiiIiIiI.field_1724 != null && this.iIIiiIiIiI.field_1724.field_7512 != null) {
            this.iIIiiIiIiI.field_1724.method_7346();
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(GameLeftEvent gameLeftEvent) {
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII2;
        IIiiiIIIII iIiiiIIIII2 = gameLeftEvent;
        IIiiiIIIII iIiIiIIIII2 = iIiiiIIIII;
        iIiIiIIIII2.toggle();
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (!((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
            return (3 ^ 3) != 0;
        }
        if (this.ALLATORIxDEMO(class_1802.field_8529) < (Integer)this.IIiiIIIIIi.get()) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ void IIiIiIiIiI() {
        IIiiiIIIII iIiiiIIIII = this;
        iIiiiIIIII.IIiIiIIiii += 3 >> 1;
        if (iIiiiIIIII.iIIiiIiIiI.field_1724.field_7512 != this.iIIiiIiIiI.field_1724.field_7498) {
            IIiiiIIIII iIiiiIIIII2 = this;
            iIiiiIIIII2.ALLATORIxDEMO(class_1802.field_8529, (Integer)iIiiiIIIII2.IIiiIIIIIi.get() / (0x45 & 0x7A));
            this.iIIiiIiIiI.field_1724.method_7346();
        }
        if (this.IIiIiIIiii > (0x7F & 0x14)) {
            this.IIiIiIIiii = 3 ^ 3;
            this.ALLATORIxDEMO(VillagerTrader.State.iIIiIiiiIi);
        }
    }

    private /* synthetic */ void iiiiIIIiII() {
        IiIiIIiiii.IIIIiIIiII(IIiIIIIIii.ALLATORIxDEMO("\u5225\u5fca\u5b30\u50e2\u7bd9"));
        this.IiIiIiIIii = 2 & 5;
        IiIiiIIIiI.ALLATORIxDEMO((class_2338)this.IIIIiiIiii.get(), ((Integer)this.IiiiiIIiII.get()).intValue());
        this.ALLATORIxDEMO(VillagerTrader.State.iIiIiIIIII);
    }

    @Override
    public void onActivate() {
        IIiiiIIIII iIiiiIIIII = this;
        this.iiiIiIiiII = VillagerTrader.State.iIIiiIiIiI;
        this.iIiIiIIIII.clear();
        this.IIiIiIIiii = 3 & 4;
        this.iIIIIIIiII = 3 & 4;
        iIiiiIIIII.IiIiIiIIii = this.iIIIIIIiII;
        iIiiiIIIII.IIiIiiiiII = 5 >> 3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1792 class_17922, int n) {
        IIiiiIIIII iIiiiIIIII = this;
        if (iIiiiIIIII.iIIiiIiIiI.field_1724.field_7512 == iIiiiIIIII.iIIiiIiIiI.field_1724.field_7498) {
            return;
        }
        int n2 = 0;
        int n3 = this = 5 >> 3;
        while (n3 < iIiiiIIIII.iIIiiIiIiI.field_1724.field_7512.field_7761.size()) {
            void iIiIiIIIII2;
            void iIiIiIIIII3;
            if (n2 >= iIiIiIIIII3) {
                return;
            }
            if (iIiiiIIIII.iIIiiIiIiI.field_1724.field_7512.method_7611(this).method_7677().method_7909() == iIiIiIIIII2) {
                int n4 = 3 & 5;
                ++n2;
                iIiiiIIIII.ALLATORIxDEMO(this, 5 >> 3, class_1713.field_7794);
            }
            n3 = ++this;
        }
    }

    private /* synthetic */ List<class_1914> ALLATORIxDEMO(class_1728 class_17282) {
        IIiiiIIIII iIiiiIIIII = object;
        Object object = class_17282;
        IIiiiIIIII iIiIiIIIII2 = iIiiiIIIII;
        ArrayList<class_1914> arrayList = new ArrayList<class_1914>();
        Object object2 = object = object.method_17438().iterator();
        while (object2.hasNext()) {
            class_1914 class_19142 = (class_1914)object.next();
            if (class_19142.method_8255()) {
                object2 = object;
                continue;
            }
            if (!iIiIiIIIII2.ALLATORIxDEMO(class_19142)) {
                object2 = object;
                continue;
            }
            arrayList.add(class_19142);
            object2 = object;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n, int n2, class_1713 class_17132) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII2;
        IIiiiIIIII iIiiiIIIII2 = class_17132;
        IIiiiIIIII iIiIiIIIII4 = iIiiiIIIII;
        if (iIiIiIIIII4.iIIiiIiIiI.field_1761 == null) {
            return;
        }
        iIiIiIIIII4.iIIiiIiIiI.field_1761.method_2906(iIiIiIIIII4.iIIiiIiIiI.field_1724.field_7512.field_7763, (int)iIiIiIIIII3, (int)iIiIiIIIII2, (class_1713)iIiiiIIIII2, (class_1657)iIiIiIIIII4.iIIiiIiIiI.field_1724);
    }

    private /* synthetic */ void IIIIiIIiII() {
        IIiiiIIIII iIiiiIIIII = this;
        if (iIiiiIIIII.ALLATORIxDEMO(class_1802.field_8733) == 0) {
            iIiiiIIIII.ALLATORIxDEMO(VillagerTrader.State.iIIiIiiiIi);
            return;
        }
        if (iIiiiIIIII.iiiIiIiiIi() < --5) {
            IiIiIIiiii.IIiIiIiIiI(IIiIIIIIii.ALLATORIxDEMO("\u8084\u536f\u7a32\u959e\u4e45\u8df9\uff64\u65aa\u6cbd\u524c\u898b\u7eb5\u5bf5\u77b9\u573f"));
            iIiiiIIIII.ALLATORIxDEMO(VillagerTrader.State.iIIiIiiiIi);
            return;
        }
        int n = iIiiiIIIII.iiiIiIiiIi(class_1802.field_8733);
        if (n != -4 >> 2) {
            IIiiiIIIII iIiiiIIIII2 = iIiiiIIIII;
            iIiiiIIIII2.ALLATORIxDEMO(n);
            iIiiiIIIII2.ALLATORIxDEMO(VillagerTrader.State.iiiIiIIiii);
            return;
        }
        iIiiiIIIII.ALLATORIxDEMO(VillagerTrader.State.iIIiIiiiIi);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(class_1792 class_17922) {
        int n;
        IIiiiIIIII iIiiiIIIII = this;
        int n2 = 2 & 5;
        int n3 = n = 0x59 & 0x2F;
        while (true) {
            void iIiIiIIIII2;
            if (n3 >= 45) break;
            class_1799 class_17992 = iIiiiIIIII.iIIiiIiIiI.field_1724.method_31548().method_5438(n);
            if (class_17992.method_7909() == iIiIiIIIII2) {
                n2 += class_17992.method_7947();
            }
            n3 = ++n;
        }
        return n2;
    }

    private /* synthetic */ void iiIIiIIiii() {
        IIiiiIIIII iIiiiIIIII = this;
        iIiiiIIIII.IIiIiIIiii += 2 ^ 3;
        if (iIiiiIIIII.IIiIiIIiii > (0x1F & 0x6A)) {
            this.IIiIiIIiii = 3 ^ 3;
            IIiiiIIIII iIiiiIIIII2 = this;
            if (this.ALLATORIxDEMO(class_1802.field_8733) > 0) {
                iIiiiIIIII2.ALLATORIxDEMO(VillagerTrader.State.iIiIiiiiII);
                return;
            }
            iIiiiIIIII2.ALLATORIxDEMO(VillagerTrader.State.iIIiIiiiIi);
        }
    }

    private /* synthetic */ class_1646 ALLATORIxDEMO() {
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII3;
        if (iIiiiIIIII.iIIiiIiIiI.field_1687 == null) {
            return null;
        }
        IIiiiIIIII iIiiiIIIII2 = null;
        double d = Double.MAX_VALUE;
        Iterator iterator = iIiiiIIIII.iIIiiIiIiI.field_1687.method_18112().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                double d2;
                IIiiiIIIII iIiiiIIIII3 = (class_1297)iterator.next();
                if (!(iIiiiIIIII3 instanceof class_1646)) continue block0;
                if (iIiiiIIIII.iIiIiIIIII.contains((iIiiiIIIII3 = (class_1646)iIiiiIIIII3).method_5628())) {
                    iterator2 = iterator;
                    continue;
                }
                class_3852 class_38522 = IIiiiIIIII.ALLATORIxDEMO((class_1646)iIiiiIIIII3);
                if (!((List)iIiiiIIIII.iIIiIiiIiI.get()).contains(class_38522)) {
                    iterator2 = iterator;
                    continue;
                }
                double d3 = iIiiiIIIII.iIIiiIiIiI.field_1724.method_5858((class_1297)iIiiiIIIII3);
                if (!(d2 < d)) continue block0;
                d = d3;
                iIiiiIIIII2 = iIiiiIIIII3;
                continue block0;
            }
            break;
        }
        return iIiiiIIIII2;
    }

    private /* synthetic */ void iiiIiIiiIi() {
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII2;
        if (iIiiiIIIII.iiIIiIIiii() > (Integer)iIiiiIIIII.iIiiiIiIii.get()) {
            iIiiiIIIII.ALLATORIxDEMO(VillagerTrader.State.IIiIiiiiII);
            return;
        }
        IIiiiIIIII iIiiiIIIII2 = iIiiiIIIII.ALLATORIxDEMO();
        if (iIiiiIIIII2 == null) {
            if (iIiiiIIIII.iIiIiIIIII.isEmpty()) {
                IiIiIIiiii.IIiIiIiIiI(iIIIIiIiii.ALLATORIxDEMO("\u6701\u627d\u523b\u53cc\u4e8f\u6610\u768f\u6772\u6c1a\uff2f\u8fff\u56dd\u886e\u7efa"));
                iIiiiIIIII.ALLATORIxDEMO(VillagerTrader.State.iIIiiIiIiI);
                return;
            }
            IIiiiIIIII iIiiiIIIII3 = iIiiiIIIII;
            if (iIiiiIIIII.ALLATORIxDEMO() > 0) {
                iIiiiIIIII3.ALLATORIxDEMO(VillagerTrader.State.IIiIiiiiII);
                return;
            }
            iIiiiIIIII3.ALLATORIxDEMO(VillagerTrader.State.ALLATORIxDEMO);
            iIiiiIIIII.iIIIIIIiII = 3 >> 2;
            IiIiIIiiii.IIIIiIIiII("\u7b49\u5f85\u6751\u6c11\u8865\u8d27 " + String.valueOf(iIiiiIIIII.ALLATORIxDEMO.get()) + " \u79d2");
            return;
        }
        iIiiiIIIII.iIiIiIIIII.add(iIiiiIIIII2.method_5628());
        IIiiiIIIII iIiiiIIIII4 = iIiiiIIIII;
        iIiiiIIIII4.ALLATORIxDEMO((class_1297)iIiiiIIIII2);
        iIiiiIIIII4.IIiIiiiiII = 3 ^ 3;
        iIiiiIIIII4.ALLATORIxDEMO(VillagerTrader.State.iIiiiIiIii);
    }

    public Map<class_6880<class_1887>, Integer> ALLATORIxDEMO(class_1799 class_17992) {
        Iterator iIiIiIIIII2;
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII2;
        LinkedHashMap<class_6880<class_1887>, Integer> linkedHashMap = new LinkedHashMap<class_6880<class_1887>, Integer>();
        ArrayList<ObjectIntImmutablePair> arrayList = new ArrayList<ObjectIntImmutablePair>();
        Iterator iterator = iIiIiIIIII2 = class_1890.method_57532((class_1799)iIiIiIIIII2).method_57539().iterator();
        while (iterator.hasNext()) {
            IIiiiIIIII iIiiiIIIII2 = (Object2IntMap.Entry)iIiIiIIIII2.next();
            class_6880 class_68802 = (class_6880)iIiiiIIIII2.getKey();
            iterator = iIiIiIIIII2;
            int this2 = iIiiiIIIII2.getIntValue();
            linkedHashMap.put((class_6880<class_1887>)class_68802, this2);
            arrayList.add(ObjectIntImmutablePair.of((Object)class_68802, (int)this2));
        }
        return linkedHashMap;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IIiiiIIIII iIiiiIIIII = this;
        iIiiiIIIII.IIiIiiiiII += 2 ^ 3;
        if (iIiiiIIIII.iIIiiIiIiI.field_1724.field_7512 instanceof class_1728) {
            this.IIiIiIIiii = 3 ^ 3;
            this.ALLATORIxDEMO(VillagerTrader.State.iIiIIiIIIi);
            return;
        }
        if (this.IIiIiiiiII > (Integer)this.iiiIiIIiii.get()) {
            IiIiIIiiii.IIiIiIiIiI(IIiIIIIIii.ALLATORIxDEMO("\u4e46\u673b\u6c59\u4eee\u4efa\u8dcf\u659e\uff46\u5b93\u6234\u4e63\u4e4a\u4e42"));
            this.ALLATORIxDEMO(VillagerTrader.State.iIIiIiiiIi);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ Integer ALLATORIxDEMO(Integer n, String string) {
        void iIiIiIIIII2;
        IIiiiIIIII iIiiiIIIII = string2;
        String string2 = string;
        IIiiiIIIII iIiIiIIIII3 = iIiiiIIIII;
        try {
            return string2 == null ? iIiIiIIIII2.intValue() : Integer.parseInt(string2);
        }
        catch (Exception exception) {
            return iIiIiIIIII2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII2;
        IIiiiIIIII iIiiiIIIII2 = post;
        IIiiiIIIII iIiIiIIIII2 = iIiiiIIIII;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        switch (iIiIiIIIII2.iiiIiIiiII.ordinal()) {
            case 0: {
                iIiIiIIIII2.iIIiIiiiII();
                return;
            }
            case 1: {
                iIiIiIIIII2.IIiIiIiiii();
                return;
            }
            case 2: {
                iIiIiIIIII2.IIIIIIIiII();
                return;
            }
            case 3: {
                iIiIiIIIII2.IIIIiIIiII();
                return;
            }
            case 4: {
                iIiIiIIIII2.iiIIiIIiii();
                return;
            }
            case 5: {
                iIiIiIIIII2.iiiIiIiiIi();
                return;
            }
            case 6: {
                iIiIiIIIII2.ALLATORIxDEMO();
                return;
            }
            case 7: {
                iIiIiIIIII2.iIIIIIIIIi();
                return;
            }
            case 8: {
                iIiIiIIIII2.iIiIiIiIii();
                return;
            }
            case 9: {
                iIiIiIIIII2.iiiiIIIiII();
                return;
            }
            case 10: {
                iIiIiIIIII2.IIIIiIiiii();
                return;
            }
            case 11: {
                iIiIiIIIII2.IiiIIiIIIi();
                return;
            }
            case 12: {
                iIiIiIIIII2.IIIIiIIIII();
                return;
            }
            case 13: {
                iIiIiIIIII2.iiiIiIiIII();
                return;
            }
            case 14: {
                iIiIiIIIII2.iIiIiiiiii();
                return;
            }
            case 15: {
                iIiIiIIIII2.IIiIiIiIiI();
                return;
            }
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        IIiiiIIIII iIiiiIIIII = iIiiiIIIII2;
        IIiiiIIIII iIiiiIIIII2 = class_23382;
        IIiiiIIIII iIiIiIIIII2 = iIiiiIIIII;
        iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiiiIIIII2, class_2350.field_11036, --1 != 0, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
    }
}

