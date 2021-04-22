package com.freeit.lesson9.additionally.Task3Сensor;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

/*
3) Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list).
Структура файла определите сами, хотите каждое слово на новой строке,
хотите через запятую разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру.
Если в тексте не встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.

 */

public class Censor {
    public static void main(String[] args) {
        String inputFileName = "src\\com\\freeit\\lesson9\\additionally\\Task3Сensor\\task3in.txt";
        String blackList = "src\\com\\freeit\\lesson9\\additionally\\Task3Сensor\\blacklist.txt";

        try (BufferedReader bufferedReaderIn = new BufferedReader(new FileReader(inputFileName));
             BufferedReader bufferedReaderBlackList = new BufferedReader(new FileReader(blackList))) {

            String text;
            String blacklist;
            ArrayList<String> blist = new ArrayList<>();
            int counter = 0;

            while ((blacklist = bufferedReaderBlackList.readLine()) != null) {
                blist.add(blacklist.toLowerCase(Locale.ROOT));
            }

            while ((text = bufferedReaderIn.readLine()) != null) {
                for (String s : blist) {
                    if (text.toLowerCase().contains(s)) {
                        System.out.println("CENSOR! Предложение, не прошедшее проверку: " + text);
                        counter++;
                    }
                }
            }

            if (counter == 0) {
                System.out.println("Текст прошёл проверку!");
            } else {
                System.out.println("\n" + "Количество предложний, не прошедших проверку: " + counter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
