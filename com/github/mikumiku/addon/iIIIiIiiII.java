/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.renderer.Fonts
 *  meteordevelopment.meteorclient.renderer.text.FontInfo$Type
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.systems.config.Config
 *  meteordevelopment.orbit.EventHandler
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIIIiiiI;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.Fonts;
import meteordevelopment.meteorclient.renderer.text.FontInfo;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.systems.config.Config;
import meteordevelopment.orbit.EventHandler;

public class iIIIiIiiII
extends iIiIiIIIii {
    private final Setting<Boolean> iIIIiiiiIi;
    private final Setting<Boolean> iiiIiiIIII;
    private final SettingGroup iIiIIiIIIi;
    private final SettingGroup IIiIiiiiII;
    private final SettingGroup IIiiIIIIIi;
    private boolean iIiiiIiIii;
    private final Setting<Boolean> iIiIiiiiII;
    private final Setting<String> IIIIiiIiii;
    private final Setting<Boolean> IiiIiIiiIi;
    private final Setting<String> IIiIiIIiii;
    private final Setting<Boolean> iIIiiIiIiI;
    private final SettingGroup iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private int iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ void IIIIiIIIII() {
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        try {
            IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u6b5d\u5775\u5c03\u8ba8\u8b80\u7f13\u4e13\u65fa\u5b69\u4f2e\u0010S\u0010"));
            try {
                Config config = Config.get();
                config.customFont.set((Object)(--1 != 0));
                iIIIiIiiII iIIIiIiiII3 = Fonts.getFamily((String)IiiiIiiIII.ALLATORIxDEMO("V\b|\nJ$S#"));
                if (iIIIiIiiII3 != null && (iIIIiIiiII3 = iIIIiIiiII3.get(FontInfo.Type.Regular)) != null) {
                    config.font.set((Object)iIIIiIiiII3);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u8b8a\u6275\u52d5\u8b80\u7f13\u5b69\u4f2e\uff24"));
            IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u0003c\u0012\u70f4\u51e9\u981b\u90da\u76c9Q\u0002|\u000b[*\u633b\u94e3"));
            IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO(",S\u001e\u6203\u520e;Q\u0013J\u8bc3\u7f50"));
            IiIiIIiiii.iiIIiIIiii("3. \u9009\u62e9" + (String)iIIIiIiiII2.IIIIiiIiii.get() + "\u5b57\u4f53");
            IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("Y<M\u4fef\u5b15\u8b8c\u7f23"));
            return;
        }
        catch (Exception exception) {
            iIIIiIiiII2.warning(iiIIIIiiiI.ALLATORIxDEMO("\u81d4\u52d5\u8b80\u7f33\u5b49\u4f2e\u590f\u8d58\uff32\u8b8a\u6275\u52d5\u8b80\u7f13\u303c"), new Object[3 & 4]);
            return;
        }
    }

    private /* synthetic */ void IIIIiIiiii() {
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u000fp/M\u5b65\u4f1e\u8bac\u7f03\u654b\u7a66\u0012p\u000fp"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u4e04\u4efb\u6b5d\u7813\u6600\u7967\u4e33\u65fa\uff32\u8baa\u8ba0\u7f33\u4e33\u65da\u5b49\u4f0e\uff04"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("[{\n\u70ab\u5196\u6e0a\u6242\u757e\u972f\u53c1\u4e47\u89c0\u76e9\u0015\u000e}\u0003t\u0004Uj\u633b\u94e3"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\fS\u001e\u5755\u8b80\u7f33\u4e33\u6203\u520ezX2p)9\u9054\u9867"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("'E5\u9063\u62bc\r\u7b5b\u7ed2\u001a\tW#U5{\f\\d5\u627b\u5164\u4ebb\u4e1f\u65ca\u5b65\u4f1e"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("I\u0010}\u70a7\u5186\u4fe3\u5b05\u5e68\u9190\u65ae\u5472\u52b6\u6e65\u6211"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u63e2\u7977\uff28\u4e60\u65b5\u5b1a\u4f41\u8090\u785c\u4f90\u755e\u970f\u6595\u5b3a\u6b51\u7823\u660c\u7977"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u0003@\u0003@\u0003@\u0003`#@\u0003`#`#`#`#"));
    }

    @Override
    public void onActivate() {
        super.onActivate();
        this.iIiIiIIIII = 5 >> 3;
        this.iIiiiIiIii = 2 ^ 3;
        if (((Boolean)this.iIIiIiiiIi.get()).booleanValue()) {
            this.IIIIIIIiII();
        }
        if (((Boolean)this.iIIIiiiiIi.get()).booleanValue()) {
            this.IIIIiIIIII();
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII3 = post;
        iIIIiIiiII iIiIiIIIII2 = iIIIiIiiII2;
        if (!iIiIiIIIII2.iIiiiIiIii) {
            return;
        }
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724.field_6012 % (0x7F & 0x14) == 0 && iIiIiIIIII2.iIiIiIIIII < iIiIiIIIII2.ALLATORIxDEMO()) {
            iIIIiIiiII iIIIiIiiII4 = iIiIiIIIII2;
            iIIIiIiiII4.IIIIiIIiII();
            iIIIiIiiII4.iIiIiIIIII += --1;
        }
    }

    public String ALLATORIxDEMO() {
        Object object = string;
        if (!object.isActive()) {
            return iiIIIIiiiI.ALLATORIxDEMO("\u4f0f\u751b\u6528\u7a39\uff63\u6710\u5454\u7510");
        }
        String string = ((iIIIiIiiII)object).iIiiiIiIii ? IiiiIiiIII.ALLATORIxDEMO("\u8f96\u887e\u4e60") : iiIIIIiiiI.ALLATORIxDEMO("\u5dc8\u5bf7\u6228");
        Object[] objectArray = new Object[--3];
        objectArray[5 >> 3] = string;
        objectArray[5 >> 2] = ((iIIIiIiiII)object).iIiIiIIIII;
        objectArray[5 >> 1] = ((iIIIiIiiII)object).ALLATORIxDEMO();
        return String.format(IiiiIiiIII.ALLATORIxDEMO("\u4f4d\u7565\u656b\u7a46\uff28haM\u001a\u8f96\u5eb4\uff777\t\u001dhVd"), objectArray);
    }

    public void onDeactivate() {
        super.onActivate();
        this.iIiiiIiIii = 2 & 5;
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u6532\u7a1e\u5d98\u7e86\u6775\u3010\u59ef\u67ae\u974d\u89b3\u5e63\u529b\uff41\u8be5\u91a0\u6582\u5462\u753a\u4f12\u753a\u6534\u7a39\u6a6c\u5765\u304f"));
    }

    public void iiiIiIiIII() {
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("p\u000fp\u0012\u5200\u7f7c }\t\u68d2\u6788\u7ec1\u67f1\u0012p\u000fp"));
        this.iiIIiIIiii();
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("@\u0003@\u0003`#`#`#@\u0003`#@\u0003`#@\u0003@\u0003@\u0003"));
    }

    private /* synthetic */ void IIIIIIIiII() {
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("@\u0003@\u001e\u6b5f\u8ff0\u4f02\u75160W\u0016K\u638f\u4ee8]\u0003@\u0003"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u671e\u6514\u7a39\u5c4b\u6315\u5b91\u609a\u5bc1\u6202\u63bf\u4ee4\u76e9\u57c8\u6761\u8b8c\u7f23"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u7813\u4fe3\u83ca\u5fa9\u677d\u4f4d\u76f9\u4e13\u65fa\u6600\u7967\u5492\u52e2\u80c3\u4f2e\u9ab2"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("(Wh\u0017/P\u000fp\u000fp\u000fp/P\u000fp/P/P\u000fp\u000fp"));
    }

    private /* synthetic */ void IIiIiIiiii() {
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u0003`#]\u5273\u7f33S2z\u5bd4\u88db\u6504\u7a15}#`#"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u90da\u524b\u528d\u8090\u9732\u89cc\u4ef7\u4e66\u525f\u7f03\u007f\u0002v\uff57"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("l0]|\u001cL\u0014J\u0012P8>P\u001e\u7575\u4e90\u8197\u5296\u534b\u79e5\u52f5\u5492\u8db2\u5f9a\u8999\u520c"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO(" C\u0012\u0015S(@\"\u7696\u5c62\u5702\u56b32@2\u5c62\u5702\u56b3\u52ad\u80b0"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\rS\u001e1W\t[0\u007f\tW>\u007f]\u0013}\u5ee4\u7b0c\u5492\u7e8e\u679a\u7bfc\u7418"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("+N4=|\u000b\u0013Kp\u001f[.\u0012`\u0012\u7205\u673e\u5111\u5b8b\uff45\u5990\u67f1\u4f6d\u7545d\u0004s\uff44"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("+s>+W\u001cx\u001c\\\u000fW>N\u0011K.>P\u001e\u58c3\u5f24\u7215\u6732\u5121\u5ba7\u52c2\u80e3"));
        IiIiIIiiii.iiIIiIIiii("");
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u5be4\u88f7\u5eb7\u8b9c\uff57"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u0013}\u4ed0\u5be5\u6587\u6ecd\u4e15\u8f00s\u0012Z\u4eb8\u7870\u4f80\u5b97\u5135\u6039"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("Gu\u7844\u4fcf }\t\u727a\u6761\u4e3c\u0000{\u0003W.`\ft\u0019\u727a\u6761\u530b\u9100"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("3]\u6337\u713aS2z\u4f01\u801b\u8ba9\u6610\u8f86\u8852\u9110\u7f70"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("P\u000fp\u000fp\u000fp/P\u000fp/P/P\u000fp\u000fp"));
        if (((Boolean)this.iiiIiiIIII.get()).booleanValue()) {
            this.iiIIiIIiii();
        }
    }

    public void iIiIiiiiii() {
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u000fp\u000fm\u5ff9\u9072\u5b65\u4f1e\u8bac\u7f03\u6315\u533a\u0012p\u000fp"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("L\u0010}\u53ed\u4e77\u89ec}\u218c]}2p;w:>\u21cf>\u001bq3j"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO(" C\u0012\u9044\u62db\u5b1a\u4f61\uff57V\b\\*j\u0004s\u0003\uff3a\u7b04\u7e8d\uff44"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("-s>\u4f80\u5b46\u8be3\u7f70"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("h\u0017/P\u000fp\u000fp\u000fp/P\u000fp/P/P\u000fp\u000fp"));
    }

    public iIIIiIiiII() {
        iIIIiIiiII iIIIiIiiII2 = this;
        super(IiiiIiiIII.ALLATORIxDEMO(",\u4f4d\u7565\u656b\u7a46"), iiIIIIiiiI.ALLATORIxDEMO("\ud860\udcc4\u007fQ(io\u638b\u4ea3\u5b9a\u6524\u4f6c\u7578\u6314\u530c\u5494\u8be4\u7f77\u6543\u7a52W\u0014\u2755\u001e\u6751\u6a1f\u572a\u5c38\u635a\u5be2\u60d5\u5bb2\u624d\u4efb\u4e56\u8ba0\u7f13\uff24w\ud803\udd2ck\u5b0a\u4f4d\u8be4\u7f77}3`\u914e\u7f64\u4e64\u65d0\u5b43\u4f08\u7876\u4f84\u7556\u9778\u6b3a\u5e6b\u662e\u7967\u0014\ud87c\udf13|I\bC\u721e\u6739:ty\u8ba4\u7f33\u6b7d\u7831\u7698\u0017K\u0018\u7252\u67716n2s24o|\u4ef3\u83e7\u5f84\u6750\u4f60\u5127\u5ba1\u607d\u0013\ud827\udcbf}\u5253\u7f13s2z]\u0013}\u68de\u6798\u5e48\u635a\u5be2\u5bd4\u88db\u5fb8\u89bf\u76f9\u5273\u7f66\u0006\u0012ZP\u0013\u26fc>\u4e7b\u8982\u5295\u80b4\uff4d\u001e\u20798\u81b3\u52b2\u8ba4\u7f37\u4e7e\u6597\u5b0a\u4f4dh\u7b4a\u7ee30\u0005g8rb08tt\u0014\u207d<\u663b\u80ff\u6899\u67ff\u000bW\u001e\u7254\u676d\u517e\u5ba3\u607e_\u2034p\u68d3\u6d1bQ:j3mu78\u301f%_\u0018L\u0012\u570e\u56a3\u301f1W){0\u007f\tW\u001e_\u3009\u001d4\u007f\u001cx?l)`Z%\"g\u7b12\u5255\u7f37WU\u001dY\u2032}\u5218\u6b25\u9aa7\u76d8\u6e0f\u8f9a\u5f0d\u650f\u7a1e\u7ce1\u7e86S\u2038}\u5ff5\u9040\u631b\u5316\u548e\u72ef\u601b\u67b8\u8bfc\u52c0\u80e1K\b\ud827\udcf8u\u4f69\u7578\u5ee9\u8bfe\uff09Q\u998e\u6b7b\u4f66\u7532\u00144u\b\u63ec\u4e8b\u65c8\u8b8a\u5411\u7575\u6732\u6a5c\u5769\uff51\u0014\u6354\u7179\u6524\u7a35\u5bf1\u622e\u57f2\u6767\u8be3\u7f70\u4ebf\u83ae\u5fca\u671e\u4f33\u4f50\u9a86\uff48"));
        iIIIiIiiII2.iiiiiIIiIi = iIIIiIiiII2.settings.getDefaultGroup();
        iIIIiIiiII2.IIiiIIIIIi = iIIIiIiiII2.settings.createGroup(IiiiIiiIII.ALLATORIxDEMO("\u5b65\u4f1e\u8b8c\u7f23"));
        iIIIiIiiII2.iIiIIiIIIi = iIIIiIiiII2.settings.createGroup(iiIIIIiiiI.ALLATORIxDEMO("H\tB\u8bb4\u7f27"));
        iIIIiIiiII2.IIiIiiiiII = iIIIiIiiII2.settings.createGroup(IiiiIiiIII.ALLATORIxDEMO("\u5220\u7f5c\u0000}\t"));
        iIIIiIiiII2.iIIiIiiiIi = iIIIiIiiII2.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u6663\u7924\u6b62\u8fcd\u4feb\u6026"))).description(IiiiIiiIII.ALLATORIxDEMO("\u541d\u7565\u65c4\u6673\u7928\u6b4f\u8ffc\u4fac\u607d\u54e1\u57e8\u6741\u4f4d\u7565\u6335\u531a"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIIIiiiiIi = this.iiiiiIIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u81b7\u52b6\u8bfe\u7f6d\u5b5d\u4f1a"))).description(IiiiIiiIII.ALLATORIxDEMO("\u5c77\u8b80\u81c0\u52ba\u8bd3\u7f5c\u4e60\u65b5\u5b1a\u4f61\uff45\u7b5b\u7ed2\u001d\tw\u0003u\u0015[,\\\uff44"))).defaultValue((Object)(3 >> 1))).build());
        this.ALLATORIxDEMO = this.IIiiIIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u6663\u7924\u5b17\u4f50\u6553\u7a42"))).description(IiiiIiiIII.ALLATORIxDEMO("\u6673\u7908\u59cf\u4f47\u8bd3\u7f5c\u4e60\u6595\u5b3a\u4f41\u76e9\u8bd4\u7e8b\u656b\u7a46"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IIIIiiIiii = this.IIiiIIIIIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u99d6\u900a\u5b5d\u4f1a"))).description(IiiiIiiIII.ALLATORIxDEMO("\u63e5\u8342\u76e9\u4e3f\u65ea\u5b65\u4f1e\u543f\u79bd"))).defaultValue((Object)iiIIIIiiiI.ALLATORIxDEMO("\u001e|3y8jk'"))).build());
        this.iIiIiiiiII = this.iIiIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u6653\u7928;{\f\u656b\u7a46"))).description(iiIIIIiiiI.ALLATORIxDEMO("\u6675\u7967H\u0013X\u7215\u6732\u8bfe\u7f6d\u6553\u7a42"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIiiIiIiI = this.iIiIIiIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u68ad\u67f7;{\f\u727a\u6761"))).description(iiIIIIiiiI.ALLATORIxDEMO("\u81b7\u52b6\u689d\u67fb\u5f2e\u5273+wI\u7203\u6771\u6631\u547c\u4e23l0r3$\u007f"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IIiIiIIiii = this.iIiIIiIIIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiiiIiiIII.ALLATORIxDEMO("\u7683\u6815;{\f\u727a\u6761"))).description(iiIIIIiiiI.ALLATORIxDEMO("\u63f2\u8349\u76d9H\tB\u7242\u6765"))).defaultValue((Object)IiiiIiiIII.ALLATORIxDEMO("#C\u0000}\u001c{"))).build());
        this.IiiIiIiiIi = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u6627\u7967S\u000fG\u6553\u7a42"))).description(IiiiIiiIII.ALLATORIxDEMO("\u660c\u7977\u5fd7\u89ec\u76b6\u5200\u7f7c ])\u5bbb\u8888\u656b\u7a46"))).defaultValue((Object)(3 >> 1))).build());
        this.iiiIiiIIII = this.IIiIiiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiiI.ALLATORIxDEMO("\u68d9\u67b8\u5253\u7f2eNE\r"))).description(IiiiIiiIII.ALLATORIxDEMO("\u81a7\u529a\u688d\u67d7\u5f88\u8993\u76e9\u527f\u7f23_\"V\u6642\u5414\u5dbf\u5bbb\u8888"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        iIIIiIiiII iIIIiIiiII3 = this;
        iIIIiIiiII3.iIiIiIIIII = 2 & 5;
        iIIIiIiiII3.iIiiiIiIii = 2 & 5;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiIIIIiiiI.ALLATORIxDEMO("\rr\u0018_.{}k\rZ\u001cJmj}\u8be9\u66ae\u65a9\u526d\u671e\u65f0\u724b\u6726\uff48"));
        }
    }

    private /* synthetic */ void iIiIiIiIii() {
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("`#@\u001e\u6504\u7a15\u5bf1\u622e}#`#"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u57c8\u6761\u8b8c\u7f23\u5dc0\u5bc1\u6202\uff6c\u4ed7\u4e46\u663d\u4e6d\u4e89\u4f12\u751a\u639d\u7908\uff57"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u207f>\u623d\u6737\u6a7c\u5749\u6552\u633f\u4e70\u6599\u7511\u977c"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u2010m\u5915\u90a5\u5214\u52f2\u80cf\u90b0\u671b\u8b8b\u7ed4\u76e9\u8b8c\u7f23\u903b\u9834"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u205f\u001e\u901a\u522e\u9593\u98a6\u53b2\u4efb\u6798\u7735\u6a7c\u5749\u6392\u8fee"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u2010m\u5ee8\u8bc3\u517a\u5765\u6d59\u8bb8\u4e04\u7521\u8be7\u7565\u52ad\u80b0"));
        IiIiIIiiii.iiIIiIIiii("");
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u6101\u8c5f\u4f41\u7575S\u0014U(\u63cc\u4eab\uff1f"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u63e0\u4ebb\u7fb6\uff77\u0003}#^ T\u0005|\u0005|"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("#@\u0003`#@\u0003`#@\u0003`#`#"));
        this.iIiiiIiIii = 3 & 4;
    }

    private /* synthetic */ void IIiIiIiIiI() {
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("p\u000fp\u0012\u001b[,\u727a\u6761\u8bac\u7f03\u654b\u7a66\u0012p\u000fp"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("+w\u001c\u63cc\u4e8b\u7516\u4ed3\u7256\u6751\u5142\u5be4\uff12\u8b8a\u8b80\u7f33\u599c\u4e76\uff24"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("|<M\u785c\u4f90\u5de0\u5be4\u88d7;{\f\u63e0\u4ebb"));
        IiIiIIiiii.iiIIiIIiii("2. \u5728VIA\u8bbe\u7f6e\u4e2d\u5c06\u7248\u672c\u8bbe\u7f6e\u4e3a\uff1a" + (String)this.IIiIiIIiii.get());
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("N\u0010]\u7850\u4fa0\u7276\u6751\u8b80\u7f33\u4e24L\u0010o.S\b\u4eb8\u83a9\u5fea\u673e\u4f2e\u5162\u5bc4\u6019"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("y\u001cm\u4fcf\u5b35\u8b8c\u7f23\u5e64\u91a0\u65a2\u8fb3\u6397\u6740\u5293\u5625"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u6cd6\u6172\uff24\u9544\u8bf1\u76f9h\u0014_\u7235\u6712\u53b2\u80e3\u5b81\u81ca\u52c2\u80e3\u5f7f\u5e06"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("/P\u000fp\u000fp\u000fp/P\u000fp/P/P\u000fp\u000fp"));
        if (((Boolean)this.iIIiiIiIiI.get()).booleanValue()) {
            this.ALLATORIxDEMO();
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        iIIIiIiiII iIIIiIiiII2 = this;
        int n = 2 ^ 3;
        if (((Boolean)iIIIiIiiII2.ALLATORIxDEMO.get()).booleanValue()) {
            ++n;
        }
        if (((Boolean)iIIIiIiiII2.iIiIiiiiII.get()).booleanValue()) {
            ++n;
        }
        if (((Boolean)iIIIiIiiII2.IiiIiIiiIi.get()).booleanValue()) {
            ++n;
        }
        return n;
    }

    public void iiiiIIIiII() {
        iIIIiIiiII iIIIiIiiII2 = this;
        iIIIiIiiII2.iIiIiIIIII = 3 >> 2;
        iIIIiIiiII2.iIiiiIiIii = 3 & 5;
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u654b\u7a66\u5dc0\u9180\u7f7c\uff61\u5c14\u91a0\u6582\u5f4d\u59f9\u304f"));
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void IIIIiIIiII() {
        switch (this.iIiIiIIIII) {
            case 0: {
                if (!((Boolean)this.ALLATORIxDEMO.get()).booleanValue()) return;
                this.IIIIiIiiii();
                return;
            }
            case 1: {
                if (!((Boolean)this.iIiIiiiiII.get()).booleanValue()) return;
                this.IIiIiIiIiI();
                return;
            }
            case 2: {
                if (!((Boolean)this.IiiIiIiiIi.get()).booleanValue()) return;
                this.IIiIiIiiii();
                return;
            }
            case 3: {
                this.iIiIiIiIii();
                return;
            }
        }
    }

    private /* synthetic */ void iiIIiIIiii() {
        int n;
        int n2;
        int n3;
        iIIIiIiiII iIIIiIiiII2 = this;
        int n4 = --1;
        try {
            Class.forName(iiIIIIiiiI.ALLATORIxDEMO("\u001f_\u000fW)q3{S_\rWs\\\u001cL\u0014J2p8_\rW"));
            IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u2721mP\f@$f\u0002|\b\u0012\u5dbf\u5bbb\u8888"));
        }
        catch (ClassNotFoundException classNotFoundException) {
            iIIIiIiiII2.warning(iiIIIIiiiI.ALLATORIxDEMO("\u274a>\u001f\u007f\u000fW\tQ3{}\u6734\u5bf4\u88fb]\u0013}\u90f6\u527b\u81d4\u52d5\u5328\u52c2\u80e3\u5c5b\u4e13\u53b2\u7536"), new Object[3 & 4]);
            n4 = 3 & 4;
        }
        try {
            Class.forName(IiiiIiiIII.ALLATORIxDEMO("l\np\u0018:\u0004\u007f\u0004\\$_,BcJ\fW?} {\u0003[ S="));
            IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u272d]f<{\u000fQ\u76f9\u5c31\u576d\u56e0}\u5dec\u5bd4\u88db"));
        }
        catch (ClassNotFoundException classNotFoundException) {
            iIIIiIiiII2.warning(IiiiIiiIII.ALLATORIxDEMO("\u2703KM\u000b0X}\u76e9\u5c3d\u577d\u56ccm\u6718\u5bc4\u88d7M\u001fm\u5722\u5693\u528d\u8090\u5c34\u4e40\u53dd\u7565"), new Object[3 ^ 3]);
            n4 = 2 & 5;
        }
        try {
            Class.forName(iiIIIIiiiI.ALLATORIxDEMO(";wSZ$00\u007f\u000e_SR4j8s\u001cJ\u0014]<01W\t[0\u007f)w>\u007f"));
            IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u2721m~$f\b_,f\u0004q\f\u0012\u5dbf\u5bbb\u8888"));
        }
        catch (ClassNotFoundException classNotFoundException) {
            iIIIiIiiII2.warning(iiIIIIiiiI.ALLATORIxDEMO("\u2709}R\u0014J\u0018S<j4}\u001c\u001e\u6757\u5bb7\u8898>P\u001e\u5e87\u7b6f\u52c2\u80e3\u5c5b\u4e13\u53b2\u7536"), new Object[3 & 4]);
            n4 = 3 >> 2;
        }
        int classNotFoundException = 0;
        try {
            Class.forName(IiiiIiiIII.ALLATORIxDEMO("\u000bk_p\u0005}\u001fy\u000e`\u001c<Ir\u0004z\f1\u0016}\ns\u000b7X{\u000eB!G>\u001c\u001b{\ft,p\u001f{\u000eb!G>"));
            n3 = classNotFoundException = 3 >> 1;
        }
        catch (ClassNotFoundException classNotFoundException2) {
            n3 = classNotFoundException;
        }
        if (n3 == 0) {
            try {
                Class.forName(iiIIIIiiiI.ALLATORIxDEMO("8w77l0<h\u0018L\u000eW\u0012Psh\u0014_;\u007f?l\u0014]\rR(msH\u0014_;_?l\u0014]-R(m\u0014s-r"));
                n2 = classNotFoundException = 3 >> 1;
            }
            catch (ClassNotFoundException classNotFoundException3) {}
        }
        n2 = classNotFoundException;
        if (n2 != 0) {
            IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u277e\u0012\u001b[,t,p\u001f[.B\u0001g\u001e\u0012\u5dbf\u5bbb\u8888"));
            n = n4;
        } else {
            iIIIiIiiII2.warning(iiIIIIiiiI.ALLATORIxDEMO("\u274a>+W<X<|\u000fW\u001en1k.>\u6757\u5bb7\u88b8\u001ep>\u7235\u6712\u5101\u5b87\u52c2\u80e3\u53b2\u80e3\u538a\u964e"), new Object[3 ^ 3]);
            n = n4 = 5 >> 3;
        }
        if (n != 0) {
            IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("\u6272\u6744\u63ba\u833d\u76b6\u5200\u7f7c ])\u5dc0\u5bc4\u88f7\uff4c"));
            return;
        }
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("\u67ee\u4ec6\u5253\u7f33S2z\u7f47\u590f\uff51\u4f58\u4e70\u5f4f\u54b0\u57c4\u6771\u5281\u80a0\u4f61\u7575\u301c"));
    }

    public void iiiIiIiiIi() {
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("#`#]\u5fd5\u9042H4\u007f\u8be3\u7f70\u635a\u5349]\u0003`#"));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("|<Md\u0004S\u8bd3\u7f7cM\u21a0m\u727a\u6761"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("O\u0010}\u8ba0\u7f13\u7276\u6771\uff04l0O\u000es("));
        IiIiIIiiii.iiIIiIIiii(IiiiIiiIII.ALLATORIxDEMO("!C2\u4fb0\u5b6a\u5e3b\u91ff\u8f93"));
        IiIiIIiiii.iiIIiIIiii(iiIIIIiiiI.ALLATORIxDEMO("@\u0003`#`#`#@\u0003`#@\u0003`#`#@\u0003`#"));
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        try {
            IiIiIIiiii.iiIIiIIiii("\u8bf7\u786e\u8ba4\u60a8\u7684VIA\u7248\u672c\u8bbe\u7f6e\u4e3a\uff1a" + (String)this.IIiIiIIiii.get());
            return;
        }
        catch (Exception exception) {
            this.warning(IiiiIiiIII.ALLATORIxDEMO("\u65f2\u6cb8\u68f2\u67a8d\u0004s\u7205\u673e\uff61\u8bc5\u6206\u52ba\u7803\u8bb6\u8bd3\u7f5c\u6b2e\u785c\u304f"), new Object[5 >> 3]);
            return;
        }
    }
}

