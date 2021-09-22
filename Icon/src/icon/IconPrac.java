/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icon;

import java.util.Arrays;

/**
 *
 * @author tylerpowell
 */
public class IconPrac {

   
    int black = 1;
    int white = 0;
    
    public static void main(String[] args) {

        Icon ic = new Icon();
        ic.displayIcon();
        System.out.println("rc.displayIcon()");
        System.out.println(ic.displayIcon());
        
        int[][] iconArray = new int [10][10];
        //NEED MATRIX
        
        //{{0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        //{1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
        //{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        //{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        //{1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
        //{0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        //{0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        //{0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        //{0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        //{0, 0, 1, 1, 1, 1, 1, 1, 0, 0}};
         //System.out.println(Arrays.toString(iconArray));
    } // end main

} // end class
