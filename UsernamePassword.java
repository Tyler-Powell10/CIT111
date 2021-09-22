/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module5;

import java.util.Scanner;

/**
 *
 * @author tylerpowell
 */
public class UsernamePassword {

    public static void main(String[] args) {
        // these are the constants well authenticate against
        final String correctusername = "java";
        final String correctpassword = "12345";
        // storage variables for user data
        String Username;
        String Password;

        // create our scanner object
        Scanner userInputScanner = new Scanner(System.in);

        // promt user for username
        System.out.println("Enter your username then hit enter:");
        // read username typed in to keyboard invto variable 
        Username = userInputScanner.next();
        
        if (!Username.equals(correctusername));
        
        

        System.out.println("Enter your password then hit enter: ");
        // use the same scanner to read in entered paassword 
        Password = userInputScanner.next();

        // check if both username and password are correct and match the correct ones
        if (Username.equals(correctusername) && Password.equals(correctpassword)) {
            // success message
            System.out.println("Authentification Succesful!");
        } else {
            // failed message
            System.out.println("Failure to authenticate user");
        } // end if
    } // end main   
} // end class
