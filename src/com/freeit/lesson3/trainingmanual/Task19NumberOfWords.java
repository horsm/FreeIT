package com.freeit.lesson3.trainingmanual;

/*
Имеется строка с текстом.
Подсчитать количество слов в тексте.
Желательно учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.
 */

import java.util.Arrays;

public class Task19NumberOfWords {
    public static void main(String[] args) {
        String stroka = "Главная героиня фильма – ответственная начальница, которой грозит высылка в Канаду 999.";
        String [] words = stroka.split("[–#$%^&!?,.0-9\\s]+");

        System.out.println(Arrays.toString(words));
        System.out.println("Количество слов в тексте: " + words.length);
    }
}
