package com.freeit.lesson3.trainingmanual;

/*
Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer.
Сравните скорость их выполнения.
 */

public class Task21TestString {
    public static void main(String[] args) {
        String stroka = "Ещё один метод для получения текущего времени это System.nanoTime().";
        StringBuilder stringBuilder = new StringBuilder("Ещё один метод для получения текущего времени это System.nanoTime().");
        StringBuffer stringBuffer = new StringBuffer("Ещё один метод для получения текущего времени это System.nanoTime().");

        // Тест скорости String
        long startString = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            stroka += stroka;
        }
        long finishString = System.currentTimeMillis();

        System.out.println("String - прошло времени, мс: " + (finishString - startString));

        // Тест скорости StringBuilder
        long startBuilder = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            stringBuilder.append(startBuilder);
        }
        long finishBuilder = System.currentTimeMillis();

        System.out.println("StringBuilder - прошло времени, мс: " + (finishBuilder - startBuilder));

        // Тест скорости StringBuffer
        long startBuffer = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            stringBuffer.append(startBuilder);
        }
        long finishBuffer = System.currentTimeMillis();

        System.out.println("StringBuilder - прошло времени, мс: " + (finishBuffer - startBuffer));
    }
}
