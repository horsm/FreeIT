package com.freeit.lesson5.transport;

/*
В классе Грузовой добавляется  поле:
- Грузоподъёмность(т)
 */

public class CargoTransport extends GroundTransport{
    private int loadCapacity;

    public CargoTransport(int power, int maxSpeed, int weight, String brand, int numberWheels,
                          double fuelRate, int loadCapacity) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelRate);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовой транспорт: " +
                "/n Марка: " + getBrand() +
                "/n Мощность: " + (getPower() * 0.74) + " кВт" +
                "/n Максимальная скорость: " + getMaxSpeed() + " км/ч" +
                "/n Масса: " + getWeight() + " кг." +
                "/n Количество колёс: " + getNumberWheels() +
                "/n Расход топлива: " + getFuelRate() + " л/100 км." +
                "/n Грузоподъёмность: " + getLoadCapacity() + "т.";
    }

    public String checkCargo(int cargo){
        if (getLoadCapacity() > cargo) {
            return "Грузовик загружен";
        } else {
            return "Вам нужен грузовик побольше";
        }
    }
}