/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.class_2378
 *  net.minecraft.class_2487
 *  net.minecraft.class_2499
 *  net.minecraft.class_2519
 *  net.minecraft.class_2520
 *  net.minecraft.class_2960
 *  net.minecraft.class_3852
 *  net.minecraft.class_7923
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiiiIiI;
import com.github.mikumiku.addon.IiiIIiiiiI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.class_2378;
import net.minecraft.class_2487;
import net.minecraft.class_2499;
import net.minecraft.class_2519;
import net.minecraft.class_2520;
import net.minecraft.class_2960;
import net.minecraft.class_3852;
import net.minecraft.class_7923;

public class iiIiiiiIII
extends Setting<List<class_3852>> {
    private final boolean iIiIiIIIII;
    public final Predicate<class_3852> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public class_2487 save(class_2487 class_24872) {
        void iIiIiIIIII2;
        iiIiiiiIII iiIiiiiIII2 = iiIiiiiIII3;
        class_2499 class_24992 = new class_2499();
        for (iiIiiiiIII iiIiiiiIII3 : (List)iiIiiiiIII2.get()) {
            if (!iiIiiiiIII2.iIiIiIIIII && iiIiiiiIII2.ALLATORIxDEMO != null && !iiIiiiiIII2.ALLATORIxDEMO.test((class_3852)iiIiiiiIII3)) continue;
            class_24992.add((Object)class_2519.method_23256((String)class_7923.field_41195.method_10221((Object)iiIiiiiIII3).toString()));
        }
        void v0 = iIiIiIIIII2;
        v0.method_10566(IiiIIiiiiI.ALLATORIxDEMO("\u000b\u0017\u0011\u0003\u0018"), (class_2520)class_24992);
        return v0;
    }

    /*
     * WARNING - void declaration
     */
    public iiIiiiiIII(String string, String string2, List<class_3852> list, Consumer<List<class_3852>> consumer, Consumer<Setting<List<class_3852>>> consumer2, IVisible iVisible, Predicate<class_3852> predicate, boolean bl) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII6;
        void iIiIiIIIII7;
        void iIiIiIIIII8;
        iiIiiiiIII iIiIiIIIII9;
        boolean bl2 = bl;
        iiIiiiiIII iiIiiiiIII2 = iIiIiIIIII9 = this;
        super((String)iIiIiIIIII8, (String)iIiIiIIIII7, (Object)iIiIiIIIII6, (Consumer)iIiIiIIIII5, (Consumer)iIiIiIIIII4, (IVisible)iIiIiIIIII3);
        iiIiiiiIII2.ALLATORIxDEMO = iIiIiIIIII2;
        iiIiiiiIII2.iIiIiIIIII = this;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIIiiiiI.ALLATORIxDEMO("\u00016t{%8v(\u0006\u00197)3|v\u8baa\u66a2\u65ed\u5246\u677d\u65c6\u7235\u675a\uff7c"));
        }
    }

    public List<class_3852> ALLATORIxDEMO(String string) {
        iiIiiiiIII iiIiiiiIII2 = object;
        Object object = string;
        iiIiiiiIII iIiIiIIIII2 = iiIiiiiIII2;
        object = ((String)object).split(IiIIiiiIiI.ALLATORIxDEMO("M"));
        ArrayList<class_3852> arrayList = new ArrayList<class_3852>(((Object)object).length);
        try {
            int n = ((Object)object).length;
            for (int i = 3 & 4; i < n; ++i) {
                Object object2 = object[i];
                if ((object2 = (class_3852)iiIiiiiIII.parseId((class_2378)class_7923.field_41195, (String)object2)) == null || iIiIiIIIII2.ALLATORIxDEMO != null && !iIiIiIIIII2.ALLATORIxDEMO.test((class_3852)object2)) continue;
                arrayList.add((class_3852)object2);
            }
        }
        catch (Exception this2) {
            // empty catch block
        }
        return arrayList;
    }

    public boolean ALLATORIxDEMO(List<class_3852> object) {
        iiIiiiiIII iiIiiiiIII2 = object2;
        Object object2 = object;
        object = iiIiiiiIII2;
        return (2 ^ 3) != 0;
    }

    public void resetImpl() {
        iiIiiiiIII iiIiiiiIII2 = this;
        this.value = new ArrayList((Collection)this.defaultValue);
    }

    public Iterable<class_2960> getIdentifierSuggestions() {
        return class_7923.field_41195.method_10235();
    }

    public List<class_3852> ALLATORIxDEMO(class_2487 class_24872) {
        Iterator iIiIiIIIII2;
        iiIiiiiIII iiIiiiiIII2 = iiIiiiiIII3;
        ((List)iiIiiiiIII2.get()).clear();
        for (iiIiiiiIII iiIiiiiIII3 : (class_2499)iIiIiIIIII2.method_10554(IiIIiiiIiI.ALLATORIxDEMO("\u001d8\u000f.\u0004")).get()) {
            iiIiiiiIII3 = (class_3852)class_7923.field_41195.method_63535(class_2960.method_60654((String)((String)iiIiiiiIII3.method_68658().get())));
            if (!iiIiiiiIII2.iIiIiIIIII && iiIiiiiIII2.ALLATORIxDEMO != null && !iiIiiiiIII2.ALLATORIxDEMO.test((class_3852)iiIiiiiIII3)) continue;
            ((List)iiIiiiiIII2.get()).add(iiIiiiiIII3);
        }
        return (List)iiIiiiiIII2.get();
    }
}

