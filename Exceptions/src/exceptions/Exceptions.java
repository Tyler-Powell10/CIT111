/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import static sun.java2d.cmm.ColorTransform.Simulation;

/**
 *
 * @author tylerpowell
 */
public class Exceptions {

    private static List<Vector> vectList;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createVectorModel();
    }

    private static void createVectorModel() {
        int userVal = 0;
        try {
            // this method can throw an input mismatch exception which we catch 
            userVal = gatherUserInput();
            
        } catch (InputMismatchException | simulationException ex) {
            System.out.println("exception caught: " + ex.getClass().getName());
            System.out.println("Wacko answers result in ovveride to 10");
            userVal = 10;
        }
        if (userVal <= 0) {
            System.out.println("cannot simulate anything overide to 10");
            userVal = 10;
        }
        displayVectorList();
    }

    private static void displayVectorList() {
        for (Vector v : vectList) {
            System.out.println("Vector risk: " + v.transmissionRisk);
        }
    }

    private static int gatherUserInput() throws InputMismatchException, simulationException {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Vectors shall i assemble?");
        int numVectors = 0;
        // atleast 1 method may throw an exception which we shall not catch
        // instead we are throwing it to caller 
        // exceptions interupt execution flow
        try {
            numVectors = scan.nextInt();
            // will not be run if exeption occurs below 
          if (numVectors <= 0){
              throw new simulationException();
          }
        } catch (InputMismatchException ex) {
            System.out.println("ehhhhh, i cannot turn this into an int");
        }
        List<Vector> vectList = new ArrayList<>();
        for (int i = 0; i < numVectors; i++) {
            Random r = new Random();
            Vector v = new Vector();
            v.transmissionRisk = r.nextDouble();
            vectList.add(v);
        } // end for loop
        return numVectors;
    }

    static class Vector {

        double transmissionRisk;
    }
}
