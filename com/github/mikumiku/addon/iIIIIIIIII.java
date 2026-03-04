/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.systems.System
 *  meteordevelopment.meteorclient.systems.config.Config
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  net.minecraft.util.Formatting
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtElement
 *  net.minecraft.text.Text
 *  net.minecraft.text.MutableText
 *  net.minecraft.client.network.ServerInfo
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiiIIII;
import com.github.mikumiku.addon.IiIIiiiIiI;
import com.github.mikumiku.addon.iiIIIIiiiI;
import com.seedfinding.mccore.version.MCVersion;
import java.util.Date;
import java.util.HashMap;
import java.util.Optional;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.System;
import meteordevelopment.meteorclient.systems.config.Config;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.util.Formatting;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.ServerInfo;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIIIIIIII
extends System<iIIIIIIIII> {
    private static final iIIIIIIIII iIiIiIIIII = new iIIIIIIIII();
    public HashMap<String, IIiiiiIIII> ALLATORIxDEMO;

    public static iIIIIIIIII ALLATORIxDEMO() {
        return iIiIiIIIII;
    }

    public class_2487 toTag() {
        iIIIIIIIII iIIIIIIIII2 = iIIIIIIIII3;
        iIIIIIIIII iIIIIIIIII3 = new class_2487();
        iIIIIIIIII2.ALLATORIxDEMO.forEach((arg_0, arg_1) -> iIIIIIIIII.ALLATORIxDEMO((class_2487)iIIIIIIIII3, arg_0, arg_1));
        return iIIIIIIIII3;
    }

    private static /* synthetic */ void ALLATORIxDEMO(String string, String string2) {
        String iIiIiIIIII2 = string2;
        String iIiIiIIIII3 = string;
        Object[] objectArray = new Object[1 ^ 3];
        objectArray[3 & 4] = iIiIiIIIII2;
        objectArray[5 >> 2] = MCVersion.latest().name;
        iIiIiIIIII2 = class_2561.method_43470((String)String.format(IiIIiiiIiI.ALLATORIxDEMO("\u65a7\u6c88\u8984\u67cdG\u0010\u000e3\u0002>\u0015<\u0001)G\u7215\u674b}Ep\u001czLx\u655b\u757dOe\tuA\u59c4\u67e0\u60f5\u6094\u6698\u656f\u7218\u6746\uff5d\u8b9c\u8f89\u882faA"), objectArray));
        Object[] objectArray2 = new Object[5 >> 1];
        objectArray2[3 ^ 3] = Config.get().prefix;
        objectArray2[2 ^ 3] = iIiIiIIIII3;
        class_5250 class_52502 = class_2561.method_43470((String)(String.format(iiIIIIiiiI.ALLATORIxDEMO("i|\u0003V\u0014VY\u001f\b\u0018"), objectArray2) + "<version>"));
        iIiIiIIIII2.method_10852((class_2561)class_52502);
        String string3 = iIiIiIIIII2;
        string3.method_10862(string3.method_10866().method_10977(class_124.field_1054));
        ChatUtils.sendMsg((String)IiIIiiiIiI.ALLATORIxDEMO("\n\u0006>\u0005"), (class_2561)iIiIiIIIII2);
    }

    public IIiiiiIIII ALLATORIxDEMO() {
        iIIIIIIIII iIIIIIIIII2 = object;
        if (MeteorClient.mc.method_1496() && MeteorClient.mc.method_1576() != null) {
            Object object = MCVersion.fromString(MeteorClient.mc.method_1576().method_3827());
            if (object == null) {
                object = MCVersion.latest();
            }
            return new IIiiiiIIII(MeteorClient.mc.method_1576().method_30002().method_8412(), (MCVersion)((Object)object));
        }
        return iIIIIIIIII2.ALLATORIxDEMO.get(Utils.getWorldName());
    }

    public iIIIIIIIII() {
        iIIIIIIIII iIIIIIIIII2 = this;
        super(iiIIIIiiiI.ALLATORIxDEMO("m%fn:"));
        iIIIIIIIII2.ALLATORIxDEMO = new HashMap();
        this.init();
        iIIIIIIIII2.load(MeteorClient.FOLDER);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIIiiiIiI.ALLATORIxDEMO("\r\u000b8\u0006.\u0002}\u0012-\u0003<\u0013M3]\u8bb0\u668e\u65f0\u524d\u6747\u65d0\u7212\u6706\uff11"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(class_2487 class_24872, String string, IIiiiiIIII iIiiiiIIII) {
        void iIiIiIIIII2;
        IIiiiiIIII iIiIiIIIII3 = iIiiiiIIII;
        class_2487 iIiIiIIIII4 = class_24872;
        if (iIiIiIIIII3 == null) {
            return;
        }
        iIiIiIIIII4.method_10566((String)iIiIiIIIII2, (class_2520)iIiIiIIIII3.ALLATORIxDEMO());
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String string, MCVersion mCVersion) {
        void iIiIiIIIII2;
        iIIIIIIIII iIIIIIIIII2 = object;
        Object object = mCVersion;
        iIIIIIIIII iIiIiIIIII3 = iIIIIIIIII2;
        if (MeteorClient.mc.method_1496()) {
            return;
        }
        long l = iIIIIIIIII.ALLATORIxDEMO((String)iIiIiIIIII2);
        iIiIiIIIII3.ALLATORIxDEMO.put(Utils.getWorldName(), new IIiiiiIIII(l, (MCVersion)((Object)object)));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2487 class_24872, String string) {
        iIIIIIIIII iIIIIIIIII2;
        void iIiIiIIIII2;
        iIIIIIIIII iIIIIIIIII3 = object;
        Object object = class_24872;
        iIIIIIIIII iIiIiIIIII3 = iIIIIIIIII3;
        Object object2 = object = object.method_10562((String)iIiIiIIIII2);
        if (object instanceof Optional) {
            object = (class_2487)((Optional)object2).get();
            iIIIIIIIII2 = iIiIiIIIII3;
        } else {
            object = (class_2487)object2;
            iIIIIIIIII2 = iIiIiIIIII3;
        }
        iIIIIIIIII2.ALLATORIxDEMO.put((String)iIiIiIIIII2, IIiiiiIIII.ALLATORIxDEMO((class_2487)object));
    }

    public iIIIIIIIII ALLATORIxDEMO(class_2487 class_24872) {
        iIIIIIIIII iIIIIIIIII2 = iIIIIIIIII3;
        iIIIIIIIII iIIIIIIIII3 = class_24872;
        iIIIIIIIII iIiIiIIIII2 = iIIIIIIIII2;
        iIIIIIIIII3.method_10541().forEach(arg_0 -> iIiIiIIIII2.ALLATORIxDEMO((class_2487)iIIIIIIIII3, arg_0));
        return iIiIiIIIII2;
    }

    private static /* synthetic */ long ALLATORIxDEMO(String iIiIiIIIII2) {
        try {
            return Long.parseLong(iIiIiIIIII2);
        }
        catch (NumberFormatException numberFormatException) {
            return iIiIiIIIII2.strip().hashCode();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String string) {
        void iIiIiIIIII2;
        iIIIIIIIII iIIIIIIIII2 = object;
        if (MeteorClient.mc.method_1496()) {
            return;
        }
        class_642 class_6422 = MeteorClient.mc.method_1558();
        Object object = null;
        if (class_6422 != null) {
            object = MCVersion.fromString(class_6422.field_3760.getString());
        }
        if (object == null) {
            String string2 = iiIIIIiiiI.ALLATORIxDEMO("F\u001fY\u0017U\fV");
            if (class_6422 != null) {
                string2 = class_6422.field_3760.getString();
            }
            iIIIIIIIII.ALLATORIxDEMO((String)iIiIiIIIII2, string2);
            object = MCVersion.latest();
        }
        iIIIIIIIII2.ALLATORIxDEMO((String)iIiIiIIIII2, (MCVersion)((Object)object));
    }
}

