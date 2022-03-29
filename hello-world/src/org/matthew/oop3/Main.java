package org.matthew.oop3;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("corolla", 4, "white", new Engine("1.6", 4000));
        System.out.println(toyota.getName());
        Engine toyota_engine = toyota.getEngine();

        System.out.println("Engine Model: " + toyota.getEngine().getModel());

        // null keyword
        Car mercedes = null;
        if (mercedes != null){
            mercedes.getName();
        }else{
            System.out.println("The car was null");
        }

        // final keyword
        final int a = 5; //can't be changed
//        a = a+1;

        final Engine engine = new Engine("Renault",8000);
//        engine = new Engine("testing",4000);  can't change the whole thing
        engine.setRpm(10000); //can change part of the class
    }
}
