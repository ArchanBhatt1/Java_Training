package oopConceptsPart1;

public class Car {
	
	//Class vars;
	String mod;
	int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car a = new Car();  // a------ is object reference variable,// new Car();------right hand side presents Object of Car class 
		                    // Like Human is class, my body is object and archan is reference variable to represent that object
		Car b = new Car();
		Car c = new Car();
		
		//now copy of String mod and int wheel will be given to each of this 3 objects
		
		a.mod = "BMW";
		a.wheel = 4;
		
		b.mod = "Audi";
		b.wheel = 4;
		
		c.mod = "limo";
		c.wheel = 6;
		
		System.out.println("before shifting references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		//suppose we write
		a=b;  //so 'a' wont refer to the object it was referring before and now a will refer object which 'b' is also referring
		b=c;  //so 'b' wont refer to the object it was referring before and now a will refer object which 'c' is also referring
		c=a;  //so 'c' wont refer to the object it was referring before and now a will refer object which 'a' is also referring
		System.out.println("after shifting reference");
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		
		
		

	}

}
