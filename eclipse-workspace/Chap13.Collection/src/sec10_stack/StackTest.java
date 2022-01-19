package sec10_stack;

import java.util.*;

class Coin {

	private int price;

	public Coin(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class StackTest {

	public static void main(String[] args) {

		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(500)); // Object.push( ); -> Stack�� ��ü�� �����Ѵ�
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(1));

		while (!coinBox.isEmpty()) { // ���ιڽ��� ������� ������ �ݺ��� ����
			Coin coin = coinBox.pop(); // Stack�� ������ ����� ��ü�� ������(LIFO ����)
			System.out.println("���� ����: " + coin.getPrice()); // ó�� �Է��Ѱ��� ���� ������ ���(LIFO ����)
		}
	}

}
