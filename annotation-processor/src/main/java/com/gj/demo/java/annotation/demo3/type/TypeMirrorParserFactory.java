package com.gj.demo.java.annotation.demo3.type;

import javax.lang.model.type.TypeMirror;

/**
 * Created by guanjian on 17-7-12.
 */

public class TypeMirrorParserFactory {

    public static <T extends TypeMirror> TypeMirrorParser<T> newInstance(TypeMirror typeMirror) {
        return null;
    }
}
