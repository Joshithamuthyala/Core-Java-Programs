package Challenges.Interface;
interface Drawer {
    void draw();
}

interface Printa {
    void print();
}

class Canvas implements Drawer{
    @Override
    public void draw() {
        System.out.println("Drawing on the canvas with colors.");
    }
}

class Printers implements Printa{
    @Override
    public void print() {
        System.out.println("Printing the document using printer.");
    }
}

public class DrawPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canvas canvas = new Canvas();
        Printers printer = new Printers();

        canvas.draw();
        printer.print();
	}

}
