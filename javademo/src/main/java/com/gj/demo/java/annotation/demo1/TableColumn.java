package com.gj.demo.java.annotation.demo1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by guanjian on 17-6-28.
 * <p>
 * 表字段属性
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TableColumn {

    String name() default "";

    PropertyType property() default PropertyType.Auto;

    Constraints constraints() default @Constraints;
}
