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
public interface IFACE_CarRadio {
    // you could define constants here
    
    //write method contracts ONLY, no guts
    
    /**
     *  specifies the tuner frequency in megahertz 
     *  if the user attempts to set frequency outside FM band, device shall explode
     * @param freq the frequency to which the tuner should listen 
     * 
     */
    
    public void setTunerFrequency(double freq);  // no guts!
    
    public void setDevicePower(boolean powerStatus);
    
    public void setTunerPreset(double freq, int preset);
    
    public void visitTunerPreset(int preset);
    
    public double displayCurrentTunerFreq();
    
    
    
    
    
} // close public interface IFACE-CarRadio
