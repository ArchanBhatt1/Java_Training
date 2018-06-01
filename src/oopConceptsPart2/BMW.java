package oopConceptsPart2;

public class BMW extends Car  { //Has-A Relationship
	
	//Method Over-riding: Whenever 'same method' is present in parent class as well as child class with 'same name' and
	                   //'same number of arguments/data types'
	
	public void start(){ //Over-ridden method(preference will be given to this child class method instead of parent class method
		System.out.println("BMW----start");
	}
	
	public void safety(){
		System.out.println("BMW----safety");
	}

}
