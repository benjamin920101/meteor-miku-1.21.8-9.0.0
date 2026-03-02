/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_7439
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringListSetting;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_7439;

public class iIIIiiiIII
extends iIiIiIIIii {
    private final Setting<Boolean> IiiIiIiiIi;
    private Map<String, String> IIiIiIIiii;
    private final SettingGroup iIIiiIiIiI;
    private final Setting<String> iiiiiIIiIi;
    private final Setting<List<String>> iIIiIiiiIi;
    private String iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    private /* synthetic */ String iiiIiIiiIi() {
        block3: {
            iIIIiiiIII iIIIiiiIII2 = string;
            try {
                if (iIIIiiiIII2.iIIiiIiIiI != null && iIIIiiiIII2.iIIiiIiIiI.field_1724 != null) {
                    String string = iIIIiiiIII2.iIIiiIiIiI.field_1724.method_5477().getString();
                    return string;
                }
            }
            catch (Exception exception) {
                if (!((Boolean)iIIIiiiIII2.IiiIiIiiIi.get()).booleanValue()) break block3;
                iIIIiiiIII2.error("\u83b7\u53d6\u7528\u6237\u540d\u5931\u8d25: " + exception.getMessage(), new Object[3 >> 2]);
            }
        }
        return IIiIIIIIii.ALLATORIxDEMO("\u6760\u778d\u7562\u625f");
    }

    public iIIIiiiIII() {
        iIIIiiiIII iIIIiiiIII2 = this;
        super(IIiIIIIIii.ALLATORIxDEMO("\u8180\u52e0\u7631\u5f3d\u001a\u0004?\u001b"), iIiiiIIiIi.ALLATORIxDEMO("\u68a3\u6d40\u5f70\u5201)/\u756c\u625b\u5449\u5e1a\u81ae\u52e4\u535d\u9101\u5b9d\u5ed8\u5ba2\u786d\u763f\u5f39\u6749\u52cd\u562c"));
        iIIIiiiIII2.ALLATORIxDEMO = iIIIiiiIII2.settings.getDefaultGroup();
        iIIIiiiIII2.iIIiiIiIiI = iIIIiiiIII2.settings.createGroup(IIiIIIIIii.ALLATORIxDEMO("\u8d6c\u625f\u7beb\u746e"));
        iIIIiiiIII2.iiiiiIIiIi = iIIIiiiIII2.ALLATORIxDEMO.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iIiiiIIiIi.ALLATORIxDEMO("\u5f17\u5221\u756c\u625b\u5449"))).description(IIiIIIIIii.ALLATORIxDEMO("\u6656\u7970\u5f3b\u5227\u0005)\u5bea\u625d\u7aa7\u7631\u5f3d\u76ce\u7540\u627d\u5465"))).defaultValue((Object)iIiiiIIiIi.ALLATORIxDEMO("\u6746\u6884\u6d27\u5274"))).build());
        this.iIIiIiiiIi = this.iIIiiIiIiI.add((Setting)((StringListSetting.Builder)((StringListSetting.Builder)new StringListSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u8d6c\u625f\u525d\u8800"))).description(iIiiiIIiIi.ALLATORIxDEMO("\u6b8b\u8820\u4e44\u4e46\u8d62\u627b\uff68\u6870\u5f6bvD\u7544\u6273\u5461~\u5baa\u7845"))).defaultValue(new String[3 & 4]).build());
        this.IiiIiIiiIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u8c49\u8bbd\u6a6b\u5f67"))).description(iIiiiIIiIi.ALLATORIxDEMO("\u665a\u7976\u8b82\u7eaa\u76c0\u8c6f\u8b91\u4f8d\u602b"))).defaultValue((Object)(3 >> 2))).build());
        iIIIiiiIII iIIIiiiIII3 = this;
        iIIIiiiIII iIIIiiiIII4 = this;
        iIIIiiiIII3.IIiIiIIiii = new HashMap<String, String>();
        iIIIiiiIII3.iIiIiIIIII = "";
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiIIIIIii.ALLATORIxDEMO("=#Hn\u0019-j\u001d:\f+\u001c\u000fiJ\u8bbf\u669e\u65f8\u527a\u6768\u65fa\u7220\u6766\uff69"));
        }
    }

    private /* synthetic */ String ALLATORIxDEMO() {
        iIIIiiiIII iIIIiiiIII2;
        iIIIiiiIII iIIIiiiIII3 = iIIIiiiIII2 = string;
        String string = iIIIiiiIII3.iiiIiIiiIi();
        return iIIIiiiIII3.IIiIiIIiii.get(string);
    }

    private /* synthetic */ void iiiIiIiiIi() {
        Object object = this;
        if (!((String)(this = ((iIIIiiiIII)object).iiiIiIiiIi())).equals(((iIIIiiiIII)object).iIiIiIIIII)) {
            iIIIiiiIII iIIIiiiIII2 = object;
            iIIIiiiIII2.iIiIiIIIII = this;
            iIIIiiiIII2.iiiiiIIiIi.set(this);
            if (((Boolean)iIIIiiiIII2.IiiIiIiiIi.get()).booleanValue()) {
                object.info("\u68c0\u6d4b\u5230\u7528\u6237\u540d: " + (String)this, new Object[3 & 4]);
            }
        }
    }

    @EventHandler
    public void ALLATORIxDEMO(PacketEvent.Receive receive) {
        iIIIiiiIII iIIIiiiIII2 = object;
        Object object = receive;
        iIIIiiiIII iIiIiIIIII2 = iIIIiiiIII2;
        object = ((PacketEvent.Receive)object).packet;
        if (object instanceof class_7439 && ((class_7439)object).comp_763().getString().contains(iIiiiIIiIi.ALLATORIxDEMO("C(\u0003#\u0005*"))) {
            if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
                iIiIiIIIII2.info(IIiIIIIIii.ALLATORIxDEMO("\u6888\u6d01\u5258\u974a\u89e9\u7631\u5f3d"), new Object[3 & 4]);
            }
            iIIIiiiIII iIIIiiiIII3 = iIiIiIIIII2;
            iIIIiiiIII3.iiiIiIiiIi();
            iIIIiiiIII3.ALLATORIxDEMO();
            object = iIIIiiiIII3.ALLATORIxDEMO();
            String string = iIIIiiiIII3.iiiIiIiiIi();
            if (object != null && !((String)object).isEmpty()) {
                iIiIiIIIII2.iIIiiIiIiI.method_1562().method_45730("login " + (String)object);
                if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
                    iIiIiIIIII2.info("\u4e3a\u7528\u6237 " + string + " \u81ea\u52a8\u767b\u5f55", new Object[2 & 5]);
                    return;
                }
            } else if (((Boolean)iIiIiIIIII2.IiiIiIiiIi.get()).booleanValue()) {
                iIiIiIIIII2.warning("\u672a\u627e\u5230\u7528\u6237 " + string + " \u7684\u5bc6\u7801\u914d\u7f6e", new Object[5 >> 3]);
            }
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIIIiiiIII iIIIiiiIII2;
        iIIIiiiIII iIIIiiiIII3 = iIIIiiiIII2 = iterator;
        iIIIiiiIII3.IIiIiIIiii.clear();
        Iterator iterator = (List)iIIIiiiIII3.iIIiIiiiIi.get();
        if (iterator.isEmpty()) {
            if (((Boolean)iIIIiiiIII2.IiiIiIiiIi.get()).booleanValue()) {
                iIIIiiiIII2.warning(iIiiiIIiIi.ALLATORIxDEMO("\u8d4a\u6273\u527b\u882c\u4e56\u7a3e"), new Object[3 >> 2]);
            }
            return;
        }
        try {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object object = ((String)iterator.next()).trim().split(IIiIIIIIii.ALLATORIxDEMO("R"));
                if (((String[])object).length != --2) continue;
                object = object[2 & 5].trim();
                String string = object[3 & 5].trim();
                if (((String)object).isEmpty() || string.isEmpty()) continue;
                iIIIiiiIII iIIIiiiIII4 = iIIIiiiIII2;
                iIIIiiiIII4.IIiIiIIiii.put((String)object, string);
                if (!((Boolean)iIIIiiiIII4.IiiIiIiiIi.get()).booleanValue()) continue;
                iIIIiiiIII2.info("\u5df2\u6dfb\u52a0\u8d26\u6237: " + (String)object, new Object[3 ^ 3]);
            }
        }
        catch (Exception this2) {
            iIIIiiiIII2.error("\u89e3\u6790\u8d26\u6237\u5217\u8868\u5931\u8d25: " + this2.getMessage(), new Object[3 ^ 3]);
        }
    }

    @Override
    public void onActivate() {
        iIIIiiiIII iIIIiiiIII2 = this;
        super.onActivate();
        iIIIiiiIII2.iiiIiIiiIi();
        iIIIiiiIII2.ALLATORIxDEMO();
        if (((Boolean)iIIIiiiIII2.IiiIiIiiIi.get()).booleanValue()) {
            this.info(iIiiiIIiIi.ALLATORIxDEMO("\u818e\u52e4\u761f\u5f39\u6a65\u573b\u5db6\u6fac\u6d7f"), new Object[3 >> 2]);
            iIIIiiiIII iIIIiiiIII3 = this;
            iIIIiiiIII3.info("\u5f53\u524d\u7528\u6237\u540d: " + iIIIiiiIII3.iiiIiIiiIi(), new Object[3 >> 2]);
            iIIIiiiIII iIIIiiiIII4 = this;
            iIIIiiiIII4.info("\u5df2\u914d\u7f6e\u8d26\u6237\u6570\u91cf: " + iIIIiiiIII4.IIiIiIIiii.size(), new Object[3 & 4]);
        }
    }
}

