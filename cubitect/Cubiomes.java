/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.fusesource.hawtjni.runtime.JniClass
 *  org.fusesource.hawtjni.runtime.Library
 */
package cubitect;

import org.fusesource.hawtjni.runtime.JniClass;
import org.fusesource.hawtjni.runtime.Library;

@JniClass
public class Cubiomes {
    private static final Library LIBRARY = new Library("cubiomes", Cubiomes.class);

    public static native int main();

    private static native long getNearestStructure(int var0, int var1, int var2, long var3, int var5);

    private static native long getNearestStronghold(int var0, int var1, long var2, int var4);

    public static Pos GetNearestStructure(StructureType structType, int x, int z, Long seed, MCVersion mc_version) {
        long result = structType == StructureType.Stronghold ? Cubiomes.getNearestStronghold(x, z, seed, mc_version.ordinal()) : Cubiomes.getNearestStructure(structType.ordinal(), x, z, seed, mc_version.ordinal());
        if (result == -1L) {
            return null;
        }
        Pos pos = new Pos();
        pos.x = (int)(result >> 32);
        pos.z = (int)(result & 0xFFFFFFFFFFFFFFFFL);
        return pos;
    }

    static {
        LIBRARY.load();
    }

    public static enum StructureType {
        Feature,
        Desert_Pyramid,
        Jungle_Temple,
        Swamp_Hut,
        Igloo,
        Village,
        Ocean_Ruin,
        Shipwreck,
        Monument,
        Mansion,
        Outpost,
        Ruined_Portal,
        Ruined_Portal_N,
        Ancient_City,
        Treasure,
        Mineshaft,
        Desert_Well,
        Geode,
        Fortress,
        Bastion,
        End_City,
        End_Gateway,
        Trail_Ruin,
        Slime_Chunk,
        Stronghold;

    }

    public static enum MCVersion {
        MC_UNDEF,
        MC_B1_7,
        MC_B1_8,
        MC_1_0_0,
        MC_1_1_0,
        MC_1_2_5,
        MC_1_3_2,
        MC_1_4_7,
        MC_1_5_2,
        MC_1_6_4,
        MC_1_7_10,
        MC_1_8_9,
        MC_1_9_4,
        MC_1_10_2,
        MC_1_11_2,
        MC_1_12_2,
        MC_1_13_2,
        MC_1_14_4,
        MC_1_15_2,
        MC_1_16_1,
        MC_1_16_5,
        MC_1_17_1,
        MC_1_18_2,
        MC_1_19_2,
        MC_1_19_4,
        MC_1_20_6,
        MC_1_21_1,
        MC_1_21_3,
        MC_1_21_WD;

    }

    public static class Pos {
        public int x;
        public int z;
        public int y;
    }
}

