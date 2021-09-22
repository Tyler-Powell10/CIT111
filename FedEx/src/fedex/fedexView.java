/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedex;

import java.util.Scanner;

/**
 * drives the command line interface for simulating a fedex plane crashing into
 * the ocean
 * @author tylerpowell
 */
public class fedexView {
    
    /**
     * asks user for simulation objects
     * used by controller ot generate simulation
     * config empty member variables
     * 
     * @param config
     * @return config object
     */
    public simConfig prepareSimulationParams (simConfig config) {
     Scanner scan = new Scanner(System.in);
        System.out.println("Welcone to the most horrific fedex crash in history");
        System.out.println("ENter how many crew on each plane?");
        config.setCrewSize(scan.nextInt());
        System.out.println("How many parcels on each plane?");
        config.setParcelCount(scan.nextInt());
        System.out.println("How many planes?");
        config.setPlaneCount(scan.nextInt());
        
        return config;
        
    }
}
