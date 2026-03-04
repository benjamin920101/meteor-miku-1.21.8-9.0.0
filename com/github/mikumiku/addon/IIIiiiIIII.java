/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.game.OpenScreenEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket
 *  net.minecraft.client.gui.screen.DeathScreen
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiiIIIiiiI;
import java.util.Date;
import meteordevelopment.meteorclient.events.game.OpenScreenEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.client.gui.screen.DeathScreen;

public class IIIiiiIIII
extends iIiIiIIIii {
    private boolean iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private int IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    private final Setting<String> iIIiIiiiIi;
    private final Setting<String> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    public void onDeactivate() {
        IIIiiiIIII iIIiiiIIII = this;
        iIIiiiIIII.iIiIiiiiII = 2 & 5;
        iIIiiiIIII.IIiIiIIiii = 3 & 4;
    }

    @EventHandler(priority=100)
    private /* synthetic */ void ALLATORIxDEMO(OpenScreenEvent openScreenEvent) {
        IIIiiiIIII iIIiiiIIII = iIIiiiIIII2;
        IIIiiiIIII iIIiiiIIII2 = openScreenEvent;
        IIIiiiIIII iIiIiIIIII2 = iIIiiiIIII;
        if (!(((OpenScreenEvent)iIIiiiIIII2).screen instanceof class_418)) {
            return;
        }
        if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
            return;
        }
        iIiIiIIIII2.info(IiIiiIIIiI.ALLATORIxDEMO("\u689d\u6d49\u526d\u6b79\u4efc"), new Object[5 >> 3]);
        iIiIiIIIII2.ALLATORIxDEMO();
    }

    private /* synthetic */ void iiiIiIiiIi() {
        IIIiiiIIII iIIiiiIIII = string;
        String string = ((String)iIIiiiIIII.iIIiIiiiIi.get()).trim();
        if (string.isEmpty()) {
            iIIiiiIIII.warning(IiIiiIIIiI.ALLATORIxDEMO("\u6325\u4e99\u5187\u5be4\u4e38\u7a27\uff0e\u6777\u53d3\u905c"), new Object[3 >> 2]);
            return;
        }
        try {
            IIIiiiIIII iIIiiiIIII2 = iIIiiiIIII;
            if (((Boolean)iIIiiiIIII.ALLATORIxDEMO.get()).booleanValue()) {
                iIIiiiIIII2.iIIiiIiIiI.field_1724.field_3944.method_45729(string);
                iIIiiiIIII.info("\u5df2\u53d1\u9001\u804a\u5929\u6d88\u606f: " + (String)string, new Object[3 & 4]);
                return;
            }
            String string2 = (String)iIIiiiIIII2.iIiIiIIIII.get() + (String)string;
            IIIiiiIIII iIIiiiIIII3 = iIIiiiIIII;
            iIIiiiIIII3.iIIiiIiIiI.field_1724.field_3944.method_45730(string);
            iIIiiiIIII3.info("\u5df2\u53d1\u9001\u6307\u4ee4: " + string2, new Object[3 >> 2]);
            return;
        }
        catch (Exception exception) {
            iIIiiiIIII.error("\u53d1\u9001\u6307\u4ee4\u5931\u8d25: " + exception.getMessage(), new Object[3 & 4]);
            return;
        }
    }

    public IIIiiiIIII() {
        IIIiiiIIII iIIiiiIIII = this;
        super(iiiIIIiiiI.ALLATORIxDEMO("\u6b3b\u4eba\u81b7\u52ae\u6310\u4ea8"), IiIiiIIIiI.ALLATORIxDEMO("\u6b59\u4edc\u542c\u8197\u528a\u53ac\u9003\u81b7\u5b98\u4e14\u8048\u5974\u6305\u4eb9"));
        iIIiiiIIII.iiiiiIIiIi = iIIiiiIIII.settings.getDefaultGroup();
        iIIiiiIIII.iIIiIiiiIi = iIIiiiIIII.iiiiiIIiIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u635a\u4ee2\u5192\u5bf5"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u6b79\u4efc\u540c\u81b7\u528a\u53ac\u9023\u76f9\u6325\u4e99\uff0a\u4e50\u9702\u89dc\u8f91\u5138-\uff54"))).defaultValue((Object)iiiIIIiiiI.ALLATORIxDEMO("5iz)"))).build());
        this.iIIiiIiIiI = this.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u5ef4\u8f82"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u6b1b\u4e9a\u546e\u5ecd\u8fca\u5954\u5c51o.\u007f+\u5196\u538c\u9007\u6310\u4ea8"))).defaultValue((Object)(0x5F & 0x34))).min(3 & 4).sliderMax(0x74 & 0x6F).build());
        this.IiiIiIiiIi = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u9190\u751d\u5453"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u91d6\u7542\u5408\u519a\u539d"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.ALLATORIxDEMO = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u8048\u5974\u6a23\u5f52"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u4e85\u8071\u593c\u6dc6\u602f\u65a2\u5f48\u53cd\u9041\u8017\u4e50\u6629\u546a\u4ea8"))).defaultValue((Object)(3 >> 2))).build());
        this.iIiIiIIIII = this.iiiiiIIiIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u547f\u4eb9\u524f\u7f5d"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u5446\u4e84\u5276\u7f15\uff46\u905a\u5e23\u6668<o;\u624b\u5170\u4ec1\uff45"))).defaultValue((Object)IiIiiIIIiI.ALLATORIxDEMO("r"))).visible(() -> {
            if (!((Boolean)this.ALLATORIxDEMO.get()).booleanValue()) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.IIIIiiIiii = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiIIIiiiI.ALLATORIxDEMO("\u8c5e\u8bd3\u6a36\u5f43"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u663c\u7967\u8c01\u8b88\u4fe3\u6032"))).defaultValue((Object)(3 >> 2))).build());
        IIIiiiIIII iIIiiiIIII2 = this;
        iIIiiiIIII2.IIiIiIIiii = 2 & 5;
        iIIiiiIIII2.iIiIiiiiII = 3 & 4;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiIIIiiiI.ALLATORIxDEMO("\u0010w%z\u0013^@N\u0010_\u0001Opo`\u8bec\u66b3\u65ac\u5270\u671b\u65ed\u724e\u673b\uff4d"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        this.iIiIiiiiII = 4 ^ 5;
        this.IIiIiIIiii = 3 ^ 3;
        if (((Boolean)this.IIIIiiIiii.get()).booleanValue()) {
            IIIiiiIIII iIIiiiIIII = this;
            iIIiiiIIII.info("\u6b7b\u4ea1\u89e6\u53d1\uff0c\u5c06\u5728 " + String.valueOf(iIIiiiIIII.iIIiiIiIiI.get()) + " tick \u540e\u53d1\u9001\u6307\u4ee4", new Object[3 ^ 3]);
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        IIIiiiIIII iIIiiiIIII = iIIiiiIIII2;
        IIIiiiIIII iIIiiiIIII2 = receive;
        IIIiiiIIII iIiIiIIIII2 = iIIiiiIIII;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        if (!((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
            return;
        }
        iIIiiiIIII2 = ((PacketEvent.Receive)iIIiiiIIII2).packet;
        if (iIIiiiIIII2 instanceof class_2724) {
            class_2724 cfr_ignored_0 = (class_2724)iIIiiiIIII2;
            if (((Boolean)iIiIiIIIII2.IIIIiiIiii.get()).booleanValue()) {
                iIiIiIIIII2.info(iiiIIIiiiI.ALLATORIxDEMO("\u68f7\u6d2f\u520f\u91ab\u7522"), new Object[2 & 5]);
            }
            iIiIiIIIII2.ALLATORIxDEMO();
        }
    }

    @Override
    public void onActivate() {
        IIIiiiIIII iIIiiiIIII = this;
        iIIiiiIIII.IIiIiIIiii = 5 >> 3;
        iIIiiiIIII.iIiIiiiiII = 3 & 4;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIIiiiIIII iIIiiiIIII = iIIiiiIIII2;
        IIIiiiIIII iIIiiiIIII2 = pre;
        IIIiiiIIII iIiIiIIIII2 = iIIiiiIIII;
        if (!iIiIiIIIII2.iIiIiiiiII) {
            return;
        }
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        IIIiiiIIII iIIiiiIIII3 = iIiIiIIIII2;
        iIIiiiIIII3.IIiIiIIiii += 3 >> 1;
        if (iIIiiiIIII3.IIiIiIIiii >= (Integer)iIiIiIIIII2.iIIiiIiIiI.get()) {
            IIIiiiIIII iIIiiiIIII4 = iIiIiIIIII2;
            iIiIiIIIII2.iiiIiIiiIi();
            iIIiiiIIII4.iIiIiiiiII = 3 ^ 3;
            iIIiiiIIII4.IIiIiIIiii = 5 >> 3;
        }
    }
}

