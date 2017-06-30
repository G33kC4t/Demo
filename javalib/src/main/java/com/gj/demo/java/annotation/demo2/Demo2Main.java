package com.gj.demo.java.annotation.demo2;

import java.lang.reflect.Field;

/**
 * Created by guanjian on 17-6-29.
 */

public class Demo2Main {

    public static void main(String[] args) {
        Class<FieldOne> cls = FieldOne.class;
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Name=" + field.getName()
                    + "\n\tClass=" + field.getClass().getCanonicalName()
                    + "\n\tTypeName=" + field.getType().getCanonicalName()
                    + "\n\tGenericType=" + field.getGenericType()
                    + "\n\tDeclaringClass=" + field.getDeclaringClass().getCanonicalName());
        }
    }
}
