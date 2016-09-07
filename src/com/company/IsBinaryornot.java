package com.company;


/**
 * Created by Vitalii_Oborskyi on 3/6/2015.
 */

/*

Write a program which takes input as string and check if it is palindrome or not.If the string and the reverse of string are same then we say string is palindrome.

If string is "level" then the output should be: palindrome

If string is "helloworld" then the output should be: not a palindrome

*/
// *[1,0]


public class IsBinaryornot {

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
        String x = "104000";
        x = x.replaceAll("1","");
        x = x.replaceAll("0","");
        if (x.length() == 0)
        {
            System.out.println("Binary: "+ x);
        } else
        {
            System.out.println(" NOT Binary: "+ x);
        }




        System.out.println(x);



    }
}