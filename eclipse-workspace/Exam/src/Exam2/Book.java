package Exam2;

public class Book {

	String title;
	String author;
	long price;

	public Book() {

	}

	public Book(Book other) { // Book Ÿ��, other ���� ����
		this.title = other.title; // this.����� ���� = ���ο� ����.����� ���� ����
		this.author = other.author; // this.����� ���� = ���ο� ����.����� ���� ����
		this.price = other.price; // this.����� ���� = ���ο� ����.����� ���� ����
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
