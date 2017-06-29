package com.gj.demo.java.annotation.demo1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guanjian on 17-6-28.
 */

public class TableCreator {

    public static void creator(Class<?> cls) {

        DBTable table = cls.getAnnotation(DBTable.class);
        if (table == null) {
            System.out.println("No Table!");
            return;
        }

        String tableName = table.value();
        if (tableName.length() == 0) {
            tableName = cls.getSimpleName().toUpperCase();
        }

        List<String> column = new ArrayList<>();
        for (Field field : cls.getDeclaredFields()) {

            Annotation[] anns = field.getDeclaredAnnotations();
            if (anns.length == 0) {
                continue;
            }

            String columnName;
            PropertyType propertyType;
            for (Annotation ann : anns) {
                if (ann instanceof TableColumn) {
                    TableColumn tableColumn = (TableColumn) ann;

                    columnName = tableColumn.name();
                    if (columnName.length() == 0) {
                        columnName = field.getName().toUpperCase();
                    }

                    propertyType = tableColumn.property();
                    if (propertyType == PropertyType.Auto) {
                        propertyType = searchPropertyType(field);
                    }
                    if (propertyType == null) {
                        continue;
                    }

                    String constraints = getConstraints(tableColumn.constraints());
                    column.add(columnName + " " + propertyType + constraints);
                }
            }
        }
        String text = "CREATE TABLE " + tableName + "(";
        for (String s : column) {
            text += "\n     " + s + ",";
        }
        text = text.substring(0, text.length() - 1) + ");";
        System.out.println(text);
    }

    private static String getConstraints(Constraints constraints) {
        String text = "";
        if (!constraints.allowNull()) {
            text += " NOT NULL";
        }
        if (constraints.primaryKey()) {
            text += " PRIMARY KEY";
        }
        if (constraints.unique()) {
            text += " UNIQUE";
        }
        return text;
    }

    private static PropertyType searchPropertyType(Field field) {
        Type type = field.getGenericType();
        if (String.class == type) {
            return PropertyType.TEXT;
        }
        if (int.class == type || Integer.class == type) {
            return PropertyType.INT;
        }
        return null;
    }

    public static void main(String[] args) {
        TableCreator.creator(Member.class);
    }
}
