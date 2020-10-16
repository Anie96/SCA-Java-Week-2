package com.anifahbhadmus;

class Car extends Vehicle implements CarInterface {

    int carYear;
    int tyres;
    String brand;
    String model;

    //constructor
    public Car(String sound, String engineName, String brand, String model, int tyres, int carYear){
        this.sound = sound;
        this.engineName = engineName;
        this.brand = brand;
        this.model = model;
        this.carYear = carYear;
        this.tyres = tyres;
    }

    @Override
    void vehicleSound() {
        System.out.println("The Car Sound is " + this.sound);
    }

    @Override
    void vehicleEngine() {
        System.out.println("The Car Engine is " + this.engineName);
    }

    public String carBrand() {
        return this.brand;
    }


    public int numOfTyres() {
        return this.tyres;
    }

    public String carModel() {
        return this.model;
    }

    int carYear(){

        return this.carYear;
    }

    //method that takes variable type and prints details based on variable passed.
    void getDetail(String type){

        System.out.println("You are trying to access the " + type + " detail");

        switch (type){
            case "year":
                System.out.println("The car's " + type + " is " + this.carYear());
                break;
            case "model":
                System.out.println("The car's " + type + " is " + this.carModel());
                break;
            case "brand":
                System.out.println("The car's " + type + " is " + this.carBrand());
                break;
            case "tyres":
                System.out.println("The car's " + type + " are " + this.numOfTyres());
                break;
            case "engine":
                System.out.println("The car's " + type + " is " + this.engineName);
                break;
            case "sound":
                System.out.println("The car's " + type + " is " + this.sound);
                break;
            default:
                System.out.println("The car's " + type + " was not stored");

        }

    }
}
