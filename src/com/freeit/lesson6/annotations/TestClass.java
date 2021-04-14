package com.freeit.lesson6.annotations;

/*
Написать программу, которая будет анализировать присутствие аннотации над классом MyService
и если она присутствует - создавать экземпляр этого класса,
задавать значения его полям и вызывать метод thisClassInfo (использовать возможности пакета reflection).
 */

import java.lang.reflect.*;

public class TestClass {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
        checkAnnotation(MyService.class);
    }

    public static <T> void checkAnnotation(Class <T> checkClass) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (checkClass.isAnnotationPresent(Version.class)) {
            MyService myService = new MyService();

            Field nameProduct = myService.getClass().getDeclaredField("nameProduct");
            nameProduct.setAccessible(true);
            nameProduct.set(myService, "iPhone");

            Field priceProduct = myService.getClass().getDeclaredField("priceProduct");
            priceProduct.setAccessible(true);
            priceProduct.set(myService, 1000);

            Field discountProduct = myService.getClass().getDeclaredField("discountProduct");
            discountProduct.setAccessible(true);
            discountProduct.set(myService, 5);

            System.out.println(myService.thisClassInfo());
        } else {
            System.out.println("Аннотации не обнаружено");
        }
    }
}










