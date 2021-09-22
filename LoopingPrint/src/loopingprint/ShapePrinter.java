/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingprint;

/**
 * Blueprint class for basic printing methods
 *
 * @author tylerpowell
 */
public class ShapePrinter {

    public String PRINTCHAR = "&";
    int counter = 0;

    /**
     * Prints to console a square of characters of a inputted side length.
     * example: printBox(3) would result in <br>
     * &&& <br>
     * &&& <br>
     * &&& <br>
     *
     * @param sideLength
     * @param rowLength
     */
    public void printBox(int sideLength, int rowLength) {

        System.out.println("Inside printBox. printing box of sidelength: " + sideLength);

        for (int i = 0; i < sideLength; i++) {

            // use for loop to make a row of size length
            for (int b = 0; b < rowLength; b++) {

                System.out.print(PRINTCHAR);

            } // end baby for loop
            System.out.print("\n");

        } // end for loop 
    } // end printBox()
    
     @Override
            public String toString(){ 
                return "we are the rights to say no";
            }

    /**
     *
     * @param baseSize
     *       
     */
    public void printPyramid(int baseSize) {
 
        System.out.println("Inside printBox. printing triangle of base size: " + baseSize);
        int currentRow = 1; 
        
        for (int i = 0; i < baseSize; i++) {
           
            for (int b = 0; b < currentRow; b++) {
                
                System.out.print(PRINTCHAR);
                PRINTCHAR = PRINTCHAR + "&";
            } // end baby for loop
            System.out.print("\n");

        } // end for loop 
    } // end pyramid 

                
            
} // end class BoxPrinter 
