/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.meteorclient.addons.GithubRepo
 *  meteordevelopment.meteorclient.addons.MeteorAddon
 *  meteordevelopment.meteorclient.systems.hud.HudGroup
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.github.mikumiku.addon.ok;

import com.github.mikumiku.addon.IiIiIIIIIi;
import com.github.mikumiku.addon.IiIiiiIIII;
import com.github.mikumiku.addon.iiiIIIiiiI;
import java.util.Date;
import lombok.Generated;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MikuMikuAddon
extends MeteorAddon {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(MikuMikuAddon.class);
    public static final HudGroup HUD_GROUP = new HudGroup(IiIiiiIIII.ALLATORIxDEMO("Cx/."));

    public String getPackage() {
        return iiiIIIiiiI.ALLATORIxDEMO("u)pi{'a$b?(\u0014K#f'x)lfr*q#y");
    }

    public void onRegisterCategories() {
        IiIiIIIIIi.ALLATORIxDEMO();
    }

    public GithubRepo getRepo() {
        return new GithubRepo(IiIiiiIIII.ALLATORIxDEMO("|A\\jmc~`="), iiiIIIiiiI.ALLATORIxDEMO("z8r\u001eO>:4k-h"));
    }

    public MikuMikuAddon() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiiIIII.ALLATORIxDEMO("_|^Emd>tenu\u007f#x3\u8bfb\u66e0\u65bb\u5223\u670c\u65be\u7259\u6768\uff5a"));
        }
    }

    public void onInitialize() {
        IiIiIIIIIi.iiiIiIiiIi();
    }
}

