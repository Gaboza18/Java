package sec07_polymorphism.example1;

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

	int money = 1000000; // 구매자 초기비용
	int bonusPoint = 0;

	// 구매하는 기능
	void buy(Product p) { // tv, computer, audio 참조변수를 모두 받을 수 있음
		if (money < p.price) {
			System.out.println("잔액 부족");
			return; // void는 return 값이 없다, 더이상 진행하지 않고 바로 빠져나가는 기능 수행
		}
		money -= p.price; // 소유한 돈에서 제품의 금액을 지불
		bonusPoint += p.bonusPoint; // 구매자에게 제품의 보너스 포인트 제공
		System.out.println(p.toString() + " 구매완료");

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

		System.out.println("");
		System.out.println("현재남은 돈: " + buyer.money + "원 입니다.");
		System.out.println("현재 보너스 포인트: " + buyer.bonusPoint + "점 입니다.");
	}

}
