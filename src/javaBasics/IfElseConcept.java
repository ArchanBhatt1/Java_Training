package javaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comparison Operators:  <  >  <=  >=  ==  !=
		//= is Assignment Operator, whereas == is Comparison Operator
		
		int a = 100;
		int b = 200;
		
		if(b>a){
			System.out.println("b is greater than a");
		}
		else{
			System.out.println("a is greater than b");
		}
		
		int c = 500;
		int d = 500;
		
		if(c==d){
			System.out.println("c and d are equal");
		}
		else{
			System.out.println("c and d are not equal");
		}
		
		int x = 100; int y = 200; int z = 300;
		
		if(x>y & x>z){
			System.out.println("x is the greatest");
		}
		else if(y>z){
			System.out.println("y is the greatest");
		}
		else{
			System.out.println("z is the greatest");
		}

	}

}
