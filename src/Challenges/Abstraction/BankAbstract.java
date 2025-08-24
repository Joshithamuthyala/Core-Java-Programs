package Challenges.Abstraction;
abstract class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Savings: " + amount + ", Balance: " + balance);
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Savings");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Current: " + amount + ", Balance: " + balance);
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from Current: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Current");
        }
    }
}
public class BankAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
