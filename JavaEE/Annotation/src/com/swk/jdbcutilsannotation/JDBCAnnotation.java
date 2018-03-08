package com.swk.jdbcutilsannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface JDBCAnnotation {
    String driverClass();
    String url();
    String userName();
    String password();
}
