package org.matthew.helloworld;

import java.util.Random;
import java.util.Scanner;


public class challenge1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome! What is your name?");
        String name = scanner1.next();
        int start = 0;
        do{
            System.out.println("Welcome "+name+" Should we start the game? y=1/n=0");
            start = scanner1.nextInt();
        }while (start != 1);
        Random random = new Random();
        int random_number = random.nextInt(20);
        System.out.println("Please guess a number");
        int guess = scanner1.nextInt();
        for (int i=0; i<4; i++){
            if (guess == random_number){
                break;
            }
            if (guess > random_number){
                System.out.println("your guess is larger than the answer, guess again, " + (4-i) + " more tries");
                guess = scanner1.nextInt();
            }else if (guess < random_number){
                System.out.println("your guess is smaller than the answer, guess again, " + (4-i) + " more tries");
                guess = scanner1.nextInt();
            }
        }
        if (guess == random_number){
            System.out.println("you won!");
        }else{
            System.out.println("You lose");
        }
        System.out.println("The answer is " + random_number);

    }


}
