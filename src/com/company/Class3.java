package com.company;


import java.util.Scanner;

/**
 * Created by Vitalii_Oborskyi on 12/25/2014.
 */
public class Class3 {

    public static void run()
    {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Hello. What is your first name?");
        String firstname = scanIn.nextLine();
        System.out.println("What is your last name?");
        String lasttname = scanIn.nextLine();

        int intGrade;
        do {
            System.out.println("What is your grade(9-12)?");
            String grade = scanIn.nextLine();
            intGrade = Integer.parseInt(grade);
        } while (intGrade < 9 || intGrade > 12);
        int intStudentID;
        do {
            System.out.println("What is your student id(integer 6 digits))?");
            String studentID = scanIn.nextLine();
            intStudentID = Integer.parseInt(studentID);
        } while (intStudentID < 0 || intStudentID > 999999);
        System.out.println("What is your login(usually LastName+StudentID)?");
        String login = scanIn.nextLine();
        double doubleGPA;
        do {
            System.out.println("What is your GPA(0.00-4.00)?");
            String GPA = scanIn.nextLine();
            doubleGPA = Double.parseDouble(GPA);
        } while(doubleGPA < 0.00 || doubleGPA > 4.00);




        System.out.println("Login:" + login);
        System.out.println("ID:" + intStudentID);
        System.out.println("Name:" + lasttname + "; " + firstname);
        System.out.println("GPA:" + doubleGPA);
        System.out.println("Grade:" + intGrade);
    }
}