import java.util.*;

class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void calculateFuelEfficiency() {
        System.out.println("Fuel efficiency depends on the type of vehicle.");
    }

    void distanceTravelled() {
        System.out.println("Distance travelled depends on the vehicle.");
    }

    void maximumSpeed() {
        System.out.println("Maximum speed depends on the vehicle.");
    }
}

class Truck extends Vehicle {

    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    void calculateFuelEfficiency() {
        System.out.println("Truck Fuel Efficiency: 8 km/l");
    }

    void distanceTravelled() {
        System.out.println("Truck Distance Travelled: 400 km");
    }

    void maximumSpeed() {
        System.out.println("Truck Maximum Speed: 100 km/h");
    }
}

class Car extends Vehicle {

    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    void calculateFuelEfficiency() {
        System.out.println("Car Fuel Efficiency: 18 km/l");
    }

    void distanceTravelled() {
        System.out.println("Car Distance Travelled: 600 km");
    }

    void maximumSpeed() {
        System.out.println("Car Maximum Speed: 180 km/h");
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    void calculateFuelEfficiency() {
        System.out.println("Motorcycle Fuel Efficiency: 45 km/l");
    }

    void distanceTravelled() {
        System.out.println("Motorcycle Distance Travelled: 500 km");
    }

    void maximumSpeed() {
        System.out.println("Motorcycle Maximum Speed: 120 km/h");
    }
}

public class Ass9rogram5 {
    public static void main(String[] args) {

        Truck truck = new Truck("Tata", "Prima", 2024, "Diesel");
        Car car = new Car("Maruti", "Swift", 2024, "Petrol");
        Motorcycle bike = new Motorcycle("Honda", "Shine", 2024, "Petrol");

        System.out.println("----- TRUCK -----");
        truck.calculateFuelEfficiency();
        truck.distanceTravelled();
        truck.maximumSpeed();

        System.out.println("\n----- CAR -----");
        car.calculateFuelEfficiency();
        car.distanceTravelled();
        car.maximumSpeed();

        System.out.println("\n----- MOTORCYCLE -----");
        bike.calculateFuelEfficiency();
        bike.distanceTravelled();
        bike.maximumSpeed();
    }
}

