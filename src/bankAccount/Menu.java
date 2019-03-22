
package Stage07;

import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {

	    Scanner sc1 = new Scanner(System.in);
        System.out.println("\t \t - MENU -");
        System.out.println("Enter A to Create Savings Account. ");
        System.out.println("Enter B to Create Checking Account. ");
        System.out.println("Enter C to View Account.  ");
        System.out.println("Enter D to Transfer Money.  ");
        System.out.println("Enter F to Create Checking Account With Interest. ");
        System.out.println("Enter G to View Checking Accounts.  ");
        System.out.println("Enter H to View Report.  ");
        System.out.println("Enter I to Save Accounts.  ");
        System.out.println("Enter E or enter 0 as a account number to Exit ");

        System.out.println("Enter E or enter 0 as a account number to Exit ");

        char run1;

        do {
            run1 = sc1.next().charAt(0);
            switch (run1) {
                case 'A':
                case 'a':
                	BankAccountController.createSavingsAccount();
                	System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
                break;

                case 'B' :
                case 'b' :
                	BankAccountController.createCheckingAccount();
                	System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
                    break;

                case 'C':
                case 'c':

                    BankAccountController.displayAccount();
                    System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
                    break;

                case 'D' :
                case 'd' :
                    Transactions.transferMoney();
                    System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
                    break;

                case 'E' :
                case 'e' :
                    System.out.println("\n");
                    System.out.println("---------------------------------PROGRAM ENDED------------------------------------");
                    System.exit(0);
                    break;
                    
                case 'F' :
                case 'f' :
                    for(int i=0;i<5;i++) {
                        BankAccountController.createCheckingAccountWithInterest();
                        System.out.println("Enter E to exit From adding Accounts or Any to Continue. ");
                        Scanner sc = new Scanner(System.in);
                        String input = sc.next();
                        if(input.equals("e")) {
                            break;
                        }
                    }
                    System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
                    break;
                case 'R' :
                case 'r' :
                    System.out.println("\t \t - MENU -");
                    System.out.println("Enter A to Create Savings Account. ");
                    System.out.println("Enter B to Create Checking Account. ");
                    System.out.println("Enter C to View Account.  ");
                    System.out.println("Enter D to Transfer Money.  ");
                    System.out.println("Enter F to Create Checking Account With Interest. ");
                    System.out.println("Enter G to View Checking Accounts.  ");
                    System.out.println("Enter H to View Report.  ");
                    System.out.println("Enter I to Save Accounts.  ");
                    System.out.println("Enter E or enter 0 as a account number to Exit ");

                    break;
                case 'G':
                case 'g':
                    BankAccountController.displayAccountCheckingAccountsArray();
                    System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");
                    break;

                case 'H' :
                case 'h' :
                    BankAccountController.produceReport();
                    System.out.println("\n Enter a Letter from Menu or Enter R to Display Menu");

                    break;

                case'I':
                case'i':
                    BankAccountController.dataPersistency();
                    System.out.println("Enter Correct Letter or Press R To Display the menu.");
                    break;

                default:
                	System.out.println("Invalid Input.");
    				System.out.println("Enter Correct Letter or Press R To Display the menu.");

            }
        } while (run1 != 'E' || run1 != 'e');
        sc1.close();
	}

}