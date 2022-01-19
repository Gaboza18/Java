package sec07_polymorphism.example1;

class Product {

	int price; // ��ǰ ����
	int bonusPoint; // ��ǰ ���Ž� �����ϴ� ���ʽ� ����Ʈ

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // ���ʽ� ����Ʈ: ��ǰ�� 10%
	}
}

class Tv extends Product {

	Tv() {
		super(1000); // ���� ������ ȣ�� product(){ }, int price = 1000(��ǰ����)
	}

	public String toString() {
		return "Tv";
	}

}

class Computer extends Product {
	Computer() {
		super(500); // ���� ������ ȣ�� product(){ }, int price = 500(��ǰ����)
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(2000); // ���� ������ ȣ�� product(){ }, int price = 2000(��ǰ����)
	}

	public String toString() {
		return "Audio";
	}
}

// ��ǰ ������ Ŭ���� 

class Buyer {

	int money = 1000000; // ������ �ʱ���
	int bonusPoint = 0;

	// �����ϴ� ���
	void buy(Product p) { // tv, computer, audio ���������� ��� ���� �� ����
		if (money < p.price) {
			System.out.println("�ܾ� ����");
			return; // void�� return ���� ����, ���̻� �������� �ʰ� �ٷ� ���������� ��� ����
		}
		money -= p.price; // ������ ������ ��ǰ�� �ݾ��� ����
		bonusPoint += p.bonusPoint; // �����ڿ��� ��ǰ�� ���ʽ� ����Ʈ ����
		System.out.println(p.toString() + " ���ſϷ�");

	}
}

public class PolyArgumentTest { // ���� ������ ��ü �ϳ��� �迭 �ٷ��

	public static void main(String[] args) {

		Buyer buyer = new Buyer();

		Tv tv = new Tv(); // tv ����
		buyer.buy(tv); // UpCasting tv - > Product P

		Product p = new Computer(); // ��ǻ�� ����
		buyer.buy(p);

		buyer.buy(new Audio()); // ����� ����

		System.out.println("");
		System.out.println("���糲�� ��: " + buyer.money + "�� �Դϴ�.");
		System.out.println("���� ���ʽ� ����Ʈ: " + buyer.bonusPoint + "�� �Դϴ�.");
	}

}
