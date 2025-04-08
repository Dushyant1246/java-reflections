package com.bridgelabz.runtimeAnnotation;

public class AnnotationViewer {
    public static void main(String[] args) {
        Class<Book> cls = Book.class;
        Author annotation = cls.getAnnotation(Author.class);
        System.out.println("Author: " + annotation.name());
    }
}
