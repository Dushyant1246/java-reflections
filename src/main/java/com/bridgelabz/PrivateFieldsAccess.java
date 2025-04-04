package com.bridgelabz;

import java.lang.reflect.Field;

public class PrivateFieldsAccess {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person();
        Class<?> cls = person.getClass();
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println("Person age before: " + field.get(person));
        field.set(person, 22);
        System.out.println("Person age after: " + field.get(person));
    }
}
class Person{
    private int age = 35;
}
/*
Person age before: 35
Person age after: 22
 */