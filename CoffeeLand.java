7/*
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
public class CoffeeLand {

    
    
    

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("              ***Welcome to the Coffee Machine***");
        System.out.println("         please make selections create your own coffee");
        System.out.println("    __________________________________________________________");
        System.out.println("    type in one at a time the ingredient you would like to add");
        System.out.println("           press 9 to brew when you are completed, enjoy");
        System.out.println("__________________________________________________________________");
        CoffeeMachine ingredients = new CoffeeMachine();
        ingredients.ingredientList();
        System.out.println("__________________________________________________________________");
        // user input
        CoffeeMachine userInput = new CoffeeMachine();
        Scanner scan = new Scanner(System.in);
        

        double price = 0;
        boolean end = true;           // loops statements, and choices. 
        while (end) {
            int choice = scan.nextInt();  // calls next int

            if (choice == 1) {
                System.out.println("Thank you, you have selected: coffee");
                System.out.println("____________________________________");

                price += 2.00;
                System.out.println("Price is " + price + "$");

            } else if (choice == 2) {
                System.out.println("Thank you, you have selected: espresso");
                System.out.println("______________________________________");

                price += 1.00;
                System.out.println("Price is: " + price + "$");

            } // end if
            else if (choice == 3) {
                System.out.println("Thank you, you have selected: milk");
                System.out.println("__________________________________");

                price += .50;
                System.out.println("Price is: " + price + "$");

            } // end if
            else if (choice == 4) {
                System.out.println("Thank you, you have selected: cream");
                System.out.println("___________________________________");

                price += .50;
                System.out.println("Price is: " + price + "$");
            } // end if
            else if (choice == 5) {
                System.out.println("Thank you, you have selected: chocolate syrup");
                System.out.println("_____________________________________________");

                price += .25;
                System.out.println("Price is: " + price + "$");
            } // end if
            else if (choice == 6) {
                System.out.println("Thank you, you have selected: caramel syrup");
                System.out.println("___________________________________________");

                price += .25;
                System.out.println("Price is: " + price + "$");
            } // end if
            else if (choice == 7) {
                System.out.println("Thank you, you have selected: vanilla syrup");
                System.out.println("___________________________________________");

                price += .25;
                System.out.println("Price is: " + price + "$");
            } // end if
            else if (choice == 8) {
                System.out.println("Thank you, you have selected: sugar");
                System.out.println("___________________________________");

                price += .25;
                System.out.println("Price is: " + price + "$");
            } else if (choice == 9 && price != 0) {
                System.out.println("Brewing, total price is: " + price + "$");
                end = false;
                
                // ends program = brew
            }
        }
    }
}

// end if block
// get next ingredient
// create new int add it to next
//        int choice2 = scan.nextInt();
//
//        if (choice2 == 1) {
//            System.out.println("Thank you, you have selected: coffee");
//            System.out.println("____________________________________");
//        }
//        if (choice2 == 1) {
//            price2 = 2.00;
//
//            double totalPrice = (price + price2);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice2 == 2) {
//            System.out.println("Thank you, you have selected: espresso");
//            System.out.println("______________________________________");
//
//            if (choice2 == 2) {
//
//                price2 = 1.00;
//
//                double totalPrice = (price + price2);
//                System.out.println("Total price is: " + totalPrice + "$");
//
//            } // end if
//
//        } // end if
//        if (choice2 == 3) {
//            System.out.println("Thank you, you have selected: milk");
//            System.out.println("__________________________________");
//            price2 = .50;
//            double totalPrice = (price + price2);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice2 == 4) {
//            System.out.println("Thank you, you have selected: cream");
//            System.out.println("___________________________________");
//            price2 = .50;
//            double totalPrice = (price + price2);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice2 == 5) {
//            System.out.println("Thank you, you have selected: chocolate syrup");
//            System.out.println("_____________________________________________");
//           price2 = .25;
//           double totalPrice = (price + price2);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice2 == 6) {
//            System.out.println("Thank you, you have selected: caramel syrup");
//            System.out.println("___________________________________________");
//            price2 = .25;
//           double totalPrice = (price + price2);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice2 == 7) {
//            System.out.println("Thank you, you have selected: vanilla syrup");
//            System.out.println("___________________________________________");
//            price2 = .25;
//           double totalPrice = (price + price2);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice2 == 8) {
//            System.out.println("Thank you, you have selected: sugar");
//            System.out.println("___________________________________");
//            price2 = .25;
//           double totalPrice = (price + price2);
//            System.out.println("Total price is: " + totalPrice + "$");
//        }
//          
//        if (choice2 == 9) {
//            double end2 = (totalPrice);
//                System.out.println("Brewing, total price is " + end2 + "$");
//        } // end if block
//
//         // end if block
//
//        int choice3 = scan.nextInt();
//
//        if (choice3 == 1) {
//            System.out.println("Thank you, you have selected: coffee");
//            System.out.println("_____________________________________");
//            price3 = 2;
//            double totalPrice = (price + price2 + price3 );
//            System.out.println("Total price is: " + totalPrice + "$");
//            
//        } // end if
//        if (choice3 == 2) {
//            System.out.println("Thank you, you have selected: espresso");
//            System.out.println("______________________________________");
//            price3 = 1;
//            double totalPrice = (price + price2 + price3);
//            System.out.println("Total price is: " + totalPrice + "$");
//           
//
//        } // end if
//        if (choice3 == 3) {
//            System.out.println("Thank you, you have selected: milk");
//            System.out.println("__________________________________");
//            price3 = .5;
//            double totalPrice = (price + price2 + price3);
//            System.out.println("Total price is: " + totalPrice + "$");
//            
//            
//        } // end if
//        if (choice3 == 4) {
//            System.out.println("Thank you, you have selected: cream");
//            System.out.println("___________________________________");
//            price3 = .5;
//            double totalPrice = (price + price2 + price3);
//            System.out.println("Total price is: " + totalPrice + "$");
//            
//        } // end if
//        if (choice3 == 5) {
//            System.out.println("Thank you, you have selected: chocolate syrup");
//            System.out.println("_____________________________________________");
//            price3 = .25;
//            double totalPrice = (price + price2 + price3);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice3 == 6) {
//            System.out.println("Thank you, you have selected: caramel syrup");
//            System.out.println("___________________________________________");
//            price3 = .25;
//            double totalPrice = (price + price2 + price3);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice3 == 7) {
//            System.out.println("Thank you, you have selected: vanilla syrup");
//            System.out.println("___________________________________________");
//            price3 = .25;
//            double totalPrice = (price + price2 + price3);
//            System.out.println("Total price is: " + totalPrice + "$");
//            
//        } // end if
//        if (choice3 == 8) {
//            System.out.println("Thank you, you have selected: sugar");
//            System.out.println("___________________________________");
//            price3 = .25;
//            double totalPrice = (price + price2 + price3);
//            System.out.println("Total price is: " + totalPrice + "$");
//        }
//             if (choice3 == 9) {
//                 
//          
//               System.out.println("Brewing, total price is:" + totalPrice + "$");
//             System.exit(0);
//             }
//            
//             
//            
//            
//
//         // end if block
//
//        int choice4 = scan.nextInt();
//
//        if (choice4 == 1) {
//            System.out.println("Thank you, you have selected: coffee");
//            System.out.println("_____________________________________");
//            price4 = 2;
//            double totalPrice = ( price + price2 + price3 + price4);
//            System.out.println("Total price is: " + totalPrice + "$");
//            
//        } // end if
//        if (choice4 == 2) {
//            System.out.println("Thank you, you have selected: espresso");
//            System.out.println("______________________________________");
//            price4 = 1;
//            double totalPrice = ( price + price2 + price3 + price4);
//            System.out.println("Total price is: " + totalPrice + "$");
//            
//
//        } // end if
//        if (choice4 == 3) {
//            System.out.println("Thank you, you have selected: milk");
//            System.out.println("__________________________________");
//            price4 = .5;
//            double totalPrice = ( price + price2 + price3 + price4);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice4 == 4) {
//            System.out.println("Thank you, you have selected: cream");
//            System.out.println("___________________________________");
//            price4 = .5;
//            double totalPrice = ( price + price2 + price3 + price4);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice4 == 5) {
//            System.out.println("Thank you, you have selected: chocolate syrup");
//            System.out.println("_____________________________________________");
//            price4 = .25;
//            double totalPrice = ( price + price2 + price3 + price4);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice4 == 6) {
//            System.out.println("Thank you, you have selected: caramel syrup");
//            System.out.println("___________________________________________");
//            price4 = .25;
//            double totalPrice = ( price + price2 + price3 + price4);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice4 == 7) {
//            System.out.println("Thank you, you have selected: vanilla syrup");
//            System.out.println("___________________________________________");
//            price4 = .25;
//            double totalPrice = ( price + price2 + price3 + price4);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice4 == 8) {
//            System.out.println("Thank you, you have selected: sugar");
//            System.out.println("___________________________________");
//            price4 = .25;
//            double totalPrice = ( price + price2 + price3 + price4);
//            System.out.println("Total price is: " + totalPrice + "$");
//        }
//            if (choice4 == 9) {
//                 double end4 = (totalPrice);
//                 System.out.println("Brewing, total price is " + end4 + "$");
//             }
//            
//            
//
//         // end if block
//        int choice5 = scan.nextInt();
//
//        if (choice5 == 1) {
//            System.out.println("Thank you, you have selected: coffee");
//            System.out.println("_____________________________________");
//            price5 = 2;
//            double totalPrice = (price + price2 + price3 + price4 + price5);
//             System.out.println("Total price is: " + totalPrice + "$");   
//        } // end if
//        if (choice5 == 2) {
//            System.out.println("Thank you, you have selected: espresso");
//            System.out.println("______________________________________");
//            price5 = 1;
//            double totalPrice = (price + price2 + price3 + price4 + price5);
//             System.out.println("Total price is: " + totalPrice + "$"); 
//
//        } // end if
//        if (choice5 == 3) {
//            System.out.println("Thank you, you have selected: milk");
//            System.out.println("__________________________________");
//            price5 = .5;
//            double totalPrice = (price + price2 + price3 + price4 + price5);
//             System.out.println("Total price is: " + totalPrice + "$"); 
//        } // end if
//        if (choice5 == 4) {
//            System.out.println("Thank you, you have selected: cream");
//            System.out.println("___________________________________");
//            price5 = .5;
//            double totalPrice = (price + price2 + price3 + price4 + price5);
//             System.out.println("Total price is: " + totalPrice + "$"); 
//        } // end if
//        if (choice5 == 5) {
//            System.out.println("Thank you, you have selected: chocolate syrup");
//            System.out.println("_____________________________________________");
//            price5 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5);
//             System.out.println("Total price is: " + totalPrice + "$"); 
//        } // end if
//        if (choice5 == 6) {
//            System.out.println("Thank you, you have selected: caramel syrup");
//            System.out.println("___________________________________________");
//            price5 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5);
//             System.out.println("Total price is: " + totalPrice + "$"); 
//        } // end if
//        if (choice5 == 7) {
//            System.out.println("Thank you, you have selected: vanilla syrup");
//            System.out.println("___________________________________________");
//            price5 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5);
//             System.out.println("Total price is: " + totalPrice + "$"); 
//        } // end if
//        if (choice5 == 8) {
//            System.out.println("Thank you, you have selected: sugar");
//            System.out.println("___________________________________");
//            price5 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5);
//             System.out.println("Total price is: " + totalPrice + "$"); 
//             
//        }if (choice5 == 9) {
//             
//           double end5 = (totalPrice);
//                 System.out.println("Brewing, total price is " + end5 + "$");
//             }
//
//        // end if block
//        int choice6 = scan.nextInt();
//
//        if (choice6 == 1) {
//            System.out.println("Thank you, you have selected: coffee");
//            System.out.println("_____________________________________");
//            price6 = 2;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6);
//            System.out.println("Total price is: " + totalPrice + "$");
//            
//        } // end if
//        if (choice6 == 2) {
//            System.out.println("Thank you, you have selected: espresso");
//            System.out.println("______________________________________");
//            price6 = 1;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6);
//            System.out.println("Total price is: " + totalPrice + "$");
//            
//
//        } // end if
//        if (choice6 == 3) {
//            System.out.println("Thank you, you have selected: milk");
//            System.out.println("__________________________________");
//            price6 = .50;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice6 == 4) {
//            System.out.println("Thank you, you have selected: cream");
//            System.out.println("___________________________________");
//            price6 = .50;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice6 == 5) {
//            System.out.println("Thank you, you have selected: chocolate syrup");
//            System.out.println("_____________________________________________");
//            price6 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6);
//            System.out.println("Total price is: " + totalPrice + "$");
//                    
//        } // end if
//        if (choice6 == 6) {
//            System.out.println("Thank you, you have selected: caramel syrup");
//            System.out.println("___________________________________________");
//            price6 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice6 == 7) {
//            System.out.println("Thank you, you have selected: vanilla syrup");
//            System.out.println("___________________________________________");
//            price6 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice6 == 8) {
//            System.out.println("Thank you, you have selected: sugar");
//            System.out.println("___________________________________");
//            price6 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6);
//            System.out.println("Total price is: " + totalPrice + "$");
//        }
//            if (choice6 == 9) {
//                 
//           double end6 = (totalPrice);
//                 System.out.println("Brewing, total price is " + end6 + "$");
//             }
//            
//
//        int choice7 = scan.nextInt();
//
//        if (choice7 == 1) {
//            System.out.println("Thank you, you have selected: coffee");
//            System.out.println("_____________________________________");
//            price7 = 2;
//            double totalPrice = (price = price2 + price3 + price4 + price5 + price6 + price7);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice7 == 2) {
//            System.out.println("Thank you, you have selected: espresso");
//            System.out.println("______________________________________");
//            price7 = 1;
//            double totalPrice = (price = price2 + price3 + price4 + price5 + price6 + price7);
//            System.out.println("Total price is: " + totalPrice + "$");
//            
//
//        } // end if
//        if (choice7 == 3) {
//            System.out.println("Thank you, you have selected: milk");
//            System.out.println("__________________________________");
//            price7 = .50;
//            double totalPrice = (price = price2 + price3 + price4 + price5 + price6 + price7);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice7 == 4) {
//            System.out.println("Thank you, you have selected: cream");
//            System.out.println("___________________________________");
//            price7 = .50;
//            double totalPrice = (price = price2 + price3 + price4 + price5 + price6 + price7);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice7 == 5) {
//            System.out.println("Thank you, you have selected: chocolate syrup");
//            System.out.println("_____________________________________________");
//            price7 = .25;
//            double totalPrice = (price = price2 + price3 + price4 + price5 + price6 + price7);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice7 == 6) {
//            System.out.println("Thank you, you have selected: caramel syrup");
//            System.out.println("___________________________________________");
//            price7 = .25;
//            double totalPrice = (price = price2 + price3 + price4 + price5 + price6 + price7);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice7 == 7) {
//            System.out.println("Thank you, you have selected: vanilla syrup");
//            System.out.println("___________________________________________");
//            price7 = .25;
//            double totalPrice = (price = price2 + price3 + price4 + price5 + price6 + price7);
//            System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice7 == 8) {
//            System.out.println("Thank you, you have selected: sugar");
//            System.out.println("___________________________________");
//            price7 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6 + price7);
//            System.out.println("Total price is: " + totalPrice + "$");
//        }
//           if (choice7 == 9) {
//             
//             double end7 = (totalPrice);
//                 System.out.println("Brewing, total price is: " + end7 + "$");
//            
//             }
//
//        int choice8 = scan.nextInt();
//
//        if (choice8 == 1) {
//            System.out.println("Thank you, you have selected: coffee");
//            System.out.println("_____________________________________");
//            price8 = 2;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6 + price7 + price8);
//             System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice8 == 2) {
//            System.out.println("Thank you, you have selected: espresso");
//            System.out.println("______________________________________");
//            price8 = 1;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6 + price7 + price8);
//             System.out.println("Total price is: " + totalPrice + "$");
//        
//        } // end if
//        if (choice8 == 3) {
//            System.out.println("Thank you, you have selected: milk");
//            System.out.println("__________________________________");
//            price8 = .50;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6 + price7 + price8);
//             System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice8 == 4) {
//            System.out.println("Thank you, you have selected: cream");
//            System.out.println("___________________________________");
//            price8 = .50;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6 + price7 + price8);
//             System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice8 == 5) {
//            System.out.println("Thank you, you have selected: chocolate syrup");
//            System.out.println("_____________________________________________");
//            price8 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6 + price7 + price8);
//             System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice8 == 6) {
//            System.out.println("Thank you, you have selected: caramel syrup");
//            System.out.println("___________________________________________");
//            price8 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6 + price7 + price8);
//             System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice8 == 7) {
//            System.out.println("Thank you, you have selected: vanilla syrup");
//            System.out.println("___________________________________________");
//            price8 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6 + price7 + price8);
//             System.out.println("Total price is: " + totalPrice + "$");
//        } // end if
//        if (choice8 == 8) {
//            System.out.println("Thank you, you have selected: sugar");
//            System.out.println("___________________________________");
//            price8 = .25;
//            double totalPrice = (price + price2 + price3 + price4 + price5 + price6 + price7 + price8);
//             System.out.println("Total price is: " + totalPrice + "$");
//        }
//             if (choice8 == 9) {
//             
//            
//                 System.out.println("Brewing, total price is:" + totalPrice + "$");
//             System.exit(0);
//                 
//            
//             }
//
//
//    } // end main
//    
//
//} // end class
//
