/*
 * Decompiled with CFR 0.152.
 */
package com.github.mikumiku.addon;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.fusesource.hawtjni.runtime.FieldFlag;

@Documented
@Target(value={ElementType.FIELD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface iiiIiIiIiI {
    public String IIIIiIIIII() default "";

    public String IIIIiIiiii() default "";

    public String iiiIiIiIII() default "";

    public String IIIIIIIiII() default "";

    public String IIiIiIiiii() default "";

    public FieldFlag[] iIiIiiiiii() default {};
}

