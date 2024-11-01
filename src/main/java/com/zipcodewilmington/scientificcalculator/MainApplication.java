package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
import com.google.inject.internal.util.Strings;
import javax.swing.*;
import java.util.Scanner;
import java.lang.Math;


public class MainApplication {
    public static void main(String[] args) {


        System.out.println("*********************************************");
        System.out.println("*                                           *");
        System.out.println("*  Welcome to the Lycaena Tech Calculator!  *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");
        String toQuit = "n";
        Double num1 = Console.getFirstDoubleInput("*              Enter a Number               *");

            System.out.println("*********************************************");
            System.out.println("*  Type the name of the operation or symbol *");
            System.out.println("*        You can even summon a Bunny        *");
            System.out.println("*        Enter 'wipe' to start over         *");
            System.out.println("*     Enter 'view to see all operations     *");
            System.out.println("*********************************************");
        do {
            String operator = Console.getStringInput("*             Enter the Operation           *");
//            while (operator.equals("clear")) {
//                num1 = Console.getFirstDoubleInput("*             Enter a  Number               *");
//                operator = Console.getStringInput("*             Enter the Operation           *");
//            }

            switch (operator) {
                //View Enda
                case "view":
                    System.out.println("*********************************************");
                    System.out.println("*      Add, Subtract, Multiply, Divide      *");
                    System.out.println("*   Radians to Degrees, Degrees to Radians  *");
                    System.out.println("*   Inverse Number, Inverse Sign, Square    *");
                    System.out.println("*    Square Root, Exponential, Factorial    *");
                    System.out.println("*  Log Value, Log Function, Anti Log, Sine  *");
                    System.out.println("*       Co Sine, Tangent, Inverse Sine      *");
                    System.out.println("*      Inverse Co Sine, Inverse Tangent     *");
                    System.out.println("*   Set Memory, Recall Memory, Memory Wipe  *");
                    System.out.println("*                  Bunny                    *");
                    System.out.println("*********************************************");
                    System.out.println("Current number is "+num1);
                    break;
                //Addition Sharmin
                case "+":
                case "add":
                case "addition":
                case "plus":
                    double plus2 = Console.getSecondDoubleInput(num1+ " +  next Number");
                    num1 = Opera.addition(num1,plus2);
                    System.out.println("Result: " + num1);
                    break;
                //Subtraction Sharmin
                case "-":
                case "sub":
                case "subtraction":
                case "minus":
                    double num2 = Console.getSecondDoubleInput(num1 + " - Next Number");
                    num1 = Opera.subtract(num1,num2);
                    System.out.println("Result: " + num1);
                    break;
                //Multiplication Sharmin
                case "x":
                case "times":
                case "multiply":
                case "multiplication":
                    double secondMulti = Console.getSecondDoubleInput(num1 + " x Next Number");
                    num1 = Opera.multiply(num1,secondMulti);
                    System.out.println("Result: " + num1);
                    break;
                //Division Sharmin
                case "/":
                case "divide":
                case "division":
                    double divid2 = Console.getSecondDoubleInput("num1 / Next Number");
                    num1 = Opera.divide(num1,divid2);
                    System.out.println("Result: " + num1);
                    break;
                //Divide by zero error Ron

                //Radians to Degrees Sharmin
                case "radians to degrees":
                case "rads to degs":
                case "r to d":
                    num1 = Math.toRadians(num1);
                    System.out.println("Result: "+num1);
                    break;
                //Degrees to Radians Sharmin
                case "degrees to radians":
                case "degs to rads":
                case "d to r":
                    num1 = Math.toRadians(num1);
                    System.out.println("Result: "+num1);
                    break;
                //Inverse number Deepti
                case "inverse number":
                case "inverse num":
                    InverseFunction inverse = new InverseFunction();
                    inverse.calculateInverse();
                    // This invokes a static method on an object which it
                    //shouldn't do. In order to keep the running total display
                    //chain going is:
                    //num1=InverseFunction.calculateInverse(num1);
                    //System.out.println(num1);
                    //The method should be called on the class, not an object.
                    break;
                //Invert sign Deepti
                case "invert sign":
                case "inv sign":
                    InverseFunction inverse1 = new InverseFunction();
                    inverse1.calculateInvertSign();
                    break;
                //Square Deepti
                case "square":
                case "sq":
                    num1 = Opera.square(Opera.acceptDoubleNum());
                    System.out.println("Square of the given number is : ");
                    System.out.printf("%.2f %n", num1);
                    break;
                //Square Root Deepti
                case "square root":
                case "sqrt":
                    num1 = Opera.squareRoot(Opera.acceptDoubleNum());
                    System.out.println("SquareRoot of the given number is : ");
                    System.out.printf("%.2f %n", num1);
                    break;
                //Exponential Deepti
                case "exponential":
                case "expo":
                case "exponent":

                    //Exponentiation
                    double[] input = Opera.acceptArrayInput();
                    num1 = Opera.exponentiation(input[0], input[1]);
                    System.out.println("exponentiation of the given number is : " + num1);
                    break;
                //Factorial Deepti
                case "factorial":
                case "fact":
                    // In order for this to work with the display chain, the longs
                    //will need to be changed to doubles.
                    long fact = Opera.factorial(Opera.acceptIntNum());
                    System.out.println("Factorial of the given number is : " + fact);
                    break;
                //Log Value Deepti
                case "log value":
                case "log val":
                    num1 = Opera.logFunction(Opera.acceptDoubleNum());
                    System.out.println("Logarithm of the given number is : ");
                    System.out.printf("%.2f %n", num1);
                    break;
                //Log Function Deepti
                case "log function":
                case "log func":
                    num1 = Opera.logFunction10(Opera.accepLongNum());
                    System.out.println("Logarithm of the given number is : ");
                    System.out.printf("%.2f %n", num1);
                    break;
                //Anti Log Deepti
                case "anti log":
                case "anti logarithm":
                case "inverse logarithm":
                case "inverse log":
                    num1 = Opera.antiLog(Opera.acceptDoubleNum());
                    System.out.println("Inverse Logarithm of the given number is : ");
                    System.out.printf("%.2f %n", num1);
                    break;
                //Sine Al
                case "sine":
                case "sin":
                    num1 = Opera.sin(Opera.acceptIntNum());
                    System.out.println("Sine of the given number is :" + num1 + " radians.");
                    break;
                //code below is what I had before making sin into a method
//                        System.out.print("Enter the angle in Degrees:\n");
//                        double angleInDegrees = Opera.acceptIntNum();
//                        double angleInRadians = Math.toRadians(angleInDegrees);
//                        double sineValue = Math.sin(angleInRadians);
//                        System.out.println("Sine of the given number is : " + sineValue);
//                        break;
                //Cosine Al
                case "cosine":
                case "co sine":
                case "cosin":
                    num1 = Opera.cos(Opera.acceptIntNum());
                    System.out.println("Cosine of the given number is :" + num1 + " radians.");
                    break;
                //What I had before making a method
//                        System.out.print("Enter the angle in Degrees:\n");
//                        double angleInDegreesCos = Opera.acceptIntNum();
//                        double angleInRadiansCos = Math.toRadians(angleInDegreesCos);
//                        double cosValue = Math.cos(angleInRadiansCos);
//                        System.out.println("Cosine of the given number is : " + cosValue);
//                          break;
                //Tangent Al
                case "tangent":
                case "tan":
                    num1 = Opera.tan(Opera.acceptIntNum());
                    System.out.println("Tangent of the given number is :" + num1 + " radians.");
                    break;
//                        System.out.print("Enter the angle in Degrees:\n");
//                        double angleInDegreesTan = Opera.acceptIntNum();
//                        double angleInRadiansTan = Math.toRadians(angleInDegreesTan);
//                        double tanValue = Math.tan(angleInRadiansTan);
//                        System.out.print("Tangent of the given number is : " + tanValue);
//                          break;
                //Inverse Sine Al
                case "inverse sine":
                case "inverse sin":
                    // in order to change for the display chain, int will need to be changed to double
                    int invSinValue = Opera.invSin(Opera.acceptIntNum());
                    System.out.println("Inverse sine of the given value is :" + invSinValue + " degrees.");
                    break;
                //what I had before making method
//                        System.out.print("Enter a value between -1 and 1:\n");
//                        double sine = Opera.acceptDoubleNum();
//                        double inverseSineRadians = Math.asin(sine);
//                        double inverseSineDegrees = Math.toDegrees(inverseSineRadians);
//                        System.out.println("Inverse Sine of the given number is : " + inverseSineDegrees + " degrees");
//                        break;
                //Inverse Cosine Al
                case "inverse cosine":
                case "inverse co sine":
                case "inverse cosin":
                    int invCosValue = Opera.invCos(Opera.acceptIntNum());
                    System.out.println("Inverse Cosine of the given value is :" + invCosValue + " degrees.");
                    break;
                //what I had before making method
//                        System.out.print("Enter a value between -1 and 1:\n");
//                        double cos = Opera.acceptDoubleNum();
//                        double inverseCosRadians = Math.acos(cos);
//                        double inverseCosDegrees = Math.toDegrees(inverseCosRadians);
//                        System.out.println("Inverse Cosine of the given number is : " + inverseCosDegrees + " degrees");
//                          break;
                //Inverse Tangent Al
                case "inverse tangent":
                case "inverse tan":
                    int invTanValue = Opera.invTan(Opera.acceptIntNum());
                    System.out.println("Inverse Tangent of the given value is :" + invTanValue + " degrees.");
                    break;
                //Clear Enda
                case "wipe":
                    num1 = 0.0;
                    Console.clearTheScreen();
                break;
                //Memory Set Ron
                case "mem":
                case "set memory":
                case "memory":
                    //Memory Set
                        //At the top somewhere, you can add a double var named mem
                        //Have this method set mem to num1.
                    break;
                //Memory Recall Ron
                case "mrc":
                case "memory recall":
                    //make the method set num1 to memory.
                    //Display it.
                    break;
                //Memory Clear Ron
                case "mc":
                case "memory wipe":
                    //make this set mem to 0.
                    //display message showing mem's 0 value.
                  break;
                    //Bunny Enda
                case "bunny":
                    Console.getBunny();
                    if (num1 <= 10) {
                        for (int i = 0; i < num1; i++) {
                            System.out.print("boing ");
                            System.out.println(" ");
                        }
                    } else if (num1 <= 100) {
                        int bigCat = num1.intValue() / 10;
                        for (int i = 0; i < bigCat; i++) {
                            System.out.print("boing ");
                            System.out.println(" ");
                        }
                    } else if (num1 <= 1000) {
                        int biggerCat = num1.intValue() / 100;
                        for (int i = 0; i < biggerCat; i++) {
                            System.out.print("boing ");
                            System.out.println(" ");
                        }
                    } else {
                        System.out.println("That's a big bunny!");
                        System.out.println(" ");
                    }
                    System.out.println(num1);
                    System.out.println(" ");
            }
        }
        while (!(toQuit.equals("yes") || toQuit.equals("y"))) ;

//         }  catch(ArithmeticException e){
//         System.out.println("You are not allowed to divide by zero.");
//     } catch(Exception e){
//         System.out.println("Error: Please try again");
//     } finally{
//         System.out.println("Please continue");
//         }

        //////////////////////////////////////////////////////////////////////////////////////////////



        /*        //Memory function Ron
                double memoryValue = 0.0;
                ;
                /*public void setMPlus ( double value;){
                    memoryValue += value;
                }

                public double getMRC () {
                    return memoryValue;
                }

                public void getMC () {
                    memoryValue = 0.0;
                }*/



//            
        //Reset and goodbye loop Enda
//        if (!(toQuit.equals("yes") || toQuit.equals("y"))) {
//            System.out.println("*********************************************");
//            num1 = Console.getFirstDoubleInput("*             Enter a New Number             *");
//        } else {
//            System.out.println("*********************************************");
//            System.out.println("*         Thank You for using the           *");
//            System.out.println("*.        Lycaena Tech Calculator!          *");
//            System.out.println("*********************************************");
//
//        }

    }
}
