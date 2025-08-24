package Challenges.Encapsulation;

class Cars {
    private String model;
    private String color;
    private double price;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }
}
public class PublicCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
