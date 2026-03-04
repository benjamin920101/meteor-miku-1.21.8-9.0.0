/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StorageBlockListSetting$Builder
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.BlockEntityType
 *  net.minecraft.block.enums.ChestType
 *  net.minecraft.state.property.Property
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIiIiiiI;
import com.github.mikumiku.addon.IiiiIIIIII;
import com.github.mikumiku.addon.iIiIIiIIII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.modules.ChestAura;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StorageBlockListSetting;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.block.ChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.ChestType;
import net.minecraft.state.property.Property;

public class iIIiiiIiii
extends iIiIiIIIii {
    private final Map<class_2338, Integer> iIiiiIiIii;
    private final Setting<ChestAura.CloseCondition> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final Setting<Double> IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private final iIiIIiIIII iIIiiIiIiI;
    private final Setting<Integer> iiiiiIIiIi;
    private int iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private final Setting<List<class_2591<?>>> ALLATORIxDEMO;

    @Override
    public void onActivate() {
        this.iIIiIiiiIi = 3 ^ 3;
        this.iIiiiIiIii.clear();
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre var1_1) {
        block14: {
            v0 = this;
            this = var1_1;
            iIiIiIIIII = v0;
            if ((Integer)iIiIiIIIII.iiiiiIIiIi.get() != 0) {
                for (Object var2_2 : new HashMap<class_2338, Integer>(iIiIiIIIII.iIiiiIiIii).entrySet()) {
                    var3_3 = var2_2.getValue();
                    if (var3_3 > (Integer)iIiIiIIIII.iiiiiIIiIi.get()) {
                        iIiIiIIIII.iIiiiIiIii.remove(var2_2.getKey());
                        continue;
                    }
                    iIiIiIIIII.iIiiiIiIii.replace((class_2338)var2_2.getKey(), var3_3 + (4 ^ 5));
                }
            }
            if (iIiIiIIIII.iIIiIiiiIi > 0 && iIiIiIIIII.iIIiiIiIiI.field_1755 != null) {
                return;
            }
            this = Utils.blockEntities().iterator();
            v1 = this;
            while (v1.hasNext()) {
                var2_2 = (class_2586)this.next();
                if (!((List)iIiIiIIIII.ALLATORIxDEMO.get()).contains(var2_2.method_11017())) {
                    v1 = this;
                    continue;
                }
                if (iIiIiIIIII.iIIiiIiIiI.field_1724.method_33571().method_1022(class_243.method_24953((class_2382)var2_2.method_11016())) >= (Double)iIiIiIIIII.IiiIiIiiIi.get()) {
                    v1 = this;
                    continue;
                }
                var3_4 = var2_2.method_11016();
                if (iIiIiIIIII.iIiiiIiIii.containsKey(var3_4)) {
                    v1 = this;
                    continue;
                }
                this = iIiIiiIIIi.iiIIiIIiii(var3_4, (boolean)(3 & 5));
                if (this == null) {
                    this = class_2350.field_11036;
                }
                iIiIiiIIIi.ALLATORIxDEMO(var3_4, this, (boolean)(3 & 5), class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
                this = var2_2.method_11010();
                if (!this.method_28498((class_2769)class_2281.field_10770)) ** GOTO lbl-1000
                var2_2 = (class_2350)this.method_11654((class_2769)class_2281.field_10768);
                switch (IiiiIIIIII.ALLATORIxDEMO[((class_2745)this.method_11654((class_2769)class_2281.field_10770)).ordinal()]) {
                    case 1: {
                        v2 = iIiIiIIIII;
                        while (false) {
                        }
                        v3 = v2;
                        v2.iIiiiIiIii.put(var3_4.method_10093(var2_2.method_10170()), 2 & 5);
                        break;
                    }
                    case 2: {
                        iIiIiIIIII.iIiiiIiIii.put(var3_4.method_10093(var2_2.method_10160()), 3 ^ 3);
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 = iIiIiIIIII;
                    }
                }
                v3.iIiiiIiIii.put(var3_4, 3 & 4);
                iIiIiIIIII.iIIiIiiiIi = (Integer)iIiIiIIIII.IIiIiIIiii.get();
                MeteorClient.EVENT_BUS.subscribe((Object)iIiIiIIIII.iIIiiIiIiI);
                v4 = iIiIiIIIII;
                break block14;
            }
            v4 = iIiIiIIIII;
        }
        v4.iIIiIiiiIi -= 3 >> 1;
    }

    public iIIiiiIiii() {
        iIIiiiIiii iIIiiiIiii2 = this;
        super(IiiIiIiiiI.ALLATORIxDEMO("\u7fc6\u7be9\u5065\u67ce"), IiiIiIiiiI.ALLATORIxDEMO("\u81d7\u52f0\u5f77\u7ba3"));
        iIIiiiIiii2.iIiIiIIIII = iIIiiiIiii2.settings.getDefaultGroup();
        iIIiiiIiii2.IiiIiIiiIi = iIIiiiIiii2.iIiIiIIIII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u8374\u56e6"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u4e99\u4eca\u8374\u56e6"))).defaultValue(4.0).min(0.0).build());
        class_2591[] class_2591Array = new class_2591[1 ^ 3];
        class_2591Array[3 & 4] = class_2591.field_11914;
        class_2591Array[--1] = class_2591.field_11896;
        this.ALLATORIxDEMO = this.iIiIiIIIII.add((Setting)((StorageBlockListSetting.Builder)((StorageBlockListSetting.Builder)new StorageBlockListSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u6584\u570f\u7c0c\u5799"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u89a6\u6211\u5f20\u76c1\u6584\u570f\u7c0c\u5799"))).defaultValue(class_2591Array).build());
        this.IIiIiIIiii = this.iIiIiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u5e81\u8fcd"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u6216\u5f27\u7bf3\u5b70\u4e0e\u95c9\u76dc\u5e81\u8fcd"))).defaultValue((Object)(--5))).sliderMax(0x3A & 0x6D).build());
        this.iiiiiIIiIi = this.iIiIiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u906a\u5f80\u6581\u95e6"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u7b0c\u5fa5\u595f\u5c311i\u0006K\u544b\u9077\u5f9d\u5dd2\u6216\u5f75\u7694\u7b91\u5b15\u3025r\u8848\u797f\u6c05\u4e55\u9020\u5fca"))).defaultValue((Object)(3 >> 2))).min(5 >> 3).sliderMax(0x3F59 & 0x4EB6).build());
        this.iIiIiiiiII = this.iIiIiIIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u514e\u95b5\u6716\u4ee4"))).defaultValue((Object)ChestAura.CloseCondition.iiiiiIIiIi)).description(IiiIiIiiiI.ALLATORIxDEMO("\u4f72\u65b4\u5153\u95a8\u7b8c\u5b08\u753b\u9770"))).build());
        this.IIIIiiIiii = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u5155\u90b0\u4e55\u51e8"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u6273\u5f45\u7bc4\u5b40\u542e\u65a5\u5ed1\u8f9d\u4e02\u51bf\u5155\u90b0\u721e\u54d3"))).defaultValue((Object)(3 >> 2))).build());
        iIIiiiIiii iIIiiiIiii3 = this;
        iIIiiiIiii iIIiiiIiii4 = this;
        iIIiiiIiii3.iIiiiIiIii = new HashMap<class_2338, Integer>();
        iIIiiiIiii iIIiiiIiii5 = this;
        iIIiiiIiii3.iIIiiIiIiI = new iIiIIiIIII(this);
        iIIiiiIiii3.iIIiIiiiIi = 3 ^ 3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIiIiiiI.ALLATORIxDEMO("p)E$s\u0000\u00000P!A1\u00101\u0000\u8bb2\u66d3\u65f2\u5210\u6745\u658d\u7210\u675b\uff13"));
        }
    }
}

