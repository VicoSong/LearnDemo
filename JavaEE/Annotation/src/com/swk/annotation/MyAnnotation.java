package com.swk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description:�Զ���ע�⣬ʹ��@�ؼ���
 * @author Vico
 *
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME )
public @interface MyAnnotation {
	String name();
	int age();
}
