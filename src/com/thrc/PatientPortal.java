package com.thrc;
import java.util.*;

// Andrew Sousa
// 7/4/24
// CS 145
// Programming Assignment 2: Target Heart Rate Calculator
// PatientPortal.java

// PatientPortal.java is a heart rate calculating program. The user enters some information  (first name, last name, year of birth), and the program prints out their info, as well as their target heart rate based on their age.

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


public class PatientPortal {
    public static final int currentYear = 2024;
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        HeartRates patientHeartRate = new HeartRates("First Name", "Last Name", 0, currentYear);
        File patientFile = new File("patientInfo.txt");
        PrintStream infoSaver = new PrintStream(patientFile);
        String use = "Yes";

        welcome();

        // allows user to enter patient info until they type "no".
        while (!use.equalsIgnoreCase("No")){
        patientInfo(console, patientHeartRate);
        System.out.println();
        printPatientInfo(patientHeartRate);
        saveInfo(infoSaver, patientHeartRate);
        System.out.println();
        System.out.println("Would you like to add another patient?");
        System.out.print("Type \"Yes\" to add another patient, or \"No\" to exit: ");
        use = console.nextLine();
        }
    }

    
    // method: welcome (void)
    // purpose: prints out the welcome message for the patient.
    // parameters: none
    public static void welcome(){
        System.out.println("Welcome to the Patient Heart Portal!");
        System.out.println("Enter some information below, and get all the info on your heart.");
        System.out.println("Disclaimer: The Patient Heart Portal is not medically licensed and should be taken as medical advice. Don't sue us!");
    }


    // method: patientInfo (void)
    // purpose: takes in the patient's information, creates a HeartRates object with patient info, and prints out the patient's info and target heart rate
    // parameters:  (1) console (Scanner) : scanner that collects the patient information
    public static void patientInfo(Scanner console){
        System.out.println();
        System.out.println("Please provide your information below");
        System.out.print("First Name: ");
        String firstName = console.nextLine();
        System.out.print("Last Name: ");
        String lastName = console.nextLine();
        System.out.print("Birth Year: ");
        int birthYear = console.nextInt();
        console.nextLine();

        HeartRates userHeartRate = new HeartRates(firstName, lastName, birthYear, currentYear);

        System.out.println();
        printInfo(userHeartRate);
    }


    // method: printInfo (void)
    // purpose: prints out the patient's information
    // parameters:  (1) uhr (HeartRates) : HeartRates object that gets first name, last name, year of birth, and calculates age, max. heart rate, and target heart rate.
    public static void printInfo(HeartRates uhr){
        String firstName = uhr.getFirstName();
        String lastName = uhr.getLastName();
        int birthYear = uhr.getBirthYear();
        
        int age = uhr.calculateAge(birthYear, currentYear);
        int mhr = uhr.calculateMaxHeartRate(age);
        String thr = uhr.targetHeartRate(mhr);

        System.out.println("Patient Information");
        System.out.println("First name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Maximum Heart Rate: " + mhr);
        System.out.println(thr);
    }
}
