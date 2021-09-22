/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author tylerpowell
 */
public class Balloon extends Vehicle {

    final static int MAX_HOURS_NA = 13000;
    final static int MAX_SA = 13000;

    final static int randMax = 50000;

  

    
    
    public double elevation;
    public boolean burnerOn;
    private int numFlyingHours;

    // getter for flying hours
    public int getNumFlyingHours() {
        return numFlyingHours;
    } // close flying hours getter

    // setter for flying hours
    public void setNumFlyingHours(int num) {

    } // close setter

    public double ascend(double feet) {
        if (feet < 0) {
            feet = feet * -1;

        } // end if
        elevation = elevation + feet;
        return elevation;
    } // close ascend

    public double descend(double feet) {
        if (feet < 0) {
            feet = feet * -1;

        } // end if

        elevation = elevation - feet;
        return elevation;
    } // close descend 

    @Override
    public String toString() {
        // StringBuilder sb = new StringBuilder();
        String s = super.toString();
        s = s + "I am a balloon with an elevation of: " + elevation;
        return s;

        //sb.append("balloon Status: " + vehOn + "\n");
        // sb.append("current speed is: " + speed + "\n");
        //return sb.toString();
    } // close to string
} // close class Balloon
