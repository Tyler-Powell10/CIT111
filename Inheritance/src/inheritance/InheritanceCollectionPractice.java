/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author tylerpowell
 */
public class InheritanceCollectionPractice {
   private static LinkedList<Vehicle> vList;
    
    public static void main (String[] args){
        vList = new LinkedList<>();
        generateRandomBalloon(999999999);
        
        
    } // close main
    public static void generateRandomBalloon(int numOf){
       Random rand = new Random();
        for(int i = 0; i < numOf; i++){
       Balloon b = new Balloon();
        double hours = rand.nextDouble();
      //  double hours = rand.nextDouble() * Balloon.;
        System.out.println("Generated rand hours of: " + hours);
        
        b.setNumFlyingHours((int) hours);
        vList.add(b);
        }
        System.out.println("Generate list of size: " + vList.size());
    }
} // close class
