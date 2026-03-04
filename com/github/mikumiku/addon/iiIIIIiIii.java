/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fi.dy.masa.litematica.data.DataManager
 *  fi.dy.masa.litematica.schematic.placement.SchematicPlacement
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIiIiII;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIIIii;
import fi.dy.masa.litematica.data.DataManager;
import fi.dy.masa.litematica.schematic.placement.SchematicPlacement;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIIIiIii
extends iIiIiIIIii {
    private final SettingGroup IIiIiiiiII;
    private boolean IIiiIIIIIi;
    private class_2338 iIiiiIiIii;
    private final Setting<class_2350> iIiIiiiiII;
    private class_2338 IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Integer> IIiIiIIiii;
    private SchematicPlacement iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private int ALLATORIxDEMO;

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        block5: {
            iiIIIIiIii iiIIIIiIii2 = iiIIIIiIii3;
            iiIIIIiIii iiIIIIiIii3 = class_23382;
            iiIIIIiIii iIiIiIIIII2 = iiIIIIiIii2;
            SchematicPlacement schematicPlacement = iIiIiIIIII2.ALLATORIxDEMO();
            if (schematicPlacement == null || iIiIiIIIII2.iIiiiIiIii == null) {
                return;
            }
            try {
                class_2338 class_23383 = schematicPlacement.getOrigin();
                iiIIIIiIii3 = new class_2338(iiIIIIiIii3.method_10263() + iIiIiIIIII2.iIiiiIiIii.method_10263(), class_23383.method_10264(), iiIIIIiIii3.method_10260() + iIiIiIIIII2.iIiiiIiIii.method_10260());
                if (!class_23383.equals((Object)iiIIIIiIii3)) {
                    schematicPlacement.setOrigin((class_2338)iiIIIIiIii3, null);
                    if (((Boolean)iIiIiIIIII2.iIIiIiiiIi.get()).booleanValue()) {
                        iIiIiIIIII2.info("\u8ddf\u968f\u73a9\u5bb6: \u6295\u5f71\u5df2\u79fb\u52a8\u5230 " + iiIIIIiIii3.method_23854(), new Object[2 & 5]);
                        return;
                    }
                }
            }
            catch (Exception exception) {
                if (!((Boolean)iIiIiIIIII2.iIIiIiiiIi.get()).booleanValue()) break block5;
                iIiIiIIIII2.error("\u8ddf\u968f\u73a9\u5bb6\u79fb\u52a8\u6295\u5f71\u5931\u8d25: " + exception.getMessage(), new Object[3 ^ 3]);
            }
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiIIIIiIii iiIIIIiIii2 = iiIIIIiIii3;
        iiIIIIiIii iiIIIIiIii3 = pre;
        iiIIIIiIii iIiIiIIIII2 = iiIIIIiIii2;
        if (class_310.method_1551().field_1724 == null || class_310.method_1551().field_1687 == null) {
            return;
        }
        iiIIIIiIii iiIIIIiIii4 = iIiIiIIIII2;
        if (((Boolean)iIiIiIIIII2.iIiIiIIIII.get()).booleanValue()) {
            iiIIIIiIii4.iIiIiiiiii();
            return;
        }
        iiIIIIiIii4.ALLATORIxDEMO += 2 ^ 3;
        iiIIIIiIii iiIIIIiIii5 = iIiIiIIIII2;
        if (iiIIIIiIii5.ALLATORIxDEMO >= (Integer)iiIIIIiIii5.IIiIiIIiii.get()) {
            iIiIiIIIII2.ALLATORIxDEMO = 2 & 5;
            iIiIiIIIII2.iiIIiIIiii();
        }
    }

    public void IIIIIIIiII() {
        this.iIiIiiiiII.set((Object)class_2350.field_11043);
    }

    private /* synthetic */ SchematicPlacement ALLATORIxDEMO() {
        iiIIIIiIii iiIIIIiIii2;
        block4: {
            iiIIIIiIii2 = iiIIIIiIii3;
            if (!((Boolean)iiIIIIiIii2.IiiIiIiiIi.get()).booleanValue()) {
                return iiIIIIiIii2.iIIiiIiIiI;
            }
            try {
                iiIIIIiIii iiIIIIiIii3 = DataManager.getSchematicPlacementManager();
                if (iiIIIIiIii3 != null) {
                    iiIIIIiIii2.iIIiiIiIiI = iiIIIIiIii3.getSelectedSchematicPlacement();
                }
            }
            catch (Exception exception) {
                if (!((Boolean)iiIIIIiIii2.iIIiIiiiIi.get()).booleanValue()) break block4;
                iiIIIIiIii2.error("\u83b7\u53d6\u5f53\u524d\u6295\u5f71\u4f4d\u7f6e\u5931\u8d25: " + exception.getMessage(), new Object[3 & 4]);
            }
        }
        return iiIIIIiIii2.iIIiiIiIiI;
    }

    public int ALLATORIxDEMO() {
        return (Integer)this.IIiIiIIiii.get();
    }

    public boolean iiIIiIIiii() {
        return this.IIiiIIIIIi;
    }

    public void IIiIiIiiii() {
        this.iIiIiiiiII.set((Object)class_2350.field_11034);
    }

    private /* synthetic */ void iIiIiiiiii() {
        block5: {
            iiIIIIiIii iiIIIIiIii2 = iiIIIIiIii3;
            if (class_310.method_1551().field_1724 == null) {
                return;
            }
            if (!iiIIIIiIii2.IIiiIIIIIi) {
                iiIIIIiIii2.iiiiIIIiII();
                return;
            }
            try {
                iiIIIIiIii iiIIIIiIii3 = class_310.method_1551().field_1724.method_24515();
                class_2338 class_23382 = new class_2338(iiIIIIiIii3.method_10263(), 3 & 4, iiIIIIiIii3.method_10260());
                if (iiIIIIiIii2.IIIIiiIiii == null || !iiIIIIiIii2.IIIIiiIiii.equals((Object)class_23382)) {
                    class_2338 class_23383 = class_23382;
                    iiIIIIiIii2.ALLATORIxDEMO(class_23383);
                    iiIIIIiIii2.IIIIiiIiii = class_23383;
                    return;
                }
            }
            catch (Exception exception) {
                if (!((Boolean)iiIIIIiIii2.iIIiIiiiIi.get()).booleanValue()) break block5;
                iiIIIIiIii2.error("\u5904\u7406\u8ddf\u968f\u73a9\u5bb6\u529f\u80fd\u5931\u8d25: " + exception.getMessage(), new Object[5 >> 3]);
            }
        }
    }

    public class_2338 ALLATORIxDEMO() {
        return this.iIiiiIiIii;
    }

    public boolean iiiIiIiiIi() {
        return (Boolean)this.iIiIiIIIII.get();
    }

    public class_2350 ALLATORIxDEMO() {
        return (class_2350)this.iIiIiiiiII.get();
    }

    public void iIiIiIiIii() {
        this.iIiIiiiiII.set((Object)class_2350.field_11033);
    }

    public boolean ALLATORIxDEMO() {
        return (Boolean)this.IiiIiIiiIi.get();
    }

    @Override
    public void onActivate() {
        iiIIIIiIii iiIIIIiIii2 = this;
        iiIIIIiIii2.ALLATORIxDEMO = 5 >> 3;
        iiIIIIiIii2.IIiiIIIIIi = 3 >> 2;
        this.IIIIiiIiii = null;
        this.iIiiiIiIii = null;
        if (((Boolean)this.iIIiIiiiIi.get()).booleanValue()) {
            this.info(IiIiIiIiII.iiiIiIiiIi("\u62ac\u5f06\u79e2\u52ff\u5651\u5d85\u5416\u755f"), new Object[2 & 5]);
        }
        iiIIIIiIii iiIIIIiIii3 = this;
        iiIIIIiIii3.ALLATORIxDEMO();
        if (((Boolean)iiIIIIiIii3.iIiIiIIIII.get()).booleanValue()) {
            this.iiiiIIIiII();
        }
    }

    public void IIiIiIiIiI() {
        this.iIiIiiiiII.set((Object)class_2350.field_11036);
    }

    private /* synthetic */ void iiiiIIIiII() {
        block6: {
            iiIIIIiIii iiIIIIiIii2 = iiIIIIiIii3;
            if (class_310.method_1551().field_1724 == null) {
                return;
            }
            SchematicPlacement schematicPlacement = iiIIIIiIii2.ALLATORIxDEMO();
            if (schematicPlacement == null) {
                if (((Boolean)iiIIIIiIii2.iIIiIiiiIi.get()).booleanValue()) {
                    iiIIIIiIii2.warning(IiiiIiiIII.ALLATORIxDEMO("\u6747\u624c\u527d\u62a7\u5f3c\uff3e\u65ad\u6ce7\u5250\u59d9\u537b\u8ded\u96c2\u73bb\u5bdb\u528d\u8090"), new Object[2 & 5]);
                }
                return;
            }
            try {
                iiIIIIiIii iiIIIIiIii3 = class_310.method_1551().field_1724.method_24515();
                schematicPlacement = schematicPlacement.getOrigin();
                iiIIIIiIii iiIIIIiIii4 = iiIIIIiIii2;
                iiIIIIiIii4.iIiiiIiIii = new class_2338(schematicPlacement.method_10263() - iiIIIIiIii3.method_10263(), 3 & 4, schematicPlacement.method_10260() - iiIIIIiIii3.method_10260());
                iiIIIIiIii iiIIIIiIii5 = iiIIIIiIii2;
                iiIIIIiIii2.IIIIiiIiii = new class_2338(iiIIIIiIii3.method_10263(), 5 >> 3, iiIIIIiIii3.method_10260());
                iiIIIIiIii2.IIiiIIIIIi = 2 ^ 3;
                if (((Boolean)iiIIIIiIii2.iIIiIiiiIi.get()).booleanValue()) {
                    iiIIIIiIii iiIIIIiIii6 = iiIIIIiIii2;
                    iiIIIIiIii6.info("\u8ddf\u968f\u73a9\u5bb6\u529f\u80fd\u5df2\u521d\u59cb\u5316\u3002\u76f8\u5bf9\u504f\u79fb: " + iiIIIIiIii2.iIiiiIiIii.method_10263() + ", " + iiIIIIiIii6.iIiiiIiIii.method_10260(), new Object[3 >> 2]);
                    return;
                }
            }
            catch (Exception exception) {
                if (!((Boolean)iiIIIIiIii2.iIIiIiiiIi.get()).booleanValue()) break block6;
                iiIIIIiIii2.error("\u521d\u59cb\u5316\u8ddf\u968f\u73a9\u5bb6\u529f\u80fd\u5931\u8d25: " + exception.getMessage(), new Object[3 >> 2]);
            }
        }
    }

    public void IIIIiIIiII() {
        this.iIiIiiiiII.set((Object)class_2350.field_11039);
    }

    private /* synthetic */ void iiIIiIIiii() {
        block5: {
            iiIIIIiIii iiIIIIiIii2 = iiIIIIiIii3;
            SchematicPlacement schematicPlacement = iiIIIIiIii2.ALLATORIxDEMO();
            if (schematicPlacement == null) {
                if (((Boolean)iiIIIIiIii2.iIIiIiiiIi.get()).booleanValue()) {
                    iiIIIIiIii2.warning(IiIiIiIiII.iiiIiIiiIi("\u677d\u9030\u629e\u62ac\u5f06"), new Object[3 >> 2]);
                }
                return;
            }
            try {
                iiIIIIiIii iiIIIIiIii3 = schematicPlacement.getOrigin();
                class_2338 class_23382 = iiIIIIiIii3.method_10093((class_2350)iiIIIIiIii2.iIiIiiiiII.get());
                schematicPlacement.setOrigin(class_23382, null);
                if (((Boolean)iiIIIIiIii2.iIIiIiiiIi.get()).booleanValue()) {
                    iiIIIIiIii2.info("\u6295\u5f71\u5df2\u4ece " + iiIIIIiIii3.method_23854() + " \u79fb\u52a8\u5230 " + class_23382.method_23854(), new Object[5 >> 3]);
                    return;
                }
            }
            catch (Exception exception) {
                if (!((Boolean)iiIIIIiIii2.iIIiIiiiIi.get()).booleanValue()) break block5;
                iiIIIIiIii2.error("\u79fb\u52a8\u6295\u5f71\u5931\u8d25: " + exception.getMessage(), new Object[3 >> 2]);
            }
        }
    }

    public void iiiIiIiiIi() {
        this.iIiIiiiiII.set((Object)class_2350.field_11035);
    }

    public iiIIIIiIii() {
        iiIIIIiIii iiIIIIiIii2 = this;
        super(IiIiIiIiII.iiiIiIiiIi("\u62ac\u5f06\u8de6\u96f8"), IiiiIiiIII.ALLATORIxDEMO("\u819b\u52be\u7992\u52ba\u5f3e\u525d\u9066\u5b94\u76f5ufs\u0011z\r~\u0014}\btJ\u62c0\u5f5b\u538d\u746b\u56ecC\u0012\u974d\u89b3\u5bc4\u88f7\u0001[9w\u0000S9{\u000esC"));
        iiIIIIiIii2.iiiiiIIiIi = iiIIIIiIii2.settings.getDefaultGroup();
        iiIIIIiIii2.IIiIiiiiII = iiIIIIiIii2.settings.createGroup(IiIiIiIiII.iiiIiIiiIi("\u79c2\u52df\u8b87\u7f19"));
        iiIIIIiIii2.iIiIiiiiII = iiIIIIiIii2.IIiIiiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u79e9\u52c5\u65ab\u547c"))).description(IiIiIiIiII.iiiIiIiiIi("\u62ac\u5f06\u79e2\u52ff\u76bd\u65ce\u5428\u3075"))).defaultValue((Object)class_2350.field_11043)).build());
        this.IIiIiIIiii = this.IIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u79e9\u52c5\u900d\u5ecb"))).description(IiIiIiIiII.iiiIiIiiIi("\u798b\u52d6\u902f\u5e9f\uff7f\u4edc\u6e4f\u6216\u526c\u4e23\u5302\u4f54\uff5b+g\u5202W$w\b\u79a5\uff30\u3075"))).defaultValue((Object)(0x56 & 0x3D))).min(4 ^ 5).max(0x65DA & 0x1AED).sliderMax(0x67 & 0x7C).build());
        this.IiiIiIiiIi = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u81f8\u52c5\u68d2\u6d26"))).description(IiIiIiIiII.iiiIiIiiIi("\u81bd\u52b1\u6897\u6d52\u5e21\u79e2\u52ff\u5f6a\u523a\u9010\u4e7a\u76bd\u62e2\u5f48\u3075"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIiIiiiIi = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u8ba2\u5f38\u79e9\u52c5"))).description(IiIiIiIiII.iiiIiIiiIi("\u5731\u801d\u5930\u6858\u4e14\u8bc7\u5f4c\u79ac\u5291\u64ba\u4f65\u3075"))).defaultValue((Object)(3 >> 2))).build());
        this.iIiIiIIIII = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u8dcd\u96e2\u73bb\u5bdb"))).description(IiIiIiIiII.iiiIiIiiIi("\u8bfe\u628c\u5f26\u8dc6\u96d8\u7390\u5bc1\u769d\u6c63\u5e4a\u798c\u5291\u3075"))).defaultValue((Object)(3 >> 2))).build());
        iiIIIIiIii iiIIIIiIii3 = this;
        iiIIIIiIii iiIIIIiIii4 = this;
        this.ALLATORIxDEMO = 3 >> 2;
        iiIIIIiIii4.iIIiiIiIiI = null;
        iiIIIIiIii4.IIIIiiIiii = null;
        iiIIIIiIii3.iIiiiIiIii = null;
        iiIIIIiIii3.IIiiIIIIIi = 3 >> 2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIiiIII.ALLATORIxDEMO("E\u00060Ka\b2\u0018B)S9Wl\u0012\u8bba\u66e6\u65dd\u5202\u674d\u65a2\u7225\u673e\uff6c"));
        }
    }

    public void onDeactivate() {
        if (((Boolean)this.iIIiIiiiIi.get()).booleanValue()) {
            this.info(IiiiIiiIII.ALLATORIxDEMO("\u6287\u5f1c\u79c9\u52e5\u567a\u5d9f\u504e\u7545"), new Object[5 >> 3]);
        }
    }

    public void ALLATORIxDEMO() {
        this.IIiiIIIIIi = 5 >> 3;
        this.IIIIiiIiii = null;
        this.iIiiiIiIii = null;
        if (((Boolean)this.iIIiIiiiIi.get()).booleanValue()) {
            this.info(IiIiIiIiII.iiiIiIiiIi("\u8d88\u96b6\u73de\u5baf\u52c8\u80c4\u5d85\u91f4\u7f19"), new Object[3 & 4]);
        }
    }
}

