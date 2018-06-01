package javaInterviewQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		//int a[] = {1,2,3,5};
		
		//1+2+3+5 = 11
		//1+2+3+4+5 = 15
		//so missing number is 15-11 = 4
		
		int a[] = {1,2,4,5};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++){
			sum = sum+ a[i];
		}
		
		System.out.println(sum);
		
		int sum1 = 0;
		for(int j=1; j<=5 ; j++){
			sum1 = sum1 + j;
		}
		
		System.out.println(sum1);
		
		System.out.println("missing number is = " +(sum1 - sum));
		

	}

}
