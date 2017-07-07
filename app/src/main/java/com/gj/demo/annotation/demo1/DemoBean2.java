package com.gj.demo.annotation.demo1;

import com.gj.demo.java.annotation.demo3.GetterGenerater;
import com.gj.demo.java.annotation.demo3.SetterGenerater;

/**
 * Created by guanjian on 17-7-4.
 */

@GetterGenerater
@SetterGenerater
public class DemoBean2<T> extends DemoBean1 {
    protected T a;
}
