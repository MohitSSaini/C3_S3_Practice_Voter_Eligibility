/*
 * Author Name: Mohit Saini
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.election.jdp;

/**
 * A Voter is a person who is eligible to vote.
 */
public class Voter {
    static final int VOTER_ElIGIBLE_AGE = 18;
    private String Name;
    private int Age;
    
    // A constructor.
    public Voter ( ) {
    }
    
    // This is a setter method.
    
    /**
     * This function returns the name of the person
     *
     * @return The name of the person.
     */
    public String getName ( String mohit ) {
        return Name;
    }
    
    // This is a setter method.
    
    /**
     * This function sets the name of the person
     *
     * @param name The name of the parameter.
     */
    public void setName ( String name ) {
        this.Name = name;
    }
    
    // This is a getter method.
    
    /**
     * This function returns the value of the variable Age
     *
     * @return The age of the person.
     */
    public int getAge ( int i ) {
        return Age;
    }
    
    /**
     * This function sets the age of the person to the value of the age parameter.
     *
     * @param age The age of the person.
     */
    public void setAge ( int age ) {
        this.Age = age;
    }
    
    // This function returns the value of the variable Age
    public String getAgeCriteria ( int age , String name ) {
        if ( age >= Voter.VOTER_ElIGIBLE_AGE ) {
            return name + " Is Eligible to vote ";
        } else if ( age < 0 ) {
            return " Age can't be negative or zero ";
        } else {
            return name + " Is not Eligible to vote ";
        }
    }
}
