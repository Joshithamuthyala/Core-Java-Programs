package Challenges.Interface;
interface Drawablee {
    void draw();
}

interface Eraseable {
    void erase();
}

class Whiteboard implements Drawablee, Eraseable {
    @Override
    public void draw() {
        System.out.println("Drawing on the whiteboard with a marker.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the whiteboard with a duster.");
    }
}

class Chalkboard implements Drawablee, Eraseable {
    @Override
    public void draw() {
        System.out.println("Drawing on the chalkboard with chalk.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the chalkboard with a wiper.");
    }
}
public class DraEras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
