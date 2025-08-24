package Challenges.Encapsulation;
class Rect {
    private double length;
    private double width;
    private double area;

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
            calculateArea();
        } else {
            System.out.println("Invalid length");
        }
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
            calculateArea();
        } else {
            System.out.println("Invalid width");
        }
    }

    public double getArea() {
        return area;
    }
    private void calculateArea() {
        this.area = this.length * this.width;
    }
}

public class RectEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
