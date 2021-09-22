/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * generate method for composite business object
 * of cargo plane, outoutted objects have lists of initialized parcel
 * objects and crew member objects 
 * 
 * @author tylerpowell
 */
public class fedexPlaneModel {
    final static double WEIGHT_H20_INCH3 = 18.14369;
    // a cubic package 24" on a side
    final static int MAX_PACK_SIZE_INCH3 = 13824;
    final static int MAX_PACK_WEIGHT_G_INCH3 = 40;
    final static int MAX_CREW_AGE = 80;
    final static int MIN_CREW_AGE = 18;
    
    public cargoPlane generatecargoPlane(int crewSize, int parcelNum){
        // instance of business object
        cargoPlane plane = new cargoPlane();
        // generate a List of crew members per input
        plane.setCrew(generateCrewMembers(crewSize));
        // generate list of parcel per parcel num input 
         plane.setParcels(generateParcelList(crewSize));
        //
        
        
        return plane;
        
    }
    
    private List<crewMember> generateCrewMembers(int crewSize){
        List<crewMember> crewList = new ArrayList<>();
        // fill list with crew member objects of random ages
        for(int c = 0; c < crewSize; c++){
            Random rand = new Random();
            crewMember crew = new crewMember();
            int a = rand.nextInt(MAX_CREW_AGE);
            if(a < MIN_CREW_AGE){          
            crew.setAge(a);
            } else {
            crew.setAge(a + MIN_CREW_AGE);
            } // end if else statement 
            crewList.add(crew);
        } // end for loop for crew members 
        return crewList;
    }
    
    private List<parcel> generateParcelList(int numPar){
        List<parcel> parList = new ArrayList<>();
        // fill list with randomly sized and weighted parcels
        Random rand = new Random();
        
        for(int i = 0; i < numPar; i++){
            parcel p = new parcel();
            p.setSizeCubicInches(rand.nextInt(MAX_PACK_SIZE_INCH3));
            double guass = rand.nextGaussian();
            // mean weight will be weight of H20
            // guass to draw -1 or +1 of the average 
            // lightest will be weight 0
            // and heaviest will be 2x of water
            double weight = WEIGHT_H20_INCH3 + (guass * WEIGHT_H20_INCH3);
            p.setWeightG(weight);
            parList.add(p);
            
        } // close for loop 
            
        return parList;
    }
}
