package com.anna.msc;

import java.util.*;
public class Map_Interface {
    public static void main(String args[])
    {
        
        Map<Integer, String> Hashmap1 = new HashMap<>();
  
        //Creating a Hashmap
        Map<Integer, String> Hashmap2
            = new HashMap<Integer, String>();
  
        // Adding the Elements
        Hashmap1.put(1, "Pink");
        Hashmap1.put(2, "Blue");
        Hashmap1.put(3, "Orange");
        Hashmap1.put(4, "Red");
        Hashmap1.put(5, "White");
        Hashmap1.put(6, "Black");
        Hashmap1.put(7, "Cyan");
        
        System.out.println("Initial Map After Adding the elements" + Hashmap1);
        
        //Changing the element
        Hashmap1.put(2, "Green");
  
        System.out.println("\nUpdated Map After Changing the element " + Hashmap1);
        
        //Removing a element
        Hashmap1.remove(4);
        
        System.out.println("\nUpdated Map After Removing the element " + Hashmap1);
        
        //Iterating through map
        for (Map.Entry mapElement : Hashmap1.entrySet()) {
            int key
                = (int)mapElement.getKey();
  
            // Finding the value
            String value
                = (String)mapElement.getValue();
  
            System.out.println(key + " : "
                               + value);
    }
}
}