/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.WindowScreen
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.utils.misc.Names
 *  net.minecraft.class_1887
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_6880
 *  net.minecraft.class_9636
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiiiIiI;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIIIiiII;
import com.github.mikumiku.addon.iiIIIiIiII;
import com.github.mikumiku.addon.iiIiiiIiii;
import com.github.mikumiku.addon.iiiIiIIiIi;
import java.util.ArrayList;
import java.util.Date;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.WindowScreen;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.input.WTextBox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.utils.misc.Names;
import net.minecraft.class_1887;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_6880;
import net.minecraft.class_9636;

public class iiiiiiiIiI
extends WindowScreen {
    private final boolean iiiiiIIiIi;
    private String iIIiIiiiIi;
    private final IIiiiiiIiI iIiIiIIIII;
    private final GuiTheme ALLATORIxDEMO;

    public void initWidgets() {
        iiiiiiiIiI iiiiiiiIiI2;
        iiiiiiiIiI iiiiiiiIiI3 = iiiiiiiIiI2 = iiiiiiiIiI7;
        WTable wTable = iiiiiiiIiI3.ALLATORIxDEMO.table();
        iiiiiiiIiI3.ALLATORIxDEMO.table().minWidth = 400.0;
        iiiiiiiIiI iiiiiiiIiI4 = iiiiiiiIiI2;
        iiiiiiiIiI iiiiiiiIiI5 = iiiiiiiIiI7 = (WTextBox)iiiiiiiIiI4.add((WWidget)iiiiiiiIiI3.ALLATORIxDEMO.textBox(iiiiiiiIiI4.iIIiIiiiIi, iiIIIiIiII.ALLATORIxDEMO("\u6441\u7d6f"))).minWidth(400.0).expandX().widget();
        iiiiiiiIiI7.setFocused((2 ^ 3) != 0);
        iiiiiiiIiI5.setCursorMax();
        ((WTextBox)iiiiiiiIiI5).action = () -> iiiiiiiIiI2.ALLATORIxDEMO((WTextBox)iiiiiiiIiI5, wTable);
        iiiiiiiIiI iiiiiiiIiI6 = iiiiiiiIiI2;
        iiiiiiiIiI iiiiiiiIiI7 = (WHorizontalList)iiiiiiiIiI6.add((WWidget)iiiiiiiIiI6.ALLATORIxDEMO.horizontalList()).expandX().widget();
        WTextBox wTextBox = (WTextBox)iiiiiiiIiI7.add((WWidget)iiiiiiiIiI2.ALLATORIxDEMO.textBox("", iiIiiiIiii.ALLATORIxDEMO("\u81f3\u5bcf\u4e70"))).expandX().expandWidgetX().widget();
        ((WButton)iiiiiiiIiI7.add((WWidget)iiiiiiiIiI2.ALLATORIxDEMO.button((String)iiIIIiIiII.ALLATORIxDEMO((String)"\u9054\u62a4"))).widget()).action = () -> {
            iiiiiiiIiI iiiiiiiIiI2 = iiiiiiiIiI3;
            iiiiiiiIiI iiiiiiiIiI3 = wTextBox;
            iiiiiiiIiI iIiIiIIIII2 = iiiiiiiIiI2;
            if (iiiiiiiIiI3.get().isEmpty()) {
                return;
            }
            if ((iiiiiiiIiI3 = class_2960.method_12829((String)iiiiiiiIiI3.get())) == null) {
                return;
            }
            iiiiiiiIiI iiiiiiiIiI4 = iIiIiIIIII2;
            iiiiiiiIiI4.iIiIiIIIII.ALLATORIxDEMO(new iiIIIIiiII((class_2960)iiiiiiiIiI3, 3 >> 2, 5 >> 3, 5 >> 2));
            iiiiiiiIiI4.method_25419();
        };
        iiiiiiiIiI2.add((WWidget)wTable);
        iiiiiiiIiI2.ALLATORIxDEMO(wTable);
    }

    /*
     * WARNING - void declaration
     */
    public iiiiiiiIiI(GuiTheme guiTheme, boolean bl, IIiiiiiIiI iIiiiiiIiI) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iiiiiiiIiI iIiIiIIIII4;
        iiiiiiiIiI iiiiiiiIiI2 = iiiiiiiIiI3;
        iiiiiiiIiI iiiiiiiIiI3 = guiTheme;
        iiiiiiiIiI iiiiiiiIiI4 = iIiIiIIIII4 = iiiiiiiIiI2;
        iiiiiiiIiI iiiiiiiIiI5 = iIiIiIIIII4;
        super((GuiTheme)iiiiiiiIiI3, iiIIIiIiII.ALLATORIxDEMO("\u9074\u6284\u9619\u9b19"));
        iiiiiiiIiI5.iIIiIiiiIi = "";
        iiiiiiiIiI5.ALLATORIxDEMO = iiiiiiiIiI3;
        iiiiiiiIiI4.iIiIiIIIII = iIiIiIIIII3;
        iiiiiiiIiI4.iiiiiIIiIi = iIiIiIIIII2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIiiiIiii.ALLATORIxDEMO("\"rW?\u0006|Ul\u0005}\u0014m\u00108U\u8bee\u6681\u65a9\u5265\u6739\u65c5\u7251\u6779\uff38"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WTextBox wTextBox, WTable wTable) {
        void iIiIiIIIII2;
        iiiiiiiIiI iiiiiiiIiI2 = iiiiiiiIiI3;
        iiiiiiiIiI iiiiiiiIiI3 = wTable;
        iiiiiiiIiI iIiIiIIIII3 = iiiiiiiIiI2;
        iiiiiiiIiI iiiiiiiIiI4 = iiiiiiiIiI3;
        iIiIiIIIII3.iIIiIiiiIi = iIiIiIIIII2.get().trim();
        iiiiiiiIiI4.clear();
        iIiIiIIIII3.ALLATORIxDEMO((WTable)iiiiiiiIiI4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WTable wTable) {
        class_6880 class_68804;
        ArrayList<class_6880> arrayList;
        Object object;
        iiiiiiiIiI iiiiiiiIiI2 = object;
        if (MeteorClient.mc.field_1687 == null) {
            return;
        }
        class_2378<class_1887> class_23782 = iIiiiIIiIi.ALLATORIxDEMO();
        ArrayList<class_6880> arrayList2 = new ArrayList<class_6880>();
        class_2378<class_1887> class_23783 = class_23782;
        if (iiiiiiiIiI2.iiiiiIIiIi) {
            object = class_23783.method_40286(class_9636.field_51545);
            object.forEach(arrayList2::add);
            arrayList = arrayList2;
        } else {
            object = class_23783.method_40295().iterator();
            Object object2 = object;
            while (object2.hasNext()) {
                class_68804 = (class_6880)object.next();
                object2 = object;
                arrayList2.add(class_68804);
            }
            arrayList = arrayList2;
        }
        object = arrayList.stream().sorted((class_68802, class_68803) -> {
            class_6880 iIiIiIIIII2 = class_68803;
            class_6880 iIiIiIIIII3 = class_68802;
            return Names.get((class_6880)iIiIiIIIII3).compareToIgnoreCase(Names.get((class_6880)iIiIiIIIII2));
        }).toList().iterator();
        Object object3 = object;
        while (object3.hasNext()) {
            void iIiIiIIIII2;
            class_68804 = (class_6880)object.next();
            if (!iiiiiiiIiI2.iIIiIiiiIi.isEmpty() && !Names.get((class_6880)class_68804).toLowerCase().startsWith(iiiiiiiIiI2.iIIiIiiiIi.toLowerCase())) {
                object3 = object;
                continue;
            }
            iIiIiIIIII2.add((WWidget)iiiiiiiIiI2.ALLATORIxDEMO.label(Names.get((class_6880)class_68804))).expandCellX();
            ((WButton)iIiIiIIIII2.add((WWidget)iiiiiiiIiI2.ALLATORIxDEMO.button((String)iiIiiiIiii.ALLATORIxDEMO((String)"\u905c\u62d0"))).widget()).action = () -> {
                void iIiIiIIIII2;
                iiiiiiiIiI iiiiiiiIiI2 = iiiiiiiIiI3;
                iiiiiiiIiI iiiiiiiIiI3 = class_68804;
                iiiiiiiIiI iIiIiIIIII3 = iiiiiiiIiI2;
                iIiIiIIIII3.iIiIiIIIII.ALLATORIxDEMO(new iiIIIIiiII(iIiIiIIIII2.method_10221((Object)((class_1887)iiiiiiiIiI3.comp_349())), ((class_1887)iiiiiiiIiI3.comp_349()).method_8183(), iiiIiIIiIi.ALLATORIxDEMO((class_6880<class_1887>)iiiiiiiIiI3), --1 != 0));
                iIiIiIIIII3.method_25419();
            };
            object3 = object;
            iIiIiIIIII2.row();
        }
    }
}

