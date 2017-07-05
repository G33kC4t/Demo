package com.gj.demo.java.annotation.demo3;

import java.util.List;

/**
 * Created by guanjian on 17-7-4.
 */

@GetterGenerater
@SetterGenerater
public class DemoBean4 extends DemoBean2<Long> implements DemoBean3 {
    List<Long> longs;
}
