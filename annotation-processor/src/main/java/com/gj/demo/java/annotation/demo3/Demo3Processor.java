package com.gj.demo.java.annotation.demo3;

import com.google.auto.service.AutoService;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;

/**
 * Created by guanjian on 17-7-5.
 */

@AutoService(Processor.class)
public class Demo3Processor extends AbstractProcessor {

    public static final String PACKAGE = "com.gj.demo.annotation.demo1";

    private Messager messager;
    private Filer filer;
    private Elements elements;
    private Types types;

    private final List<ClassElement> classElements = new ArrayList<>();

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);

        messager = processingEnvironment.getMessager();
        filer = processingEnvironment.getFiler();
        elements = processingEnvironment.getElementUtils();
        types = processingEnvironment.getTypeUtils();
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> types = new LinkedHashSet<>();
        types.add(GetterGenerater.class.getCanonicalName());
        types.add(SetterGenerater.class.getCanonicalName());
        return types;
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        long t = System.nanoTime();
        messager.printMessage(Diagnostic.Kind.OTHER, "Start process.....");
        if (set != null && set.size() > 0) {
            for (TypeElement typeElement : set) {
                Set<? extends Element> elements = roundEnvironment.getElementsAnnotatedWith(typeElement);
                for (Element element : elements) {
                    parseElement(element);
                }
            }
        }
        messager.printMessage(Diagnostic.Kind.OTHER, "End process..... " + toTimeFormat(System.nanoTime() - t));
        return true;
    }

    private double toTimeFormat(long ut) {
        return ut / 1000000.0;
    }

    private void parseElement(Element element) {

        if (element.getKind() != ElementKind.CLASS) {
            messager.printMessage(Diagnostic.Kind.ERROR, "Element kind error!", element);
            return;
        }

        ClassElement classElement = new ClassElement(element);

        while (true) {
            TypeElement typeElement = (TypeElement) element;
            Name name = typeElement.getQualifiedName();
            String nameString = name.toString();
            messager.printMessage(Diagnostic.Kind.OTHER, "Parse element --> " + nameString);
            if (!nameString.startsWith(PACKAGE)) {
                break;
            }
            classElement.append(element, parseElementField(element));
            break;
        }
    }

    private List<FieldElement> parseElementField(Element element) {
        List<FieldElement> fields = new ArrayList<>();
        List<? extends Element> elements = element.getEnclosedElements();
        for (Element e : elements) {
            if (e.getKind() == ElementKind.FIELD) {
                Set<Modifier> modifiers = e.getModifiers();
                if (modifiers.contains(Modifier.PROTECTED)) {
                }
            }
        }
        return fields;
    }
}
