package com.freeit.lesson5.computer;

import java.util.Random;
import java.util.Scanner;

/*
Создать класс компьютер.
Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)

Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1),
 вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает.
 Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает

 */

public class Computer {
    String processor;
    int ddr;
    String hardDrive;
    int resource;
    boolean burnedDown = false;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int counterOnOff = 0;

    public Computer(String processor, int ddr, String hardDrive, int resource) {
        this.processor = processor;
        this.ddr = ddr;
        this.hardDrive = hardDrive;
        this.resource = resource;
    }

    public static void main(String[] args) {
        Computer computer = new Computer("Intel", 8, "Samsung", 2);

        while (true) {
            if (computer.counterOnOff == computer.resource || computer.burnedDown) {
                System.out.println("Повторная попытка включения не удалась. Компьютер уже сгорел. Жалко...");
                break;
            } else {
                computer.switchingOn();
                computer.switchingOff();
                computer.counterOnOff++;
            }
        }
    }

    public void description() {
        System.out.println("Характеристики компьютера:");
        System.out.println("Процессор: " + processor);
        System.out.println("Оперативная память: " + ddr + " Гб");
        System.out.println("Жесткий диск: " + hardDrive);
        System.out.println("Ресурс: " + resource + " включений/выключений");
    }


    public void switchingOn() {
        if (!burnedDown) {
            System.out.print("Для включения компьютера введите число 0 или 1: ");
            int userNumberOn = scanner.nextInt();
            int computerNumberOn = random.nextInt(2);
            if (userNumberOn == computerNumberOn) {
                System.out.println("Компьютер включается!");
                description();
            } else {
                System.out.println("Компьютер сгорел при включении!");
                burnedDown = true;
            }
        } else {
            System.out.println("Включать нечего! Компьютер уже сгорел!");
        }
    }

    public void switchingOff() {
        if (!burnedDown) {
            System.out.print("Для выключения компьютера введите число 0 или 1: ");
            int userNumberOff = scanner.nextInt();
            int computerNumberOff = random.nextInt(2);
            if (userNumberOff == computerNumberOff) {
                System.out.println("Компьютер выключается!");
            } else {
                System.out.println("Компьютер сгорел при выключении!");
                burnedDown = true;
            }
        } else {
            System.out.println("Выключать нечего! Компьютер уже сгорел!");
        }
    }
}
