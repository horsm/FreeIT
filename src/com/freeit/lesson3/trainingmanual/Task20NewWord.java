package com.freeit.lesson3.trainingmanual;

/*
Имеется строка с текстом.
Вывести текст, составленный из последних букв всех слов.
 */

public class Task20NewWord {
    public static void main(String[] args) {
        String stroka = "Главная героиня фильма – ответственная начальница, которой грозит высылка в Канаду.";
        String [] words = stroka.split("[–#$%^&!?,.0-9\\s]+");
        System.out.println(stroka);

        StringBuilder newStroka = new StringBuilder();
        for (String word : words) {
            newStroka.append(word.toCharArray()[word.length() - 1]);
        }

        System.out.println("Полученный текст: " + newStroka);
    }
}
