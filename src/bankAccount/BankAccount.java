package Stage07;

public class BankAccount  {
	
	private int accountNumber;
    private double accountBalance;
	private String customerName;
	private String password;
	private BankBranch homeBranch;
	
	public BankAccount(int accountNumber,double accountBalance, String customerName, String password,int bsbNumber ,String address,int postcode) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.password = password;
		this.homeBranch = new BankBranch(bsbNumber,address,postcode);
	}

	public BankBranch getHomeBranch() {
		return homeBranch;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getPassword() {
		return password;

	}

}
