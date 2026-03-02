/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.utils.BetterBlockPos
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.NopPathManager
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2480
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3965
 *  net.minecraft.class_465
 *  net.minecraft.class_9288
 *  net.minecraft.class_9334
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.utils.BetterBlockPos;
import com.github.mikumiku.addon.IiIIIiIiiI;
import com.github.mikumiku.addon.IiIiiiiIii;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.modules.ShulkerBoxItemFetcher;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.NopPathManager;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_465;
import net.minecraft.class_9288;
import net.minecraft.class_9334;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiiIIIiIII
extends iIiIiIIIii {
    public static final int iiIiIIiiii = 100;
    public IBaritone iIiIiIIIII;
    public final Setting<Integer> iIIiIiiIiI;
    public ShulkerBoxItemFetcher.State iIIIIIIiII;
    public boolean iIIiiIIIIi;
    public class_2338 IiiiiIiIiI;
    private final SettingGroup iiiIiIIiii;
    public boolean iIIIiiiiIi;
    public int iiiIiiIIII;
    public final Setting<Boolean> iIiIIiIIIi;
    public int IIiIiiiiII;
    public final Setting<Integer> IIiiIIIIIi;
    public final Setting<Boolean> iIiiiIiIii;
    public final Setting<Boolean> iIiIiiiiII;
    public int IIIIiiIiii;
    public final Setting<Boolean> IiiIiIiiIi;
    public final Setting<Boolean> IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    public int iiiiiIIiIi;
    public final Setting<class_1792> iIIiIiiiIi;
    public class_1799 iIiIiIIIII;
    public final Setting<Boolean> ALLATORIxDEMO;

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void IIiIiIiiii() {
        if (!((Boolean)this.IiiIiIiiIi.get()).booleanValue()) ** GOTO lbl12
        v0 = this;
        if (((Boolean)this.iIiIIiIIIi.get()).booleanValue()) {
            v0.info("\u7269\u54c1\u63d0\u53d6\u5b8c\u6210\uff01\u5171\u63d0\u53d6\u4e86 " + this.iiiIiiIIII + " \u4e2a\u7269\u54c1", new Object[3 ^ 3]);
            v1 = this;
        } else {
            v0.info("\u7269\u54c1\u63d0\u53d6\u5b8c\u6210\uff01\u5171\u63d0\u53d6\u4e86 " + this.iiiIiiIIII + " \u4e2a\u7269\u54c1", new Object[3 ^ 3]);
lbl12:
            // 2 sources

            v1 = this;
        }
        v2 = this;
        if (((Boolean)v1.iIiiiIiIii.get()).booleanValue()) {
            v2.toggle();
            return;
        }
        v2.ALLATORIxDEMO();
    }

    private /* synthetic */ void iIiIiiiiii() {
        if (((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
            this.info(IiIIIiIiiI.ALLATORIxDEMO("\u6b0f\u5755\u513f\u95b0\u5bd5\u5635BsB"), new Object[3 ^ 3]);
        }
        if (this.iIIiiIiIiI.field_1755 != null) {
            this.iIIiiIiIiI.field_1755.method_25419();
        }
        this.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iIIiiIiIiI);
    }

    private /* synthetic */ void iIiIiIiIii() {
        iiiIIIiIII iiiIIIiIII2 = iiiIIIiIII4;
        if (((Boolean)iiiIIIiIII2.IiiIiIiiIi.get()).booleanValue()) {
            iiiIIIiIII2.info(iIIIIiIiii.ALLATORIxDEMO("\u6b48\u572b\u6535\u7f4d\u6f77\u5f72\u76d9\r%\r"), new Object[2 & 5]);
        }
        iiiIIIiIII iiiIIIiIII3 = iiiIIIiIII2;
        iiiIIIiIII iiiIIIiIII4 = iiiIIIiIII3.ALLATORIxDEMO(iiiIIIiIII3.iIIiiIiIiI.field_1724.method_24515());
        if (iiiIIIiIII4 == null) {
            iiiIIIiIII2.error(IiIIIiIiiI.ALLATORIxDEMO("\u6212\u4e50\u525c\u5455\u906e\u76f9\u4f01\u7f33\u6552\u7f33\u6f30\u5f2c\u76be"), new Object[3 & 4]);
            iiiIIIiIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iiiiiIIiIi);
            return;
        }
        if (iiiIIIiIII2.IIiIiiiiII != -4 >> 2) {
            iIiIiiIIIi.ALLATORIxDEMO((class_2338)iiiIIIiIII4, iiiIIIiIII2.IIiIiiiiII);
        }
        iiiIIIiIII iiiIIIiIII5 = iiiIIIiIII2;
        iiiIIIiIII5.IiiiiIiIiI = iiiIIIiIII4;
        iiiIIIiIII5.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iIiIiiiiII);
        if (((Boolean)iiiIIIiIII5.IiiIiIiiIi.get()).booleanValue()) {
            iiiIIIiIII2.info("\u6f5c\u5f71\u76d2\u5df2\u653e\u7f6e\u5728: " + iiiIIIiIII4.method_23854(), new Object[5 >> 3]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiiIIIiIII iiiIIIiIII2 = iiiIIIiIII3;
        iiiIIIiIII iiiIIIiIII3 = pre;
        iiiIIIiIII iIiIiIIIII2 = iiiIIIiIII2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        iiiIIIiIII iiiIIIiIII4 = iIiIiIIIII2;
        iiiIIIiIII4.IIIIiiIiii += 5 >> 2;
        if (iiiIIIiIII4.IIIIiiIiii < (Integer)iIiIiIIIII2.iIIiIiiIiI.get()) {
            return;
        }
        iIiIiIIIII2.IIIIiiIiii = 5 >> 3;
        if (iIiIiIIIII2.iIIiiIIIIi) {
            return;
        }
        iiiIIIiIII iiiIIIiIII5 = iIiIiIIIII2;
        iiiIIIiIII5.iiiiiIIiIi += 2 ^ 3;
        if (iiiIIIiIII5.iiiiiIIiIi > (0x64 & 0x7F)) {
            if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
                iiiIIIiIII iiiIIIiIII6 = iIiIiIIIII2;
                iiiIIIiIII6.error("\u72b6\u6001\u8d85\u65f6: " + iIiIiIIIII2.iIIIIIIiII.name() + " (\u5df2\u7b49\u5f85 " + iiiIIIiIII6.iiiiiIIiIi + " \u523b)", new Object[3 >> 2]);
            }
            iIiIiIIIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iiiiiIIiIi);
            return;
        }
        if (((Boolean)iIiIiIIIII2.IIiIiIIiii.get()).booleanValue()) {
            iiiIIIiIII iiiIIIiIII7 = iIiIiIIIII2;
            iiiIIIiIII7.info("\u5f53\u524d\u72b6\u6001: " + iIiIiIIIII2.iIIIIIIiII.name() + " (Tick: " + iIiIiIIIII2.IIIIiiIiii + ", \u8d85\u65f6: " + iiiIIIiIII7.iiiiiIIiIi + ")", new Object[3 >> 2]);
        }
        switch (iIiIiIIIII2.iIIIIIIiII.ordinal()) {
            case 0: {
                iIiIiIIIII2.iiiIiIiiIi();
                return;
            }
            case 1: {
                iIiIiIIIII2.iIiIiIiIii();
                return;
            }
            case 2: {
                iIiIiIIIII2.iiiiIIIiII();
                return;
            }
            case 3: {
                iIiIiIIIII2.IIIIiIIiII();
                return;
            }
            case 4: {
                iIiIiIIIII2.iIiIiiiiii();
                return;
            }
            case 5: {
                iIiIiIIIII2.iiIIiIIiii();
                return;
            }
            case 6: {
                iIiIiIIIII2.IIiIiIiIiI();
                return;
            }
            case 7: {
                iIiIiIIIII2.IIiIiIiiii();
                return;
            }
        }
    }

    public boolean IIIIiIIiII(class_1799 class_17992) {
        iiiIIIiIII iiiIIIiIII2 = iiiIIIiIII3;
        iiiIIIiIII iiiIIIiIII3 = class_17992;
        iiiIIIiIII iIiIiIIIII2 = iiiIIIiIII2;
        return iiiIIIiIII.ALLATORIxDEMO((class_1799)iiiIIIiIII3, (class_1792)iIiIiIIIII2.iIIiIiiiIi.get());
    }

    public iiiIIIiIII() {
        iiiIIIiIII iiiIIIiIII2 = this;
        super(IiIIIiIiiI.ALLATORIxDEMO("\u4e5d\u9542\u8838\u7eb5"), iIIIIiIiii.ALLATORIxDEMO("\u81c9\u5283\u4ecd\u6f77\u5f72\u76f9\u4e2e\u83bc\u53f5\u632c\u5b99\u7242\u54c2\u3029\u81e9\u52f6\u6548\u76d9\uff2f\u53da\u724d\uff07\u6270\u76c4\uff32\u633d\u76a6"));
        iiiIIIiIII2.iIIiiIiIiI = iiiIIIiIII2.settings.getDefaultGroup();
        iiiIIIiIII2.iiiIiIIiii = iiiIIIiIII2.settings.createGroup(IiIIIiIiiI.ALLATORIxDEMO("\u8be3\u7f02"));
        iiiIIIiIII2.iIIiIiiiIi = iiiIIIiIII2.iIIiiIiIiI.add((Setting)((ItemSetting.Builder)((ItemSetting.Builder)((ItemSetting.Builder)new ItemSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u76f8\u6839\u7235\u54b5"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u89dc\u4ea2\u6f01\u5f1d\u76af\u4e61\u83ea\u53ba\u76d9\u7205\u549c\u306e"))).defaultValue((Object)class_1802.field_20412)).build());
        this.iIIiIiiIiI = this.iiiIiIIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u5eaa\u8fab"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u6490\u4f30\u4e16\u9598\u76d9\u5e9a\u8fa2\uff44)\u0005>\u0007\uff54\u306e"))).defaultValue((Object)(5 >> 1))).min(5 >> 2).max(0x7E & 0x15).build());
        this.iIiiiIiIii = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u81fc\u5296\u512f\u9599"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u5bd1\u627c\u5473\u81a6\u52f5\u511f\u95b0\u6a4d\u570a\u306e"))).defaultValue((Object)(5 >> 2))).build());
        this.IiiIiIiiIi = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u8ba6\u5f6b\u6491\u4f28"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u5744\u8017\u5945\u6872\u8bfc\u5f08\u64a1\u4f01\u6589\u5f8a\u306e"))).defaultValue((Object)(3 >> 1))).build());
        this.ALLATORIxDEMO = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u81fc\u5296\u8f30\u5940"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u4ef9\u4efe\u65ab\u8186\u52d5\u8f20\u5969\u7767\u544c\u65d5\u570a\u306e"))).defaultValue((Object)(5 >> 2))).build());
        this.IIiIiIIiii = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u8c15\u8beb\u6a7d\u5f7b"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u5472\u7544\u8b9b\u7e8a\u76d9\u8c6f\u8b88\u6589\u5f8a\u306e"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIiIiiiiII = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u978e\u7ffb\u4ef8\u6316"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u97f4\u7f98\u4ec8\u633f\u9057\u8fec\uff40\u65ba\u76e8\u5b05\u8d1b\u6738\u306e"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIiIIiIIIi = this.iiiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u6311\u5ba4\u652c\u91bb"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u6643\u547b\u5386\u638d\u53ba\u637a\u5bd6\u652d\u91a3\u76d9\u7205\u549c\u306e"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IIiiIIIIIi = this.iiiIiIIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIIiIiii.ALLATORIxDEMO("\u63f4\u53dd\u6553\u91d9\uff36\u7e98\uff7d"))).description(IiIIIiIiiI.ALLATORIxDEMO("\u89fc\u639c\u538b\u76e8\u7234\u54ad\u7e99\u651c\uff75\u4e4c\u7e99Zi\u4e46\uff54\u306e"))).defaultValue((Object)(--1))).min(--1).max(0x51 & 0x6E).visible(() -> (Boolean)this.iIiIIiIIIi.get())).build());
        iiiIIIiIII iiiIIIiIII3 = this;
        iiiIIIiIII iiiIIIiIII4 = this;
        iiiIIIiIII iiiIIIiIII5 = this;
        this.iIIIIIIiII = ShulkerBoxItemFetcher.State.ALLATORIxDEMO;
        iiiIIIiIII5.IIIIiiIiii = 3 >> 2;
        iiiIIIiIII5.IIiIiiiiII = -4 >> 2;
        iiiIIIiIII4.IiiiiIiIiI = null;
        iiiIIIiIII4.iIiIiIIIII = null;
        this.iIIiiIIIIi = 3 ^ 3;
        this.iiiiiIIiIi = 3 ^ 3;
        iiiIIIiIII3.iIIIiiiiIi = this.iiiiiIIiIi;
        iiiIIIiIII3.iiiIiiIIII = 5 >> 3;
        iiiIIIiIII3.iIiIiIIIII = BaritoneAPI.getProvider().getPrimaryBaritone();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIIIIiIiii.ALLATORIxDEMO("{oNbxF\u000bv[gJw;W+\u8bd4\u66f8\u6594\u523b\u6723\u65a6\u7276\u6770\uff75"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(class_1799 class_17992, class_1792 class_17922) {
        class_1799 class_17993 = class_17992;
        class_9288 iIiIiIIIII2 = (class_9288)class_17993.method_58694(class_9334.field_49622);
        if (iIiIiIIIII2 == null) {
            return (3 ^ 3) != 0;
        }
        for (class_1799 class_17994 : iIiIiIIIII2.method_57489().toList()) {
            void iIiIiIIIII3;
            if (class_17994.method_7960() || class_17994.method_7909() != iIiIiIIIII3) continue;
            return --1 != 0;
        }
        return false;
    }

    public static boolean iiIIiIIiii(class_1799 iIiIiIIIII2) {
        if (iiiIIIiIII.ALLATORIxDEMO(iIiIiIIIII2) > (0x5F & 0x34)) {
            return 5 >> 2;
        }
        return false;
    }

    private /* synthetic */ void IIiIiIiIiI() {
        if (this.iiiiiIIiIi > (0x3F & 0x54)) {
            iiiIIIiIII iiiIIIiIII2 = this;
            iiiIIIiIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iiiiiIIiIi);
            if (((Boolean)iiiIIIiIII2.IiiIiIiiIi.get()).booleanValue()) {
                this.info(iIIIIiIiii.ALLATORIxDEMO("\u62d5\u53d5\u7b42\u5fa6\u5ba7\u6213"), new Object[3 & 4]);
            }
        }
    }

    private /* synthetic */ void iiiiIIIiII() {
        iiiIIIiIII iiiIIIiIII2 = iiiIIIiIII7;
        if (((Boolean)iiiIIIiIII2.IiiIiIiiIi.get()).booleanValue()) {
            iiiIIIiIII2.info(iIIIIiIiii.ALLATORIxDEMO("\u6b48\u572b\u6278\u5f03\u6f57\u5f52\u76f9-\u0005-"), new Object[3 ^ 3]);
        }
        if (iiiIIIiIII2.IiiiiIiIiI == null) {
            iiiIIIiIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iiiiiIIiIi);
            return;
        }
        if (!iiiIIIiIII2.iIIIiiiiIi) {
            iiiIIIiIII iiiIIIiIII3 = iiiIIIiIII2;
            iiiIIIiIII3.ALLATORIxDEMO(iiiIIIiIII2.IiiiiIiIiI);
            iiiIIIiIII3.iIIIiiiiIi = --1;
            if (((Boolean)iiiIIIiIII3.IiiIiIiiIi.get()).booleanValue()) {
                iiiIIIiIII iiiIIIiIII4 = iiiIIIiIII2;
                iiiIIIiIII4.info("\u8f6c\u5934\u770b\u5411\u6f5c\u5f71\u76d2: " + iiiIIIiIII4.IiiiiIiIiI.method_23854(), new Object[3 ^ 3]);
            }
            return;
        }
        if (iiiIIIiIII2.iiiiiIIiIi < --3) {
            return;
        }
        if (!(iiiIIIiIII2.iIIiiIiIiI.field_1687.method_8320(iiiIIIiIII2.IiiiiIiIiI).method_26204() instanceof class_2480)) {
            iiiIIIiIII iiiIIIiIII5 = iiiIIIiIII2;
            iiiIIIiIII5.warning("\u76ee\u6807\u4f4d\u7f6e\u4e0d\u662f\u6f5c\u5f71\u76d2: " + iiiIIIiIII5.IiiiiIiIiI.method_23854(), new Object[2 & 5]);
            return;
        }
        iiiIIIiIII iiiIIIiIII6 = iiiIIIiIII2;
        iiiIIIiIII iiiIIIiIII7 = class_243.method_24953((class_2382)iiiIIIiIII6.IiiiiIiIiI);
        class_2350 class_23502 = class_2350.field_11036;
        iiiIIIiIII7 = new class_3965((class_243)iiiIIIiIII7, class_23502, iiiIIIiIII2.IiiiiIiIiI, 3 >> 2);
        iiiIIIiIII6.iIIiiIiIiI.field_1761.method_2896(iiiIIIiIII2.iIIiiIiIiI.field_1724, class_1268.field_5808, (class_3965)iiiIIIiIII7);
        iiiIIIiIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.IIiIiIIiii);
        if (((Boolean)iiiIIIiIII6.IiiIiIiiIi.get()).booleanValue()) {
            iiiIIIiIII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u6f01\u5f1d\u768f\u5d9e\u620e\u5f6c"), new Object[5 >> 3]);
        }
    }

    public int iiiIiIiiIi() {
        iiiIIIiIII iiiIIIiIII2 = this;
        int n = this = 9 & 0x7F;
        while (true) {
            if (n >= 36) break;
            class_1799 class_17992 = iiiIIIiIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(this);
            if (!class_17992.method_7960() && class_17992.method_7909() == class_1802.field_8833 && iiiIIIiIII.ALLATORIxDEMO(class_17992)) {
                return this;
            }
            n = ++this;
        }
        return -1;
    }

    public static int ALLATORIxDEMO(class_1799 class_17992) {
        class_1799 class_17993 = class_17992;
        if (class_17993.method_7960()) {
            return 3 >> 2;
        }
        class_1799 class_17994 = class_17993;
        int n = class_17994.method_7936();
        int iIiIiIIIII2 = class_17994.method_7919();
        return n - iIiIiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    public static int iiiIiIiiIi(class_1799 class_17992, class_1792 class_17922) {
        class_1799 class_17993 = class_17992;
        class_9288 iIiIiIIIII2 = (class_9288)class_17993.method_58694(class_9334.field_49622);
        if (iIiIiIIIII2 == null) {
            return 3 ^ 3;
        }
        int n = 0;
        for (class_1799 class_17994 : iIiIiIIIII2.method_57489().toList()) {
            void iIiIiIIIII3;
            if (class_17994.method_7960() || class_17994.method_7909() != iIiIiIIIII3) continue;
            n += class_17994.method_7947();
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n) {
        void iIiIiIIIII2;
        iiiIIIiIII iiiIIIiIII2 = this;
        int n2 = this = 5 >> 3;
        while (true) {
            if (n2 >= 9) break;
            if (iiiIIIiIII2.iIIiiIiIiI.field_1724.method_31548().method_5438(this).method_7960()) {
                iiiIIIiIII2.iIIiiIiIiI.field_1761.method_2906(iiiIIIiIII2.iIIiiIiIiI.field_1724.field_7512.field_7763, (int)iIiIiIIIII2, this, class_1713.field_7791, (class_1657)iiiIIIiIII2.iIIiiIiIiI.field_1724);
                iiiIIIiIII2.IIiIiiiiII = this;
                return;
            }
            n2 = ++this;
        }
        iiiIIIiIII2.iIIiiIiIiI.field_1761.method_2906(iiiIIIiIII2.iIIiiIiIiI.field_1724.field_7512.field_7763, (int)iIiIiIIIII2, 3 & 4, class_1713.field_7791, (class_1657)iiiIIIiIII2.iIIiiIiIiI.field_1724);
        iiiIIIiIII2.IIiIiiiiII = 3 ^ 3;
    }

    private /* synthetic */ void ALLATORIxDEMO(ShulkerBoxItemFetcher.State state) {
        iiiIIIiIII iiiIIIiIII2 = state2;
        ShulkerBoxItemFetcher.State state2 = state;
        iiiIIIiIII iIiIiIIIII2 = iiiIIIiIII2;
        if (iIiIiIIIII2.iIIIIIIiII != state2) {
            if (((Boolean)iIiIiIIIII2.IIiIiIIiii.get()).booleanValue()) {
                iiiIIIiIII iiiIIIiIII3 = iIiIiIIIII2;
                iiiIIIiIII3.info("\u72b6\u6001\u5207\u6362: " + iiiIIIiIII3.iIIIIIIiII.name() + " -> " + state2.name(), new Object[3 & 4]);
            }
            iIiIiIIIII2.iIIIIIIiII = state2;
            iIiIiIIIII2.iiiiiIIiIi = 3 >> 2;
            iIiIiIIIII2.iIIIiiiiIi = iIiIiIIIII2.iiiiiIIiIi;
        }
    }

    public void onDeactivate() {
        if (((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
            this.info(IiIIIiIiiI.ALLATORIxDEMO("\u6f30\u5f2c\u76be\u7214\u548d\u83ea\u53ba\u5635\u5d9e\u512e\u9581"), new Object[2 & 5]);
        }
        this.ALLATORIxDEMO();
    }

    public static boolean ALLATORIxDEMO(class_1799 iIiIiIIIII2) {
        if (iiiIIIiIII.ALLATORIxDEMO(iIiIiIIIII2) <= (0x36 & 0x5D)) {
            return --1 != 0;
        }
        return false;
    }

    @Override
    public void onActivate() {
        if (this.iIIiiIiIiI.field_1724 == null || this.iIIiiIiIiI.field_1687 == null) {
            if (((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
                this.error(IiIIIiIiiI.ALLATORIxDEMO("\u73d4\u5bfa\u624b\u4e7a\u7511\u4e56\u7a27\uff6d"), new Object[3 & 4]);
            }
            this.toggle();
            return;
        }
        if (PathManagers.get() instanceof NopPathManager) {
            this.info(iIIIIiIiii.ALLATORIxDEMO("\u9723\u898a!kwLbW{Rf\u000b\u81fc\u5296\u5bfc\u8dc0"), new Object[3 & 4]);
            this.toggle();
            return;
        }
        iiiIIIiIII iiiIIIiIII2 = this;
        iiiIIIiIII iiiIIIiIII3 = this;
        iiiIIIiIII iiiIIIiIII4 = this;
        this.iIIIIIIiII = ShulkerBoxItemFetcher.State.ALLATORIxDEMO;
        iiiIIIiIII4.IIIIiiIiii = 3 & 4;
        iiiIIIiIII4.IIiIiiiiII = -4 >> 2;
        iiiIIIiIII3.IiiiiIiIiI = null;
        iiiIIIiIII3.iIiIiIIIII = null;
        this.iIIiiIIIIi = 3 >> 2;
        this.iiiiiIIiIi = 3 >> 2;
        iiiIIIiIII2.iIIIiiiiIi = this.iiiiiIIiIi;
        iiiIIIiIII2.iiiIiiIIII = 2 & 5;
        if (((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
            iiiIIIiIII iiiIIIiIII5 = this;
            iiiIIIiIII5.info("\u5f00\u59cb\u5bfb\u627e\u6f5c\u5f71\u76d2\u4e2d\u7684 " + ((class_1792)iiiIIIiIII5.iIIiIiiiIi.get()).method_63680().getString(), new Object[3 ^ 3]);
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void IIIIiIIiII() {
        block28: {
            block27: {
                var1_1 = this;
                if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) {
                    var1_1.info(iIIIIiIiii.ALLATORIxDEMO("\u6b60\u5703\u63d3\u53dd\u724a\u54ea-\u0005-"), new Object[3 ^ 3]);
                }
                if (var1_1.iIIiiIiIiI.field_1755 == null) {
                    if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) {
                        var1_1.info(IiIIIiIiiI.ALLATORIxDEMO("\u7b34\u5fc9\u5bc4\u5624\u7511\u970e\u620e\u5f6csBSlu\u7520\u973f\u4e56\u7a27E"), new Object[5 >> 3]);
                    }
                    return;
                }
                if (!(var1_1.iIIiiIiIiI.field_1755 instanceof class_465)) {
                    if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) {
                        v0 = var1_1;
                        v0.info("\u7b49\u5f85\u5bb9\u5668\u754c\u9762\u6253\u5f00... (\u5f53\u524d\u754c\u9762: " + v0.iIIiiIiIiI.field_1755.getClass().getSimpleName() + ")", new Object[3 ^ 3]);
                    }
                    return;
                }
                var9_2 = (class_465)var1_1.iIIiiIiIiI.field_1755;
                var2_4 = var9_2.method_17577();
                if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) {
                    var1_1.info("\u5bb9\u5668\u754c\u9762\u5df2\u6253\u5f00: " + var9_2.getClass().getSimpleName(), new Object[2 & 5]);
                }
                var9_3 = var1_1.iIIiIiiiIi.get() == class_1802.field_8833 && ((Boolean)var1_1.iIiIiiiiII.get()).booleanValue() ? 3 >> 1 : 0;
                5 >> 3;
                if (var9_3 != 0) {
                    var10_5 = var1_1.iiiIiIiiIi();
                    if (var10_5 != -4 >> 2) {
                        if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) {
                            v1 = var1_1;
                            var4_6 = v1.iIIiiIiIiI.field_1724.method_31548().method_5438(var10_5);
                            v1.info("\u53d1\u73b0\u4f4e\u8010\u4e45\u9798\u7fc5 (\u8010\u4e45: " + iiiIIIiIII.ALLATORIxDEMO(var4_6) + ")\uff0c\u5148\u5b58\u5165\u6f5c\u5f71\u76d2", new Object[3 & 4]);
                        }
                        var1_1.iIIiiIiIiI.field_1761.method_2906(var2_4.field_7763, (124 & 39) + var10_5, 3 >> 2, class_1713.field_7794, (class_1657)var1_1.iIIiiIiIiI.field_1724);
                        v2 = 3 & 5;
                        return;
                    }
                }
                var10_5 = iiiIIIiIII.ALLATORIxDEMO();
                if (var10_5 <= (4 ^ 5)) {
                    if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) {
                        var1_1.info(iIIIIiIiii.ALLATORIxDEMO("\u5eb8\u5b5b\u7a71\u95d7\u4e26\u8db0\uff27\u4ec6\u4fd6\u757a\u4e2b\u683f\u7a51\u4f4e"), new Object[3 >> 2]);
                    }
                    var1_1.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.IiiIiIiiIi);
                    return;
                }
                var4_7 = 0;
                var5_8 = var2_4.field_7761.size() - (108 & 55);
                var6_9 = 3 & 4;
                v3 = var7_10 = (Boolean)var1_1.iIiIIiIIIi.get() != false ? (Integer)var1_1.IIiiIIIIIi.get() : 0x7FFFFFFF;
                if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) {
                    var1_1.info("\u5bb9\u5668\u69fd\u4f4d\u6570: " + var5_8 + ", \u603b\u69fd\u4f4d\u6570: " + var2_4.field_7761.size(), new Object[5 >> 3]);
                    v4 = var1_1;
                    if (((Boolean)var1_1.iIiIIiIIIi.get()).booleanValue()) {
                        v4.info("\u6307\u5b9a\u63d0\u53d6\u6a21\u5f0f: \u6700\u591a\u63d0\u53d6 " + var7_10 + " \u7ec4\u7269\u54c1", new Object[3 ^ 3]);
                    } else {
                        v4.info(IiIIIiIiiI.ALLATORIxDEMO("\u5115\u90a4\u638d\u53ba\u6a7c\u5f63gL\u63ad\u539a\u621d\u6765\u76b3\u686b\u7234\u54ad"), new Object[2 & 5]);
                    }
                }
                v5 = var8_11 = 0;
                while (v5 < var5_8) {
                    this = var2_4.method_7611(var8_11).method_7677();
                    if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue() && !this.method_7960()) {
                        var3_12 = "";
                        if (this.method_7909() == class_1802.field_8833) {
                            var3_12 = " (\u8010\u4e45: " + iiiIIIiIII.ALLATORIxDEMO((class_1799)this) + ")";
                        }
                        var1_1.info("\u69fd\u4f4d " + var8_11 + ": " + this.method_7909().method_63680().getString() + " x" + this.method_7947() + (String)var3_12, new Object[5 >> 3]);
                    }
                    if (!this.method_7960() && this.method_7909() == var1_1.iIIiIiiiIi.get()) {
                        if (var9_3 != 0 && !iiiIIIiIII.iiIIiIIiii((class_1799)this)) {
                            if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) {
                                var1_1.info("\u8df3\u8fc7\u4f4e\u8010\u4e45\u9798\u7fc5 (\u8010\u4e45: " + iiiIIIiIII.ALLATORIxDEMO((class_1799)this) + ")", new Object[2 & 5]);
                            }
                        } else {
                            if (((Boolean)var1_1.iIiIIiIIIi.get()).booleanValue() && var6_9 >= var7_10) {
                                if (!((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) break;
                                var1_1.info("\u5df2\u8fbe\u5230\u6307\u5b9a\u63d0\u53d6\u6570\u91cf\u9650\u5236 (" + var7_10 + " \u7ec4)\uff0c\u505c\u6b62\u63d0\u53d6", new Object[3 ^ 3]);
                                v6 = var4_7;
                                break block27;
                            }
                            v7 = var1_1;
                            v7.iIIiiIiIiI.field_1761.method_2906(var2_4.field_7763, var8_11, 3 >> 2, class_1713.field_7794, (class_1657)var1_1.iIIiiIiIiI.field_1724);
                            v8 = --1;
                            ++var6_9;
                            var4_7 = --1;
                            v7.iiiIiiIIII += this.method_7947();
                            if (((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) {
                                var3_12 = "";
                                if (this.method_7909() == class_1802.field_8833) {
                                    var3_12 = " (\u8010\u4e45: " + iiiIIIiIII.ALLATORIxDEMO((class_1799)this) + ")";
                                }
                                var1_1.info("\u63d0\u53d6\u4e86 " + this.method_7947() + " \u4e2a " + this.method_7964().getString() + (String)var3_12 + " (\u5df2\u63d0\u53d6 " + var6_9 + "/" + var7_10 + " \u7ec4)", new Object[5 >> 3]);
                            }
                            var10_5 = iiiIIIiIII.ALLATORIxDEMO();
                            if (var10_5 <= (2 ^ 3)) {
                                if (!((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) break;
                                var1_1.info(iIIIIiIiii.ALLATORIxDEMO("\u5eb0\u5b73\u7a79\u95df\u4e0e\u8db8\uff2f\u5077\u6b61\u63fb\u53d5"), new Object[2 & 5]);
                                v6 = var4_7;
                                break block27;
                            }
                        }
                    }
                    v5 = ++var8_11;
                }
                v6 = var4_7;
            }
            if (v6 != 0) break block28;
            if (!((Boolean)var1_1.IiiIiIiiIi.get()).booleanValue()) ** GOTO lbl175
            v9 = var1_1;
            if (((Boolean)var1_1.iIiIIiIIIi.get()).booleanValue()) {
                v9.info(IiIIIiIiiI.ALLATORIxDEMO("\u5dc8\u5b87\u626d\u634b\u5be7\u653c\u91b2\u639c\u538b\u627a\u6f01\u5f1d\u768f\u4e41\u6cdc\u6745\u66a9\u5976\u76b3\u686b\u7234\u54ad"), new Object[2 & 5]);
                v10 = var1_1;
            } else {
                v9.info(iIIIIiIiii.ALLATORIxDEMO("\u6f57\u5f52\u76f9\u4e2e\u6c8a\u670a\u66ff\u5939\u76c5\u6804\u7242\u54c2"), new Object[3 >> 2]);
lbl175:
                // 2 sources

                v10 = var1_1;
            }
            v10.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.IiiIiIiiIi);
        }
    }

    public static int ALLATORIxDEMO() {
        int n;
        int n2 = 3 & 4;
        class_310 class_3102 = class_310.method_1551();
        int n3 = n = 0x5D & 0x2B;
        while (true) {
            if (n3 >= 36) break;
            if (class_3102.field_1724.method_31548().method_5438(n).method_7960()) {
                ++n2;
            }
            n3 = ++n;
        }
        return n2;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iiiIIIiIII iiiIIIiIII2 = iiiIIIiIII3;
        iiiIIIiIII iiiIIIiIII3 = class_23382;
        iiiIIIiIII iIiIiIIIII2 = iiiIIIiIII2;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320((class_2338)iiiIIIiIII3).method_26215() && BlockUtils.canPlace((class_2338)iiiIIIiIII3) && !iIiIiIIIII2.iIIiiIiIiI.field_1687.method_8320(iiiIIIiIII3.method_10074()).method_26215()) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ void iiIIiIIiii() {
        iiiIIIiIII iiiIIIiIII2 = this;
        if (((Boolean)iiiIIIiIII2.IiiIiIiiIi.get()).booleanValue()) {
            iiiIIIiIII2.info(iIIIIiIiii.ALLATORIxDEMO("\u6b48\u572b\u633d\u639b\u6f57\u5f52\u76d9\r%\r"), new Object[2 & 5]);
        }
        if (iiiIIIiIII2.IiiiiIiIiI == null) {
            iiiIIIiIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iiiiiIIiIi);
            return;
        }
        if (iiiIIIiIII2.iIIiiIiIiI.field_1687.method_8320(iiiIIIiIII2.IiiiiIiIiI).method_26215()) {
            if (((Boolean)iiiIIIiIII2.IiiIiIiiIi.get()).booleanValue()) {
                iiiIIIiIII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u6f30\u5f0c\u769e\u5daf\u7ea3\u4e50\u5b34\u5775\u4eea"), new Object[3 ^ 3]);
            }
            iiiIIIiIII iiiIIIiIII3 = iiiIIIiIII2;
            iiiIIIiIII3.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iIIiIiiiIi);
            iiiIIIiIII3.iIiIiIIIII.getPathingBehavior().cancelEverything();
            return;
        }
        iiiIIIiIII iiiIIIiIII4 = iiiIIIiIII2;
        iiiIIIiIII4.ALLATORIxDEMO(iiiIIIiIII4.IiiiiIiIiI);
        iiiIIIiIII iiiIIIiIII5 = this = BetterBlockPos.from((class_2338)iiiIIIiIII4.IiiiiIiIiI);
        iiiIIIiIII4.iIiIiIIIII.getSelectionManager().addSelection((BetterBlockPos)iiiIIIiIII5, (BetterBlockPos)iiiIIIiIII5);
        iiiIIIiIII iiiIIIiIII6 = iiiIIIiIII2;
        iiiIIIiIII iiiIIIiIII7 = this;
        iiiIIIiIII6.iIiIiIIIII.getBuilderProcess().clearArea((class_2338)iiiIIIiIII7, (class_2338)iiiIIIiIII7);
        iiiIIIiIII6.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iIIiIiiiIi);
        if (((Boolean)iiiIIIiIII4.IiiIiIiiIi.get()).booleanValue()) {
            iiiIIIiIII2.info(iIIIIiIiii.ALLATORIxDEMO("\u6f5f\u5f7a\u76f1\u631d\u63bb\u5b87\u6233"), new Object[5 >> 3]);
        }
        if (((Boolean)iiiIIIiIII2.IiiIiIiiIi.get()).booleanValue()) {
            iiiIIIiIII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u7b14\u5fe9\u6283\u539a\u6f01\u5f1d\u768fBsB"), new Object[2 & 5]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public class_2338 ALLATORIxDEMO(class_2338 class_23382) {
        class_2338 class_23383;
        int n;
        void iIiIiIIIII2;
        class_2350[] class_2350Array = class_2350Array3;
        class_2338 class_23384 = iIiIiIIIII2.method_10093((class_2350)(class_2350Array3 = class_2350Array.iIIiiIiIiI.field_1724.method_5735()));
        if (class_2350Array.ALLATORIxDEMO(class_23384)) {
            if (((Boolean)class_2350Array.IIiIiIIiii.get()).booleanValue()) {
                class_2350Array.info("\u627e\u5230\u5408\u9002\u4f4d\u7f6e(\u9762\u671d\u65b9\u5411): " + class_23384.method_23854(), new Object[3 >> 2]);
            }
            return class_23384;
        }
        class_2350[] class_2350Array2 = new class_2350[3];
        class_2350Array2[2 & 5] = class_2350Array3.method_10170();
        class_2350Array2[--1] = class_2350Array3.method_10160();
        class_2350Array2[--2] = class_2350Array3.method_10153();
        class_2350[] class_2350Array3 = class_2350Array2;
        int n2 = class_2350Array2.length;
        int n3 = n = 5 >> 3;
        while (n3 < n2) {
            class_2350 class_23502 = class_2350Array3[n];
            class_23383 = iIiIiIIIII2.method_10093(class_23502);
            if (class_2350Array.ALLATORIxDEMO(class_23383)) {
                if (((Boolean)class_2350Array.IIiIiIIiii.get()).booleanValue()) {
                    class_2350Array.info("\u627e\u5230\u5408\u9002\u4f4d\u7f6e(\u76f8\u90bb\u65b9\u5411): " + class_23383.method_23854(), new Object[3 & 4]);
                }
                return class_23383;
            }
            n3 = ++n;
        }
        int n4 = this = 1;
        while (true) {
            if (n4 < -1) break;
            int n5 = 3 ^ 3;
            class_2338 class_23385 = iIiIiIIIII2.method_10069(n5, this, n5);
            if (class_2350Array.ALLATORIxDEMO(class_23385)) {
                if (((Boolean)class_2350Array.IIiIiIIiii.get()).booleanValue()) {
                    class_2350Array.info("\u627e\u5230\u5408\u9002\u4f4d\u7f6e(\u4e0a\u4e0b\u65b9\u5411): " + class_23385.method_23854(), new Object[3 & 4]);
                }
                return class_23385;
            }
            n4 = this -= 2;
        }
        int n6 = this = 1;
        while (true) {
            if (n6 > 3) break;
            int n7 = -this;
            while (n7 <= this) {
                int n8;
                int n9 = -this;
                while (n9 <= this) {
                    block19: {
                        block20: {
                            if (Math.abs(n8) == (2 ^ 3) && n == 0) break block19;
                            if (n8 != 0) break block20;
                            if (Math.abs(n) == 5 >> 2) break block19;
                        }
                        if (!(n8 == 0 && n == 0 || Math.abs(n8) != this && Math.abs(n) != this)) {
                            int n10;
                            int n11 = n10 = -1;
                            while (true) {
                                if (n11 > 1) break;
                                class_23383 = iIiIiIIIII2.method_10069(n8, n10, n);
                                if (class_2350Array.ALLATORIxDEMO(class_23383)) {
                                    if (((Boolean)class_2350Array.IIiIiIIiii.get()).booleanValue()) {
                                        int n12 = n8;
                                        int n13 = n10;
                                        int n14 = n;
                                        double d = Math.sqrt(n12 * n12 + n13 * n13 + n14 * n14);
                                        Object[] objectArray = new Object[2 ^ 3];
                                        objectArray[5 >> 3] = d;
                                        class_2350Array.info("\u627e\u5230\u5408\u9002\u4f4d\u7f6e(\u5bf9\u89d2\u7ebf): " + class_23383.method_23854() + " (\u8ddd\u79bb: " + String.format(iIIIIiIiii.ALLATORIxDEMO("\n)\u001cc"), objectArray) + ")", new Object[3 >> 2]);
                                    }
                                    return class_23383;
                                }
                                n11 = ++n10;
                            }
                        }
                    }
                    n9 = ++n;
                }
                n7 = ++n8;
            }
            n6 = ++this;
        }
        if (((Boolean)class_2350Array.IiiIiIiiIi.get()).booleanValue()) {
            class_2350Array.error(IiIIIiIiiI.ALLATORIxDEMO("\u5755\u007f\u6861\u836f\u56a9\u51e9\u6777\u6212\u524d\u5444\u905f\u76e8\u6563\u7f02\u4f10\u7f02"), new Object[5 >> 3]);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(class_1799 class_17992, class_1792 class_17922) {
        class_1799 class_17993 = class_17992;
        class_9288 iIiIiIIIII2 = (class_9288)class_17993.method_58694(class_9334.field_49622);
        if (iIiIiIIIII2 == null) {
            return 2 & 5;
        }
        int n = 0;
        for (class_1799 class_17994 : iIiIiIIIII2.method_57489().toList()) {
            void iIiIiIIIII3;
            if (class_17994.method_7960() || class_17994.method_7909() != iIiIiIIIII3) continue;
            ++n;
        }
        return n;
    }

    private /* synthetic */ void iiiIiIiiIi() {
        if (((Boolean)this.IiiIiIiiIi.get()).booleanValue()) {
            this.info(iIIIIiIiii.ALLATORIxDEMO("\u6b48\u572b\u6417\u7d01\u5eb8\u5b5b\u4e26\u76a7\u6f57\u5f52\u76f9-%\r"), new Object[2 & 5]);
        }
        this.IIiIiiiiII = IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            iiiIIIiIII iiiIIIiIII2 = iiiIIIiIII3;
            iiiIIIiIII iiiIIIiIII3 = class_17992;
            iiiIIIiIII iIiIiIIIII2 = iiiIIIiIII2;
            if (iiiIIIiIII3.method_7960()) {
                return 5 >> 3;
            }
            class_1792 class_17922 = iiiIIIiIII3.method_7909();
            if (class_17922 instanceof class_1747 && (class_17922 = ((class_1747)class_17922).method_7711()) instanceof class_2480 && iIiIiIIIII2.IIIIiIIiII((class_1799)iiiIIIiIII3)) {
                if (iIiIiIIIII2.iIIiIiiiIi.get() == class_1802.field_8833 && ((Boolean)iIiIiIIIII2.iIiIiiiiII.get()).booleanValue()) {
                    class_17922 = (class_9288)iiiIIIiIII3.method_58694(class_9334.field_49622);
                    if (class_17922 != null) {
                        int n = 2 & 5;
                        int n2 = 2 & 5;
                        for (class_1799 class_17993 : class_17922.method_57489().toList()) {
                            if (class_17993.method_7960() || class_17993.method_7909() != class_1802.field_8833) continue;
                            ++n2;
                            if (!iiiIIIiIII.iiIIiIIiii(class_17993)) continue;
                            int cfr_ignored_0 = 3 >> 1;
                        }
                        if (n != 0) {
                            if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
                                iIiIiIIIII2.info("\u627e\u5230\u6f5c\u5f71\u76d2\u5305\u542b\u9ad8\u8010\u4e45\u9798\u7fc5 (\u5171 " + n2 + " \u4e2a\u9798\u7fc5)", new Object[3 ^ 3]);
                                if (((Boolean)iIiIiIIIII2.iIiIIiIIIi.get()).booleanValue()) {
                                    int n3 = iiiIIIiIII.ALLATORIxDEMO((class_1799)iiiIIIiIII3, (class_1792)iIiIiIIIII2.iIIiIiiiIi.get());
                                    iiiIIIiIII iiiIIIiIII4 = iIiIiIIIII2;
                                    iiiIIIiIII4.info("\u53ef\u7528\u7ec4\u6570: " + n3 + ", \u9700\u8981\u63d0\u53d6: " + String.valueOf(iiiIIIiIII4.IIiiIIIIIi.get()) + " \u7ec4", new Object[3 & 4]);
                                }
                            }
                            iIiIiIIIII2.iIiIiIIIII = iiiIIIiIII3.method_7972();
                            iIiIiIIIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.IIIIiiIiii);
                            return (4 ^ 5) != 0;
                        }
                        if (n2 > 0 && ((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
                            iIiIiIIIII2.info(IiIIIiIiiI.ALLATORIxDEMO("\u8dae\u8fab\u4f33\u805c\u4e18\u97f4\u7f98\u6f30\u5f2c\u76be"), new Object[3 >> 2]);
                        }
                    }
                } else if (((Boolean)iIiIiIIIII2.iIiIIiIIIi.get()).booleanValue()) {
                    int n = iiiIIIiIII.ALLATORIxDEMO((class_1799)iiiIIIiIII3, (class_1792)iIiIiIIIII2.iIIiIiiiIi.get());
                    if (n > 0) {
                        if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
                            iiiIIIiIII iiiIIIiIII5 = iIiIiIIIII2;
                            iiiIIIiIII5.info("\u627e\u5230\u6f5c\u5f71\u76d2\u5305\u542b " + n + " \u7ec4 " + ((class_1792)iiiIIIiIII5.iIIiIiiiIi.get()).method_63680().getString(), new Object[2 & 5]);
                        }
                        iIiIiIIIII2.iIiIiIIIII = iiiIIIiIII3.method_7972();
                        iIiIiIIIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.IIIIiiIiii);
                        return (3 & 5) != 0;
                    }
                } else {
                    iIiIiIIIII2.iIiIiIIIII = iiiIIIiIII3.method_7972();
                    iIiIiIIIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.IIIIiiIiii);
                    return (2 ^ 3) != 0;
                }
            }
            return false;
        });
        if (this.IIiIiiiiII == -4 >> 2) {
            iiiIIIiIII iiiIIIiIII2;
            if (this.iIIiIiiiIi.get() == class_1802.field_8833 && ((Boolean)this.iIiIiiiiII.get()).booleanValue()) {
                this.error(IiIIIiIiiI.ALLATORIxDEMO("\u6777\u6212\u526d\u5369\u5476\u9ab4\u806d\u4e09\u97c5\u7fa9\u76d9\u6f30\u5f2c\u76be"), new Object[2 & 5]);
                iiiIIIiIII2 = this;
            } else {
                iiiIIIiIII iiiIIIiIII3 = this;
                iiiIIIiIII3.error("\u672a\u627e\u5230\u5305\u542b " + ((class_1792)iiiIIIiIII3.iIIiIiiiIi.get()).method_63680().getString() + " \u7684\u6f5c\u5f71\u76d2", new Object[2 & 5]);
                iiiIIIiIII2 = this;
            }
            iiiIIIiIII2.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.iiiiiIIiIi);
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiiIIIiIII iiiIIIiIII2 = this;
        iiiIIIiIII iiiIIIiIII3 = this;
        this.iIIIIIIiII = ShulkerBoxItemFetcher.State.ALLATORIxDEMO;
        iiiIIIiIII3.IIIIiiIiii = 3 & 4;
        iiiIIIiIII3.IIiIiiiiII = -4 >> 2;
        iiiIIIiIII2.IiiiiIiIiI = null;
        iiiIIIiIII2.iIiIiIIIII = null;
        this.iIIiiIIIIi = 2 & 5;
        this.iiiiiIIiIi = 5 >> 3;
        this.iIIIiiiiIi = this.iiiiiIIiIi;
        this.iiiIiiIIII = 3 ^ 3;
        this.iIiIiIIIII.getSelectionManager().removeAllSelections();
        this.iIiIiIIIII.getPathingBehavior().cancelEverything();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        void iIiIiIIIII2;
        iiiIIIiIII iiiIIIiIII2 = iiiIIIiIII4;
        if (iiiIIIiIII2.iIIiiIiIiI.field_1724 == null || !((Boolean)iiiIIIiIII2.ALLATORIxDEMO.get()).booleanValue()) {
            return;
        }
        iiiIIIiIII iiiIIIiIII3 = iiiIIIiIII2;
        iiiIIIiIII iiiIIIiIII4 = iiiIIIiIII3.iIIiiIiIiI.field_1724.method_33571();
        iiiIIIiIII iiiIIIiIII5 = iiiIIIiIII4 = class_243.method_24953((class_2382)iIiIiIIIII2).method_1020((class_243)iiiIIIiIII4).method_1029();
        float f = (float)(class_3532.method_15349((double)((class_243)iiiIIIiIII4).field_1350, (double)((class_243)iiiIIIiIII5).field_1352) * 180.0 / Math.PI) - 90.0f;
        float this2 = (float)(-(class_3532.method_15349((double)((class_243)iiiIIIiIII5).field_1351, (double)Math.sqrt(((class_243)iiiIIIiIII4).field_1352 * ((class_243)iiiIIIiIII4).field_1352 + ((class_243)iiiIIIiIII4).field_1350 * ((class_243)iiiIIIiIII4).field_1350)) * 180.0 / Math.PI));
        Rotations.rotate((double)f, (double)this2);
        if (((Boolean)iiiIIIiIII3.IIiIiIIiii.get()).booleanValue()) {
            Object[] objectArray = new Object[3 & 5];
            objectArray[3 & 4] = Float.valueOf(f);
            Object[] objectArray2 = new Object[--1];
            objectArray2[3 >> 2] = Float.valueOf(this2);
            iiiIIIiIII2.info("\u8f6c\u5934\u770b\u5411\u65b9\u5757: " + iIiIiIIIII2.method_23854() + " (\u504f\u822a: " + String.format(IiIIIiIiiI.ALLATORIxDEMO("xBl\n"), objectArray) + ", \u4fef\u4ef0: " + String.format(iIIIIiIiii.ALLATORIxDEMO("\n)\u001cc"), objectArray2) + ")", new Object[5 >> 3]);
        }
    }
}

