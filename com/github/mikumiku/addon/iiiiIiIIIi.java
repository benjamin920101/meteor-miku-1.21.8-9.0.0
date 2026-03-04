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
 *  net.minecraft.util.math.BlockPos
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiiIIII;
import com.github.mikumiku.addon.IiIIiIiiiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIIIIIIIII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIiIII;
import com.github.mikumiku.addon.iiIiIiIiIi;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.structure.EndCity;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcfeature.structure.generator.structure.EndCityGenerator;
import com.seedfinding.mcterrain.TerrainGenerator;
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
import net.minecraft.util.math.BlockPos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class iiiiIiIIIi
extends iIiIiIIIii {
    private final Setting<Integer> IIiIiiiiII;
    private boolean IIiiIIIIIi;
    private final Setting<MCVersion> iIiiiIiIii;
    private final SettingGroup iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final SettingGroup IIiIiIIiii;
    @Generated
    private static final Logger iIIiiIiIiI = LoggerFactory.getLogger(iiiiIiIIIi.class);
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<String> iIiIiIIIII;
    private CompletableFuture<Void> ALLATORIxDEMO;

    public iiiiIiIIIi() {
        iiiiIiIIIi iiiiIiIIIi2 = this;
        super(iIiIiIIIii.iiiiiIIiIi, iIiiiIiIII.ALLATORIxDEMO("\u97da\u7f8f\u6414\u7d22"), IiiiIiiIII.ALLATORIxDEMO("\u81f8\u52c5\u640e\u7d4f\u5e34\u6746\u5722\u8254\u76b6\u6766\u5722\u57a3\u7ee1\u67c9\uff3a\u5348\u5419\u97d5\u7fd7\uff64"));
        iiiiIiIIIi2.iIiIiiiiII = iiiiIiIIIi2.settings.getDefaultGroup();
        iiiiIiIIIi2.IIiIiIIiii = iiiiIiIIIi2.settings.createGroup(iIiiiIiIII.ALLATORIxDEMO("\u798f\u5b1a\u8bb6\u7f6e"));
        iiiiIiIIIi2.IIiIiiiiII = iiiiIiIIIi2.iIiIiiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u642e\u7d6f\u5358\u5fe9"))).description(iIiiiIiIII.ALLATORIxDEMO("\u4e9a\u73de\u5be9\u4e6d\u4e27\u5fc1\u76db\u644b\u7d7a\u531a\u5fdb\uff5f\u5378\u571d\uff01\u3002"))).defaultValue((Object)(0x73 & 0x3E))).min(0x3B & 0x4E).max(0x7D7 & 0x7FF8).sliderMin(0x3F & 0x4A).sliderMax(0x3FF8 & 0x47D7).build());
        this.iiiiiIIiIi = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u8da2\u5fb6\u70f4\u5337\u5466\u8dcf\u79d6"))).description(iIiiiIiIII.ALLATORIxDEMO("\u577f\u8de5\u5f86\u70e6\u545a\u79a8\u4e7d\u535a\u547c\u8d9f\u79f1\u4fe9\u606f"))).defaultValue((Object)(5 >> 2))).build());
        this.IiiIiIiiIi = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u81d8\u52e5\u640e\u7d4f"))).description(iIiiiIiIII.ALLATORIxDEMO("\u542d\u7577\u6a76\u570f\u65a6\u81b5\u52ff\u5f42\u5981\u6414\u7d22"))).defaultValue((Object)(3 >> 1))).build());
        this.iIiIiIIIII = this.IIiIiIIiii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u79df\u5b3d"))).description(iIiiiIiIII.ALLATORIxDEMO("\u8fe4\u511a\u677a\u52fe\u563f\u79c7\u5b52w\u9e8f\u8bfcc\u001cd\u0017\u7987\u5b58)"))).defaultValue((Object)IiiiIiiIII.ALLATORIxDEMO("?Z!Y$T#^\u000bt*Z\u0002~\u0005\u007f\u0004{*]"))).build());
        this.iIiiiIiIii = this.IIiIiIIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u000f\t\u7240\u672c"))).description(IiiiIiiIII.ALLATORIxDEMO("\u9064\u62db\u0000{\u0003W.@,T9\u725a\u6741"))).defaultValue((Object)MCVersion.latest())).build());
        this.iIIiIiiiIi = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u5ed6\u7562\u79c5\u5b50"))).description(IiiiIiiIII.ALLATORIxDEMO("\u5ed9\u753a\u6226\u529a\u8fde\u5157\u76c9\u79ff\u5b1d\u8bac\u7f03"))).defaultValue((Object)((3 ^ 3) != 0))).onChanged(bl -> {
            boolean bl222 = bl;
            iiiiIiIIIi iIiIiIIIII2 = this;
            if (bl222) {
                iiiiIiIIIi iiiiIiIIIi2;
                String bl222 = ((String)iIiIiIIIII2.iIiIiIIIII.get()).trim();
                if (!bl222.isEmpty()) {
                    try {
                        iIIIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO(bl222, (MCVersion)((Object)((Object)iIiIiIIIII2.iIiiiIiIii.get())));
                        iiiiIiIIIi iiiiIiIIIi3 = iIiIiIIIII2;
                        iiiiIiIIIi3.info("\u5df2\u8bbe\u7f6e\u79cd\u5b50: " + bl222 + " \u7248\u672c: " + ((MCVersion)((Object)((Object)iiiiIiIIIi3.iIiiiIiIii.get()))).name, new Object[3 >> 2]);
                        iiiiIiIIIi2 = iIiIiIIIII2;
                    }
                    catch (Exception bl222) {
                        iIiIiIIIII2.error("\u8bbe\u7f6e\u79cd\u5b50\u5931\u8d25: " + bl222.getMessage(), new Object[5 >> 3]);
                        iiiiIiIIIi2 = iIiIiIIIII2;
                    }
                } else {
                    iIiIiIIIII2.error(iIiiiIiIII.ALLATORIxDEMO("\u8b84\u5133\u8fe8\u5116\u79b4\u5b21"), new Object[3 ^ 3]);
                    iiiiIiIIIi2 = iIiIiIIIII2;
                }
                iiiiIiIIIi2.iIIiIiiiIi.set((Object)((2 & 5) != 0 ? 1 : 0));
            }
        })).build());
        this.IIIIiiIiii = this.iIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiiiIiIII.ALLATORIxDEMO("\u5f42\u5981\u6414\u7d22"))).description(IiiiIiiIII.ALLATORIxDEMO("\u5f32\u5986\u642e\u7d6f\u97aa\u7f88\u4f5f\u7f03"))).defaultValue((Object)(3 >> 2))).onChanged(bl -> {
            boolean bl2 = bl;
            iiiiIiIIIi iIiIiIIIII2 = this;
            if (bl2 && !iIiIiIIIII2.IIiiIIIIIi) {
                iIiIiIIIII2.ALLATORIxDEMO();
            }
        })).build());
        iiiiIiIIIi iiiiIiIIIi3 = this;
        iiiiIiIIIi3.IIiiIIIIIi = 3 & 4;
        iiiiIiIIIi3.ALLATORIxDEMO = null;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iIiiiIiIII.ALLATORIxDEMO("/\u001b:6\f\u0012_\u0002\u000f\u0013>#o#\u007f\u8ba0\u66ac\u65e0\u526f\u6757\u65f2\u7202\u6724\uff01"));
        }
    }

    public void onDeactivate() {
        if (this.ALLATORIxDEMO != null && !this.ALLATORIxDEMO.isDone()) {
            this.ALLATORIxDEMO.cancel((4 ^ 5) != 0);
            this.IIiiIIIIIi = 5 >> 3;
            this.info(iIiiiIiIII.ALLATORIxDEMO("\u6443\u7d60\u5db8\u5385\u6dd3"), new Object[3 ^ 3]);
        }
        this.info(IiiiIiiIII.ALLATORIxDEMO("\u97f5\u7ff7\u6451\u7d10\u6a6c\u5765\u5dbf\u7993\u7545"), new Object[3 ^ 3]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<iiIiIiIiIi> list, class_2338 class_23382) {
        void iIiIiIIIII2;
        iiiiIiIIIi iiiiIiIIIi2 = this;
        if (iIiIiIIIII2.isEmpty()) {
            iiiiIiIIIi2.warning(IiiiIiiIII.ALLATORIxDEMO("\u573a\u636a\u5b88\u836e\u56c6\u51c8\u6738\u6213\u5202\u5e6b\u97aa\u7f88\u76b6\u6766\u5722\u57a3"), new Object[3 ^ 3]);
            return;
        }
        iIiIiIIIII2.sort((iiIiIiIiIi2, iiIiIiIiIi3) -> {
            iiIiIiIiIi iIiIiIIIII2 = iiIiIiIiIi3;
            iiIiIiIiIi iIiIiIIIII3 = iiIiIiIiIi2;
            return Double.compare(iIiIiIIIII3.iIiIiIIIII, iIiIiIIIII2.iIiIiIIIII);
        });
        if (IiIIiIiiiI.ALLATORIxDEMO() == null) {
            iiiiIiIIIi2.warning(iIiiiIiIII.ALLATORIxDEMO("\u659f\u6ca2\u83e8\u5381/\u001e\u001f\u0000\u0015\u8d9d\u5ff3\u70c6\u96a4\u5462\uff75\u8b86\u780a\u4fb1\u5d8d\u5bfe\u888b\u001e\u0013\u001f\u0001\u0014\u574b\u568d\u6a58\u7eb5"), new Object[5 >> 3]);
            return;
        }
        int iIiIiIIIII3 = 0;
        int n = this = 3 ^ 3;
        while (n < iIiIiIIIII2.size()) {
            BPos bPos;
            String string;
            iiIiIiIiIi iiIiIiIiIi4 = (iiIiIiIiIi)iIiIiIIIII2.get(this);
            BPos bPos2 = iiIiIiIiIi4.ALLATORIxDEMO;
            if (((Boolean)iiiiIiIIIi2.iiiiiIIiIi.get()).booleanValue()) {
                Object[] objectArray = new Object[5 >> 1];
                objectArray[3 & 4] = this + (3 >> 1);
                objectArray[--1] = iiIiIiIiIi4.iIiIiIIIII;
                string = String.format(IiiiIiiIII.ALLATORIxDEMO("\u978a\u7fa8\u0012n7\t\u0012e\u0017c\u0002+\u007fD"), objectArray);
                bPos = bPos2;
            } else {
                Object[] objectArray = new Object[--1];
                objectArray[3 ^ 3] = this + (3 >> 1);
                string = String.format(iIiiiIiIII.ALLATORIxDEMO("\u97eb\u7fbe[P\\\u0015"), objectArray);
                bPos = bPos2;
            }
            ++iIiIiIIIII3;
            IiIIiIiiiI.ALLATORIxDEMO(bPos.getX(), 0x7E & 0x65, bPos2.getZ(), string);
            n = ++this;
        }
        Object[] objectArray = new Object[3 >> 1];
        objectArray[2 & 5] = iIiIiIIIII3;
        iiiiIiIIIi2.info(String.format(IiiiIiiIII.ALLATORIxDEMO("\u647c\u7d3d\u5bec\u6204\uff6a\u626b\u525au\u000fvM\u4e38\u97f5\u7fd7\u4f20\u7f7c\uff61\u5dc0\u6db6\u52b2\u525dj,W?]\u8da2\u5f96\u70d4"), objectArray), new Object[3 ^ 3]);
    }

    @Override
    public void onActivate() {
        iiiiIiIIIi iiiiIiIIIi2 = this;
        super.onActivate();
        iiiiIiIIIi2.ALLATORIxDEMO();
        iiiiIiIIIi2.info(IiiiIiiIII.ALLATORIxDEMO("\u97f5\u7ff7\u6451\u7d10\u6a6c\u5765\u5dbf\u543d\u7545"), new Object[3 & 4]);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void ALLATORIxDEMO(IIiiiiIIII iIiiiiIIII, class_2338 class_23382) {
        void iIiIiIIIII2;
        iiiiIiIIIi iiiiIiIIIi2 = this;
        ArrayList<iiIiIiIiIi> arrayList = new ArrayList<iiIiIiIiIi>();
        try {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            ChunkRand chunkRand;
            EndCity endCity;
            TerrainGenerator terrainGenerator;
            BiomeSource biomeSource;
            long l;
            Object iIiIiIIIII3;
            block22: {
                block21: {
                    block20: {
                        block19: {
                            if (iIiIiIIIII3 == null || ((IIiiiiIIII)iIiIiIIIII3).iIiIiIIIII == null) break block19;
                            if (((IIiiiiIIII)iIiIiIIIII3).ALLATORIxDEMO != null) break block20;
                        }
                        iiiiIiIIIi2.error(iIiiiIiIII.ALLATORIxDEMO("\u79be\u5b2b\u650b\u631d\u6599\u6539"), new Object[3 & 4]);
                        return;
                    }
                    void v0 = iIiIiIIIII3;
                    l = v0.iIiIiIIIII;
                    iIiIiIIIII3 = v0.ALLATORIxDEMO;
                    iiiiIiIIIi2.info("\u4f7f\u7528\u79cd\u5b50: " + l + ", \u7248\u672c: " + ((MCVersion)((Object)iIiIiIIIII3)).name, new Object[3 ^ 3]);
                    biomeSource = BiomeSource.of(Dimension.END, (MCVersion)((Object)iIiIiIIIII3), l);
                    terrainGenerator = TerrainGenerator.of(Dimension.END, biomeSource);
                    endCity = new EndCity((MCVersion)((Object)iIiIiIIIII3));
                    iIiIiIIIII3 = new EndCityGenerator((MCVersion)((Object)iIiIiIIIII3));
                    chunkRand = new ChunkRand();
                    n7 = (Integer)iiiiIiIIIi2.IIiIiiiiII.get();
                    if (n7 > (0x2BFD & 0x55F6)) {
                        iiiiIiIIIi2.warning("\u641c\u7d22\u534a\u5f84\u8fc7\u5927 (" + n7 + ")\uff0c\u53ef\u80fd\u5bfc\u81f4\u6027\u80fd\u95ee\u9898\u6216\u9519\u8bef\u3002 ", new Object[3 ^ 3]);
                    }
                    void v1 = iIiIiIIIII2;
                    n6 = v1.method_10263() >> --4;
                    n5 = v1.method_10260() >> --4;
                    int n82 = endCity.getSpacing();
                    if (n82 <= 0) {
                        iiiiIiIIIi2.error("\u672b\u5730\u57ce\u95f4\u8ddd\u65e0\u6548: " + n82, new Object[2 & 5]);
                        return;
                    }
                    n4 = Math.max(n6 - n7, -1073741824);
                    n3 = Math.min(n6 + n7, 0x3FFFFFFF);
                    n2 = Math.max(n5 - n7, -1073741824);
                    n = Math.min(n5 + n7, 0x3FFFFFFF);
                    n2 /= n82;
                    n /= n82;
                    if ((n3 /= n82) - (n4 /= n82) > (0x63FB & 0x1FEC)) break block21;
                    if (n - n2 <= (0x53FA & 0x2FED)) break block22;
                }
                iiiiIiIIIi2.warning(IiiiIiiIII.ALLATORIxDEMO("\u6477\u7d37\u8369\u56a1\u8fed\u5935\uff61\u53fd\u8090\u5bee\u8199\u6035\u8090\u95dc\u98d5\u3010\u5e97\u8b9c\u5182\u5c3d\u6451\u7d10\u5307\u5f96\u306f"), new Object[5 >> 3]);
            }
            int n9 = (n3 - n4 + (4 ^ 5)) * (n - n2 + --1);
            String n82 = "\u641c\u7d22\u53c2\u6570: \u534a\u5f84=" + n7 + ", \u95f4\u8ddd=" + n82 + ", \u533a\u57df\u8303\u56f4=(" + n4 + "," + n2 + ")\u5230(" + n3 + "," + n + "), \u603b\u533a\u57df=" + n9;
            iiiiIiIIIi2.info(n82, new Object[5 >> 3]);
            for (int n82 = n4; n82 <= n3; ++n82) {
                int n10 = n2;
                while (n10 <= n) {
                    if (!iiiiIiIIIi2.IIiiIIIIIi) {
                        return;
                    }
                    try {
                        CPos cPos;
                        CPos cPos2 = endCity.getInRegion(l, n82, n4, chunkRand);
                        if (!(Math.sqrt(Math.pow(cPos.getX() - n6, 2.0) + Math.pow(cPos2.getZ() - n5, 2.0)) > (double)n7) && endCity.canSpawn(cPos2, biomeSource) && endCity.canGenerate(cPos2, terrainGenerator)) {
                            Object object = iIiIiIIIII3;
                            ((Generator)object).generate(terrainGenerator, cPos2, chunkRand);
                            if (((EndCityGenerator)object).hasShip()) {
                                BPos bPos = new BPos(cPos2.getX() * (0x1D & 0x72), 2 & 5, cPos2.getZ() * (0x52 & 0x3D));
                                double d = Math.sqrt(Math.pow(bPos.getX() - iIiIiIIIII2.method_10263(), 2.0) + Math.pow(bPos.getZ() - iIiIiIIIII2.method_10260(), 2.0));
                                arrayList.add(new iiIiIiIiIi(bPos, d));
                            }
                            ((EndCityGenerator)iIiIiIIIII3).reset();
                        }
                    }
                    catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[5 >> 3] = n82;
                        objectArray[--1] = n4;
                        objectArray[1 ^ 3] = exception.getMessage();
                        iiiiIiIIIi2.warning(String.format(iIiiiIiIII.ALLATORIxDEMO("\u5973\u7479\u5358\u57b5YYA\bSR*oR\u658c\u5189\u9562AS\\\u0002"), objectArray), new Object[3 & 4]);
                    }
                    n10 = ++n4;
                }
            }
        }
        catch (Exception exception) {
            iiiiIiIIIi2.error("\u641c\u7d22\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef, \u5efa\u8bae\u8c03\u5c0f\u641c\u7d22\u534a\u5f84: " + exception.getMessage(), new Object[2 & 5]);
            return;
        }
        iiiiIiIIIi2.ALLATORIxDEMO(arrayList, (class_2338)iIiIiIIIII2);
        iiiiIiIIIi2.IIiiIIIIIi = 2 & 5;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiiiIiIIIi iiiiIiIIIi2 = iIiiiiIIII;
        if (iiiiIiIIIi2.IIiiIIIIIi) {
            iiiiIiIIIi2.warning(IiiiIiiIII.ALLATORIxDEMO("\u640e\u7d4f\u6b51\u5765\u8fe9\u8801\u4e1fc<C"), new Object[3 >> 2]);
            return;
        }
        if (iiiiIiIIIi2.iIIiiIiIiI.field_1724 == null) {
            iiiiIiIIIi2.error(iIiiiIiIII.ALLATORIxDEMO("\u73d2\u5bcd\u4e7e\u5b21\u5759"), new Object[2 & 5]);
            return;
        }
        IIiiiiIIII iIiiiiIIII = iIIIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO();
        if (iIiiiiIIII == null) {
            iiiiIiIIIi2.error(IiiiIiiIII.ALLATORIxDEMO("\u65f2\u6cb8\u83a5\u53bb\u4e24\u7501\u79df\u5b3d\uff3e\u8bba\u6279\u52e5\u8b8c\u7f23\u79df\u5b3d"), new Object[3 ^ 3]);
            return;
        }
        if (iIiiiiIIII.iIiIiIIIII == null || iIiiiiIIII.ALLATORIxDEMO == null) {
            iiiiIiIIIi2.error(iIiiiIiIII.ALLATORIxDEMO("\u79a9\u5b3c\u650f\u6319\u65ae\u650e\uff7e\u8b8d\u91be\u65cb\u8bc5\u7f1d\u79b4\u5b21"), new Object[2 & 5]);
            return;
        }
        if (PlayerUtils.getDimension() != meteordevelopment.meteorclient.utils.world.Dimension.End) {
            iiiiIiIIIi2.warning(IiiiIiiIII.ALLATORIxDEMO("\u5e97\u8bbc\u5745\u6739\u575d\u4f6d\u7545\u6b56\u52d2\u80ef\u4e88\u8385\u5fda\u6732\u518b\u785c\u76c9\u7ec1\u67f1"), new Object[3 ^ 3]);
        }
        iiiiIiIIIi iiiiIiIIIi3 = iiiiIiIIIi2;
        iiiiIiIIIi3.IIiiIIIIIi = --1;
        class_2338 class_23382 = iiiiIiIIIi3.iIIiiIiIiI.field_1724.method_24515();
        iiiiIiIIIi3.info("\u5f00\u59cb\u641c\u7d22\u9798\u7fc5\u4f4d\u7f6e... \u534a\u5f84: " + String.valueOf(iiiiIiIIIi3.IIiIiiiiII.get()) + " \u533a\u5757", new Object[3 >> 2]);
        iiiiIiIIIi2.ALLATORIxDEMO = CompletableFuture.runAsync(() -> {
            iiiiIiIIIi iiiiIiIIIi2 = iIiiiiIIII2;
            IIiiiiIIII iIiiiiIIII2 = iIiiiiIIII;
            iiiiIiIIIi iIiIiIIIII2 = iiiiIiIIIi2;
            try {
                void iIiIiIIIII3;
                iIiIiIIIII2.ALLATORIxDEMO(iIiiiiIIII2, (class_2338)iIiIiIIIII3);
                return;
            }
            catch (Exception this2) {
                iIiIiIIIII2.error("\u641c\u7d22\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef: " + this2.getMessage(), new Object[3 ^ 3]);
                iIIiiIiIiI.error(iIiiiIiIII.ALLATORIxDEMO("\u644b\u7d5d\u8fb0\u7a54\u4e7a\u538e\u7548\u9566\u8b98ew"), (Throwable)this2);
                iIiIiIIIII2.IIiiIIIIIi = 5 >> 3;
                return;
            }
        });
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiiiIiIIIi iiiiIiIIIi2 = iiiiIiIIIi3;
        iiiiIiIIIi iiiiIiIIIi3 = pre;
        iiiiIiIIIi iIiIiIIIII2 = iiiiIiIIIi2;
        if (iIiIiIIIII2.ALLATORIxDEMO != null && iIiIiIIIII2.ALLATORIxDEMO.isDone()) {
            iIiIiIIIII2.IIiiIIIIIi = 3 ^ 3;
            iIiIiIIIII2.ALLATORIxDEMO = null;
            iIiIiIIIII2.IIIIiiIiii.set((Object)((2 & 5) != 0));
        }
    }
}

