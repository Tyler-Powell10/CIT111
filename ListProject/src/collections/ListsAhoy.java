package collections;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tylerpowell
 */
public class ListsAhoy {

    public static void main(String[] args) {
        useArrays();
        useCollections();
    } // close main

    public static void useArrays() {
        String[] songName = {"Left, Right",
            "Bankroll",
            "1 of 1",
            "No mids",
            "999",
            "Louis Rain",};
        //System.out.println("array implementation: ");
        // display size:
        //System.out.println("size of array: " + songName.length);
        //System.out.println("Third item: " + songName[2]);
        //System.out.println("Last Item " + songName[songName.length - 1]);
        //printArrayContents(songName); 
        // needs input on which string for method call to work, or else it does not know which string it is calling
        // needs to give method a location to print, you are giving it an address 
        //System.out.println("trying to remove part of array");
        //songName[0] = null;
         //printArrayContents(songName);
    } // close use arrays 

    private static void printArrayContents(String[] arr) {
        //print me with a for() loop
       // for (int i = 0; i < arr.length; i++) {
          //  System.out.println(arr[i]);
        //}
    } // close print array contents

    public static void useCollections() {
        LinkedList<String> songName = new LinkedList<>();
        songName.add("Left, Right");
        songName.add("Bankroll");
        songName.add("1 of 1");
        songName.add("No mids");
        songName.add("999");
        songName.add("Louis Rain");
        
        
        System.out.println("Changing the order of songs");
        System.out.println("+++++++++++++++++++++++++++");
        songName.remove("1 of 1");
        songName.push("1 of 1");
        songName.remove("Louis Rain");
        songName.push("Louis Rain");
        songName.remove("Left, Right");
        songName.push("Left, Right");
        songName.remove("999");
        songName.push("999");
        songName.remove("Bankroll");
        songName.push("Bankroll");
        songName.remove("No mids");
        songName.push("No mids");
       
        
        printListContent(songName);
      




//  System.out.println("                         ");
        //System.out.println("*************************");
        //System.out.println("                         ");
        //System.out.println("Collections implementation: ");
        //System.out.println("List length " + songName.size());
        //System.out.println("Third item: " + songName.get(2));
        //System.out.println("Last item " + songName.getLast());
        //printListContent(songName);
        //System.out.println("REMOVING FIRST ITEM");
        //songName.remove();
        //printListContent(songName);
        
       
        
        
        // storing each element as its own object, "train of objects" they all point to eachother, you can go forwards
        // and backwords, there is a first and last, objects know their position compared to eachother. 

    } // close use collections
    private static void printListContent(LinkedList<String> lst){
        // extract "iterator" from the list
       // this means to repeat a process, 
       ListIterator iter = lst.listIterator();
       while(iter.hasNext()){
           System.out.println(iter.next());
           // here we create a boolean, by saying if the linked list does have a next variable, it is true, and it will keep displaying the next one, however
           // when it realizes it doesmt, it stops, and knows its the end of the list. 
           // linked lists know its own contents and order in which the contents reside
           
           
           
       } // end while loop
    }// end print list content
} // close class
