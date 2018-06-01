package javaInterviewQuestions;

public class SwapIntegerWithoutThirdVar {

	public static void main(String[] args) {
		
		int x = 5;  
		int y = 10;
		
		//x=10,y=5
		
		//1. By using 3rd variable:
		/*
		int t;
		t=x;
		x=y;
		y=t;
		*/
		
		//2. Without using 3rd variable:  using + operator
		/*
		x = x+y;  //15
		y = x-y;  //5
		x = x-y;  //10
		
		//3. Without using 3rd variable:  using * operator
		
		x = x*y;  //50
		y = x/y;  //5
		x = x/y;  //10
		*/
		//4. using XOR (^) operator: (Bitwise conversion)  bitwise values are:   5---0101 , 10---1010
		
		x = x^y;  //15-- -1111
		y = x^y;  //10----1010 
		x = x^y;   //5----0101
		
		
		
		
		
		System.out.println(x);
		System.out.println(y);

	}

}
