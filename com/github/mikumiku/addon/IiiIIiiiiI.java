/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIIiII;
import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.IiIiiiIIIi;
import com.github.mikumiku.addon.IiiiiiIIii;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.ThreadPool;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.structure.EndCity;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcfeature.structure.generator.structure.EndCityGenerator;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IiiIIiiiiI {
    private List<Pair<Generator.ILootType, BPos>> iIiIiIIIII;
    private EndCityGenerator ALLATORIxDEMO;

    public void iIiIiIiIii() {
        IiiIIiiiiI iiiIIiiiiI = iterator;
        long l = -4425006226675986357L;
        IiiIIiiiiI iiiIIiiiiI2 = iiiIIiiiiI;
        iiiIIiiiiI2.ALLATORIxDEMO(l, new BPos(0xFFFFFEE4 & 0xFFFFF5DB, 3 ^ 3, 0xFFFFFEE4 & 0xFFFFFFDB).toChunkPos(), MCVersion.v1_16_5);
        Object[] objectArray = new Object[--3];
        objectArray[3 >> 2] = 0x5DBB & 0x22DF;
        objectArray[--1] = iiiIIiiiiI.ALLATORIxDEMO.getGlobalPieces().size();
        objectArray[5 >> 1] = IiIiiIIIiI.ALLATORIxDEMO("-J\u0018\u0000\u001aP\u0005EYC\u0001VPK\u001fA\bK]\u0011\u001aj<T\u0018\u0002\tj8\"-P\u0012R\u0018P]Q\u0014x8");
        iiiIIiiiiI2.ALLATORIxDEMO(objectArray);
        Object[] objectArray2 = new Object[5 >> 2];
        objectArray2[2 & 5] = iiiIIiiiiI.ALLATORIxDEMO.hasShip();
        iiiIIiiiiI.iiiIiIiiIi(objectArray2);
        Iterator iterator = new EndCity(MCVersion.v1_16_5).getLoot(l, iiiIIiiiiI.ALLATORIxDEMO, new ChunkRand(), 3 >> 2);
        l = 0L;
        Iterator iterator2 = iterator = iterator.iterator();
        while (iterator2.hasNext()) {
            ChestContent chestContent = (ChestContent)iterator.next();
            l += (long)chestContent.getCount(iIiIiIIIII2 -> iIiIiIIIII2.getName().contains(IiIiiIIIiI.ALLATORIxDEMO("\u0019K\u001cO\u0012l9")));
            iterator2 = iterator;
        }
        Object[] objectArray3 = new Object[--3];
        objectArray3[2 & 5] = 0x6C & 0x57;
        objectArray3[2 ^ 3] = l;
        objectArray3[--2] = IiIiiiIIIi.ALLATORIxDEMO(">-\u001b)\u0015\n>d\u0019\u000b/*\u000eD>+\u001f\u00174c\u000eD7%\u000e'\u0012");
        iiiIIiiiiI.ALLATORIxDEMO(objectArray3);
    }

    public static void IIiIiIiIiI() {
        int n;
        MCVersion mCVersion = MCVersion.v1_16_5;
        EndCity endCity = new EndCity(mCVersion);
        ChunkRand chunkRand = new ChunkRand();
        EndCityGenerator endCityGenerator = new EndCityGenerator(mCVersion);
        int n2 = n = 3 & 4;
        while (n2 < 1000000000) {
            long l = chunkRand.nextLong();
            BiomeSource biomeSource = BiomeSource.of(Dimension.END, mCVersion, l);
            TerrainGenerator terrainGenerator = TerrainGenerator.of(Dimension.END, biomeSource);
            int n3 = (0xFFFFFF7F & 0xFFFFFFC5) / endCity.getSpacing();
            while (true) {
                int n4;
                if (n3 >= 187 / endCity.getSpacing()) break;
                int n5 = (0xFFFFFF57 & 0xFFFFFFED) / endCity.getSpacing();
                while (true) {
                    int n6;
                    if (n5 >= 187 / endCity.getSpacing()) break;
                    EndCity endCity2 = endCity;
                    CPos cPos = endCity2.getInRegion(l, n4, n6, chunkRand);
                    if (endCity2.canSpawn(cPos, biomeSource) && endCity.canGenerate(cPos, terrainGenerator)) {
                        endCityGenerator.generate(terrainGenerator, cPos.getX(), cPos.getZ(), chunkRand);
                        Object object = endCity.getLoot(l, endCityGenerator, chunkRand, 3 >> 2);
                        int n7 = 3 & 4;
                        object = object.iterator();
                        Object object2 = object;
                        while (object2.hasNext()) {
                            ChestContent chestContent = (ChestContent)object.next();
                            n7 += chestContent.getCount(iIiIiIIIII2 -> iIiIiIIIII2.getName().contains(IiIiiiIIIi.ALLATORIxDEMO("\u001e-\u001b\t5*\u001e")));
                            object2 = object;
                        }
                        if (n7 > (0x72 & 0x3F)) {
                            Object[] objectArray = new Object[--4];
                            objectArray[3 & 4] = n7;
                            objectArray[4 ^ 5] = l;
                            objectArray[--2] = cPos.getX() * (0x7B & 0x14);
                            objectArray[--3] = cPos.getZ() * (0x51 & 0x3E);
                            System.out.printf(IiIiiIIIiI.ALLATORIxDEMO("%O\u0018O\u0012N\u001b\u0004A@^\u0006U\\\u0015J\u0014\u001e[\u0000\u001eI\u001av-\u0018]\r\tr}B-\u0002XF]\\]\u0007\u0019'3"), objectArray);
                        }
                        endCityGenerator.reset();
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
    }

    public void iiiiIIIiII() {
        Iterator iterator;
        IiiIIiiiiI iiiIIiiiiI;
        IiiIIiiiiI iiiIIiiiiI2 = iiiIIiiiiI = pair;
        iiiIIiiiiI2.ALLATORIxDEMO(1L, new BPos(0xFFFFFFB2 & 0xFFFFFB7D, 3 ^ 3, 0xFFFFFDD8 & 0xFFFF9F67).toChunkPos(), MCVersion.v1_16_5);
        Object[] objectArray = new Object[--1];
        objectArray[5 >> 3] = iiiIIiiiiI.ALLATORIxDEMO.hasShip();
        iiiIIiiiiI2.iiiIiIiiIi(objectArray);
        Iterator iterator2 = iterator = new IIIiIiIiii(iiiIIiiiiI).iterator();
        while (iterator2.hasNext()) {
            Pair pair = (Pair)iterator.next();
            Object[] objectArray2 = new Object[--2];
            objectArray2[3 ^ 3] = iiiIIiiiiI.iIiIiIIIII.contains(pair);
            Object[] objectArray3 = new Object[5 >> 1];
            objectArray3[3 ^ 3] = pair.getFirst();
            objectArray3[5 >> 2] = pair.getSecond();
            objectArray2[--1] = String.format(IiIiiIIIiI.ALLATORIxDEMO("6L\t\u0016Sl:\u0002\u0011M\u0012v}'.\u0002\u001cV]R\u0012Q]'."), objectArray3);
            iiiIIiiiiI.iiiIiIiiIi(objectArray2);
            iterator2 = iterator;
        }
    }

    private /* synthetic */ void iiiIiIiiIi(Object ... objectArray) {
        Object[] objectArray2 = objectArray3;
        Object[] objectArray3 = objectArray;
        objectArray = objectArray2;
    }

    public void IIIIiIIiII() {
        Iterator iterator;
        IiiIIiiiiI iiiIIiiiiI;
        IiiIIiiiiI iiiIIiiiiI2 = iiiIIiiiiI = pair;
        iiiIIiiiiI2.ALLATORIxDEMO(1L, new BPos(-127280, 5 >> 3, 0xFFFF9F7B & 0xFFFFE7A4).toChunkPos(), MCVersion.v1_16_5);
        Object[] objectArray = new Object[3 >> 1];
        objectArray[3 & 4] = iiiIIiiiiI.ALLATORIxDEMO.hasShip();
        iiiIIiiiiI2.iiiIiIiiIi(objectArray);
        Iterator iterator2 = iterator = new IIIiIIIiII(iiiIIiiiiI).iterator();
        while (iterator2.hasNext()) {
            Pair pair = (Pair)iterator.next();
            Object[] objectArray2 = new Object[1 ^ 3];
            objectArray2[3 & 4] = iiiIIiiiiI.iIiIiIIIII.contains(pair);
            Object[] objectArray3 = new Object[--2];
            objectArray3[3 >> 2] = pair.getFirst();
            objectArray3[--1] = pair.getSecond();
            objectArray2[--1] = String.format(IiIiiIIIiI.ALLATORIxDEMO("6L\t\u0016Sl:\u0002\u0011M\u0012v}'.\u0002\u001cV]R\u0012Q]'."), objectArray3);
            iiiIIiiiiI.iiiIiIiiIi(objectArray2);
            iterator2 = iterator;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(long l, CPos cPos, MCVersion mCVersion) {
        void iIiIiIIIII2;
        void iIiIiIIIII222;
        IiiIIiiiiI iiiIIiiiiI = object;
        Object object = mCVersion;
        IiiIIiiiiI iIiIiIIIII3 = iiiIIiiiiI;
        BiomeSource iIiIiIIIII222 = BiomeSource.of(Dimension.END, (MCVersion)((Object)object), (long)iIiIiIIIII222);
        TerrainGenerator terrainGenerator = TerrainGenerator.of(Dimension.END, iIiIiIIIII222);
        iIiIiIIIII3.ALLATORIxDEMO = new EndCityGenerator((MCVersion)((Object)object));
        object = new ChunkRand().asChunkRandDebugger();
        iIiIiIIIII3.ALLATORIxDEMO.generate(terrainGenerator, (CPos)iIiIiIIIII2, (ChunkRand)object);
        iIiIiIIIII3.iIiIiIIIII = iIiIiIIIII3.ALLATORIxDEMO.getChestsPos();
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(5 >> 3, stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - (2 ^ 3);
        char[] cArray = new char[n];
        int n3 = (1 ^ 3 ^ --5) << --3 ^ (1 ^ 3 ^ --5);
        int cfr_ignored_0 = (--3 ^ --5) << --4 ^ --5 << --1;
        int n4 = (--3 ^ --5) << --3 ^ --4;
        int n5 = iIiIiIIIII2 = string3.length() - (2 ^ 3);
        int n6 = n2;
        String string4 = string3;
        while (n6 >= 0) {
            int n7 = n2--;
            cArray[n7] = (char)(n4 ^ (string2.charAt(n7) ^ string4.charAt(iIiIiIIIII2)));
            if (n2 < 0) break;
            int n8 = n2--;
            char c = cArray[n8] = (char)(n3 ^ (string2.charAt(n8) ^ string4.charAt(iIiIiIIIII2)));
            if (--iIiIiIIIII2 < 0) {
                iIiIiIIIII2 = n5;
            }
            n6 = n2;
        }
        return new String(cArray);
    }

    public void iiIIiIIiii() {
        IiiIIiiiiI iiiIIiiiiI = object2;
        iiiIIiiiiI.ALLATORIxDEMO(1L, new BPos(-127280, 3 >> 2, 0xFFFFB7E2 & 0xFFFFCF3D).toChunkPos(), MCVersion.v1_16_5);
        Object object = new EndCity(MCVersion.v1_16_5).getLoot(1L, iiiIIiiiiI.ALLATORIxDEMO, new ChunkRand(), (2 & 5) != 0);
        long l = 0L;
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (ChestContent)object.next();
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.FAT_TOWER_TOP_CHEST_1)) {
                Object[] objectArray = new Object[--2];
                objectArray[2 & 5] = IiIiiIIIiI.ALLATORIxDEMO("9\r_q)a\u0012L\tg3v&N\u0012M\tv\u0004R\u0018?\u001bc)})M\nG\u000f})M\r]\u001ej8q)}L\u0004WG\u0013C\n\u0011nU\u0003G@l)m;r$v5-\u007fu-\u000e]I\u000b[\fUDy4T\u001aS2\u0011[I\u001eT\u0019[\u0015IFl\u000e\u0000Wy3C\u0010G@%:m1F\"K\u0013E\u0012VZ.}G\u0013A\u0015c3v0G\u0013v.?\u0006\u007fQ\u0002\u0018D\u001bM\u0014P\b\u001b\"8G\u0000SA\u0012J\u000eWA\n\u001c\u0005V,NC\u0014q\tA\u001cU\u001aO\rG\u0010\u001d6J\u0004\bAD\u0014B\u0015\u0012WF\u001e@\u000e\u0017Um)}\u000eG\u0018f.%q\u0002\u0018L\u001eJ\u001cL\to8L\tQ@Y\u0000.}G\u001bd8a)Q@y _Q\b\u0014K\u000eH\rX\tQ_\u00024K\u0005N/J\u0000J\u001d\u001eSR\u001cO@i\u000b[\f]\u0017C\u0010EB\u0019\b\u0017UD*F\u001eH\u001fP\\\tZ\u0000Ta5C\u0013V\u0010g3v.\u001f&\u007fQ\u0002\u0018D\u001bg>V\u000e\u001f&_ .}A\u0012w3v`\u0013M_Q\u00024\\\u0012I(R\u0018\u0006QW\u001aV\u0018R]j\b[\fR\u0018\u0004WCD\u0005\u0014R\u0010P>E\u0011G\u000eT\u000fR\u0000\u0011_\rY\u000f\u0015A\u0013L\u001aK\u000e\b_l)Q@yUr/m)G\u001eV\u0014M\u0013\u000e]6t\u000e]\n\u0010g3f4L\u001a.}3t\u007fQ\u0002\u0018D\u001bM\u0014P\b\u001b\"8G\u0000SA\u0012J\u000eWA\u000f\u001ctZEJI\n\u001f-O\fE\u0019\u001bT\u0013O\u0017M\tQI\u001aSH\u001eB\u001c\\\u0004\u0001\u0018WV\n;i\u0011\u0000\u000e]k3f8Z\u0018F@D\u001cN\u000eg ");
                objectArray[4 ^ 5] = ((ChestContent)object2).toString();
                iiiIIiiiiI.ALLATORIxDEMO(objectArray);
            }
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.FAT_TOWER_TOP_CHEST_2)) {
                Object[] objectArray = new Object[--2];
                objectArray[3 >> 2] = IiIiiiIIIi.ALLATORIxDEMO("2kX3\n\u0007\u0015(\f=\b4\u0005(\u0015)\f\f\u001fsXq4\b#\u0016#\r+\u0006/\\i+\n\u001b9\f?7\u000e;hhZ'\u0012!\t0.\u001d*!G\u00173*\u001d(\u001f\u001b9,\u001f7\u000ehZ-\u000e!\u0017=M\u001954\u001bnn>\u0015'\u0011\"\u000e1\u001e5[\u0006\u0005fP;\u0010%\u0017#E\u007f\u0001/\u0012 %/\u0016?\tw\u001a`R,\u0019*\u001f#\u00127\u0010fS\u0010)y!\u0019VD?\u0002<!\u00190\ty!\u0019\u0007Hz'\u00151\u0014\u0010gV'hZ-.\u00017\u0017\u000e%\u0019/\u0001'\u0004'\u0011}7wX'\u000f*\u001b4\u0002x\\1\u0014 \u001f\\Q%\u0019#\u0013(\u001f+Al^!\u0014%\u00109\bwP)\u001c=\u0004t,j\u001e*\u0013gT\n=\u001b\u00191\b\u0017?HzuS\u0019Vd\u001f\"\u001c\u000190\ty!9'Hz'\u0015\u00114\u0010gu\u0007hZ\r\u000e+\u001d\u0011\b!\u001dhF#\u0000!\u0017d.1\u001e5\u001d!\u0010nX}Y-\b)\u0016\u0007\u000e%\u0012)\u001f2_tFfS/\u001a(\u0019=\u001a'\u00127\u000e>fL*6\u00150\u001f\u0007.\r5*VdHmVdR\u00114&\b!\u001b\u000f3\n=hZVs9vd\u001f\"\u001c!\u0019:\u0003\u007f'\u001d\u0003/\u001d)\u001b1\u0014-Zt\u0006tF\u0006\u0005fP\u0013\n%\u0019-\u00031\u0012%\u0013y32\u001d5\u001dm\\!\u0017tP \u0005-\u0012\u001c\u001flR\u0010)cVd\u001f\n9\f;*\u000e)\u001f*\u000e7G?r4\b+\u000e\u00019\u00103+\u0014HzPshZl\u0018-\u0014*\u0019,\u001b\u001f\u001dvO9\u0011hZhN\u0018Wx\u0003)\u0017f^4\ry!\u001b\u0005tF#\u00111\u00142Ei\u001b^\u0011l\u0002&\u0004t'-\u000f8\u0005>\u0010UhsHsHHz\u001dguHwVd\u0000yWWj}Nq\u0007Hz\r4 \u001f\u001c?\u0000g\"\u001b(\t!\u0007");
                objectArray[--1] = ((ChestContent)object2).toString();
                iiiIIiiiiI.ALLATORIxDEMO(objectArray);
            }
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.SHIP_CHEST_1)) {
                Object[] objectArray = new Object[5 >> 1];
                objectArray[3 ^ 3] = IiIiiIIIiI.ALLATORIxDEMO("e\u0011\u0000IX0M\u0013K\u0005M\bE\rF\u0019\u0011n_\tG@s7w1y:j8s+aPI\u001aI\u001dJ\u0003[$]\u000b@G6sL\u001an8}>J\u0018Q\t\u000e]K\tG\u0010Q@Y\u0014V\u0018O.v<a6Y\u0014v8o`k\tG\u0010Y\u0013I\u001aAF\u0001\u001d\f[A\u001cL\u0019`\u0013T\u0013L\u0005\u000eZE_H\u001aJ\u001cN\u000bS\u0004H\rQ@{WM\t\u0004HZ\u001bJ\u0003\\\\\u0004O\fVE\u0012i3M\u001eI\u001fc>iq\u0002O\u000bQ\u0002UW\u0013`/G\u001cI\u0014l:.}\u0011T_q\"8D\u001bG\u001eV\u000e\u0015,y\u0006\nY\u0006UY\u001dV@\u000e\u001d\u000f\\w\u0015L\u001b6NG\u001aI\u0006I\u000b[\f\u001b0V\u0018M\u0004P\u0000\b_\u0017RF\u0002@\u001e{\u0012K\u001d\nN%q\u0002\u0018L\u001ej<l)O\u0018L\tQ@y .}G\u001bD\u0018a)q`y \u007fq\">M\bL\t\u001fHU[\u00042R\u001c\biX\u0012A\u0016D\tW\u0019S\\`\u0002\u0000W]\u0017C\u0010EB\u0019\bT\u0016L\"S\bQ\u0013\u0001\u001d\u0006UJ\u001eL\u0018E\u0015Q\u0017\u0000Tv.\u001f&\n\u0016l2a6@\u001cA\u0016\u000e]\u0010T.}\n\u000eJ\u001cp-l8Q\u000e.}1t\u007fQ\u0002\u0018D\u001bM\u0014P\b\u001b\"8G\u0000SA\u0012J\u000eWA\u000f\u001ctZEJI\n\u001f-O\fE\u0019\u001bT\u0013O\u0017M\tSI\u001aSH\u001eD\u001a\\\u0004\u0001\u0018WV\n;m\u0015\u0000\u000e]k3f8Z\u0018F@D\u001cN\u000eg ");
                objectArray[2 ^ 3] = ((ChestContent)object2).toString();
                iiiIIiiiiI.ALLATORIxDEMO(objectArray);
            }
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.SHIP_CHEST_2)) {
                Object[] objectArray = new Object[5 >> 1];
                objectArray[5 >> 3] = IiIiiiIIIi.ALLATORIxDEMO("~(\u001b7\u000e\u0005\u00176\u0012%\u00100\u0001*\u00177\u0012WD<\u0017t$\u0001>\u0012#\u00005Fn0\u0005vVd\u0019\f?\u0017.\u0010\u00034\u001fy)\r4#\u0016\u0001%\u00072!\t0vd\u0013\u0010?\t)y!\r\u000e!\u0017\u001d\u0004#\u001f+\u0005jI/\u0019y3-\u0002(\u00006\u0007\"\u0014>\u001a)\f+\u0014\u0019\u0014=\u0001'\u0017*\u001d5_tFfS/\u001a(\u0019=\u001a'\u00127\u000e>fL/*\u00186\u001f\u00051\r4#VdImVdR\u000236\u001f\u001b\n\u00165\u0010?'\u000e\r5\nvdHm'hZ+\u0016$\u0019#\np\u0000\u0011)9Vy\u0004*\u000e6\u0012r@~\u0011`70\u001f++,\u0007#\u0015?\u00132\u001d5[JI)\u001f2\u0019(\u001a'Ad\u0014qR\n\u0005'\u0012!\t\u0010*\b;0\u001fcVd\u001f*\u0019\f;*\u000e)\u001f\n.\u0017g\u001fR\t?\n>-\u0014#VdKg\\bT4\u0016lO$\u0007hZkN\u0018Wx\u0003)\u0017f^4\ry!\u001b\u0005tF#\u00111\u00142Ei\u001b^\u0011l\u0002&\u0004t'-\u000f8\u0005>\u0010UhsHsNHz\u001dguNqVd\u0000yWWj}Js\u0007Hz\r4 \u001f\u001c?\u0000g\"\u001b(\t!\u0007");
                objectArray[--1] = ((ChestContent)object2).toString();
                iiiIIiiiiI.ALLATORIxDEMO(objectArray);
            }
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.THIRD_FLOOR_CHEST)) {
                Object[] objectArray = new Object[--2];
                objectArray[3 >> 2] = IiIiiIIIiI.ALLATORIxDEMO("e\u0011G\u000eT<Q\u000f\u0011_D\u0001T\u001c@\u001fP/\\\n\u0000\u0007V\u0015k/f\"D\u0011M\u0012p\"a5g.vQ\">J\u0018Q\tV$r8\u001f.K\u0013E\u0011g\"a5g.|[\u0004\u0012R\u001c\bI\u0011(k\tZ\rp\b_\u0002B\r\fNC\u0014\u001f4T\u001aS\u001aH\u0018O\u0018\u001dXW\u0013\nTu\u0006G\u001fY\u0015H\\\tZ\u0000Ta5C\u0013V\u0010g3v.\u001f&\n\u0018D\u001bK\u001ek8L\u001e[Q\"n+\u0000\u000e]g;d8A\tQ@y U[\u0004\u0018I\f\u000bN\u0011B_Q\u001f)W\u0019S2]\u0017\u0006Q]\u0010V\u0018MBw\u0015C\u0014Y\u0013A\u0012[\\B]E\u0019K/F\u001eC\u0014Q]I\u001ag3A\u0015C\u0013v0g3V\u000e\u001f&\u007fQ\u0002\u0018d;G\u001eV\u000e?\u0006_ \u000e]a2w3V@\u0010\u0000\u000e]a\u0003A\u0016u\r\u0004YG\bK\tZ\r\u001e5J\u0004D\r\u000b[K\u001c\u001fZI\rQ\u000fy\nJ\u0012V\u001aRFI\u001aO\u001bL\u0018N\u001eP\u0016@\u0014\u0011I?\u0006\n\bL\u001fp8c6K\u0013EQ\u0002N\u000bQ\"uG\u001bD\u0014a4g3A\u0004.}6t\u007fQ\u0002\u0018D\u001bM\u0014P\b\u001b\"8G\u0000SA\u0012J\u000eWA\u000f\u001ctZEJI\n\u001f-O\fE\u0019\u001bT\u0013O\u0017M\tWI\u001aSH\u001eB\u0018\\\u0004\u0001\u0018WV\n;e\u001b\u0000\u000e]k3f8Z\u0018F@D\u001cN\u000eg ");
                objectArray[5 >> 2] = ((ChestContent)object2).toString();
                iiiIIiiiiI.ALLATORIxDEMO(objectArray);
            }
            Iterator<ItemStack> iterator = object2 = ((ChestContent)object2).getItems().iterator();
            while (iterator.hasNext()) {
                ItemStack itemStack = object2.next();
                l += (long)itemStack.hashCode();
                iterator = object2;
            }
        }
        Object[] objectArray = new Object[--3];
        objectArray[3 ^ 3] = -2289062442L;
        objectArray[2 ^ 3] = l;
        objectArray[5 >> 1] = IiIiiiIIIi.ALLATORIxDEMO("\r\u000e!\u0017\u0017z\u00072%\u0014\u0003?\u0000z)\u001b=\u0018!E");
        iiiIIiiiiI.ALLATORIxDEMO(objectArray);
    }

    public void iiiIiIiiIi() {
        IiiIIiiiiI iiiIIiiiiI = iterator;
        iiiIIiiiiI.ALLATORIxDEMO(172023L, new BPos(0x1BF3 & 0x67FC, 3 & 4, 0x3FA6 & 0x41D9).toChunkPos(), MCVersion.v1_16_1);
        Iterator iterator = new EndCity(MCVersion.v1_16_1).getLoot(172023L, iiiIIiiiiI.ALLATORIxDEMO, new ChunkRand(), 3 >> 2);
        long l = 0L;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Iterator<ItemStack> iterator2 = ((ChestContent)iterator.next()).getItems().iterator();
            while (iterator2.hasNext()) {
                Iterator<ItemStack> iterator3;
                ItemStack itemStack = iterator3.next();
                l += (long)itemStack.hashCode();
                iterator2 = iterator3;
            }
        }
        Object[] objectArray = new Object[--3];
        objectArray[3 & 4] = 4863304372L;
        objectArray[2 ^ 3] = l;
        objectArray[--2] = IiIiiiIIIi.ALLATORIxDEMO("\r\u000e!\u00177Z\u00072%\u0014\u0003? Z)\u001b\u001d8!E");
        iiiIIiiiiI.ALLATORIxDEMO(objectArray);
    }

    private /* synthetic */ void ALLATORIxDEMO(Object ... objectArray) {
        Object[] objectArray2 = objectArray3;
        Object[] objectArray3 = objectArray;
        objectArray = objectArray2;
    }

    public static void main(String[] iIiIiIIIII2) {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiIIIiI.ALLATORIxDEMO("u\u0016\u0000[q8\u0002\bR\u0019c)g|\u0002\u8b8a\u66d6\u65cd\u5212\u677d\u6592\u7235\u672e\uff5c"));
        }
        System.out.println(IiIiiiIIIi.ALLATORIxDEMO("7iWgYzDfX{ElR \u001ec]gYe[{Ec]gYe[{E \u001eoQjTjTa_`^ 7GzdZdZDzDzdZdZdZdZDz`^lRdZc]nPb\\`^#\u001djTdZyGfq{FoQ#\u001d`]gZeXxFc^dZf[{F \u001eoRjTjWa_c] \u001eGzdZdZGPGzdZdZgZgZGz`^oRdZ`]mPb_`^ \u001diTgZzGeXxFoQ#\u001dctgZfXxFc]gZeXxF \u001dlRjTjWb_c] \u001dGzgYdZDyDzdZdZgpgZDz`^oRgZ`^mPa_c^ \u001diTdYyGfX{FlQ \u001dc]gZfXxFctgZfXxF#\u001dlRiWiWb\\c]#\u001dDzdZdZDzDzdZdZdZdZDz`^oxgZ\u0013\u000f!\u0004'\u001f4\u0017mZj>%\f8G$\u000b(\n&\u0012bI)\u0011*\tf\u000b1\b#\u001bdHvHnF 7oRiWiWb\\c]#\u001dDzdZdZDzDzdZdZdZdZDz`^lRdZc]nPavc^#\u001djTd;5\u000b$\u000f7\u0014&QL_&\u000b7\u0019'\f7\u0014`\b}TsX\u001c#NrlRiWiWav`]#\u001dDzdZdZDzDzdZdZdZdZDz`^lRdZc]nPb\\`^#\u001djTgpzGe[xFoQ#\u001d`^dZf<\u001d+\u000f^\u0012?\u0014+\u0011)M\u001clRiWiWb\\c]#\u001dDzgpgZDzDzdZdZdZdZDz`^lRdZc]nPb\\`^#\u001djTdZyGe[xFl{ \u001d`^dZfXxF\u000e1\u0010Z\u00007\nF@r\u0001?\f%\n>\u00030c(PxEzdZdZDzDzgpgZdZdZDz`^lRdZc]nPb\\`^#\u001djTdZyGe[xFoQ#\u001d`^dZer{F`^dZfXxF#U8\u00069\u0004sXm\u001d/\u0011bI\u000b(-T'\u0015\tzDzdZdZdZdZGPc^lRdZc]nPb\\`^#\u001djTdZyGe[xFoQ#\u001d`^dZfXxF`^dZer{E \u001eoQjTjTa_`^ \u001eGygYgYGyGygYgYgYgYGyc]oQgY`w"));
        new ThreadPool(Runtime.getRuntime().availableProcessors()).run(IiiIIiiiiI::IIiIiIiIiI);
    }

    public IiiIIiiiiI() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiiIIIi.ALLATORIxDEMO("46!\u001b7\u001fd\u000f4\u001e\u0005.t\u000ed\u8b8d\u66b7\u65cd\u5274\u677a\u65e9\u722f\u673f\uff2c"));
        }
    }

    public void ALLATORIxDEMO() {
        Iterator iterator;
        IiiIIiiiiI iiiIIiiiiI = pair;
        iiiIIiiiiI.ALLATORIxDEMO(1L, new BPos(0xFFFFDEBA & 0xFFFFEF75, 3 >> 2, 0xFFFFA7AB & 0xFFFFDF54).toChunkPos(), MCVersion.v1_16_5);
        Iterator iterator2 = iterator = new IiiiiiIIii(iiiIIiiiiI).iterator();
        while (iterator2.hasNext()) {
            Pair pair = (Pair)iterator.next();
            Object[] objectArray = new Object[5 >> 1];
            objectArray[3 ^ 3] = iiiIIiiiiI.iIiIiIIIII.contains(pair);
            Object[] objectArray2 = new Object[1 ^ 3];
            objectArray2[2 & 5] = pair.getFirst();
            objectArray2[5 >> 2] = pair.getSecond();
            objectArray[--1] = String.format(IiIiiiIIIi.ALLATORIxDEMO("\u001f\b,\u00126\u00025Y+\r3\u000baA)u\n\u001dw\u00189\u0013~G/"), objectArray2);
            iiiIIiiiiI.iiiIiIiiIi(objectArray);
            iterator2 = iterator;
        }
    }
}

