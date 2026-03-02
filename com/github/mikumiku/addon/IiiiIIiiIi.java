/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2199
 *  net.minecraft.class_2338
 *  net.minecraft.class_2596
 *  net.minecraft.class_2645
 *  net.minecraft.class_2649
 *  net.minecraft.class_2855
 *  net.minecraft.class_2885
 *  net.minecraft.class_310
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIiIii;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIiiiIiii;
import com.github.mikumiku.addon.mixinface.IClientPlayerInteractionManager;
import com.github.mikumiku.addon.nerv_printer.modules.MapNamer;
import java.util.ArrayList;
import java.util.Date;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2199;
import net.minecraft.class_2338;
import net.minecraft.class_2596;
import net.minecraft.class_2645;
import net.minecraft.class_2649;
import net.minecraft.class_2855;
import net.minecraft.class_2885;
import net.minecraft.class_310;

public class IiiiIIiiIi
extends iIiIiIIIii {
    private final Setting<Integer> iiiIiiIIII;
    public int iIiIIiIIIi;
    private final Setting<Integer> IIiIiiiiII;
    private final Setting<Integer> IIiiIIIIIi;
    public int iIiiiIiIii;
    public final Setting<String> iIiIiiiiII;
    public final Setting<String> IIIIiiIiii;
    private final Setting<Integer> IiiIiIiiIi;
    private final Setting<MapNamer.Order> IIiIiIIiii;
    public ArrayList<Integer> iIIiiIiIiI;
    public int iiiiiIIiIi;
    public MapNamer.State iIIiIiiiIi;
    private final Setting<Integer> iIiIiIIIII;
    private final SettingGroup ALLATORIxDEMO;

    public IiiiIIiiIi() {
        IiiiIIiiIi iiiiIIiiIi = this;
        super(iIiIiIIIii.ALLATORIxDEMO, iiIiiiIiii.ALLATORIxDEMO("\u5729\u56ab\u5444\u5478\u5671"), IIIIiIiIii.ALLATORIxDEMO("\u4f40\u7569\u6807\u5f4a\u81d3\u52ef\u545a\u5454\u7256\u5480\u6834\u4e68\u76bd\u5777\u56d9c\u574c\u56fc\u543e\u79bd\u0016c\u0016\u0010\u001dh\u001c\u5244\u96e8\u7b24;N\u001b\u001c\u3039\u57bf\u4eb5eu\u0000i\u0013d5I,u\u0011^7"));
        iiiiIIiiIi.ALLATORIxDEMO = iiiiIIiiIi.settings.getDefaultGroup();
        iiiiIIiiIi.IIiiIIIIIi = iiiiIIiiIi.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u8d6e\u599ea\u5725\u681e"))).description(IIIIiIiIii.ALLATORIxDEMO("\u5775\u56c5\u67df\u4e25\u5ef1\u8bfe\u4eab\u54d1\u4e6fc\u7d67\u5f0e\u5f65\u59f0\u3047"))).defaultValue((Object)(2 & 5))).min(3 & 4).sliderRange(3 >> 2, 0x5F & 0x2A).build());
        this.iIiIiIIIII = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u7eca\u670aa\u5725\u681e"))).description(IIIIiIiIii.ALLATORIxDEMO("\u570b\u56bb\u76bf\u6745\u593c=\u5007\u3047"))).defaultValue((Object)(2 & 5))).min(3 ^ 3).sliderRange(2 & 5, 0x3F & 0x4A).build());
        this.iiiIiiIIII = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u8d6e\u599e`\u5725\u681e"))).description(IIIIiIiIii.ALLATORIxDEMO("\u5775\u56c5\u67df\u4e25\u5ef1\u8bfe\u4eab\u54d1\u4e6fb\u7d67\u5f0e\u5f65\u59f0\u3047"))).defaultValue((Object)(3 ^ 3))).min(2 & 5).sliderRange(3 >> 2, 0x1E & 0x6B).build());
        this.IIiIiiiiII = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u7eca\u670a`\u5725\u681e"))).description(IIIIiIiIii.ALLATORIxDEMO("\u570b\u56bb\u76bf\u6745\u593c<\u5007\u3047"))).defaultValue((Object)(3 ^ 3))).min(3 ^ 3).sliderRange(3 >> 2, 0x1F & 0x6A).build());
        this.iIiIiiiiII = this.ALLATORIxDEMO.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u5765\u56c7\u5478\u79e9"))).description(IIIIiIiIii.ALLATORIxDEMO("\u572b\u569b\u7252\u5484\u76bf\u5448\u79eb\u5228\u7f3b\u3047"))).defaultValue((Object)iiIiiiIiii.ALLATORIxDEMO("\u5709\u568bF"))).wide().renderer(StarscriptTextBoxRenderer.class).build());
        this.IIIIiiIiii = this.ALLATORIxDEMO.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIIIiIiIii.ALLATORIxDEMO("\u5263\u96af\u7b63"))).description(iiIiiiIiii.ALLATORIxDEMO("\r\u54b5\f\u7d1b\u5f60\u4e52\u9581\u769d\u5253\u96ad\u7b53\u301b"))).defaultValue((Object)IIIIiIiIii.ALLATORIxDEMO("\u001a"))).wide().renderer(StarscriptTextBoxRenderer.class).build());
        this.IiiIiIiiIi = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u91d4\u5428\u5434\u5e83\u8fc6"))).description(IIIIiIiIii.ALLATORIxDEMO("\u570b\u56bb\u91f6\u5438\u5416\u4e2e\u95ef\u76e1\u5ecd\u8f9a\u65cd\u95b13\u525e\u0012\u3047"))).defaultValue((Object)(0xA & 0x7F))).min(2 ^ 3).sliderRange(2 ^ 3, 0x5F & 0x34).build());
        this.IIiIiIIiii = this.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiiIiii.ALLATORIxDEMO("\u5428\u5434\u980f\u5e96"))).description(IIIIiIiIii.ALLATORIxDEMO("\u5773\u56c2\u543f\u5471\u7686\u9861\u5eea\u3039\u69b8\u4f76e\u0006e\u5ff0\u6312\u6814N\u7252\u5484\u6834\u4e8b\u5dfd\u5255\u53c8\u3047"))).defaultValue((Object)MapNamer.Order.iIiIiIIIII)).build());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIiiiIiii.ALLATORIxDEMO("\"rW?&\\Ul\u0005}\u0014m0\u0018u\u8bce\u6681\u65a9\u5245\u6719\u65e5\u7271\u6759\uff18"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiiiIIiiIi iiiiIIiiIi = iiiiIIiiIi2;
        IiiiIIiiIi iiiiIIiiIi2 = pre;
        IiiiIIiiIi iIiIiIIIII2 = iiiiIIiiIi;
        if (iIiIiIIIII2.iiiiiIIiIi == 0 || iIiIiIIIII2.iIIiIiiiIi != MapNamer.State.ALLATORIxDEMO) {
            return;
        }
        IiiiIIiiIi iiiiIIiiIi3 = iIiIiIIIII2;
        iiiiIIiiIi3.iiiiiIIiIi -= 2 ^ 3;
        if (iiiiIIiiIi3.iiiiiIIiIi == 0 && !iIiIiIIIII2.iIIiiIiIiI.isEmpty()) {
            if (((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.field_7520 < 5 >> 2) {
                iIiIiIIIII2.info(iiIiiiIiii.ALLATORIxDEMO(";v!\u00190W\u001al\u0012qua%7"), new Object[3 ^ 3]);
                iIiIiIIIII2.iIIiIiiiIi = MapNamer.State.iIIiIiiiIi;
                if (((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1755 != null) {
                    ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_7346();
                }
                return;
            }
            int this22 = iIiIiIIIII2.iIIiiIiIiI.remove(3 & 4);
            if (iIiIiIIIII2.iIiIIiIIIi == -4 >> 2) {
                iIiIiIIIII2.iIiIIiIIIi = (Integer)iIiIiIIIII2.IIiiIIIIIi.get();
            }
            if (iIiIiIIIII2.iIiiiIiIii == -4 >> 2) {
                iIiIiIIIII2.iIiiiIiIii = (Integer)iIiIiIIIII2.iiiIiiIIII.get();
            }
            IClientPlayerInteractionManager iClientPlayerInteractionManager = (IClientPlayerInteractionManager)((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1761;
            IiiiIIiiIi iiiiIIiiIi4 = iIiIiIIIII2;
            iClientPlayerInteractionManager.method_2906(((class_310)iiiiIIiiIi4.iIIiiIiIiI).field_1724.field_7512.field_7763, this22, 5 >> 2, class_1713.field_7794, (class_1657)((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724);
            IiiiIIiiIi iiiiIIiiIi5 = iIiIiIIIII2;
            String this22 = (String)iiiiIIiiIi4.iIiIiiiiII.get() + iiiiIIiiIi5.iIiIIiIIIi + String.valueOf(iiiiIIiiIi5.IIIIiiIiii) + iIiIiIIIII2.iIiiiIiIii;
            IiiiIIiiIi iiiiIIiiIi6 = iIiIiIIIII2;
            iIiIiIIIII2.iIIiiIiIiI.method_1562().method_52787((class_2596)new class_2855(this22));
            iClientPlayerInteractionManager.method_2906(((class_310)iiiiIIiiIi6.iIIiiIiIiI).field_1724.field_7512.field_7763, --2, 3 & 5, class_1713.field_7794, (class_1657)((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724);
            iiiiIIiiIi6.iIiiiIiIii += 3 >> 1;
            if (iiiiIIiiIi6.iIiiiIiIii > (Integer)iIiIiIIIII2.IIiIiiiiII.get()) {
                IiiiIIiiIi iiiiIIiiIi7 = iIiIiIIIII2;
                iiiiIIiiIi7.iIiiiIiIii = 2 & 5;
                iiiiIIiiIi7.iIiIIiIIIi += --1;
                if (iiiiIIiiIi7.iIiIIiIIIi > (Integer)iIiIiIIIII2.iIiIiIIIII.get()) {
                    IiiiIIiiIi iiiiIIiiIi8;
                    IiiiIIiiIi iiiiIIiiIi9 = iIiIiIIIII2;
                    if (iIiIiIIIII2.iIIiiIiIiI.isEmpty()) {
                        iiiiIIiiIi9.info(IIIIiIiIii.ALLATORIxDEMO("d6\u0011r_(B-\u0016%\\3\u001c5\u001dq;\u0016N&X H6}\u0010w\tBeU$v\u0000_k"), new Object[3 ^ 3]);
                        IiiiIIiiIi iiiiIIiiIi10 = iIiIiIIIII2;
                        iIiIiIIIII2.IIiiIIIIIi.set((Object)(5 >> 3));
                        iiiiIIiiIi8 = iiiiIIiiIi10;
                        iiiiIIiiIi10.iiiIiiIIII.set((Object)(3 >> 2));
                    } else {
                        iiiiIIiiIi9.info(iiIiiiIiii.ALLATORIxDEMO("<r\u0007|Wv\bu\u0002=\u0013v\u0002u\r%F6\u001c\u007fXc\u0011`\u001b?\u0017pV\u0006uX\u001b}U|\u001b}\f\u00191\\\u0006z\u0007p7\\\u00117"), new Object[3 >> 2]);
                        iiiiIIiiIi8 = iIiIiIIIII2;
                    }
                    if (((class_310)iiiiIIiiIi8.iIIiiIiIiI).field_1755 != null) {
                        ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_7346();
                    }
                    iIiIiIIIII2.toggle();
                    return;
                }
            }
            if (iIiIiIIIII2.iIIiiIiIiI.isEmpty()) {
                IiiiIIiiIi iiiiIIiiIi11 = iIiIiIIIII2;
                IiiiIIiiIi iiiiIIiiIi12 = iIiIiIIIII2;
                iiiiIIiiIi11.IIiiIIIIIi.set((Object)iiiiIIiiIi12.iIiIIiIIIi);
                IiiiIIiiIi iiiiIIiiIi13 = iIiIiIIIII2;
                iiiiIIiiIi13.iiiIiiIIII.set((Object)iiiiIIiiIi13.iIiiiIiIii);
                iIiIiIIIII2.iIIiIiiiIi = MapNamer.State.iIIiIiiiIi;
                iiiiIIiiIi12.info("All maps in inventory named. Progress (x: " + iiiiIIiiIi11.iIiIIiIIIi + ", y: " + iIiIiIIIII2.iIiiiIiIii + ") saved. Interact with an anvil with the next batch in the inventory.", new Object[3 ^ 3]);
                if (((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1755 != null) {
                    ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_7346();
                    return;
                }
            } else {
                iIiIiIIIII2.iiiiiIIiIi = (Integer)iIiIiIIIII2.IiiIiIiiIi.get();
            }
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Send send) {
        IiiiIIiiIi iiiiIIiiIi = iiiiIIiiIi2;
        IiiiIIiiIi iiiiIIiiIi2 = send;
        IiiiIIiiIi iIiIiIIIII2 = iiiiIIiiIi;
        if (iIiIiIIIII2.iIIiIiiiIi == MapNamer.State.iIIiIiiiIi && (iiiiIIiiIi2 = ((PacketEvent.Send)iiiiIIiiIi2).packet) instanceof class_2885 && ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1687.method_8320((class_2338)(iiiiIIiiIi2 = ((class_2885)iiiiIIiiIi2).method_12543().method_17777())).method_26204() instanceof class_2199) {
            iIiIiIIIII2.iIIiIiiiIi = MapNamer.State.iiiiiIIiIi;
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        int n;
        IiiiIIiiIi iiiiIIiiIi = iiiiIIiiIi2;
        IiiiIIiiIi iiiiIIiiIi2 = receive;
        IiiiIIiiIi iIiIiIIIII2 = iiiiIIiiIi;
        if (iIiIiIIIII2.iIIiIiiiIi == MapNamer.State.ALLATORIxDEMO && ((PacketEvent.Receive)iiiiIIiiIi2).packet instanceof class_2645) {
            iIiIiIIIII2.info(IIIIiIiIii.ALLATORIxDEMO("r+O\"I-P3BeJ$U<\u0019l\u0013.Z'E-Ym\u001c\u000b\u0012v~\u0017Z&OeL,o\r;\u0004UeZ+m\fWk"), new Object[5 >> 3]);
            iIiIiIIIII2.iIIiIiiiIi = MapNamer.State.iIIiIiiiIi;
            return;
        }
        if (iIiIiIIIII2.iIIiIiiiIi != MapNamer.State.iiiiiIIiIi) {
            return;
        }
        class_2596 class_25962 = ((PacketEvent.Receive)iiiiIIiiIi2).packet;
        if (class_25962 instanceof class_2855) {
            if (!((class_2855)class_25962).method_12407().startsWith((String)iIiIiIIIII2.iIiIiiiiII.get())) {
                iiiiIIiiIi2.cancel();
            }
        }
        if (!((class_25962 = ((PacketEvent.Receive)iiiiIIiiIi2).packet) instanceof class_2649)) {
            return;
        }
        class_2649 cfr_ignored_0 = (class_2649)class_25962;
        if ((Integer)iIiIiIIIII2.IIiiIIIIIi.get() > (Integer)iIiIiIIIII2.iIiIiIIIII.get() || (Integer)iIiIiIIIII2.iiiIiiIIII.get() > (Integer)iIiIiIIIII2.IIiIiiiiII.get()) {
            iIiIiIIIII2.warning(iiIiiiIiii.ALLATORIxDEMO("H\u001dd@*]x\u0016p\u001dlSv\u0001>^?'^\u0010kUm\u001dx;\u00190W\u00119\u001cw1\\\r7"), new Object[3 ^ 3]);
            return;
        }
        iIiIiIIIII2.iIIiiIiIiI.clear();
        int n2 = n = 5 >> 3;
        while (n2 < ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_31548().method_5439()) {
            class_1799 class_17992;
            int this_ = n;
            if (iIiIiIIIII2.IIiIiIIiii.get() == MapNamer.Order.iIIiIiiiIi) {
                this_ = ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_31548().method_5439() - n - (2 ^ 3);
            }
            if ((class_17992 = ((class_310)iIiIiIIIII2.iIIiiIiIiI).field_1724.method_31548().method_5438(this_)).method_7909() == class_1802.field_8204 && class_17992.method_7964().getString().equals(IIIIiIiIii.ALLATORIxDEMO("(Z5"))) {
                IiiiIIiiIi iiiiIIiiIi3;
                if (this_ < (0x5B & 0x2D)) {
                    iiiiIIiiIi3 = iIiIiIIIII2;
                    this_ += 30;
                } else {
                    this_ -= 6;
                    iiiiIIiiIi3 = iIiIiIIIII2;
                }
                iiiiIIiiIi3.iIIiiIiIiI.add(this_);
            }
            n2 = ++n;
        }
        iIiIiIIIII2.iiiiiIIiIi = (Integer)iIiIiIIIII2.IiiIiIiiIi.get();
        iIiIiIIIII2.iIIiIiiiIi = MapNamer.State.ALLATORIxDEMO;
    }

    @Override
    public void onActivate() {
        IiiiIIiiIi iiiiIIiiIi = this;
        IiiiIIiiIi iiiiIIiiIi2 = this;
        IiiiIIiiIi iiiiIIiiIi3 = this;
        iiiiIIiiIi2.iIIiiIiIiI = new ArrayList();
        iiiiIIiiIi2.iIIiIiiiIi = MapNamer.State.iIIiIiiiIi;
        iiiiIIiiIi2.iiiiiIIiIi = 2 & 5;
        iiiiIIiiIi.iIiIIiIIIi = -4 >> 2;
        iiiiIIiiIi.iIiiiIiIii = -4 >> 2;
    }
}

