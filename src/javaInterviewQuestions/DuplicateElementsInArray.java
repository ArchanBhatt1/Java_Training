package javaInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		
		String names[] = {"Java", "C", "C#", "Javascript", "AngularJS", "Java", "Pearl", "AngularJS"};
		
		//1. Compare each element: time complexity is O^(nxn) ------- worst solution
		
		for(int i=0; i<names.length; i++){
			for(int j=i+1; j<names.length; j++){
				
				if(names[i].equalsIgnoreCase(names[j])){
					System.out.println("duplicate element is: "+names[i]);
				}				
			}			
		}
		
		System.out.println("***************");
		
		//2. Using HashSet: (part of java collections) :It only stores unique values ----O(n)
		
		Set<String> store = new HashSet<String>(); //child class hashset object can be refered by parent Set interface
		
		for(String name: names){
			
			if(store.add(name) == false){
				System.out.println("duplicate variable is: "+name);
			}
			
		}
		
		System.out.println("***************");
		
		//3. Using HashMap: O(2n) -- (values will be stored as key-value pair)(we will store - String(Java) as a key and integer as a value)
		                   //Hashmap allows duplicate values
		
		Map<String, Integer> storeMap = new HashMap<String,Integer>();
		
		for(String name: names){
			Integer count = storeMap.get(name);
			
			if(count == null){             //(so when the first time any String comes it returns null as it is coming for the first time
				storeMap.put(name, 1);     //so we will make its value as 1, confirming that it has been stored in Map once
			}
			else{
				storeMap.put(name, ++count);   //If the count value is not null means it is 1 or more so it is duplicate, it has been stored before
				                               //SO simply we will increase its count value.
			}
		}
		
		//now we need to get the values from this hashMap
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet(); //entrySet returns a set of mappings contained in this map.
		
		for(Entry<String, Integer> entry : entrySet){ // so we will iterate over this set using for each loop
			
			if(entry.getValue()>1){    //so we will check whether value(which is integer) is greater than 1 for the duplicate value as stated above.
				System.out.println("the duplicate value is: "+entry.getKey());    //so we will get key(String) paired to it.
			}
		}

	}

}
