/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1109
 *  net.minecraft.class_1113
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_3414
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiiIiIiiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.github.mikumiku.addon.modules.PlayerAlert;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1109;
import net.minecraft.class_1113;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_3414;

public class IIIIIIiiii
extends iIiIiIIIii {
    private int iIIIIIIiII;
    private final Setting<PlayerAlert.SoundChoice> iIIiiIIIIi;
    private final Setting<Double> IiiiiIiIiI;
    private final Set<String> iiiIiIIiii;
    private final SettingGroup iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Set<String> iIiIIiIIIi;
    private final Set<String> IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<PlayerAlert.SoundChoice> iIiIiiiiII;
    private final Setting<Double> IIIIiiIiii;
    private final Setting<PlayerAlert.SoundChoice> IiiIiIiiIi;
    private final SettingGroup IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Double> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    @Override
    public void onActivate() {
        IIIIIIiiii iIIIIIiiii = this;
        IIIIIIiiii iIIIIIiiii2 = this;
        super.onActivate();
        iIIIIIiiii2.IIiIiiiiII.clear();
        iIIIIIiiii2.iIiIIiIIIi.clear();
        iIIIIIiiii.iiiIiIIiii.clear();
        iIIIIIiiii.iIIIIIIiII = 3 >> 2;
        IiIiIIiiii.iiIIiIIiii("\u770b\u95e8\u72d7\u5df2\u542f\u52a8\uff0c\u9760\u8fd1\u68c0\u6d4b\u8ddd\u79bb: " + ((Double)iIIIIIiiii.iIiIiIIIII.get()).intValue());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiIiiIi(class_1657 class_16572, double d) {
        IIIIIIiiii iIIIIIiiii = iIIIIIiiii2;
        IIIIIIiiii iIIIIIiiii2 = class_16572;
        IIIIIIiiii iIiIiIIIII2 = iIIIIIiiii;
        iIIIIIiiii2.method_7334().getName();
        if (((Boolean)iIiIiIIIII2.iiiIiiIIII.get()).booleanValue()) {
            iIiIiIIIII2.IIIIiIIiII();
        }
        if (((Boolean)iIiIiIIIII2.iIIiIiiiIi.get()).booleanValue()) {
            void iIiIiIIIII3;
            iIiIiIIIII2.ALLATORIxDEMO((class_1657)iIIIIIiiii2, (double)iIiIiIIIII3, iiIIIIiiiI.ALLATORIxDEMO("\u8f86\u517b\u971d\u8fef\u835e\u56ea"));
        }
    }

    private /* synthetic */ void iIiIiIiIii() {
        this.iIIiiIiIiI.method_40000(() -> {
            if (this.iIIiiIiIiI.method_1483() != null) {
                this.iIIiiIiIiI.method_1483().method_4873((class_1113)class_1109.method_4757((class_3414)((PlayerAlert.SoundChoice)((Object)((Object)this.iIiIiiiiII.get()))).iiiiiIIiIi, (float)((Double)this.IiiiiIiIiI.get()).floatValue(), (float)((Double)this.IIIIiiIiii.get()).floatValue()));
            }
        });
    }

    public void IIiIiIiIiI() {
        IIIIIIiiii iIIIIIiiii = this;
        iIIIIIiiii.IIiIiiiiII.clear();
        iIIIIIiiii.iIiIIiIIIi.clear();
        iIIIIIiiii.iiiIiIIiii.clear();
        IiIiIIiiii.iiIIiIIiii(IiiIiIiiiI.ALLATORIxDEMO("\u5db7\u5237\u65d5\u7389\u5bf3\u5217\u880d"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1657 class_16572, double d, String string) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IIIIIIiiii iIIIIIiiii = stringBuilder;
        String string2 = iIiIiIIIII3.method_7334().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IiiIiIiiiI.ALLATORIxDEMO("\u00967V\u7763\u95e4\u72beYA\u00a1\u0005")).append((String)iIiIiIIIII2).append(iiIIIIiiiI.ALLATORIxDEMO("C\u001a\u00dc]")).append(string2);
        if (((Boolean)iIIIIIiiii.IIiiIIIIIi.get()).booleanValue()) {
            void iIiIiIIIII4;
            Object[] objectArray = new Object[5 >> 2];
            objectArray[5 >> 3] = (double)iIiIiIIIII4;
            stringBuilder.append(IiiIiIiiiI.ALLATORIxDEMO("\u0011\u00f3:@\u8dd1\u79d2>A\u00a1\u0002")).append(String.format(iiIIIIiiiI.ALLATORIxDEMO("\\\u0014J^"), objectArray)).append(IiiIiIiiiI.ALLATORIxDEMO("\u00c61J"));
        }
        if (((Boolean)iIIIIIiiii.ALLATORIxDEMO.get()).booleanValue()) {
            Object[] objectArray = new Object[--3];
            objectArray[3 ^ 3] = iIiIiIIIII3.method_23317();
            objectArray[--1] = iIiIiIIIII3.method_23318();
            objectArray[1 ^ 3] = iIiIiIIIII3.method_23321();
            stringBuilder.append(iiIIIIiiiI.ALLATORIxDEMO("l\u00a8Gh\u5721\u6835C\u001a\u00dcZ")).append(String.format(IiiIiIiiiI.ALLATORIxDEMO("#M+\u0018,E\u0014z=\u000e I!O6\u0005"), objectArray)).append(iiIIIIiiiI.ALLATORIxDEMO("\u009dLe"));
        }
        IiIiIIiiii.iiIIiIIiii(stringBuilder.toString());
    }

    private /* synthetic */ void IIIIiIIiII() {
        this.iIIiiIiIiI.method_40000(() -> {
            if (this.iIIiiIiIiI.method_1483() != null) {
                this.iIIiiIiIiI.method_1483().method_4873((class_1113)class_1109.method_4757((class_3414)((PlayerAlert.SoundChoice)((Object)((Object)this.IiiIiIiiIi.get()))).iiiiiIIiIi, (float)((Double)this.IiiiiIiIiI.get()).floatValue(), (float)((Double)this.IIIIiiIiii.get()).floatValue()));
            }
        });
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1657 class_16572) {
        IIIIIIiiii iIIIIIiiii = iIIIIIiiii2;
        IIIIIIiiii iIIIIIiiii2 = class_16572;
        IIIIIIiiii iIiIiIIIII2 = iIIIIIiiii;
        return Friends.get().isFriend((class_1657)iIIIIIiiii2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(String string, String string2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IIIIIIiiii iIIIIIiiii = stringBuilder;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IiiIiIiiiI.ALLATORIxDEMO("\u00967V\u7763\u95e4\u72beYA\u00a1\u0005")).append((String)iIiIiIIIII3).append(iiIIIIiiiI.ALLATORIxDEMO("C\u001a\u00dc]")).append((String)iIiIiIIIII2);
        IiIiIIiiii.iiIIiIIiii(stringBuilder.toString());
    }

    private /* synthetic */ String ALLATORIxDEMO(double iIiIiIIIII2) {
        if (iIiIiIIIII2 < 10.0) {
            Object[] objectArray = new Object[5 >> 2];
            objectArray[2 & 5] = iIiIiIIIII2;
            return String.format(IiiIiIiiiI.ALLATORIxDEMO("!O7\u0005"), objectArray);
        }
        Object[] objectArray = new Object[3 >> 1];
        objectArray[3 ^ 3] = iIiIiIIIII2;
        return String.format(iiIIIIiiiI.ALLATORIxDEMO("\\\u0014K^"), objectArray);
    }

    private /* synthetic */ void iiiIiIiiIi() {
        this.iIIiiIiIiI.method_40000(() -> {
            if (this.iIIiiIiIiI.method_1483() != null) {
                this.iIIiiIiIiI.method_1483().method_4873((class_1113)class_1109.method_4757((class_3414)((PlayerAlert.SoundChoice)((Object)((Object)this.iIIiiIIIIi.get()))).iiiiiIIiIi, (float)((Double)this.IiiiiIiIiI.get()).floatValue(), (float)((Double)this.IIIIiiIiii.get()).floatValue()));
            }
        });
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IIIIIIiiii object;
        IIIIIIiiii iIIIIIiiii = object;
        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>();
        Iterator<Object> iterator = iIIIIIiiii.iIIiiIiIiI.field_1687.method_18456().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                class_1657 this_ = (class_1657)iterator.next();
                if (this_.method_5667().equals(iIIIIIiiii.iIIiiIiIiI.field_1724.method_5667())) {
                    iterator2 = iterator;
                    continue;
                }
                String string = this_.method_7334().getName();
                IIIIIIiiii iIIIIIiiii2 = iIIIIIiiii;
                double d = iIIIIIiiii2.iIIiiIiIiI.field_1724.method_5739((class_1297)this_);
                Friends.get().isFriend(this_);
                if (((Boolean)iIIIIIiiii2.iIiiiIiIii.get()).booleanValue() && iIIIIIiiii.ALLATORIxDEMO(this_)) {
                    iterator2 = iterator;
                    continue;
                }
                hashSet.add(string);
                if (!iIIIIIiiii.iIiIIiIIIi.contains(string)) {
                    iIIIIIiiii.ALLATORIxDEMO(this_, d);
                }
                if (!(d <= (Double)iIIIIIiiii.iIiIiIIIII.get())) continue block0;
                hashSet2.add(string);
                if (iIIIIIiiii.iiiIiIIiii.contains(string)) continue block0;
                iIIIIIiiii.iiiIiIiiIi(this_, d);
                continue block0;
            }
            break;
        }
        for (String this_ : iIIIIIiiii.iIiIIiIIIi) {
            if (hashSet.contains(this_)) continue;
            iIIIIIiiii.ALLATORIxDEMO(this_);
        }
        IIIIIIiiii iIIIIIiiii3 = iIIIIIiiii;
        iIIIIIiiii3.iIiIIiIIIi.clear();
        iIIIIIiiii3.iIiIIiIIIi.addAll(hashSet);
        IIIIIIiiii iIIIIIiiii4 = iIIIIIiiii;
        iIIIIIiiii4.iiiIiIIiii.clear();
        iIIIIIiiii4.iiiIiIIiii.addAll(hashSet2);
        IIIIIIiiii iIIIIIiiii5 = iIIIIIiiii;
        iIIIIIiiii5.IIiIiiiiII.clear();
        iIIIIIiiii5.IIiIiiiiII.addAll(hashSet2);
    }

    public IIIIIIiiii() {
        IIIIIIiiii iIIIIIiiii = this;
        super(iIiIiIIIii.iIIiIiiiIi, iiIIIIiiiI.ALLATORIxDEMO("\u7708\u95e2\u729e"), IiiIiIiiiI.ALLATORIxDEMO("\u5f73\u674c\u7389\u5bf3\u8fae\u5175\u9664\u8f94\u65d1\u64ef\u651e\u58b5\u97ce\u5e2e\u63a7\u9180"));
        IIIIIIiiii iIIIIIiiii2 = this;
        iIIIIIiiii.IIiIiiiiII = new HashSet<String>();
        IIIIIIiiii iIIIIIiiii3 = this;
        iIIIIIiiii2.iIiIIiIIIi = new HashSet<String>();
        IIIIIIiiii iIIIIIiiii4 = this;
        iIIIIIiiii.iiiIiIIiii = new HashSet<String>();
        iIIIIIiiii.iIIIiiiiIi = iIIIIIiiii.settings.getDefaultGroup();
        iIIIIIiiii.iiiiiIIiIi = iIIIIIiiii.settings.createGroup(iiIIIIiiiI.ALLATORIxDEMO("\u58b0\u97f0\u8bb4\u7f27"));
        iIIIIIiiii.IIiIiIIiii = iIIIIIiiii.settings.createGroup(IiiIiIiiiI.ALLATORIxDEMO("\u8077\u5971\u8bc9\u7f7c"));
        iIIIIIiiii.iIiIiIIIII = iIIIIIiiii.iIIIiiiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u973d\u8fcf\u6880\u6d48\u8dd7\u79f2"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u6882\u6d6b\u73ec\u5b8b\u76dc\u9717\u8fc3"))).defaultValue(20.0).min(1.0).max(200.0).sliderMin(1.0).sliderMax(200.0).build());
        this.iIIiiIiIiI = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u6880\u6d48\u95fe\u96dd"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u6885\u6d6b\u73ec\u5bc3\u7694\u95d4\u96d1\u65d1\u95b6\b1T;\u001c;"))).defaultValue((Object)(0x3F & 0x54))).min(--1).max(0x7C & 0x67).sliderMin(4 ^ 5).sliderMax(0x3C & 0x7F).build());
        this.iIiiiIiIii = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u4e98\u9740\u965f\u53c8\u73a3\u5bff"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u53cd\u6392\u91b2\u971b\u9622\u5393\u73de\u5ba4"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiiIiiIIII = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u64ed\u653d\u58fa\u97ba"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u68e0\u6d0e\u5217\u73eb\u5b96\u65b3\u6490\u6566\u5887\u97e1"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIIiiIIIIi = this.iiiiiIIiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u8f9b\u5166\u58fa\u97ba"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u64ef\u651e\u76c1\u58cd\u97ab\u7c0c\u5799"))).defaultValue((Object)PlayerAlert.SoundChoice.iIIiiIiIiI)).build());
        this.iIiIiiiiII = this.iiiiiIIiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u79fb\u5f03\u58fa\u97ba"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u64ef\u651e\u76c1\u58cd\u97ab\u7c0c\u5799"))).defaultValue((Object)PlayerAlert.SoundChoice.iIIiiIiIiI)).build());
        this.IiiIiIiiIi = this.iiiiiIIiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u9720\u8fd2\u58fa\u97ba"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u64ef\u651e\u76c1\u58cd\u97ab\u7c0c\u5799"))).defaultValue((Object)PlayerAlert.SoundChoice.iIIiiIiIiI)).build());
        this.IIIIiiIiii = this.iiiiiIIiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u97f9\u9186"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u58d0\u97b6\u6490\u6566\u9784\u91dd"))).defaultValue(1.0).min(0.1).max(10.0).sliderMin(0.1).sliderMax(10.0).build());
        this.IiiiiIiIiI = this.iiiiiIIiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u97f9\u8c4a"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u58d0\u97b6\u6490\u6566\u9784\u8c11"))).defaultValue(1.0).min(0.5).max(2.0).sliderMin(0.5).sliderMax(2.0).build());
        this.iIIiIiiiIi = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u800a\u592a\u63da\u91db"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u5708\u800f\u590e\u6804\u661e\u797f\u7394\u5bee\u63a7\u9180"))).defaultValue((Object)(--1 != 0))).build());
        this.IIiiIIIIIi = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u667e\u7939\u8dd7\u79f2"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u5708\u6395\u91b5\u4e6f\u661e\u797f\u7394\u5bee\u8daa\u79a9"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.ALLATORIxDEMO = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u667e\u7939\u575a\u684e"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u5708\u6395\u91b5\u4e6f\u661e\u797f\u7394\u5bee\u5727\u6815"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIIIIIIiII = 3 & 4;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIIIiiiI.ALLATORIxDEMO("-R\u0018_.{}k-z<jmj}\u8be9\u66ae\u65a9\u526d\u671e\u65f0\u724b\u6726\uff48"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        IIIIIIiiii iIIIIIiiii = string2;
        String string2 = string;
        IIIIIIiiii iIiIiIIIII2 = iIIIIIiiii;
        if (((Boolean)iIiIiIIIII2.iiiIiiIIII.get()).booleanValue()) {
            iIiIiIIIII2.iIiIiIiIii();
        }
        if (((Boolean)iIiIiIIIII2.iIIiIiiiIi.get()).booleanValue()) {
            iIiIiIIIII2.ALLATORIxDEMO(string2, IiiIiIiiiI.ALLATORIxDEMO("\u79bf\u5f61\u89c0\u8dbe"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1657 class_16572, double d) {
        IIIIIIiiii iIIIIIiiii = iIIIIIiiii2;
        IIIIIIiiii iIIIIIiiii2 = class_16572;
        IIIIIIiiii iIiIiIIIII2 = iIIIIIiiii;
        iIIIIIiiii2.method_7334().getName();
        if (((Boolean)iIiIiIIIII2.iiiIiiIIII.get()).booleanValue()) {
            iIiIiIIIII2.iiiIiIiiIi();
        }
        if (((Boolean)iIiIiIIIII2.iIIiIiiiIi.get()).booleanValue()) {
            void iIiIiIIIII3;
            iIiIiIIIII2.ALLATORIxDEMO((class_1657)iIIIIIiiii2, (double)iIiIiIIIII3, iiIIIIiiiI.ALLATORIxDEMO("\u8fa2\u515f\u89bd\u8de5"));
        }
    }

    public void onDeactivate() {
        IIIIIIiiii iIIIIIiiii = this;
        iIIIIIiiii.IIiIiiiiII.clear();
        iIIIIIiiii.iIiIIiIIIi.clear();
        iIIIIIiiii.iiiIiIIiii.clear();
        IiIiIIiiii.iiIIiIIiii(IiiIiIiiiI.ALLATORIxDEMO("\u7723\u95a5\u72ea\u5daa\u515f\u95a4"));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIIIIIiiii iIIIIIiiii = iIIIIIiiii2;
        IIIIIIiiii iIIIIIiiii2 = pre;
        IIIIIIiiii iIiIiIIIII2 = iIIIIIiiii;
        if (iIiIiIIIII2.iIIiiIiIiI == null || iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        IIIIIIiiii iIIIIIiiii3 = iIiIiIIIII2;
        iIIIIIiiii3.iIIIIIIiII += --1;
        if (iIIIIIiiii3.iIIIIIIiII < (Integer)iIiIiIIIII2.iIIiiIiIiI.get()) {
            return;
        }
        iIiIiIIIII2.iIIIIIIiII = 3 & 4;
        iIiIiIIIII2.ALLATORIxDEMO();
    }
}

