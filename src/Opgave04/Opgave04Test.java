package Opgave04;

import Opgave04.Models.Car;
import Opgave04.Storage.CarStorage;

import java.util.ArrayList;

public class Opgave04Test {
    public static void main(String[] args) {
        CarStorage carStorage = new CarStorage();
        System.out.println(carStorage.higherTopSpeed(250).toString());
        System.out.println(carStorage.matchingBrand("Tesla").toString());
    }
}
