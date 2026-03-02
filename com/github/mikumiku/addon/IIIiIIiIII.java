/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.class_2338
 *  net.minecraft.class_2487
 *  net.minecraft.class_2495
 *  net.minecraft.class_2499
 *  net.minecraft.class_2520
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIIIIiIiii;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2495;
import net.minecraft.class_2499;
import net.minecraft.class_2520;

public class IIIiIIiIII
extends Setting<List<class_2338>> {
    public List<class_2338> ALLATORIxDEMO(String string) {
        IIIiIIiIII iIIiIIiIII2 = object;
        Object object = string;
        IIIiIIiIII iIiIiIIIII2 = iIIiIIiIII2;
        object = ((String)object).split(iIIIIiIiii.ALLATORIxDEMO(">"));
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>(((Object)object).length);
        try {
            int n = ((Object)object).length;
            for (int i = 3 ^ 3; i < n; ++i) {
                String[] stringArray = ((String)object[i]).trim().split(IiiiIiiIII.ALLATORIxDEMO("a"));
                if (stringArray.length != --3) continue;
                int n2 = Integer.parseInt(stringArray[3 ^ 3].trim());
                int n3 = Integer.parseInt(stringArray[3 >> 1].trim());
                int n4 = Integer.parseInt(stringArray[--2].trim());
                arrayList.add(new class_2338(n2, n3, n4));
            }
        }
        catch (NumberFormatException this2) {
            // empty catch block
        }
        return arrayList;
    }

    public List<class_2338> ALLATORIxDEMO(class_2487 class_24872) {
        Iterator iIiIiIIIII2;
        IIIiIIiIII iIIiIIiIII2 = object;
        ((List)iIIiIIiIII2.get()).clear();
        iIiIiIIIII2 = ((class_2499)iIiIiIIIII2.method_10554(IiiiIiiIII.ALLATORIxDEMO(";S!G(")).get()).iterator();
        while (iIiIiIIIII2.hasNext()) {
            int[] nArray = ((class_2495)((class_2520)iIiIiIIIII2.next())).method_10588();
            Object object = nArray;
            if (nArray.length != --3) continue;
            ((List)iIIiIIiIII2.get()).add(new class_2338((int)object[3 & 4], (int)object[2 ^ 3], (int)object[--2]));
        }
        return (List)iIIiIIiIII2.get();
    }

    public boolean ALLATORIxDEMO(List<class_2338> object) {
        IIIiIIiIII iIIiIIiIII2 = object2;
        Object object2 = object;
        object = iIIiIIiIII2;
        return 3 >> 1;
    }

    public void resetImpl() {
        IIIiIIiIII iIIiIIiIII2 = this;
        this.value = new ArrayList((Collection)this.defaultValue);
    }

    /*
     * WARNING - void declaration
     */
    public class_2487 save(class_2487 class_24872) {
        void iIiIiIIIII2;
        Iterator iterator;
        IIIiIIiIII iIIiIIiIII2 = iIIiIIiIII3;
        class_2499 class_24992 = new class_2499();
        Iterator iterator2 = iterator = ((List)iIIiIIiIII2.get()).iterator();
        while (iterator2.hasNext()) {
            IIIiIIiIII iIIiIIiIII3 = (class_2338)iterator.next();
            iterator2 = iterator;
            int[] nArray = new int[--3];
            nArray[3 >> 2] = iIIiIIiIII3.method_10263();
            nArray[5 >> 2] = iIIiIIiIII3.method_10264();
            nArray[1 ^ 3] = iIIiIIiIII3.method_10260();
            class_24992.add((Object)new class_2495(nArray));
        }
        void v2 = iIiIiIIIII2;
        v2.method_10566(iIIIIiIiii.ALLATORIxDEMO("]uPrJ"), (class_2520)class_24992);
        return v2;
    }

    /*
     * WARNING - void declaration
     */
    public IIIiIIiIII(String string, String string2, List<class_2338> list, Consumer<List<class_2338>> consumer, Consumer<Setting<List<class_2338>>> consumer2, IVisible iVisible) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        IIIiIIiIII iIIiIIiIII2 = iIIiIIiIII3;
        IIIiIIiIII iIIiIIiIII3 = iVisible;
        IIIiIIiIII iIiIiIIIII7 = iIIiIIiIII2;
        super((String)iIiIiIIIII6, (String)iIiIiIIIII5, (Object)iIiIiIIIII4, (Consumer)iIiIiIIIII3, (Consumer)iIiIiIIIII2, (IVisible)iIIiIIiIII3);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIiiIII.ALLATORIxDEMO("E\u00060KA(\u00128B)s\u0019Wl\u0012\u8bba\u66e6\u65dd\u5202\u674d\u6582\u7205\u671e\uff4c"));
        }
    }
}

