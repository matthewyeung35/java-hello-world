package org.matthew.helloworld;

public class operators {
    public static void main(String[] args) {
    int a = 1;
    int b = 3;
    boolean answer = a>b;
        System.out.println(answer);
    answer = a == b;
        System.out.println(answer);
    answer = a==5 || b==2; //or
        System.out.println(answer);
    answer = a==5 && b==2; //and
        System.out.println(answer);
    if (a>3){
        System.out.println("A is greater than 3");
    } else{
        System.out.println("A is less than 3");
    }
    if (answer){
            System.out.println("a is 5 and b is 2");
    }else{
            System.out.println("wrong");
        }
    if (a>0){
        System.out.println("A is positive");
    }else if(a<0){
        System.out.println("A is negative");
        }else{
        System.out.println("A is 0");
    }
    switch (a){
        case 1:
            System.out.println("A is 1");
            break;
        case 2:
            System.out.println("A is 2");
            break;
        default:
            System.out.println("A is not 1 or 2");
            break;
    }
    }
}
