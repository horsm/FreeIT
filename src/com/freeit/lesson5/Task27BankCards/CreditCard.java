package com.freeit.lesson5.Task27BankCards;

abstract class CreditCard extends Card{
    protected CreditCard(String nameHolder, String number, int cvv) {
        super(nameHolder, number, cvv);
    }
    abstract String addMoney(int money);
    abstract String removeMoney(int money);
    abstract void isBloked(Boolean switcher);
}
