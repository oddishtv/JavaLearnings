package com.company;


/**
 * Created by Vitalii_Oborskyi on 3/6/2015.
 */
public class Class17 {

    public static class NumberHolder {
        public int anInt;
        public float aFloat;

        public NumberHolder(int anInt, float aFloat) {
            this.aFloat = aFloat;
            this.anInt = anInt;
         }

        public NumberHolder() {
            this.setBoth(0,0);
        }

        public NumberHolder(int anInt) {
            this.aFloat = 0;
            this.anInt = anInt;
        }

        public NumberHolder(float aFloat) {
            this.aFloat = aFloat;
            this.anInt = 0;
        }

        public void setAnInt (int anInt) {
            this.anInt = anInt;
        }

        public void setaFloat (float aFloat) {
            this.aFloat = aFloat;
        }

        public void setBoth (int anInt, float aFloat) {
            this.aFloat = aFloat;
            this.anInt = anInt;
        }
    }


    public static void run() {
        NumberHolder n = new NumberHolder(0F);
        System.out.println("NumberHolder.anInt " + n.anInt);
        System.out.println("NumberHolder.aFloat " + n.aFloat);
    }

}
