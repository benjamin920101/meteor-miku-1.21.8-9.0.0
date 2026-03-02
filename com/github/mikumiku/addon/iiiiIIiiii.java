/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.game.GameJoinedEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1297
 *  net.minecraft.class_1671
 *  net.minecraft.class_2596
 *  net.minecraft.class_2708
 *  net.minecraft.class_2716
 *  net.minecraft.class_6374
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIiIiiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIiIII;
import com.github.mikumiku.addon.mixin.AccessorFireworkRocketEntity;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import meteordevelopment.meteorclient.events.game.GameJoinedEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1297;
import net.minecraft.class_1671;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_2716;
import net.minecraft.class_6374;

public class iiiiIIiiii
extends iIiIiIIIii {
    private final Setting<Boolean> IiiIiIiiIi;
    private class_1671 IIiIiIIiii;
    private boolean iIIiiIiIiI;
    private long iiiiiIIiIi;
    private final Setting<Integer> iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private final List<class_6374> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        void iIiIiIIIII2;
        iiiiIIiiii iiiiIIiiii2 = iiiiIIiiii3;
        iiiiIIiiii iiiiIIiiii3 = iIiIiIIIII2.packet;
        if (iiiiIIiiii3 instanceof class_2716) {
            class_2716 class_27162 = (class_2716)iiiiIIiiii3;
            if (iiiiIIiiii2.IIiIiIIiii != null) {
                iiiiIIiiii3 = class_27162.method_36548().iterator();
                while (iiiiIIiiii3.hasNext()) {
                    if (((Integer)iiiiIIiiii3.next()).intValue() != iiiiIIiiii2.IIiIiIIiii.method_5628()) continue;
                    iiiiIIiiii iiiiIIiiii4 = iiiiIIiiii2;
                    iIiIiIIIII2.cancel();
                    iiiiIIiiii4.iIIiiIiIiI = 3 & 5;
                    iiiiIIiiii4.iiiiiIIiIi = System.currentTimeMillis();
                    return;
                }
            }
        }
        if (iIiIiIIIII2.packet instanceof class_2708 && iiiiIIiiii2.iIIiiIiIiI) {
            iiiiIIiiii iiiiIIiiii5 = iiiiIIiiii2;
            iiiiIIiiii5.iIIiiIiIiI = 2 & 5;
            iiiiIIiiii5.iiiIiIiiIi();
            iiiiIIiiii5.ALLATORIxDEMO();
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiiiIIiiii iiiiIIiiii2 = iiiiIIiiii3;
        iiiiIIiiii iiiiIIiiii3 = pre;
        iiiiIIiiii iIiIiIIIII2 = iiiiIIiiii2;
        if (!iIiIiIIIII2.iIIiiIiIiI) {
            block4: {
                iiiiIIiiii iiiiIIiiii4;
                for (class_1297 class_12972 : iIiIiIIIII2.iIIiiIiIiI.field_1687.method_18112()) {
                    AccessorFireworkRocketEntity accessorFireworkRocketEntity;
                    if (!(class_12972 instanceof class_1671) || !(accessorFireworkRocketEntity = (AccessorFireworkRocketEntity)((Object)(iiiiIIiiii3 = (class_1671)class_12972))).hookWasShotByEntity() || accessorFireworkRocketEntity.hookGetShooter() != iIiIiIIIII2.iIIiiIiIiI.field_1724) continue;
                    iiiiIIiiii4 = iIiIiIIIII2;
                    iIiIiIIIII2.IIiIiIIiii = iiiiIIiiii3;
                    break block4;
                }
                iiiiIIiiii4 = iIiIiIIIII2;
            }
            iiiiIIiiii4.iiiiiIIiIi = System.currentTimeMillis();
            return;
        }
        long l = System.currentTimeMillis() - iIiIiIIIII2.iiiiiIIiIi;
        int this2 = l >= (long)((Integer)iIiIiIIIII2.iIIiIiiiIi.get()).intValue() * 1000L ? 5 >> 2 : 0;
        if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue() && iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24828()) {
            this2 = 4 ^ 5;
        }
        if (this2 != 0) {
            iiiiIIiiii iiiiIIiiii5 = iIiIiIIIII2;
            iiiiIIiiii5.iIIiiIiIiI = 3 >> 2;
            iiiiIIiiii5.iiiIiIiiIi();
            iiiiIIiiii5.ALLATORIxDEMO();
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Send send) {
        void iIiIiIIIII2;
        iiiiIIiiii iiiiIIiiii2 = iiiiIIiiii3;
        iiiiIIiiii iiiiIIiiii3 = iIiIiIIIII2.packet;
        if (iiiiIIiiii3 instanceof class_6374) {
            class_6374 class_63742 = (class_6374)iiiiIIiiii3;
            if (iiiiIIiiii2.iIIiiIiIiI) {
                iIiIiIIIII2.cancel();
                iiiiIIiiii2.ALLATORIxDEMO.add(class_63742);
            }
        }
    }

    public void onDeactivate() {
        this.iiiIiIiiIi();
        this.iIIiiIiIiI = 3 ^ 3;
        this.iiiiiIIiIi = 0L;
        this.ALLATORIxDEMO();
    }

    private /* synthetic */ void iiiIiIiiIi() {
        if (this.IIiIiIIiii != null) {
            this.IIiIiIIiii.method_31472();
            this.IIiIiIIiii = null;
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiiiIIiiii iiiiIIiiii2 = this;
        Object object = this = iiiiIIiiii2.ALLATORIxDEMO.iterator();
        while (object.hasNext()) {
            class_6374 class_63742 = (class_6374)this.next();
            object = this;
            iiiiIIiiii2.iIIiiIiIiI.method_1562().method_52787((class_2596)class_63742);
        }
        iiiiIIiiii2.ALLATORIxDEMO.clear();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(GameJoinedEvent gameJoinedEvent) {
        iiiiIIiiii iIiIiIIIII2;
        iiiiIIiiii iiiiIIiiii2 = iiiiIIiiii3;
        iiiiIIiiii iiiiIIiiii3 = gameJoinedEvent;
        iiiiIIiiii iiiiIIiiii4 = iIiIiIIIII2 = iiiiIIiiii2;
        iIiIiIIIII2.iiiIiIiiIi();
        iiiiIIiiii4.iIIiiIiIiI = 2 & 5;
        iiiiIIiiii4.iiiiiIIiIi = 0L;
    }

    public iiiiIIiiii() {
        iiiiIIiiii iiiiIIiiii2 = this;
        super(iIiIiIIIii.ALLATORIxDEMO, IiiIiIiiiI.ALLATORIxDEMO("\u70e2\u82e9\u5e81\u956d"), iIiiiIiIII.ALLATORIxDEMO("\u5e81\u9520\u7088\u82ee\u6356\u7eb2\u65a1\u95ab\uff5b*\u572a\u9a87\u539a\u4f04\u5f5a\u6752\u53b8\u80bf\u65aa\u7520\u3002"));
        iiiiIIiiii2.ALLATORIxDEMO = new CopyOnWriteArrayList<class_6374>();
        iiiiIIiiii2.iIiIiIIIII = this.settings.getDefaultGroup();
        iiiiIIiiii2.iIIiIiiiIi = iiiiIIiiii2.iIiIiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u6720\u5962\u633c\u7eb5\u6581\u95e6"))).description(iIiiiIiIII.ALLATORIxDEMO("\u7080\u82e6\u63a2\u8fd9\u76db\u6757\u597f\u6351\u7eb2\u65a1\u95b6b\u79da)"))).defaultValue((Object)(0x7F & 0x2C))).min(2 ^ 3).max(0x7C & 0x7B).sliderMax(0x7F & 0x78).build());
        this.IiiIiIiiIi = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u7760\u9603\u81d7\u52f0\u502b\u6b70"))).description(iIiiiIiIII.ALLATORIxDEMO("\u7717\u964c\u65f4\u81b5\u52ff\u5004\u6b32\u5ea9\u9528\u709d\u82fb\u63a0\u8fdb"))).defaultValue((Object)(3 >> 1))).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIiIiiiI.ALLATORIxDEMO("P\te\u0004S \u00000P!A1\u00101\u0000\u8bb2\u66d3\u65f2\u5210\u6745\u658d\u7210\u675b\uff13"));
        }
    }

    public String getInfoString() {
        iiiiIIiiii iiiiIIiiii2 = this;
        if (!iiiiIIiiii2.iIIiiIiIiI) {
            return null;
        }
        float f = (float)(System.currentTimeMillis() - iiiiIIiiii2.iiiiiIIiIi) / 1000.0f;
        return new DecimalFormat(iIiiiIiIII.ALLATORIxDEMO("`\u007fi")).format(f) + "s";
    }

    public boolean ALLATORIxDEMO() {
        return this.iIIiiIiIiI;
    }
}

