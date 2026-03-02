/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.fusesource.hawtjni.runtime.ArgFlag;

@Documented
@Target(value={ElementType.PARAMETER})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface iIiiiIiiii {
    public ArgFlag[] IiIIIiiiII() default {};

    public String iIIIIIIIIi() default "";
}

