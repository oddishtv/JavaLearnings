package com.company;


import java.util.Scanner;


public class Class10 {

/*
No multiples of 3,4

Ask user for number n, Print all numbers 1-> n. Except multiples of 3 or 4.

Input :
10
Output:
1
2
5
7
10

Input:
5
Output:
1
2
5


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

    public static double Hex2Dec(String str)
    {
        int L = str.length();
        double result = 0;
        double j =  L - 1;
        for (int i = 0; i < L; i++)
        {
            String tempS = null;
            char sw = str.substring(i,i+1).toUpperCase().charAt(0);
            switch (sw) {
                case 'A':
                    tempS = "10";
                    break;
                case 'B':
                    tempS = "11";
                    break;
                case 'C':
                    tempS = "12";
                    break;
                case 'D':
                    tempS = "13";
                    break;
                case 'E':
                    tempS = "14";
                    break;
                case 'F':
                    tempS = "15";
                    break;
                default:
                    tempS = String.valueOf(sw);
                    break;
            }

            result = result + Double.parseDouble(tempS) * Math.pow(16,j);
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

        System.out.println("Result: ");
        for (int i = 1; i <=double1; i++)
        {
            if (!(i%3 == 0) && !(i%4 == 0))
            System.out.println(i);
        }









    }
}