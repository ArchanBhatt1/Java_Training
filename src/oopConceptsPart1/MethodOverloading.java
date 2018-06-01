package oopConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 10);

	}
	
	public static void main(int a){
		
	}
	
	public static void main(int b, int c){
		
	}
	
	//We can overload main method also.
	
	//You can not create a method inside a method.
	//Duplicate methods: same method name with same number of argument/input parameters/data types are not allowed within the same class.
	
	//Method Overloading : When the method name is same, with different input parameters/arguments/ different data types within the same class.
	
	public void sum(){ //0 input parameter
		System.out.println("sum method - zero parameter");
	}
	
	public void sum(int i){ //1 input parameter with int data type
		System.out.println("sum method - one parameter");
		System.out.println(i);
	}
	
	public void sum(double d){  //1 input parameter with double data type
		
	}
	
	public void sum(int j, int k){  //2 input parameters
		System.out.println("sum method - two parameters");
		System.out.println(j+k);
	}

}
