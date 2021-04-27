package com.freeit.lesson5.Task27BankCards;

public abstract class DebitCard extends Card{

    protected DebitCard(String nameHolder, String number, int cvv) {
        super(nameHolder, number, cvv);
    }
    abstract String getNumberCard();

    abstract String addMoney(int money);
    abstract String removeMoney(int money);
    abstract void isBloked(Boolean switcher);

}
