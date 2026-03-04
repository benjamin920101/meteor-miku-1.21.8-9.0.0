/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Pair
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.ObjectIntImmutablePair
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.entity.player.InteractEntityEvent
 *  meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList
 *  meteordevelopment.meteorclient.gui.widgets.containers.WSection
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList
 *  meteordevelopment.meteorclient.gui.widgets.input.WDropdown
 *  meteordevelopment.meteorclient.gui.widgets.input.WIntEdit
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WMinus
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.SoundEventListSetting$Builder
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.misc.Names
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.VillagerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.ProjectileUtil
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.village.TradeOfferList
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.registry.Registry
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtList
 *  net.minecraft.nbt.NbtElement
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.entry.RegistryEntry$Reference
 *  net.minecraft.registry.RegistryKeys
 *  net.minecraft.registry.tag.EnchantmentTags
 *  org.apache.commons.io.FilenameUtils
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIIIiiII;
import com.github.mikumiku.addon.iiIIIiIiII;
import com.github.mikumiku.addon.iiiiiiiIiI;
import com.github.mikumiku.addon.modules.VillagerRoller;
import it.unimi.dsi.fastutil.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectIntImmutablePair;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.entity.player.InteractEntityEvent;
import meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList;
import meteordevelopment.meteorclient.gui.widgets.containers.WSection;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList;
import meteordevelopment.meteorclient.gui.widgets.input.WDropdown;
import meteordevelopment.meteorclient.gui.widgets.input.WIntEdit;
import meteordevelopment.meteorclient.gui.widgets.input.WTextBox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WMinus;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.SoundEventListSetting;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.misc.Names;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.village.TradeOfferList;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtElement;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.EnchantmentTags;
import org.apache.commons.io.FilenameUtils;

public class iiiIiIIiIi
extends iIiIiIIIii {
    private final SettingGroup IiiIiIiIIi;
    private final Setting<Boolean> iiIiiiiIii;
    private long IIIiiiIiIi;
    private final Setting<Boolean> iIIiIiiiII;
    private class_2338 iiiiIiiIIi;
    private VillagerRoller.State iiiIIiIIii;
    private final Setting<Boolean> IiiIIiIIiI;
    private final Setting<Boolean> iIIIIiiiii;
    private final Setting<Boolean> IiIiIiIIii;
    private final Setting<List<class_3414>> iiiIiIiiII;
    private final Setting<Boolean> IIiiiiIIii;
    private final SettingGroup IiiiiIIiII;
    private class_2248 iIIIIIiiII;
    private final Setting<Boolean> iIIiiiiIii;
    private final Setting<Boolean> iiIIIiIIIi;
    private final Setting<Boolean> iIiiiiIIII;
    private final Setting<Boolean> iiIiIIiiii;
    private final Setting<Integer> iIIiIiiIiI;
    private long iIIIIIIiII;
    private long iIIiiIIIIi;
    private final List<iiIIIIiiII> IiiiiIiIiI;
    private final Setting<Double> iiiIiIIiii;
    private final Setting<Boolean> iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<Double> iIiIIiIIIi;
    private final SettingGroup IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private static final Path iIiIiiiiII = MeteorClient.FOLDER.toPath().resolve(iIIIIiIiii.ALLATORIxDEMO("W@bJjDiVYLzR9\u0006"));
    private final Setting<Boolean> IIIIiiIiii;
    private class_1646 IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Integer> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WVerticalList wVerticalList, Optional optional, iiIIIIiiII iiIIIIiiII2, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = wVerticalList;
        iiiIiIIiIi iIiIiIIIII5 = iiiIiIIiIi2;
        iiiIiIIiIi3.clear();
        iIiIiIIIII4.ifPresent(arg_0 -> iiiIiIIiIi.iiiIiIiiIi((iiIIIIiiII)iIiIiIIIII3, arg_0));
        iIiIiIIIII5.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iiiIiIIiIi3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiIiiIi(GuiTheme guiTheme, WVerticalList wVerticalList) {
        void iIiIiIIIII2;
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = guiTheme;
        iiiIiIIiIi iIiIiIIIII3 = iiiIiIIiIi2;
        iIiIiIIIII3.iIIiiIiIiI.method_1507((class_437)new iiiiiiiIiI((GuiTheme)iiiIiIIiIi3, (Boolean)iIiIiIIIII3.iIIiiIiIiI.get(), arg_0 -> iIiIiIIIII3.ALLATORIxDEMO((WVerticalList)iIiIiIIIII2, (GuiTheme)iiiIiIIiIi3, arg_0)));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WTextBox wTextBox, WVerticalList wVerticalList, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        iiiIiIIiIi iiiIiIIiIi2;
        void iIiIiIIIII3;
        iiiIiIIiIi iIiIiIIIII4;
        iiiIiIIiIi iiiIiIIiIi3 = iiiIiIIiIi4;
        iiiIiIIiIi iiiIiIIiIi4 = wVerticalList;
        iiiIiIIiIi iiiIiIIiIi5 = iIiIiIIIII4 = iiiIiIIiIi3;
        if (iiIIIiIiII.ALLATORIxDEMO(new File(new File(MeteorClient.FOLDER, IIiiIiIIIi.iiiIiIiiIi("\r[\u0017~:U>@)}7^\u001e`")), iIiIiIIIII3.get() + ".nbt"), iIiIiIIIII4.IiiiiIiIiI, string -> {
            String iIiIiIIIII2 = string;
            iiiIiIIiIi iIiIiIIIII3 = iIiIiIIIII4;
            iIiIiIIIII3.error(iIiIiIIIII2, new Object[3 >> 2]);
        })) {
            iiiIiIIiIi5.info(iIIIIiIiii.ALLATORIxDEMO("\u4ff2\u5b5f\u623d\u529a"), new Object[3 ^ 3]);
            iiiIiIIiIi2 = iiiIiIIiIi4;
        } else {
            iiiIiIIiIi5.error(IIiiIiIIIi.iiiIiIiiIi("\u4f86\u5b6a\u594a\u8d37"), new Object[2 & 5]);
            iiiIiIIiIi2 = iiiIiIIiIi4;
        }
        iiiIiIIiIi2.clear();
        iIiIiIIIII4.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iiiIiIIiIi4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IIiIiIiIiI(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = wVerticalList;
        iiiIiIIiIi iIiIiIIIII3 = iiiIiIIiIi2;
        iiiIiIIiIi3.clear();
        iiiIiIIiIi iiiIiIIiIi4 = iIiIiIIIII3;
        iiiIiIIiIi4.IiiiiIiIiI.clear();
        iiiIiIIiIi4.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iiiIiIIiIi3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WDropdown wDropdown, WVerticalList wVerticalList, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = wVerticalList;
        iiiIiIIiIi iIiIiIIIII3 = iiiIiIIiIi2;
        if (iiIIIiIiII.iiiIiIiiIi(new File(new File(MeteorClient.FOLDER, iIIIIiIiii.ALLATORIxDEMO("fqGo{UC|u`CkHw")), (String)iIiIiIIIII2.get() + ".nbt"), iIiIiIIIII3.IiiiiIiIiI, string -> {
            String iIiIiIIIII2 = string;
            iiiIiIIiIi iIiIiIIIII3 = iIiIiIIIII3;
            iIiIiIIIII3.error(iIiIiIIIII2, new Object[3 >> 2]);
        })) {
            void iIiIiIIIII4;
            iiiIiIIiIi iiiIiIIiIi4 = iIiIiIIIII3;
            iiiIiIIiIi3.clear();
            iiiIiIIiIi4.ALLATORIxDEMO((GuiTheme)iIiIiIIIII4, (WVerticalList)iiiIiIIiIi3);
            iiiIiIIiIi4.info(IIiiIiIIIi.iiiIiIiiIi("\u52fb\u8f4f\u626b\u528d"), new Object[3 >> 2]);
            return;
        }
        iIiIiIIIII3.error(iIIIIiIiii.ALLATORIxDEMO("\u52ae\u8f5a\u6588\u4ed9\u5936\u8d08\u3007"), new Object[2 & 5]);
    }

    public String getInfoString() {
        return this.iiiIIiIIii.toString();
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        iiiIiIIiIi iiiIiIIiIi2 = string2;
        String string2 = string;
        iiiIiIIiIi iIiIiIIIII2 = iiiIiIIiIi2;
        if (iIiIiIIIII2.iIIiiIIIIi + (long)((Integer)iIiIiIIIII2.iIiIiIIIII.get()).intValue() <= System.currentTimeMillis()) {
            if (((Boolean)iIiIiIIIII2.iiiiiIIiIi.get()).booleanValue()) {
                iIiIiIIIII2.info(string2, new Object[2 & 5]);
            }
            iIiIiIIIII2.iIIiiIIIIi = System.currentTimeMillis();
        }
        if (((Boolean)iIiIiIIIII2.iIIiIiiiII.get()).booleanValue()) {
            iIiIiIIIII2.toggle();
        }
    }

    private static /* synthetic */ void iiiIiIiiIi(iiIIIIiiII iiIIIIiiII2, WIntEdit wIntEdit) {
        iiIIIIiiII iIiIiIIIII2 = wIntEdit;
        iiIIIIiiII iIiIiIIIII3 = iiIIIIiiII2;
        iIiIiIIIII3.iiiiiIIiIi = iIiIiIIIII2.get();
    }

    private /* synthetic */ void ALLATORIxDEMO(class_3943 class_39432) {
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = class_39432;
        iiiIiIIiIi iIiIiIIIII2 = iiiIiIIiIi2;
        iIiIiIIIII2.ALLATORIxDEMO(iiiIiIIiIi3.method_17590());
    }

    private static /* synthetic */ void ALLATORIxDEMO(iiIIIIiiII iiIIIIiiII2, WCheckbox wCheckbox) {
        iiIIIIiiII iIiIiIIIII2 = wCheckbox;
        iiIIIIiiII iIiIiIIIII3 = iiIIIIiiII2;
        iIiIiIIIII3.iIIiIiiiIi = ((WCheckbox)iIiIiIIIII2).checked;
    }

    @EventHandler(priority=100)
    private /* synthetic */ void ALLATORIxDEMO(StartBreakingBlockEvent startBreakingBlockEvent) {
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = startBreakingBlockEvent;
        iiiIiIIiIi iIiIiIIIII2 = iiiIiIIiIi2;
        if (iIiIiIIIII2.iiiIIiIIii != VillagerRoller.State.IIiIiIIiii) {
            return;
        }
        iiiIiIIiIi iiiIiIIiIi4 = iIiIiIIIII2;
        iiiIiIIiIi4.iiiiIiiIIi = ((StartBreakingBlockEvent)iiiIiIIiIi3).blockPos;
        iIiIiIIIII2.iIIIIIiiII = iiiIiIIiIi4.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII2.iiiiIiiIIi).method_26204();
        iiiIiIIiIi4.iiiIIiIIii = VillagerRoller.State.ALLATORIxDEMO;
        if (((Boolean)iiiIiIIiIi4.iIIIiiiiIi.get()).booleanValue()) {
            iIiIiIIIII2.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12968, iIiIiIIIII2.iiiiIiiIIi, class_2350.field_11036));
        }
        if (((Boolean)iIiIiIIIII2.iiiIiiIIII.get()).booleanValue()) {
            IiIiIIiiii.iiIIiIIiii(iIIIIiIiii.ALLATORIxDEMO("\u5dec\u9024\u62ec\u8b82\u53e8\uff27\u73b3\u5732\u53c1\u9508\u4f6e\u60d4\u898e\u5218\u7683\u677c\u6c14"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WVerticalList wVerticalList, GuiTheme guiTheme, iiIIIIiiII iiIIIIiiII2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiIiIIiIi iiiIiIIiIi2 = iiIIIIiiII3;
        iiIIIIiiII iiIIIIiiII3 = iiIIIIiiII2;
        iiiIiIIiIi iIiIiIIIII4 = iiiIiIIiIi2;
        iiIIIIiiII iiIIIIiiII4 = iiIIIIiiII3;
        iiIIIIiiII3.ALLATORIxDEMO = --1;
        iiIIIIiiII4.iiiiiIIiIi = 0x5C & 0x63;
        iiIIIIiiII4.iIIiIiiiIi = 4 ^ 5;
        iIiIiIIIII4.IiiiiIiIiI.add(iiIIIIiiII3);
        iIiIiIIIII3.clear();
        iIiIiIIIII4.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iIiIiIIIII3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiiIIIiII(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiIiIIiIi iiiIiIIiIi2 = this;
        iIiIiIIIII3.clear();
        for (iiIIIIiiII iiIIIIiiII2 : iiiIiIIiIi2.IiiiiIiIiI) {
            if (iiIIIIiiII2.iiiiiIIiIi >= (0x64 & 0x5B)) continue;
            iiIIIIiiII2.iiiiiIIiIi += 4 ^ 5;
        }
        iiiIiIIiIi2.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iIiIiIIIII3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IIIIiIIiII(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiIiIIiIi iiiIiIIiIi2 = this;
        iIiIiIIIII3.clear();
        Object object = this = iiiIiIIiIi2.IiiiiIiIiI.iterator();
        while (object.hasNext()) {
            int cfr_ignored_0 = 4 ^ 5;
            boolean cfr_ignored_1 = ((iiIIIIiiII)this.next()).iIIiIiiiIi;
            ((iiIIIIiiII)this.next()).iIIiIiiiIi = ((iiIIIIiiII)this.next()).iIIiIiiiIi;
            object = this;
        }
        iiiIiIIiIi2.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iIiIiIIIII3);
    }

    @Override
    public void onActivate() {
        iiiIiIIiIi iiiIiIIiIi2 = this;
        super.onActivate();
        if (iiiIiIIiIi2.toggleOnBindRelease) {
            this.toggleOnBindRelease = 3 >> 2;
            if (((Boolean)this.iiiIiiIIII.get()).booleanValue()) {
                this.warning(iIIIIiIiii.ALLATORIxDEMO("\u4f43\u76af\u201a\u6302\u950d\u91e1\u653d\u65dd\u5204\u6369\u203b\u8b95\u7f6d\u4e31W\u007fPi\uff28\u6232\u5df9\u7ece\u5e07\u4f76\u514d\u95e6\u4ea5\uff18\u773d\u5f94\u4f4b\u6384\u67db\u95e9\u98b7"), new Object[3 ^ 3]);
            }
        }
        this.iiiIIiIIii = VillagerRoller.State.IIiIiIIiii;
        if (((Boolean)this.iiiIiiIIII.get()).booleanValue()) {
            this.info(IIiiIiIIIi.iiiIiIiiIi("\u6529\u51a0\u4f52\u60a8\u89b3\u524c\u7696\u8be9\u53c2\u65c2\u5745"), new Object[3 & 4]);
        }
    }

    public List<Pair<class_6880<class_1887>, Integer>> ALLATORIxDEMO(class_1799 class_17992) {
        iiiIiIIiIi iiiIiIIiIi2 = object;
        Object object = class_17992;
        iiiIiIIiIi iIiIiIIIII2 = iiiIiIIiIi2;
        ArrayList<Pair<class_6880<class_1887>, Integer>> arrayList = new ArrayList<Pair<class_6880<class_1887>, Integer>>();
        Object object2 = object = class_1890.method_57532((class_1799)object).method_57539().iterator();
        while (object2.hasNext()) {
            Object2IntMap.Entry entry = (Object2IntMap.Entry)object.next();
            arrayList.add((Pair<class_6880<class_1887>, Integer>)ObjectIntImmutablePair.of((Object)((class_6880)entry.getKey()), (int)entry.getIntValue()));
            object2 = object;
        }
        return arrayList;
    }

    public Map<String, Integer> ALLATORIxDEMO() {
        iiiIiIIiIi iiiIiIIiIi2 = object;
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        if (iiiIiIIiIi2.iIIiiIiIiI.field_1687 == null) {
            return hashMap;
        }
        Object object = iiiIiIIiIi2.iIIiiIiIiI.field_1687.method_30349().method_46759(class_7924.field_41265);
        if (((Optional)object).isEmpty()) {
            return hashMap;
        }
        Iterator iterator = object = ((class_2378)((Optional)object).get()).method_29722().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            String string = ((class_5321)entry.getKey()).method_29177().toString();
            int n = ((class_1887)entry.getValue()).method_8183();
            iterator = object;
            hashMap.put(string, n);
        }
        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(GuiTheme guiTheme, int n, WVerticalList wVerticalList) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = guiTheme;
        iiiIiIIiIi iIiIiIIIII4 = iiiIiIIiIi2;
        iIiIiIIIII4.iIIiiIiIiI.method_1507((class_437)new iiiiiiiIiI((GuiTheme)iiiIiIIiIi3, (Boolean)iIiIiIIIII4.iIIiiIiIiI.get(), arg_0 -> iIiIiIIIII4.ALLATORIxDEMO((int)iIiIiIIIII3, (WVerticalList)iIiIiIIIII2, (GuiTheme)iiiIiIIiIi3, arg_0)));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WVerticalList wVerticalList, iiIIIIiiII iiIIIIiiII2, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = wVerticalList;
        iiiIiIIiIi iIiIiIIIII4 = iiiIiIIiIi2;
        iiiIiIIiIi3.clear();
        iIiIiIIIII4.IiiiiIiIiI.remove(iIiIiIIIII3);
        iIiIiIIIII4.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iiiIiIIiIi3);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = receive;
        iiiIiIIiIi iIiIiIIIII2 = iiiIiIIiIi2;
        if (iIiIiIIIII2.iiiIIiIIii != VillagerRoller.State.iiiiiIIiIi) {
            return;
        }
        class_2596 class_25962 = ((PacketEvent.Receive)iiiIiIIiIi3).packet;
        if (!(class_25962 instanceof class_3943)) {
            return;
        }
        iiiIiIIiIi3 = (class_3943)class_25962;
        iIiIiIIIII2.iIIiiIiIiI.method_40000(() -> iIiIiIIIII2.ALLATORIxDEMO((class_3943)iiiIiIIiIi3));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiIIiIIiii(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiIiIIiIi iiiIiIIiIi2 = this;
        iIiIiIIIII3.clear();
        Object object = this = iiiIiIIiIi2.IiiiiIiIiI.iterator();
        while (object.hasNext()) {
            ((iiIIIIiiII)this.next()).iiiiiIIiIi = 3 >> 2;
            object = this;
        }
        iiiIiIIiIi2.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iIiIiIIIII3);
    }

    public Module fromTag(class_2487 class_24872) {
        iiiIiIIiIi iIiIiIIIII2;
        iiiIiIIiIi iiiIiIIiIi2 = object;
        Object object = class_24872;
        iiiIiIIiIi iiiIiIIiIi3 = iIiIiIIIII2 = iiiIiIIiIi2;
        super.fromTag((class_2487)object);
        if (((Boolean)iiiIiIIiIi3.IiiIIiIIiI.get()).booleanValue()) {
            class_2499 class_24992 = iIiiiIIiIi.ALLATORIxDEMO((class_2487)object, IIiiIiIIIi.iiiIiIiiIi("@\u0014~7[\u0015u"));
            iIiIiIIIII2.IiiiiIiIiI.clear();
            Object object2 = object = class_24992.iterator();
            while (object2.hasNext()) {
                class_2520 class_25202 = (class_2520)object.next();
                if (class_25202.method_10711() != (0x7A & 0xF)) {
                    iIiIiIIIII2.info(iIIIIiIiii.ALLATORIxDEMO("\u65c7\u657e\u769a\u5214\u8843\u5146\u7d0d"), new Object[3 & 4]);
                    object2 = object;
                    continue;
                }
                iIiIiIIIII2.IiiiiIiIiI.add(new iiIIIIiiII().ALLATORIxDEMO((class_2487)class_25202));
                object2 = object;
            }
        }
        return iIiIiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiIiiIi(WVerticalList wVerticalList, Optional optional, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        class_6880<class_1887> class_68802 = class_68804;
        iIiIiIIIII4.clear();
        class_68802.IiiiiIiIiI.clear();
        if (iIiIiIIIII3.isPresent()) {
            Iterator<class_6880<class_1887>> iterator;
            class_6880<class_1887> class_68803 = class_68802;
            Iterator<class_6880<class_1887>> iterator2 = iterator = class_68803.ALLATORIxDEMO(((Boolean)class_68803.iIIiiIiIiI.get()).booleanValue()).iterator();
            while (iterator2.hasNext()) {
                class_6880<class_1887> class_68804 = iterator.next();
                class_68802.IiiiiIiIiI.add(new iiIIIIiiII(((class_2378)iIiIiIIIII3.get()).method_10221((Object)((class_1887)class_68804.comp_349())), ((class_1887)class_68804.comp_349()).method_8183(), iiiIiIIiIi.ALLATORIxDEMO(class_68804), (2 ^ 3) != 0));
                iterator2 = iterator;
            }
        }
        class_68802.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iIiIiIIIII4);
    }

    /*
     * WARNING - void declaration
     */
    public List<class_6880<class_1887>> ALLATORIxDEMO(boolean bl) {
        Iterator iIiIiIIIII222;
        void iIiIiIIIII222;
        iiiIiIIiIi iiiIiIIiIi2 = arrayList;
        if (iiiIiIIiIi2.iIIiiIiIiI.field_1687 == null) {
            return Collections.emptyList();
        }
        Optional optional = iiiIiIIiIi2.iIIiiIiIiI.field_1687.method_30349().method_46759(class_7924.field_41265);
        if (optional.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (iIiIiIIIII222 != false) {
            Iterable iIiIiIIIII222 = ((class_2378)optional.get()).method_40286(class_9636.field_51545);
            iIiIiIIIII222.iterator().forEachRemaining(arrayList::add);
            return arrayList;
        }
        Iterator iterator = iIiIiIIIII222 = ((class_2378)optional.get()).method_40295().iterator();
        while (iterator.hasNext()) {
            optional = (class_6880)iIiIiIIIII222.next();
            iterator = iIiIiIIIII222;
            arrayList.add(optional);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void ALLATORIxDEMO(GuiTheme guiTheme, WVerticalList wVerticalList) {
        int n;
        Optional optional;
        WTable wTable;
        Object object;
        Object object2;
        Object object3;
        WTable wTable2;
        void iIiIiIIIII3;
        iiiIiIIiIi iIiIiIIIII4;
        block19: {
            block17: {
                block18: {
                    iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
                    iiiIiIIiIi iiiIiIIiIi3 = guiTheme;
                    iIiIiIIIII4 = iiiIiIIiIi2;
                    wTable2 = (WTable)((WSection)iIiIiIIIII3.add((WWidget)iiiIiIIiIi3.section(IIiiIiIIIi.iiiIiIiiIi("\u9116\u7f5c\u4fa6\u5b4a"))).expandX().widget()).add((WWidget)iiiIiIIiIi3.table()).expandX().widget();
                    object3 = (WTextBox)wTable2.add((WWidget)iiiIiIIiIi3.textBox(iIIIIiIiii.ALLATORIxDEMO("jBiNrAq"))).expandWidgetX().expandCellX().expandX().widget();
                    ((WButton)wTable2.add((WWidget)iiiIiIIiIi3.button((String)IIiiIiIIIi.iiiIiIiiIi((String)"\u4fa6\u5b4a"))).expandX().widget()).action = () -> iIiIiIIIII4.ALLATORIxDEMO((WTextBox)object3, (WVerticalList)iIiIiIIIII3, (GuiTheme)iiiIiIIiIi3);
                    wTable2.row();
                    object3 = new ArrayList();
                    if (!Files.notExists(iIiIiiiiII, new LinkOption[3 >> 2])) break block18;
                    if (iIiIiiiiII.toFile().mkdirs()) break block17;
                    Object[] objectArray = new Object[--1];
                    objectArray[3 & 4] = iIiIiiiiII;
                    iIiIiIIIII4.error(iIIIIiIiii.ALLATORIxDEMO("\u5218\u5ee0\u76dc\u5f73\u593f\u8d02/t|PX"), objectArray);
                    object2 = object3;
                    break block19;
                }
                try {
                    object = Files.newDirectoryStream(iIiIiiiiII);
                    try {
                        wTable = object.iterator();
                        while (wTable.hasNext()) {
                            optional = wTable.next();
                            ((ArrayList)object3).add(FilenameUtils.removeExtension((String)optional.getFileName().toString()));
                        }
                        if (object == null) break block17;
                    }
                    catch (Throwable throwable) {
                        Throwable throwable2;
                        if (object != null) {
                            try {
                                object.close();
                                throwable2 = throwable;
                                throw throwable2;
                            }
                            catch (Throwable throwable3) {
                                throwable.addSuppressed(throwable3);
                            }
                        }
                        throwable2 = throwable;
                        throw throwable2;
                    }
                    object.close();
                }
                catch (IOException iOException) {
                    Object[] objectArray = new Object[3 >> 1];
                    objectArray[3 & 4] = iOException;
                    iIiIiIIIII4.error(IIiiIiIIIi.iiiIiIiiIi("\u526c\u51e8\u76b5\u5f67\u594a\u8d37"), objectArray);
                }
            }
            object2 = object3;
        }
        if (!((ArrayList)object2).isEmpty()) {
            object = (WDropdown)wTable2.add((WWidget)iiiIiIIiIi3.dropdown(((ArrayList)object3).toArray(new String[3 >> 2]), iIIIIiIiii.ALLATORIxDEMO("jBiNrAq"))).expandWidgetX().expandCellX().expandX().widget();
            wTable = (WButton)wTable2.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u52db\u8f6f"))).expandX().widget();
            ((WButton)wTable2.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u52db\u8f6f"))).expandX().widget()).action = () -> iIiIiIIIII4.ALLATORIxDEMO((WDropdown)object, (WVerticalList)iIiIiIIIII3, (GuiTheme)iiiIiIIiIi3);
        }
        object = (WSection)iIiIiIIIII3.add((WWidget)iiiIiIIiIi3.section(iIIIIiIiii.ALLATORIxDEMO("\u9669\u9b51"))).expandX().widget();
        wTable = (WTable)object.add((WWidget)iiiIiIIiIi3.table()).expandX().widget();
        wTable.add((WWidget)iiiIiIIiIi3.item(class_1802.field_8529.method_7854()));
        wTable.add((WWidget)iiiIiIIiIi3.label(IIiiIiIIIi.iiiIiIiiIi("\u963f\u9b46")));
        wTable.add((WWidget)iiiIiIIiIi3.label(iIIIIiIiii.ALLATORIxDEMO("\u7b64\u7ea2")));
        wTable.add((WWidget)iiiIiIIiIi3.label(IIiiIiIIIi.iiiIiIiiIi("\u4e8c\u682e")));
        wTable.add((WWidget)iiiIiIIiIi3.label(iIIIIiIiii.ALLATORIxDEMO("\u5402\u752d")));
        wTable.add((WWidget)iiiIiIIiIi3.label(IIiiIiIIIi.iiiIiIiiIi("\u7980\u9676")));
        wTable.row();
        if (((Boolean)iIiIiIIIII4.iIIiIiiiIi.get()).booleanValue()) {
            iIiIiIIIII4.IiiiiIiIiI.removeIf(iIiIiIIIII2 -> {
                if (iIiIiIIIII2.iIiIiIIIII == null) {
                    return 3 >> 1;
                }
                return false;
            });
            iIiIiIIIII4.IiiiiIiIiI.sort(Comparator.comparing(iIiIiIIIII2 -> iIiIiIIIII2.iIiIiIIIII));
        }
        optional = iIiIiIIIII4.iIIiiIiIiI.field_1687 != null ? iIiIiIIIII4.iIIiiIiIiI.field_1687.method_30349().method_46759(class_7924.field_41265) : Optional.empty();
        int n2 = n = 0;
        while (true) {
            WTable wTable3;
            int n3;
            WHorizontalList wHorizontalList;
            WIntEdit wIntEdit;
            WHorizontalList wHorizontalList2;
            class_1799 class_17992;
            if (n2 >= iIiIiIIIII4.IiiiiIiIiI.size()) {
                WTable wTable4 = (WTable)iIiIiIIIII3.add((WWidget)iiiIiIIiIi3.table()).expandX().widget();
                object3 = (WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u79d4\u9663\u5145\u90ed"))).expandX().widget();
                ((WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u79d4\u9663\u5145\u90ed"))).expandX().widget()).action = () -> iIiIiIIIII4.IIiIiIiIiI((WVerticalList)iIiIiIIIII3, (GuiTheme)iiiIiIIiIi3);
                object = (WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u6d80\u52b2"))).expandX().widget();
                ((WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u6d80\u52b2"))).expandX().widget()).action = () -> iIiIiIIIII4.iiiIiIiiIi((GuiTheme)iiiIiIIiIi3, (WVerticalList)iIiIiIIIII3);
                WButton wButton = (WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u6dd4\u52a7\u5145\u90ed"))).expandX().widget();
                ((WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u6dd4\u52a7\u5145\u90ed"))).expandX().widget()).action = () -> iIiIiIIIII4.iiiIiIiiIi((WVerticalList)iIiIiIIIII3, optional, (GuiTheme)iiiIiIIiIi3);
                WTable wTable5 = wTable4;
                wTable5.row();
                class_17992 = (WButton)wTable5.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u5113\u90fa\u8be5\u4e08\u677b\u4f0a"))).expandX().widget();
                ((WButton)wTable5.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u5113\u90fa\u8be5\u4e08\u677b\u4f0a"))).expandX().widget()).action = () -> iIiIiIIIII4.ALLATORIxDEMO((WVerticalList)iIiIiIIIII3, optional, (GuiTheme)iiiIiIIiIi3);
                WButton wButton2 = (WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u514f\u90e7\u4ed8\u683b\u00064"))).expandX().widget();
                ((WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u514f\u90e7\u4ed8\u683b\u00064"))).expandX().widget()).action = () -> iIiIiIIIII4.iiiiIIIiII((WVerticalList)iIiIiIIIII3, (GuiTheme)iiiIiIIiIi3);
                wHorizontalList2 = (WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u5113\u90fa\u4eac\u680eV#"))).expandX().widget();
                ((WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u5113\u90fa\u4eac\u680eV#"))).expandX().widget()).action = () -> iIiIiIIIII4.ALLATORIxDEMO((WVerticalList)iIiIiIIIII3, (GuiTheme)iiiIiIIiIi3);
                WTable wTable6 = wTable4;
                wTable6.row();
                WButton cfr_ignored_0 = (WButton)wTable6.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u514f\u90e7\u4ed8\u683b\u5f7f\u96f3"))).expandX().widget();
                ((WButton)wTable6.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u514f\u90e7\u4ed8\u683b\u5f7f\u96f3"))).expandX().widget()).action = () -> iIiIiIIIII4.iiIIiIIiii((WVerticalList)iIiIiIIIII3, (GuiTheme)iiiIiIIiIi3);
                wIntEdit = (WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u5474\u751a\u5113\u90fa"))).expandX().widget();
                ((WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u5474\u751a\u5113\u90fa"))).expandX().widget()).action = () -> iIiIiIIIII4.IIIIiIIiII((WVerticalList)iIiIiIIIII3, (GuiTheme)iiiIiIIiIi3);
                wHorizontalList = (WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u79ae\u752f\u5145\u90ed"))).expandX().widget();
                ((WButton)wTable4.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u79ae\u752f\u5145\u90ed"))).expandX().widget()).action = () -> iIiIiIIIII4.iiiIiIiiIi((WVerticalList)iIiIiIIIII3, (GuiTheme)iiiIiIIiIi3);
                wTable4.row();
                return;
            }
            object3 = iIiIiIIIII4.IiiiiIiIiI.get(n);
            if (optional.isPresent()) {
                object = ((class_2378)optional.get()).method_10223(((iiIIIIiiII)object3).iIiIiIIIII);
                n3 = n;
            } else {
                object = Optional.empty();
                n3 = n;
            }
            int n4 = n3;
            class_17992 = class_1802.field_8598.method_7854();
            int n5 = 0x36FF & 0x49FF;
            if (((Optional)object).isPresent()) {
                Object object4 = object;
                class_17992 = iIiiiIIiIi.ALLATORIxDEMO((Optional<class_6880.class_6883<class_1887>>)object4);
                n5 = ((class_1887)((class_6880.class_6883)((Optional)object4).get()).comp_349()).method_8183();
            }
            wTable.add((WWidget)iiiIiIIiIi3.item(class_17992));
            wHorizontalList2 = iiiIiIIiIi3.horizontalList();
            WButton cfr_ignored_1 = (WButton)wHorizontalList2.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u66d9\u653c"))).widget();
            ((WButton)wHorizontalList2.add((WWidget)iiiIiIIiIi3.button(iIIIIiIiii.ALLATORIxDEMO("\u66d9\u653c"))).widget()).action = () -> iIiIiIIIII4.ALLATORIxDEMO((GuiTheme)iiiIiIIiIi3, n4, (WVerticalList)iIiIiIIIII3);
            WHorizontalList wHorizontalList3 = wHorizontalList2;
            if (((Optional)object).isPresent()) {
                wHorizontalList3.add((WWidget)iiiIiIIiIi3.label(Names.get((class_6880)((class_6880)((Optional)object).get()))));
                wTable3 = wTable;
            } else {
                wHorizontalList3.add((WWidget)iiiIiIIiIi3.label(((iiIIIIiiII)object3).iIiIiIIIII.toString()));
                wTable3 = wTable;
            }
            wTable3.add((WWidget)wHorizontalList2);
            wIntEdit = (WIntEdit)wTable.add((WWidget)iiiIiIIiIi3.intEdit(((iiIIIIiiII)object3).ALLATORIxDEMO, 3 ^ 3, n5, (2 ^ 3) != 0)).minWidth(40.0).expandX().widget();
            wIntEdit.action = () -> iiiIiIIiIi.ALLATORIxDEMO((iiIIIIiiII)object3, wIntEdit);
            wIntEdit.tooltip = "\u6700\u4f4e\u9644\u9b54\u7b49\u7ea7\uff0c0\u8868\u793a\u4ec5\u6700\u9ad8\u7b49\u7ea7\uff08\u5bf9\u4e8e\u81ea\u5b9a\u4e49\u9644\u9b54\uff0c0\u76f8\u5f53\u4e8e1\uff09";
            wHorizontalList = (WHorizontalList)wTable.add((WWidget)iiiIiIIiIi3.horizontalList()).minWidth(50.0).expandX().widget();
            boolean bl = 3 ^ 3;
            WIntEdit wIntEdit2 = (WIntEdit)wHorizontalList.add((WWidget)iiiIiIIiIi3.intEdit(((iiIIIIiiII)object3).iiiiiIIiIi, bl ? 1 : 0, 0x79 & 0x46, bl)).minWidth(40.0).expandX().widget();
            wIntEdit2.action = () -> iiiIiIIiIi.iiiIiIiiIi((iiIIIIiiII)object3, wIntEdit2);
            wIntEdit2.tooltip = "\u6700\u9ad8\u7eff\u5b9d\u77f3\u4ef7\u683c\uff0c0\u8868\u793a\u65e0\u9650\u5236";
            WIntEdit wIntEdit3 = wIntEdit2 = (WButton)wHorizontalList.add((WWidget)iiiIiIIiIi3.button(IIiiIiIIIi.iiiIiIiiIi("\u677b\u4f0a"))).widget();
            wIntEdit3.tooltip = "\u8bbe\u7f6e\u4e3a\u6700\u4f18\u4ef7\u683c\uff082 + \u6700\u9ad8\u7b49\u7ea7*3\uff09\uff08\u73cd\u8d35\u9644\u9b54\u7ffb\u500d\uff09\uff08\u5982\u679c\u5df2\u77e5\uff09";
            wIntEdit3.action = () -> iIiIiIIIII4.ALLATORIxDEMO((WVerticalList)iIiIiIIIII3, (Optional)object, (iiIIIIiiII)object3, (GuiTheme)iiiIiIIiIi3);
            wIntEdit2 = (WCheckbox)wTable.add((WWidget)iiiIiIIiIi3.checkbox(((iiIIIIiiII)object3).iIIiIiiiIi)).widget();
            wIntEdit2.action = () -> iiiIiIIiIi.ALLATORIxDEMO((iiIIIIiiII)object3, (WCheckbox)wIntEdit2);
            wIntEdit2.tooltip = "\u662f\u5426\u542f\u7528\uff1f";
            ((WMinus)wTable.add((WWidget)iiiIiIIiIi3.minus()).widget()).action = () -> iIiIiIIIII4.ALLATORIxDEMO((WVerticalList)iIiIiIIIII3, (iiIIIIiiII)object3, (GuiTheme)iiiIiIIiIi3);
            wTable.row();
            n2 = ++n;
        }
    }

    public void ALLATORIxDEMO() {
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi4;
        if (((Boolean)iiiIiIIiIi2.ALLATORIxDEMO.get()).booleanValue() && iiiIiIIiIi2.iIIiiIiIiI.field_1755 != null) {
            if (((Boolean)iiiIiIIiIi2.IIiIiIIiii.get()).booleanValue()) {
                iiiIiIIiIi2.info(IIiiIiIIIi.iiiIiIiiIi("\u526c\u53e4\u5d89\u6690\u5007\uff3e\u4e55\u6763\u6c6a\u4eb6\u4ec9\u4ed7\u7e9c\u7eff"), new Object[3 >> 2]);
                return;
            }
        } else {
            iiiIiIIiIi iiiIiIIiIi3 = iiiIiIIiIi2;
            iiiIiIIiIi iiiIiIIiIi4 = iiiIiIIiIi3.iIIiiIiIiI.field_1724.method_33571();
            class_243 class_2432 = iiiIiIIiIi3.IiiIiIiiIi.method_33571();
            iiiIiIIiIi4 = class_1675.method_18075((class_1297)iiiIiIIiIi3.iIIiiIiIiI.field_1724, (class_243)iiiIiIIiIi4, (class_243)class_2432, (class_238)iiiIiIIiIi2.IiiIiIiiIi.method_5829(), class_1297::method_5863, (double)iiiIiIIiIi4.method_1025(class_2432));
            iiiIiIIiIi iiiIiIIiIi5 = iiiIiIIiIi2;
            if (iiiIiIIiIi4 == null) {
                iiiIiIIiIi5.iIIiiIiIiI.field_1761.method_2905((class_1657)iiiIiIIiIi2.iIIiiIiIiI.field_1724, (class_1297)iiiIiIIiIi2.IiiIiIiiIi, class_1268.field_5808);
                iiiIiIIiIi2.iIIIIIIiII = 0L;
                return;
            }
            if (!iiiIiIIiIi5.iIIiiIiIiI.field_1761.method_2917((class_1657)iiiIiIIiIi2.iIIiiIiIiI.field_1724, (class_1297)iiiIiIIiIi2.IiiIiIiiIi, (class_3966)iiiIiIIiIi4, class_1268.field_5808).method_23665()) {
                iiiIiIIiIi2.iIIiiIiIiI.field_1761.method_2905((class_1657)iiiIiIIiIi2.iIIiiIiIiI.field_1724, (class_1297)iiiIiIIiIi2.IiiIiIiiIi, class_1268.field_5808);
                iiiIiIIiIi2.iIIIIIIiII = 0L;
            }
        }
    }

    public void onDeactivate() {
        this.iiiIIiIIii = VillagerRoller.State.IIIIiiIiii;
    }

    /*
     * Exception decompiling
     */
    public void ALLATORIxDEMO(class_1916 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[UNCONDITIONALDOLOOP]], but top level block is 4[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void iiiIiIiiIi(iiIIIIiiII iiIIIIiiII2, class_6880.class_6883 class_68832) {
        iiIIIIiiII iIiIiIIIII2 = class_68832;
        iiIIIIiiII iIiIiIIIII3 = iiIIIIiiII2;
        iIiIiIIIII3.iiiiiIIiIi = iiiIiIIiIi.ALLATORIxDEMO((class_6880<class_1887>)iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiIiiIi(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiIiIIiIi iiiIiIIiIi2 = this;
        iIiIiIIIII3.clear();
        Object object = this = iiiIiIIiIi2.IiiiiIiIiI.iterator();
        while (object.hasNext()) {
            ((iiIIIIiiII)this.next()).iIIiIiiiIi = 3 >> 2;
            object = this;
        }
        iiiIiIIiIi2.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iIiIiIIIII3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiiIiIIiIi iiiIiIIiIi2 = object;
        Object object = pre;
        iiiIiIIiIi iIiIiIIIII2 = iiiIiIIiIi2;
        switch (iIiIiIIIII2.iiiIIiIIii.ordinal()) {
            case 3: {
                if (((Boolean)iIiIiIIIII2.iIIIiiiiIi.get()).booleanValue()) {
                    iIiIiIIIII2.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIiIiIIIII2.iiiiIiiIIi, class_2350.field_11033));
                }
                if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII2.iiiiIiiIIi) == class_2246.field_10124.method_9564()) {
                    iIiIiIIIII2.iiiIIiIIii = VillagerRoller.State.IiiIiIiiIi;
                    return;
                }
                if (((Boolean)iIiIiIIIII2.iIIIiiiiIi.get()).booleanValue()) break;
                if (BlockUtils.breakBlock((class_2338)iIiIiIIIII2.iiiiIiiIIi, (4 ^ 5) != 0)) break;
                iIiIiIIIII2.error(IIiiIiIIIi.iiiIiIiiIi("\u65bb\u6ce7\u784f\u575d\u635c\u5ba8\u65c2\u5745"), new Object[5 >> 3]);
                iIiIiIIIII2.toggle();
                return;
            }
            case 4: {
                if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII2.iiiiIiiIIi).method_27852(class_2246.field_16330)) {
                    if (((Boolean)iIiIiIIIII2.iiIiiiiIii.get()).booleanValue()) {
                        iIiIiIIIII2.info(iIIIIiIiii.ALLATORIxDEMO("\u522d\u53e4\u659f\u5759\u6331\u6397\u8884\u64a3\u952d\uff1a"), new Object[2 & 5]);
                    }
                    iIiIiIIIII2.iiiIIiIIii = VillagerRoller.State.iIIiIiiiIi;
                    return;
                }
                if (!iIiiiIIiIi.ALLATORIxDEMO(iIiIiIIIII2.IiiIiIiiIi.method_7231())) break;
                iIiIiIIIII2.iiiIIiIIii = VillagerRoller.State.iIiIiIIIII;
                return;
            }
            case 5: {
                int this_ = IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2.iIIIIIiiII.method_8389());
                if (this_ == -4 >> 2) {
                    iIiIiIIIII2.ALLATORIxDEMO(IIiiIiIIIi.iiiIiIiiIi("\u8097\u5337\u4e56\u6738\u6225\u5202\u8bc9\u53e2"));
                    return;
                }
            }
            if (!iIiIiiIIIi.iiiIiIiiIi(iIiIiIIIII2.iiiiIiiIIi, (4 ^ 5) != 0)) {
                iIiIiIIIII2.ALLATORIxDEMO(iIIIIiIiii.ALLATORIxDEMO("\u8bd7\u4f6b\u7f60\u65c7\u6cda\u6511\u7f69\u8b9f\u53f5"));
                return;
            }
            iiiIiIIiIi iiiIiIIiIi3 = iIiIiIIIII2;
            if (!iIiIiiIIIi.iiiIiIiiIi(iiiIiIIiIi3.iiiiIiiIIi, iiiIiIIiIi3.iIIIIIiiII.method_8389())) {
                iIiIiIIIII2.ALLATORIxDEMO(IIiiIiIIIi.iiiIiIiiIi("\u6545\u7f7c\u8be9\u53c2\u594a\u8d37"));
                return;
            }
            iIiIiIIIII2.iiiIIiIIii = VillagerRoller.State.iIIiiIiIiI;
            if ((Integer)iIiIiIIIII2.IIiiIIIIIi.get() <= 0) break;
            iIiIiIIIII2.IIIiiiIiIi = System.currentTimeMillis();
            return;
            case 6: {
                if ((Integer)iIiIiIIIII2.IIiiIIIIIi.get() > 0 && iIiIiIIIII2.IIIiiiIiIi + (long)((Integer)iIiIiIIIII2.IIiiIIIIIi.get()).intValue() <= System.currentTimeMillis()) {
                    if (((Boolean)iIiIiIIIII2.IIIIiiIiii.get()).booleanValue()) {
                        iIiIiIIIII2.info(iIIIIiIiii.ALLATORIxDEMO("\u6749\u6c3a\u6729\u5732\u6335\u5bbc\u65f8\u95d3\u518a\u638a\u53d0\u8061\u4e1f"), new Object[2 & 5]);
                    }
                    iIiIiIIIII2.iiiIIiIIii = VillagerRoller.State.iIIiIiiiIi;
                    return;
                }
                if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII2.iiiiIiiIIi) == class_2246.field_10124.method_9564()) {
                    if (((Boolean)iIiIiIIIII2.iiIiiiiIii.get()).booleanValue()) {
                        iIiIiIIIII2.info(IIiiIiIIIi.iiiIiIiiIi("\u8bc9\u53e2\u6565\u7f5c\u88d0\u671f\u52fa\u565a\u64ff\u9532\uff73\u53df\u4f07\u5f38\uff64\uff1b"), new Object[3 ^ 3]);
                    }
                    iIiIiIIIII2.iiiIIiIIii = VillagerRoller.State.iIiIiIIIII;
                    return;
                }
                if (!iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII2.iiiiIiiIIi).method_27852(class_2246.field_16330)) {
                    if (((Boolean)iIiIiIIIII2.iiIiiiiIii.get()).booleanValue()) {
                        iIiIiIIIII2.info(iIIIIiIiii.ALLATORIxDEMO("\u6524\u7f5c\u4ea0\u9517\u8bc8\u768b\u6596\u5750\uff32\uff04"), new Object[2 & 5]);
                    }
                    iIiIiIIIII2.iiiIIiIIii = VillagerRoller.State.iIIiIiiiIi;
                    return;
                }
                if (iIiiiIIiIi.ALLATORIxDEMO(iIiIiIIIII2.IiiIiIiiIi.method_7231())) break;
                iIiIiIIIII2.iiiIIiIIii = VillagerRoller.State.iiiiiIIiIi;
                iIiIiIIIII2.ALLATORIxDEMO();
                return;
            }
            case 7: {
                object = (Integer)iIiIiIIIII2.iIIiIiiIiI.get();
                if ((Integer)object <= 0) break;
                if (iIiIiIIIII2.iIIIIIIiII < (long)((Integer)object).intValue()) {
                    ++iIiIiIIIII2.iIIIIIIiII;
                    return;
                }
                if (((Boolean)iIiIiIIIII2.iIIiiiiIii.get()).booleanValue()) {
                    iIiIiIIIII2.info(IIiiIiIIIi.iiiIiIiiIi("\u538a\u9033\u53bd\u4e32\u4e51\u4eb6\u4ec9\u6542\u6315\u5317"), new Object[5 >> 3]);
                }
                iIiIiIIIII2.ALLATORIxDEMO();
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WVerticalList wVerticalList, Optional optional, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        iiiIiIIiIi iiiIiIIiIi2 = iiIIIIiiII2;
        iIiIiIIIII4.clear();
        if (iIiIiIIIII3.isPresent()) {
            Iterator<iiIIIIiiII> iterator;
            Iterator<iiIIIIiiII> iterator2 = iterator = iiiIiIIiIi2.IiiiiIiIiI.iterator();
            while (iterator2.hasNext()) {
                iiIIIIiiII iiIIIIiiII2 = iterator.next();
                ((class_2378)iIiIiIIIII3.get()).method_10223(iiIIIIiiII2.iIiIiIIIII).ifPresent(class_68832 -> {
                    iiIIIIiiII iIiIiIIIII2 = class_68832;
                    iiIIIIiiII iIiIiIIIII3 = iiIIIIiiII2;
                    iIiIiIIIII3.iiiiiIIiIi = iiiIiIIiIi.ALLATORIxDEMO((class_6880<class_1887>)iIiIiIIIII2);
                });
                iterator2 = iterator;
            }
        }
        iiiIiIIiIi2.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iIiIiIIIII4);
    }

    private static /* synthetic */ void ALLATORIxDEMO(iiIIIIiiII iiIIIIiiII2, WIntEdit wIntEdit) {
        iiIIIIiiII iIiIiIIIII2 = wIntEdit;
        iiIIIIiiII iIiIiIIIII3 = iiIIIIiiII2;
        iIiIiIIIII3.ALLATORIxDEMO = iIiIiIIIII2.get();
    }

    /*
     * WARNING - void declaration
     */
    public WWidget getWidget(GuiTheme guiTheme) {
        void iIiIiIIIII2;
        iiiIiIIiIi iiiIiIIiIi2 = this;
        iiiIiIIiIi iiiIiIIiIi3 = this = iIiIiIIIII2.verticalList();
        iiiIiIIiIi2.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iiiIiIIiIi3);
        return iiiIiIIiIi3;
    }

    public class_2487 toTag() {
        iiiIiIIiIi iiiIiIIiIi2;
        iiiIiIIiIi iiiIiIIiIi3 = iiiIiIIiIi2 = this;
        class_2487 class_24872 = super.toTag();
        if (((Boolean)iiiIiIIiIi3.IiiIIiIIiI.get()).booleanValue()) {
            class_2499 class_24992 = new class_2499();
            Object object = this = iiiIiIIiIi2.IiiiiIiIiI.iterator();
            while (object.hasNext()) {
                iiIIIIiiII iiIIIIiiII2 = (iiIIIIiiII)this.next();
                object = this;
                class_24992.add((Object)iiIIIIiiII2.toTag());
            }
            class_24872.method_10566(iIIIIiIiii.ALLATORIxDEMO("WYroBkJ"), (class_2520)class_24992);
        }
        return class_24872;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiIiIIiIi iiiIiIIiIi2 = this;
        iIiIiIIIII3.clear();
        for (iiIIIIiiII iiIIIIiiII2 : iiiIiIIiIi2.IiiiiIiIiI) {
            if (iiIIIIiiII2.iiiiiIIiIi <= 0) continue;
            iiIIIIiiII2.iiiiiIIiIi -= 5 >> 2;
        }
        iiiIiIIiIi2.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iIiIiIIIII3);
    }

    public iiiIiIIiIi() {
        iiiIiIIiIi iiiIiIIiIi2 = this;
        super(iIiIiIIIii.iiiiiIIiIi, IIiiIiIIIi.iiiIiIiiIi("\u526c\u9676\u9b2f\u4e74"), iIIIIiIiii.ALLATORIxDEMO("\u81cd\u52a3\u7817\u5746\u54ad\u6529\u7f51\u8bfe\u5394\u6766\u521c\u6757\u6c3f\u4ea2\u663d\u7689\u9661\u9b58\u4e42\u304eD\u5ef1\u8b8d\u4efc\u681f9\u0012\u3029#\u57f1\u4eadFf_fdQ\u0006ubO2\u0017lF~\tyLzR9\u0006"));
        iiiIiIIiIi2.IiiIiIiIIi = iiiIiIIiIi2.settings.getDefaultGroup();
        iiiIiIIiIi2.IiiiiIIiII = iiiIiIIiIi2.settings.createGroup(IIiiIiIIIi.iiiIiIiiIi("\u588b\u97e1"));
        iiiIiIIiIi2.IIiIiiiiII = iiiIiIIiIi2.settings.createGroup(iIIIIiIiii.ALLATORIxDEMO("\u805c\u5917\u5391\u99fc"), (3 ^ 3) != 0);
        iiiIiIIiIi2.iiIIIiIIIi = iiiIiIIiIi2.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u626c\u526b\u543c\u79fa\u753a"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6275\u5213\u961a\u9b22\u5405\u4eed\u521b\u884c\u4e26\u79a2\u753e\u8bdb\u9618\u9b20"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiIiIIiiii = this.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u624c\u524b\u541c\u65f6\u5f32\u8fa5\u63b7"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6275\u5213\u523c\u886b\u4e26\u76a7\u961a\u9b22\u5405\u658e\u5f0c\u4e2a\u6706\u5282\u567e\u76ba\u8f82\u63d1"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IiiIIiIIiI = this.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u4fef\u5b23\u5205\u8833\u5202\u9136\u7f7c"))).description(iIIIIiIiii.ALLATORIxDEMO("\u5424\u750b\u5c2d\u5234\u53fd\u5214\u8863\u4ffe\u5b73\u548f\u52ab\u8f5e\u526e\u913b\u7f65\u65a4\u4efa\u54a8\u5261\u8d17\u6769\u7f2d\u51ee\u534e"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IiIiIiIIii = this.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u5474\u751a\u588b\u97e1"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6220\u5246\u60f8\u89a2\u7688\u4e80\u6618\u65d5\u64bb\u6500\u58ac\u9787"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiiIiIiiII = this.IiiiiIIiII.add((Setting)((SoundEventListSetting.Builder)((SoundEventListSetting.Builder)((SoundEventListSetting.Builder)new SoundEventListSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u64f6\u650c\u588b\u97e1"))).description(iIIIIiIiii.ALLATORIxDEMO("\u5404\u752b\u65fd\u625d\u526e\u6085\u898a\u76a7\u4ea8\u6637\u65fd\u648e\u6528\u76ba\u58ac\u9787"))).defaultValue(Collections.singletonList(class_3417.field_26942))).build());
        this.iIiIIiIIIi = this.IiiiiIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u58ab\u97c1\u9788\u8c11"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6489\u6535\u58d3\u97e5\u76ba\u97af\u8c77"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 8.0).build());
        this.iiiIiIIiii = this.IiiiiIIiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u58ab\u97c1\u9788\u91dd"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6489\u6535\u58d3\u97e5\u76ba\u97af\u91bb"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 1.0).build());
        this.ALLATORIxDEMO = this.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u7517\u9750\u66f9\u504e"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6225\u5f0b\u4ed8\u4f59\u7568\u9769\u65d5\u6694\u5062\u526b\u53a2"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiiiiIIII = this.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u652c\u7f35\u65c4\u8f17\u5926"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6560\u7f18\u65b2\u5774\u65fa\u660b\u542d\u7728\u5407\u6587\u570b\uff6b"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiIiIIIII = this.IiiIiIiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u6545\u7f7c\u596a\u8d17\u5e8d\u8fcd"))).description(iIIIIiIiii.ALLATORIxDEMO("\u65b2\u5774\u6560\u7f18\u593a\u8d06\u5402\u76a0\u5efd\u8ffc\uff1e\u6bd5\u798e\uff7d"))).defaultValue((Object)(0x7DF & 0x7DFC))).min(2 & 5).sliderRange(5 >> 3, 0x279F & 0x7F70).build());
        this.iIIiIiiiII = this.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u6545\u7f7c\u596a\u8d17\u79fa\u753a"))).description(iIIIIiIiii.ALLATORIxDEMO("\u65e7\u5721\u6535\u7f4d\u593d\u8d01\u65fd\u79a2\u753e\u5209\u538a\u561c"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IIiiIIIIIi = this.IiiIiIiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u675b\u5915\u8037\u4e08\u7b12\u5fb7\u658d\u95e6"))).description(iIIIIiIiii.ALLATORIxDEMO("\u677a\u6c12\u4e06\u6386\u53fc\u804f\u4e31\u65f5\u768f\u7b6a\u5fae\u65f5\u95ff\uff2b\u6bb5\u79a4\uff02\u3021\u96fa\u00046\u0003\u65f6\u966e\u526a\u3076"))).defaultValue((Object)(5 >> 3))).min(3 & 4).sliderRange(2 & 5, 0x7FB5 & 0x275A).build());
        this.iIIiiIiIiI = this.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u4e9e\u53dd\u4edf\u6601"))).description(iIIIIiIiii.ALLATORIxDEMO("\u96ce\u85b9\u6721\u6824\u8bbc\u4e1e\u53e4\u4e87\u6605\u76ba\u9618\u9b20"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIIiIiiiIi = this.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u961f\u9b66\u63e9\u5e9d"))).description(iIIIIiIiii.ALLATORIxDEMO("\u632a\u5401\u79d4\u6399\u5eac\u6628\u7904\u9618\u9b20"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIIiiiiIi = this.IiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u77f7\u95c6\u784f\u575d"))).description(iIIIIiIiii.ALLATORIxDEMO("\u4f7c\u7523\u778f\u95df\u7837\u5764\u6766\u7ac0\u5350\u633d\u639b\u8bb9\u53d3\u305c\u6776\u5976\u7afa\u5724\u8b96\u53fb\u4f6e\u7f78\u4e34\u65e5\u3076"))).defaultValue((Object)(3 >> 2))).build());
        this.iIIiIiiIiI = this.IiiIiIiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u4eff\u4ea0\u91b6\u8bc7"))).description(iIIIIiIiii.ALLATORIxDEMO("\u59a6\u67d0\u6769\u52aa\u564b\u6721\u784d\u8baf\u6772\u6c3a\u4ea7\u4e99\u6553\u6345\u5306\uff27\u572b\u6b6f\u5218\u655b\u540d\u53da\u9022\u53b8\u4e76\u4e21\u3021<\u00046\u0003\u4e1b\u91f3\u8b89\u3076"))).defaultValue((Object)(2 & 5))).min(3 >> 2).sliderRange(3 & 4, 0x6CE & 0x79F9).build());
        this.iiiIiiIIII = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u8be5\u7f5c\u63ab\u7928"))).description(iIIIIiIiii.ALLATORIxDEMO("\u5f2b\u59c8\u65dd\u7687\u64c6\u4f7f\u63fb\u7939\uff03\u5405\u5247\u575e\u6a2a\u5774\u521b\u884c\u72bd\u6022\u4e3b\u6600\u7966\uff7d"))).defaultValue((Object)(3 >> 1))).build());
        this.IIiIiIIiii = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u7537\u9770\u66d9\u506e\u63ab\u7928"))).description(iIIIIiIiii.ALLATORIxDEMO("\u523c\u53f5\u5dac\u66f4\u5057\uff2f\u4e02\u6775\u6c1a\u4e87\u4e84\u4edb\u7ebb\u7e99"))).defaultValue((Object)(--1 != 0))).build());
        this.IIiiiiIIii = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u4f5c\u7b12\u7e95\u63ab\u7928"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6275\u5213\u964f\u9b77\u000b&x\u0003\u4f6d\u4e0e\u6604\u6703\u9ad3\u7b6a\u7e8c\uff19.G\uff56\u6776\u9ad3\uff2a2\u0004.G\uff1e\u6240\u526c\uff7d"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiiiIiIii = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u4e8c\u682e\u8f9c\u9aea\u63ab\u7928"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6275\u5213\u964f\u9b77\u000b&x\u0003\u4f6d\u4ef4\u6817\u5929\u9ad3\uff39\u000ep\uff03\u6723\u9a86\u4e81\u6837\uff2a0\u0004.G\uff1e\u622e\u6770\uff7d"))).defaultValue((Object)(5 >> 2))).build());
        this.iIIIIiiiii = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u4e76\u573a\u524c\u885a\u63ab\u7928"))).description(iIIIIiIiii.ALLATORIxDEMO("\u627d\u523b\u9667\u9b0aV.P,\u4f62\u4e06\u570b\u5201\u8856\u4e71\u3076"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IIIIiiIiii = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u8037\u4e08\u8dde\u65c4\u63ab\u7928"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6772\u6c4f\u675c\u5723\u6324\u5b96\u65d2\u95ff\u51a6\u63b3\u53e9\u8010\u4e6e"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiiiiIIiIi = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u6545\u7f7c\u596a\u8d17\u63ab\u7928"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6535\u7f4d\u593a\u8d06\uff07\u65c3\u6cfe\u653d\u7f65\u6235\u65cb\u6cd6\u5c2d\u8bb1\u53fb\u651d\u514e\u5fe8\u637c\u682c\uff56\u4ebb\u4f11\u89c5\u53dd\u651a\u7f65\u5912\u8d33\u8b80\u7f32\uff7d"))).defaultValue((Object)(5 >> 2))).build());
        this.iiIiiiiIii = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u72cd\u6013\u5f59\u5e0a\u63ab\u7928"))).description(iIIIIiIiii.ALLATORIxDEMO("\u521c\u53d5\u5663\u8ff8\u514e\u4e85\u6104\u5935\u72e8\u6077\uff03\u53cc\u80f1\u660b\u53c6\u4f7f\u5f1c\u5e4c\u622c\uff7d"))).defaultValue((Object)(5 >> 2))).build());
        this.iIIiiiiIii = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u91b6\u8bc7\u4eff\u4ea0\u63ab\u7928"))).description(iIIIIiIiii.ALLATORIxDEMO("\u8ba2\u4f43\u77ce\u9050\u6706\u5282\u5643\u4e21\u5f28\u4e85\u5216\u59e8\u4e8f\u4e91\u657b\u634d\u535b\u5e00\u53da\u9022\u4e8a\u98b9\u591d\u76a7\u6566\u6350\u5359\u3076"))).defaultValue((Object)(--1 != 0))).build());
        iiiIiIIiIi iiiIiIIiIi3 = this;
        this.iiiIIiIIii = VillagerRoller.State.IIIIiiIiii;
        iiiIiIIiIi iiiIiIIiIi4 = this;
        iiiIiIIiIi4.IiiiiIiIiI = new ArrayList<iiIIIIiiII>();
        iiiIiIIiIi3.iIIiiIIIIi = System.currentTimeMillis();
        iiiIiIIiIi3.iIIIIIIiII = 0L;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiiIiIIIi.iiiIiIiiIi(",yY4\bw[g\u000bv:F\u001e3{\u8bc5\u66af\u6582\u524b\u6712\u65eb\u727a\u6757\uff13"));
        }
    }

    public static int ALLATORIxDEMO(class_6880<class_1887> iIiIiIIIII2) {
        if (iIiIiIIIII2 == null) {
            return 3 >> 2;
        }
        int n = 1 ^ 3;
        if (iIiIiIIIII2.method_40220(class_9636.field_51546)) {
            return (n + --3 * ((class_1887)iIiIiIIIII2.comp_349()).method_8183()) * --2;
        }
        return n + --3 * ((class_1887)iIiIiIIIII2.comp_349()).method_8183();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n, WVerticalList wVerticalList, GuiTheme guiTheme, iiIIIIiiII iiIIIIiiII2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        iiiIiIIiIi iiiIiIIiIi3 = wVerticalList;
        iiiIiIIiIi iIiIiIIIII5 = iiiIiIIiIi2;
        iIiIiIIIII5.IiiiiIiIiI.set((int)iIiIiIIIII4, (iiIIIIiiII)iIiIiIIIII3);
        iiiIiIIiIi3.clear();
        iIiIiIIIII5.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WVerticalList)iiiIiIIiIi3);
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractEntityEvent interactEntityEvent) {
        void iIiIiIIIII2;
        iiiIiIIiIi iiiIiIIiIi2 = iiiIiIIiIi3;
        if (iiiIiIIiIi2.iiiIIiIIii != VillagerRoller.State.ALLATORIxDEMO) {
            return;
        }
        iiiIiIIiIi iiiIiIIiIi3 = iIiIiIIIII2.entity;
        if (!(iiiIiIIiIi3 instanceof class_1646)) {
            return;
        }
        class_1646 class_16462 = (class_1646)iiiIiIIiIi3;
        iiiIiIIiIi2.IiiIiIiiIi = class_16462;
        iiiIiIIiIi2.iiiIIiIIii = VillagerRoller.State.iIIiIiiiIi;
        if (((Boolean)iiiIiIIiIi2.iiiIiiIIII.get()).booleanValue()) {
            IiIiIIiiii.iiIIiIIiii(IIiiIiIIIi.iiiIiIiiIi("]\u0010\u0012\u5f7b\u5225"));
        }
        iIiIiIIIII2.cancel();
    }
}

