package com.gj.demo.java.annotation.demo3;

import java.util.Set;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.element.VariableElement;

/**
 * Created by guanjian on 17-7-7.
 */

public class Demo3FieldAnnotations {

    public static final int GETTER = 0x01;
    public static final int SETTER = 0x02;

    private final VariableElement element;
    private final Name nameString;
    private final String methodString;
    private final String importString;
    private final String typeNameString;
    private final Set<Modifier> modifierSet;
    private final int function;


    public Demo3FieldAnnotations(VariableElement element) {
        this.element = element;
        this.nameString = element.getSimpleName();
        this.methodString = generateMethodString();
        this.importString = generateImportString();
        this.typeNameString = generateTypeNameString();
        this.modifierSet = element.getModifiers();
        this.function = generateFunction();
    }

    public String generateMethodString() {
        return "";
    }

    public String generateImportString() {
        return "";
    }

    public String generateTypeNameString() {
        return "";
    }

    public int generateFunction() {
        return 0;
    }

    public boolean isViable() {
        return true;
    }

    public boolean needSetter() {
        return (function & SETTER) != 0;
    }

    public boolean needGetter() {
        return (function & GETTER) != 0;
    }
}
