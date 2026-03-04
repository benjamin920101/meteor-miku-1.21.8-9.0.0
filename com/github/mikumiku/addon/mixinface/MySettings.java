/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.renderer.GuiRenderer
 *  meteordevelopment.meteorclient.gui.renderer.packer.GuiTexture
 *  meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel
 *  meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory$Factory
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WContainer
 *  meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.client.gui.screen.Screen
 */
package com.github.mikumiku.addon.mixinface;

import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIIiIIiIII;
import com.github.mikumiku.addon.iIiiiiiiii;
import com.github.mikumiku.addon.iiIiIiiiII;
import com.github.mikumiku.addon.iiIiiiiIII;
import com.github.mikumiku.addon.iiiIIIiiiI;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.renderer.GuiRenderer;
import meteordevelopment.meteorclient.gui.renderer.packer.GuiTexture;
import meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel;
import meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WContainer;
import meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.client.gui.screen.Screen;

public class MySettings {
    private final Map<Class<?>, SettingsWidgetFactory.Factory> factories;
    private final GuiTheme theme;

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(3 & 4, stackTraceElement.getClassName()).toString();
        int n = --2;
        int n2 = --2;
        int n3 = string2.length();
        int n4 = n3 - (2 ^ 3);
        char[] cArray = new char[n3];
        int n5 = (5 >> 1 ^ --5) << --4 ^ --4 << (4 ^ 5);
        int cfr_ignored_0 = (--3 ^ --5) << --4 ^ (n2 << n2 ^ 3 & 5);
        int n6 = (--2 ^ --5) << --4 ^ (n << n ^ (4 ^ 5));
        int n7 = iIiIiIIIII2 = string3.length() - (4 ^ 5);
        int n8 = n4;
        String string4 = string3;
        while (n8 >= 0) {
            int n9 = n4--;
            cArray[n9] = (char)(n6 ^ (string2.charAt(n9) ^ string4.charAt(iIiIiIIIII2)));
            if (n4 < 0) break;
            int n10 = n4--;
            char c = cArray[n10] = (char)(n5 ^ (string2.charAt(n10) ^ string4.charAt(iIiIiIIIII2)));
            if (--iIiIiIIIII2 < 0) {
                iIiIiIIIII2 = n7;
            }
            n8 = n4;
        }
        return new String(cArray);
    }

    private static /* synthetic */ void lambda$reset$4(Setting setting, Runnable runnable) {
        Runnable iIiIiIIIII2 = runnable;
        Setting iIiIiIIIII3 = setting;
        iIiIiIIIII3.reset();
        if (iIiIiIIIII2 != null) {
            iIiIiIIIII2.run();
        }
    }

    private /* synthetic */ void lambda$proListW$3(iiIiiiiIII iiIiiiiIII2) {
        MySettings mySettings = object;
        Object object = iiIiiiiIII2;
        MySettings iIiIiIIIII2 = mySettings;
        MeteorClient.mc.method_1507((class_437)new iIIiIIiIII(iIiIiIIIII2.theme, (iiIiiiiIII)((Object)object)));
    }

    public void addSettings() {
        this.factories.put(iIiiiiiiii.class, (wTable, setting) -> {
            void iIiIiIIIII2;
            MySettings mySettings = mySettings2;
            MySettings mySettings2 = setting;
            MySettings iIiIiIIIII3 = mySettings;
            iIiIiIIIII3.stringMapW((WTable)iIiIiIIIII2, (iIiiiiiiii)((Object)((Object)mySettings2)));
        });
        this.factories.put(iiIiIiiiII.class, (wTable, setting) -> {
            void iIiIiIIIII2;
            MySettings mySettings = mySettings2;
            MySettings mySettings2 = setting;
            MySettings iIiIiIIIII3 = mySettings;
            iIiIiIIIII3.itemListMapW((WTable)iIiIiIIIII2, (iiIiIiiiII)((Object)((Object)mySettings2)));
        });
        this.factories.put(iiIiiiiIII.class, (wTable, setting) -> {
            void iIiIiIIIII2;
            MySettings mySettings = mySettings2;
            MySettings mySettings2 = setting;
            MySettings iIiIiIIIII3 = mySettings;
            iIiIiIIIII3.proListW((WTable)iIiIiIIIII2, (iiIiiiiIII)((Object)((Object)mySettings2)));
        });
    }

    /*
     * WARNING - void declaration
     */
    public MySettings(Map<Class<?>, SettingsWidgetFactory.Factory> map, GuiTheme guiTheme) {
        void iIiIiIIIII2;
        MySettings iIiIiIIIII3;
        MySettings mySettings = mySettings2;
        MySettings mySettings2 = guiTheme;
        MySettings mySettings3 = iIiIiIIIII3 = mySettings;
        mySettings3.factories = iIiIiIIIII2;
        mySettings3.theme = mySettings2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIiIiii.ALLATORIxDEMO("FRs_xF,QuIpM;W+\u8bd4\u66f8\u6594\u523b\u6723\u65a6\u7276\u6770\uff75"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void stringMapW(WTable wTable, iIiiiiiiii iIiiiiiiii2) {
        void iIiIiIIIII2;
        MySettings mySettings = mySettings2;
        MySettings mySettings2 = wTable;
        MySettings iIiIiIIIII3 = mySettings;
        mySettings2 = (WTable)mySettings2.add((WWidget)iIiIiIIIII3.theme.table()).expandX().widget();
        iIiiiiiiii.ALLATORIxDEMO(iIiIiIIIII3.theme, (WTable)mySettings2, (iIiiiiiiii)iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    public void proListW(WTable wTable, iiIiiiiIII iiIiiiiIII2) {
        void iIiIiIIIII2;
        MySettings iIiIiIIIII3;
        MySettings mySettings = object;
        Object object = iiIiiiiIII2;
        MySettings mySettings2 = iIiIiIIIII3 = mySettings;
        mySettings2.selectW((WContainer)iIiIiIIIII2, (Setting<?>)object, () -> mySettings2.lambda$proListW$3((iiIiiiiIII)((Object)object)));
    }

    /*
     * WARNING - void declaration
     */
    public void itemListMapW(WTable wTable, iiIiIiiiII iiIiIiiiII2) {
        void iIiIiIIIII2;
        MySettings mySettings = mySettings2;
        MySettings mySettings2 = wTable;
        MySettings iIiIiIIIII3 = mySettings;
        mySettings2 = (WTable)mySettings2.add((WWidget)iIiIiIIIII3.theme.table()).expandX().widget();
        iiIiIiiiII.ALLATORIxDEMO(iIiIiIIIII3.theme, (WTable)mySettings2, (iiIiIiiiII)iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void reset(WContainer wContainer, Setting<?> setting, Runnable runnable) {
        void iIiIiIIIII2;
        MySettings mySettings = runnable2;
        Runnable runnable2 = runnable;
        MySettings iIiIiIIIII3 = mySettings;
        ((WButton)iIiIiIIIII.add((WWidget)iIiIiIIIII3.theme.button((GuiTexture)GuiRenderer.RESET)).widget()).action = () -> MySettings.lambda$reset$4((Setting)iIiIiIIIII2, runnable2);
    }

    /*
     * WARNING - void declaration
     */
    public void selectW(WContainer wContainer, Setting<?> setting, Runnable runnable) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        MySettings mySettings = mySettings2;
        int n = WSelectedCountLabel.getSize(iIiIiIIIII4) != -4 >> 2 ? --1 : 0;
        MySettings mySettings2 = iIiIiIIIII3;
        if (n != 0) {
            mySettings2 = (WContainer)iIiIiIIIII3.add((WWidget)mySettings.theme.horizontalList()).expandCellX().widget();
            ((WHorizontalList)mySettings2).spacing *= 2.0;
        }
        ((WButton)mySettings2.add((WWidget)mySettings.theme.button((String)iiiIIIiiiI.ALLATORIxDEMO((String)"\u9077\u62cc"))).expandCellX().widget()).action = iIiIiIIIII2;
        if (n != 0) {
            mySettings2.add((WWidget)new WSelectedCountLabel((Setting<?>)iIiIiIIIII4).color(mySettings.theme.textSecondaryColor()));
        }
        mySettings.reset((WContainer)iIiIiIIIII3, (Setting<?>)iIiIiIIIII4, null);
    }

    public static class WSelectedCountLabel
    extends WMeteorLabel {
        private int lastSize;
        private final Setting<?> setting;

        /*
         * WARNING - void declaration
         */
        public void onRender(GuiRenderer guiRenderer, double d, double d2, double d3) {
            void iIiIiIIIII2;
            void iIiIiIIIII3;
            void iIiIiIIIII4;
            void iIiIiIIIII5;
            WSelectedCountLabel wSelectedCountLabel = this;
            int n = WSelectedCountLabel.getSize(wSelectedCountLabel.setting);
            if (n != wSelectedCountLabel.lastSize) {
                wSelectedCountLabel.set("(" + n + " selected)");
                wSelectedCountLabel.lastSize = n;
            }
            super.onRender((GuiRenderer)iIiIiIIIII5, (double)iIiIiIIIII4, (double)iIiIiIIIII3, (double)iIiIiIIIII2);
        }

        public WSelectedCountLabel(Setting<?> setting) {
            Setting<?> iIiIiIIIII2;
            Setting<?> setting2 = setting3;
            Setting<?> setting3 = setting;
            Setting<?> setting4 = iIiIiIIIII2 = setting2;
            super("", 5 >> 3);
            setting4.lastSize = -4 >> 2;
            setting4.setting = setting3;
            if (new Date().after(new Date(1773504000082L))) {
                throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
            }
        }

        public static int getSize(Setting<?> setting) {
            Setting<?> setting2 = setting;
            Object iIiIiIIIII2 = setting2.get();
            if (iIiIiIIIII2 instanceof Collection) {
                return ((Collection)iIiIiIIIII2).size();
            }
            iIiIiIIIII2 = setting2.get();
            if (iIiIiIIIII2 instanceof Map) {
                return ((Map)iIiIiIIIII2).size();
            }
            return -1;
        }
    }
}

