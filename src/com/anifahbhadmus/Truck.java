package com.anifahbhadmus;

class Truck extends Vehicle implements TruckInterface {


    int vehicleYear;
    int tyres;
    String brand;
    String model;


    public Truck(String sound, String engineName, String brand, String model, int tyres, int vehicleYear){
        this.sound = sound;
        this.engineName = engineName;
        this.brand = brand;
        this.model = model;
        this.tyres = tyres;
        this.vehicleYear = vehicleYear;
    }
    //override inherited methods from Vehicle
    @Override
    void vehicleSound() {
        //you can still run the super class method before triggering the original implementatation before doing what youwant to do
        super.vehicleSound();
        System.out.println("The Truck makes a " + this.sound +  " sound");
    }

    @Override
    void vehicleEngine() {
        System.out.println("The Truck Engine is " + this.engineName);
    }

    //implement interface methods
    public String truckBrand() {
        return this.brand;
    }

    public String truckModel() {
        return this.model;
    }

    //it may be good to move this to Vehicle Class
    //all Vehicles have a certain number of wheels
    public int numOfTyres() {
        return this.tyres;
    }
    //method that takes variable type and prints details based on variable passed.
    void getDetail(String type){

        System.out.println("You are trying to access the " + type + " detail");

        switch (type){
            case "year":
                System.out.println("The truck's " + type + " is " + this.vehicleYear);
                break;
            case "model":
                System.out.println("The truck's " + type + " is " + this.truckModel());
                break;
            case "brand":
                System.out.println("The truck's " + type + " is " + this.truckBrand());
                break;
            case "tyres":
                System.out.println("The truck's " + type + " are " + this.numOfTyres());
                break;
            case "engine":
                System.out.println("The truck's " + type + " is " + this.engineName);
                break;
            case "sound":
                System.out.println("The truck's " + type + " is " + this.sound);
                break;
            default:
                System.out.println("The truck's " + type + " was not stored");

        }
}
}
