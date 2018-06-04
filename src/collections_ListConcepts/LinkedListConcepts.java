package collections_ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

public static void main(String[] args) {

	LinkedList<String> ll = new LinkedList<String>();
	//add:
	ll.add("collections");
	ll.add("selenium");
	ll.add("UFT");
	ll.add("Jenkins");
	ll.add("maven");
	ll.add("grid");
	
	//print:
	System.out.println("content of linked list: "+ ll);
	
	//add First:
	ll.addFirst("Java");
	
	//add last:
	ll.addLast("Automation");
	System.out.println("content of linked list: "+ ll);
	
	//get:
	System.out.println(ll.get(0));
	
	//set:
	ll.set(0, "javascript");
	System.out.println("content of linked list: "+ ll);
	
	//remove first and last element:
	ll.removeFirst();
	ll.removeLast();
	
	ll.remove();   //removes first element
	System.out.println("content of linked list: "+ ll);
	ll.remove(2);  //removes index from second  index
	System.out.println("content of linked list: "+ ll);
	
	//how to print all values of linkedlist: 
	//1. for loop:
	System.out.println("***using for loop***");
	for(int i = 0; i<ll.size(); i++){
	System.out.println(ll.get(i));
	}
	
	//2. advance for loop(for each):
	System.out.println("***using advance for loop***");
	for(String str:ll){
	System.out.println(str);
	}
	
	//3. iterator:
	System.out.println("***using iterator***");
	Iterator<String> it = ll.iterator();
	while(it.hasNext()){
	String str = it.next();
	System.out.println(str);
	}
	
	//4. while loop:
	System.out.println("***using while loop***");
	int num=0;
	while(ll.size()>num){
	System.out.println(ll.get(num));
	num++;
}
}

}
