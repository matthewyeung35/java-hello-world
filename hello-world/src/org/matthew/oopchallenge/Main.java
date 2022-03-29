package org.matthew.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Tom", 25,
                new Eye("short sighted", "blue", true, 'l'),
                new Eye("decent", "blue", false, 'r'),
                new Heart("Ok", 80), new Stomach("PUD"),
                new Skin("burned"));
        System.out.println("Patient name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        Scanner scanner = new Scanner(System.in);
        int user_choice = 1;
        while (user_choice == 1 || user_choice == 2 || user_choice == 3 || user_choice == 4 || user_choice == 5) {
            System.out.println("Choose an Organ:\n\t1. Left eye\n\t2. Right eye\n\t3. Heart\n\t4. Stomach\n\t5. Skin\n\t6. Quit");
            user_choice = scanner.nextInt();
            if (user_choice == 1) {
                patient.getLeft_eye().getDetails();
                if (patient.getLeft_eye().getClosed()) {
                    System.out.println("\t\t1. Open the eye");
                    int eye_choice = scanner.nextInt();
                    if (eye_choice == 1) {
                        patient.getLeft_eye().open_close();
                    }
                } else {
                    System.out.println("\t\t1. Close the eye");
                    int eye_choice = scanner.nextInt();
                    if (eye_choice == 1) {
                        patient.getLeft_eye().open_close();
                    }
                }

            } else if (user_choice == 2) {
                patient.getRight_eye().getDetails();
                if (patient.getRight_eye().getClosed()) {
                    System.out.println("\t\t1. Open the eye");
                    int more_choice = scanner.nextInt();
                    if (more_choice == 1) {
                        patient.getRight_eye().open_close();
                    }
                } else {
                    System.out.println("\t\t1. Close the eye");
                    int more_choice = scanner.nextInt();
                    if (more_choice == 1) {
                        patient.getRight_eye().open_close();
                    }
                }
            } else if (user_choice == 3) {
                patient.getHeart().getDetails();
                System.out.println("Heart: " + patient.getHeart().getHeart_rate());
                System.out.println("\t\t1. Change heart rate");
                int more_choice = scanner.nextInt();
                if (more_choice == 1) {
                    System.out.println("Enter new heart rate");
                    int heart_rate = scanner.nextInt();
                    patient.getHeart().setHeart_rate(heart_rate);
                }
            } else if (user_choice == 4) {
                patient.getStomach().getDetails();
                System.out.println("\t\t1. feed");
                int more_choice = scanner.nextInt();
                if (more_choice == 1) {
                    patient.getStomach().feed();
                }
            } else if (user_choice == 5) {
                patient.getSkin().getDetails();
            }

        }
        System.out.println("finish operations");
    }
}