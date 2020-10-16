package com.anifahbhadmus;

public class Vehicle {


    String sound;
    String engineName;



    void vehicleSound(){
        System.out.println("The Vehicle makes a " + this.sound  + " sound");
    }

    void vehicleEngine(){
        System.out.println("The Vehicle Engine is " + this.engineName);
    }

    void startVehicle(){
        System.out.println("Starting the Vehicle");
        System.out.println(this.sound);
    }

    void stopVehicle(){
        System.out.println("Stopping the Vehicle");
    }


}
