package com.gj.demo.java.annotation.demo3.element;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.type.NoType;

/**
 * Created by guanjian on 17-7-13.
 */

public class PackageElementParser extends ElementParser<PackageElement, NoType> {

    public PackageElementParser(@Nonnull PackageElement element) {
        super(element);
    }

    @Nonnull
    public List<TopLevelTypeElementParser> getAllTypeElementParser() {
        List<TopLevelTypeElementParser> parsers = new ArrayList<>();
        List<? extends Element> elements = getRealElement().getEnclosedElements();
        for (Element element : elements) {
            TopLevelTypeElementParser parser = ElementParserFactory.generateElementParser(element);
            parsers.add(parser);
        }
        return parsers;
    }

    @Nonnull
    public String getImportString() {
        StringBuilder builder = new StringBuilder("import ");
        builder.append(getRealElement().getQualifiedName());
        builder.append(";");
        return builder.toString();
    }

    @Nonnull
    public String getImportAllString() {
        StringBuilder builder = new StringBuilder("import ");
        builder.append(getRealElement().getQualifiedName());
        builder.append(".*;");
        return builder.toString();
    }

}
