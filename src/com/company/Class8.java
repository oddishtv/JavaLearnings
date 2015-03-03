package com.company;


import java.util.Scanner;


public class Class8 {

/*
Write a program called Oct2Dec to convert an input octal string into its equivalent decimal number.

Enter an octal number:21
Decimal Value:17


Enter an octal number:5
Decimal Value:5

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


    public static double Oct2Dec(String str)
    {
        int L = str.length();
        double result = 0;
        double j =  L - 1;
        for (int i = 0; i < L; i++)
        {
            String test = str.substring(i,i+1);
            result = result + Double.parseDouble(str.substring(i,i+1)) * Math.pow(8,j);
            j--;
        }


    return result;
    }




    public static void run()
    {
        Scanner scanIn = new Scanner(System.in);
        Double double1 = null;
        String string1 = null;



        do {
            System.out.println("Input 1 : ");
            string1 = scanIn.nextLine();
            if (isNumeric(string1) == true)
            {
                double1 = Double.parseDouble(string1);
            } else System.out.println("Value is not numeric, please reenter");
        } while (isNumeric(string1) == false);

        double result = Oct2Dec(string1);
        String resultS = Double.toString(result);
        System.out.println("Result: ");
        System.out.println(resultS);






    }
}