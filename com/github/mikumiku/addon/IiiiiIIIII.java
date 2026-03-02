/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalXZ
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalXZ;
import com.github.mikumiku.addon.IIIIIIiiII;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.modules.NetherSearchArea;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_2338;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiiIIIII
extends iIiIiIIIii {
    private boolean iIIIiiiiIi;
    private final Setting<Integer> iiiIiiIIII;
    private boolean iIiIIiIIIi;
    private final Setting<Integer> IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private int iIiiiIiIii;
    private class_2338 iIiIiiiiII;
    private final Setting<NetherSearchArea.SearchShape> IIIIiiIiii;
    private class_2338 IiiIiIiiIi;
    private int IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private final Setting<NetherSearchArea.SearchMode> iiiiiIIiIi;
    private final SettingGroup iIIiIiiiIi;
    private List<class_2338> iIiIiIIIII;
    private final Setting<Integer> ALLATORIxDEMO;

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        IiiiiIIIII iiiiiIIIII = iiiiiIIIII2;
        IiiiiIIIII iiiiiIIIII2 = class_23382;
        IiiiiIIIII iIiIiIIIII2 = iiiiiIIIII;
        if (iIiIiIIIII2.iIiIiiiiII != null && iIiIiIIIII2.iIiIiiiiII.method_10263() == iiiiiIIIII2.method_10263() && iIiIiIIIII2.iIiIiiiiII.method_10260() == iiiiiIIIII2.method_10260()) {
            return;
        }
        iIiIiIIIII2.iIiIiiiiII = iiiiiIIIII2;
        try {
            BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().pathTo((Goal)new GoalXZ(iiiiiIIIII2.method_10263(), iiiiiIIIII2.method_10260()));
            return;
        }
        catch (Exception this2) {
            ChatUtils.error((String)("\u5bfb\u8def\u5931\u8d25: " + this2.getMessage()), (Object[])new Object[2 & 5]);
            return;
        }
    }

    private /* synthetic */ void IIIIiIIiII() {
        if (this.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        IiiiiIIIII iiiiiIIIII = this;
        this.IiiIiIiiIi = this.iIIiiIiIiI.field_1724.method_24515();
        this.iiiIiIiiIi();
        this.IIiIiIIiii = 2 & 5;
        iiiiiIIIII.iIiiiIiIii = this.IIiIiIIiii;
        iiiiiIIIII.iIiIIiIIIi = 2 ^ 3;
        ChatUtils.info((String)("\u5f00\u59cb\u5730\u72f1\u641c\u7d22\uff0c\u5171 " + this.iIiIiIIIII.size() + " \u4e2a\u70b9\uff0c\u4f7f\u7528 " + ((NetherSearchArea.SearchMode)((Object)this.iiiiiIIiIi.get())).name() + " \u6a21\u5f0f + " + ((NetherSearchArea.SearchShape)((Object)this.IIIIiiIiii.get())).name() + " \u5f62\u72b6\u3002"), (Object[])new Object[3 ^ 3]);
        if (!this.iIiIiIIIII.isEmpty()) {
            IiiiiIIIII iiiiiIIIII2 = this;
            iiiiiIIIII2.ALLATORIxDEMO(iiiiiIIIII2.iIiIiIIIII.get(3 ^ 3));
        }
    }

    public void onDeactivate() {
        IiiiiIIIII iiiiiIIIII = this;
        iiiiiIIIII.ALLATORIxDEMO();
        iiiiiIIIII.iiIIiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        void iIiIiIIIII2;
        class_243 class_2432;
        IiiiiIIIII iiiiiIIIII = iiiiiIIIII2;
        if (iiiiiIIIII.iIIiiIiIiI.field_1724 == null) {
            return 3 >> 2;
        }
        IiiiiIIIII iiiiiIIIII2 = iiiiiIIIII.iIIiiIiIiI.field_1724.method_19538();
        if (Math.sqrt(Math.pow(class_2432.field_1352 - (double)iIiIiIIIII2.method_10263(), 2.0) + Math.pow(((class_243)iiiiiIIIII2).field_1350 - (double)iIiIiIIIII2.method_10260(), 2.0)) < (double)((Integer)iiiiiIIIII.ALLATORIxDEMO.get()).intValue()) {
            return 3 >> 1;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiiiiIIIII iiiiiIIIII = iiiiiIIIII2;
        IiiiiIIIII iiiiiIIIII2 = pre;
        IiiiiIIIII iIiIiIIIII2 = iiiiiIIIII;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        if (((Boolean)iIiIiIIIII2.IIiiIIIIIi.get()).booleanValue() && !iIiIiIIIII2.iIIIiiiiIi && iIiIiIIIII2.iiiIiIiiIi() && !iIiIiIIIII2.isActive()) {
            iIiIiIIIII2.toggle();
            return;
        }
        IiiiiIIIII iiiiiIIIII3 = iIiIiIIIII2;
        iiiiiIIIII3.iIIIiiiiIi = iiiiiIIIII3.iiiIiIiiIi();
        if (!iiiiiIIIII3.iiiIiIiiIi() && iIiIiIIIII2.isActive()) {
            ChatUtils.warning((String)IIIIIIiiII.iiIIiIIiii("\u79d8\u5f06\u4ec5\u5736\u72b2\uff0a\u501f\u6b64\u645f\u7d24\u3041"), (Object[])new Object[2 & 5]);
            iIiIiIIIII2.toggle();
            return;
        }
        if (!iIiIiIIIII2.iIiIIiIIIi) {
            return;
        }
        IiiiiIIIII iiiiiIIIII4 = iIiIiIIIII2;
        iiiiiIIIII4.iIiiiIiIii += 4 ^ 5;
        if (iiiiiIIIII4.iIiiiIiIii < (Integer)iIiIiIIIII2.IIiIiiiiII.get()) {
            return;
        }
        iIiIiIIIII2.iIiiiIiIii = 3 ^ 3;
        if (iIiIiIIIII2.iIiIiIIIII == null || iIiIiIIIII2.iIiIiIIIII.isEmpty()) {
            ChatUtils.error((String)IiIiiiIIIi.ALLATORIxDEMO("\u677d\u7577\u6246\u647c\u7d7c\u70db\uff5d"), (Object[])new Object[5 >> 3]);
            iIiIiIIIII2.toggle();
            return;
        }
        IiiiiIIIII iiiiiIIIII5 = iIiIiIIIII2;
        if (iiiiiIIIII5.IIiIiIIiii >= iiiiiIIIII5.iIiIiIIIII.size()) {
            ChatUtils.info((String)("\u5730\u72f1\u641c\u7d22\u5b8c\u6210\uff01\u8bbf\u95ee\u4e86 " + iIiIiIIIII2.iIiIiIIIII.size() + " \u4e2a\u70b9\u3002"), (Object[])new Object[5 >> 3]);
            iIiIiIIIII2.toggle();
            return;
        }
        IiiiiIIIII iiiiiIIIII6 = iIiIiIIIII2;
        iiiiiIIIII2 = iiiiiIIIII6.iIiIiIIIII.get(iiiiiIIIII6.IIiIiIIiii);
        if (iIiIiIIIII2.ALLATORIxDEMO((class_2338)iiiiiIIIII2)) {
            IiiiiIIIII iiiiiIIIII7 = iIiIiIIIII2;
            iiiiiIIIII7.IIiIiIIiii += 4 ^ 5;
            ChatUtils.info((String)("\u5230\u8fbe\u70b9 " + iiiiiIIIII7.IIiIiIIiii + "/" + iIiIiIIIII2.iIiIiIIIII.size()), (Object[])new Object[3 ^ 3]);
            IiiiiIIIII iiiiiIIIII8 = iIiIiIIIII2;
            if (iiiiiIIIII8.IIiIiIIiii < iiiiiIIIII8.iIiIiIIIII.size()) {
                IiiiiIIIII iiiiiIIIII9 = iIiIiIIIII2;
                class_2338 class_23382 = iiiiiIIIII9.iIiIiIIIII.get(iiiiiIIIII9.IIiIiIIiii);
                iIiIiIIIII2.ALLATORIxDEMO(class_23382);
                return;
            }
        } else {
            iIiIiIIIII2.ALLATORIxDEMO((class_2338)iiiiiIIIII2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, int n, int n2, NetherSearchArea.SearchMode searchMode) {
        int[][] iIiIiIIIII2;
        IiiiiIIIII iiiiiIIIII = iiiiiIIIII2;
        IiiiiIIIII iiiiiIIIII2 = class_23382;
        IiiiiIIIII iIiIiIIIII3 = iiiiiIIIII;
        if (iIiIiIIIII2 == NetherSearchArea.SearchMode.iIiIiIIIII) {
            void v1 = iIiIiIIIII2 = -iIiIiIIIII;
            while (v1 <= iIiIiIIIII) {
                void v2 = -iIiIiIIIII;
                while (v2 <= iIiIiIIIII) {
                    void var5_6;
                    class_2338 class_23383 = new class_2338(iiiiiIIIII2.method_10263() + var5_6 * iIiIiIIIII, iiiiiIIIII2.method_10264(), iiiiiIIIII2.method_10260() + iIiIiIIIII2 * iIiIiIIIII);
                    iIiIiIIIII3.iIiIiIIIII.add(class_23383);
                    v2 = ++var5_6;
                }
                v1 = ++iIiIiIIIII2;
            }
        } else {
            int[][] nArrayArray = new int[4][];
            int[] nArray = new int[--2];
            int n3 = 2 & 5;
            nArray[n3] = --1;
            nArray[--1] = 3 ^ 3;
            nArrayArray[n3] = nArray;
            int[] nArray2 = new int[1 ^ 3];
            nArray2[3 ^ 3] = 2 & 5;
            int n4 = 3 & 5;
            nArray2[n4] = --1;
            nArrayArray[n4] = nArray2;
            int[] nArray3 = new int[5 >> 1];
            nArray3[5 >> 3] = -4 >> 2;
            nArray3[5 >> 2] = 2 & 5;
            nArrayArray[--2] = nArray3;
            int[] nArray4 = new int[5 >> 1];
            nArray4[2 & 5] = 3 ^ 3;
            nArray4[--1] = -4 >> 2;
            nArrayArray[--3] = nArray4;
            iIiIiIIIII2 = nArrayArray;
            int n5 = 2 & 5;
            int n6 = 3 >> 2;
            int n7 = 3 ^ 3;
            int n8 = --1;
            int n9 = 5 >> 3;
            class_2338 class_23384 = new class_2338(iiiiiIIIII2.method_10263(), iiiiiIIIII2.method_10264(), iiiiiIIIII2.method_10260());
            iIiIiIIIII3.iIiIiIIIII.add(class_23384);
            void var10_14 = iIiIiIIIII * --4;
            while (n8 <= var10_14) {
                int[] nArray5 = iIiIiIIIII2[n7];
                int n10 = 2 & 5;
                while (n10 < n8) {
                    int n11;
                    if (Math.abs(n5 += nArray5[3 ^ 3]) <= iIiIiIIIII && Math.abs(n6 += nArray5[3 >> 1]) <= iIiIiIIIII) {
                        class_2338 class_23385 = new class_2338(iiiiiIIIII2.method_10263() + n5 * iIiIiIIIII, iiiiiIIIII2.method_10264(), iiiiiIIIII2.method_10260() + n6 * iIiIiIIIII);
                        iIiIiIIIII3.iIiIiIIIII.add(class_23385);
                    }
                    n10 = ++n11;
                }
                int n12 = 2 ^ 3;
                ++n9;
                n7 = (n7 + (5 >> 2)) % --4;
                if (n9 != 5 >> 1) continue;
                int n13 = 5 >> 2;
                ++n8;
                n9 = 5 >> 3;
            }
        }
    }

    private /* synthetic */ void iiIIiIIiii() {
        IiiiiIIIII iiiiiIIIII = this;
        IiiiiIIIII iiiiiIIIII2 = this;
        this.iIiIiIIIII = null;
        iiiiiIIIII2.IIiIiIIiii = 3 ^ 3;
        iiiiiIIIII2.IiiIiIiiIi = null;
        this.iIiIiiiiII = null;
        this.iIiiiIiIii = 3 & 4;
        iiiiiIIIII.iIiIIiIIIi = this.iIiiiIiIii;
        iiiiiIIIII.iIIIiiiiIi = 3 >> 2;
    }

    public int iiiIiIiiIi() {
        if (this.iIiIiIIIII != null) {
            return this.iIiIiIIIII.size();
        }
        return 0;
    }

    @Override
    public void onActivate() {
        if (this.iIIiiIiIiI.field_1724 == null || this.iIIiiIiIiI.field_1687 == null) {
            ChatUtils.error((String)IIIIIIiiII.iiIIiIIiii("q\b\u0000]c1\u0006\fTCQ\fT\u000fbco0&-s/jb"), (Object[])new Object[5 >> 3]);
            this.toggle();
            return;
        }
        if (!this.iiiIiIiiIi()) {
            ChatUtils.warning((String)IiIiiiIIIi.ALLATORIxDEMO("\u4f32\u5f8b\u980b\u5771\u5757\u72b5\u4e57\u6216\u8098\u4f33\u755a\u6b3d\u6a46\u571f\uff77"), (Object[])new Object[2 & 5]);
            if (!((Boolean)this.IIiiIIIIIi.get()).booleanValue()) {
                this.toggle();
                return;
            }
        }
        this.IIIIiIIiII();
    }

    private /* synthetic */ void iiiIiIiiIi() {
        IiiiiIIIII iiiiiIIIII;
        IiiiiIIIII iiiiiIIIII2;
        (iiiiiIIIII2 = this).iIiIiIIIII = new ArrayList<class_2338>();
        if ((iiiiiIIIII2 = this).IiiIiIiiIi == null) {
            return;
        }
        int n = (Integer)iiiiiIIIII2.iiiIiiIIII.get();
        int n2 = (Integer)iiiiiIIIII2.iIIiiIiIiI.get() * (0x56 & 0x39);
        NetherSearchArea.SearchMode searchMode = (NetherSearchArea.SearchMode)((Object)iiiiiIIIII2.iiiiiIIiIi.get());
        if ((NetherSearchArea.SearchShape)((Object)iiiiiIIIII2.IIIIiiIiii.get()) == NetherSearchArea.SearchShape.iIiIiIIIII) {
            IiiiiIIIII iiiiiIIIII3 = iiiiiIIIII2;
            iiiiiIIIII = iiiiiIIIII3;
            iiiiiIIIII3.ALLATORIxDEMO(iiiiiIIIII3.IiiIiIiiIi, n, n2);
        } else {
            IiiiiIIIII iiiiiIIIII4 = iiiiiIIIII2;
            iiiiiIIIII = iiiiiIIIII4;
            iiiiiIIIII4.ALLATORIxDEMO(iiiiiIIIII4.IiiIiIiiIi, n, n2, searchMode);
        }
        ChatUtils.info((String)("\u751f\u6210\u4e86 " + iiiiiIIIII.iIiIiIIIII.size() + " \u4e2a\u641c\u7d22\u70b9\u3002"), (Object[])new Object[3 ^ 3]);
    }

    private /* synthetic */ boolean iiiIiIiiIi() {
        if (this.iIIiiIiIiI.field_1687 == null) {
            return 3 >> 2;
        }
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }

    public IiiiiIIIII() {
        IiiiiIIIII iiiiiIIIII = this;
        super(IiIiiiIIIi.ALLATORIxDEMO("\u5769\u7296\u6278\u56d3"), IIIIIIiiII.iiIIiIIiii("\u576b\u5716\u7292\u4e0b\u7c98\u7ef9\u6044\u5716\u647f\u7d24\u7e90\u6782\u6255\u726f\u5482\u7682\u5379\u57d9\u3041"));
        iiiiiIIIII.iIIiIiiiIi = iiiiiIIIII.settings.getDefaultGroup();
        iiiiiIIIII.iiiiiIIiIi = iiiiiIIIII.iIIiIiiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u6445\u7d45\u6a32\u5f22"))).description(IIIIIIiiII.iiIIiIIiii("\u87f9\u65ed\uff79\u4ee8\u4e4e\u5fe5\u87d9\u65ed\u5472\u5910\uff58\u9016\u880f\uff1c\u634a\u884a\u6228\u63c9\u3041"))).defaultValue((Object)NetherSearchArea.SearchMode.iIIiIiiiIi)).build());
        this.IIIIiiIiii = this.iIIiIiiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u6445\u7d45\u5f71\u729b"))).description(IIIIIIiiII.iiIIiIIiii("\u77cf\u5f01\uff3c\u65da\u5f44\u5359\u57d9\uff58\u87bc\u6588\uff1c\u5745\u5f64\u87f9\u65cd\u3041"))).defaultValue((Object)NetherSearchArea.SearchShape.iiiiiIIiIi)).build());
        this.iiiIiiIIII = this.iIIiIiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u6445\u7d45\u5359\u5fa9"))).description(IIIIIIiiII.iiIIiIIiii("\u647f\u7d04\u5359\u57f9\u76e7\u534c\u5fc7\uff0a\u4ea6\u533c\u5714\u4e3c\u5316\u4f4b\u3041"))).defaultValue((Object)(0x7D & 0x52))).min(2 ^ 3).max(0x2F3C & 0x77D3).sliderRange(0x2A & 0x5F, 0x2793 & 0x7F7C).build());
        this.IIiIiiiiII = this.iIIiIiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u6445\u7d45\u900c\u5e8b"))).description(IIIIIIiiII.iiIIiIIiii("\u6bae\u6b05\u79fd\u52eb\u4e6d\u9597\u76a2\u5258\u6556\u9597\u96b2\uff6b\u6576\u507f\u8d8c\u5c4c\u9019\u5ee5\u8d8c\u5fa8\uff0f\u3041"))).defaultValue((Object)(0x5C & 0x37))).min(3 & 5).max(0x74 & 0x6F).build());
        this.IIiiIIIIIi = this.iIIiIiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u81b3\u52cf\u5f13\u59e6"))).description(IIIIIIiiII.iiIIiIIiii("\u8ffd\u5106\u5736\u72b2\u65f0\u81a9\u52ae\u5f43\u59cd\u645f\u7d24\u3041"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIIiiIiIiI = this.iIIiIiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u70e0\u9593\u8dce\u7996"))).description(IIIIIIiiII.iiIIiIIiii("\u647d\u7d06\u7097\u4e20\u95df\u76ea\u8df6\u79d5\uff2c\u4e80\u531b\u5733\u4e5b\u5371\u4f4b\u3041\u59a4\u67ff\u5286\u8f1e\u8dfb\u79d8\u4e1c[*c\u5efc\u8bed\u8bb8\u7f2d\u4e3cr0\u3041"))).defaultValue((Object)(0x1A & 0x75))).min(5 >> 1).max(0x16D0 & 0x69AF).build());
        this.ALLATORIxDEMO = this.iIIiIiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiiIIIi.ALLATORIxDEMO("\u76aa\u687d\u63fc\u8fb6\u8dce\u7996"))).description(IIIIIIiiII.iiIIiIIiii("\u8bc7\u4e1c\u5253\u8f98\u768d\u6821\u70da\u7682\u8d9e\u79bd\u964b\u503a\uff4b\u65bf\u5714\uff0f\u3041"))).defaultValue((Object)(0x37 & 0x78))).min(1 ^ 3).max(0x1FE & 0x7FF5).sliderRange(--2, 0xBE2 & 0x749D).build());
        this.iiIIiIIiii();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiiIIIi.ALLATORIxDEMO("\u0014\u0016\u0001;\u0017?D/\u0014>\u0005.t\u000ed\u8b8d\u66b7\u65cd\u5274\u677a\u65e9\u722f\u673f\uff2c"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, int n, int n2) {
        void iIiIiIIIII2;
        int n32 = n2;
        IiiiiIIIII iIiIiIIIII3 = this;
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.5;
        double d4 = (double)n32 / (Math.PI * 2);
        iIiIiIIIII2 *= 0x5E & 0x31;
        double d5 = d2;
        while (d5 <= (double)iIiIiIIIII2) {
            void iIiIiIIIII4;
            n32 = (int)Math.round(d2 * Math.cos(d));
            int n4 = (int)Math.round(d2 * Math.sin(d));
            class_2338 n32 = new class_2338(iIiIiIIIII4.method_10263() + n32, iIiIiIIIII4.method_10264(), iIiIiIIIII4.method_10260() + n4);
            iIiIiIIIII3.iIiIiIIIII.add(n32);
            d += d3;
            d5 = d2 += d4 * d3;
        }
    }

    public boolean ALLATORIxDEMO() {
        return this.iIiIIiIIIi;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        this.iIiIIiIIIi = 3 & 4;
        BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
        ChatUtils.info((String)IIIIIIiiII.iiIIiIIiii("\u5736\u72b2\u641a\u7d61\u5df4\u501f\u6b64\u3041"), (Object[])new Object[3 >> 2]);
    }

    public int ALLATORIxDEMO() {
        return this.IIiIiIIiii;
    }
}

