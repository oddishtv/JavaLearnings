package com.company;


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
            this.actualYearNumber = actualYearNumber;
            leap = this.isLeap(actualYearNumber);
        }

        private boolean isLeap(int year){

        }

    }


    public static void run() {


    }
}