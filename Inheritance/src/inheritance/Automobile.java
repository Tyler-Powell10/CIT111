/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * subclass in b=vehicles
 *
 * @author tylerpowell
 */
public class Automobile extends Vehicle {

    public double engineSize;
    public int numWheels;

    private int wheelAngle = 0;

    public int turnWheel(int degrees) {
        wheelAngle = wheelAngle + degrees;
        return wheelAngle;

    } // close turn wheel 

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Automobile Status: " + vehOn + "\n");
        sb.append("current speed is: " + speed + "\n");
        return sb.toString();

    } // close to string
} // close Automobile
