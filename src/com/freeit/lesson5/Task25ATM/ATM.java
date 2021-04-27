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
        System.out.println("Банкомат пополнен следующими купюрами:" +
                "\nноминал в 20 = " + currency20 +
                "\nноминал в 50 = " + currency50 +
                "\nноминал в 100 = " + currency100 + "." +
                "\nНа общую сумму: " + (currency20 * 20 + currency50 * 50 + currency100 * 100));
    }

    public int findATMBalance() {
        return this.currency20 * 20 + this.currency50 * 50 + this.currency100 * 100;
    }

    public boolean requestCash(int cash) {

        if (cash % 10 == 0) {
            if (cash <= findATMBalance()) {

                for (int hundr = currency100; hundr >= 0; hundr--) {

                    for (int fifty = currency50; fifty >= 0; fifty--) {

                        int temp = cash - hundr * 100 - fifty * 50;

                        if (temp % 20 == 0 && temp / 20 <= currency20 && temp >= 0) {
                            currency100 -= hundr;
                            currency50 -= fifty;
                            currency20 -= temp / 20;
                            System.out.println("Произведена выдача суммы: " + cash + " следующими купюрами: ");
                            System.out.println("номиналом в 20: " + temp / 20);
                            System.out.println("номиналом в 50: " + fifty);
                            System.out.println("номиналом в 100: " + hundr);
                            System.out.println(balance());
                            return true;
                        }
                    }
                }
                System.out.println("Банкомат не может вывести сумму " + cash);
            } else {
                System.out.println("В банкомате недостаточно средств");
            }

        } else {
            System.out.println("Банкомат мелочь не выдаёт. Имеются купюры номиналом: 20, 50, 100");
        }
        return false;
    }

    public String balance() {
        return "Банкомат имеет следуюшие купюры:" +
                "\nноминал в 20 = " + currency20 +
                "\nноминал в 50 = " + currency50 +
                "\nноминал в 100 = " + currency100 + "." +
                "\nИтоговый баланс: " + findATMBalance();
    }

    public static void main(String[] args) {
        ATM atm = new ATM(0, 1, 2);
        System.out.println(atm.balance());
        System.out.println("--------------------------------");
        atm.addCurrency(1, 1, 1);
        System.out.println("--------------------------------");
        System.out.println(atm.balance());
        System.out.println("--------------------------------");
        System.out.println("Выдача запрошенной суммы: " + atm.requestCash(120));
    }
}