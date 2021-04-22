package com.freeit.lesson9.additionally.Task2TextFormater;

import java.io.*;
import java.util.StringTokenizer;

/*
2)Текстовый файл содержит текст.
После запуска программы в другой файл должны записаться только те предложения в которых от 3-х до 5-ти слов.
Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении,
оно попадает в новый файл.

Пишем все в ООП стиле. Создаём класс TextFormater в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром.
Если есть возвращает true, если нет false

В main считываем файл.
Разбиваем текст на предложения.
Используя методы класса TextFormater определяем подходит ли нам предложение.
Если подходит добавляем его в новый файл

 */
public class TextFormater {
    public static void main(String[] args) {

        String inputFileName = "src\\com\\freeit\\lesson9\\additionally\\Task2TextFormater\\task2in.txt";
        String outputFileName = "src\\com\\freeit\\lesson9\\additionally\\Task2TextFormater\\task2out.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));

            String temp;
            StringBuilder sb = new StringBuilder();
            while ((temp = bufferedReader.readLine()) != null) {
                sb.append(temp.trim());
            }
            bufferedReader.close();

            String text = new String(sb);
            StringTokenizer st = new StringTokenizer(text, ".!?");
            while (st.hasMoreTokens()) {
                String tempStr = st.nextToken();
                if (isContainsPalindrome(tempStr) || (countNumberWords(tempStr) > 2 && countNumberWords(tempStr) < 6)) {
                    bufferedWriter.write(tempStr + ".");
                }
            }
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            System.err.println("Ошибка. Файл не найден!");
        } catch (IOException e) {
            System.err.println("Ошибка. Неверный ввод-вывод!");
        }
    }

    static int countNumberWords(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, ".,!?:;()\"- \n");
        return stringTokenizer.countTokens();
    }

    static boolean isContainsPalindrome(String string) {
        boolean result = false;
        String[] words = string.split("[–#$%^&!?,.0-9\\s]+");
        for (String word : words) {
            if ((word.length() > 2) && (word.equals((new StringBuilder(word)).reverse().toString()))) {
                result = true;
            }
        }
        return result;
    }
}
