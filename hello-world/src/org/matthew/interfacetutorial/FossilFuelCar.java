package org.matthew.interfacetutorial;

public class FossilFuelCar implements CarInterface, TestInterface{
    private String name;

    public FossilFuelCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion to start");
    }

    @Override
    public void move(int speed) {
        System.out.println("this car is moving at speed "+speed);
    }

    @Override
    public void printName(String name) {
        System.out.println("car name is"+ name);
    }
}
