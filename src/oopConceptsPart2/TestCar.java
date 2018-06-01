package oopConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static polymorphism OR compile time polymorphism - because at the compile time java will decide which method needs to be called
		                                                   //and it will call child class' over ridden method and not parent class' method
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.safety();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		new BMW(); // no reference is still given to this object
		
		//Dynamic polymorphism:
		//Top Casting : child class object can be referred by parent class reference variable
		Car c1 = new BMW(); // child class object can be referred by parent class reference variable is called
		                    // Dynamic polymorphism or RunTime polymorphism
		                    //only overridden methods and parent class method can be called using this.
		
		c1.start(); // preference will be given to over ridden method
		c1.stop();
		c1.refuel();
		c1.engine();
		//c1.safety(); // can not do this because it is child class's method
		
		//Down Casting
		BMW b1 = (BMW) new Car(); // Down casting is not allowed in java. you can not refer parent class object using
		                          //child class reference element. It gives ClassCastException.	
		
		
	}

}
