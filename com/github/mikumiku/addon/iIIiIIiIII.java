/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.client.resource.language.I18n
 *  net.minecraft.village.VillagerProfession
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIiIiiiI;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiIiiiiIII;
import java.util.Collection;
import java.util.Date;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.screens.settings.base.CollectionListSettingScreen;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.village.VillagerProfession;
import net.minecraft.registry.Registries;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIiIIiIII
extends CollectionListSettingScreen<class_3852> {
    public WWidget ALLATORIxDEMO(class_3852 class_38522) {
        iIIiIIiIII iIIiIIiIII2 = object;
        Object object = class_38522;
        iIIiIIiIII iIiIiIIIII2 = iIIiIIiIII2;
        object = class_1074.method_4662((String)("entity.minecraft.villager." + String.valueOf(object.comp_818())), (Object[])new Object[3 & 4]);
        return iIiIiIIIII2.theme.label((String)object);
    }

    /*
     * WARNING - void declaration
     */
    public boolean ALLATORIxDEMO(class_3852 class_38522) {
        void iIiIiIIIII2;
        iIIiIIiIII iIIiIIiIII2 = object;
        Object object = ((iiIiiiiIII)iIIiIIiIII2.setting).ALLATORIxDEMO;
        if (object != null && !object.test(iIiIiIIIII2)) {
            return (3 & 4) != 0;
        }
        object = (class_3852)class_7923.field_41195.method_29107(class_3852.field_17051);
        if (iIiIiIIIII2 != object) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    public String[] ALLATORIxDEMO(class_3852 object) {
        iIIiIIiIII iIIiIIiIII2 = iIIiIIiIII3;
        iIIiIIiIII iIIiIIiIII3 = object;
        object = iIIiIIiIII2;
        String[] stringArray = new String[5 >> 1];
        stringArray[3 >> 2] = iIIiIIiIII3.comp_818().getString();
        stringArray[--1] = iIIiIIiIII3.comp_818().toString();
        return stringArray;
    }

    /*
     * WARNING - void declaration
     */
    public iIIiIIiIII(GuiTheme guiTheme, iiIiiiiIII iiIiiiiIII2) {
        void iIiIiIIIII2;
        iIIiIIiIII iIIiIIiIII2 = object;
        Object object = iiIiiiiIII2;
        iIIiIIiIII iIiIiIIIII3 = iIIiIIiIII2;
        Object object2 = object;
        super((GuiTheme)iIiIiIIIII2, iiIIiiIIIi.ALLATORIxDEMO("\u901e\u62af"), (Setting)object2, (Collection)object2.get(), (Iterable)class_7923.field_41195);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIiIiiiI.ALLATORIxDEMO("P\te\u0004S  \u0010p\u0001a\u0011\u00101\u0000\u8bb2\u66d3\u65f2\u5210\u6745\u658d\u7210\u675b\uff13"));
        }
    }
}

