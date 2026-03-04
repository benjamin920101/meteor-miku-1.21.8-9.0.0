/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.renderer.GuiRenderer
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox$Renderer
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WMinus
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WPlus
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtString
 *  net.minecraft.nbt.NbtElement
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIiiIIIi;
import com.github.mikumiku.addon.iiIiiiIiii;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.renderer.GuiRenderer;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.input.WTextBox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.gui.widgets.pressable.WMinus;
import meteordevelopment.meteorclient.gui.widgets.pressable.WPlus;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtString;
import net.minecraft.nbt.NbtElement;

public class iIiiiiiiii
extends Setting<Map<String, String>> {
    public final Class<? extends WTextBox.Renderer> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(GuiTheme guiTheme, WTable wTable, iIiiiiiiii iIiiiiiiii2) {
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
            ((WTextBox)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.textBox(atomicReference.get())).minWidth(150.0).expandX().widget()).actionOnUnfocused = () -> iIiiiiiiii.ALLATORIxDEMO((WTextBox)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.textBox(atomicReference.get())).minWidth(150.0).expandX().widget(), map, atomicReference);
            WTextBox wTextBox = (WTextBox)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.textBox((String)map.get(atomicReference.get()), (iIiIiIIIII22, c) -> {
                char iIiIiIIIII22 = c;
                String string = iIiIiIIIII22;
                return (3 & 5) != 0;
            }, iIiIiIIIII2.ALLATORIxDEMO)).minWidth(150.0).expandX().widget();
            wTextBox.actionOnUnfocused = () -> {
                void iIiIiIIIII2;
                Map iIiIiIIIII3 = wTextBox;
                Map iIiIiIIIII4 = map;
                iIiIiIIIII4.replace((String)iIiIiIIIII2.get(), iIiIiIIIII3.get());
            };
            ((WMinus)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.minus()).widget()).action = () -> iIiiiiiiii.ALLATORIxDEMO(map, atomicReference, iIiIiIIIII4, (WTable)iIiIiIIIII3, (iIiiiiiiii)iIiIiIIIII2);
            wButton2 = wButton;
            iIiIiIIIII3.row();
        }
        if (!map.isEmpty()) {
            iIiIiIIIII3.add((WWidget)iIiIiIIIII4.horizontalSeparator()).expandX();
            iIiIiIIIII3.row();
        }
        wButton = (WButton)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.button(GuiRenderer.RESET)).widget();
        ((WButton)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.button(GuiRenderer.RESET)).widget()).action = () -> iIiiiiiiii.ALLATORIxDEMO((iIiiiiiiii)iIiIiIIIII2, iIiIiIIIII4, (WTable)iIiIiIIIII3);
        string = (WPlus)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.plus()).widget();
        ((WPlus)iIiIiIIIII3.add((WWidget)iIiIiIIIII4.plus()).widget()).action = () -> iIiiiiiiii.ALLATORIxDEMO(map, iIiIiIIIII4, (WTable)iIiIiIIIII3, (iIiiiiiiii)iIiIiIIIII2);
        iIiIiIIIII3.row();
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map map, GuiTheme guiTheme, WTable wTable, iIiiiiiiii iIiiiiiiii2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        Object iIiIiIIIII4 = iIiiiiiiii2;
        Map iIiIiIIIII5 = map;
        iIiIiIIIII5.put("", "");
        iIiiiiiiii.ALLATORIxDEMO((GuiTheme)iIiIiIIIII3, (WTable)iIiIiIIIII2, (iIiiiiiiii)((Object)iIiIiIIIII4));
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(iIiiiiiiii iIiiiiiiii2, GuiTheme guiTheme, WTable wTable) {
        void iIiIiIIIII2;
        iIiiiiiiii iIiIiIIIII3 = wTable;
        iIiiiiiiii iIiIiIIIII4 = iIiiiiiiii2;
        iIiIiIIIII4.reset();
        iIiiiiiiii.ALLATORIxDEMO((GuiTheme)iIiIiIIIII2, (WTable)iIiIiIIIII3, iIiIiIIIII4);
    }

    public boolean ALLATORIxDEMO(Map<String, String> object) {
        iIiiiiiiii iIiiiiiiii2 = object2;
        Object object2 = object;
        object = iIiiiiiiii2;
        return 3 >> 1;
    }

    public void resetImpl() {
        iIiiiiiiii iIiiiiiiii2 = this;
        this.value = new LinkedHashMap((Map)this.defaultValue);
    }

    /*
     * WARNING - void declaration
     */
    public iIiiiiiiii(String string, String string2, Map<String, String> map, Consumer<Map<String, String>> consumer, Consumer<Setting<Map<String, String>>> consumer2, IVisible iVisible, Class<? extends WTextBox.Renderer> clazz) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        void iIiIiIIIII7;
        iIiiiiiiii iIiiiiiiii2 = object;
        Object object = clazz;
        iIiiiiiiii iIiIiIIIII8 = iIiiiiiiii2;
        super((String)iIiIiIIIII7, (String)iIiIiIIIII6, (Object)iIiIiIIIII5, (Consumer)iIiIiIIIII4, (Consumer)iIiIiIIIII3, (IVisible)iIiIiIIIII2);
        iIiIiIIIII8.ALLATORIxDEMO = object;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIiiIIIi.ALLATORIxDEMO("\u0010}%p3t`d0u!epe`\u8be6\u66b3\u65a6\u5270\u6711\u65ed\u7244\u673b\uff47"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map object, AtomicReference atomicReference, GuiTheme guiTheme, WTable wTable, iIiiiiiiii iIiiiiiiii2) {
        Map iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        Map map = object;
        object = iIiiiiiiii2;
        Map iIiIiIIIII6 = map;
        iIiIiIIIII6.remove(iIiIiIIIII5.get());
        iIiiiiiiii.ALLATORIxDEMO((GuiTheme)iIiIiIIIII4, (WTable)iIiIiIIIII3, (iIiiiiiiii)((Object)iIiIiIIIII2));
    }

    public Map<String, String> ALLATORIxDEMO(class_2487 class_24872) {
        class_2487 iIiIiIIIII2;
        iIiiiiiiii iIiiiiiiii2 = iterator;
        ((Map)iIiiiiiiii2.get()).clear();
        iIiIiIIIII2 = iIiiiIIiIi.ALLATORIxDEMO(iIiIiIIIII2, iiIiiiIiii.ALLATORIxDEMO("t\u0014i"));
        Iterator iterator = iIiIiIIIII2.method_10541().iterator();
        Object object = iterator;
        while (object.hasNext()) {
            String string;
            String string2 = string = (String)iterator.next();
            ((Map)iIiiiiiiii2.get()).put(string2, (String)iIiIiIIIII2.method_10558(string2).get());
            object = iterator;
        }
        return (Map)iIiiiiiiii2.get();
    }

    /*
     * WARNING - void declaration
     */
    public class_2487 save(class_2487 class_24872) {
        void iIiIiIIIII2;
        Iterator iterator;
        iIiiiiiiii iIiiiiiiii2 = object;
        class_2487 class_24873 = new class_2487();
        Iterator iterator2 = iterator = ((Map)iIiiiiiiii2.get()).keySet().iterator();
        while (iterator2.hasNext()) {
            Object object = (String)iterator.next();
            class_24873.method_10566((String)object, (class_2520)class_2519.method_23256((String)((String)((Map)iIiiiiiiii2.get()).get(object))));
            iterator2 = iterator;
        }
        void v1 = iIiIiIIIII2;
        v1.method_10566(iiIIiiIIIi.ALLATORIxDEMO("c-m"), (class_2520)class_24873);
        return v1;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(WTextBox wTextBox, Map map, AtomicReference atomicReference) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        WTextBox wTextBox2 = wTextBox;
        Object iIiIiIIIII4 = wTextBox2.get();
        if (iIiIiIIIII3.containsKey(iIiIiIIIII4)) {
            wTextBox2.set((String)iIiIiIIIII2.get());
            return;
        }
        String string = (String)iIiIiIIIII3.remove(iIiIiIIIII2.get());
        Object object = iIiIiIIIII4;
        iIiIiIIIII2.set(object);
        iIiIiIIIII3.put(object, string);
    }

    public Map<String, String> ALLATORIxDEMO(String string) {
        iIiiiiiiii iIiiiiiiii2 = object;
        Object object = string;
        iIiiiiiiii iIiIiIIIII2 = iIiiiiiiii2;
        object = ((String)object).split(iiIiiiIiii.ALLATORIxDEMO("5"));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>(((Object)object).length / (5 >> 1));
        try {
            Object object2 = null;
            for (int i = 5 >> 3; i < ((Object)object).length; ++i) {
                if (i % (1 ^ 3) == 0) {
                    object2 = object[i];
                    continue;
                }
                linkedHashMap.put((String)object2, (String)object[i]);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return linkedHashMap;
    }
}

