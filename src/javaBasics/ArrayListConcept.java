package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) { //ArrayList is a class.
		
		ArrayList ar = new ArrayList(); //It is a Collection. Dynamic array, can add int, String, double, char.
		
		ar.add(100);//index 0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400.54);//3
		ar.add("panda");//4
		ar.add('F');//5
		ar.add(1001);//6
		
		System.out.println(ar.size());
		ar.remove(6);
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		//System.out.println(ar.get(7)); ArrayIndexOutofBoundException
		
		//to print all the values of ArrayList: for loop
		
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //It will accept only integer value
		
		ar1.add(50);
		//ar1.add("tom"); not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>(); //It will accept only integer value
		
		ar2.add("archan");
		//ar1.add(100); not allowed
	}

}
