/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_2338
 *  net.minecraft.class_310
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiIIiIi;
import com.github.mikumiku.addon.IIiiiiIIII;
import com.github.mikumiku.addon.IiIIiIiiiI;
import com.github.mikumiku.addon.iIIIIIIIII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIiiiIIi;
import com.github.mikumiku.addon.iiIiIIIIIi;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.structure.BastionRemnant;
import com.seedfinding.mcfeature.structure.BuriedTreasure;
import com.seedfinding.mcfeature.structure.DesertPyramid;
import com.seedfinding.mcfeature.structure.EndCity;
import com.seedfinding.mcfeature.structure.Fortress;
import com.seedfinding.mcfeature.structure.Igloo;
import com.seedfinding.mcfeature.structure.JunglePyramid;
import com.seedfinding.mcfeature.structure.Mansion;
import com.seedfinding.mcfeature.structure.Mineshaft;
import com.seedfinding.mcfeature.structure.Monument;
import com.seedfinding.mcfeature.structure.NetherFossil;
import com.seedfinding.mcfeature.structure.OceanRuin;
import com.seedfinding.mcfeature.structure.PillagerOutpost;
import com.seedfinding.mcfeature.structure.RegionStructure;
import com.seedfinding.mcfeature.structure.RuinedPortal;
import com.seedfinding.mcfeature.structure.Shipwreck;
import com.seedfinding.mcfeature.structure.Stronghold;
import com.seedfinding.mcfeature.structure.Structure;
import com.seedfinding.mcfeature.structure.SwampHut;
import com.seedfinding.mcfeature.structure.Village;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.Generated;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_2338;
import net.minecraft.class_310;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IIiiiiiiiI
extends iIiIiIIIii {
    private final Setting<Boolean> IiiIIiIIiI;
    @Generated
    private static final Logger iIIIIiiiii = LoggerFactory.getLogger(IIiiiiiiiI.class);
    private final Setting<Boolean> IiIiIiIIii;
    private final Setting<Boolean> iiiIiIiiII;
    private final Setting<MCVersion> IIiiiiIIii;
    private final Setting<String> IiiiiIIiII;
    private final Setting<Boolean> iIIIIIiiII;
    private final SettingGroup iIIiiiiIii;
    private final Setting<Boolean> iiIIIiIIIi;
    private final Setting<Boolean> iIiiiiIIII;
    private final Setting<Boolean> iiIiIIiiii;
    private final SettingGroup iIIiIiiIiI;
    private final Setting<Boolean> iIIIIIIiII;
    private final Setting<Boolean> iIIiiIIIIi;
    private boolean IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final SettingGroup iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<Boolean> iIiIIiIIIi;
    private final Setting<Boolean> IIiIiiiiII;
    private final Setting<Boolean> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<Boolean> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private CompletableFuture<Void> iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Integer> iIIiIiiiIi;
    private final Setting<Boolean> iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<iiIiIIIIIi> list, class_2338 class_23382) {
        void iIiIiIIIII2;
        IIiiiiiiiI iIiiiiiiiI = this;
        if (iIiIiIIIII2.isEmpty()) {
            iIiiiiiiiI.warning(IIiiiIIiIi.ALLATORIxDEMO("\u574e\u6329\u5bfc\u832d\u5692\u51ab\u674c\u6250\u5256\u4ed5\u4f33\u7edd\u67c2"), new Object[2 & 5]);
            return;
        }
        iIiIiIIIII2.sort((iiIiIIIIIi2, iiIiIIIIIi3) -> {
            iiIiIIIIIi iIiIiIIIII2 = iiIiIIIIIi3;
            iiIiIIIIIi iIiIiIIIII3 = iiIiIIIIIi2;
            return Double.compare(iIiIiIIIII3.iIiIiIIIII, iIiIiIIIII2.iIiIiIIIII);
        });
        if (IiIIiIiiiI.ALLATORIxDEMO() == null) {
            iIiiiiiiiI.warning(iiIIiiiIIi.ALLATORIxDEMO("\u659e\u6cf7\u83c9\u53f4-H\u0011Z[\u8d87\u5fd7\u70b6\u9695\u5407\uff7f\u8bd8\u781d\u4ff2\u5d81\u5ba6\u88b6w\u0012J\u0001@\u5743\u56d1\u6a72\u7ecb"), new Object[3 ^ 3]);
            return;
        }
        int iIiIiIIIII3 = 0;
        int n = this = 3 >> 2;
        while (n < iIiIiIIIII2.size()) {
            BPos bPos;
            String string;
            iiIiIIIIIi iiIiIIIIIi4 = (iiIiIIIIIi)iIiIiIIIII2.get(this);
            BPos bPos2 = iiIiIIIIIi4.iIIiIiiiIi;
            if (((Boolean)iIiiiiiiiI.IIiiIIIIIi.get()).booleanValue()) {
                Object[] objectArray = new Object[--3];
                objectArray[5 >> 3] = iiIiIIIIIi4.ALLATORIxDEMO;
                int n2 = --1;
                objectArray[n2] = this + n2;
                objectArray[5 >> 1] = iiIiIIIIIi4.iIiIiIIIII;
                string = String.format(IIiiiIIiIi.ALLATORIxDEMO("\u000b\u0015\u000eE\u000b\u0002\u000eN\u000bH\u001e\u0000co"), objectArray);
                bPos = bPos2;
            } else {
                Object[] objectArray = new Object[1 ^ 3];
                objectArray[2 & 5] = iiIiIIIIIi4.ALLATORIxDEMO;
                int n3 = --1;
                objectArray[n3] = this + n3;
                string = String.format(iiIIiiiIIi.ALLATORIxDEMO("V\\S\fvk"), objectArray);
                bPos = bPos2;
            }
            ++iIiIiIIIII3;
            IiIIiIiiiI.ALLATORIxDEMO(bPos.getX(), 0x77 & 0x6C, bPos2.getZ(), string, IIiiiIIiIi.ALLATORIxDEMO("\u7edd\u67c2"));
            n = ++this;
        }
        Object[] objectArray = new Object[3 >> 1];
        objectArray[3 ^ 3] = iIiIiIIIII3;
        iIiiiiiiiI.info(String.format(iiIIiiiIIi.ALLATORIxDEMO("\u643e\u7d57\u5ba5\u6264\uff29\u624a\u5258s*7/\u4e59\u7efc\u67f7\uff23\u5d81\u6dd4\u52d3\u521f+N\u0016]\u001c\u8dc0\u5fd7\u70b6"), objectArray), new Object[3 ^ 3]);
    }

    public void onDeactivate() {
        if (this.iIIiiIiIiI != null && !this.iIIiiIiIiI.isDone()) {
            this.iIIiiIiIiI.cancel(5 >> 2);
            this.IiiiiIiIiI = 2 & 5;
            this.info(iiIIiiiIIi.ALLATORIxDEMO("\u6433\u7d51\u5ddd\u5385\u6d87"), new Object[3 ^ 3]);
        }
        this.info(IIiiiIIiIi.ALLATORIxDEMO("\u7eb5\u67aa\u647a\u7d0c\u6a47\u5779\u5d94\u798f\u756e"), new Object[5 >> 3]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiIiiIi(List<iiIiIIIIIi> list, RegionStructure<?, ?> regionStructure, long l, MCVersion mCVersion, int n, int n2, int n3, String string) {
        void iIiIiIIIII2;
        IIiiiiiiiI iIiiiiiiiI = this;
        try {
            void iIiIiIIIII3;
            void iIiIiIIIII4;
            void iIiIiIIIII5;
            void iIiIiIIIII6;
            void iIiIiIIIII7;
            BiomeSource iIiIiIIIII8;
            iIiIiIIIII8 = BiomeSource.of(Dimension.NETHER, (MCVersion)((Object)iIiIiIIIII8), (long)iIiIiIIIII7);
            int n4 = iIiIiIIIII6.getSpacing();
            if (n4 <= 0) {
                iIiiiiiiiI.warning("\u7ed3\u6784 " + (String)iIiIiIIIII2 + " \u95f4\u8ddd\u65e0\u6548: " + n4, new Object[3 >> 2]);
                return;
            }
            int n5 = Math.max((int)(iIiIiIIIII5 - iIiIiIIIII4), -1073741824);
            int n6 = Math.min((int)(iIiIiIIIII5 + iIiIiIIIII4), 0x3FFFFFFF);
            int n7 = Math.max((int)(iIiIiIIIII3 - iIiIiIIIII4), -1073741824);
            int n8 = Math.min((int)(iIiIiIIIII3 + iIiIiIIIII4), 0x3FFFFFFF);
            n5 /= n4;
            n6 /= n4;
            n7 /= n4;
            n4 = n8 / n4;
            ChunkRand chunkRand = new ChunkRand();
            while (n5 <= n6) {
                int n9 = n7;
                while (n9 <= n4) {
                    int n10;
                    if (!iIiiiiiiiI.IiiiiIiIiI) {
                        return;
                    }
                    try {
                        CPos cPos;
                        CPos cPos2 = iIiIiIIIII6.getInRegion((long)iIiIiIIIII7, n5, n10, chunkRand);
                        if (!(Math.sqrt(Math.pow(cPos.getX() - iIiIiIIIII5, 2.0) + Math.pow(cPos2.getZ() - iIiIiIIIII3, 2.0)) > (double)iIiIiIIIII4) && iIiIiIIIII6.canSpawn(cPos2, iIiIiIIIII8)) {
                            void iIiIiIIIII9;
                            BPos bPos = new BPos(cPos2.getX() * (0x7E & 0x11), 3 & 4, cPos2.getZ() * (0x3A & 0x55));
                            double d = Math.sqrt(Math.pow(bPos.getX() - iIiIiIIIII5 * (0x51 & 0x3E), 2.0) + Math.pow(bPos.getZ() - iIiIiIIIII3 * (0x37 & 0x58), 2.0));
                            iIiIiIIIII9.add(new iiIiIIIIIi(bPos, d, (String)iIiIiIIIII2));
                        }
                    }
                    catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[3 ^ 3] = n5;
                        objectArray[5 >> 2] = n10;
                        objectArray[5 >> 1] = exception.getMessage();
                        iIiiiiiiiI.warning(String.format(IIiiiIIiIi.ALLATORIxDEMO("\u590a\u7440\u5334\u5799\u000eN\u000b\u0002\u0002CJO\u000e\u6590\u51d4\u957f\u0014F+5"), objectArray), new Object[2 & 5]);
                    }
                    n9 = ++n10;
                }
                ++n5;
            }
        }
        catch (Exception iIiIiIIIII8) {
            iIiiiiiiiI.warning("\u641c\u7d22\u4e0b\u754c\u7ed3\u6784 " + (String)iIiIiIIIII2 + " \u65f6\u51fa\u9519: " + iIiIiIIIII8.getMessage(), new Object[3 ^ 3]);
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiiiiiiiI iIiiiiiiiI = iIiiiiiiiI2;
        IIiiiiiiiI iIiiiiiiiI2 = pre;
        IIiiiiiiiI iIiIiIIIII2 = iIiiiiiiiI;
        if (iIiIiIIIII2.iIIiiIiIiI != null && iIiIiIIIII2.iIIiiIiIiI.isDone()) {
            iIiIiIIIII2.IiiiiIiIiI = 3 >> 2;
            iIiIiIIIII2.iIIiiIiIiI = null;
            iIiIiIIIII2.iiIiIIiiii.set((Object)((2 & 5) != 0));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IIiiiiiiiI iIiiiiiiiI = iIiiiiIIII;
        if (iIiiiiiiiI.IiiiiIiIiI) {
            iIiiiiiiiI.warning(IIiiiIIiIi.ALLATORIxDEMO("\u6432\u7d44\u6b4d\u574e\u8ff5\u882a\u4e03H h"), new Object[3 ^ 3]);
            return;
        }
        if (((class_310)iIiiiiiiiI.iIIiiIiIiI).field_1724 == null) {
            iIiiiiiiiI.error(iiIIiiiIIi.ALLATORIxDEMO("\u7386\u5bc5\u4e22\u5b0b\u5727"), new Object[3 & 4]);
            return;
        }
        IIiiiiIIII iIiiiiIIII = iIIIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO();
        if (iIiiiiIIII == null) {
            iIiiiiiiiI.error(IIiiiIIiIi.ALLATORIxDEMO("\u65ce\u6cb3\u8399\u53b0\u4e38\u752a\u79e3\u5b36\uff22\u8b91\u6265\u52ce\u8b90\u7f08\u79c3\u5b16"), new Object[3 >> 2]);
            return;
        }
        if (iIiiiiIIII.iIiIiIIIII == null || iIiiiiIIII.ALLATORIxDEMO == null) {
            iIiiiiiiiI.error(iiIIiiiIIi.ALLATORIxDEMO("\u79be\u5b7f\u6503\u6341\u6593\u6567\uff7f\u8bd8\u91be\u659f\u8bcd\u7f41\u799e\u5b5f"), new Object[3 >> 2]);
            return;
        }
        if (PlayerUtils.getDimension() != meteordevelopment.meteorclient.utils.world.Dimension.Overworld) {
            iIiiiiiiiI.warning(IIiiiIIiIi.ALLATORIxDEMO("\u5ef4\u8be8\u5726\u4e7d\u4e38\u752a\u4f51\u754e\u6b4a\u52f9\u80d3\u4e83\u8399\u5ff1\u672e\u51a0\u7840\u76e2\u7edd\u67da"), new Object[3 >> 2]);
        }
        IIiiiiiiiI iIiiiiiiiI2 = iIiiiiiiiI;
        iIiiiiiiiI2.IiiiiIiIiI = 5 >> 2;
        class_2338 class_23382 = ((class_310)iIiiiiiiiI2.iIIiiIiIiI).field_1724.method_24515();
        iIiiiiiiiI2.info("\u5f00\u59cb\u641c\u7d22\u7ed3\u6784\u4f4d\u7f6e... \u534a\u5f84: " + String.valueOf(iIiiiiiiiI2.iIIiIiiiIi.get()) + " \u533a\u5757", new Object[3 & 4]);
        iIiiiiiiiI.iIIiiIiIiI = CompletableFuture.runAsync(() -> {
            IIiiiiiiiI iIiiiiiiiI = iIiiiiIIII2;
            IIiiiiIIII iIiiiiIIII2 = iIiiiiIIII;
            IIiiiiiiiI iIiIiIIIII2 = iIiiiiiiiI;
            try {
                void iIiIiIIIII3;
                iIiIiIIIII2.ALLATORIxDEMO(iIiiiiIIII2, (class_2338)iIiIiIIIII3);
                return;
            }
            catch (Exception this2) {
                iIiIiIIIII2.error("\u641c\u7d22\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef: " + this2.getMessage(), new Object[3 & 4]);
                iIIIIiiiii.error(IIiiiIIiIi.ALLATORIxDEMO("\u647a\u7d0c\u8fa1\u7a25\u4e4b\u53ff\u7579\u9537\u8b894f"), (Throwable)this2);
                iIiIiIIIII2.IiiiiIiIiI = 3 & 4;
                return;
            }
        });
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<iiIiIIIIIi> list, Structure structure, long l, BiomeSource biomeSource, ChunkRand chunkRand, int n, int n2, int n3, String string) {
        void iIiIiIIIII2;
        IIiiiiiiiI iIiiiiiiiI = cPos2;
        try {
            void iIiIiIIIII3;
            void iIiIiIIIII4;
            void iIiIiIIIII5;
            int iIiIiIIIII6 = Math.max((int)(iIiIiIIIII5 - iIiIiIIIII4), -1073741824);
            int n4 = Math.min((int)(iIiIiIIIII5 + iIiIiIIIII4), 0x3FFFFFFF);
            int iIiIiIIIII7 = Math.max((int)(iIiIiIIIII3 - iIiIiIIIII4), -1073741824);
            int n5 = Math.min((int)(iIiIiIIIII3 + iIiIiIIIII4), 0x3FFFFFFF);
            for (int i = iIiIiIIIII6; i <= n4; ++i) {
                int n6 = iIiIiIIIII7;
                while (n6 <= n5) {
                    int n7;
                    if (!iIiiiiiiiI.IiiiiIiIiI) {
                        return;
                    }
                    try {
                        void iIiIiIIIII8;
                        void iIiIiIIIII9;
                        CPos cPos;
                        CPos cPos2 = new CPos(i, n7);
                        if (!(Math.sqrt(Math.pow(cPos.getX() - iIiIiIIIII5, 2.0) + Math.pow(cPos2.getZ() - iIiIiIIIII3, 2.0)) > (double)iIiIiIIIII4) && iIiIiIIIII9.canSpawn(cPos2, (BiomeSource)iIiIiIIIII8)) {
                            void iIiIiIIIII10;
                            BPos bPos = new BPos(cPos2.getX() * (0x5C & 0x33), 3 ^ 3, cPos2.getZ() * (0x77 & 0x18));
                            double d = Math.sqrt(Math.pow(bPos.getX() - iIiIiIIIII5 * (0x14 & 0x7B), 2.0) + Math.pow(bPos.getZ() - iIiIiIIIII3 * (0x56 & 0x39), 2.0));
                            iIiIiIIIII10.add(new iiIiIIIIIi(bPos, d, (String)iIiIiIIIII2));
                        }
                    }
                    catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[3 & 4] = i;
                        objectArray[5 >> 2] = n7;
                        objectArray[--2] = exception.getMessage();
                        iIiiiiiiiI.warning(String.format(IIiiiIIiIi.ALLATORIxDEMO("\u590a\u7440\u5334\u5711\u000eN\u000b\u0002\u0002CJO\u000e\u6590\u51d4\u957f\u0014F+5"), objectArray), new Object[2 & 5]);
                    }
                    n6 = ++n7;
                }
            }
        }
        catch (Exception iIiIiIIIII6) {
            iIiiiiiiiI.warning("\u641c\u7d22\u7ed3\u6784 " + (String)iIiIiIIIII2 + " \u65f6\u51fa\u9519: " + iIiIiIIIII6.getMessage(), new Object[2 & 5]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<iiIiIIIIIi> list, RegionStructure<?, ?> regionStructure, long l, MCVersion mCVersion, int n, int n2, int n3, String string) {
        void iIiIiIIIII2;
        IIiiiiiiiI iIiiiiiiiI = this;
        try {
            void iIiIiIIIII3;
            void iIiIiIIIII4;
            void iIiIiIIIII5;
            void iIiIiIIIII6;
            void iIiIiIIIII7;
            BiomeSource iIiIiIIIII8;
            iIiIiIIIII8 = BiomeSource.of(Dimension.END, (MCVersion)((Object)iIiIiIIIII8), (long)iIiIiIIIII7);
            int n4 = iIiIiIIIII6.getSpacing();
            if (n4 <= 0) {
                iIiiiiiiiI.warning("\u7ed3\u6784 " + (String)iIiIiIIIII2 + " \u95f4\u8ddd\u65e0\u6548: " + n4, new Object[5 >> 3]);
                return;
            }
            int n5 = Math.max((int)(iIiIiIIIII5 - iIiIiIIIII4), -1073741824);
            int n6 = Math.min((int)(iIiIiIIIII5 + iIiIiIIIII4), 0x3FFFFFFF);
            int n7 = Math.max((int)(iIiIiIIIII3 - iIiIiIIIII4), -1073741824);
            int n8 = Math.min((int)(iIiIiIIIII3 + iIiIiIIIII4), 0x3FFFFFFF);
            n5 /= n4;
            n6 /= n4;
            n7 /= n4;
            n4 = n8 / n4;
            ChunkRand chunkRand = new ChunkRand();
            while (n5 <= n6) {
                int n9 = n7;
                while (n9 <= n4) {
                    int n10;
                    if (!iIiiiiiiiI.IiiiiIiIiI) {
                        return;
                    }
                    try {
                        CPos cPos;
                        CPos cPos2 = iIiIiIIIII6.getInRegion((long)iIiIiIIIII7, n5, n10, chunkRand);
                        if (!(Math.sqrt(Math.pow(cPos.getX() - iIiIiIIIII5, 2.0) + Math.pow(cPos2.getZ() - iIiIiIIIII3, 2.0)) > (double)iIiIiIIIII4) && iIiIiIIIII6.canSpawn(cPos2, iIiIiIIIII8)) {
                            void iIiIiIIIII9;
                            BPos bPos = new BPos(cPos2.getX() * (0x7B & 0x14), 3 >> 2, cPos2.getZ() * (0x7D & 0x12));
                            double d = Math.sqrt(Math.pow(bPos.getX() - iIiIiIIIII5 * (0x13 & 0x7C), 2.0) + Math.pow(bPos.getZ() - iIiIiIIIII3 * (0x1F & 0x70), 2.0));
                            iIiIiIIIII9.add(new iiIiIIIIIi(bPos, d, (String)iIiIiIIIII2));
                        }
                    }
                    catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[5 >> 3] = n5;
                        objectArray[4 ^ 5] = n10;
                        objectArray[1 ^ 3] = exception.getMessage();
                        iIiiiiiiiI.warning(String.format(iiIIiiiIIi.ALLATORIxDEMO("\u5957\u7409\u5369\u57d0S\u0007VK_\n\u0017\u0006S\u65d9\u5189\u9536I\u000fv|"), objectArray), new Object[2 & 5]);
                    }
                    n9 = ++n10;
                }
                ++n5;
            }
        }
        catch (Exception iIiIiIIIII8) {
            iIiiiiiiiI.warning("\u641c\u7d22\u672b\u5730\u7ed3\u6784 " + (String)iIiIiIIIII2 + " \u65f6\u51fa\u9519: " + iIiIiIIIII8.getMessage(), new Object[3 ^ 3]);
        }
    }

    @Override
    public void onActivate() {
        IIiiiiiiiI iIiiiiiiiI = this;
        super.onActivate();
        if (((Boolean)iIiiiiiiiI.iIIiiIIIIi.get()).booleanValue()) {
            this.ALLATORIxDEMO();
        }
        this.info(IIiiiIIiIi.ALLATORIxDEMO("\u7eb5\u67aa\u647a\u7d0c\u6a47\u5779\u5d94\u5421\u756e"), new Object[3 >> 2]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<iiIiIIIIIi> list, RegionStructure<?, ?> regionStructure, long l, BiomeSource biomeSource, ChunkRand chunkRand, int n, int n2, int n3, String string) {
        void iIiIiIIIII2;
        IIiiiiiiiI iIiiiiiiiI = cPos;
        try {
            void iIiIiIIIII3;
            void iIiIiIIIII4;
            void iIiIiIIIII5;
            void iIiIiIIIII6;
            int n4 = iIiIiIIIII6.getSpacing();
            if (n4 <= 0) {
                iIiiiiiiiI.warning("\u7ed3\u6784 " + (String)iIiIiIIIII2 + " \u95f4\u8ddd\u65e0\u6548: " + n4, new Object[2 & 5]);
                return;
            }
            int n5 = Math.max((int)(iIiIiIIIII5 - iIiIiIIIII4), -1073741824);
            int n6 = Math.min((int)(iIiIiIIIII5 + iIiIiIIIII4), 0x3FFFFFFF);
            int n7 = Math.max((int)(iIiIiIIIII3 - iIiIiIIIII4), -1073741824);
            int n8 = Math.min((int)(iIiIiIIIII3 + iIiIiIIIII4), 0x3FFFFFFF);
            n5 /= n4;
            n6 /= n4;
            n7 /= n4;
            n8 /= n4;
            while (n5 <= n6) {
                int n9 = n7;
                while (n9 <= n8) {
                    int n10;
                    if (!iIiiiiiiiI.IiiiiIiIiI) {
                        return;
                    }
                    try {
                        void iIiIiIIIII7;
                        void iIiIiIIIII8;
                        void iIiIiIIIII9;
                        CPos cPos = iIiIiIIIII6.getInRegion((long)iIiIiIIIII9, n5, n10, (ChunkRand)iIiIiIIIII8);
                        if (cPos != null && !(Math.sqrt(Math.pow(cPos.getX() - iIiIiIIIII5, 2.0) + Math.pow(cPos.getZ() - iIiIiIIIII3, 2.0)) > (double)iIiIiIIIII4) && iIiIiIIIII6.canSpawn(cPos, (BiomeSource)iIiIiIIIII7)) {
                            void iIiIiIIIII10;
                            BPos bPos = new BPos(cPos.getX() * (0x1E & 0x71), 2 & 5, cPos.getZ() * (0x59 & 0x36));
                            double d = Math.sqrt(Math.pow(bPos.getX() - iIiIiIIIII5 * (0x7C & 0x13), 2.0) + Math.pow(bPos.getZ() - iIiIiIIIII3 * (0x77 & 0x18), 2.0));
                            iIiIiIIIII10.add(new iiIiIIIIIi(bPos, d, (String)iIiIiIIIII2));
                        }
                    }
                    catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[2 & 5] = n5;
                        objectArray[--1] = n10;
                        objectArray[1 ^ 3] = exception.getMessage();
                        iIiiiiiiiI.warning(String.format(iiIIiiiIIi.ALLATORIxDEMO("\u5957\u7409\u5369\u57d0S\u0007VK_\n\u0017\u0006S\u65d9\u5189\u9536I\u000fv|"), objectArray), new Object[2 & 5]);
                    }
                    n9 = ++n10;
                }
                ++n5;
            }
        }
        catch (Exception exception) {
            iIiiiiiiiI.warning("\u641c\u7d22\u7ed3\u6784 " + (String)iIiIiIIIII2 + " \u65f6\u51fa\u9519: " + exception.getMessage(), new Object[3 >> 2]);
        }
    }

    public IIiiiiiiiI() {
        IIiiiiiiiI iIiiiiiiiI = this;
        super(iIiIiIIIii.iiiiiIIiIi, iiIIiiiIIi.ALLATORIxDEMO("\u7ea0\u67ab\u644f\u7d2d"), IIiiiIIiIi.ALLATORIxDEMO("\u81c9\u52c3\u643f\u7d49\u542c\u79ad\u7efa\u67e5\u4f24\u7f4f\u300c\u6b22\u6a2f\u5711\u972e\u89e7\u000e\u001eO\u0003\\\t\u000e\u5c69\u571e\u5698C\tj\u3044"));
        iIiiiiiiiI.iIIIiiiiIi = iIiiiiiiiI.settings.getDefaultGroup();
        iIiiiiiiiI.iIIiIiiIiI = iIiiiiiiiI.settings.createGroup(iiIIiiiIIi.ALLATORIxDEMO("\u79be\u5b7f\u8bed\u7f61"));
        iIiiiiiiiI.iIIiiiiIii = iIiiiiiiiI.settings.createGroup(IIiiiIIiIi.ALLATORIxDEMO("\u7efd\u67e2\u8bb0\u7f28"));
        iIiiiiiiiI.iIIiIiiiIi = iIiiiiiiiI.iIIIiiiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u646f\u7d0d\u5319\u5f8b"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u4ecb\u73cf\u5b98\u4e5c\u4e03\u5fa5\u76aa\u647a\u7d0c\u532c\u5faa\uff6e\u5314\u5731\uff07\u3044"))).defaultValue((Object)(0x77 & 0x6C))).min(0x1B & 0x6E).max(0x6F2E & 0x5EF1).sliderMin(0xB & 0x7E).sliderMax(0x4FF4 & 0x7E2B).build());
        this.IIiiIIIIIi = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u8dc0\u5ff7\u7096\u5376\u5404\u8d8e\u79b4"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u574e\u8dc1\u5fe2\u7097\u546b\u79de\u4e4b\u532b\u544d\u8df3\u79dd\u4fef\u6029"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIiiIIIIi = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u8199\u5287\u644f\u7d2d"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u5449\u7506\u6a47\u5779\u6590\u81c4\u52ce\u5f2e\u59ad\u6412\u7d64"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiiiIIiII = this.iIIiIiiIiI.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u799e\u5b5f"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u8ff5\u514b\u676b\u528f\u560e\u79c3\u5b16"))).defaultValue((Object)"")).build());
        this.IIiiiiIIii = this.iIIiIiiIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO(">l\u721b\u6723"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u906f\u62c7+G\bK\u0005\\\u0007H\u0012\u7246\u676a"))).defaultValue((Object)MCVersion.latest())).build());
        this.iIiIIiIIIi = this.iIIiIiiIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u5ee7\u7507\u799e\u5b5f"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u5ef2\u7506\u622d\u5286\u8ff5\u514b\u76e2\u79e3\u5b36\u8bb0\u7f28"))).defaultValue((Object)(5 >> 3))).onChanged(bl -> {
            boolean bl222 = bl;
            IIiiiiiiiI iIiIiIIIII2 = this;
            if (bl222) {
                IIiiiiiiiI iIiiiiiiiI;
                String bl222 = ((String)iIiIiIIIII2.IiiiiIIiII.get()).trim();
                if (!bl222.isEmpty()) {
                    try {
                        iIIIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO(bl222, (MCVersion)((Object)((Object)iIiIiIIIII2.IIiiiiIIii.get())));
                        IIiiiiiiiI iIiiiiiiiI2 = iIiIiIIIII2;
                        iIiiiiiiiI2.info("\u5df2\u8bbe\u7f6e\u79cd\u5b50: " + bl222 + " \u7248\u672c: " + ((MCVersion)((Object)((Object)iIiiiiiiiI2.IIiiiiIIii.get()))).name, new Object[3 >> 2]);
                        iIiiiiiiiI = iIiIiIIIII2;
                    }
                    catch (Exception bl222) {
                        iIiIiIIIII2.error("\u8bbe\u7f6e\u79cd\u5b50\u5931\u8d25: " + bl222.getMessage(), new Object[3 & 4]);
                        iIiiiiiiiI = iIiIiIIIII2;
                    }
                } else {
                    iIiIiIIIII2.error(iiIIiiiIIi.ALLATORIxDEMO("\u8b84\u5167\u8fe0\u514a\u799e\u5b5f"), new Object[3 >> 2]);
                    iIiiiiiiiI = iIiIiIIIII2;
                }
                iIiiiiiiiI.iIiIIiIIIi.set((Object)((3 & 4) != 0 ? 1 : 0));
            }
        })).build());
        this.iiIiIIiiii = this.iIIIiiiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u5f73\u59e4\u644f\u7d2d"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u5f2e\u59ad\u6432\u7d44\u7efd\u67e2\u4f43\u7f28"))).defaultValue((Object)((2 & 5) != 0))).onChanged(bl -> {
            boolean bl2 = bl;
            IIiiiiiiiI iIiIiIIIII2 = this;
            if (bl2 && !iIiIiIIIII2.IiiiiIiIiI) {
                iIiIiIIIII2.ALLATORIxDEMO();
            }
        })).build());
        this.iiiIiiIIII = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u6702\u5e8b"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u677f\u5ee2\u7edd\u67c2"))).defaultValue((Object)(3 >> 2))).build());
        this.iiIIIiIIIi = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u6cda\u8236"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u6ca7\u825f\u7edd\u67c2"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIiiiiIIII = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u57e4\u85bc\u76ab\u5bce\u85c0"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u6783\u6250\u57ad\u85e1\u76e2\u5bb3\u85a9\u7edd\u67c2"))).defaultValue((Object)(5 >> 3))).build());
        this.iiiIiIIiii = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u6d04\u5eba\u5ecc\u5890"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u6d59\u5ef3\u5eb1\u58f9\u7edd\u67c2"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IIiIiiiiII = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u63d3\u5915\u8076\u5262\u54bb\u7ad6"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u638e\u595c\u802b\u522b\u54c6\u7abf\u7edd\u67c2"))).defaultValue((Object)(5 >> 3))).build());
        this.IIIIiiIiii = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u4e78\u7563\u89d2\u5851"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u4e25\u752a\u89af\u5838\u7edd\u67c2"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IIiIiIIiii = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u5852\u57bd\u9004\u8ff6"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u580f\u57f4\u9079\u8f9f\u7edd\u67c2"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iiiiiIIiIi = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u6704\u5763\u57c1"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u6783\u6250\u674d\u571e\u57a8\u7edd\u67c2"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IiiIIiIIiI = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u6cea\u6f0f\u790d\u6bb0"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u6cb7\u6f46\u7970\u6bd9\u7edd\u67c2"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IiiIiIiiIi = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u96b9\u5c44"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u96c4\u5c2d\u7edd\u67c2"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIiIiIIIII = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u4e68\u67b8\u790d\u5e96"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u4e35\u67f1\u7970\u5eff\u7edd\u67c2"))).defaultValue((Object)(3 >> 2))).build());
        this.iiiIiIiiII = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u67e4\u571f\u5ecf\u90b7"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u67b9\u5756\u5eb2\u90de\u7edd\u67c2"))).defaultValue((Object)(5 >> 3))).build());
        this.iIiIiiiiII = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u5eec\u5f2c\u77ac\u4e9a"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u5eb1\u5f65\u77d1\u4ef3\u7edd\u67c2"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIIIIIiiII = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u6d04\u5eba\u790d\u6bb0"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u6d59\u5ef3\u7970\u6bd9\u7edd\u67c2"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.ALLATORIxDEMO = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u4e78\u7563\u5345\u77fc"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u4e25\u752a\u5338\u7795\u7edd\u67c2"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IiIiIiIIii = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u5eb0\u5f70\u4f0f\u9052\u95e7"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u6783\u6250\u5ef9\u5f2d\u4f46\u902f\u958e\u7edd\u67c2"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIIIIIIiII = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u89d2\u5851"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u89af\u5838\u7edd\u67c2"))).defaultValue((Object)(3 >> 2))).build());
        this.iIiiiIiIii = this.iIIiiiiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiiiIIi.ALLATORIxDEMO("\u6ccf\u6cd2\u5c5c\u5c44"))).description(IIiiiIIiIi.ALLATORIxDEMO("\u67cb\u6218\u6c92\u6c9b\u5c21\u5c2d\u7edd\u67c2"))).defaultValue((Object)(3 >> 2))).build());
        IIiiiiiiiI iIiiiiiiiI2 = this;
        iIiiiiiiiI2.IiiiiIiIiI = 3 ^ 3;
        iIiiiiiiiI2.iIIiiIiIiI = null;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIiiiIIi.ALLATORIxDEMO("$DQ\t jsz\u0003K\u0012[\u0016\u000eS\u8bd8\u6687\u659f\u5243\u672f\u65c3\u7267\u677f\uff0e"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(IIiiiiIIII iIiiiiIIII, class_2338 class_23382) {
        void iIiIiIIIII2;
        IIiiiiiiiI iIiiiiiiiI = object;
        Object object = iIiiiiIIII;
        IIiiiiiiiI iIiIiIIIII3 = iIiiiiiiiI;
        ArrayList<iiIiIIIIIi> arrayList = new ArrayList<iiIiIIIIIi>();
        try {
            if (object == null || ((IIiiiiIIII)object).iIiIiIIIII == null || ((IIiiiiIIII)object).ALLATORIxDEMO == null) {
                iIiIiIIIII3.error(iiIIiiiIIi.ALLATORIxDEMO("\u79be\u5b7f\u6503\u6341\u65b3\u6547"), new Object[3 & 4]);
                return;
            }
            Object object2 = object;
            long l = ((IIiiiiIIII)object2).iIiIiIIIII;
            object = ((IIiiiiIIII)object2).ALLATORIxDEMO;
            iIiIiIIIII3.info("\u4f7f\u7528\u79cd\u5b50: " + l + ", \u7248\u672c: " + ((MCVersion)((Object)object)).name, new Object[5 >> 3]);
            BiomeSource biomeSource = BiomeSource.of(Dimension.OVERWORLD, (MCVersion)((Object)object), l);
            BiomeSource.of(Dimension.NETHER, (MCVersion)((Object)object), l);
            ChunkRand chunkRand = new ChunkRand();
            int n = (Integer)iIiIiIIIII3.iIIiIiiiIi.get();
            if (n > (0x6DF5 & 0x13FE)) {
                iIiIiIIIII3.warning("\u641c\u7d22\u534a\u5f84\u8fc7\u5927 (" + n + ")\uff0c\u53ef\u80fd\u5bfc\u81f4\u6027\u80fd\u95ee\u9898\u6216\u9519\u8bef\u3002 ", new Object[5 >> 3]);
            }
            void v2 = iIiIiIIIII2;
            int n2 = v2.method_10263() >> --4;
            int n3 = v2.method_10260() >> --4;
            if (((Boolean)iIiIiIIIII3.iiiIiiIIII.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new Village((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IIiiiIIiIi.ALLATORIxDEMO("\u675f\u5ec2"));
            }
            if (((Boolean)iIiIiIIIII3.iiIIIiIIIi.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new Shipwreck((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIIiiiIIi.ALLATORIxDEMO("\u6cda\u8236"));
            }
            if (((Boolean)iIiIiIIIII3.iIiiiiIIII.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new BuriedTreasure((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IIiiiIIiIi.ALLATORIxDEMO("\u57ad\u85e1\u76e2\u5b93\u8589"));
            }
            if (((Boolean)iIiIiIIIII3.iiiIiIIiii.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new OceanRuin((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIIiiiIIi.ALLATORIxDEMO("\u6d04\u5eba\u5ecc\u5890"));
            }
            if (((Boolean)iIiIiIIIII3.IIiIiiiiII.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new PillagerOutpost((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IIiiiIIiIi.ALLATORIxDEMO("\u638e\u595c\u802b\u522b\u54e6\u7a9f"));
            }
            if (((Boolean)iIiIiIIIII3.IiiIIiIIiI.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new DesertPyramid((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIIiiiIIi.ALLATORIxDEMO("\u6cea\u6f0f\u790d\u6bb0"));
            }
            if (((Boolean)iIiIiIIIII3.IiiIiIiiIi.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new Igloo((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IIiiiIIiIi.ALLATORIxDEMO("\u96e4\u5c0d"));
            }
            if (((Boolean)iIiIiIIIII3.iIiIiIIIII.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new JunglePyramid((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIIiiiIIi.ALLATORIxDEMO("\u4e68\u67b8\u790d\u5e96"));
            }
            if (((Boolean)iIiIiIIIII3.iiiIiIiiII.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new Mansion((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IIiiiIIiIi.ALLATORIxDEMO("\u67b9\u5756\u5e92\u90fe"));
            }
            if (((Boolean)iIiIiIIIII3.iIiIiiiiII.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new Mineshaft((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIIiiiIIi.ALLATORIxDEMO("\u5eec\u5f2c\u77ac\u4e9a"));
            }
            if (((Boolean)iIiIiIIIII3.iIIIIIiiII.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new Monument((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IIiiiIIiIi.ALLATORIxDEMO("\u6d59\u5ef3\u7950\u6bf9"));
            }
            if (((Boolean)iIiIiIIIII3.IiIiIiIIii.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new RuinedPortal(Dimension.OVERWORLD, (MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIIiiiIIi.ALLATORIxDEMO("\u5eb0\u5f70\u4f0f\u9052\u95e7"));
            }
            if (((Boolean)iIiIiIIIII3.iIIIIIIiII.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new Stronghold((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IIiiiIIiIi.ALLATORIxDEMO("\u898f\u5818"));
            }
            if (((Boolean)iIiIiIIIII3.iIiiiIiIii.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new SwampHut((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIIiiiIIi.ALLATORIxDEMO("\u6ccf\u6cd2\u5c5c\u5c44"));
            }
            if (((Boolean)iIiIiIIIII3.IIIIiiIiii.get()).booleanValue()) {
                iIiIiIIIII3.iiiIiIiiIi(arrayList, new Fortress((MCVersion)((Object)object)), l, (MCVersion)((Object)object), n2, n3, n, IIiiiIIiIi.ALLATORIxDEMO("\u4e25\u752a\u898f\u5818"));
            }
            if (((Boolean)iIiIiIIIII3.IIiIiIIiii.get()).booleanValue()) {
                iIiIiIIIII3.iiiIiIiiIi(arrayList, new BastionRemnant((MCVersion)((Object)object)), l, (MCVersion)((Object)object), n2, n3, n, iiIIiiiIIi.ALLATORIxDEMO("\u5852\u57bd\u9004\u8ff6"));
            }
            if (((Boolean)iIiIiIIIII3.ALLATORIxDEMO.get()).booleanValue()) {
                iIiIiIIIII3.iiiIiIiiIi(arrayList, new NetherFossil((MCVersion)((Object)object)), l, (MCVersion)((Object)object), n2, n3, n, IIiiiIIiIi.ALLATORIxDEMO("\u4e25\u752a\u5318\u77b5"));
            }
            if (((Boolean)iIiIiIIIII3.iiiiiIIiIi.get()).booleanValue()) {
                iIiIiIIIII3.ALLATORIxDEMO(arrayList, new EndCity((MCVersion)((Object)object)), l, (MCVersion)((Object)object), n2, n3, n, iiIIiiiIIi.ALLATORIxDEMO("\u6704\u5763\u57c1"));
            }
        }
        catch (Exception exception) {
            iIiIiIIIII3.error("\u641c\u7d22\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef, \u5efa\u8bae\u8c03\u5c0f\u641c\u7d22\u534a\u5f84: " + exception.getMessage(), new Object[2 & 5]);
            return;
        }
        iIiIiIIIII3.ALLATORIxDEMO(arrayList, (class_2338)iIiIiIIIII2);
        iIiIiIIIII3.IiiiiIiIiI = 3 ^ 3;
    }
}

