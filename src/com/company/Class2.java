package com.company;

import java.util.Scanner;


/**
 * Created by Vitalii_Oborskyi on 12/25/2014.
 */
public class Class2 {

    public static double funcA (double a, double b, double c)
    {
        double s = (a + b + c) / 2;
        double Area;

        Area = s*(s-a)*(s-b)*(s-c);
        double Sqr = Math.sqrt(Area);
        return Sqr;
    }



    public static void run()
    {
        System.out.println(funcA(2,2,2));
    }
}