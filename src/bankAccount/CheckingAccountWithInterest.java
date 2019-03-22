package Stage07;

public class CheckingAccountWithInterest extends CheckingAccount {

    private SavingsAccount savingsAccount;

    public CheckingAccountWithInterest(int accountNumber, double accountBalance, String customerName, String password, int bsbNumber, String address, int postcode, double monthlyFee, int checks) {
        super(accountNumber, accountBalance, customerName, password,bsbNumber, address, postcode, monthlyFee, checks);

        this.savingsAccount = new SavingsAccount( accountNumber,accountBalance,customerName,password,bsbNumber,address,postcode);
        savingsAccount.setInterestRate(0.02);

    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

}
