package com.freeit.lesson2.basic;

/*
Задание 9
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
 */

public class Task9 {
    public static void main(String[] args) {
        int x = (int)(Math.random() * 10);
        int n = x;
        int factorial = 1;

        while(x != 0) {
            if (x == 0) {
                factorial = 1;
            } else {
                factorial = factorial * x;
                x--;
            }
        }
        System.out.println("Факториал числа " + n + " = " + factorial);
    }
}
