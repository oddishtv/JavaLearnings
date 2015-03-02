package com.company;


import java.util.Scanner;
import org.

/**
 Write a program that which takes an year "N" as input and prints true if N corresponds to a leap year, and false otherwise. Assumes N >= 1582, corresponding to a year in the Gregorian calendar.
 Enter the year to be checked:
 1992
 true
 Enter the year to be checked:
 2013
 false
 *
 */



public class Class6 {

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
        Double doubleTemp = null;
        String stringTemp = null;
        do {
            System.out.println("Enter a temperature in Celsius: ");
            stringTemp = scanIn.nextLine();
            if (isNumeric(stringTemp) == true)
            {
                doubleTemp = Double.parseDouble(stringTemp);
            } else System.out.println("Value is not numeric, please reenter");
        } while (isNumeric(stringTemp) == false);

        if (doubleTemp > 0) {
            int intTemp = (int) Math.round(doubleTemp);
            int Far = (intTemp * 9/5) + 32;
            System.out.println(" The temperature in Fahrenheit is: " + Far);
        } else {
            double Far = (doubleTemp * 9/5) + 32;
            System.out.println(" The temperature in Fahrenheit is: " + Far);
        }


    }
}