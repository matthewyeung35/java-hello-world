package org.matthew.interfacetutorial;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("TSLA");
        carInterface.start();
        carInterface.move(60);

        CarInterface fossilCarInterface = new FossilFuelCar("Mercedes");
        fossilCarInterface.start();
        fossilCarInterface.move(50);
    }
}
