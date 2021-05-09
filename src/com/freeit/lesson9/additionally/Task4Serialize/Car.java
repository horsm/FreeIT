package com.freeit.lesson9.additionally.Task4Serialize;

import java.io.Serializable;
/*
объект Автомобиль(Марка, скорость, цена)
 */
public class Car implements Serializable  {
    String brand;
    int speed;
    double price;

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "марка = '" + brand + '\'' +
                ", скорость = " + speed + " км/ч" +
                ", цена = " + price + " $";
    }
}
