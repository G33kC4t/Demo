package com.gj.demo.java.annotation.demo1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by guanjian on 17-6-27.
 *
 * 修饰数据表字段属性
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {

    boolean primaryKey() default false;

    boolean allowNull() default true;

    boolean unique() default false;
}
