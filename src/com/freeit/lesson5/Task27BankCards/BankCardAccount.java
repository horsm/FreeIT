package com.freeit.lesson5.Task27BankCards;

/*
Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 */

public class BankCardAccount {
    public static void main(String[] args) {
        VisaCard visaCard = new VisaCard("Иванов Иван", "4320 0123 4567 7894", 745);
        visaCard.addMoney(500);
        visaCard.isBloked(true);
        System.out.println(visaCard.getMoney());

        MasterCard masterCard = new MasterCard("Петров Петр", "0123 4568 8794 5554", 123);
        masterCard.addMoney(1000);
        masterCard.isBloked(false);
        System.out.println(masterCard.getMoney());
        masterCard.removeMoney(300);
        System.out.println(masterCard.getMoney());
    }
}
