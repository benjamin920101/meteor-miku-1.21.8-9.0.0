/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.systems.hud.HudElement
 *  meteordevelopment.meteorclient.systems.hud.HudElementInfo
 *  meteordevelopment.meteorclient.systems.hud.HudRenderer
 *  meteordevelopment.meteorclient.utils.render.color.Color
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIiiiiI;
import com.github.mikumiku.addon.iIiiiIiIII;
import com.github.mikumiku.addon.ok.MikuMikuAddon;
import java.util.Date;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class iiIIiIIiiI
extends HudElement {
    public static final HudElementInfo<iiIIiIIiiI> ALLATORIxDEMO = new HudElementInfo(MikuMikuAddon.HUD_GROUP, IiiIIiiiiI.ALLATORIxDEMO(";4\u001d\b"), iIiiiIiIII.ALLATORIxDEMO("?_Fu867226$\u007f:+!}."), iiIIiIIiiI::new);

    public iiIIiIIiiI() {
        super(ALLATORIxDEMO);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIiiiIiIII.ALLATORIxDEMO("\u000f;\u001a\u0016\f\u0012\u007f\"/3\u001e\u0003o#\u007f\u8ba0\u66ac\u65e0\u526f\u6757\u65f2\u7202\u6724\uff01"));
        }
    }

    public void render(HudRenderer hudRenderer) {
        iiIIiIIiiI iiIIiIIiiI2 = iiIIiIIiiI3;
        iiIIiIIiiI iiIIiIIiiI3 = hudRenderer;
        iiIIiIIiiI iIiIiIIIII2 = iiIIiIIiiI2;
        iiIIiIIiiI iiIIiIIiiI4 = iiIIiIIiiI3;
        iIiIiIIIII2.setSize(iiIIiIIiiI4.textWidth(IiiIIiiiiI.ALLATORIxDEMO("\u001b4\u001d\bV\u0018:8;8\u0018\t"), 3 >> 1), iiIIiIIiiI3.textHeight(3 >> 1));
        iiIIiIIiiI4.quad(iIiIiIIIII2.x, iIiIiIIIII2.y, iIiIiIIIII2.getWidth(), iIiIiIIIII2.getHeight(), Color.LIGHT_GRAY);
        iiIIiIIiiI4.text(iIiiiIiIII.ALLATORIxDEMO("\t%8.x5>?>>*8"), iIiIiIIIII2.x, iIiIiIIIII2.y, Color.WHITE, 5 >> 2);
    }
}

