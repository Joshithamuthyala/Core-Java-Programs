package Challenges.Interface;
interface Drawabl {
    void draw();
}

interface Resizabl {
    void resize(int factor);
}

class Shapeu implements Drawabl, Resizabl {
    private String name;
    private int size;

    public Shapeu(String name, int size) {
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

public class ShapedrawResizrobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shapeu circle = new Shapeu("Circle", 5);
	        circle.draw();
	        circle.resize(2);
	        circle.draw();
	    }
	}


