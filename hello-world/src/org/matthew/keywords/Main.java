package org.matthew.keywords;

public class Main {
    public static void main(String[] args) {

    TestClass.name = "Mei";

    TestClass testClass = new TestClass(25,"White");
    System.out.println("Name " + testClass.getName());

    TestClass testClass2 = new TestClass(17,"Black");
    System.out.println("Name " + testClass2.getName());

    TestClass.printSomething();
    }
}
