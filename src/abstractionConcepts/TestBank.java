package abstractionConcepts;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb = new HDFCBank();
		
		hb.credit();
		hb.dedit();
		hb.loan();
		hb.funds();  //non over ridden method
		
		//Dynamic Polymorphism
		Bank b = new HDFCBank();
		b.loan();
		b.credit();
		b.dedit();
		
		//Bank b1 = new Bank();  //We can not instantiate the object of Abstract class.

	}


}
