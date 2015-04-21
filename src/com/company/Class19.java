package com.company;


import java.util.Scanner;

/**
 * Created by Vitalii_Oborskyi on 3/6/2015.
 */
/*
Check if the Absolute Values of the two inputted numbers are equal.

        Examples:
        If the numbers are 43 and 43, the program should print "true".
        If the numbers are 43 and 46, the program should print "false".
        If the numbers are 43 and -43, the program should print "true".

        That's about it! :)*/



public class Class19 {

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