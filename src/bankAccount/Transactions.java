package Stage07;

import java.util.Scanner;

public class Transactions {
	
	public static void transferMoney() {

    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter First Account Number");
    	int accNo1 = input.nextInt();
		System.out.println("Enter Second Account Number");
		int accNo2 = input.nextInt();
		System.out.println("Enter Amount");
		double amount = input.nextDouble();

		for(int i=0;i< BankAccountController.list.size();i++) {
			BankAccount bankAccount1 = BankAccountController.list.get(i);
			int accNO1 = bankAccount1.getAccountNumber();
			if((amount > 0)) {
			if (accNo1 == accNO1) {
				double balance = bankAccount1.getAccountBalance() - amount;
				bankAccount1.setAccountBalance(balance);
				if (bankAccount1.getAccountBalance() < 10) {
					System.out.println("Account " + bankAccount1.getAccountNumber() + " Balance is Low.");
					System.out.println("Bank Account 1 Balance is : " + bankAccount1.getAccountBalance());
					System.out.println("Enter R to cancel Transaction or any to continue.");
					String in = input.next();
					if (in.equals("r")) {
						bankAccount1.setAccountBalance(bankAccount1.getAccountNumber() + amount);
						System.out.println("Bank Account 1 Balance is : " + bankAccount1.getAccountBalance());
					}
				}
				System.out.println("Bank Account 1 Balance is : " + bankAccount1.getAccountBalance());

			}
		}else{
				System.out.println("Invalid.");
				System.exit(0);
			}
		}
		for(int i=0;i< BankAccountController.list.size();i++){
			BankAccount bankAccount2 = BankAccountController.list.get(i);
			int accNO2 = bankAccount2.getAccountNumber();
			if(accNO2==accNo2){

				double balance = bankAccount2.getAccountBalance()+amount;
				bankAccount2.setAccountBalance(balance);
				if(bankAccount2.getAccountBalance()>100000) {
					System.out.println("Account " + bankAccount2.getAccountNumber()+ " Balance is High.");
					System.out.println("Enter R to cancel Transaction or Any to Continue");
					String in  = input.next();
					if(in.equals("r")) {
						bankAccount2.setAccountBalance(bankAccount2.getAccountNumber()-amount);
						System.out.println("Bank Account 2 Balance is : " + bankAccount2.getAccountBalance());
					}
				}
				System.out.println("Bank Account 2 Balance is : " + bankAccount2.getAccountBalance());
			}
		}


	}
	
}
