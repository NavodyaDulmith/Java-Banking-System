package Stage07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class BankAccountController {

    public static List<BankAccount> list = new ArrayList<>();
    public static List<CheckingAccountWithInterest> arr = new ArrayList<>();


    public static void createSavingsAccount() {

        int accountNumber = getRandomNumberInRange(1000, 9999);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name : ");
        String customerName = sc.next();
        System.out.println("Enter Password : ");
        String password = sc.next();
        double accountBalance = validateAccBalance(sc, "Enter Account Balance : ");
        System.out.println("Enter BSB Number : ");
        int bsbNumber = sc.nextInt();
        System.out.println("Enter Address : ");
        String address = sc.next();
        System.out.println("Enter Postcode : ");
        int postcode = sc.nextInt();
        SavingsAccount acc = new SavingsAccount(accountNumber, accountBalance, customerName, password,bsbNumber, address, postcode);
        list.add(acc);
        displayAccount(acc);

    }

    public static void createCheckingAccount() {

        int accountNumber = getRandomNumberInRange(1000, 9999);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name : ");
        String customerName = sc.next();
        System.out.println("Enter Password : ");
        String password = sc.next();
        double accountBalance = validateAccBalance(sc, "Enter Account Balance : ");
        System.out.println("Enter BSB Number : ");
        int bsbNumber = sc.nextInt();
        System.out.println("Enter Address : ");
        String address = sc.next();
        System.out.println("Enter Postcode : ");
        int postcode = sc.nextInt();
        System.out.println("Enter Monthly Fee : ");
        double monthlyFee = sc.nextDouble();
        System.out.println("Enter No of cheques : ");
        int checks = sc.nextInt();

        CheckingAccount acc = new CheckingAccount(accountNumber,accountBalance,customerName,password,bsbNumber,address,postcode,monthlyFee,checks);
        list.add(acc);
        displayAccount(acc);

    }

    public static void createCheckingAccountWithInterest() {

        int acccountNumber = getRandomNumberInRange(1000, 9999);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name : ");
        String customerName = sc.next();
        System.out.println("Enter Password : ");
        String password = sc.next();
        double accountBalance = validateAccBalance(sc, "Enter Account Balance : ");
        System.out.println("Enter BSB Number : ");
        int bsbNumber = sc.nextInt();
        System.out.println("Enter Address : ");
        String address = sc.next();
        System.out.println("Enter Postcode : ");
        int postcode = sc.nextInt();
        System.out.println("Enter Monthly Fee : ");
        double monthlyFee = sc.nextDouble();
        System.out.println("Enter No of cheques : ");
        int checks = sc.nextInt();

        CheckingAccountWithInterest acc = new CheckingAccountWithInterest(acccountNumber,accountBalance,customerName,password,bsbNumber,address,postcode,monthlyFee,checks);
        arr.add(acc);
        displayAccount(acc);

    }

    static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;

    }

    public static double validateAccBalance(Scanner input, String message) {
        double accBalance;
        do {
            System.out.println(message);
            accBalance = input.nextDouble();
            if (!(accBalance >= 0 && accBalance <= 100000)) {
                System.out.println("The Accouunt Balance you entered is invalid. Please re-enter Account Balance Between 0 - 100,000 $.");
            }
        } while (accBalance < 0 || accBalance > 100000);
        return accBalance;
    }

    public static void displayAccount(SavingsAccount account) {

        System.out.println("Account Number :" + account.getAccountNumber());
        System.out.println("Customer Name :" + account.getCustomerName());
        System.out.println("Account Balance :" + account.getAccountBalance());
        System.out.println("BSB Number :" + account.getHomeBranch().getBsbNumber());
        System.out.println("PostCode :" + account.getHomeBranch().getPostcode());
        System.out.println("Address :" + account.getHomeBranch().getAddress());
        System.out.println("Interest Rate :" + account.getInterestRate());
        System.out.println("Account Type : Savings Account.");


        System.out.println("\n");

    }

    public static void displayAccount(CheckingAccount obj) {

        System.out.println("Account Number :" + obj.getAccountNumber());
        System.out.println("Customer Name :" + obj.getCustomerName());
        System.out.println("Account Balance :" + obj.getAccountBalance());
        System.out.println("BSB Number :" + obj.getHomeBranch().getBsbNumber());
        System.out.println("PostCode :" + obj.getHomeBranch().getPostcode());
        System.out.println("Address :" + obj.getHomeBranch().getAddress());
        System.out.println("No of Cheques :" + obj.getChecks());
        System.out.println("Monthly Fee :" + obj.getMonthlyFee());
        System.out.println("Interest Rate : 0.0" );
        System.out.println("Account Type : Cheque Account.");
        System.out.println("\n");

    }

    public static void displayAccount(CheckingAccountWithInterest obj) {

        System.out.println("Account Number :" + obj.getAccountNumber());
        System.out.println("Customer Name :" + obj.getCustomerName());
        System.out.println("Account Balance :" + obj.getAccountBalance());
        System.out.println("BSB Number :" + obj.getHomeBranch().getBsbNumber());
        System.out.println("PostCode :" + obj.getHomeBranch().getPostcode());
        System.out.println("Address :" + obj.getHomeBranch().getAddress());
        System.out.println("No of Cheques :" + obj.getChecks());
        System.out.println("Monthly Fee :" + obj.getMonthlyFee());
        System.out.println("Interest Rate : " + obj.getSavingsAccount().getInterestRate());
        System.out.println("Account Type : Checking Account With Interest");
        System.out.println("\n");

    }

    public static void produceReport(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String cusName = sc.next();
        String x = "************ My Bank Account Details ************ \n";
        System.out.println("\t\t\t\t"+ x);
       for(int i=0;i< BankAccountController.list.size();i++){
            BankAccount bankAccount1 = BankAccountController.list.get(i);
            String name = bankAccount1.getCustomerName();
            if(name.equals(cusName)){
                    System.out.println("Account Number :" + bankAccount1.getAccountNumber() + "\n");
                    System.out.println("Customer Name :" + bankAccount1.getCustomerName() + "\n");
                    System.out.println("Account Balance :" + bankAccount1.getAccountBalance() + "\n");
                    System.out.println("BSB Number :" + bankAccount1.getHomeBranch().getBsbNumber() + "\n");
                    System.out.println("PostCode :" + bankAccount1.getHomeBranch().getPostcode() + "\n");
                    System.out.println("Address :" + bankAccount1.getHomeBranch().getAddress() + "\n");
                    System.out.println("Account Balance :" + bankAccount1.getAccountBalance() + "\n");
                    System.out.println("**************************************************************************************** \n");

            }

        }
        for(int i=0;i< BankAccountController.arr.size();i++){
            CheckingAccountWithInterest bankAccount2 = BankAccountController.arr.get(i);
            String name = bankAccount2.getCustomerName();

            if(name.equals(cusName)){
                System.out.println("Account Number :" + bankAccount2.getAccountNumber() + "\n");
                System.out.println("Customer Name :" + bankAccount2.getCustomerName() + "\n");
                System.out.println("Account Balance :" + bankAccount2.getAccountBalance() + "\n");
                System.out.println("BSB Number :" + bankAccount2.getHomeBranch().getBsbNumber() + "\n");
                System.out.println("PostCode :" + bankAccount2.getHomeBranch().getPostcode() + "\n");
                System.out.println("Address :" + bankAccount2.getHomeBranch().getAddress() + "\n");
                System.out.println("Account Balance :" + bankAccount2.getAccountBalance() + "\n");
                System.out.println("Account Type : Checking Account With Interest");
                System.out.println("**************************************************************************************** \n");

            }
        }
        System.out.println("\t \t \t \t \t \tEnd Of Report");

    }

    public static void displayAccount() {
        for (BankAccount acc : list) {
            System.out.println("Account Number :" + acc.getAccountNumber()+"\n");
            System.out.println("Customer Name :" + acc.getCustomerName()+"\n");
            System.out.println("Account Balance :" + acc.getAccountBalance()+"\n");
            System.out.println("BSB Number :" + acc.getHomeBranch().getBsbNumber()+"\n");
            System.out.println("PostCode :" + acc.getHomeBranch().getPostcode()+"\n");
            System.out.println("Address :" + acc.getHomeBranch().getAddress()+"\n");
            System.out.println("\n");
        }
    }

    public static void displayAccountCheckingAccountsArray() {
        for (CheckingAccountWithInterest acc : arr) {
            System.out.println("Account Number :" + acc.getAccountNumber());
            System.out.println("Customer Name :" + acc.getCustomerName());
            System.out.println("Account Balance :" + acc.getAccountBalance());
            System.out.println("BSB Number :" + acc.getHomeBranch().getBsbNumber());
            System.out.println("PostCode :" + acc.getHomeBranch().getPostcode());
            System.out.println("Address :" + acc.getHomeBranch().getAddress());
            System.out.println("Interest Rate : " + acc.getSavingsAccount().getInterestRate());
            System.out.println("Account Type : Checking Account With Interest");
            System.out.println("\n");
        }
    }
    public static void dataPersistency() {
        for(int i =0; i<list.size(); i++) {
            BankAccount acc1 = BankAccountController.list.get(i);
            /*to write to the file using character stream */
            File f = new File("Account Details.txt");
            FileWriter fw =  null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter(f, true);
                pw =  new PrintWriter(fw, true);
                int cont = -1;
                do{
                    Scanner sc = new Scanner(System.in);
                    pw.println("Account Number : " + acc1.getAccountNumber());
                    pw.println("Customer Name : " +acc1.getCustomerName());
                    pw.println("Account Balance : " +acc1.getAccountBalance());
                    pw.println("Password : " +acc1.getPassword());
                    System.out.println("Enter 0 to view File.");
                    cont = sc.nextInt();

                }while (cont != 0);

            } catch (IOException e) {

                e.printStackTrace();
            }
            finally{


                try {
                    fw.close();
                    pw.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
            /* read from file*/
            Scanner sc = null;

            try {
                sc = new Scanner(f);
                while(sc.hasNext()){
                    String value = sc.nextLine();
                    System.out.println(value);
                }
            } catch (FileNotFoundException e) {

                e.printStackTrace();

            }
        }

    }

}