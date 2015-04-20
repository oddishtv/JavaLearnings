package com.company;


import java.util.Scanner;

/**
 * Created by Vitalii_Oborskyi on 3/6/2015.
 */

/*Write a program that which takes an year "N" as input and prints true if N corresponds to a leap year, and false otherwise. Assumes N >= 1582, corresponding to a year in the Gregorian calendar.

        Enter the year to be checked:
        1992
        true


        Enter the year to be checked:
        2013
        false*/




public class Class18 {

    public static class Year {
        private int actualYearNumber;
        private boolean leap;

        public Year (int actualYearNumber){
            this.actualYearNumber = this.isNotOld(actualYearNumber);
            this.leap = this.isLeap(actualYearNumber);

        }

        private int isNotOld (int year){
            int result = 0;

            if (year >= 1582) {
                result = year;
            }

            return result;
        }

        private boolean isLeap(int year){
            boolean result = false;
            if (year % 4 == 0) {
                if ((year % 100 != 0) || (year % 400 == 0)) {
                    result = true;
                }
            }
            return result;
        }

        public int getYear(){
            return this.actualYearNumber;
        }
        public boolean getLeap(){
            return this.leap;
        }

    }


    public static void run() {
        Scanner scanIn = new Scanner(System.in);
    int ytemp;
    Year y;
        do {
            System.out.println("Please enter a year more then >=1582");
           ytemp = Integer.parseInt(scanIn.nextLine());
            y = new Year(ytemp);
         } while (y.getYear() == 0);

        if (y.getLeap() == true){
            System.out.println("The year " +y.getYear()+ " is leap");
            } else System.out.println("The year " +y.getYear()+ " is not leap");
    }
}