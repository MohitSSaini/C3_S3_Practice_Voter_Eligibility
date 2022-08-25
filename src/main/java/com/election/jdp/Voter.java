/*
 * Author Name: Mohit Saini
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.election.jdp;

public class Voter {
    static final int VOTER_ElIGIBLE_AGE = 18;
    private String Name;
    private int Age;
    
    public Voter ( ) {
    }
    
    public void setName ( String name ) {
        this.Name = name;
    }
    
    public void setAge ( int age ) {
        this.Age = age;
    }
    
    public String getName ( ) {
        return Name;
    }
    
    public int getAge ( ) {
        return Age;
    }
}
