package com.company;


/**
 * Created by Vitalii_Oborskyi on 3/6/2015.
 */

/*

Write a program which takes input as string and check if it is palindrome or not.If the string and the reverse of string are same then we say string is palindrome.

If string is "level" then the output should be: palindrome

If string is "helloworld" then the output should be: not a palindrome

*/



public class Class21 {

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
        String x = "level1";
        String reversedX = new StringBuffer(x).reverse().toString();


        if (x.equals(reversedX)) {
        System.out.println("palindrome");} else
        System.out.println("not palindrome");


    }
}