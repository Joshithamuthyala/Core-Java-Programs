package Challenges.Abstraction;
abstract class BankAccounto {
    double balance;
    BankAccounto(double balance) {
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccounto extends BankAccounto {
    SavingsAccounto(double balance) {
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

class CurrentAccounto extends BankAccounto {
    CurrentAccounto(double balance) {
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
public class BankInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccounto s = new SavingsAccounto(1000);
        s.deposit(500);
        s.withdraw(300);

        BankAccounto c = new CurrentAccounto(2000);
        c.deposit(1000);
        c.withdraw(2500);
	}

}
