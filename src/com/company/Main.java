package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter a");
        Integer a = in.nextInt();
        System.out.println("Enter b");
        Integer b = in.nextInt();
        System.out.println("What do you want to do"+"\n"+" Enter '1' = '+';"+"\n"+" Enter '2' = '-';"+"\n"+" Enter '3' = '*';"+"\n"+" Enter '4' = '/';");
        Integer d = in.nextInt();
        Integer  c ;
        switch (d){
            case 1:
                c = a+b;
                System.out.println(a+"+"+b+"="+c);
                break;
            case 2:
                c=a-b;
                System.out.println(a+"-"+b+"="+c);
                break;
            case 3:
                c=a*b;
                System.out.println(a+"*"+b+"="+c);
                break;
            case 4:
                c=a/b;
                System.out.println(a+"/"+b+"="+c);
                break;
            default:
                System.out.println("You did not select an action");
        }
    }
}


