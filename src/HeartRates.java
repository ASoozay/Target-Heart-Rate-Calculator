// Andrew Sousa
// 7/4/24
// CS 145
// Programming Assignment 2
// HeartRates.java

// HeartRates.java is a class that creates an object for PatientPortal.java. It gets/sets the patient's first name, last name, birth year, and current year.
// It also calculates the patient's age, maximum heart rate, and target heart rate

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int currentYear;


    // method: HeartRates (no return type)
    // purpose: constructor for the class
    // parameters:  (1) firstName (String): the patient's first name
    //              (2) lastName (String): the patient's last name
    //              (3) birthYear (int): the patient's birth year
    //              (4) currentYear (int): the current year at time of use
    public HeartRates(String firstName, String lastName, int birthYear, int currentYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
    }


    // method: setFirstName (void)
    // purpose: sets the patient's first name if they want to later change it from the constructor
    // parameters:  (1) userFirstName (String): first name to be set
    public void setFirstName(String userFirstName){
        firstName = userFirstName;
    }


    // method: getFirstName (String)
    // purpose: returns the patient's first name
    // parameters: none
    public String getFirstName(){
        return firstName;
    }


    // method: setLasttName (void)
    // purpose: sets the patient's last name if they want to later change it from the constructor
    // parameters:  (1) userLastName (String): last name to be set
    public void setLastName(String userLastName){
        lastName = userLastName;
    }


    // method: getLastName (String)
    // purpose: returns the patient's last name
    // parameters: none
    public String getLastName(){
        return lastName;
    }


    // method: setBirthYear(void)
    // purpose: sets the patient's birth year if they want to later change it from the constructor
    // parameters:  (1) userBirthYear (int): birth year to be set
    public void setBirthYear(int userBirthYear){
        birthYear = userBirthYear;
    }


    // method: getBirthYear (String)
    // purpose: returns the patient's birth year
    // parameters: none
    public int getBirthYear(){
        return birthYear;
    }

    // method: setCurrentYear(void)
    // purpose: sets the current year if they want to later change it from the constructor
    // parameters:  (1) userCurrentYear (int): current year to be set
    public void setCurrentYear(int userCurrentYear){
        currentYear = userCurrentYear;
    }


    // method: getCurrentYear (String)
    // purpose: returns the current year
    // parameters: none
    public int getCurrentYear(){
        return currentYear;
    }


    // method: calculateAge (int)
    // purpose: calculates the patient's age
    // parameters: none
    public int calculateAge(){
        int age = getCurrentYear() - getBirthYear();

        return age;
    }


    // method: calculateMaxHeartRate (int)
    // purpose: calculates the patient's maximum heart rate
    // parameters: none
    public int calculateMaxHeartRate(){
        int maxHeartRate = 220 - calculateAge();

        return maxHeartRate;
    }


    // method: targetHeartRate (String)
    // purpose: calculates and prints out the patient's target heart rate
    // paramters: none
    public String targetHeartRate(){
        int target50 = calculateMaxHeartRate() * 50/100;
        int target85 = calculateMaxHeartRate() * 85/100;

        String targetHeartRate = "Target Heart Rate: " + target50 + " - " + target85;

        return targetHeartRate;
    }

}