package Exercise5;

public class Book {

	private String name;
	private Author author;
	private int price;
	private int qty = 0;

	public Book(String name, Author author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, int price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book[name= " + name + "author= " + author + "price=" + price + "]";
	}
}
