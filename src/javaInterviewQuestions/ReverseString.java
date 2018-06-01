package javaInterviewQuestions;

public class ReverseString {
	
	public static void main(String[] args){
		
		//Reverse a String
		//Difference between String and StringBuffer
		//Do we have Reverse function for String?		
		
		
		String s ="Selenium";
		
		//System.out.println(s.reverse); //There is no Reverse function in String Class.Because String is Immutable(Unchangeable) object
		                                 //Its state can not be modified once created.
		
		//1. Using For loop:
		
		int len = s.length();
		String rev = "";
		
		for(int i=len-1; i>=0; i--){
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		
		//2. Using StringBuffer/StringBuffer Class:
		
		StringBuffer sf = new StringBuffer(s);
		//StringBuilder sf = new StringBuilder(s); 
		System.out.println(sf.reverse()); //StringBuffer is mutable Class. So in it we have reverse function.
		
		
		
	}

}
