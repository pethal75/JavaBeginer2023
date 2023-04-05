package oop.cars;

public class Car {
    private String model;
    private String plateNumber;

    public Car() {
        model = "undefined";
        plateNumber = null;
    }

    public Car(String constructModel, String constructPlateNumber) {
        this.model = constructModel;
        this.plateNumber = constructPlateNumber;
    }

    public String toString() {
        return this.model + " (" + this.plateNumber + ")";
    }
}
