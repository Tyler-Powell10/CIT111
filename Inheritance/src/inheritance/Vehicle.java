/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * Super class
 * @author tylerpowell
 */
public class Vehicle {
    public double speed; 
    public double length;
    public double width;
    boolean vehOn;
    
    public void start(){
        System.out.println("Vehicle started");
        vehOn = true;
    } // close starts
    
    public void stop(){
        System.out.println("Vehicle stopped");
        vehOn = false;
    } // clpse stops
    
    public String toString(){ 
        StringBuilder sb = new StringBuilder();
        
        sb.append("Vehicle Status: " + vehOn + "\n");
        sb.append("current speed is: " + speed + "\n");
        return sb.toString();
        
    
                } // close to string
} // close class Vehicle
