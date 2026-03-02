/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1304
 *  net.minecraft.class_1779
 *  net.minecraft.class_1799
 *  net.minecraft.class_1893
 *  net.minecraft.class_2886
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIiiiI;
import com.github.mikumiku.addon.IiIIiiiIiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIIIiiiI;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1304;
import net.minecraft.class_1779;
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_2886;

public class iIiiIIIIII
extends iIiIiIIIii {
    private final SettingGroup IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private int IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private AtomicInteger iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Integer> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean iiiIiIiiIi(class_1799 class_17992) {
        iIiiIIIIII iIiiIIIIII2 = iIiiIIIIII3;
        iIiiIIIIII iIiiIIIIII3 = class_17992;
        iIiiIIIIII iIiIiIIIII2 = iIiiIIIIII2;
        if (iIiiIIIIII3.method_7960()) {
            return (3 & 5) != 0;
        }
        if (!iIiiIIIIII3.method_7942()) return 1 != 0;
        if (!iIiiIIIIII3.method_58657().toString().contains(class_1893.field_9101.toString().split(IiIIiiiIiI.ALLATORIxDEMO("g"))[2 & 5])) return 1 != 0;
        int n = 4 ^ 5;
        int n2 = n;
        if (n2 == 0) {
            return (3 & 5) != 0;
        }
        iIiiIIIIII iIiiIIIIII4 = iIiiIIIIII3;
        int this2 = iIiiIIIIII4.method_7936();
        if (iIiiIIIIII4.method_7919() == 0) return true;
        if (this2 != 0) return false;
        return true;
    }

    private /* synthetic */ void iiiIiIiiIi() {
        int n;
        iIiiIIIIII iIiiIIIIII2 = this;
        int n2 = 2 & 5;
        int n3 = n = 3 ^ 3;
        while (true) {
            if (n3 >= 36) break;
            class_1799 class_17992 = iIiiIIIIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(n);
            if (class_17992.method_7909() instanceof class_1779) {
                n2 += class_17992.method_7947();
            }
            n3 = ++n;
        }
        iIiiIIIIII2.iiiiiIIiIi.set(n2);
    }

    public iIiiIIIIII() {
        iIiiIIIIII iIiiIIIIII2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, IiIIiiiIiI.ALLATORIxDEMO("\u001f0\u81b0\u5282\u4e32"), IIIiIIiiiI.ALLATORIxDEMO("\u81d6\u5298\u4e19\u7ef8\u9ab0\u74dc\u4fcf\u88a5\u596c"));
        iIiiIIIIII2.IIIIiiIiii = iIiiIIIIII2.settings.getDefaultGroup();
        iIiiIIIIII2.ALLATORIxDEMO = iIiiIIIIII2.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u5940\u4ed1\u52b1"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u5734\u4f1d\u7541\u725e\u54fd\u65c6\u4e64\u5176\u8b84\u4e08\u7eee\u9aec\u749d"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIIiiIiIiI = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u5edc\u8fcf"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u4e3e\u7ed8\u9a90\u7494\u4e22\u95c3\u76b8\u5ec6\u8fe4\uff3fHCB\u000b\uff62"))).defaultValue((Object)(3 >> 1))).min(--1).sliderMax(0x36 & 0x5D).build());
        this.iIiIiIIIII = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u6bb2\u6b66\u4e42\u74ac\u655a\u91df"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6bd8\u4e36\u0016\u0000TW\u4e12\u51c1\u76b3\u7ef3\u9aa6\u74d7\u6510\u91a4"))).defaultValue((Object)(5 >> 2))).min(--1).sliderMax(0x50 & 0x6F).build());
        this.IiiIiIiiIi = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u8057\u4e25\u5efc\u68ea\u67f5"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u68d7\u67f9\u88d2\u591b\u549b\u6257\u6316\u7275\u54d6\u7698\u8007\u4e59\u5ec4\uff65\u59b5\u67a0\u6ed1\u802b\u4e72\u5225\u81c0\u5289\u79e1\u7543"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIIiIiiiIi = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiiiIiI.ALLATORIxDEMO("\u4e85\u6e9c\u8057\u4e25\u65ac\u5405\u7538"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u53fd\u6715\u573f\u88d9\u5965\u6e88\u8027\u4e79\u65c6\u6276\u5418\u7514\u4e08\u7eee\u9aec\u749d"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IIiIiIIiii = 3 ^ 3;
        iIiiIIIIII iIiiIIIIII3 = this;
        iIiiIIIIII3.iiiiiIIiIi = new AtomicInteger(3 ^ 3);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiiiIiI.ALLATORIxDEMO("\r\u000b8\u0006.\u0002}\u0012-\u0003<\u0013M3]\u8bb0\u668e\u65f0\u524d\u6747\u65d0\u7212\u6706\uff11"));
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        return IiIiiiiIii.ALLATORIxDEMO((class_1799 iIiIiIIIII2) -> iIiIiIIIII2.method_7909() instanceof class_1779);
    }

    public String getInfoString() {
        return String.valueOf(this.iiiiiIIiIi.get());
    }

    @Override
    public void onActivate() {
        iIiiIIIIII iIiiIIIIII2 = this;
        super.onActivate();
        iIiiIIIIII2.IIiIiIIiii = 2 & 5;
        iIiiIIIIII2.iiiIiIiiIi();
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        iIiiIIIIII iIiiIIIIII2;
        block6: {
            block5: {
                iIiiIIIIII iIiiIIIIII3 = iIiiIIIIII2 = iIiiIIIIII6;
                if (!iIiiIIIIII3.iiiIiIiiIi(iIiiIIIIII3.iIIiiIiIiI.field_1724.method_6047())) break block5;
                iIiiIIIIII iIiiIIIIII4 = iIiiIIIIII2;
                if (iIiiIIIIII4.iiiIiIiiIi(iIiiIIIIII4.iIIiiIiIiI.field_1724.method_6079())) break block6;
            }
            return false;
        }
        iIiiIIIIII iIiiIIIIII5 = iIiiIIIIII2;
        class_1799[] class_1799Array = iIiiIIIIII5.iIIiiIiIiI.field_1724.method_6118(class_1304.field_6169);
        class_1799 class_17992 = iIiiIIIIII5.iIIiiIiIiI.field_1724.method_6118(class_1304.field_6174);
        iIiiIIIIII iIiiIIIIII6 = iIiiIIIIII5.iIIiiIiIiI.field_1724.method_6118(class_1304.field_6172);
        class_1799 class_17993 = iIiiIIIIII5.iIIiiIiIiI.field_1724.method_6118(class_1304.field_6166);
        class_1799[] class_1799Array2 = new class_1799[--4];
        class_1799Array2[3 >> 2] = class_1799Array;
        class_1799Array2[3 >> 1] = class_17992;
        class_1799Array2[--2] = iIiiIIIIII6;
        class_1799Array2[--3] = class_17993;
        class_1799Array = class_1799Array2;
        int n = class_1799Array2.length;
        int n2 = this = 3 >> 2;
        while (n2 < n) {
            class_17993 = class_1799Array[this];
            if (!iIiiIIIIII2.iiiIiIiiIi(class_17993)) {
                return (3 ^ 3) != 0;
            }
            n2 = ++this;
        }
        return true;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiiIIIIII iIiiIIIIII2 = this;
        int n2 = Math.min((Integer)iIiiIIIIII2.iIiIiIIIII.get(), iIiiIIIIII2.iiiiiIIiIi.get());
        int n3 = this = 3 & 4;
        while (n3 < n2) {
            iIiIiIIIii.ALLATORIxDEMO(n -> {
                int n2 = n;
                iIiiIIIIII iIiIiIIIII2 = this;
                return new class_2886(class_1268.field_5808, n2, iIiIiIIIII2.iIIiiIiIiI.field_1724.method_36454(), iIiIiIIIII2.iIIiiIiIiI.field_1724.method_36455());
            });
            iIiiIIIIII2.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
            n3 = ++this;
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIiiIIIIII iIiiIIIIII2 = iIiiIIIIII3;
        iIiiIIIIII iIiiIIIIII3 = post;
        iIiiIIIIII iIiIiIIIII2 = iIiiIIIIII2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (iIiIiIIIII2.IIiIiIIiii > 0) {
            iIiIiIIIII2.IIiIiIIiii -= 3 & 5;
            return;
        }
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724.method_6115() && !((Boolean)iIiIiIIIII2.ALLATORIxDEMO.get()).booleanValue()) {
            return;
        }
        iIiiIIIIII iIiiIIIIII4 = iIiIiIIIII2;
        iIiiIIIIII4.iiiIiIiiIi();
        if (iIiiIIIIII4.iiiiiIIiIi.get() <= 0) {
            iIiIiIIIII2.error(IIIiIIiiiI.ALLATORIxDEMO("\u6c87\u6724\u7ed5\u9a9d\u74ed\uff1c\u7992\u7530\u6a30\u574d"), new Object[2 & 5]);
            iIiIiIIIII2.toggle();
            return;
        }
        if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
            iIiiIIIIII iIiiIIIIII5 = iIiIiIIIII2;
            boolean this_ = iIiiIIIIII5.ALLATORIxDEMO();
            if (((Boolean)iIiiIIIIII5.iIIiIiiiIi.get()).booleanValue()) {
                if (!this_) {
                    return;
                }
            } else if (this_) {
                iIiIiIIIII2.info(IiIIiiiIiI.ALLATORIxDEMO("\u6206\u6775\u8898\u5960\u807c\u4e13\u5ef6\u5d98\u6eb0\uff67\u79d8\u754b\u6a7a\u5736"), new Object[2 & 5]);
                iIiIiIIIII2.toggle();
                return;
            }
        }
        int this_ = iIiIiIIIII2.ALLATORIxDEMO();
        if (this_ == -4 >> 2) {
            iIiIiIIIII2.error(IIIiIIiiiI.ALLATORIxDEMO("\u80d6\u5309\u4e2a\u6cb6\u6715\u6258\u521d\u7ed5\u9a9d\u74ed\uff1c\u7992\u7530\u6a30\u574d"), new Object[3 & 4]);
            iIiIiIIIII2.toggle();
            return;
        }
        IiIiiiiIii.ALLATORIxDEMO(this_);
        iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO(new IiIiiiIIIi(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_36454(), 90.0f));
        iIiIiIIIII2.ALLATORIxDEMO();
        IiIiiiiIii.ALLATORIxDEMO(this_);
        iIiIiIIIII2.IIiIiIIiii = (Integer)iIiIiIIIII2.iIIiiIiIiI.get();
    }
}

