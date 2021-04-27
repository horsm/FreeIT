package com.freeit.lesson5.transport;

/*
В классе Воздушный добавляются поля:
 - Размах крыльев (м)
 - Минимальная длина взлётно-посадочной полосы для взлёта
 */

public class AirTransport extends Transport{
    private double wingspan;
    private int runwayLength;

    public AirTransport(int power, int maxSpeed, int weight, String brand, double wingspan, int runwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }
}
