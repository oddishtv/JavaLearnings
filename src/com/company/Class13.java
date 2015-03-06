package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Class13 {

/*
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.

Enter 3 values from 0 to 2:
1
0
1
Value of your ticket:0

Enter 3 values from 0 to 2:
1
    2
0
Value of your ticket:1
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

    public enum Planets {
        VENUS(1, 0.78),
        MARS(2, 0.39),
        JUPITER(3, 2.65),
        SATURN(4, 1.17),
        URANUS(5, 1.05),
        NEPTUNE(6, 1.23),
        SPACE(0, 0);

        private final int num;
        private final double grav;

        private Planets (int num, double grav){
            this.num = num;
            this.grav = grav;
        }

        private int num() { return num; }
        private double grav() { return grav; }

        double surfaceWeight(double otherMass) {
            return otherMass * grav;}

        public static Planets returnName (int num) {
            Planets pl = null;
            for (Planets p : Planets.values()) {
                if (p.num() == num)
                    pl = p;
            }

            return pl;

        }


        static Map<Integer, Planets> map = new HashMap();

        static {
            for (Planets p : Planets.values()) {
                map.put(p.num, p);
            }
        }

        public static Planets getByNum(int code) {
            return map.get(code);
        }

    }



    public static void run()
    {
        Scanner scanIn = new Scanner(System.in);
        Double double1 = null;
        String string1 = null;
        int weight = 0;
        int planetN = 0;
        Planets planet = null;
        Planets planet1 = null;



        System.out.println("Please enter your current earth weight: ");
        weight = Integer.parseInt(scanIn.nextLine());

        boolean flag = false;
        do {
            if (flag == true)
            {System.out.println("Please reenter correct number of planet: ");
            }
            flag = true;
            System.out.println("I have information for the following planets: ");
            System.out.println("1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. Neptune, which planet are you visiting: ");
            planetN = Integer.parseInt(scanIn.nextLine());
            planet = Planets.getByNum(planetN);
            planet1 = Planets.returnName(planetN);} while (planet == null && planet1 == null);

        System.out.println("Your planet is: ");
        System.out.println(planet);
        System.out.println(planet1);
        System.out.println("Your weight on " + planet + " is: ");
        System.out.println(planet.surfaceWeight(weight));




    }
}