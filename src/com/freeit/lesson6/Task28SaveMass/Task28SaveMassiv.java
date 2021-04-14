package com.freeit.lesson6.Task28SaveMass;

/*
Написать класс, который умеет хранить в себе массив любых типов данных (int, long, etc.).
Реализовать метод get(int index), который возвращает любой элемент массива по индексу.
 */

import java.util.Arrays;

class BoxArray<T> {
    private T[] array;

    public T getIndex(int index) {
        return array[index];
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}

public class Task28SaveMassiv {
    public static void main(String[] args) {

        int index = 0;
        Integer[] integers = {9, 5, 7, 8, 2, 11, 32};
        System.out.println("Получение значения из массива Integer по индексу: " + index);
        System.out.println("Исходный массив: " + Arrays.toString(integers));
        System.out.print("Искомый элемент: ");
        get(integers, index);
        System.out.println("-------------------");

        index = 3;
        Double[] doubles = {78.9, 99.9, 55.5, 33.3};
        System.out.println("Получение значения из массива Double по индексу: " + index);
        System.out.println("Исходный массив: " + Arrays.toString(doubles));
        System.out.print("Искомый элемент: ");
        get(doubles, index);
        System.out.println("-------------------");

        index = 1;
        Long[] longs = {123456L, 789658L, 9999L};
        System.out.println("Получение значения из массива Long по индексу: " + index);
        System.out.println("Исходный массив: " + Arrays.toString(longs));
        System.out.print("Искомый элемент: ");
        get(longs, index);
        System.out.println("-------------------");
    }

    public static <T> void get(T[] array, int index) {

        BoxArray<T> newArray = new BoxArray<T>();
        newArray.setArray(array);

        System.out.println(newArray.getIndex(index));
    }
}

