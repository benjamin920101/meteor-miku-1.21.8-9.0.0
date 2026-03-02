/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  xaero.common.minimap.waypoints.Waypoint
 *  xaero.hud.minimap.BuiltInHudModules
 *  xaero.hud.minimap.module.MinimapSession
 *  xaero.hud.minimap.waypoint.set.WaypointSet
 *  xaero.hud.minimap.world.MinimapWorld
 *  xaero.map.mods.SupportMods
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIiIii;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import java.util.Date;
import xaero.common.minimap.waypoints.Waypoint;
import xaero.hud.minimap.BuiltInHudModules;
import xaero.hud.minimap.module.MinimapSession;
import xaero.hud.minimap.waypoint.set.WaypointSet;
import xaero.hud.minimap.world.MinimapWorld;
import xaero.map.mods.SupportMods;

public class IiIIiIiiiI {
    public static WaypointSet ALLATORIxDEMO() {
        MinimapSession minimapSession = (MinimapSession)BuiltInHudModules.MINIMAP.getCurrentSession();
        if (minimapSession == null) {
            return null;
        }
        MinimapWorld minimapWorld = minimapSession.getWorldManager().getCurrentWorld();
        if (minimapWorld == null) {
            return null;
        }
        return minimapWorld.getCurrentWaypointSet();
    }

    public IiIIiIiiiI() {
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u001dgh*\u0019Ijy\u001aH\u000bX/-J\u8bdb\u66be\u65bc\u527a\u670c\u65fa\u7244\u6746\uff2d"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, int n2, int n3, String string, String string2) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        void iIiIiIIIII4;
        int iIiIiIIIII222 = n2;
        int iIiIiIIIII5 = n;
        WaypointSet waypointSet = IiIIiIiiiI.ALLATORIxDEMO();
        if (waypointSet == null) {
            return;
        }
        if (IiIIiIiiiI.ALLATORIxDEMO(iIiIiIIIII5, (int)iIiIiIIIII4) != null) {
            return;
        }
        int n4 = 10;
        Waypoint iIiIiIIIII222 = new Waypoint(iIiIiIIIII5, iIiIiIIIII222, (int)iIiIiIIIII4, (String)iIiIiIIIII3, (String)iIiIiIIIII2, n4, 3 >> 2, (3 & 4) != 0);
        waypointSet.add(iIiIiIIIII222);
        SupportMods.xaeroMinimap.requestWaypointsRefresh();
    }

    public static String ALLATORIxDEMO(String string) {
        int iIiIiIIIII2;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 >> 1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(2 & 5, stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (4 ^ 5);
        char[] cArray = new char[n];
        int n3 = (--3 ^ --5) << --3 ^ (--2 ^ --5);
        int cfr_ignored_0 = --4 << --3;
        int n4 = (--3 ^ --5) << --4 ^ (--2 ^ --5);
        int n5 = iIiIiIIIII2 = string3.length() - (3 & 5);
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

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, int n2, int n3, String string) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        int iIiIiIIIII222 = n2;
        int iIiIiIIIII4 = n;
        WaypointSet waypointSet = IiIIiIiiiI.ALLATORIxDEMO();
        if (waypointSet == null) {
            return;
        }
        if (IiIIiIiiiI.ALLATORIxDEMO(iIiIiIIIII4, (int)iIiIiIIIII3) != null) {
            return;
        }
        String string2 = IIIIiIiIii.ALLATORIxDEMO("\u7fa0");
        int n4 = 0x7B & 0xE;
        Waypoint iIiIiIIIII222 = new Waypoint(iIiIiIIIII4, iIiIiIIIII222, (int)iIiIiIIIII3, (String)iIiIiIIIII2, string2, n4, 3 >> 2, 5 >> 3);
        waypointSet.add(iIiIiIIIII222);
        SupportMods.xaeroMinimap.requestWaypointsRefresh();
    }

    /*
     * WARNING - void declaration
     */
    public static Waypoint ALLATORIxDEMO(int n, int n2) {
        int n3 = n;
        WaypointSet iIiIiIIIII2 = IiIIiIiiiI.ALLATORIxDEMO();
        if (iIiIiIIIII2 == null) {
            return null;
        }
        for (Waypoint waypoint : iIiIiIIIII2.getWaypoints()) {
            void iIiIiIIIII3;
            if (waypoint.getX() != n3 || waypoint.getZ() != iIiIiIIIII3) continue;
            return waypoint;
        }
        return null;
    }
}

