/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1661
 *  net.minecraft.class_1703
 *  net.minecraft.class_1735
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 *  net.minecraft.class_465
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiIIiIi;
import com.github.mikumiku.addon.iIIIIIIIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.modules.InventoryPrinter;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_465;

public class IIiIiIiiiI
extends iIiIiIIIii {
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<Boolean> IIiIiIIiii;
    private int iIIiiIiIiI;
    private final Setting<Boolean> iiiiiIIiIi;
    private final Setting<InventoryPrinter.Mode> iIIiIiiiIi;
    private final SettingGroup iIiIiIIIII;
    private boolean ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n, class_1799 class_17992, String string) {
        IIiIiIiiiI iIiIiIiiiI;
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        IIiIiIiiiI iIiIiIiiiI2 = iIiIiIiiiI3;
        IIiIiIiiiI iIiIiIiiiI3 = class_17992;
        IIiIiIiiiI iIiIiIIIII4 = iIiIiIiiiI2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO("\u699b\u4f43f")).append((int)iIiIiIIIII3).append(iIIIIIIIii.ALLATORIxDEMO("\u00068")).append((String)iIiIiIIIII2).append(IIiiiIIiIi.ALLATORIxDEMO(";4f"));
        StringBuilder stringBuilder2 = stringBuilder;
        if (iIiIiIiiiI3.method_7960()) {
            stringBuilder2.append(iIIIIIIIii.ALLATORIxDEMO("\u7a19"));
            iIiIiIiiiI = iIiIiIIIII4;
        } else {
            stringBuilder2.append(iIiIiIiiiI3.method_7909().method_63680().getString());
            if (((Boolean)iIiIiIIIII4.iiiiiIIiIi.get()).booleanValue()) {
                stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO(".>")).append(iIiIiIiiiI3.method_7947());
            }
            if (!iIiIiIiiiI3.method_57353().method_57837()) {
                stringBuilder.append(iIIIIIIIii.ALLATORIxDEMO("\fA\u672d\u6511\u6348J"));
            }
            if (iIiIiIiiiI3.method_7986()) {
                stringBuilder.append(IIiiiIIiIi.ALLATORIxDEMO("\u000eN\u803e\u4e234f")).append(iIiIiIiiiI3.method_7936() - iIiIiIiiiI3.method_7919()).append(iIIIIIIIii.ALLATORIxDEMO("L")).append(iIiIiIiiiI3.method_7936()).append(IIiiiIIiIi.ALLATORIxDEMO("o"));
            }
            iIiIiIiiiI = iIiIiIIIII4;
        }
        iIiIiIiiiI.info(stringBuilder.toString(), new Object[5 >> 3]);
    }

    private /* synthetic */ void iiiIiIiiIi() {
        Object object;
        class_1735 class_17352;
        class_1799 class_17992;
        IIiIiIiiiI iIiIiIiiiI = this;
        if (!(iIiIiIiiiI.iIIiiIiIiI.field_1755 instanceof class_465)) {
            iIiIiIiiiI.info(iIIIIIIIii.ALLATORIxDEMO("\u001dX=e\u5f73\u5228\u5bb9\u562d\u4fe1\u602a\u0000X=x"), new Object[3 & 4]);
            iIiIiIiiiI.info(IIiiiIIiIi.ALLATORIxDEMO("\u6ce7\u6727\u6235\u5f2e\u76e2\u5b97\u560e\u7542\u9724"), new Object[3 >> 2]);
            return;
        }
        class_465 class_4652 = (class_465)iIiIiIiiiI.iIIiiIiIiI.field_1755;
        class_1703 class_17032 = class_4652.method_17577();
        iIiIiIiiiI.info(iIIIIIIIii.ALLATORIxDEMO("\u001dX=e\u5f73\u5228\u5bb9\u562d\u4fe1\u602a\u0000X=x"), new Object[3 & 4]);
        iIiIiIiiiI.info("\u5bb9\u5668\u7c7b\u578b: " + class_4652.getClass().getSimpleName(), new Object[2 & 5]);
        iIiIiIiiiI.info("\u603b\u69fd\u4f4d\u6570: " + class_17032.field_7761.size(), new Object[3 >> 2]);
        int n = class_17032.field_7761.size() - (0x6F & 0x34);
        int n2 = 3 & 4;
        iIiIiIiiiI.info("--- \u5bb9\u5668\u69fd\u4f4d (0-" + (n - (5 >> 2)) + ") ---", new Object[3 ^ 3]);
        int n3 = this = 3 >> 2;
        while (n3 < n) {
            if (this < class_17032.field_7761.size() && (!(class_17992 = (class_17352 = (class_1735)class_17032.field_7761.get(this)).method_7677()).method_7960() || ((Boolean)iIiIiIiiiI.IiiIiIiiIi.get()).booleanValue())) {
                object = IIiiiIIiIi.ALLATORIxDEMO("\u5bb7\u562e");
                if (((Boolean)iIiIiIiiiI.IIiIiIIiii.get()).booleanValue()) {
                    object = (String)object + " [" + class_17352.getClass().getSimpleName() + "]";
                }
                iIiIiIiiiI.ALLATORIxDEMO(this, class_17992, (String)object);
                if (!class_17992.method_7960()) {
                    ++n2;
                }
            }
            n3 = ++this;
        }
        iIiIiIiiiI.info("--- \u73a9\u5bb6\u5e93\u5b58\u90e8\u5206 (" + n + "-" + (class_17032.field_7761.size() - (3 >> 1)) + ") ---", new Object[3 ^ 3]);
        int n4 = this = n;
        while (n4 < class_17032.field_7761.size()) {
            if (this < class_17032.field_7761.size() && (!(class_17992 = (class_17352 = (class_1735)class_17032.field_7761.get(this)).method_7677()).method_7960() || ((Boolean)iIiIiIiiiI.IiiIiIiiIi.get()).booleanValue())) {
                object = iIIIIIIIii.ALLATORIxDEMO("\u7389\u5bd3\u5e93\u5b1d");
                if (((Boolean)iIiIiIiiiI.IIiIiIIiii.get()).booleanValue()) {
                    object = (String)object + " [" + class_17352.getClass().getSimpleName() + "]";
                }
                iIiIiIiiiI.ALLATORIxDEMO(this, class_17992, (String)object);
            }
            n4 = ++this;
        }
        iIiIiIiiiI.info("\u5bb9\u5668\u7edf\u8ba1: " + n2 + " \u4e2a\u975e\u7a7a\u69fd\u4f4d / " + n + " \u5bb9\u5668\u69fd\u4f4d", new Object[3 ^ 3]);
    }

    public void onDeactivate() {
        this.info(IIiiiIIiIi.ALLATORIxDEMO("\u5ebd\u5b3e\u627d\u5316\u5646\u5d94\u517d\u95ab"), new Object[3 >> 2]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiIiIiiiI iIiIiIiiiI = iIiIiIiiiI2;
        IIiIiIiiiI iIiIiIiiiI2 = pre;
        IIiIiIiiiI iIiIiIIIII2 = iIiIiIiiiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null || iIiIiIIIII2.ALLATORIxDEMO) {
            return;
        }
        IIiIiIiiiI iIiIiIiiiI3 = iIiIiIIIII2;
        iIiIiIiiiI3.iIIiiIiIiI += --1;
        if (iIiIiIiiiI3.iIIiiIiIiI < --3) {
            return;
        }
        try {
            switch (((InventoryPrinter.Mode)((Object)iIiIiIIIII2.iIIiIiiiIi.get())).ordinal()) {
                case 0: {
                    iIiIiIIIII2.ALLATORIxDEMO();
                    break;
                }
                case 1: {
                    iIiIiIIIII2.iiiIiIiiIi();
                    break;
                }
                case 2: {
                    iIiIiIIIII2.ALLATORIxDEMO();
                    iIiIiIIIII2.info(iIIIIIIIii.ALLATORIxDEMO("H<y\r\u526e\u96b8\u7ed6\u0004L\u000bN"), new Object[5 >> 3]);
                    iIiIiIIIII2.iiiIiIiiIi();
                }
            }
        }
        catch (Exception this2) {
            iIiIiIIIII2.error("\u6253\u5370\u5e93\u5b58\u65f6\u51fa\u9519: " + this2.getMessage(), new Object[3 >> 2]);
        }
        iIiIiIIIII2.ALLATORIxDEMO = 3 & 5;
        iIiIiIIIII2.info(IIiiiIIiIi.ALLATORIxDEMO("\u6235\u537e\u5bca\u623e\uff6a\u81c4\u52ce\u515d\u958b\u6a2f\u5711"), new Object[3 & 4]);
        iIiIiIIIII2.toggle();
    }

    @Override
    public void onActivate() {
        if (this.iIIiiIiIiI.field_1724 == null || this.iIIiiIiIiI.field_1687 == null) {
            this.error(iIIIIIIIii.ALLATORIxDEMO("\u73b6\u5bec\u621e\u4e5b\u7551\u4e62\u7a76\uff48"), new Object[3 ^ 3]);
            this.toggle();
            return;
        }
        this.ALLATORIxDEMO = 3 >> 2;
        this.iIIiiIiIiI = 2 & 5;
        this.info("\u5e93\u5b58\u6253\u5370\u5668\u5df2\u6fc0\u6d3b - \u6a21\u5f0f: " + ((InventoryPrinter.Mode)((Object)this.iIIiIiiiIi.get())).name(), new Object[5 >> 3]);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        class_1799 class_17992;
        IIiIiIiiiI iIiIiIiiiI = this;
        iIiIiIiiiI.info(iIIIIIIIii.ALLATORIxDEMO("\u0006C\u001dE\u73b8\u5be2\u5ebe\u5b30\u4fcd\u6006\u0004\\\u001b^"), new Object[3 >> 2]);
        IIiIiIiiiI iIiIiIiiiI2 = iIiIiIiiiI;
        class_1661 class_16612 = iIiIiIiiiI2.iIIiiIiIiI.field_1724.method_31548();
        int n = class_16612.method_5439();
        int n2 = 2 & 5;
        iIiIiIiiiI2.info("\u603b\u69fd\u4f4d\u6570: " + n, new Object[3 & 4]);
        iIiIiIiiiI.info(IIiiiIIiIi.ALLATORIxDEMO("k\u0003K.\u5fad\u6359\u6869.n\u001eK\u0016O\u000eK#k"), new Object[5 >> 3]);
        int n3 = class_17993 = 2 & 5;
        while (true) {
            if (n3 >= 9) break;
            class_17992 = class_16612.method_5438(class_17993);
            if (!class_17992.method_7960() || ((Boolean)iIiIiIiiiI.IiiIiIiiIi.get()).booleanValue()) {
                iIiIiIiiiI.ALLATORIxDEMO(class_17993, class_17992, iIIIIIIIii.ALLATORIxDEMO("\u5f8a\u6351\u686c"));
                if (!class_17992.method_7960()) {
                    ++n2;
                }
            }
            n3 = ++class_17993;
        }
        iIiIiIiiiI.info(IIiiiIIiIi.ALLATORIxDEMO("#k\u0003F\u4e35\u5ed5\u5b76F&\u007f\u0003U\u001bO\u000eK#k"), new Object[3 ^ 3]);
        int n4 = class_17993 = 0x1F & 0x69;
        while (true) {
            if (n4 >= 36) break;
            class_17992 = class_16612.method_5438(class_17993);
            if (!class_17992.method_7960() || ((Boolean)iIiIiIiiiI.IiiIiIiiIi.get()).booleanValue()) {
                iIiIiIiiiI.ALLATORIxDEMO(class_17993, class_17992, iIIIIIIIii.ALLATORIxDEMO("\u4e5a\u5eb5\u5b3b"));
                if (!class_17992.method_7960()) {
                    ++n2;
                }
            }
            n4 = ++class_17993;
        }
        iIiIiIiiiI.info(IIiiiIIiIi.ALLATORIxDEMO("k#k\u000e\u88a3\u5909\u6849\u000eN=p\u0003U\u0017O\u000eK#k"), new Object[5 >> 3]);
        int n5 = class_17993 = 0x2D & 0x76;
        while (true) {
            if (n5 >= 40) break;
            class_17992 = class_16612.method_5438(class_17993);
            if (!class_17992.method_7960() || ((Boolean)iIiIiIiiiI.IiiIiIiiIi.get()).booleanValue()) {
                IIiIiIiiiI iIiIiIiiiI3 = iIiIiIiiiI;
                String string = iIiIiIiiiI3.ALLATORIxDEMO(class_17993);
                iIiIiIiiiI3.ALLATORIxDEMO(class_17993, class_17992, string);
                if (!class_17992.method_7960()) {
                    ++n2;
                }
            }
            n5 = ++class_17993;
        }
        iIiIiIiiiI.info(iIIIIIIIii.ALLATORIxDEMO("N\u0016S\u0000\u520a\u625at\u0005\\\u001c@\u0004L\u000bN"), new Object[3 ^ 3]);
        class_1799 class_17993 = class_16612.method_5438(0x3A & 0x6D);
        if (!class_17993.method_7960() || ((Boolean)iIiIiIiiiI.IiiIiIiiIi.get()).booleanValue()) {
            iIiIiIiiiI.ALLATORIxDEMO(0x2B & 0x7C, class_17993, IIiiiIIiIi.ALLATORIxDEMO("\u5261\u620d"));
            if (!class_17993.method_7960()) {
                ++n2;
            }
        }
        iIiIiIiiiI.info("\u73a9\u5bb6\u5e93\u5b58\u7edf\u8ba1: " + n2 + " \u4e2a\u975e\u7a7a\u69fd\u4f4d / " + n + " \u603b\u69fd\u4f4d", new Object[3 & 4]);
    }

    public IIiIiIiiiI() {
        IIiIiIiiiI iIiIiIiiiI = this;
        super(IIiiiIIiIi.ALLATORIxDEMO("\u5ebd\u5b3e\u625d\u5336"), iIIIIIIIii.ALLATORIxDEMO("\u6206\u5360\u5e93\u5b1d\u69fa\u4f0f\u4fe1\u602a\u522d\u8012\u597e\u681d"));
        iIiIiIiiiI.iIiIiIIIII = iIiIiIiiiI.settings.getDefaultGroup();
        iIiIiIiiiI.iIIiIiiiIi = iIiIiIiiiI.iIiIiIIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("C\tj#"))).description(iIIIIIIIii.ALLATORIxDEMO("w\r4d 1hbp7t6#<"))).defaultValue((Object)InventoryPrinter.Mode.iIiIiIIIII)).build());
        this.IiiIiIiiIi = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("/@\u0005b3J\u0003\u0003\u0003C\u0016z?"))).description(iIIIIIIIii.ALLATORIxDEMO("\u000elC\tU\u0001eeE\bp1YEs)o1seI\u000budh '-u1m-#<"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiiiiIIiIi = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("}.A\u0011\u0003\u0005A\u0013`2"))).description(iIIIIIIIii.ALLATORIxDEMO("s\ro2\u0000\ft MEc*u+teF\n'0e$d* 6q7#<"))).defaultValue((Object)(5 >> 2))).build());
        this.IIiIiIIiii = this.iIiIiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiiIIiIi.ALLATORIxDEMO("}.A\u0011#5B\tZKZ\u001f~#"))).description(iIIIIIIIii.ALLATORIxDEMO("\u0016H\nweS\to1 1y5EE<~f*u/a1t79<"))).defaultValue((Object)((2 & 5) != 0))).build());
        IIiIiIiiiI iIiIiIiiiI2 = this;
        iIiIiIiiiI2.ALLATORIxDEMO = 3 & 4;
        iIiIiIiiiI2.iIIiiIiIiI = 5 >> 3;
        iIiIiIiiiI2.iIIiiIiIiI = (int)class_310.method_1551();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiiiIIiIi.ALLATORIxDEMO("y\r\f@}#.3^\u0002o2KG.\u8bb1\u66da\u65d6\u521e\u6766\u659e\u722e\u6722\uff47"));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ String ALLATORIxDEMO(int n) {
        int n2 = n;
        IIiIiIiiiI iIiIiIIIII2 = this;
        switch (n2) {
            case 36: {
                return iIIIIIIIii.ALLATORIxDEMO("\u9752\u5b33");
            }
            case 37: {
                return IIiiiIIiIi.ALLATORIxDEMO("\u62aa\u8139");
            }
            case 38: {
                return iIIIIIIIii.ALLATORIxDEMO("\u80de\u7551");
            }
            case 39: {
                return IIiiiIIiIi.ALLATORIxDEMO("\u593a\u7692");
            }
        }
        return iIIIIIIIii.ALLATORIxDEMO("\u88e3\u5964");
    }
}

