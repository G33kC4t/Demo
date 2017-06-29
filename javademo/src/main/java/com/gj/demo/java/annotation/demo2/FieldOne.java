package com.gj.demo.java.annotation.demo2;

/**
 * Created by guanjian on 17-6-29.
 */

public class FieldOne {
    private int i;
    private Integer I;
    private String str;
    private FieldThree fieldThree;
    public FieldTwo<Long> fieldTwo;

    private FieldInterface fi = new FieldImplements();
    private FieldInterface fii = new FieldInnerImplements();
    private FieldInterface fsii = new FieldStaticInnerImplements();
    private FieldInterface fuii = new FieldInterface() {
        @Override
        public void f() {

        }
    };

    private FieldImplements afi = new FieldImplements();
    private FieldInnerImplements afii = new FieldInnerImplements();
    private FieldStaticInnerImplements afsii = new FieldStaticInnerImplements();

    private class FieldInnerImplements implements FieldInterface {
        @Override
        public void f() {

        }
    }

    private static class FieldStaticInnerImplements implements FieldInterface {
        @Override
        public void f() {

        }
    }
}
