package abstractionConcepts;

public class BMW implements Car{

	@Override //It is not compulsory to write override.
	public void start() {
		System.out.println("BMW----start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW----stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW----refuel");
		
	}
	
	//non-over ridden method
	public void safety(){
		System.out.println("BMW----safety");
	}

}
