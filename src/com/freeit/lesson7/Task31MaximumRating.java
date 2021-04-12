package com.freeit.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
Задание 31
Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
Найти самую высокую оценку с использованием итератора.
 */
public class Task31MaximumRating {
    public static void main(String[] args) {
        ArrayList<Integer> listOfRatings = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listOfRatings.add(new Random().nextInt(11));
        }
        System.out.println("Исходный список оценок учеников:");
        System.out.println(listOfRatings.toString());

        int maxScore = 0;
        Iterator iterator = listOfRatings.iterator();
        while (iterator.hasNext()) {
            int tempScore = (int) iterator.next();
            if (tempScore > maxScore) {
                maxScore = tempScore;
            }
        }
        System.out.println("Максимальная оценка: " + maxScore);
    }
}
