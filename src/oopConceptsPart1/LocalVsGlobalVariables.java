package oopConceptsPart1;

public class LocalVsGlobalVariables {
	
	//Global or Class variables
	static String name = "Ronaldo";
	int age = 33;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10; //local variable for main method
		System.out.println(i);
		
		//System.out.println(name);  // you can not directly call global variable, you have to call them using object
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}
	
	public void sum(){
		
		//local variables for sum method
		int i = 20;
		int j = 30;
		int age = 25;
	}

}
