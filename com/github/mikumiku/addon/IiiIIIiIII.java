/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.misc.AutoReconnect
 *  meteordevelopment.meteorclient.utils.entity.DamageUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Formatting
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Items
 *  net.minecraft.text.Text
 *  net.minecraft.network.packet.s2c.common.DisconnectS2CPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.text.MutableText
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIiIIiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiiIiiiiIi;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.misc.AutoReconnect;
import meteordevelopment.meteorclient.utils.entity.DamageUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Formatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;

public class IiiIIIiIII
extends iIiIiIIIii {
    private final Setting<Integer> iiIIIiIIIi;
    private final Setting<Boolean> iIiiiiIIII;
    private final Setting<Boolean> iiIiIIiiii;
    private final Setting<Boolean> iIIiIiiIiI;
    private final Setting<Boolean> iIIIIIIiII;
    private final Object2IntMap<class_1299<?>> iIIiiIIIIi;
    private final Setting<Boolean> IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final Setting<Boolean> iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<Integer> iIiIIiIIIi;
    private final Setting<Integer> IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<Boolean> iIiIiiiiII;
    private final SettingGroup IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final SettingGroup IIiIiIIiii;
    private final iiiIiiiiIi iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private final Setting<Set<class_1299<?>>> iIiIiIIIII;
    private final Setting<Integer> ALLATORIxDEMO;

    private /* synthetic */ class_5250 ALLATORIxDEMO(class_2561 class_25612) {
        IiiIIIiIII iiiIIIiIII2 = iiiIIIiIII3;
        IiiIIIiIII iiiIIIiIII3 = class_25612;
        IiiIIIiIII iIiIiIIIII2 = iiiIIIiIII2;
        class_5250 class_52502 = class_2561.method_43470((String)IiiiIiiIII.ALLATORIxDEMO("\u81f8\u52c5\u7649\u51b7\u65d7\u5f9a\bG"));
        class_52502.method_10852((class_2561)iiiIIIiIII3);
        if (((Boolean)iIiIiIIIII2.iIiiiIiIii.get()).booleanValue()) {
            iiiIIIiIII3 = ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_24515();
            class_52502.method_10852((class_2561)class_2561.method_43470((String)("\n\u5750\u6807: " + iiiIIIiIII3.method_10263() + ", " + iiiIIIiIII3.method_10264() + ", " + iiiIIIiIII3.method_10260())).method_54663(-4 >> 2));
        }
        if (((Boolean)iIiIiIIIII2.iIIiIiiIiI.get()).booleanValue()) {
            int this_ = ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_31548().method_18861(class_1802.field_8288);
            class_52502.method_10852((class_2561)class_2561.method_43470((String)("\n\u56fe\u817e\u6570\u91cf: " + this_)).method_54663(-4 >> 2));
        }
        if (((Boolean)iIiIiIIIII2.IiiiiIiIiI.get()).booleanValue() && !(this_ = iIiIiIIIII2.ALLATORIxDEMO()).isEmpty()) {
            class_52502.method_10852((class_2561)class_2561.method_43470((String)IiiIIiIIiI.ALLATORIxDEMO("x\u89b3\u919c\u51f0\u73fb\u5bc3h")).method_54663(-4 >> 2));
            Object this_ = this_.iterator();
            Object object = this_;
            while (object.hasNext()) {
                String string = (String)this_.next();
                class_52502.method_10852((class_2561)class_2561.method_43470((String)("\n  " + string)).method_54663(-8355712));
                object = this_;
            }
        }
        return class_52502;
    }

    private /* synthetic */ List<String> ALLATORIxDEMO() {
        IiiIIIiIII iiiIIIiIII2 = iiiIIIiIII3;
        ArrayList<String> arrayList = new ArrayList<String>();
        if (((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1687 == null || ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724 == null) {
            return arrayList;
        }
        for (IiiIIIiIII iiiIIIiIII3 : ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1687.method_18456()) {
            if (iiiIIIiIII3.method_5667() == ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724.method_5667()) continue;
            IiiIIIiIII iiiIIIiIII4 = iiiIIIiIII3;
            double d = Math.sqrt(((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724.method_5858((class_1297)iiiIIIiIII4));
            Object[] objectArray = new Object[--1];
            objectArray[5 >> 3] = d;
            Object[] objectArray2 = new Object[4 ^ 5];
            objectArray2[3 ^ 3] = Float.valueOf(iiiIIIiIII3.method_6032());
            String string = iiiIIIiIII4.method_5477().getString() + " (\u8ddd\u79bb: " + String.format(IiiiIiiIII.ALLATORIxDEMO("\u0017c\u0003+"), objectArray) + "\u683c, \u751f\u547d\u503c: " + String.format(IiiIIiIIiI.ALLATORIxDEMO("P|D4"), objectArray2) + "/" + iiiIIIiIII3.method_6063() + ")";
            if (Friends.get().isFriend((class_1657)iiiIIIiIII3)) {
                string = string + " [\u597d\u53cb]";
            }
            arrayList.add(string);
        }
        return arrayList;
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }

    private /* synthetic */ void iiiIiIiiIi() {
        MeteorClient.EVENT_BUS.subscribe((Object)this.iIIiiIiIiI);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2561 class_25612) {
        String string;
        Iterator<String> iterator;
        IiiIIIiIII iiiIIIiIII2;
        void iIiIiIIIII2;
        IiiIIIiIII iiiIIIiIII3 = iiiIIIiIII2;
        class_5250 class_52502 = class_2561.method_43470((String)IiiIIiIIiI.ALLATORIxDEMO(")\u819f\u52fa\u760e\u51a8(r"));
        class_52502.method_10852((class_2561)iIiIiIIIII2);
        iiiIIIiIII3.ALLATORIxDEMO((class_2561)iIiIiIIIII2);
        if (((Boolean)iiiIIIiIII3.iiiIiiIIII.get()).booleanValue()) {
            iiiIIIiIII3.info(IiiiIiiIII.ALLATORIxDEMO("/P\u000fm\u81d8\u52e5\u7649\u51b7\u8bf4\u7eab\u4fd3\u6022\u0012p\u000fp"), new Object[2 & 5]);
            iiiIIIiIII3.info("\u65ad\u5f00\u539f\u56e0: " + iIiIiIIIII2.getString(), new Object[5 >> 3]);
            if (((Boolean)iiiIIIiIII3.iIiiiIiIii.get()).booleanValue()) {
                IiiIIIiIII iiiIIIiIII4 = iiiIIIiIII3;
                iiiIIIiIII2 = ((class_310)iiiIIIiIII4.iIIiiIiIiI).field_1724.method_24515();
                iiiIIIiIII4.info("\u5750\u6807: X=" + iiiIIIiIII2.method_10263() + ", Y=" + iiiIIIiIII2.method_10264() + ", Z=" + iiiIIIiIII2.method_10260(), new Object[5 >> 3]);
            }
            if (((Boolean)iiiIIIiIII3.iIIiIiiIiI.get()).booleanValue()) {
                IiiIIIiIII iiiIIIiIII5 = iiiIIIiIII3;
                int this_ = ((class_310)iiiIIIiIII5.iIIiiIiIiI).field_1724.method_31548().method_18861(class_1802.field_8288);
                iiiIIIiIII5.info("\u56fe\u817e\u6570\u91cf: " + this_, new Object[5 >> 3]);
            }
            if (((Boolean)iiiIIIiIII3.IiiiiIiIiI.get()).booleanValue()) {
                List<String> this_ = iiiIIIiIII3.ALLATORIxDEMO();
                if (!this_.isEmpty()) {
                    iiiIIIiIII3.info("\u89c6\u91ce\u5185\u73a9\u5bb6 (" + this_.size() + "):", new Object[3 >> 2]);
                    iterator = this_.iterator();
                    Iterator<String> iterator2 = iterator;
                    while (iterator2.hasNext()) {
                        string = iterator.next();
                        iiiIIIiIII3.info("  " + string, new Object[3 >> 2]);
                        iterator2 = iterator;
                    }
                } else {
                    iiiIIIiIII3.info(IiiIIiIIiI.ALLATORIxDEMO("\u8993\u91bc\u51f0\u65b2\u5103\u4e84\u73dc\u5be4"), new Object[3 ^ 3]);
                }
            }
            iiiIIIiIII3.info(IiiiIiiIII.ALLATORIxDEMO("(Wh\u0017\u000fp/P/P\u000fp\u000fp\u000fp/P\u000fp\u000fp\u000fp"), new Object[5 >> 3]);
        }
        if (((Boolean)iiiIIIiIII3.iIIIIIIiII.get()).booleanValue()) {
            class_52502.method_10852((class_2561)class_2561.method_43470((String)IiiIIiIIiI.ALLATORIxDEMO("\u007fXHoHr\u8bb3\u7eb4\u4f94\u603dUoHo")).method_54663(0xFFFFFFD4 & 0xFFFFFF2B));
            if (((Boolean)iiiIIIiIII3.iIiiiIiIii.get()).booleanValue()) {
                iiiIIIiIII2 = ((class_310)iiiIIIiIII3.iIIiiIiIiI).field_1724.method_24515();
                class_52502.method_10852((class_2561)class_2561.method_43470((String)("\n\u5750\u6807: " + iiiIIIiIII2.method_10263() + ", " + iiiIIIiIII2.method_10264() + ", " + iiiIIIiIII2.method_10260())).method_54663(-4 >> 2));
            }
            if (((Boolean)iiiIIIiIII3.iIIiIiiIiI.get()).booleanValue()) {
                int this_ = ((class_310)iiiIIIiIII3.iIIiiIiIiI).field_1724.method_31548().method_18861(class_1802.field_8288);
                class_52502.method_10852((class_2561)class_2561.method_43470((String)("\n\u56fe\u817e\u6570\u91cf: " + this_)).method_54663(-4 >> 2));
            }
            if (((Boolean)iiiIIIiIII3.IiiiiIiIiI.get()).booleanValue()) {
                List<String> this_ = iiiIIIiIII3.ALLATORIxDEMO();
                if (!this_.isEmpty()) {
                    class_52502.method_10852((class_2561)class_2561.method_43470((String)("\n\u89c6\u91ce\u5185\u73a9\u5bb6 (" + this_.size() + "):")).method_54663(-4 >> 2));
                    iterator = this_.iterator();
                    Iterator<String> iterator3 = iterator;
                    while (iterator3.hasNext()) {
                        string = iterator.next();
                        class_52502.method_10852((class_2561)class_2561.method_43470((String)("\n  " + string)).method_54663(-8355712));
                        iterator3 = iterator;
                    }
                } else {
                    class_52502.method_10852((class_2561)class_2561.method_43470((String)IiiiIiiIII.ALLATORIxDEMO("G\u89d4\u91a3\u51b7\u65ad\u5144\u4e9b\u739b\u5bfb")).method_54663(-8355712));
                }
            }
        }
        if ((iiiIIIiIII2 = (AutoReconnect)Modules.get().get(AutoReconnect.class)).isActive()) {
            class_52502.method_10852((class_2561)class_2561.method_43470((String)IiiIIiIIiI.ALLATORIxDEMO("\u007fX\u4f94\u603dU\u007fu\u8198\u52dd\u919f\u8fab\u5da0\u79f4\u757a")).method_54663(-8355712));
            iiiIIIiIII2.toggle();
        }
        ((class_310)iiiIIIiIII3.iIIiiIiIiI).field_1724.field_3944.method_52781(new class_2661((class_2561)class_52502));
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        IiiIIIiIII iiiIIIiIII2 = string2;
        String string2 = string;
        IiiIIIiIII iIiIiIIIII2 = iiiIIIiIII2;
        iIiIiIIIII2.ALLATORIxDEMO((class_2561)class_2561.method_43470((String)string2));
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        MeteorClient.EVENT_BUS.unsubscribe((Object)this.iIIiiIiIiI);
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        IiiIIIiIII iiiIIIiIII2 = iiiIIIiIII3;
        for (IiiIIIiIII iiiIIIiIII3 : ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1687.method_18456()) {
            if (iiiIIIiIII3.method_5667() == ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724.method_5667() || !PlayerUtils.isWithin((class_1297)iiiIIIiIII3, (double)30.0) || Friends.get().isFriend((class_1657)iiiIIIiIII3)) continue;
            return --1 != 0;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        int n;
        float f;
        IiiIIIiIII iiiIIIiIII2 = iiiIIIiIII8;
        float iIiIiIIIII2 = ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724.method_6032();
        if (f <= 0.0f) {
            iiiIIIiIII2.toggle();
            return;
        }
        if (((Boolean)iiiIIIiIII2.iIIiIiiIiI.get()).booleanValue() && (n = ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724.method_31548().method_18861(class_1802.field_8288)) <= (Integer)iiiIIIiIII2.ALLATORIxDEMO.get()) {
            IiiIIIiIII iiiIIIiIII3 = iiiIIIiIII2;
            iiiIIIiIII3.ALLATORIxDEMO("\u56fe\u817e\u6570\u91cf\u4f4e\u4e8e " + String.valueOf(iiiIIIiIII3.ALLATORIxDEMO.get()) + " (\u5f53\u524d: " + n + ")\u3002");
            if (((Boolean)iiiIIIiIII2.iIiiiiIIII.get()).booleanValue()) {
                iiiIIIiIII2.toggle();
            }
            return;
        }
        if (((Boolean)iiiIIIiIII2.iiIiIIiiii.get()).booleanValue() && !iiiIIIiIII2.ALLATORIxDEMO()) {
            return;
        }
        if (iIiIiIIIII2 <= (float)((Integer)iiiIIIiIII2.IIiiIIIIIi.get()).intValue()) {
            IiiIIIiIII iiiIIIiIII4 = iiiIIIiIII2;
            iiiIIIiIII4.ALLATORIxDEMO("\u751f\u547d\u503c\u4f4e\u4e8e " + String.valueOf(iiiIIIiIII4.IIiiIIIIIi.get()) + "\u3002");
            if (((Boolean)iiiIIIiIII2.iiiIiIIiii.get()).booleanValue()) {
                if (iiiIIIiIII2.isActive()) {
                    iiiIIIiIII2.toggle();
                }
                iiiIIIiIII2.iiiIiIiiIi();
                return;
            }
            if (((Boolean)iiiIIIiIII2.iIiiiiIIII.get()).booleanValue()) {
                iiiIIIiIII2.toggle();
            }
            return;
        }
        if (((Boolean)iiiIIIiIII2.iIiIiiiiII.get()).booleanValue() && iIiIiIIIII2 + ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724.method_6067() - PlayerUtils.possibleHealthReductions() < (float)((Integer)iiiIIIiIII2.IIiiIIIIIi.get()).intValue()) {
            IiiIIIiIII iiiIIIiIII5 = iiiIIIiIII2;
            iiiIIIiIII5.ALLATORIxDEMO("\u751f\u547d\u503c\u5373\u5c06\u4f4e\u4e8e " + String.valueOf(iiiIIIiIII5.IIiiIIIIIi.get()) + "\u3002");
            if (((Boolean)iiiIIIiIII2.iIiiiiIIII.get()).booleanValue()) {
                iiiIIIiIII2.toggle();
            }
            return;
        }
        if (!((Boolean)iiiIIIiIII2.iIIiIiiiIi.get()).booleanValue() && !((Boolean)iiiIIIiIII2.iIIIiiiiIi.get()).booleanValue() && ((Set)iiiIIIiIII2.iIiIiIIIII.get()).isEmpty()) {
            return;
        }
        for (Object object : ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1687.method_18112()) {
            if (!(object instanceof class_1657) || (iiiIIIiIII8 = (class_1657)object).method_5667() == ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724.method_5667()) continue;
            if (((Boolean)iiiIIIiIII2.iIIiIiiiIi.get()).booleanValue() && iiiIIIiIII8 != ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724 && !Friends.get().isFriend((class_1657)iiiIIIiIII8)) {
                iiiIIIiIII2.ALLATORIxDEMO((class_2561)class_2561.method_43470((String)("\u4e0d\u53d7\u4fe1\u4efb\u7684\u73a9\u5bb6 '" + String.valueOf(class_124.field_1061) + iiiIIIiIII8.method_5477().getString() + String.valueOf(class_124.field_1068) + "' \u51fa\u73b0\u5728\u6e32\u67d3\u8ddd\u79bb\u5185\u3002")));
                if (((Boolean)iiiIIIiIII2.iIiiiiIIII.get()).booleanValue()) {
                    iiiIIIiIII2.toggle();
                }
                return;
            }
            if (!((Boolean)iiiIIIiIII2.iIIIiiiiIi.get()).booleanValue() || !PlayerUtils.isWithin((class_1297)object, (double)8.0) || !(DamageUtils.getAttackDamage((class_1309)iiiIIIiIII8, (class_1297)((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724) > iIiIiIIIII2 + ((class_310)iiiIIIiIII2.iIIiiIiIiI).field_1724.method_6067())) continue;
            IiiIIIiIII iiiIIIiIII6 = iiiIIIiIII2;
            iiiIIIiIII6.ALLATORIxDEMO(IiiIIiIIiI.ALLATORIxDEMO("\u6892\u6d3e\u5262f@>\u6b34\u561d\u5a53\u80b4\u3050"));
            if (((Boolean)iiiIIIiIII6.iIiiiiIIII.get()).booleanValue()) {
                iiiIIIiIII2.toggle();
            }
            return;
        }
        if (!((Set)iiiIIIiIII2.iIiIiIIIII.get()).isEmpty()) {
            int n2 = 3 >> 2;
            IiiIIIiIII iiiIIIiIII7 = iiiIIIiIII2;
            iiiIIIiIII7.iIIiiIIIIi.clear();
            for (IiiIIIiIII iiiIIIiIII8 : ((class_310)iiiIIIiIII7.iIIiiIiIiI).field_1687.method_18112()) {
                if (!PlayerUtils.isWithin((class_1297)iiiIIIiIII8, (double)((Integer)iiiIIIiIII2.IIiIiiiiII.get()).intValue()) || !((Set)iiiIIIiIII2.iIiIiIIIII.get()).contains(iiiIIIiIII8.method_5864())) continue;
                ++n2;
                if (((Boolean)iiiIIIiIII2.IiiIiIiiIi.get()).booleanValue()) continue;
                iiiIIIiIII2.iIIiiIIIIi.put((Object)iiiIIIiIII8.method_5864(), iiiIIIiIII2.iIIiiIIIIi.getOrDefault((Object)iiiIIIiIII8.method_5864(), 3 ^ 3) + (5 >> 2));
            }
            if (((Boolean)iiiIIIiIII2.IiiIiIiiIi.get()).booleanValue() && n2 >= (Integer)iiiIIIiIII2.iiIIIiIIIi.get()) {
                IiiIIIiIII iiiIIIiIII9 = iiiIIIiIII2;
                iiiIIIiIII9.ALLATORIxDEMO(IiiiIiiIII.ALLATORIxDEMO("\u8331\u56b9\u51b7\u9044\u5ba8\u5bd3\u4f41\u6056\u6542\u8dc8\u8ff5\u961d\u5204\u304f"));
                if (((Boolean)iiiIIIiIII9.iIiiiiIIII.get()).booleanValue()) {
                    iiiIIIiIII2.toggle();
                    return;
                }
            } else if (!((Boolean)iiiIIIiIII2.IiiIiIiiIi.get()).booleanValue()) {
                for (IiiIIIiIII iiiIIIiIII8 : iiiIIIiIII2.iIIiiIIIIi.object2IntEntrySet()) {
                    if (iiiIIIiIII8.getIntValue() < (Integer)iiiIIIiIII2.iIiIIiIIIi.get()) continue;
                    iiiIIIiIII2.ALLATORIxDEMO("\u8303\u56f4\u5185 " + ((class_1299)iiiIIIiIII8.getKey()).method_5897().getString() + " \u6570\u91cf\u8d85\u8fc7\u9650\u5236\u3002");
                    if (((Boolean)iiiIIIiIII2.iIiiiiIIII.get()).booleanValue()) {
                        iiiIIIiIII2.toggle();
                    }
                    return;
                }
            }
        }
    }

    public IiiIIIiIII() {
        IiiIIIiIII iiiIIIiIII2 = this;
        super(iIiIiIIIii.iIIiIiiiIi, IiiiIiiIII.ALLATORIxDEMO("\u6637\u80cf\u0001]*"), IiiIIiIIiI.ALLATORIxDEMO("\u5f66\u6ebc\u8dc9\u7221\u5be5\u6739\u4e89\u65a5\u819e\u52fa\u65d8\u5f12\u8feb\u63d0\u30509\u001d2\u753e\u9717\u62f7\u543f\u8994\u91bb\u51d7\u73fc\u5bc4\u54f9>\u001a5\u5725\u6855"));
        iiiIIIiIII2.iiiiiIIiIi = iiiIIIiIII2.settings.getDefaultGroup();
        iiiIIIiIII2.IIIIiiIiii = iiiIIIiIII2.settings.createGroup(IiiiIiiIII.ALLATORIxDEMO("\u5bac\u4f1e\u8b8c\u7f23"));
        iiiIIIiIII2.IIiIiIIiii = iiiIIIiIII2.settings.createGroup(IiiIIiIIiI.ALLATORIxDEMO("\u6590\u5f85\u8bcb\u7f3c"));
        iiiIIIiIII2.IIiiIIIIIi = iiiIIIiIII2.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u7552\u544f\u5071\u963a\u5071"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u5f2c\u7547\u5402\u506f\u4f3a\u4edc\u6263\u7b5b\u4ebb\u6b11\u506e\u65a3\u8198\u52fd\u65df\u5f75\u8f8c\u63d0\u3050\u8bcb\u7f3c\u4e6fB\u79f4\u757a\u6b11\u52cd\u8088\u3050"))).defaultValue((Object)(0x2E & 0x57))).range(3 >> 2, 0x13 & 0x7F).sliderMax(0x7B & 0x17).build());
        this.iIiIiiiiII = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u6648\u80b0\u98b6\u6d06"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u68bf\u6d18\u5244\u5321\u5c73\u53c5\u5205\u8dc6\u594d\u4f71\u5bc1\u4f2a\u756d\u5408\u506e\u4f3b\u4edc\u8bcb\u5bc8\u965d\u504e\u6583\u65ff\u5f75\u8f8c\u63d0\u3050"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIiIiiiIi = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u4e88\u4fd3\u4eb6\u739b\u5bfb"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u5f27\u4e5f\u575d\u596f\u53fe\u5262\u883a\u4e78\u76f6\u73fc\u5bc4\u518f\u73e2\u575d\u6e60\u67a6\u8d8f\u79ee\u51f7\u6583\u65ff\u5f75\u8f8c\u63d0\u3050"))).defaultValue((Object)(3 >> 2))).build());
        this.iIIIiiiiIi = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u9600~\u0000\u0006\u6b54\u5625"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u5f06\u9636\u8f84\u73db\u5bc3\u80af\u596a\u77fe\u9581\u6712\u6b2e\u4f12\u6583\u65ff\u5f75\u8f8c\u63d0\u3050"))).defaultValue((Object)(3 >> 2))).build());
        this.iiiIiIIiii = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u6648\u80b0\u5235\u632f"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u4f5c\u8875\u91ba\u65ff\u7eea\u547c\u79d4\u755a\u819f\u52fa\u760e\u51a8\u3077\u6ce9\u75c2\u547c\u4f6f\u919f\u65c5\u547d\u755d\u3050"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIiiiiIIII = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u4f32\u751a\u5443\u5141\u95a0"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u4f0a\u757a\u547b\u79d3\u757d\u8198\u52dd\u7629\u518f\u6a73\u5722\u3050"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiIiIIiiii = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u4ed7\u5f3e\u673b\u73e4\u5b84\u65bb\u659f\u5f4d"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u53b2\u6776\u5f0b\u963b\u8f82Gb\u6849\u5197\u673c\u972b\u592f\u539e\u73db\u5be3\u6584\uff79\u5124\u4ea3\u65ff\u5f75\u8f8c\u63f0\u52ed\u8088\u621f\u4f6f\u754d\u653d\u3050"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIiIiiIiI = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u56cc\u8133\u68f2\u67a8"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u545b\u757a\u568b\u816c\u6545\u91ba\u6892\u67b0\uff7e\u5f06\u568c\u810b\u6522\u91ba\u4f1c\u4efb\u8bec\u5bcf\u504e\u6583\u65ff\u5f75\u8f8c\u63d0\u3050"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.ALLATORIxDEMO = this.iiiiiIIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u6732\u5c5c\u56cc\u8133\u6542\u9182"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u5f21\u568b\u812c\u6505\u919d\u4f3b\u4edc\u6b31\u504e\u6583\u65ff\u5f75\u8f8c\u63d0\u3050"))).defaultValue((Object)(--3))).range(3 >> 2, 0x6F & 0x35).sliderRange(5 >> 3, 0x2D & 0x77).visible(() -> (Boolean)this.iIIiIiiIiI.get())).build());
        class_1299[] class_1299Array = new class_1299[5 >> 2];
        class_1299Array[2 & 5] = class_1299.field_6110;
        this.iIiIiIIIII = this.IIIIiiIiii.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u76e3\u63ea\u5bac\u4f1e"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u5f01\u6352\u5be8\u5bcb\u4f21\u518f\u73e2\u575d\u6355\u5bef\u8351\u56a1\u51f7\u6583\u65ff\u5f75\u8f8c\u63d0\u3050"))).defaultValue(class_1299Array).build());
        this.IiiIiIiiIi = this.IIIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u4f4d\u7565\u6009\u653d\u8b93\u7bda"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u577b\u8bd5\u7bc5\u6235\u671b\u903c\u5bef\u5bcc\u4f06\u76f6\u606e\u6502\u6263\u5307\u7299\u8bf3\u7be2\u6b9d\u7998\u5bec\u4f26\u4e19\u9581\u5255\u6317\u3050"))).defaultValue((Object)((3 & 5) != 0))).visible(() -> {
            if (!((Set)this.iIiIiIIIII.get()).isEmpty()) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iiIIIiIIIi = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u6009\u653d\u963a\u5071"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u8993\u5383\u65f8\u5f72\u8f8b\u63d7\u5238\uff5e\u9631\u8f83\u907c\u5bc8\u5bcb\u4f21\u76f1\u6752\u5c7a\u6069\u6505\u3050"))).defaultValue((Object)(0x2B & 0x5E))).min(--1).sliderMax(0x37 & 0x68).visible(() -> {
            if (((Boolean)this.IiiIiIiiIi.get()).booleanValue() && !((Set)this.iIiIiIIIII.get()).isEmpty()) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iIiIIiIIIi = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u5367\u4e67\u5bac\u4f1e\u963a\u5071"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u89f4\u53e4\u65d8\u5f52\u8f8b\u63d7\u5218\uff7e\u5320\u4e78\u5beb\u4f01\u7c0e\u57d9\u9611\u8fa3\u76f1\u6752\u5c7a\u6522\u91ba\u3050"))).defaultValue((Object)(1 ^ 3))).min(--1).sliderMax(0x78 & 0x17).visible(() -> {
            if (!((Boolean)this.IiiIiIiiIi.get()).booleanValue() && !((Set)this.iIiIiIIIII.get()).isEmpty()) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.IIiIiiiiII = this.IIIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u68f2\u6d06\u8331\u56b9"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u5bec\u4f26\u8d8f\u79ce\u4f32\u596f\u8f83\u65a3\u8994\u53a4\u65ff\u5f75\u8f8c\u63d0\u3050"))).defaultValue((Object)(--5))).min(--1).sliderMax(0x5D & 0x32).visible(() -> {
            if (!((Set)this.iIiIiIIIII.get()).isEmpty()) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iIIIIIIiII = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u8b82\u5f18\u659f\u5f4d\u53ad\u56ad"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u8be2\u5f20\u65ff\u5f55\u8fac\u63d0\u76d6\u8b93\u7e94\u53ea\u56b2"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IiiiiIiIiI = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u8bdd\u5f67\u898b\u91fc\u51c8\u739b\u5bfb"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u65df\u5f75\u8f8c\u63d0\u65a4\u62d0\u5418\u8993\u91bc\u51f0\u76d6\u6235\u675b\u73dc\u5be4"))).defaultValue((Object)(3 >> 1))).build());
        this.iIiiiIiIii = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u8b82\u5f18\u5762\u684a"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u65ff\u5f75\u8f8c\u63f0\u6584\u8bc5\u5f07\u5f26\u521f\u5725\u6855"))).defaultValue((Object)(3 >> 1))).build());
        this.iiiIiiIIII = this.IIiIiIIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u8078\u5964\u660c\u7977\u65d7\u5f9a"))).description(IiiIIiIIiI.ALLATORIxDEMO("\u665d\u5473\u575a\u803f\u597b\u4e58\u666c\u794f\u8bb4\u7e93\u76f6\u65d8\u5f52\u8fab\u63f7\u4f94\u603d"))).defaultValue((Object)(5 >> 2))).build());
        IiiIIIiIII iiiIIIiIII3 = this;
        iiiIIIiIII3.iIIiiIIIIi = new Object2IntOpenHashMap();
        IiiIIIiIII iiiIIIiIII4 = this;
        iiiIIIiIII3.iIIiiIiIiI = new iiiIiiiiIi(this);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiiIiiIII.ALLATORIxDEMO("E\u00060KA(2\u0018b\tS9Wl\u0012\u8bba\u66e6\u65dd\u5202\u674d\u6582\u7205\u671e\uff4c"));
        }
    }
}

