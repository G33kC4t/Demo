package com.gj.demo.java.annotation.demo3;

import javax.lang.model.type.TypeMirror;

/**
 * Created by guanjian on 17-7-7.
 */

public abstract class TypeMirrorParser<T extends TypeMirror> {

    private final T type;

    public TypeMirrorParser(T type) {
        this.type = type;
    }

    public abstract String getImportName();
}
