package com.company;


import java.util.Scanner;

/**
 * Created by Vitalii_Oborskyi on 12/25/2014.
 Degree to Fahrenheit converter
 Write Java program to allow the user to input temperature in Celsius and convert it into fahrenheit.
 Enter a temperature in Celsius: 25
 The temperature in Fahrenheit is: 77
 Enter a temperature in Celsius: 0
 The temperature in Fahrenheit is: 32.0
 Enter a temperature in Celsius: -25
 The temperature in Fahrenheit is: -13.0
 *
 */



public class Class5 {

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