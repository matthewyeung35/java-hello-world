package org.matthew.helloworld;

import java.sql.SQLOutput;

public class hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        System.out.println("Hello world");
        // comment
        //TODO do something
        int number = 5;
        System.out.println(number);

        long myLong = -5; // larger int
        System.out.println(myLong);

        float myFloat = (float) 4.5;
        System.out.println(myFloat);

        double myDouble = 4.5; // larger float
        System.out.println(myDouble);

        char myChar = '\u00AE'; // one character or unicode
        System.out.println(myChar);

        String name = "Matthew"; // a class, not primitive
        System.out.println(name);

        boolean myBoolean = true;
        System.out.println(myBoolean);

        int a = 5;
        int b = 2;
        int answer1 = a+b;
        double answer2 = (double) a / b;
        System.out.println(answer1 + " " + answer2);

        a = 5;
        a += 2;
        a++;
        System.out.println(a);
    }
}
