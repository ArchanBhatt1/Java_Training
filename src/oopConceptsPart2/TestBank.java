package oopConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hsbc = new HSBCBank();
		hsbc.credit();
		hsbc.debit();
		hsbc.transferMoney();
		hsbc.educationLoan();
		hsbc.carLoan();
		
		//USBank.minBalance=500;  it is not allowed as interface variables are final in nature. Their value can not be changed.
		
		
		//Dynamic Polymorphis - Child class object can be referred by parent Interface reference var.
		
		USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();

	}

}
