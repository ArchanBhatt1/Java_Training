package oopConceptsPart2;

public class HSBCBank implements USBank, BrazilBank{//This is Multiple Inheritance.(((Is-a Relationship)))
	
	//If a particular Class is implementing an Interface it has to implement(Define or override) all the methods of interface.

	//USBank methods
	
	@Override
	public void credit() {
		System.out.println("HSBC---credit");
	}

	@Override
	public void debit() {
		System.out.println("HSBC---debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC---transferMoney");
	}
	
	
	//BrazilBank method
	@Override
	public int mutualFund(int a, int b) {
		a=20;
		b=20;
		int c = a*b;
		return c;
	}
	
	//Separate methods
	public void educationLoan(){
		System.out.println("HSBC---educationLoan");
	}
	
	public void carLoan(){
		System.out.println("HSBC---carLoan");
	}

	

}
