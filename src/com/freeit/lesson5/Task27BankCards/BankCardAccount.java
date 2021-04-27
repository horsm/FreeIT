package com.freeit.lesson5.Task27BankCards;

/*
Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 */

public class BankCardAccount {
    public static void main(String[] args) {
        VisaCard visaCard = new VisaCard("Иванов Иван", "4320 0123 4567 7894", 745);
        System.out.println("Карточка: VisaCard" );
        visaCard.addMoney(500);
        System.out.println(visaCard.getMoney());
        System.out.println("Общая сумма возможного кредита составит: " + visaCard.getMoneyWithProcent(100, 25) + " рублей");
        visaCard.isBloked(true);
        System.out.println("-----------------------");

        MasterCard masterCard = new MasterCard("Петров Петр", "0123 4568 8794 5554", 123);
        System.out.println("Карточка: MasterCard" );
        System.out.println("Номер карточки: " + masterCard.getNumberCard());
        masterCard.addMoney(1000);
        masterCard.isBloked(false);
        System.out.println(masterCard.getMoney());
        masterCard.removeMoney(300);
        System.out.println(masterCard.getMoney());
    }
}
