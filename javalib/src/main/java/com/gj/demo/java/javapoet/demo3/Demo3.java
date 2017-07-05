package com.gj.demo.java.javapoet.demo3;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Modifier;

import com.gj.demo.java.javapoet.demo3.A.B;
import com.gj.demo.java.javapoet.demo3.A.B.C;

/**
 * Created by guanjian on 17-7-3.
 */

public class Demo3 {

    public static void main(String[] args) {

        TypeName listOfA = ParameterizedTypeName.get(List.class, A.class);
        MethodSpec beyond = MethodSpec.methodBuilder("beyond")
                .addStatement("$T result = new $T<>()", listOfA, ArrayList.class)
                .addStatement("result.add(new $T())", A.class)
                .addStatement("result.add(new $T())", D.class)
                .addStatement("$T b = new $T()", B.class, B.class)
                .addStatement("$T[] c = new $T[5]", C.class, C.class)
                .addStatement("return result")
                .build();

        TypeSpec types = TypeSpec.classBuilder("Types")
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addMethod(beyond)
                .build();

        JavaFile javaFile = JavaFile.builder("com.gi.demo.java.javapoet", types)
                .build();
        try {
            javaFile.writeTo(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
