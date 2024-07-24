package com;

// Andrew Soozay
// 7/4/24
// Test.java

//Test.java is a place where the user can test the HeartRates object

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Test {
    
    public static void main(String[] args){
    
        //Test #1
        // crates object with first name, last name, birth year, and current year
        // then prints out patient's info
        HeartRates user = new HeartRates("First", "Name", 2003, 2024);

        System.out.println("First Name" + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Age: " + user.calculateAge());
        System.out.println(user.targetHeartRate());

        System.out.println();
        System.out.println();

        //Test #2
        // creates object with first name, last name, birth year, and current year
        // prints out patient's info
        // then changes the values of the info using the set methods
        // prints out the new patient info
        HeartRates change = new HeartRates("FN1", "LN1", 500, 2000);
        System.out.println("First Name: " + change.getFirstName());
        System.out.println("Last Name: " + change.getLastName());
        System.out.println("Age: " + change.calculateAge());

        change.setFirstName("FN2");
        change.setLastName("LN2");
        change.setBirthYear(1000);
        change.setCurrentYear(3000);
        
        System.out.println();

        System.out.println("First Name: " + change.getFirstName());
        System.out.println("Last Name: " + change.getLastName());
        System.out.println("Birth Year: " + change.calculateAge());

    }

}
