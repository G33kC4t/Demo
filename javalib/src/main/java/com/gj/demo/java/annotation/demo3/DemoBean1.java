package com.gj.demo.java.annotation.demo3;

/**
 * Created by guanjian on 17-7-4.
 */

@GetterGenerater
@SetterGenerater
public class DemoBean1 {
    int a;
    String b;
    DemoBean2<? extends DemoBean1> c;
    String[] ss;
    DemoBean4[] ddd;
}
