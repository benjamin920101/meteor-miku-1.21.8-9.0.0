/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2664
 *  net.minecraft.class_2743
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.Date;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2664;
import net.minecraft.class_2743;

public class IIIIIiIIii
extends iIiIiIIIii {
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Double> IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Double> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_243 class_2432) {
        void iIiIiIIIII2;
        IIIIIiIIii iIIIIiIIii = iIIIIiIIii2;
        IIIIIiIIii iIIIIiIIii2 = iIIIIiIIii.iIIiiIiIiI.field_1724;
        if (iIIIIiIIii2 == null) {
            return;
        }
        IIIIIiIIii iIIIIiIIii3 = iIIIIiIIii2;
        if (((Boolean)iIIIIiIIii.iIIiIiiiIi.get()).booleanValue()) {
            iIIIIiIIii3.method_18799(iIIIIiIIii2.method_18798().method_1019(iIiIiIIIII2.method_1021(0.98)));
            return;
        }
        iIIIIiIIii3.method_18799(iIIIIiIIii2.method_18798().method_1019((class_243)iIiIiIIIII2));
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        void iIiIiIIIII2;
        IIIIIiIIii iIIIIiIIii = this;
        if (((Boolean)iIIIIiIIii.ALLATORIxDEMO.get()).booleanValue() && (iIIIIiIIii.iIIiiIiIiI.field_1690.field_1881.method_1434() || iIIIIiIIii.iIIiiIiIiI.field_1690.field_1894.method_1434() || iIIIIiIIii.iIIiiIiIiI.field_1690.field_1913.method_1434() || iIIIIiIIii.iIIiiIiIiI.field_1690.field_1849.method_1434())) {
            return;
        }
        if (iIIIIiIIii.iIIiiIiIiI.field_1724 == null || iIIIIiIIii.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (((Boolean)iIIIIiIIii.iiiiiIIiIi.get()).booleanValue() && !iIIIIiIIii.iIIiiIiIiI.field_1724.method_24828()) {
            return;
        }
        class_2596 class_25962 = iIiIiIIIII2.packet;
        if (class_25962 instanceof class_2743) {
            this = (class_2743)class_25962;
            if (this.method_11818() == iIIIIiIIii.iIIiiIiIiI.field_1724.method_5628()) {
                double d = (Double)iIIIIiIIii.iIiIiIIIII.get();
                double d2 = (Double)iIIIIiIIii.IIiIiIIiii.get();
                if (d == 1.0 && d2 == 1.0) {
                    return;
                }
                iIiIiIIIII2.cancel();
                IIIIIiIIii iIIIIiIIii2 = this;
                double d3 = iIIIIiIIii2.method_11815() / 8000.0 * d;
                double d4 = iIIIIiIIii2.method_11816() / 8000.0 * d2;
                double d5 = iIIIIiIIii2.method_11819() / 8000.0 * d;
                iIIIIiIIii.ALLATORIxDEMO(new class_243(d3, d4, d5));
                return;
            }
        } else {
            class_25962 = iIiIiIIIII2.packet;
            if (class_25962 instanceof class_2664) {
                this = (class_2664)class_25962;
                if (((Boolean)iIIIIiIIii.IiiIiIiiIi.get()).booleanValue()) {
                    double d = (Double)iIIIIiIIii.iIiIiIIIII.get();
                    double d6 = (Double)iIIIIiIIii.IIiIiIIiii.get();
                    iIiIiIIIII2.cancel();
                    class_243 class_2432 = iIiiiIIiIi.ALLATORIxDEMO((class_2664)this);
                    iIIIIiIIii.ALLATORIxDEMO(new class_243(class_2432.field_1352 * d, class_2432.field_1351 * d6, class_2432.field_1350 * d));
                }
            }
        }
    }

    public IIIIIiIIii() {
        IIIIIiIIii iIIIIiIIii = this;
        super((Category)iIIiIiiiIi, IiIIiIIiiI.ALLATORIxDEMO("\u53c3\u519f\u9044\u0005"), iIIIIiIiii.ALLATORIxDEMO("\u572b\u8880\u6538\u51d0\u6215\u722d\u70bb\u65fd\u51ec\u5c3a\u6215\u629e\u6294\u51f0\u9023\u6543\u67bf~^\u5177\u5b9a,cyJ{\u007f\u001f]"));
        iIIIIiIIii.iIIiiIiIiI = iIIIIiIIii.settings.getDefaultGroup();
        iIIIIiIIii.iIiIiIIIII = iIIIIiIIii.iIIiiIiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIIiIIiiI.ALLATORIxDEMO("\u6c27\u5e0a\u51f5\u9064\u6b90\u4fa5"))).description(iIIIIiIiii.ALLATORIxDEMO("\u8c67\u655f\u6766\u81c1\u6538\u51d0\u7687\u6c1f\u5e70\u51d0\u9003\u5f31\u5e85\u000b+\u001b#6\u0003\u65eb\u51d8\u905eZ+\u0012,\u0019+\u53bc\u59dd\u5f04\u5efa]"))).defaultValue(0.0).min(0.0).max(1.0).sliderMax(1.0).build());
        this.IIiIiIIiii = this.iIIiiIiIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIIiIIiiI.ALLATORIxDEMO("\u5791\u768d\u51f5\u9064\u6b90\u4fa5"))).description(iIIIIiIiii.ALLATORIxDEMO("\u8c20\u652a\u6713\u81e1\u6518\u51f7\u76a0\u5789\u76d7\u51ed\u903e\u5f66\u5ed2"))).defaultValue(0.0).min(0.0).max(1.0).sliderMax(1.0).build());
        this.IiiIiIiiIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIIiiI.ALLATORIxDEMO("\u7208\u70dc\u5f35\u54e3"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6604\u5425\u5bd2#_m_\u0003qV\u720d\u709b\u7c77\u4f00\u5bb8\u5eb7\u753e\u53f3\u51a7\u9074"))).defaultValue((Object)(3 >> 1))).build());
        this.ALLATORIxDEMO = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIIiiI.ALLATORIxDEMO("\u9656\u5325\u8134"))).description(iIIIIiIiii.ALLATORIxDEMO("\u966c\u5317\u8111\uff2f,\u79df\u52a3\u65d5\u4e1b\u53f3\u51a7\u9074"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiiiiIIiIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIIiiI.ALLATORIxDEMO("\u4ed6\u5751\u573e\u9706\u755b\u6566"))).description(iIIIIiIiii.ALLATORIxDEMO("\u4eee\u5f50\u4f4b\u7ada\u5703\u5733\u9769\u4e29\u65dd\u624e\u51e4\u5c12\u51f0\u9023\uff07\u9611\u6b3c\u7a0c\u4e26\u886f\u4e36\u888fLQ\u007fS\u689c\u6d3f"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIIiIiiiIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIIiiI.ALLATORIxDEMO("\u4f39\u88bc\u81e4\u7152\u52ec\u4f72"))).description(iIIIIiIiii.ALLATORIxDEMO("\u4f01\u9023\u8f70\u5f8d\u79d0\u52ab\u4ece\u7ed6\u8fcc\u0003LQ7\u001b+\u68e3\u6d47\u0004#\u638b\u8346\u5f3e\u5473]"))).defaultValue((Object)(5 >> 2))).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiIIiiI.ALLATORIxDEMO("c5v\u0018@<\u0013,c\u001dr\r#\r3\u8b8e\u66e0\u65ce\u5223\u6779\u65be\u722c\u6768\uff2f"));
        }
    }
}

