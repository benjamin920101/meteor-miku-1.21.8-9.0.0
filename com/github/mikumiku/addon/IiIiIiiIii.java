/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.InteractItemEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_310
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIiiiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiIiIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.InteractItemEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_310;

public class IiIiIiiIii
extends iIiIiIIIii {
    private boolean iIiiiIiIii;
    private int iIiIiiiiII;
    private int IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    private final Setting<Integer> iiiiiIIiIi;
    private int iIIiIiiiIi;
    private boolean iIiIiIIIII;
    private final Setting<Integer> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractItemEvent interactItemEvent) {
        IiIiIiiIii iiIiIiiIii = iiIiIiiIii2;
        IiIiIiiIii iiIiIiiIii2 = interactItemEvent;
        IiIiIiiIii iIiIiIIIII2 = iiIiIiiIii;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        iiIiIiiIii2 = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_5998(((InteractItemEvent)iiIiIiiIii2).hand);
        if (iiIiIiiIii2 != null && iiIiIiiIii2.method_7909() == class_1802.field_8639) {
            iIiIiIIIII2.iIiIiiiiII = 3 ^ 3;
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }

    public IiIiIiiIii() {
        IiIiIiiIii iiIiIiiIii = this;
        super(iIiIiIiIii.ALLATORIxDEMO("\u65bf\u9668\u8052\u4e60\u9790\u7faa"), IiiIIiiiiI.ALLATORIxDEMO("\u81ba\u52f3\u5257\u6332\u97c3\u7f94\u5f5a\u5162\u4eff\u82f4\u777c\u8046\u4e18\u5ed0\uff71\u5e20\u81b7\u52de\u4f02\u757e\u7082\u82e7\u7036\u7bdb\u7e89\u6357\u9883\u881a\u305f"));
        iiIiIiiIii.iIIiiIiIiI = iiIiIiiIii.settings.getDefaultGroup();
        iiIiIiiIii.ALLATORIxDEMO = iiIiIiiIii.iIIiiIiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u97c7\u7ffd\u5f42\u540a\u65fe\u9510"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u4f8b\u635c\u97ee\u7fb8\u8893\u595a\u72e0\u605c\u76f2\u6e45\u6259\u5266\u6526\u305f"))).defaultValue((Object)(0x6F & 0x1F))).min(3 & 5).sliderRange(--1, 0x17DC & 0x68EB).build());
        this.iiiiiIIiIi = this.iIIiiIiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u97c7\u7ffd\u5131\u95c8\u65fe\u9510"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u4f8b\u635c\u97ee\u7fb8\u532e\u4e56\u72e0\u605c\u76f2\u6e45\u6259\u5266\u6526\u305f"))).defaultValue((Object)(--2))).min(--1).sliderRange(4 ^ 5, 0x42CB & 0x3DFC).build());
        this.IiiIiIiiIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u81b5\u5290\u5393\u5c21\u70d7\u82de"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u81b7\u52de\u4f02\u757e\u7082\u82e7\u7036\u7bdb\u7e89\u6357\u9883\u881a\u305f"))).defaultValue((Object)(5 >> 2))).build());
        this.IIiIiIIiii = this.iIIiiIiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u7080\u8289\u5393\u5c21\u95fc\u96fb"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u4e52\u6b5c\u7089\u82ec\u53a7\u5c79\u4e1d\u95a9\u76d2\u6e65\u6279\u5246\u6526\u95a9\u96c2\u305f"))).defaultValue((Object)(0x79 & 0x2E))).min(3 >> 1).sliderRange(--1, 0x9DC & 0x76EB).build());
        IiIiIiiIii iiIiIiiIii2 = this;
        this.iIIiIiiiIi = 3 >> 2;
        this.iIiIiIIIII = this.iIIiIiiiIi;
        this.iIiiiIiIii = 5 >> 3;
        iiIiIiiIii2.IIIIiiIiii = this.iIiiiIiIii;
        iiIiIiiIii2.iIiIiiiiII = 2 & 5;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIiIiIiIii.ALLATORIxDEMO("/t:Y,]_m/\\>LoL\u007f\u8bcf\u66ac\u658f\u526f\u6738\u65f2\u726d\u6724\uff6e"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiIiIiiIii iiIiIiiIii;
        int this2;
        IiIiIiiIii iIiIiIIIII2;
        block23: {
            block22: {
                class_1799 class_17992;
                block21: {
                    class_1799 class_17993;
                    block18: {
                        IiIiIiiIii iiIiIiiIii2 = iiIiIiiIii3;
                        IiIiIiiIii iiIiIiiIii3 = post;
                        iIiIiIIIII2 = iiIiIiiIii2;
                        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
                            return;
                        }
                        if (!iIiIiIIIII2.iIiIiIIIII) {
                            iIiIiIIIII2.iIiIiIIIII = iIiiiIIiIi.iiIIiIIiii((class_310)iIiIiIIIII2.iIIiiIiIiI);
                        }
                        if (!iIiIiIIIII2.iIiIiIIIII) {
                            return;
                        }
                        IiIiIiiIii iiIiIiiIii4 = iIiIiIIIII2;
                        iiIiIiiIii4.iIIiIiiiIi += 5 >> 2;
                        if (((Boolean)iiIiIiiIii4.IiiIiIiiIi.get()).booleanValue()) {
                            iIiIiIIIII2.IIIIiiIiii = (Integer)iIiIiIIIII2.IIiIiIIiii.get();
                            iIiIiIIIII2.iIiIiiiiII += 5 >> 2;
                        }
                        this2 = (Integer)iIiIiIIIII2.ALLATORIxDEMO.get() + (Integer)iIiIiIIIII2.iiiiiIIiIi.get();
                        if ((this2 = iIiIiIIIII2.iIIiIiiiIi % this2) == 0) {
                            iIiIiIIIII2.iIIiIiiiIi = 3 >> 2;
                        }
                        class_17992 = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_6118(class_1304.field_6174);
                        if (this2 >= (Integer)iIiIiIIIII2.ALLATORIxDEMO.get()) break block21;
                        iIiIiIIIII2.iIiiiIiIii = 3 >> 1;
                        if (class_17992.method_7909() != class_1802.field_8833) {
                            int n = this2 = 3 ^ 3;
                            while (n < iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31548().method_5439()) {
                                class_1799 class_17994 = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(this2);
                                if (class_17994.method_7909() == class_1802.field_8833) {
                                    InvUtils.move().from(this2).toArmor(1 ^ 3);
                                    class_17993 = class_17992;
                                    break block18;
                                }
                                n = ++this2;
                            }
                        }
                        class_17993 = class_17992;
                    }
                    if (class_17993.method_7909() != class_1802.field_8833 || iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24828() || iIiiiIIiIi.iiIIiIIiii((class_310)iIiIiIIIII2.iIIiiIiIiI)) break block22;
                    IiIiIiiIii iiIiIiiIii5 = iIiIiIIIII2;
                    iiIiIiiIii = iiIiIiiIii5;
                    iiIiIiiIii5.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)iIiIiIIIII2.iIIiiIiIiI.field_1724, class_2848.class_2849.field_12982));
                    break block23;
                }
                iIiIiIIIII2.iIiiiIiIii = 3 ^ 3;
                if (class_17992.method_7909() == class_1802.field_8833) {
                    int n;
                    block19: {
                        int n2;
                        this2 = -4 >> 2;
                        int n3 = n2 = 3 & 4;
                        while (true) {
                            if (n3 >= 36) break;
                            if (iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(n2).method_7960()) {
                                n = this2 = n2;
                                break block19;
                            }
                            n3 = ++n2;
                        }
                        n = this2;
                    }
                    if (n != -1) {
                        InvUtils.move().fromArmor(--2).to(this2);
                    }
                }
            }
            iiIiIiiIii = iIiIiIIIII2;
        }
        if (iiIiIiiIii.iIiiiIiIii && ((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
            IiIiIiiIii iiIiIiiIii6 = iIiIiIIIII2;
            if (iiIiIiiIii6.iIiIiiiiII >= iiIiIiiIii6.IIIIiiIiii) {
                int n;
                int n4;
                block20: {
                    this2 = -4 >> 2;
                    int n5 = n4 = 3 & 4;
                    while (true) {
                        if (n5 >= 9) break;
                        if (iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(n4).method_7909() == class_1802.field_8639) {
                            n = this2 = n4;
                            break block20;
                        }
                        n5 = ++n4;
                    }
                    n = this2;
                }
                if (n != -1) {
                    n4 = iIiiiIIiIi.ALLATORIxDEMO();
                    if (this2 != n4) {
                        iIiiiIIiIi.ALLATORIxDEMO(this2);
                        iIiIiIIIII2.iIIiiIiIiI.field_1761.method_2919((class_1657)iIiIiIIIII2.iIIiiIiIiI.field_1724, class_1268.field_5808);
                        iIiiiIIiIi.ALLATORIxDEMO(n4);
                        return;
                    }
                    iIiIiIIIII2.iIIiiIiIiI.field_1761.method_2919((class_1657)iIiIiIIIII2.iIIiiIiIiI.field_1724, class_1268.field_5808);
                }
            }
        }
    }
}

