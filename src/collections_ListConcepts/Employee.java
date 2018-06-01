package collections_ListConcepts;

public class Employee {
	
	String name;
	int age;
	String department;
	
	public Employee(String name, int age, String department){ // these 3 input parameters are different from the above 3 global variables.
		this.name=name; // this.globalvar = localvar (it is used when global and local variable names are same.)
		this.age=age;
		this.department=department;
	}

}
