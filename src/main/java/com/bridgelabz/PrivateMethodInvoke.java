package com.bridgelabz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethodInvoke {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calculator calc = new Calculator();
        Class<?> cls = calc.getClass();
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(calc, 5, 3);
        System.out.println("Multiplication Result: " + result);
    }

}
class Calculator{
    private int multiply(int a, int b){
        return a*b;
    }
}