/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiiiIiiii;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.fusesource.hawtjni.runtime.MethodFlag;

@Documented
@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface iIIiIIIiii {
    public String iIiIiIiIii() default "";

    public MethodFlag[] IIiIiIiIiI() default {};

    public String iiiiIIIiII() default "";

    public String IIIIiIIiII() default "";

    public String iiIIiIIiii() default "";

    public iIiiiIiiii[] iiiIiIiiIi() default {};
}

