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
        double x = 5.4;
        double y = 5.6;
        String stringX = String.valueOf(x);
        String stringY = String.valueOf(y);
        stringX = stringX.substring(0,stringX.indexOf("."));
        stringY = stringY.substring(0,stringY.indexOf("."));
        /*int intX = (int)Math.round(x);
        int intY = (int)Math.round(y);*/
        //Scanner scanIn = new Scanner(System.in);
        //System.out.println("Enter num");
        //String num = scanIn.nextLine();
        System.out.println("X = " + stringX);
        System.out.println("Y = " + stringY);
        int intX = Integer.parseInt(stringX);
        int intY = Integer.parseInt(stringY);
        intX = intX + 1;
        intY = intY + 1;
        stringX = Integer.toString(intX);
        stringY = Integer.toString(intY);
        System.out.println("X + 1 = " + stringX);
        System.out.println("Y + 1 = " + stringY);


    }
}