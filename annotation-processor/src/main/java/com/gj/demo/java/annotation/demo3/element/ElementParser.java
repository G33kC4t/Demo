package com.gj.demo.java.annotation.demo3.element;


import com.gj.demo.java.annotation.demo3.type.TypeMirrorParser;
import com.gj.demo.java.annotation.demo3.type.TypeMirrorParserFactory;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.lang.model.element.Element;
import javax.lang.model.type.TypeMirror;

/**
 * Created by guanjian on 17-7-10.
 */

public abstract class ElementParser<E extends Element, T extends TypeMirror> {

    private final E element;
    private final TypeMirrorParser<T> parser;

    public ElementParser(@Nonnull E element) {
        this.element = element;
        this.parser = TypeMirrorParserFactory.newInstance(element.asType());
    }

    @Nonnull
    public E getRealElement() {
        return element;
    }

    @Nullable
    public TypeMirrorParser<T> getTypeMirrorParser() {
        return parser;
    }
}
