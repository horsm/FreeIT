package com.freeit.lesson9.Task35;

/*
Задание 35
Записать в двоичный файл 20 случайных чисел.
Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */

import java.io.*;
import java.util.*;

public class Task35WritingNumbers {
    private static final String FILE = "src/com/freeit/lesson9/Task35/task35.dat";
    private static final Random random = new Random();
    private static final ArrayList<Integer> dataArrayList = new ArrayList<>();

    public static void main(String[] args) {

        // Запись в файл
        writiToFile ();

        // Чтение из файла
        readFromFile();

        System.out.println("Числа, записанные в файл: " + dataArrayList.toString());
        System.out.println("Количество чисел, записанных в файл: " + dataArrayList.size());
        System.out.println("Среднее арифметическое чисел = " + (average()));
    }


    // Запись в файл
    private static void writiToFile() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(Task35WritingNumbers.FILE)))) {
            for (int i = 0; i < 20; i++) {
                dataOutputStream.writeInt(random.nextInt(100));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода!");
        }
    }

    // Чтение из файла
    private static void readFromFile() {
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(Task35WritingNumbers.FILE)))) {
            while (dataInputStream.available() > 0) {
                dataArrayList.add(dataInputStream.readInt());
            }
        } catch (FileNotFoundException e) {
            System.out.print("Файл не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода!");
        }
    }

    //Среднее арифметическое чисел
    private static int average() {
        int sum = 0;
        for (Integer integer : dataArrayList) {
            sum = sum + integer;
        }
        return (sum / dataArrayList.size());
    }
}
