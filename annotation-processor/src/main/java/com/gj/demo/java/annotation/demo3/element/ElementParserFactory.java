package com.gj.demo.java.annotation.demo3.element;

import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;

/**
 * Created by guanjian on 17-7-13.
 */

public class ElementParserFactory {

    public static <P extends ElementParser> P generateElementParser(Element element) {
        if (element instanceof PackageElement) {
            return (P) new PackageElementParser((PackageElement) element);
        }
        if (element instanceof TypeElement) {
            return (P) new TopLevelTypeElementParser((TypeElement) element);
        }
        return null;
    }
}
