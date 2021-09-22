/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedex;

/**
 * models a fedex package
 * @author tylerpowell
 */
public class parcel {
    private int sizeCubicInches;
    private double weightG;
    private boolean recovered;

    /**
     * @return the sizeCubicInches
     */
    public int getSizeCubicInches() {
        return sizeCubicInches;
    }

    /**
     * @param sizeCubicInches the sizeCubicInches to set
     */
    public void setSizeCubicInches(int sizeCubicInches) {
        this.sizeCubicInches = sizeCubicInches;
    }

    /**
     * @return the weightG
     */
    public double getWeightG() {
        return weightG;
    }

    /**
     * @param weightG the weightG to set
     */
    public void setWeightG(double weightG) {
        this.weightG = weightG;
    }

    /**
     * @return the recovered
     */
    public boolean isRecovered() {
        return recovered;
    }

    /**
     * @param recovered the recovered to set
     */
    public void setRecovered(boolean recovered) {
        this.recovered = recovered;
    }
}
