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
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        HeartRates patientHeartRate = new HeartRates("First Name", "Last Name", 0, currentYear);
        File patientFile = new File("patientInfo.txt");
        PrintStream infoSaver = new PrintStream(patientFile);
        String use = "Yes";

        welcome();

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
        System.out.println();
        System.out.println("Enter some information below, and get all the info on your heart.");
        System.out.println("Disclaimer: The Patient Heart Portal is not medically licensed and should be taken as medical advice. Don't sue us!");
        System.out.println();
    }


    // method: patientInfo (void)
    // purpose: takes patient's info, and sets the values for the HeartRates object
    // parameters:  (1) console (Scanner): scanner that takes in patient's info
    //              (2) phr (HeartRates): HeartRates object that the patient's information is set to
    public static void patientInfo(Scanner console, HeartRates phr){
        System.out.println();
        System.out.println("Please provide your information below");
        System.out.println();

        System.out.print("First Name: ");
        phr.setFirstName(console.nextLine());
        System.out.print("Last Name: ");
        phr.setLastName(console.nextLine());
        System.out.print("Birth Year: ");
        phr.setBirthYear(console.nextInt());
        console.nextLine();
        System.out.println();
    }


    // method: printPatientInfo (void)
    // purpose: prints out the patient's information
    // parameters:  (1) phr (HeartRates): HeartRates object where the patient's information is stored
    public static void printPatientInfo(HeartRates phr){
        System.out.println("Patient Information");
        System.out.println();
        System.out.println("First Name: " + phr.getFirstName());
        System.out.println("Last Name: " + phr.getLastName());
        System.out.println("Age: " + phr.calculateAge());
        System.out.println("Target Heart Rate: " + phr.targetHeartRate());
    }
    

    // method: saveInfo (void)
    // purpose: saves the patient's information by printing to a text file
    // parameters:  (1) saveInfo (PrintStream): the PrintStream object used to print to the patientInfo.txt file
    //              (2) phr (HeartRates): the HeartRates object where the patient's information is stored.
    public static void saveInfo(PrintStream saveInfo, HeartRates phr){
        saveInfo.print("First Name: " + phr.getFirstName() + "  /   ");
        saveInfo.print("Last Name: " + phr.getLastName() +   "  /   ");
        saveInfo.print("Birth Year: " + phr.getBirthYear() + "  /   ");
        saveInfo.print("Maximum Heart Rate: " + phr.calculateMaxHeartRate() + "  /  ");
        saveInfo.print("Target Heart Rate: " + phr.targetHeartRate() + "  /  ");
        saveInfo.println();
    }
    
}