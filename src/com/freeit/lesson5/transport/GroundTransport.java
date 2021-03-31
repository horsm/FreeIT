package com.freeit.lesson5.transport;

/*
В классе Наземный добавляются поля:
 -Количество колёс
 - Расход топлива(л/100км)
 */

public class GroundTransport extends Transport{
    private int numberWheels;
    private double fuelRate;


    public GroundTransport(int power, int maxSpeed, int weight, String brand, int numberWheels, double fuelRate) {
        super(power, maxSpeed, weight, brand);
        this.numberWheels = numberWheels;
        this.fuelRate = fuelRate;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(double fuelRate) {
        this.fuelRate = fuelRate;
    }
}
