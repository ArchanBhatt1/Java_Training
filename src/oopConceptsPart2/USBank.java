package oopConceptsPart2;

public interface USBank {
	
	int minBalance = 100;
	
	public void credit(); // In interface we don't write method body, we only create definition. Only prototype of method is declared.
	                      //Only Declaration of method is there.
	public void debit();
	
	public void transferMoney();
	
	//Properties:
	//1. Only method Declaration.
	//2. No method body. (only method Prototype)
	//3. We can declare variables, variables are by default static an final in nature.(We don't have to write static and final keyword)
	//4. Variables value will not change.
	//5. No static methods are allowed in interface.(As interface is part of object oriented programming language and object 
	//can not have static methods)
	//6. No main method in interface.
	//7. Interface is Abstract(can not instantiate object) in nature.
	//8. We can not create the object of interface.

}
