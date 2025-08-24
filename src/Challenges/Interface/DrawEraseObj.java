package Challenges.Interface;
interface Drawableee {
    void draw();
}

interface Eraseablee {
    void erase();
}

class Whiteboardu implements Drawableee, Eraseablee {
    @Override
    public void draw() {
        System.out.println("Drawing on the whiteboard with a marker.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the whiteboard with a duster.");
    }
}

class Chalkboardu implements Drawableee, Eraseablee {
    @Override
    public void draw() {
        System.out.println("Drawing on the chalkboard with chalk.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the chalkboard with a wiper.");
    }
}
public class DrawEraseObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whiteboard wb = new Whiteboard();
        Chalkboard cb = new Chalkboard();

        wb.draw();
        wb.erase();

        cb.draw();
        cb.erase();
	}

}
