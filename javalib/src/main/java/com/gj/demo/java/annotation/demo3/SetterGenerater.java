package com.gj.demo.java.annotation.demo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by guanjian on 17-7-4.
 * <p>
 * 用来给类生成set方法
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface SetterGenerater {
}
