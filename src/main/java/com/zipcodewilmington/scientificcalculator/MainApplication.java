package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Console.println("Welcome to my calculator!");


        Scanner scan = new Scanner(System.in);
        System.out.print("Choose the option: \n");
        System.out.print("1. Inverse \n 2.Square \n 3.Squareroot \n 4.Exponent\n");
        int operator = scan.nextInt();


        switch (operator) {
            case 1: {
                //Inverse the number
                InverseFunction inverse = new InverseFunction();
                inverse.calculateInverse();
                break;

            }
        case 2:
        {
//            //square
            double sQuare = square();
            System.out.println("Square of the given number is : " + sQuare);
            break;
        }
           case 3:
        {
           //Square root
            double root = squareRoot();
            System.out.println("SquareRoot of the given number is : " + root);
             break;
        }
           case 4:
        {
//            //Exponentiation
            double exponentiation = Exponentiation();
            System.out.println("exponentiation of the given number is : " + exponentiation);
            break;
        }
            default:
                System.out.println("entered invalid number");
        }

        scan.close();
    }

    public static double squareRoot(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double y = scan.nextInt();
        scan.close();
        double result = Math.sqrt(y);
        return result;

    }

    public static double square() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double x = scan.nextInt();
        scan.close();
        double square = Math.pow(x,2);
        return square;
    }

    public static double Exponentiation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double x = scan.nextInt();
        scan.close();
        double exponent = Math.exp(x);
        return exponent;
    }

}
