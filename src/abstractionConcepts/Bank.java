package abstractionConcepts;

public abstract class Bank { //Abstract means Hiding the implementation logic - implementations will be defined by child class instead of parent class.
	
	//Partial Abstraction(1 abstract method, 2 non-abstract methods)
	
	//1. Abstract class should have at least 1 method which is abstract in nature.(Only method prototype No body)
	//2. Abstract class can have non abstract methods as well.
	//3. Can not instantiate the object of Abstract class.
	//4. Performance wise abstract classes are faster than interfaces
	
	public abstract void loan(); //---abstract method -- no body
	
	//final, static, non-static all type of variables can be defined in abstract class.
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	//Non-abstract methods
	public void credit(){
		System.out.println("Bank---credit");
	}
	
	public void dedit(){
		System.out.println("Bank---dedit");
	}
	
	

}
