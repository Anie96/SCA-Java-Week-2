package com.anifahbhadmus;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //create a Car Object
        System.out.println("Creating a new car object");
        Car firstCar = new Car("PurrPurr", "EQ Engine", "Mercedes Benz", "A250", 4, 2016);

        System.out.println('\n');
        //use base class methods
        firstCar.vehicleEngine();
        firstCar.vehicleSound();

        System.out.println('\n');

        //Use getDetail Method to print Car details
        firstCar.getDetail("brand");
        firstCar.getDetail("model");
        firstCar.getDetail("year");

        System.out.println('\n');
        //get details that does not exist
        firstCar.getDetail("windows");



        System.out.println('\n');

        System.out.println("Creating a new truck object");
        //create a Truck Object
        Truck firstTruck = new Truck("GrrrrGrrrrrr", "Max 350 Engine", "Honda", "A250", 4, 2020);


        System.out.println('\n');
        firstTruck.vehicleEngine();
        firstTruck.vehicleSound();

        System.out.println('\n');
        //getDetail Method to print Truck details
        firstTruck.getDetail("year");
        firstTruck.getDetail("tyres");
        firstTruck.getDetail("model");

        System.out.println('\n');
        //get details that does not exist
        firstTruck.getDetail("color");

        System.out.println('\n');
        //start and stop Truck
        //did not override this method
        firstTruck.startVehicle();
        firstTruck.stopVehicle();


    }

}