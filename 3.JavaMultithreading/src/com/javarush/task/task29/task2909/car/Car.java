package com.javarush.task.task29.task2909.car;

import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    static public final int MAX_TRUCK_SPEED = 80;
    static public final int MAX_SEDAN_SPEED = 120;
    static public final int MAX_CABRIOLET_SPEED = 90;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public static Car create(int type, int numberOfPassengers){
        Car consist = null;
        if (type == TRUCK){
            consist = new Truck(numberOfPassengers);
        }
        else if (type == SEDAN ){
            consist = new Sedan(numberOfPassengers);
        }
        else if (type == CABRIOLET){
            consist = new Cabriolet(numberOfPassengers);
        }
        return consist;
    }
    public void fill(double numberOfLiters) throws Exception {
        if (numberOfLiters < 0)
            throw new Exception();
        fuel += numberOfLiters;
//        return 0;
    }


    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {
        double trip = isSummer(date, SummerStart, SummerEnd) ? getSummerConsumption(length) : getWinterConsumption(length);
        return trip;

    }

    public int getNumberOfPassengersCanBeTransferred() {

       // return canPassengersBeTransferred() ? numberOfPassengers : 0;

        if (canPassengersBeTransferred()) return numberOfPassengers;

        //  return canPassengersBeTransferred() ? numberOfPassengers : 0;
        return 0;
    }


    private boolean canPassengersBeTransferred(){
        boolean can = isDriverAvailable() && fuel > 0;
        return can;

    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        fastenDriverBelt();
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
        }
    }

    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();

   public boolean isSummer(Date date , Date summerStart, Date summerEnd){
       return date.after(summerStart) && date.before(summerEnd);
   }
   public double getWinterConsumption(int length){
        return (winterFuelConsumption*length)+ winterWarmingUp;
   }

   public double getSummerConsumption(int length){
        return summerFuelConsumption*length;
   }
}