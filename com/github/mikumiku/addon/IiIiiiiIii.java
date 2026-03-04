/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.mixininterface.IClientPlayerInteractionManager
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.SlotUtils
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Block
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiiIiIii;
import com.github.mikumiku.addon.iIiiiIIiIi;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.mixininterface.IClientPlayerInteractionManager;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.SlotUtils;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiiiiIii {
    public static int iiiiiIIiIi;
    private static final IiiiiIiIii iIIiIiiiIi;
    public static int iIiIiIIIII;
    public static int ALLATORIxDEMO;

    public static void iiiIiIiiIi() {
        if (!MeteorClient.mc.field_1724.field_7512.method_34255().method_7960()) {
            MeteorClient.mc.field_1761.method_2906(MeteorClient.mc.field_1724.field_7512.field_7763, 0xFFFFFE5D & 0xFFFFFDBB, 2 & 5, class_1713.field_7790, (class_1657)MeteorClient.mc.field_1724);
        }
    }

    public static int IIIIiIIiII(class_1792 iIiIiIIIII2) {
        return IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2);
    }

    public static int ALLATORIxDEMO(class_2248 iIiIiIIIII2) {
        return IiIiiiiIii.ALLATORIxDEMO(class_1792.method_7867((class_2248)iIiIiIIIII2));
    }

    public static boolean IIIIiIIiII(class_1792 ... iIiIiIIIII2) {
        if (IiIiiiiIii.iiIIiIIiii(iIiIiIIIII2) || IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2)) {
            return true;
        }
        return false;
    }

    public static IiiiiIiIii iiiiIIIiII() {
        IiIiiiiIii.iIIiIiiiIi.iIiIiIIIII = class_1713.field_7790;
        return iIIiIiiiIi;
    }

    public static FindItemResult iiiIiIiiIi(Predicate<class_1799> iIiIiIIIII2) {
        if (MeteorClient.mc.field_1724 == null) {
            return new FindItemResult(3 & 4, 5 >> 3);
        }
        return IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2, 3 >> 2, MeteorClient.mc.field_1724.method_31548().method_5439());
    }

    static {
        iIIiIiiiIi = new IiiiiIiIii();
        iIiIiIIIII = -4 >> 2;
        ALLATORIxDEMO = -4 >> 2;
        iiiiiIIiIi = -4 >> 2;
    }

    public static int iiIIiIIiii(Class clazz) {
        int iIiIiIIIII2;
        Class clazz2 = clazz;
        int n = iIiIiIIIII2 = 3 & 4;
        while (true) {
            if (n >= 36) break;
            if (clazz2.isInstance(MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2).method_7909())) {
                return iIiIiIIIII2;
            }
            n = ++iIiIiIIIII2;
        }
        return -1;
    }

    public static FindItemResult iiiIiIiiIi(class_1792 iIiIiIIIII2) {
        return IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            class_1792 iIiIiIIIII2 = class_17992;
            class_1792 iIiIiIIIII3 = iIiIiIIIII2;
            if (iIiIiIIIII2.method_7909() != iIiIiIIIII3) {
                return --1 != 0;
            }
            return false;
        }, 3 >> 2, 0x4A & 0x3D);
    }

    public static List<Integer> ALLATORIxDEMO(Class clazz) {
        int iIiIiIIIII2;
        Class clazz2 = clazz;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = iIiIiIIIII2 = 2 & 5;
        while (true) {
            if (n >= 36) break;
            if (clazz2.isInstance(MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2).method_7909())) {
                arrayList.add(iIiIiIIIII2);
            }
            n = ++iIiIiIIIII2;
        }
        return arrayList;
    }

    public static int iiiIiIiiIi(Class clazz) {
        int iIiIiIIIII2;
        Class clazz2 = clazz;
        int n = iIiIiIIIII2 = 2 & 5;
        while (true) {
            if (n >= 45) break;
            class_1799 class_17992 = MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2);
            if (class_17992 != class_1799.field_8037) {
                if (clazz2.isInstance(class_17992.method_7909())) {
                    if (iIiIiIIIII2 < (0x3F & 0x49)) {
                        return iIiIiIIIII2 + (0x2E & 0x75);
                    }
                    return iIiIiIIIII2;
                }
                if (class_17992.method_7909() instanceof class_1747 && clazz2.isInstance(((class_1747)class_17992.method_7909()).method_7711())) {
                    if (iIiIiIIIII2 < (0x1B & 0x6D)) {
                        return iIiIiIIIII2 + (0x6F & 0x34);
                    }
                    return iIiIiIIIII2;
                }
            }
            n = ++iIiIiIIIII2;
        }
        return -1;
    }

    public static boolean ALLATORIxDEMO() {
        if (iIiIiIIIII == -4 >> 2) {
            return (3 & 4) != 0;
        }
        boolean bl = IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII, 3 >> 2);
        iIiIiIIIII = -4 >> 2;
        return bl;
    }

    public static boolean IIIIiIIiII(Predicate<class_1799> iIiIiIIIII2) {
        if (IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2) || IiIiiiiIii.iiiIiIiiIi(iIiIiIIIII2)) {
            return true;
        }
        return false;
    }

    public static void IIIIiIIiII(int iIiIiIIIII2) {
        IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2, iIiiiIIiIi.ALLATORIxDEMO());
    }

    public static void ALLATORIxDEMO() {
        MeteorClient.mc.field_1724.field_3944.method_52787((class_2596)new class_2815(MeteorClient.mc.field_1724.field_7512.field_7763));
    }

    public static void iiIIiIIiii(int iIiIiIIIII2) {
        IiIiiiiIii.iiiIiIiiIi(iIiIiIIIII2, 0x6D & 0x3F);
    }

    public static List<Integer> ALLATORIxDEMO(Predicate<class_1799> predicate) {
        int iIiIiIIIII2;
        Predicate<class_1799> predicate2 = predicate;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = iIiIiIIIII2 = 3 >> 2;
        while (true) {
            if (n >= 36) break;
            if (predicate2.test(MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2))) {
                arrayList.add(iIiIiIIIII2);
            }
            n = ++iIiIiIIIII2;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public static FindItemResult ALLATORIxDEMO(Predicate<class_1799> predicate, int n, int n2) {
        void iIiIiIIIII2;
        int iIiIiIIIII3 = n;
        Predicate<class_1799> iIiIiIIIII4 = predicate;
        if (MeteorClient.mc.field_1724 == null) {
            return new FindItemResult(3 & 4, 3 ^ 3);
        }
        int n3 = -1;
        int n4 = 5 >> 3;
        int n5 = iIiIiIIIII3 = iIiIiIIIII3;
        while (n5 <= iIiIiIIIII2) {
            class_1799 class_17992 = MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII3);
            if (iIiIiIIIII4.test(class_17992)) {
                if (n3 == -4 >> 2) {
                    n3 = iIiIiIIIII3;
                }
                n4 += class_17992.method_7947();
            }
            n5 = ++iIiIiIIIII3;
        }
        return new FindItemResult(n3, n4);
    }

    public static int ALLATORIxDEMO(Class clazz) {
        int iIiIiIIIII2;
        Class clazz2 = clazz;
        int n = iIiIiIIIII2 = 3 & 4;
        while (true) {
            if (n >= 36) break;
            class_1799 class_17992 = MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2);
            if (!class_17992.method_7960() && class_17992.method_7909() instanceof class_1747 && clazz2.isInstance(((class_1747)MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2).method_7909()).method_7711())) {
                return iIiIiIIIII2;
            }
            n = ++iIiIiIIIII2;
        }
        return -1;
    }

    public static FindItemResult ALLATORIxDEMO(class_1792 iIiIiIIIII2) {
        return IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            class_1792 iIiIiIIIII2 = class_17992;
            class_1792 iIiIiIIIII3 = iIiIiIIIII2;
            if (iIiIiIIIII2.method_7909() != iIiIiIIIII3) {
                return --1 != 0;
            }
            return false;
        }, 0xF & 0x79, 0x23 & 0x7F);
    }

    public static FindItemResult ALLATORIxDEMO() {
        return IiIiiiiIii.iiiIiIiiIi(class_1799::method_7960);
    }

    public static void iiiIiIiiIi(int iIiIiIIIII2) {
        iIiiiIIiIi.ALLATORIxDEMO(iIiIiIIIII2);
        MeteorClient.mc.method_1562().method_52787((class_2596)new class_2868(iIiIiIIIII2));
    }

    public static int iiiIiIiiIi(Predicate<class_1799> predicate) {
        int iIiIiIIIII2;
        Predicate<class_1799> predicate2 = predicate;
        int n = iIiIiIIIII2 = 3 ^ 3;
        while (true) {
            if (n >= 9) break;
            class_1799 class_17992 = MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2);
            if (predicate2.test(class_17992)) {
                return iIiIiIIIII2 + (0x7F & 0x24);
            }
            n = ++iIiIiIIIII2;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean IIIIiIIiII(class_1792[] class_1792Array, class_1799 class_17992) {
        int iIiIiIIIII2;
        class_1792[] class_1792Array2;
        class_1792[] class_1792Array3 = class_1792Array2 = class_1792Array;
        int n = class_1792Array2.length;
        int n2 = iIiIiIIIII2 = 3 ^ 3;
        while (n2 < n) {
            void iIiIiIIIII3;
            class_1792 class_17922 = class_1792Array3[iIiIiIIIII2];
            if (iIiIiIIIII3.method_7909() == class_17922) {
                return --1 != 0;
            }
            n2 = ++iIiIiIIIII2;
        }
        return false;
    }

    public static FindItemResult ALLATORIxDEMO(boolean bl, class_1792 ... class_1792Array) {
        Object iIiIiIIIII2 = class_1792Array;
        boolean iIiIiIIIII3 = bl;
        iIiIiIIIII2 = arg_0 -> IiIiiiiIii.IIIIiIIiII((class_1792[])iIiIiIIIII2, arg_0);
        if (iIiIiIIIII3) {
            return IiIiiiiIii.ALLATORIxDEMO((Predicate<class_1799>)iIiIiIIIII2);
        }
        if (IiIiiiiIii.ALLATORIxDEMO((Predicate<class_1799>)iIiIiIIIII2)) {
            return new FindItemResult(iIiiiIIiIi.ALLATORIxDEMO(), MeteorClient.mc.field_1724.method_6047().method_7947());
        }
        return IiIiiiiIii.ALLATORIxDEMO((Predicate<class_1799>)iIiIiIIIII2, 5 >> 3, 0x3E & 0x49);
    }

    public static void iiiIiIiiIi(int n, int n2) {
        int iIiIiIIIII2 = n2;
        int iIiIiIIIII3 = n;
        MeteorClient.mc.field_1761.method_2906(MeteorClient.mc.field_1724.field_7512.field_7763, SlotUtils.indexToId((int)iIiIiIIIII3), 3 & 4, class_1713.field_7790, (class_1657)MeteorClient.mc.field_1724);
        MeteorClient.mc.field_1761.method_2906(MeteorClient.mc.field_1724.field_7512.field_7763, iIiIiIIIII2, 3 & 4, class_1713.field_7790, (class_1657)MeteorClient.mc.field_1724);
        MeteorClient.mc.field_1761.method_2906(MeteorClient.mc.field_1724.field_7512.field_7763, SlotUtils.indexToId((int)iIiIiIIIII3), 3 >> 2, class_1713.field_7790, (class_1657)MeteorClient.mc.field_1724);
        iIiiiIIiIi.iiiIiIiiIi();
    }

    public static void ALLATORIxDEMO(class_1792 class_17922) {
        class_1792 class_17923 = class_17922;
        class_1792[] class_1792Array = new class_1792[5 >> 2];
        class_1792Array[3 >> 2] = class_17923;
        class_1792 iIiIiIIIII22 = IiIiiiiIii.ALLATORIxDEMO(class_1792Array);
        if (iIiIiIIIII22.found()) {
            int n = iIiiiIIiIi.ALLATORIxDEMO();
            class_1792 class_17924 = iIiIiIIIII22;
            int iIiIiIIIII22 = class_17924.slot();
            boolean bl = class_17924.isMainHand();
            if (!bl) {
                IiIiiiiIii.IIIIiIIiII().iiiiIIIiII(n).IIIIiIIiII(iIiIiIIIII22);
            }
            MeteorClient.mc.field_1761.method_2919((class_1657)MeteorClient.mc.field_1724, class_1268.field_5808);
            if (!bl) {
                IiIiiiiIii.IIIIiIIiII().iiiiIIIiII(n).IIIIiIIiII(iIiIiIIIII22);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static boolean ALLATORIxDEMO(int var0, boolean var1_1) {
        block4: {
            iIiIiIIIII = (int)var1_1;
            iIiIiIIIII = var0;
            if (iIiIiIIIII == (45 & 127)) {
                return --1 != 0;
            }
            if (iIiIiIIIII < 0) break block4;
            if (iIiIiIIIII > (120 & 15)) break block4;
            if (iIiIiIIIII == 0) ** GOTO lbl-1000
            if (IiIiiiiIii.iIiIiIIIII == -4 >> 2) {
                IiIiiiiIii.iIiIiIIIII = iIiiiIIiIi.ALLATORIxDEMO();
                v0 = iIiIiIIIII;
            } else lbl-1000:
            // 2 sources

            {
                if (iIiIiIIIII == 0) {
                    IiIiiiiIii.iIiIiIIIII = -4 >> 2;
                }
                v0 = iIiIiIIIII;
            }
            iIiiiIIiIi.ALLATORIxDEMO(v0);
            ((IClientPlayerInteractionManager)MeteorClient.mc.field_1761).meteor$syncSelected();
            return 5 >> 2;
        }
        return false;
    }

    public static FindItemResult ALLATORIxDEMO(Predicate<class_1799> iIiIiIIIII2) {
        if (IiIiiiiIii.iiiIiIiiIi(iIiIiIIIII2)) {
            return new FindItemResult(0x3F & 0x6D, MeteorClient.mc.field_1724.method_6079().method_7947());
        }
        if (IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2)) {
            return new FindItemResult(iIiiiIIiIi.ALLATORIxDEMO(), MeteorClient.mc.field_1724.method_6047().method_7947());
        }
        return IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2, 2 & 5, 0x3E & 0x49);
    }

    public static IiiiiIiIii IIIIiIIiII() {
        IiIiiiiIii.iIIiIiiiIi.iIiIiIIIII = class_1713.field_7791;
        return iIIiIiiiIi;
    }

    public static int iiIIiIIiii(class_1792 class_17922) {
        int iIiIiIIIII2;
        class_1792 class_17923 = class_17922;
        int n = iIiIiIIIII2 = 0x39 & 0x4F;
        while (true) {
            if (n >= 45) break;
            if (MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2).method_7909() == class_17923) {
                return iIiIiIIIII2;
            }
            n = ++iIiIiIIIII2;
        }
        return -1;
    }

    public static IiiiiIiIii iiIIiIIiii() {
        IiIiiiiIii.iIIiIiiiIi.iIiIiIIIII = class_1713.field_7790;
        IiIiiiiIii.iIIiIiiiIi.iIIiiIiIiI = 3 & 5;
        return iIIiIiiiIi;
    }

    public static IiiiiIiIii iiiIiIiiIi() {
        IiIiiiiIii.iIIiIiiiIi.iIiIiIIIII = class_1713.field_7794;
        return iIIiIiiiIi;
    }

    public static int iiiIiIiiIi(class_1792 class_17922) {
        int iIiIiIIIII2;
        class_1792 class_17923 = class_17922;
        int n = iIiIiIIIII2 = 5 >> 3;
        while (true) {
            if (n >= 9) break;
            if (MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2).method_7909() == class_17923) {
                return iIiIiIIIII2 + (0x34 & 0x6F);
            }
            n = ++iIiIiIIIII2;
        }
        return -1;
    }

    public static int ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        int n = iIiIiIIIII2 = 2 & 5;
        while (true) {
            if (n >= 45) break;
            class_1799 class_17992 = MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2);
            if (class_17992 != class_1799.field_8037) {
                if (class_17992.method_7909().method_7876().contains(string2)) {
                    if (iIiIiIIIII2 < (0x6F & 0x19)) {
                        return iIiIiIIIII2 + (0x67 & 0x3C);
                    }
                    return iIiIiIIIII2;
                }
                if (class_17992.method_7909() instanceof class_1747) {
                    if (iIiIiIIIII2 < (0x29 & 0x5F)) {
                        return iIiIiIIIII2 + (0x65 & 0x3E);
                    }
                    return iIiIiIIIII2;
                }
            }
            n = ++iIiIiIIIII2;
        }
        return -1;
    }

    public static List<Integer> ALLATORIxDEMO(class_1792 class_17922) {
        int iIiIiIIIII2;
        class_1792 class_17923 = class_17922;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        class_1792[] class_1792Array = new class_1792[3 & 5];
        class_1792Array[2 & 5] = class_17923;
        if (!IiIiiiiIii.ALLATORIxDEMO(class_1792Array).found()) {
            return arrayList;
        }
        int n = iIiIiIIIII2 = 0;
        while (true) {
            if (n >= 36) break;
            if (MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2).method_7909() == class_17923) {
                arrayList.add(iIiIiIIIII2);
            }
            n = ++iIiIiIIIII2;
        }
        return arrayList;
    }

    public static boolean iiIIiIIiii(Predicate<class_1799> predicate) {
        int iIiIiIIIII2;
        Predicate<class_1799> predicate2 = predicate;
        if (IiIiiiiIii.IIIIiIIiII(predicate2)) {
            return (4 ^ 5) != 0;
        }
        int n = iIiIiIIIII2 = 0;
        while (true) {
            if (n >= 8) break;
            class_1799 class_17992 = MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2);
            if (predicate2.test(class_17992)) {
                return (2 ^ 3) != 0;
            }
            n = ++iIiIiIIIII2;
        }
        return false;
    }

    public static boolean iiIIiIIiii(class_1792 ... iIiIiIIIII2) {
        return IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            int iIiIiIIIII2;
            class_1792[] class_1792Array2;
            class_1792[] class_1792Array3 = class_1792Array2 = iIiIiIIIII2;
            int n = class_1792Array2.length;
            int n2 = iIiIiIIIII2 = 5 >> 3;
            while (n2 < n) {
                void iIiIiIIIII3;
                class_1792 class_17922 = class_1792Array3[iIiIiIIIII2];
                if (iIiIiIIIII3.method_31574(class_17922)) {
                    return --1 != 0;
                }
                n2 = ++iIiIiIIIII2;
            }
            return false;
        });
    }

    public static FindItemResult iiiIiIiiIi(class_1792 ... iIiIiIIIII2) {
        return IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            int iIiIiIIIII2;
            class_1792[] class_1792Array2;
            class_1792[] class_1792Array3 = class_1792Array2 = iIiIiIIIII2;
            int n = class_1792Array2.length;
            int n2 = iIiIiIIIII2 = 3 ^ 3;
            while (n2 < n) {
                void iIiIiIIIII3;
                class_1792 class_17922 = class_1792Array3[iIiIiIIIII2];
                if (iIiIiIIIII3.method_7909() == class_17922) {
                    return 5 >> 2;
                }
                n2 = ++iIiIiIIIII2;
            }
            return false;
        });
    }

    public static FindItemResult ALLATORIxDEMO(class_2680 class_26802) {
        int iIiIiIIIII2;
        class_2680 class_26803 = class_26802;
        float f = 1.0f;
        int n = -4 >> 2;
        int n2 = iIiIiIIIII2 = 3 & 4;
        while (true) {
            if (n2 >= 9) break;
            class_1799 class_17992 = MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2);
            if (class_17992.method_7951(class_26803)) {
                float f2;
                float f3 = class_17992.method_7924(class_26803);
                if (f2 > f) {
                    f = f3;
                    n = iIiIiIIIII2;
                }
            }
            n2 = ++iIiIiIIIII2;
        }
        return new FindItemResult(n, 2 ^ 3);
    }

    public static FindItemResult ALLATORIxDEMO(class_1792 ... iIiIiIIIII2) {
        return IiIiiiiIii.iiiIiIiiIi((class_1799 class_17992) -> {
            int iIiIiIIIII2;
            class_1792[] class_1792Array2;
            class_1792[] class_1792Array3 = class_1792Array2 = iIiIiIIIII2;
            int n = class_1792Array2.length;
            int n2 = iIiIiIIIII2 = 5 >> 3;
            while (n2 < n) {
                void iIiIiIIIII3;
                class_1792 class_17922 = class_1792Array3[iIiIiIIIII2];
                if (iIiIiIIIII3.method_7909() == class_17922) {
                    return --1 != 0;
                }
                n2 = ++iIiIiIIIII2;
            }
            return false;
        });
    }

    public static void ALLATORIxDEMO(int n, int n2) {
        int iIiIiIIIII2 = n2;
        int iIiIiIIIII3 = n;
        if (iIiIiIIIII3 == ALLATORIxDEMO) {
            IiIiiiiIii.iiiIiIiiIi(iiiiiIIiIi);
            ALLATORIxDEMO = -4 >> 2;
            iiiiiIIiIi = -4 >> 2;
            return;
        }
        if (iIiIiIIIII3 - (0x7C & 0x27) != iIiIiIIIII2) {
            MeteorClient.mc.field_1761.method_2906(MeteorClient.mc.field_1724.field_7512.field_7763, iIiIiIIIII3, iIiIiIIIII2, class_1713.field_7791, (class_1657)MeteorClient.mc.field_1724);
        }
    }

    public static void ALLATORIxDEMO(int iIiIiIIIII2) {
        IiIiiiiIii.ALLATORIxDEMO(iIiIiIIIII2, iIiiiIIiIi.ALLATORIxDEMO());
    }

    public static boolean iiiIiIiiIi(class_1792 ... iIiIiIIIII2) {
        return IiIiiiiIii.iiIIiIIiii((class_1799 class_17992) -> {
            int iIiIiIIIII2;
            class_1792[] class_1792Array2;
            class_1792[] class_1792Array3 = class_1792Array2 = iIiIiIIIII2;
            int n = class_1792Array2.length;
            int n2 = iIiIiIIIII2 = 2 & 5;
            while (n2 < n) {
                void iIiIiIIIII3;
                class_1792 class_17922 = class_1792Array3[iIiIiIIIII2];
                if (iIiIiIIIII3.method_31574(class_17922)) {
                    return --1 != 0;
                }
                n2 = ++iIiIiIIIII2;
            }
            return false;
        });
    }

    private /* synthetic */ IiIiiiiIii() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static boolean iiiIiIiiIi(Predicate<class_1799> iIiIiIIIII2) {
        return iIiIiIIIII2.test(MeteorClient.mc.field_1724.method_6079());
    }

    public static int ALLATORIxDEMO(class_1792 iIiIiIIIII2) {
        return IiIiiiiIii.ALLATORIxDEMO((class_1799 class_17992) -> {
            class_1792 iIiIiIIIII2 = class_17992;
            class_1792 iIiIiIIIII3 = iIiIiIIIII2;
            if (iIiIiIIIII2.method_7909() == iIiIiIIIII3) {
                return (2 ^ 3) != 0;
            }
            return false;
        });
    }

    public static int ALLATORIxDEMO(Predicate<class_1799> predicate) {
        int iIiIiIIIII2;
        Predicate<class_1799> predicate2 = predicate;
        int n = iIiIiIIIII2 = 3 ^ 3;
        while (true) {
            if (n >= 45) break;
            class_1799 class_17992 = MeteorClient.mc.field_1724.method_31548().method_5438(iIiIiIIIII2);
            if (predicate2.test(class_17992)) {
                if (iIiIiIIIII2 < (0x1B & 0x6D)) {
                    return iIiIiIIIII2 + (0x74 & 0x2F);
                }
                return iIiIiIIIII2;
            }
            n = ++iIiIiIIIII2;
        }
        return -1;
    }

    public static boolean ALLATORIxDEMO(Predicate<class_1799> iIiIiIIIII2) {
        return iIiIiIIIII2.test(MeteorClient.mc.field_1724.method_6047());
    }

    public static IiiiiIiIii ALLATORIxDEMO() {
        IiIiiiiIii.iIIiIiiiIi.iIiIiIIIII = class_1713.field_7795;
        IiIiiiiIii.iIIiIiiiIi.ALLATORIxDEMO = 3 >> 1;
        return iIIiIiiiIi;
    }

    public static boolean ALLATORIxDEMO(class_1792 ... iIiIiIIIII2) {
        return IiIiiiiIii.iiiIiIiiIi((class_1799 class_17992) -> {
            int iIiIiIIIII2;
            class_1792[] class_1792Array2;
            class_1792[] class_1792Array3 = class_1792Array2 = iIiIiIIIII2;
            int n = class_1792Array2.length;
            int n2 = iIiIiIIIII2 = 3 >> 2;
            while (n2 < n) {
                void iIiIiIIIII3;
                class_1792 class_17922 = class_1792Array3[iIiIiIIIII2];
                if (iIiIiIIIII3.method_31574(class_17922)) {
                    return --1 != 0;
                }
                n2 = ++iIiIiIIIII2;
            }
            return false;
        });
    }
}

