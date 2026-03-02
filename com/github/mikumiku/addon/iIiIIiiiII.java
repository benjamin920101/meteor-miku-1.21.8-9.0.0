/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIIIiI;
import com.github.mikumiku.addon.iiiiIiiIIi;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIIiiiII {
    public static final String IIiIiiiiII = "sha1";
    private static Path IIiiIIIIIi = null;
    private String iIiiiIiIii;
    public static final String iIiIiiiiII;
    private URL IIIIiiIiii;
    private final String IiiIiIiiIi;
    private final ClassLoader IIiIiIIiii;
    private boolean iIIiiIiIiI;
    private final String iiiiiIIiIi;
    public static final String iIIiIiiiIi;
    public static final String iIiIiIIIII = "hawtjni.strategy";
    public static final String ALLATORIxDEMO = "temp";

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(ArrayList<Throwable> arrayList, File file) {
        boolean bl;
        iIiIIiiiII iIiIIiiiII2 = object;
        Object object = file;
        iIiIIiiiII iIiIiIIIII2 = iIiIIiiiII2;
        try {
            System.load(((File)object).getPath());
            iIiIiIIIII2.iIiiiIiIii = ((File)object).getPath();
            bl = true;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            void iIiIiIIIII3;
            object = new LinkageError(new StringBuilder().insert(3 & 4, iiiiIiiIIi.ALLATORIxDEMO("\u0001\u000b>\f2\n>[6H\u0015'8\fY$\u0010*+\t+\u0011y\u000e\u000b'\u0014h")).append(object).toString());
            ((Throwable)object).initCause(unsatisfiedLinkError);
            iIiIiIIIII3.add(object);
            return (3 & 4) != 0;
        }
        return bl;
    }

    private static /* synthetic */ String ALLATORIxDEMO(Class<?> iIiIiIIIII2) {
        try {
            return iIiIiIIIII2.getPackage().getImplementationVersion();
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(ArrayList<Throwable> arrayList, String string) {
        boolean bl;
        iIiIIiiiII iIiIIiiiII2 = object;
        Object object = string;
        iIiIIiiiII iIiIiIIIII2 = iIiIIiiiII2;
        try {
            System.loadLibrary((String)object);
            iIiIIiiiII iIiIIiiiII3 = iIiIiIIIII2;
            iIiIIiiiII3.iIiiiIiIii = IiIiiIIIiI.ALLATORIxDEMO("\u000bG\u000fCSL\u0016\\\u0013\u0004HS[_\u0011[\u0018\b\bP\u0014KXM\u0012vsN\u0014`/c/[SR\u001cV\u0015n4`g") + (String)object;
            bl = true;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            void iIiIiIIIII3;
            object = new LinkageError(new StringBuilder().insert(5 >> 3, iiiiIiiIIi.ALLATORIxDEMO(":pN;\u0004\u001ch-\u0007Y$\u0016)=H5\u0001;\u001a\u0018:\u0000h")).append((String)object).toString());
            ((Throwable)object).initCause(unsatisfiedLinkError);
            iIiIiIIIII3.add(object);
            return (2 & 5) != 0;
        }
        return bl;
    }

    public synchronized void iiiIiIiiIi() {
        if (this.iIIiiIiIiI) {
            return;
        }
        this.ALLATORIxDEMO();
        this.iIIiiIiIiI = 4 ^ 5;
    }

    public static int ALLATORIxDEMO() {
        String string = System.getProperty(IiIiiIIIiI.ALLATORIxDEMO("\u000ew3\f\u001cp>jsF\u001cV\u001c\f\u0010m9g1"));
        if (string == null) {
            string = System.getProperty(iiiiIiiIIi.ALLATORIxDEMO("\u001a'4F\u0010*\u0014f/\u0005w\n0\u001c\u0014'\u001d-"));
        }
        if (string != null) {
            return Integer.parseInt(string);
        }
        if (System.getProperty(IiIiiIIIiI.ALLATORIxDEMO("\u0012QSc/a5")).endsWith(iiiiIiiIIi.ALLATORIxDEMO("O|")) && IiIiiIIIiI.ALLATORIxDEMO("Q(@\u000eV\u000fC\tg}T\u0010").equals(System.getProperty(iiiiIiiIIi.ALLATORIxDEMO("\u0013)/\tw\u001e4F\u0017)\u0014-")))) {
            return 0x64 & 0x5B;
        }
        return 64;
    }

    public final String IIIIiIiiii() {
        iIiIIiiiII iIiIIiiiII2 = this;
        return new StringBuilder().insert(5 >> 3, iiiiIiiIIi.ALLATORIxDEMO("\u0014--\tT\u0001\u0017.v\u00068\u001c\u0010>\u001cg")).append(iIiIIiiiII2.iiiIiIiiIi(iIiIIiiiII2.IiiIiIiiIi)).toString();
    }

    public final String iiiIiIiIII() {
        return this.ALLATORIxDEMO(iIiIIiiiII.iiIIiIIiii());
    }

    public final String IIIIIIIiII() {
        iIiIIiiiII iIiIIiiiII2 = this;
        return new StringBuilder().insert(3 ^ 3, iiiiIiiIIi.ALLATORIxDEMO("\u0014--\tT\u0001\u0017.v\u00068\u001c\u0010>\u001cg")).append(iIiIIiiiII.ALLATORIxDEMO()).append(IiIiiIIIiI.ALLATORIxDEMO("r")).append(System.getProperty(iiiiIiiIIi.ALLATORIxDEMO("\u0007*F\u0018:\u001a "))).append(IiIiiIIIiI.ALLATORIxDEMO("r")).append(iIiIIiiiII2.iiiIiIiiIi(iIiIIiiiII2.IiiIiIiiIi)).toString();
    }

    @Deprecated
    public final String iiIIiIIiii(String string) {
        iIiIIiiiII iIiIIiiiII2 = string2;
        String string2 = string;
        iIiIIiiiII iIiIiIIIII2 = iIiIIiiiII2;
        return iIiIiIIIII2.ALLATORIxDEMO(string2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(ArrayList<Throwable> arrayList, String string, String string2, String string3, String string4) {
        void iIiIiIIIII222;
        iIiIIiiiII iIiIIiiiII2 = object;
        Object object = string2;
        iIiIIiiiII iIiIiIIIII3 = iIiIIiiiII2;
        object = new StringBuilder().insert(5 >> 3, iiiiIiiIIi.ALLATORIxDEMO("\u0014--\tT\u0001\u0017.v\u00068\u001c\u0010>\u001cg")).append(object == null ? "" : new StringBuilder().insert(3 ^ 3, (String)object).append((char)(0x7F & 0x2F)).toString()).append((String)iIiIiIIIII222).toString();
        object = iIiIiIIIII3.IIiIiIIiii.getResource((String)object);
        if (object != null) {
            File file;
            Iterator<File> iIiIiIIIII4;
            void iIiIiIIIII5;
            int iIiIiIIIII222 = iIiIiIIIII5.lastIndexOf(0x3E & 0x6F);
            int n = 5 >> 3;
            String iIiIiIIIII222 = new StringBuilder().insert(n, iIiIiIIIII5.substring(n, iIiIiIIIII222)).append(IiIiiIIIiI.ALLATORIxDEMO("p")).toString();
            File[] fileArray = new File[--3];
            if (iIiIiIIIII4 != null) {
                String[] stringArray = new String[2 ^ 3];
                stringArray[3 >> 2] = iIiIiIIIII4;
                file = iIiIiIIIII3.ALLATORIxDEMO(stringArray);
            } else {
                file = null;
            }
            fileArray[3 >> 2] = file;
            int n2 = 2 ^ 3;
            String[] stringArray = new String[n2];
            stringArray[3 & 4] = System.getProperty(iiiiIiiIIi.ALLATORIxDEMO("\u0013)\u000f)w\u00016F-\u0005\t,\u0010:"));
            fileArray[n2] = iIiIiIIIII3.ALLATORIxDEMO(stringArray);
            String[] stringArray2 = new String[--3];
            stringArray2[2 & 5] = System.getProperty(IiIiiIIIiI.ALLATORIxDEMO("\bQ\u0018PSj2o8"));
            stringArray2[5 >> 2] = iiiiIiiIIi.ALLATORIxDEMO("w\u00008\u001f\r\"\u0017!");
            stringArray2[5 >> 1] = iIiIiIIIII3.IiiIiIiiIi;
            fileArray[1 ^ 3] = iIiIiIIIII3.ALLATORIxDEMO(stringArray2);
            for (File file2 : Arrays.asList(fileArray)) {
                File file3;
                void iIiIiIIIII6;
                if (file2 == null) continue;
                iIiIIiiiII iIiIIiiiII3 = iIiIiIIIII3;
                if ((IIiIiiiiII.equals(iIiIiiiiII) ? iIiIIiiiII3.iiiIiIiiIi((ArrayList<Throwable>)iIiIiIIIII6, (URL)object, iIiIiIIIII222, (String)iIiIiIIIII5, file2) : iIiIIiiiII3.ALLATORIxDEMO((ArrayList<Throwable>)iIiIiIIIII6, (URL)object, iIiIiIIIII222, (String)iIiIiIIIII5, file2)) == null || !iIiIiIIIII3.ALLATORIxDEMO((ArrayList<Throwable>)iIiIiIIIII6, file3)) continue;
                iIiIiIIIII3.IIIIiiIiii = object;
                return --1 != 0;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private /* synthetic */ File iiiIiIiiIi(ArrayList<Throwable> arrayList, URL uRL, String string, String string2, File file) {
        Object object;
        InputStream iIiIiIIIII2;
        FileOutputStream iIiIiIIIII3;
        void iIiIiIIIII4;
        void iIiIiIIIII5;
        File iIiIiIIIII6;
        iIiIIiiiII iIiIIiiiII2 = object2;
        Object object2 = null;
        if (!(iIiIiIIIII6 = iIiIiIIIII6.getAbsoluteFile()).exists() && !iIiIiIIIII6.mkdirs()) {
            iIiIiIIIII5.add(new IOException(new StringBuilder().insert(2 & 5, IiIiiIIIiI.ALLATORIxDEMO("z\u001eE\u0019I\u001fENM]a/G\u001cv8\"9K\u000fG\u001eV\u0012p$8}")).append(iIiIiIIIII6).toString()));
            return null;
        }
        String string3 = iIiIIiiiII2.ALLATORIxDEMO(iIiIiIIIII4.openStream());
        Object object3 = "";
        object2 = new File(iIiIiIIIII6, (String)((Object)iIiIiIIIII3) + string3 + (String)((Object)iIiIiIIIII2));
        if (((File)object2).isFile() && ((File)object2).canRead()) {
            object3 = iIiIIiiiII2.ALLATORIxDEMO(new FileInputStream((File)object2));
        }
        if (((String)object3).equals(string3)) {
            return object2;
        }
        iIiIiIIIII3 = null;
        iIiIiIIIII2 = null;
        try {
            iIiIiIIIII2 = iIiIiIIIII4.openStream();
            if (iIiIiIIIII2 != null) {
                object = new byte[0x1770 & 0x788F];
                iIiIiIIIII3 = new FileOutputStream((File)object2);
                InputStream inputStream = iIiIiIIIII2;
                while (true) {
                    int n = inputStream.read((byte[])object);
                    if (n == -4 >> 2) break;
                    inputStream = iIiIiIIIII2;
                    iIiIiIIIII3.write((byte[])object, 2 & 5, n);
                }
                iIiIIiiiII2.ALLATORIxDEMO((File)object2);
            }
            object = object2;
        }
        catch (Throwable throwable) {
            try {
                iIiIIiiiII.ALLATORIxDEMO(iIiIiIIIII3);
                iIiIIiiiII.ALLATORIxDEMO(iIiIiIIIII2);
                throw throwable;
            }
            catch (Throwable throwable2) {
                Object object4;
                if (object2 != null) {
                    ((File)object2).delete();
                    object3 = new IOException(new StringBuilder().insert(3 >> 2, iiiiIiiIIi.ALLATORIxDEMO("5:\u00046\t:N*\u0000>J!\u001c\u000b):\u001cY$\u0010*+\t+\u0011y\u000e\u000b'\u0014h")).append(iIiIiIIIII4).append(IiIiiIIIiI.ALLATORIxDEMO("\")m}")).append(object2).toString());
                    object4 = object3;
                } else {
                    object4 = object3 = new IOException(new StringBuilder().insert(3 >> 2, iiiiIiiIIi.ALLATORIxDEMO("!pN3\f1E \n\u007f\r,\n\u007f[<H\r-4\u0018\u0016:\u0018: H?\u00015\rY!\u0017h")).append(iIiIiIIIII6).toString());
                }
                ((Throwable)object4).initCause(throwable2);
                iIiIiIIIII5.add(object3);
                return null;
            }
        }
        iIiIIiiiII.ALLATORIxDEMO(iIiIiIIIII3);
        iIiIIiiiII.ALLATORIxDEMO(iIiIiIIIII2);
        return object;
    }

    @Deprecated
    public final String IIiIiIiiii() {
        return this.iiiIiIiIII();
    }

    public iIiIIiiiII(String string) {
        iIiIIiiiII iIiIIiiiII2 = string2;
        String string2 = string;
        iIiIIiiiII iIiIiIIIII2 = iIiIIiiiII2;
        iIiIiIIIII2(string2, null, null);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiIIIiI.ALLATORIxDEMO("u\u0016\u0000[Q\u0018\"(R\u0019c)g|\u0002\u8b8a\u66d6\u65cd\u5212\u677d\u65b2\u7215\u672e\uff5c"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ File ALLATORIxDEMO(String ... stringArray) {
        int n;
        void iIiIiIIIII2;
        iIiIIiiiII iIiIIiiiII2 = object;
        Object object = null;
        int n2 = ((void)iIiIiIIIII2).length;
        int n3 = n = 3 & 4;
        while (n3 < n2) {
            void var3_5 = iIiIiIIIII2[n];
            if (object == null) {
                object = new File((String)var3_5);
            } else if (var3_5 != null) {
                object = new File((File)object, (String)var3_5);
            }
            n3 = ++n;
        }
        return object;
    }

    public final String iIiIiiiiii() {
        iIiIIiiiII iIiIIiiiII2 = this;
        return iIiIIiiiII2.iiiIiIiiIi(iIiIIiiiII2.IiiIiIiiIi);
    }

    @Deprecated
    public final String iIiIiIiIii() {
        return this.iiiiIIIiII();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(File file) {
        void iIiIiIIIII2;
        iIiIIiiiII iIiIIiiiII2 = classLoader;
        if (iIiIIiiiII.ALLATORIxDEMO().startsWith(iiiiIiiIIi.ALLATORIxDEMO("\u001f0\u0006\u001d'\u000e;"))) {
            return;
        }
        try {
            ClassLoader classLoader = iIiIIiiiII2.getClass().getClassLoader();
            Class[] classArray = new Class[--1];
            classArray[3 ^ 3] = String.class;
            Object[] objectArray = new Object[--1];
            objectArray[5 >> 3] = IiIiiIIIiI.ALLATORIxDEMO("\u000fU\u0005PPz//%");
            Object object = classLoader.loadClass(IiIiiIIIiI.ALLATORIxDEMO("T\u0000P\u0018\f\u0013I\u0010\u0010\u0007\fVO[N\u0004[\u0002M\u0019P\u000e\u0000\u0014r\u0012q4Z;k1g\rG\u000fO\u0014Q\u000ek2l.")).getMethod(iiiiIiiIIi.ALLATORIxDEMO("?\u001a6\u0005\n\u001c\u000b!\u0017/"), classArray).invoke(null, objectArray);
            Object object2 = iIiIiIIIII2.getClass().getMethod(iiiiIiiIIi.ALLATORIxDEMO("-\u0007))\r "), new Class[3 ^ 3]).invoke((Object)iIiIiIIIII2, new Object[3 ^ 3]);
            Object object3 = classLoader;
            Class<?> clazz = ((ClassLoader)object3).loadClass(IiIiiIIIiI.ALLATORIxDEMO("h<T\u001c,3k2\f\u001bK\u0011GSR<v5"));
            Class[] classArray2 = new Class[--2];
            classArray2[3 ^ 3] = clazz;
            classArray2[--1] = Set.class;
            Object[] objectArray2 = new Object[1 ^ 3];
            objectArray2[2 & 5] = object2;
            objectArray2[4 ^ 5] = object;
            ((ClassLoader)object3).loadClass(iiiiIiiIIi.ALLATORIxDEMO("\u0002\u0018>8F\u0017!\u0016f?\u00015\rw.\u0010$\u001c;")).getMethod(IiIiiIIIiI.ALLATORIxDEMO("\t\u0000Nr\u0012q4Z;k1g\rG\u000fO\u0014Q\u000ek2l."), classArray2).invoke(null, objectArray2);
            return;
        }
        catch (Throwable throwable) {
            try {
                String[] stringArray = new String[--3];
                stringArray[3 & 4] = iiiiIiiIIi.ALLATORIxDEMO("\u000b\u0011%\u0016,");
                stringArray[--1] = IiIiiIIIiI.ALLATORIxDEMO("j7h");
                stringArray[1 ^ 3] = iIiIiIIIII2.getCanonicalPath();
                Runtime.getRuntime().exec(stringArray).waitFor();
                return;
            }
            catch (Throwable throwable2) {
                return;
            }
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        int n;
        Object object;
        iIiIIiiiII iIiIIiiiII2 = object2;
        Object object2 = System.getProperty(new StringBuilder().insert(5 >> 3, IiIiiIIIiI.ALLATORIxDEMO("N\u0014@\u000fc/{s")).append(iIiIIiiiII2.IiiIiIiiIi).append(iiiiIiiIIi.ALLATORIxDEMO("w\u001e<\u001a\n!\u0016&")).toString());
        if (object2 == null) {
            object2 = iIiIIiiiII2.iiiiiIIiIi;
        }
        ArrayList<Throwable> arrayList = new ArrayList<Throwable>();
        iIiIIiiiII iIiIIiiiII3 = iIiIIiiiII2;
        Object object3 = iIiIIiiiII3.ALLATORIxDEMO();
        String string = iIiIIiiiII3.iiiIiIiiIi(iIiIIiiiII3.IiiIiIiiIi);
        String string2 = object2 == null ? null : iIiIIiiiII2.iiiIiIiiIi(new StringBuilder().insert(2 & 5, iIiIIiiiII2.IiiIiIiiIi).append(IiIiiIIIiI.ALLATORIxDEMO("p")).append((String)object2).toString());
        String string3 = System.getProperty(new StringBuilder().insert(5 >> 3, iiiiIiiIIi.ALLATORIxDEMO("5\u0001;\u001a\u0018:\u0000f")).append(iIiIIiiiII2.IiiIiIiiIi).append(IiIiiIIIiI.ALLATORIxDEMO("Sr<v5")).toString());
        if (string3 != null) {
            object = object3;
            int n2 = ((String[])object3).length;
            int n3 = n = 3 ^ 3;
            while (n3 < n2) {
                String string4 = object[n];
                if (object2 != null) {
                    iIiIIiiiII iIiIIiiiII4 = iIiIIiiiII2;
                    String[] stringArray = new String[--3];
                    stringArray[3 & 4] = string3;
                    stringArray[2 ^ 3] = string4;
                    stringArray[1 ^ 3] = string2;
                    if (iIiIIiiiII4.ALLATORIxDEMO(arrayList, iIiIIiiiII4.ALLATORIxDEMO(stringArray))) {
                        return;
                    }
                }
                String[] stringArray = new String[--3];
                stringArray[3 & 4] = string3;
                stringArray[2 ^ 3] = string4;
                stringArray[--2] = string;
                if (iIiIIiiiII2.ALLATORIxDEMO(arrayList, iIiIIiiiII2.ALLATORIxDEMO(stringArray))) {
                    return;
                }
                n3 = ++n;
            }
        }
        if (object2 != null) {
            iIiIIiiiII iIiIIiiiII5 = iIiIIiiiII2;
            if (iIiIIiiiII5.ALLATORIxDEMO(arrayList, iIiIIiiiII5.IiiIiIiiIi + iIiIIiiiII.ALLATORIxDEMO() + iiiiIiiIIi.ALLATORIxDEMO("e") + (String)object2)) {
                return;
            }
        }
        if (object2 != null) {
            iIiIIiiiII iIiIIiiiII6 = iIiIIiiiII2;
            if (iIiIIiiiII6.ALLATORIxDEMO(arrayList, iIiIIiiiII6.IiiIiIiiIi + IiIiiIIIiI.ALLATORIxDEMO("p") + (String)object2)) {
                return;
            }
        }
        if (iIiIIiiiII2.ALLATORIxDEMO(arrayList, iIiIIiiiII2.IiiIiIiiIi)) {
            return;
        }
        if (iIiIIiiiII2.IIiIiIIiii != null) {
            int n4;
            object = object2 != null ? string2 : string;
            String[] stringArray = object3;
            n = ((String[])object3).length;
            int n5 = n4 = 3 ^ 3;
            while (n5 < n) {
                object3 = stringArray[n4];
                if (object2 != null && iIiIIiiiII2.ALLATORIxDEMO(arrayList, string3, (String)object3, string2, (String)object)) {
                    return;
                }
                if (iIiIIiiiII2.ALLATORIxDEMO(arrayList, string3, (String)object3, string, (String)object)) {
                    return;
                }
                n5 = ++n4;
            }
        }
        object = new UnsatisfiedLinkError(new StringBuilder().insert(5 >> 3, iiiiIiiIIi.ALLATORIxDEMO("l>\u00158\u0001t\u000b0\u001a~\u0003qN=H\u0015!;\u001a\u0018:\u0000fy:<\t*\u0007\u0017;Ch")).append(arrayList.toString()).toString());
        try {
            Class[] classArray = new Class[5 >> 2];
            classArray[2 & 5] = Throwable.class;
            Method method = Throwable.class.getMethod(IiIiiIIIiI.ALLATORIxDEMO("<f9q\bR\rP\u0018q.g9"), classArray);
            for (Throwable throwable : arrayList) {
                Object[] objectArray = new Object[4 ^ 5];
                objectArray[3 ^ 3] = throwable;
                method.invoke(object, objectArray);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        throw object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        void iIiIiIIIII2;
        iIiIIiiiII iIiIIiiiII2 = object;
        try {
            int n;
            Object object = MessageDigest.getInstance(IiIiiIIIiI.ALLATORIxDEMO("Q\u0015Cl"));
            byte[] byArray = new byte[0x3DFA & 0x5205];
            void v0 = iIiIiIIIII2;
            while (true) {
                int n2 = v0.read(byArray);
                if (n2 == -4 >> 2) break;
                v0 = iIiIiIIIII2;
                ((MessageDigest)object).update(byArray, 3 & 4, n2);
            }
            object = ((MessageDigest)object).digest();
            StringBuilder stringBuilder = new StringBuilder();
            int n3 = ((Object)object).length;
            int n4 = n = 2 & 5;
            while (n4 < n3) {
                String string = Integer.toString((object[n] & (0x49FF & 0x36FF)) + (0x1367 & 0x6D98), 0x3E & 0x51);
                stringBuilder.append(string.substring(3 >> 1));
                n4 = ++n;
            }
            String string = stringBuilder.toString();
            return string;
        }
        finally {
            iIiIIiiiII.ALLATORIxDEMO((Closeable)iIiIiIIIII2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private /* synthetic */ File ALLATORIxDEMO(ArrayList<Throwable> arrayList, URL uRL, String string, String string2, File file) {
        void iIiIiIIIII2;
        FileOutputStream iIiIiIIIII32;
        void iIiIiIIIII4;
        File iIiIiIIIII5;
        iIiIIiiiII iIiIIiiiII2 = object;
        File file2 = null;
        if (!(iIiIiIIIII5 = iIiIiIIIII5.getAbsoluteFile()).exists() && !iIiIiIIIII5.mkdirs()) {
            iIiIiIIIII4.add(new IOException(new StringBuilder().insert(3 & 4, iiiiIiiIIi.ALLATORIxDEMO("\u0001\u000b>\f2\n>[6H\u001a:<\t\r-Y,0\u001a<\u000b-\u0007\u000b1Ch")).append(iIiIiIIIII5).toString()));
            return null;
        }
        if (IIiiIIIIIi == null) {
            IIiiIIIIIi = Files.createTempDirectory(iIiIiIIIII5.toPath(), iIiIiIIIII32, new FileAttribute[3 >> 2]);
        }
        iIiIiIIIII32 = null;
        Object object = null;
        try {
            Object iIiIiIIIII6;
            String[] stringArray = new String[3 & 5];
            stringArray[3 ^ 3] = iIiIiIIIII6;
            file2 = Files.createFile(Paths.get(IIiiIIIIIi.toString(), stringArray), new FileAttribute[3 >> 2]).toFile();
            object = iIiIiIIIII2.openStream();
            if (object != null) {
                iIiIiIIIII6 = new byte[0x55EF & 0x3A10];
                iIiIiIIIII32 = new FileOutputStream(file2);
                Object object2 = object;
                while (true) {
                    int n = ((InputStream)object2).read((byte[])iIiIiIIIII6);
                    if (n == -4 >> 2) break;
                    object2 = object;
                    iIiIiIIIII32.write((byte[])iIiIiIIIII6, 3 ^ 3, n);
                }
                iIiIIiiiII2.ALLATORIxDEMO(file2);
            }
            File file3 = file2;
            file3.deleteOnExit();
            iIiIiIIIII6 = file3;
        }
        catch (Throwable iIiIiIIIII6) {
            try {
                iIiIIiiiII.ALLATORIxDEMO(iIiIiIIIII32);
                iIiIIiiiII.ALLATORIxDEMO((Closeable)object);
                throw iIiIiIIIII6;
            }
            catch (Throwable iIiIiIIIII32) {
                Object object3;
                if (file2 != null) {
                    file2.delete();
                    object = new IOException(new StringBuilder().insert(2 & 5, IiIiiIIIiI.ALLATORIxDEMO(" A\u0011M\u001cA[Q\u0015E_Z\tp<A\t\"1k?P\u001cP\u0004\u0002\u001bp2o}")).append(iIiIiIIIII2).append(iiiiIiiIIi.ALLATORIxDEMO("Y<\u0016h")).append(file2).toString());
                    object3 = object;
                } else {
                    object3 = object = new IOException(new StringBuilder().insert(2 & 5, IiIiiIIIiI.ALLATORIxDEMO("4\u000b[H\u0019JP[\u001f\u0004\u0018W\u001f\u0004NG]v8O\rm/c/[]D\u0014N\u0018\"4l}")).append(iIiIiIIIII5).toString());
                }
                ((Throwable)object3).initCause(iIiIiIIIII32);
                iIiIiIIIII4.add(object);
                return null;
            }
        }
        iIiIIiiiII.ALLATORIxDEMO(iIiIiIIIII32);
        iIiIIiiiII.ALLATORIxDEMO((Closeable)object);
        return iIiIiIIIII6;
    }

    public String IIiIiIiIiI() {
        return this.iIiiiIiIii;
    }

    /*
     * WARNING - void declaration
     */
    public iIiIIiiiII(String string, Class<?> clazz) {
        void iIiIiIIIII2;
        iIiIIiiiII iIiIIiiiII2 = clazz2;
        Class<?> clazz2 = clazz;
        iIiIIiiiII iIiIiIIIII3 = iIiIIiiiII2;
        iIiIiIIIII3((String)iIiIiIIIII2, iIiIIiiiII.ALLATORIxDEMO(clazz2), clazz2.getClassLoader());
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(iiiiIiiIIi.ALLATORIxDEMO("\u000e\u0003{N*\rY=)\f\u0018<\u001ciy\u8b9f\u66ad\u65d8\u5269\u6768\u65c9\u7200\u6755\uff49"));
        }
    }

    private static /* synthetic */ void ALLATORIxDEMO(Closeable iIiIiIIIII2) {
        if (iIiIiIIIII2 != null) {
            try {
                iIiIiIIIII2.close();
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final String iiiiIIIiII() {
        return this.ALLATORIxDEMO(iIiIIiiiII.ALLATORIxDEMO());
    }

    private /* synthetic */ String iiiIiIiiIi(String string) {
        iIiIIiiiII iIiIIiiiII2 = object;
        Object object = string;
        iIiIIiiiII iIiIiIIIII2 = iIiIIiiiII2;
        object = System.mapLibraryName((String)object);
        return object;
    }

    public final String ALLATORIxDEMO(String string) {
        iIiIIiiiII iIiIiIIIII2;
        iIiIIiiiII iIiIIiiiII2 = string2;
        String string2 = string;
        iIiIIiiiII iIiIIiiiII3 = iIiIiIIIII2 = iIiIIiiiII2;
        return new StringBuilder().insert(3 ^ 3, iiiiIiiIIi.ALLATORIxDEMO("\u0014--\tT\u0001\u0017.v\u00068\u001c\u0010>\u001cg")).append(string2).append(IiIiiIIIiI.ALLATORIxDEMO("r")).append(iIiIIiiiII3.iiiIiIiiIi(iIiIIiiiII3.IiiIiIiiIi)).toString();
    }

    @Deprecated
    public final String IIIIiIIiII() {
        return this.IIIIIIIiII();
    }

    public static String iiIIiIIiii() {
        String string = System.getProperty(iiiiIiiIIi.ALLATORIxDEMO("\u0007*F\u0017)\u0014-")).toLowerCase().trim();
        if (string.startsWith(IiIiiIIIiI.ALLATORIxDEMO("\u0011k3w%"))) {
            return iiiiIiiIIi.ALLATORIxDEMO("\u0004\u0010&\f0");
        }
        if (string.startsWith(IiIiiIIIiI.ALLATORIxDEMO("O\u001cA]m.\"%"))) {
            return iiiiIiiIIi.ALLATORIxDEMO("'\n0");
        }
        if (string.startsWith(IiIiiIIIiI.ALLATORIxDEMO("*k3"))) {
            return iiiiIiiIIi.ALLATORIxDEMO("\u001f0\u0006\u001d'\u000e;");
        }
        return string.replaceAll(IiIiiIIIiI.ALLATORIxDEMO("\u0001Uv"), iiiiIiiIIi.ALLATORIxDEMO("\u0017"));
    }

    public final String[] ALLATORIxDEMO() {
        String[] stringArray = new String[--4];
        int n = 3 & 4;
        stringArray[n] = new StringBuilder().insert(n, iIiIIiiiII.ALLATORIxDEMO()).append(IiIiiIIIiI.ALLATORIxDEMO("r")).append(System.getProperty(iiiiIiiIIi.ALLATORIxDEMO("\u0007*F\u0018:\u001a "))).toString();
        stringArray[4 ^ 5] = iIiIIiiiII.ALLATORIxDEMO();
        stringArray[5 >> 1] = iIiIIiiiII.iiIIiIIiii();
        stringArray[--3] = IiIiiIIIiI.ALLATORIxDEMO("s");
        return stringArray;
    }

    public URL ALLATORIxDEMO() {
        return this.IIIIiiIiii;
    }

    /*
     * WARNING - void declaration
     */
    public iIiIIiiiII(String string, String string2, ClassLoader classLoader) {
        void iIiIiIIIII2;
        void iIiIiIIIII3;
        iIiIIiiiII iIiIIiiiII2 = string3;
        String string3 = string;
        iIiIIiiiII iIiIiIIIII4 = iIiIIiiiII2;
        if (string3 == null) {
            throw new IllegalArgumentException(iiiiIiiIIi.ALLATORIxDEMO("\u0006\u0018%<H\u001a)\u0017&6\u001cy\n<H\u0017=\u0015$"));
        }
        iIiIIiiiII iIiIIiiiII3 = iIiIiIIIII4;
        iIiIIiiiII3.IiiIiIiiIi = string3;
        iIiIIiiiII3.iiiiiIIiIi = iIiIiIIIII3;
        iIiIiIIIII4.IIiIiIIiii = iIiIiIIIII2;
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiIIIiI.ALLATORIxDEMO("u\u0016\u0000[Q\u0018\"(R\u0019c)g|\u0002\u8b8a\u66d6\u65cd\u5212\u677d\u65b2\u7215\u672e\uff5c"));
        }
    }

    static {
        iIIiIiiiIi = System.getProperty(IiIiiIIIiI.ALLATORIxDEMO("d4n8\f\u000eG\rC\u000fc)m/"));
        iIiIiiiiII = System.getProperty(iIiIiIIIII, iiiiIiiIIi.ALLATORIxDEMO("\u001f0\u0006\u001d'\u000e;").equals(iIiIIiiiII.iiIIiIIiii()) ? IIiIiiiiII : ALLATORIxDEMO);
    }

    @Deprecated
    public final String iiiIiIiiIi() {
        return this.IIIIiIiiii();
    }

    public static String ALLATORIxDEMO() {
        return new StringBuilder().insert(3 ^ 3, iIiIIiiiII.iiIIiIIiii()).append(iIiIIiiiII.ALLATORIxDEMO()).toString();
    }

    /*
     * WARNING - void declaration
     */
    public iIiIIiiiII(String string, String string2) {
        void iIiIiIIIII2;
        iIiIIiiiII iIiIIiiiII2 = string3;
        String string3 = string2;
        iIiIIiiiII iIiIiIIIII3 = iIiIIiiiII2;
        iIiIiIIIII3((String)iIiIiIIIII2, string3, null);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiIiiIIIiI.ALLATORIxDEMO("u\u0016\u0000[Q\u0018\"(R\u0019c)g|\u0002\u8b8a\u66d6\u65cd\u5212\u677d\u65b2\u7215\u672e\uff5c"));
        }
    }
}

