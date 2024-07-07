public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int currentYear;

    public HeartRates(String firstName, String lastName, int birthYear, int currentYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
    }

    public void setFirstName(String userFirstName){
        firstName = userFirstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String userLastName){
        lastName = userLastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setBirthYear(int userBirthYear){
        birthYear = userBirthYear;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setCurrentYear(int userCurrentYear){
        currentYear = userCurrentYear;
    }

    public int getCurrentYear(){
        return currentYear;
    }


    public int calculateAge(int birthYear, int currentYear){
        int age = currentYear - birthYear;

        return age;
    }

    public int calculateMaxHeartRate(int age){
        int maxHeartRate = 220 - age;

        return maxHeartRate;
    }

    public String targetHeartRate(int maxHeartRate){
        int target50 = maxHeartRate * 50/100;
        int target85 = maxHeartRate * 85/100;

        String targetHeartRate = "Target Heart Rate: " + target50 + " - " + target85;

        return targetHeartRate;
    }

}