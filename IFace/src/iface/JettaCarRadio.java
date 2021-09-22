/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iface;

/**
 *
 * @author tylerpowell
 */
public class JettaCarRadio implements IFACE_CarRadio {
 private double frequency;
        private boolean powerOn;
        private double[] presets;
  
        /**
         * 
        //constructor - special method called automatically by the JVM when
        //clients create an instance of this class
         */
        // 
        
        public JettaCarRadio(){
            System.out.println("INSIDE CONTRUCTOR, CONSTRUCTING");
            // setup tasks like create objects for number var
            presets = new double [5];
            System.out.println("is constructing");
            
        } // close constructor
        
   
    public boolean isPowerON(){
      
        return powerOn;
          
    } //close class is power on 
    
    
 @Override
    public void setTunerFrequency(double f) {
        
        
        if ( f > 108 || f < 88) {
            System.out.println("BOOM");
        } else {
            frequency = f;
        } // close if else
        
        
        
        
    } // close set tuner frequency
    
 @Override
    public void setDevicePower (boolean powerStatus) {
        powerOn = powerStatus;
        
        if (powerStatus) {
            System.out.println("Power ON");
        } else {
            System.out.println("Power OFF");
        } // close if else
        
        
    } // close setDevicePOwer
    
    
 
    
 @Override
    public void setTunerPreset(double freq , int preset) {
       // adjust preset to be retro indexed
            int idx = preset - 1;
            presets[idx] = freq;
       
        
    } // close set tuner preset
  
 @Override
     public void visitTunerPreset(int preset) {
        int idx = preset - 1;
         frequency = presets[idx];
         
         
     } // close visit tuner preset
     
 @Override
     public double displayCurrentTunerFreq() {
         System.out.println("Frequency is: " + frequency);
         
         return frequency;
     } //close class display current tuner freq
    
     public String pairBluetoothDevice(String mac){
         System.out.println("Pairing....");
         System.out.println("Paired to: " + mac);
         return "paired";
         
         
     } // close bluetooth class
     
} // close class iface
