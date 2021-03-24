package com.freeit.lesson5.Task25ATM;

public class Test {
    private int banknote20;
    private int banknote50;
    private int banknote100;

    public Test(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addBanknote20(int banknote20) {
        this.banknote20 += banknote20;
    }

    public void addBanknote50(int banknote50) {
        this.banknote50 += banknote50;
    }

    public void addBanknote100(int banknote100) {
        this.banknote100 += banknote100;
    }

    public boolean withdraw(int cash) {
        if (cash % 10 != 0 || cash <= 0) {
            System.out.println("Данная операция не может быть выполнена");
            System.out.println("В банкомате только купюры номиналом 100 50 20.");
            return false;
        }
        int res = cash;
        int countBanknote20 = 0;
        if (cash % 100 == 10) {
            if(banknote20>=3){
                res -= 60;
                banknote20 -= 3;
                countBanknote20 += 3;
            }else{
                System.out.println("Данная операция не может быть выполнена");
                System.out.println("В банкомате недостаточно купюр.");
                return false;
            }
        } else if (cash % 100 == 30) {
            if(banknote20>=4){
                res -= 80;
                banknote20 -= 4;
                countBanknote20 += 4;
            }else{
                System.out.println("Данная операция не может быть выполнена");
                System.out.println("В банкомате недостаточно купюр.");
                return false;
            }
        } else if (cash % 100 == 60) {
            if(banknote20>=1){
                res -= 20;
                banknote20 -= 1;
                countBanknote20 += 1;
            }else{
                System.out.println("Данная операция не может быть выполнена");
                System.out.println("В банкомате недостаточно купюр.");
                return false;
            }
        } else if (cash % 100 == 80) {
            if(banknote20>=2){
                res -= 40;
                banknote20 -= 2;
                countBanknote20 += 2;
            }else{
                System.out.println("Данная операция не может быть выполнена");
                System.out.println("В банкомате недостаточно купюр.");
                return false;
            }
        }


        int qty100 = (res - res % 100) / 100;
        if (qty100 > banknote100) {
            res -= banknote100 * 100;
            qty100 = banknote100;
        } else {
            res -= qty100 * 100;
        }

        int qty50 = (res - res % 50) / 50;
        if (qty50 > banknote50) {
            res -= banknote50 * 50;
            qty50 = banknote50;
        } else {
            res -= qty50 * 50;
        }

        int qty20 = (res - res % 20) / 20;
        if (qty20 > banknote20) {
            res -= banknote20 * 20;
            qty20 = banknote20;
        } else {
            res -= qty20 * 20;
        }
        countBanknote20 += qty20;
        if (res != 0) {
            System.out.println("Данная операция не может быть выполнена");
            System.out.println("В банкомате недостаточно купюр.");
            return false;
        }
        System.out.println("К выдаче: " + cash);
        System.out.println("Купюры по 100: " + qty100 + "шт.");
        System.out.println("Купюры по 50: " + qty50 + "шт.");
        System.out.println("Купюры по 20: " + countBanknote20 + "шт.");

        banknote100 -= qty100;
        banknote50 -= qty50;
        banknote20 -= qty20;

        return true;
    }

    @Override
    public String toString() {
        return "Task25{" +
                "banknote20=" + banknote20 +
                ", banknote50=" + banknote50 +
                ", banknote100=" + banknote100 +
                '}';
    }

    public static void main(String[] args) {
        Test atm = new Test(0, 2, 1);
        System.out.println(atm.toString());
        atm.addBanknote20(1);
        atm.addBanknote50(1);
        atm.addBanknote100(1);
        System.out.println(atm.toString());
        System.out.println(atm.withdraw(160));
        System.out.println(atm.toString());
    }
}
