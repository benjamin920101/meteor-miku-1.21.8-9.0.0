/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.NopPathManager
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIIIIIIi;
import com.github.mikumiku.addon.IiIiiiIIII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.github.mikumiku.addon.modules.MEnum;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.NopPathManager;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiIiiiiI
extends iIiIiIIIii {
    private final SettingGroup IIIIiiIiii;
    private final Setting<MEnum.WalkDirection> IiiIiIiiIi;
    private final Setting<MEnum.WalkMode> IIiIiIIiii;
    private int iIIiiIiIiI;
    public class_310 iIIiiIiIiI;
    private final Setting<Integer> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private static final int ALLATORIxDEMO = 20;

    @Override
    public void onActivate() {
        this.iIIiiIiIiI = 3 ^ 3;
        if (this.IIiIiIIiii.get() == MEnum.WalkMode.iiiiiIIiIi) {
            this.iiiIiIiiIi();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_304 class_3042, boolean bl) {
        void iIiIiIIIII2;
        boolean bl2 = bl;
        IiiiIiiiiI iIiIiIIIII3 = this;
        void v0 = iIiIiIIIII2;
        v0.method_23481(bl2);
        Input.setKeyState((class_304)v0, (boolean)bl2);
    }

    private /* synthetic */ void iiiIiIiiIi() {
        PathManagers.get().moveInDirection(this.iIIiiIiIiI.field_1724.method_36454());
    }

    private /* synthetic */ void ALLATORIxDEMO(boolean bl) {
        IiiiIiiiiI iIiIiIIIII2;
        boolean bl2 = bl;
        IiiiIiiiiI iiiiIiiiiI = iIiIiIIIII2 = this;
        iiiiIiiiiI.ALLATORIxDEMO(iiiiIiiiiI.iIIiiIiIiI.field_1690.field_1894, 3 >> 2);
        iiiiIiiiiI.ALLATORIxDEMO(iiiiIiiiiI.iIIiiIiIiI.field_1690.field_1881, (3 ^ 3) != 0);
        iiiiIiiiiI.ALLATORIxDEMO(iiiiIiiiiI.iIIiiIiIiI.field_1690.field_1913, (3 & 4) != 0);
        iiiiIiiiiI.ALLATORIxDEMO(iiiiIiiiiI.iIIiiIiIiI.field_1690.field_1849, (2 & 5) != 0);
        if (bl2) {
            IiiiIiiiiI iiiiIiiiiI2 = iIiIiIIIII2;
            iiiiIiiiiI2.ALLATORIxDEMO(iiiiIiiiiI2.iIIiiIiIiI.field_1690.field_1867, (2 & 5) != 0);
        }
    }

    public IiiiIiiiiI() {
        IiiiIiiiiI iiiiIiiiiI = this;
        IiiiIiiiiI iiiiIiiiiI2 = this;
        super(MoveEvent.ALLATORIxDEMO("\u81a0\u52a4\u8d1a\u8dc3"), IiIiiiIIII.ALLATORIxDEMO("\u81e6\u52bb\u8d7c\u8dfc\"\u0013\u58b2\u52e6\u4edf\u4e13\u4e26\u6176\u9014\u6a32\u5f03 1\u65fd\u4fe4"));
        this.IIIIiiIiii = iiiiIiiiiI2.settings.getDefaultGroup();
        iiiiIiiiiI.iIIiiIiIiI = 3 >> 2;
        iiiiIiiiiI.IIiIiIIiii = this.IIIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6a4b\u5f23"))).description(IiIiiiIIII.ALLATORIxDEMO("\u8840\u8d7e\u6a30\u5f4b\u3059"))).defaultValue((Object)MEnum.WalkMode.iiiiiIIiIi)).onChanged(walkMode -> {
            IiiiIiiiiI iiiiIiiiiI = object;
            Object object = walkMode;
            IiiiIiiiiI iIiIiIIIII2 = iiiiIiiiiI;
            if (iIiIiIIIII2.isActive()) {
                IiiiIiiiiI iiiiIiiiiI2;
                if (object == MEnum.WalkMode.ALLATORIxDEMO) {
                    PathManagers.get().stop();
                    iiiiIiiiiI2 = iIiIiIIIII2;
                } else {
                    IiiiIiiiiI iiiiIiiiiI3 = iIiIiIIIII2;
                    iiiiIiiiiI2 = iiiiIiiiiI3;
                    iiiiIiiiiI3.iiiIiIiiIi();
                }
                iiiiIiiiiI2.ALLATORIxDEMO(true);
            }
        })).build());
        this.IiiIiIiiIi = this.IIIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u7bca\u5359\u6a6b\u5f03\u65d3\u543d"))).description(IiIiiiIIII.ALLATORIxDEMO("\u7bd9\u5346\u6a2d\u5f1b\u4e00\u7697\u8840\u8d7e\u65a8\u5455\u3059"))).defaultValue((Object)MEnum.WalkDirection.ALLATORIxDEMO)).onChanged(walkDirection -> {
            IiiiIiiiiI iiiiIiiiiI = object;
            Object object = walkDirection;
            IiiiIiiiiI iIiIiIIIII2 = iiiiIiiiiI;
            if (iIiIiIIIII2.isActive()) {
                iIiIiIIIII2.ALLATORIxDEMO((3 & 4) != 0);
            }
        })).visible(() -> {
            if (this.IIiIiIIiii.get() == MEnum.WalkMode.ALLATORIxDEMO) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.iIiIiIIIII = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u75d4\u8dfd"))).description(IiIiiiIIII.ALLATORIxDEMO("\u885f\u8d7c\u65f8\u75af\u8d95\u3059"))).defaultValue((Object)((3 & 4) != 0))).visible(() -> {
            if (this.IIiIiIIiii.get() == MEnum.WalkMode.ALLATORIxDEMO) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIIiIiiiIi = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6128\u9013\u8826\u8d5c"))).description(IiIiiiIIII.ALLATORIxDEMO("\u5423\u753c\u6169\u900c\u8840\u8d7e\u6a30\u5f4b\u3059"))).defaultValue((Object)((2 & 5) != 0))).visible(() -> {
            if (this.IIiIiIIiii.get() == MEnum.WalkMode.ALLATORIxDEMO) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iiiiiIIiIi = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6343\u9522\u634b\u7ee1\u659c\u95d8"))).description(IiIiiiIIII.ALLATORIxDEMO("\u616e\u900c\u8840\u8d43\u65da\u6bdc>#\u5237\u547b\u6713\u5196\u6305\u951d\u632d\u7eab\u76dd\u5228\u657c\u3016\u657b\u502f\u8d86\u5c01\u8d9b\u6126\u3059"))).defaultValue((Object)(3 & 5))).min(--1).max(0x77 & 0x1B).sliderMax(0x57 & 0x3C).visible(() -> {
            if (this.IIiIiIIiii.get() == MEnum.WalkMode.ALLATORIxDEMO && ((Boolean)this.iIIiIiiiIi.get()).booleanValue()) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.iIIiiIiIiI = class_310.method_1551();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u001dgh*\u0019Ijy:h+x\u000f\rj\u8bfb\u66be\u65bc\u527a\u670c\u65fa\u7244\u6746\uff2d"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiiiIiiiiI iiiiIiiiiI;
        switch (IiIIIIIIIi.ALLATORIxDEMO[((MEnum.WalkDirection)((Object)this.IiiIiIiiIi.get())).ordinal()]) {
            case 1: {
                IiiiIiiiiI iiiiIiiiiI2 = this;
                while (false) {
                }
                iiiiIiiiiI = iiiiIiiiiI2;
                iiiiIiiiiI2.ALLATORIxDEMO(iiiiIiiiiI2.iIIiiIiIiI.field_1690.field_1894, --1 != 0);
                break;
            }
            case 2: {
                IiiiIiiiiI iiiiIiiiiI3 = this;
                iiiiIiiiiI = iiiiIiiiiI3;
                iiiiIiiiiI3.ALLATORIxDEMO(iiiiIiiiiI3.iIIiiIiIiI.field_1690.field_1881, (2 ^ 3) != 0);
                break;
            }
            case 3: {
                IiiiIiiiiI iiiiIiiiiI4 = this;
                iiiiIiiiiI = iiiiIiiiiI4;
                iiiiIiiiiI4.ALLATORIxDEMO(iiiiIiiiiI4.iIIiiIiIiI.field_1690.field_1913, (3 & 5) != 0);
                break;
            }
            case 4: {
                IiiiIiiiiI iiiiIiiiiI5 = this;
                iiiiIiiiiI5.ALLATORIxDEMO(iiiiIiiiiI5.iIIiiIiIiI.field_1690.field_1849, 5 >> 2);
            }
            default: {
                iiiiIiiiiI = this;
            }
        }
        if (((Boolean)iiiiIiiiiI.iIiIiIIIII.get()).booleanValue()) {
            IiiiIiiiiI iiiiIiiiiI6 = this;
            iiiiIiiiiI6.ALLATORIxDEMO(this.iIIiiIiIiI.field_1690.field_1867, (Boolean)iiiiIiiiiI6.iIiIiIIIII.get());
        }
    }

    public void onDeactivate() {
        if (this.IIiIiIIiii.get() == MEnum.WalkMode.ALLATORIxDEMO) {
            this.ALLATORIxDEMO(5 >> 2);
            return;
        }
        PathManagers.get().stop();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventHandler(priority=100)
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiiiIiiiiI iiiiIiiiiI = iiiiIiiiiI2;
        IiiiIiiiiI iiiiIiiiiI2 = pre;
        IiiiIiiiiI iIiIiIIIII2 = iiiiIiiiiI;
        if (iIiIiIIIII2.IIiIiIIiii.get() == MEnum.WalkMode.ALLATORIxDEMO) {
            if (((Boolean)iIiIiIIIII2.iIIiIiiiIi.get()).booleanValue()) {
                IiiiIiiiiI iiiiIiiiiI3;
                IiiiIiiiiI iiiiIiiiiI4 = iIiIiIIIII2;
                iiiiIiiiiI4.iIIiiIiIiI += 4 ^ 5;
                if (iiiiIiiiiI4.iIIiiIiIiI <= (Integer)iIiIiIIIII2.iiiiiIIiIi.get()) {
                    IiiiIiiiiI iiiiIiiiiI5 = iIiIiIIIII2;
                    iiiiIiiiiI3 = iiiiIiiiiI5;
                    iiiiIiiiiI5.ALLATORIxDEMO();
                } else {
                    IiiiIiiiiI iiiiIiiiiI6 = iIiIiIIIII2;
                    iiiiIiiiiI3 = iiiiIiiiiI6;
                    iiiiIiiiiI6.ALLATORIxDEMO((3 & 4) != 0);
                }
                if (iiiiIiiiiI3.iIIiiIiIiI < (0x75 & 0x1E)) return;
                iIiIiIIIII2.iIIiiIiIiI = 3 ^ 3;
                return;
            }
            iIiIiIIIII2.ALLATORIxDEMO();
            return;
        }
        if (!(PathManagers.get() instanceof NopPathManager)) return;
        iIiIiIIIII2.info(IiIiiiIIII.ALLATORIxDEMO("\u6650\u80d5\u6a16\u5f3c\u972c\u8983=|@MICG[O"), new Object[2 & 5]);
        iIiIiIIIII2.toggle();
    }
}

