package javaInterviewQuestions;

public class SwapStringWithoutThirdString {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "world"; 
		
		System.out.println("before swapping");
		System.out.println("the value of a "+a);
		System.out.println("the value of b "+b);
		
		//1. append a and b:
		a = a+b; //helloworld
		
		//2. store initial String a in String b:
		b = a.substring(0, a.length()-b.length());
		
		//3. store initial String b in String a:
		a = a.substring(b.length());
		
		System.out.println("after swapping");
		System.out.println("the value of a "+a);
		System.out.println("the value of b "+b);
		

	}

}
