package com.anna.msc;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashmap {

	public static void main(String[] args)
	{
		LinkedHashMap<String, String> LHashMap= new LinkedHashMap<String, String>();

		LHashMap.put("A", "Paris");
		LHashMap.put("B", "Japan");
		LHashMap.put("C", "Sweden");
		LHashMap.put("D", "Georgia");
        System.out.println("The Initial LinkedHashMap LHashMap is:\n"+LHashMap+"\n");
        
        LHashMap.replace("C", "Dubai");
		System.out.println("After changing value of key 'C', LHashMap is\n " + LHashMap+"\n");
		
        System.out.println("Size of the map is : "+ LHashMap.size());
        System.out.println("Hashcode of map is : " + LHashMap.hashCode());
        System.out.println("Is LHashMap empty? "+ LHashMap.isEmpty());
        System.out.println("Entries: " + LHashMap.entrySet());
		System.out.println("Keys: " + LHashMap.keySet());
		System.out.println("Values: " + LHashMap.values()+"\n");
		
  
        System.out.println("\nGetting value for key 'A': "+ LHashMap.get("A"));
        System.out.println("\nContains key 'C'?  " + LHashMap.containsKey("C"));
        System.out.println("\nContains value 'Paris'?  "+ LHashMap.containsValue("Paris"));
                                
  
        System.out.println("\nDeleting element 'A': "+ LHashMap.remove("A"));
  
        System.out.println("\nThe Final LHashMap after removing 'A' from the Map:");
		for (Entry<String, String> e : LHashMap.entrySet())
            System.out.println(e.getKey() + " - "+ e.getValue());
   
	}

}
