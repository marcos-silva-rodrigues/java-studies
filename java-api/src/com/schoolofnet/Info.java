package com.schoolofnet;

import java.lang.annotation.*;


//@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Info {

    String creteadBy() default "Marcos";
}
