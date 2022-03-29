package org.matthew.oop;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone11",5,8,8);
//        iPhone.setName("iPhone11");
//        iPhone.setMemoryRam(8);
        System.out.println(iPhone.getName());
        Phone pixel = new Phone("Pixel 3", 8);
        iPhone.playMusic("Musiccc");
        iPhone.playMusic("Banggg");
    }
}
