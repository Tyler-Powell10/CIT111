/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedex;

import java.util.List;

/**
 * composite object representing plane carrying crew and parcels
 * @author tylerpowell
 */
public class cargoPlane {
    private List<parcel> parcels;
    private  List<crewMember> crew;
    private double altitudeStable;

    /**
     * @return the parcels
     */
    public List<parcel> getParcels() {
        return parcels;
    }

    /**
     * @param parcels the parcels to set
     */
    public void setParcels(List<parcel> parcels) {
        this.parcels = parcels;
    }

    /**
     * @return the crew
     */
    public List<crewMember> getCrew() {
        return crew;
    }

    /**
     * @param crew the crew to set
     */
    public void setCrew(List<crewMember> crew) {
        this.crew = crew;
    }

    /**
     * @return the altitudeStable
     */
    public double getAltitudeStable() {
        return altitudeStable;
    }

    /**
     * @param altitudeStable the altitudeStable to set
     */
    public void setAltitudeStable(double altitudeStable) {
        this.altitudeStable = altitudeStable;
    }
    
}
