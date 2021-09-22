/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icon;

/**
 * class models 10x10 grid whose cells can be colored or non colored to
 * represent icon/image related to students interest
 *
 * @author tylerpowell
 */
public class Icon {

    // member variable to store an array of booleans
    // practice with single dimension array
    int[][] iconArray;

    //********constructors*********
    // these are called when the object is created
    public Icon() {
        // fill in member variables with appropriate values

        iconArray = null;
        System.out.println("inside constructor not taking input");

    } // end icon

    // create overloaded instructor to create icon objects
    // gives initial to constructor 
    public Icon(int[][] iconArray) {
        System.out.println("Inside contructor taking in array ");
        
        
        
        

    } // end icon int

    //*********Method section******
    public String displayIcon() {
        StringBuilder sb = new StringBuilder();

        sb.append("Data student project feedback");
        sb.append(" \n");
        sb.append("Icon, personality. and art");
        
        return sb.toString();

        // display inputted array values
    } // end disolay icon

    // method that takes in scaling factor used by display icon
    // takes in scale factor interpreted as 1
    // means print only one for each
    // cell turned on in the array by defualt
    // scale factor of 3 for example will create 3x3 block for each cell turned on in the array
    // example 
    // [
    //[000110],
    ///[11001]
    // ]
    // normal scaling would be like this :
    //   @@
    // @@  @
    //
    // scaling factor 3x3 output would be as followed
    //       @@@@@@
    //       @@@@@@
    //       @@@@@@
    // @@@@@@      @@@
    // @@@@@@      @@@
    // @@@@@@      @@@
    public void scaleIcon(int scaleFactor) {

    } // end scale icon

} // end class
