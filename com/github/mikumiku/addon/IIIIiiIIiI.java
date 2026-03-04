/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.BlockIterator
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.util.Identifier
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIIiiIIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIIIiiiI;
import java.lang.invoke.LambdaMetafactory;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.BlockIterator;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class IIIIiiIIiI
extends iIiIiIIIii {
    private boolean iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private boolean iIiiiIiIii;
    private final SettingGroup iIiIiiiiII;
    private class_2338 IIIIiiIiii;
    private final Setting<Integer> IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private static final class_1291 ALLATORIxDEMO = (class_1291)class_7923.field_41174.method_63535(class_2960.method_60654((String)iIIiiIIiii.ALLATORIxDEMO("#}7Q:F\u0000g,g1U\u000bw ")));

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        IIIIiiIIiI iIiIiIIIII2;
        IIIIiiIIiI iIIIiiIIiI = iIIIiiIIiI2;
        IIIIiiIIiI iIIIiiIIiI2 = class_23382;
        IIIIiiIIiI iIIIiiIIiI3 = iIiIiIIIII2 = iIIIiiIIiI;
        iIIIiiIIiI3.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12968, (class_2338)iIIIiiIIiI2, class_2350.field_11036));
        iIIIiiIIiI3.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
        iIIIiiIIiI3.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, (class_2338)iIIIiiIIiI2, class_2350.field_11036));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(AtomicInteger atomicInteger, class_2338 class_23382, class_2680 class_26802) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IIIIiiIIiI iIIIiiIIiI = iIIIiiIIiI2;
        IIIIiiIIiI iIIIiiIIiI2 = class_23382;
        IIIIiiIIiI iIiIiIIIII4 = iIIIiiIIiI;
        if (iIiIiIIIII3.get() <= (Integer)iIiIiIIIII4.IIiIiIIiii.get() && (iIiIiIIIII2.method_26204() == class_2246.field_10036 || iIiIiIIIII4.iIIiiIiIiI.field_1687.method_8320((class_2338)iIIIiiIIiI2).method_26204() == class_2246.field_22089)) {
            iIiIiIIIII4.ALLATORIxDEMO((class_2338)iIIIiiIIiI2);
            iIiIiIIIII3.getAndIncrement();
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }

    public IIIIiiIIiI() {
        IIIIiiIIiI iIIIiiIIiI = this;
        super(iiIIIIiiiI.ALLATORIxDEMO("\u81aa\u52ab\u6d82\u967b"), iIIiiIIiii.ALLATORIxDEMO("\u818f\u52bc\u6214\u7079\u4f25\u545c\u5691\u7690\u702e"));
        iIIIiiIIiI.iIiIiiiiII = iIIIiiIIiI.settings.createGroup(iiIIIIiiiI.ALLATORIxDEMO("\u620c\u7073\u5428\u56f7\u768e\u7022"));
        iIIIiiIIiI.iiiiiIIiIi = iIIIiiIIiI.settings.createGroup(iIIiiIIiii.ALLATORIxDEMO("\u6245\u7028\u8e9f\u4e6f\u7690\u702e"));
        iIIIiiIIiI.iIIiiIiIiI = iIIIiiIIiI.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u7067\u7022"))).description(iIIiiIIiii.ALLATORIxDEMO("\u81de\u52cd\u6245\u7028\u4f74\u542d\u56c0\u76e1\u707f\u3047"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.IiiIiIiiIi = this.iIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u6c74\u5e70\u5340\u5fcd"))).description(iIIiiIIiii.ALLATORIxDEMO("\u6479\u7d36\u702e\u7690\u6c71\u5e47\u532f\u5f90\u3047"))).defaultValue((Object)(--4))).min(3 & 4).sliderMax(0x67 & 0x1E).build());
        this.IIiiIIIIIi = this.iIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u57c2\u76f7\u5340\u5fcd"))).description(iIIiiIIiii.ALLATORIxDEMO("\u6479\u7d36\u702e\u7690\u57c7\u76c0\u532f\u5f90\u3047"))).defaultValue((Object)(--4))).min(3 & 4).sliderMax(0x37 & 0x4E).build());
        this.IIiIiIIiii = this.iIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u657a\u9186"))).description(iIIiiIIiii.ALLATORIxDEMO("\u6bfb\u525e\u6734\u597f\u6245\u7028\u7690\u65fc\u5763\u6515\u91db\u3047"))).defaultValue((Object)(--5))).min(3 & 5).sliderMax(0x76 & 0x3B).build());
        this.iIiIiIIIII = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u81aa\u52ab\u6534\u6c7d"))).description(iIIiiIIiii.ALLATORIxDEMO("\u5f20\u4f42\u8ebf\u4e4f\u7754\u702e\u65e2\uff4d\u4e00\u6ce4\u673d\u62f2\u705f\u652d\u6788\uff4c\u81fe\u52ed\u650a\u7f0b\u6c20\u3047"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIIiIiiiIi = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u5c05\u4e2e\u6534\u6c7d"))).description(iIIiiIIiii.ALLATORIxDEMO("\u655b\u7f5a\u6c51\u65e2\u81af\u52bc\u5c43\u4f54\u5c20\u4e39\u3047"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IIiIiiiiII = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u5770\u9761\u6247\u6c7d"))).description(iIIiiIIiii.ALLATORIxDEMO("\u53de\u676c\u571c\u5755\u9776\u4e4f\u65e2\u6208\u650a\u7f0b\u6c20\u3047"))).defaultValue((Object)(3 >> 2))).build());
        IIIIiiIIiI iIIIiiIIiI2 = this;
        this.iIiiiIiIii = 5 >> 3;
        iIIIiiIIiI2.IIIIiiIiii = null;
        iIIIiiIIiI2.iIiIIiIIIi = --1;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIIIiiiI.ALLATORIxDEMO("\rr8\u007f\u000e[]K-z\u001cJmj}\u8be9\u66ae\u65a9\u526d\u671e\u65f0\u724b\u6726\uff48"));
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre var1_4) {
        block10: {
            block9: {
                block8: {
                    v0 = this;
                    this = var1_4;
                    iIiIiIIIII = v0;
                    if (!iIiIiIIIII.iIIiiIiIiI.field_1687.method_8597().comp_649()) break block8;
                    if (!iIiIiIIIII.iIiIIiIIIi) break block9;
                    iIiIiIIIII.warning(iIIiiIIiii.ALLATORIxDEMO("\u6c51\u6842\u574d\u6b70\u7eb1\u5eb2\u4e48\u8d43\u4f39\u753c\uff44"), new Object[3 ^ 3]);
                    v1 = iIiIiIIIII;
                    iIiIiIIIII.iIiIIiIIIi = 5 >> 3;
                    break block10;
                }
                if (!iIiIiIIIII.iIiIIiIIIi) {
                    iIiIiIIIII.warning(iiIIIIiiiI.ALLATORIxDEMO("\u541d\u7551\u6c0e\u680d\uff39"), new Object[3 & 4]);
                    iIiIiIIIII.iIiIIiIIIi = 3 & 5;
                }
            }
            v1 = iIiIiIIIII;
        }
        if (((Boolean)v1.IIiIiiiiII.get()).booleanValue() && !iIiIiIIIII.iIIiiIiIiI.field_1724.method_24828()) {
            return;
        }
        if (!((Boolean)iIiIiIIIII.iIiIiIIIII.get()).booleanValue() || !iIiIiIIIII.iIiIIiIIIi) ** GOTO lbl63
        v2 = iIiIiIIIII;
        if (iIiIiIIIII.iIiiiIiIii) {
            this = v2.ALLATORIxDEMO(class_1802.field_8550);
            v3 = iIiIiIIIII;
            v4 = v3;
            iIiIiIIIII.IIIIiiIiii = iIiIiIIIII.iIIiiIiIiI.field_1724.method_24515();
            v3.ALLATORIxDEMO(this);
            v3.iIiiiIiIii = 3 >> 2;
        } else {
            if (!v2.iIIiiIiIiI.field_1724.method_6059(class_7923.field_41174.method_47983((Object)IIIIiiIIiI.ALLATORIxDEMO)) && iIiIiIIIII.iIIiiIiIiI.field_1724.method_5809()) {
                v5 = iIiIiIIIII;
                v5.IIIIiiIiii = v5.iIIiiIiIiI.field_1724.method_24515();
                this = v5.ALLATORIxDEMO(class_1802.field_8705);
                if (v5.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII.IIIIiiIiii).method_26204() == class_2246.field_10036 || iIiIiIIIII.iIIiiIiIiI.field_1687.method_8320(iIiIiIIIII.IIIIiiIiii).method_26204() == class_2246.field_22089) {
                    v6 = iIiIiIIIII;
                    var2_5 = v6.iIIiiIiIiI.field_1773.method_19418().method_19330() % 360.0f;
                    var3_6 = v6.iIIiiIiIiI.field_1773.method_19418().method_19329() % 360.0f;
                    if (((Boolean)v6.iIIiIiiiIi.get()).booleanValue()) {
                        PlayerUtils.centerPlayer();
                    }
                    Rotations.rotate((double)var2_5, (double)90.0);
                    v7 = iIiIiIIIII;
                    v7.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12968, iIiIiIIIII.IIIIiiIiii, class_2350.field_11036));
                    v7.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
                    v7.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, iIiIiIIIII.IIIIiiIiii, class_2350.field_11036));
                    Rotations.rotate((double)var2_5, (double)var3_6);
                }
                iIiIiIIIII.ALLATORIxDEMO(this);
                iIiIiIIIII.iIiiiIiIii = 3 & 5;
            }
lbl63:
            // 4 sources

            v4 = iIiIiIIIII;
        }
        if (((Boolean)v4.iIIiiIiIiI.get()).booleanValue()) {
            this = new AtomicInteger();
            BlockIterator.register((int)((Integer)iIiIiIIIII.IiiIiIiiIi.get()), (int)((Integer)iIiIiIIIII.IIiiIIIIIi.get()), (BiConsumer<class_2338, class_2680>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, ALLATORIxDEMO(java.util.concurrent.atomic.AtomicInteger net.minecraft.util.math.BlockPos net.minecraft.block.BlockState ), (Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)V)((IIIIiiIIiI)iIiIiIIIII, (AtomicInteger)this));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(class_1792 class_17922) {
        IIIIiiIIiI iIIIiiIIiI = this;
        int n = -4 >> 2;
        int n2 = this = 3 >> 2;
        while (true) {
            void iIiIiIIIII2;
            if (n2 >= 9) break;
            if (iIIIiiIIiI.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7909() == iIiIiIIIII2) {
                n = this;
                return n;
            }
            n2 = ++this;
        }
        return n;
    }

    private /* synthetic */ void ALLATORIxDEMO(int n) {
        int n22 = n;
        IIIIiiIIiI iIiIiIIIII2 = this;
        if (n22 != -4 >> 2) {
            int n3 = iIiiiIIiIi.ALLATORIxDEMO();
            if (((Boolean)iIiIiIIIII2.iIIiIiiiIi.get()).booleanValue()) {
                PlayerUtils.centerPlayer();
            }
            iIiiiIIiIi.ALLATORIxDEMO(n22);
            IIIIiiIIiI iIIIiiIIiI = iIiIiIIIII2;
            float n22 = iIIIiiIIiI.iIIiiIiIiI.field_1773.method_19418().method_19330() % 360.0f;
            float f = iIIIiiIIiI.iIIiiIiIiI.field_1773.method_19418().method_19329() % 360.0f;
            Rotations.rotate((double)n22, (double)90.0);
            iIIIiiIIiI.iIIiiIiIiI.field_1761.method_2919((class_1657)iIiIiIIIII2.iIIiiIiIiI.field_1724, class_1268.field_5808);
            iIiiiIIiIi.ALLATORIxDEMO(n3);
            Rotations.rotate((double)n22, (double)f);
        }
    }
}

