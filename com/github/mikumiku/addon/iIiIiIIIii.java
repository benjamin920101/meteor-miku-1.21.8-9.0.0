/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  meteordevelopment.meteorclient.pathing.NopPathManager
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  net.minecraft.util.Formatting
 *  net.minecraft.text.Text
 *  net.minecraft.text.Style
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.text.MutableText
 *  net.minecraft.client.network.PendingUpdateManager
 *  net.minecraft.client.network.SequencedPacketCreator
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import com.github.mikumiku.addon.IIIiiiiiII;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiIiIiII;
import com.github.mikumiku.addon.IiiIIiIIiI;
import com.github.mikumiku.addon.IiiiiiiIII;
import com.github.mikumiku.addon.mixin.IClientWorld;
import java.util.Date;
import meteordevelopment.meteorclient.pathing.NopPathManager;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.util.Formatting;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.PendingUpdateManager;
import net.minecraft.client.network.SequencedPacketCreator;

public abstract class iIiIiIIIii
extends Module
implements IIIiiiiiII {
    public class_310 iIIiiIiIiI;
    public static final Category iiiiiIIiIi;
    public static final Category iIIiIiiiIi;
    public IBaritone iIiIiIIIII;
    public static final Category ALLATORIxDEMO;

    static {
        iIIiIiiiIi = new Category(IiiIIiIIiI.ALLATORIxDEMO("\u001f\u001c9 R\u624d\u65e5"));
        ALLATORIxDEMO = new Category(IiIiIiIiII.iiiIiIiiIi("\u001ap<LW\u7240\u8c74"));
        iiiiiIIiIi = new Category(IiiIIiIIiI.ALLATORIxDEMO("\u0018\u001b>\u0007"));
    }

    /*
     * WARNING - void declaration
     */
    public iIiIiIIIii(Category category, String string, String string2, String ... stringArray) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        String[] stringArray2 = stringArray3;
        String[] stringArray3 = stringArray;
        String[] iIiIiIIIII5 = stringArray2;
        super((Category)iIiIiIIIII4, (String)iIiIiIIIII3, (String)iIiIiIIIII2, stringArray3);
        iIiIiIIIII5.iIIiiIiIiI = class_310.method_1551();
        iIiIiIIIII5.iIIiiIiIiI = class_310.method_1551();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIIiIIiI.ALLATORIxDEMO("\u0002\u0019wT&\u0017U'%\u0016\u0014&0SU\u8ba5\u6681\u65e2\u5245\u6752\u65e5\u723a\u6779\uff73"));
        }
    }

    private /* synthetic */ void iiIIiIIiii() {
        try {
            try {
                if (!(PathManagers.get() instanceof NopPathManager)) {
                    this.iIiIiIIIII = BaritoneAPI.getProvider().getPrimaryBaritone();
                }
            }
            catch (Exception exception) {
                this.error(IiiIIiIIiI.ALLATORIxDEMO("\u8ba2\u5bfb\u88b0\u0010\u0014 \u001c&:\u001c0S"), new Object[3 ^ 3]);
            }
            IiiiiiiIII.iiiIiIiiIi(IiIiIiIiII.iiiIiIiiIi("P\u0019p#[6k>M\u0018W\u0012"));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void ALLATORIxDEMO(class_7204 class_72042) {
        class_7204 class_72043 = class_72042;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.method_1562() == null || class_3102.field_1687 == null) {
            return;
        }
        class_7202 class_72022 = ((IClientWorld)class_3102.field_1687).getPendingManager().method_41937();
        try {
            int iIiIiIIIII2 = class_72022.method_41942();
            class_3102.method_1562().method_52787(class_72043.predict(iIiIiIIIII2));
            if (class_72022 == null) return;
        }
        catch (Throwable iIiIiIIIII2) {
            Throwable throwable;
            if (class_72022 != null) {
                try {
                    class_72022.close();
                    throwable = iIiIiIIIII2;
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    iIiIiIIIII2.addSuppressed(throwable2);
                }
            }
            throwable = iIiIiIIIII2;
            throw throwable;
        }
        class_72022.close();
    }

    private /* synthetic */ void iiiIiIiiIi() {
        System.out.println(IiiIIiIIiI.ALLATORIxDEMO("AgF"));
    }

    /*
     * WARNING - void declaration
     */
    public iIiIiIIIii(Category category, String string, String string2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iIiIiIIIii iIiIiIIIii2 = string3;
        String string3 = string2;
        iIiIiIIIii iIiIiIIIII4 = iIiIiIIIii2;
        super((Category)iIiIiIIIII3, (String)iIiIiIIIII2, string3);
        iIiIiIIIII4.iIIiiIiIiI = class_310.method_1551();
        iIiIiIIIII4.iIIiiIiIiI = class_310.method_1551();
        try {
            if (!(PathManagers.get() instanceof NopPathManager)) {
                iIiIiIIIII4.iIiIiIIIII = BaritoneAPI.getProvider().getPrimaryBaritone();
            }
        }
        catch (Exception exception) {
            iIiIiIIIII4.error(IiIiIiIiII.iiiIiIiiIi("\u8bce\u5bfe\u88dc\u0015x%p#V\u0019\\V"), new Object[3 ^ 3]);
        }
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIIiIIiI.ALLATORIxDEMO("\u0002\u0019wT&\u0017U'%\u0016\u0014&0SU\u8ba5\u6681\u65e2\u5245\u6752\u65e5\u723a\u6779\uff73"));
        }
    }

    public void sendToggledMsg() {
        iIiIiIIIii iIiIiIIIii2 = iIiIiIIIii3;
        class_5250 class_52502 = class_2561.method_43473().method_10862(class_2583.field_24360.method_27706(class_124.field_1060)).method_27693(IiiIIiIIiI.ALLATORIxDEMO("\u001a<"));
        class_5250 class_52503 = class_2561.method_43473().method_10862(class_2583.field_24360.method_27706(class_124.field_1061)).method_27693(IiIiIiIiII.iiiIiIiiIi("8\u007f1"));
        ChatUtils.forceNextPrefixClass(iIiIiIIIii2.getClass());
        iIiIiIIIii iIiIiIIIii3 = class_2561.method_43473();
        iIiIiIIIii iIiIiIIIii4 = iIiIiIIIii2;
        iIiIiIIIii iIiIiIIIii5 = iIiIiIIIii3;
        iIiIiIIIii3.method_10852((class_2561)class_2561.method_43473().method_10862(class_2583.field_24360.method_27706(class_124.field_1068)).method_27693(iIiIiIIIii4.title));
        iIiIiIIIii5.method_27693(IiiIIiIIiI.ALLATORIxDEMO("R"));
        iIiIiIIIii3.method_10852((class_2561)class_2561.method_43473().method_10862(class_2583.field_24360.method_27706(class_124.field_1080)).method_27693(IiIiIiIiII.iiiIiIiiIi("m8~0U\u0012]W")));
        iIiIiIIIii5.method_10852((class_2561)(iIiIiIIIii4.isActive() ? class_52502 : class_52503));
        IiIiIIiiii.ALLATORIxDEMO((class_2561)iIiIiIIIii3, iIiIiIIIii2.hashCode());
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        System.out.println(IiIiIiIiII.iiiIiIiiIi("N\u0004"));
    }

    /*
     * WARNING - void declaration
     */
    public iIiIiIIIii(String string, String string2) {
        void iIiIiIIIII2;
        iIiIiIIIii iIiIiIIIii2 = string3;
        String string3 = string2;
        iIiIiIIIii iIiIiIIIII3 = iIiIiIIIii2;
        super(iiiiiIIiIi, (String)iIiIiIIIII2, string3);
        iIiIiIIIII3.iIIiiIiIiI = class_310.method_1551();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiIiIiII.iiiIiIiiIi("n\u001c\u001bQJ\u00129\"I\u0013x#\\V9\u8ba0\u66ed\u65e7\u5229\u6757\u6589\u723f\u6715\uff76"));
        }
    }

    public void onActivate() {
        iIiIiIIIii iIiIiIIIii2 = this;
        super.onActivate();
        if (iIiIiIIIii2.iIIiiIiIiI == null) {
            this.iIIiiIiIiI = class_310.method_1551();
        }
        iIiIiIIIii iIiIiIIIii3 = this;
        iIiIiIIIii3.iiIIiIIiii();
        iIiIiIIIii3.ALLATORIxDEMO();
    }
}

