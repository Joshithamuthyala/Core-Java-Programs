package Challenges.Abstraction;
abstract class Banking {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBank extends Banking {
    void openAccount() {
        System.out.println("Savings account opened");
    }
    void closeAccount() {
        System.out.println("Savings account closed");
    }
}

class CurrentBank extends Banking {
    void openAccount() {
        System.out.println("Current account opened");
    }
    void closeAccount() {
        System.out.println("Current account closed");
    }
}

public class BankOCInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking s = new SavingsBank();
        s.openAccount();
        s.closeAccount();

        Banking c = new CurrentBank();
        c.openAccount();
        c.closeAccount();
	}

}
