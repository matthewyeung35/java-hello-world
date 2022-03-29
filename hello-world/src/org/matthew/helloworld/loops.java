package org.matthew.helloworld;

import java.util.Scanner;
import java.util.Random;

public class loops {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println("hello" + i);
        }

        int a =0;
        while (a<5){
            System.out.println("Hello");
            a++;
        }

        int b=0;
        while (b<10){
            b++;
            if (b==8){
                continue; //go to next loop
            }
            System.out.println("hello b" + b);
        }

        int c = 5;
        // loop at least one no matter what
        do{
            System.out.println("Do loop");
        }while (c<5);

        //input
//        System.out.println("Please enter a number");
//        Scanner scanner1 = new Scanner(System.in);
//        int answer = scanner1.nextInt();
//        System.out.println("Answer was " + answer);
//        System.out.println("Enter your name");
//        String name = scanner1.next();
//        System.out.println("Your name is " + name);

        Random random = new Random();
        int number = random.nextInt(20);
        System.out.println(number);
    }
}
