package com.freeit.lesson5.Task27BankCards;

public abstract class Card {
    String nameHolder;
    String number;
    int cvv;

    protected Card(String nameHolder, String number, int cvv) {
        this.nameHolder = nameHolder;
        this.number = number;
        this.cvv = cvv;
    }
}
