/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.LinkedList;

/**
 * client class to demo vehicle
 *
 * @author tylerpowell
 */
public class TravelLand {


    

        private static LinkedList<Vehicle> vList;
        
        public static void main(String[] args) {
           // InheritianceCollectionPractice();
           
            Vehicle veh1 = new Vehicle();

            Automobile auto1 = new Automobile();
            // member variables specific to sublass
            auto1.start();
            auto1.engineSize = 1.8;
            auto1.numWheels = 4;
            // member variables coming from the parent class 
            auto1.speed = 45;

            Balloon ba1 = new Balloon();
            ba1.start();
            ba1.burnerOn = true;
            ba1.elevation = 120;
            ba1.length = 6;
            ba1.width = 6;
            ba1.speed = 25;

            System.out.println("Vehicle: " + veh1);
            System.out.println("Automobile: " + auto1);
            System.out.println("Balloon: " + ba1);

            // store references to subclasses typed to parent variable 
            Vehicle b = new Balloon();

            b.length = 4;

            // cannot store references to a subtype in a parent- typed variable
            // i need to type caset the reference back to the subtype to access the subtype methods
            // this checks to if b stores a reference to a balloomn object before type casting
            if (b instanceof Balloon) {

                Balloon revoveredBalloon = (Balloon) b;
            } // end if 
            // this means the compiler 
        } // close main
    } // close inheritance
} // close class
