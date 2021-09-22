/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author tylerpowell
 */
public class MapPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a map object that associates a string type key with a string type value
   
        HashMap<String, String> expedMap = new HashMap<>();
        expedMap.put("Country", "Jamaica");
        expedMap.put("Field", "Cars");
        expedMap.put("Language", "English");
        expedMap.put("Lodging", "Ocho Rios");
        expedMap.put("Risk", "None");
        expedMap.put("Duration", "8 Months");
        
        
       // System.out.println("Map Status: " + expedMap.isEmpty());
       // System.out.println("Value of lodging: " + expedMap.get("Lodging"));
       // System.out.println("Reason: " + expedMap.get("Field"));
       // System.out.println("Is there a k-v pair keys to duration? " + expedMap.containsKey("Duration"));
        printMapContents(expedMap);
        expedMap.put("Country", "Africa");
        System.out.println("____________________");
        printMapContents(expedMap);
        
        
        
    
    } // close main
    
    // code to interfaces not concrete classes
    public static void printMapContents(Map<String, String> mp){
        // step 1 make sure the map isnt empty
        if (!mp.isEmpty()){
        
            Set<String> keySet = mp.keySet();
            // so now we have a set of values: " country " , " duration " ....
            
            // use advanced for loop to iterate over elements
           for(String s: keySet) {
               System.out.print("Key: " + s);
               System.out.print(" | ");
               System.out.println("Value: " + mp.get(s));
               
               
           } // close advanced iterating for loop 
    } // close if statement 
        // step 2 extract all keys as a set (unordered list) 
        // step 3 use the set of keys to look up their associated values for display 
        
        
        
    } // close print map contents
}
