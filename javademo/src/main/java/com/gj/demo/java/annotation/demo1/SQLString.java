package com.gj.demo.java.annotation.demo1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by guanjian on 17-6-27.
 *
 * 修饰数据库表字段 STRING类型
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {

    int size();

    String name() default "";

    Constraints constraints() default @Constraints;
}
