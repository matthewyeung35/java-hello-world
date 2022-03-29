package org.matthew.helloworld;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        String[] students = new String[5]; //create an array of 5 size
//        students[0]="John";
//        students[1]="Mat";
//        students[2]="hi";
//        students[3]="Tom";
//        students[4]="bb";
//        System.out.println(students[3]);
//
//        String[] employees = {"may", "tommy", "sarah"};
//        int[] numbers = {1,2,3,4,5,6};
//        for (int i=0; i< numbers.length; i++){
//            System.out.println(numbers[i]);

        String[] names = {"Mei", "Sarah","Tom","Brad","Brian"};
        int[] numbers = {13131,14214,54542,13251,24141};
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("Please enter a name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i=0; i<names.length; i++){
            if (name.equals(names[i])){
                System.out.println(numbers[i]);
            }
        }
    }
}
