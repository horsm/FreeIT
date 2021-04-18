package com.freeit.lesson9.additionally.Task1Palindrome;

import java.io.*;
import java.util.ArrayList;

/*
1)В исходном файле находятся слова, каждое слово на новой строке.
После запуска программы должен создать файл, который будет содержать в себе только палиндромы
 */

public class Task1Palindrome {
    private static final ArrayList<String> dataArrayList = new ArrayList<>();

    public static void main(String[] args) {
        String inputFileName = "src\\com\\freeit\\lesson9\\additionally\\Task1Palindrome\\task1in.txt";
        String outputFileName = "src\\com\\freeit\\lesson9\\additionally\\Task1Palindrome\\task1out.txt";


        // чтение из файла
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (isPalindrome(line)) {
                    dataArrayList.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // запись в файл
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String value : dataArrayList) {
                bufferedWriter.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // проверка, является ли слово палиндромом
    public static boolean isPalindrome(String str) {
        return str.equals((new StringBuilder(str)).reverse().toString());
    }
}
