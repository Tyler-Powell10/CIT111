/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iface;

/**
 * code to interface 
 * @author tylerpowell
 */
public class TunesLandRobot {
   public static void main(String[] args) {
       IFACE_CarRadio radio = new JettaCarRadio();
       turnOnRadioSetToWYEP(radio);
       
       
       
   } // close main
   
   public static void turnOnRadioSetToWYEP(IFACE_CarRadio radio){
       radio.setDevicePower(true);
       radio.setTunerFrequency(91.3);
       
   } // close set radio station to WYEP
 
} // close tunes land
