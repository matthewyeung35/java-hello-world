package org.matthew.oop2;

public class Main {
    public static void main(String[] args) {
    Bird phoenix = new Bird("Nan","gold",2,true, 2);
    Dog doggo = new Dog("doggo","red",4,true);
    System.out.println(phoenix.getName());
    phoenix.eat("grass");
    doggo.eat("dog food");
    System.out.println(phoenix.getWings());
    phoenix.fly();
    }
}
