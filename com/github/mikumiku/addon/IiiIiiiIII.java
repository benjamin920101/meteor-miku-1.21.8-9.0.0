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
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.orbit.EventHandler
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIiiiI;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.mixinface.MagicMix;
import com.github.mikumiku.addon.modules.FakeCoordinates;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.orbit.EventHandler;

public class IiiIiiiIII
extends iIiIiIIIii {
    private double IIIiiIiiII;
    private final Setting<Boolean> iIIIIIiIIi;
    private final Setting<Boolean> iIIIIiIIiI;
    private final Setting<Boolean> iIIIIIiIii;
    private final Setting<Integer> IiIIiiiiIi;
    private final Setting<Boolean> IiiIIiIiii;
    private boolean IiiIiIiIIi;
    private final Setting<Integer> iiIiiiiIii;
    private double IIIiiiIiIi;
    private final Setting<Boolean> iIIiIiiiII;
    public static double iiiiIiiIIi;
    private final SettingGroup iiiIIiIIii;
    private final Setting<Boolean> IiiIIiIIiI;
    private int iIIIIiiiii;
    private final SettingGroup IiIiIiIIii;
    private final Setting<Boolean> iiiIiIiiII;
    private int IIiiiiIIii;
    private final SettingGroup IiiiiIIiII;
    private long iIIIIIiiII;
    private final Setting<FakeCoordinates.ObfuscationMode> iIIiiiiIii;
    private final SettingGroup iiIIIiIIIi;
    public static double iIiiiiIIII;
    private final Random iiIiIIiiii;
    private final Setting<Integer> iIIiIiiIiI;
    private final Setting<Integer> iIIIIIIiII;
    public static double iIIiiIIIIi;
    private final Setting<Integer> IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final Setting<String> iIIIiiiiIi;
    public static double iiiIiiIIII;
    private final Setting<Boolean> iIiIIiIIIi;
    private final Setting<String> IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<Integer> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final Setting<Integer> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private final Setting<Integer> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Integer> iIiIiIIIII;
    private boolean ALLATORIxDEMO;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void iiiiIIIiII(double iIiIiIIIII2, double iIiIiIIIII3) {
        switch (((FakeCoordinates.ObfuscationMode)((Object)this.iIIiiiiIii.get())).ordinal()) {
            case 0: {
                this.ALLATORIxDEMO(iIiIiIIIII2, iIiIiIIIII3);
                return;
            }
            case 1: {
                this.iiIIiIIiii(iIiIiIIIII2, iIiIiIIIII3);
                return;
            }
            case 2: {
                this.IIIIiIIiII(iIiIiIIIII2, iIiIiIIIII3);
                return;
            }
        }
    }

    private /* synthetic */ void iiiIiIiiIi() {
        if (((Boolean)this.IiiIIiIiii.get()).booleanValue()) {
            // empty if block
        }
        if (((Boolean)this.iIIIIIiIii.get()).booleanValue()) {
            this.ALLATORIxDEMO();
        }
    }

    public IiiIiiiIII() {
        IiiIiiiIII iiiIiiiIII = this;
        super(iIiIiIIIii.ALLATORIxDEMO, IiIiiIIIiI.ALLATORIxDEMO("\u501a\u5752\u685a"), IIIiIIiiiI.ALLATORIxDEMO("\u902d\u8ffb\u5058\u79e7\u54bb\u6dcb\u6df1\u654c\u6359\u5339\u6772\u968c\u85d8\u4f7c\u7693\u7703\u5bfc\u5739\u6830\u4f71\u7f5e\u0017\u0017\u90c1\u6605\u5289\u6061\u76ef"));
        iiiIiiiIII.iiiIIiIIii = iiiIiiiIII.settings.getDefaultGroup();
        iiiIiiiIII.IiIiIiIIii = iiiIiiiIII.settings.createGroup(IiIiiIIIiI.ALLATORIxDEMO("\u504d\u79a6\u8bbc\u7f33"));
        iiiIiiiIII.IiiiiIIiII = iiiIiiiIII.settings.createGroup(IIIiIIiiiI.ALLATORIxDEMO("\u4ff7\u6285\u8bde\u7f05"));
        iiiIiiiIII.iiIIIiIIIi = iiiIiiiIII.settings.createGroup(IiIiiIIIiI.ALLATORIxDEMO("\u9ada\u7efa\u900b\u9824"));
        iiiIiiiIII.IIiIiiiiII = iiiIiiiIII.iiiIIiIIii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIIiIIiiiI.ALLATORIxDEMO("\u81dd\u5ba6\u4e63\u6a00\u5737\u5466"))).description(IiIiiIIIiI.ALLATORIxDEMO("\u9630\u6b3f\u7a7d\u5e73"))).defaultValue((Object)IIIiIIiiiI.ALLATORIxDEMO("\u5066\u5730\u686c"))).onChanged(iIiIiIIIII2 -> IiiIiiiIII.ALLATORIxDEMO(iIiIiIIIII2))).build());
        this.iIIiiiiIii = this.iiiIIiIIii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6df5\u6d9b\u6a23\u5f52"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u9035\u62d9\u576b\u6830\u6dcb\u6dec\u76a5\u65d9\u5f64"))).defaultValue((Object)FakeCoordinates.ObfuscationMode.iiiiiIIiIi)).build());
        this.iIIIIIiIIi = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u76f6\u64f0\u6a23\u5f52"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u5433\u753f\u65ea\u5c2a\u91d3\u9650\u6b0b\u7a48\u5e12\u0010\u4e36\u8fa4\u51c6\u4ed1\u4f74\u4f81\u6004"))).defaultValue((Object)(3 >> 2))).build());
        this.IIiIiIIiii = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6572\u6303\u5c52\u5732\u56a3"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6513\u632b\u5c2e\u5750\u5695"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiIiIiI = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6552\u6323\u0010k3k5w9"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6513\u6331V^RCI\u0015\u000f"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIiIiiiIi = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u650d\u637cU\u0012p1f0c-"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u654f\u636a"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiIIiIIiI = this.iiiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u9a8e\u8b9c\u914f\u7f33"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u5433\u754a\u659f\u9abb\u8bfd\u6dc7\u6dfd\u8b89\u7f52\u6605\u5407\u6b03\u7805"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiiiIiIiI = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u96ad\u6747\u6702\u5c52\u81e8\u8ef6\u8ddf\u79e6"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u96b3\u672d\u5053\u79ec\u65ea\u4e19\u7703\u5bfc\u5739\u6830\u76b8\u6730\u5c34\u8dea\u7987\uff22\u531b\u5737\uff62"))).defaultValue((Object)100000)).min(3 & 4).sliderMax(1000000).visible(() -> {
            if (this.iIIiiiiIii.get() == FakeCoordinates.ObfuscationMode.iiiiiIIiIi) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.iiIiiiiIii = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u96f2\u6718\u677d\u5c0d\u51a7\u751d\u70e4\u8ddf\u79e6"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u9698\u6726\u5058\u79e7\u65e1\u4e12\u5198\u7576\u708e\u76b8\u6730\u5c34\u8dea\u7987\uff22\u531b\u5737\uff62"))).defaultValue((Object)100000)).min(5 >> 3).sliderMax(1000000).visible(() -> {
            if (this.iIIiiiiIii.get() == FakeCoordinates.ObfuscationMode.iiiiiIIiIi) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.iIiIiIIIII = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u96f2\u6718\u677d\u5925\u51a7\u751d\u70e4\u8ddf\u79e6"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u9698\u6726\u5058\u79e7\u65e1\u4e12\u5198\u7576\u708e\u76b8\u6730\u591c\u8dea\u7987\uff22\u531b\u5737\uff62"))).defaultValue((Object)29000000)).min(3 & 4).sliderMax(29999999).visible(() -> {
            if (this.iIIiiiiIii.get() == FakeCoordinates.ObfuscationMode.iiiiiIIiIi) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.IIiiIIIIIi = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u56a7\u5b98\u5012\u79f9\u0005"))).description(IIIiIIiiiI.ALLATORIxDEMO(":\u8f1d\u76b3\u56c6\u5baa\u5074\u79cc\u91f3\uff22\u531b\u5737\uff62"))).defaultValue((Object)(3 & 4))).sliderMin(-29999999).sliderMax(29999999).visible(() -> {
            if (this.iIIiiiiIii.get() == FakeCoordinates.ObfuscationMode.iIIiIiiiIi) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iiiiiIIiIi = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u56a7\u5b98\u5012\u79f9\u0007"))).description(IIIiIIiiiI.ALLATORIxDEMO("8\u8f1d\u76b3\u56c6\u5baa\u5074\u79cc\u91f3\uff22\u531b\u5737\uff62"))).defaultValue((Object)(3 & 4))).sliderMin(-29999999).sliderMax(29999999).visible(() -> {
            if (this.iIIiiiiIii.get() == FakeCoordinates.ObfuscationMode.iIIiIiiiIi) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iIIIIiIIiI = this.IiIiIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u4e09\u7511\u5752\u685a\u8f6e\u633f"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u5741\u4e3c\u7570\u81da\u5293\u8c34\u6548\u5065\u79da\u6bb4\u4fe0"))).defaultValue((Object)((2 ^ 3) != 0))).visible(() -> {
            if (this.iIIiiiiIii.get() == FakeCoordinates.ObfuscationMode.iIIiIiiiIi) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.IiIIiiiiIi = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u677d\u5c0d\u51a7\u751d\u70e4\u8ddf\u79e6"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u7703\u5ba9\u576c\u6830\u8de1\u798c\u51c6\u7508\u70a5\u7693\u671c\u5c18\u8dc1\u79d9\uff65\u5411\u5225\u659d\u5f3b\u8fe9\u6399\uff22\u531b\u5737\uff62"))).defaultValue((Object)100000)).min(3 & 4).sliderMax(1000000).visible(() -> {
            if (this.iIIiiiiIii.get() == FakeCoordinates.ObfuscationMode.iIIiIiiiIi) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.IiiIiIiiIi = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u635a\u5b98\u4f10\u7f6c\u0005"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u5c11\u73b5\u5bd4\u6657\u790d\u5714\u6b54c\u5767\u683b\uff22\u531b\u5737\uff62"))).defaultValue((Object)(3 ^ 3))).sliderMin(-29999999).sliderMax(29999999).visible(() -> {
            if (this.iIIiiiiIii.get() == FakeCoordinates.ObfuscationMode.ALLATORIxDEMO) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIIIIIIiII = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u635a\u5b98\u4f10\u7f6c\u0007"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u5c11\u73b5\u5bd4\u6657\u790d\u5714\u6b54a\u5767\u683b\uff22\u531b\u5737\uff62"))).defaultValue((Object)(3 & 4))).sliderMin(-29999999).sliderMax(29999999).visible(() -> {
            if (this.iIIiiiiIii.get() == FakeCoordinates.ObfuscationMode.ALLATORIxDEMO) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.iIIiIiiIiI = this.IiIiIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u4f02\u907c\u91cf\u65ed\u751d\u624d\u8ddf\u79e6"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u4f17\u903d\u8d92\u8fdb\u6b73\u8dc1\u79ac\u65ea\u91af\u65d9\u7528\u622c\u507f\u79c0\u5767\u683b\uff22\u531b\u5737\uff62"))).defaultValue((Object)(0x72 & 0x4D))).min(5 >> 3).sliderMax(0x57FC & 0x2BEB).build());
        this.iiiIiIIiii = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6756\u5f73\u4e16\u773e\u65ab\u65af\u8f83"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u5b6f\u5714\u673c\u5f6d\u4e5c\u7720\u65e1\u81f6\u52ca\u65c4\u5f37\u8fe2\u6395\u4ede\u9605\u6b5e\u577a\u6826\u6ca4\u9759"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiIIiIIIi = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u5392\u80df\u6cb9\u9730\u570d\u6805\u65ab\u65af\u8f83"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u63b2\u8fcd\u53f8\u80e1\u6cd3\u972e\u5732\u686e\u76b3\u5073\u79cb\u6582\u5760\u65ca\u6587\u5f21\u8fbe\u63ce"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIiIiiiiII = this.IiiiiIIiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u4f5d\u9003\u5453\u7679\u5f08\u5ef4\u8f82"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u4f37\u901d\u5419\u5eea\u8fc8\u5906\u4e27\u6224\u5176\u8b84\u7399\u5b8d\u764c\u5f69\uff22\u6bca\u79b2\uff62"))).defaultValue((Object)(0xFFA & 0x73ED))).min(5 >> 3).sliderMax(0x27B3 & 0x7F5C).build());
        this.IiiIIiIiii = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u7689\u64af\u6a7c\u5f0d\u966fDn"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u76e8\u64cf\u6a48\u5f38\u4e37\u79b1\u7513q\u000f\u8c29\u8bf4\u4f81\u6004"))).defaultValue((Object)(--1 != 0))).visible(() -> this.iIIIIIiIIi.get())).build());
        this.iIIIIIiIii = this.IiiiiIIiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u7689\u648f\u6a5c\u5f0d\u966f\u5752\u685a\u6cc6\u976f"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u76e3\u64b1\u6a36\u5f13\u4e1c\u81f6\u52ca\u965b\u6b55\u53d3\u80cd\u76bf\u5767\u683b\u6cee\u9713\u882c\u4e51"))).defaultValue((Object)((4 ^ 5) != 0))).visible(() -> this.iIIIIIiIIi.get())).build());
        this.IIIIiiIiii = this.iiIIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6df5\u6d9b\u57f8\u5cf4"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6dcc\u6df1\u57c6\u5c83\u5c63\u6510\u6305"))).defaultValue((Object)(5 >> 2))).build());
        this.iIIiIiiiII = this.iiIIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6d8a\u6dc4\u5367\u5755\u9a85\u5ea4\u56a3"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6dc0\u6dfa\u530a\u576c\u76b3\u9ae4\u5e8c\u56df\u6510\u6305"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiiiIiIii = this.iiIIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6df5\u6d9b\u5338\u570a\u514b\u713a"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u6dcb\u6df6\u5301\u5760\u76b8\u5163\u7146\u6510\u6305"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiIiIiiII = this.iiIIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u6df5\u6d9b\u751d\u7234\u7fa6\u7ca6"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u5c11\u625c\u676b\u7576\u725e\u7f98\u7ccb\u66c4\u6355\u4e06\u632d\u5bbb\u7c1b\u57e0"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIIIiiiiIi = this.iiIIIiIIIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiIiiIIIiI.ALLATORIxDEMO("\u751d\u7234\u7fa6\u7ca6\u7c79\u57d6"))).description(IIIiIIiiiI.ALLATORIxDEMO("\u7541\u4eb9\u66c3\u6352\u76bf\u7528\u7255\u7f8e\u7cda\u7c1b\u57e0"))).defaultValue((Object)IiIiiIIIiI.ALLATORIxDEMO("r1c4l."))).visible(() -> this.iiiIiIiiII.get())).build());
        IiiIiiiIII iiiIiiiIII2 = this;
        IiiIiiiIII iiiIiiiIII3 = this;
        IiiIiiiIII iiiIiiiIII4 = this;
        IiiIiiiIII iiiIiiiIII5 = this;
        this.iiIiIIiiii = new SecureRandom();
        this.IIiiiiIIii = 2 & 5;
        iiiIiiiIII4.iIIIIiiiii = this.IIiiiiIIii;
        iiiIiiiIII4.IIIiiiIiIi = 0.0;
        iiiIiiiIII3.IIIiiIiiII = 0.0;
        iiiIiiiIII3.ALLATORIxDEMO = 3 & 4;
        iiiIiiiIII2.iIIIIIiiII = 0L;
        iiiIiiiIII2.IiiIiIiIIi = 3 ^ 3;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIiIIiiiI.ALLATORIxDEMO("gPR]DY7igxvh\u0007H\u0017\u8bcb\u66c4\u658b\u5207\u673c\u659a\u7269\u674c\uff6a"));
        }
    }

    private /* synthetic */ void IIIIiIIiII(double iIiIiIIIII22, double iIiIiIIIII32) {
        int iIiIiIIIII22 = (int)Math.floor(iIiIiIIIII22 / 16.0);
        int n = (int)Math.floor(iIiIiIIIII32 / 16.0);
        int iIiIiIIIII32 = (Integer)this.IiiIiIiiIi.get() / (0x77 & 0x18);
        IiiIiiiIII iiiIiiiIII = this;
        iiiIiiiIII.IIiiiiIIii = iIiIiIIIII32 - iIiIiIIIII22;
        iiiIiiiIII.iIIIIiiiii = (Integer)this.iIIIIIIiII.get() / (0x7F & 0x10) - n;
    }

    private /* synthetic */ void iiIIiIIiii(double iIiIiIIIII2, double iIiIiIIIII3) {
        double d;
        double d2 = iIiIiIIIII2;
        double d3 = iIiIiIIIII3;
        iIiIiIIIII2 = Math.sqrt(d2 * d2 + d3 * d3);
        if (d < (double)((Integer)this.IiIIiiiiIi.get() * (0x32 & 0x5D))) {
            if (!((Boolean)this.iIIIIIiIIi.get()).booleanValue()) {
                Object[] objectArray = new Object[--2];
                objectArray[5 >> 3] = iIiIiIIIII2 / 16.0;
                objectArray[4 ^ 5] = this.IiIIiiiiIi.get();
                this.warning(IIIiIIiiiI.ALLATORIxDEMO("\u8de1\u798c\u51c6\u7528\u7085\u593d\u8fcd7422\u0006Z\u0017\u000079s5\u001b\u001c\u65f7\u6cc9\u4f68\u7534\u56cd\u5ba6\u5078\u79c7\u6a16\u5f33"), objectArray);
            }
            IiiIiiiIII iiiIiiiIII = this;
            iiiIiiiIII.IIiiiiIIii = iiiIiiiIII.iiIiIIiiii.nextInt(100000, 999999);
            iiiIiiiIII.iIIIIiiiii = iiiIiiiIII.iiIiIIiiii.nextInt(100000, 999999);
            return;
        }
        if (((Boolean)this.iIIIIiIIiI.get()).booleanValue() && this.IIIIiIIiII()) {
            this.IIiiiiIIii = (Integer)this.IIiiIIIIIi.get() / (0x38 & 0x57) / (0x2E & 0x59);
            this.iIIIIiiiii = (Integer)this.iiiiiIIiIi.get() / (0x7C & 0x13) / (0x5C & 0x2B);
            return;
        }
        this.IIiiiiIIii = (Integer)this.IIiiIIIIIi.get() / (0x71 & 0x1E);
        this.iIIIIiiiii = (Integer)this.iiiiiIIiIi.get() / (0x14 & 0x7B);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1724 == null || this.iIIiiIiIiI.field_1724.method_6047() != null) {
            // empty if block
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        IiiIiiiIII iiiIiiiIII = this;
        int n = (Integer)iiiIiiiIII.iiIiiiiIii.get();
        int n2 = (Integer)iiiIiiiIII.iIiIiIIIII.get();
        return iiiIiiiIII.iiIiIIiiii.nextInt(n, n2 + (4 ^ 5)) * (iiiIiiiIII.iiIiIIiiii.nextBoolean() ? 3 >> 1 : -1);
    }

    static {
        iiiIiiIIII = 0.0;
        iiiiIiiIIi = 0.0;
        iIIiiIIIIi = 0.0;
        iIiiiiIIII = 0.0;
    }

    private /* synthetic */ void iiiIiIiiIi(double iIiIiIIIII2, double iIiIiIIIII3) {
        MagicMix.x = iIiIiIIIII2 + (double)(this.IIiiiiIIii * (0x5A & 0x35));
        MagicMix.z = iIiIiIIIII3 + (double)(this.iIIIIiiiii * (0x14 & 0x7B));
    }

    public void onDeactivate() {
        IiiIiiiIII iiiIiiiIII = this;
        IiiIiiiIII iiiIiiiIII2 = this;
        super.onDeactivate();
        MagicMix.x = 0.0;
        MagicMix.z = 0.0;
        iIIiiIIIIi = 0.0;
        iIiiiiIIII = 0.0;
        iiiIiiiIII2.IIiiiiIIii = 3 & 4;
        iiiIiiiIII2.iIIIIiiiii = 5 >> 3;
        iiiIiiiIII.IIIiiiIiIi = 0.0;
        iiiIiiiIII.IIIiiIiiII = 0.0;
    }

    public boolean IIiIiIiIiI() {
        return (Boolean)this.iIIIIIiIIi.get();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(double d, double d2) {
        IiiIiiiIII iiiIiiiIII;
        block2: {
            void iIiIiIIIII2;
            void iIiIiIIIII3;
            int n;
            int n2;
            iiiIiiiIII = this;
            int n3 = n4 = 3 ^ 3;
            while (true) {
                if (n3 >= 100) break block2;
                IiiIiiiIII iiiIiiiIII2 = iiiIiiiIII;
                ++n4;
                n2 = iiiIiiiIII2.ALLATORIxDEMO();
                n = iiiIiiiIII2.ALLATORIxDEMO();
                if (!(Math.sqrt(Math.pow((double)n2 - iIiIiIIIII3, 2.0) + Math.pow((double)n - iIiIiIIIII2, 2.0)) < (double)((Integer)iiiIiiiIII.IiiiiIiIiI.get() * (0x72 & 0x1D)))) break;
                n3 = n4;
            }
            int n4 = (int)Math.floor((double)(iIiIiIIIII3 / 16.0));
            int n5 = (int)Math.floor((double)(iIiIiIIIII2 / 16.0));
            IiiIiiiIII iiiIiiiIII3 = iiiIiiiIII;
            iiiIiiiIII3.IIiiiiIIii = n2 / (0x1C & 0x73) - n4;
            iiiIiiiIII3.iIIIIiiiii = n / (0x32 & 0x5D) - n5;
            return;
        }
        if (!((Boolean)iiiIiiiIII.iIIIIIiIIi.get()).booleanValue()) {
            iiiIiiiIII.warning(IiIiiIIIiI.ALLATORIxDEMO("\u96f2\u6738\u5012\u79d9\u7562\u6232\u594c\u8d07\uff71\u4f7d\u7575\u9eda\u8bf9\u504d\u79a6"), new Object[2 & 5]);
        }
        iiiIiiiIII.IIiiiiIIii = 100000;
        iiiIiiiIII.iIIIIiiiii = 100000;
    }

    private /* synthetic */ boolean IIIIiIIiII() {
        if (this.iIIiiIiIiI.field_1687 == null) {
            return 5 >> 3;
        }
        return this.iIIiiIiIiI.field_1687.method_27983().method_29177().method_12832().equals(IiIiiIIIiI.ALLATORIxDEMO("V\u0015G\"l8v5g/"));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        double d;
        IiiIiiiIII iiiIiiiIII = iiiIiiiIII2;
        IiiIiiiIII iiiIiiiIII2 = post;
        IiiIiiiIII iIiIiIIIII2 = iiiIiiiIII;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        IiiIiiiIII iiiIiiiIII3 = iIiIiIIIII2;
        double d2 = iiiIiiiIII3.iIIiiIiIiI.field_1724.method_23317();
        double d3 = iiiIiiiIII3.iIIiiIiIiI.field_1724.method_23321();
        if (((Boolean)iiiIiiiIII3.iIIIIIiIIi.get()).booleanValue()) {
            iIiIiIIIII2.iiiIiIiiIi();
        }
        double d4 = Math.sqrt(Math.pow(d2 - iIiIiIIIII2.IIIiiiIiIi, 2.0) + Math.pow(d3 - iIiIiIIIII2.IIIiiIiiII, 2.0));
        if (d > (double)((Integer)iIiIiIIIII2.iIIiIiiIiI.get() * (0x7D & 0x12))) {
            if (!((Boolean)iIiIiIIIII2.iIIIIIiIIi.get()).booleanValue()) {
                Object[] objectArray = new Object[3 >> 1];
                objectArray[2 & 5] = d4;
                iIiIiIIIII2.info(IIIiIIiiiI.ALLATORIxDEMO("\u68df\u6d5f\u5222\u9566\u8dcf\u79a2\u79e4\u52bc*)44=a7\u65a5\u5771\u000461\u91d6\u65a0\u750c\u6208\u505e\u79e1"), objectArray);
            }
            iIiIiIIIII2.iiiiIIIiII(d2, d3);
        }
        IiiIiiiIII iiiIiiiIII4 = iIiIiIIIII2;
        iiiIiiiIII4.IIIiiiIiIi = d2;
        iiiIiiiIII4.IIIiiIiiII = d3;
        iIiIiIIIII2.iiiIiIiiIi(d2, d3);
    }

    public String ALLATORIxDEMO() {
        if (((Boolean)this.iIIIIIiIIi.get()).booleanValue()) {
            return IIIiIIiiiI.ALLATORIxDEMO("\u76e3\u64b1\u6a07\u5f22\uff00\u5741\u681c\u4ff1\u607c\u5dea\u9681\u85d5");
        }
        Object[] objectArray = new Object[--5];
        objectArray[3 ^ 3] = ((FakeCoordinates.ObfuscationMode)((Object)this.iIIiiiiIii.get())).toString();
        objectArray[--1] = this.IIiiiiIIii;
        objectArray[5 >> 1] = this.iIIIIiiiii;
        objectArray[--3] = MagicMix.x;
        objectArray[--4] = MagicMix.z;
        return String.format(IiIiiIIIiI.ALLATORIxDEMO("\u6a1f\u5f6e\u001cY\u0007\u000e\u0000\u0003\u001e\u502e\u799e\u0000\n]\n\u0014\u0003P\u0001\u001f\fZ\u535f\u576d\"!\u0002\u503a\u5772\u687a8}\nX\fLDQ\"x,ldt"), objectArray);
    }

    private static /* synthetic */ void ALLATORIxDEMO(String iIiIiIIIII2) {
    }

    @Override
    public void onActivate() {
        IiiIiiiIII iiiIiiiIII = this;
        super.onActivate();
        if (iiiIiiiIII.iIIiiIiIiI.field_1724 != null) {
            IiiIiiiIII iiiIiiiIII2 = this;
            iIIiiIIIIi = iiiIiiiIII2.iIIiiIiIiI.field_1724.method_23317();
            iIiiiiIIII = iiiIiiiIII2.iIIiiIiIiI.field_1724.method_23321();
            iiiIiiiIII2.IIIiiiIiIi = iIIiiIIIIi;
            iiiIiiiIII2.IIIiiIiiII = iIiiiiIIII;
            iiiIiiiIII2.iiiiIIIiII(iIIiiIIIIi, iIiiiiIIII);
            if (!((Boolean)iiiIiiiIII2.iIIIIIiIIi.get()).booleanValue()) {
                Object[] objectArray = new Object[--4];
                objectArray[3 & 4] = iIIiiIIIIi;
                objectArray[4 ^ 5] = iIiiiiIIII;
                objectArray[1 ^ 3] = this.IIiiiiIIii;
                objectArray[--3] = this.iIIIIiiiii;
                this.info(IiIiiIIIiI.ALLATORIxDEMO("\u503a\u5770\u6878\u5dcc\u544e\u754d\u001a\u0007U\u53b0\u70c9\u0015P\f^\u000bK\u0003\u0016\"x\fLDT.}\u506d\u7986\u0018]\nXfq\"xft"), objectArray);
                return;
            }
        } else {
            iIIiiIIIIi = 0.0;
            iIiiiiIIII = 0.0;
            IiiIiiiIII iiiIiiiIII3 = this;
            iiiIiiiIII3.IIIiiiIiIi = 0.0;
            iiiIiiiIII3.IIIiiIiiII = 0.0;
        }
    }
}

