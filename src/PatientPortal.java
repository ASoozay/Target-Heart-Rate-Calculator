// Andrew Sousa
// 7/4/24
// CS 145
// Programming Assignment 2: Target Heart Rate Calculator
// PatientPortal.java

// PatientPortal.java is a heart rate calculating program. The user enters some information  (first name, last name, year of birth), and the program prints out their info, as well as their target heart rate based on their age.

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class PatientPortal {
    public static final int currentYear = 2024;
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        HeartRates patientHeartRate = new HeartRates("First Name", "Last Name", 0, currentYear);

        welcome();
        patientInfo(console, patientHeartRate);
        System.out.println();
        printPatientInfo(patientHeartRate);

       
    }

    
    // method: welcome (void)
    // purpose: prints out the welcome message for the patient.
    // parameters: none
    public static void welcome(){
        System.out.println("Welcome to the Patient Heart Portal!");
        System.out.println("Enter some information below, and get all the info on your heart.");
        System.out.println("Disclaimer: The Patient Heart Portal is not medically licensed and should be taken as medical advice. Don't sue us!");
    }


    public static void patientInfo(Scanner console, HeartRates phr){
        System.out.println("Please provide your information below");
        System.out.println();

        System.out.print("First Name: ");
        phr.setFirstName(console.nextLine());
        System.out.print("Last Name: ");
        phr.setLastName(console.nextLine());
        System.out.print("Birth Year: ");
        phr.setBirthYear(console.nextInt());
        console.nextLine();
    }

    public static void printPatientInfo(HeartRates phr){
        System.out.println("Patient Information");
        System.out.println();

        System.out.println("First Name: " + phr.getFirstName());
        System.out.println("Last Name: " + phr.getLastName());
        System.out.println("Age: " + phr.calculateAge());
        System.out.println("Target Heart Rate: " + phr.targetHeartRate());

    }
    
}