package com.freeit.lesson5.human;

import com.freeit.lesson5.human.footwear.Shoes;
import com.freeit.lesson5.human.footwear.Sneakers;
import com.freeit.lesson5.human.jacket.SummerJacket;
import com.freeit.lesson5.human.jacket.WinterJacket;
import com.freeit.lesson5.human.trousers.Jeans;
import com.freeit.lesson5.human.trousers.Pants;

public class RunHuman {
    public static void main(String[] args) {
        Human serg = new Human("Сергей", new Shoes(5), new SummerJacket(6), new Jeans(7));
        Human katya = new Human("Екатерина", new Sneakers(7), new WinterJacket(6), new Jeans(7));
        Human ivan = new Human("Иван", new Shoes(4), new WinterJacket(6), new Pants(3));

        String separator = "--------------------------------------";
        System.out.println(serg.getName());
        serg.getDressed();
        serg.unDressed();
        System.out.println(serg.getName() + " одет на " + serg.getPrice() + " рублей");
        System.out.println(separator);
        System.out.println(katya.getName());
        katya.getDressed();
        katya.unDressed();
        System.out.println(katya.getName() + " одета на " + katya.getPrice() + " рублей");
        System.out.println(separator);
        System.out.println(ivan.getName());
        ivan.getDressed();
        ivan.unDressed();
        System.out.println(ivan.getName() + " одет на " + ivan.getPrice() + " рублей");
        System.out.println(separator);
    }
}
