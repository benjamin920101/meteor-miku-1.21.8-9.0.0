/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  net.minecraft.class_1959
 *  net.minecraft.class_2794
 *  net.minecraft.class_2975
 *  net.minecraft.class_3037
 *  net.minecraft.class_310
 *  net.minecraft.class_3124
 *  net.minecraft.class_5317
 *  net.minecraft.class_5321
 *  net.minecraft.class_5363
 *  net.minecraft.class_5539
 *  net.minecraft.class_5868
 *  net.minecraft.class_5875
 *  net.minecraft.class_6016
 *  net.minecraft.class_6017
 *  net.minecraft.class_6122
 *  net.minecraft.class_6793
 *  net.minecraft.class_6795
 *  net.minecraft.class_6796
 *  net.minecraft.class_6797
 *  net.minecraft.class_6799
 *  net.minecraft.class_6816
 *  net.minecraft.class_6880
 *  net.minecraft.class_6885
 *  net.minecraft.class_7145
 *  net.minecraft.class_7225$class_7226
 *  net.minecraft.class_7225$class_7874
 *  net.minecraft.class_7510
 *  net.minecraft.class_7510$class_6827
 *  net.minecraft.class_7887
 *  net.minecraft.class_7924
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIiiiI;
import com.github.mikumiku.addon.iIiIiIiIii;
import com.github.mikumiku.addon.iiiiiiiIIi;
import com.github.mikumiku.addon.mixin.CountPlacementModifierAccessor;
import com.github.mikumiku.addon.mixin.HeightRangePlacementModifierAccessor;
import com.github.mikumiku.addon.mixin.RarityFilterPlacementModifierAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.world.Dimension;
import net.minecraft.class_1959;
import net.minecraft.class_2794;
import net.minecraft.class_2975;
import net.minecraft.class_3037;
import net.minecraft.class_310;
import net.minecraft.class_3124;
import net.minecraft.class_5317;
import net.minecraft.class_5321;
import net.minecraft.class_5363;
import net.minecraft.class_5539;
import net.minecraft.class_5868;
import net.minecraft.class_5875;
import net.minecraft.class_6016;
import net.minecraft.class_6017;
import net.minecraft.class_6122;
import net.minecraft.class_6793;
import net.minecraft.class_6795;
import net.minecraft.class_6796;
import net.minecraft.class_6797;
import net.minecraft.class_6799;
import net.minecraft.class_6816;
import net.minecraft.class_6880;
import net.minecraft.class_6885;
import net.minecraft.class_7145;
import net.minecraft.class_7225;
import net.minecraft.class_7510;
import net.minecraft.class_7887;
import net.minecraft.class_7924;

public class iIiIIiiIiI {
    public float iIiiiiIIII;
    public class_6122 iiIiIIiiii;
    private static final Setting<Boolean> iIIiIiiIiI;
    public boolean iIIIIIIiII;
    private static final Setting<Boolean> iIIiiIIIIi;
    private static final Setting<Boolean> IiiiiIiIiI;
    private static final Setting<Boolean> iiiIiIIiii;
    public int iIIIiiiiIi;
    public int iiiIiiIIII;
    private static final Setting<Boolean> iIiIIiIIIi;
    private static final Setting<Boolean> IIiIiiiiII;
    private static final Setting<Boolean> IIiiIIIIIi;
    public static final List<Setting<Boolean>> iIiiiIiIii;
    private static final Setting<Boolean> iIiIiiiiII;
    public class_6017 IIIIiiIiii;
    public Color IiiIiIiiIi;
    public float IIiIiIIiii;
    private static final Setting<Boolean> iIIiiIiIiI;
    public Setting<Boolean> iiiiiIIiIi;
    public int iIIiIiiiIi;
    private static final Setting<Boolean> iIiIiIIIII;
    public class_5868 ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ iIiIIiiIiI(class_6796 class_67962, int n, int n2, Setting<Boolean> setting, Color color, class_2794 class_27942) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        int iIiIiIIIII222;
        iIiIIiiIiI iIiIiIIIII6;
        int n32 = n2;
        iIiIIiiIiI iIiIIiiIiI2 = iIiIiIIIII6 = this;
        iIiIIiiIiI iIiIIiiIiI3 = iIiIiIIIII6;
        iIiIIiiIiI iIiIIiiIiI4 = iIiIiIIIII6;
        iIiIIiiIiI4.IIIIiiIiii = class_6016.method_34998((int)(5 >> 2));
        iIiIIiiIiI4.IIiIiIIiii = 1.0f;
        iIiIIiiIiI3.iIIiIiiiIi = iIiIiIIIII222;
        iIiIIiiIiI3.iIIIiiiiIi = n32;
        iIiIIiiIiI2.iiiiiIIiIi = iIiIiIIIII5;
        iIiIIiiIiI2.IiiIiIiiIi = iIiIiIIIII4;
        iIiIiIIIII222 = class_310.method_1551().field_1687.method_31607();
        n32 = class_310.method_1551().field_1687.method_8597().comp_653();
        iIiIIiiIiI iIiIIiiIiI5 = iIiIiIIIII6;
        iIiIIiiIiI2.ALLATORIxDEMO = new class_5868((class_2794)iIiIiIIIII3, class_5539.method_39034((int)iIiIiIIIII222, (int)n32));
        for (class_6797 n32 : iIiIiIIIII2.comp_335()) {
            if (n32 instanceof class_6793) {
                iIiIiIIIII6.IIIIiiIiii = ((CountPlacementModifierAccessor)n32).getCount();
                continue;
            }
            if (n32 instanceof class_6795) {
                iIiIiIIIII6.iiIiIIiiii = ((HeightRangePlacementModifierAccessor)n32).getHeight();
                continue;
            }
            if (!(n32 instanceof class_6799)) continue;
            iIiIiIIIII6.IIiIiIIiii = ((RarityFilterPlacementModifierAccessor)n32).getChance();
        }
        class_3037 iIiIiIIIII222 = ((class_2975)iIiIiIIIII2.comp_334().comp_349()).comp_333();
        if (!(iIiIiIIIII222 instanceof class_3124)) {
            throw new IllegalStateException("config for " + String.valueOf(iIiIiIIIII2) + "is not OreFeatureConfig.class");
        }
        class_3124 n32 = (class_3124)iIiIiIIIII222;
        iIiIIiiIiI iIiIIiiIiI6 = iIiIiIIIII6;
        iIiIIiiIiI6.iIiiiiIIII = n32.field_29064;
        iIiIIiiIiI6.iiiIiiIIII = n32.field_13723;
        if (((class_2975)iIiIiIIIII2.comp_334().comp_349()).comp_332() instanceof class_5875) {
            iIiIiIIIII6.iIIIIIIiII = 3 >> 1;
        }
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIIiIIiiiI.ALLATORIxDEMO("GpR]DY7iGXvh\u0007H\u0017\u8bcb\u66c4\u658b\u5207\u673c\u659a\u7269\u674c\uff6a"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map<class_6796, iIiIIiiIiI> map, List<class_7510.class_6827> list, class_7225.class_7226<class_6796> class_72262, class_5321<class_6796> class_53212, int n, Setting<Boolean> setting, Color color, class_2794 class_27942) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        void iIiIiIIIII3222;
        void iIiIiIIIII6;
        class_6796 iIiIiIIIII7 = class_72262;
        Map<class_6796, iIiIIiiIiI> iIiIiIIIII8 = map;
        iIiIiIIIII7 = (class_6796)iIiIiIIIII7.method_46747((class_5321)iIiIiIIIII6).comp_349();
        int iIiIiIIIII3222 = ((class_7510.class_6827)iIiIiIIIII3222.get((int)iIiIiIIIII5)).comp_304().applyAsInt(iIiIiIIIII7);
        iIiIIiiIiI iIiIiIIIII3222 = new iIiIIiiIiI(iIiIiIIIII7, (int)iIiIiIIIII5, iIiIiIIIII3222, (Setting<Boolean>)iIiIiIIIII4, (Color)iIiIiIIIII3, (class_2794)iIiIiIIIII2);
        iIiIiIIIII8.put(iIiIiIIIII7, iIiIiIIIII3222);
    }

    static {
        IIiiIIIIIi = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u716c\u70c2"))).description(IIIiIIiiiI.ALLATORIxDEMO("STVPuN\u0012\u000e"))).build();
        iIiIIiIIIi = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u94ae"))).description(IIIiIIiiiI.ALLATORIxDEMO("YIXRuN\u0012\u000e"))).build();
        iIIiiIiIiI = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u91be"))).description(IIIiIIiiiI.ALLATORIxDEMO("WT[XuN\u0012\u000e"))).build();
        iIIiiIIIIi = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u7eaa\u779c"))).description(IIIiIIiiiI.ALLATORIxDEMO("@\\SODTYYuN\u0012\u000e"))).build();
        iIiIiiiiII = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u94b3\u779c"))).description(IIIiIIiiiI.ALLATORIxDEMO("]^]]TYXuN\u0012\u000e"))).build();
        iIiIiIIIII = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u9777\u91d9\u779c"))).description(IIIiIIiiiI.ALLATORIxDEMO("PQK^OuN\u0012\u000e"))).build();
        IIiIiiiiII = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u94b3"))).description(IIIiIIiiiI.ALLATORIxDEMO("TS@KRNuN\u0012\u000e"))).build();
        IiiiiIiIiI = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u7eda\u5b95\u779c"))).description(IIIiIIiiiI.ALLATORIxDEMO("\\ZYBZ[XuN\u0012\u000e"))).build();
        iiiIiIIiii = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u77fb\u829e"))).description(IIIiIIiiiI.ALLATORIxDEMO("r\u0007\u001dUS@fFIQICFuN\u0012\u000e"))).build();
        iIIiIiiIiI = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIii.ALLATORIxDEMO("\u8f9e\u53c1\u6b83\u9ad7"))).description(IIIiIIiiiI.ALLATORIxDEMO("\\XQPRRDdSYHS\t\u0018"))).build();
        Setting[] settingArray = new Setting[0x4F & 0x3A];
        settingArray[2 & 5] = IIiiIIIIIi;
        settingArray[5 >> 2] = iIiIIiIIIi;
        settingArray[1 ^ 3] = iIIiiIiIiI;
        settingArray[--3] = iIIiiIIIIi;
        settingArray[--4] = iIiIiiiiII;
        settingArray[--5] = iIiIiIIIII;
        settingArray[0x66 & 0x1F] = IIiIiiiiII;
        settingArray[0x6F & 0x17] = IiiiiIiIiI;
        settingArray[0x5C & 0x2B] = iiiIiIIiii;
        settingArray[0x49 & 0x3F] = iIIiIiiIiI;
        iIiiiIiIii = new ArrayList<Setting>(Arrays.asList(settingArray));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Map<class_5321<class_1959>, List<iIiIIiiIiI>> ALLATORIxDEMO(Dimension dimension) {
        HashMap<class_6796, iIiIIiiIiI> hashMap;
        Dimension dimension2 = dimension;
        class_7225.class_7874 class_78742 = class_7887.method_46817();
        class_7225.class_7226 class_72262 = class_78742.method_46762(class_7924.field_41245);
        Object iIiIiIIIII3 = ((class_7145)class_78742.method_46762(class_7924.field_41250).method_46747(class_5317.field_25050).comp_349()).method_45546().comp_1014();
        Object object = switch (iiiiiiiIIi.ALLATORIxDEMO[dimension2.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> (class_5363)iIiIiIIIII3.get(class_5363.field_25412);
            case 2 -> (class_5363)iIiIiIIIII3.get(class_5363.field_25413);
            case 3 -> (class_5363)iIiIiIIIII3.get(class_5363.field_25414);
        };
        iIiIiIIIII3 = object.comp_1013();
        object = iIiIiIIIII3.method_12098().method_28443().stream().toList();
        List list = class_7510.method_44210(object, iIiIiIIIII2 -> ((class_1959)iIiIiIIIII2.comp_349()).method_30970().method_30983(), (boolean)(--1 != 0));
        HashMap<class_6796, iIiIIiiIiI> hashMap2 = hashMap = new HashMap<class_6796, iIiIIiiIiI>();
        List list2 = list;
        class_7225.class_7226 class_72263 = class_72262;
        HashMap<class_6796, iIiIIiiIiI> hashMap3 = hashMap;
        List list3 = list;
        class_7225.class_7226 class_72264 = class_72262;
        HashMap<class_6796, iIiIIiiIiI> hashMap4 = hashMap;
        List list4 = list;
        class_7225.class_7226 class_72265 = class_72262;
        HashMap<class_6796, iIiIIiiIiI> hashMap5 = hashMap;
        List list5 = list;
        class_7225.class_7226 class_72266 = class_72262;
        HashMap<class_6796, iIiIIiiIiI> hashMap6 = hashMap;
        List list6 = list;
        class_7225.class_7226 class_72267 = class_72262;
        HashMap<class_6796, iIiIIiiIiI> hashMap7 = hashMap;
        List list7 = list;
        class_7225.class_7226 class_72268 = class_72262;
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36070, 0x66 & 0x1F, IIiiIIIIIi, new Color(0x2F & 0x7F, 0x3F & 0x6C, 0x3F & 0x76), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72268, (class_5321<class_6796>)class_6816.field_36069, 0x76 & 0xF, IIiiIIIIIi, new Color(0x6F & 0x3F, 0x6D & 0x3E, 0x3F & 0x76), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list7, (class_7225.class_7226<class_6796>)class_72268, (class_5321<class_6796>)class_6816.field_36072, 0x36 & 0x4F, iIiIIiIIIi, new Color(0x76EE & 0x9FD, 0x30AD & 0x4FFF, 0x7F & 0x77), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap7, list7, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36073, 0x3F & 0x46, iIiIIiIIIi, new Color(0x63EF & 0x1CFC, 0x36BD & 0x49EF, 0x77 & 0x7F), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap7, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36071, 0x3E & 0x47, iIiIIiIIIi, new Color(0x1EF & 0x7EFC, 0x29BF & 0x56ED, 0x77 & 0x7F), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72267, (class_5321<class_6796>)class_6816.field_36075, 0x76 & 0xF, iIIiiIiIiI, new Color(0x66FF & 0x19F7, 0x5FF & 0x7AE5, 0x5E & 0x3F), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list6, (class_7225.class_7226<class_6796>)class_72267, (class_5321<class_6796>)class_6816.field_36076, 0x7F & 6, iIIiiIiIiI, new Color(0x4EF7 & 0x31FF, 0x2BFD & 0x54E7, 0x3E & 0x5F), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap6, list6, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36074, 0x47 & 0x3E, iIIiiIiIiI, new Color(0x6BF7 & 0x14FF, 0x7AFD & 0x5E7, 0x7F & 0x1E), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap6, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36056, 7, iIIiiIiIiI, new Color(247, 229, 30), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72266, (class_5321<class_6796>)class_6816.field_36054, 7, iIIiiIiIiI, new Color(247, 229, 30), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list5, (class_7225.class_7226<class_6796>)class_72266, (class_5321<class_6796>)class_6816.field_36077, 6, iIIiiIIIIi, new Color(245, 7, 23), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap5, list5, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36039, 6, iIIiiIIIIi, new Color(245, 7, 23), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap5, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36040, 6, iIiIiiiiII, new Color(33, 244, 255), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72265, (class_5321<class_6796>)class_6816.field_36042, 6, iIiIiiiiII, new Color(33, 244, 255), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list4, (class_7225.class_7226<class_6796>)class_72265, (class_5321<class_6796>)class_6816.field_36041, 6, iIiIiiiiII, new Color(33, 244, 255), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap4, list4, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_45664, 6, iIiIiiiiII, new Color(33, 244, 255), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap4, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36043, 6, iIiIiIIIII, new Color(8, 26, 189), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72264, (class_5321<class_6796>)class_6816.field_36044, 6, iIiIiIIIII, new Color(8, 26, 189), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list3, (class_7225.class_7226<class_6796>)class_72264, (class_5321<class_6796>)class_6816.field_36049, 6, IIiIiiiiII, new Color(239, 151, 2 & 5), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap3, list3, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36050, 6, IIiIiiiiII, new Color(239, 151, 3 & 4), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap3, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36046, 6, IiiiiIiIiI, new Color(27, 209, 45), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72263, (class_5321<class_6796>)class_6816.field_36057, 7, iiiIiIIiii, new Color(205, 205, 205), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap, list2, (class_7225.class_7226<class_6796>)class_72263, (class_5321<class_6796>)class_6816.field_36055, 7, iiiIiIIiii, new Color(205, 205, 205), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap2, list2, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36048, 7, iIIiIiiIiI, new Color(209, 27, 245), (class_2794)iIiIiIIIII3);
        iIiIIiiIiI.ALLATORIxDEMO(hashMap2, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.field_36047, 7, iIIiIiiIiI, new Color(209, 27, 245), (class_2794)iIiIiIIIII3);
        HashMap<class_5321<class_1959>, List<iIiIIiiIiI>> hashMap8 = new HashMap<class_5321<class_1959>, List<iIiIIiiIiI>>();
        object.forEach(class_68802 -> {
            void iIiIiIIIII2;
            Map iIiIiIIIII3 = class_68802;
            Map iIiIiIIIII4 = hashMap8;
            iIiIiIIIII4.put((class_5321)iIiIiIIIII3.method_40230().get(), new ArrayList());
            ((class_1959)iIiIiIIIII3.comp_349()).method_30970().method_30983().stream().flatMap(class_6885::method_40239).map(class_6880::comp_349).filter(((Map)iIiIiIIIII2)::containsKey).forEach(arg_0 -> iIiIIiiIiI.ALLATORIxDEMO(iIiIiIIIII4, (class_6880)iIiIiIIIII3, (Map)iIiIiIIIII2, arg_0));
        });
        return hashMap8;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map map, class_6880 class_68802, Map map2, class_6796 class_67962) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        Map iIiIiIIIII4 = class_67962;
        Map iIiIiIIIII5 = map;
        ((List)iIiIiIIIII5.get(iIiIiIIIII3.method_40230().get())).add((iIiIIiiIiI)iIiIiIIIII2.get(iIiIiIIIII4));
    }
}

