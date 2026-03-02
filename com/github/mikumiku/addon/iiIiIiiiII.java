/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.renderer.GuiRenderer
 *  meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WMinus
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WPlus
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.ItemListSetting
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.class_1792
 *  net.minecraft.class_2378
 *  net.minecraft.class_2487
 *  net.minecraft.class_2499
 *  net.minecraft.class_2519
 *  net.minecraft.class_2520
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 *  net.minecraft.class_7923
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.iiiiIiiIIi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.renderer.GuiRenderer;
import meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.input.WTextBox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.gui.widgets.pressable.WMinus;
import meteordevelopment.meteorclient.gui.widgets.pressable.WPlus;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.class_1792;
import net.minecraft.class_2378;
import net.minecraft.class_2487;
import net.minecraft.class_2499;
import net.minecraft.class_2519;
import net.minecraft.class_2520;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_7923;

public class iiIiIiiiII
extends Setting<Map<String, List<class_1792>>> {
    private final boolean iIiIiIIIII;
    public final Predicate<class_1792> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void iiiIiIiiIi(Map map, AtomicReference atomicReference, GuiTheme guiTheme, WTable wTable, iiIiIiiiII iiIiIiiiII2) {
        void iIiIiIIIII2;
        ItemListSettingScreen iIiIiIIIII3;
        void iIiIiIIIII4;
        Map iIiIiIIIII5 = wTable;
        Map iIiIiIIIII6 = map;
        List list = (List)iIiIiIIIII6.get(iIiIiIIIII4.get());
        iIiIiIIIII5 = new ItemListSetting(iiIIiiiIIi.ALLATORIxDEMO("F'j>|"), "Items for key '" + (String)iIiIiIIIII4.get() + "'", list, arg_0 -> iiIiIiiiII.ALLATORIxDEMO(iIiIiIIIII6, (AtomicReference)iIiIiIIIII4, (GuiTheme)iIiIiIIIII3, (WTable)iIiIiIIIII5, (iiIiIiiiII)iIiIiIIIII2, arg_0), null, null, iIiIiIIIII2.ALLATORIxDEMO, --1 != 0);
        iIiIiIIIII3 = new ItemListSettingScreen((GuiTheme)iIiIiIIIII3, (ItemListSetting)iIiIiIIIII5);
        iIiIiIIIII3.onClosed(() -> iiIiIiiiII.ALLATORIxDEMO(iIiIiIIIII6, (AtomicReference)iIiIiIIIII4, (ItemListSetting)iIiIiIIIII5));
        class_310.method_1551().method_1507((class_437)iIiIiIIIII3);
    }

    /*
     * WARNING - void declaration
     */
    public class_2487 save(class_2487 class_24872) {
        void iIiIiIIIII2;
        iiIiIiiiII iiIiIiiiII2 = iiIiIiiiII3;
        class_2487 class_24873 = new class_2487();
        for (Map.Entry entry : ((Map)iiIiIiiiII2.get()).entrySet()) {
            iiIiIiiiII iiIiIiiiII3 = new class_2499();
            for (class_1792 class_17922 : (List)entry.getValue()) {
                if (!iiIiIiiiII2.iIiIiIIIII && iiIiIiiiII2.ALLATORIxDEMO != null && !iiIiIiiiII2.ALLATORIxDEMO.test(class_17922)) continue;
                iiIiIiiiII3.add(class_2519.method_23256((String)class_7923.field_41178.method_10221((Object)class_17922).toString()));
            }
            if (iiIiIiiiII3.isEmpty()) continue;
            class_24873.method_10566((String)entry.getKey(), (class_2520)iiIiIiiiII3);
        }
        void v0 = iIiIiIIIII2;
        v0.method_10566(iiiiIiiIIi.ALLATORIxDEMO("\u001e\u0018$\f-"), (class_2520)class_24873);
        return v0;
    }

    public void resetImpl() {
        iiIiIiiiII iiIiIiiiII2;
        Iterator iterator;
        (iiIiIiiiII2 = entry).value = new LinkedHashMap();
        Iterator iterator2 = iterator = ((Map)(iiIiIiiiII2 = entry).defaultValue).entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = iterator.next();
            ((Map)iiIiIiiiII2.value).put((String)entry.getKey(), new ArrayList((Collection)entry.getValue()));
            iterator2 = iterator;
        }
    }

    public boolean ALLATORIxDEMO(Map<String, List<class_1792>> object) {
        iiIiIiiiII iiIiIiiiII2 = object2;
        Object object2 = object;
        object = iiIiIiiiII2;
        return 5 >> 2;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(GuiTheme guiTheme, WTable wTable, iiIiIiiiII iiIiIiiiII2) {
        String string;
        WButton wButton;
        void iIiIiIIIII2;
        GuiTheme iIiIiIIIII3 = wTable;
        GuiTheme iIiIiIIIII4 = guiTheme;
        iIiIiIIIII3.clear();
        Map map = (Map)iIiIiIIIII2.get();
        WButton wButton2 = wButton = map.keySet().iterator();
        while (wButton2.hasNext()) {
            string = (String)wButton.next();
            AtomicReference<String> atomicReference = new AtomicReference<String>(string);
            ((WTextBox)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.textBox(atomicReference.get())).minWidth(100.0).expandX().widget()).actionOnUnfocused = () -> iiIiIiiiII.ALLATORIxDEMO((WTextBox)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.textBox(atomicReference.get())).minWidth(100.0).expandX().widget(), map, atomicReference);
            Object object = (List)map.get(atomicReference.get());
            WButton wButton3 = (WButton)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.button(iiiiIiiIIi.ALLATORIxDEMO("\n\r\u0015-\u001a<"))).minWidth(100.0).expandX().widget();
            object = "(" + object.size() + " items)";
            iIiIiIIIII3.add((WWidget)iIiIiIIIII4.label((String)object)).expandX().widget();
            wButton3.action = () -> iiIiIiiiII.iiiIiIiiIi(map, atomicReference, iIiIiIIIII4, (WTable)iIiIiIIIII3, (iiIiIiiiII)iIiIiIIIII2);
            ((WMinus)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.minus()).widget()).action = () -> iiIiIiiiII.ALLATORIxDEMO(map, atomicReference, iIiIiIIIII4, (WTable)iIiIiIIIII3, (iiIiIiiiII)iIiIiIIIII2);
            wButton2 = wButton;
            iIiIiIIIII3.row();
        }
        if (!map.isEmpty()) {
            iIiIiIIIII3.add((WWidget)iIiIiIIIII4.horizontalSeparator()).expandX();
            iIiIiIIIII3.row();
        }
        wButton = (WButton)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.button(GuiRenderer.RESET)).widget();
        ((WButton)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.button(GuiRenderer.RESET)).widget()).action = () -> iiIiIiiiII.ALLATORIxDEMO((iiIiIiiiII)iIiIiIIIII2, iIiIiIIIII4, (WTable)iIiIiIIIII3);
        string = (WPlus)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.plus()).widget();
        ((WPlus)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.plus()).widget()).action = () -> iiIiIiiiII.ALLATORIxDEMO(map, iIiIiIIIII4, (WTable)iIiIiIIIII3, (iiIiIiiiII)iIiIiIIIII2);
        iIiIiIIIII3.row();
    }

    public Iterable<class_2960> getIdentifierSuggestions() {
        return class_7923.field_41178.method_10235();
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map map, GuiTheme guiTheme, WTable wTable, iiIiIiiiII iiIiIiiiII2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        Object iIiIiIIIII4 = iiIiIiiiII2;
        Map iIiIiIIIII5 = map;
        iIiIiIIIII5.put("", new ArrayList());
        iiIiIiiiII.ALLATORIxDEMO((GuiTheme)iIiIiIIIII3, (WTable)iIiIiIIIII2, (iiIiIiiiII)((Object)iIiIiIIIII4));
    }

    /*
     * WARNING - void declaration
     */
    public iiIiIiiiII(String string, String string2, Map<String, List<class_1792>> map, Consumer<Map<String, List<class_1792>>> consumer, Consumer<Setting<Map<String, List<class_1792>>>> consumer2, IVisible iVisible, Predicate<class_1792> predicate, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        void iIiIiIIIII7;
        void iIiIiIIIII8;
        iiIiIiiiII iIiIiIIIII9;
        boolean bl2 = bl;
        iiIiIiiiII iiIiIiiiII2 = iIiIiIIIII9 = this;
        super((String)iIiIiIIIII8, (String)iIiIiIIIII7, (Object)iIiIiIIIII6, (Consumer)iIiIiIIIII5, (Consumer)iIiIiIIIII4, (IVisible)iIiIiIIIII3);
        iiIiIiiiII2.ALLATORIxDEMO = iIiIiIIIII2;
        iiIiIiiiII2.iIiIiIIIII = this;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiiIiiIIi.ALLATORIxDEMO("\u000e\u0003{N*\ry\u001d\t,8\u001c\u001ciy\u8b9f\u66ad\u65d8\u5269\u6768\u65c9\u7200\u6755\uff49"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(iiIiIiiiII iiIiIiiiII2, GuiTheme guiTheme, WTable wTable) {
        void iIiIiIIIII2;
        iiIiIiiiII iIiIiIIIII3 = wTable;
        iiIiIiiiII iIiIiIIIII4 = iiIiIiiiII2;
        iIiIiIIIII4.reset();
        iiIiIiiiII.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WTable)iIiIiIIIII3, iIiIiIIIII4);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(WTextBox wTextBox, Map map, AtomicReference atomicReference) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        WTextBox wTextBox2 = wTextBox;
        String iIiIiIIIII4 = wTextBox2.get();
        if (iIiIiIIIII3.containsKey(iIiIiIIIII4) && !iIiIiIIIII4.equals(iIiIiIIIII2.get())) {
            wTextBox2.set((String)iIiIiIIIII2.get());
            return;
        }
        List list = (List)iIiIiIIIII3.remove(iIiIiIIIII2.get());
        Object object = iIiIiIIIII4;
        iIiIiIIIII2.set(object);
        iIiIiIIIII3.put(object, list);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map object, AtomicReference atomicReference, GuiTheme guiTheme, WTable wTable, iiIiIiiiII iiIiIiiiII2, List list) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        Map iIiIiIIIII5;
        void iIiIiIIIII6;
        Map map = object;
        object = list;
        Map iIiIiIIIII7 = map;
        iIiIiIIIII7.put((String)iIiIiIIIII6.get(), iIiIiIIIII5);
        iiIiIiiiII.ALLATORIxDEMO((GuiTheme)iIiIiIIIII4, (WTable)iIiIiIIIII3, (iiIiIiiiII)iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map map, AtomicReference atomicReference, ItemListSetting itemListSetting) {
        void iIiIiIIIII2;
        Map iIiIiIIIII3 = itemListSetting;
        Map iIiIiIIIII4 = map;
        iIiIiIIIII4.put((String)iIiIiIIIII2.get(), (List)iIiIiIIIII3.get());
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map object, AtomicReference atomicReference, GuiTheme guiTheme, WTable wTable, iiIiIiiiII iiIiIiiiII2) {
        Map iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        Map map = object;
        object = iiIiIiiiII2;
        Map iIiIiIIIII6 = map;
        iIiIiIIIII6.remove(iIiIiIIIII5.get());
        iiIiIiiiII.ALLATORIxDEMO((GuiTheme)iIiIiIIIII4, (WTable)iIiIiIIIII3, (iiIiIiiiII)((Object)iIiIiIIIII2));
    }

    public Map<String, List<class_1792>> ALLATORIxDEMO(class_2487 class_24872) {
        class_2487 iIiIiIIIII2;
        iiIiIiiiII iiIiIiiiII2 = iiIiIiiiII3;
        ((Map)iiIiIiiiII2.get()).clear();
        iIiIiIIIII2 = iIiiiIIiIi.ALLATORIxDEMO(iIiIiIIIII2, iiIIiiiIIi.ALLATORIxDEMO("Y2c&j"));
        for (String string : iIiIiIIIII2.method_10541()) {
            ArrayList<iiIiIiiiII> arrayList = new ArrayList<iiIiIiiiII>();
            for (iiIiIiiiII iiIiIiiiII3 : iIiIiIIIII2.method_10554(string).orElse(new class_2499())) {
                iiIiIiiiII3 = (class_1792)class_7923.field_41178.method_63535(class_2960.method_60654((String)iiIiIiiiII3.method_68658().orElse("")));
                if (!iiIiIiiiII2.iIiIiIIIII && iiIiIiiiII2.ALLATORIxDEMO != null && !iiIiIiiiII2.ALLATORIxDEMO.test((class_1792)iiIiIiiiII3)) continue;
                arrayList.add(iiIiIiiiII3);
            }
            if (arrayList.isEmpty()) continue;
            ((Map)iiIiIiiiII2.get()).put(string, arrayList);
        }
        return (Map)iiIiIiiiII2.get();
    }

    public Map<String, List<class_1792>> ALLATORIxDEMO(String string) {
        iiIiIiiiII iiIiIiiiII2 = object;
        Object object = string;
        iiIiIiiiII iIiIiIIIII2 = iiIiIiiiII2;
        object = ((String)object).split(iiIIiiiIIi.ALLATORIxDEMO("4"));
        LinkedHashMap<String, List<class_1792>> linkedHashMap = new LinkedHashMap<String, List<class_1792>>();
        try {
            int n = ((Object)object).length;
            for (int i = 3 ^ 3; i < n; ++i) {
                Object object2 = ((String)object[i]).split(iiiiIiiIIi.ALLATORIxDEMO("r"), 5 >> 1);
                if (((String[])object2).length != --2) continue;
                object2 = object2[3 & 4].trim();
                String[] stringArray = object2[4 ^ 5].split(iiIIiiiIIi.ALLATORIxDEMO("#"));
                ArrayList<String> arrayList = new ArrayList<String>();
                int n2 = stringArray.length;
                int n3 = 3 & 4;
                while (n3 < n2) {
                    int n4;
                    String string2 = stringArray[n4];
                    if ((string2 = (class_1792)iiIiIiiiII.parseId((class_2378)class_7923.field_41178, (String)string2.trim())) != null && (iIiIiIIIII2.ALLATORIxDEMO == null || iIiIiIIIII2.ALLATORIxDEMO.test((class_1792)string2))) {
                        arrayList.add(string2);
                    }
                    n3 = ++n4;
                }
                if (arrayList.isEmpty()) continue;
                linkedHashMap.put((String)object2, arrayList);
            }
        }
        catch (Exception this2) {
            // empty catch block
        }
        return linkedHashMap;
    }
}

