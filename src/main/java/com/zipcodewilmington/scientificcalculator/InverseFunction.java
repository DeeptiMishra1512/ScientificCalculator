package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class InverseFunction {


    public static double calculateInverse() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double y = scan.nextInt();


        System.out.println("Original Input value : " + y);
        System.out.println("Inverse of input value: " + inverseNumF(y));
        scan.close();
        return inverseNumF(y);

    }

    //Function to inverse the number
    public static double inverseNumF(double y) {
        return 1/y;
    }

    //Function to invert the sign of the number
//    public static double invertsign(double x) {
//
//  //      return 1/y;
//    }

}

