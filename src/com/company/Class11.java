package com.company;


import java.util.Scanner;


public class Class11 {

/*
Right or Wrong

Given 12+12 , ask the user for the answer. If the user inputs the correct answer, print true else print false. Use booleans and not strings.

For Example:

Input:
25
Output:
false

Input:
24
Output:
true

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



        //do {
            System.out.println("12+12 ? : ");
            string1 = scanIn.nextLine();

/*
            if (isNumeric(string1) == true)
            {
                double1 = Double.parseDouble(string1);
            } else System.out.println("Value is not numeric, please reenter");
        } while (isNumeric(string1) == false);
*/

        int check = Integer.parseInt(string1);
        switch (check){
            case 24:
                System.out.println("True");
                break;
            default:
                System.out.println("False");
                break;
        }



    }
}