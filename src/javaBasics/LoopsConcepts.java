package javaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print 1 to 10
		
		//1. While loop:
		// Disadvantage : it will generate Infinite Loop if you don't give incremental / decremental part.
		
		int i=1;  // initialization
		while(i<=10){  // condition
			
			System.out.println(i);
			i++;   // incremental / decremental
		}
		
		System.out.println("****************************");
		
		
		//2. for loop:
		
		for(int j=1; j<=10; j++){  //initialization, condition, incremental / decremental
			System.out.println(j);
		}
		
		System.out.println("****************************");
		
		//Print 10 to -10
		
		for(int k = 10; k>=-10 ; k--){
			System.out.println(k);
		}
		
		// Incremental and Decremental Operators
		
		int a = 1;
		int b = a++;  // post increment
		System.out.println(a);
		System.out.println(b);
		
		int c = 1;
		int d = ++c;  // pre increment
		System.out.println(c);
		System.out.println(d);
		
		int e = 2;
		int f = e--;  // post decrement
		System.out.println(e);
		System.out.println(f);
		
		int g = 2;
		int h = --g;  // pre decrement
		System.out.println(g);
		System.out.println(h);
		

	}

}
