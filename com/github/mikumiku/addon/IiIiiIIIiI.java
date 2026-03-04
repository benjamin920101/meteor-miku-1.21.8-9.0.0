/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalNear
 *  lombok.Generated
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.registry.Registries
 *  org.joml.Quaternionfc
 *  org.lwjgl.opengl.GL11
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IiIiIIiiii;
import com.github.mikumiku.addon.IiIiiiIIIi;
import java.util.Date;
import java.util.Set;
import lombok.Generated;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.meteorclient.utils.world.Dimension;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.registry.Registries;
import org.joml.Quaternionfc;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IiIiiIIIiI {
    public static void iiIIiIIiii() {
        Settings settings = BaritoneAPI.getSettings();
        settings.allowBreak.value = (3 ^ 3) != 0;
        settings.allowPlace.value = 3 >> 2;
    }

    public static boolean iiIIiIIiii(class_1792 iIiIiIIIII2) {
        if (Set.of(class_1802.field_8091, class_1802.field_8528, class_1802.field_8371, class_1802.field_8845, class_1802.field_8802, class_1802.field_22022).contains(iIiIiIIIII2)) {
            return --1 != 0;
        }
        return false;
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[5 >> 2];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 >> 2, stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = --2;
        int n3 = string2.length();
        int n4 = n3 - --1;
        char[] cArray = new char[n3];
        int n5 = n << n ^ (n2 << n2 ^ --3);
        int cfr_ignored_0 = (5 >> 1 ^ --5) << --4 ^ --4 << --1;
        int n6 = --2 << --3 ^ --4;
        int n7 = iIiIiIIIII2 = string3.length() - (2 ^ 3);
        int n8 = n4;
        String string4 = string3;
        while (n8 >= 0) {
            int n9 = n4--;
            cArray[n9] = (char)(n6 ^ (string2.charAt(n9) ^ string4.charAt(iIiIiIIIII2)));
            if (n4 < 0) break;
            int n10 = n4--;
            char c = cArray[n10] = (char)(n5 ^ (string2.charAt(n10) ^ string4.charAt(iIiIiIIIII2)));
            if (--iIiIiIIIII2 < 0) {
                iIiIiIIIII2 = n7;
            }
            n8 = n4;
        }
        return new String(cArray);
    }

    @Generated
    private /* synthetic */ IiIiiIIIiI() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IIiIIIIIii.ALLATORIxDEMO("=#Hn9\rJ=:\f\u000b<\u000fij\u8b9f\u66be\u65d8\u527a\u6768\u65da\u7200\u6766\uff69"));
        }
        throw new UnsupportedOperationException(IiIiiiIIIi.ALLATORIxDEMO("\u0012\u00101\u0015#T?R(W<\u0003+\u0010*\tz\u001d\u00076%\t\u0017z%\u0014 Z\u0007;\n4\u000b.d\u0018\u0001zxA7\u000e\"\u00130\u00138\u0013vI"));
    }

    public static String ALLATORIxDEMO(class_1792 iIiIiIIIII2) {
        return class_7923.field_41178.method_10221((Object)iIiIiIIIII2).method_12832();
    }

    public static boolean ALLATORIxDEMO(class_2338 class_23382) {
        class_2338 class_23383 = class_23382;
        class_2338 iIiIiIIIII2 = class_310.method_1551();
        if (iIiIiIIIII2.field_1687.method_8320(class_23383).method_26215() && BlockUtils.canPlace((class_2338)class_23383) && !iIiIiIIIII2.field_1687.method_8320(class_23383.method_10074()).method_26215()) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    public static String ALLATORIxDEMO(class_1799 iIiIiIIIII2) {
        return class_7923.field_41178.method_10221((Object)iIiIiIIIII2.method_7909()).method_12832();
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(class_2338 class_23382, double d) {
        void iIiIiIIIII2;
        class_2338 class_23383 = class_23382;
        class_2338 iIiIiIIIII3 = class_310.method_1551();
        if (iIiIiIIIII3.field_1724 == null || iIiIiIIIII3.field_1687 == null) {
            return false;
        }
        iIiIiIIIII3 = iIiIiIIIII3.field_1724.method_24515();
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        class_23392.method_10101((class_2382)class_23383);
        class_23392.method_33098(iIiIiIIIII3.method_10264());
        double d2 = iIiIiIIIII3.method_10262((class_2382)class_23383);
        void v0 = iIiIiIIIII2;
        void var7_5 = v0 * v0;
        if (d2 <= var7_5) {
            BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
            return (2 ^ 3) != 0;
        }
        if (!BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
            IiIiiIIIiI.iiIIiIIiii();
            iIiIiIIIII3 = new GoalNear(class_23383, (int)iIiIiIIIII2 - (5 >> 2));
            if (iIiIiIIIII2 <= 0.0) {
                iIiIiIIIII3 = new GoalBlock(class_23383);
            }
            BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)iIiIiIIIII3);
        }
        return false;
    }

    public static boolean iiIIiIIiii() {
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }

    public static boolean iiiIiIiiIi(class_1792 iIiIiIIIII2) {
        if (Set.of(class_1802.field_8647, class_1802.field_8387, class_1802.field_8403, class_1802.field_8335, class_1802.field_8377, class_1802.field_22024).contains(iIiIiIIIII2)) {
            return (3 & 5) != 0;
        }
        return false;
    }

    public static void iiiIiIiiIi() {
        int n;
        IIiIIIIIii.ALLATORIxDEMO("\u251e\u2538\u253a\u2518\u252c\u2538\u253a\u2518\u253a\u2518\u251a\u2538\u253a\u2518\u2530\u2512\u253bD\u253fl\u0018/\u2535fJhW\u25dd\u25e3\u25c1VtAc\u257c/Nl\u253e\u2518\u2538\u251a\u2510\u2504\u253e\u251c\u253dB\u2508\u251a\u2526\u2504\u254e/B`G\u25cd\u25ef\u25cdLnMo\u257c/jH\u253bh{H\u253bhXh\u251bHjH\u251e\u2538\u253a\u2518\u251db\u253bh\\h\u253bhj\u25e0\u25e2\u25c0\u25c2\u25e0JhJ\u2519jHJ\u2528\u2530\u2512\u253c\u2522\u253e\u251c\u257d\u256cDfJ\u2519WeK\u2518|\u2534\u2531\u2513\u257d\u256cNl\u25e2\u25c0\u25e0\u25c2\u25fetNl\u253bhHj\u2527t\u001e/\u2533`Se\u2536eLn\u2537\u251f\u257d\u255f\u2517b\u253bh}H\u253bhJ\u25c0\u25c2\u25e0\u25c2\u25e0jHJ\u2519jHJ\u2512\u253a\u2518\u253a\u2521\u251a\u2538\u253a\u2515@\u2508\u253a\u2518\u253a\u252bjHJh\u25e8\u25ca\u25e4nNl\r\u256f\u2534\u2516\u253a\u251f}\u2504KqV\u2505Ac\r/\u25e6\u25c4\u25e2hHjV\u2505ZyJ\u2519b\u2510\u2526\u2504\u257d\u2566\u2532\u2510\u2537\u2515\u2537\u2515\u253c\u251e\u253d\u251f\r/\u251a\u2501\u253a\u2518\u251a\u2535`\u251c\u253a\u2518\u251a\u250e\u251a\u2538\u251a\u250e\u253a\u2518\u251a\u250e\u253a\u2518\u253a\u252e\u253a\u2518\u251a\u250e\u253a\u2518\u251a\u250e\u253a\u2518\u253a\u252e\u251a\u2538\u253a\u252e\u2530\u2512\u253c\u2519d\u251d\r6D\u2517[xW\u2504ZxV\u2505Pq\r\u255e_\u007fJ\u2519Y~V\u2505_yJ\u2519Y|V\u2505\u001c8B\u2511m\u2525\u2537\u2515\u253c\u2522\u253d\u251f\u257d\u2563\u251a\u2538\u253a\u2524\u251a\u2538\u253a\u2524\u253a\u2518\u251a\u2504\u251a\u2538\u251a\u2504\u253a\u2518\u251a\u2504\u253a\u2518\u253a\u2524\u253a\u2518\u251a\u250b`\u2519{PJ\u2519[qj\u2539Xx@\u2513^\u007fN\u251d\u001f=D\u2517X{W\u2504Y}V\u2505Sv\r\u255e\\zJ\u2519b\u252a\u2526\u2504\u253e\u2520\u253a\u2518\u2538\u2526\u2526\u2504\u257d\u2563\u2532\u2510\u2537\u2529\u2537\u2515\u253c\u2522\u253d\u251f\u257d\u2563\u251a\u2538\u253a\u2524\u251a\u2538\u253a\u2524\u253a\u2518\u251a\u250b@\u2539x_J\u2519xPJ\u2519XqJ\u2519yXJ\u2519yYJ\u2519Yzj\u2539Y{@\u2513_zN\u251d\u001e:D\u2517`\u2512\u2527\u2505\u253b\u2520\u2526\u2504\u2531\u252a\u257d\u255f\u253e\u2525\u253a\u2518\u2538\u2523\u2526\u2504\u253e\u2525\u253a\u2518\u2538\u2523\u2526\u2504\u257d\u2566\u2532\u2510\u2537\u252c\u2537\u2515\u253c\u2513g\u251b\u257d\u255f\u251a\u250e\u253a\u2518\u251a\u250e\u253a\u2518\u253a\u252e\u251a\u2538\u251a\u250e\u251a\u2538\u253a\u252e\u251a\u2538\u253a\u252e\u253a\u2518\u253a\u252e\u251a\u2538\u253a\u252e\u251a\u2538\u253a\u251f`\u2519y^J\u2519SuL\u251f]t\r\u255eW\u007fJ\u2519CeK\u2518BeA\u2512\u0019=N\u251d^{H\u251bB`N\u251d`\u2512\u2538\u251a\u2526\u253d\u257d\u255f\u2532\u2529\u2537\u2515\u2537\u252c\u253c\u251e\u253d\u2526\u257d\u255f\u251a\u2501\u253a\u2518\u251a\u2501\u253a\u2518\u253a\u2521\u251a\u2538\u251a\u2501\u251a\u2538\u253a\u2515@b");
        IiIiiiIIIi.ALLATORIxDEMO("\u2510\u252a\u2516\u2528\u253e\u2536\u2553\u256d\u251c\u2522\u2519\u2527\u2519\u2527\u2512\u252c\u2514w\u2552\u001dQz\u2515ZDzd\u25f2\u25cc\u25f2DzDz\u2535zdZD\u250e\u2514\u252a\u2514\u251c\u2514\u252a\u2534\u250dN\u251a\u2534\u250a\u2514\u2519dZDz\u25cc\u25f2\u25c6Pb\\`\u252f#\u001djT\u2515ZhG\u2514[jF\u251eQ#\u001d\u2514\u252e\u2514\u252a\u2511r\u2509Fv^\u2515Zf\u25f0\u25d0\u25ee\u258b\u25b5\u25c4Ri\u2526iWb\u251c\u2513\u252d\u2553\u2551\u2534\u250a\u2514\u2519Dzd\u252bdJD\u250bn\u253a\u2534\u250a\u2514\u2519Dz\u25cc\u25f2\u25cc\u25f2\u25cc\u25f2Dz\u2515ZDz\u2515ZwZ\u2535zpZ\u251fPb\\\u251a\u252e\u2553\u256d\u2517~\u2515ZnG\u2514[x\u25ee\u25c7\u25f9\u258b\u25b5\u25c8^d\u252bfXx\u253c\u2510\u252e\u2514\u2513\u2516\u2528\u2508\u253b\t\u255d\u251c\u2522\u2519\u2514iWb\\\u25cb\u25f5\u258b\u001dDzd\u251a\u2534\u250a\u2514\u252dN\u252bDbD\u250bDzdZ\u25ec\u25d2\u25ccZdZd\u252bPod\u252bD\u21cadNqZYz\u544c\u626a\u7e9d\u67ecj.%\rvQ>T7\u00166\u0013lq\u2502\u2536\u251f\u2521\u256a\u256d\u2510\u252e\u2514\u252a\u2516\u2528\u2508\u2536\u2510\u252e\u2514\u252a\u252f\u2528\u2508\u2536\u255e7\u2518\u2522\u2519\u2527\u252f\u2527\u2512\u252c\u2525\u252d\u2553\u256d\u2502\u250a\u2514\u252a\u2502\u250a\u2514\u252a\u2522\u252a\u2534\u250a\u2502\u250a\u2534\u250a\u2522\u252a\u2534\u250a\u2522\u252a\u2514\u252a\u2513p\u2535z}Z\u2535ktZ\u2515KUz\u2515K|P\u2513Ms^\u2552\f~T\u2515KlG\u2514JnF\u251e@4\u001d\u2511^d\u21eaf\u80b4\u535d\u7b4a\u4e40\u8832N\u251a\u2516\u2528\u2508\u250a\u2553\u256d\u251c\u251e\u2519\u2527\u2519\u251b\u2512\u252c\u2513\u2511\u2553\u256d\u2534\u2536\u2514\u252a\u2534\u2536\u2514\u252a\u2514\u2516\u2534\u250a\u2534\u2536\u2534\u250a\u2514\u2519n\u250buBd\u252buCD\u250bvJD\u250bvKd\u252bVhd\u252b|Cb\u252drJ#\u256cxAd\u252bkQe\u252axF\u21dfQ\u80cf\u5338\u7b6c\u4ef2\u8808p\u2526\u2528\u2508\u2536\u252c\u252e\u2514\u252a\u252a\u2528\u2508\u2536\u256f\u256d\u251c\u2522\u2525\u2527\u2519\u2527\u252e\u252c\u2513\u252d\u256f\u256d\u2534\u250a\u2528\u252a\u2534\u250a\u2528\u252a\u2514\u252a\u2507P\u2535hSz\u2515H\\z\u2515H}Z\u2515ITz\u2515IUz\u2515IvZ\u2535iwZ\u251fCv\\\u2511M6\u001d\u251bTd\u21eay\u80ab\u5340\u7b57\u4e51\u882aE\u252b\u2553\u256d\u2510\u2517\u2514\u252a\u2516\u2511\u2508\u2536\u2510\u2517\u2514\u252a\u2516\u2511\u2508\u2536\u2553\u2554\u251c\u2522\u2519\u251e\u2519\u2527\u2512\u2515\u2513\u252d\u2553\u2554\u2534\u250a\u2514\u2527n\u250e\u2514\u252a\u2514\u251c\u2534\u250a\u2534\u253c\u2534\u250a\u2514\u251c\u2534\u250a\u2514\u251c\u2514\u252a\u2514\u251c\u2534\u250a\u2514\u251c\u2534\u250a\u2514\u251c\u2514\u252a\u2534\u253c\u2514\u252a\u251e\u2527H\u252dsH#\u256cyCd\u252bj_e\u252ak_o\u25207\r`\u252fpKf\u2529lT`\u252fpIf\u2529lR#\u256clR\u21d9W\u5fa2\u6300\u684d\\kM}\u0005MP\u251e\u252a\u2534\u250a\u252d\u252a\u2514\u252a\u250d\u250a\u2534\u250a\u250d\u250a\u2514\u252a\u250d\u250a\u2514\u252a\u252d\u252a\u2514\u252a\u250d\u250a\u2514\u252a\u250d\u250a\u2514\u252a\u252d\u252a\u2534\u250a\u2519p");
        IIiIIIIIii.ALLATORIxDEMO("\u253c\u253a\u2518\u2530\u2512\u253c\u251e\u253e\u251c\u257d\u255f\u2534\u2516\u253a\u2518\u2527\u2505\u253b\u2519\u2526\u2504\u2531\u2513\u257d\u255f\u253e\u251c\u253a\u2518\u2538\u251a\u2526\u2504\u253e\u251c\u253a\u2518\u2538\u251a\u2526\u2504\u257d\u255f\u2532\u2510\u2537\u2515\u2537\u2515\u253c\u251e\u253d\u251f\u257d\u255f\u251db\u253bhjHJhJhjHjHjHJhjH\u73c3\u5bfe\u7203\u5489\u6865h\u001a\u0004\u000b1/\u001a#&\u001c-$\u001c\u0005:\u0019bLnNl\r/DfJhW\u2504a\u2529\u2526\u2504\u2531\u2513\u257d\u255f\u253e\u251c\u253a\u2518\u2538\u251a\u2526\u2504\u253e\u251c\u253a\u2518\u2538\u251a\u2526\u2504\u257d\u255f\u2532\u2510\u2537\u2515\u2537\u2515\u253c\u251e\u253d\u251f\u257d\u255f\u251a\u2538\u253a\u2518\u251a\u2538\u253a\u2518\u253a\u2518\u251a\u2538\u251a\u2538\u251a\u2538\u253a\u2518\u2529b\u253bhJhJhjHJhjHJhJhjHJh@b\u21fdn\u80a2\u5349\u90c5\u5209D\u21d7JhWuKiVtAc\r/NlJhHjVtN\u251d`\u2519\u253c\u251a\u2526\u2504\u254b\u255f\u2532\u2510\u2501\u2515\u2537\u2515\u250a\u251e\u253d\u251f\u254b\u255f\u251a\u2538\u250c\u2518\u251a\u2538\u250c\u2518\u253a\u2518\u252c\u2538\u251a\u2538\u252c\u2538\u253a\u2518\u251db\u253b\u2519JqJ\u2519{XJ\u2519{YJ\u2519[zj\u2539[{@\u2513]zN\u251d\u001c:D\u2517[~W\u2504Z~V\u2505k\u2512\u254d\u255f\u253e\u251c\u2506\u2518\u2538\u251a\u251a\u2504\u253e\u251c\u2506\u2518\u2538\u251a\u251a\u2504\u257d\u255f\u250e\u2510\u2537\u2515\u250b\u2515\u253c\u251e\u2501\u251f\u257d\u255f\u2526\u2538\u253a\u2518\u2529b\u253b\u2519[pj\u2539{Qj\u2539Xxj\u2539XyJ\u2519Xzj\u2539X{j\u2539X|J\u2519x]J\u2519RtL\u251fd\u251d\u254d\u255f\u2534\u2516\u2506\u2518\u2527\u2505\u2507\u2519\u2526\u2504\u250d\u2513\u257d\u255f\u2502\u251c\u253a\u2518\u2504\u251a\u2526\u2504\u2502\u251c\u253a\u2518\u2504\u251a\u2526\u2504\u2541\u255f\u2532\u2510\u2504O\u2536\u2514^yM\u251e\u001f7j\u2539Xqj\u2539YxJ\u2519yYj\u2539yZJ\u2519y[J\u2519Y|J\u2519y]J\u2519@\u2539\u2530\u2518\u253a\u2518\u2523\u2538\u253a\u2518\u2509\u2512\u253c\u251e\u2507\u251c\u257d\u255f\u250d\u2516\u253a\u2518\u251e\u2505\u253b\u2519\u251f\u2504\u2531\u2513\u2544\u255f\u253e\u251c\u2503\u2518\u2538\u251a\u252b^\u253flJhHjVt\r/B`GeGeLnMo\r/\u21d9H\u5f81\u633f\u6845H\u21f9hJhjHjHjHJhjHJhJhJhjH\u253bB\u251b\u253c\u253a\u2518\u253a\u252e\u251a\u2538\u253a\u252e\u2530\u2512\u253c\u2528\u253e\u251c\u257d\u2569\u2534\u2516\u253a\u252e\u2527\u2505\u253b\u252f\u2526\u2504\u2531\u2525\u257d\u255f\u253e\u252a\u253a\u2518\u2538\u251d|\u2505\u253flZh\u2539jGt\u257c/P`\u2536eTe\u253dnYo\u257c/\u007fH\u253bh|H\u253bh]h\u251bHrH\u251bb\u253b\u2512\u251a\u2538\u253a\u2521\u253a\u2518\u253a\u2521\u251a\u2538\u253a\u2521\u251a\u2538\u253a\u2521\u253a\u2518\u251a\u2501\u253a\u2518\u2530\u252b\u253c\u251e\u253e\u2525\u257d\u255f\u2534\u252f\u253a\u2518\u2527\u2508a\u2518VtA\u21d2\u5242\u6244NxZ\u21d9HjVtNlJhHjVt\r/B`GeGeLnMo\r/jHJhjHJhJhjHjH\u251bb\u2530\u2518\u251a\u2538\u253a\u2518\u253a\u2518\u253a\u2518\u251a\u2538\u253a\u2518\u251a\u2538\u253a\u2518\u253a\u2518\u251a\u2538\u253a\u2518\u2530\u2512\u253c\u251e\u253e\u251c\u257d\u255f\u2534\u2516\u253a\u2518\u2527\u2505\u253b\u2519\u2526\u2504\u2531\u2513\u257d\u255f\u253e\u251c\u253a\u2518\u2538\u251a\u2526\u2504\u253e\u2511`\u251c\u2538\u251a\u2526\u2504\u257d\u2569\u2532\u2510\u2537\u2515\u2537\u2523\u253c\u251e\u253d\u251f\u257d\u2569\u251a\u2538\u253a\u2518\u251a\u253f`\u2519J{|Hj\u2539j[]hj\u2539J{RhJ\u2519j[Shj\u2539J|ZB\u2510\u2538\u253a\u2518\u2530\u2512\u2505\u251e\u253e\u251c\u257d\u255f\u250d\u2516\u253a\u2518\u2527\u2505\u2502\u2519\u2526\u2504\u2531\u2513\u2570\u0005\u595a\u7698J\u80b0\u755aj\u62d2\u812bN\u9738\u5b3aB\u2532\u251a\u2526\u2504\u2544\u255f\u2532\u2510\u250e\u2515\u2537\u2515\u2505\u251e\u253d\u251f\u2544\u255f\u251a\u2538\u2503\u2518\u251a\u2538\u2503\u2518\u253a\u2518\u2523\u2538\u251a\u2538\u2523\u2538\u253a\u2518\u2517b");
        class_310 class_3102 = class_310.method_1551();
        int n2 = n = 3 >> 2;
        while (true) {
            if (n2 > 45) break;
            Object object = class_3102.field_1724.method_31548().method_5438(n);
            if (!object.method_7960()) {
                object = object.method_7909().method_63680().getString();
                IiIiIIiiii.iiiiIIIiII(n + ": " + (String)object);
            }
            n2 = ++n;
        }
    }

    public static void ALLATORIxDEMO() {
        BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
    }

    public static boolean ALLATORIxDEMO(String string, boolean bl) {
        boolean bl2;
        boolean iIiIiIIIII2 = bl;
        String iIiIiIIIII3 = string;
        try {
            Class.forName(iIiIiIIIII3, iIiIiIIIII2, Thread.currentThread().getContextClassLoader());
            bl2 = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return (3 ^ 3) != 0;
        }
        return bl2;
    }

    public static boolean iiiIiIiiIi() {
        return PlayerUtils.getDimension().equals((Object)Dimension.Overworld);
    }

    public static boolean ALLATORIxDEMO() {
        return PlayerUtils.getDimension().equals((Object)Dimension.End);
    }

    public static boolean ALLATORIxDEMO(class_1792 class_17922) {
        class_1792 iIiIiIIIII2;
        class_1792[] class_1792Array = new class_1792[0x3F & 0x59];
        class_1792Array[3 >> 2] = class_1802.field_8267;
        class_1792Array[--1] = class_1802.field_8577;
        class_1792Array[1 ^ 3] = class_1802.field_8570;
        class_1792Array[--3] = class_1802.field_8370;
        class_1792Array[--4] = class_1802.field_8283;
        class_1792Array[--5] = class_1802.field_8873;
        class_1792Array[0x7F & 6] = class_1802.field_8218;
        class_1792Array[7 & 0x7F] = class_1802.field_8313;
        class_1792Array[0x78 & 0xF] = class_1802.field_8743;
        class_1792Array[0x5D & 0x2B] = class_1802.field_8523;
        class_1792Array[0x2F & 0x5A] = class_1802.field_8396;
        class_1792Array[0xB & 0x7F] = class_1802.field_8660;
        class_1792Array[0x2D & 0x5E] = class_1802.field_8862;
        class_1792Array[0x5F & 0x2D] = class_1802.field_8678;
        class_1792Array[0x6E & 0x1F] = class_1802.field_8416;
        class_1792Array[0x1F & 0x6F] = class_1802.field_8753;
        class_1792Array[0x5B & 0x34] = class_1802.field_8805;
        class_1792Array[0x3F & 0x51] = class_1802.field_8058;
        class_1792Array[0x13 & 0x7E] = class_1802.field_8348;
        class_1792Array[0x5F & 0x33] = class_1802.field_8285;
        class_1792Array[0x57 & 0x3C] = class_1802.field_22027;
        class_1792Array[0x55 & 0x3F] = class_1802.field_22028;
        class_1792Array[0x5E & 0x37] = class_1802.field_22029;
        class_1792Array[0x37 & 0x5F] = class_1802.field_22030;
        class_1792Array[0x5A & 0x3D] = class_1802.field_8090;
        if (Set.of(class_1792Array).contains(iIiIiIIIII2)) {
            return 5 >> 2;
        }
        return false;
    }

    public static boolean ALLATORIxDEMO(class_2338 class_23382, class_2248 class_22482) {
        class_2338 iIiIiIIIII2 = class_22482;
        class_2338 iIiIiIIIII3 = class_23382;
        return class_310.method_1551().field_1687.method_8320(iIiIiIIIII3).method_27852((class_2248)iIiIiIIIII2);
    }

    public static int ALLATORIxDEMO(class_1792 iIiIiIIIII2) {
        return class_310.method_1551().field_1724.method_31548().method_18861(iIiIiIIIII2);
    }

    public static class_2338 ALLATORIxDEMO() {
        int n;
        class_2338 class_23382;
        int n2;
        class_310 class_3102 = class_310.method_1551();
        class_2350[] class_2350Array = class_3102.field_1724.method_5735();
        class_2338 class_23383 = class_3102.field_1724.method_24515();
        class_2338 class_23384 = class_23383.method_10093((class_2350)class_2350Array);
        if (IiIiiIIIiI.ALLATORIxDEMO(class_23384)) {
            return class_23384;
        }
        class_2350[] class_2350Array2 = new class_2350[3];
        class_2350Array2[3 >> 2] = class_2350Array.method_10170();
        class_2350Array2[3 >> 1] = class_2350Array.method_10160();
        class_2350Array2[1 ^ 3] = class_2350Array.method_10153();
        class_2350Array = class_2350Array2;
        int n3 = class_2350Array2.length;
        int n4 = n2 = 5 >> 3;
        while (n4 < n3) {
            class_2350 class_23502 = class_2350Array[n2];
            class_23382 = class_23383.method_10093(class_23502);
            if (IiIiiIIIiI.ALLATORIxDEMO(class_23382)) {
                return class_23382;
            }
            n4 = ++n2;
        }
        int n5 = n = 1;
        while (true) {
            if (n5 < -1) break;
            int n6 = 3 ^ 3;
            class_2338 class_23385 = class_23383.method_10069(n6, n, n6);
            if (IiIiiIIIiI.ALLATORIxDEMO(class_23385)) {
                return class_23385;
            }
            n5 = n -= 2;
        }
        int n7 = n = 1;
        while (true) {
            if (n7 > 3) break;
            int n8 = -n;
            while (n8 <= n) {
                int n9;
                int n10 = -n;
                while (n10 <= n) {
                    block14: {
                        block15: {
                            if (Math.abs(n9) == --1 && n2 == 0) break block14;
                            if (n9 != 0) break block15;
                            if (Math.abs(n2) == 5 >> 2) break block14;
                        }
                        if (!(n9 == 0 && n2 == 0 || Math.abs(n9) != n && Math.abs(n2) != n)) {
                            int n11;
                            int n12 = n11 = -1;
                            while (true) {
                                if (n12 > 1) break;
                                class_23382 = class_23383.method_10069(n9, n11, n2);
                                if (IiIiiIIIiI.ALLATORIxDEMO(class_23382)) {
                                    return class_23382;
                                }
                                n12 = ++n11;
                            }
                        }
                    }
                    n10 = ++n2;
                }
                n8 = ++n9;
            }
            n7 = ++n;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(String string, double d, double d2, double d3, float f, int n) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        String iIiIiIIIII6;
        String string2 = string;
        class_310 class_3102 = class_310.method_1551();
        class_4184 iIiIiIIIII7 = class_3102.field_1773.method_19418();
        class_243 class_2432 = iIiIiIIIII7.method_19326();
        String string3 = iIiIiIIIII6 = new class_4587();
        String string4 = iIiIiIIIII6;
        string4.method_22903();
        string4.method_22904((double)(iIiIiIIIII5 - class_2432.field_1352), (double)(iIiIiIIIII4 - class_2432.field_1351), (double)(iIiIiIIIII3 - class_2432.field_1350));
        string3.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-iIiIiIIIII7.method_19330()));
        string3.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(iIiIiIIIII7.method_19329()));
        string3.method_22905((float)(-iIiIiIIIII2), (float)(-iIiIiIIIII2), (float)iIiIiIIIII2);
        float cfr_ignored_0 = (float)class_3102.field_1772.method_1727(string2) / 2.0f;
        GL11.glDepthFunc((int)(0x2E7F & 0x5387));
        class_3102.method_22940().method_23000().method_22993();
        GL11.glDepthFunc((int)(0x2613 & 0x5BEF));
        iIiIiIIIII6.method_22909();
    }

    public static boolean ALLATORIxDEMO(String iIiIiIIIII2) {
        return IiIiiIIIiI.ALLATORIxDEMO(iIiIiIIIII2, (2 & 5) != 0);
    }
}

