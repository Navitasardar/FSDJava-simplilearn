package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapdemo {
	
	
	
public static void main(String[] args) {
			
			 Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		        
			 linkedHashMap.put(1, new String("Mango"));
		        linkedHashMap.put(2, new String("Banana"));
		        linkedHashMap.put(3, new String("Watermelon"));
		        linkedHashMap.put(4, new String("Berry"));
		        linkedHashMap.put(5, new String("Grapes"));
		        linkedHashMap.put(6, new String("Apple"));
		        linkedHashMap.put(7, new String("papaya"));
		        linkedHashMap.put(8, new String("Orange"));
		        linkedHashMap.put(9, new String("Pineapple"));
		        linkedHashMap.put(10, new String("chikoo"));
		        
		        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
		        System.out.println("\nValues of map after iterating over it : ");
		        
		        for (Integer key : linkedHashMap.keySet()) {
		            System.out.println(key + ":\t" + linkedHashMap.get(key));
		        }
		        System.out.println("\nRemove entry for key 4 : " + linkedHashMap.remove(4));
		        System.out.println("\nRemove entry for key 7 : " + linkedHashMap.remove(7));
		        System.out.println("LinkedHashMap contains Banana as fruit? : " + linkedHashMap.containsValue("Banana"));
		        System.out.println("LinkedHashMap contains Apple as fruit? : " + linkedHashMap.containsValue("Apple"));
		        
		        System.out.println("\nLinkedHashMap contains 4 as key? : " + linkedHashMap.containsKey(4));
		        
		        linkedHashMap.hashCode();
		        System.out.println("\nhashcode of LinkedHashMap " +linkedHashMap);
		        linkedHashMap.clear();
		        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
		    }
		

		}


