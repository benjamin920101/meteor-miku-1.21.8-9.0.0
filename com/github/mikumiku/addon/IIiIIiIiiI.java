/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.BaritoneUtils
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import com.github.mikumiku.addon.IiIIIiIiiI;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIIIiiiiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiiIIIiiiI;
import com.github.mikumiku.addon.modules.AutoMiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.BaritoneUtils;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;

public class IIiIIiIiiI
extends iIiIiIIIii {
    private AutoMiner.MinerState iiIiIIiiii;
    private class_2338 iIIiIiiIiI;
    private final SettingGroup iIIIIIIiII;
    private Set<class_2338> iIIiiIIIIi;
    private iIIIiiiiiI IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final Setting<List<class_2248>> iIIIiiiiIi;
    private final Setting<Integer> iiiIiiIIII;
    private final iiIIiiIIIi iIiIIiIIIi;
    private class_2338 IIiIiiiiII;
    private class_2338 IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final SettingGroup iIiIiiiiII;
    private final Setting<Integer> IIIIiiIiii;
    private boolean IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private int iIIiiIiIiI;
    private final Setting<Integer> iiiiiIIiIi;
    private final Setting<AutoMiner.ToolType> iIIiIiiiIi;
    private int iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    private /* synthetic */ class_2338 IIIIiIIiII() {
        int n;
        IIiIIiIiiI iIiIIiIiiI;
        IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI = this;
        class_2338 class_23382 = iIiIIiIiiI2.iIIiiIiIiI.field_1724.method_24515();
        int n2 = (Integer)iIiIIiIiiI2.iiiiiIIiIi.get();
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23383 = class_23382.method_10069(n, n5, n7);
                    if (iIiIIiIiiI.iIIiiIiIiI.field_1687.method_8320(class_23383).method_26204() instanceof class_2480 && !class_23383.equals((Object)iIiIIiIiiI.iIIiIiiIiI)) {
                        return class_23383;
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return null;
    }

    private /* synthetic */ void IiiiiiiIIi() {
        IIiIIiIiiI iIiIIiIiiI = iIiIIiIiiI2;
        if (!BaritoneUtils.IS_AVAILABLE) {
            return;
        }
        try {
            IIiIIiIiiI iIiIIiIiiI2 = BaritoneAPI.getSettings();
            BaritoneAPI.getSettings().blocksToDisallowBreaking.value = new ArrayList();
            return;
        }
        catch (Exception exception) {
            iIiIIiIiiI.warning("\u6e05\u7406 Baritone \u4fdd\u62a4\u8bbe\u7f6e\u5931\u8d25: " + exception.getMessage(), new Object[3 ^ 3]);
            return;
        }
    }

    private /* synthetic */ boolean IIIIiIIiII() {
        IIiIIiIiiI iIiIIiIiiI = this;
        int n = 3 >> 2;
        int n2 = this = 0x6F & 0x19;
        while (true) {
            if (n2 >= 36) break;
            if (iIiIIiIiiI.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7960()) {
                ++n;
            }
            n2 = ++this;
        }
        if (n <= --2) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ void iiiIiIiiIi(int n, int n2) {
        int n3 = n;
        IIiIIiIiiI iIiIiIIIII2 = this;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1761 == null) {
            return;
        }
        iIiIiIIIII2.iIIiiIiIiI.field_1761.method_2906(iIiIiIIIII2.iIIiiIiIiI.field_1724.field_7512.field_7763, n3 += 0x1B & 0x7F, 5 >> 3, class_1713.field_7794, (class_1657)iIiIiIIIII2.iIIiiIiIiI.field_1724);
    }

    public void iIIiIiiiII() {
        IIiIIiIiiI iIiIIiIiiI = this;
        iIiIIiIiiI.iIIiIiiIiI = null;
        iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.iiiiiIIiIi;
        IiIiIIiiii.iiIIiIIiii(IiIIIiIiiI.ALLATORIxDEMO("\u5d9f\u513c\u6f66\u5f7a\u768f\u9065\u62b4\u5d9e\u91b0\u7f22\uff51\u8b9b\u9190\u65dc\u538e\u9562\u9054\u6285\u5d98\u513b\u6f21\u5f3d\u768f\uff6d"));
    }

    private /* synthetic */ class_2338 iiIIiIIiii() {
        int n;
        IIiIIiIiiI iIiIIiIiiI = this;
        class_2338 class_23382 = iIiIIiIiiI.iIIiiIiIiI.field_1724.method_24515();
        int n2 = n = 0xFFFFFFFD & 0xFFFFFFFF;
        while (true) {
            if (n2 > 3) break;
            int n3 = 0xFFFFFFFF & 0xFFFFFFFD;
            while (true) {
                int n4;
                if (n3 > 3) break;
                int n5 = 0xFFFFFFFF & 0xFFFFFFFD;
                while (true) {
                    if (n5 > 3) break;
                    class_2338 class_23383 = class_23382.method_10069(n, n4, this);
                    if (iIiIIiIiiI.iIIiiIiIiI.field_1687.method_8320(class_23383).method_26204() instanceof class_2480) {
                        return class_23383;
                    }
                    n5 = ++this;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ List<class_1792> ALLATORIxDEMO(AutoMiner.ToolType toolType) {
        IIiIIiIiiI iIiIIiIiiI = toolType2;
        AutoMiner.ToolType toolType2 = toolType;
        IIiIIiIiiI iIiIiIIIII2 = iIiIIiIiiI;
        switch (toolType2.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                class_1792[] class_1792Array = new class_1792[5];
                class_1792Array[5 >> 3] = class_1802.field_22023;
                class_1792Array[--1] = class_1802.field_8250;
                class_1792Array[1 ^ 3] = class_1802.field_8699;
                class_1792Array[--3] = class_1802.field_8776;
                class_1792Array[--4] = class_1802.field_8876;
                return Arrays.asList(class_1792Array);
            }
            case 1: {
                class_1792[] class_1792Array = new class_1792[5];
                class_1792Array[2 & 5] = class_1802.field_22024;
                class_1792Array[4 ^ 5] = class_1802.field_8377;
                class_1792Array[--2] = class_1802.field_8403;
                class_1792Array[--3] = class_1802.field_8387;
                class_1792Array[--4] = class_1802.field_8647;
                return Arrays.asList(class_1792Array);
            }
            case 2: {
                class_1792[] class_1792Array = new class_1792[5];
                class_1792Array[5 >> 3] = class_1802.field_22025;
                class_1792Array[--1] = class_1802.field_8556;
                class_1792Array[--2] = class_1802.field_8475;
                class_1792Array[--3] = class_1802.field_8062;
                class_1792Array[--4] = class_1802.field_8406;
                return Arrays.asList(class_1792Array);
            }
            case 3: 
        }
        class_1792[] class_1792Array = new class_1792[5];
        class_1792Array[3 & 4] = class_1802.field_22026;
        class_1792Array[--1] = class_1802.field_8527;
        class_1792Array[--2] = class_1802.field_8609;
        class_1792Array[--3] = class_1802.field_8431;
        class_1792Array[--4] = class_1802.field_8167;
        return Arrays.asList(class_1792Array);
    }

    private /* synthetic */ void IiiIIiIIIi() {
        BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(List list, class_1799 class_17992) {
        List iIiIiIIIII2 = class_17992;
        List iIiIiIIIII3 = list;
        return iIiIiIIIII3.contains(iIiIiIIIII2.method_7909());
    }

    private /* synthetic */ boolean iiIIiIIiii() {
        IIiIIiIiiI iIiIIiIiiI = this;
        List list = (List)iIiIIiIiiI.iIIIiiiiIi.get();
        int n = this = 3 >> 2;
        while (n < iIiIIiIiiI.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            class_1799 class_17992 = iIiIIiIiiI.iIIiiIiIiI.field_1724.method_31548().method_5438(this);
            if (!class_17992.method_7960()) {
                for (class_2248 class_22482 : list) {
                    if (class_17992.method_7909() != class_22482.method_8389()) continue;
                    return 5 >> 2;
                }
            }
            n = ++this;
        }
        return false;
    }

    private /* synthetic */ void IIIIiIIIII() {
        if (this.iIIiIiiIiI != null && this.iIIiiIiIiI.field_1724.method_24515().method_19771((class_2382)this.iIIiIiiIiI, 4.0)) {
            this.iiIiIIiiii = AutoMiner.MinerState.ALLATORIxDEMO;
            this.IiiIIiIIIi();
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiIIiIiiI iIiIIiIiiI = iIiIIiIiiI2;
        IIiIIiIiiI iIiIIiIiiI2 = pre;
        IIiIIiIiiI iIiIiIIIII2 = iIiIIiIiiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (iIiIiIIIII2.iiIiIIiiii == AutoMiner.MinerState.iiiiiIIiIi) {
            return;
        }
        if (iIiIiIIIII2.iIiIiIIIII > 0) {
            iIiIiIIIII2.iIiIiIIIII -= --1;
            return;
        }
        switch (iIiIiIIIII2.iiIiIIiiii.ordinal()) {
            case 1: {
                IIiIIiIiiI iIiIIiIiiI3 = iIiIiIIIII2;
                while (false) {
                }
                IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI3;
                iIiIIiIiiI3.IIIIiIiiii();
                break;
            }
            case 3: {
                IIiIIiIiiI iIiIIiIiiI5 = iIiIiIIIII2;
                IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI5;
                iIiIIiIiiI5.IIIIiIIiII();
                break;
            }
            case 4: {
                IIiIIiIiiI iIiIIiIiiI6 = iIiIiIIIII2;
                IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI6;
                iIiIIiIiiI6.iiIIiIIiii();
                break;
            }
            case 5: {
                IIiIIiIiiI iIiIIiIiiI7 = iIiIiIIIII2;
                IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI7;
                iIiIIiIiiI7.iIiIiIiIii();
                break;
            }
            case 6: {
                IIiIIiIiiI iIiIIiIiiI8 = iIiIiIIIII2;
                IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI8;
                iIiIIiIiiI8.IIIIiIIIII();
                break;
            }
            case 7: {
                IIiIIiIiiI iIiIIiIiiI9 = iIiIiIIIII2;
                IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI9;
                iIiIIiIiiI9.iiiIiIiiIi();
                break;
            }
            case 8: {
                IIiIIiIiiI iIiIIiIiiI10 = iIiIiIIIII2;
                IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI10;
                iIiIIiIiiI10.ALLATORIxDEMO();
                break;
            }
            case 9: {
                iIiIiIIIII2.IIiIiIiIiI();
            }
            default: {
                IIiIIiIiiI iIiIIiIiiI4 = iIiIiIIIII2;
            }
        }
        iIiIIiIiiI4.iIiIiIIIII = (Integer)iIiIiIIIII2.IIiIiIIiii.get();
    }

    private /* synthetic */ void IIIIiIiiii() {
        IIiIIiIiiI iIiIIiIiiI = iIiIIiIiiI2;
        if (iIiIIiIiiI.IIIIiIIiII()) {
            iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.IiiIiIiiIi;
            return;
        }
        if (iIiIIiIiiI.iiiIiIiiIi()) {
            iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.IIIIiiIiii;
            return;
        }
        IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI.ALLATORIxDEMO();
        if (iIiIIiIiiI2 != null) {
            if (iIiIIiIiiI.IIiiIIIIIi == null || !iIiIIiIiiI.IIiiIIIIIi.equals((Object)iIiIIiIiiI2)) {
                class_2338 class_23382;
                if (((Boolean)iIiIIiIiiI.iIiiiIiIii.get()).booleanValue() && !iIiIIiIiiI.iIiIIiIIIi.ALLATORIxDEMO((class_2338)iIiIIiIiiI2)) {
                    class_23382 = iIiIIiIiiI.iIIiiIiIiI.field_1724.method_24515();
                    IIiIIiIiiI iIiIIiIiiI3 = iIiIIiIiiI2;
                    double d = Math.sqrt(Math.pow(iIiIIiIiiI2.method_10263() - class_23382.method_10263(), 2.0) + Math.pow(iIiIIiIiiI3.method_10264() - class_23382.method_10264(), 2.0) + Math.pow(iIiIIiIiiI2.method_10260() - class_23382.method_10260(), 2.0));
                    if (iIiIIiIiiI3.method_10264() >= class_23382.method_10264() && d < 4.2) {
                        IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI2;
                        iIiIIiIiiI.iIiIIiIIIi.ALLATORIxDEMO((class_2338)iIiIIiIiiI4);
                        BlockUtils.breakBlock((class_2338)iIiIIiIiiI4, (boolean)(--1 != 0));
                    }
                }
                IIiIIiIiiI iIiIIiIiiI5 = iIiIIiIiiI;
                iIiIIiIiiI5.IIiiIIIIIi = iIiIIiIiiI2;
                iIiIIiIiiI5.IIiIiiiiII = iIiIIiIiiI5.iIIiiIiIiI.field_1724.method_24515();
                class_23382 = iIiIIiIiiI5.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIIiIiiI2).method_26204();
                BaritoneAPI.getProvider().getPrimaryBaritone().getMineProcess().mine(((List)iIiIIiIiiI.iIIIiiiiIi.get()).toArray(new class_2248[2 & 5]));
                return;
            }
        } else {
            IiIiIIiiii.iiIIiIIiii(IiIIIiIiiI.ALLATORIxDEMO("\u9639\u8f9d\u6cfc\u6765\u6203\u527c\u7693\u684b\u65e4\u573b"));
        }
    }

    private /* synthetic */ int iiiIiIiiIi() {
        IIiIIiIiiI iIiIIiIiiI = this;
        AutoMiner.ToolType toolType = (AutoMiner.ToolType)((Object)iIiIIiIiiI.iIIiIiiiIi.get());
        int n = this = 5 >> 3;
        while (n < iIiIIiIiiI.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI;
            class_1799 class_17992 = iIiIIiIiiI2.iIIiiIiIiI.field_1724.method_31548().method_5438(this);
            List<class_1792> list = iIiIIiIiiI2.ALLATORIxDEMO(toolType);
            if (!class_17992.method_7960() && list.contains(class_17992.method_7909()) && class_17992.method_7963() && class_17992.method_7936() - class_17992.method_7919() <= (Integer)iIiIIiIiiI.IIIIiiIiii.get()) {
                return this + (0x5F & 0x3B);
            }
            n = ++this;
        }
        int n2 = this = 0;
        while (n2 < iIiIIiIiiI.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            if (iIiIIiIiiI.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7960()) {
                return this + (0x5B & 0x3F);
            }
            n2 = ++this;
        }
        return -1;
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        int n;
        IIiIIiIiiI iIiIIiIiiI = object;
        Object object = (AutoMiner.ToolType)((Object)iIiIIiIiiI.iIIiIiiiIi.get());
        if (!(object = InvUtils.find(arg_0 -> IIiIIiIiiI.ALLATORIxDEMO(iIiIIiIiiI.ALLATORIxDEMO((AutoMiner.ToolType)((Object)object)), arg_0))).found()) {
            return (3 & 5) != 0;
        }
        object = iIiIIiIiiI.iIIiiIiIiI.field_1724.method_31548().method_5438(object.slot());
        if (!object.method_7963()) {
            return (3 ^ 3) != 0;
        }
        Object object2 = object;
        int this2 = object2.method_7936();
        if (this2 - (n = object2.method_7919()) <= (Integer)iIiIIiIiiI.IIIIiiIiii.get()) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    public void onDeactivate() {
        if (BaritoneUtils.IS_AVAILABLE) {
            IIiIIiIiiI iIiIIiIiiI = this;
            iIiIIiIiiI.IiiIIiIIIi();
            iIiIIiIiiI.IiiiiiiIIi();
        }
        IIiIIiIiiI iIiIIiIiiI = this;
        iIiIIiIiiI.iIiIIiIIIi.iiiIiIiiIi();
        iIiIIiIiiI.iIIiiIIIIi.clear();
        IiIiIIiiii.iiIIiIIiii(IiIIIiIiiI.ALLATORIxDEMO("\u81a6\u52f5\u637a\u63e5\u6a6d\u572a\u5dbe\u5001\u6b0e"));
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        IIiIIiIiiI iIiIIiIiiI = this;
        if (!(iIiIIiIiiI.iIIiiIiIiI.field_1755 instanceof class_495)) {
            return -4 >> 2;
        }
        IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI;
        class_1703 class_17032 = iIiIIiIiiI2.iIIiiIiIiI.field_1724.field_7512;
        AutoMiner.ToolType toolType = (AutoMiner.ToolType)((Object)iIiIIiIiiI2.iIIiIiiiIi.get());
        block0: for (class_1792 class_17922 : iIiIIiIiiI.ALLATORIxDEMO(toolType)) {
            int n = 3 & 4;
            while (true) {
                if (n >= 27 || this >= class_17032.field_7761.size()) continue block0;
                class_1799 class_17992 = class_17032.method_7611(this).method_7677();
                if (!(class_17992.method_7960() || class_17992.method_7909() != class_17922 || class_17992.method_7963() && class_17992.method_7936() - class_17992.method_7919() <= (Integer)iIiIIiIiiI.IIIIiiIiii.get())) {
                    return this;
                }
                n = ++this;
            }
        }
        return -1;
    }

    private /* synthetic */ void iiiIiIiIII() {
        IIiIIiIiiI iIiIIiIiiI = toolType;
        if (iIiIIiIiiI.iIIiiIiIiI.field_1761 == null) {
            return;
        }
        int n = iIiIIiIiiI.ALLATORIxDEMO();
        if (n != -4 >> 2) {
            int n2 = iIiIIiIiiI.iiiIiIiiIi();
            if (n2 != -4 >> 2) {
                IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI;
                iIiIIiIiiI2.ALLATORIxDEMO(n, n2);
                iIiIIiIiiI2.info(IiIIIiIiiI.ALLATORIxDEMO("\u83db\u53ab\u65fc\u5d98\u513b\u624d\u52f3"), new Object[3 ^ 3]);
                IIiIIiIiiI iIiIIiIiiI3 = iIiIIiIiiI;
                iIiIIiIiiI3.iiiiIIIiII();
                if (((Boolean)iIiIIiIiiI3.iiiIiIIiii.get()).booleanValue() && iIiIIiIiiI.IIiIiiiiII != null) {
                    iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.iIiiiIiIii;
                    BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(iIiIIiIiiI.IIiIiiiiII));
                    return;
                }
                iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.IIiIiIIiii;
                return;
            }
            iIiIIiIiiI.warning(iiiIIIiiiI.ALLATORIxDEMO("\u80f7\u5345\u5de9\u6e81\uff37\u65a0\u6cce\u83d7\u53ed\u65d0\u5dde\u5117\uff3a"), new Object[2 & 5]);
            iIiIIiIiiI.iiiiIIIiII();
            iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.IIiIiIIiii;
            return;
        }
        AutoMiner.ToolType toolType = (AutoMiner.ToolType)((Object)iIiIIiIiiI.iIIiIiiiIi.get());
        iIiIIiIiiI.warning("\u6f5c\u5f71\u76d2\u4e2d\u6ca1\u6709\u627e\u5230\u53ef\u7528\u7684" + toolType.ALLATORIxDEMO() + "\uff01", new Object[3 ^ 3]);
        iIiIIiIiiI.iiiiIIIiII();
        iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.IIiIiIIiii;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(class_1799 class_17992) {
        IIiIIiIiiI iIiIIiIiiI = this;
        if (!(iIiIIiIiiI.iIIiiIiIiI.field_1755 instanceof class_495)) {
            return -4 >> 2;
        }
        class_1703 class_17032 = iIiIIiIiiI.iIIiiIiIiI.field_1724.field_7512;
        int n = this = 3 ^ 3;
        while (true) {
            void iIiIiIIIII2;
            if (n >= 27 || this >= class_17032.field_7761.size()) break;
            class_1799 class_17993 = class_17032.method_7611(this).method_7677();
            if (class_17993.method_7960()) {
                return this;
            }
            if (class_17993.method_7909() == iIiIiIIIII2.method_7909() && class_17993.method_7947() < class_17993.method_7914()) {
                return this;
            }
            n = ++this;
        }
        return -1;
    }

    private /* synthetic */ void IIIIIIIiII() {
        int n;
        IIiIIiIiiI iIiIIiIiiI;
        IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI = this_;
        iIiIIiIiiI2.iIIiiIIIIi.clear();
        class_2338 class_23382 = iIiIIiIiiI2.iIIiiIiIiI.field_1724.method_24515();
        int this_ = (Integer)iIiIIiIiiI2.iiiiiIIiIi.get();
        int n2 = n = -this_;
        while (n2 <= this_) {
            int n3 = -this_;
            while (n3 <= this_) {
                int n4;
                int n5 = -this_;
                while (n5 <= this_) {
                    int n6;
                    class_2338 class_23383 = class_23382.method_10069(n, n4, n6);
                    if (iIiIIiIiiI.iIIiiIiIiI.field_1687.method_8320(class_23383).method_26204() instanceof class_2480) {
                        iIiIIiIiiI.iIIiiIIIIi.add(class_23383);
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        IiIiIIiiii.iiIIiIIiii("\u5df2\u626b\u63cf\u5230 " + iIiIIiIiiI.iIIiiIIIIi.size() + " \u4e2a\u6f5c\u5f71\u76d2\uff0c\u5c06\u88ab\u4fdd\u62a4");
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractBlockEvent interactBlockEvent) {
        void iIiIiIIIII2;
        IIiIIiIiiI iIiIIiIiiI = iIiIIiIiiI2;
        if (iIiIIiIiiI.iiIiIIiiii != AutoMiner.MinerState.iiiiiIIiIi) {
            return;
        }
        IIiIIiIiiI iIiIIiIiiI2 = iIiIiIIIII2.result.method_17777();
        if (iIiIIiIiiI.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIIiIiiI2).method_26204() instanceof class_2480) {
            iIiIIiIiiI.iIIiIiiIiI = iIiIIiIiiI2;
            iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.IIiIiIIiii;
            iIiIIiIiiI.IIiIiIiiii();
            iIiIiIIIII2.cancel();
            IiIiIIiiii.iiIIiIIiii("\u5de5\u5177\u6f5c\u5f71\u76d2\u5df2\u9009\u62e9: " + iIiIIiIiiI2.method_23854());
            IiIiIIiiii.iiIIiIIiii(iiiIIIiiiI.ALLATORIxDEMO("\u5d92\u4fe6\u62f5\u624a\u6764\u6f6a\u5f1d\u76e5\u5129\u8894\u6370\u63a5"));
            IiIiIIiiii.iiIIiIIiii(IiIIIiIiiI.ALLATORIxDEMO("\u5f6c\u59b6\u81a6\u52d5\u635a\u63c5\uff6d"));
            return;
        }
        iIiIIiIiiI.warning(iiiIIIiiiI.ALLATORIxDEMO("\u8b8a\u53d5\u9548\u7084\u5180\u6f7c\u5f11\u76e9\u6734\u9003\u6284\u5dd3\u511b\u5b6f\u50cc\u4f72\u7f08\uff3c"), new Object[5 >> 3]);
    }

    public IIiIIiIiiI() {
        IIiIIiIiiI iIiIIiIiiI = this;
        super(iiiIIIiiiI.ALLATORIxDEMO("\u630d\u6cc4\u6310\u4e17\u524b"), IiIIIiIiiI.ALLATORIxDEMO("\u81b7\u52c4\u634b\u63f4\u637a\u5bd6\u65e4\u573b\uff51\u6543\u637c\u8080\u5358\u7bcd\u747b\u54c0\u5d98\u513b\u66a9\u630e"));
        iIiIIiIiiI.iIiIiiiiII = iIiIIiIiiI.settings.getDefaultGroup();
        iIiIIiIiiI.iIIIIIIiII = iIiIIiIiiI.settings.createGroup(iiiIIIiiiI.ALLATORIxDEMO("\u6f47\u5f2c\u76d4\u8ba9\u7f22"));
        iIiIIiIiiI.ALLATORIxDEMO = iIiIIiIiiI.settings.createGroup(IiIIIiIiiI.ALLATORIxDEMO("\u5d98\u513b\u7bfc\u746a"));
        class_2248[] class_2248Array = new class_2248[5 >> 2];
        class_2248Array[3 & 4] = class_2246.field_10102;
        iIiIIiIiiI.iIIIiiiiIi = iIiIIiIiiI.iIiIiiiiII.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u634b\u639e\u76f9\u684b"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u89ed\u636b\u63d4\u76d9\u65d5\u572a\u7c37\u57f6l\u5947\u9065"))).defaultValue(Arrays.asList(class_2248Array))).build());
        this.iiiIiiIIII = this.iIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u634b\u639e\u8314\u56b8"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u6450\u7d7f\u7682\u687a\u65f5\u572a\u76c8\u835e\u5698"))).defaultValue((Object)(0x78 & 0x27))).min(--4).max(0x8DD & 0x77EA).sliderMin(0x69 & 0x1E).sliderMax(0x25C8 & 0x5AFF).build());
        this.iIiiiIiIii = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u4f3f\u7533\u67dc\u9019\u5312\u635a"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u4f22\u7544\u5378\u635a\u4e2c\u637a\u5435\u5698\u7693\u684b\u65e4\u573b\uff71\u53a3\u8080\u632d\u4e50\u525c"))).defaultValue((Object)(5 >> 3))).build());
        this.IIiIiIIiii = this.iIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u5ee1\u8f93"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u64a1\u4f01\u4e27\u9589\u76c8\u5eab\u8fb3\uff758\u0014/6\uff65"))).defaultValue((Object)(--5))).min(5 >> 3).max(0x55 & 0x3E).sliderMin(3 ^ 3).sliderMax(0x1E & 0x75).build());
        this.iiiIiIIiii = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u81b7\u52ae\u8fc3\u5692"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u5bc0\u624d\u5b34\u50f5\u627a\u53ab\u5da9\u512a\u5462\u8197\u52e4\u8fa9\u5692\u634b\u63f4"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiiiiIIiIi = this.iIIIIIIiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u6f40\u5f31\u76c9\u6441\u7d24\u535d\u5fc8"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u6461\u7d6e\u6f01\u5f1d\u76af\u76c8\u5337\u5fc8\u835e\u5698"))).defaultValue((Object)(0x79 & 0x26))).min(--4).max(0x70E9 & 0xFDE).sliderMin(0x3C & 0x4B).sliderMax(0xFCA & 0x70FD).build());
        this.iIIiIiiiIi = this.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u5db8\u5171\u7c6c\u57c7"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u9045\u62b4\u4f13\u7555\u76c8\u5d98\u513b\u7c26\u57e7"))).defaultValue((Object)AutoMiner.ToolType.iIIiiIiIiI)).build());
        this.IIIIiiIiii = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u671b\u4f13\u8016\u4e52\u5eea"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u5db8\u511b\u806d\u4e09\u5efb\u4f22\u4ef3\u6b28\u5041\u65ba\u66a9\u630e"))).defaultValue((Object)(0x5B & 0x2E))).min(3 >> 1).max(0x6E & 0x75).build());
        IIiIIiIiiI iIiIIiIiiI2 = this;
        IIiIIiIiiI iIiIIiIiiI3 = this;
        IIiIIiIiiI iIiIIiIiiI4 = this;
        this.iiIiIIiiii = AutoMiner.MinerState.iiiiiIIiIi;
        iIiIIiIiiI4.iIiIiIIIII = 3 >> 2;
        iIiIIiIiiI4.IiiiiIiIiI = iIIIIiIiii.ALLATORIxDEMO();
        iIiIIiIiiI4.IIiIiiiiII = null;
        iIiIIiIiiI3.IIiiIIIIIi = null;
        iIiIIiIiiI3.iIIiIiiIiI = null;
        IIiIIiIiiI iIiIIiIiiI5 = this;
        iIiIIiIiiI3.iIIiiIIIIi = new HashSet<class_2338>();
        iIiIIiIiiI2.iIIiiIiIiI = 2 & 5;
        iIiIIiIiiI2.IiiIiIiiIi = 2 & 5;
        IIiIIiIiiI iIiIIiIiiI6 = this;
        iIiIIiIiiI2.iIiIIiIIIi = new iiIIiiIIIi(5000L);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiIIIiiiI.ALLATORIxDEMO("0W%z\u0013^`n0\u007f\u0001Opo`\u8bec\u66b3\u65ac\u5270\u671b\u65ed\u724e\u673b\uff4d"));
        }
    }

    private /* synthetic */ class_2338 iiiIiIiiIi() {
        int n;
        IIiIIiIiiI iIiIIiIiiI;
        IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI = this;
        class_2338 class_23382 = iIiIIiIiiI2.iIIiiIiIiI.field_1724.method_24515();
        int n2 = (Integer)iIiIIiIiiI2.iiiiiIIiIi.get();
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23383 = class_23382.method_10069(n, n5, n7);
                    if (iIiIIiIiiI.iIIiiIiIiI.field_1687.method_8320(class_23383).method_26204() instanceof class_2480 && !class_23383.equals((Object)iIiIIiIiiI.iIIiIiiIiI)) {
                        return class_23383;
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return null;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1755 instanceof class_495 || this.iIIiiIiIiI.field_1755 instanceof class_465) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        IIiIIiIiiI iIiIIiIiiI = iIiIIiIiiI2;
        IIiIIiIiiI iIiIIiIiiI2 = class_23382;
        IIiIIiIiiI iIiIiIIIII2 = iIiIIiIiiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1761 == null || iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        try {
            if (!iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24515().method_19771((class_2382)iIiIIiIiiI2, 5.0)) {
                iIiIiIIIII2.warning(iiiIIIiiiI.ALLATORIxDEMO("\u8dbd\u7980\u6f0d\u5f7b\u76bf\u591c\u8fb0\uff3b\u6584\u6cea\u6235\u5f3d"), new Object[2 & 5]);
                return;
            }
            class_2248 class_22482 = iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iIiIIiIiiI2).method_26204();
            if (!(class_22482 instanceof class_2480)) {
                iIiIiIIIII2.warning("\u76ee\u6807\u4f4d\u7f6e\u4e0d\u662f\u6f5c\u5f71\u76d2: " + iIiIIiIiiI2.method_23854(), new Object[3 >> 2]);
                return;
            }
            class_243 class_2432 = class_243.method_24953((class_2382)iIiIIiIiiI2);
            class_2350 class_23502 = class_2350.field_11036;
            class_2432 = new class_3965(class_2432, class_23502, (class_2338)iIiIIiIiiI2, 3 >> 2);
            IIiIIiIiiI iIiIIiIiiI3 = iIiIiIIIII2;
            iIiIiIIIII2.iIIiiIiIiI.field_1761.method_2896(iIiIIiIiiI3.iIIiiIiIiI.field_1724, class_1268.field_5808, (class_3965)class_2432);
            iIiIIiIiiI3.info("\u6b63\u5728\u6253\u5f00\u6f5c\u5f71\u76d2: " + iIiIIiIiiI2.method_23854(), new Object[3 & 4]);
            return;
        }
        catch (Exception exception) {
            iIiIiIIIII2.error("\u6253\u5f00\u6f5c\u5f71\u76d2\u65f6\u53d1\u751f\u9519\u8bef: " + exception.getMessage(), new Object[5 >> 3]);
            return;
        }
    }

    private /* synthetic */ void IIiIiIiiii() {
        IIiIIiIiiI iIiIIiIiiI = arrayList;
        if (!BaritoneUtils.IS_AVAILABLE) {
            return;
        }
        try {
            Settings settings = BaritoneAPI.getSettings();
            ArrayList arrayList = new ArrayList();
            arrayList.add(class_2246.field_10603);
            arrayList.add(class_2246.field_10199);
            arrayList.add(class_2246.field_10407);
            arrayList.add(class_2246.field_10063);
            arrayList.add(class_2246.field_10203);
            arrayList.add(class_2246.field_10600);
            arrayList.add(class_2246.field_10275);
            arrayList.add(class_2246.field_10051);
            arrayList.add(class_2246.field_10140);
            arrayList.add(class_2246.field_10320);
            arrayList.add(class_2246.field_10532);
            arrayList.add(class_2246.field_10268);
            arrayList.add(class_2246.field_10605);
            arrayList.add(class_2246.field_10373);
            arrayList.add(class_2246.field_10055);
            arrayList.add(class_2246.field_10068);
            arrayList.add(class_2246.field_10371);
            settings.blocksToDisallowBreaking.value = arrayList;
            iIiIIiIiiI.info(IiIIIiIiiI.ALLATORIxDEMO("\u5daf\u8bd2\u7f33L?-/\u0005)\u0003\u0013)}\u4fb1\u62d9\u620c\u6774\u6f10\u5f2c\u76be"), new Object[5 >> 3]);
            return;
        }
        catch (Exception exception) {
            iIiIIiIiiI.warning("\u8bbe\u7f6e Baritone \u4fdd\u62a4\u5931\u8d25: " + exception.getMessage(), new Object[5 >> 3]);
            return;
        }
    }

    private /* synthetic */ class_2338 ALLATORIxDEMO() {
        int n;
        IIiIIiIiiI iIiIIiIiiI;
        IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI = this;
        class_2338 class_23382 = iIiIIiIiiI2.iIIiiIiIiI.field_1724.method_24515();
        class_2338 class_23383 = null;
        double d = Double.MAX_VALUE;
        List list = (List)iIiIIiIiiI2.iIIIiiiiIi.get();
        int n2 = (Integer)iIiIIiIiiI.iiiIiiIIII.get();
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23384 = class_23382.method_10069(n, n5, n7);
                    class_2248 class_22482 = iIiIIiIiiI.iIIiiIiIiI.field_1687.method_8320(class_23384).method_26204();
                    if (list.contains(class_22482)) {
                        double d2;
                        double d3 = class_23382.method_10262((class_2382)class_23384);
                        if (d2 < d) {
                            d = d3;
                            class_23383 = class_23384;
                        }
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return class_23383;
    }

    private /* synthetic */ void ALLATORIxDEMO(int n, int n2) {
        int n3 = n;
        IIiIIiIiiI iIiIiIIIII2 = this;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1761 == null) {
            return;
        }
        iIiIiIIIII2.iIIiiIiIiI.field_1761.method_2906(iIiIiIIIII2.iIIiiIiIiI.field_1724.field_7512.field_7763, n3, 3 >> 2, class_1713.field_7794, (class_1657)iIiIiIIIII2.iIIiiIiIiI.field_1724);
    }

    @Override
    public void onActivate() {
        super.onActivate();
        if (!BaritoneUtils.IS_AVAILABLE) {
            this.error(iiiIIIiiiI.ALLATORIxDEMO("S<t)o0j-3\u4e50\u53e9\u7564\uff16"), new Object[3 ^ 3]);
            this.toggle();
            return;
        }
        IIiIIiIiiI iIiIIiIiiI = this;
        this.iiIiIIiiii = AutoMiner.MinerState.iiiiiIIiIi;
        iIiIIiIiiI.iIiIiIIIII = 2 & 5;
        iIiIIiIiiI.IIiIiiiiII = null;
        this.IIiiIIIIIi = null;
        this.iIIiIiiIiI = null;
        this.iIIiiIIIIi.clear();
        this.iIIiiIiIiI = 5 >> 3;
        this.IiiIiIiiIi = 3 >> 2;
        this.iIiIIiIIIi.iiIIiIIiii();
        this.IIIIIIIiII();
        IiIiIIiiii.iiIIiIIiii(IiIIIiIiiI.ALLATORIxDEMO("\u81a6\u52f5\u637a\u63e5\u6a6d\u572a\u5dbe\u5472\u52c4"));
        IiIiIIiiii.iiIIiIIiii(iiiIIIiiiI.ALLATORIxDEMO("\u8beb\u539b\u951d\u70f3\u51ea\u5db8\u5171\u5b18\u50b3\u6f03\u5f75\u769a\u6776\u9054\u62ef\u5bcf\uff16"));
    }

    private /* synthetic */ void iIiIiiiiii() {
        IIiIIiIiiI iIiIIiIiiI;
        IIiIIiIiiI iIiIIiIiiI2;
        block15: {
            int n;
            iIiIIiIiiI2 = iIiIIiIiiI3;
            if (iIiIIiIiiI2.iIIiiIiIiI.field_1761 == null) {
                return;
            }
            int n2 = 0;
            int n3 = 0x5F & 0x3B;
            List list = (List)iIiIIiIiiI2.iIIIiiiiIi.get();
            int cfr_ignored_0 = 3 ^ 3;
            int n4 = n = 0x7B & 0xD;
            while (true) {
                if (n4 >= 36) break;
                IIiIIiIiiI iIiIIiIiiI3 = iIiIIiIiiI2.iIIiiIiIiI.field_1724.method_31548().method_5438(n);
                if (!iIiIIiIiiI3.method_7960()) {
                    int n5;
                    block14: {
                        int n6 = 5 >> 3;
                        for (class_2248 class_22482 : list) {
                            if (iIiIIiIiiI3.method_7909() != class_22482.method_8389()) continue;
                            n5 = n6 = 5 >> 2;
                            break block14;
                        }
                        n5 = n6;
                    }
                    if (n5 != 0) {
                        int n7 = iIiIIiIiiI2.ALLATORIxDEMO((class_1799)iIiIIiIiiI3);
                        if (n7 != -4 >> 2) {
                            IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI2;
                            ++n2;
                            iIiIIiIiiI4.iiiIiIiiIi(n, n7);
                            int n8 = 3 & 5;
                            iIiIIiIiiI4.info("\u79fb\u52a8" + iIiIIiIiiI3.method_7909().method_63680().getString() + "\u5230\u6f5c\u5f71\u76d2\uff0c\u6570\u91cf: " + iIiIIiIiiI3.method_7947(), new Object[2 & 5]);
                            if (n2 >= n3) {
                                iIiIIiIiiI = iIiIIiIiiI2;
                                break block15;
                            }
                        } else {
                            IIiIIiIiiI iIiIIiIiiI5;
                            class_2248 class_22482;
                            class_22482 = iIiIIiIiiI2.IIIIiIIiII();
                            if (class_22482 != null) {
                                IIiIIiIiiI iIiIIiIiiI6 = iIiIIiIiiI2;
                                IIiIIiIiiI iIiIIiIiiI7 = iIiIIiIiiI2;
                                iIiIIiIiiI7.iiiiIIIiII();
                                iIiIIiIiiI7.ALLATORIxDEMO((class_2338)class_22482);
                                iIiIIiIiiI6.IiiIiIiiIi = 4 ^ 5;
                                iIiIIiIiiI6.iIIiiIiIiI = 3 ^ 3;
                                return;
                            }
                            IIiIIiIiiI iIiIIiIiiI8 = iIiIIiIiiI2;
                            iIiIIiIiiI8.iiiiIIIiII();
                            if (((Boolean)iIiIIiIiiI8.iiiIiIIiii.get()).booleanValue() && iIiIIiIiiI2.IIiIiiiiII != null) {
                                iIiIIiIiiI5 = iIiIIiIiiI2;
                                iIiIIiIiiI2.iiIiIIiiii = AutoMiner.MinerState.iIiiiIiIii;
                                BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(iIiIIiIiiI2.IIiIiiiiII));
                            } else {
                                iIiIIiIiiI5 = iIiIIiIiiI2;
                                iIiIIiIiiI2.iiIiIIiiii = AutoMiner.MinerState.IIiIiIIiii;
                            }
                            iIiIIiIiiI5.info(IiIIIiIiiI.ALLATORIxDEMO("\u7214\u548d\u5b25\u50e4\u5bd1\u627c"), new Object[2 & 5]);
                            return;
                        }
                    }
                }
                n4 = ++n;
            }
            iIiIIiIiiI = iIiIIiIiiI2;
        }
        if (!iIiIIiIiiI.iiIIiIIiii()) {
            IIiIIiIiiI iIiIIiIiiI9;
            IIiIIiIiiI iIiIIiIiiI10 = iIiIIiIiiI2;
            iIiIIiIiiI10.iiiiIIIiII();
            if (((Boolean)iIiIIiIiiI10.iiiIiIIiii.get()).booleanValue() && iIiIIiIiiI2.IIiIiiiiII != null) {
                iIiIIiIiiI9 = iIiIIiIiiI2;
                iIiIIiIiiI2.iiIiIIiiii = AutoMiner.MinerState.iIiiiIiIii;
                BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(iIiIIiIiiI2.IIiIiiiiII));
            } else {
                iIiIIiIiiI9 = iIiIIiIiiI2;
                iIiIIiIiiI2.iiIiIIiiii = AutoMiner.MinerState.IIiIiIIiii;
            }
            iIiIIiIiiI9.info(iiiIIIiiiI.ALLATORIxDEMO("\u7229\u54da\u5b18\u50b3\u5bcc\u620b"), new Object[5 >> 3]);
        }
    }

    private /* synthetic */ void iIiIiIiIii() {
        IIiIIiIiiI iIiIIiIiiI = this;
        if ((this = iIiIIiIiiI.iiIIiIIiii()) != null && iIiIIiIiiI.iIIiiIiIiI.field_1724.method_24515().method_19771((class_2382)this, 4.0)) {
            iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.IIiiIIIIIi;
            iIiIIiIiiI.IiiIIiIIIi();
        }
    }

    private /* synthetic */ void IIiIiIiIiI() {
        if (this.IIiIiiiiII != null && this.iIIiiIiIiI.field_1724.method_24515().method_19771((class_2382)this.IIiIiiiiII, 3.0)) {
            IIiIIiIiiI iIiIIiIiiI = this;
            iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.IIiIiIIiii;
            iIiIIiIiiI.IiiIIiIIIi();
            iIiIIiIiiI.info(iiiIIIiiiI.ALLATORIxDEMO("\u5de9\u8fb4\u56e5\u6356\u6383\u4f2d\u7f55"), new Object[3 >> 2]);
        }
    }

    private /* synthetic */ void iiiiIIIiII() {
        if (this.iIIiiIiIiI.field_1755 instanceof class_495) {
            this.iIIiiIiIiI.field_1724.method_7346();
            IiIiIIiiii.iiIIiIIiii(IiIIIiIiiI.ALLATORIxDEMO("\u513f\u9590\u6f10\u5f2c\u76be"));
        }
    }

    private /* synthetic */ void IIIIiIIiII() {
        IIiIIiIiiI iIiIIiIiiI = iIiIIiIiiI2;
        IiIiIIiiii.iiIIiIIiii(iiiIIIiiiI.ALLATORIxDEMO("\u808c\u531e\u5d92\u6eda\uff6c\u6427\u7d62\u5b43\u50c8\u6f67\u5f11\u76e9"));
        IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI.iiiIiIiiIi();
        if (iIiIIiIiiI2 != null) {
            iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.iIiIiIIIII;
            iIiIIiIiiI.IiiIIiIIIi();
            BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock((class_2338)iIiIIiIiiI2));
            IiIiIIiiii.iiIIiIIiii("\u627e\u5230\u5b58\u50a8\u6f5c\u5f71\u76d2: " + iIiIIiIiiI2.method_23854());
            return;
        }
        iIiIIiIiiI.error(IiIIIiIiiI.ALLATORIxDEMO("\u6766\u6223\u525c\u5b25\u50e4\u6f21\u5f3d\u768f\uff6d"), new Object[5 >> 3]);
        iIiIIiIiiI.iiIiIIiiii = AutoMiner.MinerState.IIiIiIIiii;
    }

    private /* synthetic */ void iiIIiIIiii() {
        IiIiIIiiii.iiIIiIIiii("\u5de5\u5177\u8010\u4e45\u5ea6\u8fc7\u4f4e\uff0c\u524d\u5f80\u5de5\u5177\u6f5c\u5f71\u76d2\u83b7\u53d6" + ((AutoMiner.ToolType)((Object)this.iIIiIiiiIi.get())).ALLATORIxDEMO());
        if (this.iIIiIiiIiI != null) {
            this.iiIiIIiiii = AutoMiner.MinerState.iIIiiIiIiI;
            BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(this.iIIiIiiIiI));
            IiIiIIiiii.iiIIiIIiii("\u524d\u5f80\u5de5\u5177\u5b58\u50a8\u6f5c\u5f71\u76d2: " + this.iIIiIiiIiI.method_23854());
            return;
        }
        this.error(iiiIIIiiiI.ALLATORIxDEMO("\u5dde\u5137\u6f47\u5f31\u76c9\u4f2d\u7f55\u676a\u8ba5\u7f2e\uff1a\u8b97\u91f6\u65d0\u5414\u52e8\u6a3a\u5737\u5e4d\u9069\u62d2\u5da5\u516c\u6f1c\u5f6a\u7692\u3019"), new Object[3 ^ 3]);
        this.iiIiIIiiii = AutoMiner.MinerState.iiiiiIIiIi;
        IiIiIIiiii.iiIIiIIiii(IiIIIiIiiI.ALLATORIxDEMO("\u8b9b\u538e\u9562\u70e4\u5197\u5db8\u511b\u5b25\u50e4\u6f01\u5f1d\u76af\u6729\u9074\u62a5\u5bde\uff6d"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void iiiIiIiiIi() {
        IIiIIiIiiI iIiIIiIiiI;
        IIiIIiIiiI iIiIIiIiiI2 = iIiIIiIiiI5;
        if (iIiIIiIiiI2.ALLATORIxDEMO()) {
            iIiIIiIiiI2.iIiIiiiiii();
            return;
        }
        if (iIiIIiIiiI2.IiiIiIiiIi) {
            IIiIIiIiiI iIiIIiIiiI3 = iIiIIiIiiI2;
            iIiIIiIiiI3.iIIiiIiIiI += 4 ^ 5;
            if (iIiIIiIiiI3.iIIiiIiIiI <= (0x3F & 0x68)) return;
            iIiIIiIiiI2.IiiIiIiiIi = 5 >> 3;
            iIiIIiIiiI2.iIIiiIiIiI = iIiIIiIiiI2.IiiIiIiiIi;
            iIiIIiIiiI2.warning(iiiIIIiiiI.ALLATORIxDEMO("\u6f3c\u5f4a\u7692\u6248\u5f60\u8dbe\u65b6\uff17\u918d\u8bce\u4e4d\u0015n5"), new Object[3 ^ 3]);
            iIiIIiIiiI = iIiIIiIiiI2;
        } else {
            iIiIIiIiiI = iIiIIiIiiI2;
        }
        IIiIIiIiiI iIiIIiIiiI4 = iIiIIiIiiI2;
        if (iIiIIiIiiI.ALLATORIxDEMO()) {
            iIiIIiIiiI4.iIiIiiiiii();
            return;
        }
        IIiIIiIiiI iIiIIiIiiI5 = iIiIIiIiiI4.iiIIiIIiii();
        IIiIIiIiiI iIiIIiIiiI6 = iIiIIiIiiI2;
        if (iIiIIiIiiI5 != null) {
            iIiIIiIiiI6.ALLATORIxDEMO((class_2338)iIiIIiIiiI5);
            IIiIIiIiiI iIiIIiIiiI7 = iIiIIiIiiI2;
            iIiIIiIiiI7.IiiIiIiiIi = 3 & 5;
            iIiIIiIiiI7.iIIiiIiIiI = 5 >> 3;
            return;
        }
        iIiIIiIiiI6.error(IiIIIiIiiI.ALLATORIxDEMO("\u9639\u8f9d\u6cfc\u6765\u6203\u527c\u6f21\u5f3d\u768f\uff6d"), new Object[2 & 5]);
        iIiIIiIiiI2.iiIiIIiiii = AutoMiner.MinerState.IIiIiIIiii;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void ALLATORIxDEMO() {
        IIiIIiIiiI iIiIIiIiiI;
        if (this.ALLATORIxDEMO()) {
            this.iiiIiIiIII();
            return;
        }
        if (this.IiiIiIiiIi) {
            IIiIIiIiiI iIiIIiIiiI2 = this;
            iIiIIiIiiI2.iIIiiIiIiI += 3 & 5;
            if (iIiIIiIiiI2.iIIiiIiIiI <= (0x2D & 0x7A)) return;
            this.IiiIiIiiIi = 5 >> 3;
            this.iIIiiIiIiI = this.IiiIiIiiIi;
            this.warning(iiiIIIiiiI.ALLATORIxDEMO("\u5d83\u514a\u6f27\u5f51\u76b2\u6268\u5f51\u8d8f\u659b\uff3a\u91a1\u8be2\u4e49\u0011H\u0013"), new Object[3 >> 2]);
            iIiIIiIiiI = this;
        } else {
            iIiIIiIiiI = this;
        }
        IIiIIiIiiI iIiIIiIiiI3 = this;
        if (iIiIIiIiiI.ALLATORIxDEMO()) {
            iIiIIiIiiI3.iiiIiIiIII();
            return;
        }
        IIiIIiIiiI iIiIIiIiiI4 = this;
        if (iIiIIiIiiI3.iIIiIiiIiI != null) {
            iIiIIiIiiI4.ALLATORIxDEMO(this.iIIiIiiIiI);
            IIiIIiIiiI iIiIIiIiiI5 = this;
            iIiIIiIiiI5.IiiIiIiiIi = --1;
            iIiIIiIiiI5.iIIiiIiIiI = 3 & 4;
            return;
        }
        iIiIIiIiiI4.error(IiIIIiIiiI.ALLATORIxDEMO("\u5d89\u510a\u6f10\u5f2c\u76be\u4f30\u7f22\u6757\u8bf2\u7f33\uff6d"), new Object[2 & 5]);
        this.iiIiIIiiii = AutoMiner.MinerState.iiiiiIIiIi;
    }
}

