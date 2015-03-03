package com.company;


import java.util.Scanner;


public class Class6 {


/*
    Given a double from user, calc the square root and the quad root and print it.
    Limit the answers to 5 decimal places.

    For Example:
    Input:
            81
    Output:
            9.00000
            3.00000


    Input:
            625
    Output:
            25.00000
            5.00000
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
        Double doubleTemp = null;
        String stringTemp = null;

        double factor = 1e5; // = 1 * 10^5 = 100000.

        do {
            System.out.println("Input : ");
            stringTemp = scanIn.nextLine();
            if (isNumeric(stringTemp) == true)
            {
                doubleTemp = Double.parseDouble(stringTemp);
            } else System.out.println("Value is not numeric, please reenter");
        } while (isNumeric(stringTemp) == false);

        double firstRoot = Math.sqrt(doubleTemp);
        double secondRoot = Math.sqrt(firstRoot);

        System.out.println("Output : ");

        String strDouble1 = String.format("%.5f", firstRoot);
        String strDouble2 = String.format("%.5f", secondRoot);
        System.out.println(strDouble1);
        System.out.println(strDouble2);


     ;

    }
}