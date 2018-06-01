package oopConceptsPart1;

public class StaticAndNonStaticConcept {
	
	//global variables: the scope of global variables will be available across all the functions with some conditions
	
	String name = "Panda"; // non-static global variable
	static int age = 23;   //static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static methods and variables are not part of class object, but they are available freely in java memory outside object
		//where as non-static methods and variables are available inside object memory thus can be called using object.
		
		//how to call static methods and variables
		
		//1. Direct calling:
		sum();
		System.out.println(age);
		
		//2. Called by className:
		StaticAndNonStaticConcept.sum();
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non-static methods and variables
		//By using class object
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		
		System.out.println(obj.name);
		
		//Can I access static method using object reference?  --- Yes
		
		obj.sum();  //but warning will be given, so it is not a good practice as we dont need to make and use class object

	}
	
	public void sendMail(){  //non-static method
		System.out.println("send mail");
	}
	
	public static void sum(){  //static method
		System.out.println("sum method");
	}

}
