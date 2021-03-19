package com.freeit.lesson2.basic;

/*
Задание 3
Имеется 45000 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
по аналогии с примером выше.
 */

public class Task3 {
    public static void main(String[] args) {
        int seconds = 4500000;
        int minut = seconds / 60;
        int hours = minut / 60;
        int days = hours / 24;
        int weeks = days / 7;
        System.out.println("A: " + minut + " минут + " + (seconds - minut * 60) + " секунд");
        System.out.println("B: " + hours + " часов + " + (minut - hours * 60) + " минут + " + (seconds - minut * 60) + " секунд");
        System.out.println("С: " + days + " дней + " + (hours - days * 24) + " часов + " + (minut - hours * 60) + " минут + " + (seconds - minut * 60) + " секунд");
        System.out.println("D: " + weeks + " недель + " + (days - weeks * 7) + " дней + " + (hours - days * 24) + " часов + " + (minut - hours * 60) + " минут + " + (seconds - minut * 60) + " секунд");
    }
}
