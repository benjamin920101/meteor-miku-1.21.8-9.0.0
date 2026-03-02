/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.fusesource.hawtjni.runtime.ClassFlag;

@Documented
@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface IiiiIiIiii {
    public String IiiiiiiIIi() default "";

    public String iIIiIiiiII() default "";

    public ClassFlag[] IiiIIiIIIi() default {};
}

