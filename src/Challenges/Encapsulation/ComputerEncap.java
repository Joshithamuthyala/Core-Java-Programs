package Challenges.Encapsulation;
class Comput {
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
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
public class ComputerEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
