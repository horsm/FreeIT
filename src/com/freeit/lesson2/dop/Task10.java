package com.freeit.lesson2.dop;

/*
10)Вычислить: 1+2+4+8+...+256
 */

public class Task10 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 256) {
            sum = sum + count;
            count *= 2;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
