package Day13;

import java.util.Scanner;

abstract class Book {
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price) {
	
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	abstract void display();
}

class myBook extends Book {

	public myBook(String title, String author, int price) {
		super(title, author, price);
	}

	@Override
	void display() {
		System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
	}
	
}

public class Solution {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String title = input.nextLine();
		String author = input.nextLine();
		int price = input.nextInt();
		
		Book book = new myBook(title, author, price);
		book.display();
		
		
	}

}
