/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customprograms;

import java.util.Scanner;

/**
 *
 * @author tylerpowell
 */
public class MaintenanceTracker {

    public static double miles = 0.0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("                  Maintanence Schedule");
        System.out.println("                                                          ");
        System.out.println("*** This Only Applies If You are Completley Up To Date ***");
        System.out.println("                                                          ");
        System.out.println("If You Have Already Completed Maintenance In The Last One or Two Thousand Miles Please Disregard");
        System.out.println("                                                          ");
        System.out.println("Enter Miles on WRX: ");
        System.out.println("__________________________________________________________");
        miles = scan.nextInt();
        System.out.println("__________________________________________________________");
        System.out.println("Estimated Percentage of Total Miles Used: " + calcTotalPercentOfCar());
        System.out.println("__________________________________________________________");

        if (miles >= 3000 && miles <= 5999) {
            System.out.println("Rotate Tires");
            System.out.println("Change Oil and Filter");
            System.out.println("Check All FLuids");
            System.out.println("Check Brakes, Belts, Hoses, and Lights");

        } // end if block

        if (miles >= 6000 && miles <= 8999) {
            displayRoutineCheckup();
        } // end if block

        if (miles >= 9000 && miles <= 11999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Check Battery and Charging System");

        } // end if block

        if (miles >= 12000 && miles <= 14999) {
           displayRoutineCheckup();
            
        } // end if block

        if (miles >= 15000 && miles <= 17999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Brake Lines");
            System.out.println("Replace Cabin Air Filter");
            System.out.println("Get Emission Tune Up");
            System.out.println("Replace Brake Pads, Calipers, and Brake Discs");
            System.out.println("Inspect CLutch");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
        } // end if block 
        if (miles >= 18000 && miles <= 20999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 21000 && miles <= 23999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 24000 && miles <= 26999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Parking Brake");
        } // end if block
        if (miles >= 27000 && miles <= 29999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 30000 && miles <= 32999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate or Replace Tires / Depending on Tread Replace Them");
            System.out.println("Replace Brake Fluid");
            System.out.println("Replace Air Filters");
            System.out.println("Replace Spark Plugs");
            System.out.println("Replace PVC Valve");
            System.out.println("Check ALL Fluids");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");

        } // end if block
        if (miles >= 33000 && miles <= 35999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 36000 && miles <= 38999) {
            System.out.println("Change Oil and Filter");
            
        } // end if block
        if (miles >= 39000 && miles <= 41999) {
           displayRoutineCheckup();
            System.out.println("Rotate Tires");
            System.out.println("Inspect Battery");
        } // end if block
        if (miles >= 42000 && miles <= 44999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 45000 && miles <= 47999) {
            System.out.println("Change Oil and Filter");
            
            System.out.println("Inspect Brake Lines");
            System.out.println("Replace Cabin Air Filter");
            System.out.println("Get Emission Tune Up");
            System.out.println("Replace Brake Pads, Calipers, and Brake Discs");
            System.out.println("Inspect CLutch");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
        } // end if block
        if (miles >= 48000 && miles <= 50999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 51000 && miles <= 53999) {
           displayRoutineCheckup();
            System.out.println("Rotate Tires");
            System.out.println("Inspect Parking Brake");
        } // end if block
        if (miles >= 54000 && miles <= 56999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 57000 && miles <= 59999) {
           displayRoutineCheckup();
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 60000 && miles <= 62999) {

            System.out.println("Change Oil and Filter");
            System.out.println("Rotate or Replace Tires / Depending on Tread Replace Them");
            System.out.println("Replace Brake Fluid");
            System.out.println("Replace Air Filters");
            System.out.println("Replace Spark Plugs");
            System.out.println("Replace PVC Valve");
            System.out.println("Check ALL Fluids");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
            System.out.println("Service Transmission in CVT Models");
            System.out.println("Examine Cam Shaft Belt");
            System.out.println("Inspect All Wheel Bearings");

        } // end if block
        if (miles >= 63000 && miles <= 65999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 66000 && miles <= 68999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 69000 && miles <= 71999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 72000 && miles <= 74999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 75000 && miles <= 77999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Brake Lines");
            System.out.println("Replace Cabin Air Filter");
            System.out.println("Get Emission Tune Up");
            System.out.println("Replace Brake Pads, Calipers, and Brake Discs");
            System.out.println("Inspect CLutch");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
        } // end if block
        if (miles >= 78000 && miles <= 80999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 81000 && miles <= 83999) {
           displayRoutineCheckup();
            
            System.out.println("Inspect Battery");
        } // end if block
        if (miles >= 84000 && miles <= 86999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Parking Brake");
        } // end if block
        if (miles >= 87000 && miles <= 89999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 90000 && miles <= 92999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate or Replace Tires / Depending on Tread Replace Them");
            System.out.println("Replace Brake Fluid");
            System.out.println("Replace Air Filters");
            System.out.println("Replace Spark Plugs");
            System.out.println("Replace PVC Valve");
            System.out.println("Check ALL Fluids");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
        } // end if block
        if (miles >= 93000 && miles <= 95999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 96000 && miles <= 98999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 99000 && miles <= 101999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 102000 && miles <= 104999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 105000 && miles <= 107999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Brake Lines");
            System.out.println("Replace Cabin Air Filter");
            System.out.println("Get Emission Tune Up");
            System.out.println("Replace Brake Pads, Calipers, and Brake Discs");
            System.out.println("Inspect CLutch");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
            System.out.println("Replace All Belts");
        } // end if block
        if (miles >= 108000 && miles <= 110999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 111000 && miles <= 113999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 114000 && miles <= 116999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Parking Brake");
        } // end if block
        if (miles >= 117000 && miles <= 119999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 120000 && miles <= 122999) {

            System.out.println("Change Oil and Filter");
            System.out.println("Rotate or Replace Tires / Depending on Tread Replace Them");
            System.out.println("Replace Brake Fluid");
            System.out.println("Replace Air Filters");
            System.out.println("Replace Spark Plugs");
            System.out.println("Replace PVC Valve");
            System.out.println("Check ALL Fluids");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
            System.out.println("Service Transmission in CVT Models");
            System.out.println("Examine Cam Shaft Belt");
            System.out.println("Inspect All Wheel Bearings");
            System.out.println("Inspect Battery");
        } // end if block
        if (miles >= 123000 && miles <= 125999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 126000 && miles <= 128999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 129000 && miles <= 131999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 132000 && miles <= 134999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 135000 && miles <= 137999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Brake Lines");
            System.out.println("Replace Cabin Air Filter");
            System.out.println("Get Emission Tune Up");
            System.out.println("Replace Brake Pads, Calipers, and Brake Discs");
            System.out.println("Inspect CLutch");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
        } // end if block
        if (miles >= 138000 && miles <= 140999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 141000 && miles <= 143999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 144000 && miles <= 146999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Parking Brake");
        } // end if block
        if (miles >= 147000 && miles <= 149999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 150000 && miles <= 152999) {

            System.out.println("Change Oil and Filter");
            System.out.println("Rotate or Replace Tires / Depending on Tread Replace Them");
            System.out.println("Replace Brake Fluid");
            System.out.println("Replace Air Filters");
            System.out.println("Replace Spark Plugs");
            System.out.println("Replace PVC Valve");
            System.out.println("Check ALL Fluids");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
        } // end if block
        if (miles >= 153000 && miles <= 155999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 156000 && miles <= 158999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 159000 && miles <= 161999) {
           displayRoutineCheckup();
            
            System.out.println("Inspect Battery");
        } // end if block
        if (miles >= 162000 && miles <= 164999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 165000 && miles <= 167999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Brake Lines");
            System.out.println("Replace Cabin Air Filter");
            System.out.println("Get Emission Tune Up");
            System.out.println("Replace Brake Pads, Calipers, and Brake Discs");
            System.out.println("Inspect CLutch");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
        } // end if block
        if (miles >= 168000 && miles <= 170999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 171000 && miles <= 173999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 174000 && miles <= 176999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Parking Brake");
        } // end if block
        if (miles >= 177000 && miles <= 179999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 180000 && miles <= 182999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate or Replace Tires / Depending on Tread Replace Them");
            System.out.println("Replace Brake Fluid");
            System.out.println("Replace Air Filters");
            System.out.println("Replace Spark Plugs");
            System.out.println("Replace PVC Valve");
            System.out.println("Check ALL Fluids");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
            System.out.println("Service Transmission in CVT Models");
            System.out.println("Examine Cam Shaft Belt");
            System.out.println("Inspect All Wheel Bearings");
        } // end if block
        if (miles >= 183000 && miles <= 185999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 186000 && miles <= 188999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 189000 && miles <= 191999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 192000 && miles <= 194999) {
           displayRoutineCheckup();
            
        } // end if block
        if (miles >= 195000 && miles <= 197999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Brake Lines");
            System.out.println("Replace Cabin Air Filter");
            System.out.println("Get Emission Tune Up");
            System.out.println("Replace Brake Pads, Calipers, and Brake Discs");
            System.out.println("Inspect CLutch");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
        } // end if block
        if (miles >= 198000 && miles <= 200999) {
           displayRoutineCheckup();
            System.out.println("Rotate Tires");
            System.out.println("Inspect Battery");
        } // end if block
        if (miles >= 201000 && miles <= 203999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 204000 && miles <= 206999) {
           displayRoutineCheckup();
            System.out.println("Rotate Tires");
            System.out.println("Inspect Parking Brake");
        } // end if block
        if (miles >= 207000 && miles <= 209999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
        } // end if block
        if (miles >= 210000 && miles <= 212999) {
            System.out.println("Change Oil and Filter");
            System.out.println("Rotate Tires");
            System.out.println("Inspect Brake Lines");
            System.out.println("Replace Cabin Air Filter");
            System.out.println("Get Emission Tune Up");
            System.out.println("Replace Brake Pads, Calipers, and Brake Discs");
            System.out.println("Inspect CLutch");
            System.out.println("Inspect Axle Boots and Axle Shaft");
            System.out.println("Look Over Steering");
            System.out.println("Check Suspension");
            System.out.println("Replace All Belts (supposivley, no one ever makes it this far) ");

        } // end if block
        if (miles >= 213000 && miles <= 250000) {
            System.out.println("Congrats If You Have Made It This Far You Have Done an Exeptional Maintenance Job");
            System.out.println("(Or You Are Lying!)");
            System.out.println("...Sell The Car While You Are Ahead....You Do Not Have Much Longer :)");
            System.out.println("....Or Replace The Engine, Get a New WRX, and Start All Over!");
        } // end if block
        if (miles >= 250000) {
            System.out.println("Nice Try, Put In The Real Amount of Miles");
        } // end if block

    } // end main

    public static double calcTotalPercentOfCar() {
        
        double percentage = ((miles / 213000.0) * 100.0);
        System.out.println(percentage);
        return (percentage);
    }//close calcTotalPercentOfCar
    public static void displayRoutineCheckup(){
       displayRoutineCheckup();
        System.out.println("Rotate Tires");
    }
            
} // end class
