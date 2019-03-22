package Stage07;

public class CheckingAccount extends BankAccount {
	
	private double monthlyFee;
	private int checks;

	public CheckingAccount(int accountNumber, double accountBalance, String customerName, String password, int bsbNumber, String address, int postcode,double monthlyFee,int checks) {
		super(accountNumber, accountBalance, customerName, password, bsbNumber, address, postcode);
		
		this.monthlyFee = monthlyFee;
		this.checks = checks;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public int getChecks() {
		return checks;
	}

}
