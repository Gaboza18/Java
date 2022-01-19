package sec07_polymorphism.example2;

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

	int money = 10000; // ������ �ʱ���
	int bonusPoint = 0;

	Product[] items = new Product[10]; // ������ ��ǰ�� �׸��� �����ϱ� ���� �迭
	int index = 0; // Product �迭�� ����� �ε��� ����

	// �����ϴ� ���
	void buy(Product p) { // tv, computer, audio ���������� ��� ���� �� ����
		if (money < p.price) {
			System.out.println("�ܾ� ����");
			return; // void�� return ���� ����, ���̻� �������� �ʰ� �ٷ� ���������� ��� ����
		}
		money -= p.price; // ������ ������ ��ǰ�� �ݾ��� ����
		bonusPoint += p.bonusPoint; // �����ڿ��� ��ǰ�� ���ʽ� ����Ʈ ����
		items[index++] = p; // ������ ��ǰ�� Product[]�� �����ϰ� �ε��� ������Ŵ

		System.out.println(p.toString() + " ���ſϷ�");

	}

	void summary() {

		int total = 0; // �� ���űݾ� �հ踦 ����
		System.out.print("������ ��ǰ�� ���: ");
		/*
		 * for (int i = 0; i < items.length; i++) { // �迭 ũ�⸸ŭ ��� if (items[i] == null)
		 * // �迭 �׸� ��ü�� ����Ǿ� ���� ������ �ݺ����� Ż�� -> ex) 3�� ���� �ߴµ� �迭 ũ�� 3�̻� �϶� break; total
		 * += items[i].price; System.out.print(items[i].toString() + ", "); }
		 */
		for (int i = 0; i < index; i++) { // if ���� ������� �ʰ� �迭 ���
			total += items[i].price;
			System.out.print(items[i].toString() + ", ");
		}
		System.out.println("������ ��ǰ�� �� �ݾ�: " + total + "�� �Դϴ�.");
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

		buyer.summary(); // ���Ը��, ���Ը�� ���հ� ���

		System.out.println("");
		System.out.println("���糲�� ��: " + buyer.money + "�� �Դϴ�.");
		System.out.println("���� ���ʽ� ����Ʈ: " + buyer.bonusPoint + "�� �Դϴ�.");

	}

}