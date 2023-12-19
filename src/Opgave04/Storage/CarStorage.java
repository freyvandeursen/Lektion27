package Opgave04.Storage;

import Opgave04.Models.Car;

import java.util.ArrayList;

public class CarStorage {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public CarStorage() {
        cars.add(new Car("Renault", "Clio", 222));
        cars.add(new Car("Skoda", "Fabia", 193));
        cars.add(new Car("Tesla", "Model Y", 250));
        cars.add(new Car("Tesla", "Model S", 261));
        cars.add(new Car("Polestar", "2", 160));
        cars.add(new Car("Mercedes", "CLE Coupé", 250));
        cars.add(new Car("Mercedes", "EQE", 210));
    }
    public Car higherTopSpeed(int speedCompare) {
        for (Car car: cars) {
            if (car.getTopSpeed() > speedCompare)
                return car;
        }
        return null;
    }

    public Car matchingBrand(String brand) {
        for (Car car: cars) {
            if (car.getBrand().equals(brand))
                return car;
        }
        return null;
    }



}
