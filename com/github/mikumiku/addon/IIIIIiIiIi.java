/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  meteordevelopment.meteorclient.events.entity.EntityAddedEvent
 *  meteordevelopment.meteorclient.events.entity.EntityRemovedEvent
 *  meteordevelopment.meteorclient.events.game.ReceiveMessageEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BlockPosSetting$Builder
 *  meteordevelopment.meteorclient.settings.BlockSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorListSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnchantmentListSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemSetting$Builder
 *  meteordevelopment.meteorclient.settings.KeybindSetting$Builder
 *  meteordevelopment.meteorclient.settings.PacketListSetting$Builder
 *  meteordevelopment.meteorclient.settings.ParticleTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.PotionSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.SoundEventListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StatusEffectListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StorageBlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StringListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.settings.Vector3dSetting$Builder
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.meteorclient.utils.misc.Keybind
 *  meteordevelopment.meteorclient.utils.misc.MyPotion
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_10938
 *  net.minecraft.class_10938$class_10939
 *  net.minecraft.class_1268
 *  net.minecraft.class_1291
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1713
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_1887
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2396
 *  net.minecraft.class_2398
 *  net.minecraft.class_243
 *  net.minecraft.class_2591
 *  net.minecraft.class_2596
 *  net.minecraft.class_2811
 *  net.minecraft.class_2813
 *  net.minecraft.class_2815
 *  net.minecraft.class_2828
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_2879
 *  net.minecraft.class_2885
 *  net.minecraft.class_310
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3965
 *  net.minecraft.class_5321
 *  net.minecraft.class_8875
 *  org.joml.Vector3d
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiiiiii;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiiIiIiiiI;
import com.github.mikumiku.addon.iIIIiIiiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIIiIiII;
import com.github.mikumiku.addon.iiIIiIiiii;
import com.github.mikumiku.addon.util.DebugModule;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import meteordevelopment.meteorclient.events.entity.EntityAddedEvent;
import meteordevelopment.meteorclient.events.entity.EntityRemovedEvent;
import meteordevelopment.meteorclient.events.game.ReceiveMessageEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BlockPosSetting;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorListSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnchantmentListSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.ItemSetting;
import meteordevelopment.meteorclient.settings.KeybindSetting;
import meteordevelopment.meteorclient.settings.PacketListSetting;
import meteordevelopment.meteorclient.settings.ParticleTypeListSetting;
import meteordevelopment.meteorclient.settings.PotionSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.SoundEventListSetting;
import meteordevelopment.meteorclient.settings.StatusEffectListSetting;
import meteordevelopment.meteorclient.settings.StorageBlockListSetting;
import meteordevelopment.meteorclient.settings.StringListSetting;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.settings.Vector3dSetting;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.utils.misc.Keybind;
import meteordevelopment.meteorclient.utils.misc.MyPotion;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_10938;
import net.minecraft.class_1268;
import net.minecraft.class_1291;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2396;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_2591;
import net.minecraft.class_2596;
import net.minecraft.class_2811;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3965;
import net.minecraft.class_5321;
import net.minecraft.class_8875;
import org.joml.Vector3d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiIiIi
extends iIiIiIIIii {
    private int IIIIiiiiiI;
    private final Setting<Set<Class<? extends class_2596<?>>>> iIIiiIIiii;
    private final Setting<Integer> IIIiIiiIii;
    private final Setting<Set<class_5321<class_1887>>> iiIIiiiIII;
    private final List<class_1297> IiIiiIIiIi;
    private final Setting<List<SettingColor>> IIiIiIiiii;
    private final SettingGroup iiIIiiIIii;
    private final Setting<class_1792> IIIiiIiiII;
    private final Setting<String> iIIIIIiIIi;
    private int iIIIIiIIiI;
    private final Setting<Vector3d> iIIIIIiIii;
    private final Setting<Map<String, List<class_1792>>> IiIIiiiiIi;
    private final Setting<List<class_2396<?>>> IiiIIiIiii;
    private final Setting<Boolean> IiiIiIiIIi;
    private final Setting<Map<String, String>> iiIiiiiIii;
    private final Setting<class_2338> IIIiiiIiIi;
    private final Setting<List<String>> iIIiIiiiII;
    private final SettingGroup iiiiIiiIIi;
    private final SettingGroup iiiIIiIIii;
    private final Setting<SettingColor> IiiIIiIIiI;
    private final Setting<DebugModule.TestEnum> iIIIIiiiii;
    private final Setting<Set<Class<? extends class_2596<?>>>> IiIiIiIIii;
    private final SettingGroup iiiIiIiiII;
    private final SettingGroup IIiiiiIIii;
    private final Setting<Boolean> IiiiiIIiII;
    private final DecimalFormat iIIIIIiiII;
    private final Setting<Boolean> iIIiiiiIii;
    private final Setting<MyPotion> iiIIIiIIIi;
    private final Setting<Set<class_1299<?>>> iIiiiiIIII;
    private final Setting<Double> iiIiIIiiii;
    private final Setting<Integer> iIIiIiiIiI;
    private final Setting<List<class_2338>> iIIIIIIiII;
    private final Setting<String> iIIiiIIIIi;
    private final Setting<Boolean> IiiiiIiIiI;
    private final SettingGroup iiiIiIIiii;
    private final SettingGroup iIIIiiiiIi;
    private final class_310 iIIiiIiIiI;
    private final Setting<List<class_1792>> iiiIiiIIII;
    private final Setting<List<class_1291>> iIiIIiIIIi;
    private final Setting<List<class_3414>> IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<String> iIiiiIiIii;
    private int iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    public final Setting<Boolean> IiiIiIiiIi;
    private int IIiIiIIiii;
    private final Setting<Double> iIIiiIiIiI;
    private final Setting<List<class_2591<?>>> iiiiiIIiIi;
    private final Setting<Keybind> iIIiIiiiIi;
    private final Setting<List<class_2248>> iIiIiIIIII;
    private final Setting<class_2248> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(EntityAddedEvent object) {
        IIIIIiIiIi iIIIIiIiIi = iIIIIiIiIi2;
        IIIIIiIiIi iIIIIiIiIi2 = object;
        object = iIIIIiIiIi;
    }

    public IIIIIiIiIi() {
        IIIIIiIiIi iIIIIiIiIi = this;
        super((Category)iiiiiIIiIi, IiiIiIiiiI.ALLATORIxDEMO("\u0001X:\u0002u"), iiIIIiIiII.ALLATORIxDEMO("\u5957\u52e2\u8090\u8c5e\u8b98\u6a5c\u573a"));
        iIIIIiIiIi.iiiiIiiIIi = iIIIIiIiIi.settings.getDefaultGroup();
        iIIIIiIiIi.iiiIiIIiii = iIIIIiIiIi.settings.createGroup(IiiIiIiiiI.ALLATORIxDEMO("\u6603\u7962\u8bc9\u7f7c"));
        iIIIIiIiIi.iIIIiiiiIi = iIIIIiIiIi.settings.createGroup(iiIIIiIiII.ALLATORIxDEMO("\u8fa0\u8e67\u8bc3\u7f03"));
        iIIIIiIiIi.iiiIiIiiII = iIIIIiIiIi.settings.createGroup(IiiIiIiiiI.ALLATORIxDEMO("\u601a\u80a5\u76a6\u63b5"));
        iIIIIiIiIi.iiiIIiIIii = iIIIIiIiIi.settings.createGroup(iiIIIiIiII.ALLATORIxDEMO("\u8be3\u7f23\u5c28\u7957"));
        iIIIIiIiIi.IiiIiIiiIi = iIIIIiIiIi.iiiiIiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u626e\u5328\u5ee4\u5b4a"))).description(iiIIIiIiII.ALLATORIxDEMO("\u620e\u533d\u5eee\u5b35"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iiIiiiiIii = this.iiiIiIIiii.add((Setting)((iiIIiIiiii)((Object)((iiIIiIiiii)((Object)new iiIIiIiiii().name(IiiIiIiiiI.ALLATORIxDEMO("\u0015\u0016b")))).description(iiIIIiIiII.ALLATORIxDEMO("\u0000\u001c\u001d")))).ALLATORIxDEMO());
        this.IiIIiiiiIi = this.iiiIiIIiii.add((Setting)((IIIIiiiiii)((Object)((IIIIiiiiii)((Object)new IIIIiiiiii().name(IiiIiIiiiI.ALLATORIxDEMO("i1e\bl,\u0006dm$W\u0011E1I1\u0019u")))).description(iiIIIiIiII.ALLATORIxDEMO("\u001498 \u0011$.90\f-\u001e\u0018\u0019)$\u0013\n")))).ALLATORIxDEMO());
        this.iIIIIIIiII = this.iiiIiIIiii.add((Setting)((iIIIiIiiii)((Object)((iIIIiIiiii)((Object)new iIIIiIiiii().name(IiiIiIiiiI.ALLATORIxDEMO("'L*c\u000ep*\u0006\\I6S\u0011E1I1\u0019u")))).description(iiIIIiIiII.ALLATORIxDEMO("\u000f1\">&\r\".\u0001\u0014\u001e)\u001e\u0018\u0019)$\u0013\n")))).ALLATORIxDEMO());
        this.IIIIiiIiii = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("RO*K\u0011E1I1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u5e4e\u5c69\u5051\u8be3\u7f23\u7947\u4fe6"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiIiiIiI = this.iiiIIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("i+S\u0011E1I1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u6509\u651d\u8be3\u7f23\u7947\u4fe6"))).defaultValue((Object)(0x2A & 0x7F))).min(3 & 4).max(0x67 & 0x7C).sliderMin(3 ^ 3).sliderMax(0x76 & 0x6D).build());
        this.iIIiiIiIiI = this.iiiIIiIIii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u0001\u001aeB)B\u0011E1I1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u53b1\u7cd3\u5efb\u6d23\u70c4\u651d\u8be3\u7f23\u7947\u4fe6"))).defaultValue(3.14).min(0.0).max(10.0).sliderMin(0.0).sliderMax(10.0).build());
        this.iIIIIIiIIi = this.iiiIIiIIii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u0016\u0001bI+@\u0011E1I1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u5b1a\u7b5b\u4e5f\u8be3\u7f23\u7947\u4fe6"))).defaultValue((Object)IiiIiIiiiI.ALLATORIxDEMO("\r\u0010|L*\u000bbw*O4\u00133"))).build());
        this.ALLATORIxDEMO = this.iiiIIiIIii.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u001f!\u0012\u000e6\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u6599\u5712\u8b83\u7f36\u794d\u4f99"))).defaultValue((Object)class_2246.field_10201)).build());
        this.IIIiiIiiII = this.iiiIIiIIii.add((Setting)((ItemSetting.Builder)((ItemSetting.Builder)((ItemSetting.Builder)new ItemSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u0004\t\b0\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u7249\u5484\u8b83\u7f36\u794d\u4f99"))).defaultValue((Object)class_1802.field_8802)).build());
        this.iIiIiIIIII = this.iiiIIiIIii.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u001f!2.6\u0001\u0014\u001e)\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u659e\u5715\u5237\u882d\u8b83\u7f36\u794d\u4f99"))).defaultValue(List.of(class_2246.field_10201, class_2246.field_10234, class_2246.field_10205))).build());
        this.iiiIiiIIII = this.iiiIIiIIii.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u0004)(0\u0001\u0014\u001e)\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u724e\u5483\u5237\u882d\u8b83\u7f36\u794d\u4f99"))).defaultValue(List.of(class_1802.field_8802, class_1802.field_8377, class_1802.field_8250))).build());
        int n = 5 >> 3;
        this.IIIiiiIiIi = this.iiiIIiIIii.add((Setting)((BlockPosSetting.Builder)((BlockPosSetting.Builder)((BlockPosSetting.Builder)new BlockPosSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u000f1\">&-\u0002.\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u659e\u5715\u4f6d\u7f2b\u8b83\u7f36\u794d\u4f99"))).defaultValue((Object)new class_2338(n, 0x50 & 0x6F, n))).build());
        this.iIIIIIiIii = this.iiiIIiIIii.add((Setting)((Vector3dSetting.Builder)((Vector3dSetting.Builder)new Vector3dSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u001b8.)\"\u000f^9\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u4e2e\u7eb6\u5431\u918a\u8b83\u7f36\u794d\u4f99"))).build());
        this.iIIIIiiiii = this.iiiIIiIIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\b\u0013\u00180\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u67ba\u4e7b\u8b83\u7f36\u794d\u4f99"))).defaultValue((Object)DebugModule.TestEnum.iIIiiIiIiI)).build());
        this.IiiIIiIIiI = this.iiiIIiIIii.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u001e\"\u0011\u0002/\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u98bc\u8237\u8b83\u7f36\u794d\u4f99"))).build());
        this.IIiIiIiiii = this.iiiIIiIIii.add((Setting)((ColorListSetting.Builder)((ColorListSetting.Builder)new ColorListSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u001e\"1\"/\u0001\u0014\u001e)\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u98bb\u8230\u5237\u882d\u8b83\u7f36\u794d\u4f99"))).build());
        this.iIiiiiIIII = this.iiiIIiIIii.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("o3949$\u0019$=8\u0001\u0014\u001e)\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u5bbe\u4f16\u7c5c\u57c9\u5237\u882d\u8b83\u7f36\u794d\u4f99"))).build());
        this.iIiIIiIIIi = this.iiiIIiIIii.add((Setting)((StatusEffectListSetting.Builder)((StatusEffectListSetting.Builder)new StatusEffectListSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("9NK)8.\b;+8.)\u0001\u0014\u001e)\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u7296\u6044\u656f\u67de\u5237\u882d\u8b83\u7f36\u794d\u4f99"))).build());
        this.IiiIIiIiii = this.iiiIIiIIii.add((Setting)((ParticleTypeListSetting.Builder)((ParticleTypeListSetting.Builder)((ParticleTypeListSetting.Builder)new ParticleTypeListSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO(":[X)$>!8\u0019$=8\u0001\u0014\u001e)\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u7cb2\u5b15\u7c5c\u57c9\u5237\u882d\u8b83\u7f36\u794d\u4f99"))).defaultValue(List.of(class_2398.field_11240, class_2398.field_11251, class_2398.field_11236))).build());
        this.IIiIiiiiII = this.iiiIIiIIii.add((Setting)((SoundEventListSetting.Builder)((SoundEventListSetting.Builder)((SoundEventListSetting.Builder)new SoundEventListSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("y283)\u0018;8#)\u0001\u0014\u001e)\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u58d0\u97b6\u4eac\u4eb4\u5237\u882d\u8b83\u7f36\u794d\u4f99"))).defaultValue(List.of(class_3417.field_14709, class_3417.field_14559))).build());
        this.iIIiIiiiII = this.iiiIIiIIii.add((Setting)((StringListSetting.Builder)((StringListSetting.Builder)((StringListSetting.Builder)new StringListSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u001e)?4#:\u0001\u0014\u001e)\u001e\u0018\u0019)$\u0013\n"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u5b12\u7b01\u4e70\u5237\u882d\u8b83\u7f36\u794d\u4f99"))).defaultValue(List.of(iiIIIiIiII.ALLATORIxDEMO("\u7977\u4ff6\\"), IiiIiIiiiI.ALLATORIxDEMO("\u7962\u4ffc "), iiIIIiIiII.ALLATORIxDEMO("\u7977\u4ff6^")))).build());
        this.iiIIiiiIII = this.iiiIIiIIii.add((Setting)((EnchantmentListSetting.Builder)((EnchantmentListSetting.Builder)new EnchantmentListSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("e+c\rA+t\bE+\u0001\\I6S\u0011E1I1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u9619\u9b19\u526a\u8805\u8be3\u7f23\u7947\u4fe6"))).build());
        this.iIIiIiiiIi = this.iiiIIiIIii.add((Setting)((KeybindSetting.Builder)((KeybindSetting.Builder)new KeybindSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("k \frI+C\u0011E1I1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u9573\u4f00\u7eac\u5bf7\u8be3\u7f23\u7947\u4fe6"))).build());
        this.iiIIIiIIIi = this.iiiIIiIIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new PotionSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u0015\u001adI*I\u0011E1I1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u8312\u6c59\u8be3\u7f23\u7947\u4fe6"))).defaultValue((Object)MyPotion.RegenerationLong)).build());
        this.iiiiiIIiIi = this.iiiIIiIIii.add((Setting)((StorageBlockListSetting.Builder)((StorageBlockListSetting.Builder)new StorageBlockListSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("6T*r\u0004G B\tO&\u001e\\I6S\u0011E1I1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u5b25\u50c5\u65e4\u571a\u526a\u8805\u8be3\u7f23\u7947\u4fe6"))).build());
        this.IiIiIiIIii = this.iiiIIiIIii.add((Setting)((PacketListSetting.Builder)((PacketListSetting.Builder)((PacketListSetting.Builder)new PacketListSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u0015a\u0006K \u0001\\I6S\u0011E1I1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u651d\u6333\u5348\u526a\u8805\u8be3\u7f23\u7947\u4fe6"))).defaultValue(Set.of(class_2828.class))).build());
        this.IiiiiIiIiI = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u0006o\u000bD,\u0001yO+F.t*Z?\u001bw"))).description(iiIIIiIiII.ALLATORIxDEMO("\u673c\u4ebb\u5f7d\u511e"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIIiiIIIIi = this.iiiIIiIIii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u0006o\u000bD,\u0001yO+F.s1O1\u0019u"))).description(iiIIIiIiII.ALLATORIxDEMO("\u538a\u6779\u5f338\u0004\u0014\u000eS^4\"3,1\u00192*:!\u0018\u4e57)?\b\b\u65ab\u6200\u5392\u89ac"))).defaultValue((Object)IiiIiIiiiI.ALLATORIxDEMO("\u6746\u4eb4\u53cf\u8984\u76b9\u5b0f\u7b51\u4e20"))).visible(() -> (Boolean)this.IiiiiIiIiI.get())).build());
        IIIIIiIiIi iIIIIiIiIi2 = this;
        iIIIIiIiIi2.iiIIiiIIii = iIIIIiIiIi2.iiiIIiIIii;
        iIIIIiIiIi2.IIiiiiIIii = iIIIIiIiIi2.iiiIIiIIii;
        iIIIIiIiIi2.IiiiiIIiII = iIIIIiIiIi2.iiIIiiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u9a85\u7eea\u6a5c\u5f62"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u540f\u756d\u9ae5\u7eff\u52e8\u80ef"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iiIiIIiiii = this.iiIIiiIIii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u7ce3\u5eeb\u8bc3\u7f03"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u9af8\u7ee2\u7c83\u5efe\u63d0\u5224"))).defaultValue(0.001).min(1.0E-4).max(1.0).visible(() -> (Boolean)this.IiiiiIIiII.get())).sliderMin(1.0E-4).sliderMax(0.1).build());
        this.IIiiIIIIIi = this.IIiiiiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u5bf3\u9ad1\u606a\u52e2\u8090"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u540f\u756d\u5beb\u9a9c\u6007\u52da\u80da\uff4a\u53cf\u80b8\u6734\u9896\u961e\uff1b"))).defaultValue((Object)(3 >> 2))).build());
        this.iIiiiIiIii = this.IIiiiiIIii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIIIiIiII.ALLATORIxDEMO("\u5bc3\u9ac1\u9130\u7f03"))).description(IiiIiIiiiI.ALLATORIxDEMO("\u5bb9\u9ace\u6007\u52da\u80c0\u76dc\u913a\u7f7c"))).defaultValue((Object)iiIIIiIiII.ALLATORIxDEMO("\u0006\u0010"))).visible(() -> (Boolean)this.IIiiIIIIIi.get())).build());
        this.iIIiiiiIii = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u8fb8\u8e17\u6528\u6319\u5317"))).description(iiIIIiIiII.ALLATORIxDEMO("\u8fb0\u8e57\u7f3c\u7e81\u653d\u6313\u5368"))).defaultValue((Object)(5 >> 3))).build());
        this.IiiIiIiIIi = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u667c\u791a\u6535\u6353\u535d\u8b91\u60d7"))).description(iiIIIiIiII.ALLATORIxDEMO("\u6663\u7977\u650d\u6303\u5358\u76c9\u8b9b\u7eab\u5b0a\u6bf8\u4f9c\u6002"))).defaultValue((Object)(3 >> 1))).visible(() -> (Boolean)this.iIIiiiiIii.get())).build());
        this.iIIiiIIiii = this.iIIIiiiiIi.add((Setting)((PacketListSetting.Builder)((PacketListSetting.Builder)((PacketListSetting.Builder)((PacketListSetting.Builder)new PacketListSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u6535\u6353\u535d\u7c0c\u5799"))).description(iiIIIiIiII.ALLATORIxDEMO("\u9044\u6294\u89ec\u8fa0\u8e67\u76f9\u651d\u6333\u5348\u7c06\u57e6"))).defaultValue(new LinkedHashSet())).visible(() -> (Boolean)this.iIIiiiiIii.get())).build());
        this.IIIiIiiIii = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIiIiiiI.ALLATORIxDEMO("\u6720\u5962\u6603\u7962\u9508\u5eb4"))).description(iiIIIiIiII.ALLATORIxDEMO("\u653d\u6333\u5348\u4f9c\u6002\u76d9\u674d\u595a\u6653\u7967\u5b1a\u7b5b\u651d"))).defaultValue((Object)(0x1F8D & 0x73FA))).min(0x76 & 0x6D).max(0x7E36 & 0x4FE9).sliderMin(0x6C & 0x77).sliderMax(0x673D & 0x3FD2).visible(() -> {
            if (((Boolean)this.iIIiiiiIii.get()).booleanValue() && ((Boolean)this.IiiIiIiIIi.get()).booleanValue()) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        IIIIIiIiIi iIIIIiIiIi3 = this;
        this.IIIIiiiiiI = 5 >> 3;
        IIIIIiIiIi iIIIIiIiIi4 = this;
        this.iIIIIIiiII = new DecimalFormat(IiiIiIiiiI.ALLATORIxDEMO("\u001evT1"));
        IIIIIiIiIi iIIIIiIiIi5 = this;
        this.IiIiiIIiIi = new ArrayList<class_1297>();
        this.iIIIIiIIiI = 5 >> 3;
        iIIIIiIiIi3.IIiIiIIiii = this.iIIIIiIIiI;
        iIIIIiIiIi3.iIiIiiiiII = 3 & 4;
        iIIIIiIiIi3.iIIiiIiIiI = class_310.method_1551();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIIiIiII.ALLATORIxDEMO("*\u0006_K.(}8-)<98l]\u8b9a\u66a9\u65fd\u524d\u676d\u65ed\u7205\u6751\uff6c"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(StringBuilder stringBuilder, Integer n, class_10938 class_109382) {
        void iIiIiIIIII2;
        StringBuilder iIiIiIIIII3 = class_109382;
        StringBuilder iIiIiIIIII4 = stringBuilder;
        iIiIiIIIII3 = (class_10938.class_10939)iIiIiIIIII3;
        String string = iIiIiIIIII3.comp_3876().method_55840();
        Object[] objectArray = new Object[--3];
        objectArray[3 ^ 3] = iIiIiIIIII2;
        objectArray[3 & 5] = string;
        objectArray[5 >> 1] = iIiIiIIIII3.comp_3877();
        iIiIiIIIII4.append(String.format(iiIIIiIiII.ALLATORIxDEMO("}m\u0006h\u00190}h\u000eM%h\u0019g"), objectArray));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Send send) {
        IIIIIiIiIi iIIIIiIiIi = object;
        Object object = send;
        IIIIIiIiIi iIiIiIIIII2 = iIIIIiIiIi;
        if (!((Boolean)iIiIiIIIII2.iIIiiiiIii.get()).booleanValue()) {
            return;
        }
        object = ((PacketEvent.Send)object).packet;
        Object object2 = IIIIIiIiIi.iiiIiIiiIi(object);
        if (!((Set)iIiIiIIIII2.iIIiiIIiii.get()).contains(object.getClass())) {
            return;
        }
        IIIIIiIiIi iIIIIiIiIi2 = iIiIiIIIII2;
        iIIIIiIiIi2.iIiIiiiiII += 4 ^ 5;
        iIIIIiIiIi2.iIIIIiIIiI += 3 >> 1;
        String string = IiiIiIiiiI.ALLATORIxDEMO("\u00ab\n\u53d5\u9060+]");
        Object[] objectArray = new Object[--3];
        objectArray[3 >> 2] = string;
        objectArray[3 >> 1] = object2;
        objectArray[1 ^ 3] = iIiIiIIIII2.iIIIIiIIiI;
        object2 = String.format(iiIIIiIiII.ALLATORIxDEMO("\u00cd_q\u652d\u6323\u5358mx>\u0000m\u00fa+X\u001e}\u00eaJE~h\u0019D"), objectArray);
        if (((Boolean)iIiIiIIIII2.IiiIiIiIIi.get()).booleanValue() && !((String)(object = iIiIiIIIII2.ALLATORIxDEMO((class_2596<?>)object))).isEmpty()) {
            IIIIIiIiIi iIIIIiIiIi3 = iIiIiIIIII2;
            object = iIIIIiIiIi3.ALLATORIxDEMO((String)object, (Integer)iIIIIiIiIi3.IIIiIiiIii.get());
            object2 = (String)object2 + "\n\u00a77" + ((String)object).replace(IiiIiIiiiI.ALLATORIxDEMO("i"), iiIIIiIiII.ALLATORIxDEMO("G\u00daZ"));
        }
        IiIiIIiiii.ALLATORIxDEMO((String)object2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(Object object, String string) {
        void iIiIiIIIII2;
        IIIIIiIiIi iIIIIiIiIi = object2;
        Object object2 = object;
        IIIIIiIiIi iIiIiIIIII3 = iIIIIiIiIi;
        if (object2 == null) {
            return "null";
        }
        Object object3 = object2;
        String string2 = object3.getClass().getSimpleName();
        if (object3 instanceof String) {
            String string3 = (String)object2;
            if (string3.length() > (0x7F & 0x32)) {
                return "\u00a7b\"" + string3.substring(5 >> 3, 0x6F & 0x3F) + "...\"\u00a77";
            }
            return "\u00a7b\"" + string3 + "\"\u00a77";
        }
        if (object2 instanceof Number) {
            return "\u00a76" + String.valueOf(object2) + "\u00a77";
        }
        if (object2 instanceof Boolean) {
            return "\u00a7a" + String.valueOf(object2) + "\u00a77";
        }
        if (object2 instanceof Enum) {
            return "\u00a7d" + ((Enum)object2).name() + "\u00a77";
        }
        if (string2.contains(iiIIIiIiII.ALLATORIxDEMO("\u001f!\u0012\u000e6\u001d\u0012\u001e"))) {
            return "\u00a7e" + String.valueOf(object2) + "\u00a77";
        }
        if (string2.contains(IiiIiIiiiI.ALLATORIxDEMO("?a\u00025\u0007"))) {
            return "\u00a7e" + String.valueOf(object2) + "\u00a77";
        }
        if (string2.contains(iiIIIiIiII.ALLATORIxDEMO(";8.N\u0004"))) {
            return "\u00a7e" + String.valueOf(object2) + "\u00a77";
        }
        if (string2.contains(IiiIiIiiiI.ALLATORIxDEMO("H\u0006x\u0000p\u0018O\u0007")) || string2.contains(iiIIIiIiII.ALLATORIxDEMO("$\u0013\u0019")) && iIiIiIIIII2 != null && (iIiIiIIIII2.contains(IiiIiIiiiI.ALLATORIxDEMO("o\u0007")) || iIiIiIIIII2.contains(iiIIIiIiII.ALLATORIxDEMO("4\t")))) {
            return "\u00a7c" + String.valueOf(object2) + "\u00a77";
        }
        if (object2.getClass().isArray()) {
            if (object2 instanceof byte[]) {
                int n = ((byte[])object2).length;
                return "\u00a7cbyte[" + n + "]\u00a77";
            }
            if (object2 instanceof int[]) {
                int n = ((int[])object2).length;
                return "\u00a7cint[" + n + "]\u00a77";
            }
            return "\u00a7c" + string2 + "[]\u00a77";
        }
        if (object2 instanceof Collection) {
            int n = ((Collection)object2).size();
            return "\u00a7d" + string2 + "(" + n + " items)\u00a77";
        }
        if (string2.contains(IiiIiIiiiI.ALLATORIxDEMO("/d\u0017")) || string2.contains(iiIIIiIiII.ALLATORIxDEMO("\u0003?9"))) {
            String string4 = object2.toString();
            if (string4.length() > (0x7E & 0x65)) {
                return "\u00a7c" + string2 + "[...]\u00a77";
            }
            return "\u00a7c" + string4 + "\u00a77";
        }
        if (string2.contains(IiiIiIiiiI.ALLATORIxDEMO("\u001dy\ra:p\u0000e\b"))) {
            return iiIIIiIiII.ALLATORIxDEMO("\u00ea8\u0004\t\b0\u001e\t\f>&\u00daZ");
        }
        if (string2.contains(IiiIiIiiiI.ALLATORIxDEMO("P\u0004~\u0017"))) {
            return "\u00a7b" + object2.toString().replace(iiIIIiIiII.ALLATORIxDEMO("g"), IiiIiIiiiI.ALLATORIxDEMO("Z\r")) + "\u00a77";
        }
        String string5 = object2.toString();
        if (string5.length() > (0x2DF6 & 0x529F)) {
            return "\u00a7c" + string2 + "[\u6570\u636e\u8fc7\u957f]\u00a77";
        }
        return "\u00a7f" + string5 + "\u00a77";
    }

    @Override
    public void onActivate() {
        IIIIIiIiIi iIIIIiIiIi = this;
        super.onActivate();
        iIIIIiIiIi.IIIIiiiiiI = 2 & 5;
        iIIIIiIiIi.IiIiiIIiIi.clear();
        this.iIIIIiIIiI = iIIIIiIiIi.IIIIiiiiiI;
        this.IIiIiIIiii = 5 >> 3;
        this.iIiIiiiiII = this.IIiIiIIiii;
        IiIiIIiiii.iiIIiIIiii(IiiIiIiiiI.ALLATORIxDEMO("\u00e5i6\u8c29\u8b9a\u6a1c\u570f}e\u654f\u6334\u532d\u8fb0\u8e17\u5daa\u6fec\u6d72"));
        if (((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
            IiIiiIIIiI.iiiIiIiiIi();
            this.IiiIiIiiIi.set((Object)((3 ^ 3) != 0));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(ReceiveMessageEvent object) {
        IIIIIiIiIi iIIIIiIiIi = iIIIIiIiIi2;
        IIIIIiIiIi iIIIIiIiIi2 = object;
        object = iIIIIiIiIi;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IIIIIiIiIi iIiIiIIIII2;
        IIIIIiIiIi iIIIIiIiIi = iIIIIiIiIi2;
        IIIIIiIiIi iIIIIiIiIi2 = post;
        IIIIIiIiIi iIIIIiIiIi3 = iIiIiIIIII2 = iIIIIiIiIi;
        iIIIIiIiIi3.IIIIiiiiiI += --1;
        if (iIIIIiIiIi3.IIIIiiiiiI % (0x6D & 0x76) == 0 && ((Boolean)iIiIiIIIII2.iIIiiiiIii.get()).booleanValue() && iIiIiIIIII2.iIIIIiIIiI > 0) {
            Object[] objectArray = new Object[--3];
            objectArray[3 >> 2] = iIiIiIIIII2.iIIIIiIIiI;
            objectArray[2 ^ 3] = iIiIiIIIII2.IIiIiIIiii;
            objectArray[5 >> 1] = iIiIiIIIII2.iIiIiiiiII;
            IiIiIIiiii.iiIIiIIiii(String.format(iiIIIiIiII.ALLATORIxDEMO("\u009dH.\u6515\u631e\u5365\u7eaf\u8bc1&K\u6041\u8bcb\u0000\nx)}1}\u63e8\u656bw}h\u0019M!m\u53ac\u906cgmX\t"), objectArray));
        }
    }

    private static /* synthetic */ String iiiIiIiiIi(class_2596<?> iIiIiIIIII2) {
        String string = iIiIiIIIII2.getClass().getSimpleName();
        return string.substring(string.lastIndexOf(0x3E & 0x6F) + (4 ^ 5));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent object) {
        IIIIIiIiIi iIIIIiIiIi = iIIIIiIiIi2;
        IIIIIiIiIi iIIIIiIiIi2 = object;
        object = iIIIIiIiIi;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(String string, int n) {
        void iIiIiIIIII2;
        IIIIIiIiIi iIIIIiIiIi = string2;
        String string2 = string;
        IIIIIiIiIi iIiIiIIIII3 = iIIIIiIiIi;
        if (string2.length() <= iIiIiIIIII2) {
            return string2;
        }
        return string2.substring(3 & 4, (int)(iIiIiIIIII2 - --3)) + "...";
    }

    private static /* synthetic */ String ALLATORIxDEMO(Int2ObjectMap<class_10938> int2ObjectMap) {
        Object iIiIiIIIII2;
        Int2ObjectMap<class_10938> int2ObjectMap2 = int2ObjectMap;
        if (int2ObjectMap2 == null || int2ObjectMap2.isEmpty()) {
            return iiIIIiIiII.ALLATORIxDEMO("\u65ad\u4f93\u6554");
        }
        Object object = iIiIiIIIII2 = new StringBuilder();
        ((StringBuilder)object).append(IiiIiIiiiI.ALLATORIxDEMO("\u4fe2\u6550\u69f9\u4f2c<i"));
        int2ObjectMap2.forEach((arg_0, arg_1) -> IIIIIiIiIi.ALLATORIxDEMO((StringBuilder)object, arg_0, arg_1));
        return ((StringBuilder)iIiIiIIIII2).toString();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(EntityRemovedEvent object) {
        IIIIIiIiIi iIIIIiIiIi = iIIIIiIiIi2;
        IIIIIiIiIi iIIIIiIiIi2 = object;
        object = iIIIIiIiIi;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        IIIIIiIiIi iIIIIiIiIi = object;
        Object object = receive;
        IIIIIiIiIi iIiIiIIIII2 = iIIIIiIiIi;
        if (!((Boolean)iIiIiIIIII2.iIIiiiiIii.get()).booleanValue()) {
            return;
        }
        object = ((PacketEvent.Receive)object).packet;
        Object object2 = IIIIIiIiIi.iiiIiIiiIi(object);
        if (!((Set)iIiIiIIIII2.iIIiiIIiii.get()).contains(object.getClass())) {
            return;
        }
        IIIIIiIiIi iIIIIiIiIi2 = iIiIiIIIII2;
        iIIIIiIiIi2.IIiIiIIiii += 5 >> 2;
        iIIIIiIiIi2.iIIIIiIIiI += 4 ^ 5;
        String string = IiiIiIiiiI.ALLATORIxDEMO("\u00ab\b\u63a1\u6557:N");
        Object[] objectArray = new Object[--3];
        objectArray[3 & 4] = string;
        objectArray[5 >> 2] = object2;
        objectArray[5 >> 1] = iIiIiIIIII2.iIIIIiIIiI;
        object2 = String.format(iiIIIiIiII.ALLATORIxDEMO("\u00cd_q\u652d\u6323\u5358mx>\u0000m\u00fa+X\u001e}\u00eaJE~h\u0019D"), objectArray);
        if (((Boolean)iIiIiIIIII2.IiiIiIiIIi.get()).booleanValue() && !((String)(object = iIiIiIIIII2.ALLATORIxDEMO((class_2596<?>)object))).isEmpty()) {
            IIIIIiIiIi iIIIIiIiIi3 = iIiIiIIIII2;
            object = iIIIIiIiIi3.ALLATORIxDEMO((String)object, (Integer)iIIIIiIiIi3.IIIiIiiIii.get());
            object2 = (String)object2 + "\n\u00a77" + ((String)object).replace(IiiIiIiiiI.ALLATORIxDEMO("i"), iiIIIiIiII.ALLATORIxDEMO("G\u00daZ"));
        }
        IiIiIIiiii.iiIIiIIiii((String)object2);
    }

    private /* synthetic */ String ALLATORIxDEMO(class_2596<?> class_25962) {
        class_2596<?> class_25963 = class_25964;
        class_2596<?> class_25964 = class_25962;
        class_2596<?> iIiIiIIIII2 = class_25963;
        StringBuilder stringBuilder = new StringBuilder();
        if (class_25964 instanceof class_2828) {
            class_2828 class_28282;
            class_2828 class_28283 = class_28282 = (class_2828)class_25964;
            class_2596<?> class_25965 = iIiIiIIIII2;
            class_2828 class_28284 = class_28282;
            double d = class_28284.method_12269(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23317());
            double d2 = class_28284.method_12268(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_23318());
            double d3 = class_28282.method_12274(class_25965.iIIiiIiIiI.field_1724.method_23321());
            float f = class_28283.method_12271(class_25965.iIIiiIiIiI.field_1724.method_36454());
            float f2 = class_28283.method_12270(iIiIiIIIII2.iIIiiIiIiI.field_1724.method_36455());
            boolean bl = class_28283.method_12273();
            Object[] objectArray = new Object[0x76 & 0xF];
            objectArray[3 >> 2] = d;
            objectArray[2 ^ 3] = d2;
            objectArray[--2] = d3;
            objectArray[--3] = Float.valueOf(f);
            objectArray[--4] = Float.valueOf(f2);
            objectArray[--5] = bl;
            return String.format(IiiIiIiiiI.ALLATORIxDEMO("\u0019|\u001d\bM1YdZ?\"\u4f00\u7f43r\r`\u0003m\u0014$K\"%K3\u0003,E%K3\u0003\tO\u89c6\u89b7\u001aey\u0004Wx-C4\u0006%\u0010a\u0019~\u0010;F5Ofo\u661e\u5472\u5725\u5758\u976eS$Dui"), objectArray);
        }
        if (class_25964 instanceof class_2885) {
            class_2885 class_28852 = (class_2885)class_25964;
            class_1268 class_12682 = class_28852.method_12546();
            class_3965 class_39652 = class_28852.method_12543();
            class_2338 class_23382 = class_39652.method_17777();
            class_2350 class_23502 = class_39652.method_17780();
            class_243 class_2432 = class_39652.method_17784();
            Object[] objectArray = new Object[0x2F & 0x57];
            objectArray[3 ^ 3] = class_12682;
            objectArray[3 >> 1] = class_23382.method_23854();
            objectArray[1 ^ 3] = class_23502;
            objectArray[--3] = class_2432.field_1352;
            objectArray[--4] = class_2432.field_1351;
            objectArray[--5] = class_2432.field_1350;
            objectArray[0x3F & 0x46] = class_39652.method_17781();
            return String.format(iiIIIiIiII.ALLATORIxDEMO("|dt\u0012%\u0003\u0002\t\n\u001a\u001dxF\u001c\u0000\u0016P]Mv\u6227[QS\u00150\u6593\u572e\u5739\u687aW_J\u0012{\u971bS]H\fe\u541c\u4e5c\u4f77\u7f44OEXE^S\u001dGZO\u0014\u0019;a}hs~;dW\u6662\u545b\u51e8\u90b5\u5430\u4e50W}h\u000eg"), objectArray);
        }
        if (class_25964 instanceof class_2846) {
            class_2846 class_28462 = (class_2846)class_25964;
            class_2338 class_23383 = class_28462.method_12362();
            class_2350 class_23503 = class_28462.method_12360();
            class_2846.class_2847 class_28472 = class_28462.method_12363();
            Object[] objectArray = new Object[--3];
            objectArray[5 >> 3] = class_28472;
            objectArray[3 & 5] = class_23383 != null ? class_23383.method_23854() : iiIIIiIiII.ALLATORIxDEMO("e\u659dD");
            objectArray[5 >> 1] = class_23503 != null ? class_23503 : IiiIiIiiiI.ALLATORIxDEMO("I\u65e6J");
            return String.format(IiiIiIiiiI.ALLATORIxDEMO("=X=5l\u0004Y r$C1i\nNx5P\u000f\u52c8\u4f59Z(Hnr\u76e8\u6864\u65a2\u5729:E\u0014'\u0007\u6775\u541dS$Dui"), objectArray);
        }
        if (class_25964 instanceof class_8875) {
            class_8875 class_88752 = (class_8875)class_25964;
            int n = class_88752.comp_1998();
            boolean bl = class_88752.comp_2000();
            Object[] objectArray = new Object[--2];
            objectArray[3 & 4] = n;
            objectArray[3 & 5] = bl ? IiiIiIiiiI.ALLATORIxDEMO("\u5dfe\u5446\u752cN\u900f\u4e4e") : iiIIIiIiII.ALLATORIxDEMO("\u6767\u5452\u7545");
            return String.format(iiIIIiIiII.ALLATORIxDEMO("R\\LiF\u001a\u00113\b\u0011\u000e\u001c\u000e\u001e9NK)(`p`G\u69a0\u4f00gmX\tW\u72fb\u607cW}h\u000eg"), objectArray);
        }
        if (class_25964 instanceof class_2848) {
            class_2848 class_28482 = (class_2848)class_25964;
            class_2848.class_2849 class_28492 = class_28482.method_12365();
            int n = class_28482.method_12366();
            Object[] objectArray = new Object[--2];
            objectArray[3 ^ 3] = class_28492;
            objectArray[2 ^ 3] = n;
            return String.format(IiiIiIiiiI.ALLATORIxDEMO("=X\u001d\u0006l\fE+t&O(e\fk\u00048]5g\u6a3c\u5f77<C>\r\n\u9af4\u4e69\u8da7\u8dce\u5f52\u5eaaS$Dbi"), objectArray);
        }
        if (class_25964 instanceof class_2813) {
            class_2813 class_28132 = (class_2813)class_25964;
            short s = class_28132.comp_3844();
            byte by = class_28132.comp_3845();
            class_1713 class_17132 = class_28132.comp_3846();
            Int2ObjectMap int2ObjectMap = class_28132.comp_3847();
            Object[] objectArray = new Object[--4];
            objectArray[5 >> 3] = (int)s;
            objectArray[--1] = (int)by;
            objectArray[5 >> 1] = class_17132;
            objectArray[--3] = IIIIIiIiIi.ALLATORIxDEMO((Int2ObjectMap<class_10938>)int2ObjectMap);
            return String.format(iiIIIiIiII.ALLATORIxDEMO("AQ\\2\u001a\u000fYA*\u0005\u0012\u0019BR\\{\u7aee\u538a4)EOD\u00150\u69d7\u4f38_PE\u0014j\u6372\u94c5@J\u001fNW\u52e5\u4f01\u7c36\u57d6w}h.G\u4f93\u6554\u9824wwM}h\u000eg"), objectArray);
        }
        if (class_25964 instanceof class_2811) {
            class_2811 class_28112 = (class_2811)class_25964;
            int n = class_28112.comp_2649();
            int n2 = class_28112.comp_2650();
            Object[] objectArray = new Object[--2];
            objectArray[2 & 5] = n;
            objectArray[3 >> 1] = n2;
            return String.format(IiiIiIiiiI.ALLATORIxDEMO("\u001dx='U1t\nN\u0006d\u0004f\u000b8]5g\u7a8a\u539bO'!^%\u0001;\u635d\u94a3!HS$Dbi"), objectArray);
        }
        if (class_25964 instanceof class_2815) {
            class_2815 class_28152 = (class_2815)class_25964;
            int n = class_28152.method_36168();
            Object[] objectArray = new Object[--1];
            objectArray[3 & 4] = n;
            return String.format(iiIIIiIiII.ALLATORIxDEMO("\u0007\u0017H&\u001c\u000f\u0003\u00053\n\u0014\u000eVO9\u001e>?8(3p`pw\u7afa\u53be\u00049W}h\u0019g"), objectArray);
        }
        if (class_25964 instanceof class_2879) {
            class_2879 class_28792 = (class_2879)class_25964;
            class_1268 class_12683 = class_28792.method_12512();
            Object[] objectArray = new Object[--1];
            objectArray[3 >> 2] = class_12683;
            return String.format(IiiIiIiiiI.ALLATORIxDEMO("8]5%|\u0016b0l\u0017n\u0002\fi0b\u6247S$Dui"), objectArray);
        }
        try {
            int n;
            Field[] fieldArray;
            Class clazz = class_25964.getClass();
            Field[] fieldArray2 = fieldArray = clazz.getDeclaredFields();
            int n3 = fieldArray2.length;
            int n4 = n = 5 >> 3;
            while (n4 < n3) {
                Field field = fieldArray2[n];
                field.setAccessible(--1 != 0);
                String string = field.getName();
                if (!(string.equals(iiIIIiIiII.ALLATORIxDEMO("1\"\u001a\n8?")) || string.equals(IiiIiIiiiI.ALLATORIxDEMO("\nk\u0005c\u0000")) || string.equals(iiIIIiIiII.ALLATORIxDEMO("+\u0014\b1)\"^jtNX")) || string.equals(IiiIiIiiiI.ALLATORIxDEMO("\u0003X1a\fSZ3X5U")))) {
                    try {
                        Object object = field.get(class_25964);
                        String string2 = iIiIiIIIII2.ALLATORIxDEMO(object, string);
                        if (!string2.isEmpty()) {
                            Object[] objectArray = new Object[1 ^ 3];
                            objectArray[3 >> 2] = string;
                            objectArray[--1] = string2;
                            stringBuilder.append(String.format(iiIIIiIiII.ALLATORIxDEMO("M}h\u000eW}h\u000eg"), objectArray));
                        }
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        Object[] objectArray = new Object[4 ^ 5];
                        objectArray[3 >> 2] = string;
                        stringBuilder.append(String.format(IiiIiIiiiI.ALLATORIxDEMO("^ @Bn-3\u8bb3\u9587\u5935\u8d44[i"), objectArray));
                    }
                }
                n4 = ++n;
            }
            if (stringBuilder.length() > 0) {
                StringBuilder stringBuilder2 = stringBuilder;
                stringBuilder2.setLength(stringBuilder2.length() - (4 ^ 5));
            }
        }
        catch (Exception exception) {
            return "[\u89e3\u6790\u5931\u8d25: " + exception.getMessage() + "]";
        }
        return stringBuilder.toString();
    }
}

