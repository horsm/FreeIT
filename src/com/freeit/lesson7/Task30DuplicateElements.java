package com.freeit.lesson7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
Задание 30
Создать коллекцию, наполнить ее случайными числами.
Удалить повторяющиеся числа.
 */
public class Task30DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> listOfRepetitions = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listOfRepetitions.add(new Random().nextInt(11));
        }
        System.out.println("Список со случайными числами:");
        System.out.println(listOfRepetitions.toString());

        Set<Integer> listOfUnique = new HashSet<>(listOfRepetitions);
        listOfRepetitions.clear();
        listOfRepetitions.addAll(listOfUnique);
        System.out.println("Список с уникальными числами:");
        System.out.println(listOfRepetitions.toString());
    }
}
