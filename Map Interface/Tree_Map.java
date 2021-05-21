package com.anna.msc;

import java.util.*;
import java.util.Map.Entry;

public class Tree_Map {

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> treemap= new TreeMap<Integer, String>();
		treemap.put(1,"Park");
		treemap.put(2,"Beach");
		treemap.put(3,"Riverside");
		treemap.put(4,"Amusement");
		treemap.put(5,"Lakeside");
		treemap.put(6,"Desert");
		System.out.println("The Initial Treemap treemap is:\n"+treemap+"\n");
        
		treemap.put(4, "Mall");
		System.out.println("After changing value of key '4', treemap is\n " + treemap+"\n");
		
        System.out.println("Size of the map is : "+ treemap.size());
        System.out.println("Hashcode of map is : " + treemap.hashCode());
        System.out.println("Is treemap empty? "+ treemap.isEmpty());
        
        System.out.println("Entries: " + treemap.entrySet());
		System.out.println("Keys: " + treemap.keySet());
		System.out.println("Values: " + treemap.values()+"\n");
		
		System.out.println("The first key of treemap is: "+treemap.firstKey());
		System.out.println("The Last key of treemap is:  "+treemap.lastKey()+"\n");
		
		System.out.println("Getting value for key '3': "+ treemap.get(3));
        System.out.println("Contains key '1'?  " + treemap.containsKey(1));
        System.out.println("Contains value '5'?  "+ treemap.containsValue("Lakeside")+"\n");
        
        System.out.println("The Headmap of key 3 is:  "+treemap.headMap(3));
        System.out.println("The Submap of treemap from keys 1 to 3 is:  "+treemap.subMap(1,3)+"\n");
                               
        System.out.println("The Deleted element '3': "+ treemap.remove(3));
        
        System.out.println("The Final treemap after removing '3' is:");
		for (Entry<Integer, String> e : treemap.entrySet())
            System.out.println(e.getKey() + " - "+ e.getValue());
		
	}

}
