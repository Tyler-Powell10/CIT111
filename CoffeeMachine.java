/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachine;


import java.util.Scanner;

/**
 *
 * @author tylerpowell
 */
public class CoffeeMachine {
          String[] ingredientArray;
          
    public static double price2;
    public static double price3;
    public static double price4;
    public static double price5;
    public static double price6;
    public static double price7;
    public static double price8;

    // lists off ingredients for array and prints out names for user
    public void ingredientList() {

        String[] Ingredient = new String[9];

        Ingredient[0] = " coffee";
        Ingredient[1] = " espresso";
        Ingredient[2] = " milk";
        Ingredient[3] = " cream";
        Ingredient[4] = " chocolate syrup";
        Ingredient[5] = " caramel syrup";
        Ingredient[6] = " vanilla syrup";
        Ingredient[7] = " sugar";
        Ingredient[8] = " Brew";
    
        

        System.out.println("Ingredient 1 = " + Ingredient[0]);
        System.out.println("Ingredient 2 = " + Ingredient[1]);
        System.out.println("Ingredient 3 = " + Ingredient[2]);
        System.out.println("Ingredient 4 = " + Ingredient[3]);
        System.out.println("Ingredient 5 = " + Ingredient[4]);
        System.out.println("Ingredient 6 = " + Ingredient[5]);
        System.out.println("Ingredient 7 = " + Ingredient[6]);
        System.out.println("Ingredient 8 = " + Ingredient[7]);
        System.out.println("Ingredient 9 = " + Ingredient[8]);
         
 
    } // end ingredient list
}
    