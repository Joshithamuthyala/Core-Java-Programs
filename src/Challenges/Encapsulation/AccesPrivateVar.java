package Challenges.Encapsulation;

import java.util.Scanner;

class BankAccount1 {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}
public class AccesPrivateVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        BankAccount1 account = new BankAccount1();

        System.out.print("Enter account number: ");
        account.setAccountNumber(sc.nextLine());

        System.out.print("Enter initial balance: ");
        account.setBalance(sc.nextDouble());

        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        account.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        double w = sc.nextDouble();
        account.withdraw(w);

        System.out.println("\nAccount Details (Using Encapsulation):");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Final Balance: " + account.getBalance());
        sc.close();
	}

}
