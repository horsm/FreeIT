package com.freeit.lesson9.Task33;

/*
Задание 33
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */

import java.io.*;

public class Task33TotalAmount {
    public static void main(String[] args) {
        int countWord = 0;
        int countPunktuation = 0;

        try {
            try (BufferedReader fileInputStream = new BufferedReader(new FileReader("src\\com\\freeit\\lesson9\\Task33\\task33.txt"))) {
                String res = fileInputStream.readLine();
                while (res != null) {
                    System.out.println(res);
                    String[] words = res.split("[–#$%^&!?,.0-9\\s]+");
                    countWord += words.length;
                    countPunktuation += numberOfPunctuationMarks(res);
                    res = fileInputStream.readLine();
                }

                System.out.println();
                System.out.println("Количество знаков слов в тексте: " + countWord);
                System.out.println("Количество знаков препинания в тексте: " + countPunktuation);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int numberOfPunctuationMarks(String res) {
        int countPunctionMarks = 0;
        char symbol;
        for (int i = 0; i < res.length(); i++) {
            symbol = res.charAt(i);
            if (symbol == ' ' || symbol == '.' || symbol == ',' || symbol == '?' || symbol == '!'
                    || symbol == '\"' || symbol == '-' || symbol == ':' || symbol == ';' || symbol == '('
                    || symbol == ')' || symbol == '\'' || symbol == '\n') {
                countPunctionMarks++;
            }
        }
        return countPunctionMarks;
    }
}