package com.company;

/**
 * Created by Vitalii_Oborskyi on 3/6/2015.
 */
public class Class16 {

    public static class Rectangle {

        int width;
        int height;

        public int area(){
            return width * height;
        }

        public Rectangle(){
            this.height = 0;
            this.width = 0;
        }
    }

    public static void run() {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());

        String[] students = new String[10];
        String studentName = "Peter Parker";
        students[0] = studentName;
        studentName = null;
        System.out.println("students[0] " + students[0]);
        System.out.println("studentName " + studentName);
    }

}
