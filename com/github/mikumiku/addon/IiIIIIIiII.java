/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.screen.CraftingScreenHandler
 *  net.minecraft.item.Item
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIiiiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.iIiIiIIIii;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.item.Item;

public class IiIIIIIiII
extends iIiIiIIIii {
    private final Setting<Boolean> iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<List<class_1792>> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiIIIIIiII iiIIIIIiII = iiIIIIIiII2;
        IiIIIIIiII iiIIIIIiII2 = post;
        IiIIIIIiII iIiIiIIIII2 = iiIIIIIiII;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1761 == null) {
            return;
        }
        if (((List)iIiIiIIIII2.iIiIiIIIII.get()).isEmpty()) {
            return;
        }
        if (!(iIiIiIIIII2.iIIiiIiIiI.field_1724.field_7512 instanceof class_1714)) {
            return;
        }
        if (((Boolean)iIiIiIIIII2.iIIiiIiIiI.get()).booleanValue()) {
            iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31548().method_7381();
        }
    }

    public IiIIIIIiII() {
        IiIIIIIiII iiIIIIIiII = this;
        super(IIIiIIiiiI.ALLATORIxDEMO("\u559d\u5c25\u5468\u627b"), IiIiiiIIIi.ALLATORIxDEMO("\u81ae\u52d2\u5451\u6277\u727a\u54ec"));
        iiIIIIIiII.ALLATORIxDEMO = iiIIIIIiII.settings.getDefaultGroup();
        iiIIIIIiII.iIiIiIIIII = iiIIIIIiII.ALLATORIxDEMO.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u7209\u54aa"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u60dc\u89c5\u8190\u52eb\u5475\u6254\u76fe\u7230\u54a6\u5204\u8845"))).defaultValue(Arrays.asList(new class_1792[3 >> 2]))).build());
        this.iIIiiIiIiI = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u9618\u4e2c\u546c\u6b0e"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u5c59\u8baf\u9671\u6b1f\u722d\u54bb\u6856\u4e6a\u541f\u6b48"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiiiiIIiIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u5142\u90c9\u5468\u627b"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u6b95\u6b65\u5472\u6274\u675a\u5943\u53b5\u80ec\u655f\u918b\uff72\u0010\u0015-\u001c-\u70de\u51e8\uff24"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIIiIiiiIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u4e08\u5f22\u7209\u54aa"))).description(IiIiiiIIIi.ALLATORIxDEMO("\u81b0\u52ec\u4e58\u5f67\u5452\u6274\u7233\u54d0\uff27\u8088\u537f\u7a39\u9589\u4e49\u8dc9\u65af\u676e\u753b\uff24"))).defaultValue((Object)(5 >> 2))).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIiIIiiiI.ALLATORIxDEMO("Gpr}dy\u0017Igxvh\u0007H\u0017\u8bcb\u66c4\u658b\u5207\u673c\u659a\u7269\u674c\uff6a"));
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }
}

