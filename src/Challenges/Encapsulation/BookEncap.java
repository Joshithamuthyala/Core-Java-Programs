package Challenges.Encapsulation;

import java.util.Scanner;

class Book {
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

public class BookEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.print("Enter book title: ");
        book.setTitle(sc.nextLine());

        System.out.print("Enter book author: ");
        book.setAuthor(sc.nextLine());

        System.out.print("Enter book price: ");
        book.setPrice(sc.nextDouble());

        System.out.println("\nBook Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
        sc.close();
	}

}
