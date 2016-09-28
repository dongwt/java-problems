package com.dongwt.java.problems.reflect;

import java.lang.reflect.Field;

import org.junit.Test;

public class ReflectTest {

    @Test
    public void testField() {
        Child child = new Child();
        Class clazz = child.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        Field[] fields = clazz.getFields();

        System.out.println("declaredFields");
        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }
        
        System.out.println();

        System.out.println("fields");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
    
    @Test
    public void getAllFields(){
        Child child = new Child();
        Class clazz = child.getClass();
        for(; clazz != Object.class; clazz = clazz.getSuperclass()){
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields){
                System.out.println(field.getName());
            }
        }
    }

}
