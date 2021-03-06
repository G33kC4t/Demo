package com.gj.demo.java.annotation.demo3.element;


import javax.annotation.Nonnull;
import javax.lang.model.element.Element;
import javax.lang.model.type.TypeMirror;

/**
 * Created by guanjian on 17-7-10.
 */

public abstract class ElementParser<E extends Element, T extends TypeMirror> {

    private final E element;
    private final T typeMirror;

    public ElementParser(@Nonnull E element) {
        this.element = element;
        this.typeMirror = (T) element.asType();
    }

    @Nonnull
    public E getRealElement() {
        return element;
    }

    public T getRealTypeMirror() {
        return typeMirror;
    }
}
