package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class InverseFunction {


    public static double calculateInverse() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double y = scan.nextInt();


        System.out.println("Original Input value : " + y);
        System.out.println("Inverse of input value: " + inverseF(y));
        scan.close();
        return inverseF(y);

    }

    //Function to reverse the number
    public static double inverseF(double y) {
        return 1/y;
    }

}

