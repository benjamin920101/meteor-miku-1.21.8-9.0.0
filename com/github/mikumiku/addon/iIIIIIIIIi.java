/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.combat.CrystalAura
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.entity.SortPriority
 *  meteordevelopment.meteorclient.utils.entity.Target
 *  meteordevelopment.meteorclient.utils.entity.TargetUtils
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.TickRate
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.passive.AnimalEntity
 *  net.minecraft.entity.passive.WolfEntity
 *  net.minecraft.entity.mob.EndermanEntity
 *  net.minecraft.entity.mob.ZombifiedPiglinEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.TridentItem
 *  net.minecraft.world.GameMode
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.item.MaceItem
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.iIIiiIIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.github.mikumiku.addon.iiiIIIiiiI;
import com.github.mikumiku.addon.modules.KillAuraMiku;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.Target;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.TickRate;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.world.GameMode;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.item.MaceItem;

public class iIIIIIIIIi
extends iIiIiIIIii {
    private final Setting<Boolean> iIIiIiiiII;
    private final Setting<Double> iiiiIiiIIi;
    private final Setting<KillAuraMiku.EntityAge> iiiIIiIIii;
    private final Setting<Boolean> IiiIIiIIiI;
    private int iIIIIiiiii;
    private final Setting<SortPriority> IiIiIiIIii;
    private final SettingGroup iiiIiIiiII;
    private int IIiiiiIIii;
    private final SettingGroup IiiiiIIiII;
    private boolean iIIIIIiiII;
    private final Setting<Boolean> iIIiiiiIii;
    private final Setting<KillAuraMiku.ShieldMode> iiIIIiIIIi;
    private final Setting<Integer> iIiiiiIIII;
    private final Setting<Double> iiIiIIiiii;
    private final Setting<KillAuraMiku.Weapon> iIIiIiiIiI;
    private final Setting<Boolean> iIIIIIIiII;
    private final Setting<Boolean> iIIiiIIIIi;
    private final Setting<Boolean> IiiiiIiIiI;
    private final SettingGroup iiiIiIIiii;
    private final Setting<Boolean> iIIIiiiiIi;
    private final Setting<Integer> iiiIiiIIII;
    private final Setting<Boolean> iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<Set<class_1299<?>>> iIiIiiiiII;
    private final Setting<Integer> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private final List<class_1297> iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    public boolean iIIiIiiiIi;
    private final Setting<KillAuraMiku.RotationMode> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    public String getInfoString() {
        if (!this.iIIiiIiIiI.isEmpty()) {
            return EntityUtils.getName((class_1297)this.ALLATORIxDEMO());
        }
        return null;
    }

    public iIIIIIIIIi() {
        iIIIIIIIIi iIIIIIIIIi2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, iIIiiIIiii.ALLATORIxDEMO("Y,\u007f0\u6754\u626b\u517d\u73ca"), iiiIIIiiiI.ALLATORIxDEMO("\u8de5\u7e9c\u5f5a\u52a0\u76e4\u677b\u652c\u5172\u73cf\u0017\u818a\u5293\u657b\u51e0\u4f75\u5426\u56b4\u631c\u5bdd\u7698\u5bde\u4f48q\u4e0b\u5376\u8156"));
        iIIIIIIIIi2.IiiiiIIiII = iIIIIIIIIi2.settings.getDefaultGroup();
        iIIIIIIIIi2.iiiIiIIiii = iIIIIIIIIi2.settings.createGroup(iIIiiIIiii.ALLATORIxDEMO("\u76fa\u6842\u903d\u628c"));
        iIIIIIIIIi2.iiiIiIiiII = iIIIIIIIIi2.settings.createGroup(iiiIIIiiiI.ALLATORIxDEMO("\u65ab\u673c\u63b0\u527a"));
        iIIIIIIIIi2.iIIiIiiIiI = iIIIIIIIIi2.IiiiiIIiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u6b72\u562d\u7c4f\u57ee"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u4ede\u573d\u6205\u6341\u631c\u5bdd\u6b7a\u5628\u65ed\u6566\u51fd\u5b89\u4f1f"))).defaultValue((Object)KillAuraMiku.Weapon.ALLATORIxDEMO)).build());
        this.iIiIiIIIII = this.IiiiiIIiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u89d2\u8997\u65ff\u8f09"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u51fd\u5bda\u4f4e\u65b1\u5c1a\u8986\u89c9\u8f31\u5417\u76f9\u684b"))).defaultValue((Object)KillAuraMiku.RotationMode.iIIiIiiiIi)).build());
        this.IiiIIiIIiI = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u81fe\u52ed\u5233\u6307"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u6500\u51bb\u76f5\u6812\u65b8\u81aa\u52b3\u5240\u637e\u5270\u9012\u5bc7\u7682\u6b71\u5624"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IIiIiiiiII = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u53c5\u5340\u650f\u519e"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u66ef\u5920\u7682\u6a36\u5f43"))).defaultValue((Object)(3 >> 2))).build());
        this.ALLATORIxDEMO = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5048\u6b27\u758a\u8db4"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u657b\u51e0\u5258\u5012\u6b22\u75a5\u8d96\u4ef9\u4f9d\u631a\u53c2\u724e\u885b\u4e76"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IIiiIIIIIi = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5048\u6b27\u6808\u6344"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u6575\u51bb\u5256\u81ad\u52b4\u5944\u741d\u76a3\u724a\u682b\u636d"))).defaultValue((Object)(3 >> 2))).build());
        this.iIIiIiiiII = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u4e80\u573c\u70fc\u51cf\u6593"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u4e8b\u5768\u6312\u4f08\u9f3c\u6847\u5dfd\u9573\u65f0\u652c\u51b7"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIIiiIIIIi = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u4e80\u573c\u6cad\u89f2\u6593"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u4ede\u576f\u6cf4\u8986\u5b85\u4f0e\u65f0\u652c\u51b7"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IIiIiIIiii = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u6696\u5019V$f,`*Z\u0000"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u5748\u6500\u519b\u5ba5\u4f33\u65cd\u66e2\u65cd\u51db\u7ee8`Yt<)o(r%;\u81b7\u52ae\u5bec\u8da3"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiIIIiIIIi = this.IiiiiIIiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u7820\u76bb\u6a15\u5f6a"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u5c06\u8bc0\u4f31\u7568\u65bc\u5973\u7828\u570f\u76f5\u685a\u7682\u76e9\u7200"))).defaultValue((Object)KillAuraMiku.ShieldMode.iIiIiIIIII)).visible(() -> {
            if (((Boolean)this.IiiIIiIIiI.get()).booleanValue() && this.iIIiIiiIiI.get() != KillAuraMiku.Weapon.iIIiIiiiIi) {
                return 5 >> 2;
            }
            return false;
        })).build());
        class_1299[] class_1299Array = new class_1299[0x69 & 0x3F];
        class_1299Array[2 & 5] = class_1299.field_6097;
        class_1299Array[5 >> 2] = class_1299.field_6099;
        class_1299Array[1 ^ 3] = class_1299.field_6071;
        class_1299Array[--3] = class_1299.field_47243;
        class_1299Array[--4] = class_1299.field_6084;
        class_1299Array[--5] = class_1299.field_6046;
        class_1299Array[0x46 & 0x3F] = class_1299.field_6123;
        class_1299Array[0xF & 0x77] = class_1299.field_6086;
        class_1299Array[0xC & 0x7B] = class_1299.field_6116;
        class_1299Array[0x4F & 0x39] = class_1299.field_6091;
        class_1299Array[0x2F & 0x5A] = class_1299.field_6128;
        class_1299Array[0x3B & 0x4F] = class_1299.field_6090;
        class_1299Array[0x7F & 0xC] = class_1299.field_6107;
        class_1299Array[0x6D & 0x1F] = class_1299.field_6095;
        class_1299Array[0x5E & 0x2F] = class_1299.field_6118;
        class_1299Array[0x2F & 0x5F] = class_1299.field_21973;
        class_1299Array[0x78 & 0x17] = class_1299.field_6071;
        class_1299Array[0x75 & 0x1B] = class_1299.field_6065;
        class_1299Array[0x33 & 0x5E] = class_1299.field_6102;
        class_1299Array[0x5B & 0x37] = class_1299.field_6078;
        class_1299Array[0x34 & 0x5F] = class_1299.field_22281;
        class_1299Array[0x7F & 0x15] = class_1299.field_25751;
        class_1299Array[0x57 & 0x3E] = class_1299.field_6105;
        class_1299Array[0x17 & 0x7F] = class_1299.field_6134;
        class_1299Array[0x1C & 0x7B] = class_1299.field_6109;
        class_1299Array[0x3B & 0x5D] = class_1299.field_6125;
        class_1299Array[0x3A & 0x5F] = class_1299.field_6137;
        class_1299Array[0x5B & 0x3F] = class_1299.field_6069;
        class_1299Array[0x1C & 0x7F] = class_1299.field_6079;
        class_1299Array[0x5F & 0x3D] = class_1299.field_6098;
        class_1299Array[0x7E & 0x1F] = class_1299.field_6059;
        class_1299Array[0x5F & 0x3F] = class_1299.field_6117;
        class_1299Array[0x30 & 0x6F] = class_1299.field_38095;
        class_1299Array[0x79 & 0x27] = class_1299.field_6145;
        class_1299Array[0x6B & 0x36] = class_1299.field_6119;
        class_1299Array[0x3B & 0x67] = class_1299.field_6076;
        class_1299Array[0x74 & 0x2F] = class_1299.field_6051;
        class_1299Array[37] = class_1299.field_6050;
        class_1299Array[38] = class_1299.field_23696;
        class_1299Array[39] = class_1299.field_6066;
        class_1299Array[40] = class_1299.field_6100;
        this.iIiIiiiiII = this.iiiIiIIiii.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5b8a\u4f16\u7c4f\u57ee"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u89c6\u6527\u51bb\u769f\u5bc3\u4f55\u7c6c\u57c7"))).onlyAttackable().defaultValue(class_1299Array).build());
        this.IiIiIiIIii = this.iiiIiIIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u4f5d\u517c\u7ec2"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u8343\u56ef\u51c2\u76f2\u6847\u769f\u7b06\u900f\u65ae\u5f43"))).defaultValue((Object)SortPriority.ClosestAngle)).build());
        this.iIiiiiIIII = this.iiiIiIIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u6745\u5933\u76ab\u6833\u6515"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u5417\u65b1\u951d\u5bda\u769f\u5bc3\u4f55\u6567\u9183"))).defaultValue((Object)(2 ^ 3))).min(4 ^ 5).sliderRange(2 ^ 3, --5).visible(() -> {
            if (!((Boolean)this.iIIiiIIIIi.get()).booleanValue()) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.iiIiIIiiii = this.iiiIiIIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u652f\u51be\u8337\u5691"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u53af\u6520\u51bc\u5b82\u4f13\u769f\u675d\u5921\u8dca\u79f7"))).defaultValue(3.1).min(3.0).sliderMax(7.0).build());
        this.iiiiIiiIIi = this.iiiIiIIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u7a6b\u58dc\u8337\u5691"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u53fa\u7a31\u58d9\u6520\u51bc\u5b82\u4f13\u769f\u675d\u5921\u8dca\u79f7"))).defaultValue(4.5).min(2.0).sliderMax(7.0).build());
        this.iiiIIiIIii = this.iiiIiIIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u750b\u722c\u5e60\u9fc1\u8ff3\u6e81"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u51d3\u5ba1\u89e1\u6500\u519b\u76bf\u755f\u7272\u5e61\u9fca\uff48\u5e67\u5e33\u301d\u6250\u5e6f\u624b\u516e\u90ff\uff45"))).defaultValue((Object)KillAuraMiku.EntityAge.ALLATORIxDEMO)).build());
        this.iIIIIIIiII = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5fe9\u7520\u5469\u5448\u752b\u720c"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u666f\u543d\u652e\u51b5\u62a5\u6712\u81ad\u5b86\u4e09\u5416\u79ad\u7682\u7508\u7225"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiiiIiIii = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5fe9\u7520\u88bf\u52ed\u752b\u720c"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u4efe\u5748\u8890\u52c8\u57b0\u757f\u7252\u4e5b\u5293\u655b\u51c0\u4f00\u65cd\u620d\u8fc0\u8859\u5383\u51bb5\u59c5\u7336\u4efa\u301a\u5c52\u9ed7\u3016\u72b0"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiiiiIIiIi = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5fe9\u7520\u9a7b\u6748\u752b\u720c"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u903f\u5156\u657c\u51e7\u4f20\u9a74\u6750\u7682\u7508\u7225"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiIIiIIIi = this.iiiIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5324\u986b\u65b3\u66b6\u5039"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u674d\u52ba\u562f\u537d\u983f\u65ed\u66df\u505a\u652c\u51b7"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IiiIiIiiIi = this.iiiIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u4f3a\u753c\u722c\u54d5\u65b3\u66b6\u5039"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u4f3f\u7533\u722e\u54dd\u65b6\u4e16\u8f86\u884a\u652c\u51b7"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiiiIii = this.iiiIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u6c71\u6662\u510c\u73bb\u65b3\u66b6\u5039"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u6c21\u6638\u5109\u73b4\u6579\u7f72\u65b6\u4e16\u8f86\u884a\u652c\u51b7"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIIiiiiIi = this.iiiIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u0011D\u0016\u5438\u6b00"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u5c7d\u8bee\u5c66\u6500\u51bb\u5eed\u8fca\u4e40\u674d\u52ba\u562f<\u0014K\u000e&\u541b\u6b29"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiiiiIiIiI = this.iiiIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u81af\u5b8e\u4e0c\u5ec2\u8fba"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u4f44\u7568\u81f1\u5b8f\u4e07\u5eb6\u8fc4\u804b\u9742\u53df\u7253\u51ea\u5372\u65e1\u95b8"))).defaultValue((Object)(5 >> 3))).build());
        this.iiiIiiIIII = this.iiiIiIiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u652f\u51be\u5ec2\u8fba"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u657b\u51e0\u5b8b\u4f1d\u76c4\u9004\u5ee1\uff14\u4ea5\u5220\u4e67\u5353\u4f5a\uff45"))).defaultValue((Object)13)).min(2 & 5).sliderMax(60).visible(() -> this.IiiiiIiIiI.get())).build());
        this.IIIIiiIiii = this.iiiIiIiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5213\u6327\u5ec2\u8fba"))).description(iiiIIIiiiI.ALLATORIxDEMO("\u523c\u6302\u5fd0\u6337\u6814\u541b\u7b07\u5fc5\u5901\u5c56\u5227\u620d\u80e6\u6566\u51fd\u5b89\u4f1f"))).defaultValue((Object)(5 >> 3))).min(3 & 4).sliderMax(10).build());
        iIIIIIIIIi iIIIIIIIIi3 = this;
        iIIIIIIIIi iIIIIIIIIi4 = this;
        iIIIIIIIIi3.iIIiiIiIiI = new ArrayList<class_1297>();
        iIIIIIIIIi3.iIIIIIiiII = 3 ^ 3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIiiIIiii.ALLATORIxDEMO("c\u000e\u0016CG\u000040d!u1qd4\u8bb2\u66e0\u65f5\u5224\u6745\u65a4\u720d\u6718\uff64"));
        }
    }

    private /* synthetic */ boolean iiiiIIIiII() {
        return 5 >> 3;
    }

    public void onDeactivate() {
        this.iIIiiIiIiI.clear();
        this.iIIiIiiiIi = 3 ^ 3;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIIIIIIIIi iIIIIIIIIi2;
        class_1297 iIiIiIIIII3;
        iIIIIIIIIi iIIIIIIIIi3 = object;
        if (!((class_310)iIIIIIIIIi3.iIIiiIiIiI).field_1724.method_5805() || PlayerUtils.getGameMode() == class_1934.field_9219) {
            return;
        }
        if (((Boolean)iIIIIIIIIi3.IiiIiIiiIi.get()).booleanValue() && (((class_310)iIIIIIIIIi3.iIIiiIiIiI).field_1761.method_2923() || ((class_310)iIIIIIIIIi3.iIIiiIiIiI).field_1724.method_6115())) {
            return;
        }
        if (((Boolean)iIIIIIIIIi3.iIIiIiiiII.get()).booleanValue() && !((class_310)iIIIIIIIIi3.iIIiiIiIiI).field_1690.field_1886.method_1434()) {
            return;
        }
        if (TickRate.INSTANCE.getTimeSinceLastTick() >= 1.0f && ((Boolean)iIIIIIIIIi3.iIiIIiIIIi.get()).booleanValue()) {
            return;
        }
        if (((Boolean)iIIIIIIIIi3.iIIiiiiIii.get()).booleanValue() && ((CrystalAura)Modules.get().get(CrystalAura.class)).isActive() && ((CrystalAura)Modules.get().get(CrystalAura.class)).kaTimer > 0) {
            return;
        }
        if (((Boolean)iIIIIIIIIi3.iIIiiIIIIi.get()).booleanValue()) {
            iIiIiIIIII3 = ((class_310)iIIIIIIIIi3.iIIiiIiIiI).field_1692;
            if (iIiIiIIIII3 == null) {
                return;
            }
            if (!iIIIIIIIIi3.ALLATORIxDEMO(iIiIiIIIII3)) {
                return;
            }
            iIIIIIIIIi iIIIIIIIIi4 = iIIIIIIIIi3;
            iIIIIIIIIi2 = iIIIIIIIIi4;
            iIIIIIIIIi4.iIIiiIiIiI.clear();
            iIIIIIIIIi4.iIIiiIiIiI.add(((class_310)iIIIIIIIIi3.iIIiiIiIiI).field_1692);
        } else {
            iIIIIIIIIi iIIIIIIIIi5 = iIIIIIIIIi3;
            iIIIIIIIIi5.iIIiiIiIiI.clear();
            TargetUtils.getList(iIIIIIIIIi5.iIIiiIiIiI, class_12972 -> {
                class_1309 class_13092;
                iIIIIIIIIi iIIIIIIIIi2 = iIIIIIIIIi3;
                iIIIIIIIIi iIIIIIIIIi3 = class_12972;
                iIIIIIIIIi iIiIiIIIII2 = iIIIIIIIIi2;
                if (iIIIIIIIIi3.equals(((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724)) return false;
                if (iIIIIIIIIi3.equals(((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1719)) {
                    return false;
                }
                if (iIIIIIIIIi3 instanceof class_1309) {
                    class_13092 = (class_1309)iIIIIIIIIi3;
                    if (class_13092.method_29504()) return false;
                }
                if (!iIIIIIIIIi3.method_5805()) {
                    return false;
                }
                class_13092 = iIIIIIIIIi3.method_5829();
                if (!PlayerUtils.isWithin((double)class_3532.method_15350((double)((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_23317(), (double)class_13092.field_1323, (double)class_13092.field_1320), (double)class_3532.method_15350((double)((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_23318(), (double)class_13092.field_1322, (double)class_13092.field_1325), (double)class_3532.method_15350((double)((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_23321(), (double)class_13092.field_1321, (double)class_13092.field_1324), (double)((Double)iIiIiIIIII2.iiIiIIiiii.get()))) {
                    return (2 & 5) != 0;
                }
                if (!((Set)iIiIiIIIII2.iIiIiiiiII.get()).contains(iIIIIIIIIi3.method_5864())) {
                    return 5 >> 3;
                }
                if (((Boolean)iIiIiIIIII2.iIIIIIIiII.get()).booleanValue() && iIIIIIIIIi3.method_16914()) {
                    return (3 & 4) != 0;
                }
                if (!PlayerUtils.canSeeEntity((class_1297)iIIIIIIIIi3) && !PlayerUtils.isWithin((class_1297)iIIIIIIIIi3, (double)((Double)iIiIiIIIII2.iiiiIiiIIi.get()))) {
                    return 5 >> 3;
                }
                if (((Boolean)iIiIiIIIII2.iiiiiIIiIi.get()).booleanValue()) {
                    // empty if block
                }
                if (((Boolean)iIiIiIIIII2.iIiiiIiIii.get()).booleanValue()) {
                    if (iIIIIIIIIi3 instanceof class_1560 && !(class_13092 = (class_1560)iIIIIIIIIi3).method_7028()) {
                        return 3 >> 2;
                    }
                    if (iIIIIIIIIi3 instanceof class_1590 && !(class_13092 = (class_1590)iIIIIIIIIi3).method_6510()) {
                        return 5 >> 3;
                    }
                    if (iIIIIIIIIi3 instanceof class_1493 && !(class_13092 = (class_1493)iIIIIIIIIi3).method_6510()) {
                        return (3 & 4) != 0;
                    }
                }
                if (iIIIIIIIIi3 instanceof class_1657) {
                    class_13092 = (class_1657)iIIIIIIIIi3;
                    if (class_13092.method_68878()) {
                        return 5 >> 3;
                    }
                    if (!Friends.get().shouldAttack((class_1657)class_13092)) {
                        return 3 >> 2;
                    }
                }
                if (!(iIIIIIIIIi3 instanceof class_1429)) return true;
                class_13092 = (class_1429)iIIIIIIIIi3;
                switch (((KillAuraMiku.EntityAge)((Object)((Object)iIiIiIIIII2.iiiIIiIIii.get()))).ordinal()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case 0: {
                        return class_13092.method_6109();
                    }
                    case 1: {
                        if (class_13092.method_6109()) return false;
                        return (2 ^ 3) != 0;
                    }
                    case 2: 
                }
                return true;
            }, (SortPriority)((SortPriority)iIIIIIIIIi3.IiIiIiIIii.get()), (int)((Integer)iIIIIIIIIi3.iIiiiiIIII.get()));
            iIIIIIIIIi2 = iIIIIIIIIi3;
        }
        if (iIIIIIIIIi2.iIIiiIiIiI.isEmpty()) {
            iIIIIIIIIi3.iIIiIiiiIi = 5 >> 3;
            if (iIIIIIIIIi3.iIIIIIiiII) {
                PathManagers.get().resume();
                iIIIIIIIIi3.iIIIIIiiII = 3 >> 2;
            }
            return;
        }
        iIiIiIIIII3 = iIIIIIIIIi3.iIIiiIiIiI.getFirst();
        if (((Boolean)iIIIIIIIIi3.IiiIIiIIiI.get()).booleanValue()) {
            FindItemResult findItemResult;
            Predicate<class_1799> predicate;
            switch (((KillAuraMiku.Weapon)((Object)iIIIIIIIIi3.iIIiIiiIiI.get())).ordinal()) {
                case 1: {
                    predicate = iIiIiIIIII2 -> iIiIiIIIII2.method_7909() instanceof class_1743;
                    break;
                }
                case 0: {
                    predicate = iIiIiIIIII2 -> IiIiiIIIiI.iiIIiIIiii(iIiIiIIIII2.method_7909());
                    while (false) {
                    }
                    break;
                }
                case 2: {
                    predicate = iIiIiIIIII2 -> iIiIiIIIII2.method_7909() instanceof class_9362;
                    break;
                }
                case 3: {
                    predicate = iIiIiIIIII2 -> iIiIiIIIII2.method_7909() instanceof class_1835;
                    break;
                }
                case 4: {
                    predicate = iIiIiIIIII2 -> {
                        if (iIiIiIIIII2.method_7909() instanceof class_1743 || IiIiiIIIiI.iiIIiIIiii(iIiIiIIIII2.method_7909()) || iIiIiIIIII2.method_7909() instanceof class_9362 || iIiIiIIIII2.method_7909() instanceof class_1835) {
                            return true;
                        }
                        return false;
                    };
                    break;
                }
                default: {
                    predicate = class_17992 -> --1 != 0;
                }
            }
            Object object = predicate;
            object = InvUtils.findInHotbar((Predicate)object);
            if (iIIIIIIIIi3.iiiiIIIiII() && (findItemResult = InvUtils.findInHotbar(iIiIiIIIII2 -> iIiIiIIIII2.method_7909() instanceof class_1743)).found()) {
                object = findItemResult;
            }
            InvUtils.swap((int)object.slot(), (boolean)(5 >> 3));
        }
        if (!iIIIIIIIIi3.iiiIiIiiIi()) {
            return;
        }
        iIIIIIIIIi3.iIIiIiiiIi = 5 >> 2;
        if (iIIIIIIIIi3.iIiIiIIIII.get() == KillAuraMiku.RotationMode.iiiiiIIiIi) {
            Rotations.rotate((double)Rotations.getYaw((class_1297)iIiIiIIIII3), (double)Rotations.getPitch((class_1297)iIiIiIIIII3, (Target)Target.Body));
        }
        if (((Boolean)iIIIIIIIIi3.IIiIiIIiii.get()).booleanValue() && PathManagers.get().isPathing() && !iIIIIIIIIi3.iIIIIIiiII) {
            PathManagers.get().pause();
            iIIIIIIIIi3.iIIIIIiiII = 3 & 5;
        }
        if (iIIIIIIIIi3.iiIIiIIiii()) {
            iIIIIIIIIi3.iIIiiIiIiI.forEach(class_12972 -> {
                iIIIIIIIIi iIIIIIIIIi2 = iIIIIIIIIi3;
                iIIIIIIIIi iIIIIIIIIi3 = class_12972;
                iIIIIIIIIi iIiIiIIIII2 = iIIIIIIIIi2;
                if (((Boolean)iIiIiIIIII2.ALLATORIxDEMO.get()).booleanValue()) {
                    if (((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_5715()) {
                        iIiiiIIiIi.iiiIiIiiIi();
                    }
                    if (((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_5624()) {
                        iIiIiIIIII2.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2848((class_1297)((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724, class_2848.class_2849.field_12985));
                    }
                }
                iIIIIIIIIi iIIIIIIIIi4 = iIIIIIIIIi3;
                Object object = iIIIIIIIIi4.method_19538();
                class_243 class_2433 = object.method_1031(0.0, (double)(iIIIIIIIIi3.method_17682() / 2.0f), 0.0);
                class_243 class_2434 = iIIIIIIIIi4.method_33571();
                class_243[] class_243Array = new class_243[--3];
                class_243Array[5 >> 3] = object;
                class_243Array[3 >> 1] = class_2433;
                class_243Array[--2] = class_2434;
                object = Stream.of(class_243Array).min(Comparator.comparing(class_2432 -> {
                    iIIIIIIIIi iIIIIIIIIi2 = iIIIIIIIIi3;
                    iIIIIIIIIi iIIIIIIIIi3 = class_2432;
                    iIIIIIIIIi iIiIiIIIII2 = iIIIIIIIIi2;
                    return ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_33571().method_1025((class_243)iIIIIIIIIi3);
                })).orElse(class_2434);
                object = new IiIiiiIIIi((class_243)object).iiiIiIiiIi(0x6A & 0x1F);
                new IiIiiiIIIi((float)Rotations.getYaw((class_1297)iIIIIIIIIi3), (float)Rotations.getPitch((class_1297)iIIIIIIIIi3, (Target)Target.Body));
                iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO((IiIiiiIIIi)object);
                iIIIIIIIIi iIIIIIIIIi5 = iIiIiIIIII2;
                ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1761.method_2918((class_1657)((class_310)iIIIIIIIIi5.iIIiiIiIiI).field_1724, (class_1297)iIIIIIIIIi3);
                ((class_310)iIIIIIIIIi5.iIIiiIiIiI).field_1724.method_6104(class_1268.field_5808);
                iIIIIIIIIi iIIIIIIIIi6 = iIiIiIIIII2;
                if (((Boolean)iIiIiIIIII2.IIiIiiiiII.get()).booleanValue()) {
                    iIIIIIIIIi6.iIIiiIiIiI.method_1562().method_52787((class_2596)class_2824.method_34206((class_1297)iIIIIIIIIi3, (boolean)((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_5715()));
                    iIIIIIIIIi iIIIIIIIIi7 = iIiIiIIIII2;
                    v6 = iIIIIIIIIi7;
                    ((class_310)iIIIIIIIIi7.iIIiiIiIiI).field_1724.method_6104(class_1268.field_5808);
                } else {
                    ((class_310)iIIIIIIIIi6.iIIiiIiIiI).field_1761.method_2918((class_1657)((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724, (class_1297)iIIIIIIIIi3);
                    iIIIIIIIIi iIIIIIIIIi8 = iIiIiIIIII2;
                    v6 = iIIIIIIIIi8;
                    ((class_310)iIIIIIIIIi8.iIIiiIiIiI).field_1724.method_6104(class_1268.field_5808);
                }
                v6.IIiiiiIIii = 0;
                if (iIiIiIIIII2.iIiIiIIIII.get() == KillAuraMiku.RotationMode.iIIiIiiiIi) {
                    iiIIIIiiiI.ALLATORIxDEMO().ALLATORIxDEMO();
                }
            });
        }
    }

    private /* synthetic */ boolean iiIIiIIiii() {
        iIIIIIIIIi iIIIIIIIIi2 = this;
        if (iIIIIIIIIi2.iIIIIiiiii > 0) {
            iIIIIIIIIi2.iIIIIiiiii -= 4 ^ 5;
            return (3 & 4) != 0;
        }
        float f = this = (Boolean)iIIIIIIIIi2.IiiiiIiIiI.get() != false ? (float)((Integer)iIIIIIIIIi2.iiiIiiIIII.get()).intValue() : 0.5f;
        if (((Boolean)iIIIIIIIIi2.iIIIiiiiIi.get()).booleanValue()) {
            this /= TickRate.INSTANCE.getTickRate() / 20.0f;
        }
        if (((Boolean)iIIIIIIIIi2.IiiiiIiIiI.get()).booleanValue()) {
            if ((float)iIIIIIIIIi2.IIiiiiIIii < this) {
                iIIIIIIIIi2.IIiiiiIIii += 4 ^ 5;
                return (3 & 4) != 0;
            }
            return true;
        }
        if (((class_310)iIIIIIIIIi2.iIIiiIiIiI).field_1724.method_7261(this) >= 1.0f) {
            return 5 >> 2;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Send send) {
        iIIIIIIIIi iIIIIIIIIi2 = iIIIIIIIIi3;
        iIIIIIIIIi iIIIIIIIIi3 = send;
        iIIIIIIIIi iIiIiIIIII2 = iIIIIIIIIi2;
        if (((PacketEvent.Send)iIIIIIIIIi3).packet instanceof class_2868) {
            iIiIiIIIII2.iIIIIiiiii = (Integer)iIiIiIIIII2.IIIIiiIiii.get();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean iiiIiIiiIi() {
        iIIIIIIIIi iIIIIIIIIi2;
        iIIIIIIIIi iIIIIIIIIi3 = iIIIIIIIIi2 = iIIIIIIIIi4;
        iIIIIIIIIi iIIIIIIIIi4 = ((class_310)iIIIIIIIIi3.iIIiiIiIiI).field_1724.method_6047().method_7909();
        if (iIIIIIIIIi3.iiiiIIIiII()) {
            return iIIIIIIIIi4 instanceof class_1743;
        }
        switch (((KillAuraMiku.Weapon)((Object)iIIIIIIIIi2.iIIiIiiIiI.get())).ordinal()) {
            case 1: {
                return iIIIIIIIIi4 instanceof class_1743;
            }
            case 0: {
                return IiIiiIIIiI.iiIIiIIiii((class_1792)iIIIIIIIIi4);
            }
            case 2: {
                return iIIIIIIIIi4 instanceof class_9362;
            }
            case 3: {
                return iIIIIIIIIi4 instanceof class_1835;
            }
            case 4: {
                if (iIIIIIIIIi4 instanceof class_1743) return true;
                if (IiIiiIIIiI.iiIIiIIiii((class_1792)iIIIIIIIIi4)) return true;
                if (iIIIIIIIIi4 instanceof class_9362) return true;
                if (!(iIIIIIIIIi4 instanceof class_1835)) return false;
                return true;
            }
        }
        return true;
    }

    public class_1297 ALLATORIxDEMO() {
        if (!this.iIIiiIiIiI.isEmpty()) {
            return this.iIIiiIiIiI.getFirst();
        }
        return null;
    }
}

