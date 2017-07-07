package com.gj.demo.annotation.demo1;

import android.graphics.Point;

import com.gj.demo.DemoEnum;
import com.gj.demo.java.annotation.demo3.GetterGenerater;
import com.gj.demo.java.annotation.demo3.SetterGenerater;
import com.gj.demo.annotation.demo1.DemoBean4.DemoBean6.DemoBean7;
import com.gj.demo.annotation.demo1.DemoBean4.*;

/**
 * Created by guanjian on 17-7-4.
 */

@GetterGenerater
@SetterGenerater
public class DemoBean1 {
    protected int ii;
    protected final Long ll = 10L;
    protected final String string = "test";
    protected DemoBean2<? extends DemoBean1> demoBean2;
    protected String[] strings;
    protected DemoBean4[] demoBean4s;
    protected DemoEnum demoEnum;
    protected Class cls;
    protected Class<Long> lCls;
    protected Class<? extends Point> aClass;
    protected final DemoBean5 demoBean5 = new DemoBean5();
    protected DemoBean6 demoBean6;
    protected DemoBean7 demoBean7;
    protected DemoBean5.DemoBean8 demoBean8;
    protected DemoBean5.DemoBean9 demoBean9;
}
