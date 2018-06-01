package abstractionConcepts;

public interface Car {
	
	//always define only and only Abstract methods
	//No method body
	//only method declaration
	//no need to write abstract keyword
	//100% Abstraction is achieved here
	//Can not instantiate the object of Interface
	
	//only final and static variables can be defined. (we don't need to write final or static it will automatically applied.
	
	int wheels = 4;
	
	public void start();
	public void stop();
	public void refuel();

}
