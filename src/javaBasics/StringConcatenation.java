package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// + is a concatenation operator
		// print: is used to print on the console
		//println: is used to print on the console in New Line
		
		int a = 100;
		int b = 200;
		String c = "Hello";
		String d = "World";
		double e = 10.22;
		double f = 12.33;
		
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(a+b+c+d);
		System.out.println(c+d+a+b);
		System.out.println(c+d+(a+b));
		System.out.println(a+b+c+d+a+b);
		System.out.println(e+f);
		System.out.println(a+b+c+d+e+f);
		System.out.println("The value of a is:"+a);
		System.out.println("The value of a + b is"+" "+(a+b));
		System.out.print("hello selenium");
		System.out.println("webdriver");

	}

}
