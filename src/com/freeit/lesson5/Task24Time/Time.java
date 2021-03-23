package com.freeit.lesson5.Task24Time;

/*
Создать класс и объекты описывающие промежуток времени.
Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках).
Создать два конструктора: получающий общее количество секунд,
и часы, минуты и секунды по отдельности.
Сделать метод для вывода данных.
 */

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * 60 + hours * 60 * 60;
    }

    public int compareTime(Time time) {
        if ((totalSeconds() - time.totalSeconds()) > 1) {
            return 1;
        } else if ((totalSeconds() - time.totalSeconds()) < 1) {
            return -1;
        } else
            return 0;
    }

    @Override
    public String toString() {
        int newHours = totalSeconds() / 3600;
        int newMinutes = (totalSeconds() - newHours * 3600) / 60;
        int newSeconds = totalSeconds() - newHours * 3600 - newMinutes * 60;

        return newHours + ":" + newMinutes + ":" + newSeconds;
    }

    public static void main(String[] args) {
        Time timeOne = new Time(10_000);
        Time timeTwo = new Time(16,15,46);
        System.out.println("Первое время в секундах: " + timeOne.totalSeconds());
        System.out.println("Второе время в секундах: " + timeTwo.totalSeconds());
        System.out.println("Сравнение двух объектов: " + timeOne.compareTime(timeTwo));
        System.out.println("Время timeOne : " + timeOne.toString());
        System.out.println("Время timeTwo : " + timeTwo.toString());
    }
}
