package com.bridgelabz.mapObject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectMapper {
    public static void main(String[] args) throws Exception {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Kim");
        properties.put("age", 23);
        Employee employee = toObject(Employee.class, properties);
        employee.print();
    }

     static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T result = clazz.getDeclaredConstructor().newInstance();
        for (Field field: clazz.getDeclaredFields()){
            field.setAccessible(true);
            field.set(result, properties.get(field.getName()));
        }
        return result;
    }
}
