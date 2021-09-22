/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;

/**
 *
 * @author tylerpowell
 */
public class CustomObjectCollection {
    public static double totalTime = 0;
    public static void main (String[] args) {
        
        LinkedList<SongNames> returnedList = creatObjectList();
        if(returnedList != null){
            System.out.println("List size: " + returnedList.size());
            System.out.println("\n");
            SongNames song = returnedList.get(0);
            System.out.println("First Song: " + song.songName);
            System.out.println("Artist: " + song.artist);
            System.out.println("Features: " + song.features);
            System.out.println("Song Length: " + song.length);
            System.out.println("\n");
            recordTime(song);
            
            System.out.println("\n");
            SongNames song1 = returnedList.get(1);
            System.out.println("Second Song: " + song1.songName);
            System.out.println("Artist: " + song1.artist);
            System.out.println("Features: " + song1.features);
            System.out.println("Song Length: " + song1.length);
            System.out.println("\n");
            recordTime(song1);
            
            System.out.println("\n");
            SongNames song2 = returnedList.get(2);
            System.out.println("Third Song: " + song2.songName);
            System.out.println("Artist: " + song2.artist);
            System.out.println("Features: " + song2.features);
            System.out.println("Song Length: " + song2.length);
            System.out.println("\n");
            recordTime(song2);
            
            System.out.println("\n");
            SongNames song3 = returnedList.get(3);
            System.out.println("Fourth Song: " + song3.songName);
            System.out.println("Artist: " + song3.artist);
            System.out.println("Features: " + song3.features);
            System.out.println("Song Length: " + song3.length);
            System.out.println("\n");
            recordTime(song3);
            
            System.out.println("\n");
            SongNames song4 = returnedList.get(4);
            System.out.println("Fifth Song: " + song4.songName);
            System.out.println("Artist: " + song4.artist);
            System.out.println("Features: " + song4.features);
            System.out.println("Song Length: " + song4.length);
            System.out.println("\n");
            recordTime(song4);
            
            System.out.println("\n");
            SongNames song5 = returnedList.get(2);
            System.out.println("Sixth Song: " + song5.songName);
            System.out.println("Artist: " + song5.artist);
            System.out.println("Features: " + song5.features);
            System.out.println("Song Length: " + song5.length);
            System.out.println("\n");
            recordTime(song5);
            
            System.out.println("\n");
            SongNames song6 = returnedList.get(3);
            System.out.println("Seventh Song: " + song6.songName);
            System.out.println("Artist: " + song6.artist);
            System.out.println("Features: " + song6.features);
            System.out.println("Song Length: " + song6.length);
            recordTime(song6);
            
            
        } // close if statement
        
    } //  close main method
    
    public static LinkedList<SongNames> creatObjectList(){
   
        LinkedList<SongNames> lst = new LinkedList<>();
        SongNames song = new SongNames();
        song.songName = "London Tipton";
        song.artist = "Juice Wrld";
        song.features = "None";
        song.length = 2.43;
       
        lst.add(song);
        
        SongNames song1 = new SongNames();
        song1.songName = "Louis Rain";
        song1.artist = "K Camp";
        song1.features = "None";
        song1.length = 3.07;
       
        lst.add(song1);
        
        SongNames song2 = new SongNames();
        song2.songName = "No Mids";
        song2.artist = "Berner";
        song2.features = "G-Mainley";
        song2.length = 3.02;
       
        lst.add(song2);
        
        SongNames song3 = new SongNames();
        song3.songName = "1 of 1";
        song3.artist = "Key Glock";
        song3.features = "None";
        song3.length = 2.58;
       
        lst.add(song3);
        
        SongNames song4 = new SongNames();
        song4.songName = "Bankroll";
        song4.artist = "Lil Mosey";
        song4.features = "AJ Tracey";
        song4.length = 2.45;
       
        lst.add(song4);
        
        SongNames song5 = new SongNames();
        song5.songName = "Left, Right";
        song5.artist = "Lil Tecca";
        song5.features = "None";
        song5.length = 2.34;
       
        lst.add(song5);
        
        SongNames song6 = new SongNames();
        song6.songName = "Promises";
        song6.artist = "Wiz Khalifa";
        song6.features = "None";
        song6.length = 3.30;
       
        lst.add(song6);
        
          return lst;
        
        
    } // close create object list

public static void recordTime(SongNames time){
//count the total time youd spend listening to the songs, keep a counter going of total time spent listening.    
    totalTime = totalTime + time.length;
    System.out.println("Total time: " + totalTime);
} // close record time
    
} // close class
