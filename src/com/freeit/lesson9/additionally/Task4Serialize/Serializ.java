package com.freeit.lesson9.additionally.Task4Serialize;

import java.io.*;

/*
4) Сеарилизовать объект Автомобиль(Марка, скорость, цена).
После сериализации произвести обратный процесс
 */
public class Serializ {
    public static void main(String[] args) {
        String outputFileName = "src\\com\\freeit\\lesson9\\additionally\\Task4Serialize\\task4out.txt";

        Car auto = new Car("Mazda 6", 250, 18_000);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFileName));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(outputFileName))) {

            // запись объекта
            oos.writeObject(auto);

            // чтение объекта
            Car car = (Car) ois.readObject();
            System.out.println(car.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
