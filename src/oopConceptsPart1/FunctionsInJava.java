package oopConceptsPart1;

public class FunctionsInJava {

	//main method - Starting point of execution
	//main method is void, because it never returns a value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsInJava obj = new FunctionsInJava();
		// one object is created and obj is the reference variable, referring to this object
		//after creating an object, the copy of all 'non-static' methods as well as non-static variables 
		//will be given to this object (Object can not handle static method)
		
		obj.test1();
		
		int m = obj.test2();
		System.out.println(m);
		
		String n = obj.test3();
		System.out.println(n);
		
		int div = obj.division(50, 10);
		System.out.println(div);

	}
	
	//non-static methods
	
	
	// Return type - void - does not return any value
	public void test1(){    // No Input, No Output
		System.out.println("1st method");
	}
	
	//Return type - int - returns int value
	public int test2(){    //No Input, Some Output
		System.out.println("2nd method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	//Return type - String - returns String value
	public String test3(){    //No Input, Some Output
		System.out.println("3rd method");
		String s = "Selenium";
		
		return s;
	}
	
	//Return type - int - returns int value
	//x and y are input parameters/arguments
	public int division(int x, int y){
		System.out.println("division method");
		int d = x/y;
		return d;
	}

}
