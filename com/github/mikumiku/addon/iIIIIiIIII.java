/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.IiiiIIIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class iIIIIiIIII
extends iIiIiIIIii {
    private boolean iiiiiIIiIi;
    private boolean iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    public void onDeactivate() {
        this.iiiIiIiiIi();
        this.iIIiIiiiIi = 5 >> 3;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIIIIiIIII iIIIIiIIII2 = iIIIIiIIII3;
        iIIIIiIIII iIIIIiIIII3 = pre;
        iIIIIiIIII iIiIiIIIII2 = iIIIIiIIII2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        int this2 = !iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24828() ? 4 ^ 5 : 0;
        if (this2 != 0) {
            iIiIiIIIII2.iIIiIiiiIi = --1;
            if (iIiIiIIIII2.iiiiiIIiIi) {
                iIiIiIIIII2.ALLATORIxDEMO();
                return;
            }
            if (!iIiIiIIIII2.ALLATORIxDEMO(class_1802.field_8233)) {
                this2 = IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8233);
                if (this2 != -4 >> 2) {
                    IiIiiiiIii.ALLATORIxDEMO(this2);
                    iIiIiIIIII2.iIIiiIiIiI.field_1761.method_2919((class_1657)iIiIiIIIII2.iIIiiIiIiI.field_1724, iIiIiIIIII2.iIIiiIiIiI.field_1724.method_6058());
                    iIiIiIIIII2.ALLATORIxDEMO();
                    return;
                }
                iIiIiIIIII2.iiiIiIiiIi();
                return;
            }
            iIiIiIIIII2.ALLATORIxDEMO();
            return;
        }
        if (iIiIiIIIII2.iIIiIiiiIi && iIiIiIIIII2.iiiiiIIiIi) {
            iIIIIiIIII iIIIIiIIII4 = iIiIiIIIII2;
            iIIIIiIIII4.iiiIiIiiIi();
            iIIIIiIIII4.iIIiIiiiIi = 5 >> 3;
            if (((Boolean)iIIIIiIIII4.ALLATORIxDEMO.get()).booleanValue()) {
                iIiIiIIIII2.toggle();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_1792 class_17922) {
        iIIIIiIIII iIIIIiIIII2 = this;
        int n = this = 2 & 5;
        while (true) {
            void iIiIiIIIII2;
            if (n >= 9) break;
            if (iIIIIiIIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909() == iIiIiIIIII2) {
                iIiiiIIiIi.ALLATORIxDEMO(this);
                return (2 ^ 3) != 0;
            }
            n = ++this;
        }
        return false;
    }

    private /* synthetic */ void iiiIiIiiIi() {
        if (this.iiiiiIIiIi) {
            this.iIIiiIiIiI.field_1690.field_1904.method_23481((3 & 4) != 0);
            this.iiiiiIIiIi = 3 & 4;
        }
    }

    public iIIIIiIIII() {
        iIIIIiIIII iIIIIiIIII2 = this;
        super(IIiiIiIIIi.iiiIiIiiIi("\u7d19\u98d9\u67ae\u9616\u840f"), IiiiIIIiii.ALLATORIxDEMO("\u5756\u7a10\u4e53\u81a0\u52f6\u5469\u7d55\u98e8\u67e2\u769e\u524e\u8457\u574e"));
        iIIIIiIIII2.iIiIiIIIII = iIIIIiIIII2.settings.getDefaultGroup();
        iIIIIiIIII2.ALLATORIxDEMO = iIIIIiIIII2.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIiIIIi.iiiIiIiiIi("\u840f\u576b\u543c\u5128\u95df"))).description(IiiiIIIiii.ALLATORIxDEMO("\u8463\u575a\u5470\u8180\u52d6\u5119\u9593\u6a4b\u5729"))).defaultValue((Object)(3 >> 1))).build());
        iIIIIiIIII iIIIIiIIII3 = this;
        iIIIIiIIII3.iIIiIiiiIi = 5 >> 3;
        iIIIIiIIII3.iiiiiIIiIi = 3 ^ 3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiiIiIIIi.iiiIiIiiIi(",yY4\bw{G+V:F>\u0013[\u8be5\u66af\u6582\u526b\u6732\u65eb\u727a\u6777\uff33"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (!this.iiiiiIIiIi) {
            this.iIIiiIiIiI.field_1690.field_1904.method_23481(5 >> 2);
            this.iiiiiIIiIi = 3 & 5;
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
        if (IiIiiiiIii.ALLATORIxDEMO(class_1802.field_8233) == -4 >> 2) {
            this.error(IiiiIIIiii.ALLATORIxDEMO("\u6ccb\u6777\u7d41\u98fc\u67f6\u4ef8"), new Object[3 ^ 3]);
            this.toggle();
        }
    }
}

