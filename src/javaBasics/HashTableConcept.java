package javaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();// It is a class. A collection. Store data in key-value pair.
		
		h.put("A", "Test");
		h.put("B", "Case");
		h.put("C", "Writing");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get("C"));
		System.out.println(h.get(2));
		
		h.put(3, 'Z');
		h.put('d', 45.45);
		
		System.out.println(h.size());
		
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 101);
		//h1.put("a", "bhatt"); not allowed
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(1, "bhatt");
		//h1.put("a", "bhatt"); not allowed
		
		
		
	}

}
