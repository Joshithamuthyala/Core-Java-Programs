package Challenges.Abstraction;
abstract class Bankingo {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBanko extends Bankingo {
    void openAccount() {
        System.out.println("Savings account opened");
    }
    void closeAccount() {
        System.out.println("Savings account closed");
    }
}

class CurrentBanko extends Bankingo {
    void openAccount() {
        System.out.println("Current account opened");
    }
    void closeAccount() {
        System.out.println("Current account closed");
    }
}

public class BankOCAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
