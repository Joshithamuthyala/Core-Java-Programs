package Challenges.Interface;
interface Printabl {
    void print();
}

interface Scannabl {
    void scan();
}

class Printe implements Printabl{
    private String model;

    public Printe(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println(model + " is printing a document.");
    }
}

class ScannerDevic implements Scannabl {
    private String model;

    public ScannerDevic(String model) {
        this.model = model;
    }

    @Override
    public void scan() {
        System.out.println(model + " is scanning a document.");
    }
}
public class PrintScanAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printe hpPrinter = new Printe("HP LaserJet");
        ScannerDevic canonScanner = new ScannerDevic("Canon ScanMate");

        hpPrinter.print();
        canonScanner.scan();
	}

}
