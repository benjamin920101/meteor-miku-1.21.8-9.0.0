/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1657
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIiiiiI;
import com.github.mikumiku.addon.IiiiIIiiII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.modules.AutoSM;
import java.util.Date;
import java.util.Random;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1657;

public class iiIiiiiiII
extends iIiIiIIIii {
    private int IIiiIIIIIi;
    public static final /* synthetic */ boolean iIiiiIiIii;
    private final SettingGroup iIiIiiiiII;
    private final Setting<Double> IIIIiiIiii;
    private static final String[] IiiIiIiiIi;
    private final Random IIiIiIIiii;
    public final Setting<Boolean> iIIiiIiIiI;
    private final Setting<AutoSM.MoanMode> iiiiiIIiIi;
    private double iIIiIiiiIi;
    private static final String[] iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiIiiiiiII iiIiiiiiII2 = iiIiiiiiII3;
        iiIiiiiiII iiIiiiiiII3 = render3DEvent;
        iiIiiiiiII iIiIiIIIII2 = iiIiiiiiII2;
        iIiIiIIIII2.iIIiIiiiIi = Math.min((Double)iIiIiIIIII2.IIIIiiIiii.get(), iIiIiIIIII2.iIIiIiiiIi + ((Render3DEvent)iiIiiiiiII3).frameTime);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiIiiiiiII iIiIiIIIII2;
        iiIiiiiiII iiIiiiiiII2 = iiIiiiiiII3;
        iiIiiiiiII iiIiiiiiII3 = pre;
        iiIiiiiiII iiIiiiiiII4 = iIiIiIIIII2 = iiIiiiiiII2;
        iiIiiiiiII4.iIIiIiiiIi += 1.0;
        if (iiIiiiiiII4.iIIiiIiIiI.field_1724 != null && iIiIiIIIII2.iIIiiIiIiI.field_1687 != null && iIiIiIIIII2.iIIiIiiiIi >= (Double)iIiIiIIIII2.IIIIiiIiii.get()) {
            iIiIiIIIII2.ALLATORIxDEMO();
            iIiIiIIIII2.iIIiIiiiIi = 0.0;
        }
    }

    public iiIiiiiiII() {
        iiIiiiiiII iiIiiiiiII2 = this;
        super(IiiIIiiiiI.ALLATORIxDEMO("\u819c\u52d5\u7948\u4ed9"), IiiiIIiiII.iiIIiIIiii("\u81eb\u52f6\u5bad\u670b\u8f82\u7688\u4eee\u8bff\u7977\u4eb2\u7687\u8b81"));
        iiIiiiiiII2.iIiIiiiiII = iiIiiiiiII2.settings.getDefaultGroup();
        iiIiiiiiII2.iiiiiIIiIi = iiIiiiiiII2.iIiIiiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u6dfe\u6012\u6a57\u5f72"))).description(IiiiIIiiII.iiIIiIIiii("\u9005\u62fa\u539d\u9055\u54e1\u7999\u7c70\u57ff\u76af\u53a4\u8bc6\u3056\u6a2a\u5f5b\u9002\u62bd\uff11\u656f\u65b2\u5384\u8be6T\u0004!\u5389\u65ed\u53fb\u8b9e,{+\u6dbe\u541e\u968c\u6766"))).defaultValue((Object)AutoSM.MoanMode.iIIiIiiiIi)).build());
        this.iIIiiIiIiI = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u8197\u52de\u8b89"))).description(IiiiIIiiII.iiIIiIIiii("\u81a3\u52be\u8bf7\u305e"))).defaultValue((Object)(--1 != 0))).build());
        this.ALLATORIxDEMO = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u5f8b\u7518\u590b\u53b6"))).description(IiiiIIiiII.iiIIiIIiii("\u4e5e\u4f16\u5bad\u5976\u5382\u5f16\u8f65\u305e"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IIIIiiIiii = this.iIiIiiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIiiiiI.ALLATORIxDEMO("\u5e80\u8fa2"))).description(IiiiIIiiII.iiIIiIIiii("\u4e0f\u6b20\u5425\u544b\u768f\u95a7\u9698t\u007f uh\u305e"))).defaultValue(100.0).min(1.0).sliderRange(1.0, 1000.0).build());
        this.iIIiIiiiIi = 0.0;
        iiIiiiiiII iiIiiiiiII3 = this;
        iiIiiiiiII3.IIiIiIIiii = new Random();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIIiiiiI.ALLATORIxDEMO("\u00016t{%8v(\u0006\u00197)3|v\u8baa\u66a2\u65ed\u5266\u675d\u65c6\u7235\u675a\uff7c"));
        }
    }

    private /* synthetic */ class_1657 ALLATORIxDEMO() {
        iiIiiiiiII iiIiiiiiII2 = iiIiiiiiII4;
        if (!(iIiiiIiIii || iiIiiiiiII2.iIIiiIiIiI.field_1724 != null && iiIiiiiiII2.iIIiiIiIiI.field_1687 != null)) {
            throw new AssertionError();
        }
        iiIiiiiiII iiIiiiiiII3 = null;
        float f = -1.0f;
        if (!iiIiiiiiII2.iIIiiIiIiI.field_1687.method_18456().isEmpty()) {
            for (iiIiiiiiII iiIiiiiiII4 : iiIiiiiiII2.iIIiiIiIiI.field_1687.method_18456()) {
                if (iiIiiiiiII4 == iiIiiiiiII2.iIIiiIiIiI.field_1724 || ((Boolean)iiIiiiiiII2.ALLATORIxDEMO.get()).booleanValue() && Friends.get().isFriend((class_1657)iiIiiiiiII4) || iiIiiiiiII3 != null && !(iiIiiiiiII2.iIIiiIiIiI.field_1724.method_19538().method_1022(iiIiiiiiII4.method_19538()) < (double)f)) continue;
                iiIiiiiiII3 = iiIiiiiiII4;
                f = (float)iiIiiiiiII2.iIIiiIiIiI.field_1724.method_19538().method_1022(iiIiiiiiII4.method_19538());
            }
        }
        return iiIiiiiiII3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void ALLATORIxDEMO() {
        iiIiiiiiII iiIiiiiiII2 = this;
        class_1657 class_16572 = iiIiiiiiII2.ALLATORIxDEMO();
        if (class_16572 == null) {
            return;
        }
        String string = class_16572.method_5477().getString();
        switch (((AutoSM.MoanMode)((Object)iiIiiiiiII2.iiiiiIIiIi.get())).ordinal()) {
            case 1: {
                int n = iiIiiiiiII2.IIiIiIIiii.nextInt(3 ^ 3, iIiIiIIIII.length - (3 & 5));
                if (n == iiIiiiiiII2.IIiiIIIIIi) {
                    n = n < iIiIiIIIII.length - --1 ? n + (2 ^ 3) : 0;
                }
                iiIiiiiiII2.IIiiIIIIIi = n;
                ChatUtils.sendPlayerMsg((String)iIiIiIIIII[n].replace(IiiiIIiiII.iiIIiIIiii("W^"), string));
                return;
            }
            case 0: {
                int n = iiIiiiiiII2.IIiIiIIiii.nextInt(3 & 4, IiiIiIiiIi.length - (5 >> 2));
                if (n == iiIiiiiiII2.IIiiIIIIIi) {
                    n = n < IiiIiIiiIi.length - (5 >> 2) ? n + --1 : 0;
                }
                iiIiiiiiII2.IIiiIIIIIi = n;
                ChatUtils.sendPlayerMsg((String)IiiIiIiiIi[n].replace(IiiIIiiiiI.ALLATORIxDEMO("S\u000e"), string));
                return;
            }
        }
    }

    static {
        iIiiiIiIii = !iiIiiiiiII.class.desiredAssertionStatus() ? 3 >> 1 : 0;
        String[] stringArray = new String[0x13 & 0x7F];
        stringArray[5 >> 3] = IiiiIIiiII.iiIIiIIiii("\u7235\u51d9\u72eb\u4e49\u70af\u5e71\u624d");
        stringArray[5 >> 2] = IiiIIiiiiI.ALLATORIxDEMO("\u51db\u6dac\u70ef\uff5c\u726f\u51d0\u6d87\u4e7d\u70cf\uff7c");
        stringArray[--2] = IiiiIIiiII.iiIIiIIiii("\u5976\u726e\uff0d\u726d\u768f\u5963\u5931\u4e85\uff5d");
        stringArray[--3] = IiiIIiiiiI.ALLATORIxDEMO("\u6247\u726c\u4f36\u76d9\u5971\u5c11VX\u0005\uff7c");
        stringArray[--4] = IiiiIIiiII.iiIIiIIiii("\u726d\u5723\u6242\u5c08\u51ae\u676e\u5204\u523d\u505f\uff5d");
        stringArray[--5] = IiiIIiiiiI.ALLATORIxDEMO("\u4f36\u4e67\u4ed0\u624c\u781a\u524d\u4e7b\u8831");
        stringArray[0x7F & 6] = IiiiIIiiII.iiIIiIIiii("\u60a2\u6284\u6245\u83c1\u82e2\u649d\u5973\u541ci3p\uff43");
        stringArray[0x6F & 0x17] = IiiIIiiiiI.ALLATORIxDEMO("\u6267\u724c\u4f16\u7244");
        stringArray[0x4A & 0x3D] = IiiiIIiiII.iiIIiIIiii("\u64c1\u5264\u621a\u8383\u82a7\u5f03\u82ed");
        stringArray[0x79 & 0xF] = IiiIIiiiiI.ALLATORIxDEMO("x%}\u8dd3\u726c\u6267\u76f9\u83bc\u82cc");
        stringArray[0x1E & 0x6B] = IiiiIIiiII.iiIIiIIiii("\u6210\u7576\u7d79\u81f5\u76d5\u83c4\u82e5\u8ba2s)'+\u7274\u5226\u4e0e\u8810");
        stringArray[0x7F & 0xB] = IiiIIiiiiI.ALLATORIxDEMO("\u726f\u76d9\u5971\u5c11\u539e\u7cca\u53be\u5967\u6c37\uff7c");
        stringArray[0xF & 0x7C] = IiiiIIiiII.iiIIiIIiii("\u6c11\u4f6c\u757c\u5c36\u5121\u528d\u64ce\u624d");
        stringArray[0x5D & 0x2F] = IiiIIiiiiI.ALLATORIxDEMO("\u6247\u6672vx%}\u76d2\u4e4e\u5c08\u5a45\u53a1\u7cc3\u5880\uff7c");
        stringArray[0x1F & 0x6E] = IiiiIIiiII.iiIIiIIiii("\u6c1c\u4f3e\u628b\u6e8b\u70e5\u76d0\u6c4a\u5c57\u8fd7\u6245\u670b\u6db8\u5912\u723a\uff5d");
        stringArray[0x1F & 0x6F] = IiiIIiiiiI.ALLATORIxDEMO("\u6247\u726cvx%}\u577e\u624c\u4f05\u51d8\u76f2\u6162\u89bf\uff7c");
        stringArray[0x12 & 0x7D] = IiiiIIiiII.iiIIiIIiii("{-!\u4e51\u7705\u5264\u621a\u5c12\u80ad\u5c65\u7867\u5279\u4e1b\u884f\uff5d");
        stringArray[0x5B & 0x35] = IiiIIiiiiI.ALLATORIxDEMO("s.v\u7224\u527d\u726c\u72b6\u72bd\u5e24\u624c\u76f2\u83b7\u82c7\uff7c");
        stringArray[0x7B & 0x16] = IiiiIIiiII.iiIIiIIiii("\u4f61\u5c60\u4e03\u80a9\u6281\u6753\u5402\u4e54\u53ee\u8bbd\u51ec\u6766\u544b");
        iIiIiIIIII = stringArray;
        String[] stringArray2 = new String[0x3A & 0x55];
        stringArray2[5 >> 3] = IiiIIiiiiI.ALLATORIxDEMO("\u4e00\u4e0b\u547a\u8b80\uff7a\u8bd4\u724f\u7240");
        stringArray2[--1] = IiiiIIiiII.iiIIiIIiii("\u8050\u5b5e\u6754\u723a\u5e21\u4f6c\u5c15\u7737i3p\uff5d");
        stringArray2[--2] = IiiIIiiiiI.ALLATORIxDEMO("\u62dc\u4f3d\u839c\u82ec\u7358\u7ea4\u724f\uff7c");
        stringArray2[--3] = IiiiIIiiII.iiIIiIIiii("\u6701\u726f\u4f3e\u88aa\u6240\u64c3\u5264\u6d4a\u521e\u6c38\u76d0\u683c\u5b196&/");
        stringArray2[--4] = IiiIIiiiiI.ALLATORIxDEMO("\u5092\u4e7c\u4e0b\u7281\u4e5d\u6861\u7e84\u724f\u8269\u5246\u5ee8");
        stringArray2[--5] = IiiiIIiiII.iiIIiIIiii("\u8fc9\u6731\u9a9a\u4e59\u7235\u76d0\u5bbd\u4f506&/");
        stringArray2[0x5F & 0x26] = IiiIIiiiiI.ALLATORIxDEMO("\u677d\u7267\u4f3d\u547d\u771d\u6247\u7756\u7716\u624c\u76d2\u686a\u5b26]S\u000e");
        stringArray2[0x67 & 0x1F] = IiiiIIiiII.iiIIiIIiii("$\".\u88ff\u621a\u5e21\u7688\u65a2\u5012\u53a6\u7227\u5233\u725a");
        stringArray2[0xF & 0x78] = IiiIIiiiiI.ALLATORIxDEMO("s.v\u76d9\u839c\u82ec\u7d51\u524d\u7270\uff7c");
        stringArray2[0x1B & 0x6D] = IiiiIIiiII.iiIIiIIiii("$\".\u637c\u64c6\u76d7\u65fa\u504d\u7714\u5086\u4e3c\u4e55\u728b");
        stringArray2[0x3B & 0x4E] = IiiIIiiiiI.ALLATORIxDEMO("\u675d\u7267\u4f3d\u9ac7\u5775\u6247\u4e57\u9714\u6210\u5c37\u80dc");
        stringArray2[0x4B & 0x3F] = IiiiIIiiII.iiIIiIIiii("$\".\u637c\u5e79\u76d7\u65fa\u504d\u5a0c\u55d1\u5f81\u8d3f\u592a");
        stringArray2[0x6D & 0x1E] = IiiIIiiiiI.ALLATORIxDEMO("x%}\u6679\u5974\u4e5d\u7b71\u4e76\u7cc3\u5880\uff7c");
        stringArray2[0x4F & 0x3D] = IiiiIIiiII.iiIIiIIiii("$\".\u6c6c\u8fd7\u9936\u6e38\u7714\u7b42\u7270\u7692\u5bb5\u4f45");
        stringArray2[0x5F & 0x2E] = IiiIIiiiiI.ALLATORIxDEMO("\u6bb2\u6b77\u7756\u5266}s.v\u624c\u90ab\u7831\u5fe1\u50b2\u7785\u5949");
        stringArray2[0x1F & 0x6F] = IiiiIIiiII.iiIIiIIiii("\u4f61\u5c60\u4e03\u80a9\u6281\u6753\u5402\u4e54\u53ee\u8bbd\u51ec\u6766\u544b");
        IiiIiIiiIi = stringArray2;
    }
}

