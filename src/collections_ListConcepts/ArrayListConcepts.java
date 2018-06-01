package collections_ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts { //Dynamic array - generally in dynamic projects dynamic arrays are used because their size is not fixed so n number
	                            //of new values can be added any time as we are not declaring its size from the starting (like Array).

	public static <E> void main(String[] args) { 
		
		ArrayList ar = new ArrayList();//-------> Non-Generic ArrayList
		
		//Properties of ArrayList:
		//1. Can contain Duplicate values
		//2. Maintains insertion order
		//3. Synchronized
		//4. Allows random access to fetch the element, because it stores the value on the basis of indexes
		
		ar.add(100);//index 0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size()); //size of ArrayList
		
		ar.add(400.54);//3
		ar.add("panda");//4
		ar.add('F');//5
		ar.add(1001);//6
		ar.add(1001);//7 allows duplicate variable
		
		System.out.println(ar.get(6)); //to get value from an index
		
		//to print all the values of ArrayList: 1.for loop and 2.using iterator
		
		//1. for loop(it stores the value on basis of indexes):
		
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		//non-generic vs generic
				
		//Before jdk 1.5 generic were not available.		
		
		//The ArrayList we have defined above is called non-generic ArrayList object. It can store int, String, char, double any data type values.
		//So java is giving warning message(suggestion) in yellow line to reference to generic type should be parameterized		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //-------> Generic ArrayList	for Integer	
		
		ar1.add(555);
		ar1.add(444);
		//ar1.add("archan"); String value will not be allowed
		
		ArrayList<String> ar2 = new ArrayList<String>(); //-------> Generic ArrayList	for String	
		
		ar2.add("archan");
		ar2.add("bhatt");
		//ar2.add(45); int value will not be allowed
		
		ArrayList<E> ar3 = new ArrayList<E>(); // used when you are not sure which type of objects you want to add.
		
		
		
		
		
		//**********Interview question: How to store specific USER DEFINED type object in particular ArrayList?*********
		
		
		//Employee class object
		
		Employee e1 = new Employee("ronaldo", 33, "Real Madrid");
		Employee e2 = new Employee("messi", 30, "Barcelona");
		Employee e3 = new Employee("salah", 25, "Liverpool");
		
		//create arrayList:
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();//we need to define generic to store 3 objects of employee in arrayList
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the value
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()){ //to traverse  while loop will be used, cause iterator does not work on the basis of indexes(for loop)
			Employee emp = it.next();//all e1,e2,e3 will be stored in iterator and when it.next is used it will return 
			                         //first value e1 which is Employee type. so it is stored in employee.
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.department);
			
		}
		
		
		//***************************************
		System.out.println("************");
		
		//addAll() (used to merge to ArrayList
		
		ArrayList<String> ar5 = new ArrayList<String>();
		
		ar5.add("ironman");
		ar5.add("batman");
		ar5.add("spiderman");
		ar5.add("superman");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		
		ar6.add("catwoman");
		ar6.add("wonderwoman");
		ar6.add("bubbles");
		ar6.add("blossom");
		
		ar5.addAll(ar6); //all 4 values of ar6 will be stored inside ar5
		
		for(int i=0; i<ar5.size(); i++){
			System.out.println(ar5.get(i));
		}
		
		System.out.println("************");
		
		
		//removeAll(): To remove values of one ArrayList from another arrayList
		
		ar5.removeAll(ar6);
		for(int i=0; i<ar5.size(); i++){
			System.out.println(ar5.get(i));
		}
		
		
		System.out.println("************");
		
		
		//retainAll(): To retain common values of both ArrayList
		
		ArrayList<String> ar7 = new ArrayList<String>();
		
		ar7.add("ironman");
		ar7.add("batman");
		ar7.add("spiderman");
		ar7.add("superman");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		
		ar8.add("catwoman");
		ar8.add("wonderwoman");
		ar8.add("bubbles");
		ar8.add("ironman");
		
		ar7.retainAll(ar8);
		for(int i=0; i<ar7.size(); i++){
			System.out.println(ar7.get(i));
		}
		

	}

}
