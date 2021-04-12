package com.freeit.lesson7;

/*
Задание 29
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
 */

import java.util.ArrayList;
import java.util.Random;

public class Task29ListRatings {
    public static void main(String[] args) {
        ArrayList <Integer> listOfRatings = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listOfRatings.add(new Random().nextInt(11));
        }
        System.out.println("Исходный список оценок учеников:");
        System.out.println(listOfRatings.toString());

        for (int i = 0; i < listOfRatings.size(); i++) {
            if (listOfRatings.get(i) < 3) {
                listOfRatings.remove(i);
            }
        }
        System.out.println("Исправленный список оценок учеников:");
        System.out.println(listOfRatings.toString());

    }
}
