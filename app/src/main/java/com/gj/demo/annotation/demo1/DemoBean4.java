package com.gj.demo.annotation.demo1;

import com.gj.demo.java.annotation.demo3.GetterGenerater;
import com.gj.demo.java.annotation.demo3.SetterGenerater;

import java.util.List;

/**
 * Created by guanjian on 17-7-4.
 */

@GetterGenerater
@SetterGenerater
public class DemoBean4 extends DemoBean2<Long> implements DemoBean3 {
    protected List<Long> longs;
    protected DemoBean5 demoBean5;
    protected DemoBean6 demoBean6;
    protected DemoBean6.DemoBean7 demoBean7;
    protected DemoBean5.DemoBean8 demoBean8;
    protected DemoBean5.DemoBean9 demoBean9;

    @GetterGenerater
    @SetterGenerater
    public static class DemoBean5 extends DemoBean2<String> implements DemoBean3 {

        @GetterGenerater
        @SetterGenerater
        public static class DemoBean9 {
        }

        @GetterGenerater
        @SetterGenerater
        public class DemoBean8 {
        }
    }

    @GetterGenerater
    @SetterGenerater
    public class DemoBean6 extends DemoBean2<String> implements DemoBean3 {

        @GetterGenerater
        @SetterGenerater
        public class DemoBean7 {
        }
    }
}
