/*
 * Author Name: Mohit Saini
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.election.jdp;

import java.util.Scanner;

public class VoterImpl {
    /**
     * The function takes in a name and age as input, creates a Voter object, sets the name and age of the Voter object,
     * prints the name, age and age criteria of the Voter object
     *
     * @param args This is the parameter that is passed to the main method.
     */
    public static void main ( String[] args ) {
        //Initialise the Scanner Class
        Scanner input = new Scanner ( System.in );
        String name = input.next ( );
        int age = input.nextInt ( );
        Voter voter = new Voter ( );
        voter.setName ( name );
        voter.setAge ( age );
        System.out.println ( voter.getName ( ) );
        System.out.println ( voter.getAge ( ) );
        System.out.println ( voter.getAgeCriteria ( ) );
        // Close the Scanner.
        input.close ( );
    }
}
