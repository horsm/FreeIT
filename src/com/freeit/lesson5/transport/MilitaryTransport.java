package com.freeit.lesson5.transport;

/*
В классе Военный  добавляются поля:
- Наличие системы катапультирования (true/false)
- Кол-во ракет на борту
 */

public class MilitaryTransport extends AirTransport{
    private boolean isEjectionSystem;
    private int numberMissiles;

    public MilitaryTransport(int power, int maxSpeed, int weight, String brand, double wingspan,
                             int runwayLength, boolean isEjectionSystem, int numberMissiles) {
        super(power, maxSpeed, weight, brand, wingspan, runwayLength);
        this.isEjectionSystem = isEjectionSystem;
        this.numberMissiles = numberMissiles;
    }

    public boolean isEjectionSystem() {
        return isEjectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        isEjectionSystem = ejectionSystem;
    }

    public int getNumberMissiles() {
        return numberMissiles;
    }

    public void setNumberMissiles(int numberMissiles) {
        this.numberMissiles = numberMissiles;
    }

    @Override
    public String toString() {
        return "Военный транспорт: " +
                "/n Марка: " + getBrand() +
                "/n Мощность: " + (getPower() * 0.74) + " кВт" +
                "/n Максимальная скорость: " + getMaxSpeed() + " км/ч" +
                "/n Масса: " + getWeight() + " кг." +
                "/n Размах крыльев: " + getWingspan() + " м." +
                "/n Минимальная длина взлётно-посадочной полосы для взлёта: " + getRunwayLength() + " м." +
                "/n Наличие системы катапультирования: " + isEjectionSystem() +
                "/n Количество ракет на борту: " + getNumberMissiles() ;
    }

    public String shooting (){
        if (getNumberMissiles() == 0) {
            return "Боеприпасы отсутствуют.";
        } else {
            return "Ракета пошла...";
        }
    }

    public String ejection() {
        if (isEjectionSystem()) {
            return "Катапультирование прошло успешно";
        } else {
            return "У вас нет такой системы";
        }
    }
}
