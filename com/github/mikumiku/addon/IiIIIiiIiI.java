/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.item.MaceItem
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiIIiIi;
import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.modules.MaceCombo;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.MaceItem;

public class IiIIIiiIiI
extends iIiIiIIIii {
    private final Setting<MaceCombo.WeaponType> iiiIiiIIII;
    private boolean iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private int IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Integer> iIIiIiiiIi;
    private int iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_243 class_2432, int n) {
        int n2;
        void iIiIiIIIII2;
        IiIIIiiIiI iiIIIiiIiI = iiIIIiiIiI2;
        IiIIIiiIiI iiIIIiiIiI2 = class_2432;
        IiIIIiiIiI iIiIiIIIII3 = iiIIIiiIiI;
        int n3 = Math.min((int)Math.ceil((double)iIiIiIIIII2 / 10.0), 0x7E & 0x15);
        int n4 = n2 = 3 >> 2;
        while (true) {
            if (n4 >= Math.max(4, n3 - --1)) break;
            int n5 = 2 ^ 3;
            iIiIiIIIII3.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO(3 >> 2));
            n4 = ++n2;
        }
        double d = iIiIiIIIII3.iIIiiIiIiI.field_1724.method_23318() + (double)Math.min((int)iIiIiIIIII2, (Integer)iIiIiIIIII3.iIiIiiiiII.get());
        IiIIIiiIiI iiIIIiiIiI3 = iIiIiIIIII3;
        iIiIiIIIII3.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO(iiIIIiiIiI3.iIIiiIiIiI.field_1724.method_23317(), d, iIiIiIIIII3.iIIiiIiIiI.field_1724.method_23321(), 3 >> 2));
        iiIIIiiIiI3.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO(((class_243)iiIIIiiIiI2).field_1352, ((class_243)iiIIIiiIiI2).field_1351, ((class_243)iiIIIiiIiI2).field_1350, (3 ^ 3) != 0));
    }

    public void onDeactivate() {
        if (this.IIIIiiIiii != -4 >> 2 && this.iIIiiIiIiI.field_1724 != null) {
            IiIiiiiIii.ALLATORIxDEMO(this.IIIIiiIiii, (3 & 4) != 0);
            this.IIIIiiIiii = -4 >> 2;
        }
        this.iIiIiIIIII = 3 & 4;
        this.iIiIIiIIIi = this.iIiIiIIIII;
    }

    @EventHandler(priority=100)
    private /* synthetic */ void iiiIiIiiIi(AttackEntityEvent attackEntityEvent) {
        IiIIIiiIiI iiIIIiiIiI = iiIIIiiIiI2;
        IiIIIiiIiI iiIIIiiIiI2 = attackEntityEvent;
        IiIIIiiIiI iIiIiIIIII2 = iiIIIiiIiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        iiIIIiiIiI2 = ((AttackEntityEvent)iiIIIiiIiI2).entity;
        if (iiIIIiiIiI2 == null || !iiIIIiiIiI2.method_5805() || !(iiIIIiiIiI2 instanceof class_1309)) {
            return;
        }
        IiIIIiiIiI iiIIIiiIiI3 = iIiIiIIIII2;
        iiIIIiiIiI3.iIiIIiIIIi = iIiiiIIiIi.iiIIiIIiii((class_310)iiIIIiiIiI3.iIIiiIiIiI);
        if (((Boolean)iiIIIiiIiI3.IIiIiIIiii.get()).booleanValue() && iIiIiIIIII2.ALLATORIxDEMO() && (iiIIIiiIiI2 = iIiIiIIIII2.ALLATORIxDEMO()).found()) {
            iIiIiIIIII2.IIIIiiIiii = iIiiiIIiIi.ALLATORIxDEMO();
            IiIiiiiIii.ALLATORIxDEMO(iiIIIiiIiI2.slot(), (3 ^ 3) != 0);
            iIiIiIIIII2.iIiIiIIIII = (Integer)iIiIiIIIII2.iIIiIiiiIi.get();
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiIIIiiIiI iiIIIiiIiI = iiIIIiiIiI2;
        IiIIIiiIiI iiIIIiiIiI2 = post;
        IiIIIiiIiI iIiIiIIIII2 = iiIIIiiIiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        if (iIiIiIIIII2.iIiIiIIIII > 0) {
            IiIIIiiIiI iiIIIiiIiI3 = iIiIiIIIII2;
            iiIIIiiIiI3.iIiIiIIIII -= 2 ^ 3;
            if (iiIIIiiIiI3.iIiIiIIIII == 0) {
                if (iIiIiIIIII2.IIIIiiIiii != -4 >> 2) {
                    IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2.IIIIiiIiii, 3 >> 2);
                    iIiIiIIIII2.IIIIiiIiii = -4 >> 2;
                }
            }
        }
        if (iIiIiIIIII2.iIiIIiIIIi && !iIiiiIIiIi.iiIIiIIiii((class_310)iIiIiIIIII2.iIIiiIiIiI)) {
            iIiIiIIIII2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)iIiIiIIIII2.iIIiiIiIiI.field_1724, class_2848.class_2849.field_12982));
            iIiIiIIIII2.iIiIIiIIIi = 2 & 5;
        }
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_1799 class_17992) {
        IiIIIiiIiI iiIIIiiIiI = object;
        Object object = class_17992;
        IiIIIiiIiI iIiIiIIIII2 = iiIIIiiIiI;
        if (!(object.method_7909() instanceof class_9362)) {
            return 5 >> 3;
        }
        object = ((class_9304)object.method_58695(class_9334.field_49633, (Object)class_9304.field_49385)).method_57539().iterator();
        while (object.hasNext()) {
            class_6880 class_68802 = (class_6880)((Object2IntMap.Entry)object.next()).getKey();
            if (!class_68802.method_40230().isPresent() || !((class_5321)class_68802.method_40230().get()).method_29177().method_12832().equals(IiIIiIIiiI.ALLATORIxDEMO("q\u000bV8p\u0011"))) continue;
            return 5 >> 2;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IiIIIiiIiI iiIIIiiIiI = iiIIIiiIiI2;
        IiIIIiiIiI iiIIIiiIiI2 = class_23382;
        IiIIIiiIiI iIiIiIIIII2 = iiIIIiiIiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiIIIiiIiI2).method_45474() && iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8316((class_2338)iiIIIiiIiI2).method_15769() && !iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiIIIiiIiI2).method_27852(class_2246.field_27879)) {
            return 5 >> 2;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean ALLATORIxDEMO() {
        IiIIIiiIiI iiIIIiiIiI;
        IiIIIiiIiI iiIIIiiIiI2 = iiIIIiiIiI = iiIIIiiIiI3;
        IiIIIiiIiI iiIIIiiIiI3 = iiIIIiiIiI2.iIIiiIiIiI.field_1724.method_6047().method_7909();
        switch (((MaceCombo.WeaponType)((Object)iiIIIiiIiI2.iiiIiiIIII.get())).ordinal()) {
            case 0: {
                return IiIiiIIIiI.ALLATORIxDEMO((class_1792)iiIIIiiIiI3);
            }
            case 1: {
                return iiIIIiiIiI3 instanceof class_1743;
            }
            case 2: {
                return iiIIIiiIiI.iIIiiIiIiI.field_1724.method_6047().method_7960();
            }
            case 3: {
                return true;
            }
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1309 class_13092) {
        IiIIIiiIiI iiIIIiiIiI = iiIIIiiIiI2;
        IiIIIiiIiI iiIIIiiIiI2 = class_13092;
        IiIIIiiIiI iIiIiIIIII2 = iiIIIiiIiI;
        if (!((Boolean)iIiIiIIIII2.iiiiiIIiIi.get()).booleanValue()) {
            return (2 & 5) != 0;
        }
        if (iiIIIiiIiI2 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)iiIIIiiIiI2;
            if (class_16572.method_68878() || class_16572.method_6039()) {
                return true;
            }
            return false;
        }
        return iiIIIiiIiI2.method_5655();
    }

    public IiIIIiiIiI() {
        IiIIIiiIiI iiIIIiiIiI = this;
        super(iIiIiIIIii.iIIiIiiiIi, IiIIiIIiiI.ALLATORIxDEMO("\u5209\u9540\u58da\u4f0a"), IIiiiIIiIi.ALLATORIxDEMO("\u6b0f\u5649\u952a\u8f98\u51d5H.\u4f39\u7526\u6341\u5b94\u6b20\u5646\u655d\u51d5\u6590\u81e4\u52ee\u5229\u9542\u5890\u4f62"));
        iiIIIiiIiI.ALLATORIxDEMO = iiIIIiiIiI.settings.getDefaultGroup();
        iiIIIiiIiI.iIIiiIiIiI = iiIIIiiIiI.settings.createGroup(IiIIiIIiiI.ALLATORIxDEMO("\u5a0f\u52ff\u58da\u5f14"));
        iiIIIiiIiI.iiiIiiIIII = iiIIIiiIiI.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u6b48\u560e\u7c75\u57cd"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u899f\u53c5\u5279\u6371\u76fd\u6b68\u560c\u7c3f\u57a5"))).defaultValue((Object)MaceCombo.WeaponType.iIIiiIiIiI)).build());
        this.IIiIiIIiii = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u81c4\u52ce\u5209\u6324"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u4f6c\u7551\u6334\u5bc3\u6b20\u5644\u6528\u5182\u65e2\u8194\u52bb\u527e\u636c\u5254\u9560\u5b7e"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IIiIiiiiII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u4eeb\u7852\u753c\u9562"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u53ac\u522b\u6371\u5249\u671d\u784a\u7521\u963d\u9b5a\u76e0\u9560\u5b7e"))).defaultValue((Object)(3 >> 1))).visible(() -> this.IIiIiIIiii.get())).build());
        this.iIIiIiiiIi = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u5229\u56b8\u5ef8\u8f99"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u657d\u51d7\u541d\u5963\u5c05\nz\u001ae\u5263\u569a\u527f"))).defaultValue((Object)(3 & 5))).min(3 ^ 3).max(--5).sliderMax(--5).visible(() -> this.IIiIiIIiii.get())).build());
        this.IIiiIIIIIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u5a2f\u52fd\u5890\u5f7c"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u4f06\u753c\u955a\u5b43\u658f\u5890\u5f5e\u4f60\u5b9d"))).defaultValue((Object)(5 >> 2))).build());
        this.iIiiiIiIii = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u4eeb\u97fe\u7fcb\u65b0"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u53c6\u573b\u97e1\u7fd1\u98a0\u885f\u658f\u5890\u5f5e\u5a45\u52b5"))).defaultValue((Object)((4 ^ 5) != 0))).visible(() -> this.IIiiIIIIIi.get())).build());
        this.IiiIiIiiIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u672e\u5941\u5a0f\u52dd"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u81f9\u52d1\u5bef\u6200\u6713\u595e\u53e1\u754c\u9a9c\u5e88"))).defaultValue((Object)((3 & 4) != 0))).visible(() -> this.IIiiIIIIIi.get())).build());
        this.iIiIiiiiII = this.iIIiiIiIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u4e25\u845b\u9ad6\u5ee0"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u6a5f\u62cc\u76fd\u4e05\u8459\u9a9c\u5e88"))).defaultValue((Object)(0x5E & 0x37))).min(2 ^ 3).max(0x73 & 0x3E).sliderMax(0x77 & 0x3A).visible(() -> {
            if (((Boolean)this.IIiiIIIIIi.get()).booleanValue() && !((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.iiiiiIIiIi = this.iIIiiIiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("\u68ee\u6783\u76e0\u6841"))).description(IiIIiIIiiI.ALLATORIxDEMO("\u4e54\u5bea\u5262\u9013\u6a78\u5f49\u302d\u65f3\u6535\u3015\u6842\u6332\u76fd\u73a7\u5bd2\u4f3b\u7506"))).defaultValue((Object)((2 ^ 3) != 0))).visible(() -> this.IIiiIIIIIi.get())).build());
        IiIIIiiIiI iiIIIiiIiI2 = this;
        this.iIiIIiIIIi = 3 ^ 3;
        iiIIIiiIiI2.IIIIiiIiii = -4 >> 2;
        iiIIIiiIiI2.iIiIiIIIII = 3 >> 2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiiiIIiIi.ALLATORIxDEMO("y\r\f@}#\u000e\u0013~\"o2kg\u000e\u8b91\u66da\u65d6\u523e\u6746\u659e\u722e\u6722\uff47"));
        }
    }

    @EventHandler(priority=-100)
    private /* synthetic */ void ALLATORIxDEMO(AttackEntityEvent attackEntityEvent) {
        IiIIIiiIiI iiIIIiiIiI = iiIIIiiIiI2;
        IiIIIiiIiI iiIIIiiIiI2 = attackEntityEvent;
        IiIIIiiIiI iIiIiIIIII2 = iiIIIiiIiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        iiIIIiiIiI2 = ((AttackEntityEvent)iiIIIiiIiI2).entity;
        if (!(iiIIIiiIiI2 instanceof class_1309)) {
            return;
        }
        class_1309 class_13092 = (class_1309)iiIIIiiIiI2;
        if (((Boolean)iIiIiIIIII2.IIiiIIIIIi.get()).booleanValue() && iIiIiIIIII2.iIIiiIiIiI.field_1724.method_6047().method_7909() instanceof class_9362 && (!((Boolean)iIiIiIIIII2.iIiiiIiIii.get()).booleanValue() || iIiiiIIiIi.iiIIiIIiii((class_310)iIiIiIIIII2.iIIiiIiIiI)) && !iIiIiIIIII2.ALLATORIxDEMO(class_13092)) {
            iIiIiIIIII2.ALLATORIxDEMO();
        }
        if (iIiIiIIIII2.iIiIIiIIIi && !iIiiiIIiIi.iiIIiIIiii((class_310)iIiIiIIIII2.iIIiiIiIiI)) {
            iIiIiIIIII2.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)iIiIiIIIII2.iIIiiIiIiI.field_1724, class_2848.class_2849.field_12982));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiIIIiiIiI iiIIIiiIiI = this;
        try {
            IiIIIiiIiI iiIIIiiIiI2 = iiIIIiiIiI;
            class_243 class_2432 = iiIIIiiIiI2.iIIiiIiIiI.field_1724.method_19538();
            int n = iiIIIiiIiI2.ALLATORIxDEMO();
            if (n <= 0) {
                return;
            }
            IiIIIiiIiI iiIIIiiIiI3 = iiIIIiiIiI;
            int n2 = 2 & 5;
            class_2338 class_23382 = iiIIIiiIiI3.iIIiiIiIiI.field_1724.method_24515().method_10069(n2, n, n2);
            class_2338 class_23383 = class_23382.method_10084();
            if (!iiIIIiiIiI3.ALLATORIxDEMO(class_23382) || !iiIIIiiIiI.ALLATORIxDEMO(class_23383)) {
                return;
            }
            iiIIIiiIiI.ALLATORIxDEMO(class_2432, n);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        int n;
        IiIIIiiIiI iiIIIiiIiI = iiIIIiiIiI2;
        if (!((Boolean)iiIIIiiIiI.IiiIiIiiIi.get()).booleanValue()) {
            return (Integer)iiIIIiiIiI.iIiIiiiiII.get();
        }
        IiIIIiiIiI iiIIIiiIiI2 = iiIIIiiIiI.iIIiiIiIiI.field_1724.method_24515();
        int n2 = n = iiIIIiiIiI2.method_10264() + (0x12FB & 0x6DAE);
        while (n2 > iiIIIiiIiI2.method_10264()) {
            class_2338 class_23382 = new class_2338(iiIIIiiIiI2.method_10263(), n, iiIIIiiIiI2.method_10260());
            class_2338 class_23383 = class_23382.method_10084();
            if (iiIIIiiIiI.ALLATORIxDEMO(class_23382) && iiIIIiiIiI.ALLATORIxDEMO(class_23383)) {
                return n - iiIIIiiIiI2.method_10264();
            }
            n2 = --n;
        }
        return 0;
    }

    private /* synthetic */ FindItemResult ALLATORIxDEMO() {
        if (((Boolean)this.IIiIiiiiII.get()).booleanValue()) {
            return IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
                IiIIIiiIiI iiIIIiiIiI = iiIIIiiIiI2;
                IiIIIiiIiI iiIIIiiIiI2 = class_17992;
                IiIIIiiIiI iIiIiIIIII2 = iiIIIiiIiI;
                return iIiIiIIIII2.iiiIiIiiIi((class_1799)iiIIIiiIiI2);
            });
        }
        return IiIiiiiIii.ALLATORIxDEMO((class_1799 iIiIiIIIII2) -> iIiIiIIIII2.method_7909() instanceof class_9362);
    }
}

