/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.class_1268
 *  net.minecraft.class_2338
 *  net.minecraft.class_2596
 *  net.minecraft.class_2960
 *  net.minecraft.class_304
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.iIIIIiIiii;
import com.github.mikumiku.addon.iIIIiiiiiI;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iIiIiiIIIi;
import com.github.mikumiku.addon.iIiiiIIiIi;
import com.github.mikumiku.addon.iiIiIiiiiI;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.Date;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.class_1268;
import net.minecraft.class_2338;
import net.minecraft.class_2596;
import net.minecraft.class_2960;
import net.minecraft.class_304;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiIIiiiI
extends iIiIiIIIii {
    private final Setting<Boolean> IiiiiIiIiI;
    private final Setting<Boolean> iiiIiIIiii;
    private final class_2960 iIIIiiiiIi = class_2960.method_60655((String)IIiIIIIIii.ALLATORIxDEMO("\u0005/\u001c\u000f'\u0018e\u0007!!\u001d"), (String)iiIiIiiiiI.ALLATORIxDEMO("\\xPi}O\u0018;\u0007pFq],\u001bp\u0011-"));
    private final SettingGroup iiiIiiIIII;
    private boolean iIiIIiIIIi;
    private class_2338 IIiIiiiiII;
    private float IIiiIIIIIi;
    private final Setting<Boolean> iIiiiIiIii;
    private final Setting<Double> iIiIiiiiII;
    private final Setting<Boolean> IIIIiiIiii;
    private final class_2960 IiiIiIiiIi = class_2960.method_60655((String)IIiIIIIIii.ALLATORIxDEMO("\u0005/\u001c\u000f'\u0018e\u0007!!\u001d"), (String)iiIiIiiiiI.ALLATORIxDEMO("\\xPi}O\u0018;\u0007pFq]/\u001bp\u0011-"));
    private int IIiIiIIiii;
    private final Setting<Integer> iIIiiIiIiI;
    private iIIIiiiiiI iiiiiIIiIi;
    private final Setting<Boolean> iIIiIiiiIi;
    private boolean iIiIiIIIII;
    private final Setting<Boolean> ALLATORIxDEMO;

    public boolean ALLATORIxDEMO() {
        IiIiIIiiiI iiIiIIiiiI = this;
        boolean bl = Input.isPressed((class_304)iiIiIIiiiI.iIIiiIiIiI.field_1690.field_1894) || Input.isPressed((class_304)iiIiIIiiiI.iIIiiIiIiI.field_1690.field_1881) || Input.isPressed((class_304)iiIiIIiiiI.iIIiiIiIiI.field_1690.field_1913) || Input.isPressed((class_304)iiIiIIiiiI.iIIiiIiIiI.field_1690.field_1849) || Input.isPressed((class_304)iiIiIIiiiI.iIIiiIiIiI.field_1690.field_1903) || Input.isPressed((class_304)iiIiIIiiiI.iIIiiIiIiI.field_1690.field_1832);
        IiIiIIiiiI iiIiIIiiiI2 = iiIiIIiiiI;
        class_2338 class_23382 = iiIiIIiiiI2.iIIiiIiIiI.field_1724.method_24515();
        int n = iiIiIIiiiI2.IIiIiiiiII != null && !class_23382.equals((Object)iiIiIIiiiI.IIiIiiiiII) ? 3 & 5 : 0;
        if (bl || n != 0) {
            return true;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        IiIiIIiiiI iiIiIIiiiI = iiIiIIiiiI2;
        IiIiIIiiiI iiIiIIiiiI2 = render2DEvent;
        IiIiIIiiiI iIiIiIIIII2 = iiIiIIiiiI;
        if (!Utils.isLoading() && iIiIiIIIII2.isActive()) {
        }
    }

    public void onDeactivate() {
        if (((Boolean)this.iiiIiIIiii.get()).booleanValue()) {
            IiIiIIiiii.iiIIiIIiii(IIiIIIIIii.ALLATORIxDEMO("\ud854\udfc7h\u9719\u4ebc\u8f26\u5760\u7eb9\u6717\uff66\u6157\u8c48\u898a\u8d05\uff69"));
            IiIiIIiiii.iiIIiIIiii("\u603b\u5171\u65cb\u8f6c\u4e86 " + this.IIiIiIIiii + " \u4e2atick");
        }
        this.iIiIIiIIIi = 3 ^ 3;
        this.IIiIiIIiii = this.iIiIIiIIIi;
    }

    @Override
    public void onActivate() {
        IiIiIIiiiI iiIiIIiiiI = this;
        super.onActivate();
        iiIiIIiiiI.IIiiIIIIIi = iiIiIIiiiI.iIIiiIiIiI.field_1724.method_36454();
        this.IIiIiiiiII = iiIiIIiiiI.iIIiiIiIiI.field_1724.method_24515();
        this.iIiIIiIIIi = --1;
        this.iIiIiIIIII = this.iIIiiIiIiI.field_1724.method_5715();
        this.IIiIiIIiii = 3 >> 2;
        if (((Boolean)this.iiiIiIIiii.get()).booleanValue()) {
            if (((Boolean)this.iIiiiIiIii.get()).booleanValue()) {
                IiIiIIiiii.iiIIiIIiii(iiIiIiiiiI.ALLATORIxDEMO("\ud821\udf37\u2735(\u976e\u4efa\u8f77\u5727\u6a3b\u5f0f\u541a\u528a\uff16\u51f3\u5907\u60e2\u545b\u6277\u670b\u4e9a\uff14\u0015\u2728\ud818\udf0e"));
                IiIiIIiiii.iiIIiIIiii(IIiIIIIIii.ALLATORIxDEMO("\ud877\udd4dJ\u4f28\u5c7b\u6647\u5122\u5752\u676a\u971b\u76ee\u4e9c\uff6bh\ud877\udd4d"));
                IiIiIIiiii.iiIIiIIiii("\ud83d\udcab \u65cb\u8f6c\u89d2\u5ea6: " + String.valueOf(this.iIiIiiiiII.get()) + "\u00b0/tick \ud83d\udcab");
                IiIiIIiiii.iiIIiIIiii("\u26a1 \u79fb\u52a8\u6682\u505c: " + ((Boolean)this.IiiiiIiIiI.get() != false ? iiIiIiiiiI.ALLATORIxDEMO("\u540b\u7539") : IIiIIIIIii.ALLATORIxDEMO("\u79cb\u7540")) + " \u26a1");
                IiIiIIiiii.iiIIiIIiii("\ud83d\udce1 \u4ec5\u53d1\u5305\u6a21\u5f0f: " + ((Boolean)this.iIIiIiiiIi.get() != false ? iiIiIiiiiI.ALLATORIxDEMO("\u5418\u752a\uff28\u9685\u5f57\u65cb\u8f48\uff18") : IIiIIIIIii.ALLATORIxDEMO("\u79eb\u7560\uff62\u53a7\u89ab\u6583\u8f26\uff61")) + " \ud83d\udce1");
                IiIiIIiiii.iiIIiIIiii("\ud83e\udd98 \u9ad8\u901f\u8e72\u8d77: " + ((Boolean)this.ALLATORIxDEMO.get() != false ? iiIiIiiiiI.ALLATORIxDEMO("\u5418\u752a\uff28\u8d90\u7e92\u6548\u67b8\uff18") : IIiIIIIIii.ALLATORIxDEMO("\u79cb\u7540")) + " \ud83e\udd98");
                return;
            }
            IiIiIIiiii.iiIIiIIiii(iiIiIiiiiI.ALLATORIxDEMO("\ud821\udf17\u001d\u977d\u4ecf\u8f43\u5712\u6a21\u5f3a\u540d\u52bf\uff34\u51c6\u592f\u60d7\u5471\u6242\u6729\u4eaf\uff34 \ud818\udf0e"));
            IiIiIIiiii.iiIIiIIiii("\u65cb\u8f6c\u89d2\u5ea6: " + String.valueOf(this.iIiIiiiiII.get()) + "\u00b0/tick");
            IiIiIIiiii.iiIIiIIiii("\u79fb\u52a8\u6682\u505c: " + ((Boolean)this.IiiiiIiIiI.get() != false ? IIiIIIIIii.ALLATORIxDEMO("\u5465\u7540") : iiIiIiiiiI.ALLATORIxDEMO("\u79a5\u7539")));
            IiIiIIiiii.iiIIiIIiii("\u4ec5\u53d1\u5305\u6a21\u5f0f: " + ((Boolean)this.iIIiIiiiIi.get() != false ? IIiIIIIIii.ALLATORIxDEMO("\u5465\u7540") : iiIiIiiiiI.ALLATORIxDEMO("\u79a5\u7539")));
            IiIiIIiiii.iiIIiIIiii("\u9ad8\u901f\u8e72\u8d77: " + ((Boolean)this.ALLATORIxDEMO.get() != false ? IIiIIIIIii.ALLATORIxDEMO("\u5465\u7540") : iiIiIiiiiI.ALLATORIxDEMO("\u79a5\u7539")));
        }
    }

    private /* synthetic */ void IIIIiIIiII() {
        IiIiIIiiiI iiIiIIiiiI = string;
        if (!((Boolean)iiIiIIiiiI.iiiIiIIiii.get()).booleanValue() || !((Boolean)iiIiIIiiiI.iIiiiIiIii.get()).booleanValue()) {
            return;
        }
        String string = (Boolean)iiIiIIiiiI.iIIiIiiiIi.get() != false ? iiIiIiiiiI.ALLATORIxDEMO("\uff20\u968d\u5f6a\u6a1c\u5f07\uff34") : IIiIIIIIii.ALLATORIxDEMO("\uff62\u53a7\u89ab\u6a69\u5f45\uff61");
        if (iiIiIIiiiI.IIiIiIIiii == (0x31ED & 0x4F7A)) {
            IiIiIIiiii.iiIIiIIiii("\ud83c\udf89 \u606d\u559c\uff01\u5b8c\u6210\u4e00\u6574\u5708\u65cb\u8f6c\uff08360\u00b0\uff09\uff01\u4f60\u5c31\u662f\u65cb\u8f6c\u4e4b\u738b\uff01" + (String)string + " \ud83c\udf89");
            return;
        }
        if (iiIiIIiiiI.IIiIiIIiii == (0x5EF9 & 0x23D6)) {
            IiIiIIiiii.iiIIiIIiii("\ud83c\udfc6 \u53cc\u5708\u8fbe\u6210\uff01720\u00b0\u7684\u5b8c\u7f8e\u8868\u6f14\uff01\u89c2\u4f17\u4e3a\u4f60\u75af\u72c2\uff01" + (String)string + " \ud83c\udfc6");
            return;
        }
        if (iiIiIIiiiI.IIiIiIIiii == (0x1BEC & 0x67FB)) {
            IiIiIIiiii.iiIIiIIiii("\ud83d\udcaf \u5343tick\u91cc\u7a0b\u7891\uff01\u4f60\u7684\u65cb\u8f6c\u6280\u5de7\u5df2\u7ecf\u7089\u706b\u7eaf\u9752\uff01" + (String)string + " \ud83d\udcaf");
            return;
        }
        if (iiIiIIiiiI.IIiIiIIiii == (0x77BC & 0xF4B)) {
            IiIiIIiiii.iiIIiIIiii("\ud83c\udf1f \u4e94\u5708\u6210\u5c31\u89e3\u9501\uff011800\u00b0\u7684\u534e\u4e3d\u6f14\u51fa\uff01" + (String)string + " \ud83c\udf1f");
            return;
        }
        if (iiIiIIiiiI.IIiIiIIiii % (0x43EA & 0x3FFD) == 0) {
            if (iiIiIIiiiI.IIiIiIIiii > (0x43EA & 0x3FFD)) {
                IiIiIIiiii.iiIIiIIiii("\ud83d\ude80 " + iiIiIIiiiI.IIiIiIIiii / (0x7BEC & 0x7FB) + "K\u91cc\u7a0b\u7891\u8fbe\u6210\uff01\u4f60\u5c31\u662f\u6c38\u52a8\u673a\u9753\u4ed4\uff01" + (String)string + " \ud83d\ude80");
            }
        }
    }

    public IiIiIIiiiI() {
        super(IIiIIIIIii.ALLATORIxDEMO("\u9739\u4e9c\u8f26\u5760"), iiIiIiiiiI.ALLATORIxDEMO("\u60f7\u543b\u6208\u6721\u4ea7\u76ab\u70b1\u915f\u65d6\u8f59\u6548\u67e3\uff4b"));
        this.iiiIiiIIII = this.settings.getDefaultGroup();
        this.iIiIiiiiII = this.iiiIiiIIII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u65a1\u8f24\u8998\u5ece"))).description(iiIiIiiiiI.ALLATORIxDEMO("\u6bf2\t!Kv\u65e4\u8f76\u76ac\u89cf\u5e93\uff08\u5ed9\uff43"))).defaultValue(35.0).min(-360.0).max(360.0).sliderMin(-180.0).sliderMax(180.0).build());
        this.iIIiiIiIiI = this.iiiIiiIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u5ebc\u8fb7"))).description(iiIiIiiiiI.ALLATORIxDEMO("\u5280\u4f41\u4e63\u95e9\u768c\u5ecb\u8fa2\u65be\u95dc\uff15\u537a\u4f57\uff32i\\c\u0014\uff43"))).defaultValue((Object)(3 >> 2))).sliderRange(3 >> 2, 0x7D & 0x16).build());
        this.IiiiiIiIiI = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u79b3\u52c2\u65be\u66c8\u5034"))).description(iiIiIiiiiI.ALLATORIxDEMO("\u5f7b\u73b4\u5b99\u79e1\u5280\u65eb\u66b7\u505c\u65b4\u8f26"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiIiiiIi = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u4e8d\u539b\u536d"))).description(iiIiIiiiiI.ALLATORIxDEMO("\u53c2\u540c\u6725\u52bc\u5640\u53cc\u9009\u65f6\u8f11\u534d\uff24\u5bbf\u6218\u7af5\u7381\u5bab\u6728\u5411\u4e72\u5392"))).defaultValue((Object)(3 >> 2))).build());
        this.IIIIiiIiii = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u636f\u6223"))).description(iiIiIiiiiI.ALLATORIxDEMO("\u5407\u7535\u9aed\u901f\u635a\u6201"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.ALLATORIxDEMO = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u9ab2\u9057\u8e38\u8d1f"))).description(iiIiIiiiiI.ALLATORIxDEMO("\u5432\u7520\u9ae5\u9062\u8e3a\u8d5f\u52b5\u4f73\uff16\u58b6\u52bd\u89f3\u89c9\u6537\u67d6"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIiiiIiIii = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u70c1\u913f\u7233\u6520"))).description(iiIiIiiiiI.ALLATORIxDEMO("\u5467\u7500\u9880\u5939\u769e\u7083\u916a\u63e5\u793a\u4f9e\u6025"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiiIiIIiii = this.iiiIiiIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIIIii.ALLATORIxDEMO("\u6654\u7972\u72fc\u6069"))).description(iiIiIiiiiI.ALLATORIxDEMO("\u5755\u8002\u5901\u4e30\u6611\u7920\u65e3\u8f71\u7283\u6001\u4f9e\u6025"))).defaultValue((Object)(--1 != 0))).build());
        IiIiIIiiiI iiIiIIiiiI = this;
        this.IIiiIIIIIi = 0.0f;
        this.IIiIiiiiII = null;
        this.iIiIIiIIIi = 3 & 4;
        iiIiIIiiiI.IIiIiIIiii = this.iIiIIiIIIi;
        iiIiIIiiiI.iIiIiIIIII = 3 & 4;
        iiIiIIiiiI.iiiiiIIiIi = iIIIIiIiii.ALLATORIxDEMO();
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiIIIIIii.ALLATORIxDEMO("=#Hn9\rJ=:\f\u000b</Ij\u8b9f\u669e\u65f8\u525a\u6748\u65da\u7200\u6766\uff69"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiIiIIiiiI iiIiIIiiiI = iiIiIIiiiI2;
        IiIiIIiiiI iiIiIIiiiI2 = pre;
        IiIiIIiiiI iIiIiIIIII2 = iiIiIIiiiI;
        if (iIiIiIIIII2.iIIiiIiIiI.field_1724 == null || iIiIiIIIII2.iIIiiIiIiI.field_1687 == null) {
            return;
        }
        boolean this22 = false;
        if (((Boolean)iIiIiIIIII2.IiiiiIiIiI.get()).booleanValue()) {
            this22 = iIiIiIIIII2.ALLATORIxDEMO();
        }
        if (this22) {
            if (iIiIiIIIII2.iIiIIiIIIi) {
                iIiIiIIIII2.iIiIIiIIIi = 3 & 4;
                if (((Boolean)iIiIiIIIII2.iiiIiIIiii.get()).booleanValue()) {
                    IiIiIIiiii.iiIIiIIiii(iiIiIiiiiI.ALLATORIxDEMO("\u23de\ufe07\u001d\u68f9\u6d47\u5235\u79cb\u52ac\uff3d\u668e\u5065\u65c5\u8f57"));
                }
            }
            iIiIiIIIII2.IIiIiiiiII = iIiIiIIIII2.iIIiiIiIiI.field_1724.method_24515();
            return;
        }
        if (!iIiIiIIIII2.iIiIIiIIIi) {
            iIiIiIIIII2.iIiIIiIIIi = --1;
            if (((Boolean)iIiIiIIIII2.iiiIiIIiii.get()).booleanValue()) {
                IiIiIIiiii.iiIIiIIiii(IIiIIIIIii.ALLATORIxDEMO("\u25de\ufe65h\u6028\u5965\u6581\u8f04\uff66\u7eaf\u7e87\u6082\u542c\u4f5f\u4ef0\uff69"));
            }
        }
        IiIiIIiiiI iiIiIIiiiI3 = iIiIiIIIII2;
        if (iiIiIIiiiI3.iiiiiIIiIi.ALLATORIxDEMO(((Integer)iiIiIIiiiI3.iIIiiIiIiI.get()).intValue())) {
            IiIiIIiiiI iiIiIIiiiI4 = iIiIiIIIII2;
            iiIiIIiiiI4.iiIIiIIiii();
            if (((Boolean)iiIiIIiiiI4.IIIIiiIiii.get()).booleanValue()) {
                iIiIiIIIII2.ALLATORIxDEMO();
            }
            if (((Boolean)iIiIiIIIII2.ALLATORIxDEMO.get()).booleanValue()) {
                iIiIiIIIII2.iiiIiIiiIi();
            }
            IiIiIIiiiI iiIiIIiiiI5 = iIiIiIIIII2;
            iiIiIIiiiI5.IIiIiIIiii += --1;
            iiIiIIiiiI5.IIIIiIIiII();
            if (((Boolean)iiIiIIiiiI5.iiiIiIIiii.get()).booleanValue()) {
                if (iIiIiIIIII2.IIiIiIIiii % (0x6E & 0x75) == 0) {
                    if (((Boolean)iIiIiIIIII2.iIiiiIiIii.get()).booleanValue()) {
                        String[] stringArray = new String[--5];
                        stringArray[3 ^ 3] = "\ud83c\udf2a\ufe0f \u65cb\u98ce\u9753\u4ed4\uff01\u5df2\u8f6c " + iIiIiIIIII2.IIiIiIIiii + " tick\uff01 \ud83c\udf2a\ufe0f";
                        stringArray[--1] = "\u2b50 \u95ea\u8000\u767b\u573a\uff01\u8f6c\u4e86 " + iIiIiIIIII2.IIiIiIIiii + " \u5708\uff01 \u2b50";
                        stringArray[5 >> 1] = "\ud83c\udfad \u5168\u573a\u7126\u70b9\uff01" + iIiIiIIIII2.IIiIiIIiii + " tick\u7684\u7cbe\u5f69\u8868\u6f14\uff01 \ud83c\udfad";
                        stringArray[--3] = "\ud83d\ude80 \u8d85\u7ea7\u65cb\u8f6c\uff01" + iIiIiIIIII2.IIiIiIIiii + " tick\u60ca\u5446\u4f17\u4eba\uff01 \ud83d\ude80";
                        stringArray[--4] = "\ud83d\udc8e \u94bb\u77f3\u7ea7\u65cb\u8f6c\uff01" + iIiIiIIIII2.IIiIiIIiii + " tick\u5b8c\u7f8e\u6f14\u51fa\uff01 \ud83d\udc8e";
                        String[] this22 = stringArray;
                        Object[] objectArray = new Object[--1];
                        objectArray[2 & 5] = Float.valueOf(iIiIiIIIII2.IIiiIIIIIi);
                        IiIiIIiiii.iiIIiIIiii(this22[iIiIiIIIII2.IIiIiIIiii / (0x6D & 0x76) % this22.length] + " \u671d\u5411: " + String.format(iiIiIiiiiI.ALLATORIxDEMO("\u0014\"\bh\u008b"), objectArray));
                        return;
                    }
                    Object[] objectArray = new Object[4 ^ 5];
                    objectArray[3 >> 2] = Float.valueOf(iIiIiIIIII2.IIiiIIIIIi);
                    IiIiIIiiii.iiIIiIIiii("\ud83d\udd04 \u5df2\u65cb\u8f6c " + iIiIiIIIII2.IIiIiIIiii + " tick\uff0c\u5f53\u524d\u671d\u5411: " + String.format(IIiIIIIIii.ALLATORIxDEMO("mDy,\u00d8"), objectArray));
                }
            }
        }
    }

    public String ALLATORIxDEMO() {
        Object object = object2;
        if (!object.isActive()) {
            return iiIiIiiiiI.ALLATORIxDEMO("\u975f\u4ed1\u8f5c\u570c\u000b,\u6713\u5421\u7513");
        }
        Object object2 = ((IiIiIIiiiI)object).iIiIIiIIIi ? IIiIIIIIii.ALLATORIxDEMO("\u6583\u8f26\u4e45") : iiIiIiiiiI.ALLATORIxDEMO("\u66bb\u5052\u4e16");
        String string = (Boolean)((IiIiIIiiiI)object).iIIiIiiiIi.get() != false ? IIiIIIIIii.ALLATORIxDEMO("\u96da\u5f0a") : iiIiIiiiiI.ALLATORIxDEMO("\u53e1\u89fa");
        String string2 = (Boolean)((IiIiIIiiiI)object).ALLATORIxDEMO.get() != false ? IIiIIIIIii.ALLATORIxDEMO("\u8e38\u8d1f") : "";
        Object[] objectArray = new Object[--4];
        objectArray[3 >> 2] = object2;
        objectArray[5 >> 2] = string;
        objectArray[--2] = Float.valueOf(((IiIiIIiiiI)object).IIiiIIIIIi);
        objectArray[--3] = ((IiIiIIiiiI)object).IIiIiIIiii;
        object2 = String.format(iiIiIiiiiI.ALLATORIxDEMO("\u975b\u4ee9\u8f44\u5715\u0012=\rn(\u0015%F$\u0018q\u0018\u89d2\u5e93/\u0000+\u0015\"@\u00b8\u001dE,QYgZ6\u0019+_"), objectArray);
        if (!string2.isEmpty()) {
            object2 = (String)object2 + " | " + string2;
        }
        return object2;
    }

    private /* synthetic */ void iiIIiIIiii() {
        IiIiIIiiiI iiIiIIiiiI = this;
        float f = ((Double)iiIiIIiiiI.iIiIiiiiII.get()).floatValue();
        IiIiIIiiiI iiIiIIiiiI2 = iiIiIIiiiI;
        IiIiIIiiiI iiIiIIiiiI3 = iiIiIIiiiI2;
        iiIiIIiiiI2.IIiiIIIIIi += f;
        while (iiIiIIiiiI3.IIiiIIIIIi > 180.0f) {
            IiIiIIiiiI iiIiIIiiiI4 = iiIiIIiiiI;
            iiIiIIiiiI3 = iiIiIIiiiI4;
            iiIiIIiiiI4.IIiiIIIIIi -= 360.0f;
        }
        IiIiIIiiiI iiIiIIiiiI5 = iiIiIIiiiI;
        while (iiIiIIiiiI5.IIiiIIIIIi < -180.0f) {
            IiIiIIiiiI iiIiIIiiiI6 = iiIiIIiiiI;
            iiIiIIiiiI5 = iiIiIIiiiI6;
            iiIiIIiiiI6.IIiiIIIIIi += 360.0f;
        }
        if (!((Boolean)iiIiIIiiiI.iIIiIiiiIi.get()).booleanValue()) {
            iiIiIIiiiI.iIIiiIiIiI.field_1724.method_36456(iiIiIIiiiI.IIiiIIIIIi);
        }
        IiIiIIiiiI iiIiIIiiiI7 = iiIiIIiiiI;
        iiIiIIiiiI.iIIiiIiIiI.field_1724.field_3944.method_52787((class_2596)iIiiiIIiIi.ALLATORIxDEMO(iiIiIIiiiI7.IIiiIIIIIi, iiIiIIiiiI7.iIIiiIiIiI.field_1724.method_36455(), iiIiIIiiiI.iIIiiIiIiI.field_1724.method_24828()));
    }

    private /* synthetic */ void iiiIiIiiIi() {
        if (this.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        this.iIiIiIIIII = !this.iIiIiIIIII ? 3 >> 1 : 0;
        this.iIIiiIiIiI.field_1724.method_5660(this.iIiIiIIIII);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (this.iIIiiIiIiI.field_1724 == null) {
            return;
        }
        iIiIiiIIIi.ALLATORIxDEMO(((Double)this.iIiIiiiiII.get()).floatValue() > 0.0f ? class_1268.field_5808 : class_1268.field_5810, BaritoneUtil.SwingSide.iIIiIiiiIi);
    }
}

