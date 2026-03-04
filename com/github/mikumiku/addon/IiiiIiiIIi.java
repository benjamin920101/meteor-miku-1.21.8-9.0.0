/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.utils.BetterBlockPos
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.BlockUpdateEvent
 *  meteordevelopment.meteorclient.events.world.ChunkDataEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.BaritoneUtils
 *  meteordevelopment.meteorclient.pathing.NopPathManager
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraft.world.chunk.ChunkStatus
 *  net.minecraft.world.chunk.ChunkSection
 *  net.minecraft.world.Heightmap$Type
 *  net.minecraft.util.math.random.ChunkRandom
 *  net.minecraft.util.math.random.ChunkRandom$RandomProvider
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.util.math.random.Random
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.world.chunk.ReadableContainer
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.utils.BetterBlockPos;
import com.github.mikumiku.addon.IIiiiiIIII;
import com.github.mikumiku.addon.IiIIiIIiII;
import com.github.mikumiku.addon.iIIIIIIIII;
import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.mixinface.MagicMix;
import com.github.mikumiku.addon.mixinface.MySettings;
import com.seedfinding.mccore.version.MCVersion;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.BlockUpdateEvent;
import meteordevelopment.meteorclient.events.world.ChunkDataEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.BaritoneUtils;
import meteordevelopment.meteorclient.pathing.NopPathManager;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.Heightmap;
import net.minecraft.util.math.random.ChunkRandom;
import net.minecraft.util.math.MathHelper;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.chunk.ReadableContainer;

public class IiiiIiiIIi
extends iIiIiIIIii {
    private final Setting<Boolean> iiiIiIIiii;
    private final Setting<Boolean> iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<Integer> iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private int IIiiIIIIIi;
    private final SettingGroup iIiiiIiIii;
    private final Map<Long, Map<iIiIIiiIiI, Set<class_243>>> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    public List<class_2338> IiiIiIiiIi;
    private final SettingGroup IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private final Setting<MCVersion> iiiiiIIiIi;
    private Map<class_5321<class_1959>, List<iIiIIiiIiI>> iIIiIiiiIi;
    private IIiiiiIIII iIiIiIIIII;
    private final Setting<String> ALLATORIxDEMO;

    @Override
    public void onActivate() {
        super.onActivate();
        if (iIIIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO() == null) {
            this.error(IiIIiIIiII.ALLATORIxDEMO("\u677f\u6277\u5202\u79a3\u5b42\u304c\u8be5\u5766\u79df\u5b1e\u8b8c\u7f00\u4e3f\u8fdd\u5177\u7983\u5b62\u5e18\u708b\u5195\u5e86\u7566"), new Object[3 & 4]);
            this.toggle();
            return;
        }
        if (PathManagers.get() instanceof NopPathManager) {
            this.info(MySettings.ALLATORIxDEMO("\u970d\u89900Lnkqxbsy"), new Object[3 ^ 3]);
            this.toggle();
            return;
        }
        this.info("\u6ce8\u610f\u79cd\u5b50\u662f\u5426\u6b63\u786e\u3002\u5f53\u524d\u79cd\u5b50: " + iIIIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO().iIiIiIIIII + " \u7248\u672c: " + ((MCVersion)((Object)this.iiiiiIIiIi.get())).name, new Object[3 >> 2]);
        this.iiIIiIIiii();
    }

    private /* synthetic */ void iiIIiIIiii() {
        IiiiIiiIIi iiiiIiiIIi2 = iIiiiiIIII;
        IIiiiiIIII iIiiiiIIII = iIIIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO();
        if (iIiiiiIIII == null) {
            return;
        }
        IiiiIiiIIi iiiiIiiIIi3 = iiiiIiiIIi2;
        iiiiIiiIIi3.iIiIiIIIII = iIiiiiIIII;
        iiiiIiiIIi3.iIIiIiiiIi = iIiIIiiIiI.ALLATORIxDEMO(PlayerUtils.getDimension());
        MagicMix.oreGoals.clear();
        iiiiIiiIIi3.iIiIiiiiII.clear();
        if (iiiiIiiIIi3.iIIiiIiIiI.field_1687 != null && iiiiIiiIIi2.iIiIiIIIII != null) {
            iiiiIiiIIi2.ALLATORIxDEMO();
        }
    }

    public void onDeactivate() {
        this.iIiIiiiiII.clear();
        this.iIIiIiiiIi = null;
    }

    private /* synthetic */ List<iIiIIiiIiI> ALLATORIxDEMO(class_5321<class_1959> class_53212) {
        class_5321<class_1959> class_53213 = class_53214;
        class_5321<class_1959> class_53214 = class_53212;
        class_5321<class_1959> iIiIiIIIII2 = class_53213;
        if (iIiIiIIIII2.iIIiIiiiIi.containsKey(class_53214)) {
            return iIiIiIIIII2.iIIiIiiiIi.get(class_53214);
        }
        return iIiIiIIIII2.iIIiIiiiIi.values().stream().findAny().get();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2791 class_27912) {
        void iIiIiIIIII2;
        IiiiIiiIIi iiiiIiiIIi2 = iIiIIiiIiI2;
        class_1923 class_19233 = iIiIiIIIII2.method_12004();
        long l = class_19233.method_8324();
        class_638 class_6382 = iiiiIiiIIi2.iIIiiIiIiI.field_1687;
        if (iiiiIiiIIi2.iIiIiiiiII.containsKey(l) || class_6382 == null) {
            return;
        }
        Object object = new HashSet();
        class_1923.method_19280((class_1923)class_19233, (int)(4 ^ 5)).forEach(class_19232 -> {
            int n;
            class_2791 iIiIiIIIII2 = class_19232;
            class_638 iIiIiIIIII3 = class_6382;
            iIiIiIIIII2 = iIiIiIIIII3.method_8402(iIiIiIIIII2.field_9181, iIiIiIIIII2.field_9180, class_2806.field_12794, (2 & 5) != 0);
            if (iIiIiIIIII2 == null) {
                return;
            }
            iIiIiIIIII2 = iIiIiIIIII2.method_12006();
            int n2 = ((class_2826[])iIiIiIIIII2).length;
            int n3 = n = 5 >> 3;
            while (n3 < n2) {
                void iIiIiIIIII4;
                class_7522 class_75222 = iIiIiIIIII2[n].method_38294();
                class_75222.method_39793(arg_0 -> IiiiIiiIIi.ALLATORIxDEMO((Set)iIiIiIIIII4, arg_0));
                n3 = ++n;
            }
        });
        object = object.stream().flatMap(class_53212 -> {
            IiiiIiiIIi iiiiIiiIIi2 = iiiiIiiIIi3;
            IiiiIiiIIi iiiiIiiIIi3 = class_53212;
            IiiiIiiIIi iIiIiIIIII2 = iiiiIiiIIi2;
            return iIiIiIIIII2.ALLATORIxDEMO((class_5321<class_1959>)iiiiIiiIIi3).stream();
        }).collect(Collectors.toSet());
        class_1923 class_19234 = class_19233;
        int n = class_19234.field_9181 << --4;
        int n2 = class_19234.field_9180 << --4;
        class_2919 class_29192 = new class_2919(class_2919.class_6675.field_35143.method_39006(0L));
        long l2 = class_29192.method_12661(iiiiIiiIIi2.iIiIiIIIII.iIiIiIIIII.longValue(), n, n2);
        HashMap hashMap = new HashMap();
        object = object.iterator();
        while (object.hasNext()) {
            iIiIIiiIiI iIiIIiiIiI2 = (iIiIIiiIiI)object.next();
            HashSet<class_243> hashSet = new HashSet<class_243>();
            iIiIIiiIiI iIiIIiiIiI3 = iIiIIiiIiI2;
            class_29192.method_12664(l2, iIiIIiiIiI3.iIIIiiiiIi, iIiIIiiIiI3.iIIiIiiiIi);
            int n3 = iIiIIiiIiI2.IIIIiiIiii.method_35008((class_5819)class_29192);
            int n4 = 5 >> 3;
            while (n4 < n3) {
                int n5;
                if (iIiIIiiIiI2.IIiIiIIiii == 1.0f || !(class_29192.method_43057() >= 1.0f / iIiIIiiIiI2.IIiIiIIiii)) {
                    class_2919 class_29193 = class_29192;
                    int n6 = class_29193.method_43048(0x13 & 0x7C) + n;
                    int n7 = class_29193.method_43048(0x56 & 0x39) + n2;
                    int n8 = iIiIIiiIiI2.iiIiIIiiii.method_35391((class_5819)class_29192, iIiIIiiIiI2.ALLATORIxDEMO);
                    class_2338 class_23382 = new class_2338(n6, n8, n7);
                    class_5321 class_53213 = (class_5321)iIiIiIIIII2.method_16359(n6, n8, n7).method_40230().get();
                    if (iiiiIiiIIi2.ALLATORIxDEMO((class_5321<class_1959>)class_53213).contains(iIiIIiiIiI2)) {
                        HashSet<class_243> hashSet2 = hashSet;
                        if (iIiIIiiIiI2.iIIIIIIiII) {
                            hashSet2.addAll(iiiiIiiIIi2.ALLATORIxDEMO(class_6382, class_29192, class_23382, iIiIIiiIiI2.iiiIiiIIII));
                        } else {
                            Object object2 = iIiIIiiIiI2;
                            hashSet2.addAll(iiiiIiiIIi2.ALLATORIxDEMO(class_6382, class_29192, class_23382, ((iIiIIiiIiI)object2).iiiIiiIIII, ((iIiIIiiIiI)object2).iIiiiiIIII));
                        }
                    }
                }
                n4 = ++n5;
            }
            if (hashSet.isEmpty()) continue;
            hashMap.put(iIiIIiiIiI2, hashSet);
        }
        iiiiIiiIIi2.iIiIiiiiII.put(l, hashMap);
    }

    private /* synthetic */ void iiiIiIiiIi() {
        IiiiIiiIIi iiiiIiiIIi2 = this;
        if (iiiiIiiIIi2.iIIiiIiIiI.field_1724 == null || !BaritoneUtils.IS_AVAILABLE) {
            return;
        }
        List<Object> list = new ArrayList<class_2338>();
        int n = 0x3D & 0x4A;
        class_1923 class_19232 = iiiiIiiIIi2.iIIiiIiIiI.field_1724.method_31476();
        int n2 = class_23383 = 5 >> 3;
        while (n2 <= n) {
            int n3;
            int n4 = n3 = -class_23383 + class_19232.field_9181;
            while (n4 <= class_23383 + class_19232.field_9181) {
                list.addAll(iiiiIiiIIi2.ALLATORIxDEMO(n3++, class_19232.field_9180 + class_23383 - n));
                n4 = n3;
            }
            int n5 = n3 = -class_23383 + (4 ^ 5) + class_19232.field_9181;
            while (n5 < class_23383 + class_19232.field_9181) {
                list.addAll(iiiiIiiIIi2.ALLATORIxDEMO(n3++, class_19232.field_9180 - class_23383 + n + (5 >> 2)));
                n5 = n3;
            }
            n2 = ++class_23383;
        }
        if (list.isEmpty()) {
            return;
        }
        list.sort(Comparator.comparingInt(class_23382 -> {
            IiiiIiiIIi iiiiIiiIIi2 = iiiiIiiIIi3;
            IiiiIiiIIi iiiiIiiIIi3 = class_23382;
            IiiiIiiIIi iIiIiIIIII2 = iiiiIiiIIi2;
            return Math.abs(iiiiIiiIIi3.method_10263() - iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31477()) + Math.abs(iiiiIiiIIi3.method_10264() - iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31478()) + Math.abs(iiiiIiiIIi3.method_10260() - iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31479());
        }));
        class_2338 class_23383 = (class_2338)list.get(2 & 5);
        BetterBlockPos betterBlockPos = BetterBlockPos.from((class_2338)class_23383);
        list = iIiIIiiIiI.iIiiiIiIii.stream().filter(iIiIiIIIII2 -> (Boolean)iIiIiIIIII2.get()).map(iIiIiIIIII2 -> iIiIiIIIII2.description).map(iIiIiIIIII2 -> iIiIiIIIII2.toLowerCase()).toList();
        try {
            if (!BaritoneAPI.getProvider().getPrimaryBaritone().getMineProcess().isActive()) {
                iiiiIiiIIi2.info("\u8bbe\u7f6e\u6316\u6398\u76ee\u6807: " + class_23383.method_10263() + ", " + class_23383.method_10264() + ", " + class_23383.method_10260(), new Object[5 >> 3]);
                BaritoneAPI.getProvider().getPrimaryBaritone().getMineProcess().mineByName(list.toArray(new String[5 >> 3]));
                return;
            }
        }
        catch (Exception exception) {
            iiiiIiiIIi2.info("\u8bbe\u7f6e\u6316\u6398\u76ee\u6807\u5931\u8d25" + String.valueOf(exception), new Object[5 >> 3]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(class_2919 class_29192, int n) {
        void iIiIiIIIII2;
        IiiiIiiIIi iiiiIiiIIi2 = iiiiIiiIIi3;
        IiiiIiiIIi iiiiIiiIIi3 = class_29192;
        IiiiIiiIIi iIiIiIIIII3 = iiiiIiiIIi2;
        return Math.round((iiiiIiiIIi3.method_43057() - iiiiIiiIIi3.method_43057()) * (float)iIiIiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ ArrayList<class_243> ALLATORIxDEMO(class_638 class_6382, class_2919 class_29192, class_2338 class_23382, int n) {
        int n2;
        void iIiIiIIIII2;
        int n3 = n;
        IiiiIiiIIi iIiIiIIIII3 = this;
        ArrayList<class_243> arrayList = new ArrayList<class_243>();
        int n4 = iIiIiIIIII2.method_43048((int)(n6 + (3 & 5)));
        int n5 = n2 = 2 & 5;
        while (n5 < n4) {
            void iIiIiIIIII4;
            void iIiIiIIIII5;
            int n6 = Math.min(n2, 0x6F & 0x17);
            IiiiIiiIIi iiiiIiiIIi2 = iIiIiIIIII3;
            void v2 = iIiIiIIIII2;
            int n7 = iIiIiIIIII3.ALLATORIxDEMO((class_2919)iIiIiIIIII2, n6) + iIiIiIIIII5.method_10263();
            int n8 = iiiiIiiIIi2.ALLATORIxDEMO((class_2919)v2, n6) + iIiIiIIIII5.method_10264();
            int n9 = iiiiIiiIIi2.ALLATORIxDEMO((class_2919)v2, n6) + iIiIiIIIII5.method_10260();
            if (iIiIiIIIII4.method_8320(new class_2338(n7, n8, n9)).method_26225()) {
                if (iIiIiIIIII3.ALLATORIxDEMO((class_638)iIiIiIIIII4, new class_2338(n7, n8, n9), 1.0f, (class_2919)iIiIiIIIII2)) {
                    arrayList.add(new class_243((double)n7, (double)n8, (double)n9));
                }
            }
            n5 = ++n2;
        }
        return arrayList;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(BlockUpdateEvent blockUpdateEvent) {
        IiiiIiiIIi iiiiIiiIIi2 = iiiiIiiIIi3;
        IiiiIiiIIi iiiiIiiIIi3 = blockUpdateEvent;
        IiiiIiiIIi iIiIiIIIII2 = iiiiIiiIIi2;
        if (((BlockUpdateEvent)iiiiIiiIIi3).newState.method_26225()) {
            return;
        }
        long l = class_1923.method_37232((class_2338)((BlockUpdateEvent)iiiiIiiIIi3).pos);
        if (iIiIiIIIII2.iIiIiiiiII.containsKey(l)) {
            Iterator<Set<class_243>> iterator;
            iiiiIiiIIi3 = class_243.method_24954((class_2382)((BlockUpdateEvent)iiiiIiiIIi3).pos);
            Iterator<Set<class_243>> iterator2 = iterator = iIiIiIIIII2.iIiIiiiiII.get(l).values().iterator();
            while (iterator2.hasNext()) {
                iterator.next().remove(iiiiIiiIIi3);
                iterator2 = iterator;
            }
        }
    }

    private static /* synthetic */ void ALLATORIxDEMO(Set set, class_6880 class_68802) {
        Set iIiIiIIIII2 = class_68802;
        Set iIiIiIIIII3 = set;
        iIiIiIIIII3.add((class_5321)iIiIiIIIII2.method_40230().get());
    }

    public IiiiIiiIIi() {
        IiiiIiiIIi iiiiIiiIIi2 = iiiiIiiIIi6;
        super(MySettings.ALLATORIxDEMO("\u79c1\u5b5d\u77b9\u9048"), IiIIiIIiII.ALLATORIxDEMO("\u79d4\u5b15\u905a\u89cf\u5888\u5f70\u725a\u304c\u8f83\u5129\u79c3\u5b02\uff1a\u7bdd\u51e8\u77b1\u7279\u5bd2\u964b\u4f1f\u7f3b\u300b\u6cf2\u6149\u5fda\u9838\u4f60\u756b\u57ee\u4ec6\u5f42\u6656\u721d\u768d\u7505\u4e43\u97e1\u304c\u57e8\u4ec0\u007f+F\u000b}<M<W\u0004W\rf="));
        IiiiIiiIIi iiiiIiiIIi3 = iiiiIiiIIi2;
        iiiiIiiIIi2.iIiIiiiiII = new ConcurrentHashMap<Long, Map<iIiIIiiIiI, Set<class_243>>>();
        iiiiIiiIIi2.iIiIiIIIII = null;
        IiiiIiiIIi iiiiIiiIIi4 = iiiiIiiIIi2;
        iiiiIiiIIi2.IiiIiIiiIi = new ArrayList<class_2338>();
        iiiiIiiIIi2.IIiiIIIIIi = 3 & 4;
        iiiiIiiIIi2.IIiIiIIiii = iiiiIiiIIi2.settings.createGroup(MySettings.ALLATORIxDEMO("\u79c1\u5b5d\u8bf8\u7f29"));
        iiiiIiiIIi2.ALLATORIxDEMO = iiiiIiiIIi2.IIiIiIIiii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u79df\u5b1e"))).description(MySettings.ALLATORIxDEMO("\u8f83\u5154\u4e26\u757d\u79fd\u5b41\u3012\uff4c\u9e9d\u8bb5\u502c\u4e2c$R#Y\u79c0\u5b16\uff4e"))).defaultValue((Object)IiIIiIIiII.ALLATORIxDEMO("\u001fY!z$w#}\u000bW*y\"}\u0005\\\u0004X*~"))).build());
        iiiiIiiIIi2.iiiiiIIiIi = iiiiIiiIIi2.IIiIiIIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("AN\u720e\u676b"))).description(IiIIiIIiII.ALLATORIxDEMO("\u9047\u62db#{ w-@\u000fT\u001a\u725a\u6762"))).defaultValue((Object)MCVersion.v1_21)).build());
        iiiiIiiIIi2.iiiIiiIIII = iiiiIiiIIi2.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u5e98\u7525\u798b\u5b17"))).description(IiIIiIIiII.ALLATORIxDEMO("\u70ab\u51b5\u5ea6\u7546\u4e18\u972c\u8bac\u7f20\u76b6\u79a3\u5b62\u54e2\u725a\u6762"))).defaultValue((Object)(5 >> 3))).onChanged(bl -> {
            boolean bl22 = bl;
            IiiiIiiIIi iIiIiIIIII2 = this;
            if (bl22) {
                IiiiIiiIIi iiiiIiiIIi2;
                String bl22 = (String)iIiIiIIIII2.ALLATORIxDEMO.get();
                if (!bl22.isEmpty()) {
                    iIIIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO(bl22, (MCVersion)((Object)((Object)iIiIiIIIII2.iiiiiIIiIi.get())));
                    IiiiIiiIIi iiiiIiiIIi3 = iIiIiIIIII2;
                    iiiiIiiIIi3.info("\u5df2\u8bbe\u7f6e\u79cd\u5b50: " + bl22 + " \u7248\u672c: " + ((MCVersion)((Object)((Object)iiiiIiiIIi3.iiiiiIIiIi.get()))).name, new Object[3 >> 2]);
                    IiiiIiiIIi iiiiIiiIIi4 = iIiIiIIIII2;
                    iiiiIiiIIi2 = iiiiIiiIIi4;
                    iiiiIiiIIi4.iiIIiIIiii();
                } else {
                    iIiIiIIIII2.error(MySettings.ALLATORIxDEMO("\u8bca\u5174\u8fa6\u5151\u79fa\u5b66"), new Object[3 & 4]);
                    iiiiIiiIIi2 = iIiIiIIIII2;
                }
                iiiiIiiIIi2.iiiIiiIIII.set((Object)(5 >> 3));
            }
        })).build());
        IiiiIiiIIi iiiiIiiIIi5 = iiiiIiiIIi2;
        iiiiIiiIIi5.iIiiiIiIii = iiiiIiiIIi5.settings.getDefaultGroup();
        iiiiIiiIIi5.iIiIIiIIIi = iiiiIiiIIi5.iIiiiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u5336\u575a\u8345\u56b3"))).description(IiIIiIIiII.ALLATORIxDEMO("\u662c\u7974\u5328\u5719\u76b6\u8db3\u7989\u4e64\u9642\u304c"))).defaultValue((Object)(--5))).min(--1).sliderMax(0x7F & 0xA).build());
        iiiiIiiIIi2.IIIIiiIiii = iiiiIiiIIi2.iIiiiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name("\u540c\u6b65\u8bbe\u7f6ebaritone" + (BaritoneUtils.IS_AVAILABLE ? MySettings.ALLATORIxDEMO("\uff04B\r\uff4e") : IiIIiIIiII.ALLATORIxDEMO("\uff66\u6c93\u6210\u5222\uff47")))).description(MySettings.ALLATORIxDEMO("\u5c17rPBxd~~T\u77cf\u7258\u4f7d\u7f7f\u8bae\u7f2a\u4e7f\u79dc\u5b40\u7b81\u51ed\u7695\u5b8e\u9649\u4f40\u7f28\u3045"))).defaultValue((Object)(5 >> 3))).build());
        iiiiIiiIIi2.iIIIiiiiIi = iiiiIiiIIi2.iIiiiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u76c6\u63cb\u5f12\u6358"))).description(MySettings.ALLATORIxDEMO("\u4e1c\u5eea\u8bea\u4f3a\u7539\uff1c\u9672\u9749\u5b8f\u5738\u4e01\u4f17\u543b\u4ea3"))).defaultValue((Object)(5 >> 3))).build());
        iiiiIiiIIi2.IIiIiiiiII = iiiiIiiIIi2.iIiiiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u4e8b\u6324\u6be5\u9a8a\u5ba8\u96d4\u5374"))).description(MySettings.ALLATORIxDEMO("\u8fed\u53d4\u6b9a\u9aa8\u57390H-\tN#$1\u5c52\u6731\u96f6\u4e1c\uff3c\u6307\u6388\u650c\u73c2\u6711\u9ac8\uff1a\u6206\u4efd\u5c21\u631a\u8fd4\u4edd\u3045"))).defaultValue((Object)(3 >> 2))).build());
        iiiiIiiIIi2.iiiIiIIiii = iiiiIiiIIi2.iIiiiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u4e8b\u6324\u94d5\u77c1\u5ba8\u96d4\u5374"))).description(MySettings.ALLATORIxDEMO("\u94ac\u77a5\u6bdc\u9a89\u57181I,=$(O\u001d  1\u5c52\u6731\u96f6\u4e1c\uff3c\u6307\u6388\u650c\u73c2\u6711\u9ac8\uff1a\u6206\u4efd\u5c21\u631a\u8fd4\u4edd\u3045"))).defaultValue((Object)((3 & 4) != 0))).build());
        iiiiIiiIIi2.iIIiiIiIiI = iiiiIiiIIi2.iIiiiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIIiII.ALLATORIxDEMO("\u66c6\u65de\u95e6\u96da"))).description(MySettings.ALLATORIxDEMO("\u8bfa\u7f2b\u76ff\u6817\u7692\u95e3\u9685\u65e6\u95f8\uff05\u7994\uff4e"))).defaultValue((Object)(4 ^ 5))).min(--1).max(0x2B & 0x5E).sliderMax(0x7F & 0xA).build());
        IiiiIiiIIi iiiiIiiIIi6 = iiiiIiiIIi2.settings.createGroup(IiIIiIIiII.ALLATORIxDEMO("\u77ed\u7227"));
        iIiIIiiIiI.iIiiiIiIii.forEach(arg_0 -> ((SettingGroup)iiiiIiiIIi6).add(arg_0));
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("a\\tqbu\u0011EATpd!d1\u8be7\u66e2\u65a7\u5221\u6710\u65bc\u7245\u676a\uff46"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ ArrayList<class_243> ALLATORIxDEMO(class_638 class_6382, class_2919 class_29192, int n, double d, double d2, double d3, double d4, double d5, double d6, int n2, int n3, int n4, int n5, int n6, float f) {
        double d7;
        void iIiIiIIIII2;
        double d8;
        double iIiIiIIIII3;
        double iIiIiIIIII4;
        double d9;
        double iIiIiIIIII5;
        double d10;
        double iIiIiIIIII6;
        double iIiIiIIIII7;
        void iIiIiIIIII8;
        void iIiIiIIIII9;
        void iIiIiIIIII10;
        IiiiIiiIIi iiiiIiiIIi2 = this;
        BitSet bitSet = new BitSet((int)(iIiIiIIIII10 * iIiIiIIIII9 * iIiIiIIIII10));
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        double[] dArray = new double[iIiIiIIIII8 * --4];
        ArrayList<class_243> arrayList = new ArrayList<class_243>();
        int n7 = this = 2 & 5;
        while (n7 < iIiIiIIIII8) {
            void iIiIiIIIII11;
            float f2 = (float)this / (float)iIiIiIIIII8;
            d10 = class_3532.method_16436((double)f2, (double)iIiIiIIIII7, (double)iIiIiIIIII6);
            d9 = class_3532.method_16436((double)f2, (double)iIiIiIIIII5, (double)iIiIiIIIII11);
            d8 = class_3532.method_16436((double)f2, (double)iIiIiIIIII4, (double)iIiIiIIIII3);
            d7 = iIiIiIIIII2.method_43058() * (double)iIiIiIIIII8 / 16.0;
            double d11 = ((double)(class_3532.method_15374((float)((float)Math.PI * f2)) + 1.0f) * d7 + 1.0) / 2.0;
            int n8 = this;
            dArray[this * --4] = d10;
            dArray[n8 * --4 + (2 ^ 3)] = d9;
            dArray[n8 * --4 + --2] = d8;
            int n9 = this * --4 + --3;
            dArray[n9] = d11;
            n7 = ++this;
        }
        int n10 = this = 0;
        while (true) {
            if (n10 >= iIiIiIIIII8 - --1) break;
            if (!(dArray[this * --4 + --3] <= 0.0)) {
                int n11 = this + (3 >> 1);
                while (n11 < iIiIiIIIII8) {
                    int n12;
                    if (!(dArray[n12 * --4 + --3] <= 0.0)) {
                        double d12;
                        d10 = dArray[this * --4] - dArray[n12 * --4];
                        d9 = dArray[this * --4 + --1] - dArray[n12 * --4 + (2 ^ 3)];
                        d8 = dArray[this * --4 + --2] - dArray[n12 * --4 + --2];
                        d7 = dArray[this * --4 + --3] - dArray[n12 * --4 + --3];
                        double d13 = d10;
                        double d14 = d9;
                        double d15 = d8;
                        if (d12 * d12 > d13 * d13 + d14 * d14 + d15 * d15) {
                            double[] dArray2 = dArray;
                            if (d7 > 0.0) {
                                dArray2[n12 * --4 + --3] = -1.0;
                            } else {
                                dArray2[this * --4 + --3] = -1.0;
                            }
                        }
                    }
                    n11 = ++n12;
                }
            }
            n10 = ++this;
        }
        int n13 = this = 0;
        while (n13 < iIiIiIIIII8) {
            double d16 = dArray[this * --4 + --3];
            if (!(d16 < 0.0)) {
                void iIiIiIIIII12;
                void iIiIiIIIII13;
                void iIiIiIIIII14;
                double d17 = dArray[this * --4];
                iIiIiIIIII7 = dArray[this * --4 + --1];
                iIiIiIIIII6 = dArray[this * --4 + 2];
                int iIiIiIIIII11 = Math.max(class_3532.method_15357((double)(d17 - d16)), (int)iIiIiIIIII14);
                int n14 = Math.max(class_3532.method_15357((double)(iIiIiIIIII7 - d16)), (int)iIiIiIIIII13);
                int n15 = Math.max(class_3532.method_15357((double)(iIiIiIIIII6 - d16)), (int)iIiIiIIIII12);
                int n16 = Math.max(class_3532.method_15357((double)(d17 + d16)), iIiIiIIIII11);
                int n17 = Math.max(class_3532.method_15357((double)(iIiIiIIIII7 + d16)), n14);
                int n18 = Math.max(class_3532.method_15357((double)(iIiIiIIIII6 + d16)), n15);
                int n19 = iIiIiIIIII11;
                while (n19 <= n16) {
                    double d18;
                    int n20;
                    iIiIiIIIII4 = ((double)n20 + 0.5 - d17) / d16;
                    if (d18 * d18 < 1.0) {
                        int n21 = n14;
                        while (n21 <= n17) {
                            int n22;
                            iIiIiIIIII3 = ((double)n22 + 0.5 - iIiIiIIIII7) / d16;
                            double d19 = iIiIiIIIII4;
                            double d20 = iIiIiIIIII3;
                            if (d19 * d19 + d20 * d20 < 1.0) {
                                int n23 = n15;
                                while (n23 <= n18) {
                                    int n24;
                                    iIiIiIIIII5 = ((double)n24 + 0.5 - iIiIiIIIII6) / d16;
                                    double d21 = iIiIiIIIII4;
                                    double d22 = iIiIiIIIII3;
                                    double d23 = iIiIiIIIII5;
                                    if (d21 * d21 + d22 * d22 + d23 * d23 < 1.0 && !bitSet.get(iIiIiIIIII5 = n20 - iIiIiIIIII14 + (n22 - iIiIiIIIII13) * iIiIiIIIII10 + (n24 - iIiIiIIIII12) * iIiIiIIIII10 * iIiIiIIIII9)) {
                                        bitSet.set(iIiIiIIIII5);
                                        int n25 = n22;
                                        class_23392.method_10103(n20, n25, n24);
                                        if (n25 >= (0xFFFFFFC0 & 0xFFFFFFFF)) {
                                            void iIiIiIIIII15;
                                            void iIiIiIIIII16;
                                            if (n22 < (0x635B & 0x1DE4) && iIiIiIIIII16.method_8320((class_2338)class_23392).method_26225() && iiiiIiiIIi2.ALLATORIxDEMO((class_638)iIiIiIIIII16, (class_2338)class_23392, (float)iIiIiIIIII15, (class_2919)iIiIiIIIII2)) {
                                                arrayList.add(new class_243((double)n20, (double)n22, (double)n24));
                                            }
                                        }
                                    }
                                    n23 = ++n24;
                                }
                            }
                            n21 = ++n22;
                        }
                    }
                    n19 = ++n20;
                }
            }
            n13 = ++this;
        }
        return arrayList;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        int n;
        IiiiIiiIIi iiiiIiiIIi2 = iiiiIiiIIi3;
        IiiiIiiIIi iiiiIiiIIi3 = pre;
        IiiiIiiIIi iIiIiIIIII3 = iiiiIiiIIi2;
        if (iIiIiIIIII3.iIIiiIiIiI.field_1724 == null || iIiIiIIIII3.iIIiiIiIiI.field_1687 == null || iIiIiIIIII3.iIIiIiiiIi == null) {
            return;
        }
        if (((Boolean)iIiIiIIIII3.iIIIiiiiIi.get()).booleanValue() && BaritoneUtils.IS_AVAILABLE) {
            IiiiIiiIIi iiiiIiiIIi4 = iIiIiIIIII3;
            iiiiIiiIIi4.IIiiIIIIIi += 3 >> 1;
            int this_ = (Integer)iiiiIiiIIi4.iIIiiIiIiI.get() * (0x5F & 0x34);
            if (iIiIiIIIII3.IIiiIIIIIi >= this_) {
                iIiIiIIIII3.IIiiIIIIIi = 3 ^ 3;
                iIiIiIIIII3.iiiIiIiiIi();
            }
        }
        ArrayList<class_2338> this_ = new ArrayList<class_2338>();
        int n2 = --4;
        class_1923 class_19232 = iIiIiIIIII3.iIIiiIiIiI.field_1724.method_31476();
        int n3 = n = 2 & 5;
        while (n3 <= n2) {
            int n4;
            int n5 = n4 = -n + class_19232.field_9181;
            while (n5 <= n + class_19232.field_9181) {
                this_.addAll(iIiIiIIIII3.ALLATORIxDEMO(n4++, class_19232.field_9180 + n - n2));
                n5 = n4;
            }
            int n6 = n4 = -n + (5 >> 2) + class_19232.field_9181;
            while (n6 < n + class_19232.field_9181) {
                this_.addAll(iIiIiIIIII3.ALLATORIxDEMO(n4++, class_19232.field_9180 - n + n2 + (3 >> 1)));
                n6 = n4;
            }
            n3 = ++n;
        }
        if (((Boolean)iIiIiIIIII3.IIiIiiiiII.get()).booleanValue()) {
            this_.removeIf(iIiIiIIIII2 -> {
                block3: {
                    block2: {
                        if (iIiIiIIIII2.method_10264() < (0x37 & 0x4F)) break block2;
                        if (iIiIiIIIII2.method_10264() <= (0x5F & 0x3E)) break block3;
                    }
                    return true;
                }
                return false;
            });
        }
        if (((Boolean)iIiIiIIIII3.iiiIiIIiii.get()).booleanValue()) {
            this_.removeIf(iIiIiIIIII2 -> {
                block3: {
                    block2: {
                        if (iIiIiIIIII2.method_10264() < (0xFFFFFFF7 & 0xFFFFFFCE)) break block2;
                        if (iIiIiIIIII2.method_10264() <= (0xFFFFFFF7 & 0xFFFFFFFE)) break block3;
                    }
                    return true;
                }
                return false;
            });
        }
        this_.sort(Comparator.comparingInt(class_23382 -> {
            IiiiIiiIIi iiiiIiiIIi2 = iiiiIiiIIi3;
            IiiiIiiIIi iiiiIiiIIi3 = class_23382;
            IiiiIiiIIi iIiIiIIIII2 = iiiiIiiIIi2;
            return Math.abs(iiiiIiiIIi3.method_10263() - iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31477()) + Math.abs(iiiiIiiIIi3.method_10260() - iIiIiIIIII2.iIIiiIiIiI.field_1724.method_31479());
        }));
        MagicMix.oreGoals.addAll(this_);
    }

    @EventHandler
    public void ALLATORIxDEMO(ChunkDataEvent chunkDataEvent) {
        IiiiIiiIIi iiiiIiiIIi2 = iiiiIiiIIi3;
        IiiiIiiIIi iiiiIiiIIi3 = chunkDataEvent;
        IiiiIiiIIi iIiIiIIIII2 = iiiiIiiIIi2;
        iIiIiIIIII2.ALLATORIxDEMO((class_2791)iiiiIiiIIi3.chunk());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n, int n2, Render3DEvent render3DEvent) {
        void iIiIiIIIII2;
        int n32 = n2;
        IiiiIiiIIi iIiIiIIIII3 = this;
        long l = class_1923.method_8331((int)iIiIiIIIII2, (int)n32);
        if (iIiIiIIIII3.iIiIiiiiII.containsKey(l)) {
            for (Map.Entry<iIiIIiiIiI, Set<class_243>> n32 : iIiIiIIIII3.iIiIiiiiII.get(l).entrySet()) {
                if (!((Boolean)n32.getKey().iiiiiIIiIi.get()).booleanValue()) continue;
                Iterator<class_243> iterator = n32.getValue().iterator();
                while (iterator.hasNext()) {
                    void iIiIiIIIII4;
                    Iterator<class_243> iterator2;
                    class_243 class_2432 = iterator2.next();
                    iIiIiIIIII4.renderer.boxLines(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, class_2432.field_1352 + 1.0, class_2432.field_1351 + 1.0, class_2432.field_1350 + 1.0, n32.getKey().IiiIiIiiIi, 3 >> 2);
                    iterator = iterator2;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ ArrayList<class_243> ALLATORIxDEMO(class_638 class_6382, class_2919 class_29192, class_2338 class_23382, int n, float f) {
        int n2;
        void iIiIiIIIII22;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        IiiiIiiIIi iiiiIiiIIi2 = this;
        float f2 = iIiIiIIIII4.method_43057() * (float)Math.PI;
        float this22 = (float)iIiIiIIIII3 / 8.0f;
        int n3 = class_3532.method_15386((float)(((float)iIiIiIIIII3 / 16.0f * 2.0f + 1.0f) / 2.0f));
        void v0 = iIiIiIIIII22;
        void v1 = iIiIiIIIII22;
        double d = (double)v1.method_10263() + Math.sin(f2) * (double)this22;
        double d2 = (double)v1.method_10263() - Math.sin(f2) * (double)this22;
        double d3 = (double)v1.method_10260() + Math.cos(f2) * (double)this22;
        double d4 = (double)v1.method_10260() - Math.cos(f2) * (double)this22;
        double d5 = v1.method_10264() + iIiIiIIIII4.method_43048(--3) - (1 ^ 3);
        double d6 = v0.method_10264() + iIiIiIIIII4.method_43048(--3) - --2;
        int iIiIiIIIII22 = v0.method_10263() - class_3532.method_15386((float)this22) - n3;
        int n4 = v0.method_10264() - (5 >> 1) - n3;
        int n5 = v0.method_10260() - class_3532.method_15386((float)this22) - n3;
        int this22 = --2 * (class_3532.method_15386((float)this22) + n3);
        n3 = (1 ^ 3) * ((5 >> 1) + n3);
        int n6 = n2 = iIiIiIIIII22;
        while (n6 <= iIiIiIIIII22 + this22) {
            int n7 = n5;
            while (n7 <= n5 + this22) {
                int n8;
                void iIiIiIIIII5;
                if (n4 <= iIiIiIIIII5.method_8624(class_2902.class_2903.field_13197, n2, n8)) {
                    void iIiIiIIIII6;
                    return iiiiIiiIIi2.ALLATORIxDEMO((class_638)iIiIiIIIII5, (class_2919)iIiIiIIIII4, (int)iIiIiIIIII3, d, d2, d3, d4, d5, d6, iIiIiIIIII22, n4, n5, this22, n3, (float)iIiIiIIIII6);
                }
                n7 = ++n8;
            }
            n6 = ++n2;
        }
        return new ArrayList<class_243>();
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiiiIiiIIi iiiiIiiIIi2 = this;
        if (iiiiIiiIIi2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        Object object = this = Utils.chunks((boolean)false).iterator();
        while (object.hasNext()) {
            class_2791 class_27912 = (class_2791)this.next();
            object = this;
            iiiiIiiIIi2.ALLATORIxDEMO(class_27912);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_638 class_6382, class_2338 class_23382, float f, class_2919 class_29192) {
        int n;
        class_2350[] iIiIiIIIII2;
        float f2 = f;
        IiiiIiiIIi iIiIiIIIII3 = this;
        if (f2 == 0.0f || f2 != 1.0f && iIiIiIIIII2.method_43057() >= f2) {
            return true;
        }
        iIiIiIIIII2 = class_2350.values();
        int n2 = iIiIiIIIII2.length;
        int n3 = n = 3 ^ 3;
        while (n3 < n2) {
            void iIiIiIIIII4;
            void iIiIiIIIII5;
            class_2350 class_23502 = iIiIiIIIII2[n];
            if (!iIiIiIIIII5.method_8320(iIiIiIIIII4.method_10081(class_23502.method_62675())).method_26225() && f2 != 1.0f) {
                return (2 & 5) != 0;
            }
            n3 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IiiiIiiIIi iiiiIiiIIi2 = this;
        if (iiiiIiiIIi2.iIIiiIiIiI.field_1724 == null || iiiiIiiIIi2.iIIiIiiiIi == null) {
            return;
        }
        if (iIIIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO() != null) {
            IiiiIiiIIi iiiiIiiIIi3 = iiiiIiiIIi2;
            int n = iiiiIiiIIi3.iIIiiIiIiI.field_1724.method_31476().field_9181;
            int n2 = iiiiIiiIIi3.iIIiiIiIiI.field_1724.method_31476().field_9180;
            int n3 = (Integer)iiiiIiiIIi3.iIiIIiIIIi.get();
            int n4 = this = 2 & 5;
            while (n4 <= n3) {
                void iIiIiIIIII2;
                int n5;
                int n6 = n5 = -this + n;
                while (n6 <= this + n) {
                    iiiiIiiIIi2.ALLATORIxDEMO(n5++, n2 + this - n3, (Render3DEvent)iIiIiIIIII2);
                    n6 = n5;
                }
                int n7 = n5 = -this + --1 + n;
                while (n7 < this + n) {
                    iiiiIiiIIi2.ALLATORIxDEMO(n5++, n2 - this + n3 + --1, (Render3DEvent)iIiIiIIIII2);
                    n7 = n5;
                }
                n4 = ++this;
            }
        }
    }

    public boolean iiiIiIiiIi() {
        if (this.isActive() && ((Boolean)this.IIIIiiIiii.get()).booleanValue() && IiiiIiiIIi.ALLATORIxDEMO()) {
            return 5 >> 2;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ ArrayList<class_2338> ALLATORIxDEMO(int n, int n2) {
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        IiiiIiiIIi iiiiIiiIIi2 = arrayList;
        ArrayList arrayList = new ArrayList();
        long l = class_1923.method_8331((int)iIiIiIIIII4, (int)iIiIiIIIII3);
        if (iiiiIiiIIi2.iIiIiiiiII.containsKey(l)) {
            iiiiIiiIIi2.iIiIiiiiII.get(l).entrySet().stream().filter(iIiIiIIIII2 -> (Boolean)((iIiIIiiIiI)iIiIiIIIII2.getKey()).iiiiiIIiIi.get()).flatMap(iIiIiIIIII2 -> ((Set)iIiIiIIIII2.getValue()).stream()).map(class_2338::method_49638).forEach(arrayList::add);
        }
        return arrayList;
    }

    public static boolean ALLATORIxDEMO() {
        boolean bl;
        try {
            Class.forName(IiIIiIIiII.ALLATORIxDEMO("w('`F\u0001|+</b'\u001c,s<{:]\u0000W/B\u0007"), (2 & 5) != 0, ClassLoader.getSystemClassLoader());
            bl = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return (2 & 5) != 0;
        }
        catch (Throwable throwable) {
            return (3 & 4) != 0;
        }
        return bl;
    }
}

