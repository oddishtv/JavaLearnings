package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Class12 {

/*
Space Boxing

Brandon Foster is an interplanetary space Boxer, who  currently holds the championship belts for various different categories on many different planets. However, it is often difficult for him to recall what his "target weight" needs to be on earth in order to make the weight class on other planets. Make a Java program to help him keep track of this.

It should ask him his weight on earth, and to enter a number for the planet he wants to fight on. It should then compute his weight on the destination planet based on the table below:

#	Planet	Relative gravity
1	Venus	0.78
2	Mars	0.39
3	Jupiter	2.65
4	Saturn	1.17
5	Uranus	1.05
6	Neptune	1.23

Note: You are to use following formula when calculating the weight on the given planet (weight on earth * relative gravity)



Example

Input:
 Please enter your current earth weight : 128
 I have information for the following planets :
 1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. Neptune, which planet are you visiting : 1
 Output:
 Your weight in pounds : 99.84


Input:
 Please enter your current earth weight : 128
 I have information for the following planets :
 1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. Neptune, which planet are you visiting : 2
 Output:
 Your weight in pounds : 49.92
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



        System.out.println("Please enter your current earth weight: ");
        weight = Integer.parseInt(scanIn.nextLine());
        System.out.println("I have information for the following planets: ");
        System.out.println("1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. Neptune, which planet are you visiting: ");
        planetN = Integer.parseInt(scanIn.nextLine());
        Planets planet = Planets.getByNum(planetN);
        Planets planet1 = Planets.returnName(planetN);

        System.out.println("Your planet is: ");
        System.out.println(planet);
        System.out.println(planet1);
        System.out.println("Your weight on " + planet + " is: ");
        System.out.println(planet.surfaceWeight(weight));




    }
}