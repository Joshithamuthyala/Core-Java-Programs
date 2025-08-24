package Challenges.Inheritance;
class BankAccoun {
    int accountNo;
    double balance;

    BankAccoun(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccoun extends BankAccoun {
    double interestRate;

    SavingsAccoun(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccoun extends BankAccoun {
    double overdraftLimit;

    CurrentAccoun(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankAccountInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
