package com.freeit.lesson9.Task34;

/*
Задание 34
Имеется файл с текстом, в котором присутствуют числа.
Найти все числа, распечатать, посчитать сумму,
убрать все повторяющиеся числа и снова распечатать.
 */

import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Task34SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        try {
            try (BufferedReader fileInputStream = new BufferedReader(new FileReader("src\\com\\freeit\\lesson9\\Task34\\task34.txt"))) {
                String res = fileInputStream.readLine();
                while (res != null) {
                    System.out.println(res);
                    Pattern pattern = Pattern.compile("\\d+\\S?\\d*");
                    Matcher matcher = pattern.matcher(res);
                    while (matcher.find()) {
                        String s = matcher.group(0);
                        if (s.replaceAll("\\D", "").length() == s.length()) {
                            integers.add(Integer.parseInt(s));
                        }
                    }
                    res = fileInputStream.readLine();
                }
                System.out.println();
                System.out.println("Числа, которые содержаться в тексте: " + integers);
                System.out.println();
                Set<Integer> set = new LinkedHashSet<>(integers);
                System.out.println("Уникальные числа, которые содержаться в тексте: " + set);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}