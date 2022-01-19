package Exam2;

public class BookTest {

	public static void main(String[] args) {

		Book[] book = new Book[5]; // 5개의 Book 객체를 저장할 Book 타입의 배열을 생성한다.

		book[0] = new Book(); // 1번째 배열 생성, 배열 값 따로 저장한다

		book[0].setTitle("고구려1"); // [0] 제목
		book[0].setAuthor("김진명"); // [0] 저자
		book[0].setPrice(12800); // [0] 가격 

		for (int i = 1; i < book.length; i++) { // [1] ~ [4] 생성
			book[i] = new Book(book[0]); // [i] 배열 
			book[i].setTitle("고구려" + (i + 1));
		}

		for (Book books : book) { // for(대입받을 변수정의 : 배열명)
			System.out.println(books.toString());
		}

	}

}
