package sec04_getclass;

import java.lang.reflect.Constructor;

class Card {
	String kind;
	int num;

	Card() {
		this("SPADE", 1);
	}

	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}

}

public class GetClassEx {

	public static void main(String[] args) {

		Card c = new Card("HEART", 7);

		Class obj = c.getClass(); // 지정된 객체의 클래스 정보를 얻어온다.
		System.out.println(obj);

		System.out.println("클래스명= " + obj.getName());
		System.out.println("클래스명= " + obj.getSimpleName());
		System.out.println("클래스명= " + obj.getPackageName());

		// Class 클래스를 이용하여 클래스의 생성자, 필드, 메소드 정보를 얻어올수 있다.

		Class claz = null;
		try {
			claz = Class.forName("Card");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor[] cons = claz.getDeclaredConstructors();
		for (Constructor item : cons) {
			System.out.println(item.getName());
		}
	}

}
