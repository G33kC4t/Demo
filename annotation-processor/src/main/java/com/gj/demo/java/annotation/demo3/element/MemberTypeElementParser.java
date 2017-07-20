package com.gj.demo.java.annotation.demo3.element;

import javax.annotation.Nonnull;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;

/**
 * Created by guanjian on 17-7-14.
 */

public class MemberTypeElementParser extends ElementParser<TypeElement, DeclaredType> {

    public MemberTypeElementParser(@Nonnull TypeElement element) {
        super(element);
    }


}
