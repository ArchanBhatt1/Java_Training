package javaInterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1.Using Algorithm:
		
		int num = 123456789;
		int rev = 0;
		
		while(num != 0){
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse integer is: "+rev);
		
		//2. Using StringBuffer method
		
		int num1 = 123456;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}
	

}
