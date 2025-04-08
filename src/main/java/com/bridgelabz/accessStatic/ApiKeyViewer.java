package com.bridgelabz.accessStatic;

import java.lang.reflect.Field;

public class ApiKeyViewer {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Configuration> cls = Configuration.class;

        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);
        System.out.println("Old value: " + field.get(null));

        field.set(null, "newKey456");
        System.out.println("New value: " + field.get(null));
    }
}
