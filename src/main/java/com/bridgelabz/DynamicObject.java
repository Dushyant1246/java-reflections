package com.bridgelabz;

import java.lang.reflect.Constructor;

public class DynamicObject {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Student.class;
        Constructor<?> constructor = cls.getDeclaredConstructor(String.class);
        Student student = (Student) constructor.newInstance("Drake");
        student.display();
    }
}
class Student{
    String name;
    Student(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Student Name: " + name);
    }
}
