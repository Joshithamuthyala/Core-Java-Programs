package Challenges.Interface;
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Printer implements Printable {
    private String model;

    public Printer(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println(model + " is printing a document.");
    }
}

class ScannerDevice implements Scannable {
    private String model;

    public ScannerDevice(String model) {
        this.model = model;
    }

    @Override
    public void scan() {
        System.out.println(model + " is scanning a document.");
    }
}
public class PrintScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
