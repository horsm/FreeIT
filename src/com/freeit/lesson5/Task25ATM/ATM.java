package com.freeit.lesson5.Task25ATM;

/*
Создать класс и объекты описывающие Банкомат.
Набор купюр находящихся в банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20 50 100.
Сделать методы для добавления денег в банкомат.
Сделать функцию снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет).
При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
Создать конструктор с тремя параметрами – количеством купюр.
 */

public class ATM {
    private int currency20;
    private int currency50;
    private int currency100;

    public ATM(int currency20, int currency50, int currency100) {
        this.currency20 = currency20;
        this.currency50 = currency50;
        this.currency100 = currency100;
    }

    public void addCurrency(int currency20, int currency50, int currency100) {
        this.currency20 += currency20;
        this.currency50 += currency50;
        this.currency100 += currency100;
    }

    public int findATMBalance() {
        return this.currency20 * 20 + this.currency50 * 50 + this.currency100 * 100;
    }

    public void requestCash(int cash) {
        boolean answer;
        int curr100 = cash / 100;
        int curr50 = (cash - curr100 * 100) / 50;
        int curr20 = cash - curr100 * 100 - curr50 * 50;
        int newCurr100 = 0;
        int newCurr50 = 0;
        int newCurr20 = 0;


        if (this.currency20 * 20 + this.currency50 * 50 + this.currency100 * 100 <= cash) {
            System.out.println("Снятие валюты невозможно - недостаточно валюты в банкомате!");
        } else if (this.currency20 * 20 + this.currency50 * 50 + this.currency100 * 100 - cash < 20) {
            System.out.println("Извините, банкомат мелочь не выдаёт! ");
        } else {
            while (cash > 0) {
                while (curr100 > 0) {
                    cash -= curr100 * 100;
                    curr100--;
                }
                while (curr50 > 0) {
                    cash -= curr50 * 50;
                    curr50--;
                }
            }
        }

        }


    @Override
    public String toString() {
        return "ATM{" +
                "currency20 = " + currency20 +
                ", currency50 = " + currency50 +
                ", currency100 = " + currency100 +
                '}';
    }

    public static void main(String[] args) {
        ATM atm = new ATM(0, 1, 2);
        System.out.println(atm.toString());
        atm.requestCash(163);
    }

}
