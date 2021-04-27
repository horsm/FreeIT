package com.freeit.lesson5.robot;

import com.freeit.lesson5.robot.hands.SamsungHand;
import com.freeit.lesson5.robot.hands.SonyHand;
import com.freeit.lesson5.robot.heads.SamsungHead;
import com.freeit.lesson5.robot.heads.SonyHead;
import com.freeit.lesson5.robot.heads.ToshibaHead;
import com.freeit.lesson5.robot.legs.SamsungLeg;
import com.freeit.lesson5.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robot1 = new Robot(new SamsungHead(10), new SamsungHand(5), new ToshibaLeg(4));
        Robot robot2 = new Robot(new SonyHead(4), new SamsungHand(6), new SamsungLeg(3));
        Robot robot3 = new Robot(new ToshibaHead(8), new SonyHand(6), new SamsungLeg(4));

        String separator = "--------------------------------------";
        robot1.action();
        System.out.println(separator);
        robot2.action();
        System.out.println(separator);
        robot3.action();
        System.out.println(separator);

        int maxPrice = Math.max(robot1.getPrice(), Math.max(robot2.getPrice(), robot3.getPrice()));
        if (maxPrice == robot1.getPrice()) {
            System.out.println("Робот №1 самый дорогой. Его цена: " + maxPrice);
        }
        if (maxPrice == robot2.getPrice()) {
            System.out.println("Робот №2 самый дорогой. Его цена: " + maxPrice);
        }
        if (maxPrice == robot3.getPrice()) {
            System.out.println("Робот №3 самый дорогой. Его цена: " + maxPrice);
        }

    }
}
