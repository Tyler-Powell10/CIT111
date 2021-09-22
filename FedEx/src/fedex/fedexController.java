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
 * controller object for crash simulatory using the 
 * mvc esign pattern
 * @author tylerpowell
 */
public class fedexController {
    // links to model
    private static fedexPlaneModel model;
    //links to view
    private static fedexView view;
    public static void main(String[] args) {
        // instantiate both model objects and any
        // neccecary view onjects
        model = new fedexPlaneModel();
        view = new fedexView();
        // run sim
        simConfig config = initSimulation();
        
        
    } // end main
    
    /**
     * creates config paramater
     * sends to view
     * and returns caller for next steps
     * @return 
     */
    
    private static simConfig initSimulation(){
        
        simConfig config = view.prepareSimulationParams(new simConfig());
        if(config.getCrewSize() < 1){
            config.setCrewSize(10);
        }
        if (config.getPlaneCount() < 1){
            config.setPlaneCount(1000);
        }
        if (config.getParcelCount() < 1 ){
            config.setParcelCount(5);
        }
        return config;
    }
    
    private static simConfig runSim(simConfig config){
        // based on inputted params ask model for objects 
        List<cargoPlane> planeList = new ArrayList<>();
        for(int i = 0; i < config.getPlaneCount(); i++){
            // each plane in this sim has the same number of crew and parcels 
            planeList.add(model.generatecargoPlane(config.getCrewSize(), config.getParcelCount()));
            
        }
        // itterate over plane list again this time setting flags for 
        
        Random r - new Random();
        private List<crewMembers> simulateCrewSurvival(List<crewMember> crewList){
            for(crewMember cr: crewList){
                if(cr.getAge() > 50){
                    cr.getAge();
                }
            }
        return crewList;
    }
private static List<parcel> simulateParcelRecovery (List<parcel> plist){
    for (parcel p: pList){
        double parcelDensity = p.getWeightG() / p.getSizeCubicInches();
        if(parcelDensity > fedexPlaneModel.MAX_PACK_WEIGHT_G_INCH3){
            p.setRecovered(false);
        } else {
            p.setRecovered(true);
        }
    }
}
}
