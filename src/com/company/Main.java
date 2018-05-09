package com.company;

import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Main {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);


                System.out.println("Enter a");
        double a = in.nextDouble();
        System.out.println("Enter b");
            double b = in.nextInt();
            System.out.println("What do you want to do" + "\n" + " Enter '+';" + "\n" + " Enter '-';" + "\n" + " Enter '*';" + "\n" + " Enter '/';");
            double c;

            String d = in.next();

            switch (d) {
                case "+":
                    c = a + b;
                    System.out.println(a + "+" + b + "=" + c);
                    break;
                case "-":
                    c = a - b;
                    System.out.println(a + "-" + b + "=" + c);
                    break;
                case "*":
                    c = a * b;
                    System.out.println(a + "*" + b + "=" + c);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("На ноль делить нельзя");
                    } else {
                        c = a / b;
                        System.out.println(c);
                    }
                    break;
                default:
                    System.out.println("You did not select an action");
            }




    }
}