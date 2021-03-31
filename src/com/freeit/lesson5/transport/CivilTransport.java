package com.freeit.lesson5.transport;

/*
В классе Гражданский добавляются поля:
 - Кол-во пассажиров
 - Наличие бизнес класса (true/false)
 */

public class CivilTransport extends AirTransport{
    private int numberPassengers;
    private boolean isBusinessClass;

    public CivilTransport(int power, int maxSpeed, int weight, String brand, double wingspan,
                          int runwayLength, int numberPassengers, boolean isBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, runwayLength);
        this.numberPassengers = numberPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Гражданский транспорт: " +
                "/n Марка: " + getBrand() +
                "/n Мощность: " + (getPower() * 0.74) + " кВт" +
                "/n Максимальная скорость: " + getMaxSpeed() + " км/ч" +
                "/n Масса: " + getWeight() + " кг." +
                "/n Размах крыльев: " + getWingspan() + " м." +
                "/n Минимальная длина взлётно-посадочной полосы для взлёта: " + getRunwayLength() + " м." +
                "/n Количество пассажиров: " + getNumberPassengers() +
                "/n Наличие бизнес класса: " + isBusinessClass() ;
    }

    public String chechPassengers(int passengers){
        if (getNumberPassengers() > passengers) {
            return "Самолёт загружен";
        } else {
            return "Вам нужен самолёт побольше";
        }
    }
}
