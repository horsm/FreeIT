package com.freeit.lesson5.Task27BankCards;

public class MasterCard extends DebitCard {
    int money;

    protected MasterCard(String nameHolder, String number, int cvv) {
        super(nameHolder, number, cvv);
    }

    @Override
    String addMoney(int money) {
        this.money += money;
        return "Добавлено: " + money + " рублей";
    }

    @Override
    String removeMoney(int money) {
        this.money -= money;
        return "Снято: " + money + " рублей";
    }

    public String getMoney() {
        return "На счету: " + this.money + " рублей";
    }

    @Override
    void isBloked(Boolean switcher) {
        if (switcher) {
            System.out.println("Карточка заблокирована");
        } else {
            System.out.println("Карточка активная");
        }
    }
}
