package com.gj.demo.java.annotation.demo3.element;

import java.util.List;

import javax.annotation.Nonnull;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;

/**
 * Created by guanjian on 17-7-13.
 */

public class TopLevelTypeElementParser extends ElementParser<TypeElement, DeclaredType> {

    public TopLevelTypeElementParser(@Nonnull TypeElement element) {
        super(element);
    }

    public PackageElementParser getPackageElement() {
        return ElementParserFactory.generateElementParser(getRealElement().getEnclosingElement());
    }

    public List<MemberTypeElementParser> getMemberTypeElement() {
        return null;
    }


}
