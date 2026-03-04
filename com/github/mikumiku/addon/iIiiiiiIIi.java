/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BlockPosSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Block
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.block.EnderChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.block.TrappedChestBlock
 *  net.minecraft.block.BarrelBlock
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import com.github.mikumiku.addon.IIIIiiiiii;
import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IiIiIiIiII;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiIiiiIIII;
import com.github.mikumiku.addon.IiIiiiIiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.iiIiiiIiii;
import com.github.mikumiku.addon.modules.sorter.ItemSorterModule;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockPosSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringListSetting;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.TrappedChestBlock;
import net.minecraft.block.BarrelBlock;

public class iIiiiiiIIi
extends iIiIiIIIii {
    private int iIIiIiiiII;
    private final Setting<List<String>> iiiiIiiIIi;
    private final SettingGroup iiiIIiIIii;
    private IiIiiiIIII IiiIIiIIiI;
    private long iIIIIiiiii;
    private final Setting<class_2338> IiIiIiIIii;
    private List<String> iiiIiIiiII;
    private final Setting<Integer> IIiiiiIIii;
    private Map<String, List<class_1799>> IiiiiIIiII;
    private final SettingGroup iIIIIIiiII;
    private long iIIiiiiIii;
    private final Setting<Boolean> iiIIIiIIIi;
    private final SettingGroup iIiiiiIIII;
    private int iiIiIIiiii;
    private final Setting<Integer> iIIiIiiIiI;
    private IiIiIiIiII iIIIIIIiII;
    private long iIIiiIIIIi;
    private final Setting<Boolean> IiiiiIiIiI;
    private final Setting<Integer> iiiIiIIiii;
    private final Setting<Integer> iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<String> iIiIIiIIIi;
    private final Setting<Map<String, List<class_1792>>> IIiIiiiiII;
    private List<iiIiiiIiii> IIiiIIIIIi;
    private class_2338 iIiiiIiIii;
    public String iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private ItemSorterModule.ProcessingState IiiIiIiiIi;
    private long IIiIiIIiii;
    private final Setting<String> iIIiiIiIiI;
    private final Setting<Integer> iiiiiIIiIi;
    private final Setting<Integer> iIIiIiiiIi;
    private final Setting<Integer> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    private /* synthetic */ void iiIIIIIIIi() {
        iIiiiiiIIi iIiiiiiIIi2;
        iIiiiiiIIi iIiiiiiIIi3 = iIiiiiiIIi2 = object;
        if (iIiiiiiIIi3.iiIiIIiiii >= iIiiiiiIIi3.iiiIiIiiII.size()) {
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIiIiIIiii);
            return;
        }
        iIiiiiiIIi iIiiiiiIIi4 = iIiiiiiIIi2;
        Object object = iIiiiiiIIi4.iiiIiIiiII.get(iIiiiiiIIi4.iiIiIIiiii);
        iiIiiiIiii iiIiiiIiii2 = iIiiiiiIIi2.IiiIIiIIiI.ALLATORIxDEMO((String)object);
        if (iiIiiiIiii2 == null) {
            iIiiiiiIIi2.info("\u5206\u7c7b " + (String)object + " \u627e\u4e0d\u5230\u5408\u9002\u7684\u5b58\u50a8\u7bb1\u5b50\uff0c\u8df3\u8fc7", new Object[3 & 4]);
            iIiiiiiIIi2.IIIIIIIiII();
            return;
        }
        iIiiiiiIIi2.info("\u6b63\u5728\u79fb\u52a8\u5230\u76ee\u6807\u7bb1\u5b50\uff1a" + String.valueOf(iiIiiiIiii2) + " \u7528\u4e8e\u5206\u7c7b\uff1a" + (String)object, new Object[3 >> 2]);
        iiIiiiIiii iiIiiiIiii3 = iiIiiiIiii2;
        object = new class_2338(iiIiiiIiii3.iIiIiIIIII, iiIiiiIiii3.iIIiIiiiIi, iiIiiiIiii2.iiiiiIIiIi);
        if (IiIiiIIIiI.ALLATORIxDEMO((class_2338)object, 3.0)) {
            iIiiiiiIIi2.info(IIiIIIIIii.ALLATORIxDEMO("\u5dba\u525a\u8ff6\u76a4\u686f\u7bfb\u5b38\u4f27\u7f26"), new Object[3 >> 2]);
            iIiiiiiIIi iIiiiiiIIi5 = iIiiiiiIIi2;
            iIiiiiiIIi5.iIiiiIiIii = object;
            iIiiiiiIIi5.ALLATORIxDEMO(iiIiiiIiii2.ALLATORIxDEMO());
            iIiiiiiIIi5.ALLATORIxDEMO(ItemSorterModule.ProcessingState.ALLATORIxDEMO);
        }
    }

    private /* synthetic */ void IIiiiIiiIi() {
        int n;
        iIiiiiiIIi iIiiiiiIIi2 = iIiiiiiIIi4;
        iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u5f73\u59e4\u5275\u7c54\u73da\u5b99\u5ec0\u5b57\u4e7e\u768b\u721a\u54ee"), new Object[2 & 5]);
        iIiiiiiIIi iIiiiiiIIi3 = iIiiiiiIIi2;
        iIiiiiiIIi2.IiiiiIIiII.clear();
        iIiiiiiIIi3.iiiIiIiiII.clear();
        iIiiiiiIIi3.iiIiIIiiii = 3 >> 2;
        if (iIiiiiiIIi3.iIIiiIiIiI.field_1724 == null) {
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIiIiIIiii);
            return;
        }
        int n2 = n = 9;
        while (true) {
            if (n2 >= 36) break;
            iIiiiiiIIi iIiiiiiIIi4 = iIiiiiiIIi2.iIIiiIiIiI.field_1724.method_31548().method_5438(n);
            if (!iIiiiiiIIi4.method_7960()) {
                iIiiiiiIIi iIiiiiiIIi5 = iIiiiiiIIi2;
                String string = iIiiiiiIIi5.iIIIIIIiII.iiiIiIiiIi((class_1799)iIiiiiiIIi4);
                iIiiiiiIIi5.IiiiiIIiII.computeIfAbsent(string, iIiIiIIIII2 -> new ArrayList()).add(iIiiiiiIIi4);
                iIiiiiiIIi2.info("\u7269\u54c1 " + iIiiiiiIIi4.method_7964().getString() + " \u5206\u7c7b\u4e3a\uff1a" + string, new Object[3 ^ 3]);
            }
            n2 = ++n;
        }
        if (iIiiiiiIIi2.IiiiiIIiII.isEmpty()) {
            iIiiiiiIIi2.info(IIiIIIIIii.ALLATORIxDEMO("\u6ccb\u6741\u7223\u54a9\u974a\u89e9\u526c\u7c33"), new Object[3 >> 2]);
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIiIiIIiii);
            return;
        }
        iIiiiiiIIi iIiiiiiIIi6 = iIiiiiiIIi2;
        iIiiiiiIIi iIiiiiiIIi7 = iIiiiiiIIi2;
        iIiiiiiIIi6.iiiIiIiiII.addAll(iIiiiiiIIi7.IiiiiIIiII.keySet());
        iIiiiiiIIi6.info("\u5171\u5206\u7c7b\u51fa " + iIiiiiiIIi7.iiiIiIiiII.size() + " \u4e2a\u7c7b\u522b\uff1a" + String.join((CharSequence)iiIIiiiIIi.ALLATORIxDEMO("_\u000f"), iIiiiiiIIi2.iiiIiIiiII), new Object[3 >> 2]);
        iIiiiiiIIi2.IIiIiIiIiI();
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractBlockEvent interactBlockEvent) {
        void iIiIiIIIII2;
        iIiiiiiIIi iIiiiiiIIi2 = iIiiiiiIIi3;
        if (iIiiiiiIIi2.IiiIiIiiIi != ItemSorterModule.ProcessingState.iIIIiiiiIi) {
            return;
        }
        iIiiiiiIIi iIiiiiiIIi3 = iIiIiIIIII2.result.method_17777();
        iIiiiiiIIi iIiiiiiIIi4 = iIiiiiiIIi2;
        class_2248 class_22482 = iIiiiiiIIi4.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiiiiiIIi3).method_26204();
        if (iIiiiiiIIi4.ALLATORIxDEMO(class_22482)) {
            iIiiiiiIIi2.ALLATORIxDEMO((class_2338)iIiiiiiIIi3, class_22482);
            iIiIiIIIII2.cancel();
        }
    }

    public iIiiiiiIIi() {
        iIiiiiiIIi iIiiiiiIIi2 = this;
        super(iIiIiIIIii.ALLATORIxDEMO, iiIIiiiIIi.ALLATORIxDEMO("1`\u0007\u5167\u723a\u54ce\u5275\u7c54"), IIiIIIIIii.ALLATORIxDEMO("\u81a2\u52e2\u651c\u746c\u54c4\u526c\u7c33\u7bdb\u5b18\u4e47\u76cc\u7203\u5489\u3048\u7c13\u4f76\u94b4\u50ea\u5169"));
        iIiiiiiIIi2.iIIIIIiiII = iIiiiiiIIi2.settings.getDefaultGroup();
        iIiiiiiIIi2.ALLATORIxDEMO = iIiiiiiIIi2.settings.createGroup(iiIIiiiIIi.ALLATORIxDEMO("\u7be2\u5b5f\u913e\u7f41"));
        iIiiiiiIIi2.iiiIIiIIii = iIiiiiiIIi2.settings.createGroup(IIiIIIIIii.ALLATORIxDEMO("\u524c\u7c13\u8bd4\u7f26"));
        iIiiiiiIIi2.iIiiiiIIII = iIiiiiiIIi2.settings.createGroup(iiIIiiiIIi.ALLATORIxDEMO("\u65a5\u95fb\u63d4\u5219"));
        iIiiiiiIIi2.iIiIIiIIIi = iIiiiiiIIi2.iIIIIIiiII.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u5465\u7540\u5f5f\u5b94\u6a4b\u5f47"))).description(iiIIiiiIIi.ALLATORIxDEMO("\u545b\u7500\u5f21\u5b94\u6a52\u5f20\uff5f\u9015\u8fb4\u4e8b\u4ee1\u7b9e\u5b23\u674a\u8199\u5287\u913e\u7f41\u6ec3\u7bbe\u5b03\u5218\u881b\u302d"))).defaultValue((Object)IIiIIIIIii.ALLATORIxDEMO("\u7c33\u4f51\u9493\u50ea\u5169\u3075\u9755\u89bc\u51d9\u5967\u4e42\u4e46\u6258\u806b\u5956\u4e07\u674d\u720d\u7bf7\uff66\u4e48\u4e5d\u5972\u57e0\u7bf8\u5b26\u4e87\u5ef2\uff4f\u7b9c\u5b5f\u91a2\u7515\u4e6a\u4e62\u7201\u548b\u6260\u8051\u7537\u7a36\u3068h*\u0005\"\u4e9a\u676f\u7266\u7bd3\u5396\u720e\uff49\u7151\u544b\u8186\u52e6\u6471\u7d6d\u5445\u56fb\u76ee\u7bf9\u5b1a\uff64\u8180\u52e0\u6554\u5278\u5462\u904a\u76ee\u7bf9\u5b3a\u9184\u625c\u806d\u7a30\u7bd9\u5b3a\u304a"))).build());
        this.IIIIiiIiii = this.iIIIIIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u547c\u7527\u5f46\u5bf3\u6a52\u5f20"))).description(IIiIIIIIii.ALLATORIxDEMO("\u5442\u7567\u5f38\u5bf3\u6a4b\u5f47\uff46\u9072\u8fad\u4eec\u4ef8\u7bf9\u5b3a\u672d\u8180\u52e0\u9127\u7f26\u6eda\u7bd9\u5b1a\u527f\u8802\u304a"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiIiiiIi = this.iIIIIIiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u7be2\u5b5f\u644f\u7d2d\u5339\u5fab"))).description(IIiIIIIIii.ALLATORIxDEMO("\u6476\u7d6a\u962e\u8f99\u7bdb\u5b18\u76ee\u5302\u5fee\u834b\u56be\uff60\u65f3\u573f\uff63\u304a"))).defaultValue((Object)(0x2C & 0x73))).min(0x7E & 9).max(0x54EB & 0x2BDC).sliderMin(0x7F & 8).sliderMax(0xCCC & 0x73FB).build());
        int n = 2 & 5;
        this.IiIiIiIIii = this.iIIIIIiiII.add((Setting)((BlockPosSetting.Builder)((BlockPosSetting.Builder)((BlockPosSetting.Builder)new BlockPosSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u4e7e\u5fcc\u5723\u6828"))).description(IIiIIIIIii.ALLATORIxDEMO("\u653e\u746e\u7c91\u7e97\u76ee\u4e65\u5fa9\u5718\u686d\uff44\u7542\u4ec6\u8f9e\u56b6\u54c6\u5b94\u8240\u304a"))).defaultValue((Object)new class_2338(n, 5 >> 3, n))).build());
        this.iiiiIiiIIi = this.ALLATORIxDEMO.add((Setting)((StringListSetting.Builder)((StringListSetting.Builder)((StringListSetting.Builder)new StringListSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u6e9f\u7be2\u5b5f\u5264\u8847"))).description(IIiIIIIIii.ALLATORIxDEMO("\u4ea3\u8f96\u4eb6\u7bbe\u5b3a\u4e65\u539c\u5192\u7203\u5489\u8fb1\u8804\u526c\u7c33\u3068\u6567\u636b\u6db3\u52ea\u5972\u4e60\u7bd9\u5b3a\u304a"))).defaultValue(new ArrayList())).build());
        this.IIiiiiIIii = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u7f40\u5b57\u66a7\u65bf\u9587\u96bb"))).description(IIiIIIIIii.ALLATORIxDEMO("\u7bf9\u5b3a\u7f5b\u5b32\u66bc\u65da\u76cc\u659c\u95bc\u95be\u96fc\uff42\u79ba\uff63\u304a"))).defaultValue((Object)(0x167F & 0x6BD8))).min(--5).sliderMin(--5).sliderMax(0x3771 & 0x5FFE).build());
        this.IiiiiIiIiI = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u6629\u80f2\u5275\u7c54"))).description(IIiIIIIIii.ALLATORIxDEMO("\u5445\u7560\u5790\u4ec6\u7203\u5489\u5c34\u606f\u76ce\u6612\u80b7\u526e\u7c11\u304a"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiIIIiIIIi = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u545b\u5e79\u98cf\u827d\u53ab\u79e2"))).description(IIiIIIIIii.ALLATORIxDEMO("\u5c61\u5449\u7c17\u7227\u54ac\u76cb\u4e20\u5403\u98f6\u823a\u7202\u6744\u526c\u7c33\u525a\u4e48\u8d1d\uff40\u59e8\u7fc2\u6bb1\u3049\u6dbd\u51b5\u5755\u7b21\uff63\u304a"))).defaultValue((Object)(5 >> 2))).build());
        this.iiiIiiIIII = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u5255\u79b4\u9617\u9b5b\u721a\u54ee"))).description(IIiIIIIIii.ALLATORIxDEMO("\u5c6c\u960c\u9b3e\u7221\u54ab\u531d\u72a6\u526e\u7c31\u5b30\u50c2\u304a"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IIiIiiiiII = this.iiiIIiIIii.add((Setting)((IIIIiiiiii)((Object)((IIIIiiiiii)((Object)new IIIIiiiiii().name(iiIIiiiIIi.ALLATORIxDEMO("\u81e5\u5bc9\u4e46\u5275\u7c54")))).description(IIiIIIIIii.ALLATORIxDEMO("\u4f50\u5102\u4f17\u7542\u8f91\u91a6\u76cc\u526c\u7c33\uff66\u6ce9\u6214\u5278\u5253\u8182\u625a\u4e68\u7c11\u304a")))).ALLATORIxDEMO(IiIiiiIiiI.ALLATORIxDEMO).ALLATORIxDEMO());
        this.iIIiiIiIiI = this.iiiIIiIIii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u8be3\u5fc9\u7f60\u5b77"))).description(IIiIIIIIii.ALLATORIxDEMO("\u8bfa\u5fae\u7f79\u5b10"))).defaultValue((Object)iiIIiiiIIi.ALLATORIxDEMO("\bR"))).visible(() -> (3 & 4) != 0)).build());
        this.iIIiIiiIiI = this.iIiiiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u594e\u746e\u959e\u96dc"))).description(iiIIiiiIIi.ALLATORIxDEMO("\u6bb4\u8f49\u7217\u54e3\u650a\u7424\u4e3e\u95dd\u76f0\u65de\u95c0\u959c\u96e7\uff27'f\u0010D\uff7f\u001dC[\u001aL\u0018\u000fn/b\u79dd\uff7a\u302d"))).defaultValue((Object)(0x437A & 0x3EDD))).min(0x7D & 0x66).max(0x377F & 0x5FF0).sliderMin(0x76 & 0x6D).sliderMax(0x7770 & 0x1FFF).build());
        this.iiiiiIIiIi = this.iIiiiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u7bd9\u5b1a\u959c\u5e9c\u8f97"))).description(iiIIiiiIIi.ALLATORIxDEMO("\u5977\u7429\u7bc2\u5b7f\u4e38\u95db\u76f7\u5ed9\u8fac\u65d9\u95a7\uff07\u6bb8\u79dd\uff7a\u302d"))).defaultValue((Object)(0x7D & 0x66))).min(0x77 & 0x3A).max(0x17D9 & 0x6FF6).sliderMin(0x73 & 0x3E).sliderMax(0x57D2 & 0x2FFD).build());
        this.iiiIiIIiii = this.iIiiiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u526e\u7c31\u959c\u5e9c\u8f97"))).description(iiIIiiiIIi.ALLATORIxDEMO("\u5b2b\u5087\u4e5e\u5403\u5275\u7c54\u721a\u54ee\u4e38\u95db\u76f7\u5ed9\u8fac\u65d9\u95a7\uff07\u6bb8\u79dd\uff7a\u302d"))).defaultValue((Object)(0x29F6 & 0x57FD))).min(0x6D & 0x76).max(0x7FBE & 0xBF9).sliderMin(0x6D & 0x76).sliderMax(0x2FFF & 0x5BB8).build());
        this.iIIIiiiiIi = this.iIiiiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u8f06\u6b6b\u959c\u5e9c\u8f97"))).description(iiIIiiiIIi.ALLATORIxDEMO("\u5bf8\u6238\u4e34\u8f06\u6507\u7429\u545d\uff03\u5f73\u59e4\u4e78\u4e2f\u8f1d\u5262\u76f7\u7b66\u5ff6\u65d9\u95a7\uff07\u6bb8\u79dd\uff7a\u302d"))).defaultValue((Object)(0x77DF & 0xFF0))).min(0x65 & 0x7E).max(60000).sliderMin(0x77 & 0x6C).sliderMax(60000).build());
        this.iIiIiIIIII = this.iIiiiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u72fc\u6069\u8def\u65be"))).description(iiIIiiiIIi.ALLATORIxDEMO("\u537d\u4e1e\u72de\u6072\u76ab\u6753\u5928\u6214\u8863\u6585\u95db\uff7b\u79fd\uff7a\uff23\u8df6\u65d9\u545d\u81e5\u52fb\u91c2\u7f1d\u302d"))).defaultValue((Object)(0x79 & 0x7E))).min(0x1E & 0x7F).max(0x1DEC & 0x633F).sliderMin(0x7E & 0x1F).sliderMax(0x257F & 0x5BAC).build());
        iIiiiiiIIi iIiiiiiIIi3 = this;
        iIiiiiiIIi iIiiiiiIIi4 = this;
        iIiiiiiIIi iIiiiiiIIi5 = this;
        iIiiiiiIIi iIiiiiiIIi6 = this;
        this.IiiIiIiiIi = ItemSorterModule.ProcessingState.iIiiiIiIii;
        iIiiiiiIIi iIiiiiiIIi7 = this;
        iIiiiiiIIi7.IIiiIIIIIi = new ArrayList<iiIiiiIiii>();
        iIiiiiiIIi6.iIIiIiiiII = 2 & 5;
        iIiiiiiIIi6.iIIIIiiiii = 0L;
        iIiiiiiIIi5.iIIiiiiIii = 0L;
        iIiiiiiIIi5.iIIiiIIIIi = 0L;
        iIiiiiiIIi4.IIiIiIIiii = 0L;
        iIiiiiiIIi4.iIiiiIiIii = null;
        iIiiiiiIIi iIiiiiiIIi8 = this;
        iIiiiiiIIi4.IiiiiIIiII = new ConcurrentHashMap<String, List<class_1799>>();
        iIiiiiiIIi iIiiiiiIIi9 = this;
        iIiiiiiIIi8.iiiIiIiiII = new ArrayList<String>();
        iIiiiiiIIi3.iiIiIIiiii = 3 ^ 3;
        iIiiiiiIIi3.iIiIiiiiII = "";
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiIIIIIii.ALLATORIxDEMO("=#Hn\u0019-j\u001d\u001a,\u000b<\u000fiJ\u8bbf\u669e\u65f8\u527a\u6768\u65fa\u7220\u6746\uff49"));
        }
    }

    private /* synthetic */ boolean iiIIiIIiii() {
        iIiiiiiIIi iIiiiiiIIi2 = iIiiiiiIIi3;
        if (iIiiiiiIIi2.iIIiiIiIiI.field_1724 == null) {
            return 3 >> 2;
        }
        iIiiiiiIIi iIiiiiiIIi3 = (class_2338)iIiiiiiIIi2.IiIiIiIIii.get();
        return iIiiiiiIIi2.iIIiiIiIiI.field_1724.method_24515().method_19771((class_2382)new class_2338((int)((double)iIiiiiiIIi3.method_10263() + 0.5), (int)((double)iIiiiiiIIi3.method_10264() + 0.5), (int)((double)iIiiiiiIIi3.method_10260() + 0.5)), 200.0);
    }

    private /* synthetic */ void iIIiIiIiii() {
        iIiiiiiIIi iIiiiiiIIi2 = this;
        iIiiiiiIIi2.info("\u6240\u6709\u7269\u54c1\u5206\u7c7b\u5b8c\u6210\uff0c\u7b49\u5f85 " + (Integer)iIiiiiiIIi2.iIIIiiiiIi.get() / (0x7BFA & 0x7ED) + " \u79d2\u540e\u5f00\u59cb\u4e0b\u4e00\u8f6e", new Object[5 >> 3]);
        this.IIiIiIIiii = System.currentTimeMillis() + (long)((Integer)this.iIIIiiiiIi.get()).intValue();
        this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIiiIIIIIi);
    }

    private /* synthetic */ void IIiiIIiiIi() {
        iIiiiiiIIi iIiiiiiIIi2 = list;
        if (!((Boolean)iIiiiiiIIi2.IIIIiiIiii.get()).booleanValue()) {
            iIiiiiiIIi iIiiiiiIIi3;
            iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u5f66\u5bd3\u6a52\u5f20\u5d81\u515c\u95be\uff03\u8f88\u516a\u72c5\u602e"), new Object[3 >> 2]);
            List list = (List)iIiiiiiIIi2.iiiiIiiIIi.get();
            if (list != null && !list.isEmpty()) {
                iIiiiiiIIi2.info("\u5df2\u914d\u7f6e " + list.size() + " \u4e2a\u6e90\u7bb1\u5b50", new Object[3 & 4]);
                iIiiiiiIIi2.info(IIiIIIIIii.ALLATORIxDEMO("\u598d\u9762\u6dbb\u52c7\u66b1\u597d\u7bf4\u5b3c\uff42\u8b9a\u7ea8\u7ec0\u4eab\u4ef8\uff53\u59c8\u9768\u5f6a\u5983\u651e\u744e\uff66\u8bbf\u5742\u8bf6\u7f04\u4e65\u5139\u9585\u5f5f\u5b94\u6a4b\u5f47"), new Object[5 >> 3]);
                iIiiiiiIIi3 = iIiiiiiIIi2;
            } else {
                iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u8b84\u53dc\u955d\u7096\u5188\u7b9e\u5b23\u674a\u6d88\u528f\u5263\u6e9f\u7be2\u5b5f\u5264\u8847"), new Object[3 & 4]);
                iIiiiiiIIi3 = iIiiiiiIIi2;
            }
            iIiiiiiIIi3.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIiiiIiIii);
            return;
        }
    }

    public static void iIIIIIIiiI() {
        Settings settings = BaritoneAPI.getSettings();
        settings.allowBreak.value = 3 >> 2;
        settings.allowPlace.value = (3 & 4) != 0;
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        boolean bl;
        try {
            Thread.sleep(100L);
            bl = true;
        }
        catch (InterruptedException interruptedException) {
            return (2 ^ 3) != 0;
        }
        return bl;
    }

    private /* synthetic */ void ALLATORIxDEMO(ItemSorterModule.ProcessingState processingState) {
        iIiiiiiIIi iIiIiIIIII2;
        iIiiiiiIIi iIiiiiiIIi2 = object;
        Object object = processingState;
        iIiiiiiIIi iIiiiiiIIi3 = iIiIiIIIII2 = iIiiiiiIIi2;
        iIiiiiiIIi3.info("\u72b6\u6001\u53d8\u66f4\uff1a" + String.valueOf((Object)iIiiiiiIIi3.IiiIiIiiIi) + " \u2192 " + String.valueOf(object), new Object[3 >> 2]);
        iIiiiiiIIi iIiiiiiIIi4 = iIiIiIIIII2;
        iIiiiiiIIi4.IiiIiIiiIi = object;
        iIiiiiiIIi4.iIIIIiiiii = System.currentTimeMillis();
    }

    @Override
    public void onActivate() {
        iIiiiiiIIi iIiiiiiIIi2 = this;
        this.iIIIIIIiII = new IiIiIiIiII((Map)this.IIiIiiiiII.get(), (Boolean)this.IiiiiIiIiI.get());
        iIiiiiiIIi iIiiiiiIIi3 = this;
        this.IiiIIiIIiI = new IiIiiiIIII(this.ALLATORIxDEMO(), (Integer)this.iIIiIiiiIi.get(), this.iIIIIIIiII);
        this.info(iiIIiiiIIi.ALLATORIxDEMO("\u7246\u54b2\u655b\u7455\u6a2e\u5704\u5dfd\u545c\u5287"), new Object[3 ^ 3]);
        this.IiiiiiiIIi();
    }

    private /* synthetic */ void IiIIIiiiII() {
        iIiiiiiIIi iIiiiiiIIi2 = object;
        if (iIiiiiiIIi2.iIIiiIiIiI.field_1724 == null || iIiiiiiIIi2.iIIiiIiIiI.field_1724.field_7512 == null) {
            return;
        }
        Object object = iIiiiiiIIi2.iIIiiIiIiI.field_1724.field_7512;
        if (object instanceof class_1707) {
            class_1707 class_17072 = (class_1707)object;
            iIiiiiiIIi iIiiiiiIIi3 = iIiiiiiIIi2;
            object = iIiiiiiIIi3.iiiIiIiiII.get(iIiiiiiIIi3.iiIiIIiiii);
            iIiiiiiIIi2.info("\u76ee\u6807\u5bb9\u5668\u5df2\u6253\u5f00\uff0c\u5bb9\u5668\u5927\u5c0f\uff1a" + class_17072.method_7629().method_5439() + "\uff0c\u5f00\u59cb\u5b58\u50a8\u5206\u7c7b\uff1a" + (String)object, new Object[3 & 4]);
            if (iIiiiiiIIi2.iIiiiIiIii != null) {
                iIiiiiiIIi iIiiiiiIIi4 = iIiiiiiIIi2;
                if (iIiiiiiIIi4.IiiIIiIIiI.ALLATORIxDEMO(iIiiiiiIIi4.iIiiiIiIii.method_10263(), iIiiiiiIIi2.iIiiiIiIii.method_10264(), iIiiiiiIIi2.iIiiiIiIii.method_10260(), class_17072, (String)object)) {
                    iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u7bc2\u5b7f\u4e7e\u902d\u547b\u5b77\u50db\u5f7c\u521e\u5209\u7c28\uff03\u8d80\u8fe8"), new Object[5 >> 3]);
                    iIiiiiiIIi iIiiiiiIIi5 = iIiiiiiIIi2;
                    iIiiiiiIIi5.iIIiiIiIiI.field_1724.method_7346();
                    iIiiiiiIIi5.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiIiIIiii);
                    return;
                }
            }
            iIiiiiiIIi iIiiiiiIIi6 = iIiiiiiIIi2;
            iIiiiiiIIi6.ALLATORIxDEMO(class_17072, (String)object);
            iIiiiiiIIi6.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiiiIIiIi);
        }
    }

    private /* synthetic */ void iIIIIIIIIi() {
        this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIiiiIiIii);
    }

    public void onDeactivate() {
        this.info(IIiIIIIIii.ALLATORIxDEMO("\u7221\u54ab\u653c\u744c\u6a49\u571d\u5d9a\u5036\u7560"), new Object[3 & 4]);
        this.IiiiiiiIIi();
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        iIiiiiiIIi iIiiiiiIIi2 = iIiiiiiIIi3;
        iIiiiiiIIi iIiiiiiIIi3 = class_23382;
        iIiiiiiIIi iIiIiIIIII2 = iIiiiiiIIi2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1761 == null || iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiiiiiIIi3, class_2350.field_11036, (4 ^ 5) != 0, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iIiiiiiIIi iIiiiiiIIi2;
        iIiiiiiIIi iIiiiiiIIi3 = this;
        iIiiiiiIIi3.info("\u91cd\u7f6e\u7269\u54c1\u6574\u7406\u72b6\u6001\u673a\uff08\u5f53\u524d\u72b6\u6001\uff1a" + String.valueOf((Object)iIiiiiiIIi3.IiiIiIiiIi) + "\uff09", new Object[3 >> 2]);
        iIiiiiiIIi iIiiiiiIIi4 = this;
        if (((Boolean)this.IIIIiiIiii.get()).booleanValue()) {
            iIiiiiiIIi4.IiiIiIiiIi = ItemSorterModule.ProcessingState.iIIIiiiiIi;
            this.info(IIiIIIIIii.ALLATORIxDEMO("\u8ff6\u516a\u5f7f\u5bb4\u6a6b\u5f67\uff66\u8bbf\u9070\u8f8f\u4ece\u4eda\u7bdb\u5b18\u670f\u9105\u7f24\u6ef8\u7bfb\u5b38\u527d\u8820"), new Object[2 & 5]);
            iIiiiiiIIi2 = this;
        } else {
            iIiiiiiIIi4.IiiIiIiiIi = ItemSorterModule.ProcessingState.iIiiiIiIii;
            iIiiiiiIIi2 = this;
        }
        iIiiiiiIIi2.IIiiIIIIIi.clear();
        iIiiiiiIIi iIiiiiiIIi5 = this;
        iIiiiiiIIi iIiiiiiIIi6 = this;
        iIiiiiiIIi6.iIIiIiiiII = 3 >> 2;
        iIiiiiiIIi6.IiiiiIIiII.clear();
        iIiiiiiIIi6.iiiIiIiiII.clear();
        iIiiiiiIIi5.iiIiIIiiii = 2 & 5;
        iIiiiiiIIi5.iIIiiIIIIi = 0L;
        this.IIiIiIIiii = 0L;
        this.iIiiiIiIii = null;
        if (this.iIIiiIiIiI.field_1724 != null && this.iIIiiIiIiI.field_1724.field_7512 instanceof class_1707) {
            this.iIIiiIiIiI.field_1724.method_7346();
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        iIiiiiiIIi iIiiiiiIIi2 = iIiiiiiIIi3;
        iIiiiiiIIi iIiiiiiIIi3 = class_22482;
        iIiiiiiIIi iIiIiIIIII2 = iIiiiiiIIi2;
        if (iIiiiiiIIi3 instanceof class_2281 || iIiiiiiIIi3 instanceof class_2480 || iIiiiiiIIi3 instanceof class_3708 || iIiiiiiIIi3 instanceof class_2336 || iIiiiiiIIi3 instanceof class_2531) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void iIIiIiiiII() {
        if (System.currentTimeMillis() >= this.iIIiiIIIIi) {
            this.iIiIiiiiii();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIiiiiiIIi iIiiiiiIIi2 = iIiiiiiIIi3;
        iIiiiiiIIi iIiiiiiIIi3 = post;
        iIiiiiiIIi iIiIiIIIII2 = iIiiiiiIIi2;
        if (!iIiIiIIIII2.iiIIiIIiii()) {
            return;
        }
        iIiiiiiIIi iIiiiiiIIi4 = iIiIiIIIII2;
        iIiiiiiIIi4.IiiIIiIIiI.iiIIiIIiii();
        if (iIiiiiiIIi4.IiiIiIiiIi != ItemSorterModule.ProcessingState.iIIIiiiiIi && iIiIiIIIII2.IiiIiIiiIi != ItemSorterModule.ProcessingState.iIiiiIiIii && System.currentTimeMillis() - iIiIiIIIII2.iIIIIiiiii > (long)((Integer)iIiIiIIIII2.iIiIiIIIII.get()).intValue() * 1000L) {
            iIiiiiiIIi iIiiiiiIIi5 = iIiIiIIIII2;
            iIiiiiiIIi5.error("\u72b6\u6001 " + String.valueOf((Object)iIiiiiiIIi5.IiiIiIiiIi) + " \u8d85\u65f6\uff0c\u6b63\u5728\u91cd\u7f6e...", new Object[2 & 5]);
            iIiIiIIIII2.IiiiiiiIIi();
            return;
        }
        switch (iIiIiIIIII2.IiiIiIiiIi.ordinal()) {
            case 0: {
                iIiIiIIIII2.IIiiIIiiIi();
                return;
            }
            case 1: {
                iIiIiIIIII2.iiiIiIiiIi();
                return;
            }
            case 2: {
                iIiIiIIIII2.iIIIIIIIIi();
                return;
            }
            case 3: {
                iIiIiIIIII2.ALLATORIxDEMO();
                return;
            }
            case 4: {
                iIiIiIIIII2.IIIIiIiiii();
                return;
            }
            case 5: {
                iIiIiIIIII2.IIIIiIIiII();
                return;
            }
            case 6: {
                iIiIiIIIII2.iIiIiIiIii();
                return;
            }
            case 7: {
                iIiIiIIIII2.iIIiIiiiII();
                return;
            }
            case 8: {
                iIiIiIIIII2.IIiiiIiiIi();
                return;
            }
            case 9: {
                iIiIiIIIII2.iiIIIIIIIi();
                return;
            }
            case 10: {
                iIiIiIIIII2.IiIIIiiiII();
                return;
            }
            case 11: {
                iIiIiIIIII2.iiiIiIiIII();
                return;
            }
            case 12: {
                iIiIiIIIII2.iiiiIIIiII();
                return;
            }
            case 13: {
                iIiIiIIIII2.IIIIiIIIII();
                return;
            }
            case 14: {
                iIiIiIIIII2.iIIiIiIiii();
                return;
            }
            case 15: {
                iIiIiIIIII2.IIiIiIiiii();
                return;
            }
        }
    }

    private /* synthetic */ void IiiIIiIIIi() {
        iIiiiiiIIi iIiiiiiIIi2 = this;
        iIiiiiiIIi2.iIIiIiiiII += 5 >> 2;
        if (iIiiiiiIIi2.iIIiIiiiII >= this.IIiiIIIIIi.size()) {
            this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIiIiIIIII);
            return;
        }
        this.iIIiiIIIIi = System.currentTimeMillis() + (long)((Integer)this.iiiiiIIiIi.get()).intValue();
        this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIiIIiIIIi);
    }

    private /* synthetic */ List<iiIiiiIiii> ALLATORIxDEMO() {
        return ((List)this.iiiiIiiIIi.get()).stream().map(iIiIiIIIII2 -> iiIiiiIiii.ALLATORIxDEMO(iIiIiIIIII2)).filter(iIiIiIIIII2 -> {
            if (iIiIiIIIII2 != null) {
                return (4 ^ 5) != 0;
            }
            return false;
        }).toList();
    }

    private /* synthetic */ void IIIIiIIIII() {
        if (System.currentTimeMillis() >= this.iIIiiIIIIi) {
            this.IIiIiIiIiI();
        }
    }

    private /* synthetic */ void IIIIiIiiii() {
        iIiiiiiIIi iIiiiiiIIi2 = iIiiiiiIIi3;
        if (iIiiiiiIIi2.iIIiiIiIiI.field_1724 == null || iIiiiiiIIi2.iIIiiIiIiI.field_1724.field_7512 == null) {
            return;
        }
        class_1703 class_17032 = iIiiiiiIIi2.iIIiiIiIiI.field_1724.field_7512;
        if (class_17032 instanceof class_1707) {
            iIiiiiiIIi iIiiiiiIIi3 = (class_1707)class_17032;
            iIiiiiiIIi2.info("\u6e90\u7bb1\u5b50\u5df2\u6253\u5f00\uff0c\u5bb9\u5668\u5927\u5c0f\uff1a" + iIiiiiiIIi3.method_7629().method_5439(), new Object[2 & 5]);
            iIiiiiiIIi iIiiiiiIIi4 = iIiiiiiIIi2;
            iIiiiiiIIi4.ALLATORIxDEMO((class_1707)iIiiiiiIIi3);
            iIiiiiiIIi4.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIIIiiIiii);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2248 class_22482) {
        void iIiIiIIIII2;
        String iIiIiIIIII3;
        iIiiiiiIIi iIiiiiiIIi2 = arrayList;
        String string = iiIiiiIiii.ALLATORIxDEMO((class_2338)iIiIiIIIII3).ALLATORIxDEMO();
        ArrayList arrayList = new ArrayList((Collection)iIiiiiiIIi2.iiiiIiiIIi.get());
        if (arrayList.contains(string)) {
            iIiiiiiIIi2.info("\u7bb1\u5b50 " + String.valueOf(iIiIiIIIII3) + " \u5df2\u5728\u6e90\u7bb1\u5b50\u5217\u8868\u4e2d", new Object[5 >> 3]);
            return;
        }
        arrayList.add(string);
        iIiiiiiIIi2.iiiiIiiIIi.set((Object)arrayList);
        iIiIiIIIII3 = iIiIiIIIII2.method_9518().getString();
        iIiiiiiIIi2.info("\u5df2\u6dfb\u52a0 " + iIiIiIIIII3 + " \u5230\u6e90\u7bb1\u5b50\u5217\u8868\uff1a" + string, new Object[5 >> 3]);
        iIiiiiiIIi2.info("\u5f53\u524d\u6e90\u7bb1\u5b50\u6570\u91cf\uff1a" + arrayList.size(), new Object[3 ^ 3]);
        if (arrayList.size() >= (4 ^ 5)) {
            iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u5dda\u9179\u7f06\u6ee3\u7b9e\u5b03\uff03\u539c\u4eca\u575b\u8b91\u7f1d\u4e02\u5100\u95c2\u5f66\u5bd3\u6a72\u5f00\u5f53\u59c4\u6507\u7429"), new Object[2 & 5]);
            iIiiiiiIIi2.info(IIiIIIIIii.ALLATORIxDEMO("\u627c\u7eaf\u7e87\u6db3\u52ea\u669c\u5950\u6ef8\u7bdb\u5b18"), new Object[3 >> 2]);
        }
    }

    private /* synthetic */ void iiiIiIiIII() {
        Object object = string;
        if (((iIiiiiiIIi)object).iiiIiIiiIi()) {
            iIiiiiiIIi iIiiiiiIIi2 = object;
            String string = iIiiiiiIIi2.iiiIiIiiII.get(iIiiiiiIIi2.iiIiIIiiii);
            ((iIiiiiiIIi)object).info("\u5206\u7c7b " + (String)string + " \u7684\u7269\u54c1\u5b58\u50a8\u5b8c\u6210", new Object[3 ^ 3]);
            if (((iIiiiiiIIi)object).iIIiiIiIiI.field_1724 != null) {
                ((iIiiiiiIIi)object).iIIiiIiIiI.field_1724.method_7346();
            }
            ((iIiiiiiIIi)object).ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiIiIIiii);
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        iIiiiiiIIi iIiiiiiIIi2 = this;
        if (iIiiiiiIIi2.iIIiiIiIiI.field_1724 == null) {
            return 5 >> 3;
        }
        int n = 0;
        int n2 = this = 5 >> 3;
        while (true) {
            if (n2 >= 36) break;
            if (iIiiiiiIIi2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7960()) {
                ++n;
            }
            n2 = ++this;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1707 class_17072, String string) {
        iIiiiiiIIi iIiiiiiIIi2 = iIiiiiiIIi3;
        iIiiiiiIIi iIiiiiiIIi3 = class_17072;
        iIiiiiiIIi iIiIiIIIII2 = iIiiiiiIIi2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        int n = this = 0;
        while (true) {
            String string2;
            void iIiIiIIIII3;
            if (n >= 36) break;
            class_1799 class_17992 = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(this);
            if (!class_17992.method_7960() && iIiIiIIIII3.equals(string2 = iIiIiIIIII2.iIIIIIIiII.iiiIiIiiIi(class_17992))) {
                iIiIiIIIII2.info("\u5b58\u50a8\u7269\u54c1\uff1a" + class_17992.method_7964().getString() + " \u5230\u5206\u7c7b\uff1a" + (String)iIiIiIIIII3, new Object[2 & 5]);
                InvUtils.shiftClick().slot(this);
            }
            n = ++this;
        }
    }

    private /* synthetic */ void IIIIIIIiII() {
        iIiiiiiIIi iIiiiiiIIi2 = this;
        iIiiiiiIIi2.iiIiIIiiii += 3 >> 1;
        if (iIiiiiiIIi2.iiIiIIiiii >= this.iiiIiIiiII.size()) {
            this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIiIiIIiii);
            return;
        }
        this.iIIiiIIIIi = System.currentTimeMillis() + (long)((Integer)this.iiiIiIIiii.get()).intValue();
        this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIIiIiiiIi);
    }

    private /* synthetic */ void IIiIiIiiii() {
        if (System.currentTimeMillis() >= this.IIiIiIIiii) {
            this.info(iiIIiiiIIi.ALLATORIxDEMO("\u7b66\u5ff6\u7efc\u672c\uff23\u91be\u7f41\u72c5\u602e\u6769\u51c9\u5954\u4e04\u4e73\u8f41"), new Object[5 >> 3]);
            this.IiiiiiiIIi();
        }
    }

    private /* synthetic */ void iIiIiiiiii() {
        iIiiiiiIIi iIiiiiiIIi2;
        iIiiiiiIIi iIiiiiiIIi3 = iIiiiiiIIi2 = iIiiiiiIIi5;
        if (iIiiiiiIIi3.iIIiIiiiII >= iIiiiiiIIi3.IIiiIIIIIi.size()) {
            iIiiiiiIIi2.info(IIiIIIIIii.ALLATORIxDEMO("\u622a\u6741\u6efa\u7bf9\u5b3a\u594c\u746c\u5bc4\u627a\uff44\u5f4a\u59a3\u7223\u54a9\u526c\u7c33"), new Object[3 & 4]);
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIiIiIIIII);
            return;
        }
        if (iIiiiiiIIi2.iIIiiIiIiI.field_1724 != null) {
            int n = iIiiiiiIIi2.ALLATORIxDEMO();
            if (n < --2) {
                iIiiiiiIIi2.info("\u73a9\u5bb6\u5e93\u5b58\u7a7a\u95f4\u4e0d\u8db3\uff08\u5269\u4f59" + n + "\u4e2a\u7a7a\u4f4d\uff09\uff0c\u9700\u8981\u5148\u6574\u7406\u5e93\u5b58", new Object[3 ^ 3]);
                iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIiIiIIIII);
                return;
            }
            iIiiiiiIIi2.info("\u73a9\u5bb6\u5e93\u5b58\u5269\u4f59" + n + "\u4e2a\u7a7a\u4f4d\uff0c\u7ee7\u7eed\u5904\u7406\u6e90\u7bb1\u5b50", new Object[3 ^ 3]);
        }
        iIiiiiiIIi iIiiiiiIIi4 = iIiiiiiIIi2;
        iIiiiiiIIi iIiiiiiIIi5 = iIiiiiiIIi4.IIiiIIIIIi.get(iIiiiiiIIi4.iIIiIiiiII).ALLATORIxDEMO();
        iIiiiiiIIi iIiiiiiIIi6 = iIiiiiiIIi2;
        iIiiiiiIIi6.info("\u5904\u7406\u7bb1\u5b50 " + (iIiiiiiIIi2.iIIiIiiiII + --1) + "/" + iIiiiiiIIi6.IIiiIIIIIi.size() + " \u5750\u6807\uff1a" + iIiiiiiIIi5.method_23854(), new Object[3 >> 2]);
        if (iIiiiiiIIi2.iIIiiIiIiI.field_1724 != null && iIiiiiiIIi2.iIIiiIiIiI.field_1724.field_7512 != iIiiiiiIIi2.iIIiiIiIiI.field_1724.field_7498) {
            iIiiiiiIIi iIiiiiiIIi7 = iIiiiiiIIi2;
            iIiiiiiIIi7.iIIiiIiIiI.field_1724.method_7346();
            iIiiiiiIIi7.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIIiiIIIIi);
            return;
        }
        iIiiiiiIIi2.iIiiiIiIii = iIiiiiiIIi5;
        iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIiIiiiiII);
    }

    private /* synthetic */ void iIiIiIiIii() {
        if (this.iIIiiIiIiI.field_1724 == null || this.iIIiiIiIiI.field_1724.field_7512 == this.iIIiiIiIiI.field_1724.field_7498) {
            this.info(iiIIiiiIIi.ALLATORIxDEMO("\u6ec3\u7bbe\u5b03\u5dfd\u5100\u95c2"), new Object[3 & 4]);
            this.IiiIIiIIIi();
            return;
        }
        this.iIIiiIiIiI.field_1724.method_7346();
        this.iIIIIiiiii = System.currentTimeMillis();
        this.info(IIiIIIIIii.ALLATORIxDEMO("\u6b2b\u5762\u511b\u95a7\u6ef8\u7bdb\u5b18"), new Object[3 & 4]);
    }

    private /* synthetic */ void IIiIiIiIiI() {
        iIiiiiiIIi iIiiiiiIIi2;
        iIiiiiiIIi iIiiiiiIIi3 = iIiiiiiIIi2 = string;
        if (iIiiiiiIIi3.iiIiIIiiii >= iIiiiiiIIi3.iiiIiIiiII.size()) {
            iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u6233\u6726\u5255\u7c74\u5957\u7409\u5bff\u623f"), new Object[2 & 5]);
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIiIiIIiii);
            return;
        }
        iIiiiiiIIi iIiiiiiIIi4 = iIiiiiiIIi2;
        String string = iIiiiiiIIi4.iiiIiIiiII.get(iIiiiiiIIi4.iiIiIIiiii);
        Object object = iIiiiiiIIi2.IiiiiIIiII.get(string);
        iIiiiiiIIi iIiiiiiIIi5 = iIiiiiiIIi2;
        iIiiiiiIIi5.info("\u5904\u7406\u5206\u7c7b " + (iIiiiiiIIi2.iiIiIIiiii + (2 ^ 3)) + "/" + iIiiiiiIIi5.iiiIiIiiII.size() + "\uff1a" + (String)string + "\uff08" + object.size() + " \u4e2a\u7269\u54c1\uff09", new Object[5 >> 3]);
        object = iIiiiiiIIi2.IiiIIiIIiI.ALLATORIxDEMO(string);
        if (object == null) {
            iIiiiiiIIi2.info("\u5206\u7c7b " + (String)string + " \u627e\u4e0d\u5230\u5408\u9002\u7684\u5b58\u50a8\u7bb1\u5b50\uff0c\u8df3\u8fc7", new Object[3 ^ 3]);
            iIiiiiiIIi2.IIIIIIIiII();
            return;
        }
        iIiiiiiIIi2.info("\u4e3a\u5206\u7c7b " + (String)string + " \u627e\u5230\u76ee\u6807\u7bb1\u5b50\uff1a" + String.valueOf(object), new Object[5 >> 3]);
        iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IiiIiIiiIi);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1707 class_17072) {
        void iIiIiIIIII2;
        iIiiiiiIIi iIiiiiiIIi2 = this;
        if (iIiiiiiIIi2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        int n = iIiIiIIIII2.method_7629().method_5439();
        int n2 = this = 3 ^ 3;
        while (n2 < n) {
            if (!iIiIiIIIII2.method_7629().method_5438(this).method_7960()) {
                InvUtils.shiftClick().slotId(this);
            }
            n2 = ++this;
        }
    }

    private /* synthetic */ void iiiiIIIiII() {
        if (this.iIIiiIiIiI.field_1724 == null || this.iIIiiIiIiI.field_1724.field_7512 == this.iIIiiIiIiI.field_1724.field_7498) {
            this.info(IIiIIIIIii.ALLATORIxDEMO("\u76a6\u684d\u7bd9\u5b1a\u5d9a\u5119\u95a5"), new Object[5 >> 3]);
            this.IIIIIIIiII();
        }
    }

    private /* synthetic */ void IIIIiIIiII() {
        int n;
        iIiiiiiIIi iIiiiiiIIi2;
        block12: {
            int this222;
            int n2;
            int n3;
            iIiiiiiIIi2 = iIiiiiiIIi3;
            iIiiiiiIIi iIiiiiiIIi3 = iIiiiiiIIi2.iIIiiIiIiI.field_1724.field_7512;
            if (!(iIiiiiiIIi3 instanceof class_1707)) {
                iIiiiiiIIi2.info(IIiIIIIIii.ALLATORIxDEMO("\u5bf1\u5602\u5dba\u5119\u95a5\uff66\u7eaf\u7e87\u594c\u744c\u4e63\u4e4a\u4e42\u7bdb\u5b18"), new Object[5 >> 3]);
                iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIIiiIIIIi);
                return;
            }
            class_1707 class_17072 = (class_1707)iIiiiiiIIi3;
            int this222 = 1;
            int n4 = 3 & 4;
            int n5 = n3 = 3 >> 2;
            while (n5 < class_17072.method_7629().method_5439()) {
                class_1799 class_17992 = class_17072.method_7629().method_5438(n3);
                if (!class_17992.method_7960()) {
                    this222 = 5 >> 3;
                    n4 += class_17992.method_7947();
                }
                n5 = ++n3;
            }
            if (this222 != 0) {
                iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u5bca\u5647\u5d81\u7a55\uff7f\u515e\u63a3\u53f9\u4ed5\u4e44\u521e\u768b\u721a\u54ee"), new Object[5 >> 3]);
                iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIIiiIIIIi);
                return;
            }
            n3 = 0;
            int n6 = n2 = 2 & 5;
            while (n6 < class_17072.method_7629().method_5439()) {
                class_1799 this222 = class_17072.method_7629().method_5438(n2);
                if (!this222.method_7960()) {
                    if (iIiiiiiIIi2.iIIiiIiIiI.field_1724.method_31548().method_7376() == -4 >> 2) {
                        iIiiiiiIIi2.info(IIiIIIIIii.ALLATORIxDEMO("\u73e1\u5bdc\u5edb\u5b32\u5dba\u6e8b\uff44\u658a\u6c9d\u7ead\u7e85\u639a\u53be\u7203\u5489"), new Object[3 >> 2]);
                        iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIIiiIIIIi);
                        return;
                    }
                    InvUtils.shiftClick().slotId(n2);
                    n3 += this222.method_7947();
                }
                n6 = ++n2;
            }
            if (n3 > 0) {
                iIiiiiiIIi2.info("\u672c\u6b21\u63d0\u53d6\u4e86 " + n3 + " \u4e2a\u7269\u54c1", new Object[2 & 5]);
            }
            n2 = 1;
            int n7 = this222 = 3 ^ 3;
            while (n7 < class_17072.method_7629().method_5439()) {
                if (!class_17072.method_7629().method_5438(this222).method_7960()) {
                    n = n2 = 3 & 4;
                    break block12;
                }
                n7 = ++this222;
            }
            n = n2;
        }
        if (n != 0) {
            iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u6233\u6726\u723a\u54ce\u6383\u53d9\u5bff\u623f"), new Object[3 >> 2]);
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIIiiIIIIi);
            return;
        }
        if (System.currentTimeMillis() - iIiiiiiIIi2.iIIIIiiiii > 10000L) {
            iIiiiiiIIi2.error(IIiIIIIIii.ALLATORIxDEMO("\u7203\u5489\u63ba\u539e\u8def\u65be\uff66\u53a7\u8097\u6741\u7223\u54a9\u65aa\u6cbd\u63ba\u539e"), new Object[2 & 5]);
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIIiiIIIIi);
        }
    }

    private /* synthetic */ void iiIIiIIiii() {
        iIiiiiiIIi iIiiiiiIIi2 = iiIiiiIiii2;
        if (iIiiiiiIIi2.IiiIiIiiIi != ItemSorterModule.ProcessingState.iIiiiIiIii) {
            iIiiiiiIIi iIiiiiiIIi3 = iIiiiiiIIi2;
            iIiiiiiIIi3.error("\u5c1d\u8bd5\u5728\u975e\u7a7a\u95f2\u72b6\u6001\u4e0b\u5f00\u59cb\u5904\u7406\uff0c\u5f53\u524d\u72b6\u6001\uff1a" + String.valueOf((Object)iIiiiiiIIi3.IiiIiIiiIi) + "\uff0c\u5f3a\u5236\u91cd\u7f6e", new Object[3 >> 2]);
            iIiiiiiIIi2.IiiiiiiIIi();
            return;
        }
        iIiiiiiIIi iIiiiiiIIi4 = iIiiiiiIIi2;
        iIiiiiiIIi4.IIiiIIIIIi.clear();
        iIiiiiiIIi2.iIIiIiiiII = 3 >> 2;
        iIiiiiiIIi4.IiiiiIIiII.clear();
        Iterator iterator = ((List)iIiiiiiIIi2.iiiiIiiIIi.get()).iterator();
        while (iterator.hasNext()) {
            iiIiiiIiii iiIiiiIiii2 = iiIiiiIiii.ALLATORIxDEMO((String)iterator.next());
            if (iIiiiiiIIi2.IIiiIIIIIi.contains(iiIiiiIiii2) || iiIiiiIiii2 == null) continue;
            iIiiiiiIIi2.IIiiIIIIIi.add(iiIiiiIiii2);
        }
        if (iIiiiiiIIi2.IIiiIIIIIi.isEmpty()) {
            iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u6705\u913e\u7f41\u6ee3\u7b9e\u5b03\uff03\u8da0\u8fc8\u5977\u7429"), new Object[3 & 4]);
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIiIiIIiii);
            return;
        }
        iIiiiiiIIi iIiiiiiIIi5 = iIiiiiiIIi2;
        iIiiiiiIIi5.info("\u5f00\u59cb\u5904\u7406 " + iIiiiiiIIi5.IIiiIIIIIi.size() + " \u4e2a\u6e90\u7bb1\u5b50", new Object[2 & 5]);
        iIiiiiiIIi2.iIiIiiiiii();
    }

    private /* synthetic */ void iiiIiIiiIi() {
        long l = System.currentTimeMillis();
        if (l - this.iIIiiiiIii >= (long)((Integer)this.iIIiIiiIiI.get()).intValue() * 50L) {
            this.iIIiiiiIii = l;
            this.info(IIiIIIIIii.ALLATORIxDEMO("\u5f6a\u5983\u65da\u76cc\u7223\u54a9\u653e\u746e\u5402\u6757"), new Object[3 & 4]);
            this.iiIIiIIiii();
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiiiiiIIi iIiiiiiIIi2;
        iIiiiiiIIi iIiiiiiIIi3 = iIiiiiiIIi2 = iIiiiiiIIi5;
        if (iIiiiiiIIi3.iIIiIiiiII >= iIiiiiiIIi3.IIiiIIIIIi.size()) {
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIiIiIIIII);
            return;
        }
        iIiiiiiIIi iIiiiiiIIi4 = iIiiiiiIIi2;
        iIiiiiiIIi iIiiiiiIIi5 = iIiiiiiIIi4.IIiiIIIIIi.get(iIiiiiiIIi4.iIIiIiiiII).ALLATORIxDEMO();
        iIiiiiiIIi2.info("\u6b63\u5728\u79fb\u52a8\u5230\u6e90\u7bb1\u5b50\uff1a" + iIiiiiiIIi5.method_23854(), new Object[5 >> 3]);
        if (IiIiiIIIiI.ALLATORIxDEMO((class_2338)iIiiiiiIIi5, 3.0)) {
            iIiiiiiIIi2.info(iiIIiiiIIi.ALLATORIxDEMO("\u5d81\u521f\u8fed\u6e9f\u7be2\u5b5f\u4f3e\u7f41"), new Object[5 >> 3]);
            iIiiiiiIIi iIiiiiiIIi6 = iIiiiiiIIi2;
            iIiiiiiIIi6.ALLATORIxDEMO(iIiiiiiIIi2.IIiiIIIIIi.get(iIiiiiiIIi6.iIIiIiiiII).ALLATORIxDEMO());
            iIiiiiiIIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IiiiiIiIiI);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void info(String string, Object ... objectArray) {
        void iIiIiIIIII2;
        iIiiiiiIIi iIiiiiiIIi2 = string2;
        String string2 = string;
        iIiiiiiIIi iIiIiIIIII3 = iIiiiiiIIi2;
        if (iIiIiIIIII3.iIiIiiiiII.equals(string2)) {
            return;
        }
        String string3 = string2;
        super.info(string3, (Object[])iIiIiIIIII2);
        iIiIiIIIII3.iIiIiiiiII = string3;
    }
}

