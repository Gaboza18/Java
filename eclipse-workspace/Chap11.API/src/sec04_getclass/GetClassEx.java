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

		Class obj = c.getClass(); // ������ ��ü�� Ŭ���� ������ ���´�.
		System.out.println(obj);

		System.out.println("Ŭ������= " + obj.getName());
		System.out.println("Ŭ������= " + obj.getSimpleName());
		System.out.println("Ŭ������= " + obj.getPackageName());

		// Class Ŭ������ �̿��Ͽ� Ŭ������ ������, �ʵ�, �޼ҵ� ������ ���ü� �ִ�.

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
