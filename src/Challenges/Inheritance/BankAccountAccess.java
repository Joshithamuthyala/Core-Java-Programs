package Challenges.Inheritance;
class BankAccount {
    int accountNo;
    double balance;

    BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankAccountAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount(101, 5000, 4.5);
        System.out.println("Savings Account Details:");
        sa.display();

        System.out.println();

        CurrentAccount ca = new CurrentAccount(202, 10000, 2000);
        System.out.println("Current Account Details:");
        ca.display();
	}

}
