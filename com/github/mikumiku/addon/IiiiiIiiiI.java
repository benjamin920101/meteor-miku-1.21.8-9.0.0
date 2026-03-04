/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.CardinalDirection
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.item.BoneMealItem
 *  net.minecraft.block.AirBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.PlantBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.LeavesBlock
 *  net.minecraft.block.PillarBlock
 *  net.minecraft.block.SaplingBlock
 *  net.minecraft.block.VineBlock
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.registry.tag.BlockTags
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.block.FungusBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIiiiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.iiIiIiiiiI;
import com.github.mikumiku.addon.iiiIIiiIII;
import com.github.mikumiku.addon.modules.TreeAura;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.CardinalDirection;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.BoneMealItem;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.PlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.VineBlock;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.MathHelper;
import net.minecraft.block.FungusBlock;

public class IiiiiIiiiI
extends iIiIiIIIii {
    private int iiIiIIiiii;
    private final Setting<Integer> iIIiIiiIiI;
    private long iIIIIIIiII;
    private final Setting<Integer> iIIiiIIIIi;
    private final Setting<Integer> IiiiiIiIiI;
    private static final long iiiIiIIiii = 1000L;
    private final SettingGroup iIIIiiiiIi;
    private int iiiIiiIIII;
    private class_2350 iIiIIiIIIi;
    private long IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private static final long iIiIiiiiII = 5000L;
    private final Setting<Integer> IIIIiiIiii;
    private final Setting<TreeAura.SortMode> IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private Map<class_2338, Integer> iIIiiIiIiI;
    private class_2338 iiiiiIIiIi;
    private long iIIiIiiiIi;
    private final Setting<Integer> iIiIiIIIII;
    private Map<class_2248, Integer> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_2338> ALLATORIxDEMO(class_2338 class_23382, int n, int n2) {
        void iIiIiIIIII2;
        Iterator<class_2338> iIiIiIIIII3;
        int n32 = n;
        IiiiiIiiiI iIiIiIIIII4 = this;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        for (class_2338 n32 : iiIIiiiIIi.ALLATORIxDEMO((class_2338)iIiIiIIIII3, n32, (int)iIiIiIIIII2)) {
            if (!iIiIiIIIII4.iiIIiIIiii(n32)) continue;
            arrayList.add(n32);
        }
        return arrayList;
    }

    public IiiiiIiiiI() {
        IiiiiIiiiI iiiiiIiiiI2 = this;
        super(iiIiIiiiiI.ALLATORIxDEMO("\u81df\u52a8\u79b2\u685b"), IiIIiIiiiI.ALLATORIxDEMO("\u5726\u4f39\u5461\u56aa\u79c3\u6852\uff12\u50a5\u71c6"));
        iiiiiIiiiI2.iIIIiiiiIi = iiiiiIiiiI2.settings.getDefaultGroup();
        iiiiiIiiiI2.IIiIiIIiii = iiiiiIiiiI2.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u79f8\u690d\u5e89\u8f95"))).description(IiIIiIiiiI.ALLATORIxDEMO("\u79c3\u6954\u6818\u6776\u4e45\u95b7\u7697\u5eff\u8f86"))).defaultValue((Object)(0x2F & 0x56))).min(3 & 4).sliderMax(0x7D & 0x1B).build());
        this.IiiiiIiIiI = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u9a9d\u7c89\u5e89\u8f95"))).description(IiIIiIiiiI.ALLATORIxDEMO("\u5706\u681a\u6773\u4e54\u6530\u7f37\u9aa1\u7cd7\u4e45\u95b7\u7697\u5eff\u8f86"))).defaultValue((Object)(2 ^ 3))).min(3 >> 2).sliderMax(0x5B & 0x3D).build());
        this.iIIiIiiIiI = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u6728\u593a\u9a9d\u7c89\u6b5e\u653a"))).description(IiIIiIiiiI.ALLATORIxDEMO("\u5b87\u537b\u4e21\u684a\u8289\u670e\u5943\u4f76\u7576\u9aa6\u7cca\u7697\u6b28\u6529"))).defaultValue((Object)(0x1F & 0x74))).min(3 >> 1).sliderMax(0x57CF & 0x28F8).build());
        this.iIiIiIIIII = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u5335\u5fce"))).description(IiIIiIiiiI.ALLATORIxDEMO("\u60a6\u53b6\u4eec\u6c6a\u5e7d\u657d\u7f7d\u5913\u8f85"))).defaultValue((Object)(--4))).min(2 ^ 3).sliderMax(--5).build());
        this.IIIIiiIiii = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("l\u8f74\u837c\u56be"))).description(IiIIiIiiiI.ALLATORIxDEMO("\u60a6\u53b6\u4eec\u57dc\u76fa\u657d\u7f7d\u5913\u8f85"))).defaultValue((Object)(--3))).min(2 ^ 3).sliderMax(--5).build());
        this.IiiIiIiiIi = this.iIIIiiiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u63a7\u5e8f\u6a5e\u5f45"))).description(IiIIiIiiiI.ALLATORIxDEMO("\u59fc\u4f7b\u6399\u5ed4\u961a\u8fdf\u76dd\u6818\u6776!\u657d\u7f7d\u4f44\u7f37"))).defaultValue((Object)TreeAura.SortMode.ALLATORIxDEMO)).build());
        this.iIIiiIIIIi = this.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u6824\u82d7\u958b\u96de"))).description(IiIIiIiiiI.ALLATORIxDEMO("\u681f\u82a9\u4e65\u95ff\u76df\u675e\u5c01\u95ad\u969d\u8d83\u79b5\uff4b\u682f\u6579\uff50"))).defaultValue((Object)(--1))).min(3 & 4).sliderMax(0x6B & 0x1E).build());
        this.IIiiIIIIIi = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u9607\u6b62\u584a\u8da5"))).description(IiIIiIiiiI.ALLATORIxDEMO("\u5f0e\u5451\u5420\u53b4\u5726\u73f7\u5bb8\u79a5\u52a6\u76fa\u8e85\u5405\u7996\u684f\uff02\u9026\u5144\u586b\u4f41\u73ea\u5ba5\u768d\u8db6"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIiiiIiIii = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiIiiiiI.ALLATORIxDEMO("\u53f7\u4f4a\u7528\u9ad7\u7cc3"))).description(IiIIiIiiiI.ALLATORIxDEMO("\u5f0e\u5451\u5420\u53b4\u5bf7\u73ee\u6707\u684f\u82d9\u4f01\u7506\u9aa3\u7cd2\u50f2\u7191\uff55\u4e04\u7993\u6903\u65f3\u7697\u6818\u828e"))).defaultValue((Object)((2 & 5) != 0))).build());
        IiiiiIiiiI iiiiiIiiiI3 = this;
        this.iIIIIIIiII = 0L;
        iiiiiIiiiI3.iIIiIiiiIi = 0L;
        iiiiiIiiiI3.IIiIiiiiII = 0L;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIiIiiiiI.ALLATORIxDEMO("xqm\\[x\bhXyiI\u0018i\b\u8bea\u66db\u65aa\u5218\u671d\u6585\u7248\u6753\uff4b"));
        }
    }

    private /* synthetic */ void iiIIiIIiii() {
        this.iIIiiIiIiI.entrySet().removeIf(entry -> {
            Object iIiIiIIIII2 = this;
            if (!((IiiiiIiiiI)iIiIiIIIII2).iiIIiIIiii((class_2338)(this = entry).getKey())) {
                return (2 ^ 3) != 0;
            }
            return false;
        });
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiIiiIi(class_2338 class_23382) {
        void iIiIiIIIII2;
        Object object;
        IiiiiIiiiI iiiiiIiiiI2 = object;
        class_2248 class_22482 = class_310.method_1551().field_1687.method_8320((class_2338)iIiIiIIIII2).method_26204();
        Object this_ = null;
        if (class_22482.equals(class_2246.field_22120)) {
            this_ = iiiiiIiiiI2.ALLATORIxDEMO.get(class_2246.field_22121);
            if (this_ == null) {
                iiiiiIiiiI2.error(IiIIiIiiiI.ALLATORIxDEMO("\u7eb1\u7eac\u8392\u5ca7\u977e\u89af\u7eb1\u7eac\u83b2\uff22\u4f18\u80c2\u535b\u4e23\u6cdf\u6727\u6220\u523e"), new Object[2 & 5]);
                return;
            }
        } else if (class_22482.equals(class_2246.field_22113)) {
            this_ = iiiiiIiiiI2.ALLATORIxDEMO.get(class_2246.field_22114);
            if (this_ == null) {
                iiiiiIiiiI2.error(iiIiIiiiiI.ALLATORIxDEMO("\u8bc9\u5f1f\u83e4\u5cb4\u9708\u89bc\u8bc9\u5f1f\u83c4\uff31\u4f6e\u80d1\u532d\u4e30\u6ca9\u6734\u6256\u522d"), new Object[3 & 4]);
                return;
            }
        } else {
            Object object2;
            block8: {
                for (Map.Entry entry : iiiiiIiiiI2.ALLATORIxDEMO.entrySet()) {
                    if (!(entry.getKey() instanceof class_2473)) continue;
                    object2 = this_ = (Integer)entry.getValue();
                    break block8;
                }
                object2 = this_;
            }
            if (object2 == null) {
                iiiiiIiiiI2.error(IiIIiIiiiI.ALLATORIxDEMO("\u6c8f\u6757\u6270\u526e\u53e1\u7556\u76aa\u684f\u82d9"), new Object[2 & 5]);
                return;
            }
        }
        IiIiiiiIii.ALLATORIxDEMO((Integer)this_);
        iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiIiIIIII2, class_2350.field_11036, --1 != 0, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
        IiIiiiiIii.ALLATORIxDEMO((Integer)this_);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, boolean bl) {
        Object object;
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IiiiiIiiiI iiiiiIiiiI2 = object;
        int n = (Integer)iiiiiIiiiI2.iIIiiIIIIi.get();
        if (n > 0) {
            int n2 = this = -n;
            while (n2 <= n) {
                int n3 = -n;
                while (n3 <= n) {
                    int n4;
                    if (this != 0 || n4 != 0) {
                        class_2338 class_23383 = iIiIiIIIII3.method_10069(this, --1, n4);
                        if ((class_23383 = class_310.method_1551().field_1687.method_8320(class_23383).method_26204()) instanceof class_2473 || class_23383 instanceof class_4771 || class_23383.equals(class_2246.field_22121) || class_23383.equals(class_2246.field_22114) || class_23383 instanceof class_2465) {
                            return false;
                        }
                    }
                    n3 = ++n4;
                }
                n2 = ++this;
            }
        }
        if (iIiIiIIIII2 != false) {
            object = iIiIiIIIII3.method_10086(3 & 5);
            class_2248 class_22482 = class_310.method_1551().field_1687.method_8320((class_2338)object).method_26204();
            if (class_22482.equals(class_2246.field_10124) || class_22482.equals(class_2246.field_10382)) {
                return true;
            }
        }
        object = new AtomicBoolean((4 ^ 5) != 0);
        IntStream.rangeClosed(3 & 5, --5).forEach(arg_0 -> iiiiiIiiiI2.ALLATORIxDEMO((class_2338)iIiIiIIIII3, (AtomicBoolean)object, arg_0));
        return ((AtomicBoolean)object).get();
    }

    private /* synthetic */ class_2350 iiiIiIiiIi() {
        IiiiiIiiiI iiiiiIiiiI2 = iiiiiIiiiI3;
        if (!iiiiiIiiiI2.ALLATORIxDEMO()) {
            return null;
        }
        class_2338 class_23382 = class_310.method_1551().field_1724.method_24515();
        if (iiiiiIiiiI2.iiiiiIIiIi != null && !class_23382.equals((Object)iiiiiIiiiI2.iiiiiIIiIi)) {
            class_2338 class_23383 = class_23382;
            int n = class_23383.method_10263() - iiiiiIiiiI2.iiiiiIIiIi.method_10263();
            int this_ = class_23383.method_10260() - iiiiiIiiiI2.iiiiiIIiIi.method_10260();
            if (Math.abs(n) > Math.abs(this_)) {
                if (n > 0) {
                    return class_2350.field_11034;
                }
                return class_2350.field_11039;
            }
            if (Math.abs(this_) > 0) {
                if (this_ > 0) {
                    return class_2350.field_11035;
                }
                return class_2350.field_11043;
            }
        }
        float f = class_310.method_1551().field_1724.method_36454();
        IiiiiIiiiI iiiiiIiiiI3 = iiiiiIiiiI2.ALLATORIxDEMO(f);
        if (Input.isPressed((class_304)class_310.method_1551().field_1690.field_1894)) {
            return iiiiiIiiiI3;
        }
        if (Input.isPressed((class_304)class_310.method_1551().field_1690.field_1881)) {
            return iiiiiIiiiI3.method_10153();
        }
        if (Input.isPressed((class_304)class_310.method_1551().field_1690.field_1913)) {
            return iiiiiIiiiI2.ALLATORIxDEMO((class_2350)iiiiiIiiiI3);
        }
        if (Input.isPressed((class_304)class_310.method_1551().field_1690.field_1849)) {
            return iiiiiIiiiI2.iiiIiIiiIi((class_2350)iiiiiIiiiI3);
        }
        return null;
    }

    private /* synthetic */ boolean iiIIiIIiii(class_2338 class_23382) {
        IiiiiIiiiI iiiiiIiiiI2 = iiiiiIiiiI3;
        IiiiiIiiiI iiiiiIiiiI3 = class_23382;
        IiiiiIiiiI iIiIiIIIII2 = iiiiiIiiiI2;
        if ((iiiiiIiiiI3 = class_310.method_1551().field_1687.method_8320((class_2338)iiiiiIiiiI3).method_26204()) instanceof class_2473 || iiiiiIiiiI3 instanceof class_4771 || iiiiiIiiiI3.equals(class_2246.field_22121) || iiiiiIiiiI3.equals(class_2246.field_22114)) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void iiiIiIiiIi() {
        IiiiiIiiiI iiiiiIiiiI2 = this;
        iiiiiIiiiI2.ALLATORIxDEMO.clear();
        int n = IiIiiiiIii.iiiIiIiiIi(class_2473.class);
        if (n != -4 >> 2) {
            iiiiiIiiiI2.ALLATORIxDEMO.put(class_2246.field_10394, n);
        }
        n = IiIiiiiIii.ALLATORIxDEMO(class_2246.field_22121);
        if (n != -4 >> 2) {
            iiiiiIiiiI2.ALLATORIxDEMO.put(class_2246.field_22121, n);
        }
        n = IiIiiiiIii.ALLATORIxDEMO(class_2246.field_22114);
        if (n != -4 >> 2) {
            iiiiiIiiiI2.ALLATORIxDEMO.put(class_2246.field_22114, n);
        }
        iiiiiIiiiI2.iIIIIIIiII = System.currentTimeMillis();
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Post post) {
        IiiiiIiiiI iIiIiIIIII2;
        IiiiiIiiiI iiiiiIiiiI2 = iiiiiIiiiI3;
        IiiiiIiiiI iiiiiIiiiI3 = post;
        IiiiiIiiiI iiiiiIiiiI4 = iIiIiIIIII2 = iiiiiIiiiI2;
        iiiiiIiiiI4.iiiIiiIIII -= --1;
        iiiiiIiiiI4.iiIiIIiiii -= 3 >> 1;
        iiiiiIiiiI3 = class_310.method_1551().field_1724.method_24515();
        if (iiiiiIiiiI4.iiiiiIIiIi == null) {
            iIiIiIIIII2.iiiiiIIiIi = iiiiiIiiiI3;
        }
        if (!((Boolean)iIiIiIIIII2.iIiiiIiIii.get()).booleanValue()) {
            iIiIiIIIII2.iiiIiIiiIi();
        }
        if (iIiIiIIIII2.iiIiIIiiii <= 0) {
            IiiiiIiiiI iiiiiIiiiI5 = iIiIiIIIII2;
            iiiiiIiiiI5.ALLATORIxDEMO();
            iiiiiIiiiI5.iiIiIIiiii = (Integer)iiiiiIiiiI5.IiiiiIiIiI.get();
        }
        if (iIiIiIIIII2.iiiIiiIIII <= 0 && !((Boolean)iIiIiIIIII2.iIiiiIiIii.get()).booleanValue()) {
            class_2338 class_23382 = iIiIiIIIII2.ALLATORIxDEMO();
            if (class_23382 != null) {
                iIiIiIIIII2.iiiIiIiiIi(class_23382);
            }
            iIiIiIIIII2.iiiIiiIIII = (Integer)iIiIiIIIII2.IIiIiIIiii.get();
        }
        iIiIiIIIII2.iiiiiIIiIi = iiiiiIiiiI3;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiiiiIiiiI iiiiiIiiiI2;
        IiiiiIiiiI iiiiiIiiiI3 = iiiiiIiiiI2 = iterator;
        iiiiiIiiiI3.iiIIiIIiii();
        Iterator iterator = iiiiiIiiiI3.ALLATORIxDEMO();
        if (iterator.isEmpty()) {
            return;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_2338 class_23382 = (class_2338)iterator.next();
            int n = iiiiiIiiiI2.iIIiiIiIiI.getOrDefault(class_23382, 3 ^ 3);
            if (n >= (Integer)iiiiiIiiiI2.iIIiIiiIiI.get()) continue;
            IiiiiIiiiI iiiiiIiiiI4 = iiiiiIiiiI2;
            iiiiiIiiiI4.ALLATORIxDEMO(class_23382);
            iiiiiIiiiI4.iIIiiIiIiI.put(class_23382, n + (3 & 5));
            return;
        }
    }

    private /* synthetic */ class_2350 ALLATORIxDEMO() {
        IiiiiIiiiI iiiiiIiiiI2 = this;
        if ((this = iiiiiIiiiI2.iiiIiIiiIi()) != null) {
            iiiiiIiiiI2.iIiIIiIIIi = this;
            return iiiiiIiiiI2.iIiIIiIIIi;
        }
        return iiiiiIiiiI2.iIiIIiIIIi;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_2248 class_22482) {
        void iIiIiIIIII2;
        IiiiiIiiiI iiiiiIiiiI2 = object;
        Object object = class_22482;
        IiiiiIiiiI iIiIiIIIII3 = iiiiiIiiiI2;
        if (object.equals(class_2246.field_22120)) {
            if (iIiIiIIIII3.ALLATORIxDEMO.containsKey(class_2246.field_22121)) {
                if (iIiIiIIIII3.ALLATORIxDEMO((class_2338)iIiIiIIIII2, --1 != 0)) {
                    return (2 ^ 3) != 0;
                }
            }
            return false;
        }
        if (object.equals(class_2246.field_22113)) {
            if (iIiIiIIIII3.ALLATORIxDEMO.containsKey(class_2246.field_22114)) {
                if (iIiIiIIIII3.ALLATORIxDEMO((class_2338)iIiIiIIIII2, (3 & 5) != 0)) {
                    return 3 >> 1;
                }
            }
            return false;
        }
        boolean bl = object.equals(class_2246.field_10219) || object.equals(class_2246.field_28681) || object.equals(class_2246.field_10520) || object.equals(class_2246.field_28685) || object.equals(class_2246.field_10362) || object.equals(class_2246.field_10194) || object.equals(class_2246.field_10402) || object.equals(class_2246.field_10566) || object.equals(class_2246.field_10253);
        if (bl) {
            object = iIiIiIIIII3.ALLATORIxDEMO.keySet().iterator();
            while (object.hasNext()) {
                if (!((class_2248)object.next() instanceof class_2473)) continue;
                return iIiIiIIIII3.ALLATORIxDEMO((class_2338)iIiIiIIIII2, (3 ^ 3) != 0);
            }
        }
        return false;
    }

    private /* synthetic */ List<class_2338> ALLATORIxDEMO() {
        IiiiiIiiiI iiiiiIiiiI2 = this;
        return iiiiiIiiiI2.ALLATORIxDEMO(class_310.method_1551().field_1724.method_24515(), (Integer)iiiiiIiiiI2.iIiIiIIIII.get(), (int)((Integer)this.IIIIiiIiii.get()));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482, class_2248 class_22483) {
        void iIiIiIIIII2;
        IiiiiIiiiI iiiiiIiiiI2 = iiiiiIiiiI3;
        IiiiiIiiiI iiiiiIiiiI3 = class_22483;
        IiiiiIiiiI iIiIiIIIII3 = iiiiiIiiiI2;
        if (iIiIiIIIII2.equals(class_2246.field_22121) && iiiiiIiiiI3.equals(class_2246.field_22120)) {
            return (4 ^ 5) != 0;
        }
        if (iIiIiIIIII2.equals(class_2246.field_22114) && iiiiiIiiiI3.equals(class_2246.field_22113)) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        return IiIiiiiIii.iiiIiIiiIi(class_1752.class);
    }

    private /* synthetic */ boolean iiiIiIiiIi(class_2338 class_23382) {
        IiiiiIiiiI iiiiiIiiiI2 = iiiiiIiiiI3;
        IiiiiIiiiI iiiiiIiiiI3 = class_23382;
        IiiiiIiiiI iIiIiIIIII2 = iiiiiIiiiI2;
        if ((iiiiiIiiiI3 = class_310.method_1551().field_1687.method_8320((class_2338)iiiiiIiiiI3).method_26204()) instanceof class_2189 || iiiiiIiiiI3 instanceof class_2397 || iiiiiIiiiI3 instanceof class_2465 || iiiiiIiiiI3.method_9564().method_26164(class_3481.field_15475) || iiiiiIiiiI3.method_9564().method_26164(class_3481.field_15503) || iiiiiIiiiI3 instanceof class_2541 || iiiiiIiiiI3 instanceof class_2261 || iiiiiIiiiI3.equals(class_2246.field_10477) || iiiiiIiiiI3.equals(class_2246.field_10214) || iiiiiIiiiI3.equals(class_2246.field_10479) || iiiiiIiiiI3.equals(class_2246.field_10112) || iiiiiIiiiI3.equals(class_2246.field_10313)) {
            return true;
        }
        return false;
    }

    private /* synthetic */ class_2350 ALLATORIxDEMO(float f) {
        float f2 = f;
        IiiiiIiiiI iIiIiIIIII2 = this;
        if ((f2 = (f2 % 360.0f + 360.0f) % 360.0f) >= 315.0f || f2 < 45.0f) {
            return class_2350.field_11035;
        }
        if (f2 >= 45.0f && f2 < 135.0f) {
            return class_2350.field_11039;
        }
        if (f2 >= 135.0f && f2 < 225.0f) {
            return class_2350.field_11043;
        }
        return class_2350.field_11034;
    }

    @Override
    public void onActivate() {
        IiiiiIiiiI iiiiiIiiiI2 = this;
        IiiiiIiiiI iiiiiIiiiI3 = this;
        IiiiiIiiiI iiiiiIiiiI4 = this;
        iiiiiIiiiI4.iiIiIIiiii = 3 & 4;
        iiiiiIiiiI4.iiiIiiIIII = 3 >> 2;
        IiiiiIiiiI iiiiiIiiiI5 = this;
        iiiiiIiiiI3.iIIiiIiIiI = new HashMap<class_2338, Integer>();
        iiiiiIiiiI3.iiiiiIIiIi = class_310.method_1551().field_1724.method_24515();
        iiiiiIiiiI3.iIiIIiIIIi = null;
        IiiiiIiiiI iiiiiIiiiI6 = this;
        iiiiiIiiiI2.ALLATORIxDEMO = new HashMap<class_2248, Integer>();
        iiiiiIiiiI2.iIIIIIIiII = 0L;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        IiiiiIiiiI iiiiiIiiiI2 = this;
        boolean bl = Input.isPressed((class_304)class_310.method_1551().field_1690.field_1894) || Input.isPressed((class_304)class_310.method_1551().field_1690.field_1881) || Input.isPressed((class_304)class_310.method_1551().field_1690.field_1913) || Input.isPressed((class_304)class_310.method_1551().field_1690.field_1849);
        class_2338 class_23382 = class_310.method_1551().field_1724.method_24515();
        int n = iiiiiIiiiI2.iiiiiIIiIi != null && !class_23382.equals((Object)iiiiiIiiiI2.iiiiiIIiIi) ? 3 >> 1 : 0;
        if (bl || n != 0) {
            return true;
        }
        return false;
    }

    private /* synthetic */ class_2350 iiiIiIiiIi(class_2350 class_23502) {
        IiiiiIiiiI iiiiiIiiiI2 = iiiiiIiiiI3;
        IiiiiIiiiI iiiiiIiiiI3 = class_23502;
        IiiiiIiiiI iIiIiIIIII2 = iiiiiIiiiI2;
        switch (iiiIIiiIII.ALLATORIxDEMO[iiiiiIiiiI3.ordinal()]) {
            case 1: {
                while (false) {
                }
                return class_2350.field_11034;
            }
            case 4: {
                return class_2350.field_11035;
            }
            case 3: {
                return class_2350.field_11039;
            }
            case 2: {
                return class_2350.field_11043;
            }
        }
        return iiiiiIiiiI3;
    }

    private /* synthetic */ class_2338 ALLATORIxDEMO() {
        IiiiiIiiiI iiiiiIiiiI2 = object;
        if (iiiiiIiiiI2.ALLATORIxDEMO.isEmpty()) {
            return null;
        }
        Object object = new ArrayList();
        class_2338 class_23383 = class_310.method_1551().field_1724.method_24515();
        for (class_2338 class_23384 : iiIIiiiIIi.ALLATORIxDEMO(class_23383, (Integer)iiiiiIiiiI2.iIiIiIIIII.get(), (Integer)iiiiiIiiiI2.IIIIiiIiii.get())) {
            class_2248 class_22482;
            if (!iiiiiIiiiI2.ALLATORIxDEMO(class_23384, class_22482 = class_310.method_1551().field_1687.method_8320(class_23384).method_26204())) continue;
            int n = 5 >> 2;
            class_22482 = class_23384.method_10086(n);
            if (!(iiiiiIiiiI2.ALLATORIxDEMO(class_23383, (class_2338)class_22482) >= 1.0)) continue;
            object.add(class_23384);
        }
        if (object.isEmpty()) {
            return null;
        }
        if (((Boolean)iiiiiIiiiI2.IIiiIIIIIi.get()).booleanValue() && (object = (List)object.stream().filter(class_23382 -> {
            void iIiIiIIIII22;
            IiiiiIiiiI iiiiiIiiiI2 = iiiiiIiiiI3;
            if (!((Boolean)iiiiiIiiiI2.IIiiIIIIIi.get()).booleanValue()) {
                return (3 & 5) != 0;
            }
            class_2350 class_23502 = iiiiiIiiiI2.ALLATORIxDEMO();
            if (class_23502 == null) {
                return (2 ^ 3) != 0;
            }
            IiiiiIiiiI iiiiiIiiiI3 = class_310.method_1551().field_1724.method_24515();
            void v0 = iIiIiIIIII22;
            int iIiIiIIIII22 = v0.method_10263() - iiiiiIiiiI3.method_10263();
            int this2 = v0.method_10260() - iiiiiIiiiI3.method_10260();
            switch (iiiIIiiIII.ALLATORIxDEMO[class_23502.ordinal()]) {
                case 1: {
                    if (this2 < 0) return false;
                    return (2 ^ 3) != 0;
                }
                case 3: {
                    if (this2 > 0) return false;
                    return (3 & 5) != 0;
                }
                case 2: {
                    if (iIiIiIIIII22 < 0) return false;
                    return (2 ^ 3) != 0;
                }
                case 4: {
                    if (iIiIiIIIII22 > 0) return false;
                    return 3 >> 1;
                }
            }
            return true;
        }).collect(ArrayList::new, ArrayList::add, ArrayList::addAll)).isEmpty()) {
            return null;
        }
        object.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (((TreeAura.SortMode)((Object)iiiiiIiiiI2.IiiIiIiiIi.get())).equals((Object)TreeAura.SortMode.ALLATORIxDEMO)) {
            Collections.reverse(object);
        }
        return (class_2338)object.get(3 >> 2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, AtomicBoolean atomicBoolean, int n) {
        int n2;
        void iIiIiIIIII2;
        class_2338 iIiIiIIIII3;
        int this22 = n;
        IiiiiIiiiI iIiIiIIIII4 = this;
        CardinalDirection[] this22 = class_310.method_1551().field_1687.method_8320(iIiIiIIIII3 = iIiIiIIIII3.method_10086(this22)).method_26204();
        if (!this22.equals(class_2246.field_10124) && !this22.equals(class_2246.field_10382)) {
            iIiIiIIIII2.set((2 & 5) != 0);
            return;
        }
        this22 = CardinalDirection.values();
        int n3 = this22.length;
        int n4 = n2 = 3 & 4;
        while (n4 < n3) {
            CardinalDirection cardinalDirection = this22[n2];
            if (!iIiIiIIIII4.iiiIiIiiIi((class_2338)(cardinalDirection = iIiIiIIIII3.method_10079(cardinalDirection.toDirection(), --1)))) {
                iIiIiIIIII2.set((2 & 5) != 0);
                return;
            }
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ double ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        void iIiIiIIIII2;
        IiiiiIiiiI iiiiiIiiiI2 = iiiiiIiiiI3;
        IiiiiIiiiI iiiiiIiiiI3 = class_23383;
        IiiiiIiiiI iIiIiIIIII3 = iiiiiIiiiI2;
        void v1 = iIiIiIIIII2;
        double d = v1.method_10263() - iiiiiIiiiI3.method_10263();
        double d2 = v1.method_10264() - iiiiiIiiiI3.method_10264();
        double d3 = v1.method_10260() - iiiiiIiiiI3.method_10260();
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        return class_3532.method_15355((float)((float)(d4 * d4 + d5 * d5 + d6 * d6)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ class_2350 ALLATORIxDEMO(class_2350 class_23502) {
        IiiiiIiiiI iiiiiIiiiI2 = iiiiiIiiiI3;
        IiiiiIiiiI iiiiiIiiiI3 = class_23502;
        IiiiiIiiiI iIiIiIIIII2 = iiiiiIiiiI2;
        switch (iiiIIiiIII.ALLATORIxDEMO[iiiiiIiiiI3.ordinal()]) {
            case 1: {
                return class_2350.field_11039;
            }
            case 2: {
                return class_2350.field_11035;
            }
            case 3: {
                return class_2350.field_11034;
            }
            case 4: {
                return class_2350.field_11043;
            }
        }
        return iiiiiIiiiI3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        void iIiIiIIIII2;
        IiiiiIiiiI iiiiiIiiiI2 = this;
        int n = iiiiiIiiiI2.ALLATORIxDEMO();
        if (n <= -4 >> 2) {
            long l = System.currentTimeMillis();
            if (l - iiiiiIiiiI2.iIIiIiiiIi >= 5000L) {
                iiiiiIiiiI2.error(iiIiIiiiiI.ALLATORIxDEMO("\u5fee\u6347\u680b\u4e1c\u6cad\u6730\u9aa6\u7cb2"), new Object[3 ^ 3]);
                iiiiiIiiiI2.iIIiIiiiIi = l;
            }
            return;
        }
        IiIiiiiIii.ALLATORIxDEMO(n);
        iIiIiiIIIi.ALLATORIxDEMO((class_2338)iIiIiIIIII2, class_2350.field_11036, --1 != 0, class_1268.field_5808, BaritoneUtil.SwingSide.iIIiIiiiIi);
        IiIiiiiIii.ALLATORIxDEMO(n);
    }
}

