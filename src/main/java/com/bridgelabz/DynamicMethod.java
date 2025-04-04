package com.bridgelabz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = MathOperations.class;
        MathOperations mathOperations = new MathOperations();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter operation: ");
        String methodName = scan.next();

        Method method = cls.getDeclaredMethod(methodName, int.class, int.class);

        System.out.print("Enter two values: ");
        System.out.println("Result: " + method.invoke(mathOperations, scan.nextInt(), scan.nextInt()));
    }
}
class MathOperations{
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
}
