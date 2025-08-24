package Challenges.Encapsulation;
class LibrarBook {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
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

public class LibraryEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
