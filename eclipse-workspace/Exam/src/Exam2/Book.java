package Exam2;

public class Book {

	String title;
	String author;
	long price;

	public Book() {

	}

	public Book(Book other) { // Book 타입, other 변수 선언
		this.title = other.title; // this.선언된 변수 = 새로운 변수.선언된 변수 선언
		this.author = other.author; // this.선언된 변수 = 새로운 변수.선언된 변수 선언
		this.price = other.price; // this.선언된 변수 = 새로운 변수.선언된 변수 선언
	}

	public Book(String title, String author, long price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String toString() {
		return "Book[title= " + title + " author= " + author + " price= " + price + "]";
	}
}
