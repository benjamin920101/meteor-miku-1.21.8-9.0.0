/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIiiiiI;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import java.util.Date;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

public class iIIIiIiiiI
extends Module {
    private final Setting<Double> iiiiiIIiIi;
    private final SettingGroup iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private final Setting<SettingColor> ALLATORIxDEMO;

    public iIIIiIiiiI() {
        iIIIiIiiiI iIIIiIiiiI2 = this;
        super(iIiIiIIIii.iiiiiIIiIi, IiiIIiiiiI.ALLATORIxDEMO("!2\u0004\u00112p9/?:\u001f\u0013"), iIIIIiIiii.ALLATORIxDEMO("HO7ZwFfSeD7R#\u0000vGc\u000erFlQ,L%\u0003cOBdCwX#\u007fKN#hFeWnQ\u000bl8V\u007fKi\u0004|LdR8Z"));
        iIIIiIiiiI2.iIIiIiiiIi = iIIIiIiiiI2.settings.getDefaultGroup();
        iIIIiIiiiI2.iIiIiIIIII = iIIIiIiiiI2.settings.createGroup(IiiIIiiiiI.ALLATORIxDEMO("\u0004889\u0013\u000f"));
        iIIIiIiiiI2.iiiiiIIiIi = iIIIiIiiiI2.iIIiIiiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("Pu_0\u0011"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u000ey\u007fv.\u001f\u0007\u0013]\u0019\u001bv)\u001e\u0018v07/=8\u0004S"))).defaultValue(2.0).range(0.5, 10.0).build());
        this.ALLATORIxDEMO = this.iIiIiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("@yR3\u0006"))).description(IiiIIiiiiI.ALLATORIxDEMO("\u00052t:52\u001a\u0012\u0004]\u0019\u001bv)\u001e\u0018v07/=8\u0004S"))).defaultValue(Color.MAGENTA).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIiIiii.ALLATORIxDEMO("[ONbxF+V{GJw;W+\u8bd4\u66f8\u6594\u523b\u6723\u65a6\u7276\u6770\uff75"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        void iIiIiIIIII2;
        iIIIiIiiiI iIIIiIiiiI2 = iIIIiIiiiI3;
        iIIIiIiiiI iIIIiIiiiI3 = new class_238(class_2338.field_10980);
        iIIIiIiiiI3 = iIIIiIiiiI3.method_1012((Double)iIIIiIiiiI2.iiiiiIIiIi.get() * iIIIiIiiiI3.method_17939(), (Double)iIIIiIiiiI2.iiiiiIIiIi.get() * iIIIiIiiiI3.method_17940(), (Double)iIIIiIiiiI2.iiiiiIIiIi.get() * iIIIiIiiiI3.method_17941());
        iIiIiIIIII2.renderer.box((class_238)iIIIiIiiiI3, (Color)iIIIiIiiiI2.ALLATORIxDEMO.get(), (Color)iIIIiIiiiI2.ALLATORIxDEMO.get(), ShapeMode.Both, 2 & 5);
    }
}

