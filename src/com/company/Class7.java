package com.company;


import java.util.Scanner;


public class Class7 {

/*
Make a Java program that accepts two integers(num1 and num2) as an input from the user and returns their sum as long as the sum has the same number of digits as num1. If sum has more digits than num1 than return num1 without num2.



Enter the 1st number: 2
Enter the 2nd number: 3
Result:5


Enter the 1st number:9
Enter the 2nd number:3
Result:9
*/


    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }


    public static void run()
    {
        Scanner scanIn = new Scanner(System.in);
        Double double1 = null;
        String string1 = null;
        Double double2 = null;
        String string2 = null;


        do {
            System.out.println("Input 1 : ");
            string1 = scanIn.nextLine();
            if (isNumeric(string1) == true)
            {
                double1 = Double.parseDouble(string1);
            } else System.out.println("Value is not numeric, please reenter");
        } while (isNumeric(string1) == false);

        do {
            System.out.println("Input 2 : ");
            string2 = scanIn.nextLine();
            if (isNumeric(string2) == true)
            {
                double2 = Double.parseDouble(string2);
            } else System.out.println("Value is not numeric, please reenter");
        } while (isNumeric(string2) == false);

        int double1L = double1.toString().length();
        Double result = double1 + double2;

        int resultL = result.toString().length();

        if (resultL > double1L) {
            System.out.println("Input1: ");
            System.out.println(double1);
        } else {
            System.out.println("Result: ");
            System.out.println(result);
        }




    }
}