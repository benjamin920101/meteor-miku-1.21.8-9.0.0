/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.PlaySoundEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.FireworkRocketEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.util.Identifier
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIiiiI;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.modules.ChestplateFly;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.world.PlaySoundEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.Identifier;

public class IiIIiiiiII
extends iIiIiIIIii {
    private boolean IiiIiIiiIi;
    private int IIiIiIIiii;
    private class_243 iIIiiIiIiI;
    private final Setting<ChestplateFly.Mode> iiiiiIIiIi;
    public final Setting<Integer> iIIiIiiiIi;
    private iIiIIiIiii iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        block10: {
            IiIIiiiiII iiIIiiiiII;
            IiIIiiiiII iIiIiIIIII2;
            Object object;
            block9: {
                IiIIiiiiII iiIIiiiiII2 = object;
                object = post;
                iIiIiIIIII2 = iiIIiiiiII2;
                if (iIiIiIIIII2.ALLATORIxDEMO()) break block9;
                class_1792[] class_1792Array = new class_1792[5 >> 2];
                class_1792Array[5 >> 3] = class_1802.field_8639;
                if (!InvUtils.find((class_1792[])class_1792Array).found()) break block10;
            }
            object = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_5829();
            double d = ((class_238)object).field_1322;
            object = new class_238(((class_238)object).field_1323, d - 0.1, ((class_238)object).field_1321, ((class_238)object).field_1320, d, ((class_238)object).field_1324);
            for (class_2338 class_23382 : class_2338.method_10094((int)((int)Math.floor(((class_238)object).field_1323)), (int)((int)Math.floor(((class_238)object).field_1322)), (int)((int)Math.floor(((class_238)object).field_1321)), (int)((int)Math.floor(((class_238)object).field_1320)), (int)((int)Math.floor(((class_238)object).field_1325)), (int)((int)Math.floor(((class_238)object).field_1324)))) {
                double d2;
                if (!iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(class_23382).method_26212((class_1922)iIiIiIIIII2.iIIiiIiIiI.field_1687, class_23382)) continue;
                double d3 = (double)class_23382.method_10264() + 1.0;
                d3 = d - d3;
                if (!(d2 >= 0.0) || !(d3 < 0.1) || !(iIiIiIIIII2.iIIiiIiIiI.field_1351 < 0.0)) continue;
                IiIIiiiiII iiIIiiiiII3 = iIiIiIIIII2;
                iIiIiIIIII2.iIIiiIiIiI = new class_243(iIiIiIIIII2.iIIiiIiIiI.field_1352, 0.1, iIiIiIIIII2.iIIiiIiIiI.field_1350);
            }
            IiIIiiiiII iiIIiiiiII4 = iIiIiIIIII2;
            iiIIiiiiII4.iIiIiIIIII = iiIIiiiiII4.ALLATORIxDEMO();
            iiIIiiiiII4.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)iIiIiIIIII2.iIIiiIiIiI.field_1724, class_2848.class_2849.field_12982));
            if (iiIIiiiiII4.IIiIiIIiii <= 0) {
                iIiIiIIIII2.IiiIiIiiIi = 2 ^ 3;
            }
            if (iIiIiIIIII2.IiiIiIiiIi && iIiIiIIIII2.iIIiiIiIiI.method_1033() > 1.0E-7) {
                iIiIiIIIII2.ALLATORIxDEMO();
                iIiIiIIIII2.IiiIiIiiIi = 3 & 4;
            }
            if (iIiIiIIIII2.IIiIiIIiii >= 0) {
                iIiIiIIIII2.IIiIiIIiii -= 2 ^ 3;
                iiIIiiiiII = iIiIiIIIII2;
            } else {
                iIiIiIIIII2.IIiIiIIiii = (Integer)iIiIiIIIII2.iIIiIiiiIi.get();
                iiIIiiiiII = iIiIiIIIII2;
            }
            if (iiIIiiiiII.iiiiiIIiIi.get() == ChestplateFly.Mode.ALLATORIxDEMO) {
                IiIIiiiiII iiIIiiiiII5 = iIiIiIIIII2;
                iiIIiiiiII5.ALLATORIxDEMO(iiIIiiiiII5.iIiIiIIIII);
                iiIIiiiiII5.iIiIiIIIII = null;
            }
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiIIiiiiII iiIIiiiiII = this;
        iiIIiiiiII.IIiIiIIiii = (int)((double)((Integer)iiIIiiiiII.iIIiIiiiIi.get()).intValue() * 20.0);
        int n = -4 >> 2;
        int n2 = -4 >> 2;
        class_1792[] class_1792Array = new class_1792[2 ^ 3];
        class_1792Array[3 ^ 3] = class_1802.field_8639;
        FindItemResult findItemResult = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (!findItemResult.found()) {
            class_1792[] class_1792Array2 = new class_1792[--1];
            class_1792Array2[3 ^ 3] = class_1802.field_8639;
            FindItemResult findItemResult2 = InvUtils.find((class_1792[])class_1792Array2);
            if (!findItemResult2.found()) {
                return;
            }
            FindItemResult findItemResult3 = InvUtils.findInHotbar(iIiIiIIIII2 -> {
                if (iIiIiIIIII2.method_7909() != class_1802.field_8288) {
                    return --1 != 0;
                }
                return false;
            });
            n2 = findItemResult2.slot();
            n = findItemResult3.found() ? findItemResult3.slot() : 0;
            iiIIiiiiII.iIIiiIiIiI.field_1761.method_2906(iiIIiiiiII.iIIiiIiIiI.field_1724.field_7498.field_7763, n2, n, class_1713.field_7791, (class_1657)iiIIiiiiII.iIIiiIiIiI.field_1724);
            class_1792[] class_1792Array3 = new class_1792[2 ^ 3];
            class_1792Array3[2 & 5] = class_1802.field_8639;
            findItemResult = InvUtils.findInHotbar((class_1792[])class_1792Array3);
        }
        if (findItemResult.found()) {
            int n3;
            if (findItemResult.isOffhand()) {
                n3 = n2;
                iiIIiiiiII.iIIiiIiIiI.field_1761.method_2919((class_1657)iiIIiiiiII.iIIiiIiIiI.field_1724, class_1268.field_5810);
                iiIIiiiiII.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5810);
            } else {
                InvUtils.swap((int)findItemResult.slot(), (boolean)(--1 != 0));
                iiIIiiiiII.iIIiiIiIiI.field_1761.method_2919((class_1657)iiIIiiiiII.iIIiiIiIiI.field_1724, class_1268.field_5808);
                iiIIiiiiII.iIIiiIiIiI.field_1724.method_6104(class_1268.field_5808);
                InvUtils.swapBack();
                n3 = n2;
            }
            if (n3 != -1) {
                if (n != -4 >> 2) {
                    iiIIiiiiII.iIIiiIiIiI.field_1761.method_2906(iiIIiiiiII.iIIiiIiIiI.field_1724.field_7498.field_7763, n2, n, class_1713.field_7791, (class_1657)iiIIiiiiII.iIIiiIiIiI.field_1724);
                }
            }
        }
    }

    public void onDeactivate() {
        IiIIiiiiII iiIIiiiiII = this;
        iiIIiiiiII.ALLATORIxDEMO(this.iIiIiIIIII);
        iIiiiIIiIi.iiiIiIiiIi();
        iiIIiiiiII.iIIiiIiIiI.field_1724.method_5660((2 & 5) != 0);
        iiIIiiiiII.IIiIiIIiii = 5 >> 3;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(iIiIIiIiii iIiIIiIiii2) {
        IiIIiiiiII iiIIiiiiII = iiIIiiiiII2;
        if (!iiIIiiiiII.iIIiiIiIiI.field_1724.method_6118(class_1304.field_6174).method_7909().equals(class_1802.field_8058) && !iiIIiiiiII.iIIiiIiIiI.field_1724.method_6118(class_1304.field_6174).method_7909().equals(class_1802.field_22028)) {
            class_1792[] class_1792Array = new class_1792[--1];
            class_1792Array[3 ^ 3] = class_1802.field_22028;
            IiIIiiiiII iiIIiiiiII2 = InvUtils.findInHotbar((class_1792[])class_1792Array);
            if (!iiIIiiiiII2.found()) {
                class_1792[] class_1792Array2 = new class_1792[3 & 5];
                class_1792Array2[5 >> 3] = class_1802.field_8058;
                iiIIiiiiII2 = InvUtils.findInHotbar((class_1792[])class_1792Array2);
            }
            if (iiIIiiiiII2.found()) {
                void iIiIiIIIII2;
                iiIIiiiiII.iIIiiIiIiI.field_1761.method_2906(iiIIiiiiII.iIIiiIiIiI.field_1724.field_7498.field_7763, 0x67 & 0x1E, iiIIiiiiII2.slot(), class_1713.field_7791, (class_1657)iiIIiiiiII.iIIiiIiIiI.field_1724);
                if (iIiIiIIIII2 != null) {
                    iiIIiiiiII.iIIiiIiIiI.field_1761.method_2906(iiIIiiiiII.iIIiiIiIiI.field_1724.field_7498.field_7763, iIiIiIIIII2.ALLATORIxDEMO, iiIIiiiiII2.slot(), class_1713.field_7791, (class_1657)iiIIiiiiII.iIIiiIiIiI.field_1724);
                    return;
                }
            } else {
                class_1792[] class_1792Array3 = new class_1792[1];
                class_1792Array3[3 ^ 3] = class_1802.field_22028;
                iiIIiiiiII2 = InvUtils.find((class_1792[])class_1792Array3);
                if (!iiIIiiiiII2.found()) {
                    class_1792[] class_1792Array4 = new class_1792[3 & 5];
                    class_1792Array4[2 & 5] = class_1802.field_8058;
                    iiIIiiiiII2 = InvUtils.find((class_1792[])class_1792Array4);
                }
                if (iiIIiiiiII2.found()) {
                    InvUtils.move().from(iiIIiiiiII2.slot()).toArmor(5 >> 1);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    public void ALLATORIxDEMO(PlaySoundEvent playSoundEvent) {
        IiIIiiiiII iiIIiiiiII = iterator;
        Iterator<class_2960> iterator = List.of(class_2960.method_60654((String)iIIIIiIiii.ALLATORIxDEMO("fJeFHqJeW1GrKk\rjDsBw\u001e}ZvsByiBaJuDf")), class_2960.method_60654((String)IiIIiIiiiI.ALLATORIxDEMO("3g0k=|\u001fH\n\u0014\u001fR\u001eFUJ\u0004K\fAVM\u0014@\u0017^\u0010q\u0016W\u001aG\bC\fM")), class_2960.method_60654((String)iIIIIiIiii.ALLATORIxDEMO("NbMN`YbE\u007f\u0014oZcN%Wl@jB6Nro[VQBcVs_d")), class_2960.method_60654((String)IiIIiIiiiI.ALLATORIxDEMO("3g0k\u001d\\\u001fH\u0002\u001c\u0012_\u001eFXG\u0011^\u0017ZKP\u000f[&o,G\u001bC\u0017E\u0016L")), class_2960.method_60654((String)iIIIIiIiii.ALLATORIxDEMO("NBmN`QjHr\u0014oWn[0Lw]wY-\u007fCSgWPHhAa")), class_2960.method_60654((String)IiIIiIiiiI.ALLATORIxDEMO("c\u0017@\u001bM\u0004G\u001d_AB\u0002C\u000e\u001d\u0019Z\bZ\f\u0000*n\u0006J\u0002}\u0013X\u0017F")), class_2960.method_60654((String)iIIIIiIiii.ALLATORIxDEMO("fJEfHqBmZ<GrFf\u0018\u007f_h_j\u0005fkGO~xlGfDk")), class_2960.method_60654((String)IiIIiIiiiI.ALLATORIxDEMO("3g0k\u001d\\\u001fH\u0002\u001c\u0012_\u001eFXG\u0011^\u0017ZKP\u000f[&o,O\u0017C\u000eB\u001dZ")), class_2960.method_60654((String)iIIIIiIiii.ALLATORIxDEMO("FjMnMtO`W1_jHh\u001e}Gzn@G AcVnCb"))).iterator();
        while (iterator.hasNext()) {
            void iIiIiIIIII2;
            if (!((class_2960)iterator.next()).equals((Object)iIiIiIIIII2.sound.method_4775())) continue;
            iIiIiIIIII2.cancel();
            return;
        }
    }

    @Override
    public void onActivate() {
        IiIIiiiiII iiIIiiiiII = this;
        super.onActivate();
        iiIIiiiiII.IiiIiIiiIi = iiIIiiiiII.ALLATORIxDEMO();
        iiIIiiiiII.iIIiiIiIiI = iiIIiiiiII.iIIiiIiIiI.field_1724.method_18798();
        iiIIiiiiII.iIIiiIiIiI.field_1724.method_6043();
        iiIIiiiiII.iIIiiIiIiI.field_1724.method_24830((2 & 5) != 0);
    }

    public iIiIIiIiii ALLATORIxDEMO() {
        IiIIiiiiII iiIIiiiiII = iiIIiiiiII2;
        if (iiIIiiiiII.iIIiiIiIiI.field_1724.method_6118(class_1304.field_6174).method_7909().equals(class_1802.field_8833)) {
            return null;
        }
        class_1792[] class_1792Array = new class_1792[1];
        class_1792Array[2 & 5] = class_1802.field_8833;
        FindItemResult findItemResult = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (findItemResult.found()) {
            iiIIiiiiII.iIIiiIiIiI.field_1761.method_2906(iiIIiiiiII.iIIiiIiIiI.field_1724.field_7498.field_7763, 0x37 & 0x4E, findItemResult.slot(), class_1713.field_7791, (class_1657)iiIIiiiiII.iIIiiIiIiI.field_1724);
            return null;
        }
        class_1792[] class_1792Array2 = new class_1792[1];
        class_1792Array2[2 & 5] = class_1802.field_8833;
        findItemResult = InvUtils.find((class_1792[])class_1792Array2);
        if (!findItemResult.found()) {
            return null;
        }
        IiIIiiiiII iiIIiiiiII2 = InvUtils.findInHotbar(iIiIiIIIII2 -> {
            if (iIiIiIIIII2.method_7909() != class_1802.field_8288) {
                return --1 != 0;
            }
            return false;
        });
        iiIIiiiiII.iIIiiIiIiI.field_1761.method_2906(iiIIiiiiII.iIIiiIiIiI.field_1724.field_7498.field_7763, findItemResult.slot(), iiIIiiiiII2.found() ? iiIIiiiiII2.slot() : 0, class_1713.field_7791, (class_1657)iiIIiiiiII.iIIiiIiIiI.field_1724);
        iiIIiiiiII.iIIiiIiIiI.field_1761.method_2906(iiIIiiiiII.iIIiiIiIiI.field_1724.field_7498.field_7763, 0x56 & 0x2F, iiIIiiiiII2.found() ? iiIIiiiiII2.slot() : 0, class_1713.field_7791, (class_1657)iiIIiiiiII.iIIiiIiIiI.field_1724);
        iIiIIiIiii iIiIIiIiii2 = new iIiIIiIiii(iiIIiiiiII);
        new iIiIIiIiii(iiIIiiiiII).iIiIiIIIII = iiIIiiiiII2.found() ? iiIIiiiiII2.slot() : 0;
        iIiIIiIiii2.ALLATORIxDEMO = findItemResult.slot();
        return iIiIIiIiii2;
    }

    public IiIIiiiiII() {
        IiIIiiiiII iiIIiiiiII = this;
        super(IiIIiIiiiI.ALLATORIxDEMO("\u753b\u9887"), iIIIIiIiii.ALLATORIxDEMO("\u519b\u4e3e\u6b7d\u3076"));
        iiIIiiiiII.ALLATORIxDEMO = iiIIiiiiII.settings.getDefaultGroup();
        iiIIiiiiII.iiiiiIIiIi = iiIIiiiiII.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u6a28\u5f56"))).description(iIIIIiIiii.ALLATORIxDEMO("\u51a5\u5ba4\u6a7d\u5723\u5729\u98f7\u8841\u65d3\u598d\u4f72\u5948\u7462\u88c0\u592a\uff11)6\u0013*\u80da\u7525\u6a1e\u5f0f\uff32\u6b83\u6b45\u4f70\u750f\u9793\u7fe6\u98d7\u886d\u5419\u4f25\u7ac4\u5354\u6369\u56fd\u80f1\u7513\uff1b\u7517\u4ec2\u574c\u98dd\u8867\u4e08\u6236\u6591\u95da\u5fe6\u903a\u520b\u6346\u304en\u000b.+\u97bb\u7fee\u6a22\u5f24\uff19\u4fd6\u6322\u9793\u7fe6\u4e06\u6341\u56d5\u80db\u7519\uff0f\u9029\u540b\u9521\u6580\u95ff\u98fd\u8840\u6232\u8fd7\u8dfe\u79ad\u639c\u7d7e\u3076"))).defaultValue((Object)ChestplateFly.Mode.ALLATORIxDEMO)).build());
        this.iIIiIiiiIi = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIiiiI.ALLATORIxDEMO("\u709c\u82a2\u5eff\u8f86"))).description(iIIIIiIiii.ALLATORIxDEMO("\u6384\u5220\u81d4\u52f4\u4f0b\u7529\u70f6\u82bc\u704e\u7ba2\u76a3\u65ba\u9590\u95f1\u96b9\uff03\u5376\u4f5b\uff24\u79d8\uff2b\u30155\u6570\u5014\u8dc6\u4f2a\uff03\u70f8\u82ba\u4f5c\u7521\u8dab\u9886\u7e7e\uff03\u98f9\u8847\u903c\u5eaf\u8dab\u5e64\u7a0c\uff57\u6514\u503f\u8da1\u9ade\uff22\u521f\u4f51\u7525\u95d1\u9698\u8dae\u9533\uff68\u82a9\u7702\u70d4\u8292\u3029\t\u9ef3\u8ba7\u5037\u0003>\u0003\u8863\u7919\u6bc4\u96b7\u7e8d#\u001e#\u798c\u4f09\u7523\u4e23\u6b2d\u70fb\u82ba\u638b\u8fcd\u98e0\u8810\u3076"))).defaultValue((Object)(--5))).sliderRange(3 >> 2, 0x7F & 0xA).build());
        IiIIiiiiII iiIIiiiiII2 = this;
        this.IIiIiIIiii = 3 & 4;
        iiIIiiiiII2.IiiIiIiiIi = this.IIiIiIIiii;
        iiIIiiiiII2.iIIiiIiIiI = class_243.field_1353;
        iiIIiiiiII2.iIiIiIIIII = null;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiIiiiI.ALLATORIxDEMO("\u000eb;o-k~{\u000eJ\u001fZnz~\u8bf9\u66ad\u65b9\u526e\u670e\u65f3\u725b\u6725\uff58"));
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        IiIIiiiiII iiIIiiiiII = iiIIiiiiII2;
        int n = 3 ^ 3;
        for (IiIIiiiiII iiIIiiiiII2 : iiIIiiiiII.iIIiiIiIiI.field_1687.method_18112()) {
            if (!(iiIIiiiiII2 instanceof class_1671) || (iiIIiiiiII2 = (class_1671)iiIIiiiiII2).method_24921() == null || !iiIIiiiiII2.method_24921().equals((Object)iiIIiiiiII.iIIiiIiIiI.field_1724)) continue;
            int cfr_ignored_0 = 4 ^ 5;
        }
        return n != 0;
    }
}

