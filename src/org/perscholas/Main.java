package org.perscholas;

import java.util.function.IntToDoubleFunction;

public class Main {

    public static void main(String[] args) {


        //  First Case:  Declare 2 Int's, sum togehter, print result
        Integer number1 = 23, number2 = 77;

        /*  Creating variable for sum of number1 and number2
        adding value at the creation of integer number3
         */
        Integer number3 = number1 + number2;

        //printing out test
        System.out.println("The Sum of " + number1 + " and " + number2 + " equals " + number3 + "!!!");
        //end first case


        /*
        Second Case:  Write a program that declares 2 double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result
         */
        //Declaring two doubles and giving them both values
        Double num1 = 45.750, num2 = 54.250;

        //Declaring double variable to hold the sum of number1 and number2
        Double num3 = num1 + num2;

        //Printing the result
        System.out.println("The Sum of " + num1 + " and " + num2 + " equals " + num3 + "!!!");
        //end second case


        /*
        Third Case:  Write a program that declares an integer variable and a double variable, assigns numbers to each,
        and adds them together. Assign the sum to a variable. Print out the result.
        What variable type must the sum be?
         */

        //Declaring an integer and double valued variables
        //Integer random1 = 65;
        //Double random2 = 35;

        //You cannot add an integar with a double.  Must Convert Int to double
        //Float.sum(rando) convertRandom1 = new Double(random1);

        /*Integer intNumber1 = 65;
        Double doubleNumber1 = 35.23;
        Double convertInt;
        convertInt = new Double(intNumber1);
        doubleNumber2 = Math.addExact(intNumber1,doubleNumber1);
        */
        Integer num1Int = 56;
        Double dubNum = 44.0;


        System.out.println("The Sum of " + num1Int + " and " + dubNum + " equals " + Double.sum(Double.valueOf(num1Int), dubNum) + "!!!");
        //end case
        }
}
