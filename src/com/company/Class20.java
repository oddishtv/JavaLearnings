package com.company;


import java.util.Scanner;

/**
 * Created by Vitalii_Oborskyi on 3/6/2015.
 */

/*
Ask a user for a number then print the ceiling and floor.

        For Example:

        Input:
        5.6
        Output:
        6
        5


        Input:
        8.4
        Output:
        9
        8
*/



public class Class20 {

    public static boolean isInteger(String str)
    {
        try
        {
            int d = Integer.parseInt(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    public static boolean Compare (String num1 , String num2){
        boolean result = false;
        int temp1 = RemoveMinus(num1);
        int temp2 = RemoveMinus(num2);
        if (temp1 == temp2) {result = true;}

        return result;
    }
    public static int RemoveMinus (String num){
        int result = 0;
        int temp = Integer.parseInt(num);
        if (temp < 0){
            temp = - temp;
            result = result + temp;}
        else if  (temp > 0){result = temp;}

        return result;
    }




    public static void run() {
        boolean result;
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Enter num1");
        String num1 = scanIn.nextLine();
        System.out.println("Enter num2");
        String num2 = scanIn.nextLine();
        result = Compare(num1,num2);
        System.out.println("The Result is " + result);


    }
}