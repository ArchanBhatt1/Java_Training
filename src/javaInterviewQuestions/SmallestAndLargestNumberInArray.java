package javaInterviewQuestions;

public class SmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		
		int num[] = {-10, 24 , 50, -88, 65462};
		
		int largest = num[0];
		int smallest = num[0];
		
		//Time Complexity = O(n) ---only one for loop 
		
		for(int i=1; i<num.length; i++){
			
			if(num[i]>largest){
				largest=num[i];
			}
			else if(num[i]<smallest){
				smallest=num[i];
			}
		}
		
		System.out.println("largest number is "+largest);
		System.out.println("smallest number is "+smallest);

	}

}
