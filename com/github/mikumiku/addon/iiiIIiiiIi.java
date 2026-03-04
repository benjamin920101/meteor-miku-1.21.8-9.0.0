/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.world.PlaySoundEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.util.Identifier
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIIiIiII;
import com.github.mikumiku.addon.iiIiiIIIiI;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.PlaySoundEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.Identifier;

public class iiiIIiiiIi
extends iIiIiIIIii {
    private boolean iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private final Setting<Double> ALLATORIxDEMO;

    private /* synthetic */ void iiIIiIIiii() {
        iiiIIiiiIi iiiIIiiiIi2 = iiiIIiiiIi3;
        class_1792[] class_1792Array = new class_1792[5 >> 2];
        class_1792Array[3 & 4] = class_1802.field_8833;
        iiiIIiiiIi iiiIIiiiIi3 = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (!iiiIIiiiIi3.found()) {
            return;
        }
        iiiIIiiiIi iiiIIiiiIi4 = iiiIIiiiIi2;
        iiiIIiiiIi iiiIIiiiIi5 = iiiIIiiiIi3;
        iiiIIiiiIi4.ALLATORIxDEMO(iiiIIiiiIi5.slot());
        iiiIIiiiIi4.ALLATORIxDEMO();
        iiiIIiiiIi4.ALLATORIxDEMO(iiiIIiiiIi5.slot());
    }

    private static /* synthetic */ void iiiIiIiiIi() {
        class_1792[] class_1792Array = new class_1792[3 >> 1];
        class_1792Array[3 >> 2] = class_1802.field_8833;
        FindItemResult findItemResult = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (!findItemResult.found()) {
            findItemResult = InvUtils.findInHotbar(iIiIiIIIII2 -> {
                if (iIiIiIIIII2.method_7909() == class_1802.field_22028 || iIiIiIIIII2.method_7909() == class_1802.field_8058 || iIiIiIIIII2.method_7909() == class_1802.field_8678 || iIiIiIIIII2.method_7909() == class_1802.field_8523) {
                    return true;
                }
                return false;
            });
            if (findItemResult.found()) {
                int n = iIiiiIIiIi.ALLATORIxDEMO();
                FindItemResult findItemResult2 = findItemResult;
                int n2 = findItemResult2.slot();
                if (!findItemResult2.isMainHand()) {
                    IiIiiiiIii.IIIIiIIiII().iiiiIIIiII(n).IIIIiIIiII(n2);
                }
                MeteorClient.mc.field_1761.method_2919((class_1657)MeteorClient.mc.field_1724, class_1268.field_5808);
                return;
            }
            findItemResult = InvUtils.findInHotbar(iIiIiIIIII2 -> iIiIiIIIII2.method_7960());
            int n = IiIiiiiIii.ALLATORIxDEMO((class_1799 iIiIiIIIII2) -> {
                if (iIiIiIIIII2.method_7909() == class_1802.field_22028 || iIiIiIIIII2.method_7909() == class_1802.field_8058 || iIiIiIIIII2.method_7909() == class_1802.field_8678 || iIiIiIIIII2.method_7909() == class_1802.field_8523) {
                    return true;
                }
                return false;
            });
            if (findItemResult.found()) {
                if (n != -4 >> 2) {
                    IiIiiiiIii.ALLATORIxDEMO(n, findItemResult.slot());
                }
            }
            return;
        }
    }

    public iiiIIiiiIi() {
        iiiIIiiiIi iiiIIiiiIi2 = this;
        super((Category)ALLATORIxDEMO, iiIIIiIiII.ALLATORIxDEMO("\u756f\u9893VF"), iiIiiIIIiI.ALLATORIxDEMO("\u7560\u8096\u7578\u98b2\u8818\uff7e\u4e41\u807d\u97d0\u7fab\u805a\u4e29\u3056\u9772\u5727\u5fc2\u6337\u6869\u657b\u97fb\u7f80\u3061\u513d\u9585\u5139\u4ebf\u51bd\u7aa8\u6a69\u5739\uff44\u59ec\u81a2\u52c6\u526f\u97d6\u7fad\u80b6\u757a\u306f\u6317\u5721\u81a2\u52c6\u630a\u888b\u7b01\u306c"));
        iiiIIiiiIi2.iIiIiIIIII = iiiIIiiiIi2.settings.getDefaultGroup();
        iiiIIiiiIi2.ALLATORIxDEMO = iiiIIiiiIi2.iIiIiIIIII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u6e22\u6e9c\u98a3\u8821"))).description(iiIiiIIIiI.ALLATORIxDEMO("\u6e17\u6e9f\u9896\u8822"))).defaultValue(10.0).min(1.0).max(10.0).sliderMin(1.0).sliderMax(10.0).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIIiIiII.ALLATORIxDEMO("*\u0006_K\u000e\b]\u0018\r\t<98l]\u8b9a\u6689\u65dd\u524d\u676d\u65ed\u7205\u6751\uff6c"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(Int2ObjectMap<class_1799> int2ObjectMap, int n) {
        iiiIIiiiIi iIiIiIIIII2;
        int n2 = n;
        iiiIIiiiIi iiiIIiiiIi2 = iIiIiIIIII2 = this;
        int cfr_ignored_0 = iiiIIiiiIi2.iIIiiIiIiI.field_1724.field_7512.field_7763;
        iiiIIiiiIi2.iIIiiIiIiI.field_1724.field_7512.method_37421();
        IiIiiiiIii.ALLATORIxDEMO(0xF & 0x76);
        MeteorClient.mc.field_1761.method_2906(MeteorClient.mc.field_1724.field_7512.field_7763, 0x4F & 0x36, n2 + (0x7F & 0x24), class_1713.field_7791, (class_1657)MeteorClient.mc.field_1724);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiiIIiiiIi iiiIIiiiIi2 = iiiIIiiiIi3;
        iiiIIiiiIi iiiIIiiiIi3 = pre;
        iiiIIiiiIi iIiIiIIIII2 = iiiIIiiiIi2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31549().field_7478) {
            return;
        }
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24828()) {
            return;
        }
        if (iIiIiIIIII2.ALLATORIxDEMO()) {
            iIiIiIIIII2.iIIiiIiIiI.field_1724.method_5728(--1 != 0);
        }
        if (iIiIiIIIII2.ALLATORIxDEMO()) {
            iIiIiIIIII2.iiIIiIIiii();
        }
    }

    @Override
    public void onActivate() {
        if (this.iIIiiIiIiI.field_1724 == null || this.iIIiiIiIiI.field_1724.method_31549().field_7478) {
            return;
        }
        if (this.iIIiiIiIiI.field_1724.method_24828()) {
            this.error(iiIiiIIIiI.ALLATORIxDEMO("\u8bbf\u5746\u7a32\u4e43\u623b\u5f4e\u6259\uff6f"), new Object[5 >> 3]);
            this.toggle();
        }
        this.iIIiIiiiIi = this.iIIiiIiIiI.field_1724.method_5624();
        iiiIIiiiIi.iiiIiIiiIi();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n) {
        void iIiIiIIIII2;
        iiiIIiiiIi iiiIIiiiIi2;
        iiiIIiiiIi iiiIIiiiIi3 = iiiIIiiiIi2 = iiiIIiiiIi4;
        class_1799 class_17992 = iiiIIiiiIi3.iIIiiIiIiI.field_1724.method_31548().method_5438(0x3F & 0x66);
        class_1799 class_17993 = iiiIIiiiIi3.iIIiiIiIiI.field_1724.method_31548().method_5438((int)iIiIiIIIII2);
        iiiIIiiiIi iiiIIiiiIi4 = new Int2ObjectOpenHashMap();
        iiiIIiiiIi4.put(0xF & 0x76, class_17993);
        iiiIIiiiIi4.put((int)(iIiIiIIIII2 + (0x3D & 0x66)), class_17992);
        iiiIIiiiIi2.ALLATORIxDEMO((Int2ObjectMap<class_1799>)iiiIIiiiIi4, (int)iIiIiIIIII2);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        iiiIIiiiIi iiiIIiiiIi2 = iiiIIiiiIi3;
        iiiIIiiiIi iiiIIiiiIi3 = receive;
        iiiIIiiiIi iIiIiIIIII2 = iiiIIiiiIi2;
        class_2596 class_25962 = ((PacketEvent.Receive)iiiIIiiiIi3).packet;
        if (class_25962 instanceof class_2708) {
            class_2708 cfr_ignored_0 = (class_2708)class_25962;
            return;
        }
        if (((PacketEvent.Receive)iiiIIiiiIi3).packet instanceof class_2645) {
            iiiIIiiiIi3.cancel();
        }
    }

    public boolean ALLATORIxDEMO() {
        if (this.isActive() && this.iIIiiIiIiI.field_1724 != null && !this.iIIiiIiIiI.field_1724.method_24828()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlaySoundEvent playSoundEvent) {
        iiiIIiiiIi iiiIIiiiIi2 = iterator;
        Iterator<class_2960> iterator = List.of(class_2960.method_60654((String)iiIIIiIiII.ALLATORIxDEMO("WC\u001b\u0000\u0013\u0012\u0011\u0006\u000fQ\u0013\u001e_GS\f\u000f\u0000\u0012\u001fs(,8\u0014\u001d\"\n\u0018\u00038?\u0014\u000e")), class_2960.method_60654((String)iiIiiIIIiI.ALLATORIxDEMO("9\u001baL#\u0014$\u00051Y'\u001c*\u0004!H:\u0003'\u001cf\u000b\u0019;\u0001>\u0017\u0000-\u001a \u000b\u001a'<\u000b")), class_2960.method_60654((String)iiIIIiIiII.ALLATORIxDEMO("G\u001c\u000b\u0015\u0003\u0002\u0001\u001d\u001f@\u0003NO\u0010C\u001c\u001f\u0010\u0002/c8<\b\u0004\r2\u0018\u0001$9\u000f\f")), class_2960.method_60654((String)iiIiiIIIiI.ALLATORIxDEMO("b@.\u0003&\u0011$\u0005:R&\u001djDf\u000f:\u0003'\u001cF+\u0019;!\u001e\u0017\n!\u000f\u0005!&\n")), class_2960.method_60654((String)iiIIIiIiII.ALLATORIxDEMO("\b\u0019\u000e\u0015\u0003\t\n\u001c\u001e\u0000C\t\b\u0010C\u001c\u001f0\"/c\u0018\u001c\b\u0004\r2:\"\u0011\t")), class_2960.method_60654((String)iiIiiIIIiI.ALLATORIxDEMO("\u000b,\r \u0000<\t)\u001d5@<\u000b%@)\u001c\u0005!\u001a`-\u001f=\u000781\u0001<'\u0000")), class_2960.method_60654((String)iiIIIiIiII.ALLATORIxDEMO("\u0018\f\u001e\u0005\u0013\u0012\u001a\r\u000ePS^\u0018\u0000S\f\u000f\u00002?s(\f\u0018\u0014\u001d\"\u000e5,\u0014\u0003")), class_2960.method_60654((String)iiIiiIIIiI.ALLATORIxDEMO("b@.\u0003&\u0011$\u0005:R&\u001djDf\u000f:\u0003'\u001cF+\u0019;!\u001e\u0017\u0002-\u000f\u001c&-\u001c")), class_2960.method_60654((String)iiIIIiIiII.ALLATORIxDEMO("\u001d\t\u0015\u000e\u0019\u0018[L\tW\u0014\u0019\u0018\u0000s(14\t\u001f\u001cC\u001b\u0001$$\u0013\n"))).iterator();
        while (iterator.hasNext()) {
            void iIiIiIIIII2;
            if (!((class_2960)iterator.next()).equals((Object)iIiIiIIIII2.sound.method_4775())) continue;
            iIiIiIIIII2.cancel();
            return;
        }
    }

    public void onDeactivate() {
        if (this.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        this.iIIiiIiIiI.field_1724.method_5728(this.iIIiIiiiIi);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        this.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)this.iIIiiIiIiI.field_1724, class_2848.class_2849.field_12982));
    }
}

