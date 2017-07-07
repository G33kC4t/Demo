package com.gj.demo.java.annotation.demo3;

import java.util.List;

import javax.lang.model.element.Element;

/**
 * Created by guanjian on 17-7-6.
 */

public class ClassElement {

    private final Element element;

    public ClassElement(Element element) {
        this.element = element;
    }

    public void append(Element element, List<FieldElement> fieldElements) {

    }
}
