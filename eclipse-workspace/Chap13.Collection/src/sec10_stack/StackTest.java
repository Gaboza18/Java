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

		coinBox.push(new Coin(500)); // Object.push( ); -> Stack에 객체를 저장한다
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(1));

		while (!coinBox.isEmpty()) { // 코인박스가 비어있지 않으면 반복문 실행
			Coin coin = coinBox.pop(); // Stack에 맨위에 저장된 객체를 꺼낸다(LIFO 구조)
			System.out.println("꺼낸 동전: " + coin.getPrice()); // 처음 입력한값이 가장 마지막 출력(LIFO 구조)
		}
	}

}
