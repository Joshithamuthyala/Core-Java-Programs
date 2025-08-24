package Challenges.Interface;
interface Drawable {
    void draw();
}

interface Resizable {
    void resize(int factor);
}

class Shape implements Drawable, Resizable {
    private String name;
    private int size;

    public Shape(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape: " + name + " of size " + size);
    }

    @Override
    public void resize(int factor) {
        size *= factor;
        System.out.println("Resized shape " + name + " to new size: " + size);
    }
}

public class Shapedrawresize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
