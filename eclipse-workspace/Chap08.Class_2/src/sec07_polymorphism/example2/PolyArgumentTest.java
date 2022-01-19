package sec07_polymorphism.example2;

class Product {

	int price; // 제품 가격
	int bonusPoint; // 제품 구매시 제공하는 보너스 포인트

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스 포인트: 제품가 10%
	}
}

class Tv extends Product {

	Tv() {
		super(1000); // 조상 생성자 호출 product(){ }, int price = 1000(제품가격)
	}

	public String toString() {
		return "Tv";
	}

}

class Computer extends Product {
	Computer() {
		super(500); // 조상 생성자 호출 product(){ }, int price = 500(제품가격)
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(2000); // 조상 생성자 호출 product(){ }, int price = 2000(제품가격)
	}

	public String toString() {
		return "Audio";
	}
}

// 제품 구매자 클래스 

class Buyer {

	int money = 10000; // 구매자 초기비용
	int bonusPoint = 0;

	Product[] items = new Product[10]; // 구매한 제품의 항목을 저장하기 위한 배열
	int index = 0; // Product 배열에 사용할 인덱스 변수

	// 구매하는 기능
	void buy(Product p) { // tv, computer, audio 참조변수를 모두 받을 수 있음
		if (money < p.price) {
			System.out.println("잔액 부족");
			return; // void는 return 값이 없다, 더이상 진행하지 않고 바로 빠져나가는 기능 수행
		}
		money -= p.price; // 소유한 돈에서 제품의 금액을 지불
		bonusPoint += p.bonusPoint; // 구매자에게 제품의 보너스 포인트 제공
		items[index++] = p; // 구매한 제품을 Product[]에 저장하고 인덱스 증가시킴

		System.out.println(p.toString() + " 구매완료");

	}

	void summary() {

		int total = 0; // 총 구매금액 합계를 저장
		System.out.print("구매한 물품의 목록: ");
		/*
		 * for (int i = 0; i < items.length; i++) { // 배열 크기만큼 출력 if (items[i] == null)
		 * // 배열 항목에 객체가 저장되어 있지 않으면 반복문을 탈출 -> ex) 3개 구입 했는데 배열 크기 3이상 일때 break; total
		 * += items[i].price; System.out.print(items[i].toString() + ", "); }
		 */
		for (int i = 0; i < index; i++) { // if 문을 사용하지 않고 배열 출력
			total += items[i].price;
			System.out.print(items[i].toString() + ", ");
		}
		System.out.println("구매한 물품의 총 금액: " + total + "원 입니다.");
	}
}

public class PolyArgumentTest { // 여러 종류의 객체 하나의 배열 다루기

	public static void main(String[] args) {

		Buyer buyer = new Buyer();

		Tv tv = new Tv(); // tv 구매
		buyer.buy(tv); // UpCasting tv - > Product P

		Product p = new Computer(); // 컴퓨터 구매
		buyer.buy(p);

		buyer.buy(new Audio()); // 오디오 구매

		buyer.summary(); // 구입목록, 구입목록 총합계 출력

		System.out.println("");
		System.out.println("현재남은 돈: " + buyer.money + "원 입니다.");
		System.out.println("현재 보너스 포인트: " + buyer.bonusPoint + "점 입니다.");

	}

}