package com.freeit.lesson5.сosmodrome;

public class Cosmodrom {
    public void launch(IStart iStart) throws InterruptedException {
        if (!iStart.checkSystem()) {
            System.out.println("Предстартовая проверка провалена!");
        } else {
            iStart.startingEngines();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            iStart.start();
        }
    }
}
