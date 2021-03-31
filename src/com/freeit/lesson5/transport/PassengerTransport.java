package com.freeit.lesson5.transport;

/*
В классе Легковой добавляются поля:
- Тип кузова
- Кол-во пассажиров
 */

public class PassengerTransport extends GroundTransport {
    private String carBody;
    private int numberPassengers;


    public PassengerTransport(int power, int maxSpeed, int weight, String brand, int numberWheels,
                              double fuelRate, String carBody, int numberPassengers) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelRate);
        this.carBody = carBody;
        this.numberPassengers = numberPassengers;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }


    @Override
    public String toString() {
        return "Легковой транспорт: " +
                "/n Марка: " + getBrand() +
                "/n Тип кузова: " + getCarBody() +
                "/n Мощность: " + (getPower() * 0.74) + " кВт" +
                "/n Максимальная скорость: " + getMaxSpeed() + " км/ч" +
                "/n Масса: " + getWeight() + " кг." +
                "/n Количество колёс: " + getNumberWheels() +
                "/n Расход топлива: " + getFuelRate() + " л/100 км." +
                "/n Количество пассажиров: " + getNumberPassengers();
    }

    private double getFuelConsumption(double distance) {
        return (getFuelRate() * distance) / 100;
    }

    public String infoByCar(double time) {
        return "За время " + time + " ч., автомобиль " + getBrand() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч " +
                "проедет " + (time * getMaxSpeed()) + " км  и израсходует " + getFuelConsumption(time * getMaxSpeed()) + " литров топлива.\n";
    }
}
