/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingprint;

/**
 *
 * @author tylerpowell
 */
public class PrintLand {

    public static void main(String[] args) {
        ShapePrinter bp = new ShapePrinter();
        bp.printBox(15, 15);
        
        bp.printPyramid(12);
        System.out.println(bp);
    } // end main
   
} // end class
