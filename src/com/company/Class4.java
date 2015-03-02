package com.company;


import java.util.Scanner;

/**
 * Created by Vitalii_Oborskyi on 12/25/2014.
 */



public class Class4 {
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
        String stringA;
        Double A = null;
        String stringB;
        Double B = null;
        do {
            System.out.println("Enter a value a: ");
            stringA = scanIn.nextLine();
            if (isNumeric(stringA) == true)
            {
                A = Double.parseDouble(stringA);
            } else System.out.println("Value is not numeric, please reenter");
        } while (isNumeric(stringA) == false);
        do {
            System.out.println("Enter a value b: ");
            stringB = scanIn.nextLine();
            if (isNumeric(stringB) == true)
            {
                B = Double.parseDouble(stringB);
            } else System.out.println("Value is not numeric, please reenter");
        } while (isNumeric(stringB) == false);
        double sum = A + B;
        double sub = A - B;
        double mult = A * B;
        double div = A / B;
        System.out.println("The result of adding is: " + sum);
        System.out.println("The result of subtracting is: " + sub);
        System.out.println("The result  of multiplying is: " + mult);
        System.out.println("The result of dividing is: " + div);
    }
}