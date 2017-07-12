package com.gj.demo.java.annotation.demo3.type;

import javax.lang.model.type.TypeMirror;

/**
 * Created by guanjian on 17-7-12.
 */

public abstract class TypeMirrorParser<T extends TypeMirror> {

    private final T typeMirror;

    public TypeMirrorParser(T typeMirror) {
        this.typeMirror = typeMirror;
    }

    public T getTypeMirror() {
        return typeMirror;
    }
}
