package collections_ListConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) {
		

		//HashMap is a class, which implements Map Interface
		//HashMap also extends AbstractMap
		//it contains only unique elements
		//stores values in key-value format
		//it may have 1 null key and multiple null values
		//it does not maintain order
		//it is non-synchronized(not Thread safe)----(HashTable is synchronized)
		
		//(if HashMap is used in multi-threading environment more than 1 thread can accept/process HashMap simultaneously.
		//so performance of the HashMap will be increased automatically. So HashMap is used in fast performance system.
		
		/////////***************Interview question*****************///////////
		
		//Fail-fast condition/Concurrent modification exception: Whenever you are calling the particular HashMap object and if any 
		//modification(add/remove object) is happening in between by some other thread. So this exception will occur.
		
		//Suppose there is a HashMap {1=A , 2=B}. Now there are 5 threads t1, t2,..,t5. Suppose t1 is trying to access 1,A object and at the  
		//exact same time t2 is also trying to access same 1,A. So suppose t1 has accessed 1,A and modified it to 1,C. So now value of key 1 is C.
		//Now t2 is trying to access 1, it is expecting A but it will get C because the latest value got updated. So simultaneously you are 
		//getting the updated value.This is the biggest problem with HashMap. This is called Fail Fast condition.
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//store values:
		hm.put(1, "webDriver");
		hm.put(2, "grid");
		hm.put(3, "rc");
		hm.put(4, "ide");
		
		//get values:
		System.out.println(hm.get(1));
		System.out.println(hm.get(8));
		
		//to print all the values of HashMap:
		for(Entry m : hm.entrySet()){
		System.out.println(m.getKey() +" "+ m.getValue());
		}
		
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Ronaldo", 33, "Real Madrid");
		Employee e2 = new Employee("Messi", 30, "Barcelona");
		Employee e3 = new Employee("De Gea", 25, "Manchester United");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e1);
		emp.put(4, e1);
		
		//traverse HashMap:
		for(Entry<Integer, Employee> m: emp.entrySet()){
		int key =m.getKey();
		Employee e = m.getValue();
		System.out.println("Employee " + key + " info");
		System.out.println(e.name + " " + e.age + " " + e.department);
		}


	}

}
