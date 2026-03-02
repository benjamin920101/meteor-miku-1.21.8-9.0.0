/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2815
 *  net.minecraft.class_2886
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIIiII;
import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2815;
import net.minecraft.class_2886;

public class iIiIiiiiII
extends iIiIiIIIii {
    private final Setting<Integer> iiiiiIIiIi;
    private int iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private int ALLATORIxDEMO;

    @Override
    public void onActivate() {
        iIiIiiiiII iIiIiiiiII2 = this;
        iIiIiiiiII2.ALLATORIxDEMO();
        iIiIiiiiII2.iIIiIiiiIi = (Integer)iIiIiiiiII2.iiiiiIIiIi.get();
        this.ALLATORIxDEMO = this.iIIiiIiIiI.field_1724 == null ? 3 & 4 : iIiiiIIiIi.ALLATORIxDEMO();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIiIiiiiII iIiIiIIIII2;
        iIiIiiiiII iIiIiiiiII2 = iIiIiiiiII3;
        iIiIiiiiII iIiIiiiiII3 = post;
        iIiIiiiiII iIiIiiiiII4 = iIiIiIIIII2 = iIiIiiiiII2;
        if (iIiIiIIIII2.iIIiIiiiIi == 0) {
            InvUtils.swap((int)iIiIiiiiII4.ALLATORIxDEMO, (boolean)(5 >> 3));
            iIiIiIIIII2.toggle();
            return;
        }
        iIiIiiiiII4.iIIiIiiiIi -= 4 ^ 5;
    }

    private /* synthetic */ void iiiIiIiiIi() {
        iIiIiIIIii.ALLATORIxDEMO(n -> {
            int n2 = n;
            iIiIiiiiII iIiIiIIIII2 = this;
            return new class_2886(class_1268.field_5808, n2, iIiIiIIIII2.iIIiiIiIiI.field_1724.method_36454(), iIiIiIIIII2.iIIiiIiIiI.field_1724.method_36455());
        });
    }

    public iIiIiiiiII() {
        iIiIiiiiII iIiIiiiiII2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, IiIIiIIiII.ALLATORIxDEMO("\u4e32\u9540\u70ed\u82df"), IiIIiIIiiI.ALLATORIxDEMO("\u5fff\u6309\u953d\u4e79\u9520\u655a\u709b\u829f"));
        iIiIiiiiII2.iIiIiIIIII = iIiIiiiiII2.settings.getDefaultGroup();
        iIiIiiiiII2.iiiiiIIiIi = iIiIiiiiII2.iIiIiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u5141\u9583\u5ec4\u8fb1"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u4f06\u751b\u7086\u8282\u5457\u5135\u95c1\u755f\u971b\u7690\u5e88\u8fcc\uff71\u6e36\u626b\u527f\uff27"))).defaultValue((Object)(--4))).sliderRange(2 ^ 3, 0x6B & 0x3C).build());
        this.iIIiIiiiIi = 3 & 4;
        int n = this.iIIiiIiIiI.field_1724 == null ? 2 & 5 : (this.ALLATORIxDEMO = iIiiiIIiIi.ALLATORIxDEMO());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiIIiII.ALLATORIxDEMO("E%0ha+\u0012\u001bb*S\u001awo2\u8bb9\u66e6\u65fe\u5222\u674e\u6582\u7226\u671e\uff6f"));
        }
    }

    public void ALLATORIxDEMO() {
        iIiIiiiiII iIiIiiiiII2 = this;
        try {
            if (!iIiIiiiiII2.iIIiiIiIiI.field_1724.method_24828()) {
                class_1792 class_17922;
                if (iIiIiiiiII2.iIIiiIiIiI.field_1724.method_31548().method_5438(0x37 & 0x6E).method_7909().equals(class_1802.field_8833) && !IiIiiIIIiI.ALLATORIxDEMO(class_17922 = iIiIiiiiII2.iIIiiIiIiI.field_1724.method_6047().method_7909())) {
                    if (class_17922 == class_1802.field_8639) {
                        iIiIiiiiII2.iiiIiIiiIi();
                        return;
                    }
                    class_1792[] class_1792Array = new class_1792[1];
                    class_1792Array[5 >> 3] = class_1802.field_8639;
                    int n = InvUtils.findInHotbar((class_1792[])class_1792Array).slot();
                    if (n != -4 >> 2) {
                        int n2 = iIiiiIIiIi.ALLATORIxDEMO();
                        IiIiiiiIii.iiiIiIiiIi(n);
                        iIiIiiiiII iIiIiiiiII3 = iIiIiiiiII2;
                        iIiIiiiiII3.iiiIiIiiIi();
                        IiIiiiiIii.iiiIiIiiIi(n2);
                        iIiIiiiiII3.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2815(iIiIiiiiII2.iIIiiIiIiI.field_1724.field_7512.field_7763));
                        return;
                    }
                    class_1792[] class_1792Array2 = new class_1792[1];
                    class_1792Array2[2 & 5] = class_1802.field_8639;
                    n = InvUtils.find((class_1792[])class_1792Array2).slot();
                    if (n != -4 >> 2) {
                        IiIiiiiIii.ALLATORIxDEMO(n, iIiiiIIiIi.ALLATORIxDEMO());
                        iIiIiiiiII2.iiiIiIiiIi();
                        IiIiiiiIii.ALLATORIxDEMO(n, iIiiiIIiIi.ALLATORIxDEMO());
                        IiIiiiiIii.ALLATORIxDEMO();
                        return;
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

