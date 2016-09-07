package com.company;

import java.util.Scanner;

/**
 * Created by Vitalii_Oborskyi on 12/25/2014.
 */
public class Class1 {
    public static void run()
    {

        int start  = 34, end = 99;
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = scanIn.nextLine();
        System.out.println("Hi " + name + "! How old are you?");
        String age = scanIn.nextLine();
        System.out.println("So you're " + age + " eh? That's not old at all!");
        System.out.println("How much do you make " + name + "?");
        String salary = scanIn.nextLine();
        double sal = Double.parseDouble(salary);
        System.out.println( sal + "! I hope that's per hour and not per year! LOL!");
    }
}