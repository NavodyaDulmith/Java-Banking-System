package Stage07;

public class SavingsAccount extends BankAccount{
	
	private double interestRate;


	public SavingsAccount(int accountNumber, double accountBalance, String customerName, String password,int bsbNumber, String address, int postcode) {
		super(accountNumber, accountBalance, customerName, password, bsbNumber, address, postcode);
		
		this.interestRate=3.0;
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
