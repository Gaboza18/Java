package Exam2;

public class BookTest {

	public static void main(String[] args) {

		Book[] book = new Book[5]; // 5���� Book ��ü�� ������ Book Ÿ���� �迭�� �����Ѵ�.

		book[0] = new Book(); // 1��° �迭 ����, �迭 �� ���� �����Ѵ�

		book[0].setTitle("����1"); // [0] ����
		book[0].setAuthor("������"); // [0] ����
		book[0].setPrice(12800); // [0] ���� 

		for (int i = 1; i < book.length; i++) { // [1] ~ [4] ����
			book[i] = new Book(book[0]); // [i] �迭 
			book[i].setTitle("����" + (i + 1));
		}

		for (Book books : book) { // for(���Թ��� �������� : �迭��)
			System.out.println(books.toString());
		}

	}

}
