package com.gj.demo.java.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;

/**
 * Created by guanjian on 17-7-3.
 * <p>
 * 生成循环和自动缩进
 */

public class Demo2 {

    private static MethodSpec simpleMethod() {
        return MethodSpec.methodBuilder("method1")
                .addCode("int total=10;\nfor(int i=0;i<total;++i) { \ntotal+=i; \n}\n")
                .build();
    }

    private static MethodSpec computeRange(String name, int from, int to, String op) {
        return MethodSpec.methodBuilder(name)
                .returns(int.class)
                .addStatement("int result = 0")
                .beginControlFlow("for (int i = " + from + "; i < " + to + "; i++)")
                .addStatement("result = result " + op + " i")
                .endControlFlow()
                .addStatement("return result")
                .build();
    }

    public static void main(String[] args) {

        TypeSpec methodControl = TypeSpec.classBuilder("MethodControl")
                .addMethod(simpleMethod())
                .addMethod(computeRange("main", 0, 10, "+"))
                .build();

        JavaFile javaFile = JavaFile.builder("com.gi.demo.java.javapoet", methodControl)
                .build();
        try {
            javaFile.writeTo(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
