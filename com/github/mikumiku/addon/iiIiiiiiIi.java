/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BlockSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiiiIiI;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.github.mikumiku.addon.modules.CometTunnel;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class iiIiiiiiIi
extends iIiIiIIIii {
    private class_2338 IIiiIIIIIi;
    private int iIiiiIiIii;
    private final Setting<class_2248> iIiIiiiiII;
    private CometTunnel.TunnelState IIIIiiIiii;
    private class_2338 IiiIiIiiIi;
    private int IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private class_2338 iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    public void onDeactivate() {
        iiIiiiiiIi iiIiiiiiIi2 = this;
        iiIiiiiiIi iiIiiiiiIi3 = this;
        this.IIIIiiIiii = CometTunnel.TunnelState.iIIiIiiiIi;
        iiIiiiiiIi3.IiiIiIiiIi = null;
        iiIiiiiiIi3.iIIiIiiiIi = null;
        iiIiiiiiIi2.iIiiiIiIii = 2 & 5;
        iiIiiiiiIi2.IIiiIIIIIi = null;
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u5f49\u665d\u96a6\u9006\u6a37\u5717\u5df1\u500d\u6b70"));
    }

    public iiIiiiiiIi() {
        iiIiiiiiIi iiIiiiiiIi2 = this;
        super(IiIIiiiIiI.ALLATORIxDEMO("\u6376i\u5841!"), iiIIIIiiiI.ALLATORIxDEMO("\u636b\r\u5836/(f}\u6294\u81b0\u5de8\u5796\u8fc5\u4e40\u4e29\u575b\u9185"));
        iiIiiiiiIi2.ALLATORIxDEMO = iiIiiiiiIi2.settings.getDefaultGroup();
        iiIiiiiiIi2.iiiiiIIiIi = iiIiiiiiIi2.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u524d\u5ed2\u818a\u52f2\u5076\u6b72"))).description(iiIIIIiiiI.ALLATORIxDEMO("\u526d\u8fa0\u57a0\u5cb0\u5c1f\u65e8\u81aa\u52ab\u5056\u6b2b"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiIiIiI = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u5edc\u8fcf"))).description(iiIIIIiiiI.ALLATORIxDEMO("\u64d3\u4f54\u4e00\u95a9\u769a\u5eac\u8fc6\uff55j)`a\uff40"))).defaultValue((Object)(--2))).min(3 ^ 3).max(0x17 & 0x7C).sliderMin(3 ^ 3).sliderMax(0x57 & 0x3C).build());
        this.iIiIiiiiII = this.ALLATORIxDEMO.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u580b\u511f\u6593\u5747"))).description(iiIIIIiiiI.ALLATORIxDEMO("\u7536\u4ed4\u5872\u5118\u769a\u65f9\u5754\u7c71\u57c2"))).defaultValue((Object)class_2246.field_10445)).build());
        this.iIiIiIIIII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u818a\u52f2\u5841\u5155"))).description(iiIIIIiiiI.ALLATORIxDEMO("\u81f4\u52f2\u5731\u8ef6\u5410\u582b\u5146\u65b3\u571e"))).defaultValue((Object)(--1 != 0))).build());
        iiIiiiiiIi iiIiiiiiIi3 = this;
        iiIiiiiiIi iiIiiiiiIi4 = this;
        iiIiiiiiIi iiIiiiiiIi5 = this;
        iiIiiiiiIi5.IIIIiiIiii = CometTunnel.TunnelState.iIIiIiiiIi;
        iiIiiiiiIi5.IIiIiIIiii = 3 & 4;
        iiIiiiiiIi4.IiiIiIiiIi = null;
        iiIiiiiiIi4.iIIiIiiiIi = null;
        iiIiiiiiIi3.iIiiiIiIii = 3 >> 2;
        iiIiiiiiIi3.IIiiIIIIIi = null;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiiiIiI.ALLATORIxDEMO("-+\u0018&\u000e\"]2-\u0003\u001c3M3]\u8bb0\u668e\u65f0\u524d\u6747\u65d0\u7212\u6706\uff11"));
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iiIiiiiiIi iiIiiiiiIi2 = iiIiiiiiIi3;
        iiIiiiiiIi iiIiiiiiIi3 = class_23382;
        iiIiiiiiIi iIiIiIIIII2 = iiIiiiiiIi2;
        if (iIiIiIIIII2.IiiIiIiiIi == null || iIiIiIIIII2.iIIiIiiiIi == null) {
            return false;
        }
        if (iiIiiiiiIi3.method_10263() == iIiIiIIIII2.IiiIiIiiIi.method_10263() && iiIiiiiiIi3.method_10260() == iIiIiIIIII2.IiiIiIiiIi.method_10260() && iiIiiiiiIi3.method_10264() <= iIiIiIIIII2.IiiIiIiiIi.method_10264() && iiIiiiiiIi3.method_10264() >= iIiIiIIIII2.iIIiIiiiIi.method_10264()) {
            return (3 & 5) != 0;
        }
        return false;
    }

    @Override
    public void onActivate() {
        iiIiiiiiIi iiIiiiiiIi2 = this;
        iiIiiiiiIi iiIiiiiiIi3 = this;
        super.onActivate();
        this.IIIIiiIiii = CometTunnel.TunnelState.iiiiiIIiIi;
        this.IIiIiIIiii = 3 >> 2;
        iiIiiiiiIi3.IiiIiIiiIi = null;
        iiIiiiiiIi3.iIIiIiiiIi = null;
        iiIiiiiiIi2.iIiiiIiIii = 3 ^ 3;
        iiIiiiiiIi2.IIiiIIIIIi = null;
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u5f49\u665d\u96a6\u9006\u6a37\u5717\u5df1\u547e\u52ba"));
        IiIiIIiiii.iiIIiIIiii(IiIIiiiIiI.ALLATORIxDEMO("\u8b8d\u5768\u814f\u4e64\u5384\u9563\u70d9\u51a1\u65c4\u5710\u6707\u9051\u629c\u8d38\u59ab\u4f17\u7f1f\uff4a"));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractBlockEvent interactBlockEvent) {
        iiIiiiiiIi iiIiiiiiIi2 = iiIiiiiiIi3;
        iiIiiiiiIi iiIiiiiiIi3 = interactBlockEvent;
        iiIiiiiiIi iIiIiIIIII2 = iiIiiiiiIi2;
        if (iIiIiIIIII2.IIIIiiIiii != CometTunnel.TunnelState.iiiiiIIiIi) {
            return;
        }
        iiIiiiiiIi iiIiiiiiIi4 = iiIiiiiiIi3;
        iiIiiiiiIi3 = ((InteractBlockEvent)iiIiiiiiIi4).result.method_17777();
        iiIiiiiiIi iiIiiiiiIi5 = iIiIiIIIII2;
        iiIiiiiiIi iiIiiiiiIi6 = iIiIiIIIII2;
        iiIiiiiiIi6.IiiIiIiiIi = iiIiiiiiIi3;
        iiIiiiiiIi6.iIIiIiiiIi = iiIiiiiiIi3;
        iiIiiiiiIi6.IIIIiiIiii = CometTunnel.TunnelState.iIIiiIiIiI;
        iiIiiiiiIi5.iIiiiIiIii = 5 >> 3;
        iiIiiiiiIi5.IIiiIIIIIi = null;
        iiIiiiiiIi4.cancel();
        IiIiIIiiii.iiIIiIIiii("\u8d77\u59cb\u4f4d\u7f6e\u5df2\u9009\u62e9: " + iIiIiIIIII2.IiiIiIiiIi.method_23854());
        IiIiIIiiii.iiIIiIIiii(IiIIiiiIiI.ALLATORIxDEMO("\u5f7c\u5996\u6371\u63f4\u96f1\u9003Jy\u637dj\u5808jH"));
    }

    private /* synthetic */ String ALLATORIxDEMO() {
        switch (this.IIIIiiIiii.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return iiIIIIiiiI.ALLATORIxDEMO("\u7a01\u95ca");
            }
            case 1: {
                return IiIIiiiIiI.ALLATORIxDEMO("\u7b10\u5fe6\u9052\u6288");
            }
            case 2: {
                return "\u6316\u6398 (" + this.iIiiiIiIii + "/3)";
            }
            case 3: {
                return iiIIIIiiiI.ALLATORIxDEMO("\u5810\u517d");
            }
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        class_1792 iIiIiIIIII2;
        iiIiiiiiIi iiIiiiiiIi2 = this;
        iIiIiIIIII2 = iIiIiIIIII2.method_8389();
        int n = this = 3 & 4;
        while (n < iiIiiiiiIi2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
            class_1799 class_17992 = iiIiiiiiIi2.iIIiiIiIiI.field_1724.method_31548().method_5438(this);
            if (!class_17992.method_7960() && class_17992.method_7909() == iIiIiIIIII2) {
                return (3 & 5) != 0;
            }
            n = ++this;
        }
        return false;
    }

    private /* synthetic */ void IIIIiIIiII() {
        iiIiiiiiIi iiIiiiiiIi2 = iiIiiiiiIi3;
        if (iiIiiiiiIi2.IIiiIIIIIi == null) {
            iiIiiiiiIi2.IIIIiiIiii = CometTunnel.TunnelState.iIIiiIiIiI;
            iiIiiiiiIi2.iiIIiIIiii();
            return;
        }
        iiIiiiiiIi iiIiiiiiIi3 = iiIiiiiiIi2.iIIiiIiIiI.field_1687.method_8320(iiIiiiiiIi2.IIiiIIIIIi).method_26204();
        if (iiIiiiiiIi3 == class_2246.field_10124 || iiIiiiiiIi3 == class_2246.field_10543) {
            int this_ = IiIiiiiIii.IIIIiIIiII(((class_2248)iiIiiiiiIi2.iIiIiiiiII.get()).method_8389());
            if (this_ == -4 >> 2) {
                iiIiiiiiIi iiIiiiiiIi4 = iiIiiiiiIi2;
                iiIiiiiiIi4.warning("\u80cc\u5305\u4e2d\u6ca1\u6709 " + ((class_2248)iiIiiiiiIi4.iIiIiiiiII.get()).method_9518().getString(), new Object[3 & 4]);
                iiIiiiiiIi iiIiiiiiIi5 = iiIiiiiiIi2;
                iiIiiiiiIi5.IIIIiiIiii = CometTunnel.TunnelState.iIIiiIiIiI;
                iiIiiiiiIi5.IIiiIIIIIi = null;
                return;
            }
            IiIiiiiIii.ALLATORIxDEMO(this_);
            iiIiiiiiIi iiIiiiiiIi6 = iiIiiiiiIi2;
            iIiIiiIIIi.iiIIiIIiii(iiIiiiiiIi6.IIiiIIIIIi);
            IiIiiiiIii.ALLATORIxDEMO(this_);
            IiIiiiiIii.ALLATORIxDEMO();
            iiIiiiiiIi iiIiiiiiIi7 = iiIiiiiiIi2;
            iiIiiiiiIi7.info("\u5728 " + iiIiiiiiIi6.IIiiIIIIIi.method_23854() + " \u653e\u7f6e " + ((class_2248)iiIiiiiiIi7.iIiIiiiiII.get()).method_9518().getString(), new Object[2 & 5]);
            iiIiiiiiIi iiIiiiiiIi8 = iiIiiiiiIi2;
            iiIiiiiiIi8.IIiiIIIIIi = null;
            iiIiiiiiIi8.IIIIiiIiii = CometTunnel.TunnelState.iIIiiIiIiI;
            return;
        }
        iiIiiiiiIi iiIiiiiiIi9 = iiIiiiiiIi2;
        iiIiiiiiIi9.IIiiIIIIIi = null;
        iiIiiiiiIi9.IIIIiiIiii = CometTunnel.TunnelState.iIIiiIiIiI;
    }

    private /* synthetic */ void iiIIiIIiii() {
        if (this.iIIiIiiiIi == null) {
            return;
        }
        iiIiiiiiIi iiIiiiiiIi2 = this;
        iiIiiiiiIi2.iIIiIiiiIi = iiIiiiiiIi2.iIIiIiiiIi.method_10087(--1);
        if (!iiIiiiiiIi2.ALLATORIxDEMO(iiIiiiiiIi2.iIIiiIiIiI.field_1724.method_24515())) {
            this.warning(IiIIiiiIiI.ALLATORIxDEMO("\u73ce\u5bcb\u5db5\u79c6\u5f47\u96da\u9014"), new Object[3 ^ 3]);
            this.IIIIiiIiii = CometTunnel.TunnelState.iIIiIiiiIi;
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiIiiiiiIi iiIiiiiiIi2 = iiIiiiiiIi3;
        iiIiiiiiIi iiIiiiiiIi3 = pre;
        iiIiiiiiIi iIiIiIIIII2 = iiIiiiiiIi2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (iIiIiIIIII2.IIIIiiIiii == CometTunnel.TunnelState.iiiiiIIiIi || iIiIiIIIII2.IIIIiiIiii == CometTunnel.TunnelState.iIIiIiiiIi) {
            return;
        }
        if (iIiIiIIIII2.IIiIiIIiii > 0) {
            iIiIiIIIII2.IIiIiIIiii -= --1;
            return;
        }
        switch (iIiIiIIIII2.IIIIiiIiii.ordinal()) {
            case 2: {
                iiIiiiiiIi iiIiiiiiIi4 = iIiIiIIIII2;
                while (false) {
                }
                iiIiiiiiIi iiIiiiiiIi5 = iiIiiiiiIi4;
                iiIiiiiiIi4.ALLATORIxDEMO();
                break;
            }
            case 3: {
                iIiIiIIIII2.IIIIiIIiII();
            }
            default: {
                iiIiiiiiIi iiIiiiiiIi5 = iIiIiIIIII2;
            }
        }
        iiIiiiiiIi5.IIiIiIIiii = (Integer)iIiIiIIIII2.iIIiiIiIiI.get();
    }

    private /* synthetic */ void iiiIiIiiIi() {
        if (this.IiiIiIiiIi == null) {
            return;
        }
        this.IIiiIIIIIi = this.iIIiIiiiIi.method_10087(--3);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiIiiiiiIi iiIiiiiiIi2 = iiIiiiiiIi4;
        if (iiIiiiiiIi2.iIIiIiiiIi == null) {
            return;
        }
        iiIiiiiiIi iiIiiiiiIi3 = iiIiiiiiIi2;
        iiIiiiiiIi iiIiiiiiIi4 = iiIiiiiiIi3.iIIiiIiIiI.field_1687.method_8320(iiIiiiiiIi2.iIIiIiiiIi).method_26204();
        if (((Boolean)iiIiiiiiIi3.iiiiiIIiIi.get()).booleanValue() && iiIiiiiiIi4 == class_2246.field_9987) {
            IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u527c\u8fb1\u578a\u5c9a\u5c33\uff3e\u5025\u6b58\u636d\u63a0"));
            iiIiiiiiIi2.IIIIiiIiii = CometTunnel.TunnelState.iIIiIiiiIi;
            iiIiiiiiIi2.toggle();
            return;
        }
        if (iiIiiiiiIi4 == class_2246.field_9987) {
            iiIiiiiiIi2.iiIIiIIiii();
            return;
        }
        if (iiIiiiiiIi4 != class_2246.field_10124) {
            iiIiiiiiIi iiIiiiiiIi5 = iiIiiiiiIi2;
            BlockUtils.breakBlock((class_2338)iiIiiiiiIi2.iIIiIiiiIi, (boolean)(--1 != 0));
            iiIiiiiiIi5.iIiiiIiIii += 5 >> 2;
            if (iiIiiiiiIi5.iIiiiIiIii >= --3) {
                iiIiiiiiIi2.IIIIiiIiii = CometTunnel.TunnelState.iIiIiIIIII;
                iiIiiiiiIi2.iiiIiIiiIi();
                iiIiiiiiIi2.iIiiiIiIii = 2 & 5;
                return;
            }
        } else {
            iiIiiiiiIi iiIiiiiiIi6 = iiIiiiiiIi2;
            iiIiiiiiIi6.iIiiiIiIii += 3 >> 1;
            if (iiIiiiiiIi6.iIiiiIiIii >= --3) {
                iiIiiiiiIi2.IIIIiiIiii = CometTunnel.TunnelState.iIiIiIIIII;
                iiIiiiiiIi2.iiiIiIiiIi();
                iiIiiiiiIi2.iIiiiIiIii = 5 >> 3;
            }
        }
    }
}

