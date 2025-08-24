package Challenges.Encapsulation;
class Circle {
    private double radius;
    private double area;
    private double circumference;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
            this.area = Math.PI * radius * radius;
            this.circumference = 2 * Math.PI * radius;
        } else {
            System.out.println("Invalid radius");
        }
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}
public class CircleEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
